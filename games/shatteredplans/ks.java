/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        if (!param1) {
            nf var3 = (nf) null;
            ks.a((nf) null, -105);
            if (ol.field_g != null) {
                if (pd.field_k < e.field_f) {
                    return false;
                }
                if (pd.field_k >= ei.field_e) {
                    return false;
                }
                if (fk.field_k > bb.field_b) {
                    return false;
                }
                if (kl.field_o <= bb.field_b) {
                    return false;
                }
                if (je.field_d == 0) {
                    return true;
                }
                if (!param0) {
                    return true;
                }
                if (ol.field_g != hm.field_q) {
                    js.a((byte) -10);
                    if (vn.a(0)) {
                        fl.a(0, "enter");
                    }
                    return true;
                }
                if (vn.a(0)) {
                    fl.a(0, "enter");
                    return true;
                }
                return true;
            }
            if (null == hm.field_q) {
                return false;
            }
            if (pd.field_k < e.field_f) {
                return false;
            }
            if (pd.field_k >= ei.field_e) {
                return false;
            }
            if (fk.field_k <= bb.field_b) {
                if (kl.field_o <= bb.field_b) {
                    return false;
                }
                if (je.field_d != 0) {
                    if (!param0) {
                        return true;
                    }
                    if (ol.field_g != hm.field_q) {
                        js.a((byte) -10);
                        if (vn.a(0)) {
                            fl.a(0, "enter");
                            return true;
                        }
                        return true;
                    }
                    if (vn.a(0)) {
                        fl.a(0, "enter");
                        return true;
                    }
                }
                return true;
            }
            return false;
        }
        if (ol.field_g == null) {
            if (null == hm.field_q) {
                return false;
            }
            if (pd.field_k < e.field_f) {
                return false;
            }
            if (pd.field_k < ei.field_e && fk.field_k <= bb.field_b) {
                if (kl.field_o <= bb.field_b) {
                    return false;
                }
                if (je.field_d != 0) {
                    if (!param0) {
                        return true;
                    }
                    if (ol.field_g != hm.field_q) {
                        js.a((byte) -10);
                        if (vn.a(0)) {
                            fl.a(0, "enter");
                            return true;
                        }
                        return true;
                    }
                    if (vn.a(0)) {
                        fl.a(0, "enter");
                        return true;
                    }
                }
                return true;
            }
            return false;
        }
        if (pd.field_k >= e.field_f && pd.field_k < ei.field_e && fk.field_k <= bb.field_b) {
            if (kl.field_o <= bb.field_b) {
                return false;
            }
            if (je.field_d != 0) {
                if (!param0) {
                    return true;
                }
                if (ol.field_g != hm.field_q) {
                    js.a((byte) -10);
                    if (vn.a(0)) {
                        fl.a(0, "enter");
                        return true;
                    }
                    return true;
                }
                if (vn.a(0)) {
                    fl.a(0, "enter");
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    final boolean b(int param0) {
        if (param0 != 14) {
            this.b(-102);
            return this.field_g;
        }
        return this.field_g;
    }

    final static tm a(int param0, boolean param1, String param2) {
        tm var3 = null;
        RuntimeException var3_ref = null;
        tm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new tm(param2, param1);
              if (param0 <= -86) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            L2: {
              if ((qd.field_a ^ -1) <= -19) {
                gs.a(var3, true);
                break L2;
              } else {
                ld.field_p.a((byte) -113, var3);
                break L2;
              }
            }
            stackIn_6_0 = (tm) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("ks.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
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
        int var1 = -68 / ((param0 - 66) / 40);
        return vr.field_a;
    }

    final void a(boolean param0, int param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param1 <= 1) {
          L0: {
            this.field_f = (String) null;
            this.field_g = true;
            stackIn_7_0 = this;

            if (!param0) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((ks) (this)).field_d = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            this.field_g = true;
            stackIn_3_0 = this;

            if (!param0) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((ks) (this)).field_d = stackIn_4_1 != 0;
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return this.field_d;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nf var11 = null;
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
            L3: {
              var6_int = gf.field_b + param3;
              if (param0 == -18166) {
                break L3;
              } else {
                var11 = (nf) null;
                ks.a((nf) null, -32);
                break L3;
              }
            }
            var8 = gf.field_b * param5 + param4;
            var9 = param4;
            L4: while (true) {
              if (-1 <= (param1 ^ -1)) {
                break L0;
              } else {
                L5: {
                  if (gf.field_i > var9) {
                    break L5;
                  } else {
                    if (var9 >= gf.field_l) {
                      break L5;
                    } else {
                      param4 = gf.field_h[var8];
                      var7 = param2;
                      param5 = var7 + param4;
                      var7 = (16711935 & param4) + (16711935 & var7);
                      param4 = (16777472 & var7) - -(param5 - var7 & 65536);
                      gf.field_h[var8] = ee.a(-(param4 >>> -728104952) + param4, param5 + -param4);
                      break L5;
                    }
                  }
                }
                var8 = var8 + var6_int;
                param1--;
                var9 = var9 + param3;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var6), "ks.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String a(int param0) {
        int var2 = 2 / ((28 - param0) / 39);
        return this.field_f;
    }

    final static void a(nf param0, int param1) {
        Object stackIn_2_0;
        long stackIn_2_1;
        String stackIn_2_2;
        String stackIn_2_3;
        int stackIn_2_4;
        Object stackIn_2_5;
        qr stackIn_2_6;
        int stackIn_2_7;
        Object stackIn_3_0 = null;
        long stackIn_3_1 = 0L;
        String stackIn_3_2 = null;
        String stackIn_3_3 = null;
        int stackIn_3_4 = 0;
        Object stackIn_3_5 = null;
        qr stackIn_3_6 = null;
        int stackIn_3_7 = 0;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            L1: {
              stackIn_2_0 = null;

              stackIn_2_1 = param0.field_p;

              stackIn_2_2 = param0.field_d;

              stackIn_2_3 = param0.field_b;

              stackIn_2_4 = param1 + 293;

              stackIn_2_5 = null;

              stackIn_2_6 = param0.field_j;

              stackIn_2_7 = param0.field_n;

              if (-2 == (param0.field_n ^ -1)) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = (String) ((Object) stackIn_2_2);
                stackIn_3_3 = (String) ((Object) stackIn_2_3);
                stackIn_3_4 = stackIn_2_4;
                stackIn_3_5 = stackIn_2_5;
                stackIn_3_6 = (qr) ((Object) stackIn_2_6);
                stackIn_3_7 = stackIn_2_7;
                stackIn_3_8 = param0.field_g;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = (String) ((Object) stackIn_2_2);
                stackIn_3_3 = (String) ((Object) stackIn_2_3);
                stackIn_3_4 = stackIn_2_4;
                stackIn_3_5 = stackIn_2_5;
                stackIn_3_6 = (qr) ((Object) stackIn_2_6);
                stackIn_3_7 = stackIn_2_7;
                stackIn_3_8 = 0;
                break L1;
              }
            }
            L2: {
              tp.a((int[]) ((Object) stackIn_3_0), stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, (ub) ((Object) stackIn_3_5), stackIn_3_6, stackIn_3_7, stackIn_3_8);
              if (-1 != (param0.field_n ^ -1)) {
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
                          var5.field_j.a(param1 + 1, 14, var6);
                          break L3;
                        }
                      }
                      var7 = hp.field_m;
                      var8 = gb.field_o;
                      var7.field_j.a(param1 + 1, 20, var8);
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
            var13.field_j.b(0, param1, 0, var3, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("ks.F(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
    }

    ks(String param0) {
        this.field_d = false;
        this.field_g = false;
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ks.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 122) {
          ks.c(-61);
          field_e = null;
          field_a = null;
          field_b = null;
          field_h = null;
          field_j = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_b = null;
          field_h = null;
          field_j = null;
          return;
        }
    }

    final static void a(int param0, wj param1, int param2) {
        try {
            wd.field_P.a((byte) -113, param1);
            if (param0 != 20) {
                field_i = -24;
            }
            eg.a(param2, param1, true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ks.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new gq(14, 0, 4, 1);
        field_c = "Derelict";
        field_b = new String[16];
    }
}
