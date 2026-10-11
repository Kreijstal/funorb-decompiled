/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class au extends aa {
    qk field_d;

    final static void b(boolean param0) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var2;
        var2 = TombRacer.field_G ? 1 : 0;
        if (param0) {
          return;
        }
        if (nla.field_a != ub.field_c) {
          if (vb.field_i == ub.field_c) {
            if (!vpa.a(23)) {
              if (qv.field_o != null) {
                su.a(qv.field_o, (byte) -108, 3);
              }
              qfa.a(-116);
              if (kpa.field_c) {
                kpa.field_c = false;
                in.a(-30600, false);
              }
            }
            ub.field_c = nn.field_c;
          } else {
            if (ub.field_c == nn.field_c) {
              fieldTemp$6 = lpa.field_o;
              lpa.field_o = lpa.field_o - 1;
              if (fieldTemp$6 <= 0) {
                ub.field_c = ub.field_h;
              }
            }
          }
        } else {
          fieldTemp$7 = lpa.field_o;
          lpa.field_o = lpa.field_o + 1;
          if (fieldTemp$7 >= 16) {
            if (!dd.field_a) {
              tta.e(true);
            } else {
              pg.b(param0);
            }
            ub.field_c = vb.field_i;
          }
        }
    }

    private au() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        kh var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        bna var12 = null;
        cga var13 = null;
        kh var14 = null;
        bna var15 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var14 = vc.field_q;
          var2 = var14.h(param0 + 252);
          if (var2 == 0) {
            var11 = fqa.e(true);
            var3 = var11;
            var10 = var11;
            var4 = var10;
            var5 = var14;
            var6 = ((uia) ((Object) var5)).h(255);
            for (var7 = 0; var7 < var6; var7++) {
              var10[var7] = ((uia) ((Object) var5)).e(99);
            }
            var12 = (bna) (tca.field_N.f(-80));
            if (var12 == null) {
              dea.a(60);
              return;
            }
            var12.field_f = var3;
            var12.field_g = true;
            var12.p(83);
          } else {
            if (var2 == 1) {
              var13 = (cga) (aba.field_a.f(-80));
              if (var13 == null) {
                dea.a(60);
                return;
              }
              var13.p(35);
            } else {
              if (var2 != 2) {
                ssa.a("A1: " + kk.a(32), (byte) 116, (Throwable) null);
                dea.a(param0 ^ 63);
              } else {
                var15 = (bna) (tca.field_N.f(-80));
                if (var15 == null) {
                  dea.a(60);
                  return;
                }
                var15.field_f = fqa.e(true);
                var15.field_g = true;
                var15.p(42);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "au.A(" + param0 + ')');
        }
    }

    static {
    }
}
