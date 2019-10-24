/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.xml;

import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;

/**
 * Strategy interface for loading an XML {@link Document}.
 *
 * @author Rob Harrop
 * @see DefaultDocumentLoader
 * @since 2.0
 * <p>
 * 获取 Document 的策略
 */
public interface DocumentLoader {

	/**
	 * Load a {@link Document document} from the supplied {@link InputSource source}.
	 *
	 * @param inputSource    the source of the document that is to be loaded  加载 Document 的 Resource 资源
	 * @param entityResolver the resolver that is to be used to resolve any entities  解析文件的解析器
	 * @param errorHandler   used to report any errors during document loading  处理加载 Document 对象的过程的错误
	 * @param validationMode the type of validation 验证模式
	 *                       {@link org.springframework.util.xml.XmlValidationModeDetector#VALIDATION_DTD DTD}
	 *                       or {@link org.springframework.util.xml.XmlValidationModeDetector#VALIDATION_XSD XSD})
	 * @param namespaceAware {@code true} if support for XML namespaces is to be provided  命名空间支持。如果要提供对 XML 名称空间的支持，则需要值为 true
	 * @return the loaded {@link Document document}
	 * @throws Exception if an error occurs
	 */
	Document loadDocument(
			InputSource inputSource, EntityResolver entityResolver,
			ErrorHandler errorHandler, int validationMode, boolean namespaceAware)
			throws Exception;

}
