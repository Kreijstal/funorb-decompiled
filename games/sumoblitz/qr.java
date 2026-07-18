/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr {
    static jn field_c;
    static ta field_a;
    static gf field_e;
    static int[] field_d;
    static ud field_b;

    final static an a(String[] args) {
        an var2 = null;
        RuntimeException var2_ref = null;
        an stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        an stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new an(false);
            var2.field_h = args;
            stackOut_0_0 = (an) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("qr.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (args == null) {
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
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 8192 + ')');
        }
        return stackIn_1_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            vk.a(qu.field_k, kc.field_l, (byte) -107, se.field_d, param1, 0, true);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= se.field_d) {
                L2: {
                  vk.a(ab.field_c, oc.field_f, (byte) -107, param1 + se.field_d, param1 + param1, param1, false);
                  if (se.field_d <= param1) {
                    break L2;
                  } else {
                    se.field_d = param1;
                    break L2;
                  }
                }
                break L0;
              } else {
                pd.field_q[param1 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "qr.C(" + 13136 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 17704) {
          L0: {
            L1: {
              if ((Object) (Object) jj.field_f == this) {
                break L1;
              } else {
                if ((Object) (Object) uu.field_l == this) {
                  break L1;
                } else {
                  if (this != (Object) (Object) ga.field_j) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new jn();
        field_e = new gf();
        field_d = new int[8192];
    }
}
