/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends ag {
    private ag field_o;
    private int field_k;
    static int field_m;
    static ci field_n;
    static int[] field_l;

    public static void e(int param0) {
        field_n = null;
        field_l = null;
        if (param0 != 0) {
            nd.e(-80);
        }
    }

    final void b(int[] param0, int param1, int param2) {
        if (!(((nd) this).field_k <= param2)) {
            ((nd) this).field_k = ((nd) this).field_k - param2;
            return;
        }
        param1 = param1 + ((nd) this).field_k;
        param2 = param2 - ((nd) this).field_k;
        ((nd) this).field_o.field_b = ((nd) this).field_b;
        ((nd) this).field_o.field_f = ((nd) this).field_f;
        ((nd) this).field_k = 0;
        ((nd) this).field_f.field_b = (wf) (Object) ((nd) this).field_o;
        ((nd) this).field_b.field_f = (wf) (Object) ((nd) this).field_o;
        ((nd) this).field_f = null;
        ((nd) this).field_b = null;
        if (!(0 >= param2)) {
            ((nd) this).field_o.b(param0, param1, param2);
        }
    }

    final int c() {
        return ((nd) this).field_o.c();
    }

    final int b() {
        return 0;
    }

    final ag d() {
        return null;
    }

    final void d(int param0) {
        if (((nd) this).field_k > param0) {
          ((nd) this).field_k = ((nd) this).field_k - param0;
          return;
        } else {
          L0: {
            param0 = param0 - ((nd) this).field_k;
            ((nd) this).field_k = 0;
            ((nd) this).field_o.field_f = ((nd) this).field_f;
            ((nd) this).field_o.field_b = ((nd) this).field_b;
            ((nd) this).field_f.field_b = (wf) (Object) ((nd) this).field_o;
            ((nd) this).field_b.field_f = (wf) (Object) ((nd) this).field_o;
            ((nd) this).field_b = null;
            ((nd) this).field_f = null;
            if (param0 > 0) {
              ((nd) this).field_o.d(param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != -106) {
            return true;
        }
        return param1 == (-param1 & param1) ? true : false;
    }

    final ag a() {
        return null;
    }

    nd(ag param0, int param1) {
        ((nd) this).field_o = param0;
        ((nd) this).field_g = ((nd) this).field_o.field_g;
        ((nd) this).field_k = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 9;
        field_l = new int[8192];
    }
}
