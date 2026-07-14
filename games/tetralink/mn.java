/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static String field_f;
    static int field_c;
    static int field_e;
    static hl field_d;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        int var1 = -42 / ((param0 - 68) / 41);
        field_b = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param1 != -1) {
            Object var5 = null;
            mn.a((java.awt.Component) null, true);
        }
        if (!(mm.field_y == null)) {
            var3 = mm.field_y.a(param0, false);
            if (var3 != -2) {
                if (!(var3 == -1)) {
                    var4 = mm.field_y.d((byte) 121) ? 1 : 0;
                    mk.a(-117, mm.field_y.e((byte) 26), var3, var4 != 0, mm.field_y.field_Ob, param2);
                }
                mm.field_y = null;
                gg.c((byte) 43);
            }
        }
    }

    final static nl[] a(ie param0, int param1) {
        int var5 = 0;
        nl var6 = null;
        int var7 = TetraLink.field_J;
        if (!param0.a((byte) -84)) {
            return new nl[]{};
        }
        vl var8 = param0.a(false);
        while (var8.field_d == 0) {
            tb.a(false, 10L);
        }
        if (!(-3 != (var8.field_d ^ -1))) {
            return new nl[]{};
        }
        int[] var12 = (int[]) var8.field_f;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        nl[] var4 = new nl[var12.length >> 591991842];
        if (param1 != 37956674) {
            mn.a(-102);
        }
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new nl();
            var4[var5] = var6;
            var6.field_k = var3[var5 << -1937277950];
            var6.field_e = var3[(var5 << -1659244958) - -1];
            var6.field_h = var3[(var5 << -1337960030) + 2];
            var6.field_i = var3[(var5 << 37956674) + 3];
        }
        return var4;
    }

    final static void a(java.awt.Component param0, boolean param1) {
        if (!param1) {
            return;
        }
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) vi.field_a);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) vi.field_a);
        mh.field_b = -1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = TetraLink.field_J;
          var6 = 485 + param2 + 8 - (-2 - param1 - 8);
          ea.field_f.a((byte) -104, -6 + var6, 3, oj.field_a.field_R - 6, 3);
          var7 = -5 + ea.field_f.field_R;
          pj.field_d.a((byte) -109, param1 + param2 - -487, var7 + -param3, param3, 5);
          in.field_g.a((byte) -112, -param2 + (pj.field_d.field_Hb + -ba.field_L.field_Hb), 0, param3, param2);
          ba.field_L.a((byte) -96, ba.field_L.field_Hb, 0, param3, param2 + in.field_g.field_Hb);
          var7 = var7 - (2 + param3);
          id.field_M.a(485 + (param2 - (-2 + -param1)), param1, var7 - 5, true, 5, 5, 2);
          if (null == bk.field_e) {
            break L0;
          } else {
            bk.field_e.a(id.field_M.field_R, id.field_M.field_yb, -124, id.field_M.field_M, id.field_M.field_Hb);
            break L0;
          }
        }
        var8 = -var6 + oj.field_a.field_Hb - param2;
        var9 = var8 / 2;
        var10 = param4 + var9 + param2;
        var11 = 0;
        if (param0 == -7) {
          var12 = 0;
          L1: while (true) {
            if (-7 >= (var12 ^ -1)) {
              return;
            } else {
              L2: {
                if (5 <= var12) {
                  break L2;
                } else {
                  if (null != nj.field_f[var12]) {
                    break L2;
                  } else {
                    var12++;
                    continue L1;
                  }
                }
              }
              var13 = 3 + (2 + oj.field_a.field_R + -6) * var11 / (v.field_r - -1);
              var11++;
              var7 = (-6 + (oj.field_a.field_R - -2)) * var11 / (v.field_r + 1) + 3 + (-2 - var13);
              if (var12 >= 5) {
                nc.field_e.a((byte) -88, var8, var13, var7, var6);
                var12++;
                continue L1;
              } else {
                nj.field_f[var12].a((byte) -111, var8, var13, var7, var6);
                el.field_oc[var12].a((byte) -103, -param2 + var9, 0, var7, param2);
                fh.field_f[var12].a((byte) -93, param4, param5, -param5 + var7 + -param5, var9);
                og.field_o[var12].a((byte) -108, -var10 + -param2 + var8, param5, var7 - param5 - param5, var10);
                var12++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Message lobby";
        field_e = 5;
        field_b = "The game options are not all set.";
    }
}
