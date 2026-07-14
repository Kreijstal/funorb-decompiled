/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bw {
    bw field_b;
    static sna field_a;
    long field_c;
    bw field_e;
    static String field_d;

    public static void b(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 != 127) {
            bw.b((byte) 117);
        }
    }

    final void a(boolean param0) {
        if (((bw) this).field_e != null) {
          if (param0) {
            return;
          } else {
            ((bw) this).field_e.field_b = ((bw) this).field_b;
            ((bw) this).field_b.field_e = ((bw) this).field_e;
            ((bw) this).field_e = null;
            ((bw) this).field_b = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        if (!(null != ((bw) this).field_e)) {
            return false;
        }
        if (param0 != -106) {
            field_a = null;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> would need a rating of <%1> to play with the current options.";
    }
}
