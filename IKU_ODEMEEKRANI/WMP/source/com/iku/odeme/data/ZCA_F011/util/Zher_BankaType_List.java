package com.iku.odeme.data.ZCA_F011.util;
public class Zher_BankaType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.io.Serializable, java.util.List {

    private  static final long serialVersionUID = 1482417051L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZHER_BANKA", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", com.iku.odeme.data.ZCA_F011.Zher_BankaType.class, new com.iku.odeme.data.ZCA_F011.Zher_BankaType(), new java.lang.String[][]{}, 199, 398, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZHER_BANKA\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Banka Tablosu</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>false</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>199</ifr:internalLength1><ifr:internalLength2>398</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zher_BankaType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public int indexOfZher_BankaType(com.iku.odeme.data.ZCA_F011.Zher_BankaType item) {
        return baseList().indexOf(item);
    }

    public void addAllZher_BankaType(Zher_BankaType_List item) {
        baseList().addAll(item);
    }

    public com.iku.odeme.data.ZCA_F011.Zher_BankaType removeZher_BankaType(int index) {
        return (com.iku.odeme.data.ZCA_F011.Zher_BankaType)baseList().remove(index);
    }

    public int lastIndexOfZher_BankaType(com.iku.odeme.data.ZCA_F011.Zher_BankaType item) {
        return baseList().lastIndexOf(item);
    }

    public com.iku.odeme.data.ZCA_F011.Zher_BankaType setZher_BankaType(int index, com.iku.odeme.data.ZCA_F011.Zher_BankaType item) {
        return (com.iku.odeme.data.ZCA_F011.Zher_BankaType)baseList().set(index, item);
    }

    public boolean containsAllZher_BankaType(Zher_BankaType_List item) {
        return baseList().containsAll(item);
    }

    public void addAllZher_BankaType(int index, Zher_BankaType_List item) {
        baseList().addAll(index, item);
    }

    public boolean removeZher_BankaType(com.iku.odeme.data.ZCA_F011.Zher_BankaType item) {
        return baseList().remove(item);
    }

    public Zher_BankaType_List subListZher_BankaType(int fromIndex, int toIndex) {
        return (Zher_BankaType_List)baseList().subList(fromIndex, toIndex);
    }

    public boolean containsZher_BankaType(com.iku.odeme.data.ZCA_F011.Zher_BankaType item) {
        return baseList().contains(item);
    }

    public com.iku.odeme.data.ZCA_F011.Zher_BankaType getZher_BankaType(int index) {
        return (com.iku.odeme.data.ZCA_F011.Zher_BankaType)baseList().get(index);
    }

    public void addZher_BankaType(int index, com.iku.odeme.data.ZCA_F011.Zher_BankaType item) {
        baseList().add(index, item);
    }

    public void addZher_BankaType(com.iku.odeme.data.ZCA_F011.Zher_BankaType item) {
        baseList().add(item);
    }

    public com.iku.odeme.data.ZCA_F011.Zher_BankaType[] toArrayZher_BankaType() {
        return (com.iku.odeme.data.ZCA_F011.Zher_BankaType[])baseList().toArray(new com.iku.odeme.data.ZCA_F011.Zher_BankaType[] {});
    }

}
