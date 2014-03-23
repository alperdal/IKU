package com.iku.odeme.data.ZCA_F004;
public class Zca_F004_Fault extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712434575L) ;

    private  Zca_F004_Fault.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZCA_F004.Exception", 4, 0, com.iku.odeme.data.ZCA_F004.Zca_F004_Fault.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_XML, "ZCA_F004", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">İndirim türlerinin gösterilmesi</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:package>ZFI</ifr:package><ifr:akhNode /><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "Name", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Name", com.iku.odeme.data.ZCA_F004.Zca_F004_Fault.NameType.class, null, new java.lang.String[][]{{"enumeration", "E_PERSL"}, {"enumeration", "E_PSOBTYP"}, {"enumeration", "E_UNAME"}}, null, 0, 0, 0, -1, -1, -1, -1, 0, null);
        descriptorSetElementProperties(descriptor, 1, "Text", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Text", java.lang.String.class, null, new java.lang.String[][]{}, null, 0, 0, 0, -1, -1, -1, -1, 0, null);
        descriptorSetElementProperties(descriptor, 2, "Message", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Message", MessageType.class, new MessageType(), new java.lang.String[][]{}, null, 0, 0, 0, -1, -1, -1, -1, 0, null);
        descriptorSetElementProperties(descriptor, 3, "Attributes", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Attributes", AttributesType.class, new AttributesType(), new java.lang.String[][]{}, null, 0, 0, 0, -1, -1, -1, -1, 0, null);
        staticDescriptor = descriptor;
    }
    public  Zca_F004_Fault () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_XML);
        
    }

    protected  Zca_F004_Fault (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public void setName(com.iku.odeme.data.ZCA_F004.Zca_F004_Fault.NameType Name) {
        baseTypeData().setElementValue(0, Name);
    }

    public void setText(java.lang.String Text) {
        baseTypeData().setElementValue(1, Text);
    }

    public java.lang.String getText() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    public AttributesType getAttributes() {
        return (AttributesType)baseTypeData().getElementValue(3);
    }

    public void setMessage(MessageType Message) {
        baseTypeData().setElementValue(2, Message);
    }

    public MessageType getMessage() {
        return (MessageType)baseTypeData().getElementValue(2);
    }

    public MetaData metadataZca_F004_Fault() {
        return metadata;
    }

    public void setAttributes(AttributesType Attributes) {
        baseTypeData().setElementValue(3, Attributes);
    }

    public com.iku.odeme.data.ZCA_F004.Zca_F004_Fault.NameType getName() {
        return (com.iku.odeme.data.ZCA_F004.Zca_F004_Fault.NameType)baseTypeData().getElementValue(0);
    }

    public static class MessageType extends com.sap.aii.proxy.framework.core.AbstractType{
    
        private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;
    
        private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712434575L) ;
    
        private  MessageType.MetaData metadata = new MetaData(this) ;
    
        static {
            com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "", 2, 0, MessageType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_XML, null, -1, -1, -1, null);
            descriptorSetElementProperties(descriptor, 0, "ID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Id", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, null, 0, 0, 0, -1, -1, -1, -1, 0, null);
            descriptorSetElementProperties(descriptor, 1, "Number", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Number", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "3"}}, null, 0, 0, 0, -1, -1, -1, -1, 0, null);
            staticDescriptor = descriptor;
        }
        public  MessageType () {
            super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_XML);
            
        }
    
        protected  MessageType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
            super(descriptor, staticGenerationInfo, connectionType);
        }
    
        public void setId(java.lang.String Id) {
            baseTypeData().setElementValue(0, Id);
        }
    
        public java.lang.String getId() {
            return (java.lang.String)baseTypeData().getElementValueAsString(0);
        }
    
        public java.lang.String getNumber() {
            return (java.lang.String)baseTypeData().getElementValueAsString(1);
        }
    
        public MetaData metadataMessageType() {
            return metadata;
        }
    
        public void setNumber(java.lang.String Number) {
            baseTypeData().setElementValue(1, Number);
        }
    
        public static class MetaData implements java.io.Serializable {
        
            private  MessageType parent ;
        
            private  static final long serialVersionUID = -386313361L ;
        
            protected  MetaData (MessageType parent) {
                this.parent = parent;
                
            }
        
            public com.sap.aii.proxy.framework.core.ElementMetaData getId() {
                return parent.baseTypeMetaData().getElement(0);
            }
        
            public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
                return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
            }
        
            public com.sap.aii.proxy.framework.core.ElementMetaData getNumber() {
                return parent.baseTypeMetaData().getElement(1);
            }
        
        }
    
    }

    public static class AttributesType extends com.sap.aii.proxy.framework.core.AbstractType{
    
        private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;
    
        private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712434575L) ;
    
        private  AttributesType.MetaData metadata = new MetaData(this) ;
    
        static {
            com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "", 4, 0, AttributesType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_XML, null, -1, -1, -1, null);
            descriptorSetElementProperties(descriptor, 0, "V1", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "V1", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, null, 0, 0, 0, -1, -1, -1, -1, 0, null);
            descriptorSetElementProperties(descriptor, 1, "V2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "V2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, null, 0, 0, 0, -1, -1, -1, -1, 0, null);
            descriptorSetElementProperties(descriptor, 2, "V3", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "V3", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, null, 0, 0, 0, -1, -1, -1, -1, 0, null);
            descriptorSetElementProperties(descriptor, 3, "V4", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "V4", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, null, 0, 0, 0, -1, -1, -1, -1, 0, null);
            staticDescriptor = descriptor;
        }
        public  AttributesType () {
            super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_XML);
            
        }
    
        protected  AttributesType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
            super(descriptor, staticGenerationInfo, connectionType);
        }
    
        public MetaData metadataAttributesType() {
            return metadata;
        }
    
        public java.lang.String getV3() {
            return (java.lang.String)baseTypeData().getElementValueAsString(2);
        }
    
        public java.lang.String getV4() {
            return (java.lang.String)baseTypeData().getElementValueAsString(3);
        }
    
        public void setV1(java.lang.String V1) {
            baseTypeData().setElementValue(0, V1);
        }
    
        public java.lang.String getV2() {
            return (java.lang.String)baseTypeData().getElementValueAsString(1);
        }
    
        public void setV2(java.lang.String V2) {
            baseTypeData().setElementValue(1, V2);
        }
    
        public void setV3(java.lang.String V3) {
            baseTypeData().setElementValue(2, V3);
        }
    
        public java.lang.String getV1() {
            return (java.lang.String)baseTypeData().getElementValueAsString(0);
        }
    
        public void setV4(java.lang.String V4) {
            baseTypeData().setElementValue(3, V4);
        }
    
        public static class MetaData implements java.io.Serializable {
        
            private  AttributesType parent ;
        
            private  static final long serialVersionUID = -386313361L ;
        
            protected  MetaData (AttributesType parent) {
                this.parent = parent;
                
            }
        
            public com.sap.aii.proxy.framework.core.ElementMetaData getV3() {
                return parent.baseTypeMetaData().getElement(2);
            }
        
            public com.sap.aii.proxy.framework.core.ElementMetaData getV4() {
                return parent.baseTypeMetaData().getElement(3);
            }
        
            public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
                return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
            }
        
            public com.sap.aii.proxy.framework.core.ElementMetaData getV2() {
                return parent.baseTypeMetaData().getElement(1);
            }
        
            public com.sap.aii.proxy.framework.core.ElementMetaData getV1() {
                return parent.baseTypeMetaData().getElement(0);
            }
        
        }
    
    }

    public static class NameType extends com.sap.aii.proxy.framework.core.EnumerationType implements java.io.Serializable {
    
        private  static final long serialVersionUID = 1905239173L ;
    
        private  final java.lang.String name ;
    
        public  static final java.lang.String _E_PSOBTYP = "E_PSOBTYP" ;
    
        /** instance for value E_PSOBTYP */
        public  static final NameType E_PSOBTYP = new NameType(_E_PSOBTYP) ;
    
        public  static final java.lang.String _E_UNAME = "E_UNAME" ;
    
        /** instance for value E_UNAME */
        public  static final NameType E_UNAME = new NameType(_E_UNAME) ;
    
        public  static final java.lang.String _E_PERSL = "E_PERSL" ;
    
        /** instance for value E_PERSL */
        public  static final NameType E_PERSL = new NameType(_E_PERSL) ;
    
        private  NameType (java.lang.String name) {
            this.name = name;
        }
    
        public static NameType fromString(java.lang.String name) {
            if (name.equals("E_PSOBTYP")){return E_PSOBTYP;};
            if (name.equals("E_UNAME")){return E_UNAME;};
            if (name.equals("E_PERSL")){return E_PERSL;};
             throw createIllegalArgumentException(name);
        }
    
        public static NameType fromValue(java.lang.String name) {
            if (name.equals(_E_PSOBTYP)){return E_PSOBTYP;};
            if (name.equals(_E_UNAME)){return E_UNAME;};
            if (name.equals(_E_PERSL)){return E_PERSL;};
             throw createIllegalArgumentException(name);
        }
    
        public java.lang.String toString() {
            return java.lang.String.valueOf(name);
        }
    
        public java.lang.String getValue() {
            return name;
        }
    
    }

    public static class MetaData implements java.io.Serializable {
    
        private  Zca_F004_Fault parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zca_F004_Fault parent) {
            this.parent = parent;
            
        }
    
        public com.sap.aii.proxy.framework.core.ElementMetaData getText() {
            return parent.baseTypeMetaData().getElement(1);
        }
    
        public com.sap.aii.proxy.framework.core.ElementMetaData getAttributes() {
            return parent.baseTypeMetaData().getElement(3);
        }
    
        public com.sap.aii.proxy.framework.core.ElementMetaData getMessage() {
            return parent.baseTypeMetaData().getElement(2);
        }
    
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        public com.sap.aii.proxy.framework.core.ElementMetaData getName() {
            return parent.baseTypeMetaData().getElement(0);
        }
    
    }

}
