/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends RuntimeException {
    String field_a;
    Throwable field_c;
    static hk field_b;

    final static void a(db param0, int param1) {
        if (param1 != 6) {
            field_b = null;
        }
        ja.b((byte) -111);
        lf.a(param0.field_y, param0.field_r, param0.field_x);
    }

    final static void a(int param0, sh param1) {
        int var3 = 0;
        int var4 = 0;
        pk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        th var8 = null;
        int var9 = 0;
        th var10 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        var8 = new th(param1.a((byte) 127, "", "logo.fo3d"));
        var10 = var8;
        var3 = var10.d(true);
        var10.e(10);
        sh.field_d = cl.a(var10, -121);
        uj.field_f = new int[var3][];
        ae.field_J = new pk[var3];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3) {
            var10.f(8);
            var9 = param0;
            var4 = var9;
            L1: while (true) {
              if (var3 <= var9) {
                return;
              } else {
                var5 = ae.field_J[var9];
                var5.a(6, 6, (byte) 52, 1, 6);
                var5.a((byte) -50);
                var6 = new int[]{var5.field_v + var5.field_m >> -1501649279, var5.field_M + var5.field_G >> -176702207, var5.field_F + var5.field_O >> -20484031};
                uj.field_f[var9] = var6;
                var5.a(-var6[2], -var6[1], false, -var6[0]);
                var9++;
                continue L1;
              }
            }
          } else {
            ae.field_J[var4] = tb.a(var8, dg.a(param0, -114));
            var4++;
            continue L0;
          }
        }
    }

    final static void a(boolean param0, float param1, String param2, boolean param3) {
        if (null == qj.field_fb) {
            qj.field_fb = new uk(ug.field_A, jj.field_d);
            ug.field_A.a(-14579, (w) (Object) qj.field_fb);
        }
        qj.field_fb.a(param0, param2, 125, param1);
        lf.a();
        we.a((byte) -65, param3);
    }

    public static void a(int param0) {
        if (param0 != 6) {
            return;
        }
        field_b = null;
    }

    de(Throwable param0, String param1) {
        ((de) this).field_a = param1;
        ((de) this).field_c = param0;
    }

    static {
    }
}
