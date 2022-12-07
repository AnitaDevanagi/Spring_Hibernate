package com.QACircle.Spring_hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

        @Entity
        @Table(name = "employees")
       public class Test {
		@Id
		@Column(name="Id")
		private int id;
		@Column(name="name")
		private String name;
		@Column(name="address")
		private String address;
		@Column(name="deptno")
		private int deptno;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		@Override
		public String toString() {
			return "Test [id=" + id + ", name=" + name + ", address=" + address + ", deptno=" + deptno + "]";
		}
		
		
		}
		
		
		




