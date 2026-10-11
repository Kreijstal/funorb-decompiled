/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_b;
    int field_a;
    static int field_c;
    static int field_d;

    final static void a(dd[] param0, byte param1, int param2, int param3, int param4, int param5) {
        int var22 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
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
        int var21 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        try {
          if (param0 == null) {
            return;
          }
          if (param2 > 0 &&
            param5 > 0) {
            if (null != param0[3]) {
              stackIn_9_0 = param0[3].field_w;
            } else {
              stackIn_9_0 = 0;
            }
            var6_int = stackIn_9_0;
            if (param0[5] != null) {
              stackIn_12_0 = param0[5].field_w;
            } else {
              stackIn_12_0 = 0;
            }
            var7 = stackIn_12_0;
            if (null == param0[1]) {
              stackIn_15_0 = 0;
            } else {
              stackIn_15_0 = param0[1].field_y;
            }
            var8 = stackIn_15_0;
            if (param0[7] == null) {
              stackIn_18_0 = 0;
            } else {
              stackIn_18_0 = param0[7].field_y;
            }
            var9 = stackIn_18_0;
            var10 = param2 + param3;
            var11 = param4 + param5;
            var12 = param3 + var6_int;
            var13 = var10 - var7;
            var14 = param4 + var8;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            var19 = 52 % ((param1 + 35) / 37);
            if (var16 > var17) {
              var17 = var6_int * param2 / (var7 + var6_int) + param3;
              var16 = var6_int * param2 / (var7 + var6_int) + param3;
            }
            var18 = var14;
            var20 = var15;
            if (var20 < var18) {
              var20 = param5 * var8 / (var8 + var9) + param4;
              var18 = param5 * var8 / (var8 + var9) + param4;
            }
            qh.a(mb.field_b);
            if (null != param0[0]) {
              qh.d(param3, param4, var16, var18);
              param0[0].c(param3, param4);
              qh.b(mb.field_b);
            }
            if (param0[2] != null) {
              qh.d(var17, param4, var10, var18);
              param0[2].c(var13, param4);
              qh.b(mb.field_b);
            }
            if (param0[6] != null) {
              qh.d(param3, var20, var16, var11);
              param0[6].c(param3, var15);
              qh.b(mb.field_b);
            }
            if (null != param0[8]) {
              qh.d(var17, var20, var10, var11);
              param0[8].c(var13, var15);
              qh.b(mb.field_b);
            }
            if (null != param0[1] &&
              param0[1].field_w != 0) {
              qh.d(var16, param4, var17, var18);
              for (var21 = var12; var21 < var13; var21 = var21 + param0[1].field_w) {
                param0[1].c(var21, param4);
              }
              qh.b(mb.field_b);
            }
            if (null != param0[7] &&
              param0[7].field_w != 0) {
              qh.d(var16, var20, var17, var11);
              for (var21Lifetime1 = var12; var13 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param0[7].field_w) {
                param0[7].c(var21Lifetime1, var15);
              }
              qh.b(mb.field_b);
            }
            if (null != param0[3] &&
              0 != param0[3].field_y) {
              qh.d(param3, var18, var16, var20);
              for (var21Lifetime2 = var14; var21Lifetime2 < var15; var21Lifetime2 = var21Lifetime2 + param0[3].field_y) {
                param0[3].c(param3, var21Lifetime2);
              }
              qh.b(mb.field_b);
            }
            if (null != param0[5] &&
              param0[5].field_y != 0) {
              qh.d(var17, var18, var10, var20);
              for (var21Lifetime3 = var14; var21Lifetime3 < var15; var21Lifetime3 = var21Lifetime3 + param0[5].field_y) {
                param0[5].c(var13, var21Lifetime3);
              }
              qh.b(mb.field_b);
            }
            if (null != param0[4] &&
              param0[4].field_w != 0 &&
              param0[4].field_y != 0) {
              qh.d(var16, var18, var17, var20);
              for (var21Lifetime4 = var14; var21Lifetime4 < var15; var21Lifetime4 = var21Lifetime4 + param0[4].field_y) {
                for (var22 = var12; var22 < var13; var22 = var22 + param0[4].field_w) {
                  param0[4].c(var22, var21Lifetime4);
                }
              }
              qh.b(mb.field_b);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("nj.F(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 93 / ((-77 - param2) / 47);
        nn.field_c = param1;
        cd.field_e = param0;
    }

    final static boolean a(int param0, int param1, byte[] param2, int[][] param3) {
        int var4_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 <= 122) {
            return true;
          }
          if (param3 == null) {
            return false;
          }
          var4_int = 0;
          L0: while (true) {
            if (param3.length <= var4_int) {
              return false;
            }
            var5 = param3[var4_int];
            var6 = 0;
            while (var5.length > var6) {
              boolean decompiledFrameRemainder0 = true;
              var7 = var5[var6];
              var8 = var5[var6 + 1];
              if (var7 != -1) {
                decompiledFrameRemainder0 = (var8 != (255 & param2[var7]));
              } else {
                decompiledFrameRemainder0 = (var8 != param0);
              }
              if (decompiledFrameRemainder0) {
                var4_int++;
                continue L0;
              }
              var6 += 2;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("nj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static int b(int param0, int param1, int param2) {
        if (param2 != -21223) {
          return -99;
        }
        if (param0 >= 2) {
          return 2;
        }
        if (param1 < 5) {
          return 0;
        }
        return 1;
    }

    final static java.awt.Frame a(int param0, sj param1, int param2, boolean param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        dj[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        sj var10 = null;
        dj[] var11 = null;
        le var12 = null;
        var9 = Pool.field_O;
        try {
          if (param3) {
            var10 = (sj) null;
            nj.a(-1, (sj) null, -62, true, 71, -112);
          }
          if (!param1.a((byte) 126)) {
            return null;
          }
          if (param5 == 0) {
            var11 = s.a((byte) -112, param1);
            var6 = var11;
            if (var6 == null) {
              stackIn_10_0 = null;
              return (java.awt.Frame) (stackIn_10_0);
            }
            var7_int = 0;
            for (var8 = 0; var11.length > var8; var8++) {
              if (var11[var8].field_f == param2 &&
                var11[var8].field_i == param0 && ((0 == param4 ||
                var11[var8].field_k == param4) &&
                (var7_int == 0 ||
                !(param5 >= var11[var8].field_d)))) {
                param5 = var11[var8].field_d;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var12 = param1.a(param0, param2, param4, param5, (byte) 85);
          while (var12.field_f == 0) {
            cf.a(-89, 10L);
          }
          var7 = (java.awt.Frame) (var12.field_e);
          if (var7 == null) {
            stackIn_36_0 = null;
            return (java.awt.Frame) (stackIn_36_0);
          }
          if (var12.field_f != 2) {
            return var7;
          }
          og.a(var7, param1, 24442);
          stackIn_40_0 = null;
          return (java.awt.Frame) (stackIn_40_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_43_0 = var6_ref;
          stackIn_43_1 = new StringBuilder().append("nj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(int param0) {
        if (param0 != -21055) {
          return -11;
        }
        return ti.field_e;
    }

    static {
        field_c = 255;
    }
}
