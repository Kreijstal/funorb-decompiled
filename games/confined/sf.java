/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends rk {
    int field_q;
    int field_v;
    static double field_t;
    int field_m;
    int field_r;
    static java.awt.Frame field_o;
    int field_u;
    static String field_s;
    static bi field_p;
    int field_n;

    final static void c(int param0) {
        da.field_i = false;
        if (param0 == -52) {
          e.field_c.c(32);
          return;
        }
        sf.a(94, (byte) -124);
        e.field_c.c(32);
    }

    final static void a(boolean param0, int param1) {
        boolean stackIn_13_0 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_14_2 = false;
        boolean stackIn_17_3 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_21_1 = false;
        boolean stackIn_22_2 = false;
        boolean stackIn_25_3 = false;
        int var2;
        var2 = 96 % ((param1 + 16) / 47);
        ej.field_b = false;
        if (!tj.a(true)) {
          if (oj.field_B != 0) {
            kc.field_o = true;
          }
          if (rg.field_K) {
            rg.field_K = false;
            bj.field_m = true;
          }
          qf.field_e = false;
          ei.a(-87, param0);
        } else {
          if (oj.field_B != 0) {
            qf.field_e = true;
            stackIn_13_0 = false;
            stackIn_13_1 = param0;
            stackIn_14_2 = (oj.field_B == 0) ? false : true;
            stackIn_17_3 = (null == lc.field_J) ? false : true;
            hh.field_d = ih.a(stackIn_13_0, stackIn_13_1, stackIn_14_2, stackIn_17_3, (byte) 120);
          } else {
            if (lc.field_J == null) {
              if (oj.field_B != 0) {
                kc.field_o = true;
              }
              if (rg.field_K) {
                rg.field_K = false;
                bj.field_m = true;
              }
              qf.field_e = false;
              ei.a(-87, param0);
            } else {
              qf.field_e = true;
              stackIn_21_0 = false;
              stackIn_21_1 = param0;
              stackIn_22_2 = (oj.field_B == 0) ? false : true;
              stackIn_25_3 = (null == lc.field_J) ? false : true;
              hh.field_d = ih.a(stackIn_21_0, stackIn_21_1, stackIn_22_2, stackIn_25_3, (byte) 120);
            }
          }
        }
    }

    public static void b(int param0) {
        field_p = null;
        field_o = null;
        if (param0 <= 83) {
          sf.b(-104);
          field_s = null;
          return;
        }
        field_s = null;
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        int var2Lifetime1;
        if (param1 > -58) {
          field_p = (bi) null;
          gk.field_u = null;
          we.field_k = 0;
          ol.field_a = null;
          var2 = fa.field_P;
          fa.field_P = tl.field_f;
          if (param0 != 51) {
            if (50 != param0) {
              om.field_s.field_e = 1;
              tl.field_f = var2;
              om.field_s.field_a = om.field_s.field_a + 1;
              if (2 > om.field_s.field_a) {
                if (2 > om.field_s.field_a) {
                  if (om.field_s.field_a < 4) {
                    return -1;
                  }
                  return 1;
                }
                if (param0 != 50) {
                  if (om.field_s.field_a >= 4) {
                    return 1;
                  }
                  return -1;
                }
                return 5;
              }
              if (param0 != 51) {
                if (2 <= om.field_s.field_a &&
                  param0 == 50) {
                  return 5;
                }
                if (om.field_s.field_a >= 4) {
                  return 1;
                }
                return -1;
              }
              return 2;
            }
            om.field_s.field_e = 5;
            tl.field_f = var2;
            om.field_s.field_a = om.field_s.field_a + 1;
            if (2 > om.field_s.field_a) {
              if (2 <= om.field_s.field_a &&
                param0 == 50) {
                return 5;
              }
              if (om.field_s.field_a >= 4) {
                return 1;
              }
              return -1;
            }
            if (param0 != 51) {
              if (2 <= om.field_s.field_a &&
                param0 == 50) {
                return 5;
              }
              if (om.field_s.field_a >= 4) {
                return 1;
              }
              return -1;
            }
            return 2;
          }
          om.field_s.field_e = 2;
          tl.field_f = var2;
          om.field_s.field_a = om.field_s.field_a + 1;
          if (2 > om.field_s.field_a) {
            if (2 <= om.field_s.field_a &&
              param0 == 50) {
              return 5;
            }
            if (om.field_s.field_a >= 4) {
              return 1;
            }
            return -1;
          }
          if (param0 != 51) {
            if (2 <= om.field_s.field_a &&
              param0 == 50) {
              return 5;
            }
            if (om.field_s.field_a >= 4) {
              return 1;
            }
            return -1;
          }
          return 2;
        }
        gk.field_u = null;
        we.field_k = 0;
        ol.field_a = null;
        var2Lifetime1 = fa.field_P;
        fa.field_P = tl.field_f;
        if (param0 != 51) {
          if (50 != param0) {
            om.field_s.field_e = 1;
            tl.field_f = var2Lifetime1;
            om.field_s.field_a = om.field_s.field_a + 1;
            if (2 <= om.field_s.field_a &&
              param0 == 51) {
              return 2;
            }
            if (2 <= om.field_s.field_a &&
              param0 == 50) {
              return 5;
            }
            if (om.field_s.field_a >= 4) {
              return 1;
            }
            return -1;
          }
          om.field_s.field_e = 5;
          tl.field_f = var2Lifetime1;
          om.field_s.field_a = om.field_s.field_a + 1;
          if (2 <= om.field_s.field_a &&
            param0 == 51) {
            return 2;
          }
          if (2 <= om.field_s.field_a &&
            param0 == 50) {
            return 5;
          }
          if (om.field_s.field_a >= 4) {
            return 1;
          }
          return -1;
        }
        om.field_s.field_e = 2;
        tl.field_f = var2Lifetime1;
        om.field_s.field_a = om.field_s.field_a + 1;
        if (2 <= om.field_s.field_a &&
          param0 == 51) {
          return 2;
        }
        if (2 <= om.field_s.field_a &&
          param0 == 50) {
          return 5;
        }
        if (om.field_s.field_a >= 4) {
          return 1;
        }
        return -1;
    }

    sf(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_q = param5;
        this.field_n = param2;
        this.field_u = param1;
        this.field_m = param4;
        this.field_r = param0;
        this.field_v = param3;
    }

    static {
        field_s = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
