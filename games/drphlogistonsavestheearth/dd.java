/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends u {
    static boolean field_j;
    static String field_o;
    private String field_i;
    static int field_l;
    static int[] field_k;
    static int[] field_h;
    static String field_n;
    private String field_m;
    static ah field_g;

    final db b(byte param0) {
        if (param0 != -98) {
          this.b((byte) 93);
        }
        return ll.field_p;
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
          return;
        }
        field_h = null;
        field_k = null;
        field_n = null;
        field_o = null;
    }

    final void a(od param0, int param1) {
        try {
          param0.a(-23805, this.field_m);
          if (param1 < 19) {
            dd.a(true);
          }
          param0.b(1, this.field_i);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "dd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          if (param0 < 44) {
            dd.a(false);
          }
          aj.field_c = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          jk.a(0, var3, var4, param1, var2);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "dd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dd(String param0, String param1) {
        try {
          this.field_i = param1;
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, ja param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        ej stackIn_39_0 = null;
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
        ej var21 = null;
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
        ja var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var44 = param7;
          if (var44.field_O != null &&
            var44.field_G > 1) {
            var60 = var44.field_O;
            li.a(var60, 63, uh.field_h, 0, 0);
          } else {
            qb.a(0);
          }
          var54 = new int[param7.field_H];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param7.field_H];
          var62 = jd.field_L;
          if (param6 != -81) {
            field_g = (ah) null;
          }
          var61 = k.field_I;
          var63 = field_k;
          for (var13 = 0; param7.field_H > var13; var13++) {
            var14 = param0 * var61[var13] + (param3 * var62[var13] + var63[var13] * param4) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_17_0 = 128;
            } else {
              if (var14 >= 128) {
                stackIn_17_0 = 256;
              } else {
                stackIn_17_0 = 128 + var14;
              }
            }
            var14Lifetime2 = stackIn_17_0;
            var15 = param2 * var63[var13] + param5 * var62[var13] + var61[var13] * param1 >> 8;
            stackIn_19_0 = fc.field_b;
            if (var15 >= 0) {
              stackIn_20_1 = var15;
            } else {
              stackIn_20_1 = -var15;
            }
            var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; eg.field_i > var13Lifetime1; var13Lifetime1++) {
            var14Lifetime1 = p.field_c[var13Lifetime1];
            var15Lifetime1 = param7.field_h[var14Lifetime1];
            var16 = param7.field_a[var14Lifetime1];
            var17 = param7.field_K[var14Lifetime1];
            if (jd.field_L.length <= param7.field_A[var14Lifetime1]) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = param7.field_A[var14Lifetime1];
            }
            var18 = stackIn_26_0;
            if (jd.field_L.length <= param7.field_l[var14Lifetime1]) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param7.field_l[var14Lifetime1];
            }
            var19 = stackIn_29_0;
            if (jd.field_L.length > param7.field_e[var14Lifetime1]) {
              stackIn_32_0 = param7.field_e[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            var20 = stackIn_32_0;
            if (dm.field_B != null &&
              param7.field_M != null &&
              var14Lifetime1 < param7.field_M.length &&
              param7.field_M[var14Lifetime1] != -1 &&
              param7.field_M[var14Lifetime1] < dm.field_B.length) {
              stackIn_39_0 = dm.field_B[param7.field_M[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = fa.field_j[var15Lifetime1];
            var23 = gf.field_p[var15Lifetime1];
            var24 = fa.field_j[var16];
            var25 = gf.field_p[var16];
            var26 = fa.field_j[var17];
            var27 = gf.field_p[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_44_0 = 8355711;
              } else {
                stackIn_44_0 = var21.field_d;
              }
              var30 = stackIn_44_0;
              var31 = var30 & 16711935;
              var32 = 65280 & var30;
              var33 = -620822273 & var28 * var31 >>> 8 | var28 * var32 >>> 8 & -486473984;
              var33 = var33 + var29 * 65793;
              kc.a(var33 >> 1 & 8355711, var22, var24, var25, var27, var23, var26, 28183);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 == null) {
                stackIn_48_0 = 8355711;
              } else {
                stackIn_48_0 = var21.field_d;
              }
              var34 = stackIn_48_0;
              var35 = var34 & 16711935;
              var36 = var34 & 65280;
              var37 = 1895760127 & var28 * var35 >>> 8 | (var36 * var28 & 16711786) >>> 8;
              var38 = 1627324671 & var29 * var35 >>> 8 | var29 * var36 >>> 8 & -1845428480;
              var39 = (-16711848 & var30 * var35) >>> 8 | (var30 * var36 & 16711791) >>> 8;
              var37 = var37 + var31 * 65793;
              var38 = var38 + var32 * 65793;
              var39 = var39 + var33 * 65793;
              ie.a(var24, var23, (var39 & 65516) >> 8, var22, (byte) -38, var37 >> 8 & 255, var38 >> 16, var37 & 255, var37 >> 16, var39 >> 16, 255 & var39, (var38 & 65513) >> 8, 255 & var38, var25, var27, var26);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_53_0 = var8_ref;
          stackIn_53_1 = new StringBuilder().append("dd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    static {
        field_l = 0;
        field_o = "Service unavailable";
        field_k = new int[8192];
        field_h = new int[]{30, 14, 5, 0, 8, 0, 0, 0, 0, 0, 0, 6, 0, 56, 54, 1, 6, 3, 2, 25, 25, 25, 25, 25, 25, 25, 25, 56, 0, 56, 25, 0, 0, 0, 0, 30, 0, 0, 14, 5, 8, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 25, 56, 25, 56, 25};
        field_n = "Unfortunately we are unable to create an account for you at this time.";
    }
}
