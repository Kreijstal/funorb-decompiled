/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_b;
    static String field_a;
    static boolean field_c;
    static int field_e;
    static ci field_d;

    final static void a(int param0, hh param1, byte param2) {
        nk var3 = null;
        var3 = qn.field_U;
        var3.f(param0, -94);
        var3.c(param1.field_l, (byte) -88);
        var3.b(param1.field_n, 109);
        if (param2 < 9) {
          field_e = -102;
          return;
        } else {
          return;
        }
    }

    final static void a(long param0, int param1, int param2) {
        nk var4 = null;
        int var5 = 0;
        var4 = qn.field_U;
        var4.f(param2, -75);
        var4.field_l = var4.field_l + 1;
        var5 = var4.field_l;
        var4.c(6, (byte) 92);
        if (param1 != 16581) {
          field_c = true;
          var4.a(-99, param0);
          var4.a(var4.field_l - var5, -1);
          return;
        } else {
          var4.a(-99, param0);
          var4.a(var4.field_l - var5, -1);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 6) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Cancel";
        field_a = "You are offering to draw.";
    }
}
