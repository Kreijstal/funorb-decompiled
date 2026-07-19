/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs {
    static int field_a;

    final static void a(fla param0, int param1) {
        try {
            int var2_int = 104 % ((param1 - 4) / 38);
            nl.field_f.b((byte) -77, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rs.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(byte param0) {
        fla var2 = null;
        if (param0 == 124) {
          if (!lca.a(false)) {
            return -1;
          } else {
            return wu.field_a.d(true);
          }
        } else {
          var2 = (fla) null;
          rs.a((fla) null, -74);
          if (!lca.a(false)) {
            return -1;
          } else {
            return wu.field_a.d(true);
          }
        }
    }

    static {
        field_a = 1;
    }
}
