/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends nm {
    String field_o;
    int field_l;
    static int field_m;
    int field_n;
    int field_q;
    String field_j;
    int field_i;
    static boolean field_p;
    static String field_k;

    public static void a(byte param0) {
        field_k = null;
        if (param0 <= 90) {
            wk.a((byte) -14);
        }
    }

    final void a(int param0, wq param1) {
        if (param0 != -12988) {
          ((wk) this).field_i = -16;
          ((wk) this).field_n = param1.i(param0 ^ -52668);
          ((wk) this).field_o = op.a(false, 1 + ((wk) this).field_n);
          ((wk) this).field_q = param1.e(255);
          ((wk) this).field_l = param1.l(255);
          ((wk) this).field_i = param1.e(param0 ^ -12869);
          ((wk) this).field_j = param1.a((byte) 24);
          return;
        } else {
          ((wk) this).field_n = param1.i(param0 ^ -52668);
          ((wk) this).field_o = op.a(false, 1 + ((wk) this).field_n);
          ((wk) this).field_q = param1.e(255);
          ((wk) this).field_l = param1.l(255);
          ((wk) this).field_i = param1.e(param0 ^ -12869);
          ((wk) this).field_j = param1.a((byte) 24);
          return;
        }
    }

    wk() {
    }

    static {
    }
}
