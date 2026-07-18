/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends ki {
    static mh field_x;
    static String field_s;
    static int[] field_r;
    static String field_t;
    private static jp field_u;
    static mh[] field_w;
    static boolean field_y;
    static co field_v;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (param1 > -1) {
          L0: {
            lb.g(param2, param3, 153, 238, kg.field_d[param1], 22953);
            if (((dp) this).b((byte) -115)) {
              mq.field_f.c(param2, param3);
              break L0;
            } else {
              break L0;
            }
          }
          var5 = 36 % ((param0 - -28) / 43);
          return;
        } else {
          L1: {
            lb.g(param2, param3, 153, 238, 7829367, 22953);
            if (((dp) this).b((byte) -115)) {
              mq.field_f.c(param2, param3);
              break L1;
            } else {
              break L1;
            }
          }
          var5 = 36 % ((param0 - -28) / 43);
          return;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var8 = null;
        pb var9 = null;
        if (param0) {
          if (((dp) this).b((byte) -106)) {
            L0: {
              int discarded$3 = -20777;
              var9 = ge.a(((dp) this).field_m, param3);
              if (!var9.a((byte) -84, param3, ((dp) this).field_m)) {
                s.a(ch.field_m, 1, param3, th.field_j, var9, 0, (byte) -86, va.field_b);
                var9.a(((dp) this).field_m, param3, (byte) 78);
                break L0;
              } else {
                break L0;
              }
            }
            qh.a(1, 0, ni.field_Ub, param1, nf.field_U, 67, 640, param4, var9.field_p, param2);
            return;
          } else {
            lb.g(param4, param2, 640, 480, kg.field_d[param3], 22953);
            return;
          }
        } else {
          jp[] discarded$4 = ((dp) this).a(-127, false);
          if (((dp) this).b((byte) -106)) {
            L1: {
              int discarded$5 = -20777;
              var8 = ge.a(((dp) this).field_m, param3);
              if (!var8.a((byte) -84, param3, ((dp) this).field_m)) {
                s.a(ch.field_m, 1, param3, th.field_j, var8, 0, (byte) -86, va.field_b);
                var8.a(((dp) this).field_m, param3, (byte) 78);
                break L1;
              } else {
                break L1;
              }
            }
            qh.a(1, 0, ni.field_Ub, param1, nf.field_U, 67, 640, param4, var8.field_p, param2);
            return;
          } else {
            lb.g(param4, param2, 640, 480, kg.field_d[param3], 22953);
            return;
          }
        }
    }

    final jp[] a(int param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return qg.field_r[param0 + -1];
    }

    final boolean a(boolean param0) {
        if (!(i.field_m.a("halloween", -28138))) {
            return false;
        }
        nf.field_U = pl.a("halloween", "halloween_near", (byte) -116, i.field_m);
        ni.field_Ub = pl.a("halloween", "halloween_mid", (byte) 116, i.field_m);
        dj.field_e = pl.a("halloween", "halloween_far", (byte) 120, i.field_m);
        mq.field_f = pl.a("halloween", "halloween_small", (byte) 105, i.field_m);
        ee.field_p = pl.a("halloween", "halloween_moon", (byte) 102, i.field_m);
        va.field_b = jh.a(0, nf.field_U);
        field_u = jh.a(0, ni.field_Ub);
        ch.field_m = jh.a(0, dj.field_e);
        th.field_j = jh.a(0, ee.field_p);
        ba.field_A = pl.a("halloween", "halloween_character", (byte) -106, i.field_m);
        int discarded$0 = 2;
        ej.field_L[0] = cr.a("halloween", i.field_m, "halloween_caps");
        int discarded$1 = 2;
        qg.field_r[0] = cr.a("halloween", i.field_m, "halloween_segs");
        ap.field_c[0] = pl.a("halloween", "halloween_centre", (byte) -118, i.field_m);
        ej.field_L[1] = ig.a(ej.field_L[0], param0);
        qg.field_r[1] = ig.a(qg.field_r[0], param0);
        ap.field_c[1] = pl.a(-16371, ap.field_c[0]);
        return true;
    }

    final int c(int param0) {
        if (param0 >= -72) {
            return 2;
        }
        return 128;
    }

    final static void a(int param0, int param1, boolean param2, int param3, jp param4, pb param5) {
        try {
            fc.a(-95, param5.field_p);
            lb.d();
            param4.b(-(60 / param0) + (-param4.field_x + param5.field_i) / 2, -param4.field_z + param1 - (-param5.field_q - -(130 / param0)), 0, 208);
            la.a(0, 0, param5.field_i, param5.field_q, 0, nj.field_G[param3], 96);
            if (param2) {
                Object var7 = null;
                dp.a(82, 29, true, -26, (jp) null, (pb) null);
            }
            sc.b(-80);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "dp.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(byte param0) {
        Object var3 = null;
        int stackIn_19_0 = 0;
        int stackIn_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 <= -91) {
          if (nf.field_U != null) {
            if (null != ni.field_Ub) {
              if (dj.field_e != null) {
                if (mq.field_f != null) {
                  if (null != ee.field_p) {
                    if (null != ba.field_A) {
                      if (null != ej.field_L) {
                        if (null == qg.field_r) {
                          return false;
                        } else {
                          L0: {
                            if (ap.field_c == null) {
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              break L0;
                            } else {
                              stackOut_38_0 = 1;
                              stackIn_40_0 = stackOut_38_0;
                              break L0;
                            }
                          }
                          return stackIn_40_0 != 0;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          dp.a(62, -82, true, -61, (jp) null, (pb) null);
          if (nf.field_U != null) {
            if (null != ni.field_Ub) {
              if (dj.field_e != null) {
                if (mq.field_f != null) {
                  if (null != ee.field_p) {
                    if (null != ba.field_A) {
                      if (null != ej.field_L) {
                        if (null == qg.field_r) {
                          return false;
                        } else {
                          L1: {
                            if (ap.field_c == null) {
                              stackOut_18_0 = 0;
                              stackIn_19_0 = stackOut_18_0;
                              break L1;
                            } else {
                              stackOut_17_0 = 1;
                              stackIn_19_0 = stackOut_17_0;
                              break L1;
                            }
                          }
                          return stackIn_19_0 != 0;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    dp(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
            qg.field_r = new jp[2][];
            ej.field_L = new jp[2][];
            ap.field_c = new jp[2];
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "dp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var7 = null;
        pb var8 = null;
        if (param1 < -84) {
          if (((dp) this).b((byte) -126)) {
            var8 = kd.a(((dp) this).field_m, param3, (byte) 116);
            if (!var8.a((byte) -84, param3, ((dp) this).field_m)) {
              s.a(ch.field_m, 2, param3, th.field_j, var8, -13, (byte) -96, va.field_b);
              var8.a(((dp) this).field_m, param3, (byte) 78);
              qh.a(2, -13, field_u, param4, va.field_b, 62, 306, param2, var8.field_p, param0);
              return;
            } else {
              qh.a(2, -13, field_u, param4, va.field_b, 62, 306, param2, var8.field_p, param0);
              return;
            }
          } else {
            lb.g(param2, param0, 306, 480, kg.field_d[param3], 22953);
            return;
          }
        } else {
          boolean discarded$1 = ((dp) this).a(true);
          if (((dp) this).b((byte) -126)) {
            var7 = kd.a(((dp) this).field_m, param3, (byte) 116);
            if (var7.a((byte) -84, param3, ((dp) this).field_m)) {
              qh.a(2, -13, field_u, param4, va.field_b, 62, 306, param2, var7.field_p, param0);
              return;
            } else {
              s.a(ch.field_m, 2, param3, th.field_j, var7, -13, (byte) -96, va.field_b);
              var7.a(((dp) this).field_m, param3, (byte) 78);
              qh.a(2, -13, field_u, param4, va.field_b, 62, 306, param2, var7.field_p, param0);
              return;
            }
          } else {
            lb.g(param2, param0, 306, 480, kg.field_d[param3], 22953);
            return;
          }
        }
    }

    final jp a(boolean param0, int param1) {
        if (!param0) {
            field_u = null;
            return ap.field_c[-1 + param1];
        }
        return ap.field_c[-1 + param1];
    }

    final jp c(byte param0) {
        if (param0 > -74) {
            field_y = false;
            return ba.field_A;
        }
        return ba.field_A;
    }

    public static void f() {
        field_r = null;
        field_t = null;
        field_s = null;
        field_w = null;
        field_u = null;
        field_v = null;
        field_x = null;
    }

    final jp[] a(byte param0, int param1) {
        int var3 = -12 % ((65 - param0) / 49);
        return ej.field_L[-1 + param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Back";
        field_r = new int[]{100, 350, 750, 10, 25, 15, 30, 30000, 60000, 30, 60, 10, 10, 25, 5, 10, 1, 1, 3, 10, 20, 30, 7, 1, 2, 3, 1, 1, 1, 10, 5, 10, 5, 10, 100, 500, 2500, 5000, 15000, 1000, 135000, 5};
    }
}
