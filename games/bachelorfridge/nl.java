/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_a;

    final static void a(java.awt.Canvas param0, byte param1) {
        L0: {
          ii.a(-104, (java.awt.Component) (Object) param0);
          jba.a(-30229, (java.awt.Component) (Object) param0);
          if (null != sd.field_c) {
            sd.field_c.a((java.awt.Component) (Object) param0, (byte) -126);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 <= 51) {
          field_a = null;
          return;
        } else {
          return;
        }
    }

    nl(ola param0) {
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -80) {
            field_a = null;
        }
    }

    final static void a(float param0, String param1, boolean param2, int param3) {
        if (param3 >= -9) {
          return;
        } else {
          L0: {
            if (null == hp.field_d) {
              hp.field_d = new hga(gja.field_m, at.field_i);
              gja.field_m.a((wj) (Object) hp.field_d, (byte) 124);
              break L0;
            } else {
              break L0;
            }
          }
          hp.field_d.a(50, param2, param0, param1);
          dg.d();
          pja.a((byte) 53, true);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
