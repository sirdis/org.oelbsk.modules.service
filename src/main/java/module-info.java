module org.oelbsk.modules.service {
	
	requires spring.context;
	
	exports org.oelbsk.modules.service;

	provides org.oelbsk.modules.service.IService
		with org.oelbsk.modules.service.internal.ServiceImpl;

	opens org.oelbsk.modules.service.internal;
}