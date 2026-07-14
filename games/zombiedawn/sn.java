/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    private String field_a;
    static int[] field_f;
    static boolean field_b;
    static int field_e;
    static String field_d;
    static gm field_c;

    final static ll a(byte param0, long param1, boolean param2, String param3, String param4) {
        L0: {
          if (param0 <= -19) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        L1: {
          if (param1 != 0L) {
            break L1;
          } else {
            if (param4 != null) {
              return (ll) (Object) new l(param4, param3);
            } else {
              break L1;
            }
          }
        }
        if (!param2) {
          return (ll) (Object) new bn(param1, param3);
        } else {
          return (ll) (Object) new ld(param1, param3);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static vn a(int param0, double param1, byte param2) {
        if (param2 > -31) {
            sn.a((byte) 27);
        }
        vn var10 = new vn(640, 90);
        ki.a((byte) -97, var10);
        vn var5 = new vn(640, 90);
        ki.a((byte) -94, var5);
        bi.f(0, 5, 640, 75, 16777215, 1);
        pa.a(-21189);
        vn var6 = new vn(640, 90);
        ki.a((byte) -113, var6);
        b.field_j.a(f.field_j[param0], 320, 65, 13631488, 1);
        pa.a(-21189);
        vn var7 = new vn(640, 90);
        ki.a((byte) -123, var7);
        int var8 = (int)(param1 * 640.0);
        int var9 = (int)(param1 * 90.0);
        var6.d((640 + -var8) / 2, 0, var8, var9);
        var5.a(0, 0);
        var7.d(16777215);
        var7.d(16777215);
        var7.d(1);
        var7.d(1);
        pa.a(-21189);
        var7.b(0, 13);
        pa.a(-21189);
        return var10;
    }

    final static boolean b(byte param0) {
        if (param0 != 12) {
            return false;
        }
        return hl.a(param0 + -139, hc.a(param0 ^ 12));
    }

    final static tj a(int param0, int param1, dj param2, dj param3, int param4) {
        if (param1 != 90) {
            field_f = null;
        }
        if (!ph.a(param0, 31043, param4, param2)) {
            return null;
        }
        return ua.a((byte) -128, param3.a((byte) 51, param0, param4));
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 != 93) {
            field_f = null;
        }
    }

    final static void a(int param0, ep param1, int param2) {
        am var5 = dp.field_e;
        var5.j(11, param0);
        if (param2 != 0) {
            return;
        }
        var5.field_j = var5.field_j + 1;
        int var4 = var5.field_j;
        var5.i(1, 79);
        if (param1.field_j == null) {
            var5.i(0, 95);
        } else {
            var5.i(param1.field_j.length, -90);
            var5.a(param1.field_j, param1.field_j.length, 0, param2 ^ -27843);
        }
        int discarded$0 = var5.e(-60, var4);
        var5.field_j = var5.field_j - 4;
        param1.field_k = var5.c(98);
        var5.d(69, var5.field_j - var4);
    }

    sn(String param0) {
        ((sn) this).field_a = param0;
    }

    final void a(int param0, java.applet.Applet param1) {
        if (param0 != 640) {
            return;
        }
        pg.a(true, param1, 31536000L, "jagex-last-login-method", ((sn) this).field_a);
    }

    final boolean a(String param0, byte param1) {
        if (param1 != -22) {
            Object var4 = null;
            ((sn) this).a(1, (java.applet.Applet) null);
        }
        return ((sn) this).field_a.equals((Object) (Object) param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var4 = 0;
        field_b = false;
        field_f = new int[50];
        double var0 = 0.0;
        double var2 = 0.12566370614359174;
        for (var4 = 0; (var4 ^ -1) > -51; var4++) {
            field_f[var4] = (int)(Math.sin(var0) * 64.0) + 192;
            var0 = var0 + var2;
        }
        field_d = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
