/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static String[] field_b;
    static int field_c;
    static String field_a;
    static String field_d;

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        nd.field_a = true;
        ha.field_ab = 15000L + pf.a(0);
        if (param0 <= 75) {
          L0: {
            kg.a((byte) 72);
            if ((k.field_g ^ -1) != -12) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((k.field_g ^ -1) != -12) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(String param0, boolean param1, float param2, int param3) {
        if (param3 != -9089) {
            return;
        }
        try {
            if (null == vl.field_f) {
                vl.field_f = new ul(wg.field_j, rc.field_i);
                wg.field_j.b((byte) -74, vl.field_f);
            }
            vl.field_f.a(param1, param0, 4210752, param2);
            ge.d();
            vj.a(1, true);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "kg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = new String[]{"Showing by rating", "Showing by win percentage"};
        field_a = "Open in popup window";
    }
}
