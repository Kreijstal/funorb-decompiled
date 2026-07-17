/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ne {
    ne field_a;
    static hh field_b;
    ne field_e;
    static long field_g;
    static gp field_c;
    long field_h;
    static String[] field_f;
    static cn field_d;

    final void a(boolean param0) {
        if (((ne) this).field_a == null) {
          return;
        } else {
          L0: {
            ((ne) this).field_a.field_e = ((ne) this).field_e;
            ((ne) this).field_e.field_a = ((ne) this).field_a;
            ((ne) this).field_e = null;
            ((ne) this).field_a = null;
            if (!param0) {
              break L0;
            } else {
              field_d = null;
              break L0;
            }
          }
          return;
        }
    }

    final boolean c(int param0) {
        if (!(null != ((ne) this).field_a)) {
            return false;
        }
        if (param0 >= -15) {
            field_f = null;
            return true;
        }
        return true;
    }

    public static void b(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Pit Immunity", "Success against all pit traps."};
    }
}
