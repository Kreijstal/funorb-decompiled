/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static tp[] field_f;
    static int[] field_b;
    static String field_e;
    static String[] field_c;
    static jp field_a;
    static int field_d;

    final static jp a(int param0, jp param1) {
        jp var2 = new jp(param1.field_x / 2, param1.field_z / 2);
        if (param0 != -16371) {
            Object var3 = null;
            pl.a(-81, (byte[]) null, 117, false, 81, (byte) 40);
        }
        var2.g();
        param1.a(0, 0);
        kc.field_q.a((byte) 103);
        return var2;
    }

    final static void a(int param0, byte[] param1, int param2, boolean param3, int param4, byte param5) {
        pi var6 = k.field_h;
        var6.e(-13413, param0);
        var6.field_l = var6.field_l + 1;
        int var7 = var6.field_l;
        var6.a(15, 4);
        var6.a(81, param2);
        if (param5 >= -55) {
            field_b = null;
        }
        int var8 = param4;
        if (!(!param3)) {
            // wide iinc 8 128
        }
        var6.a(46, var8);
        var6.a(param1, -1, 0, param1.length);
        var6.d((byte) 123, -var7 + var6.field_l);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
            Object var2 = null;
            jp discarded$0 = pl.a((String) null, (String) null, (byte) -53, (mf) null);
        }
        field_c = null;
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final static void a(jp param0, int param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        var15 = new int[param0.field_C];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var2 = var11;
        var3 = 0;
        var4 = 0;
        var5_int = param1;
        L0: while (true) {
          if (var5_int >= param0.field_C) {
            var3 = 0;
            var5 = new int[var4 + param0.field_C];
            var6 = 0;
            L1: while (true) {
              if (param0.field_C <= var6) {
                var6 = 0;
                L2: while (true) {
                  if (var4 <= var6) {
                    param0.field_G = var5;
                    return;
                  } else {
                    var3++;
                    var5[var3] = param0.field_G[var6];
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var3++;
                var5[var3] = var15[var6];
                var6++;
                continue L1;
              }
            }
          } else {
            var11[var5_int] = var4 + param0.field_C;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            L3: while (true) {
              if (param0.field_D <= var8) {
                var4++;
                var5_int++;
                continue L0;
              } else {
                var3++;
                var9 = param0.field_G[var3];
                if (var9 == 0) {
                  L4: {
                    if (0 >= var6) {
                      break L4;
                    } else {
                      var6 = 0;
                      var4++;
                      break L4;
                    }
                  }
                  var7++;
                  param0.field_G[var4] = -var7;
                  var8++;
                  continue L3;
                } else {
                  L5: {
                    if (0 >= var7) {
                      break L5;
                    } else {
                      var4++;
                      var7 = 0;
                      break L5;
                    }
                  }
                  var6++;
                  param0.field_G[var4] = var6;
                  var8++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) lj.field_j);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lj.field_j);
        if (param1 != 7282) {
            Object var3 = null;
            jp discarded$0 = pl.a((String) null, (String) null, (byte) 8, (mf) null);
        }
        param0.addFocusListener((java.awt.event.FocusListener) (Object) lj.field_j);
    }

    final static int a(int param0, String param1, boolean param2) {
        if (param0 != 0) {
            pl.a(-94);
        }
        if (param2) {
            return lj.field_r.c(param1);
        }
        return oc.field_m.c(param1);
    }

    final static jp a(String param0, String param1, byte param2, mf param3) {
        int var4 = param3.a(param0, false);
        int var5 = param3.a(var4, -108, param1);
        int var6 = 116 % ((40 - param2) / 57);
        return dk.a(-873, param3, var4, var5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Ignore";
        field_b = vn.d(8);
        field_d = 0;
        field_c = new String[]{"All scores", "My scores", "Best each"};
    }
}
