/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.Socket;

abstract class tl {
    String field_c;
    int field_d;
    static dl field_b;
    static u field_e;
    static am field_a;

    public static void b() {
        try {
            field_e = null;
            field_a = null;
            field_b = null;
            int var1_int = 0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "tl.D(" + 2 + 41);
        }
    }

    final static void a(int param0, db param1) {
        byte[] var2 = null;
        int var3 = 0;
        L0: {
          var3 = CrazyCrystals.field_B;
          ge.field_b = param1;
          int discarded$285 = 1;
          var2 = we.a("gamename");
          if (null != var2) {
            ei.field_G = fa.a((byte) -100, var2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          int discarded$286 = 1;
          var2 = we.a("crystalplacement");
          if (var2 == null) {
            break L1;
          } else {
            o.field_h = fa.a((byte) -72, var2);
            break L1;
          }
        }
        L2: {
          int discarded$287 = 1;
          var2 = we.a("keycode_map");
          if (var2 != null) {
            vf.field_c = var2[0] & 255;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          int discarded$288 = 1;
          var2 = we.a("keycode_p1left");
          if (var2 == null) {
            break L3;
          } else {
            jm.field_g = 255 & var2[0];
            break L3;
          }
        }
        L4: {
          int discarded$289 = 1;
          var2 = we.a("keycode_p1right");
          if (var2 != null) {
            vp.field_b = 255 & var2[0];
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          int discarded$290 = 1;
          var2 = we.a("keycode_p1up");
          if (null != var2) {
            kp.field_j = 255 & var2[0];
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          int discarded$291 = 1;
          var2 = we.a("keycode_p1down");
          if (var2 == null) {
            break L6;
          } else {
            tg.field_b = 255 & var2[0];
            break L6;
          }
        }
        L7: {
          int discarded$292 = 1;
          var2 = we.a("keycode_p2left");
          if (null == var2) {
            break L7;
          } else {
            rk.field_d = var2[0] & 255;
            break L7;
          }
        }
        L8: {
          int discarded$293 = 1;
          var2 = we.a("keycode_p2right");
          if (var2 != null) {
            pa.field_E = 255 & var2[0];
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          int discarded$294 = 1;
          var2 = we.a("keycode_p2up");
          if (var2 == null) {
            break L9;
          } else {
            oo.field_i = var2[0] & 255;
            break L9;
          }
        }
        L10: {
          int discarded$295 = 1;
          var2 = we.a("keycode_p2down");
          if (null == var2) {
            break L10;
          } else {
            ji.field_t = var2[0] & 255;
            break L10;
          }
        }
        L11: {
          int discarded$296 = 1;
          var2 = we.a("esc");
          if (var2 != null) {
            ji.field_u = fa.a((byte) -112, var2);
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          int discarded$297 = 1;
          var2 = we.a("enter");
          if (null == var2) {
            break L12;
          } else {
            sh.field_l = fa.a((byte) -112, var2);
            break L12;
          }
        }
        L13: {
          int discarded$298 = 1;
          var2 = we.a("backspace");
          if (null == var2) {
            break L13;
          } else {
            gl.field_f = fa.a((byte) -74, var2);
            break L13;
          }
        }
        L14: {
          int discarded$299 = 1;
          var2 = we.a("tilevariations");
          if (var2 == null) {
            break L14;
          } else {
            q.field_d = fa.a((byte) -69, var2);
            break L14;
          }
        }
        L15: {
          int discarded$300 = 1;
          var2 = we.a("tutorial_levelnames,0");
          if (var2 != null) {
            qp.field_g[0] = fa.a((byte) -127, var2);
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          int discarded$301 = 1;
          var2 = we.a("tutorial_levelnames,1");
          if (null == var2) {
            break L16;
          } else {
            qp.field_g[1] = fa.a((byte) -105, var2);
            break L16;
          }
        }
        L17: {
          int discarded$302 = 1;
          var2 = we.a("tutorial_levelnames,2");
          if (var2 != null) {
            qp.field_g[2] = fa.a((byte) -94, var2);
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          int discarded$303 = 1;
          var2 = we.a("tutorial_levelnames,3");
          if (var2 == null) {
            break L18;
          } else {
            qp.field_g[3] = fa.a((byte) -123, var2);
            break L18;
          }
        }
        L19: {
          int discarded$304 = 1;
          var2 = we.a("tutorial_levelnames,4");
          if (null == var2) {
            break L19;
          } else {
            qp.field_g[4] = fa.a((byte) -87, var2);
            break L19;
          }
        }
        L20: {
          int discarded$305 = 1;
          var2 = we.a("puzzle1p_levelnames,0");
          if (var2 == null) {
            break L20;
          } else {
            ro.field_r[0] = fa.a((byte) -126, var2);
            break L20;
          }
        }
        L21: {
          int discarded$306 = 1;
          var2 = we.a("puzzle1p_levelnames,1");
          if (null != var2) {
            ro.field_r[1] = fa.a((byte) -85, var2);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          int discarded$307 = 1;
          var2 = we.a("puzzle1p_levelnames,2");
          if (null != var2) {
            ro.field_r[2] = fa.a((byte) -105, var2);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          int discarded$308 = 1;
          var2 = we.a("puzzle1p_levelnames,3");
          if (null != var2) {
            ro.field_r[3] = fa.a((byte) -72, var2);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          int discarded$309 = 1;
          var2 = we.a("puzzle1p_levelnames,4");
          if (null == var2) {
            break L24;
          } else {
            ro.field_r[4] = fa.a((byte) -71, var2);
            break L24;
          }
        }
        L25: {
          int discarded$310 = 1;
          var2 = we.a("puzzle1p_levelnames,5");
          if (var2 != null) {
            ro.field_r[5] = fa.a((byte) -116, var2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          int discarded$311 = 1;
          var2 = we.a("puzzle1p_levelnames,6");
          if (null != var2) {
            ro.field_r[6] = fa.a((byte) -93, var2);
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          int discarded$312 = 1;
          var2 = we.a("puzzle1p_levelnames,7");
          if (null == var2) {
            break L27;
          } else {
            ro.field_r[7] = fa.a((byte) -100, var2);
            break L27;
          }
        }
        L28: {
          int discarded$313 = 1;
          var2 = we.a("puzzle1p_levelnames,8");
          if (null == var2) {
            break L28;
          } else {
            ro.field_r[8] = fa.a((byte) -117, var2);
            break L28;
          }
        }
        L29: {
          int discarded$314 = 1;
          var2 = we.a("puzzle1p_levelnames,9");
          if (var2 == null) {
            break L29;
          } else {
            ro.field_r[9] = fa.a((byte) -86, var2);
            break L29;
          }
        }
        L30: {
          int discarded$315 = 1;
          var2 = we.a("puzzle1p_levelnames,10");
          if (var2 != null) {
            ro.field_r[10] = fa.a((byte) -117, var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          int discarded$316 = 1;
          var2 = we.a("puzzle1p_levelnames,11");
          if (null != var2) {
            ro.field_r[11] = fa.a((byte) -96, var2);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          int discarded$317 = 1;
          var2 = we.a("puzzle1p_levelnames,12");
          if (var2 == null) {
            break L32;
          } else {
            ro.field_r[12] = fa.a((byte) -109, var2);
            break L32;
          }
        }
        L33: {
          int discarded$318 = 1;
          var2 = we.a("puzzle1p_levelnames,13");
          if (var2 != null) {
            ro.field_r[13] = fa.a((byte) -98, var2);
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          int discarded$319 = 1;
          var2 = we.a("puzzle1p_levelnames,14");
          if (null == var2) {
            break L34;
          } else {
            ro.field_r[14] = fa.a((byte) -79, var2);
            break L34;
          }
        }
        L35: {
          int discarded$320 = 1;
          var2 = we.a("puzzle1p_levelnames,15");
          if (var2 == null) {
            break L35;
          } else {
            ro.field_r[15] = fa.a((byte) -67, var2);
            break L35;
          }
        }
        L36: {
          int discarded$321 = 1;
          var2 = we.a("puzzle1p_levelnames,16");
          if (var2 != null) {
            ro.field_r[16] = fa.a((byte) -93, var2);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          int discarded$322 = 1;
          var2 = we.a("puzzle1p_levelnames,17");
          if (null == var2) {
            break L37;
          } else {
            ro.field_r[17] = fa.a((byte) -105, var2);
            break L37;
          }
        }
        L38: {
          int discarded$323 = 1;
          var2 = we.a("puzzle1p_levelnames,18");
          if (var2 != null) {
            ro.field_r[18] = fa.a((byte) -97, var2);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          int discarded$324 = 1;
          var2 = we.a("puzzle1p_levelnames,19");
          if (null == var2) {
            break L39;
          } else {
            ro.field_r[19] = fa.a((byte) -93, var2);
            break L39;
          }
        }
        L40: {
          int discarded$325 = 1;
          var2 = we.a("puzzle1p_levelnames,20");
          if (var2 == null) {
            break L40;
          } else {
            ro.field_r[20] = fa.a((byte) -118, var2);
            break L40;
          }
        }
        L41: {
          int discarded$326 = 1;
          var2 = we.a("puzzle1p_levelnames,21");
          if (null != var2) {
            ro.field_r[21] = fa.a((byte) -118, var2);
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          int discarded$327 = 1;
          var2 = we.a("puzzle1p_levelnames,22");
          if (var2 == null) {
            break L42;
          } else {
            ro.field_r[22] = fa.a((byte) -102, var2);
            break L42;
          }
        }
        L43: {
          int discarded$328 = 1;
          var2 = we.a("puzzle1p_levelnames,23");
          if (var2 != null) {
            ro.field_r[23] = fa.a((byte) -85, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          int discarded$329 = 1;
          var2 = we.a("puzzle1p_levelnames,24");
          if (var2 != null) {
            ro.field_r[24] = fa.a((byte) -77, var2);
            break L44;
          } else {
            break L44;
          }
        }
        L45: {
          int discarded$330 = 1;
          var2 = we.a("puzzle1p_levelnames,25");
          if (null != var2) {
            ro.field_r[25] = fa.a((byte) -64, var2);
            break L45;
          } else {
            break L45;
          }
        }
        L46: {
          int discarded$331 = 1;
          var2 = we.a("puzzle1p_levelnames,26");
          if (var2 == null) {
            break L46;
          } else {
            ro.field_r[26] = fa.a((byte) -118, var2);
            break L46;
          }
        }
        L47: {
          int discarded$332 = 1;
          var2 = we.a("puzzle1p_levelnames,27");
          if (var2 != null) {
            ro.field_r[27] = fa.a((byte) -118, var2);
            break L47;
          } else {
            break L47;
          }
        }
        L48: {
          int discarded$333 = 1;
          var2 = we.a("puzzle1p_levelnames,28");
          if (var2 == null) {
            break L48;
          } else {
            ro.field_r[28] = fa.a((byte) -99, var2);
            break L48;
          }
        }
        L49: {
          int discarded$334 = 1;
          var2 = we.a("puzzle1p_levelnames,29");
          if (var2 == null) {
            break L49;
          } else {
            ro.field_r[29] = fa.a((byte) -109, var2);
            break L49;
          }
        }
        L50: {
          int discarded$335 = 1;
          var2 = we.a("puzzle1p_levelnames,30");
          if (var2 == null) {
            break L50;
          } else {
            ro.field_r[30] = fa.a((byte) -89, var2);
            break L50;
          }
        }
        L51: {
          int discarded$336 = 1;
          var2 = we.a("puzzle1p_levelnames,31");
          if (null == var2) {
            break L51;
          } else {
            ro.field_r[31] = fa.a((byte) -120, var2);
            break L51;
          }
        }
        L52: {
          int discarded$337 = 1;
          var2 = we.a("puzzle1p_levelnames,32");
          if (var2 != null) {
            ro.field_r[32] = fa.a((byte) -81, var2);
            break L52;
          } else {
            break L52;
          }
        }
        L53: {
          int discarded$338 = 1;
          var2 = we.a("puzzle1p_levelnames,33");
          if (var2 == null) {
            break L53;
          } else {
            ro.field_r[33] = fa.a((byte) -124, var2);
            break L53;
          }
        }
        L54: {
          int discarded$339 = 1;
          var2 = we.a("puzzle1p_levelnames,34");
          if (null != var2) {
            ro.field_r[34] = fa.a((byte) -105, var2);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          int discarded$340 = 1;
          var2 = we.a("puzzle1p_levelnames,35");
          if (var2 == null) {
            break L55;
          } else {
            ro.field_r[35] = fa.a((byte) -75, var2);
            break L55;
          }
        }
        L56: {
          int discarded$341 = 1;
          var2 = we.a("puzzle1p_levelnames,36");
          if (var2 == null) {
            break L56;
          } else {
            ro.field_r[36] = fa.a((byte) -84, var2);
            break L56;
          }
        }
        L57: {
          int discarded$342 = 1;
          var2 = we.a("puzzle1p_levelnames,37");
          if (var2 == null) {
            break L57;
          } else {
            ro.field_r[37] = fa.a((byte) -79, var2);
            break L57;
          }
        }
        L58: {
          int discarded$343 = 1;
          var2 = we.a("puzzle1p_levelnames,38");
          if (var2 != null) {
            ro.field_r[38] = fa.a((byte) -87, var2);
            break L58;
          } else {
            break L58;
          }
        }
        L59: {
          int discarded$344 = 1;
          var2 = we.a("puzzle1p_levelnames,39");
          if (null != var2) {
            ro.field_r[39] = fa.a((byte) -77, var2);
            break L59;
          } else {
            break L59;
          }
        }
        L60: {
          int discarded$345 = 1;
          var2 = we.a("puzzle1p_levelnames,40");
          if (null == var2) {
            break L60;
          } else {
            ro.field_r[40] = fa.a((byte) -75, var2);
            break L60;
          }
        }
        L61: {
          int discarded$346 = 1;
          var2 = we.a("puzzle1p_levelnames,41");
          if (var2 == null) {
            break L61;
          } else {
            ro.field_r[41] = fa.a((byte) -107, var2);
            break L61;
          }
        }
        L62: {
          int discarded$347 = 1;
          var2 = we.a("puzzle1p_levelnames,42");
          if (var2 != null) {
            ro.field_r[42] = fa.a((byte) -113, var2);
            break L62;
          } else {
            break L62;
          }
        }
        L63: {
          int discarded$348 = 1;
          var2 = we.a("puzzle1p_levelnames,43");
          if (var2 != null) {
            ro.field_r[43] = fa.a((byte) -105, var2);
            break L63;
          } else {
            break L63;
          }
        }
        L64: {
          int discarded$349 = 1;
          var2 = we.a("puzzle1p_levelnames,44");
          if (null != var2) {
            ro.field_r[44] = fa.a((byte) -98, var2);
            break L64;
          } else {
            break L64;
          }
        }
        L65: {
          int discarded$350 = 1;
          var2 = we.a("puzzle1p_levelnames,45");
          if (null == var2) {
            break L65;
          } else {
            ro.field_r[45] = fa.a((byte) -79, var2);
            break L65;
          }
        }
        L66: {
          int discarded$351 = 1;
          var2 = we.a("puzzle1p_levelnames,46");
          if (null != var2) {
            ro.field_r[46] = fa.a((byte) -124, var2);
            break L66;
          } else {
            break L66;
          }
        }
        L67: {
          int discarded$352 = 1;
          var2 = we.a("puzzle1p_levelnames,47");
          if (null != var2) {
            ro.field_r[47] = fa.a((byte) -104, var2);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          int discarded$353 = 1;
          var2 = we.a("puzzle1p_levelnames,48");
          if (null == var2) {
            break L68;
          } else {
            ro.field_r[48] = fa.a((byte) -68, var2);
            break L68;
          }
        }
        L69: {
          int discarded$354 = 1;
          var2 = we.a("puzzle1p_levelnames,49");
          if (null != var2) {
            ro.field_r[49] = fa.a((byte) -82, var2);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          int discarded$355 = 1;
          var2 = we.a("puzzle1p_levelnames,50");
          if (var2 != null) {
            ro.field_r[50] = fa.a((byte) -82, var2);
            break L70;
          } else {
            break L70;
          }
        }
        L71: {
          int discarded$356 = 1;
          var2 = we.a("puzzle1p_levelnames,51");
          if (var2 == null) {
            break L71;
          } else {
            ro.field_r[51] = fa.a((byte) -87, var2);
            break L71;
          }
        }
        L72: {
          int discarded$357 = 1;
          var2 = we.a("puzzle1p_levelnames,52");
          if (null != var2) {
            ro.field_r[52] = fa.a((byte) -82, var2);
            break L72;
          } else {
            break L72;
          }
        }
        L73: {
          int discarded$358 = 1;
          var2 = we.a("puzzle1p_levelnames,53");
          if (null == var2) {
            break L73;
          } else {
            ro.field_r[53] = fa.a((byte) -81, var2);
            break L73;
          }
        }
        L74: {
          int discarded$359 = 1;
          var2 = we.a("puzzle1p_levelnames,54");
          if (null == var2) {
            break L74;
          } else {
            ro.field_r[54] = fa.a((byte) -111, var2);
            break L74;
          }
        }
        L75: {
          int discarded$360 = 1;
          var2 = we.a("puzzle1p_levelnames,55");
          if (var2 != null) {
            ro.field_r[55] = fa.a((byte) -78, var2);
            break L75;
          } else {
            break L75;
          }
        }
        L76: {
          int discarded$361 = 1;
          var2 = we.a("puzzle1p_levelnames,56");
          if (null == var2) {
            break L76;
          } else {
            ro.field_r[56] = fa.a((byte) -100, var2);
            break L76;
          }
        }
        L77: {
          int discarded$362 = 1;
          var2 = we.a("puzzle1p_levelnames,57");
          if (var2 == null) {
            break L77;
          } else {
            ro.field_r[57] = fa.a((byte) -128, var2);
            break L77;
          }
        }
        L78: {
          int discarded$363 = 1;
          var2 = we.a("puzzle1p_levelnames,58");
          if (null == var2) {
            break L78;
          } else {
            ro.field_r[58] = fa.a((byte) -98, var2);
            break L78;
          }
        }
        L79: {
          int discarded$364 = 1;
          var2 = we.a("puzzle1p_levelnames,59");
          if (null == var2) {
            break L79;
          } else {
            ro.field_r[59] = fa.a((byte) -90, var2);
            break L79;
          }
        }
        L80: {
          int discarded$365 = 1;
          var2 = we.a("puzzle1p_levelnames,60");
          if (var2 != null) {
            ro.field_r[60] = fa.a((byte) -102, var2);
            break L80;
          } else {
            break L80;
          }
        }
        L81: {
          int discarded$366 = 1;
          var2 = we.a("puzzle1p_levelnames,61");
          if (var2 != null) {
            ro.field_r[61] = fa.a((byte) -69, var2);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          int discarded$367 = 1;
          var2 = we.a("puzzle1p_levelnames,62");
          if (null != var2) {
            ro.field_r[62] = fa.a((byte) -80, var2);
            break L82;
          } else {
            break L82;
          }
        }
        L83: {
          int discarded$368 = 1;
          var2 = we.a("puzzle1p_levelnames,63");
          if (null != var2) {
            ro.field_r[63] = fa.a((byte) -90, var2);
            break L83;
          } else {
            break L83;
          }
        }
        L84: {
          int discarded$369 = 1;
          var2 = we.a("puzzle1p_levelnames,64");
          if (null != var2) {
            ro.field_r[64] = fa.a((byte) -127, var2);
            break L84;
          } else {
            break L84;
          }
        }
        L85: {
          int discarded$370 = 1;
          var2 = we.a("puzzle1p_levelnames,65");
          if (null != var2) {
            ro.field_r[65] = fa.a((byte) -84, var2);
            break L85;
          } else {
            break L85;
          }
        }
        L86: {
          int discarded$371 = 1;
          var2 = we.a("puzzle1p_levelnames,66");
          if (null != var2) {
            ro.field_r[66] = fa.a((byte) -112, var2);
            break L86;
          } else {
            break L86;
          }
        }
        L87: {
          int discarded$372 = 1;
          var2 = we.a("puzzle1p_levelnames,67");
          if (param0 >= 83) {
            break L87;
          } else {
            tl.a(-68, (db) null);
            break L87;
          }
        }
        L88: {
          if (var2 == null) {
            break L88;
          } else {
            ro.field_r[67] = fa.a((byte) -114, var2);
            break L88;
          }
        }
        L89: {
          int discarded$373 = 1;
          var2 = we.a("puzzle1p_levelnames,68");
          if (null == var2) {
            break L89;
          } else {
            ro.field_r[68] = fa.a((byte) -105, var2);
            break L89;
          }
        }
        L90: {
          int discarded$374 = 1;
          var2 = we.a("puzzle1p_levelnames,69");
          if (null != var2) {
            ro.field_r[69] = fa.a((byte) -73, var2);
            break L90;
          } else {
            break L90;
          }
        }
        L91: {
          int discarded$375 = 1;
          var2 = we.a("puzzle2p_levelnames,0");
          if (var2 != null) {
            pg.field_e[0] = fa.a((byte) -124, var2);
            break L91;
          } else {
            break L91;
          }
        }
        L92: {
          int discarded$376 = 1;
          var2 = we.a("puzzle2p_levelnames,1");
          if (null != var2) {
            pg.field_e[1] = fa.a((byte) -79, var2);
            break L92;
          } else {
            break L92;
          }
        }
        L93: {
          int discarded$377 = 1;
          var2 = we.a("puzzle2p_levelnames,2");
          if (null != var2) {
            pg.field_e[2] = fa.a((byte) -121, var2);
            break L93;
          } else {
            break L93;
          }
        }
        L94: {
          int discarded$378 = 1;
          var2 = we.a("puzzle2p_levelnames,3");
          if (null == var2) {
            break L94;
          } else {
            pg.field_e[3] = fa.a((byte) -86, var2);
            break L94;
          }
        }
        L95: {
          int discarded$379 = 1;
          var2 = we.a("puzzle2p_levelnames,4");
          if (null == var2) {
            break L95;
          } else {
            pg.field_e[4] = fa.a((byte) -66, var2);
            break L95;
          }
        }
        L96: {
          int discarded$380 = 1;
          var2 = we.a("puzzle2p_levelnames,5");
          if (var2 == null) {
            break L96;
          } else {
            pg.field_e[5] = fa.a((byte) -82, var2);
            break L96;
          }
        }
        L97: {
          int discarded$381 = 1;
          var2 = we.a("puzzle2p_levelnames,6");
          if (var2 != null) {
            pg.field_e[6] = fa.a((byte) -95, var2);
            break L97;
          } else {
            break L97;
          }
        }
        L98: {
          int discarded$382 = 1;
          var2 = we.a("puzzle2p_levelnames,7");
          if (null == var2) {
            break L98;
          } else {
            pg.field_e[7] = fa.a((byte) -104, var2);
            break L98;
          }
        }
        L99: {
          int discarded$383 = 1;
          var2 = we.a("puzzle2p_levelnames,8");
          if (var2 != null) {
            pg.field_e[8] = fa.a((byte) -93, var2);
            break L99;
          } else {
            break L99;
          }
        }
        L100: {
          int discarded$384 = 1;
          var2 = we.a("puzzle2p_levelnames,9");
          if (var2 != null) {
            pg.field_e[9] = fa.a((byte) -64, var2);
            break L100;
          } else {
            break L100;
          }
        }
        L101: {
          int discarded$385 = 1;
          var2 = we.a("puzzle2p_levelnames,10");
          if (null != var2) {
            pg.field_e[10] = fa.a((byte) -106, var2);
            break L101;
          } else {
            break L101;
          }
        }
        L102: {
          int discarded$386 = 1;
          var2 = we.a("puzzle2p_levelnames,11");
          if (var2 != null) {
            pg.field_e[11] = fa.a((byte) -66, var2);
            break L102;
          } else {
            break L102;
          }
        }
        L103: {
          int discarded$387 = 1;
          var2 = we.a("puzzle3p_levelnames,0");
          if (var2 == null) {
            break L103;
          } else {
            qg.field_c[0] = fa.a((byte) -66, var2);
            break L103;
          }
        }
        L104: {
          int discarded$388 = 1;
          var2 = we.a("puzzle3p_levelnames,1");
          if (var2 == null) {
            break L104;
          } else {
            qg.field_c[1] = fa.a((byte) -77, var2);
            break L104;
          }
        }
        L105: {
          int discarded$389 = 1;
          var2 = we.a("puzzle3p_levelnames,2");
          if (null != var2) {
            qg.field_c[2] = fa.a((byte) -117, var2);
            break L105;
          } else {
            break L105;
          }
        }
        L106: {
          int discarded$390 = 1;
          var2 = we.a("puzzle3p_levelnames,3");
          if (var2 != null) {
            qg.field_c[3] = fa.a((byte) -94, var2);
            break L106;
          } else {
            break L106;
          }
        }
        L107: {
          int discarded$391 = 1;
          var2 = we.a("puzzle3p_levelnames,4");
          if (null == var2) {
            break L107;
          } else {
            qg.field_c[4] = fa.a((byte) -95, var2);
            break L107;
          }
        }
        L108: {
          int discarded$392 = 1;
          var2 = we.a("arcade1p_levelnames,0");
          if (null != var2) {
            kk.field_k[0] = fa.a((byte) -119, var2);
            break L108;
          } else {
            break L108;
          }
        }
        L109: {
          int discarded$393 = 1;
          var2 = we.a("arcade1p_levelnames,1");
          if (var2 != null) {
            kk.field_k[1] = fa.a((byte) -124, var2);
            break L109;
          } else {
            break L109;
          }
        }
        L110: {
          int discarded$394 = 1;
          var2 = we.a("arcade1p_levelnames,2");
          if (var2 == null) {
            break L110;
          } else {
            kk.field_k[2] = fa.a((byte) -96, var2);
            break L110;
          }
        }
        L111: {
          int discarded$395 = 1;
          var2 = we.a("arcade1p_levelnames,3");
          if (var2 == null) {
            break L111;
          } else {
            kk.field_k[3] = fa.a((byte) -125, var2);
            break L111;
          }
        }
        L112: {
          int discarded$396 = 1;
          var2 = we.a("arcade1p_levelnames,4");
          if (null == var2) {
            break L112;
          } else {
            kk.field_k[4] = fa.a((byte) -110, var2);
            break L112;
          }
        }
        L113: {
          int discarded$397 = 1;
          var2 = we.a("arcade1p_levelnames,5");
          if (var2 == null) {
            break L113;
          } else {
            kk.field_k[5] = fa.a((byte) -83, var2);
            break L113;
          }
        }
        L114: {
          int discarded$398 = 1;
          var2 = we.a("arcade1p_levelnames,6");
          if (null != var2) {
            kk.field_k[6] = fa.a((byte) -88, var2);
            break L114;
          } else {
            break L114;
          }
        }
        L115: {
          int discarded$399 = 1;
          var2 = we.a("arcade1p_levelnames,7");
          if (var2 != null) {
            kk.field_k[7] = fa.a((byte) -127, var2);
            break L115;
          } else {
            break L115;
          }
        }
        L116: {
          int discarded$400 = 1;
          var2 = we.a("arcade1p_levelnames,8");
          if (var2 != null) {
            kk.field_k[8] = fa.a((byte) -123, var2);
            break L116;
          } else {
            break L116;
          }
        }
        L117: {
          int discarded$401 = 1;
          var2 = we.a("arcade1p_levelnames,9");
          if (var2 != null) {
            kk.field_k[9] = fa.a((byte) -91, var2);
            break L117;
          } else {
            break L117;
          }
        }
        L118: {
          int discarded$402 = 1;
          var2 = we.a("arcade1p_levelnames,10");
          if (null == var2) {
            break L118;
          } else {
            kk.field_k[10] = fa.a((byte) -94, var2);
            break L118;
          }
        }
        L119: {
          int discarded$403 = 1;
          var2 = we.a("arcade1p_levelnames,11");
          if (null != var2) {
            kk.field_k[11] = fa.a((byte) -81, var2);
            break L119;
          } else {
            break L119;
          }
        }
        L120: {
          int discarded$404 = 1;
          var2 = we.a("arcade1p_levelnames,12");
          if (var2 == null) {
            break L120;
          } else {
            kk.field_k[12] = fa.a((byte) -73, var2);
            break L120;
          }
        }
        L121: {
          int discarded$405 = 1;
          var2 = we.a("arcade1p_levelnames,13");
          if (null != var2) {
            kk.field_k[13] = fa.a((byte) -67, var2);
            break L121;
          } else {
            break L121;
          }
        }
        L122: {
          int discarded$406 = 1;
          var2 = we.a("arcade1p_levelnames,14");
          if (var2 != null) {
            kk.field_k[14] = fa.a((byte) -117, var2);
            break L122;
          } else {
            break L122;
          }
        }
        L123: {
          int discarded$407 = 1;
          var2 = we.a("arcade1p_levelnames,15");
          if (null == var2) {
            break L123;
          } else {
            kk.field_k[15] = fa.a((byte) -86, var2);
            break L123;
          }
        }
        L124: {
          int discarded$408 = 1;
          var2 = we.a("arcade1p_levelnames,16");
          if (null == var2) {
            break L124;
          } else {
            kk.field_k[16] = fa.a((byte) -100, var2);
            break L124;
          }
        }
        L125: {
          int discarded$409 = 1;
          var2 = we.a("arcade1p_levelnames,17");
          if (null == var2) {
            break L125;
          } else {
            kk.field_k[17] = fa.a((byte) -101, var2);
            break L125;
          }
        }
        L126: {
          int discarded$410 = 1;
          var2 = we.a("arcade1p_levelnames,18");
          if (var2 == null) {
            break L126;
          } else {
            kk.field_k[18] = fa.a((byte) -66, var2);
            break L126;
          }
        }
        L127: {
          int discarded$411 = 1;
          var2 = we.a("arcade1p_levelnames,19");
          if (null == var2) {
            break L127;
          } else {
            kk.field_k[19] = fa.a((byte) -115, var2);
            break L127;
          }
        }
        L128: {
          int discarded$412 = 1;
          var2 = we.a("arcade1p_levelnames,20");
          if (null == var2) {
            break L128;
          } else {
            kk.field_k[20] = fa.a((byte) -108, var2);
            break L128;
          }
        }
        L129: {
          int discarded$413 = 1;
          var2 = we.a("arcade1p_levelnames,21");
          if (var2 == null) {
            break L129;
          } else {
            kk.field_k[21] = fa.a((byte) -114, var2);
            break L129;
          }
        }
        L130: {
          int discarded$414 = 1;
          var2 = we.a("arcade1p_levelnames,22");
          if (null != var2) {
            kk.field_k[22] = fa.a((byte) -68, var2);
            break L130;
          } else {
            break L130;
          }
        }
        L131: {
          int discarded$415 = 1;
          var2 = we.a("arcade1p_levelnames,23");
          if (var2 == null) {
            break L131;
          } else {
            kk.field_k[23] = fa.a((byte) -128, var2);
            break L131;
          }
        }
        L132: {
          int discarded$416 = 1;
          var2 = we.a("arcade1p_levelnames,24");
          if (var2 != null) {
            kk.field_k[24] = fa.a((byte) -88, var2);
            break L132;
          } else {
            break L132;
          }
        }
        L133: {
          int discarded$417 = 1;
          var2 = we.a("memberslevels_cannotplayreason");
          if (var2 == null) {
            break L133;
          } else {
            ro.field_t = fa.a((byte) -63, var2);
            break L133;
          }
        }
        L134: {
          int discarded$418 = 1;
          var2 = we.a("unreachedlevels_cannotplayreason_shorter");
          if (var2 == null) {
            break L134;
          } else {
            mb.field_a = fa.a((byte) -68, var2);
            break L134;
          }
        }
        L135: {
          int discarded$419 = 1;
          var2 = we.a("tasterlevel_suffix");
          if (var2 != null) {
            pe.field_n = fa.a((byte) -128, var2);
            break L135;
          } else {
            break L135;
          }
        }
        L136: {
          int discarded$420 = 1;
          var2 = we.a("tasterlevel_topmessage");
          if (null == var2) {
            break L136;
          } else {
            io.field_J = fa.a((byte) -100, var2);
            break L136;
          }
        }
        L137: {
          int discarded$421 = 1;
          var2 = we.a("tasterlevel_botmessage");
          if (null != var2) {
            cj.field_E = fa.a((byte) -71, var2);
            break L137;
          } else {
            break L137;
          }
        }
        L138: {
          int discarded$422 = 1;
          var2 = we.a("loadloop_playingwizardrun");
          if (var2 == null) {
            break L138;
          } else {
            ae.field_D = fa.a((byte) -123, var2);
            break L138;
          }
        }
        L139: {
          int discarded$423 = 1;
          var2 = we.a("oneplayerpuzzles");
          if (null != var2) {
            rh.field_d = fa.a((byte) -105, var2);
            break L139;
          } else {
            break L139;
          }
        }
        L140: {
          int discarded$424 = 1;
          var2 = we.a("twoplayerpuzzles");
          if (null == var2) {
            break L140;
          } else {
            li.field_e = fa.a((byte) -100, var2);
            break L140;
          }
        }
        L141: {
          int discarded$425 = 1;
          var2 = we.a("threeplayerpuzzles");
          if (null == var2) {
            break L141;
          } else {
            l.field_c = fa.a((byte) -109, var2);
            break L141;
          }
        }
        L142: {
          int discarded$426 = 1;
          var2 = we.a("arcadelevels");
          if (null != var2) {
            b.field_d = fa.a((byte) -85, var2);
            break L142;
          } else {
            break L142;
          }
        }
        L143: {
          int discarded$427 = 1;
          var2 = we.a("puzzlehighscores");
          if (null == var2) {
            break L143;
          } else {
            cp.field_h = fa.a((byte) -88, var2);
            break L143;
          }
        }
        L144: {
          int discarded$428 = 1;
          var2 = we.a("arcadehighscores");
          if (var2 == null) {
            break L144;
          } else {
            fq.field_G = fa.a((byte) -116, var2);
            break L144;
          }
        }
        L145: {
          int discarded$429 = 1;
          var2 = we.a("puzzle1p_subsections,0");
          if (var2 == null) {
            break L145;
          } else {
            md.field_t[0] = fa.a((byte) -91, var2);
            break L145;
          }
        }
        L146: {
          int discarded$430 = 1;
          var2 = we.a("puzzle1p_subsections,1");
          if (null != var2) {
            md.field_t[1] = fa.a((byte) -103, var2);
            break L146;
          } else {
            break L146;
          }
        }
        L147: {
          int discarded$431 = 1;
          var2 = we.a("puzzle1p_subsections,2");
          if (var2 == null) {
            break L147;
          } else {
            md.field_t[2] = fa.a((byte) -123, var2);
            break L147;
          }
        }
        L148: {
          int discarded$432 = 1;
          var2 = we.a("puzzle1p_subsections,3");
          if (null != var2) {
            md.field_t[3] = fa.a((byte) -100, var2);
            break L148;
          } else {
            break L148;
          }
        }
        L149: {
          int discarded$433 = 1;
          var2 = we.a("levelscomplete_proceeding");
          if (null != var2) {
            fb.field_e = fa.a((byte) -92, var2);
            break L149;
          } else {
            break L149;
          }
        }
        L150: {
          int discarded$434 = 1;
          var2 = we.a("levelscomplete_proceeding_bonus");
          if (null == var2) {
            break L150;
          } else {
            of.field_G = fa.a((byte) -72, var2);
            break L150;
          }
        }
        L151: {
          int discarded$435 = 1;
          var2 = we.a("bonuslevelscomplete");
          if (var2 == null) {
            break L151;
          } else {
            jn.field_n = fa.a((byte) -87, var2);
            break L151;
          }
        }
        L152: {
          int discarded$436 = 1;
          var2 = we.a("achievementnames,0");
          if (null != var2) {
            jm.field_e[0] = fa.a((byte) -85, var2);
            break L152;
          } else {
            break L152;
          }
        }
        L153: {
          int discarded$437 = 1;
          var2 = we.a("achievementnames,1");
          if (var2 != null) {
            jm.field_e[1] = fa.a((byte) -122, var2);
            break L153;
          } else {
            break L153;
          }
        }
        L154: {
          int discarded$438 = 1;
          var2 = we.a("achievementnames,2");
          if (var2 == null) {
            break L154;
          } else {
            jm.field_e[2] = fa.a((byte) -89, var2);
            break L154;
          }
        }
        L155: {
          int discarded$439 = 1;
          var2 = we.a("achievementnames,3");
          if (var2 == null) {
            break L155;
          } else {
            jm.field_e[3] = fa.a((byte) -73, var2);
            break L155;
          }
        }
        L156: {
          int discarded$440 = 1;
          var2 = we.a("achievementnames,4");
          if (var2 != null) {
            jm.field_e[4] = fa.a((byte) -66, var2);
            break L156;
          } else {
            break L156;
          }
        }
        L157: {
          int discarded$441 = 1;
          var2 = we.a("achievementnames,5");
          if (null == var2) {
            break L157;
          } else {
            jm.field_e[5] = fa.a((byte) -75, var2);
            break L157;
          }
        }
        L158: {
          int discarded$442 = 1;
          var2 = we.a("achievementnames,6");
          if (var2 == null) {
            break L158;
          } else {
            jm.field_e[6] = fa.a((byte) -89, var2);
            break L158;
          }
        }
        L159: {
          int discarded$443 = 1;
          var2 = we.a("achievementnames,7");
          if (var2 != null) {
            jm.field_e[7] = fa.a((byte) -124, var2);
            break L159;
          } else {
            break L159;
          }
        }
        L160: {
          int discarded$444 = 1;
          var2 = we.a("achievementnames,8");
          if (null == var2) {
            break L160;
          } else {
            jm.field_e[8] = fa.a((byte) -99, var2);
            break L160;
          }
        }
        L161: {
          int discarded$445 = 1;
          var2 = we.a("achievementnames,9");
          if (null != var2) {
            jm.field_e[9] = fa.a((byte) -112, var2);
            break L161;
          } else {
            break L161;
          }
        }
        L162: {
          int discarded$446 = 1;
          var2 = we.a("achievementnames,10");
          if (var2 != null) {
            jm.field_e[10] = fa.a((byte) -121, var2);
            break L162;
          } else {
            break L162;
          }
        }
        L163: {
          int discarded$447 = 1;
          var2 = we.a("achievementnames,11");
          if (var2 == null) {
            break L163;
          } else {
            jm.field_e[11] = fa.a((byte) -106, var2);
            break L163;
          }
        }
        L164: {
          int discarded$448 = 1;
          var2 = we.a("achievementnames,12");
          if (null != var2) {
            jm.field_e[12] = fa.a((byte) -65, var2);
            break L164;
          } else {
            break L164;
          }
        }
        L165: {
          int discarded$449 = 1;
          var2 = we.a("achievementnames,13");
          if (var2 != null) {
            jm.field_e[13] = fa.a((byte) -125, var2);
            break L165;
          } else {
            break L165;
          }
        }
        L166: {
          int discarded$450 = 1;
          var2 = we.a("achievementnames,14");
          if (null != var2) {
            jm.field_e[14] = fa.a((byte) -71, var2);
            break L166;
          } else {
            break L166;
          }
        }
        L167: {
          int discarded$451 = 1;
          var2 = we.a("achievementnames,15");
          if (null == var2) {
            break L167;
          } else {
            jm.field_e[15] = fa.a((byte) -100, var2);
            break L167;
          }
        }
        L168: {
          int discarded$452 = 1;
          var2 = we.a("achievementnames,16");
          if (var2 == null) {
            break L168;
          } else {
            jm.field_e[16] = fa.a((byte) -64, var2);
            break L168;
          }
        }
        L169: {
          int discarded$453 = 1;
          var2 = we.a("achievementdescriptions,0");
          if (null != var2) {
            an.field_o[0] = fa.a((byte) -94, var2);
            break L169;
          } else {
            break L169;
          }
        }
        L170: {
          int discarded$454 = 1;
          var2 = we.a("achievementdescriptions,1");
          if (var2 == null) {
            break L170;
          } else {
            an.field_o[1] = fa.a((byte) -111, var2);
            break L170;
          }
        }
        L171: {
          int discarded$455 = 1;
          var2 = we.a("achievementdescriptions,2");
          if (null != var2) {
            an.field_o[2] = fa.a((byte) -96, var2);
            break L171;
          } else {
            break L171;
          }
        }
        L172: {
          int discarded$456 = 1;
          var2 = we.a("achievementdescriptions,3");
          if (var2 != null) {
            an.field_o[3] = fa.a((byte) -77, var2);
            break L172;
          } else {
            break L172;
          }
        }
        L173: {
          int discarded$457 = 1;
          var2 = we.a("achievementdescriptions,4");
          if (null == var2) {
            break L173;
          } else {
            an.field_o[4] = fa.a((byte) -102, var2);
            break L173;
          }
        }
        L174: {
          int discarded$458 = 1;
          var2 = we.a("achievementdescriptions,5");
          if (var2 == null) {
            break L174;
          } else {
            an.field_o[5] = fa.a((byte) -99, var2);
            break L174;
          }
        }
        L175: {
          int discarded$459 = 1;
          var2 = we.a("achievementdescriptions,6");
          if (var2 != null) {
            an.field_o[6] = fa.a((byte) -110, var2);
            break L175;
          } else {
            break L175;
          }
        }
        L176: {
          int discarded$460 = 1;
          var2 = we.a("achievementdescriptions,7");
          if (var2 == null) {
            break L176;
          } else {
            an.field_o[7] = fa.a((byte) -103, var2);
            break L176;
          }
        }
        L177: {
          int discarded$461 = 1;
          var2 = we.a("achievementdescriptions,8");
          if (var2 != null) {
            an.field_o[8] = fa.a((byte) -110, var2);
            break L177;
          } else {
            break L177;
          }
        }
        L178: {
          int discarded$462 = 1;
          var2 = we.a("achievementdescriptions,9");
          if (null != var2) {
            an.field_o[9] = fa.a((byte) -63, var2);
            break L178;
          } else {
            break L178;
          }
        }
        L179: {
          int discarded$463 = 1;
          var2 = we.a("achievementdescriptions,10");
          if (null != var2) {
            an.field_o[10] = fa.a((byte) -101, var2);
            break L179;
          } else {
            break L179;
          }
        }
        L180: {
          int discarded$464 = 1;
          var2 = we.a("achievementdescriptions,11");
          if (var2 == null) {
            break L180;
          } else {
            an.field_o[11] = fa.a((byte) -95, var2);
            break L180;
          }
        }
        L181: {
          int discarded$465 = 1;
          var2 = we.a("achievementdescriptions,12");
          if (var2 != null) {
            an.field_o[12] = fa.a((byte) -117, var2);
            break L181;
          } else {
            break L181;
          }
        }
        L182: {
          int discarded$466 = 1;
          var2 = we.a("achievementdescriptions,13");
          if (var2 != null) {
            an.field_o[13] = fa.a((byte) -63, var2);
            break L182;
          } else {
            break L182;
          }
        }
        L183: {
          int discarded$467 = 1;
          var2 = we.a("achievementdescriptions,14");
          if (var2 == null) {
            break L183;
          } else {
            an.field_o[14] = fa.a((byte) -103, var2);
            break L183;
          }
        }
        L184: {
          int discarded$468 = 1;
          var2 = we.a("achievementdescriptions,15");
          if (null == var2) {
            break L184;
          } else {
            an.field_o[15] = fa.a((byte) -63, var2);
            break L184;
          }
        }
        L185: {
          int discarded$469 = 1;
          var2 = we.a("achievementdescriptions,16");
          if (var2 == null) {
            break L185;
          } else {
            an.field_o[16] = fa.a((byte) -64, var2);
            break L185;
          }
        }
        L186: {
          int discarded$470 = 1;
          var2 = we.a("clickonatile");
          if (null == var2) {
            break L186;
          } else {
            fa.field_i = fa.a((byte) -72, var2);
            break L186;
          }
        }
        L187: {
          int discarded$471 = 1;
          var2 = we.a("pressmformap");
          if (var2 != null) {
            f.field_e = fa.a((byte) -121, var2);
            break L187;
          } else {
            break L187;
          }
        }
        L188: {
          int discarded$472 = 1;
          var2 = we.a("bomb_name");
          if (null != var2) {
            kd.field_i = fa.a((byte) -109, var2);
            break L188;
          } else {
            break L188;
          }
        }
        L189: {
          int discarded$473 = 1;
          var2 = we.a("bomb_information");
          if (var2 == null) {
            break L189;
          } else {
            bd.field_l = fa.a((byte) -94, var2);
            break L189;
          }
        }
        L190: {
          int discarded$474 = 1;
          var2 = we.a("crystal_name");
          if (var2 != null) {
            cj.field_y = fa.a((byte) -74, var2);
            break L190;
          } else {
            break L190;
          }
        }
        L191: {
          int discarded$475 = 1;
          var2 = we.a("crystal_information");
          if (var2 == null) {
            break L191;
          } else {
            fa.field_k = fa.a((byte) -85, var2);
            break L191;
          }
        }
        L192: {
          int discarded$476 = 1;
          var2 = we.a("earth_name");
          if (null != var2) {
            dq.field_H = fa.a((byte) -91, var2);
            break L192;
          } else {
            break L192;
          }
        }
        L193: {
          int discarded$477 = 1;
          var2 = we.a("earth_information");
          if (null != var2) {
            wi.field_b = fa.a((byte) -115, var2);
            break L193;
          } else {
            break L193;
          }
        }
        L194: {
          int discarded$478 = 1;
          var2 = we.a("hole_name");
          if (null != var2) {
            mg.field_h = fa.a((byte) -71, var2);
            break L194;
          } else {
            break L194;
          }
        }
        L195: {
          int discarded$479 = 1;
          var2 = we.a("hole_information_unfilled");
          if (null == var2) {
            break L195;
          } else {
            hl.field_e = fa.a((byte) -80, var2);
            break L195;
          }
        }
        L196: {
          int discarded$480 = 1;
          var2 = we.a("hole_information_filled");
          if (null == var2) {
            break L196;
          } else {
            wa.field_j = fa.a((byte) -97, var2);
            break L196;
          }
        }
        L197: {
          int discarded$481 = 1;
          var2 = we.a("key_name");
          if (null != var2) {
            e.field_a = fa.a((byte) -127, var2);
            break L197;
          } else {
            break L197;
          }
        }
        L198: {
          int discarded$482 = 1;
          var2 = we.a("key_information");
          if (var2 != null) {
            qd.field_p = fa.a((byte) -90, var2);
            break L198;
          } else {
            break L198;
          }
        }
        L199: {
          int discarded$483 = 1;
          var2 = we.a("laserhub_name");
          if (var2 != null) {
            eb.field_m = fa.a((byte) -95, var2);
            break L199;
          } else {
            break L199;
          }
        }
        L200: {
          int discarded$484 = 1;
          var2 = we.a("laserhub_information");
          if (var2 != null) {
            kd.field_m = fa.a((byte) -87, var2);
            break L200;
          } else {
            break L200;
          }
        }
        L201: {
          int discarded$485 = 1;
          var2 = we.a("laserbeam_name");
          if (null == var2) {
            break L201;
          } else {
            ah.field_f = fa.a((byte) -121, var2);
            break L201;
          }
        }
        L202: {
          int discarded$486 = 1;
          var2 = we.a("laserbeam_information");
          if (null != var2) {
            gg.field_e = fa.a((byte) -83, var2);
            break L202;
          } else {
            break L202;
          }
        }
        L203: {
          int discarded$487 = 1;
          var2 = we.a("log_name");
          if (null == var2) {
            break L203;
          } else {
            dq.field_F = fa.a((byte) -116, var2);
            break L203;
          }
        }
        L204: {
          int discarded$488 = 1;
          var2 = we.a("log_information");
          if (var2 != null) {
            nk.field_m = fa.a((byte) -90, var2);
            break L204;
          } else {
            break L204;
          }
        }
        L205: {
          int discarded$489 = 1;
          var2 = we.a("mirror_name");
          if (var2 == null) {
            break L205;
          } else {
            sn.field_b = fa.a((byte) -67, var2);
            break L205;
          }
        }
        L206: {
          int discarded$490 = 1;
          var2 = we.a("mirror_information");
          if (null != var2) {
            qk.field_z = fa.a((byte) -93, var2);
            break L206;
          } else {
            break L206;
          }
        }
        L207: {
          int discarded$491 = 1;
          var2 = we.a("bouncyball_name");
          if (var2 != null) {
            rb.field_e = fa.a((byte) -127, var2);
            break L207;
          } else {
            break L207;
          }
        }
        L208: {
          int discarded$492 = 1;
          var2 = we.a("bouncyball_information");
          if (var2 != null) {
            fl.field_f = fa.a((byte) -76, var2);
            break L208;
          } else {
            break L208;
          }
        }
        L209: {
          int discarded$493 = 1;
          var2 = we.a("player_name_single");
          if (null == var2) {
            break L209;
          } else {
            g.field_c = fa.a((byte) -108, var2);
            break L209;
          }
        }
        L210: {
          int discarded$494 = 1;
          var2 = we.a("player_name_multi,0");
          if (var2 == null) {
            break L210;
          } else {
            q.field_c[0] = fa.a((byte) -120, var2);
            break L210;
          }
        }
        L211: {
          int discarded$495 = 1;
          var2 = we.a("player_name_multi,1");
          if (var2 == null) {
            break L211;
          } else {
            q.field_c[1] = fa.a((byte) -95, var2);
            break L211;
          }
        }
        L212: {
          int discarded$496 = 1;
          var2 = we.a("player_name_multi,2");
          if (null == var2) {
            break L212;
          } else {
            q.field_c[2] = fa.a((byte) -112, var2);
            break L212;
          }
        }
        L213: {
          int discarded$497 = 1;
          var2 = we.a("player_whomessage_single");
          if (var2 == null) {
            break L213;
          } else {
            p.field_h = fa.a((byte) -79, var2);
            break L213;
          }
        }
        L214: {
          int discarded$498 = 1;
          var2 = we.a("player_whomessage_multi");
          if (null != var2) {
            fh.field_j = fa.a((byte) -79, var2);
            break L214;
          } else {
            break L214;
          }
        }
        L215: {
          int discarded$499 = 1;
          var2 = we.a("player_whomessage_helper");
          if (null != var2) {
            pl.field_s = fa.a((byte) -91, var2);
            break L215;
          } else {
            break L215;
          }
        }
        L216: {
          int discarded$500 = 1;
          var2 = we.a("player_movemessage_normal");
          if (var2 != null) {
            qa.field_h = fa.a((byte) -85, var2);
            break L216;
          } else {
            break L216;
          }
        }
        L217: {
          int discarded$501 = 1;
          var2 = we.a("player_movemessage_tutorial");
          if (null != var2) {
            ol.field_E = fa.a((byte) -96, var2);
            break L217;
          } else {
            break L217;
          }
        }
        L218: {
          int discarded$502 = 1;
          var2 = we.a("player_movemessage_helper");
          if (var2 == null) {
            break L218;
          } else {
            en.field_F = fa.a((byte) -84, var2);
            break L218;
          }
        }
        L219: {
          int discarded$503 = 1;
          var2 = we.a("rock_name");
          if (null == var2) {
            break L219;
          } else {
            ii.field_e = fa.a((byte) -104, var2);
            break L219;
          }
        }
        L220: {
          int discarded$504 = 1;
          var2 = we.a("rock_information");
          if (null == var2) {
            break L220;
          } else {
            rl.field_g = fa.a((byte) -120, var2);
            break L220;
          }
        }
        L221: {
          int discarded$505 = 1;
          var2 = we.a("safe_name");
          if (null == var2) {
            break L221;
          } else {
            qh.field_g = fa.a((byte) -98, var2);
            break L221;
          }
        }
        L222: {
          int discarded$506 = 1;
          var2 = we.a("safe_information");
          if (null != var2) {
            rb.field_j = fa.a((byte) -107, var2);
            break L222;
          } else {
            break L222;
          }
        }
        L223: {
          int discarded$507 = 1;
          var2 = we.a("spider_name");
          if (null == var2) {
            break L223;
          } else {
            ec.field_n = fa.a((byte) -110, var2);
            break L223;
          }
        }
        L224: {
          int discarded$508 = 1;
          var2 = we.a("spider_information");
          if (var2 == null) {
            break L224;
          } else {
            ch.field_c = fa.a((byte) -114, var2);
            break L224;
          }
        }
        L225: {
          int discarded$509 = 1;
          var2 = we.a("spiderweb_name");
          if (null == var2) {
            break L225;
          } else {
            tn.field_m = fa.a((byte) -127, var2);
            break L225;
          }
        }
        L226: {
          int discarded$510 = 1;
          var2 = we.a("spiderweb_information");
          if (null != var2) {
            ae.field_C = fa.a((byte) -65, var2);
            break L226;
          } else {
            break L226;
          }
        }
        L227: {
          int discarded$511 = 1;
          var2 = we.a("stickyball_name");
          if (null == var2) {
            break L227;
          } else {
            wd.field_h = fa.a((byte) -74, var2);
            break L227;
          }
        }
        L228: {
          int discarded$512 = 1;
          var2 = we.a("stickyball_information");
          if (var2 != null) {
            wg.field_N = fa.a((byte) -91, var2);
            break L228;
          } else {
            break L228;
          }
        }
        L229: {
          int discarded$513 = 1;
          var2 = we.a("teleport_name");
          if (var2 != null) {
            f.field_f = fa.a((byte) -98, var2);
            break L229;
          } else {
            break L229;
          }
        }
        L230: {
          int discarded$514 = 1;
          var2 = we.a("teleport_information");
          if (null == var2) {
            break L230;
          } else {
            jh.field_d = fa.a((byte) -128, var2);
            break L230;
          }
        }
        L231: {
          int discarded$515 = 1;
          var2 = we.a("gametileinfo_showall");
          if (null != var2) {
            uh.field_o = fa.a((byte) -112, var2);
            break L231;
          } else {
            break L231;
          }
        }
        L232: {
          int discarded$516 = 1;
          var2 = we.a("gametileinfo_done");
          if (null != var2) {
            se.field_g = fa.a((byte) -89, var2);
            break L232;
          } else {
            break L232;
          }
        }
        L233: {
          int discarded$517 = 1;
          var2 = we.a("bonus_stillalive");
          if (var2 == null) {
            break L233;
          } else {
            fb.field_d = fa.a((byte) -104, var2);
            break L233;
          }
        }
        L234: {
          int discarded$518 = 1;
          var2 = we.a("bonus_mostcrystals");
          if (var2 != null) {
            me.field_a = fa.a((byte) -71, var2);
            break L234;
          } else {
            break L234;
          }
        }
        L235: {
          int discarded$519 = 1;
          var2 = we.a("bonus_lastcrystal");
          if (null != var2) {
            re.field_p = fa.a((byte) -66, var2);
            break L235;
          } else {
            break L235;
          }
        }
        L236: {
          int discarded$520 = 1;
          var2 = we.a("bonus_allbombs");
          if (null != var2) {
            og.field_y = fa.a((byte) -99, var2);
            break L236;
          } else {
            break L236;
          }
        }
        L237: {
          int discarded$521 = 1;
          var2 = we.a("bonus_lastbomb");
          if (var2 == null) {
            break L237;
          } else {
            ra.field_a = fa.a((byte) -66, var2);
            break L237;
          }
        }
        L238: {
          int discarded$522 = 1;
          var2 = we.a("bonus_allballs");
          if (null != var2) {
            og.field_u = fa.a((byte) -92, var2);
            break L238;
          } else {
            break L238;
          }
        }
        L239: {
          int discarded$523 = 1;
          var2 = we.a("bonus_lastball");
          if (var2 != null) {
            je.field_h = fa.a((byte) -85, var2);
            break L239;
          } else {
            break L239;
          }
        }
        L240: {
          int discarded$524 = 1;
          var2 = we.a("bonus_allspiders");
          if (var2 != null) {
            mn.field_m = fa.a((byte) -111, var2);
            break L240;
          } else {
            break L240;
          }
        }
        L241: {
          int discarded$525 = 1;
          var2 = we.a("bonus_lastspider");
          if (null == var2) {
            break L241;
          } else {
            tf.field_b = fa.a((byte) -124, var2);
            break L241;
          }
        }
        L242: {
          int discarded$526 = 1;
          var2 = we.a("bonus_rightfirsttime");
          if (null == var2) {
            break L242;
          } else {
            jn.field_l = fa.a((byte) -66, var2);
            break L242;
          }
        }
        L243: {
          int discarded$527 = 1;
          var2 = we.a("penalty_killedafriend");
          if (var2 != null) {
            kp.field_l = fa.a((byte) -119, var2);
            break L243;
          } else {
            break L243;
          }
        }
        L244: {
          int discarded$528 = 1;
          var2 = we.a("tutorial_1_3");
          if (var2 != null) {
            ao.field_d = fa.a((byte) -121, var2);
            break L244;
          } else {
            break L244;
          }
        }
        L245: {
          int discarded$529 = 1;
          var2 = we.a("tutorial_1_6");
          if (var2 != null) {
            m.field_m = fa.a((byte) -73, var2);
            break L245;
          } else {
            break L245;
          }
        }
        L246: {
          int discarded$530 = 1;
          var2 = we.a("tutorial_1_9");
          if (null != var2) {
            tb.field_f = fa.a((byte) -71, var2);
            break L246;
          } else {
            break L246;
          }
        }
        L247: {
          int discarded$531 = 1;
          var2 = we.a("tutorial_1_14");
          if (null == var2) {
            break L247;
          } else {
            cm.field_c = fa.a((byte) -65, var2);
            break L247;
          }
        }
        L248: {
          int discarded$532 = 1;
          var2 = we.a("tutorial_2_1");
          if (var2 == null) {
            break L248;
          } else {
            ma.field_o = fa.a((byte) -121, var2);
            break L248;
          }
        }
        L249: {
          int discarded$533 = 1;
          var2 = we.a("tutorial_2_9");
          if (var2 != null) {
            dn.field_b = fa.a((byte) -128, var2);
            break L249;
          } else {
            break L249;
          }
        }
        L250: {
          int discarded$534 = 1;
          var2 = we.a("tutorial_2_12");
          if (null == var2) {
            break L250;
          } else {
            wf.field_f = fa.a((byte) -103, var2);
            break L250;
          }
        }
        L251: {
          int discarded$535 = 1;
          var2 = we.a("tutorial_2_14");
          if (null != var2) {
            fn.field_g = fa.a((byte) -108, var2);
            break L251;
          } else {
            break L251;
          }
        }
        L252: {
          int discarded$536 = 1;
          var2 = we.a("tutorial_3_1");
          if (null != var2) {
            vp.field_g = fa.a((byte) -119, var2);
            break L252;
          } else {
            break L252;
          }
        }
        L253: {
          int discarded$537 = 1;
          var2 = we.a("tutorial_3_5");
          if (var2 != null) {
            rb.field_i = fa.a((byte) -64, var2);
            break L253;
          } else {
            break L253;
          }
        }
        L254: {
          int discarded$538 = 1;
          var2 = we.a("tutorial_3_12");
          if (var2 != null) {
            ke.field_c = fa.a((byte) -119, var2);
            break L254;
          } else {
            break L254;
          }
        }
        L255: {
          int discarded$539 = 1;
          var2 = we.a("tutorial_3_19");
          if (var2 != null) {
            fp.field_f = fa.a((byte) -72, var2);
            break L255;
          } else {
            break L255;
          }
        }
        L256: {
          int discarded$540 = 1;
          var2 = we.a("tutorial_3_24");
          if (var2 == null) {
            break L256;
          } else {
            cb.field_q = fa.a((byte) -104, var2);
            break L256;
          }
        }
        L257: {
          int discarded$541 = 1;
          var2 = we.a("tutorial_3_30");
          if (null != var2) {
            oj.field_C = fa.a((byte) -99, var2);
            break L257;
          } else {
            break L257;
          }
        }
        L258: {
          int discarded$542 = 1;
          var2 = we.a("tutorial_4_5");
          if (var2 == null) {
            break L258;
          } else {
            lp.field_c = fa.a((byte) -112, var2);
            break L258;
          }
        }
        L259: {
          int discarded$543 = 1;
          var2 = we.a("tutorial_4_10");
          if (null != var2) {
            cl.field_i = fa.a((byte) -93, var2);
            break L259;
          } else {
            break L259;
          }
        }
        L260: {
          int discarded$544 = 1;
          var2 = we.a("tutorial_4_13");
          if (var2 != null) {
            jp.field_b = fa.a((byte) -93, var2);
            break L260;
          } else {
            break L260;
          }
        }
        L261: {
          int discarded$545 = 1;
          var2 = we.a("tutorial_4_19");
          if (var2 != null) {
            hm.field_a = fa.a((byte) -128, var2);
            break L261;
          } else {
            break L261;
          }
        }
        L262: {
          int discarded$546 = 1;
          var2 = we.a("tutorial_5_3");
          if (null == var2) {
            break L262;
          } else {
            g.field_a = fa.a((byte) -67, var2);
            break L262;
          }
        }
        L263: {
          int discarded$547 = 1;
          var2 = we.a("tutorial_5_6");
          if (var2 == null) {
            break L263;
          } else {
            hc.field_c = fa.a((byte) -97, var2);
            break L263;
          }
        }
        L264: {
          int discarded$548 = 1;
          var2 = we.a("tutorial_5_9");
          if (null == var2) {
            break L264;
          } else {
            oj.field_M = fa.a((byte) -118, var2);
            break L264;
          }
        }
        L265: {
          int discarded$549 = 1;
          var2 = we.a("tutorial_5_13");
          if (var2 == null) {
            break L265;
          } else {
            am.field_f = fa.a((byte) -87, var2);
            break L265;
          }
        }
        L266: {
          int discarded$550 = 1;
          var2 = we.a("tutorial_5_25");
          if (var2 == null) {
            break L266;
          } else {
            tn.field_o = fa.a((byte) -101, var2);
            break L266;
          }
        }
        L267: {
          int discarded$551 = 1;
          var2 = we.a("tutorial_5_28");
          if (var2 == null) {
            break L267;
          } else {
            wa.field_f = fa.a((byte) -98, var2);
            break L267;
          }
        }
        L268: {
          int discarded$552 = 1;
          var2 = we.a("developerquote");
          if (null != var2) {
            pp.field_i = fa.a((byte) -106, var2);
            break L268;
          } else {
            break L268;
          }
        }
        L269: {
          int discarded$553 = 1;
          var2 = we.a("mb_screenshot_captions,0");
          if (var2 != null) {
            io.field_I[0] = fa.a((byte) -68, var2);
            break L269;
          } else {
            break L269;
          }
        }
        L270: {
          int discarded$554 = 1;
          var2 = we.a("mb_screenshot_captions,1");
          if (null == var2) {
            break L270;
          } else {
            io.field_I[1] = fa.a((byte) -114, var2);
            break L270;
          }
        }
        L271: {
          int discarded$555 = 1;
          var2 = we.a("mb_screenshot_captions,2");
          if (null == var2) {
            break L271;
          } else {
            io.field_I[2] = fa.a((byte) -77, var2);
            break L271;
          }
        }
        L272: {
          int discarded$556 = 1;
          var2 = we.a("mb_screenshot_captions,3");
          if (null != var2) {
            io.field_I[3] = fa.a((byte) -82, var2);
            break L272;
          } else {
            break L272;
          }
        }
        L273: {
          int discarded$557 = 1;
          var2 = we.a("mb_screenshot_captions,4");
          if (var2 != null) {
            io.field_I[4] = fa.a((byte) -92, var2);
            break L273;
          } else {
            break L273;
          }
        }
        L274: {
          int discarded$558 = 1;
          var2 = we.a("mb_screenshot_captions,5");
          if (null != var2) {
            io.field_I[5] = fa.a((byte) -106, var2);
            break L274;
          } else {
            break L274;
          }
        }
        L275: {
          int discarded$559 = 1;
          var2 = we.a("mb_screenshot_captions,6");
          if (null != var2) {
            io.field_I[6] = fa.a((byte) -120, var2);
            break L275;
          } else {
            break L275;
          }
        }
        L276: {
          int discarded$560 = 1;
          var2 = we.a("mb_screenshot_captions,7");
          if (null == var2) {
            break L276;
          } else {
            io.field_I[7] = fa.a((byte) -68, var2);
            break L276;
          }
        }
        L277: {
          int discarded$561 = 1;
          var2 = we.a("mb_screenshot_captions,8");
          if (null != var2) {
            io.field_I[8] = fa.a((byte) -68, var2);
            break L277;
          } else {
            break L277;
          }
        }
        L278: {
          int discarded$562 = 1;
          var2 = we.a("mb_screenshot_captions,9");
          if (null == var2) {
            break L278;
          } else {
            io.field_I[9] = fa.a((byte) -122, var2);
            break L278;
          }
        }
        L279: {
          int discarded$563 = 1;
          var2 = we.a("mb_screenshot_captions,10");
          if (null == var2) {
            break L279;
          } else {
            io.field_I[10] = fa.a((byte) -65, var2);
            break L279;
          }
        }
        L280: {
          int discarded$564 = 1;
          var2 = we.a("mb_screenshot_captions,11");
          if (null == var2) {
            break L280;
          } else {
            io.field_I[11] = fa.a((byte) -71, var2);
            break L280;
          }
        }
        L281: {
          int discarded$565 = 1;
          var2 = we.a("mb_screenshot_captions,12");
          if (var2 == null) {
            break L281;
          } else {
            io.field_I[12] = fa.a((byte) -69, var2);
            break L281;
          }
        }
        L282: {
          int discarded$566 = 1;
          var2 = we.a("mb_screenshot_captions,13");
          if (null == var2) {
            break L282;
          } else {
            io.field_I[13] = fa.a((byte) -68, var2);
            break L282;
          }
        }
        L283: {
          int discarded$567 = 1;
          var2 = we.a("mb_screenshot_captions,14");
          if (null == var2) {
            break L283;
          } else {
            io.field_I[14] = fa.a((byte) -111, var2);
            break L283;
          }
        }
        L284: {
          int discarded$568 = 1;
          var2 = we.a("mb_screenshot_captions,15");
          if (null == var2) {
            break L284;
          } else {
            io.field_I[15] = fa.a((byte) -102, var2);
            break L284;
          }
        }
        L285: {
          int discarded$569 = 1;
          var2 = we.a("mb_screenshot_captions,18");
          if (null != var2) {
            io.field_I[18] = fa.a((byte) -108, var2);
            break L285;
          } else {
            break L285;
          }
        }
        ge.field_b = null;
        L286: {
          if (wa.field_e == 0) {
            break L286;
          } else {
            var3++;
            CrazyCrystals.field_B = var3;
            break L286;
          }
        }
    }

    abstract java.net.Socket a(boolean param0) throws IOException;

    final java.net.Socket a(int param0) throws IOException {
        int var2_int = 0;
        RuntimeException var2 = null;
        java.net.Socket stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_0_0 = null;
        try {
          L0: {
            var2_int = -43 % ((param0 - -56) / 53);
            stackOut_0_0 = new java.net.Socket(((tl) this).field_c, ((tl) this).field_d);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "tl.B(" + param0 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new u();
    }
}
