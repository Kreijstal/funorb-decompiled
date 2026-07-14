/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends lk {
    static db field_p;
    static byte[][] field_o;

    final db b(byte param0) {
        if (param0 != -98) {
            db discarded$0 = ((ll) this).b((byte) -62);
            return j.field_V;
        }
        return j.field_V;
    }

    public static void d(byte param0) {
        Object var2 = null;
        if (param0 != 104) {
          var2 = null;
          ll.a(61, (String) null);
          field_p = null;
          field_o = null;
          return;
        } else {
          field_p = null;
          field_o = null;
          return;
        }
    }

    final static void a(int param0, String param1) {
        if (param0 != -1054) {
          return;
        } else {
          System.out.println("Error: " + qb.a("%0a", (byte) 127, "\n", param1));
          return;
        }
    }

    ll(long param0, String param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new db(3);
    }
}
