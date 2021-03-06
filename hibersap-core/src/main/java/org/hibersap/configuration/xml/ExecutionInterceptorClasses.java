/*
 * Copyright (c) 2008-2012 akquinet tech@spree GmbH
 *
 * This file is part of Hibersap.
 *
 * Hibersap is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * Hibersap is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with Hibersap. If
 * not, see <http://www.gnu.org/licenses/>.
 */

package org.hibersap.configuration.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "", propOrder = {"executionInterceptorClasses"} )
public final class ExecutionInterceptorClasses implements Serializable
{
    @XmlElement( name = "execution-interceptor-class" )
    protected List<String> executionInterceptorClasses = new ArrayList<String>();

    public List<String> getExecutionInterceptorClasses()
    {
        return this.executionInterceptorClasses;
    }

    public void add( String interceptorClassName )
    {
        executionInterceptorClasses.add( interceptorClassName );
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        ExecutionInterceptorClasses that = ( ExecutionInterceptorClasses ) o;

        if ( executionInterceptorClasses != null ?
             !executionInterceptorClasses.equals( that.executionInterceptorClasses ) :
             that.executionInterceptorClasses != null )
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        return executionInterceptorClasses != null ? executionInterceptorClasses.hashCode() : 0;
    }

    @Override
    public String toString()
    {
        return "ExecutionInterceptorClasses{" +
                "executionInterceptorClasses=" + executionInterceptorClasses +
                '}';
    }
}
