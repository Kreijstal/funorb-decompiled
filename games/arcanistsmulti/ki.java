/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends rl {
    static String field_x;
    static int field_q;
    static String field_w;
    static oc field_v;
    static String field_u;
    static String field_t;
    static eg field_s;
    static int[] field_r;

    final eh a(String param0, int param1) {
        int var3 = null == pn.a((byte) 78, param0) ? 1 : 0;
        if (!(var3 != 0)) {
            return ra.field_k;
        }
        int var4 = -46 % ((param1 - -50) / 36);
        return nn.field_s;
    }

    ki(rn param0) {
        super(param0);
    }

    public static void d(byte param0) {
        field_x = null;
        field_s = null;
        field_v = null;
        field_t = null;
        field_w = null;
        field_u = null;
        int var1 = -119 / ((param0 - 43) / 41);
        field_r = null;
    }

    final String a(String param0, byte param1) {
        Object var4 = null;
        if (param1 < -114) {
          if (((ki) this).a(param0, 68) == ra.field_k) {
            return gl.field_f;
          } else {
            return nh.field_v;
          }
        } else {
          var4 = null;
          eh discarded$5 = ((ki) this).a((String) null, -66);
          if (((ki) this).a(param0, 68) == ra.field_k) {
            return gl.field_f;
          } else {
            return nh.field_v;
          }
        }
    }

    final static hg e(byte param0) {
        if (param0 > -51) {
            return null;
        }
        return (hg) (Object) new lj();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = " turns left";
        field_w = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_v = new oc();
        field_t = "Cancel";
        field_u = "Quit to website";
    }
}
