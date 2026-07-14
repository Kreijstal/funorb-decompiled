/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap {
    static int field_e;
    static String field_f;
    static bl field_d;
    static int field_c;
    static go[] field_b;
    static String field_g;
    static t field_a;

    final static void a(java.awt.Canvas param0, int param1) {
        vm.a((java.awt.Component) (Object) param0, 11631);
        if (param1 == -8228) {
          hk.a(3, (java.awt.Component) (Object) param0);
          if (null != th.field_g) {
            th.field_g.a((java.awt.Component) (Object) param0, true);
            return;
          } else {
            return;
          }
        } else {
          ap.a((byte) -14);
          hk.a(3, (java.awt.Component) (Object) param0);
          if (null == th.field_g) {
            return;
          } else {
            th.field_g.a((java.awt.Component) (Object) param0, true);
            return;
          }
        }
    }

    final static al a(int param0, r param1, int param2) {
        byte[] var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = -118 % ((param2 - -61) / 52);
        var5 = param1.a(true, param0);
        var3 = var5;
        if (var5 == null) {
          return null;
        } else {
          return new al(var5);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_g = null;
        field_f = null;
        if (param0 != 25) {
            Object var2 = null;
            ap.a((java.awt.Canvas) null, 94);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_f = "Back";
        field_b = new go[28];
    }
}
