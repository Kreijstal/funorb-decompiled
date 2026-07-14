/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static int field_c;
    static tg[] field_a;
    static boolean field_e;
    static sa field_f;
    static String field_h;
    static int field_d;
    static String field_b;
    static String field_g;

    final static sa a(int param0, int param1, int param2, int param3, int param4) {
        sa var5 = null;
        sa var5_ref = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        var5 = (sa) (Object) jl.field_f.a((byte) -50);
        L0: while (true) {
          if (var5 == null) {
            var5_ref = new sa();
            var5_ref.field_n = param4;
            var5_ref.field_g = param1;
            var5_ref.field_m = param2;
            jl.field_f.a(1, (ai) (Object) var5_ref);
            ha.a(-17765, var5_ref, param0);
            if (param3 != -16947) {
              return null;
            } else {
              return var5_ref;
            }
          } else {
            if (param4 == var5.field_n) {
              return var5;
            } else {
              var5 = (sa) (Object) jl.field_f.d((byte) -24);
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_f = null;
        if (param0 != 0) {
          pe.a(49);
          field_g = null;
          field_a = null;
          return;
        } else {
          field_g = null;
          field_a = null;
          return;
        }
    }

    final static we[] b(int param0) {
        int var2 = 0;
        int var3 = Bounce.field_N;
        we[] var1 = new we[nj.field_p];
        for (var2 = param0; nj.field_p > var2; var2++) {
            var1[var2] = new we(se.field_C, fk.field_e, cl.field_n[var2], ae.field_c[var2], ih.field_V[var2], qh.field_i[var2], ph.field_c[var2], he.field_k);
        }
        vb.a((byte) 122);
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_h = "Back";
        field_b = "Player Name: ";
        field_g = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
