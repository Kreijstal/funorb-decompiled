/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends lj {
    int field_B;
    int field_H;
    int field_A;
    int field_G;
    static nk field_I;
    int field_C;
    static String[] field_F;
    int field_D;

    final static vd a(byte param0) {
        int var1 = 0;
        if (null == fa.field_i) {
          fa.field_i = new vd();
          fa.field_i.a(-71, vd.field_h);
          fa.field_i.field_n = 2763306;
          fa.field_i.field_c = 6;
          fa.field_i.field_e = 4;
          fa.field_i.field_l = 0;
          fa.field_i.field_j = 14;
          fa.field_i.field_m = al.field_i;
          fa.field_i.field_g = 7697781;
          fa.field_i.field_i = 5;
          var1 = 40 / ((param0 - 72) / 54);
          return fa.field_i;
        } else {
          var1 = 40 / ((param0 - 72) / 54);
          return fa.field_i;
        }
    }

    public static void h(int param0) {
        if (param0 != 43) {
            return;
        }
        field_F = null;
        field_I = null;
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Transmogrify.field_A ? 1 : 0;
        if (super.b(param0, param1, param2, param3, param4 ^ 0, param5, param6)) {
          var8 = -((wh) this).field_H - param3 - (((wh) this).field_p - param0);
          var9 = param5 + (-((wh) this).field_G + -param6 + -((wh) this).field_n);
          if (var8 * var8 - -(var9 * var9) < ((wh) this).field_A * ((wh) this).field_A) {
            var10 = Math.atan2((double)var9, (double)var8) - ih.field_d;
            if (0.0 <= var10) {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)((wh) this).field_C;
                ((wh) this).field_B = (int)((double)((wh) this).field_C * var10 / 6.283185307179586);
                L0: while (true) {
                  if (((wh) this).field_B >= ((wh) this).field_C) {
                    ((wh) this).field_B = ((wh) this).field_B - ((wh) this).field_C;
                    continue L0;
                  } else {
                    L1: while (true) {
                      if (((wh) this).field_B >= 0) {
                        return true;
                      } else {
                        ((wh) this).field_B = ((wh) this).field_B + ((wh) this).field_C;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                ((wh) this).field_B = (int)((double)((wh) this).field_C * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((wh) this).field_B >= ((wh) this).field_C) {
                    ((wh) this).field_B = ((wh) this).field_B - ((wh) this).field_C;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if (((wh) this).field_B >= 0) {
                        return true;
                      } else {
                        ((wh) this).field_B = ((wh) this).field_B + ((wh) this).field_C;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((wh) this).field_C;
              ((wh) this).field_B = (int)((double)((wh) this).field_C * var10 / 6.283185307179586);
              L4: while (true) {
                if (((wh) this).field_B >= ((wh) this).field_C) {
                  ((wh) this).field_B = ((wh) this).field_B - ((wh) this).field_C;
                  continue L4;
                } else {
                  L5: while (true) {
                    if (((wh) this).field_B >= 0) {
                      return true;
                    } else {
                      ((wh) this).field_B = ((wh) this).field_B + ((wh) this).field_C;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          if (param4 != -30386) {
            return true;
          } else {
            return false;
          }
        }
    }

    final static void e(byte param0) {
        tj.field_w[46] = 72;
        tj.field_w[61] = 27;
        tj.field_w[91] = 42;
        tj.field_w[59] = 57;
        tj.field_w[44] = 71;
        tj.field_w[47] = 73;
        tj.field_w[45] = 26;
        tj.field_w[192] = 28;
        tj.field_w[520] = 59;
        tj.field_w[222] = 58;
        int var1 = 17 / ((param0 - 2) / 42);
        tj.field_w[92] = 74;
        tj.field_w[93] = 43;
    }

    final static void f(byte param0) {
        Object var1 = null;
        sj var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        var1 = null;
        if (param0 == 104) {
          var2 = 11;
          L0: while (true) {
            if ((var2 ^ -1) <= -1) {
              var1_ref = od.field_g.field_e[var2];
              if (od.field_g.field_e[var2] == null) {
                var2--;
                continue L0;
              } else {
                eh.a(var1_ref, 67);
                return;
              }
            } else {
              eh.a(var1_ref, 67);
              return;
            }
          }
        } else {
          wh.h(86);
          var2 = 11;
          L1: while (true) {
            if ((var2 ^ -1) <= -1) {
              var1_ref = od.field_g.field_e[var2];
              if (od.field_g.field_e[var2] == null) {
                var2--;
                continue L1;
              } else {
                eh.a(var1_ref, 67);
                return;
              }
            } else {
              eh.a((sj) var1, 67);
              return;
            }
          }
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new nk(3);
    }
}
