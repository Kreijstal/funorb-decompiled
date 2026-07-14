/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends hd {
    static sj field_Cb;
    static String field_zb;
    static String field_Db;
    static int[] field_Ab;
    private hd field_yb;
    static String field_Bb;

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        int var2 = param1.length();
        char[] var3 = new char[var2];
        if (param0 != -1) {
            return null;
        }
        for (var4 = 0; var4 < var2; var4++) {
            var3[-var4 + -1 + var2] = param1.charAt(var4);
        }
        return new String(var3);
    }

    final boolean a(byte param0, boolean param1) {
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            L2: {
              ((bo) this).b(0, true);
              var3 = 118 % ((3 - param0) / 62);
              if (wj.field_A == 0) {
                break L2;
              } else {
                if (0 == ((bo) this).field_sb) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (((bo) this).field_yb.field_sb == 0) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              break L1;
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    public static void a(int param0) {
        field_Cb = null;
        field_Ab = null;
        field_Db = null;
        field_zb = null;
        field_Bb = null;
        if (param0 != 72) {
            bo.a(-72);
        }
    }

    final static int a(ec param0, byte param1, ec param2) {
        int var3 = 52 % ((param1 - -39) / 59);
        Object var4 = null;
        return m.a(0, param2, param0, 0, false, (String) null, false);
    }

    bo(hd param0, hd param1, hd param2, hd param3, hd param4, hd param5) {
        int var12 = 0;
        hd var13 = null;
        hd var14 = null;
        int var15 = 0;
        hd var17 = new hd(0L, param1, vp.field_b.toUpperCase());
        var17.field_A = 1;
        ((bo) this).field_yb = new hd(0L, param2);
        hd var8 = new hd(0L, param3);
        hd var9 = new hd(0L, param3, jc.field_l);
        var9.field_A = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; var12 < r.field_b.length; var12++) {
            var13 = new hd(0L, param3, ud.field_A[var12]);
            var14 = new hd(0L, param3, r.field_b[var12]);
            var15 = param3.field_X.a(r.field_b[var12]);
            if (var15 > var11) {
                var11 = var15;
            }
            var13.a(true, 65, 20, var10, 15);
            var14.a(true, 640, 90, var10, 15);
            var8.a((byte) -115, var13);
            var8.a((byte) -104, var14);
            var10 += 30;
        }
        var10 += 15;
        var17.a(true, 110 + var11, 0, 0, 24);
        ((bo) this).a(true, var17.field_q, 100, 100, var17.field_mb + var10);
        ((bo) this).field_yb.a(true, 15, -20 + var17.field_q, 5, 15);
        var8.a(true, ((bo) this).field_q, 0, var17.field_mb, -var17.field_mb + ((bo) this).field_mb);
        var9.a(true, ((bo) this).field_q, 0, 20, 15);
        var8.field_R = fs.a(var8.field_mb, 3, 2105376, 11579568, 8421504, (byte) 83);
        var17.a((byte) -110, ((bo) this).field_yb);
        var8.a((byte) -107, var9);
        ((bo) this).a((byte) -107, var17);
        ((bo) this).a((byte) -117, var8);
        ((bo) this).field_s = 320 - (((bo) this).field_q >> 22401441);
        var10 = 240 - (((bo) this).field_mb >> 410742497);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "(not yet achieved)";
        field_zb = "Tutorial";
        field_Ab = new int[73];
        field_Ab[64] = 64;
        field_Ab[21] = 8;
        field_Ab[49] = 47;
        field_Ab[25] = 18;
        field_Ab[59] = 59;
        field_Ab[9] = 26;
        field_Ab[32] = 69;
        field_Ab[61] = 61;
        field_Ab[47] = 45;
        field_Ab[7] = 13;
        field_Ab[13] = 21;
        field_Ab[6] = 7;
        field_Ab[29] = 20;
        field_Ab[70] = 71;
        field_Ab[43] = 43;
        field_Ab[60] = 60;
        field_Ab[24] = 16;
        field_Ab[8] = 19;
        field_Ab[68] = 68;
        field_Ab[50] = 48;
        field_Ab[54] = 52;
        field_Ab[33] = 33;
        field_Ab[1] = 2;
        field_Ab[28] = 30;
        field_Ab[57] = 57;
        field_Ab[26] = 9;
        field_Ab[56] = 56;
        field_Ab[12] = 15;
        field_Ab[0] = 1;
        field_Ab[65] = 65;
        field_Ab[18] = 25;
        field_Ab[37] = 38;
        field_Ab[5] = 6;
        field_Ab[19] = 22;
        field_Ab[62] = 62;
        field_Ab[67] = 67;
        field_Ab[39] = 40;
        field_Ab[35] = 35;
        field_Ab[72] = 32;
        field_Ab[58] = 58;
        field_Ab[41] = 42;
        field_Ab[11] = 11;
        field_Ab[3] = 4;
        field_Ab[2] = 3;
        field_Ab[20] = 23;
        field_Ab[4] = 5;
        field_Ab[69] = 70;
        field_Ab[55] = 55;
        field_Ab[44] = 53;
        field_Ab[40] = 41;
        field_Ab[36] = 37;
        field_Ab[66] = 66;
        field_Ab[27] = 27;
        field_Ab[14] = 31;
        field_Ab[45] = 54;
        field_Ab[23] = 12;
        field_Ab[17] = 14;
        field_Ab[51] = 49;
        field_Ab[34] = 34;
        field_Ab[38] = 39;
        field_Ab[48] = 46;
        field_Ab[46] = 44;
        field_Ab[16] = 17;
        field_Ab[52] = 50;
        field_Ab[71] = 72;
        field_Ab[10] = 10;
        field_Ab[42] = 36;
        field_Ab[15] = 28;
        field_Ab[30] = 24;
        field_Ab[63] = 63;
        field_Ab[53] = 51;
        field_Ab[22] = 0;
        field_Ab[31] = 29;
        field_Bb = "Show game chat from my friends";
    }
}
