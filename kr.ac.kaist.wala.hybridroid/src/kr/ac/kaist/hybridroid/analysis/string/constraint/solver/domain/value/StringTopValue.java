/*******************************************************************************
* Copyright (c) 2016 IBM Corporation and KAIST.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* KAIST - initial API and implementation
*******************************************************************************/
package kr.ac.kaist.hybridroid.analysis.string.constraint.solver.domain.value;

public class StringTopValue extends TopValue implements IStringValue {

	private static StringTopValue instance;
	public static StringTopValue getInstance(){
		if(instance == null)
			instance = new StringTopValue();
		return instance;
	}
	
	private StringTopValue(){
	}
	
	@Override
	public IStringValue clone() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public IValue weakUpdate(IValue v) {
		// TODO Auto-generated method stub
		if(v instanceof IStringValue)
			return this;
		else if(v instanceof BotValue)
			return this;
		else
			return TopValue.getInstance();
	}
	
	@Override
	public String toString(){
		return "StringTop";
	}
	
}
