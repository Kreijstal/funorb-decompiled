/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bo extends ff {
    private long field_m;
    private String field_k;
    static boolean field_l;

    final static me[] b(int param0) {
        if (param0 != 140) {
          return null;
        } else {
          return new me[]{uc.field_k, ll.field_d, bb.field_c};
        }
    }

    final void a(int param0, wq param1) {
        if (param0 != 0) {
            return;
        }
        param1.a(-23054, ((bo) this).field_m);
        param1.a(false, ((bo) this).field_k);
    }

    bo(long param0, String param1) {
        ((bo) this).field_k = param1;
        ((bo) this).field_m = param0;
    }

    final static void a(byte param0, String param1) {
        fj.a(243, param1, 140, nn.field_g, -15531, 2);
        if (param0 <= 93) {
            me[] discarded$0 = bo.b(99);
        }
    }

    cd a(int param0) {
        if (param0 != 13) {
            return null;
        }
        return de.field_v;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = false;
    }
}
