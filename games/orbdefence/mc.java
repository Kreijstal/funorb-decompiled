/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends ca {
    static int field_j;
    byte[] field_h;
    static int field_g;
    static String field_f;
    static int field_i;

    final static fa[] a(int param0, se param1) {
        Object stackIn_3_0 = null;
        fa[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fa[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        fa var6 = null;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = param1.h(8, 8);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (fa[]) (stackIn_3_0);
          }
          var3 = param1.h(param0, 8);
          var4 = new fa[var3];
          var5 = 0;
          while (var5 < var3) {
            boolean decompiledFrameRemainder0 = true;
            if (!eg.a(param1, 26678)) {
              var6_int = param1.h(ge.a(false, var5 - 1), 8);
              var4[var5] = var4[var6_int];
              decompiledFrameRemainder0 = (var7 != 0);
            }
            if (decompiledFrameRemainder0) {
              var6 = new fa();
              param1.h(24, param0 - 4);
              param1.h(24, 8);
              var6.field_d = param1.h(24, 8);
              param1.h(9, param0 - 4);
              param1.h(12, 8);
              param1.h(12, param0 - 4);
              param1.h(12, 8);
              var4[var5] = var6;
            }
            var5++;
            if (var7 == 0) {
              continue;
            }
            break;
          }
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("mc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(ki param0, int param1, ki param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          me.field_g = param0;
          if (param1 != -29608) {
            return;
          }
          sf.field_q = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("mc.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    mc(byte[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mc.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 12) {
            mc.a((ki) null, (String) null, (String) null, 2, -19);
          }
          field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "mc.C(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, wd param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        int stackIn_38_0Lifetime1;
        int stackIn_38_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1 != -2147483648) {
            field_i = 85;
          }
          var5_int = uh.a((byte) -70, 3 * (param4 - param0));
          var6 = param0 * 3;
          var7 = var5_int - 10;
          hi.a(false);
          if (param2.field_m > 0 &&
            null != param2.field_t) {
            ec.l(102);
          }
          fg.field_u = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_u)))) {
            var9 = param2.field_M[var8];
            var10 = param2.field_e[var8];
            var11 = param2.field_l[var8];
            stackOut_12_0 = param3;
            stackIn_48_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = a.field_t[var9];
                var13 = ph.field_x[var9];
                var14 = -var12 + a.field_t[var10];
                var15 = -var12 + a.field_t[var11];
                var16 = ph.field_x[var10] - var13;
                var17 = ph.field_x[var11] - var13;
              }
              if (!stackIn_13_0 ||
                !(0 <= -(var16 * var15) + var17 * var14)) {
                var12Lifetime1 = dg.field_B[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = dg.field_B[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = dg.field_B[var11];
                    if (-2147483648 != var14) {
                      var15 = var14 + (var12Lifetime1 + (var13Lifetime1 - var6));
                      stackIn_27_0 = vf.field_a.length;
                      stackIn_27_1 = 1;
                      if (var7 >= 0) {
                        stackIn_28_2 = var15 >> var7;
                      } else {
                        stackIn_28_2 = var15 << -var7;
                      }
                      var16 = stackIn_27_0 - (stackIn_27_1 + stackIn_28_2);
                      var17 = vf.field_a[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_38_0 = 0;
                          stackIn_38_1 = var16;
                          if (stackIn_38_0 > stackIn_38_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = vf.field_a[var16];
                          continue;
                        }
                        stackIn_38_0Lifetime1 = var17;
                        stackIn_38_1Lifetime1 = var16 << 4;
                        var18 = stackIn_38_0Lifetime1 + stackIn_38_1Lifetime1;
                        dm.field_g[var18] = var8;
                        vf.field_a[var16] = 1 + var17;
                        if (param2.field_m > 0 &&
                          param2.field_t != null) {
                          dupTemp$0 = param2.field_t[var8];
                          ji.field_a[dupTemp$0] = ji.field_a[dupTemp$0] + 1;
                        }
                        fg.field_u = fg.field_u + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_48_0 = param2.field_m;
          }
          if (stackIn_48_0 > 0 &&
            null != param2.field_t) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(ji.field_a.length <= var9Lifetime1)) {
              var10Lifetime1 = ji.field_a[var9Lifetime1];
              ji.field_a[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_64_0 = var5;
          stackIn_64_1 = new StringBuilder().append("mc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(ki param0, String param1, String param2, int param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 >= -56) {
            mc.a((ki) null, (String) null, (String) null, -91, -6);
          }
          if (param0.b(-1)) {
            stackIn_7_0 = param1 + " - " + param0.b((byte) -97, param3) + "%";
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("mc.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
        field_g = -1;
    }
}
