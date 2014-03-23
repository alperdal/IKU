package com.iku.odeme.data.odemeKayit.util;
public class Zca_Banka_OdemeType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.io.Serializable, java.util.List {

    private  static final long serialVersionUID = 276847553L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZCA_BANKA_ODEME", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType.class, new com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType(), new java.lang.String[][]{}, 54, 102, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZCA_BANKA_ODEME\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Banka Ödeme Bilgisi</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>54</ifr:internalLength1><ifr:internalLength2>102</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zca_Banka_OdemeType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public boolean containsAllZca_Banka_OdemeType(Zca_Banka_OdemeType_List item) {
        return baseList().containsAll(item);
    }

    public com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType getZca_Banka_OdemeType(int index) {
        return (com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType)baseList().get(index);
    }

    public com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType[] toArrayZca_Banka_OdemeType() {
        return (com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType[])baseList().toArray(new com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType[] {});
    }

    public boolean containsZca_Banka_OdemeType(com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType item) {
        return baseList().contains(item);
    }

    public boolean removeZca_Banka_OdemeType(com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType item) {
        return baseList().remove(item);
    }

    public com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType setZca_Banka_OdemeType(int index, com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType item) {
        return (com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType)baseList().set(index, item);
    }

    public Zca_Banka_OdemeType_List subListZca_Banka_OdemeType(int fromIndex, int toIndex) {
        return (Zca_Banka_OdemeType_List)baseList().subList(fromIndex, toIndex);
    }

    public void addZca_Banka_OdemeType(int index, com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType item) {
        baseList().add(index, item);
    }

    public void addAllZca_Banka_OdemeType(Zca_Banka_OdemeType_List item) {
        baseList().addAll(item);
    }

    public void addZca_Banka_OdemeType(com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType item) {
        baseList().add(item);
    }

    public com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType removeZca_Banka_OdemeType(int index) {
        return (com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType)baseList().remove(index);
    }

    public void addAllZca_Banka_OdemeType(int index, Zca_Banka_OdemeType_List item) {
        baseList().addAll(index, item);
    }

    public int indexOfZca_Banka_OdemeType(com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType item) {
        return baseList().indexOf(item);
    }

    public int lastIndexOfZca_Banka_OdemeType(com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType item) {
        return baseList().lastIndexOf(item);
    }

}
