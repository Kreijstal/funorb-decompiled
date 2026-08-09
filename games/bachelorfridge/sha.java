/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sha extends pu {
    static vr field_l;
    static int field_m;

    final static void a(vr param0, boolean param1) {
        kv var2 = new kv(param0.a((byte) 123, "", "final_frame.jpg"), (java.awt.Component) ((Object) dca.field_y));
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
            throw pe.a((Throwable) ((Object) runtimeException), "sha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!lna.field_q) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -24) {
                  break L1;
                } else {
                  field_l = (vr) null;
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
                    var3 = (CharSequence) ((Object) param1);
                    if (!df.field_s.equals(fq.a(param0 + 24, var3))) {
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("sha.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void b(int param0) {
        if (param0 != 3) {
            return;
        }
        field_l = null;
    }

    static {
    }
}
