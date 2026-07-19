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
        this.field_y = null;
        this.field_g = null;
        this.field_F = null;
        this.field_j = null;
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
                                      if ((param1 ^ -1) == -39) {
                                        return mc.field_k[1];
                                      } else {
                                        if (-40 != (param1 ^ -1)) {
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
                                      return (ut) ((Object) sh.field_g);
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
        field_k = (int[][]) null;
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
        }
        try {
            lc.field_e.a(false, (byte) 108);
            id.a(param0, param3, false, param2);
            lf.a(-93);
            mj.field_a = vj.field_a;
            wk.field_f = vj.field_a;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "da.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        fa var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var4 = (fa) ((Object) nl.field_f.g(param0 + 24009));
              if (param0 == 0) {
                break L1;
              } else {
                da.b(79);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                sp.a(param1, var4, -51265247);
                var4 = (fa) ((Object) nl.field_f.c(33));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "da.D(" + param0 + ',' + param1 + ')');
        }
    }

    da() {
    }

    static {
        field_k = new int[][]{new int[]{-1, 2, 3, 1}, new int[]{-1, 3, 3, 1}, new int[]{-1, 3, 1, 1}, new int[]{-1, 4, 1, 1}, new int[]{-1, 5, 1, 1}, new int[]{-1, 6, 1, 1}, new int[]{-1, 7, 1, 1}, new int[]{-1, 8, 1, 1}, new int[]{-1, 9, 1, 1}, new int[]{-1, 10, 1, 1}, new int[]{-1, 11, 1, 1}, new int[]{-1, 12, 1, 1}, new int[]{-1, 13, 1, 1}, new int[]{-1, 14, 1, 1}, new int[]{-1, 15, 1, 1}, new int[]{-1, 16, 1, 1}, new int[]{-1, 9, 3, 0}, new int[]{-1, 10, 3, 0}, new int[]{-1, 11, 3, 0}, new int[]{-1, 12, 3, 0}, new int[]{-1, 13, 3, 0}, new int[]{-1, 14, 3, 0}, new int[]{-1, 15, 3, 0}, new int[]{-1, 16, 3, 0}};
        field_h = new tf();
        field_x = new int[]{130, 65, 110, 65, 60};
        field_i = "Sell Player";
    }
}
