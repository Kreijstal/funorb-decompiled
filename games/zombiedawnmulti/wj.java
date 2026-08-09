/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends br {
    static ub field_i;
    static String field_h;
    static boolean field_n;
    static String field_j;
    static boolean[] field_l;
    static String field_k;
    uj field_m;
    static int field_g;
    static String field_f;

    final static dl a(byte param0, int param1, String param2) {
        kf var3 = null;
        RuntimeException var3_ref = null;
        kf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            var3 = new kf();
            ((dl) ((Object) var3)).field_f = param1;
            ((dl) ((Object) var3)).field_b = param2;
            stackIn_3_0 = (kf) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("wj.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (dl) ((Object) stackIn_3_0);
    }

    public static void a(int param0) {
        if (param0 != -6298) {
          field_i = (ub) null;
          field_h = null;
          field_k = null;
          field_l = null;
          field_j = null;
          field_f = null;
          field_i = null;
          return;
        } else {
          field_h = null;
          field_k = null;
          field_l = null;
          field_j = null;
          field_f = null;
          field_i = null;
          return;
        }
    }

    final static void b(boolean param0, int param1) {
        nb.field_a.a(39, 0, 0);
        if (param1 >= -109) {
            String var3 = (String) null;
            wj.a((byte) 68, -37, (String) null);
        }
    }

    wj(int param0) {
        if (df.field_H) {
            this.field_m = uj.a(ei.field_a[param0], 100, 256);
            tf.a(this.field_m, (byte) -93);
        }
        if (93 == param0) {
        }
    }

    static {
        field_h = "to return to the normal view.";
        field_k = "Show all lobby chat";
        field_n = false;
        field_j = "Get extra bang for your buck - or, in this case, extra zombie for your brain - with more zombies at the start of each match.";
        field_l = new boolean[64];
        field_f = "Spectate <%0>'s game";
    }
}
