/*
    The MIT License (MIT)
    
    morganey-intellij-plugin Copyright (c) 2016 thoma
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
*/

package me.rexim.morganey.plugin.run

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.icons.AllIcons
import me.rexim.morganey.plugin.Constants
import javax.swing.Icon

/**
 * Created by thoma on 20/09/2016.
 */
class MorganeyRunConfigurationType : ConfigurationType {
    override fun getIcon() : Icon {
        return AllIcons.General.Information // TODO Replace with Morganey Logo
    }

    override fun getConfigurationTypeDescription() : String {
        return "Morganey Run Configuration Type"
    }

    override fun getId() : String {
        return Constants.MORGANEY_RUN_CONFIGURATION
    }

    override fun getDisplayName() : String {
        return "Morganey"
    }

    override fun getConfigurationFactories() : Array<out ConfigurationFactory> {
        return arrayOf(MorganeyRunConfigurationFactory(this))
    }
}