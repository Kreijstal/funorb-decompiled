/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends vd implements qk {
    private dg field_F;
    private String field_I;
    static bd field_H;
    private int[] field_M;
    static int field_N;
    private int field_E;
    static String field_G;
    private ph[] field_K;
    private vm field_L;
    static int field_J;

    final static pg[] a(int param0, byte param1, int param2, gb param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        pg[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        pg[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (rl.a(2884, param3, param0, param2)) {
              L1: {
                if (param1 > 112) {
                  break L1;
                } else {
                  jj discarded$2 = qi.a(true, true);
                  break L1;
                }
              }
              stackOut_5_0 = he.c(-123);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (pg[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("qi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    private final void b(int param0, int param1) {
        ph[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ph[] var7 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        if (((qi) this).field_E >= param1) {
          return;
        } else {
          var7 = new ph[param1];
          var3 = var7;
          var4 = new int[param1];
          var5 = 0;
          L0: while (true) {
            if (((qi) this).field_E <= var5) {
              ((qi) this).field_K = var3;
              ((qi) this).field_E = param1;
              ((qi) this).field_M = var4;
              return;
            } else {
              var7[var5] = ((qi) this).field_K[var5];
              var4[var5] = ((qi) this).field_M[var5];
              var5++;
              continue L0;
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var6_int = 87 % ((param4 - -63) / 52);
            var7 = 0;
            L1: while (true) {
              if (((qi) this).field_E <= var7) {
                break L0;
              } else {
                if (((qi) this).field_K[var7] == param3) {
                  var8 = ((qi) this).field_M[var7];
                  if (var8 == -1) {
                    ((qi) this).field_F.g((byte) 103);
                    return;
                  } else {
                    g.a((byte) -125, ((qi) this).field_M[var7]);
                    return;
                  }
                } else {
                  var7++;
                  var7++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("qi.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ')');
        }
    }

    final ph a(mh param0, String param1, int param2) {
        ph var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ph stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ph stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new ph(param1, param0);
            var4.field_h = (nn) (Object) new ke();
            var5 = -2 + ((qi) this).field_x;
            ((qi) this).a(((qi) this).field_s, 0, 0, 0, ((qi) this).field_x - -34);
            var4.a(((qi) this).field_s + -14, var5, param2 + -30, 7, param2);
            ((qi) this).a(51448, (ag) (Object) var4);
            stackOut_0_0 = (ph) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("qi.P(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void b(int param0, byte param1) {
        L0: {
          ga.field_b = param0;
          if (uh.field_l != null) {
            uh.field_l.b((byte) -93, param0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -80) {
          L1: {
            field_J = -51;
            if (null != ha.field_w) {
              ha.field_w.a(param0, true);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (null != ha.field_w) {
              ha.field_w.a(param0, true);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        if (param2 < 42) {
          var6 = null;
          pg[] discarded$3 = qi.a(79, (byte) 30, -49, (gb) null);
          super.a(param0, param1, (byte) 80, param3);
          int discarded$4 = ((qi) this).field_L.a(((qi) this).field_I, param1 - (-((qi) this).field_v - 14), ((qi) this).field_m + param0 - -10, ((qi) this).field_s + -28, ((qi) this).field_x, 16777215, -1, 0, 0, ((qi) this).field_L.field_y);
          return;
        } else {
          super.a(param0, param1, (byte) 80, param3);
          int discarded$5 = ((qi) this).field_L.a(((qi) this).field_I, param1 - (-((qi) this).field_v - 14), ((qi) this).field_m + param0 - -10, ((qi) this).field_s + -28, ((qi) this).field_x, 16777215, -1, 0, 0, ((qi) this).field_L.field_y);
          return;
        }
    }

    final static jj a(boolean param0, boolean param1) {
        jj var2 = null;
        jj stackIn_2_0 = null;
        jj stackIn_3_0 = null;
        jj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jj stackIn_6_0 = null;
        jj stackIn_7_0 = null;
        jj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        jj stackOut_5_0 = null;
        jj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        jj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        jj stackOut_1_0 = null;
        jj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        jj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1) {
          L0: {
            field_G = null;
            var2 = new jj(true);
            stackOut_5_0 = (jj) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = (jj) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (jj) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_c = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new jj(true);
            stackOut_1_0 = (jj) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (jj) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (jj) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_c = stackIn_4_1 != 0;
          return var2;
        }
    }

    final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var4_int = ((qi) this).field_E;
            this.b(0, 1 + var4_int);
            ((qi) this).field_K[var4_int] = ((qi) this).a((mh) this, param2, 30);
            ((qi) this).field_M[var4_int] = param1;
            if (param0 == 22770) {
              break L0;
            } else {
              qi.j(17);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4;
            stackOut_3_1 = new StringBuilder().append("qi.G(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void j(int param0) {
        field_G = null;
        field_H = null;
        if (param0 <= 48) {
            qi.j(-55);
        }
    }

    qi(dg param0, vm param1, String param2) {
        super(0, 0, 288, 0, (nn) null);
        int var4_int = 0;
        ((qi) this).field_E = 0;
        try {
            ((qi) this).field_F = param0;
            ((qi) this).field_I = param2;
            ((qi) this).field_L = param1;
            var4_int = null == ((qi) this).field_I ? 0 : ((qi) this).field_L.b(((qi) this).field_I, 260, ((qi) this).field_L.field_y);
            ((qi) this).a(288, 0, 0, 0, 22 + var4_int);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = 0;
        field_J = 0;
    }
}
