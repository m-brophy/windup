package org.jboss.windup.graph.model.meta.xml;

import org.jboss.windup.graph.renderer.Label;

import com.tinkerpop.frames.Property;
import com.tinkerpop.frames.modules.typedgraph.TypeValue;

@TypeValue("SpringConfigurationFacet")
public interface SpringConfigurationFacet extends XmlMetaFacet {

	@Label
	@Property("specificationVersion")
	public String getSpecificationVersion();

	@Property("specificationVersion")
	public void setSpecificationVersion(String version);
	
}
