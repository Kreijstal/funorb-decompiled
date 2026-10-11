/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends pd {
    private Object field_n;
    static fe field_o;
    static bk field_q;
    static String field_m;
    static String[] field_p;
    static jd field_r;
    static nk field_s;

    final boolean f(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "tf.A(" + param0 + ')');
        }
    }

    final static void a(ee param0, byte param1, ee param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          mb.field_a = param0;
          rc.field_o = param3;
          c.field_u = param2;
          ue.a(vj.field_g / 2, -2694, vj.field_l / 2);
          kj.a(param2.field_q, param0.field_x + param0.field_q, param2.field_x + param2.field_q, -88, param0.field_q);
          if (param1 != -114) {
            tf.a((ee) null, (byte) -45, (ee) null, -84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("tf.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, mg param2, byte param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
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
        int stackIn_44_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Main.field_T;
        try {
          var5_int = ia.a(3 * (-param4 + param1), 2);
          var6 = param4 * 3;
          if (param3 != 23) {
            return;
          }
          var7 = -10 + var5_int;
          sa.a(param3 ^ -123);
          if (param2.field_E > 0 &&
            null != param2.field_D) {
            se.e((byte) 124);
          }
          ol.field_X = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_M)))) {
            var9 = param2.field_a[var8];
            var10 = param2.field_Q[var8];
            var11 = param2.field_d[var8];
            stackOut_12_0 = param0;
            stackIn_53_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = se.field_F[var9];
                var13 = ai.field_j[var9];
                var14 = se.field_F[var10] - var12;
                var15 = se.field_F[var11] - var12;
                var16 = -var13 + ai.field_j[var10];
                var17 = ai.field_j[var11] - var13;
              }
              if (!stackIn_13_0 ||
                !(0 <= -(var15 * var16) + var14 * var17)) {
                var12Lifetime1 = lg.field_c[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = lg.field_c[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = lg.field_c[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + var14 + (var12Lifetime1 + var13Lifetime1);
                      stackIn_33_0 = mb.field_c.length;
                      stackIn_33_1 = -1;
                      if (var7 >= 0) {
                        stackIn_34_2 = var15 >> var7;
                      } else {
                        stackIn_34_2 = var15 << -var7;
                      }
                      var16 = stackIn_33_0 + (stackIn_33_1 - stackIn_34_2);
                      var17 = mb.field_c[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_44_0 = var16;
                          if (stackIn_44_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = mb.field_c[var16];
                          continue;
                        }
                        stackIn_44_0Lifetime1 = (var16 << 4) + var17;
                        var18 = stackIn_44_0Lifetime1;
                        lf.field_a[var18] = var8;
                        mb.field_c[var16] = 1 + var17;
                        if (param2.field_E > 0 &&
                          param2.field_D != null) {
                          dupTemp$0 = param2.field_D[var8];
                          tb.field_h[dupTemp$0] = tb.field_h[dupTemp$0] + 1;
                        }
                        ol.field_X = ol.field_X + 1;
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
            stackIn_53_0 = 0;
          }
          if (stackIn_53_0 < param2.field_E &&
            param2.field_D != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= tb.field_h.length)) {
              var10Lifetime1 = tb.field_h[var9Lifetime1];
              tb.field_h[var9Lifetime1] = var8Lifetime1;
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
          stackIn_69_0 = var5;
          stackIn_69_1 = new StringBuilder().append("tf.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final Object e(int param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            field_m = (String) null;
          }
          stackIn_4_0 = this.field_n;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "tf.B(" + param0 + ')');
        }
    }

    public static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_o = null;
          field_m = null;
          field_s = null;
          field_q = null;
          field_r = null;
          if (param0 != -1) {
            tf.g(-64);
          }
          field_p = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "tf.C(" + param0 + ')');
        }
    }

    tf(Object param0, int param1) {
        super(param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_n = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("tf.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = new fe(3);
        field_q = new bk();
        field_m = "End Game";
    }
}
