/**
 * Created by Alper on 11.03.2014.
 */

var mController = angular.module('MainController', ['ui.bootstrap']);

mController.controller("cAnasayfa" , function($scope, Gosterge, $route, $routeParams, $location, $http){
    $scope.gosterge = Gosterge;
    $scope.$routeParams = $routeParams;
    $scope.params = $routeParams;
    $scope.gosterge.banka = [];

});

mController.controller("cGiris",function($scope, $location, Gosterge,$http){
    $scope.gosterge = Gosterge;
    $scope.gosterge.adim = "1";
    $scope.islemTipi = "";


    $scope.ilerle = function( path ) {

        $http({method: 'POST',
            url: 'OgrenciInit',
            cache: false }).
            success(function(data, status, headers, config) {

                if(data.sonuc=='S')
                {
                    if($scope.islemTipi == "taksit"){

                        $scope.gosterge.islemTur = "T";

                        switch($scope.islemTipi){
                            case 'kayit':
                                path = '/baslangic';
                            case 'taksit':
                                path = '/taksit/hesapOzet';
                        }

                        $location.path( path );
                    }
                }


            }).
            error(function(data, status, headers, config) {

            });



    }

});

mController.controller("cTaksitHesapOzet", function($scope, Gosterge, $location, $modal, $http,ToplamServis){
    $scope.gosterge = Gosterge;
    $scope.gosterge.adim = "2";
	$scope.popup = { };
    $scope.taksitler = [];
    $scope.taksitToplamTutar = 0;

    $http({
        method:'POST',
        url: 'TaksitHesapOzet',
        cache: false})
        .success(function(data){
            $scope.taksitler = data.taksitList;
            $scope.taksitToplamTutar = ToplamServis.toplam($scope.taksitler,'BETRW');

        })
        .error(function(data, status, headers, config) {
        });

    $scope.gosterge.taksitler = [];

$scope.ilerle = function( path ) {

        var size = $scope.taksitler.length;

        for(var i=0;i<size;i++)
        {
            var mdl = $scope.taksitler[i];
            if(mdl.check)
            {
                $scope.gosterge.taksitler.push(mdl);
            }
        }

        if($scope.gosterge.taksitler.length > 0)
        {
            path = "/taksit/ozet";
            $location.path( path );
        }
        else
        {
            $scope.popup.title = 'Zorunlu Alan';
            $scope.popup.msgbody = 'Lütfen en az bir kalem seçiniz.';

            var modalInstance = $modal.open({
                templateUrl: 'notif.html',
                controller: ModalUyariInstanceCtrl,
                windowClass:'modal-huge',
                resolve: {
                    popup: function () {
                        return $scope.popup;
                    }
                }
            });
        }
}
});

mController.controller("cTaksitOzet", function($scope, Gosterge, $location, $modal, $http,ToplamServis){
	
    $scope.gosterge = Gosterge;
    $scope.gosterge.adim = '3';
    $scope.popup = { };
    $scope.sozlesme = "";
    $scope.gosterge.bankaSecilen = '';
    $scope.taksitToplamTutar = ToplamServis.toplam($scope.gosterge.taksitler,'BETRW');

    $http({method: 'POST',
        url: 'BankalarGet',
//        data:angular.toJson(gonderForm),
        cache: false }).
        success(function(data, status, headers, config){
            $scope.gosterge.banka = data.banka;
        })
        .error(function(data, status, headers, config) {
        });


    $scope.openSozlesmePopup = function ()
    {

        var modalInstance = $modal.open({
            templateUrl: 'notif.html',
            controller: ModalUyariInstanceCtrl,
            windowClass:'modal-huge',
            resolve: {
                popup: function () {
                    return $scope.popup;
                }
            }
        });


    };

    $scope.ilerle = function( path ) {

        if($scope.gosterge.bankaSecilen!='' ){

            var belgeNo = $scope.gosterge.taksitler[0].OPBEL+"_"+ $scope.gosterge.taksitler[0].OPUPK;

            $http({
                method:'POST',
                url: 'BankaSecim',
                data: angular.toJson( {banka : $scope.gosterge.bankaSecilen , tutar: $scope.taksitToplamTutar,belgeNo: belgeNo }),
                cache: false})
                .success(function(){

                    $scope.odemeBanka();

                })
                .error(function(){});

        }
        else{
            $scope.popup.title = 'Zorunlu Alan';
            $scope.popup.msgbody = '';
            $scope.popup.msgbody2 = '';

            if(!$scope.sozlesme)
            {
                $scope.popup.msgbody = 'Sözleşmeyi kabul etmeden ilerleyemezsiniz!';
            }

            if($scope.gosterge.bankaSecilen=='')
            {
                $scope.popup.msgbody2 = 'Lütfen Banka Seçiniz!';
            }

            var modalInstance = $modal.open({
                templateUrl: 'notif.html',
                controller: ModalUyariInstanceCtrl,
                resolve: {
                    popup: function () {
                        return $scope.popup;
                    }
                }
            });

        }

    };

    $scope.odemeBanka = function()
    {


        var modalInstance = $modal.open({
            templateUrl: 'sanalpos.html',
            controller: ModalSanalPos,
            backdrop : 'static',
            resolve: {
                popup: function () {
                    return $scope.popup;
                }
            }
        });


    };

});

mController.controller("cSonuc", function($scope, Gosterge, $location, $modal, $http,ToplamServis){
    $scope.gosterge.adim = "5";
    $scope.gosterge = Gosterge;
    $scope.odemeSonuc = "";

    if($scope.gosterge.sonucIsaret)
    {
        $scope.odemeSonuc = "Ödeme İşlemi Başarılı"
    }
    else
    {
        $scope.odemeSonuc = "Ödeme İşlemi Başarısız"
    }

});
var ModalUyariInstanceCtrl = function ($scope, $modalInstance, popup) {

    $scope.popup = popup;

    $scope.sepeteGit = function() {
        $modalInstance.close(true);
    };

    $scope.onay = function () {
        $modalInstance.close(true);
    };

    $scope.red = function () {
        $modalInstance.close(false);
    };

    $scope.close = function () {
        $modalInstance.close();
    };

};

var ModalSanalPos = function ($scope, Gosterge, $modalInstance, popup, $http, $timeout, $location) {

    $scope.gosterge = Gosterge;
    $scope.odemeSonuc = false;

    $scope.onTimeOut = function(){

        $http({
            method:'POST',
            url: 'BankaOdemeKontrol',
            cache: false})
            .success(function(data){
                if(data.sonuc == 'S')
                {
                    $timeout.cancel(odemeListener);
                    $scope.gosterge.odemeBankaSonuc = data.odeme;
                    $scope.gosterge.sonucIsaret = true;
                    $scope.odemeSonuc = true;
                    $scope.odemeKaydet();
                }
                else if(data.sonuc == 'E')
                {
                    $timeout.cancel(odemeListener);
                    $scope.odemeSonuc = true;
                    $scope.gosterge.odemeBankaSonuc = data.odeme;
                    $scope.gosterge.sonucIsaret = false;
                    $scope.gosterge.sonucReturn = data.odeme.ERRMSG;
                }
                else
                {

                    mytimeout = $timeout($scope.onTimeOut,1000);
                }
            })
            .error(function(data, status, headers, config) {
                $scope.odemeSonuc = true;
            });


    };

    var odemeListener = $timeout($scope.onTimeOut,1000);

    $scope.kapat = function () {
        $modalInstance.close();
        $location.path('/sonuc');
    };

    $scope.iptal = function(){
        $modalInstance.close();
    }


    $scope.odemeKaydet = function(){

        $http({
            method:'POST',
            url: 'OdemeKaydet',
            data: angular.toJson($scope.gosterge),
            cache: false})
            .success(function(data){
                  if(data.sonuc=='S' && data.RETURN.TYPE=='S')
                  {

                  }

            })
            .error(function(data, status, headers, config) {

            });
    };

};