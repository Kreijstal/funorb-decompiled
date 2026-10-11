/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static int field_b;
    static int[] field_a;

    final static void a(int param0) {
        if (mf.field_s != null) {
          mf.field_s.e((byte) -110);
        }
        if (nl.field_a != null) {
          nl.field_a.e(true);
        }
        ve.a((byte) -83);
        if (param0 != 0) {
          int[] var2 = (int[]) null;
          rf.a(68, 64, -107, -67, 75, 111, (int[]) null, 29, -61, 73, -123, 102, -38, 93);
        }
    }

    final static mh a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        mh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          var2_int = param1.length();
          var3 = 0;
          if (param0 != -1723) {
            field_b = -18;
          }
          while (true) {
            if (var2_int <= var3) {
              stackIn_11_0 = jg.field_h;
              return stackIn_11_0;
            }
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_8_0 = null;
          return (mh) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("rf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int var15 = 0;
        int var7 = param2 - param0;
        int var8 = param3 - param1;
        int var9 = (int)Math.sqrt((double)(var7 * var7 + var8 * var8));
        int var10 = (int)(65536.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
        int var15Lifetime1;
        var7 = var7 * var10;
        var8 = var8 * var10;
        int var11 = param0;
        int var12 = param1;
        int var13 = param2;
        int var14 = param3;
        if (var11 > var13) {
          var15 = var11;
          var11 = var13;
          var13 = var15;
        }
        if (var12 > var14) {
          var15Lifetime1 = var12;
          var12 = var14;
          var14 = var15Lifetime1;
        }
        var11 = var11 - param4;
        var12 = var12 - param4;
        var13 = var13 + param4;
        var14 = var14 + param4;
        if (var11 < ra.field_j) {
          var11 = ra.field_j;
        }
        if (var12 < ra.field_i) {
          var12 = ra.field_i;
        }
        if (var13 > ra.field_l) {
          var13 = ra.field_l;
        }
        if (var14 > ra.field_g) {
          var14 = ra.field_g;
        }
        dk.field_b = 256 / param4;
        ng.field_n = param5 * 128 / param4;
        kl.field_b = (var12 - param1) * var7;
        ud.field_Sb = (var12 - param1) * var8;
        ic.field_e = (var11 - param0) * var7;
        bj.field_b = (var11 - param0) * var8;
        bg.field_k = param6;
        rf.a(param0, param1, param4, 0, 0, var9, ra.field_b, var12 * ra.field_f + var11, param5, var7, var8, var12 - var14, var11 - var13, ra.field_f - (var13 - var11));
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
            var21 = ce.field_e[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > 639) {
              var22 = 639;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 < 0) {
              var23 = 0;
            }
            var24 = ra.field_b[var23 * 640 + var22];
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
            ra.field_b[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
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
          if (var16Lifetime1 >= param5) {
            return;
          }
          var19Lifetime1 = (var18Lifetime1 << 4) - param12;
          var20Lifetime1 = (var16Lifetime1 << param4) / param6;
          var21Lifetime1 = ce.field_e[var20Lifetime1] * param10 >> 15;
          var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
          if (var22Lifetime1 < 0) {
            var22Lifetime1 = 0;
          }
          var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
          if (var23Lifetime1 < 0) {
            var23Lifetime1 = 0;
          }
          var24Lifetime1 = ra.field_b[var23Lifetime1 * 640 + var22Lifetime1];
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
          ra.field_b[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
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
        if (var7 > 640) {
          var7 = 640;
        }
        if (var8 < 0) {
          var8 = 0;
        }
        if (var10 > ra.field_e) {
          var10 = ra.field_e;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        if (var6 > 640) {
          var6 = 640;
        }
        if (var9 < 0) {
          var9 = 0;
        }
        if (var9 > ra.field_e) {
          var9 = ra.field_e;
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
        int var25 = var9 * 640 + var6;
        int var26 = var11 + var17;
        int var27 = var20;
        for (var28 = var9; var28 < var10; var28++) {
          rf.a(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
          var26 = var26 + var27;
          var27 = var27 + var22;
          var25 += 640;
        }
        var25 = var9 * 640 + var6;
        var26 = var11 + var17;
        var27 = var20;
        for (var28Lifetime1 = var9 - 1; var28Lifetime1 >= var8; var28Lifetime1--) {
          var27 = var27 - var22;
          var26 = var26 - var27;
          var25 -= 640;
          rf.b(var28Lifetime1, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
        }
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = -112 % ((79 - param0) / 43);
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
            var21 = ce.field_e[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > 639) {
              var22 = 639;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 > ra.field_e - 1) {
              var23 = ra.field_e - 1;
            }
            var24 = ra.field_b[var23 * 640 + var22];
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
            ra.field_b[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
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
          if (var16Lifetime1 >= param5) {
            return;
          }
          var19Lifetime1 = (var18Lifetime1 << 4) - param12;
          var20Lifetime1 = (var16Lifetime1 << param4) / param6;
          var21Lifetime1 = ce.field_e[var20Lifetime1] * param10 >> 15;
          var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
          if (var22Lifetime1 < 0) {
            var22Lifetime1 = 0;
          }
          var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
          if (var23Lifetime1 > ra.field_e - 1) {
            var23Lifetime1 = ra.field_e - 1;
          }
          var24Lifetime1 = ra.field_b[var23Lifetime1 * 640 + var22Lifetime1];
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
          ra.field_b[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int var14;
        while (param11 < 0) {
          io.field_i = ic.field_e;
          nj.field_g = bj.field_b;
          var14 = param12;
          while (var14 < 0) {
            param1 = nj.field_g - kl.field_b >> 16;
            if (param1 >= -param2 &&
              param1 <= param2) {
              param0 = io.field_i + ud.field_Sb >> 16;
              if (param0 >= -param2 &&
                param0 <= param5 + param2) {
                if (param0 >= param2) {
                  if (param0 <= param5 - param2) {
                    stackIn_16_0 = param8;
                  } else {
                    stackIn_16_0 = (param5 + param2 - param0) * ng.field_n >> 8;
                  }
                } else {
                  stackIn_16_0 = (param0 + param2) * ng.field_n >> 8;
                }
                param3 = stackIn_16_0;
                param4 = param1 * param3 * dk.field_b >> 8;
                if (param4 < 0) {
                  stackIn_19_0 = bg.field_k[param3 + param4];
                } else {
                  stackIn_19_0 = bg.field_k[param3 - param4];
                }
                param1 = stackIn_19_0;
                param0 = param6[param7];
                param3 = param1 + param0;
                param1 = (param1 & 16711935) + (param0 & 16711935);
                param0 = (param1 & 16777472) + (param3 - param1 & 65536);
                param6[param7] = param3 - param0 | param0 - (param0 >>> 8);
              }
            }
            var14++;
            param7++;
            io.field_i = io.field_i + param9;
            nj.field_g = nj.field_g + param10;
          }
          param7 = param7 + param13;
          param11++;
          kl.field_b = kl.field_b + param9;
          ud.field_Sb = ud.field_Sb + param10;
        }
    }

    static {
        field_b = 0;
        field_a = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
