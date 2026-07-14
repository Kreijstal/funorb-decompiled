/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eaa extends rqa {
    static ri field_p;
    static String field_o;
    static int field_q;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          eaa.a((byte) -22, false, (byte[]) null, -98, -44, -111);
          return new nc((Object) (Object) frb.a(81, 89));
        } else {
          return new nc((Object) (Object) frb.a(81, 89));
        }
    }

    eaa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, boolean param1, byte[] param2, int param3, int param4, int param5) {
        faa var6 = null;
        int var7 = 0;
        int var8 = 0;
        var6 = dpa.field_p;
        var6.h(24335, param5);
        if (param0 < 86) {
          return;
        } else {
          L0: {
            var6.field_e = var6.field_e + 1;
            var7 = var6.field_e;
            var6.c(0, 4);
            var6.c(0, param4);
            var8 = param3;
            if (param1) {
              // wide iinc 8 128
              break L0;
            } else {
              break L0;
            }
          }
          var6.c(0, var8);
          var6.a(0, param2, -1, param2.length);
          var6.e(var6.field_e - var7, -129);
          return;
        }
    }

    public static void a(int param0) {
        field_p = null;
        int var1 = -70 / ((param0 - 80) / 37);
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> has lost connection.";
        field_p = new ri(9, 0, 4, 1);
        field_q = 1;
    }
}
