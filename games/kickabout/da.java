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
        if (param1 == 0) {
          return mc.field_k[1];
        } else {
          if (param1 == 1) {
            return mc.field_k[0];
          } else {
            if (param1 == 25) {
              return mc.field_k[0];
            } else {
              if (2 == param1) {
                return mc.field_k[1];
              } else {
                if (3 == param1) {
                  return mc.field_k[1];
                } else {
                  if (4 != param1) {
                    if (param1 != 5) {
                      if (param1 == 6) {
                        return mc.field_k[1];
                      } else {
                        if (param1 == 7) {
                          return mc.field_k[1];
                        } else {
                          if (param1 != 22) {
                            if (param1 != 8) {
                              if (param1 == 28) {
                                return mc.field_k[1];
                              } else {
                                if (9 == param1) {
                                  return kb.field_E[6];
                                } else {
                                  if (param1 != 35) {
                                    if (param1 != 36) {
                                      if (param1 == 38) {
                                        return mc.field_k[1];
                                      } else {
                                        if (param1 != 39) {
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
        int var1 = 0;
    }

    final static void a(int param0) {
        fi.a(tv.field_e, ai.field_H, 14594, dw.field_e, rj.field_b);
        int var1 = -41 / ((47 - param0) / 45);
    }

    final static void a(sj param0, boolean param1, sj param2, sj param3, int param4) {
        lc.field_e = su.a(-3505, "");
        try {
            lc.field_e.a(false, (byte) 108);
            id.a(param0, param3, false, param2);
            lf.a(-93);
            mj.field_a = vj.field_a;
            wk.field_f = vj.field_a;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "da.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + -120 + ')');
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
            var4 = (fa) (Object) nl.field_f.g(24009);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                sp.a(2, var4, -51265247);
                var4 = (fa) (Object) nl.field_f.c(33);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "da.D(" + 0 + ',' + 2 + ')');
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
