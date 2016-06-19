/*
 * Copyright 2002-2013 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.springtestdbunit.sample.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.springtestdbunit.sample.entity.Person;

@Service
@Transactional
public class PersonService {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Person> find(String name) {
		Query query = this.entityManager.createNamedQuery("Person.find");
		query.setParameter("name", "%" + name + "%");
		return query.getResultList();
	}

	public void remove(int personId) {
		Person person = this.entityManager.find(Person.class, personId);
		this.entityManager.remove(person);
	}
}
