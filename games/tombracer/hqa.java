/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hqa extends kca {
    static ura field_j;

    final it a(byte param0, String param1) {
        int var3 = 0;
        if (param0 != 14) {
            Object var4 = null;
            it discarded$4 = ((hqa) this).a((byte) 77, (String) null);
            var3 = fna.a(param0 ^ -118, param1) == null ? 1 : 0;
            if (!(var3 != 0)) {
                return fp.field_c;
            }
            return uh.field_k;
        }
        var3 = fna.a(param0 ^ -118, param1) == null ? 1 : 0;
        if (!(var3 != 0)) {
            return fp.field_c;
        }
        return uh.field_k;
    }

    final String a(int param0, String param1) {
        if (((hqa) this).a((byte) 14, param1) == fp.field_c) {
          return pla.field_b;
        } else {
          if (param0 != -1) {
            field_j = null;
            return dua.field_j;
          } else {
            return dua.field_j;
          }
        }
    }

    public static void f(int param0) {
        if (param0 != -1852) {
            field_j = null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    hqa(tra param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ura();
    }
}
