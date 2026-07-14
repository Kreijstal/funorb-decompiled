/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static int field_c;
    static int[] field_a;
    static int field_b;
    static String field_d;
    static fj field_e;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_e = null;
        if (param0 != 0) {
            Object var2 = null;
            ji[] discarded$0 = rf.a((uf) null, false);
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        aj var4 = null;
        Object var5 = null;
        ti var5_ref = null;
        var5 = null;
        var3 = TrackController.field_F ? 1 : 0;
        var4 = (aj) (Object) ub.field_e.b(param1 + 2);
        L0: while (true) {
          if (var4 == null) {
            if (param1 == 0) {
              var5_ref = (ti) (Object) ea.field_s.b(2);
              L1: while (true) {
                if (var5_ref == null) {
                  return;
                } else {
                  mc.a(false, param0, var5_ref);
                  var5_ref = (ti) (Object) ea.field_s.a(10);
                  continue L1;
                }
              }
            } else {
              field_d = null;
              var5_ref = (ti) (Object) ea.field_s.b(2);
              L2: while (true) {
                if (var5_ref == null) {
                  return;
                } else {
                  mc.a(false, param0, var5_ref);
                  var5_ref = (ti) (Object) ea.field_s.a(10);
                  continue L2;
                }
              }
            }
          } else {
            we.a(param0, var4, (byte) -47);
            var4 = (aj) (Object) ub.field_e.a(10);
            continue L0;
          }
        }
    }

    final static boolean b(int param0) {
        int var1 = 0;
        var1 = 70 / ((param0 - 57) / 63);
        if (null != tk.field_u) {
          if (!tk.field_u.a(32130)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(boolean param0) {
        r.field_j = -1;
        if (!param0) {
            return;
        }
        nl.field_f = null;
        cd.field_j = false;
        aj.field_m = -1;
        vl.field_H = 0;
    }

    final static ji[] a(uf param0, boolean param1) {
        int[] var3 = null;
        ji[] var4 = null;
        int var5 = 0;
        ji var6 = null;
        int var7 = 0;
        Object var8 = null;
        ce var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var7 = TrackController.field_F ? 1 : 0;
        if (!param0.b(-4)) {
          return new ji[]{};
        } else {
          var9 = param0.a(75);
          L0: while (true) {
            if (-1 != (var9.field_f ^ -1)) {
              if (var9.field_f != 2) {
                var13 = (int[]) var9.field_e;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var3 = var10;
                var4 = new ji[var13.length >> -403853758];
                if (param1) {
                  var8 = null;
                  ji[] discarded$2 = rf.a((uf) null, false);
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      return var4;
                    } else {
                      var6 = new ji();
                      var4[var5] = var6;
                      var6.field_f = var3[var5 << -1420101182];
                      var6.field_c = var3[(var5 << 1047566082) - -1];
                      var6.field_b = var3[2 + (var5 << -451239390)];
                      var6.field_g = var3[(var5 << -1482664574) + 3];
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      return var4;
                    } else {
                      var6 = new ji();
                      var4[var5] = var6;
                      var6.field_f = var3[var5 << -1420101182];
                      var6.field_c = var3[(var5 << 1047566082) - -1];
                      var6.field_b = var3[2 + (var5 << -451239390)];
                      var6.field_g = var3[(var5 << -1482664574) + 3];
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new ji[]{};
              }
            } else {
              wl.a(10L, false);
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Password: ";
        field_a = new int[1024];
    }
}
