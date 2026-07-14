/*
 * Decompiled by CFR-JS 0.4.0.
 */
class na extends t {
    private long field_h;
    static sl field_d;
    static int field_c;
    static boolean field_f;
    private String field_g;
    static boolean field_e;

    public static void e(int param0) {
        if (param0 != -7345) {
            na.e(3);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(byte param0, da param1, da param2) {
        L0: {
          if (param2.field_h != null) {
            param2.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        param2.field_f = param1;
        param2.field_h = param1.field_h;
        param2.field_h.field_f = param2;
        param2.field_f.field_h = param2;
        if (param0 != 52) {
          na.e(18);
          return;
        } else {
          return;
        }
    }

    final void a(uf param0, int param1) {
        param0.a(true, ((na) this).field_h);
        param0.b(((na) this).field_g, (byte) -73);
        if (param1 >= -29) {
            field_e = true;
        }
    }

    am a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ja.field_g;
    }

    na(long param0, String param1) {
        ((na) this).field_h = param0;
        ((na) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_e = true;
        field_d = new sl();
    }
}
