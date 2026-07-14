/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends wk {
    static String field_w;
    static String field_u;
    static int field_x;
    static ud field_s;
    static qd[][] field_v;
    static int field_y;
    static volatile int field_t;
    static float[] field_r;

    final static w d(int param0) {
        if (param0 != 5) {
            return null;
        }
        return tb.field_b.field_Ob;
    }

    final static void a(int param0, int param1) {
        uf var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = we.field_b;
        var2.f(param0, -4);
        var2.field_n = var2.field_n + 1;
        var3 = var2.field_n;
        var2.a(true, 5);
        var2.a(true, cd.field_m.field_mc);
        if (param1 != 1850462342) {
          qa.e(-25);
          var4 = (cd.field_m.field_qc << 1850462342) + cd.field_m.field_Wb;
          var2.a(true, var4);
          var2.a(false, cd.field_m.field_kc.length, cd.field_m.field_kc, 0);
          var2.b(var2.field_n + -var3, true);
          return;
        } else {
          var4 = (cd.field_m.field_qc << 1850462342) + cd.field_m.field_Wb;
          var2.a(true, var4);
          var2.a(false, cd.field_m.field_kc.length, cd.field_m.field_kc, 0);
          var2.b(var2.field_n + -var3, true);
          return;
        }
    }

    public static void e(int param0) {
        if (param0 != -30349) {
          qa.a(99, -109);
          field_u = null;
          field_s = null;
          field_r = null;
          field_w = null;
          field_v = null;
          return;
        } else {
          field_u = null;
          field_s = null;
          field_r = null;
          field_w = null;
          field_v = null;
          return;
        }
    }

    qa(long param0, String param1) {
        super(param0, param1);
    }

    final gh a(int param0) {
        if (param0 != 18) {
            return null;
        }
        return gf.field_j;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Stage:";
        field_w = "Waiting for backgrounds";
        field_r = new float[8];
        field_t = 0;
    }
}
