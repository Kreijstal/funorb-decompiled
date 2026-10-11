/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends gn {
    static byte[] field_k;
    int field_i;
    int field_h;
    int field_e;
    String field_j;
    static String[] field_g;
    static vs[] field_f;

    final static void a(int param0, int param1, nl param2, int param3) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param3 < 20) {
            param3 = 20;
          }
          if (param3 > 1324) {
            param3 = 1324;
          }
          if (param2.a(true) > 10 + param3) {
            param2.field_G = param2.field_G | 4;
          }
          if (-10 + param3 > param2.a(true)) {
            param2.field_G = param2.field_G | 1;
          }
          if (param2.f(-113) > 10 + param1) {
            param2.field_G = param2.field_G | 2;
          }
          if (-10 + param1 > param2.f(-98)) {
            param2.field_G = param2.field_G | 8;
          }
          if (param0 != 4) {
            field_g = (String[]) null;
          }
          if (param1 > param2.f(param0 ^ -97)) {
            param2.field_G = param2.field_G & -3;
          }
          if (param1 < param2.f(param0 ^ -118)) {
            param2.field_G = param2.field_G & -9;
          }
          if (param2.a(true) < param3) {
            param2.field_G = param2.field_G & -5;
          }
          if (param3 < param2.a(true)) {
            param2.field_G = param2.field_G & -2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("ue.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_k = null;
        field_g = null;
        if (param0 <= 9) {
          String var2 = (String) null;
          ue.a((String) null, (byte) -102);
        }
    }

    final static void a(int param0, int param1, int param2) {
        qb var4 = null;
        ml var5 = null;
        int var3 = 35 / ((23 - param1) / 35);
        if (jm.field_h != param0) {
          var4 = (qb) (sr.field_f.a(-3611, (long)jm.field_h));
          if (var4 != null) {
            var4.field_Kb = null;
          }
          jm.field_h = param0;
          var5 = or.field_d;
          var5.b(param2, (byte) -61);
          var5.a(107, 3);
          var5.a(118, 11);
          var5.g(-1207444472, param0);
        }
    }

    final static void a(byte param0) {
        int stackIn_24_0 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_27_2 = 0;
        cn stackIn_31_0 = null;
        String stackIn_32_1 = null;
        int[] stackIn_35_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_51_3;
        int stackIn_54_0 = 0;
        int stackIn_55_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var5Lifetime1;
        int var7Lifetime1;
        var11 = Kickabout.field_G;
        try {
          if (40 > jo.field_F.field_X.field_m) {
            return;
          }
          var1_int = -40 + jo.field_F.field_X.field_m;
          var2 = 69;
          if (var1_int < 30) {
            var2 = var1_int * 69 / 30;
          }
          if (var1_int > 175) {
            var2 = (14145 - var1_int * 69) / 30;
          }
          if (param0 <= 47) {
            var12 = (String) null;
            ue.a((String) null, (byte) -120);
          }
          pt.a(640, -22914, 0, 229 + var2, -var2 + 229);
          on.a(0, 229 - var2, 640, var2 << 1, 0, 128);
          if (var1_int >= 30) {
            var1_int -= 30;
            var3 = 256;
            if (25 > var1_int) {
              var3 = (var1_int << 8) / 25;
            }
            if (var1_int > 150) {
              var3 = (-var1_int + 175 << 8) / 25;
            }
            var4 = 115;
            if (75 >= var1_int) {
              if (var1_int > 50) {
                var5 = 65536 - we.a((-25 + (var1_int - 25) << 12) / 25, false);
                var4 = var4 - (115 * var5 >> 17);
              }
            } else {
              var4 = 0;
            }
            stackIn_24_0 = (k.field_g != 1) ? 0 : 1;
            var5Lifetime1 = stackIn_24_0;
            var14 = new int[2];
            var13 = var14;
            var6 = var13;
            stackIn_26_0 = var6;
            stackIn_26_1 = 0;
            if (var5Lifetime1 == 0) {
              stackIn_27_2 = 120;
            } else {
              stackIn_27_2 = 520;
            }
            stackIn_26_0[stackIn_26_1] = stackIn_27_2;
            var6[1] = 640 - var14[0];
            for (var7 = 0; var7 < 2; var7++) {
              stackIn_31_0 = un.field_d;
              if (var7 != 0) {
                stackIn_32_1 = nu.field_a;
              } else {
                stackIn_32_1 = he.field_Ub;
              }
              ((cn) (Object) stackIn_31_0).d(((String) (Object) stackIn_32_1).toUpperCase(), var14[var7], 290, 16777215, -1);
              nb.field_j[var7].f(var14[var7] - 50, 170);
            }
            tb.field_q[10].c(285, 180, var3);
            stackIn_35_0 = jo.field_F.field_X.field_j;
            if (var5Lifetime1 == 0) {
              stackIn_36_1 = 0;
            } else {
              stackIn_36_1 = 1;
            }
            var7Lifetime1 = stackIn_35_0[stackIn_36_1];
            stackIn_38_0 = jo.field_F.field_X.field_j;
            if (var5Lifetime1 != 0) {
              stackIn_39_1 = 0;
            } else {
              stackIn_39_1 = 1;
            }
            var8 = stackIn_38_0[stackIn_39_1];
            var9 = 0;
            var10 = 0;
            if (var7Lifetime1 > 99) {
              var9 = 1;
              var7Lifetime1 = 99;
            }
            if (var8 > 99) {
              var10 = 1;
              var8 = 99;
            }
            stackIn_47_0 = (var5Lifetime1 == 0) ? 0 : 1;
            if (stackIn_47_0 != jo.field_F.field_X.field_n) {
              iq.$cfr$intArgs$a$8e2a9e3a0d15(-91, 180, 295, var7Lifetime1, var3);
              f.$cfr$intArgs$a$8e2a9e3a0d15(125, var8, var3, var4 + 180, 355);
              stackIn_54_0 = 122;
              if (var10 == 0) {
                stackIn_55_1 = var8 - 1;
              } else {
                stackIn_55_1 = var8;
              }
              f.$cfr$intArgs$a$8e2a9e3a0d15(stackIn_54_0, stackIn_55_1, var3, 180 + (var4 - 115), 355);
            } else {
              iq.$cfr$intArgs$a$8e2a9e3a0d15(-72, var4 + 180, 295, var7Lifetime1, var3);
              stackIn_50_0 = -69;
              stackIn_50_1 = 180 + var4 - 115;
              stackIn_50_2 = 295;
              if (var9 != 0) {
                stackIn_51_3 = var7Lifetime1;
              } else {
                stackIn_51_3 = var7Lifetime1 - 1;
              }
              iq.$cfr$intArgs$a$8e2a9e3a0d15(stackIn_50_0, stackIn_50_1, stackIn_50_2, stackIn_51_3, var3);
              f.$cfr$intArgs$a$8e2a9e3a0d15(119, var8, var3, 180, 355);
            }
          }
          ta.e(121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "ue.D(" + param0 + ')');
        }
    }

    final static String f(byte param0) {
        if (param0 < 78) {
          return (String) null;
        }
        if (ow.field_e == null) {
          return "";
        }
        return ow.field_e;
    }

    final static void a(String param0, byte param1) {
        try {
          int var2_int = 99 / ((48 - param1) / 59);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ue.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ue() {
    }

    static {
        field_g = new String[]{"The Leagues", "The Diamond Division"};
    }
}
