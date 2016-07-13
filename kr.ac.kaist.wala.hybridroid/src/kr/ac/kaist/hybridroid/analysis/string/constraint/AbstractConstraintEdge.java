/*******************************************************************************
 * Copyright (c) 2002 - 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package kr.ac.kaist.hybridroid.analysis.string.constraint;

public class AbstractConstraintEdge implements IConstraintEdge{
	private IConstraintNode from;
	private IConstraintNode to;
	
	protected AbstractConstraintEdge(IConstraintNode from, IConstraintNode to){
		this.from = from;
		this.to = to;
	}
	
	@Override
	public IConstraintNode from(){
		return from;
	}
	
	@Override
	public IConstraintNode to(){
		return to;
	}
}
