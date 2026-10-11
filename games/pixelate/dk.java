/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static tf[][] field_a;
    static boolean field_b;
    static int field_d;
    static tf field_e;
    static boolean field_c;
    static String field_f;

    final static tf a(int param0, fm param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        tf stackIn_5_0 = null;
        tf stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!rk.a(param0, false, param1, param2)) {
            stackIn_2_0 = null;
            return (tf) (stackIn_2_0);
          }
          if (param3 == -1) {
            stackIn_7_0 = ca.a(0);
            return stackIn_7_0;
          }
          stackIn_5_0 = (tf) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("dk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(String param0, int param1, String param2, fm param3) {
        RuntimeException var4 = null;
        fm var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3.b(-3)) {
            stackIn_2_0 = (String) (param2);
            return stackIn_2_0;
          }
          if (param1 != 0) {
            var5 = (fm) null;
            dk.a(-69, (fm) null, 92, 117);
          }
          stackIn_6_0 = param0 + " - " + param3.c(0) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("dk.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        if (param0 >= -81) {
          fm var2 = (fm) null;
          dk.a((String) null, 119, (String) null, (fm) null);
        }
        field_a = (tf[][]) null;
    }

    final static void a(boolean param0, fm param1) {
        int var3 = 0;
        int var4 = 0;
        rl var5 = null;
        int[] var6 = null;
        int var7 = 0;
        tf[] var8 = null;
        pc var9 = null;
        int var10 = 0;
        pc var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          var9 = new pc(param1.a((byte) 24, "", "logo.fo3d"));
          var11 = var9;
          var3 = var11.f(255);
          var11.n(-110);
          qn.field_q = pf.a(var11, (byte) 77);
          ck.field_b = new rl[var3];
          wc.field_p = new int[var3][];
          for (var4 = 0; var3 > var4; var4++) {
            ck.field_b[var4] = pk.a(var9, -1);
          }
          var11.o(7);
          var10 = 0;
          var4Lifetime1 = var10;
          while (var10 < var3) {
            var5 = ck.field_b[var10];
            var5.a(6, 6, 6, true, 1);
            var5.a((byte) -17);
            var6 = new int[]{var5.field_b + var5.field_c >> 1, var5.field_F + var5.field_t >> 1, var5.field_x + var5.field_g >> 1};
            wc.field_p[var10] = var6;
            var5.a(-var6[0], -var6[2], -var6[1], (byte) -83);
            var10++;
          }
          if (param0) {
            var8 = (tf[]) null;
            dk.a(53, -11, (byte) -74, -9, -26, (tf[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("dk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, tf[] param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = Pixelate.field_H ? 1 : 0;
        try {
          if (param5 == null) {
            return;
          }
          if (param0 > 0 &&
            param3 > 0) {
            if (null == param5[3]) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param5[3].field_A;
            }
            var6_int = stackIn_10_0;
            if (param5[5] != null) {
              stackIn_13_0 = param5[5].field_A;
            } else {
              stackIn_13_0 = 0;
            }
            var7 = stackIn_13_0;
            if (param5[1] != null) {
              stackIn_16_0 = param5[1].field_B;
            } else {
              stackIn_16_0 = 0;
            }
            var8 = stackIn_16_0;
            if (null == param5[7]) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = param5[7].field_B;
            }
            var9 = stackIn_19_0;
            var10 = param0 + param1;
            var11 = param3 + param4;
            var12 = var6_int + param1;
            var13 = var10 - var7;
            var14 = var8 + param4;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param1 + var6_int * param0 / (var6_int + var7);
              var16 = param1 + var6_int * param0 / (var6_int + var7);
            }
            var18 = var14;
            var19 = var15;
            t.a(qk.field_c);
            if (var18 > var19) {
              var19 = param3 * var8 / (var9 + var8) + param4;
              var18 = param3 * var8 / (var9 + var8) + param4;
            }
            if (null != param5[0]) {
              t.d(param1, param4, var16, var18);
              param5[0].b(param1, param4);
              t.b(qk.field_c);
            }
            if (param5[2] != null) {
              t.d(var17, param4, var10, var18);
              param5[2].b(var13, param4);
              t.b(qk.field_c);
            }
            if (param2 != 75) {
              return;
            }
            if (param5[6] != null) {
              t.d(param1, var19, var16, var11);
              param5[6].b(param1, var15);
              t.b(qk.field_c);
            }
            if (null != param5[8]) {
              t.d(var17, var19, var10, var11);
              param5[8].b(var13, var15);
              t.b(qk.field_c);
            }
            if (param5[1] != null &&
              0 != param5[1].field_A) {
              t.d(var16, param4, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param5[1].field_A) {
                param5[1].b(var20, param4);
              }
              t.b(qk.field_c);
            }
            if (null != param5[7] &&
              param5[7].field_A != 0) {
              t.d(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param5[7].field_A) {
                param5[7].b(var20Lifetime1, var15);
              }
              t.b(qk.field_c);
            }
            if (param5[3] != null &&
              param5[3].field_B != 0) {
              t.d(param1, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param5[3].field_B) {
                param5[3].b(param1, var20Lifetime2);
              }
              t.b(qk.field_c);
            }
            if (null != param5[5] &&
              param5[5].field_B != 0) {
              t.d(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param5[5].field_B) {
                param5[5].b(var13, var20Lifetime3);
              }
              t.b(qk.field_c);
            }
            if (param5[4] != null &&
              param5[4].field_A != 0 &&
              0 != param5[4].field_B) {
              t.d(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param5[4].field_B) {
                for (var21 = var12; var13 > var21; var21 = var21 + param5[4].field_A) {
                  param5[4].b(var21, var20Lifetime4);
                }
              }
              t.b(qk.field_c);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_75_0 = var6;
          stackIn_75_1 = new StringBuilder().append("dk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    static {
        field_b = false;
        field_f = "(Including <%0>)";
        field_c = false;
    }
}
