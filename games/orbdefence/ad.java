/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    String field_d;
    String field_c;
    static qh field_b;
    int field_a;
    String field_f;
    ki field_g;
    static hj field_e;

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        d var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        se var13 = null;
        int var14 = 0;
        se var15 = null;
        int[][] var19 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 <= 73) {
            return;
          }
          var13 = cd.field_t;
          var15 = var13;
          var2 = var15.b((byte) 90);
          var3 = (d) (md.field_h.b((byte) -66));
          while (var3 != null) {
            if (var3.field_f != var2) {
              var3 = (d) (md.field_h.d(853));
              continue;
            }
            break;
          }
          if (var3 == null) {
            th.a(122);
            return;
          }
          var4 = var15.b((byte) 90);
          if (var4 != 0) {
            var5 = var3.field_i;
            qd.field_c[0] = gb.field_h;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              qd.field_c[var6_int] = var13.g(2);
            }
            tl.a(var4, 12105912, var5);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              uj.a((byte) -85, var15);
              if (var6_intLifetime1 != 0) {
                a.a(var6_intLifetime1, cc.field_l, 9664, h.field_E, oh.field_b, fd.field_f);
              } else {
                a.a(var6_intLifetime1, cc.field_l, 9664, h.field_E, oh.field_b, fd.field_f);
              }
            }
            fe.a(var5, true);
            var6 = new String[2][var5];
            var19 = new int[2][var5 * 4];
            var8 = rc.field_d;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = bc.field_o[var9];
              var6[0][var10] = qd.field_c[var11];
              var19[0][4 * var10] = tl.field_d[var11];
              var19[0][1 + 4 * var10] = vl.field_g[var11];
              var19[0][var10 * 4 + 2] = th.field_f[var11];
              var19[0][var10 * 4 + 3] = ld.field_b[var11];
              if (fc.a((byte) -125, qd.field_c[var11]) &&
                ld.field_b[var11] + (th.field_f[var11] + vl.field_g[var11]) == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = bc.field_o[var9Lifetime1 + var5];
              var6[1][var14] = qd.field_c[var11Lifetime1];
              var19[1][var14 * 4] = tl.field_d[var11Lifetime1];
              var19[1][1 + 4 * var14] = vl.field_g[var11Lifetime1];
              var19[1][var14 * 4 + 2] = th.field_f[var11Lifetime1];
              var19[1][var14 * 4 + 3] = ld.field_b[var11Lifetime1];
              if (fc.a((byte) 124, qd.field_c[var11Lifetime1]) &&
                ld.field_b[var11Lifetime1] + (vl.field_g[var11Lifetime1] + th.field_f[var11Lifetime1]) == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var9Lifetime1++;
              var14++;
            }
            var3.b(57);
            return;
          }
          var3.b(57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "ad.C(" + param0 + ')');
        }
    }

    final static boolean a(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -72) {
          return true;
        }
        stackIn_7_0 = (pc.field_cb) || (n.b((byte) -96));
        return stackIn_7_0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        if (param0 != 0) {
          return;
        }
        try {
          lh.a(param1, "", false);
          bm.a(12979, param1);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ad.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
          field_e = (hj) null;
        }
        field_b = null;
    }

    private ad() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new qh();
    }
}
