/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sha extends pu {
    static vr field_l;
    static int field_m;

    final static void a(vr param0) {
        kv var2 = new kv(param0.a((byte) 123, "", "final_frame.jpg"), (java.awt.Component) (Object) dca.field_y);
        int var3 = var2.field_q;
        int var4 = var2.field_p;
        try {
            uc.d(76);
            nd.field_g = new kv(var3, 3 * var4 / 4);
            nd.field_g.b();
            var2.c(0, 0);
            lt.field_a = new kv(var3, var4 - nd.field_g.field_p);
            lt.field_a.b();
            var2.c(0, -nd.field_g.field_p);
            lt.field_a.field_u = nd.field_g.field_p;
            db.b(99);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sha.B(" + (param0 != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!lna.field_q) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (gk.field_d != 2) {
                  break L1;
                } else {
                  if (df.field_s == null) {
                    break L1;
                  } else {
                    var3 = (CharSequence) (Object) param1;
                    if (!df.field_s.equals((Object) (Object) fq.a(0, var3))) {
                      break L1;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("sha.A(").append(-24).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    public static void b() {
        field_l = null;
    }

    static {
    }
}
