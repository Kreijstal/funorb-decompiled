/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends sh {
    private int field_K;
    private m field_F;
    private String field_J;
    static dm field_H;
    static int[] field_I;
    private boolean field_B;
    private int field_C;
    static char[] field_D;
    private int field_G;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param0 + ((hd) this).field_v;
        int var6 = param1 + ((hd) this).field_m;
        super.a(param0, param1, (byte) 105, param3);
        int var7 = -79 / ((param2 - 1) / 43);
        if (!(param3 == 0)) {
            return;
        }
        int var8 = !((hd) this).field_B ? 0 : -((hd) this).field_K + (((hd) this).field_r + -(((hd) this).field_C * 2));
        int discarded$0 = ((hd) this).field_F.a(((hd) this).field_J, ((hd) this).field_C + (var8 + var5), ((hd) this).field_C + var6, -((hd) this).field_C + ((hd) this).field_K, -(((hd) this).field_C * 2) + ((hd) this).field_h, ((hd) this).field_G, -1, !((hd) this).field_B ? 2 : 0, 1, ((hd) this).field_F.field_o);
    }

    public static void f(byte param0) {
        field_H = null;
        if (param0 != -52) {
            return;
        }
        field_D = null;
        field_I = null;
    }

    final static void f(int param0) {
        if (!el.field_o.field_Y) {
          di.field_g = di.field_g + 1;
          ul.field_b = ul.field_b + 1;
          if (sa.field_b == di.field_g) {
            if (gb.field_c < 2) {
              di.field_g = 0;
              ld.b(false);
              gb.field_c = gb.field_c + 1;
              if (param0 != 2) {
                L0: {
                  field_I = null;
                  if (fa.field_b != ul.field_b) {
                    break L0;
                  } else {
                    L1: {
                      ul.field_b = 0;
                      fj.field_m = 0;
                      el.field_o.field_bb = 1;
                      di.field_g = 0;
                      if (-3 < (gb.field_c ^ -1)) {
                        ld.b(false);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    gb.field_c = 0;
                    el.field_t = el.field_t + 1;
                    break L0;
                  }
                }
                return;
              } else {
                L2: {
                  if (fa.field_b != ul.field_b) {
                    break L2;
                  } else {
                    L3: {
                      ul.field_b = 0;
                      fj.field_m = 0;
                      el.field_o.field_bb = 1;
                      di.field_g = 0;
                      if (-3 < (gb.field_c ^ -1)) {
                        ld.b(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    gb.field_c = 0;
                    el.field_t = el.field_t + 1;
                    break L2;
                  }
                }
                return;
              }
            } else {
              if (param0 != 2) {
                L4: {
                  field_I = null;
                  if (fa.field_b != ul.field_b) {
                    break L4;
                  } else {
                    L5: {
                      ul.field_b = 0;
                      fj.field_m = 0;
                      el.field_o.field_bb = 1;
                      di.field_g = 0;
                      if (-3 < (gb.field_c ^ -1)) {
                        ld.b(false);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    gb.field_c = 0;
                    el.field_t = el.field_t + 1;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  if (fa.field_b != ul.field_b) {
                    break L6;
                  } else {
                    L7: {
                      ul.field_b = 0;
                      fj.field_m = 0;
                      el.field_o.field_bb = 1;
                      di.field_g = 0;
                      if (-3 < (gb.field_c ^ -1)) {
                        ld.b(false);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    gb.field_c = 0;
                    el.field_t = el.field_t + 1;
                    break L6;
                  }
                }
                return;
              }
            }
          } else {
            if (param0 != 2) {
              L8: {
                field_I = null;
                if (fa.field_b != ul.field_b) {
                  break L8;
                } else {
                  L9: {
                    ul.field_b = 0;
                    fj.field_m = 0;
                    el.field_o.field_bb = 1;
                    di.field_g = 0;
                    if (-3 < (gb.field_c ^ -1)) {
                      ld.b(false);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  gb.field_c = 0;
                  el.field_t = el.field_t + 1;
                  break L8;
                }
              }
              return;
            } else {
              L10: {
                if (fa.field_b != ul.field_b) {
                  break L10;
                } else {
                  L11: {
                    ul.field_b = 0;
                    fj.field_m = 0;
                    el.field_o.field_bb = 1;
                    di.field_g = 0;
                    if (-3 < (gb.field_c ^ -1)) {
                      ld.b(false);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  gb.field_c = 0;
                  el.field_t = el.field_t + 1;
                  break L10;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final String c(byte param0) {
        int var2 = ((hd) this).field_A.field_l ? 1 : 0;
        ((hd) this).field_A.field_l = ((hd) this).field_l;
        String var3 = ((hd) this).field_A.c(param0);
        ((hd) this).field_A.field_l = var2 != 0 ? true : false;
        return var3;
    }

    hd(int param0, int param1, int param2, int param3, el param4, boolean param5, int param6, int param7, m param8, int param9, String param10) {
        super(param0, param1, param2, param3, (dh) null, (bb) null);
        ((hd) this).field_G = param9;
        ((hd) this).field_A = param4;
        ((hd) this).field_C = param7;
        ((hd) this).field_F = param8;
        ((hd) this).field_B = param5 ? true : false;
        ((hd) this).field_K = param6;
        ((hd) this).field_J = param10;
        int var12 = ((hd) this).field_K - ((hd) this).field_C;
        int var13 = ((hd) this).field_F.b(param10, var12, ((hd) this).field_F.field_o) - -(2 * ((hd) this).field_C);
        if (var13 > param3) {
            ((hd) this).a(var13, param2, (byte) -74, param1, param0);
        } else {
            var13 = param3;
        }
        int var14 = ((hd) this).field_B ? 0 : ((hd) this).field_K - -(((hd) this).field_C * 2);
        ((hd) this).field_A.a(-(2 * ((hd) this).field_C) + param3, param2 + -((hd) this).field_K - ((hd) this).field_C * 3, (byte) -105, (-param3 + var13 >> -1512856031) + ((hd) this).field_C, var14);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[4];
        field_D = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
