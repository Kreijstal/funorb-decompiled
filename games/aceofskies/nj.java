/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends aa {
    static int field_e;
    int[] field_h;
    int[] field_g;
    static qo field_f;

    final static void c(int param0) {
        vn.field_f.e((byte) 116);
        if (fu.field_d != null) {
          vn.field_f.a(fu.field_d, 0);
          int var1 = -46 / ((11 - param0) / 46);
          return;
        }
        fu.field_d = new ng(vn.field_f, uf.field_e);
        vn.field_f.a(fu.field_d, 0);
        int var1Lifetime1 = -46 / ((11 - param0) / 46);
    }

    final static void d(int param0) {
        if (param0 != -8129) {
          return;
        }
        ag.field_n = ka.b((byte) 116);
        vn.field_f = new lt();
        hg.a(true, true, true);
    }

    public static void a(byte param0) {
        if (param0 != -59) {
          field_f = (qo) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    private nj() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new qo();
    }
}
