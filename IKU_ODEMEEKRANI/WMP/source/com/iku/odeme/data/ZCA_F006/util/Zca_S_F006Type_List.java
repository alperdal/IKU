package com.iku.odeme.data.ZCA_F006.util;
public class Zca_S_F006Type_List extends com.sap.aii.proxy.framework.core.AbstractList implements java.io.Serializable, java.util.List {

    private  static final long serialVersionUID = -1328661923L ;

    private  static final com.sap.aii.proxy.framework.core.XsdlElementProperties staticElementProperties = createElementProperties("item", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:ZCA_S_F006", "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Item", com.iku.odeme.data.ZCA_F006.Zca_S_F006Type.class, new com.iku.odeme.data.ZCA_F006.Zca_S_F006Type(), new java.lang.String[][]{}, 126, 246, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZCA_S_F006\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">ZCA_PORTAL: F006 func. için struc.</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>true</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>126</ifr:internalLength1><ifr:internalLength2>246</ifr:internalLength2></ifr:definition></ifr:container></s0:type>") ;

    public  Zca_S_F006Type_List () {
        super(staticElementProperties, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F006.Zca_S_F006Type[] toArrayZca_S_F006Type() {
        return (com.iku.odeme.data.ZCA_F006.Zca_S_F006Type[])baseList().toArray(new com.iku.odeme.data.ZCA_F006.Zca_S_F006Type[] {});
    }

    public void addZca_S_F006Type(int index, com.iku.odeme.data.ZCA_F006.Zca_S_F006Type item) {
        baseList().add(index, item);
    }

    public boolean containsZca_S_F006Type(com.iku.odeme.data.ZCA_F006.Zca_S_F006Type item) {
        return baseList().contains(item);
    }

    public void addZca_S_F006Type(com.iku.odeme.data.ZCA_F006.Zca_S_F006Type item) {
        baseList().add(item);
    }

    public Zca_S_F006Type_List subListZca_S_F006Type(int fromIndex, int toIndex) {
        return (Zca_S_F006Type_List)baseList().subList(fromIndex, toIndex);
    }

    public com.iku.odeme.data.ZCA_F006.Zca_S_F006Type getZca_S_F006Type(int index) {
        return (com.iku.odeme.data.ZCA_F006.Zca_S_F006Type)baseList().get(index);
    }

    public void addAllZca_S_F006Type(Zca_S_F006Type_List item) {
        baseList().addAll(item);
    }

    public boolean removeZca_S_F006Type(com.iku.odeme.data.ZCA_F006.Zca_S_F006Type item) {
        return baseList().remove(item);
    }

    public com.iku.odeme.data.ZCA_F006.Zca_S_F006Type setZca_S_F006Type(int index, com.iku.odeme.data.ZCA_F006.Zca_S_F006Type item) {
        return (com.iku.odeme.data.ZCA_F006.Zca_S_F006Type)baseList().set(index, item);
    }

    public void addAllZca_S_F006Type(int index, Zca_S_F006Type_List item) {
        baseList().addAll(index, item);
    }

    public int lastIndexOfZca_S_F006Type(com.iku.odeme.data.ZCA_F006.Zca_S_F006Type item) {
        return baseList().lastIndexOf(item);
    }

    public int indexOfZca_S_F006Type(com.iku.odeme.data.ZCA_F006.Zca_S_F006Type item) {
        return baseList().indexOf(item);
    }

    public boolean containsAllZca_S_F006Type(Zca_S_F006Type_List item) {
        return baseList().containsAll(item);
    }

    public com.iku.odeme.data.ZCA_F006.Zca_S_F006Type removeZca_S_F006Type(int index) {
        return (com.iku.odeme.data.ZCA_F006.Zca_S_F006Type)baseList().remove(index);
    }

}
