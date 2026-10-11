/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    int field_a;
    static ph field_e;
    static java.awt.Frame field_d;
    int field_b;
    static String field_c;

    final static ad[] b(int param0) {
        if (param0 == 65280) {
          return new ad[]{hl.field_c, am.field_b, tp.field_y, m.field_d, kj.field_p, u.field_U, og.field_c, ib.field_h, cm.field_T, ve.field_e, pm.field_l, hf.field_wb, sj.field_hb, lg.field_n};
        }
        return (ad[]) null;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, cn[] param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = DungeonAssault.field_K;
        try {
          if (param5 != null &&
            param0 > 0) {
            var6_int = param5[0].field_E;
            var8 = 96 / ((79 - param3) / 43);
            var7 = param5[2].field_E;
            var9 = param5[1].field_E;
            param5[0].a(param2, param1, param4);
            param5[2].a(-var7 + param2 + param0, param1, param4);
            gf.a(mk.field_i);
            gf.a(var6_int + param2, param1, param0 + param2 - var7, param5[1].field_G + param1);
            var10 = param2 + var6_int;
            var11 = param0 + (param2 - var7);
            for (param2 = var10; var11 > param2; param2 = param2 + var9) {
              param5[1].a(param2, param1, param4);
            }
            gf.b(mk.field_i);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ad.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 1) {
          return;
        }
        field_d = null;
        field_c = null;
    }

    ad(int param0, int param1, int param2, int param3) {
        this.field_b = param0;
        this.field_a = param3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, qh param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        sm stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
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
        sm var21 = null;
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
        int[] var41 = null;
        int var44 = 0;
        qh var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var14Lifetime3;
        int var15Lifetime2;
        var40 = DungeonAssault.field_K;
        try {
          var45 = param7;
          if (null != var45.field_y &&
            1 < var45.field_w) {
            var61 = var45.field_y;
            ll.a(0, var61, true, 0, hk.field_b);
          } else {
            sf.d(3);
          }
          var55 = new int[param7.field_c];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param7.field_c];
          var64 = hk.field_c;
          var63 = p.field_x;
          var62 = hd.field_j;
          for (var13 = 0; param7.field_c > var13; var13++) {
            var14 = param6 * var62[var13] + (param1 * var63[var13] + var64[var13] * param2) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_15_0 = 128;
            } else {
              if (var14 < 128) {
                stackIn_15_0 = 128 + var14;
              } else {
                stackIn_15_0 = 256;
              }
            }
            var14Lifetime3 = stackIn_15_0;
            var15 = var62[var13] * param3 + param0 * var63[var13] + var64[var13] * param5 >> 8;
            stackIn_17_0 = jk.field_Bb;
            if (0 <= var15) {
              stackIn_18_1 = var15;
            } else {
              stackIn_18_1 = -var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime3 = (-var15Lifetime2 + 256) * var14Lifetime3 >>> 8;
            var55[var13] = var14Lifetime3;
            var65[var13] = var15Lifetime2;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (ab.field_c > var44) {
            var14Lifetime1 = hf.field_yb[var44];
            var15Lifetime1 = param7.field_A[var14Lifetime1];
            var16 = param7.field_x[var14Lifetime1];
            var17 = param7.field_N[var14Lifetime1];
            if (param7.field_e[var14Lifetime1] >= hk.field_c.length) {
              stackIn_24_0 = -1;
            } else {
              stackIn_24_0 = param7.field_e[var14Lifetime1];
            }
            var18 = stackIn_24_0;
            if (hk.field_c.length <= param7.field_s[var14Lifetime1]) {
              stackIn_27_0 = -1;
            } else {
              stackIn_27_0 = param7.field_s[var14Lifetime1];
            }
            var19 = stackIn_27_0;
            if (param7.field_F[var14Lifetime1] < hk.field_c.length) {
              stackIn_30_0 = param7.field_F[var14Lifetime1];
            } else {
              stackIn_30_0 = -1;
            }
            var20 = stackIn_30_0;
            if (ch.field_n != null &&
              null != param7.field_o &&
              param7.field_o.length > var14Lifetime1 &&
              -1 != param7.field_o[var14Lifetime1] &&
              ch.field_n.length > param7.field_o[var14Lifetime1]) {
              stackIn_38_0 = ch.field_n[param7.field_o[var14Lifetime1]];
            } else {
              stackIn_38_0 = null;
            }
            var21 = stackIn_38_0;
            var22 = nj.field_g[var15Lifetime1];
            var23 = ra.field_b[var15Lifetime1];
            var24 = nj.field_g[var16];
            var25 = ra.field_b[var16];
            var26 = nj.field_g[var17];
            var27 = ra.field_b[var17];
            if (var19 == var18 &&
              var19 == var20) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 != null) {
                stackIn_43_0 = var21.field_d;
              } else {
                stackIn_43_0 = 8355711;
              }
              var30 = stackIn_43_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = var31 * var28 >>> 8 & -352386817 | (var32 * var28 & 16711692) >>> 8;
              var33 = var33 + 65793 * var29;
              kd.a(var24, var22, var26, var23, 29108, 8355711 & var33 >> 1, var27, var25);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 != null) {
                stackIn_47_0 = var21.field_d;
              } else {
                stackIn_47_0 = 8355711;
              }
              var34 = stackIn_47_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = 1040122111 & var35 * var28 >>> 8 | var28 * var36 >>> 8 & 218169088;
              var38 = -889257729 & var35 * var29 >>> 8 | (var29 * var36 & 16711759) >>> 8;
              var39 = var36 * var30 >>> 8 & -436142336 | (-16711837 & var30 * var35) >>> 8;
              var37 = var37 + var31 * 65793;
              var38 = var38 + 65793 * var32;
              var39 = var39 + var33 * 65793;
              fg.a(var27, var39 & 255, var25, var23, 255 & var37 >> 8, var39 >> 16, var38 >> 16, var39 >> 8 & 255, (var38 & 65466) >> 8, var37 >> 16, 255 & var38, var22, (byte) -86, 255 & var37, var24, var26);
            }
            var44++;
          }
          var14Lifetime2 = -34 / ((-24 - param4) / 58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_53_0 = var8_ref;
          stackIn_53_1 = new StringBuilder().append("ad.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    static {
        field_c = "Passwords can only contain letters and numbers";
    }
}
