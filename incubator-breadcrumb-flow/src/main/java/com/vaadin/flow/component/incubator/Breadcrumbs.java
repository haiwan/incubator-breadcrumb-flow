package com.vaadin.flow.component.incubator;

/*
 * #%L
 * Vaadin Breadcrumb for Vaadin 10
 * %%
 * Copyright (C) 2017 - 2018 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file license.html distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <http://vaadin.com/license/cval-3>.
 * #L%
 */

import com.vaadin.flow.component.HasOrderedComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Server-side component for the <code>incubator-breadcrumbs</code> element.
 * An easy way to display breadcrumb on web pages.
 * This component is container for Breadcrumb components
 *
 * @author Vaadin Ltd
 */
@Tag("incubator-breadcrumbs")
@HtmlImport("frontend://bower_components/incubator-breadcrumbs/src/incubator-breadcrumbs.html")
public class Breadcrumbs extends PolymerTemplate<TemplateModel>
        implements HasOrderedComponents<Breadcrumb>, HasSize {

    /**
     * Creates instance of Breadcrumbs  as container for breadcrumbs which are passed as param
     *
     * @param breadcrumbs
     *                      brick components of breadcrumbs component
     */
    public Breadcrumbs(Breadcrumb... breadcrumbs) {
        add(breadcrumbs);
    }
}
