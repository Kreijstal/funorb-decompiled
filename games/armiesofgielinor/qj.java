/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends oj {
    int field_D;
    private boolean field_B;
    static je field_z;
    int field_y;
    static StringBuilder field_C;

    final static void h(int param0) {
        er.a((byte) -127);
        int var1 = 2 % ((1 - param0) / 51);
    }

    final void a(ha param0, int param1) {
        jd var4 = null;
        jd var5 = null;
        if (!((qj) this).field_B) {
          ((qj) this).field_B = true;
          var4 = param0.c(((qj) this).field_y, true, ((qj) this).field_D);
          var5 = var4;
          if (var5 == null) {
            return;
          } else {
            if (!param0.field_b) {
              if (param0.field_sb == var5.field_O) {
                if (param0.field_H[var4.field_O] < 10) {
                  param0.field_l.a((byte) -119, (tc) (Object) new hp(((qj) this).field_D, ((qj) this).field_y));
                  fl.a(param0, -113);
                  if (param1 != -26661) {
                    field_z = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  param0.field_H[var4.field_O] = param0.field_H[var4.field_O] - 10;
                  if (param0.field_b) {
                    param0.field_ub[var4.field_O] = param0.field_ub[var4.field_O] + 10;
                    param0.d(var5.field_O, param0.field_ub[var4.field_O], 85, 10);
                    fl.a(param0, -113);
                    if (param1 != -26661) {
                      field_z = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    fl.a(param0, -113);
                    if (param1 != -26661) {
                      field_z = null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param0.field_H[var4.field_O] < 10) {
                param0.field_l.a((byte) -119, (tc) (Object) new hp(((qj) this).field_D, ((qj) this).field_y));
                fl.a(param0, -113);
                if (param1 != -26661) {
                  field_z = null;
                  return;
                } else {
                  return;
                }
              } else {
                param0.field_H[var4.field_O] = param0.field_H[var4.field_O] - 10;
                if (param0.field_b) {
                  param0.field_ub[var4.field_O] = param0.field_ub[var4.field_O] + 10;
                  param0.d(var5.field_O, param0.field_ub[var4.field_O], 85, 10);
                  fl.a(param0, -113);
                  if (param1 != -26661) {
                    field_z = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  fl.a(param0, -113);
                  if (param1 != -26661) {
                    field_z = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(kl param0, int param1) {
        Object var3 = null;
        bc.field_j = new ru[6][];
        lt.field_h = new wk[6];
        lt.field_h[1] = ic.a("coatofarms_lbarespace", (byte) 51, "basic", param0);
        lt.field_h[2] = ic.a("coatofarms_rbarespace", (byte) 51, "basic", param0);
        lt.field_h[5] = ic.a("coatofarms_iconspace", (byte) 51, "basic", param0);
        lt.field_h[4] = ic.a("coatofarms_topperspace", (byte) 51, "basic", param0);
        bc.field_j[0] = lo.a("coatofarms_bases", -28106, "basic", param0);
        if (param1 <= 20) {
          var3 = null;
          qj.a((kl) null, 74);
          bc.field_j[1] = lo.a("coatofarms_lbarers", -28106, "basic", param0);
          bc.field_j[2] = lo.a("coatofarms_rbarers", -28106, "basic", param0);
          bc.field_j[3] = lo.a("coatofarms_banners", -28106, "basic", param0);
          bc.field_j[5] = lo.a("coatofarms_icons", -28106, "basic", param0);
          bc.field_j[4] = lo.a("coatofarms_toppers", -28106, "basic", param0);
          a.field_m = fk.a("coatofarms_effects", (byte) -124, param0, "basic");
          wk discarded$2 = ic.a("coatofarms_palette", (byte) 51, "basic", param0);
          sa.field_a = ic.a("coatofarms_scrollbutton", (byte) 51, "basic", param0);
          wv.field_h = fk.a("coatofarms_buttons", (byte) -128, param0, "basic");
          return;
        } else {
          bc.field_j[1] = lo.a("coatofarms_lbarers", -28106, "basic", param0);
          bc.field_j[2] = lo.a("coatofarms_rbarers", -28106, "basic", param0);
          bc.field_j[3] = lo.a("coatofarms_banners", -28106, "basic", param0);
          bc.field_j[5] = lo.a("coatofarms_icons", -28106, "basic", param0);
          bc.field_j[4] = lo.a("coatofarms_toppers", -28106, "basic", param0);
          a.field_m = fk.a("coatofarms_effects", (byte) -124, param0, "basic");
          wk discarded$3 = ic.a("coatofarms_palette", (byte) 51, "basic", param0);
          sa.field_a = ic.a("coatofarms_scrollbutton", (byte) 51, "basic", param0);
          wv.field_h = fk.a("coatofarms_buttons", (byte) -128, param0, "basic");
          return;
        }
    }

    public static void g(int param0) {
        if (param0 != 10) {
            qj.g(30);
            field_z = null;
            field_C = null;
            return;
        }
        field_z = null;
        field_C = null;
    }

    final String a(byte param0, boolean param1) {
        int var3 = 0;
        String var4 = null;
        var3 = -19 / ((param0 - 53) / 51);
        if (param1) {
          System.out.println("Upkeep event debug");
          System.out.println("Unit at " + ((qj) this).field_D + "," + ((qj) this).field_y);
          var4 = "EventUpkeep: (" + ((qj) this).field_D + "," + ((qj) this).field_y + ")";
          return var4;
        } else {
          var4 = "EventUpkeep: (" + ((qj) this).field_D + "," + ((qj) this).field_y + ")";
          return var4;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        int var4 = 0;
        var4 = ((qj) this).a((byte) -39, param2, param0, true) ? 1 : 0;
        ((qj) this).a(param2.field_xb, -26661);
        if (param1 >= -84) {
          return false;
        } else {
          return var4 != 0;
        }
    }

    qj(int param0, int param1) {
        ((qj) this).field_m = 20;
        ((qj) this).field_D = param0;
        ((qj) this).field_y = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new StringBuilder(80);
    }
}
