/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends ud {
    private lr field_X;
    static ia field_W;
    private boolean field_V;
    private String field_U;
    private int field_P;
    private int field_O;
    private int field_ab;
    static String field_Q;
    static String field_T;
    static long[][] field_N;
    static long[] field_Z;
    static String field_Y;
    static vh field_R;
    static String field_S;

    final static void a(int param0, String param1, int param2, boolean param3, int param4) {
        lk var5 = null;
        try {
            if (param0 != 8) {
                n.g((byte) 74);
            }
            var5 = new lk();
            var5.field_s = param2;
            var5.field_v = param3 ? true : false;
            var5.field_x = param1;
            var5.field_l = param4;
            ne.field_r.b((byte) 116, var5);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "n.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = this.field_C + param2;
        int var6 = this.field_D - -param3;
        super.a(param0, (byte) 13, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        int var7 = 126 / ((param1 - -42) / 53);
        int var8 = this.field_V ? -(this.field_P * 2) + (this.field_l - this.field_ab) : 0;
        this.field_X.a(this.field_U, this.field_P + var8 + var5, this.field_P + var6, -this.field_P + this.field_ab, this.field_y + -(2 * this.field_P), this.field_O, -1, this.field_V ? 0 : 2, 1, this.field_X.field_C);
    }

    final static boolean h(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        Throwable decompiledCaughtException = null;
        var1 = wn.field_a;
        synchronized (var1) {
          L0: {
            if (ja.field_c == bl.field_s) {
              stackIn_4_0 = 0;
              return stackIn_4_0 != 0;
            } else {
              qi.field_a = ee.field_b[bl.field_s];
              ml.field_b = ek.field_c[bl.field_s];
              bl.field_s = param0 & bl.field_s + 1;
              stackIn_6_0 = 1;
              break L0;
            }
          }
        }
        return stackIn_6_0 != 0;
    }

    final static double[] a(int param0, double[] param1) {
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double[] stackIn_2_0 = null;
        double[] stackIn_5_0 = null;
        double[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_double = param1[0];
            if (param0 <= -121) {
              var4 = param1[1];
              var6 = param1[2];
              var8 = var6 * var6 + (var4 * var4 + var2_double * var2_double);
              if (Math.abs(-1.0 + var8) >= 1e-16) {
                var8 = Math.sqrt(var8);
                param1[1] = var4 / var8;
                param1[2] = var6 / var8;
                param1[0] = var2_double / var8;
                stackIn_7_0 = (double[]) (param1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (double[]) (param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (double[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("n.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final String e(int param0) {
        if (param0 >= -10) {
            field_Z = (long[]) null;
        }
        int var2 = this.field_L.field_s ? 1 : 0;
        this.field_L.field_s = this.field_s;
        String var3 = this.field_L.e(-54);
        this.field_L.field_s = var2 != 0 ? true : false;
        return var3;
    }

    final static String a(boolean param0, boolean param1, boolean param2, byte param3) {
        if (param3 != 39) {
            return (String) null;
        }
        int var4 = 0;
        if (param0) {
            var4 += 4;
        }
        if (param1) {
            var4 += 2;
        }
        if (!(!param2)) {
            var4++;
        }
        return ml.field_c[var4];
    }

    n(int param0, int param1, int param2, int param3, ei param4, boolean param5, int param6, int param7, lr param8, int param9, String param10) {
        super(param0, param1, param2, param3, (fp) null, (cc) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_U = param10;
              this.field_P = param7;
              this.field_L = param4;
              this.field_X = param8;
              this.field_ab = param6;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((n) (this)).field_V = stackIn_4_1 != 0;
              this.field_O = param9;
              var12_int = this.field_ab + -this.field_P;
              var13 = this.field_X.b(param10, var12_int, this.field_X.field_C) + 2 * this.field_P;
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                this.a(param2, param0, var13, false, param1);
                break L2;
              }
            }
            L3: {
              if (this.field_V) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = this.field_P * 2 + this.field_ab;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_L.a(-this.field_ab + param2 + -(3 * this.field_P), var14, -(this.field_P * 2) + param3, false, (-param3 + var13 >> -8124223) + this.field_P);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("n.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    public static void g(byte param0) {
        field_Z = null;
        field_Y = null;
        field_Q = null;
        field_T = null;
        if (param0 > -48) {
            field_Z = (long[]) null;
        }
        field_W = null;
        field_N = (long[][]) null;
        field_R = null;
        field_S = null;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_W = new ia(1);
        field_Q = "Resigned.";
        field_T = "Options";
        field_N = new long[8][256];
        field_Y = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_Z = new long[11];
        for (var0 = 0; (var0 ^ -1) > -257; var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 == (1 & var0) ? (long)(var1 >>> -742532632) : (long)(255 & var1);
            var4 = var2 << 1261715073;
            if (!(256L > var4)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 201409601;
            if (!((var6 ^ -1L) > -257L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 155031425;
            if (256L <= var10) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_N[0][var0] = k.a(var12, k.a(k.a(k.a(var10 << 2121854936, k.a(var2 << -1317818592, k.a(var6 << 1944671016, k.a(var2 << -543305552, var2 << -407030408)))), var8 << 1750101392), var4 << 1597631304));
            for (var14 = 1; 8 > var14; var14++) {
                field_N[var14][var0] = k.a(field_N[-1 + var14][var0] << -1769291848, field_N[-1 + var14][var0] >>> 1208608328);
            }
        }
        field_Z[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
            var1 = (-1 + var0) * 8;
            field_Z[var0] = im.a(im.a(im.a(mj.a(16711680L, field_N[5][5 + var1]), im.a(im.a(im.a(im.a(mj.a(field_N[0][var1], -72057594037927936L), mj.a(field_N[1][1 + var1], 71776119061217280L)), mj.a(280375465082880L, field_N[2][var1 - -2])), mj.a(field_N[3][var1 - -3], 1095216660480L)), mj.a(4278190080L, field_N[4][4 + var1]))), mj.a(field_N[6][var1 - -6], 65280L)), mj.a(255L, field_N[7][var1 - -7]));
        }
    }
}
