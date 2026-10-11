/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en extends d {
    private Object field_u;
    static ce field_v;

    en(Object param0, int param1) {
        super(param1);
        try {
          this.field_u = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "en.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        Object var3 = null;
        og var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        df var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var3 = null;
        var12 = Torquing.field_u;
        try {
          var14 = kj.field_d;
          var2 = var14.i((byte) -101);
          var3_ref = (og) (bh.field_c.b(0));
          while (var3_ref != null) {
            if (var2 != var3_ref.field_j) {
              var3_ref = (og) (bh.field_c.f(-24059));
              continue;
            }
            break;
          }
          if (var3_ref == null) {
            ih.b(true);
            return;
          }
          if (param0 != 50) {
            return;
          }
          var4 = var14.i((byte) -101);
          if (0 != var4) {
            var5 = var3_ref.field_l;
            vl.field_d[0] = re.field_e;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              vl.field_d[var6_int] = var14.h((byte) 124);
            }
            jn.a(var5, 3328, var4);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              ke.a(225225318, var14);
              if (var6_intLifetime1 == 0) {
                hb.a(eg.field_w, qc.field_bb, false, bf.field_c, um.field_p, var6_intLifetime1);
              } else {
                hb.a(eg.field_w, qc.field_bb, false, bf.field_c, um.field_p, var6_intLifetime1);
              }
            }
            ao.a(8191, var5);
            var6 = new String[2][var5];
            var18 = new int[2][var5 * 4];
            var8 = vg.field_o;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = lp.field_g[var9];
              var6[0][var10] = vl.field_d[var11];
              var18[0][4 * var10] = il.field_o[var11];
              var18[0][var10 * 4 + 1] = wh.field_y[var11];
              var18[0][4 * var10 + 2] = vo.field_d[var11];
              var18[0][var10 * 4 + 3] = vp.field_F[var11];
              if (bn.a(vl.field_d[var11], -17310) &&
                wh.field_y[var11] + (vo.field_d[var11] + vp.field_F[var11]) == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = lp.field_g[var9Lifetime1 + var5];
              var6[1][var13] = vl.field_d[var11Lifetime1];
              var18[1][var13 * 4] = il.field_o[var11Lifetime1];
              var18[1][4 * var13 + 1] = wh.field_y[var11Lifetime1];
              var18[1][2 + var13 * 4] = vo.field_d[var11Lifetime1];
              var18[1][4 * var13 + 3] = vp.field_F[var11Lifetime1];
              if (bn.a(vl.field_d[var11Lifetime1], -17310) &&
                vp.field_F[var11Lifetime1] + wh.field_y[var11Lifetime1] + vo.field_d[var11Lifetime1] == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9Lifetime1++;
            }
            var3_ref.f(0);
            return;
          }
          var3_ref.f(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "en.F(" + param0 + ')');
        }
    }

    final Object b(int param0) {
        if (param0 != 12) {
          return (Object) null;
        }
        return this.field_u;
    }

    final boolean c(byte param0) {
        if (param0 != 37) {
          this.b(-74);
          return false;
        }
        return false;
    }

    public static void c(int param0) {
        if (param0 != 1) {
          return;
        }
        field_v = null;
    }

    static {
        field_v = new ce();
    }
}
