/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static cn field_l;
    static int[] field_d;
    static int[] field_f;
    private static int[] field_j;
    private static int field_b;
    private static int[][] field_e;
    private static int[] field_c;
    private static int[][] field_h;
    private static int[] field_g;
    private static int[] field_a;
    private static int[] field_i;
    private static int[] field_k;

    public static void a() {
        field_l = null;
        field_d = null;
        field_f = null;
        field_e = null;
        field_h = null;
        field_j = null;
        field_c = null;
        field_i = null;
        field_a = null;
        field_g = null;
        field_k = null;
    }

    final static void b() {
        field_b = field_b - 1;
        gf.a(field_e[field_b], field_g[field_b], field_k[field_b]);
        gf.field_j = field_j[field_b];
        gf.field_h = field_i[field_b];
        gf.field_f = field_c[field_b];
        gf.field_e = field_a[field_b];
        field_f = field_h[field_b];
        field_l.field_B = field_h[field_b];
        field_l.field_y = field_g[field_b];
        field_l.field_v = field_k[field_b];
    }

    final static void a(ph param0) {
        jh.c();
        jh.b(param0);
    }

    private final static void b(ph param0) {
        jh.a(param0.field_a, param0.field_c);
    }

    final static void c() {
        field_e[field_b] = gf.field_b;
        field_h[field_b] = field_f;
        field_j[field_b] = gf.field_j;
        field_i[field_b] = gf.field_h;
        field_c[field_b] = gf.field_f;
        field_a[field_b] = gf.field_e;
        field_g[field_b] = gf.field_i;
        field_k[field_b] = gf.field_c;
        field_b = field_b + 1;
    }

    final static void a(cn param0) {
        jh.c();
        param0.e();
    }

    private final static void a(cn param0, int[] param1) {
        param0.e();
        field_f = param1;
        field_l.field_B = param1;
        field_l.field_y = param0.field_y;
        field_l.field_v = param0.field_v;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new cn(640, 480);
        field_d = field_l.field_B;
        field_f = field_d;
        field_j = new int[4];
        field_b = 0;
        field_a = new int[4];
        field_i = new int[4];
        field_c = new int[4];
        field_h = new int[4][];
        field_g = new int[4];
        field_e = new int[4][];
        field_k = new int[4];
    }
}
