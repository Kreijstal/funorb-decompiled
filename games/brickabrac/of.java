/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends gf {
    static ni field_k;
    static String field_j;
    static String field_h;
    static mk field_i;

    of() {
        super(-2);
    }

    final void b(byte param0) {
        lb.d();
        if (param0 > -14) {
            of.a(-57);
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        if (param2 > -52) {
            ((of) this).a(true, false, -69);
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_h = null;
        if (param0 != -2) {
            return;
        }
        field_i = null;
        field_j = null;
    }

    final static void a(int param0, og param1) {
        try {
            if (param0 != -2) {
                String discarded$0 = of.d((byte) 104);
            }
            wd.field_w.a((mh) (Object) param1, 0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "of.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 < 98) {
            field_j = null;
            return false;
        }
        return false;
    }

    final static String d(byte param0) {
        if (param0 == 63) {
          if (!th.field_h) {
            if (ue.field_e <= go.field_e) {
              if (go.field_e >= jh.field_a + ue.field_e) {
                return null;
              } else {
                return vq.field_J;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> has declined the invitation.";
        field_j = "Player Name: ";
    }
}
