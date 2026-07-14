/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    int field_c;
    int field_b;
    int field_g;
    int field_f;
    static nh field_a;
    static String field_e;
    static String field_d;

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -64) {
            ji.a((byte) 111);
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (10 <= gl.field_I) {
          if (ic.a(false)) {
            if (rl.field_N != 0) {
              l.a((byte) 85, param2);
              var3 = -98 / ((7 - param0) / 51);
              return;
            } else {
              ki.a(false, 0, param1);
              qd.a(param2, 0, 0, 2901);
              var3 = -98 / ((7 - param0) / 51);
              return;
            }
          } else {
            ll.a();
            hi.b(320, -122, 240);
            qd.a(param2, 0, 0, 2901);
            var3 = -98 / ((7 - param0) / 51);
            return;
          }
        } else {
          L0: {
            var3 = 0;
            if (vh.field_q) {
              vh.field_q = false;
              var3 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          fb.a(var3 != 0, ie.a(122), dg.field_E, ei.a((byte) 116), (byte) -103);
          var3 = -98 / ((7 - param0) / 51);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nh(2);
        field_e = "Unpacking music";
        field_d = "to keep fullscreen or";
    }
}
