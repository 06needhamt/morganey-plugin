/*
The MIT License (MIT)

Copyright (c) 2016 Tom Needham

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
package me.rexim.morganey.plugin.filetype

import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.util.IconLoader
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.util.PlatformIcons
import javax.swing.Icon

/**
 * Created by thoma on 19/09/2016.
 */
class MorganeyFileType : FileType {

    companion object StaticData{
        @JvmStatic val INSTANCE = MorganeyFileType()
        @JvmStatic val DEFAULT_EXTENSION = "mgn"
    }

    override fun getIcon() : Icon? {
        return null // Todo Add Morganey Icon
    }

    override fun getName() : String {
        return "Morganey Source File"
    }

    override fun isBinary() : Boolean {
        return false
    }

    override fun isReadOnly() : Boolean {
        return false
    }

    override fun getDefaultExtension() : String {
        return DEFAULT_EXTENSION
    }

    override fun getCharset(p0 : VirtualFile, p1 : ByteArray) : String? {
        return null
    }

    override fun getDescription() : String {
        return "Morganey Source Code File"
    }
}