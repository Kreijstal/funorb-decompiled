/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static int[] field_c;
    static kg field_b;
    static ib field_d;
    static String[] field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param4 != 4) {
          ma.b(-106, -9, -49, -84, -66, 38, -48, -59, 40, 43, -59, -6, -28, -30);
        }
        if (param1 >= param2) {
          if (param6 > param1) {
            ca.a(param7, param5, param2, param3, param0, param1, ge.field_i, -18427, param6);
          } else {
            if (param2 < param6) {
              ca.a(param7, param0, param2, param3, param5, param6, ge.field_i, param4 - 18431, param1);
            } else {
              ca.a(param7, param3, param6, param0, param5, param2, ge.field_i, param4 ^ -18431, param1);
            }
          }
        } else {
          if (param2 < param6) {
            ca.a(param7, param3, param1, param5, param0, param2, ge.field_i, -18427, param6);
          } else {
            if (param6 > param1) {
              ca.a(param7, param0, param1, param5, param3, param6, ge.field_i, -18427, param2);
            } else {
              ca.a(param7, param5, param6, param0, param3, param1, ge.field_i, param4 - 18431, param2);
            }
          }
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        le var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var11 = (CharSequence) ((Object) param2);
          var3_int = wg.a(false, var11, param1);
          if (param0 < 120) {
            var10 = (le) null;
            ma.a((le) null, -54, 47, -57, 64, -26);
          }
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param2.charAt(var8) != param1; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ma.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var24Lifetime2;
        int var24Lifetime1Lifetime1;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        for (var18 = param8; var18 < param9; var18++) {
          if (var16 < param5) {
            var19 = (var18 << 4) - param12;
            var20 = (var16 << param4) / param6;
            var21 = re.field_d[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > pc.field_R - 1) {
              var22 = pc.field_R - 1;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 < 0) {
              var23 = 0;
            }
            var24 = ge.field_i[var23 * pc.field_R + var22];
            var25 = 64;
            if (var25 < 0) {
              var25 = -var25;
            }
            var26 = (var24 & 16711935) * var25;
            var25 = (var24 & 65280) * var25;
            var24Lifetime2 = (var26 & 1069563840) + (var25 & 4177920);
            var26 = (var26 & -1073692672) + (var25 & 12582912);
            var26 = (var26 | var26 >>> 1) & 1077952512;
            incrementValue$1 = var15;
            var15++;
            ge.field_i[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
            var16 = var16 + var17;
            var17 = var17 + param3;
            continue;
          }
          break;
        }
        var15Lifetime1 = param11;
        var16Lifetime1 = param1;
        var17Lifetime1 = param2;
        for (var18Lifetime1 = param8 - 1; var18Lifetime1 >= param7; var18Lifetime1--) {
          var17Lifetime1 = var17Lifetime1 - param3;
          var16Lifetime1 = var16Lifetime1 - var17Lifetime1;
          if (var16Lifetime1 < param5) {
            var19Lifetime1 = (var18Lifetime1 << 4) - param12;
            var20Lifetime1 = (var16Lifetime1 << param4) / param6;
            var21Lifetime1 = re.field_d[var20Lifetime1] * param10 >> 15;
            var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
            if (var22Lifetime1 < 0) {
              var22Lifetime1 = 0;
            }
            var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
            if (var23Lifetime1 < 0) {
              var23Lifetime1 = 0;
            }
            var24Lifetime1 = ge.field_i[var23Lifetime1 * pc.field_R + var22Lifetime1];
            var25Lifetime1 = 64;
            if (var25Lifetime1 < 0) {
              var25Lifetime1 = -var25Lifetime1;
            }
            var26Lifetime1 = (var24Lifetime1 & 16711935) * var25Lifetime1;
            var25Lifetime1 = (var24Lifetime1 & 65280) * var25Lifetime1;
            var24Lifetime1Lifetime1 = (var26Lifetime1 & 1069563840) + (var25Lifetime1 & 4177920);
            var26Lifetime1 = (var26Lifetime1 & -1073692672) + (var25Lifetime1 & 12582912);
            var26Lifetime1 = (var26Lifetime1 | var26Lifetime1 >>> 1) & 1077952512;
            var15Lifetime1--;
            ge.field_i[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
            continue;
          }
          break;
        }
    }

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
        }
        if (param0) {
          var4 += 2;
        }
        if (param1 <= 102) {
          le var5 = (le) null;
          ma.a((le) null, 33, -88, 56, 51, -105);
        }
        if (param3) {
          var4++;
        }
        return qh.field_c[var4];
    }

    final static le a(ad param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        le stackIn_2_0 = null;
        le stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 16711680) {
            stackIn_2_0 = (le) null;
            return stackIn_2_0;
          }
          var4_int = param0.c(param3, (byte) -105);
          var5 = param0.a(param1, var4_int, -28459);
          stackIn_4_0 = kj.a(var5, param0, 17196, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ma.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var28 = 0;
        int var4 = param2 * param2;
        int var5 = param0 - param2 >> 4;
        int var6 = param0 + 15 >> 4;
        int var7 = param0 + param2 + 15 >> 4;
        int var8 = param1 - param2 >> 4;
        int var9 = param1 + 15 >> 4;
        int var10 = param1 + param2 + 15 >> 4;
        int var28Lifetime1;
        if (var5 < 0) {
          var5 = 0;
        }
        if (var7 > pc.field_R) {
          var7 = pc.field_R;
        }
        if (var8 < 0) {
          var8 = 0;
        }
        if (var10 > ge.field_g) {
          var10 = ge.field_g;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        if (var6 > pc.field_R) {
          var6 = pc.field_R;
        }
        if (var9 < 0) {
          var9 = 0;
        }
        if (var9 > ge.field_g) {
          var9 = ge.field_g;
        }
        int var11 = (var6 << 4) - param0;
        var11 = var11 * var11;
        int var12 = (var6 + 1 << 4) - param0;
        var12 = var12 * var12;
        int var13 = (var6 + 2 << 4) - param0;
        var13 = var13 * var13;
        int var14 = var12 - var11;
        int var15 = var13 - var12;
        int var16 = var15 - var14;
        int var17 = (var9 << 4) - param1;
        var17 = var17 * var17;
        int var18 = (var9 + 1 << 4) - param1;
        var18 = var18 * var18;
        int var19 = (var9 + 2 << 4) - param1;
        var19 = var19 * var19;
        int var20 = var18 - var17;
        int var21 = var19 - var18;
        int var22 = var21 - var20;
        int var23 = 16;
        int var24 = var4;
        while (var4 > 2147483647 >>> var23) {
          var23--;
          var24 = var24 + 1 >>> 1;
        }
        int var25 = var9 * pc.field_R + var6;
        int var26 = var11 + var17;
        int var27 = var20;
        for (var28 = var9; var28 < var10; var28++) {
          ma.b(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
          var26 = var26 + var27;
          var27 = var27 + var22;
          var25 = var25 + pc.field_R;
        }
        var25 = var9 * pc.field_R + var6;
        var26 = var11 + var17;
        var27 = var20;
        for (var28Lifetime1 = var9 - 1; var28Lifetime1 >= var8; var28Lifetime1--) {
          var27 = var27 - var22;
          var26 = var26 - var27;
          var25 = var25 - pc.field_R;
          ma.a(var28Lifetime1, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
        }
    }

    final static void a(le param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var6 = param5 - param4;
        int var7 = param2;
        int var8 = 0;
        while (var7 < param3 + param2) {
          var9 = param4 + var8 * var6 / param3;
          if (var9 < 0) {
            break;
          }
          ge.h(0, var7, 640, var7 + 2);
          param0.b(param1, param2, var9);
          var7 += 2;
          var8 += 2;
        }
        ge.h(0, 0, 640, 480);
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var24Lifetime2;
        int var24Lifetime1Lifetime1;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        for (var18 = param8; var18 < param9; var18++) {
          if (var16 < param5) {
            var19 = (var18 << 4) - param12;
            var20 = (var16 << param4) / param6;
            var21 = re.field_d[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > pc.field_R - 1) {
              var22 = pc.field_R - 1;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 > ge.field_g - 1) {
              var23 = ge.field_g - 1;
            }
            var24 = ge.field_i[var23 * pc.field_R + var22];
            var25 = 64;
            if (var25 < 0) {
              throw new Error();
            }
            var26 = (var24 & 16711935) * var25;
            var25 = (var24 & 65280) * var25;
            var24Lifetime2 = (var26 & 1069563840) + (var25 & 4177920);
            var26 = (var26 & -1073692672) + (var25 & 12582912);
            var26 = (var26 | var26 >>> 1) & 1077952512;
            incrementValue$1 = var15;
            var15++;
            ge.field_i[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
            var16 = var16 + var17;
            var17 = var17 + param3;
            continue;
          }
          break;
        }
        var15Lifetime1 = param11;
        var16Lifetime1 = param1;
        var17Lifetime1 = param2;
        for (var18Lifetime1 = param8 - 1; var18Lifetime1 >= param7; var18Lifetime1--) {
          var17Lifetime1 = var17Lifetime1 - param3;
          var16Lifetime1 = var16Lifetime1 - var17Lifetime1;
          if (var16Lifetime1 < param5) {
            var19Lifetime1 = (var18Lifetime1 << 4) - param12;
            var20Lifetime1 = (var16Lifetime1 << param4) / param6;
            var21Lifetime1 = re.field_d[var20Lifetime1] * param10 >> 15;
            var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
            if (var22Lifetime1 < 0) {
              var22Lifetime1 = 0;
            }
            var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
            if (var23Lifetime1 > ge.field_g - 1) {
              var23Lifetime1 = ge.field_g - 1;
            }
            var24Lifetime1 = ge.field_i[var23Lifetime1 * pc.field_R + var22Lifetime1];
            var25Lifetime1 = 64;
            if (var25Lifetime1 < 0) {
              var25Lifetime1 = -var25Lifetime1;
            }
            var26Lifetime1 = (var24Lifetime1 & 16711935) * var25Lifetime1;
            var25Lifetime1 = (var24Lifetime1 & 65280) * var25Lifetime1;
            var24Lifetime1Lifetime1 = (var26Lifetime1 & 1069563840) + (var25Lifetime1 & 4177920);
            var26Lifetime1 = (var26Lifetime1 & -1073692672) + (var25Lifetime1 & 12582912);
            var26Lifetime1 = (var26Lifetime1 | var26Lifetime1 >>> 1) & 1077952512;
            var15Lifetime1--;
            ge.field_i[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
            continue;
          }
          break;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var13;
        int var14;
        int var15;
        int var16;
        int var14Lifetime1;
        int var14Lifetime2;
        var7 = param6 - param5;
        var8 = 0;
        var9 = param2;
        var10 = 0;
        while (var9 < param4 + param2) {
          var11 = param5 + var10 * var7 / param4;
          if (var11 != 0) {
            for (var12 = param1; var12 < param3 + param1; var12++) {
              if (param0[var8] != 0) {
                var13 = var12 + var9 * ge.field_h;
                var14 = 16711935 * var11;
                var15 = (var14 & -16711936) + (16777215 * var11 - var14 & 16711680) >>> 8;
                var14Lifetime1 = ge.field_i[var13];
                var16 = var15 + var14Lifetime1;
                var15 = (var15 & 16711935) + (var14Lifetime1 & 16711935);
                var14Lifetime2 = (var15 & 16777472) + (var16 - var15 & 65536);
                ge.f(var12, var9, 1, var16 - var14Lifetime2 | var14Lifetime2 - (var14Lifetime2 >>> 8));
              }
              var8++;
            }
          }
          var9++;
          var10++;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
        int var1 = -108 / ((-67 - param0) / 53);
    }

    static {
        field_c = new int[12];
        field_b = new kg();
        field_d = new ib();
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$feb7e63b59d8(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
        }
        if (param0) {
          var4 += 2;
        }
        if (param1 <= 102) {
          le var5 = (le) null;
          ma.a((le) null, 33, -88, 56, 51, -105);
        }
        if (param3) {
          var4++;
        }
        return qh.field_c[var4];
    }
}
