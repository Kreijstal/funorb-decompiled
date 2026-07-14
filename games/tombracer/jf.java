/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends ela {
    static String field_o;
    static dk[] field_p;
    static String field_s;
    static int field_q;
    static byte[] field_t;
    static boolean field_r;

    jf(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static iu a(int param0, int param1, int param2) {
        iu var3 = null;
        int var4 = 0;
        int var5 = 0;
        iu var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = new iu(param2, param2);
        var3 = var6;
        if (param1 <= 36) {
          iu discarded$2 = jf.a(44, 69, 69);
          var4 = 0;
          L0: while (true) {
            if (var3.field_r.length <= var4) {
              return var3;
            } else {
              var6.field_r[var4] = param0;
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L1: while (true) {
            if (var3.field_r.length <= var4) {
              return var3;
            } else {
              var6.field_r[var4] = param0;
              var4++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 2) {
            return;
        }
        field_t = null;
        field_p = null;
        field_o = null;
        field_s = null;
    }

    final bfa a(bfa[] param0, int param1) {
        if (param1 != 0) {
          field_p = null;
          return new bfa((Object) (Object) sra.a((String) param0[0].field_d, 85));
        } else {
          return new bfa((Object) (Object) sra.a((String) param0[0].field_d, 85));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "You are invited to <%0>'s game.";
        field_s = "Accept draw";
        field_t = new byte[]{(byte)4, (byte)2};
    }
}
