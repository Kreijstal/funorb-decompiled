/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nf extends fl {
    int field_v;
    int field_A;
    int field_s;
    static cn field_w;
    int field_x;
    int field_q;
    static lm field_y;
    int field_z;
    static boolean field_u;
    static boolean field_r;
    static int[] field_t;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void b(int param0, int param1) {
        ee.field_a = cb.field_b[param0];
        md.field_H = tc.field_i[param0];
        gj.field_g = jj.field_c[param0];
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) om.field_b;
        synchronized (var1) {
          L0: {
            md.field_G = md.field_G + 1;
            eb.field_K = vj.field_b;
            dh.field_d = vb.field_b;
            bj.field_y = jk.field_b;
            ah.field_h = ke.field_a;
            ke.field_a = false;
            qi.field_N = kb.field_f;
            sf.field_c = fk.field_b;
            ng.field_ob = dd.field_c;
            kb.field_f = 0;
            break L0;
          }
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_y = null;
        field_w = null;
    }

    final static void a(int param0, boolean param1) {
        e.field_a = true;
        da.field_b = new ta();
        int var2 = -121 / ((param0 - -63) / 34);
        int var3 = da.field_b.d((byte) -73);
        di.field_d = new wc(var3);
        int var4 = da.field_b.c(5201);
        int var5 = da.field_b.a(-3, dh.field_d, bj.field_y);
        di.field_d.a(95, param1, var5, var4);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param1 != 34) {
          ((nf) this).field_v = 118;
          var6 = ((nf) this).field_A << 3;
          var7 = ((nf) this).field_z << 3;
          param0 = (param0 << 4) + (15 & var6);
          param4 = (param4 << 4) - -(15 & var7);
          ((nf) this).a(var6, var7, param0, param4, param3, param2);
          return;
        } else {
          var6 = ((nf) this).field_A << 3;
          var7 = ((nf) this).field_z << 3;
          param0 = (param0 << 4) + (15 & var6);
          param4 = (param4 << 4) - -(15 & var7);
          ((nf) this).a(var6, var7, param0, param4, param3, param2);
          return;
        }
    }

    nf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new cn();
        field_t = new int[8192];
        field_u = true;
    }
}
