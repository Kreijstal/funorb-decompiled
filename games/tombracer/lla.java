/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lla {
    static boolean field_b;
    bv field_a;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        ((lla) this).field_a.a(var6, var7, param3, param0, -25436, param4, param1);
        is.field_yb.a(dqa.field_e.field_G, di.field_a, param2 + -23796, 0, 0);
        qh.field_F.a(-82 + (-io.field_a + (dqa.field_e.field_G + -2)), 18, param2 ^ -23756, 2 + di.field_a, 0);
        mda.field_v.a(82 - -io.field_a, 18, -23776, 2 + di.field_a, -80 + (dqa.field_e.field_G + -io.field_a - 2));
        dn.field_b.a(io.field_a, 20, -128, 0, di.field_a + 22, 2, -20 + (-2 + (dqa.field_e.field_t - di.field_a)), dqa.field_e.field_G);
        jja.field_j.a(param2, io.field_a, 0, 2);
    }

    lla(String param0, jea param1) {
        String[] var3 = null;
        jea[] var4 = null;
        try {
            var3 = new String[]{param0, nga.field_o, of.field_a};
            var4 = new jea[]{param1, dqa.field_e, (jea) (Object) jja.field_j};
            ((lla) this).field_a = new bv(0L, up.field_a, var3, js.field_d, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lla.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(boolean param0, int param1) {
        param1--;
        if (param0) {
          int discarded$1 = lla.a(false, 59);
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        } else {
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
    }

    static {
    }
}
