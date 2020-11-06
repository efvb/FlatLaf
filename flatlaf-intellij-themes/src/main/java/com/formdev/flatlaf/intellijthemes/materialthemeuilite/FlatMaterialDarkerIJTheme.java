/*
 * Copyright 2020 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// DO NOT MODIFY
// Generated with com.formdev.flatlaf.demo.intellijthemes.IJThemesClassGenerator
//

package com.formdev.flatlaf.intellijthemes.materialthemeuilite;

import com.formdev.flatlaf.IntelliJTheme;

/**
 * @author Karl Tauber
 */
public class FlatMaterialDarkerIJTheme
	extends IntelliJTheme.ThemeLaf
{
	public static boolean install( ) {
		try {
			return install( new FlatMaterialDarkerIJTheme() );
		} catch( RuntimeException ex ) {
			return false;
		}
	}

	public FlatMaterialDarkerIJTheme() {
		super( Utils.loadTheme( "Material Darker.theme.json" ) );
	}

	@Override
	public String getName() {
		return "Material Darker (Material)";
	}
}
