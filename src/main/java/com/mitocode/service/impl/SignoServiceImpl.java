package com.mitocode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Signo;
import com.mitocode.repo.IGenericRepo;
import com.mitocode.repo.ISignoRepo;
import com.mitocode.service.ISignoService;

@Service
public class SignoServiceImpl extends CRUDImpl<Signo, Integer> implements ISignoService {

	@Autowired
	private ISignoRepo repo;

	@Override
	protected IGenericRepo<Signo, Integer> getRepo() {
		return repo;
	}
}
