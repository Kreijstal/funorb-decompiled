/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static gh field_b;
    q field_d;
    static ks field_a;
    static kj field_c;

    final static long a(int param0) {
        if (param0 != 18) {
          field_c = (kj) null;
          return pr.a(14274) - pf.field_e;
        }
        return pr.a(14274) - pf.field_e;
    }

    final static void a(boolean param0) {
        cl var1 = null;
        cl var1Lifetime1;
        if (!param0) {
          var1 = (cl) (ql.field_p.a(true));
          if (var1 == null) {
            var1 = new cl();
          }
          var1.a(gf.field_i, gf.field_f, gf.field_h, gf.field_k, gf.field_a, 5, gf.field_b, gf.field_l);
          ta.field_b.a((byte) -113, var1);
          return;
        }
        bi[] var2 = (bi[]) null;
        wh.a((bi[]) null, 98, -107, (byte) 31, 66);
        var1Lifetime1 = (cl) (ql.field_p.a(true));
        if (var1Lifetime1 == null) {
          var1Lifetime1 = new cl();
        }
        var1Lifetime1.a(gf.field_i, gf.field_f, gf.field_h, gf.field_k, gf.field_a, 5, gf.field_b, gf.field_l);
        ta.field_b.a((byte) -113, var1Lifetime1);
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(bi[] param0, int param1, int param2, byte param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != null &&
            0 < param2) {
            if (param3 >= -86) {
              field_a = (ks) null;
            }
            var5_int = param0[0].field_o;
            var6 = param0[2].field_o;
            var7 = param0[1].field_o;
            param0[0].f(param4, param1);
            param0[2].f(param2 + param4 - var6, param1);
            gf.a(fc.field_g);
            gf.i(var5_int + param4, param1, -var6 + param2 + param4, param0[1].field_p + param1);
            var8 = var5_int + param4;
            var9 = -var6 + param4 + param2;
            for (param4 = var8; param4 < var9; param4 = param4 + var7) {
              param0[1].f(param4, param1);
            }
            gf.b(fc.field_g);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("wh.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    wh(String param0, qr param1) {
        String[] var3 = null;
        qr[] var4 = null;
        try {
          var3 = new String[]{param0, gm.field_o, wk.field_b};
          var4 = new qr[]{param1, cg.field_A, (qr) ((Object) wg.field_a)};
          this.field_d = new q(0L, re.field_h, var3, tm.field_t, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_d.a(param3, param4, param1, var6, param0, false, var7);
        rj.field_p.a(cg.field_A.field_K, cr.field_c, (byte) 59, 0, 0);
        vn.field_t.a(-pe.field_K + (cg.field_A.field_K - 2 - 82), 18, (byte) 82, 2 + cr.field_c, 0);
        mg.field_F.a(82 + pe.field_K, 18, (byte) 117, 2 + cr.field_c, -80 - pe.field_K + (cg.field_A.field_K - 2));
        d.field_a.a(-22 + (cg.field_A.field_mb - cr.field_c), 20 + cr.field_c + 2, pe.field_K, 2, 20, cg.field_A.field_K, (byte) 123, 0);
        wg.field_a.a(2, pe.field_K, 0, 20);
        if (param2 == 95) {
          return;
        }
        field_c = (kj) null;
    }

    static {
    }
}
