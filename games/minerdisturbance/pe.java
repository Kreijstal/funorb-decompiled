/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends fd {
    String field_nb;
    static int field_pb;
    static int field_sb;
    static ta field_qb;
    static volatile boolean field_rb;
    int field_tb;
    String field_ob;

    public static void b(byte param0) {
        if (param0 != -30) {
            return;
        }
        field_qb = null;
    }

    final static l a(byte param0, int param1, int param2, int param3, int param4, vf param5) {
        java.awt.Frame var6 = null;
        l var7 = null;
        java.awt.Frame var8 = null;
        var8 = pk.a((byte) 72, param4, param1, param3, param5, param2);
        var6 = var8;
        if (param0 < -70) {
          if (var8 == null) {
            return null;
          } else {
            var7 = new l();
            var7.field_d = var8;
            java.awt.Component discarded$2 = var7.field_d.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param1, param3);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    final static void a(vf param0, int param1, int param2, byte param3, boolean param4, java.awt.Component param5, di param6, int param7) {
        fj.a(param7, param4, 10);
        mj.field_o = fj.a(param0, param5, 0, param1);
        im.field_b = fj.a(param0, param5, 1, param2);
        hj.field_f = new hg();
        mj.field_p = param2 * 1000 / param7;
        im.field_b.b((um) (Object) hj.field_f);
        km.field_a = param6;
        km.field_a.a((byte) -127, ee.field_J);
        mj.field_o.b((um) (Object) km.field_a);
        int var8 = -122 % ((param3 - -69) / 50);
    }

    pe() {
        super(0L, (fd) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = 0;
        field_rb = true;
    }
}
