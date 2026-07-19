/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class tl {
    String field_c;
    int field_d;
    static dl field_b;
    static u field_e;
    static am field_a;

    public static void b(int param0) {
        try {
            field_e = null;
            field_a = null;
            field_b = null;
            int var1_int = -108 % ((59 - param0) / 53);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "tl.D(" + param0 + ')');
        }
    }

    final static void a(int param0, db param1) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var3 = 0;
        RuntimeException stackIn_1005_0 = null;
        StringBuilder stackIn_1005_1 = null;
        RuntimeException stackIn_1007_0 = null;
        StringBuilder stackIn_1007_1 = null;
        RuntimeException stackIn_1008_0 = null;
        StringBuilder stackIn_1008_1 = null;
        String stackIn_1008_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_1004_0 = null;
        StringBuilder stackOut_1004_1 = null;
        RuntimeException stackOut_1007_0 = null;
        StringBuilder stackOut_1007_1 = null;
        String stackOut_1007_2 = null;
        RuntimeException stackOut_1005_0 = null;
        StringBuilder stackOut_1005_1 = null;
        String stackOut_1005_2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              ge.field_b = param1;
              var2_array = we.a("gamename", 1);
              if (null != var2_array) {
                ei.field_G = fa.a((byte) -100, var2_array);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2_array = we.a("crystalplacement", 1);
              if (var2_array == null) {
                break L2;
              } else {
                o.field_h = fa.a((byte) -72, var2_array);
                break L2;
              }
            }
            L3: {
              var2_array = we.a("keycode_map", 1);
              if (var2_array != null) {
                vf.field_c = var2_array[0] & 255;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2_array = we.a("keycode_p1left", 1);
              if (var2_array == null) {
                break L4;
              } else {
                jm.field_g = 255 & var2_array[0];
                break L4;
              }
            }
            L5: {
              var2_array = we.a("keycode_p1right", 1);
              if (var2_array != null) {
                vp.field_b = 255 & var2_array[0];
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var2_array = we.a("keycode_p1up", 1);
              if (null != var2_array) {
                kp.field_j = 255 & var2_array[0];
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var2_array = we.a("keycode_p1down", 1);
              if (var2_array == null) {
                break L7;
              } else {
                tg.field_b = 255 & var2_array[0];
                break L7;
              }
            }
            L8: {
              var2_array = we.a("keycode_p2left", 1);
              if (null == var2_array) {
                break L8;
              } else {
                rk.field_d = var2_array[0] & 255;
                break L8;
              }
            }
            L9: {
              var2_array = we.a("keycode_p2right", 1);
              if (var2_array != null) {
                pa.field_E = 255 & var2_array[0];
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var2_array = we.a("keycode_p2up", 1);
              if (var2_array == null) {
                break L10;
              } else {
                oo.field_i = var2_array[0] & 255;
                break L10;
              }
            }
            L11: {
              var2_array = we.a("keycode_p2down", 1);
              if (null == var2_array) {
                break L11;
              } else {
                ji.field_t = var2_array[0] & 255;
                break L11;
              }
            }
            L12: {
              var2_array = we.a("esc", 1);
              if (var2_array != null) {
                ji.field_u = fa.a((byte) -112, var2_array);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              var2_array = we.a("enter", 1);
              if (null == var2_array) {
                break L13;
              } else {
                sh.field_l = fa.a((byte) -112, var2_array);
                break L13;
              }
            }
            L14: {
              var2_array = we.a("backspace", 1);
              if (null == var2_array) {
                break L14;
              } else {
                gl.field_f = fa.a((byte) -74, var2_array);
                break L14;
              }
            }
            L15: {
              var2_array = we.a("tilevariations", 1);
              if (var2_array == null) {
                break L15;
              } else {
                q.field_d = fa.a((byte) -69, var2_array);
                break L15;
              }
            }
            L16: {
              var2_array = we.a("tutorial_levelnames,0", 1);
              if (var2_array != null) {
                qp.field_g[0] = fa.a((byte) -127, var2_array);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              var2_array = we.a("tutorial_levelnames,1", 1);
              if (null == var2_array) {
                break L17;
              } else {
                qp.field_g[1] = fa.a((byte) -105, var2_array);
                break L17;
              }
            }
            L18: {
              var2_array = we.a("tutorial_levelnames,2", 1);
              if (var2_array != null) {
                qp.field_g[2] = fa.a((byte) -94, var2_array);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              var2_array = we.a("tutorial_levelnames,3", 1);
              if (var2_array == null) {
                break L19;
              } else {
                qp.field_g[3] = fa.a((byte) -123, var2_array);
                break L19;
              }
            }
            L20: {
              var2_array = we.a("tutorial_levelnames,4", 1);
              if (null == var2_array) {
                break L20;
              } else {
                qp.field_g[4] = fa.a((byte) -87, var2_array);
                break L20;
              }
            }
            L21: {
              var2_array = we.a("puzzle1p_levelnames,0", 1);
              if (var2_array == null) {
                break L21;
              } else {
                ro.field_r[0] = fa.a((byte) -126, var2_array);
                break L21;
              }
            }
            L22: {
              var2_array = we.a("puzzle1p_levelnames,1", 1);
              if (null != var2_array) {
                ro.field_r[1] = fa.a((byte) -85, var2_array);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              var2_array = we.a("puzzle1p_levelnames,2", 1);
              if (null != var2_array) {
                ro.field_r[2] = fa.a((byte) -105, var2_array);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              var2_array = we.a("puzzle1p_levelnames,3", 1);
              if (null != var2_array) {
                ro.field_r[3] = fa.a((byte) -72, var2_array);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              var2_array = we.a("puzzle1p_levelnames,4", 1);
              if (null == var2_array) {
                break L25;
              } else {
                ro.field_r[4] = fa.a((byte) -71, var2_array);
                break L25;
              }
            }
            L26: {
              var2_array = we.a("puzzle1p_levelnames,5", 1);
              if (var2_array != null) {
                ro.field_r[5] = fa.a((byte) -116, var2_array);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2_array = we.a("puzzle1p_levelnames,6", 1);
              if (null != var2_array) {
                ro.field_r[6] = fa.a((byte) -93, var2_array);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var2_array = we.a("puzzle1p_levelnames,7", 1);
              if (null == var2_array) {
                break L28;
              } else {
                ro.field_r[7] = fa.a((byte) -100, var2_array);
                break L28;
              }
            }
            L29: {
              var2_array = we.a("puzzle1p_levelnames,8", 1);
              if (null == var2_array) {
                break L29;
              } else {
                ro.field_r[8] = fa.a((byte) -117, var2_array);
                break L29;
              }
            }
            L30: {
              var2_array = we.a("puzzle1p_levelnames,9", 1);
              if (var2_array == null) {
                break L30;
              } else {
                ro.field_r[9] = fa.a((byte) -86, var2_array);
                break L30;
              }
            }
            L31: {
              var2_array = we.a("puzzle1p_levelnames,10", 1);
              if (var2_array != null) {
                ro.field_r[10] = fa.a((byte) -117, var2_array);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2_array = we.a("puzzle1p_levelnames,11", 1);
              if (null != var2_array) {
                ro.field_r[11] = fa.a((byte) -96, var2_array);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              var2_array = we.a("puzzle1p_levelnames,12", 1);
              if (var2_array == null) {
                break L33;
              } else {
                ro.field_r[12] = fa.a((byte) -109, var2_array);
                break L33;
              }
            }
            L34: {
              var2_array = we.a("puzzle1p_levelnames,13", 1);
              if (var2_array != null) {
                ro.field_r[13] = fa.a((byte) -98, var2_array);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2_array = we.a("puzzle1p_levelnames,14", 1);
              if (null == var2_array) {
                break L35;
              } else {
                ro.field_r[14] = fa.a((byte) -79, var2_array);
                break L35;
              }
            }
            L36: {
              var2_array = we.a("puzzle1p_levelnames,15", 1);
              if (var2_array == null) {
                break L36;
              } else {
                ro.field_r[15] = fa.a((byte) -67, var2_array);
                break L36;
              }
            }
            L37: {
              var2_array = we.a("puzzle1p_levelnames,16", 1);
              if (var2_array != null) {
                ro.field_r[16] = fa.a((byte) -93, var2_array);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2_array = we.a("puzzle1p_levelnames,17", 1);
              if (null == var2_array) {
                break L38;
              } else {
                ro.field_r[17] = fa.a((byte) -105, var2_array);
                break L38;
              }
            }
            L39: {
              var2_array = we.a("puzzle1p_levelnames,18", 1);
              if (var2_array != null) {
                ro.field_r[18] = fa.a((byte) -97, var2_array);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2_array = we.a("puzzle1p_levelnames,19", 1);
              if (null == var2_array) {
                break L40;
              } else {
                ro.field_r[19] = fa.a((byte) -93, var2_array);
                break L40;
              }
            }
            L41: {
              var2_array = we.a("puzzle1p_levelnames,20", 1);
              if (var2_array == null) {
                break L41;
              } else {
                ro.field_r[20] = fa.a((byte) -118, var2_array);
                break L41;
              }
            }
            L42: {
              var2_array = we.a("puzzle1p_levelnames,21", 1);
              if (null != var2_array) {
                ro.field_r[21] = fa.a((byte) -118, var2_array);
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              var2_array = we.a("puzzle1p_levelnames,22", 1);
              if (var2_array == null) {
                break L43;
              } else {
                ro.field_r[22] = fa.a((byte) -102, var2_array);
                break L43;
              }
            }
            L44: {
              var2_array = we.a("puzzle1p_levelnames,23", 1);
              if (var2_array != null) {
                ro.field_r[23] = fa.a((byte) -85, var2_array);
                break L44;
              } else {
                break L44;
              }
            }
            L45: {
              var2_array = we.a("puzzle1p_levelnames,24", 1);
              if (var2_array != null) {
                ro.field_r[24] = fa.a((byte) -77, var2_array);
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              var2_array = we.a("puzzle1p_levelnames,25", 1);
              if (null != var2_array) {
                ro.field_r[25] = fa.a((byte) -64, var2_array);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2_array = we.a("puzzle1p_levelnames,26", 1);
              if (var2_array == null) {
                break L47;
              } else {
                ro.field_r[26] = fa.a((byte) -118, var2_array);
                break L47;
              }
            }
            L48: {
              var2_array = we.a("puzzle1p_levelnames,27", 1);
              if (var2_array != null) {
                ro.field_r[27] = fa.a((byte) -118, var2_array);
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              var2_array = we.a("puzzle1p_levelnames,28", 1);
              if (var2_array == null) {
                break L49;
              } else {
                ro.field_r[28] = fa.a((byte) -99, var2_array);
                break L49;
              }
            }
            L50: {
              var2_array = we.a("puzzle1p_levelnames,29", 1);
              if (var2_array == null) {
                break L50;
              } else {
                ro.field_r[29] = fa.a((byte) -109, var2_array);
                break L50;
              }
            }
            L51: {
              var2_array = we.a("puzzle1p_levelnames,30", 1);
              if (var2_array == null) {
                break L51;
              } else {
                ro.field_r[30] = fa.a((byte) -89, var2_array);
                break L51;
              }
            }
            L52: {
              var2_array = we.a("puzzle1p_levelnames,31", 1);
              if (null == var2_array) {
                break L52;
              } else {
                ro.field_r[31] = fa.a((byte) -120, var2_array);
                break L52;
              }
            }
            L53: {
              var2_array = we.a("puzzle1p_levelnames,32", 1);
              if (var2_array != null) {
                ro.field_r[32] = fa.a((byte) -81, var2_array);
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              var2_array = we.a("puzzle1p_levelnames,33", 1);
              if (var2_array == null) {
                break L54;
              } else {
                ro.field_r[33] = fa.a((byte) -124, var2_array);
                break L54;
              }
            }
            L55: {
              var2_array = we.a("puzzle1p_levelnames,34", 1);
              if (null != var2_array) {
                ro.field_r[34] = fa.a((byte) -105, var2_array);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2_array = we.a("puzzle1p_levelnames,35", 1);
              if (var2_array == null) {
                break L56;
              } else {
                ro.field_r[35] = fa.a((byte) -75, var2_array);
                break L56;
              }
            }
            L57: {
              var2_array = we.a("puzzle1p_levelnames,36", 1);
              if (var2_array == null) {
                break L57;
              } else {
                ro.field_r[36] = fa.a((byte) -84, var2_array);
                break L57;
              }
            }
            L58: {
              var2_array = we.a("puzzle1p_levelnames,37", 1);
              if (var2_array == null) {
                break L58;
              } else {
                ro.field_r[37] = fa.a((byte) -79, var2_array);
                break L58;
              }
            }
            L59: {
              var2_array = we.a("puzzle1p_levelnames,38", 1);
              if (var2_array != null) {
                ro.field_r[38] = fa.a((byte) -87, var2_array);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2_array = we.a("puzzle1p_levelnames,39", 1);
              if (null != var2_array) {
                ro.field_r[39] = fa.a((byte) -77, var2_array);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2_array = we.a("puzzle1p_levelnames,40", 1);
              if (null == var2_array) {
                break L61;
              } else {
                ro.field_r[40] = fa.a((byte) -75, var2_array);
                break L61;
              }
            }
            L62: {
              var2_array = we.a("puzzle1p_levelnames,41", 1);
              if (var2_array == null) {
                break L62;
              } else {
                ro.field_r[41] = fa.a((byte) -107, var2_array);
                break L62;
              }
            }
            L63: {
              var2_array = we.a("puzzle1p_levelnames,42", 1);
              if (var2_array != null) {
                ro.field_r[42] = fa.a((byte) -113, var2_array);
                break L63;
              } else {
                break L63;
              }
            }
            L64: {
              var2_array = we.a("puzzle1p_levelnames,43", 1);
              if (var2_array != null) {
                ro.field_r[43] = fa.a((byte) -105, var2_array);
                break L64;
              } else {
                break L64;
              }
            }
            L65: {
              var2_array = we.a("puzzle1p_levelnames,44", 1);
              if (null != var2_array) {
                ro.field_r[44] = fa.a((byte) -98, var2_array);
                break L65;
              } else {
                break L65;
              }
            }
            L66: {
              var2_array = we.a("puzzle1p_levelnames,45", 1);
              if (null == var2_array) {
                break L66;
              } else {
                ro.field_r[45] = fa.a((byte) -79, var2_array);
                break L66;
              }
            }
            L67: {
              var2_array = we.a("puzzle1p_levelnames,46", 1);
              if (null != var2_array) {
                ro.field_r[46] = fa.a((byte) -124, var2_array);
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              var2_array = we.a("puzzle1p_levelnames,47", 1);
              if (null != var2_array) {
                ro.field_r[47] = fa.a((byte) -104, var2_array);
                break L68;
              } else {
                break L68;
              }
            }
            L69: {
              var2_array = we.a("puzzle1p_levelnames,48", 1);
              if (null == var2_array) {
                break L69;
              } else {
                ro.field_r[48] = fa.a((byte) -68, var2_array);
                break L69;
              }
            }
            L70: {
              var2_array = we.a("puzzle1p_levelnames,49", 1);
              if (null != var2_array) {
                ro.field_r[49] = fa.a((byte) -82, var2_array);
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              var2_array = we.a("puzzle1p_levelnames,50", 1);
              if (var2_array != null) {
                ro.field_r[50] = fa.a((byte) -82, var2_array);
                break L71;
              } else {
                break L71;
              }
            }
            L72: {
              var2_array = we.a("puzzle1p_levelnames,51", 1);
              if (var2_array == null) {
                break L72;
              } else {
                ro.field_r[51] = fa.a((byte) -87, var2_array);
                break L72;
              }
            }
            L73: {
              var2_array = we.a("puzzle1p_levelnames,52", 1);
              if (null != var2_array) {
                ro.field_r[52] = fa.a((byte) -82, var2_array);
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              var2_array = we.a("puzzle1p_levelnames,53", 1);
              if (null == var2_array) {
                break L74;
              } else {
                ro.field_r[53] = fa.a((byte) -81, var2_array);
                break L74;
              }
            }
            L75: {
              var2_array = we.a("puzzle1p_levelnames,54", 1);
              if (null == var2_array) {
                break L75;
              } else {
                ro.field_r[54] = fa.a((byte) -111, var2_array);
                break L75;
              }
            }
            L76: {
              var2_array = we.a("puzzle1p_levelnames,55", 1);
              if (var2_array != null) {
                ro.field_r[55] = fa.a((byte) -78, var2_array);
                break L76;
              } else {
                break L76;
              }
            }
            L77: {
              var2_array = we.a("puzzle1p_levelnames,56", 1);
              if (null == var2_array) {
                break L77;
              } else {
                ro.field_r[56] = fa.a((byte) -100, var2_array);
                break L77;
              }
            }
            L78: {
              var2_array = we.a("puzzle1p_levelnames,57", 1);
              if (var2_array == null) {
                break L78;
              } else {
                ro.field_r[57] = fa.a((byte) -128, var2_array);
                break L78;
              }
            }
            L79: {
              var2_array = we.a("puzzle1p_levelnames,58", 1);
              if (null == var2_array) {
                break L79;
              } else {
                ro.field_r[58] = fa.a((byte) -98, var2_array);
                break L79;
              }
            }
            L80: {
              var2_array = we.a("puzzle1p_levelnames,59", 1);
              if (null == var2_array) {
                break L80;
              } else {
                ro.field_r[59] = fa.a((byte) -90, var2_array);
                break L80;
              }
            }
            L81: {
              var2_array = we.a("puzzle1p_levelnames,60", 1);
              if (var2_array != null) {
                ro.field_r[60] = fa.a((byte) -102, var2_array);
                break L81;
              } else {
                break L81;
              }
            }
            L82: {
              var2_array = we.a("puzzle1p_levelnames,61", 1);
              if (var2_array != null) {
                ro.field_r[61] = fa.a((byte) -69, var2_array);
                break L82;
              } else {
                break L82;
              }
            }
            L83: {
              var2_array = we.a("puzzle1p_levelnames,62", 1);
              if (null != var2_array) {
                ro.field_r[62] = fa.a((byte) -80, var2_array);
                break L83;
              } else {
                break L83;
              }
            }
            L84: {
              var2_array = we.a("puzzle1p_levelnames,63", 1);
              if (null != var2_array) {
                ro.field_r[63] = fa.a((byte) -90, var2_array);
                break L84;
              } else {
                break L84;
              }
            }
            L85: {
              var2_array = we.a("puzzle1p_levelnames,64", 1);
              if (null != var2_array) {
                ro.field_r[64] = fa.a((byte) -127, var2_array);
                break L85;
              } else {
                break L85;
              }
            }
            L86: {
              var2_array = we.a("puzzle1p_levelnames,65", 1);
              if (null != var2_array) {
                ro.field_r[65] = fa.a((byte) -84, var2_array);
                break L86;
              } else {
                break L86;
              }
            }
            L87: {
              var2_array = we.a("puzzle1p_levelnames,66", 1);
              if (null != var2_array) {
                ro.field_r[66] = fa.a((byte) -112, var2_array);
                break L87;
              } else {
                break L87;
              }
            }
            L88: {
              var2_array = we.a("puzzle1p_levelnames,67", 1);
              if (param0 >= 83) {
                break L88;
              } else {
                tl.a(-68, (db) null);
                break L88;
              }
            }
            L89: {
              if (var2_array == null) {
                break L89;
              } else {
                ro.field_r[67] = fa.a((byte) -114, var2_array);
                break L89;
              }
            }
            L90: {
              var2_array = we.a("puzzle1p_levelnames,68", 1);
              if (null == var2_array) {
                break L90;
              } else {
                ro.field_r[68] = fa.a((byte) -105, var2_array);
                break L90;
              }
            }
            L91: {
              var2_array = we.a("puzzle1p_levelnames,69", 1);
              if (null != var2_array) {
                ro.field_r[69] = fa.a((byte) -73, var2_array);
                break L91;
              } else {
                break L91;
              }
            }
            L92: {
              var2_array = we.a("puzzle2p_levelnames,0", 1);
              if (var2_array != null) {
                pg.field_e[0] = fa.a((byte) -124, var2_array);
                break L92;
              } else {
                break L92;
              }
            }
            L93: {
              var2_array = we.a("puzzle2p_levelnames,1", 1);
              if (null != var2_array) {
                pg.field_e[1] = fa.a((byte) -79, var2_array);
                break L93;
              } else {
                break L93;
              }
            }
            L94: {
              var2_array = we.a("puzzle2p_levelnames,2", 1);
              if (null != var2_array) {
                pg.field_e[2] = fa.a((byte) -121, var2_array);
                break L94;
              } else {
                break L94;
              }
            }
            L95: {
              var2_array = we.a("puzzle2p_levelnames,3", 1);
              if (null == var2_array) {
                break L95;
              } else {
                pg.field_e[3] = fa.a((byte) -86, var2_array);
                break L95;
              }
            }
            L96: {
              var2_array = we.a("puzzle2p_levelnames,4", 1);
              if (null == var2_array) {
                break L96;
              } else {
                pg.field_e[4] = fa.a((byte) -66, var2_array);
                break L96;
              }
            }
            L97: {
              var2_array = we.a("puzzle2p_levelnames,5", 1);
              if (var2_array == null) {
                break L97;
              } else {
                pg.field_e[5] = fa.a((byte) -82, var2_array);
                break L97;
              }
            }
            L98: {
              var2_array = we.a("puzzle2p_levelnames,6", 1);
              if (var2_array != null) {
                pg.field_e[6] = fa.a((byte) -95, var2_array);
                break L98;
              } else {
                break L98;
              }
            }
            L99: {
              var2_array = we.a("puzzle2p_levelnames,7", 1);
              if (null == var2_array) {
                break L99;
              } else {
                pg.field_e[7] = fa.a((byte) -104, var2_array);
                break L99;
              }
            }
            L100: {
              var2_array = we.a("puzzle2p_levelnames,8", 1);
              if (var2_array != null) {
                pg.field_e[8] = fa.a((byte) -93, var2_array);
                break L100;
              } else {
                break L100;
              }
            }
            L101: {
              var2_array = we.a("puzzle2p_levelnames,9", 1);
              if (var2_array != null) {
                pg.field_e[9] = fa.a((byte) -64, var2_array);
                break L101;
              } else {
                break L101;
              }
            }
            L102: {
              var2_array = we.a("puzzle2p_levelnames,10", 1);
              if (null != var2_array) {
                pg.field_e[10] = fa.a((byte) -106, var2_array);
                break L102;
              } else {
                break L102;
              }
            }
            L103: {
              var2_array = we.a("puzzle2p_levelnames,11", 1);
              if (var2_array != null) {
                pg.field_e[11] = fa.a((byte) -66, var2_array);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              var2_array = we.a("puzzle3p_levelnames,0", 1);
              if (var2_array == null) {
                break L104;
              } else {
                qg.field_c[0] = fa.a((byte) -66, var2_array);
                break L104;
              }
            }
            L105: {
              var2_array = we.a("puzzle3p_levelnames,1", 1);
              if (var2_array == null) {
                break L105;
              } else {
                qg.field_c[1] = fa.a((byte) -77, var2_array);
                break L105;
              }
            }
            L106: {
              var2_array = we.a("puzzle3p_levelnames,2", 1);
              if (null != var2_array) {
                qg.field_c[2] = fa.a((byte) -117, var2_array);
                break L106;
              } else {
                break L106;
              }
            }
            L107: {
              var2_array = we.a("puzzle3p_levelnames,3", 1);
              if (var2_array != null) {
                qg.field_c[3] = fa.a((byte) -94, var2_array);
                break L107;
              } else {
                break L107;
              }
            }
            L108: {
              var2_array = we.a("puzzle3p_levelnames,4", 1);
              if (null == var2_array) {
                break L108;
              } else {
                qg.field_c[4] = fa.a((byte) -95, var2_array);
                break L108;
              }
            }
            L109: {
              var2_array = we.a("arcade1p_levelnames,0", 1);
              if (null != var2_array) {
                kk.field_k[0] = fa.a((byte) -119, var2_array);
                break L109;
              } else {
                break L109;
              }
            }
            L110: {
              var2_array = we.a("arcade1p_levelnames,1", 1);
              if (var2_array != null) {
                kk.field_k[1] = fa.a((byte) -124, var2_array);
                break L110;
              } else {
                break L110;
              }
            }
            L111: {
              var2_array = we.a("arcade1p_levelnames,2", 1);
              if (var2_array == null) {
                break L111;
              } else {
                kk.field_k[2] = fa.a((byte) -96, var2_array);
                break L111;
              }
            }
            L112: {
              var2_array = we.a("arcade1p_levelnames,3", 1);
              if (var2_array == null) {
                break L112;
              } else {
                kk.field_k[3] = fa.a((byte) -125, var2_array);
                break L112;
              }
            }
            L113: {
              var2_array = we.a("arcade1p_levelnames,4", 1);
              if (null == var2_array) {
                break L113;
              } else {
                kk.field_k[4] = fa.a((byte) -110, var2_array);
                break L113;
              }
            }
            L114: {
              var2_array = we.a("arcade1p_levelnames,5", 1);
              if (var2_array == null) {
                break L114;
              } else {
                kk.field_k[5] = fa.a((byte) -83, var2_array);
                break L114;
              }
            }
            L115: {
              var2_array = we.a("arcade1p_levelnames,6", 1);
              if (null != var2_array) {
                kk.field_k[6] = fa.a((byte) -88, var2_array);
                break L115;
              } else {
                break L115;
              }
            }
            L116: {
              var2_array = we.a("arcade1p_levelnames,7", 1);
              if (var2_array != null) {
                kk.field_k[7] = fa.a((byte) -127, var2_array);
                break L116;
              } else {
                break L116;
              }
            }
            L117: {
              var2_array = we.a("arcade1p_levelnames,8", 1);
              if (var2_array != null) {
                kk.field_k[8] = fa.a((byte) -123, var2_array);
                break L117;
              } else {
                break L117;
              }
            }
            L118: {
              var2_array = we.a("arcade1p_levelnames,9", 1);
              if (var2_array != null) {
                kk.field_k[9] = fa.a((byte) -91, var2_array);
                break L118;
              } else {
                break L118;
              }
            }
            L119: {
              var2_array = we.a("arcade1p_levelnames,10", 1);
              if (null == var2_array) {
                break L119;
              } else {
                kk.field_k[10] = fa.a((byte) -94, var2_array);
                break L119;
              }
            }
            L120: {
              var2_array = we.a("arcade1p_levelnames,11", 1);
              if (null != var2_array) {
                kk.field_k[11] = fa.a((byte) -81, var2_array);
                break L120;
              } else {
                break L120;
              }
            }
            L121: {
              var2_array = we.a("arcade1p_levelnames,12", 1);
              if (var2_array == null) {
                break L121;
              } else {
                kk.field_k[12] = fa.a((byte) -73, var2_array);
                break L121;
              }
            }
            L122: {
              var2_array = we.a("arcade1p_levelnames,13", 1);
              if (null != var2_array) {
                kk.field_k[13] = fa.a((byte) -67, var2_array);
                break L122;
              } else {
                break L122;
              }
            }
            L123: {
              var2_array = we.a("arcade1p_levelnames,14", 1);
              if (var2_array != null) {
                kk.field_k[14] = fa.a((byte) -117, var2_array);
                break L123;
              } else {
                break L123;
              }
            }
            L124: {
              var2_array = we.a("arcade1p_levelnames,15", 1);
              if (null == var2_array) {
                break L124;
              } else {
                kk.field_k[15] = fa.a((byte) -86, var2_array);
                break L124;
              }
            }
            L125: {
              var2_array = we.a("arcade1p_levelnames,16", 1);
              if (null == var2_array) {
                break L125;
              } else {
                kk.field_k[16] = fa.a((byte) -100, var2_array);
                break L125;
              }
            }
            L126: {
              var2_array = we.a("arcade1p_levelnames,17", 1);
              if (null == var2_array) {
                break L126;
              } else {
                kk.field_k[17] = fa.a((byte) -101, var2_array);
                break L126;
              }
            }
            L127: {
              var2_array = we.a("arcade1p_levelnames,18", 1);
              if (var2_array == null) {
                break L127;
              } else {
                kk.field_k[18] = fa.a((byte) -66, var2_array);
                break L127;
              }
            }
            L128: {
              var2_array = we.a("arcade1p_levelnames,19", 1);
              if (null == var2_array) {
                break L128;
              } else {
                kk.field_k[19] = fa.a((byte) -115, var2_array);
                break L128;
              }
            }
            L129: {
              var2_array = we.a("arcade1p_levelnames,20", 1);
              if (null == var2_array) {
                break L129;
              } else {
                kk.field_k[20] = fa.a((byte) -108, var2_array);
                break L129;
              }
            }
            L130: {
              var2_array = we.a("arcade1p_levelnames,21", 1);
              if (var2_array == null) {
                break L130;
              } else {
                kk.field_k[21] = fa.a((byte) -114, var2_array);
                break L130;
              }
            }
            L131: {
              var2_array = we.a("arcade1p_levelnames,22", 1);
              if (null != var2_array) {
                kk.field_k[22] = fa.a((byte) -68, var2_array);
                break L131;
              } else {
                break L131;
              }
            }
            L132: {
              var2_array = we.a("arcade1p_levelnames,23", 1);
              if (var2_array == null) {
                break L132;
              } else {
                kk.field_k[23] = fa.a((byte) -128, var2_array);
                break L132;
              }
            }
            L133: {
              var2_array = we.a("arcade1p_levelnames,24", 1);
              if (var2_array != null) {
                kk.field_k[24] = fa.a((byte) -88, var2_array);
                break L133;
              } else {
                break L133;
              }
            }
            L134: {
              var2_array = we.a("memberslevels_cannotplayreason", 1);
              if (var2_array == null) {
                break L134;
              } else {
                ro.field_t = fa.a((byte) -63, var2_array);
                break L134;
              }
            }
            L135: {
              var2_array = we.a("unreachedlevels_cannotplayreason_shorter", 1);
              if (var2_array == null) {
                break L135;
              } else {
                mb.field_a = fa.a((byte) -68, var2_array);
                break L135;
              }
            }
            L136: {
              var2_array = we.a("tasterlevel_suffix", 1);
              if (var2_array != null) {
                pe.field_n = fa.a((byte) -128, var2_array);
                break L136;
              } else {
                break L136;
              }
            }
            L137: {
              var2_array = we.a("tasterlevel_topmessage", 1);
              if (null == var2_array) {
                break L137;
              } else {
                io.field_J = fa.a((byte) -100, var2_array);
                break L137;
              }
            }
            L138: {
              var2_array = we.a("tasterlevel_botmessage", 1);
              if (null != var2_array) {
                cj.field_E = fa.a((byte) -71, var2_array);
                break L138;
              } else {
                break L138;
              }
            }
            L139: {
              var2_array = we.a("loadloop_playingwizardrun", 1);
              if (var2_array == null) {
                break L139;
              } else {
                ae.field_D = fa.a((byte) -123, var2_array);
                break L139;
              }
            }
            L140: {
              var2_array = we.a("oneplayerpuzzles", 1);
              if (null != var2_array) {
                rh.field_d = fa.a((byte) -105, var2_array);
                break L140;
              } else {
                break L140;
              }
            }
            L141: {
              var2_array = we.a("twoplayerpuzzles", 1);
              if (null == var2_array) {
                break L141;
              } else {
                li.field_e = fa.a((byte) -100, var2_array);
                break L141;
              }
            }
            L142: {
              var2_array = we.a("threeplayerpuzzles", 1);
              if (null == var2_array) {
                break L142;
              } else {
                l.field_c = fa.a((byte) -109, var2_array);
                break L142;
              }
            }
            L143: {
              var2_array = we.a("arcadelevels", 1);
              if (null != var2_array) {
                b.field_d = fa.a((byte) -85, var2_array);
                break L143;
              } else {
                break L143;
              }
            }
            L144: {
              var2_array = we.a("puzzlehighscores", 1);
              if (null == var2_array) {
                break L144;
              } else {
                cp.field_h = fa.a((byte) -88, var2_array);
                break L144;
              }
            }
            L145: {
              var2_array = we.a("arcadehighscores", 1);
              if (var2_array == null) {
                break L145;
              } else {
                fq.field_G = fa.a((byte) -116, var2_array);
                break L145;
              }
            }
            L146: {
              var2_array = we.a("puzzle1p_subsections,0", 1);
              if (var2_array == null) {
                break L146;
              } else {
                md.field_t[0] = fa.a((byte) -91, var2_array);
                break L146;
              }
            }
            L147: {
              var2_array = we.a("puzzle1p_subsections,1", 1);
              if (null != var2_array) {
                md.field_t[1] = fa.a((byte) -103, var2_array);
                break L147;
              } else {
                break L147;
              }
            }
            L148: {
              var2_array = we.a("puzzle1p_subsections,2", 1);
              if (var2_array == null) {
                break L148;
              } else {
                md.field_t[2] = fa.a((byte) -123, var2_array);
                break L148;
              }
            }
            L149: {
              var2_array = we.a("puzzle1p_subsections,3", 1);
              if (null != var2_array) {
                md.field_t[3] = fa.a((byte) -100, var2_array);
                break L149;
              } else {
                break L149;
              }
            }
            L150: {
              var2_array = we.a("levelscomplete_proceeding", 1);
              if (null != var2_array) {
                fb.field_e = fa.a((byte) -92, var2_array);
                break L150;
              } else {
                break L150;
              }
            }
            L151: {
              var2_array = we.a("levelscomplete_proceeding_bonus", 1);
              if (null == var2_array) {
                break L151;
              } else {
                of.field_G = fa.a((byte) -72, var2_array);
                break L151;
              }
            }
            L152: {
              var2_array = we.a("bonuslevelscomplete", 1);
              if (var2_array == null) {
                break L152;
              } else {
                jn.field_n = fa.a((byte) -87, var2_array);
                break L152;
              }
            }
            L153: {
              var2_array = we.a("achievementnames,0", 1);
              if (null != var2_array) {
                jm.field_e[0] = fa.a((byte) -85, var2_array);
                break L153;
              } else {
                break L153;
              }
            }
            L154: {
              var2_array = we.a("achievementnames,1", 1);
              if (var2_array != null) {
                jm.field_e[1] = fa.a((byte) -122, var2_array);
                break L154;
              } else {
                break L154;
              }
            }
            L155: {
              var2_array = we.a("achievementnames,2", 1);
              if (var2_array == null) {
                break L155;
              } else {
                jm.field_e[2] = fa.a((byte) -89, var2_array);
                break L155;
              }
            }
            L156: {
              var2_array = we.a("achievementnames,3", 1);
              if (var2_array == null) {
                break L156;
              } else {
                jm.field_e[3] = fa.a((byte) -73, var2_array);
                break L156;
              }
            }
            L157: {
              var2_array = we.a("achievementnames,4", 1);
              if (var2_array != null) {
                jm.field_e[4] = fa.a((byte) -66, var2_array);
                break L157;
              } else {
                break L157;
              }
            }
            L158: {
              var2_array = we.a("achievementnames,5", 1);
              if (null == var2_array) {
                break L158;
              } else {
                jm.field_e[5] = fa.a((byte) -75, var2_array);
                break L158;
              }
            }
            L159: {
              var2_array = we.a("achievementnames,6", 1);
              if (var2_array == null) {
                break L159;
              } else {
                jm.field_e[6] = fa.a((byte) -89, var2_array);
                break L159;
              }
            }
            L160: {
              var2_array = we.a("achievementnames,7", 1);
              if (var2_array != null) {
                jm.field_e[7] = fa.a((byte) -124, var2_array);
                break L160;
              } else {
                break L160;
              }
            }
            L161: {
              var2_array = we.a("achievementnames,8", 1);
              if (null == var2_array) {
                break L161;
              } else {
                jm.field_e[8] = fa.a((byte) -99, var2_array);
                break L161;
              }
            }
            L162: {
              var2_array = we.a("achievementnames,9", 1);
              if (null != var2_array) {
                jm.field_e[9] = fa.a((byte) -112, var2_array);
                break L162;
              } else {
                break L162;
              }
            }
            L163: {
              var2_array = we.a("achievementnames,10", 1);
              if (var2_array != null) {
                jm.field_e[10] = fa.a((byte) -121, var2_array);
                break L163;
              } else {
                break L163;
              }
            }
            L164: {
              var2_array = we.a("achievementnames,11", 1);
              if (var2_array == null) {
                break L164;
              } else {
                jm.field_e[11] = fa.a((byte) -106, var2_array);
                break L164;
              }
            }
            L165: {
              var2_array = we.a("achievementnames,12", 1);
              if (null != var2_array) {
                jm.field_e[12] = fa.a((byte) -65, var2_array);
                break L165;
              } else {
                break L165;
              }
            }
            L166: {
              var2_array = we.a("achievementnames,13", 1);
              if (var2_array != null) {
                jm.field_e[13] = fa.a((byte) -125, var2_array);
                break L166;
              } else {
                break L166;
              }
            }
            L167: {
              var2_array = we.a("achievementnames,14", 1);
              if (null != var2_array) {
                jm.field_e[14] = fa.a((byte) -71, var2_array);
                break L167;
              } else {
                break L167;
              }
            }
            L168: {
              var2_array = we.a("achievementnames,15", 1);
              if (null == var2_array) {
                break L168;
              } else {
                jm.field_e[15] = fa.a((byte) -100, var2_array);
                break L168;
              }
            }
            L169: {
              var2_array = we.a("achievementnames,16", 1);
              if (var2_array == null) {
                break L169;
              } else {
                jm.field_e[16] = fa.a((byte) -64, var2_array);
                break L169;
              }
            }
            L170: {
              var2_array = we.a("achievementdescriptions,0", 1);
              if (null != var2_array) {
                an.field_o[0] = fa.a((byte) -94, var2_array);
                break L170;
              } else {
                break L170;
              }
            }
            L171: {
              var2_array = we.a("achievementdescriptions,1", 1);
              if (var2_array == null) {
                break L171;
              } else {
                an.field_o[1] = fa.a((byte) -111, var2_array);
                break L171;
              }
            }
            L172: {
              var2_array = we.a("achievementdescriptions,2", 1);
              if (null != var2_array) {
                an.field_o[2] = fa.a((byte) -96, var2_array);
                break L172;
              } else {
                break L172;
              }
            }
            L173: {
              var2_array = we.a("achievementdescriptions,3", 1);
              if (var2_array != null) {
                an.field_o[3] = fa.a((byte) -77, var2_array);
                break L173;
              } else {
                break L173;
              }
            }
            L174: {
              var2_array = we.a("achievementdescriptions,4", 1);
              if (null == var2_array) {
                break L174;
              } else {
                an.field_o[4] = fa.a((byte) -102, var2_array);
                break L174;
              }
            }
            L175: {
              var2_array = we.a("achievementdescriptions,5", 1);
              if (var2_array == null) {
                break L175;
              } else {
                an.field_o[5] = fa.a((byte) -99, var2_array);
                break L175;
              }
            }
            L176: {
              var2_array = we.a("achievementdescriptions,6", 1);
              if (var2_array != null) {
                an.field_o[6] = fa.a((byte) -110, var2_array);
                break L176;
              } else {
                break L176;
              }
            }
            L177: {
              var2_array = we.a("achievementdescriptions,7", 1);
              if (var2_array == null) {
                break L177;
              } else {
                an.field_o[7] = fa.a((byte) -103, var2_array);
                break L177;
              }
            }
            L178: {
              var2_array = we.a("achievementdescriptions,8", 1);
              if (var2_array != null) {
                an.field_o[8] = fa.a((byte) -110, var2_array);
                break L178;
              } else {
                break L178;
              }
            }
            L179: {
              var2_array = we.a("achievementdescriptions,9", 1);
              if (null != var2_array) {
                an.field_o[9] = fa.a((byte) -63, var2_array);
                break L179;
              } else {
                break L179;
              }
            }
            L180: {
              var2_array = we.a("achievementdescriptions,10", 1);
              if (null != var2_array) {
                an.field_o[10] = fa.a((byte) -101, var2_array);
                break L180;
              } else {
                break L180;
              }
            }
            L181: {
              var2_array = we.a("achievementdescriptions,11", 1);
              if (var2_array == null) {
                break L181;
              } else {
                an.field_o[11] = fa.a((byte) -95, var2_array);
                break L181;
              }
            }
            L182: {
              var2_array = we.a("achievementdescriptions,12", 1);
              if (var2_array != null) {
                an.field_o[12] = fa.a((byte) -117, var2_array);
                break L182;
              } else {
                break L182;
              }
            }
            L183: {
              var2_array = we.a("achievementdescriptions,13", 1);
              if (var2_array != null) {
                an.field_o[13] = fa.a((byte) -63, var2_array);
                break L183;
              } else {
                break L183;
              }
            }
            L184: {
              var2_array = we.a("achievementdescriptions,14", 1);
              if (var2_array == null) {
                break L184;
              } else {
                an.field_o[14] = fa.a((byte) -103, var2_array);
                break L184;
              }
            }
            L185: {
              var2_array = we.a("achievementdescriptions,15", 1);
              if (null == var2_array) {
                break L185;
              } else {
                an.field_o[15] = fa.a((byte) -63, var2_array);
                break L185;
              }
            }
            L186: {
              var2_array = we.a("achievementdescriptions,16", 1);
              if (var2_array == null) {
                break L186;
              } else {
                an.field_o[16] = fa.a((byte) -64, var2_array);
                break L186;
              }
            }
            L187: {
              var2_array = we.a("clickonatile", 1);
              if (null == var2_array) {
                break L187;
              } else {
                fa.field_i = fa.a((byte) -72, var2_array);
                break L187;
              }
            }
            L188: {
              var2_array = we.a("pressmformap", 1);
              if (var2_array != null) {
                f.field_e = fa.a((byte) -121, var2_array);
                break L188;
              } else {
                break L188;
              }
            }
            L189: {
              var2_array = we.a("bomb_name", 1);
              if (null != var2_array) {
                kd.field_i = fa.a((byte) -109, var2_array);
                break L189;
              } else {
                break L189;
              }
            }
            L190: {
              var2_array = we.a("bomb_information", 1);
              if (var2_array == null) {
                break L190;
              } else {
                bd.field_l = fa.a((byte) -94, var2_array);
                break L190;
              }
            }
            L191: {
              var2_array = we.a("crystal_name", 1);
              if (var2_array != null) {
                cj.field_y = fa.a((byte) -74, var2_array);
                break L191;
              } else {
                break L191;
              }
            }
            L192: {
              var2_array = we.a("crystal_information", 1);
              if (var2_array == null) {
                break L192;
              } else {
                fa.field_k = fa.a((byte) -85, var2_array);
                break L192;
              }
            }
            L193: {
              var2_array = we.a("earth_name", 1);
              if (null != var2_array) {
                dq.field_H = fa.a((byte) -91, var2_array);
                break L193;
              } else {
                break L193;
              }
            }
            L194: {
              var2_array = we.a("earth_information", 1);
              if (null != var2_array) {
                wi.field_b = fa.a((byte) -115, var2_array);
                break L194;
              } else {
                break L194;
              }
            }
            L195: {
              var2_array = we.a("hole_name", 1);
              if (null != var2_array) {
                mg.field_h = fa.a((byte) -71, var2_array);
                break L195;
              } else {
                break L195;
              }
            }
            L196: {
              var2_array = we.a("hole_information_unfilled", 1);
              if (null == var2_array) {
                break L196;
              } else {
                hl.field_e = fa.a((byte) -80, var2_array);
                break L196;
              }
            }
            L197: {
              var2_array = we.a("hole_information_filled", 1);
              if (null == var2_array) {
                break L197;
              } else {
                wa.field_j = fa.a((byte) -97, var2_array);
                break L197;
              }
            }
            L198: {
              var2_array = we.a("key_name", 1);
              if (null != var2_array) {
                e.field_a = fa.a((byte) -127, var2_array);
                break L198;
              } else {
                break L198;
              }
            }
            L199: {
              var2_array = we.a("key_information", 1);
              if (var2_array != null) {
                qd.field_p = fa.a((byte) -90, var2_array);
                break L199;
              } else {
                break L199;
              }
            }
            L200: {
              var2_array = we.a("laserhub_name", 1);
              if (var2_array != null) {
                eb.field_m = fa.a((byte) -95, var2_array);
                break L200;
              } else {
                break L200;
              }
            }
            L201: {
              var2_array = we.a("laserhub_information", 1);
              if (var2_array != null) {
                kd.field_m = fa.a((byte) -87, var2_array);
                break L201;
              } else {
                break L201;
              }
            }
            L202: {
              var2_array = we.a("laserbeam_name", 1);
              if (null == var2_array) {
                break L202;
              } else {
                ah.field_f = fa.a((byte) -121, var2_array);
                break L202;
              }
            }
            L203: {
              var2_array = we.a("laserbeam_information", 1);
              if (null != var2_array) {
                gg.field_e = fa.a((byte) -83, var2_array);
                break L203;
              } else {
                break L203;
              }
            }
            L204: {
              var2_array = we.a("log_name", 1);
              if (null == var2_array) {
                break L204;
              } else {
                dq.field_F = fa.a((byte) -116, var2_array);
                break L204;
              }
            }
            L205: {
              var2_array = we.a("log_information", 1);
              if (var2_array != null) {
                nk.field_m = fa.a((byte) -90, var2_array);
                break L205;
              } else {
                break L205;
              }
            }
            L206: {
              var2_array = we.a("mirror_name", 1);
              if (var2_array == null) {
                break L206;
              } else {
                sn.field_b = fa.a((byte) -67, var2_array);
                break L206;
              }
            }
            L207: {
              var2_array = we.a("mirror_information", 1);
              if (null != var2_array) {
                qk.field_z = fa.a((byte) -93, var2_array);
                break L207;
              } else {
                break L207;
              }
            }
            L208: {
              var2_array = we.a("bouncyball_name", 1);
              if (var2_array != null) {
                rb.field_e = fa.a((byte) -127, var2_array);
                break L208;
              } else {
                break L208;
              }
            }
            L209: {
              var2_array = we.a("bouncyball_information", 1);
              if (var2_array != null) {
                fl.field_f = fa.a((byte) -76, var2_array);
                break L209;
              } else {
                break L209;
              }
            }
            L210: {
              var2_array = we.a("player_name_single", 1);
              if (null == var2_array) {
                break L210;
              } else {
                g.field_c = fa.a((byte) -108, var2_array);
                break L210;
              }
            }
            L211: {
              var2_array = we.a("player_name_multi,0", 1);
              if (var2_array == null) {
                break L211;
              } else {
                q.field_c[0] = fa.a((byte) -120, var2_array);
                break L211;
              }
            }
            L212: {
              var2_array = we.a("player_name_multi,1", 1);
              if (var2_array == null) {
                break L212;
              } else {
                q.field_c[1] = fa.a((byte) -95, var2_array);
                break L212;
              }
            }
            L213: {
              var2_array = we.a("player_name_multi,2", 1);
              if (null == var2_array) {
                break L213;
              } else {
                q.field_c[2] = fa.a((byte) -112, var2_array);
                break L213;
              }
            }
            L214: {
              var2_array = we.a("player_whomessage_single", 1);
              if (var2_array == null) {
                break L214;
              } else {
                p.field_h = fa.a((byte) -79, var2_array);
                break L214;
              }
            }
            L215: {
              var2_array = we.a("player_whomessage_multi", 1);
              if (null != var2_array) {
                fh.field_j = fa.a((byte) -79, var2_array);
                break L215;
              } else {
                break L215;
              }
            }
            L216: {
              var2_array = we.a("player_whomessage_helper", 1);
              if (null != var2_array) {
                pl.field_s = fa.a((byte) -91, var2_array);
                break L216;
              } else {
                break L216;
              }
            }
            L217: {
              var2_array = we.a("player_movemessage_normal", 1);
              if (var2_array != null) {
                qa.field_h = fa.a((byte) -85, var2_array);
                break L217;
              } else {
                break L217;
              }
            }
            L218: {
              var2_array = we.a("player_movemessage_tutorial", 1);
              if (null != var2_array) {
                ol.field_E = fa.a((byte) -96, var2_array);
                break L218;
              } else {
                break L218;
              }
            }
            L219: {
              var2_array = we.a("player_movemessage_helper", 1);
              if (var2_array == null) {
                break L219;
              } else {
                en.field_F = fa.a((byte) -84, var2_array);
                break L219;
              }
            }
            L220: {
              var2_array = we.a("rock_name", 1);
              if (null == var2_array) {
                break L220;
              } else {
                ii.field_e = fa.a((byte) -104, var2_array);
                break L220;
              }
            }
            L221: {
              var2_array = we.a("rock_information", 1);
              if (null == var2_array) {
                break L221;
              } else {
                rl.field_g = fa.a((byte) -120, var2_array);
                break L221;
              }
            }
            L222: {
              var2_array = we.a("safe_name", 1);
              if (null == var2_array) {
                break L222;
              } else {
                qh.field_g = fa.a((byte) -98, var2_array);
                break L222;
              }
            }
            L223: {
              var2_array = we.a("safe_information", 1);
              if (null != var2_array) {
                rb.field_j = fa.a((byte) -107, var2_array);
                break L223;
              } else {
                break L223;
              }
            }
            L224: {
              var2_array = we.a("spider_name", 1);
              if (null == var2_array) {
                break L224;
              } else {
                ec.field_n = fa.a((byte) -110, var2_array);
                break L224;
              }
            }
            L225: {
              var2_array = we.a("spider_information", 1);
              if (var2_array == null) {
                break L225;
              } else {
                ch.field_c = fa.a((byte) -114, var2_array);
                break L225;
              }
            }
            L226: {
              var2_array = we.a("spiderweb_name", 1);
              if (null == var2_array) {
                break L226;
              } else {
                tn.field_m = fa.a((byte) -127, var2_array);
                break L226;
              }
            }
            L227: {
              var2_array = we.a("spiderweb_information", 1);
              if (null != var2_array) {
                ae.field_C = fa.a((byte) -65, var2_array);
                break L227;
              } else {
                break L227;
              }
            }
            L228: {
              var2_array = we.a("stickyball_name", 1);
              if (null == var2_array) {
                break L228;
              } else {
                wd.field_h = fa.a((byte) -74, var2_array);
                break L228;
              }
            }
            L229: {
              var2_array = we.a("stickyball_information", 1);
              if (var2_array != null) {
                wg.field_N = fa.a((byte) -91, var2_array);
                break L229;
              } else {
                break L229;
              }
            }
            L230: {
              var2_array = we.a("teleport_name", 1);
              if (var2_array != null) {
                f.field_f = fa.a((byte) -98, var2_array);
                break L230;
              } else {
                break L230;
              }
            }
            L231: {
              var2_array = we.a("teleport_information", 1);
              if (null == var2_array) {
                break L231;
              } else {
                jh.field_d = fa.a((byte) -128, var2_array);
                break L231;
              }
            }
            L232: {
              var2_array = we.a("gametileinfo_showall", 1);
              if (null != var2_array) {
                uh.field_o = fa.a((byte) -112, var2_array);
                break L232;
              } else {
                break L232;
              }
            }
            L233: {
              var2_array = we.a("gametileinfo_done", 1);
              if (null != var2_array) {
                se.field_g = fa.a((byte) -89, var2_array);
                break L233;
              } else {
                break L233;
              }
            }
            L234: {
              var2_array = we.a("bonus_stillalive", 1);
              if (var2_array == null) {
                break L234;
              } else {
                fb.field_d = fa.a((byte) -104, var2_array);
                break L234;
              }
            }
            L235: {
              var2_array = we.a("bonus_mostcrystals", 1);
              if (var2_array != null) {
                me.field_a = fa.a((byte) -71, var2_array);
                break L235;
              } else {
                break L235;
              }
            }
            L236: {
              var2_array = we.a("bonus_lastcrystal", 1);
              if (null != var2_array) {
                re.field_p = fa.a((byte) -66, var2_array);
                break L236;
              } else {
                break L236;
              }
            }
            L237: {
              var2_array = we.a("bonus_allbombs", 1);
              if (null != var2_array) {
                og.field_y = fa.a((byte) -99, var2_array);
                break L237;
              } else {
                break L237;
              }
            }
            L238: {
              var2_array = we.a("bonus_lastbomb", 1);
              if (var2_array == null) {
                break L238;
              } else {
                ra.field_a = fa.a((byte) -66, var2_array);
                break L238;
              }
            }
            L239: {
              var2_array = we.a("bonus_allballs", 1);
              if (null != var2_array) {
                og.field_u = fa.a((byte) -92, var2_array);
                break L239;
              } else {
                break L239;
              }
            }
            L240: {
              var2_array = we.a("bonus_lastball", 1);
              if (var2_array != null) {
                je.field_h = fa.a((byte) -85, var2_array);
                break L240;
              } else {
                break L240;
              }
            }
            L241: {
              var2_array = we.a("bonus_allspiders", 1);
              if (var2_array != null) {
                mn.field_m = fa.a((byte) -111, var2_array);
                break L241;
              } else {
                break L241;
              }
            }
            L242: {
              var2_array = we.a("bonus_lastspider", 1);
              if (null == var2_array) {
                break L242;
              } else {
                tf.field_b = fa.a((byte) -124, var2_array);
                break L242;
              }
            }
            L243: {
              var2_array = we.a("bonus_rightfirsttime", 1);
              if (null == var2_array) {
                break L243;
              } else {
                jn.field_l = fa.a((byte) -66, var2_array);
                break L243;
              }
            }
            L244: {
              var2_array = we.a("penalty_killedafriend", 1);
              if (var2_array != null) {
                kp.field_l = fa.a((byte) -119, var2_array);
                break L244;
              } else {
                break L244;
              }
            }
            L245: {
              var2_array = we.a("tutorial_1_3", 1);
              if (var2_array != null) {
                ao.field_d = fa.a((byte) -121, var2_array);
                break L245;
              } else {
                break L245;
              }
            }
            L246: {
              var2_array = we.a("tutorial_1_6", 1);
              if (var2_array != null) {
                m.field_m = fa.a((byte) -73, var2_array);
                break L246;
              } else {
                break L246;
              }
            }
            L247: {
              var2_array = we.a("tutorial_1_9", 1);
              if (null != var2_array) {
                tb.field_f = fa.a((byte) -71, var2_array);
                break L247;
              } else {
                break L247;
              }
            }
            L248: {
              var2_array = we.a("tutorial_1_14", 1);
              if (null == var2_array) {
                break L248;
              } else {
                cm.field_c = fa.a((byte) -65, var2_array);
                break L248;
              }
            }
            L249: {
              var2_array = we.a("tutorial_2_1", 1);
              if (var2_array == null) {
                break L249;
              } else {
                ma.field_o = fa.a((byte) -121, var2_array);
                break L249;
              }
            }
            L250: {
              var2_array = we.a("tutorial_2_9", 1);
              if (var2_array != null) {
                dn.field_b = fa.a((byte) -128, var2_array);
                break L250;
              } else {
                break L250;
              }
            }
            L251: {
              var2_array = we.a("tutorial_2_12", 1);
              if (null == var2_array) {
                break L251;
              } else {
                wf.field_f = fa.a((byte) -103, var2_array);
                break L251;
              }
            }
            L252: {
              var2_array = we.a("tutorial_2_14", 1);
              if (null != var2_array) {
                fn.field_g = fa.a((byte) -108, var2_array);
                break L252;
              } else {
                break L252;
              }
            }
            L253: {
              var2_array = we.a("tutorial_3_1", 1);
              if (null != var2_array) {
                vp.field_g = fa.a((byte) -119, var2_array);
                break L253;
              } else {
                break L253;
              }
            }
            L254: {
              var2_array = we.a("tutorial_3_5", 1);
              if (var2_array != null) {
                rb.field_i = fa.a((byte) -64, var2_array);
                break L254;
              } else {
                break L254;
              }
            }
            L255: {
              var2_array = we.a("tutorial_3_12", 1);
              if (var2_array != null) {
                ke.field_c = fa.a((byte) -119, var2_array);
                break L255;
              } else {
                break L255;
              }
            }
            L256: {
              var2_array = we.a("tutorial_3_19", 1);
              if (var2_array != null) {
                fp.field_f = fa.a((byte) -72, var2_array);
                break L256;
              } else {
                break L256;
              }
            }
            L257: {
              var2_array = we.a("tutorial_3_24", 1);
              if (var2_array == null) {
                break L257;
              } else {
                cb.field_q = fa.a((byte) -104, var2_array);
                break L257;
              }
            }
            L258: {
              var2_array = we.a("tutorial_3_30", 1);
              if (null != var2_array) {
                oj.field_C = fa.a((byte) -99, var2_array);
                break L258;
              } else {
                break L258;
              }
            }
            L259: {
              var2_array = we.a("tutorial_4_5", 1);
              if (var2_array == null) {
                break L259;
              } else {
                lp.field_c = fa.a((byte) -112, var2_array);
                break L259;
              }
            }
            L260: {
              var2_array = we.a("tutorial_4_10", 1);
              if (null != var2_array) {
                cl.field_i = fa.a((byte) -93, var2_array);
                break L260;
              } else {
                break L260;
              }
            }
            L261: {
              var2_array = we.a("tutorial_4_13", 1);
              if (var2_array != null) {
                jp.field_b = fa.a((byte) -93, var2_array);
                break L261;
              } else {
                break L261;
              }
            }
            L262: {
              var2_array = we.a("tutorial_4_19", 1);
              if (var2_array != null) {
                hm.field_a = fa.a((byte) -128, var2_array);
                break L262;
              } else {
                break L262;
              }
            }
            L263: {
              var2_array = we.a("tutorial_5_3", 1);
              if (null == var2_array) {
                break L263;
              } else {
                g.field_a = fa.a((byte) -67, var2_array);
                break L263;
              }
            }
            L264: {
              var2_array = we.a("tutorial_5_6", 1);
              if (var2_array == null) {
                break L264;
              } else {
                hc.field_c = fa.a((byte) -97, var2_array);
                break L264;
              }
            }
            L265: {
              var2_array = we.a("tutorial_5_9", 1);
              if (null == var2_array) {
                break L265;
              } else {
                oj.field_M = fa.a((byte) -118, var2_array);
                break L265;
              }
            }
            L266: {
              var2_array = we.a("tutorial_5_13", 1);
              if (var2_array == null) {
                break L266;
              } else {
                am.field_f = fa.a((byte) -87, var2_array);
                break L266;
              }
            }
            L267: {
              var2_array = we.a("tutorial_5_25", 1);
              if (var2_array == null) {
                break L267;
              } else {
                tn.field_o = fa.a((byte) -101, var2_array);
                break L267;
              }
            }
            L268: {
              var2_array = we.a("tutorial_5_28", 1);
              if (var2_array == null) {
                break L268;
              } else {
                wa.field_f = fa.a((byte) -98, var2_array);
                break L268;
              }
            }
            L269: {
              var2_array = we.a("developerquote", 1);
              if (null != var2_array) {
                pp.field_i = fa.a((byte) -106, var2_array);
                break L269;
              } else {
                break L269;
              }
            }
            L270: {
              var2_array = we.a("mb_screenshot_captions,0", 1);
              if (var2_array != null) {
                io.field_I[0] = fa.a((byte) -68, var2_array);
                break L270;
              } else {
                break L270;
              }
            }
            L271: {
              var2_array = we.a("mb_screenshot_captions,1", 1);
              if (null == var2_array) {
                break L271;
              } else {
                io.field_I[1] = fa.a((byte) -114, var2_array);
                break L271;
              }
            }
            L272: {
              var2_array = we.a("mb_screenshot_captions,2", 1);
              if (null == var2_array) {
                break L272;
              } else {
                io.field_I[2] = fa.a((byte) -77, var2_array);
                break L272;
              }
            }
            L273: {
              var2_array = we.a("mb_screenshot_captions,3", 1);
              if (null != var2_array) {
                io.field_I[3] = fa.a((byte) -82, var2_array);
                break L273;
              } else {
                break L273;
              }
            }
            L274: {
              var2_array = we.a("mb_screenshot_captions,4", 1);
              if (var2_array != null) {
                io.field_I[4] = fa.a((byte) -92, var2_array);
                break L274;
              } else {
                break L274;
              }
            }
            L275: {
              var2_array = we.a("mb_screenshot_captions,5", 1);
              if (null != var2_array) {
                io.field_I[5] = fa.a((byte) -106, var2_array);
                break L275;
              } else {
                break L275;
              }
            }
            L276: {
              var2_array = we.a("mb_screenshot_captions,6", 1);
              if (null != var2_array) {
                io.field_I[6] = fa.a((byte) -120, var2_array);
                break L276;
              } else {
                break L276;
              }
            }
            L277: {
              var2_array = we.a("mb_screenshot_captions,7", 1);
              if (null == var2_array) {
                break L277;
              } else {
                io.field_I[7] = fa.a((byte) -68, var2_array);
                break L277;
              }
            }
            L278: {
              var2_array = we.a("mb_screenshot_captions,8", 1);
              if (null != var2_array) {
                io.field_I[8] = fa.a((byte) -68, var2_array);
                break L278;
              } else {
                break L278;
              }
            }
            L279: {
              var2_array = we.a("mb_screenshot_captions,9", 1);
              if (null == var2_array) {
                break L279;
              } else {
                io.field_I[9] = fa.a((byte) -122, var2_array);
                break L279;
              }
            }
            L280: {
              var2_array = we.a("mb_screenshot_captions,10", 1);
              if (null == var2_array) {
                break L280;
              } else {
                io.field_I[10] = fa.a((byte) -65, var2_array);
                break L280;
              }
            }
            L281: {
              var2_array = we.a("mb_screenshot_captions,11", 1);
              if (null == var2_array) {
                break L281;
              } else {
                io.field_I[11] = fa.a((byte) -71, var2_array);
                break L281;
              }
            }
            L282: {
              var2_array = we.a("mb_screenshot_captions,12", 1);
              if (var2_array == null) {
                break L282;
              } else {
                io.field_I[12] = fa.a((byte) -69, var2_array);
                break L282;
              }
            }
            L283: {
              var2_array = we.a("mb_screenshot_captions,13", 1);
              if (null == var2_array) {
                break L283;
              } else {
                io.field_I[13] = fa.a((byte) -68, var2_array);
                break L283;
              }
            }
            L284: {
              var2_array = we.a("mb_screenshot_captions,14", 1);
              if (null == var2_array) {
                break L284;
              } else {
                io.field_I[14] = fa.a((byte) -111, var2_array);
                break L284;
              }
            }
            L285: {
              var2_array = we.a("mb_screenshot_captions,15", 1);
              if (null == var2_array) {
                break L285;
              } else {
                io.field_I[15] = fa.a((byte) -102, var2_array);
                break L285;
              }
            }
            L286: {
              var2_array = we.a("mb_screenshot_captions,18", 1);
              if (null != var2_array) {
                io.field_I[18] = fa.a((byte) -108, var2_array);
                break L286;
              } else {
                break L286;
              }
            }
            ge.field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L287: {
            var2 = decompiledCaughtException;
            stackOut_1004_0 = (RuntimeException) (var2);
            stackOut_1004_1 = new StringBuilder().append("tl.C(").append(param0).append(',');
            stackIn_1007_0 = stackOut_1004_0;
            stackIn_1007_1 = stackOut_1004_1;
            stackIn_1005_0 = stackOut_1004_0;
            stackIn_1005_1 = stackOut_1004_1;
            if (param1 == null) {
              stackOut_1007_0 = (RuntimeException) ((Object) stackIn_1007_0);
              stackOut_1007_1 = (StringBuilder) ((Object) stackIn_1007_1);
              stackOut_1007_2 = "null";
              stackIn_1008_0 = stackOut_1007_0;
              stackIn_1008_1 = stackOut_1007_1;
              stackIn_1008_2 = stackOut_1007_2;
              break L287;
            } else {
              stackOut_1005_0 = (RuntimeException) ((Object) stackIn_1005_0);
              stackOut_1005_1 = (StringBuilder) ((Object) stackIn_1005_1);
              stackOut_1005_2 = "{...}";
              stackIn_1008_0 = stackOut_1005_0;
              stackIn_1008_1 = stackOut_1005_1;
              stackIn_1008_2 = stackOut_1005_2;
              break L287;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_1008_0), stackIn_1008_2 + ')');
        }
        L288: {
          if (wa.field_e == 0) {
            break L288;
          } else {
            var3++;
            CrazyCrystals.field_B = var3;
            break L288;
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
            stackOut_0_0 = new java.net.Socket(this.field_c, this.field_d);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "tl.B(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_e = new u();
    }
}
