/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qia extends rqa {
    static String field_o;
    static String field_p;

    final static ml a(int param0, int[] param1) {
        ml var2 = new ml(param1[0]);
        int discarded$0 = bba.a(0, var2, param0, param1);
        return var2;
    }

    public static void e(byte param0) {
        field_o = null;
        field_p = null;
        int var1 = 87 % ((param0 - -18) / 48);
    }

    qia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        si.a(93, 62, param0[0].a(56));
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((qia) this).a((nc[]) null, -20);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Send private message to <%0>";
        field_p = "You have withdrawn your request to join.";
    }
}
