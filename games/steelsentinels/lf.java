/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    private static int[] field_a;
    static int[] field_c;
    static int field_d;
    private static int[] field_i;
    static int field_g;
    static int field_h;
    private static int[] field_f;
    static int[] field_e;
    static int field_b;

    private final static void c() {
        field_d = field_g / 2;
        field_b = field_h / 2;
    }

    final static void a() {
        lf.a(SoftwareRaster.field_i, SoftwareRaster.field_l, SoftwareRaster.field_b, SoftwareRaster.field_d);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_g = param2 - param0;
        field_h = param3 - param1;
        lf.c();
        if (field_c.length < field_h) {
          field_c = new int[ge.a(field_h, (byte) -32)];
        }
        int var4 = param1 * SoftwareRaster.field_c + param0;
        for (var5 = 0; var5 < field_h; var5++) {
          field_c[var5] = var4;
          var4 = var4 + SoftwareRaster.field_c;
        }
    }

    public static void b() {
        field_c = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_i = null;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        field_c = new int[1024];
        field_a = new int[2048];
        field_i = new int[2048];
        field_e = new int[2048];
        field_f = new int[512];
        for (var0 = 1; var0 < 512; var0++) {
          field_f[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          field_a[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          field_e[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          field_i[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
