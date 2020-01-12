package org.oelbsk.modules.service.internal;

import org.oelbsk.modules.service.IService;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {

	@Override
	public String hello() {
		return "Hello JPMS";
	}

}
