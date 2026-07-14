/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static int field_c;
    private at[] field_b;
    static String[] field_a;
    static wk[] field_d;

    final String[] a(int param0) {
        int var4_int = 0;
        bb var5_ref = null;
        int var6 = 0;
        u var7_ref_u = null;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = param0;
        String[][] var3 = new String[((tt) this).field_b.length][];
        for (var4_int = 0; ((tt) this).field_b.length > var4_int; var4_int++) {
            var3[var4_int] = new String[((tt) this).field_b[var4_int].b(false)];
            var5_ref = new bb(((tt) this).field_b[var4_int]);
            var6 = 0;
            var7_ref_u = (u) (Object) var5_ref.c(50);
            while (var7_ref_u != null) {
                var2++;
                var6++;
                var3[var4_int][var6] = var7_ref_u.field_m.a(param0 + -124);
                var7_ref_u = (u) (Object) var5_ref.b(param0 ^ 50);
            }
        }
        String[] var4 = new String[var2 + ((tt) this).field_b.length];
        int var5 = 0;
        for (var6 = 0; ((tt) this).field_b.length > var6; var6++) {
            var5++;
            var4[var5] = "player [" + var6 + "]";
            for (var7 = 0; var3[var6].length > var7; var7++) {
                var5++;
                var4[var5] = var3[var6][var7];
            }
        }
        return var4;
    }

    final void a(byte param0) {
        int var3 = 0;
        at var4 = null;
        bb var5 = null;
        u var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        at[] var8 = ((tt) this).field_b;
        at[] var2 = var8;
        for (var3 = 0; var8.length > var3; var3++) {
            var4 = var8[var3];
            var5 = new bb(var4);
            var6 = (u) (Object) var5.c(50);
            while (var6 != null) {
                if (!(!(var6.field_m instanceof up))) {
                    var6.d(87);
                }
                var6 = (u) (Object) var5.b(50);
            }
        }
        if (param0 < 4) {
            field_c = -58;
        }
    }

    final static int a(int param0, int param1, int[] param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if ((param1 ^ -1) > 9) {
            break L0;
          } else {
            if (param0 < -10) {
              break L0;
            } else {
              if (244 < param1) {
                break L0;
              } else {
                if (244 >= param0) {
                  var4 = 5;
                  L1: while (true) {
                    if (-1 < (var4 ^ -1)) {
                      L2: {
                        if (!param3) {
                          break L2;
                        } else {
                          field_d = null;
                          break L2;
                        }
                      }
                      return -1;
                    } else {
                      L3: {
                        var5 = nd.field_d[var4];
                        if (bc.field_j[var5].length > param2[var5]) {
                          break L3;
                        } else {
                          param2[var5] = 0;
                          break L3;
                        }
                      }
                      if (param2[var5] > -1) {
                        if (bc.field_j[var5][param2[var5]].a(dp.field_Vb[var5][0], dp.field_Vb[var5][1], param1, param0)) {
                          return var5;
                        } else {
                          var4--;
                          continue L1;
                        }
                      } else {
                        if (lt.field_h[var5].b(dp.field_Vb[var5][0], dp.field_Vb[var5][1], param1, param0)) {
                          return var5;
                        } else {
                          var4--;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -2;
    }

    final void b(int param0, int param1) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var3 = new bb(((tt) this).field_b[param1]);
        if (param0 != 244) {
            return;
        }
        u var4 = (u) (Object) var3.c(50);
        while (var4 != null) {
            if (!(!(var4.field_m instanceof up))) {
                var4.d(-115);
            }
            var4 = (u) (Object) var3.b(50);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
            tt.a(true);
        }
    }

    final boolean a(byte param0, int param1) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var3 = new bb(((tt) this).field_b[param1]);
        if (param0 > -49) {
            return false;
        }
        u var4 = (u) (Object) var3.c(50);
        while (var4 != null) {
            if (var4.field_m.c(-128)) {
                return true;
            }
            var4 = (u) (Object) var3.b(50);
        }
        return false;
    }

    final boolean a(int param0, int param1) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var3 = new bb(((tt) this).field_b[param0]);
        u var4 = (u) (Object) var3.c(50);
        if (param1 > -46) {
            boolean discarded$0 = ((tt) this).a(85, 104);
        }
        while (var4 != null) {
            if (!(!var4.field_m.b(0))) {
                return true;
            }
            var4 = (u) (Object) var3.b(50);
        }
        return false;
    }

    tt(int param0) {
        int var2 = 0;
        ((tt) this).field_b = new at[param0];
        for (var2 = 0; var2 < ((tt) this).field_b.length; var2++) {
            ((tt) this).field_b[var2] = new at();
        }
    }

    final void a(lv param0, byte param1, int param2) {
        ((tt) this).field_b[param2].a(750, (tc) (Object) new u(param0));
        if (param1 < 81) {
            field_a = null;
        }
    }

    static {
    }
}
