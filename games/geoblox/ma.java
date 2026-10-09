/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends hf {
    int field_h;
    long field_f;
    byte[] field_g;

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Geoblox.field_C;
        try {
          var5 = uh.field_x;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          if (param0 != -35) {
            return;
          }
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "ma.E(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0, float param1, ja param2) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            ma.b(-91);
          }
          stackIn_3_0 = aa.a(wd.field_b, 0, 0, vf.field_L, -wd.field_a + ng.field_G - (vf.field_L.field_s >> 1), -wd.field_d - (vf.field_L.field_o >> 1) + td.field_E);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ma.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int b(int param0) {
        gb.field_b.a((byte) -65);
        if (param0 != 15869) {
            return 61;
        }
        if (!wg.field_i.a((byte) 95)) {
            return ge.a((byte) -74);
        }
        return 0;
    }

    final static boolean c(byte param0) {
        int var1 = 39 / ((param0 - 18) / 54);
        return fa.field_b > fj.field_m ? true : false;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, dm[] param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
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
        var22 = Geoblox.field_C;
        try {
          if (param5 == null) {
            return;
          }
          if (param4 > 0 &&
              0 < param2) {
            if (param5[3] == null) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param5[3].field_s;
            }
            var6_int = stackIn_10_0;
            if (null == param5[5]) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param5[5].field_s;
            }
            var7 = stackIn_13_0;
            if (param3 != -92) {
              return;
            }
            if (null != param5[1]) {
              stackIn_18_0 = param5[1].field_o;
            } else {
              stackIn_18_0 = 0;
            }
            var8 = stackIn_18_0;
            if (null != param5[7]) {
              stackIn_21_0 = param5[7].field_o;
            } else {
              stackIn_21_0 = 0;
            }
            var9 = stackIn_21_0;
            var10 = param4 + param1;
            var11 = param0 + param2;
            var12 = param1 + var6_int;
            var13 = var10 - var7;
            var14 = param0 + var8;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = var6_int * param4 / (var6_int + var7) + param1;
              var16 = var6_int * param4 / (var6_int + var7) + param1;
            }
            var18 = var14;
            var19 = var15;
            vb.a(hd.field_I);
            if (var19 < var18) {
              var19 = param2 * var8 / (var8 + var9) + param0;
              var18 = param2 * var8 / (var8 + var9) + param0;
            }
            if (null != param5[0]) {
              vb.b(param1, param0, var16, var18);
              param5[0].b(param1, param0);
              vb.b(hd.field_I);
            }
            if (param5[2] != null) {
              vb.b(var17, param0, var10, var18);
              param5[2].b(var13, param0);
              vb.b(hd.field_I);
            }
            if (null != param5[6]) {
              vb.b(param1, var19, var16, var11);
              param5[6].b(param1, var15);
              vb.b(hd.field_I);
            }
            if (null != param5[8]) {
              vb.b(var17, var19, var10, var11);
              param5[8].b(var13, var15);
              vb.b(hd.field_I);
            }
            if (null != param5[1] &&
                param5[1].field_s != 0) {
              vb.b(var16, param0, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param5[1].field_s) {
                param5[1].b(var20, param0);
              }
              vb.b(hd.field_I);
            }
            if (param5[7] != null &&
                0 != param5[7].field_s) {
              vb.b(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param5[7].field_s) {
                param5[7].b(var20Lifetime1, var15);
              }
              vb.b(hd.field_I);
            }
            if (param5[3] != null &&
                0 != param5[3].field_o) {
              vb.b(param1, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param5[3].field_o) {
                param5[3].b(param1, var20Lifetime2);
              }
              vb.b(hd.field_I);
            }
            if (param5[5] != null &&
                param5[5].field_o != 0) {
              vb.b(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param5[5].field_o) {
                param5[5].b(var13, var20Lifetime3);
              }
              vb.b(hd.field_I);
            }
            if (param5[4] != null &&
                param5[4].field_s != 0 &&
                0 != param5[4].field_o) {
              vb.b(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param5[4].field_o) {
                for (var21 = var12; var21 < var13; var21 = var21 + param5[4].field_s) {
                  param5[4].b(var21, var20Lifetime4);
                }
              }
              vb.b(hd.field_I);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("ma.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(')').toString());
        }
    }

    final static boolean a(rh param0, rh param1, rh param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.a(0) &&
              param2.a("commonui", (byte) -127)) {
            if (param1.a(param3 + 11652) &&
                param1.a("commonui", (byte) -124)) {
              if (param3 != -11652) {
                return false;
              }
              if (param0.a(0) &&
                  param0.a("button.gif", (byte) -125)) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ma.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    ma(long param0, int param1, byte[] param2) {
        try {
            this.field_h = param1;
            this.field_g = param2;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ma.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
