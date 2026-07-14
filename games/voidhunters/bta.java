/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bta extends rqa {
    static dka field_r;
    static int field_q;
    static String field_o;
    static int field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_q = -88;
          return new nc((Object) (Object) frb.a(38, 82));
        } else {
          return new nc((Object) (Object) frb.a(38, 82));
        }
    }

    bta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1) {
        ksa var2 = null;
        int var3 = 0;
        ea var4 = null;
        var3 = VoidHunters.field_G;
        var4 = (ea) (Object) oaa.field_k.d(0);
        L0: while (true) {
          if (var4 == null) {
            if (param0 == 50) {
              var2 = klb.field_q.d(0);
              L1: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  uaa.b(-105, param1);
                  var2 = klb.field_q.a((byte) 9);
                  continue L1;
                }
              }
            } else {
              field_p = -54;
              var2 = klb.field_q.d(0);
              L2: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  uaa.b(-105, param1);
                  var2 = klb.field_q.a((byte) 9);
                  continue L2;
                }
              }
            }
          } else {
            hs.a(var4, 1, param1);
            var4 = (ea) (Object) oaa.field_k.a((byte) 28);
            continue L0;
          }
        }
    }

    public static void e(byte param0) {
        field_r = null;
        if (param0 > -31) {
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 1;
        field_r = new dka(3);
        field_o = "Attempt to build blueprint";
        field_p = 50;
    }
}
