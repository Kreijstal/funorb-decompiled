/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    int field_e;
    static long[] field_d;
    int field_c;
    static long[][] field_a;
    static String[] field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(jk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        a stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        a var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        jk var41 = null;
        int[] var42 = null;
        int var45 = 0;
        jk var46 = null;
        int[] var51 = null;
        int[] var56 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = Bounce.field_N;
        try {
          var46 = param0;
          if (null != var46.field_v &&
            var46.field_w > 1) {
            var62 = var46.field_v;
            ed.a(oc.field_a, 0, -113, 0, var62);
          } else {
            w.a(-15);
          }
          var56 = new int[param0.field_d];
          var51 = var56;
          var42 = var51;
          var8 = var42;
          var66 = new int[param0.field_d];
          var63 = uc.field_D;
          var64 = ih.field_db;
          var65 = nk.field_b;
          for (var13 = 0; var13 < param0.field_d; var13++) {
            var14 = param3 * var63[var13] + var64[var13] * param6 + var65[var13] * param4 >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (0 > var14) {
              stackIn_15_0 = 128;
            } else {
              if (var14 < 128) {
                stackIn_15_0 = var14 + 128;
              } else {
                stackIn_15_0 = 256;
              }
            }
            var14Lifetime2 = stackIn_15_0;
            var15 = param2 * var64[var13] + (param1 * var63[var13] + param5 * var65[var13]) >> 8;
            stackIn_17_0 = jl.field_b;
            if (var15 < 0) {
              stackIn_18_1 = -var15;
            } else {
              stackIn_18_1 = var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime2 = var14Lifetime2 * (-var15Lifetime2 + 256) >>> 8;
            var56[var13] = var14Lifetime2;
            var66[var13] = var15Lifetime2;
          }
          if (param7 >= -77) {
            var41 = (jk) null;
            eh.a((jk) null, 9, 103, 78, 54, -25, 73, 112);
          }
          var45 = 0;
          var13Lifetime1 = var45;
          while (lb.field_b > var45) {
            var14Lifetime1 = lb.field_c[var45];
            var15Lifetime1 = param0.field_O[var14Lifetime1];
            var16 = param0.field_P[var14Lifetime1];
            var17 = param0.field_l[var14Lifetime1];
            if (param0.field_F[var14Lifetime1] < uc.field_D.length) {
              stackIn_26_0 = param0.field_F[var14Lifetime1];
            } else {
              stackIn_26_0 = -1;
            }
            var18 = stackIn_26_0;
            if (param0.field_I[var14Lifetime1] < uc.field_D.length) {
              stackIn_29_0 = param0.field_I[var14Lifetime1];
            } else {
              stackIn_29_0 = -1;
            }
            var19 = stackIn_29_0;
            if (param0.field_Q[var14Lifetime1] >= uc.field_D.length) {
              stackIn_32_0 = -1;
            } else {
              stackIn_32_0 = param0.field_Q[var14Lifetime1];
            }
            var20 = stackIn_32_0;
            if (wi.field_g != null &&
              param0.field_p != null &&
              var14Lifetime1 < param0.field_p.length &&
              -1 != param0.field_p[var14Lifetime1] &&
              wi.field_g.length > param0.field_p[var14Lifetime1]) {
              stackIn_39_0 = wi.field_g[param0.field_p[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = ca.field_c[var15Lifetime1];
            var23 = kg.field_g[var15Lifetime1];
            var24 = ca.field_c[var16];
            var25 = kg.field_g[var16];
            var26 = ca.field_c[var17];
            var27 = kg.field_g[var17];
            if (var19 == var18 &&
              var20 == var19) {
              var28 = var56[var18];
              var29 = var66[var18];
              if (var21 != null) {
                stackIn_44_0 = var21.field_d;
              } else {
                stackIn_44_0 = 8355711;
              }
              var30 = stackIn_44_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = 1157693184 & var32 * var28 >>> 8 | -1795227393 & var31 * var28 >>> 8;
              var33 = var33 + 65793 * var29;
              gi.a(11, var23, var25, var26, var27, var33 >> 1 & 8355711, var22, var24);
            } else {
              var28 = var56[var18];
              var29 = var56[var19];
              var30 = var56[var20];
              var31 = var66[var18];
              var32 = var66[var19];
              var33 = var66[var20];
              if (var21 != null) {
                stackIn_48_0 = var21.field_d;
              } else {
                stackIn_48_0 = 8355711;
              }
              var34 = stackIn_48_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = (var36 * var28 & 16711927) >>> 8 | (var35 * var28 & -16711881) >>> 8;
              var38 = (var35 * var29 & -16711928) >>> 8 | (var29 * var36 & 16711731) >>> 8;
              var37 = var37 + var31 * 65793;
              var39 = -385941249 & var30 * var35 >>> 8 | (16711929 & var30 * var36) >>> 8;
              var38 = var38 + var32 * 65793;
              var39 = var39 + var33 * 65793;
              ud.a(var22, 255 & var37 >> 8, (var39 & 65522) >> 8, 255 & var38, var38 >> 16, 255 & var37, var37 >> 16, 100000, var39 >> 16, var25, var27, 255 & var38 >> 8, 255 & var39, var23, var24, var26);
            }
            var45++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_53_0 = var8_ref;
          stackIn_53_1 = new StringBuilder().append("eh.A(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    eh(int param0, int param1, int param2, int param3) {
        this.field_c = param3;
        this.field_e = param0;
    }

    final static int[] a(int param0) {
        if (param0 >= -110) {
          field_b = (String[]) null;
        }
        return new int[8];
    }

    final static void a(boolean param0) {
        if (sj.field_f == null) {
          return;
        }
        mh.a(sj.field_f, (byte) 112);
        sj.field_f.a((byte) -113, ck.field_e);
        sj.field_f = null;
        if (vd.field_b != null) {
          vd.field_b.a((byte) -84);
        }
        if (!param0) {
          jk var2 = (jk) null;
          eh.a((jk) null, 33, -117, 56, -22, 94, 101, 77);
        }
        ch.field_h.requestFocus();
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 <= 51) {
          eh.a(false);
        }
        field_a = (long[][]) null;
    }

    final static void a(String param0, byte param1) {
        try {
          if (param1 != 21) {
            field_d = (long[]) null;
          }
          kg.field_j = param0;
          oh.a(-92, 12);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "eh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_a = new long[8][256];
        field_d = new long[11];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) == 0 ? (long)(var1 >>> 8) : (long)(255 & var1);
            var4 = var2 << 1;
            if (!(var4 < 256L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_a[0][var0] = jd.a(var12, jd.a(jd.a(jd.a(jd.a(jd.a(var6 << 40, jd.a(var2 << 56, var2 << 48)), var2 << 32), var10 << 24), var8 << 16), var4 << 8));
            for (var14 = 1; var14 < 8; var14++) {
                field_a[var14][var0] = jd.a(field_a[var14 - 1][var0] << 56, field_a[-1 + var14][var0] >>> 8);
            }
            var0++;
        }
        field_d[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = var0 * 8 - 8;
            field_d[var0] = hf.a(tk.a(255L, field_a[7][7 + var1]), hf.a(tk.a(field_a[6][6 + var1], 65280L), hf.a(tk.a(field_a[5][5 + var1], 16711680L), hf.a(hf.a(hf.a(hf.a(tk.a(field_a[1][var1 + 1], 71776119061217280L), tk.a(-72057594037927936L, field_a[0][var1])), tk.a(280375465082880L, field_a[2][var1 + 2])), tk.a(1095216660480L, field_a[3][3 + var1])), tk.a(field_a[4][var1 + 4], 4278190080L)))));
        }
    }
}
