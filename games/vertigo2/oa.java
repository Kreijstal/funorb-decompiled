/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends da {
    static String field_o;
    static int field_l;
    private String field_n;
    private boolean field_r;
    static int field_p;
    static cr field_s;
    private rf field_m;
    static int field_q;

    final String b(int param0, String param1) {
        if (param0 == 3614) {
          if (((oa) this).field_m.a(-1, param1) != ir.field_a) {
            if (((oa) this).a(param0 + -3615, param1) == ir.field_a) {
              return vl.field_b;
            } else {
              return mh.field_b;
            }
          } else {
            return ((oa) this).field_m.b(3614, param1);
          }
        } else {
          field_o = null;
          if (((oa) this).field_m.a(-1, param1) != ir.field_a) {
            if (((oa) this).a(param0 + -3615, param1) == ir.field_a) {
              return vl.field_b;
            } else {
              return mh.field_b;
            }
          } else {
            return ((oa) this).field_m.b(3614, param1);
          }
        }
    }

    public static void g(int param0) {
        field_o = null;
        if (param0 > -107) {
            field_l = -41;
            field_s = null;
            return;
        }
        field_s = null;
    }

    final ba a(int param0, String param1) {
        if (((oa) this).field_m.a(param0, param1) == ir.field_a) {
            return ir.field_a;
        }
        if (param1.equals((Object) (Object) ((oa) this).field_n)) {
            return ((oa) this).field_r ? qm.field_G : ir.field_a;
        }
        bk var3 = ig.a(param1, false);
        if (!(var3.a((byte) -100))) {
            return dj.field_c;
        }
        ((oa) this).field_n = param1;
        ((oa) this).field_r = var3.c((byte) -119);
        return ((oa) this).field_r ? qm.field_G : ir.field_a;
    }

    oa(kp param0, kp param1) {
        super(param0);
        ((oa) this).field_r = false;
        ((oa) this).field_n = "";
        ((oa) this).field_m = new rf(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
        field_o = "Unable to delete friend - system busy";
    }
}
