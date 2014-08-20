/*
 * Copyright (c) 2014 Shaleen Jain <shaleen.jain95@gmail.com>
 *
 * This file is part of UPES Academics.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.psdev.licensesdialog.licenses;

import android.content.Context;

import de.psdev.licensesdialog.R;


public class GnuLesserGeneralPublicLicense21 extends License {

    @Override
    public String getName() {
        return "GNU Lesser General Public License 2.1";
    }

    @Override
    public String getSummaryText(final Context context) {
        return getContent(context, R.raw.lgpl_21_summary);
    }

    @Override
    public String getFullText(final Context context) {
        return getContent(context, R.raw.lgpl_21_full);
    }

    @Override
    public String getVersion() {
        return "2.1";
    }

    @Override
    public String getUrl() {
        return "http://www.gnu.org/de.psdev.licensesdialog.licenses/old-de.psdev.licensesdialog.licenses/lgpl-2.1.html";
    }

}