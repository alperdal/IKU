/**
 * Created by Alper on 11.03.2014.
 */

var app = angular.module('AngApp',[
'ngRoute',
'MainController',
'ui.bootstrap' ]);

app.factory('Gosterge', function(){
        return{ };
    }
);

app.factory('ToplamServis',function() {
    return {
      toplam : function(list,field)
      {
          var toplam = 0.0;
          $.each(list, function(index, result) {

              var sayisal = parseFloat(result[field].replace(',','')).toFixed(1);
//              sayisal = result[field].replace(",","");
              toplam += sayisal;

          });

          return toplam;

      }
    };


});


app.config(['$routeProvider',
    function($routeProvider, $scope ) {
        $routeProvider.
            when('/giris', {
                templateUrl: 'giris_a3.html',
                controller: 'cGiris'
            }).
            when('/taksit/hesapOzet', {
                templateUrl: 'taksit_odeme_hesap_ozeti.html',
                controller: 'cTaksitHesapOzet'
             /*   resolve:
                {
                    delay: function($q, $timeout) {
                        var delay = $q.defer();
                        $timeout(delay.resolve, 2000);
                        return delay.promise;
                    }
                }*/
            }).
            when('/taksit/ozet', {
                templateUrl: 'taksit_odeme_ozet.html',
                controller: 'cTaksitOzet'
            }).
            when('/odeme', {
                templateUrl: 'banka_odeme.html',
                controller: 'cOdeme'
            }).
            when('/sonuc', {
                templateUrl: 'odeme_sonuc.html',
                controller: 'cSonuc'
            }).
            otherwise({
                redirectTo: '/giris'
            });
    }]);