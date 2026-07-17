/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static int[] field_c;
    static int field_e;
    static String field_d;
    static g field_b;
    static String field_a;

    public static void b(byte param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 <= 24) {
            ic.b((byte) 73);
        }
    }

    final static void a(boolean param0) {
        we.field_e = param0 ? new mk(qf.field_a, eh.field_q) : new mk(rl.field_e, qd.field_Q);
        tl.field_P = new hl(0L, (hl) null);
        tl.field_P.a((byte) -98, (hl) (Object) we.field_e.field_g);
        tl.field_P.a((byte) -114, qi.field_n);
        fj.field_b = new hl(0L, sa.field_h);
        wb.field_e = new hl(0L, (hl) null);
        fj.field_b.a((byte) -90, dc.field_l);
        fj.field_b.a((byte) -123, wb.field_e);
        wb.field_e.a((byte) 21, hh.field_c);
        wb.field_e.a((byte) 18, c.field_b);
        int discarded$0 = 1;
        cc.a(param0);
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (!bh.field_r) {
          throw new IllegalStateException();
        } else {
          k.field_c = true;
          ck.a((byte) 126, false);
          fn.field_R = 0;
          var1 = 82 / ((param0 - -51) / 57);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Passwords can only contain letters and numbers";
        field_a = "Creating your account";
    }
}
