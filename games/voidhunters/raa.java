/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class raa extends rqa {
    static String field_q;
    static int[][] field_p;
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          return null;
        } else {
          si.a(103, 62, param0[0].a(96));
          return new nc((Object) (Object) "void");
        }
    }

    raa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static dj e(int param0) {
        String var1 = null;
        int var2 = 0;
        var2 = -9 % ((param0 - -52) / 62);
        var1 = wnb.a(87);
        if (var1 != null) {
          if ((var1.indexOf('@') ^ -1) > -1) {
            return new dj(wnb.a(94), rta.e(-3840));
          } else {
            var1 = "";
            return new dj(wnb.a(94), rta.e(-3840));
          }
        } else {
          return new dj(wnb.a(94), rta.e(-3840));
        }
    }

    final static void a(byte param0, lta param1) {
        pd var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (null == rb.field_c) {
          return;
        } else {
          var2 = (pd) (Object) rb.field_c.d(0);
          L0: while (true) {
            if (var2 == null) {
              if (param0 != -99) {
                field_p = null;
                return;
              } else {
                return;
              }
            } else {
              sn.a(var2.field_e, (byte) 83, var2.field_h, var2.field_f, var2.field_i, 16711935, param1);
              var2 = (pd) (Object) rb.field_c.a((byte) 108);
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            return;
        }
        field_q = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Spawn <%0>";
        field_q = "Auto-respond to <%0>";
    }
}
