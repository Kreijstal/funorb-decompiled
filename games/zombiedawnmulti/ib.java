/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib implements nl {
    static int field_b;
    static int field_a;

    final static boolean b(int param0) {
        if (ki.field_h == null) {
            return false;
        }
        if (!vo.field_l.a((byte) -90)) {
            return false;
        }
        return true;
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ja var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var6_int = param4.field_y + param3;
            var7 = param4.field_i + param1;
            ng.a(1, var6_int, param4.field_n, var7, param4.field_w);
            if (param2 == -15112) {
              L1: {
                var8 = rj.field_I[1];
                if (!(param4 instanceof gn)) {
                  break L1;
                } else {
                  if (!((gn) (Object) param4).field_G) {
                    break L1;
                  } else {
                    var8.e(var6_int - -1 - -(-var8.field_z + param4.field_n >> 1), (param4.field_w + -var8.field_u >> 1) + var7 + 1, 256);
                    break L1;
                  }
                }
              }
              if (param4.c(124)) {
                hl.a(2 + var7, 2 + var6_int, (byte) 111, param4.field_n + -4, param4.field_w + -4);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("ib.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != param0) {
            return qb.field_a[param0];
        }
        if (!iq.a((byte) 98, param2)) {
            return qb.field_a[param0];
        }
        return 29;
    }

    final static void a(int param0) {
        if (a.field_b == 10) {
          ji.b(117);
          a.field_b = 11;
          if (param0 <= -37) {
            eb.field_p = true;
            return;
          } else {
            ib.a(74);
            eb.field_p = true;
            return;
          }
        } else {
          if (!re.b(-113)) {
            ji.b(117);
            a.field_b = 11;
            if (param0 > -37) {
              ib.a(74);
              eb.field_p = true;
              return;
            } else {
              eb.field_p = true;
              return;
            }
          } else {
            if (param0 <= -37) {
              eb.field_p = true;
              return;
            } else {
              ib.a(74);
              eb.field_p = true;
              return;
            }
          }
        }
    }

    final static we a(byte param0, jd param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        we stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        we stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 == 112) {
              stackOut_3_0 = tf.a(uj.a(param1, 100, 96), (byte) -98);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (we) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ib.E(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    static {
    }
}
