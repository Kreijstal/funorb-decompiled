/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wob extends rqa {
    static int field_p;
    static int field_o;

    wob(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 1) {
            return -53;
        }
        return param3 + param0 * (-param3 + param1) / param4;
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = VoidHunters.field_G;
        int var3 = param2;
        while (param1 < -2) {
            if (-1 != (param1 & 1)) {
                var3 = var3 * param0;
            }
            param0 = param0 * param0;
            param1 = param1 >> 1;
        }
        if (!(-2 != (param1 ^ -1))) {
            return var3 * param0;
        }
        return var3;
    }

    final static void a(java.applet.Applet param0, int param1) {
        if (param1 != -18209) {
          int discarded$2 = wob.a(91, -87, 12, -41, -105);
          wva.a(param0, (byte) 56, "");
          kr.a(param0, param1 ^ -20973);
          return;
        } else {
          wva.a(param0, (byte) 56, "");
          kr.a(param0, param1 ^ -20973);
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(203, 62, param0[0].a(37));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = -1;
        field_o = 500;
    }
}
