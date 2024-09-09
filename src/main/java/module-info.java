/*
 Copyright (c) 2022 Gabriel Dimitriu All rights reserved.
 DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.

 This file is part of wsTestServer project.

 wsTestServer is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 wsTestServer is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with wsTestServer.  If not, see <http://www.gnu.org/licenses/>.
 */
module wsTestServer {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.beans;
    requires org.slf4j;
    requires java.validation;
    requires jakarta.activation;
    requires spring.security.config;
    requires spring.security.crypto;
    requires spring.security.core;
    requires spring.web;
    requires spring.security.web;
    requires spring.webmvc;
    requires spring.jcl;
    requires org.apache.tomcat.embed.core;
    requires java.annotation;
    opens io.github.gdimitriu.wstestserver.application to spring.core,spring.beans, spring.context, org.springframework.cglib.core;
    opens io.github.gdimitriu.wstestserver.application.server to spring.core,spring.beans, spring.context, org.springframework.cglib.core;
    opens io.github.gdimitriu.wstestserver.properties to spring.core,spring.beans, spring.context, spring.boot;

}
