/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    private String field_b;
    static ih field_f;
    static bi field_a;
    static boolean field_g;
    static String[] field_d;
    static int[] field_c;
    static int[] field_e;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void a(java.applet.Applet param0, boolean param1) {
        lg.a(31536000L, param0, 52, "jagex-last-login-method", ((bg) this).field_b);
        if (!param1) {
            ((bg) this).field_b = null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 16928) {
          field_d = null;
          field_f = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static int a(String param0, int param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (!param0.equalsIgnoreCase("auto")) {
          if (param1 <= 97) {
            field_c = null;
            var3 = (CharSequence) (Object) param0;
            return ma.a(var3, 2);
          } else {
            var4 = (CharSequence) (Object) param0;
            return ma.a(var4, 2);
          }
        } else {
          return -1;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        var2 = (182 + -pf.field_a[0].field_z) / (param1 - 1);
        dc.field_F = new bi(var2, 2);
        pf.field_d = new bi(var2 + pf.field_a[0].field_z / 4, 2);
        ra.a(param0 + 2499);
        dc.field_F.e();
        gf.f(0, 0, dc.field_F.field_z, 10790052);
        gf.f(0, 1, dc.field_F.field_z, 16777215);
        dc.field_F.field_B[0] = ui.a(0, dc.field_F.field_B[0], -90, 185);
        dc.field_F.field_B[1] = ui.a(0, dc.field_F.field_B[1], -94, 220);
        dc.field_F.field_B[var2] = ui.a(0, dc.field_F.field_B[var2], -118, 185);
        dc.field_F.field_B[1 + var2] = ui.a(0, dc.field_F.field_B[var2 + 1], -96, 220);
        pf.field_d.e();
        gf.f(0, 0, pf.field_d.field_z, 10790052);
        gf.f(0, 1, pf.field_d.field_z, 16777215);
        cg.i(0);
        if (param0 != -2612) {
          field_f = null;
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0, String param1) {
        int var3 = 106 / ((param0 - 33) / 39);
        return ((bg) this).field_b.equals((Object) (Object) param1);
    }

    bg(String param0) {
        ((bg) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = true;
        field_d = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_f = new ih();
        field_e = new int[]{4153215, 6258463, 16768768, 8323199};
        field_c = new int[]{9};
    }
}
