package com.github.hexocraft.worldrestorer.integrations;

/*
 * Copyright 2017 hexosse
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import com.github.hexocraft.worldrestorer.WorldRestorer;
import com.github.hexocraftapi.integration.Hooker;
import com.onarandombox.MultiverseCore.MultiverseCore;

/**
 * @author <b>hexosse</b> (<a href="https://github.comp/hexosse">hexosse on GitHub</a>))
 */
public class Multiverse extends Hooker<MultiverseCore, Multiverse>
{
	public Multiverse()
	{
		super();
	}


	@Override
	public Multiverse capture(MultiverseCore multiverseCore)
	{
		this.plugin = multiverseCore;
		return this;
	}

	public MultiverseCore getCore()
	{
		try
		{
			return get().getCore();
		}
		catch(NullPointerException e)
		{
			return null;
		}
	}
}
