package com.iku.odeme.data.ZCA_F013.util;
public class Zher_Banka_LogType_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.io.Serializable, java.util.List {

    private  static final long serialVersionUID = 1660844800L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZHER_BANKA_LOG", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType.class, new com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType(), new java.lang.String[][]{}, 568, 1136, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZHER_BANKA_LOG\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Ödeme ekranı Banka Log</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>false</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>568</ifr:internalLength1><ifr:internalLength2>1136</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zher_Banka_LogType_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public void addZher_Banka_LogType(int index, com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType item) {
        baseList().add(index, item);
    }

    public com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType setZher_Banka_LogType(int index, com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType item) {
        return (com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType)baseList().set(index, item);
    }

    public void addZher_Banka_LogType(com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType item) {
        baseList().add(item);
    }

    public void addAllZher_Banka_LogType(int index, Zher_Banka_LogType_List item) {
        baseList().addAll(index, item);
    }

    public boolean containsAllZher_Banka_LogType(Zher_Banka_LogType_List item) {
        return baseList().containsAll(item);
    }

    public void addAllZher_Banka_LogType(Zher_Banka_LogType_List item) {
        baseList().addAll(item);
    }

    public com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType getZher_Banka_LogType(int index) {
        return (com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType)baseList().get(index);
    }

    public boolean removeZher_Banka_LogType(com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType item) {
        return baseList().remove(item);
    }

    public int indexOfZher_Banka_LogType(com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType item) {
        return baseList().indexOf(item);
    }

    public com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType[] toArrayZher_Banka_LogType() {
        return (com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType[])baseList().toArray(new com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType[] {});
    }

    public boolean containsZher_Banka_LogType(com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType item) {
        return baseList().contains(item);
    }

    public int lastIndexOfZher_Banka_LogType(com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType item) {
        return baseList().lastIndexOf(item);
    }

    public Zher_Banka_LogType_List subListZher_Banka_LogType(int fromIndex, int toIndex) {
        return (Zher_Banka_LogType_List)baseList().subList(fromIndex, toIndex);
    }

    public com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType removeZher_Banka_LogType(int index) {
        return (com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType)baseList().remove(index);
    }

}
