/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static pf field_a;
    boolean field_h;
    boolean field_b;
    String[] field_d;
    static String field_e;
    static bi[] field_f;
    int field_c;
    static String field_i;
    String field_g;

    final static vr a(byte param0, ob param1) {
        int var2 = param1.j(-109);
        int var3 = param1.j(-66);
        int var4 = (var3 & 1) != 0 ? 1 : 0;
        int var5 = (2 & var3) != 0 ? 1 : 0;
        int var6 = (var3 & 4) != 0 ? 1 : 0;
        int var7 = (8 & var3) != 0 ? 1 : 0;
        int var9 = 72 / ((param0 - -12) / 62);
        int var8 = 0 != (var3 & 16) ? 1 : 0;
        int var10 = (var3 & 32) != 0 ? 1 : 0;
        int var11 = 0 != (64 & var3) ? 1 : 0;
        return new vr(var4 != 0, var5 != 0, var6 != 0, var7 != 0, var8 != 0, var10 != 0, var11 != 0, var2);
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        if (param0 != 1) {
          kj.a(-84);
          field_e = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          return;
        }
    }

    kj(boolean param0) {
        ((kj) this).field_h = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Orb points: ";
        field_e = "Resource output";
    }
}
