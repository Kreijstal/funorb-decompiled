/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    int field_j;
    int field_k;
    int field_c;
    static String field_i;
    private er field_h;
    static an field_b;
    cc field_f;
    static String field_d;
    private int[] field_a;
    int field_g;
    private boolean field_e;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 23744) {
            return;
        }
        field_d = null;
        field_i = null;
    }

    final static dg a(Throwable param0, String param1) {
        dg var2_ref = null;
        dg var2 = null;
        if (param0 instanceof dg) {
            var2 = (dg) (Object) param0;
            var2.field_e = var2.field_e + 32 + param1;
        } else {
            var2_ref = new dg(param0, param1);
        }
        return var2_ref;
    }

    final static void c(int param0) {
        qh.a(-32739);
        if (param0 != -2618) {
            field_i = null;
        }
        ha.a((byte) 112);
    }

    final void a(int param0, byte param1, int param2, int param3, String param4, int param5) {
        int[] var10 = bi.field_l;
        int[] var7 = var10;
        int var8 = bi.field_e;
        int var9 = bi.field_j;
        bi.a(((wn) this).field_a);
        ((wn) this).field_h.d();
        bi.b(((wn) this).field_a);
        ((wn) this).field_f.b(param4, param3, param5, param0, param2);
        bi.a(var10, var8, var9);
        bi.b(((wn) this).field_a);
        ((wn) this).field_e = true;
        if (param1 <= 51) {
            ((wn) this).field_h = null;
        }
    }

    final void b(int param0) {
        int[] var2_ref_int__ = null;
        int var3 = 0;
        int var4 = 0;
        if (!(!((wn) this).field_e)) {
            var2_ref_int__ = bi.field_l;
            var3 = bi.field_e;
            var4 = bi.field_j;
            bi.a(((wn) this).field_a);
            ((wn) this).field_h.d();
            an.a((byte) 41, 0, 640, 480, 0);
            bi.a(var2_ref_int__, var3, var4);
            bi.b(((wn) this).field_a);
            ((wn) this).field_h.e(0, 0);
            ((wn) this).field_h.d();
            bi.c();
            ro.field_g.a(-39);
            ((wn) this).field_e = false;
        }
        int var2 = -117 % ((30 - param0) / 60);
    }

    final static void a(String[] args, byte[] param1, int[] param2, String[][] param3, u[] param4, r param5, r param6, byte param7, er[][] param8, String[][] param9, r param10, int param11, byte[] param12, er[][] param13, int param14, int[] param15, boolean param16) {
        Object var19 = null;
        nk.a(param14, param9, param5, (byte) 58, param11, param1, param13, param3, args, param12, (String[]) null, param8, param10, param6, param2, 1, param16, param4, param15);
        if (param7 != -42) {
            Object var18 = null;
            wn.a((String[]) null, (byte[]) null, (int[]) null, (String[][]) null, (u[]) null, (r) null, (r) null, (byte) -38, (er[][]) null, (String[][]) null, (r) null, 49, (byte[]) null, (er[][]) null, 77, (int[]) null, true);
        }
    }

    final int a(int param0, String param1) {
        if (param0 != 1) {
            return -4;
        }
        return ((wn) this).field_f.c(param1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        ((wn) this).a(param2, (byte) 52, param4, param0 + -((wn) this).field_f.c(param5), param5, param3);
        if (param1 >= -7) {
            Object var8 = null;
            ((wn) this).a(123, 84, -103, 23, -80, (String) null);
        }
    }

    final static void a(int param0, cr param1, cr param2) {
        if (!(param1.field_M != null)) {
            param1.field_M = new nj();
        }
        if (param2.field_M == null) {
            param2.field_M = new nj();
        }
        if (se.field_A == null) {
            se.field_A = new fi(64);
        }
        if (param0 >= -43) {
            wn.c(-19);
        }
        if (!(jn.field_g != null)) {
            jn.field_g = new fi(64);
        }
        vj.field_d = param2.field_M;
        tm.field_a = param1.field_M;
        lh.a((byte) -22);
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        ((wn) this).a(param1, (byte) 115, param2, param3 - ((wn) this).field_f.c(param0) / param5, param0, param4);
    }

    final static boolean a(String param0, int param1) {
        if (!(null != nb.field_A)) {
            return false;
        }
        if (param1 != 0) {
            return false;
        }
        return param0.toLowerCase().indexOf(nb.field_A.toLowerCase()) >= 0 ? true : false;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        param7--;
        L0: while (true) {
          if (param7 < 0) {
            return;
          } else {
            var9 = param6 - 1;
            L1: while (true) {
              if (var9 < 0) {
                param1 = param1 + param8;
                param7--;
                continue L0;
              } else {
                if (param0[param1] > 1) {
                  L2: {
                    param2 = param1 - 1;
                    param3 = param1 + 1;
                    param4 = param1 - bi.field_e;
                    param5 = param1 + bi.field_e;
                    if (param0[param4 + 1] != 0) {
                      break L2;
                    } else {
                      param0[param4 + 1] = 1;
                      break L2;
                    }
                  }
                  L3: {
                    if (param0[param5 + 1] != 0) {
                      break L3;
                    } else {
                      param0[param5 + 1] = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (param0[param4 - 1] != 0) {
                      break L4;
                    } else {
                      param0[param4 - 1] = 1;
                      break L4;
                    }
                  }
                  L5: {
                    if (param0[param5 - 1] != 0) {
                      break L5;
                    } else {
                      param0[param5 - 1] = 1;
                      break L5;
                    }
                  }
                  L6: {
                    if (param0[param2] != 0) {
                      break L6;
                    } else {
                      param0[param2] = 1;
                      break L6;
                    }
                  }
                  L7: {
                    if (param0[param3] != 0) {
                      break L7;
                    } else {
                      param0[param3] = 1;
                      break L7;
                    }
                  }
                  L8: {
                    if (param0[param4] != 0) {
                      break L8;
                    } else {
                      param0[param4] = 1;
                      break L8;
                    }
                  }
                  L9: {
                    if (param0[param5] != 0) {
                      break L9;
                    } else {
                      param0[param5] = 1;
                      break L9;
                    }
                  }
                  L10: {
                    if (param0[param2 - 1] != 0) {
                      break L10;
                    } else {
                      param0[param2 - 1] = 1;
                      break L10;
                    }
                  }
                  L11: {
                    if (param0[param3 + 1] != 0) {
                      break L11;
                    } else {
                      param0[param3 + 1] = 1;
                      break L11;
                    }
                  }
                  L12: {
                    if (param0[param4 - bi.field_e] != 0) {
                      break L12;
                    } else {
                      param0[param4 - bi.field_e] = 1;
                      break L12;
                    }
                  }
                  if (param0[param5 + bi.field_e] == 0) {
                    param0[param5 + bi.field_e] = 1;
                    param1++;
                    var9--;
                    continue L1;
                  } else {
                    param1++;
                    var9--;
                    continue L1;
                  }
                } else {
                  param1++;
                  var9--;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static int a(boolean param0, int param1, qj param2, int param3, String param4, boolean param5, qj param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        ed stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ed stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ed stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        ed stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ed stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ed stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String stackIn_18_2 = null;
        ed stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ed stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        ed stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        ed stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ed stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        String stackOut_17_2 = null;
        ed stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        String stackOut_16_2 = null;
        L0: {
          var13 = Vertigo2.field_L ? 1 : 0;
          var14 = param2.a(param0);
          var8 = param6.a(param0);
          if (lo.field_k == null) {
            if (ce.a((byte) 116, false)) {
              break L0;
            } else {
              return -1;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (nn.field_w != rg.field_d) {
            break L1;
          } else {
            L2: {
              mr.field_a = null;
              uh.field_Wb.field_u = 0;
              if (param4 == null) {
                L3: {
                  iq.field_x.field_u = 0;
                  iq.field_x.e(j.field_r.nextInt(), 0);
                  iq.field_x.e(j.field_r.nextInt(), 0);
                  stackOut_12_0 = iq.field_x;
                  stackOut_12_1 = 684868900;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if (!param2.a(113)) {
                    stackOut_14_0 = (ed) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = "";
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    break L3;
                  } else {
                    stackOut_13_0 = (ed) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = (String) var14;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    break L3;
                  }
                }
                L4: {
                  ((ed) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2);
                  stackOut_15_0 = iq.field_x;
                  stackOut_15_1 = 684868900;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (param6.a(75)) {
                    stackOut_17_0 = (ed) (Object) stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (String) var8;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L4;
                  } else {
                    stackOut_16_0 = (ed) (Object) stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = "";
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L4;
                  }
                }
                ((ed) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2);
                uh.field_Wb.f(16, -53);
                uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
                var9 = uh.field_Wb.field_u;
                mq.a(jm.field_H, (ed) (Object) uh.field_Wb, lp.field_E, 12, iq.field_x);
                uh.field_Wb.b((byte) -97, uh.field_Wb.field_u - var9);
                break L2;
              } else {
                L5: {
                  var9 = 0;
                  if (!param5) {
                    break L5;
                  } else {
                    var9 = var9 | 1;
                    break L5;
                  }
                }
                L6: {
                  iq.field_x.field_u = 0;
                  iq.field_x.e(j.field_r.nextInt(), 0);
                  iq.field_x.e(j.field_r.nextInt(), 0);
                  iq.field_x.a(684868900, var14);
                  iq.field_x.a(684868900, var8);
                  var15 = (CharSequence) (Object) param4;
                  iq.field_x.a(684868900, rr.a(-99, var15));
                  iq.field_x.d(param1, -1783);
                  iq.field_x.f(param3, 80);
                  iq.field_x.f(var9, 100);
                  uh.field_Wb.f(18, -93);
                  uh.field_Wb.field_u = uh.field_Wb.field_u + 2;
                  var10 = uh.field_Wb.field_u;
                  var11_ref = vq.a(ob.e((byte) 74), (byte) 114);
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L6;
                  } else {
                    break L6;
                  }
                }
                uh.field_Wb.a((byte) 0, var11_ref);
                mq.a(jm.field_H, (ed) (Object) uh.field_Wb, lp.field_E, 12, iq.field_x);
                uh.field_Wb.a((byte) -120, -var10 + uh.field_Wb.field_u);
                break L2;
              }
            }
            lf.d(106, -1);
            rg.field_d = fi.field_b;
            break L1;
          }
        }
        L7: {
          if (fi.field_b == rg.field_d) {
            if (!c.a(1, (byte) -104)) {
              break L7;
            } else {
              L8: {
                var9 = id.field_f.h(-11);
                id.field_f.field_u = 0;
                if ((var9 ^ -1) > -101) {
                  break L8;
                } else {
                  if ((var9 ^ -1) < -106) {
                    break L8;
                  } else {
                    rg.field_d = bj.field_f;
                    na.field_m = new String[-100 + var9];
                    break L7;
                  }
                }
              }
              if (248 != var9) {
                if (99 != var9) {
                  lc.field_f = var9;
                  rg.field_d = ko.field_O;
                  ca.field_b = -1;
                  break L7;
                } else {
                  boolean discarded$1 = c.a(tk.c(1), (byte) -104);
                  mr.field_a = new Boolean(nr.a((ed) (Object) id.field_f, 67));
                  id.field_f.field_u = 0;
                  break L7;
                }
              } else {
                fk.a(ob.e((byte) -77), 11514);
                nk.field_Kb = ql.field_K;
                rm.b((byte) 117);
                gn.field_d = false;
                return var9;
              }
            }
          } else {
            break L7;
          }
        }
        L9: {
          if (rg.field_d == bj.field_f) {
            var9 = 2;
            if (!c.a(var9, (byte) -104)) {
              break L9;
            } else {
              var10 = id.field_f.a((byte) -11);
              id.field_f.field_u = 0;
              if (c.a(var10, (byte) -104)) {
                var11 = na.field_m.length;
                var12 = 0;
                L10: while (true) {
                  if (var12 >= var11) {
                    rm.b((byte) -106);
                    gn.field_d = false;
                    return 100 - -var11;
                  } else {
                    na.field_m[var12] = id.field_f.c(true);
                    var12++;
                    continue L10;
                  }
                }
              } else {
                break L9;
              }
            }
          } else {
            break L9;
          }
        }
        L11: {
          if (rg.field_d == ko.field_O) {
            if (dl.b((byte) -72)) {
              L12: {
                if (255 != lc.field_f) {
                  nk.field_Kb = id.field_f.f(128);
                  break L12;
                } else {
                  var9_ref = id.field_f.k(-116);
                  if (var9_ref != null) {
                    be.a(var9_ref, -1, ob.e((byte) 106));
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              rm.b((byte) 95);
              gn.field_d = false;
              return lc.field_f;
            } else {
              break L11;
            }
          } else {
            break L11;
          }
        }
        L13: {
          if (null == lo.field_k) {
            if (!gn.field_d) {
              var9 = cl.field_d;
              cl.field_d = ne.field_P;
              gn.field_d = true;
              ne.field_P = var9;
              break L13;
            } else {
              L14: {
                if (qg.b(false) <= 30000L) {
                  nk.field_Kb = ba.field_c;
                  break L14;
                } else {
                  nk.field_Kb = tf.field_m;
                  break L14;
                }
              }
              gn.field_d = false;
              return 249;
            }
          } else {
            break L13;
          }
        }
        return -1;
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var16 = bi.field_l;
        int[] var15 = var16;
        int[] var14 = var15;
        int[] var11 = var14;
        int var12 = bi.field_e;
        int var13 = bi.field_j;
        bi.a(((wn) this).field_a);
        ((wn) this).field_h.d();
        if (param6 != 1) {
            return;
        }
        bi.b(((wn) this).field_a);
        int discarded$0 = ((wn) this).field_f.a(param2, param5, param4, param7, param3, param9, param1, param0, param8, ((wn) this).field_f.field_D - -4);
        bi.a(var16, var12, var13);
        bi.b(((wn) this).field_a);
        ((wn) this).field_e = true;
    }

    wn(cc param0) {
        ((wn) this).field_f = param0;
        ((wn) this).field_h = new er(640, 480);
        ((wn) this).field_k = param0.field_D;
        ((wn) this).field_g = param0.field_t;
        ((wn) this).field_c = param0.field_M;
        ((wn) this).field_a = new int[4];
        ((wn) this).field_j = param0.field_z;
        ((wn) this).field_e = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Cancel";
    }
}
