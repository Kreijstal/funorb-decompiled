/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends lk {
    static db field_p;
    static byte[][] field_o;

    final db b(byte param0) {
        db discarded$0 = null;
        if (param0 != -98) {
            discarded$0 = this.b((byte) -62);
            return j.field_V;
        }
        return j.field_V;
    }

    public static void d(byte param0) {
        String var2 = null;
        if (param0 != 104) {
          var2 = (String) null;
          ll.a(61, (String) null);
          field_p = null;
          field_o = (byte[][]) null;
          return;
        } else {
          field_p = null;
          field_o = (byte[][]) null;
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
        field_p = new db(3);
    }
}
