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
          if (kb.field_a != null) {
            kb.field_a.t(20252);
          }
          ra.field_y = new rl(param0, param2, false, true, true);
          int var3_int = -95 / ((param1 + 25) / 60);
          re.field_g.b(ra.field_y, -120);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "oc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static nj a(boolean param0, int param1) {
        nj var2 = null;
        nj var2Lifetime1;
        if (param1 == -21017) {
          var2 = new nj(true);
          var2.field_f = param0 ? true : false;
          return var2;
        }
        oc.a((byte) -68);
        var2Lifetime1 = new nj(true);
        var2Lifetime1.field_f = param0 ? true : false;
        return var2Lifetime1;
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
