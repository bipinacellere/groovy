/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.apache.groovy.linq.dsl.expression;

import org.codehaus.groovy.ast.expr.Expression;

/**
 * Represents data source expression
 *
 * @since 4.0.0
 */
public abstract class DataSourceExpression extends AbstractGinqExpression {
    protected final Expression aliasExpr;
    protected final Expression dataSourceExpr;
    protected WhereExpression whereExpression;
    protected GroupExpression groupExpression;
    protected OrderExpression orderExpression;
    protected LimitExpression limitExpression;

    public DataSourceExpression(Expression aliasExpr, Expression dataSourceExpr) {
        this.aliasExpr = aliasExpr;
        this.dataSourceExpr = dataSourceExpr;
    }

    public Expression getAliasExpr() {
        return aliasExpr;
    }
    public Expression getDataSourceExpr() {
        return dataSourceExpr;
    }

    public void setWhereExpression(WhereExpression whereExpression) {
        this.whereExpression = whereExpression;
    }

    public WhereExpression getWhereExpression() {
        return whereExpression;
    }

    public GroupExpression getGroupExpression() {
        return groupExpression;
    }

    public void setGroupExpression(GroupExpression groupExpression) {
        this.groupExpression = groupExpression;
    }

    public OrderExpression getOrderExpression() {
        return orderExpression;
    }

    public void setOrderExpression(OrderExpression orderExpression) {
        this.orderExpression = orderExpression;
    }

    public LimitExpression getLimitExpression() {
        return limitExpression;
    }

    public void setLimitExpression(LimitExpression limitExpression) {
        this.limitExpression = limitExpression;
    }
}
