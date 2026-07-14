/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cca extends ana {
    static String field_w;
    static eaa field_v;
    private jaa field_x;

    final boolean c(byte param0) {
        uea var2_ref = null;
        ((cca) this).field_l = ((cca) this).field_l - 1;
        if (!((((cca) this).field_l - 1 ^ -1) >= -1)) {
            if (25 == ((cca) this).field_l) {
                jja.a(256, -1, 26);
                var2_ref = new uea(((cca) this).field_q, ((cca) this).field_x.field_t, ((cca) this).field_x.field_r, 16777215);
                ((kj) (Object) var2_ref).a(0);
                return false;
            }
            return false;
        }
        int var2 = -29 / ((71 - param0) / 47);
        this.e((byte) -64);
        return true;
    }

    private final void e(byte param0) {
        if (param0 != -64) {
          field_v = null;
          ((cca) this).field_x.a(((cca) this).field_q.field_h, false);
          return;
        } else {
          ((cca) this).field_x.a(((cca) this).field_q.field_h, false);
          return;
        }
    }

    final static n b(int param0, String param1) {
        Object var3 = null;
        if (param0 == -26869) {
          if (ut.field_m.a(false)) {
            if (param1.equals((Object) (Object) ut.field_m.b(param0 ^ -2930))) {
              return ut.field_m;
            } else {
              ut.field_m = ida.a(param1, param0 ^ 26686);
              return ut.field_m;
            }
          } else {
            return ut.field_m;
          }
        } else {
          var3 = null;
          n discarded$4 = cca.b(84, (String) null);
          if (ut.field_m.a(false)) {
            if (param1.equals((Object) (Object) ut.field_m.b(param0 ^ -2930))) {
              return ut.field_m;
            } else {
              ut.field_m = ida.a(param1, param0 ^ 26686);
              return ut.field_m;
            }
          } else {
            return ut.field_m;
          }
        }
    }

    final static void a(lu param0, int param1, byte param2, int param3, int param4) {
        param0.d(12, 0);
        int var5 = 51 / ((param2 - -3) / 61);
        param0.b(17, -114);
        param0.b(param4, -119);
        param0.b(param1, -117);
        param0.d(param3, 0);
    }

    cca(gj param0, jaa param1) {
        super(param0, (bca) (Object) param1);
        ((cca) this).field_x = param1;
    }

    public static void d(int param0) {
        if (param0 < 71) {
            return;
        }
        field_v = null;
        field_w = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Stamina</col>";
    }
}
