/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sha extends pu {
    static vr field_l;
    static int field_m;

    final static void a(vr param0, boolean param1) {
        kv var2 = new kv(param0.a((byte) 123, "", "final_frame.jpg"), (java.awt.Component) (Object) dca.field_y);
        int var3 = var2.field_q;
        int var4 = var2.field_p;
        if (param1) {
            return;
        }
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
            throw pe.a((Throwable) (Object) runtimeException, "sha.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!lna.field_q) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (param0 == -24) {
                  break L1;
                } else {
                  field_l = null;
                  break L1;
                }
              }
              L2: {
                if (gk.field_d != 2) {
                  break L2;
                } else {
                  if (df.field_s == null) {
                    break L2;
                  } else {
                    var3 = (CharSequence) (Object) param1;
                    if (!df.field_s.equals((Object) (Object) fq.a(param0 + 24, var3))) {
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("sha.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    public static void b(int param0) {
        field_l = null;
    }

    static {
    }
}
