/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends wf {
    static int field_f;
    long field_e;
    int field_i;
    static String field_g;
    byte[] field_h;

    public static void a(int param0) {
        field_g = null;
        if (param0 != 256) {
            m.a(11);
        }
    }

    m(long param0, int param1, byte[] param2) {
        ((m) this).field_h = param2;
        ((m) this).field_i = param1;
        ((m) this).field_e = param0;
    }

    final static void a(ap param0, int param1, boolean param2) {
        ap var4 = null;
        if (param1 != 27966) {
          var4 = (ap) null;
          m.a((ap) null, 18, false);
          ha.a(param0, (byte) -109, param2, 256);
          return;
        } else {
          ha.a(param0, (byte) -109, param2, 256);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Open in popup window";
    }
}
