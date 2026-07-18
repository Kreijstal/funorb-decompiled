/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static pf field_b;
    int field_j;
    int field_c;
    static nq field_g;
    int field_a;
    int field_h;
    byte[] field_e;
    int field_k;
    byte[] field_n;
    static boolean field_d;
    int field_f;
    int field_o;
    static int field_i;
    static byte[][] field_l;
    static int[] field_m;

    public static void a() {
        field_l = null;
        field_b = null;
        field_m = null;
        field_g = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -97) {
                break L1;
              } else {
                kc.a((byte) 75);
                break L1;
              }
            }
            var1_int = gd.field_b[0];
            var2 = 1;
            L2: while (true) {
              if (var2 >= gd.field_b.length) {
                break L0;
              } else {
                var3 = gd.field_b[var2];
                ps.a(jl.field_M, var2 << 4, jl.field_M, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "kc.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new pf();
        field_m = new int[4];
    }
}
