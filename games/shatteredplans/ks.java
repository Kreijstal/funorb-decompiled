/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ks {
    static int field_i;
    private boolean field_d;
    static gq field_a;
    static String[] field_b;
    static String field_c;
    static bi field_j;
    static byte[] field_e;
    private String field_f;
    private boolean field_g;
    static bi field_h;

    final static boolean a(boolean param0, boolean param1) {
        if (ol.field_g != null) {
          L0: {
            if (pd.field_k < e.field_f) {
              break L0;
            } else {
              if (pd.field_k >= ei.field_e) {
                break L0;
              } else {
                if (fk.field_k > bb.field_b) {
                  break L0;
                } else {
                  if (kl.field_o > bb.field_b) {
                    L1: {
                      if (je.field_d == 0) {
                        break L1;
                      } else {
                        if (param0) {
                          if (ol.field_g == hm.field_q) {
                            if (!vn.a(0)) {
                              break L1;
                            } else {
                              fl.a(0, "enter");
                              return true;
                            }
                          } else {
                            js.a((byte) -10);
                            if (!vn.a(0)) {
                              return true;
                            } else {
                              fl.a(0, "enter");
                              return true;
                            }
                          }
                        } else {
                          return true;
                        }
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          if (null != hm.field_q) {
            if (pd.field_k >= e.field_f) {
              if (pd.field_k < ei.field_e) {
                if (fk.field_k <= bb.field_b) {
                  if (kl.field_o > bb.field_b) {
                    if (je.field_d != 0) {
                      if (param0) {
                        if (ol.field_g == hm.field_q) {
                          if (vn.a(0)) {
                            fl.a(0, "enter");
                            return true;
                          } else {
                            return true;
                          }
                        } else {
                          js.a((byte) -10);
                          if (!vn.a(0)) {
                            return true;
                          } else {
                            fl.a(0, "enter");
                            return true;
                          }
                        }
                      } else {
                        return true;
                      }
                    } else {
                      return true;
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

    final boolean b(int param0) {
        if (param0 != 14) {
            boolean discarded$0 = ((ks) this).b(-102);
            return ((ks) this).field_g;
        }
        return ((ks) this).field_g;
    }

    final static tm a(int param0, boolean param1, String param2) {
        tm var3 = null;
        RuntimeException var3_ref = null;
        tm stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        tm stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3 = new tm(param2, false);
              if (qd.field_a >= 18) {
                gs.a(var3, true);
                break L1;
              } else {
                ld.field_p.a((byte) -113, (oh) (Object) var3);
                break L1;
              }
            }
            stackOut_3_0 = (tm) var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("ks.K(").append(-116).append(',').append(false).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static sp c(int param0) {
        if (!(vr.field_a != null)) {
            vr.field_a = new sp();
            vr.field_a.a(gn.field_u, true);
            vr.field_a.field_h = mf.field_x;
            vr.field_a.field_l = 14;
            vr.field_a.field_i = 7697781;
            vr.field_a.field_e = 5;
            vr.field_a.field_k = 2763306;
            vr.field_a.field_c = 4;
            vr.field_a.field_d = 6;
            vr.field_a.field_t = 0;
        }
        int var1 = -68;
        return vr.field_a;
    }

    final void a(boolean param0, int param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 <= 1) {
          L0: {
            ((ks) this).field_f = null;
            ((ks) this).field_g = true;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((ks) this).field_d = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            ((ks) this).field_g = true;
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((ks) this).field_d = stackIn_4_1 != 0;
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return ((ks) this).field_d;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (gf.field_a > param5) {
                param4 = param4 + (param5 + -gf.field_a) * param3;
                param1 = param1 + (param5 - gf.field_a);
                param5 = gf.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (gf.field_f < param5 - -param1) {
                param1 = gf.field_f + -param5;
                break L2;
              } else {
                break L2;
              }
            }
            var6_int = gf.field_b + param3;
            var8 = gf.field_b * param5 + param4;
            var9 = param4;
            L3: while (true) {
              if (param1 <= 0) {
                break L0;
              } else {
                L4: {
                  if (gf.field_i > var9) {
                    break L4;
                  } else {
                    if (var9 >= gf.field_l) {
                      break L4;
                    } else {
                      param4 = gf.field_h[var8];
                      var7 = 2458760;
                      param5 = var7 + param4;
                      var7 = (16711935 & param4) + (16711935 & var7);
                      param4 = (16777472 & var7) - -(param5 - var7 & 65536);
                      gf.field_h[var8] = ee.a(-(param4 >>> 8) + param4, param5 + -param4);
                      break L4;
                    }
                  }
                }
                var8 = var8 + var6_int;
                param1--;
                var9 = var9 + param3;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var6, "ks.J(" + -18166 + ',' + param1 + ',' + 2458760 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String a(int param0) {
        int var2 = 2 / ((28 - param0) / 39);
        return ((ks) this).field_f;
    }

    final static void a(nf param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        fc var5 = null;
        String var6 = null;
        fc var7 = null;
        String var8 = null;
        fc var9 = null;
        String var10 = null;
        fc var11 = null;
        String var12 = null;
        fc var13 = null;
        Object stackIn_1_0 = null;
        long stackIn_1_1 = 0L;
        String stackIn_1_2 = null;
        String stackIn_1_3 = null;
        int stackIn_1_4 = 0;
        Object stackIn_1_5 = null;
        qr stackIn_1_6 = null;
        int stackIn_1_7 = 0;
        Object stackIn_2_0 = null;
        long stackIn_2_1 = 0L;
        String stackIn_2_2 = null;
        String stackIn_2_3 = null;
        int stackIn_2_4 = 0;
        Object stackIn_2_5 = null;
        qr stackIn_2_6 = null;
        int stackIn_2_7 = 0;
        Object stackIn_3_0 = null;
        long stackIn_3_1 = 0L;
        String stackIn_3_2 = null;
        String stackIn_3_3 = null;
        int stackIn_3_4 = 0;
        Object stackIn_3_5 = null;
        qr stackIn_3_6 = null;
        int stackIn_3_7 = 0;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        long stackOut_0_1 = 0L;
        String stackOut_0_2 = null;
        String stackOut_0_3 = null;
        int stackOut_0_4 = 0;
        Object stackOut_0_5 = null;
        qr stackOut_0_6 = null;
        int stackOut_0_7 = 0;
        Object stackOut_2_0 = null;
        long stackOut_2_1 = 0L;
        String stackOut_2_2 = null;
        String stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        Object stackOut_2_5 = null;
        qr stackOut_2_6 = null;
        int stackOut_2_7 = 0;
        int stackOut_2_8 = 0;
        Object stackOut_1_0 = null;
        long stackOut_1_1 = 0L;
        String stackOut_1_2 = null;
        String stackOut_1_3 = null;
        int stackOut_1_4 = 0;
        Object stackOut_1_5 = null;
        qr stackOut_1_6 = null;
        int stackOut_1_7 = 0;
        int stackOut_1_8 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = null;
              stackOut_0_1 = param0.field_p;
              stackOut_0_2 = param0.field_d;
              stackOut_0_3 = param0.field_b;
              stackOut_0_4 = 293;
              stackOut_0_5 = null;
              stackOut_0_6 = param0.field_j;
              stackOut_0_7 = param0.field_n;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_2_4 = stackOut_0_4;
              stackIn_2_5 = stackOut_0_5;
              stackIn_2_6 = stackOut_0_6;
              stackIn_2_7 = stackOut_0_7;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              stackIn_1_4 = stackOut_0_4;
              stackIn_1_5 = stackOut_0_5;
              stackIn_1_6 = stackOut_0_6;
              stackIn_1_7 = stackOut_0_7;
              if (-2 == param0.field_n) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = (String) (Object) stackIn_2_2;
                stackOut_2_3 = (String) (Object) stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = stackIn_2_5;
                stackOut_2_6 = (qr) (Object) stackIn_2_6;
                stackOut_2_7 = stackIn_2_7;
                stackOut_2_8 = param0.field_g;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                stackIn_3_5 = stackOut_2_5;
                stackIn_3_6 = stackOut_2_6;
                stackIn_3_7 = stackOut_2_7;
                stackIn_3_8 = stackOut_2_8;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = (String) (Object) stackIn_1_2;
                stackOut_1_3 = (String) (Object) stackIn_1_3;
                stackOut_1_4 = stackIn_1_4;
                stackOut_1_5 = stackIn_1_5;
                stackOut_1_6 = (qr) (Object) stackIn_1_6;
                stackOut_1_7 = stackIn_1_7;
                stackOut_1_8 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                stackIn_3_5 = stackOut_1_5;
                stackIn_3_6 = stackOut_1_6;
                stackIn_3_7 = stackOut_1_7;
                stackIn_3_8 = stackOut_1_8;
                break L1;
              }
            }
            L2: {
              tp.a((int[]) (Object) stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, (ub) (Object) stackIn_3_5, stackIn_3_6, stackIn_3_7, stackIn_3_8);
              if (-1 != param0.field_n) {
                break L2;
              } else {
                if (ha.a((byte) 95)) {
                  break L2;
                } else {
                  if (null != np.field_a) {
                    break L2;
                  } else {
                    if (he.field_p != null) {
                      break L2;
                    } else {
                      L3: {
                        if (ae.field_b) {
                          break L3;
                        } else {
                          var5 = hp.field_m;
                          var6 = s.field_h;
                          var5.field_j.a(1, 14, var6);
                          break L3;
                        }
                      }
                      var7 = hp.field_m;
                      var8 = gb.field_o;
                      var7.field_j.a(1, 20, var8);
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (1 != param0.field_n) {
                break L4;
              } else {
                if (ha.a((byte) 111)) {
                  break L4;
                } else {
                  if (null == np.field_a) {
                    break L4;
                  } else {
                    if (param0.field_g != np.field_a.g(-101)) {
                      break L4;
                    } else {
                      L5: {
                        if (ae.field_b) {
                          break L5;
                        } else {
                          var9 = hp.field_m;
                          var10 = qk.field_z;
                          var9.field_j.a(1, 14, var10);
                          break L5;
                        }
                      }
                      var11 = hp.field_m;
                      var12 = sn.field_a;
                      var11.field_j.a(1, 20, var12);
                      break L4;
                    }
                  }
                }
              }
            }
            hp.field_m.a(false);
            hp.field_m.a(false, -16661);
            hp.field_m.a(param0.field_f, param0.field_n, (byte) -116);
            hp.field_m.b(17);
            hp.field_m.a(param0, (byte) -100);
            var13 = hp.field_m;
            var3 = nh.field_p;
            var4 = td.field_P;
            var13.field_j.b(0, 0, 0, var3, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ks.F(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 0 + ')');
        }
    }

    ks(String param0) {
        ((ks) this).field_d = false;
        ((ks) this).field_g = false;
        try {
            ((ks) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ks.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_a = null;
        field_b = null;
        field_h = null;
        field_j = null;
    }

    final static void a(int param0, wj param1, int param2) {
        try {
            wd.field_P.a((byte) -113, (oh) (Object) param1);
            eg.a(3, param1, true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ks.A(" + 20 + ',' + (param1 != null ? "{...}" : "null") + ',' + 3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new gq(14, 0, 4, 1);
        field_c = "Derelict";
        field_b = new String[16];
    }
}
