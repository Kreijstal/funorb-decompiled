/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends gn {
    int field_f;
    int field_w;
    int field_e;
    int field_D;
    static int[][] field_k;
    int field_E;
    static tf field_h;
    int field_v;
    jk field_g;
    gl field_j;
    int field_A;
    int field_z;
    int field_B;
    int field_n;
    int field_r;
    int field_t;
    int field_q;
    int field_l;
    vm field_F;
    to field_y;
    int field_C;
    static ut field_m;
    int field_s;
    static int[] field_x;
    static ot[] field_u;
    int field_p;
    static int field_o;
    static String field_i;

    final void a(boolean param0) {
        ((da) this).field_y = null;
        ((da) this).field_g = null;
        ((da) this).field_F = null;
        ((da) this).field_j = null;
        if (param0) {
          return;
        } else {
          da.b(97);
          return;
        }
    }

    final static ut b(int param0, int param1) {
        if (-1 == (param1 ^ -1)) {
          return mc.field_k[1];
        } else {
          if (param1 == 1) {
            return mc.field_k[0];
          } else {
            if ((param1 ^ -1) == -26) {
              return mc.field_k[0];
            } else {
              if (param0 == param1) {
                return mc.field_k[1];
              } else {
                if (3 == param1) {
                  return mc.field_k[1];
                } else {
                  if (4 != param1) {
                    if (-6 != (param1 ^ -1)) {
                      if ((param1 ^ -1) == -7) {
                        return mc.field_k[1];
                      } else {
                        if (param1 == 7) {
                          return mc.field_k[1];
                        } else {
                          if (param1 != 22) {
                            if (-9 != (param1 ^ -1)) {
                              if ((param1 ^ -1) == -29) {
                                return mc.field_k[1];
                              } else {
                                if (9 == param1) {
                                  return kb.field_E[6];
                                } else {
                                  if (param1 != 35) {
                                    if ((param1 ^ -1) != -37) {
                                      if (param1 == -39) {
                                        return mc.field_k[1];
                                      } else {
                                        if (-40 != param1) {
                                          if (param1 == 40) {
                                            return mc.field_k[1];
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          return mc.field_k[1];
                                        }
                                      }
                                    } else {
                                      return (ut) (Object) sh.field_g;
                                    }
                                  } else {
                                    return mc.field_k[1];
                                  }
                                }
                              }
                            } else {
                              return mc.field_k[0];
                            }
                          } else {
                            return mc.field_k[1];
                          }
                        }
                      }
                    } else {
                      return mc.field_k[1];
                    }
                  } else {
                    return mc.field_k[1];
                  }
                }
              }
            }
          }
        }
    }

    final static void b(int param0) {
        if (param0 >= 64) {
          if (null != wi.field_v) {
            if (null == wi.field_v.field_g) {
              wi.field_v = null;
              ig.field_f = null;
              return;
            } else {
              wi.field_v.field_g.field_I = false;
              wi.field_v = null;
              ig.field_f = null;
              return;
            }
          } else {
            wi.field_v = null;
            ig.field_f = null;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_u = null;
        field_h = null;
        field_m = null;
        field_i = null;
        field_x = null;
        field_k = null;
        int var1 = -77 % ((param0 - -16) / 40);
    }

    final static void a(int param0) {
        fi.a(tv.field_e, ai.field_H, 14594, dw.field_e, rj.field_b);
        int var1 = -41 / ((47 - param0) / 45);
    }

    final static void a(sj param0, boolean param1, sj param2, sj param3, int param4) {
        lc.field_e = su.a(-3505, "");
        if (param4 >= -118) {
          return;
        } else {
          lc.field_e.a(false, (byte) 108);
          id.a(param0, param3, false, param2);
          lf.a(-93);
          mj.field_a = vj.field_a;
          wk.field_f = vj.field_a;
          return;
        }
    }

    final static void a(int param0, int param1) {
        fa var2 = null;
        int var3 = 0;
        var3 = Kickabout.field_G;
        var2 = (fa) (Object) nl.field_f.g(param0 + 24009);
        if (param0 != 0) {
          da.b(79);
          L0: while (true) {
            if (var2 != null) {
              sp.a(param1, var2, -51265247);
              var2 = (fa) (Object) nl.field_f.c(33);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var2 != null) {
              sp.a(param1, var2, -51265247);
              var2 = (fa) (Object) nl.field_f.c(33);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    da() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[][]{new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4]};
        field_h = new tf();
        field_x = new int[]{130, 65, 110, 65, 60};
        field_i = "Sell Player";
    }
}
