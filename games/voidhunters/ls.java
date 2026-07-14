/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls extends rqa {
    static int field_p;
    static int field_o;
    static int field_r;
    static boolean field_q;

    ls(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        phb var1 = null;
        phb var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        var1 = new phb(540, 140);
        de.a(29, var1);
        bfb.e();
        dma.a();
        nd.field_r = 0;
        pw.a((byte) 74);
        var2 = var1.d();
        var3 = 0;
        L0: while (true) {
          if (-16 >= (var3 ^ -1)) {
            if (param0 <= 54) {
              field_q = false;
              db.field_p.b();
              var1.d(0, 0);
              bia.a((byte) 124);
              return;
            } else {
              db.field_p.b();
              var1.d(0, 0);
              bia.a((byte) 124);
              return;
            }
          } else {
            var2.b(-2, -2, 16777215);
            dma.a(4, 4, 0, 0, 540, 140);
            var3++;
            continue L0;
          }
        }
    }

    final static void a(String param0, byte param1) {
        if (param1 < 120) {
            ls.a(94);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_r = -80;
          return new nc((Object) (Object) frb.a(63, 86));
        } else {
          return new nc((Object) (Object) frb.a(63, 86));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 1280;
        field_r = 128;
        field_q = false;
    }
}
