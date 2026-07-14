/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static vd field_c;
    static String field_b;
    private String field_a;

    final boolean b(String param0, int param1) {
        if (param1 <= 114) {
            String discarded$0 = ((uf) this).toString();
            return ((uf) this).field_a.equals((Object) (Object) param0);
        }
        return ((uf) this).field_a.equals((Object) (Object) param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 > -113) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param0 >> -1808421232;
        int var4 = param0 & param2;
        int var5 = param1 >> 1754209776;
        int var6 = 65535 & param1;
        return var5 * var4 + (var3 * param1 - -(var6 * var4 >> -2096444784));
    }

    final void a(java.applet.Applet param0, int param1) {
        if (param1 != 8910) {
          String discarded$2 = ((uf) this).toString();
          fa.a(31536000L, "jagex-last-login-method", false, ((uf) this).field_a, param0);
          return;
        } else {
          fa.a(31536000L, "jagex-last-login-method", false, ((uf) this).field_a, param0);
          return;
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
            return -94;
        }
        return 1;
    }

    final static byte[] a(String param0, int param1) {
        if (param1 < 106) {
          int discarded$2 = uf.a(28, -119, 3);
          return va.field_n.a(85, param0, "");
        } else {
          return va.field_n.a(85, param0, "");
        }
    }

    uf(String param0) {
        ((uf) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Not yet achieved";
    }
}
