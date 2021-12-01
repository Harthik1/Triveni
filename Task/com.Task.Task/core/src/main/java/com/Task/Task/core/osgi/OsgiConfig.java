package com.Task.Task.core.osgi;
	import org.osgi.service.metatype.annotations.AttributeDefinition;
	import org.osgi.service.metatype.annotations.AttributeType;
	import org.osgi.service.metatype.annotations.ObjectClassDefinition;
	import org.osgi.service.metatype.annotations.Option;

	    @ObjectClassDefinition(name="Product detail -product OSGi Configuration",description = "product OSGi Configuration demo")
	    public @interface OsgiConfig {

	        @AttributeDefinition(name = "productTitle",description = "Enter Product Title")
	     public String productTitle();

	        @AttributeDefinition(name = "productDescription",description = "Enter product description")
	        public String productDescription() ;
	        
	        @AttributeDefinition(name = "productImageurl",description = " Product image url")
	        public String productImageurl() ;

	        @AttributeDefinition(name = "cta",description = " Enter cta")
	        public String cta() ;
	        
	        @AttributeDefinition(name = "benefitsTitle",description = " Enter benifits title")
	        public String benifitsTitle() ;

	        
	        @AttributeDefinition(name = "benefitsImageurl",description = " benifits image url")
	        public String benifitsImageurl() ;

	        @AttributeDefinition(name = "benefits_heading",description = "Enter benifits_heading")
	        public String benifits_heading() ;
	        
	        @AttributeDefinition(name = "isExpired ",description = " is expired")
	        public boolean isExpired() ;
	        
	        @AttributeDefinition(name = "price",description = " Enter price")
	        public double price() ;
	    }

