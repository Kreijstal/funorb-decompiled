/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends fc {
    static oi field_j;
    static ba field_m;
    int field_l;
    static String field_k;
    static boolean field_i;

    final static void a(String param0, byte param1, String param2) {
        try {
            if (!(kb.field_a == null)) {
                kb.field_a.t(20252);
            }
            ra.field_y = new rl(param0, param2, false, true, true);
            int var3_int = -95 / ((param1 - -25) / 60);
            re.field_g.b(ra.field_y, -120);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "oc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static nj a(boolean param0, int param1) {
        nj var2;
        nj stackIn_3_0 = null;
        nj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        nj stackIn_7_0 = null;
        nj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param1 != -21017) {
          L0: {
            oc.a((byte) -68);
            var2 = new nj(true);
            stackIn_7_0 = (nj) (var2);

            if (!param0) {
              stackIn_8_0 = (nj) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (nj) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_f = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new nj(true);
            stackIn_3_0 = (nj) (var2);

            if (!param0) {
              stackIn_4_0 = (nj) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (nj) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_f = stackIn_4_1 != 0;
          return var2;
        }
    }

    oc(int param0) {
        this.field_l = param0;
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 != -63) {
            field_k = (String) null;
            field_j = null;
            field_m = null;
            return;
        }
        field_j = null;
        field_m = null;
    }

    static {
        field_j = new oi();
        field_m = new ba();
        field_k = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
