/*
    Copyright (C) 2012 Sweetie Piggy Apps <sweetiepiggyapps@gmail.com>

    This file is part of Report Malaysia Taxi.

    Report Malaysia Taxi is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 3 of the License, or
    (at your option) any later version.

    Report Malaysia Taxi is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Report Malaysia Taxi; if not, see <http://www.gnu.org/licenses/>.
*/

package com.sweetiepiggy.reportmalaysiataxi;

import android.app.Activity;

public class Constants
{
	static final int RESULT_SET_ENGLISH = Activity.RESULT_FIRST_USER;
	static final int RESULT_SET_CHINESE = Activity.RESULT_FIRST_USER + 1;
	static final int RESULT_SET_MALAY = Activity.RESULT_FIRST_USER + 2;

	static final int LANG_DEFAULT = 0;
	static final int LANG_ENGLISH = 1;
	static final int LANG_CHINESE = 2;
	static final int LANG_MALAY = 3;

	static final String COMPLAINT_EMAIL_MALAY = "Aduan Teksi";
	static final String COMPLAINT_MALAY = "ADUAN LPKP";
	static final String COMPLAINT_HASHTAG = "#aduanteksi";

	static final String LOCATION_MALAY = "Lokasi";
	static final String REGISTRATION_MALAY = "Nombor Teksi Pendaftaran";
	static final String OFFENCE_MALAY = "Kesalahan";
	static final String EMAIL_INTRO_MALAY = "Pihak Berkuasa yang berkenan,\n\n" +
		"Tujuan saya menulis emel ini adalah kerana sesuatu kejadian " +
		"berlaku yang tidak menyenang hati. Perkara tersebut adalah " +
		"dicatat seperti dibawah. Sila ambil tindakan yang sepatutnya " +
		"terhadap aduan saya.\n\n" +
		"Sekian.\n";

	static final String[] OFFENCE_MALAY_ARRAY = {
		"Enggan menggunakan meter",
		"Enggan mengambil penumpang",
		"Enggan memberi baki tumpang",
		"Memandu dengan bahaya",
		"Menawarkan perkhidmatan yang menyalahi undang-undang",
		"Gangguan",
		"Merokok dalam teksi",
		"Other"
	};

	static final String[] LANGUAGES = {
		"English",
		"中文",
		"Bahasa Melayu"
	};

	static final String[] LANGUAGE_CODES = {
		"en",
		"zh",
		"ms"
	};

	/* TODO: this is linked to email_choices, that should be made obvious somehow */
	static final String[] EMAIL_ADDRESSES = {
		"aduan@spad.gov.my; ",
		"aduan@lpkp.gov.my; aduantrafik@jpj.gov.my; e-aduan@kpdnkk.gov.my; info@motour.gov.my; bahria@miti.gov.my; unitpro@pcb.gov.my; ",
		"klangvalley.transit@gmail.com; nccc@nccc.org.my; ",
		"menteri@mot.gov.my; yenyenng@motour.gov.my; najib@1malaysia.com.my; ",
		"editor@thestar.com.my; metro@thestar.com.my; mmnews@mmail.com.my; syedn@nst.com.my; letters@nst.com.my; streets@nst.com.my; letters@thesundaily.com, editor@malaysiakini.com.my; editor@themalaysianinsider.com; ",
		"rmp@rmp.gov.my; "
	};

	static final String[] TEL_NUMBERS = {
		"1800889600",
		"0388884244",
		"0378779000"
	};

	static final String SMS_NUMBER = "15888";

	static final String TWITTER_ADDRESS1 = "@aduanSPAD";
	static final String TWITTER_ADDRESS2 = "@transitmy";
	static final String TWITTER_ADDRESS3 = "@myAduan";

	static final String SPAD_EMAIL = "aduan@spad.gov.my";
	static final String SPAD_WEBSITE = "http://www.spad.gov.my";
	static final String SPAD_TWITTER = "http://twitter.com/aduanSPAD";

	static final String LPKP_EMAIL = "aduan@lpkp.gov.my";
	static final String LPKP_WEBSITE = "http://www.lpkp.gov.my";
	static final String LPKP_SMS = "15888";
	static final String LPKP_PHONE = "1-800-88-96-00";

	static final String JPJ_EMAIL = "aduantrafik@jpj.gov.my";
	static final String JPJ_WEBSITE = "http://portal.jpj.gov.my";
	static final String JPJ_PHONE = "03 8888 4244";

	static final String KPDNKK_EMAIL = "e-aduan@kpdnkk.gov.my";
	static final String KPDNKK_WEBSITE = "http://eaduan.kpdnkk.gov.my";

	static final String MOTOUR_EMAIL = "info@motour.gov.my";
	static final String MOTOUR_PHONE = "03 8891 7000";
	static final String MOTOUR_WEBSITE = "http://www.motour.gov.my";

	static final String PCB_PHONE = "03 8872 5777";
	static final String PCB_EMAIL = "unitpro@pcb.gov.my";
	static final String PCB_WEBSITE = "http://www.pcb.gov.my";

	static final String PEMUDAH_PHONE = "03 6200 0185";
	static final String PEMUDAH_EMAIL = "bahria@miti.gov.my";
	static final String PEMUDAH_WEBSITE = "http://www.pemudah.gov.my";

	static final String TTPM_PHONE = "1 800 88 9811\n03 8882 5822";
	static final String TTPM_WEBSITE = "http://ttpm.kpdnkk.gov.my";

	static final String TRANSIT_EMAIL = "klangvalley.transit@gmail.com";
	static final String TRANSIT_WEBSITE = "http://transitmy.org";
	static final String TRANSIT_TWITTER = "http://twitter.com/transitmy";

	static final String NCCC_PHONE = "03 7877 9000";
	static final String NCCC_EMAIL = "nccc@nccc.org.my";
	static final String NCCC_WEBSITE = "http://www.nccc.org.my";
	static final String NCCC_FORM = "http://www.nccc.org.my/v2/index.php/e-aduan";
	static final String NCCC_TWITTER = "http://twitter.com/myaduan";

	static final String SPAD_CHAIRMAN_NAME = "Syed Hamid Albar";
	static final String SPAD_CHAIRMAN_TWITTER = "http://twitter.com/syedhamidalbar";

	static final String MO_TRANSPORT_EMAIL = "menteri@mot.gov.my";
	static final String MO_TRANSPORT_TWITTER = "http://twitter.com/kongchoha";

	static final String MO_TOURISM_EMAIL = "yenyenng@motour.gov.my";
	static final String MO_TOURISM_TWITTER = "http://twitter.com/DrYenYen";

	static final String PRIME_MINISTER_NAME = "Dato Sri Haji Mohammad Najib bin Tun Haji Abdul Razak";
	static final String PRIME_MINISTER_EMAIL = "najib@1malaysia.com.my";
	static final String PRIME_MINISTER_TWITTER = "http://twitter.com/NajibRazak";

	static final String TRAFFIC_POLICE_EMAIL = "rmp@rmp.gov.my";
	static final String TRAFFIC_POLICE_WEBSITE = "http://www.rmp.gov.my";
}

