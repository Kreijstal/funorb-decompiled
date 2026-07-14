/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends d {
    private int field_P;
    private ia field_M;
    static String field_L;
    static int[] field_R;
    static boolean field_N;
    static String field_O;
    static mf field_K;
    static String field_Q;

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        qh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jp var12 = null;
        jp var13 = null;
        jp var14 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          L0: {
            L1: {
              var5 = param1 + (((wl) this).field_o - -(((wl) this).field_t >> 1563953985));
              var6 = (((wl) this).field_s >> 245383265) + (((wl) this).field_w + param0);
              var8 = ((wl) this).field_M.b((byte) -31);
              if (var8 == m.field_c) {
                break L1;
              } else {
                if (hq.field_z != var8) {
                  if (lp.field_xb != var8) {
                    if (ae.field_c != var8) {
                      break L0;
                    } else {
                      var14 = df.field_a[1];
                      var14.f(var5 + -(var14.field_D >> -1165755167), -(var14.field_C >> -1800916031) + var6, 256);
                      break L0;
                    }
                  } else {
                    var13 = df.field_a[2];
                    var13.f(-(var13.field_D >> -716089279) + var5, -(var13.field_C >> 2004393505) + var6, 256);
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var12 = df.field_a[0];
                var9 = var12.field_x << 464527233;
                var10 = var12.field_z << -1953701535;
                if (ik.field_c == null) {
                  break L3;
                } else {
                  if (ik.field_c.field_D < var9) {
                    break L3;
                  } else {
                    if (var10 > ik.field_c.field_C) {
                      break L3;
                    } else {
                      fc.a(-114, ik.field_c);
                      lb.d();
                      break L2;
                    }
                  }
                }
              }
              ik.field_c = new jp(var9, var10);
              fc.a(-87, ik.field_c);
              break L2;
            }
            var12.a(112, 144, var12.field_x << 963253092, var12.field_z << 2020069124, -((wl) this).field_P << -1734603862, 4096);
            sc.b(-104);
            ik.field_c.f(-var12.field_x + var5, -var12.field_z + var6, 256);
            break L0;
          }
          return;
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        ((wl) this).field_P = ((wl) this).field_P + 1;
        super.a(param0, param1, param2, param3);
    }

    final boolean a(boolean param0, oc param1) {
        if (!param0) {
            wl.c(false);
        }
        return false;
    }

    final static void c(boolean param0) {
        int var2 = 0;
        cq var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pi var15 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        var15 = jl.field_e;
        var2 = var15.l(255);
        var3 = (cq) (Object) fk.field_f.d(-7);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var3.field_m != var2) {
                var3 = (cq) (Object) fk.field_f.a((byte) 116);
                continue L0;
              } else {
                break L1;
              }
            }
          }
          if (var3 != null) {
            L2: {
              var4 = var15.l(255);
              if (var4 != 0) {
                vq.field_B[0] = tb.field_cb;
                var5 = var3.field_s;
                var6_int = 1;
                L3: while (true) {
                  if (var4 <= var6_int) {
                    tk.a((byte) 75, var4, var5);
                    var6_int = 0;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        gr.a(12429, var5);
                        var3.field_r = new String[2][var5];
                        var6 = new String[2][var5];
                        var3.field_u = new int[2][4 * var5];
                        var7 = new int[2][4 * var5];
                        var8 = wi.field_m;
                        var9 = 0;
                        var10 = 0;
                        L5: while (true) {
                          if (var9 >= var8) {
                            var13 = 0;
                            var9 = var13;
                            var14 = 0;
                            var10 = var14;
                            L6: while (true) {
                              if (var8 <= var13) {
                                break L2;
                              } else {
                                var11 = fj.field_Pb[var13 + var5];
                                var6[1][var14] = vq.field_B[var11];
                                var7[1][var14 * 4] = ec.field_N[var11];
                                var7[1][1 + var14 * 4] = lf.field_r[var11];
                                var7[1][2 + 4 * var14] = ao.field_p[var11];
                                var7[1][var14 * 4 - -3] = ib.field_D[var11];
                                if (ci.a(vq.field_B[var11], -31)) {
                                  if (lf.field_r[var11] - -ao.field_p[var11] + ib.field_D[var11] == 0) {
                                    var6[1][var14] = null;
                                    var14--;
                                    var13++;
                                    var14++;
                                    continue L6;
                                  } else {
                                    var13++;
                                    var14++;
                                    continue L6;
                                  }
                                } else {
                                  var13++;
                                  var14++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            var11 = fj.field_Pb[var9];
                            var6[0][var10] = vq.field_B[var11];
                            var7[0][4 * var10] = ec.field_N[var11];
                            var7[0][var10 * 4 + 1] = lf.field_r[var11];
                            var7[0][2 + var10 * 4] = ao.field_p[var11];
                            var7[0][4 * var10 - -3] = ib.field_D[var11];
                            if (ci.a(vq.field_B[var11], -40)) {
                              if (0 == ao.field_p[var11] + lf.field_r[var11] + ib.field_D[var11]) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L5;
                              } else {
                                var10++;
                                var9++;
                                continue L5;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        un.a((byte) -122, (wq) (Object) var15);
                        if (var6_int == 0) {
                          var3.field_k = fh.field_c;
                          var3.field_n = vj.field_c;
                          var3.field_j = sf.field_Z;
                          var3.field_l = vh.field_U;
                          uk.a(vj.field_c, fh.field_c, var6_int, -19824, sf.field_Z, vh.field_U);
                          var6_int++;
                          continue L4;
                        } else {
                          uk.a(vj.field_c, fh.field_c, var6_int, -19824, sf.field_Z, vh.field_U);
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    vq.field_B[var6_int] = var15.d(-1);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L7: {
              if (!param0) {
                break L7;
              } else {
                field_Q = null;
                break L7;
              }
            }
            var3.field_v = true;
            var3.b((byte) 111);
            return;
          } else {
            hn.a((byte) 64);
            return;
          }
        }
    }

    final static int a(String param0, boolean param1, int param2, m param3, int param4, m param5, int param6) {
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
        wq stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        wq stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        wq stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_10_2 = null;
        wq stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        wq stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        wq stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        wq stackOut_7_0;
        int stackOut_7_1;
        wq stackOut_9_0;
        int stackOut_9_1;
        String stackOut_9_2;
        wq stackOut_8_0;
        int stackOut_8_1;
        String stackOut_8_2;
        wq stackOut_10_0;
        int stackOut_10_1;
        wq stackOut_12_0;
        int stackOut_12_1;
        String stackOut_12_2;
        wq stackOut_11_0;
        int stackOut_11_1;
        String stackOut_11_2;
        L0: {
          var13 = BrickABrac.field_J ? 1 : 0;
          var14 = param3.b(2);
          var8 = param5.b(2);
          if (eq.field_g == null) {
            if (!ad.a(false, param6 ^ 10004)) {
              return -1;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (rf.field_b != pi.field_u) {
            break L1;
          } else {
            L2: {
              k.field_h.field_l = 0;
              af.field_r = null;
              if (param0 != null) {
                L3: {
                  var9 = 0;
                  if (!param1) {
                    break L3;
                  } else {
                    var9 = var9 | 1;
                    break L3;
                  }
                }
                L4: {
                  tq.field_f.field_l = 0;
                  tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
                  tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
                  tq.field_f.a(param6 ^ 4, var14);
                  tq.field_f.a(0, var8);
                  var15 = (CharSequence) (Object) param0;
                  tq.field_f.a(0, he.a(var15, -58));
                  tq.field_f.b((byte) 113, param4);
                  tq.field_f.a(89, param2);
                  tq.field_f.a(127, var9);
                  k.field_h.a(53, 18);
                  k.field_h.field_l = k.field_h.field_l + 2;
                  var10 = k.field_h.field_l;
                  var11_ref = dj.a(true, uc.e((byte) -75));
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L4;
                  } else {
                    break L4;
                  }
                }
                k.field_h.a(var11_ref, -1);
                dq.a((wq) (Object) k.field_h, tq.field_f, vn.field_F, (byte) -72, to.field_g);
                k.field_h.c(-var10 + k.field_h.field_l, 255);
                break L2;
              } else {
                L5: {
                  tq.field_f.field_l = 0;
                  tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
                  tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
                  stackOut_7_0 = tq.field_f;
                  stackOut_7_1 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (!param3.a((byte) 116)) {
                    stackOut_9_0 = (wq) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = "";
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    break L5;
                  } else {
                    stackOut_8_0 = (wq) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = (String) var14;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    break L5;
                  }
                }
                L6: {
                  ((wq) (Object) stackIn_10_0).a(stackIn_10_1, (String) (Object) stackIn_10_2);
                  stackOut_10_0 = tq.field_f;
                  stackOut_10_1 = param6 + -4;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (!param5.a((byte) 120)) {
                    stackOut_12_0 = (wq) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = "";
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L6;
                  } else {
                    stackOut_11_0 = (wq) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = (String) var8;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L6;
                  }
                }
                ((wq) (Object) stackIn_13_0).a(stackIn_13_1, (String) (Object) stackIn_13_2);
                k.field_h.a(-10, 16);
                k.field_h.field_l = k.field_h.field_l + 1;
                var9 = k.field_h.field_l;
                dq.a((wq) (Object) k.field_h, tq.field_f, vn.field_F, (byte) -72, to.field_g);
                k.field_h.d((byte) 119, k.field_h.field_l - var9);
                break L2;
              }
            }
            cr.a(-1, 10000);
            rf.field_b = ck.field_k;
            break L1;
          }
        }
        L7: {
          if (ck.field_k != rf.field_b) {
            break L7;
          } else {
            if (!vd.a(20, 1)) {
              break L7;
            } else {
              L8: {
                var9 = jl.field_e.l(255);
                jl.field_e.field_l = 0;
                if ((var9 ^ -1) > -101) {
                  break L8;
                } else {
                  if (var9 < -106) {
                    break L8;
                  } else {
                    rf.field_b = o.field_g;
                    co.field_f = new String[-100 + var9];
                    break L7;
                  }
                }
              }
              if (var9 == 248) {
                cb.a(uc.e((byte) -108), param6 + 5);
                eo.field_e = m.field_d;
                hn.a((byte) 96);
                pf.field_d = false;
                return var9;
              } else {
                if (-100 == var9) {
                  boolean discarded$1 = vd.a(20, oc.d((byte) -59));
                  af.field_r = new Boolean(kd.a(-2, (wq) (Object) jl.field_e));
                  jl.field_e.field_l = 0;
                  break L7;
                } else {
                  si.field_a = var9;
                  rf.field_b = vj.field_e;
                  ga.field_j = -1;
                  break L7;
                }
              }
            }
          }
        }
        L9: {
          if (rf.field_b != o.field_g) {
            break L9;
          } else {
            var9 = 2;
            if (vd.a(20, var9)) {
              var10 = jl.field_e.i(65280);
              jl.field_e.field_l = 0;
              if (!vd.a(20, var10)) {
                break L9;
              } else {
                var11 = co.field_f.length;
                var12 = 0;
                L10: while (true) {
                  if (var11 <= var12) {
                    hn.a((byte) 79);
                    pf.field_d = false;
                    return 100 + var11;
                  } else {
                    co.field_f[var12] = jl.field_e.f(pn.a(param6, 251));
                    var12++;
                    continue L10;
                  }
                }
              }
            } else {
              break L9;
            }
          }
        }
        L11: {
          if (vj.field_e != rf.field_b) {
            break L11;
          } else {
            if (!um.b((byte) -92)) {
              break L11;
            } else {
              L12: {
                if ((si.field_a ^ -1) == -256) {
                  var9_ref = jl.field_e.m(param6 + -4);
                  if (var9_ref == null) {
                    break L12;
                  } else {
                    ui.a(param6 ^ -55, uc.e((byte) -120), var9_ref);
                    break L12;
                  }
                } else {
                  eo.field_e = jl.field_e.d(-1);
                  break L12;
                }
              }
              hn.a((byte) 106);
              pf.field_d = false;
              return si.field_a;
            }
          }
        }
        L13: {
          if (param6 == 4) {
            break L13;
          } else {
            field_N = false;
            break L13;
          }
        }
        L14: {
          if (null == eq.field_g) {
            if (pf.field_d) {
              L15: {
                if (de.f(param6 ^ -6788) > 30000L) {
                  eo.field_e = hg.field_b;
                  break L15;
                } else {
                  eo.field_e = gd.field_e;
                  break L15;
                }
              }
              pf.field_d = false;
              return 249;
            } else {
              var9 = dl.field_b;
              dl.field_b = pj.field_a;
              pj.field_a = var9;
              pf.field_d = true;
              break L14;
            }
          } else {
            break L14;
          }
        }
        return -1;
    }

    public static void a(int param0) {
        field_K = null;
        field_L = null;
        field_R = null;
        field_Q = null;
        field_O = null;
        if (param0 != 2) {
            Object var2 = null;
            wl.a((id) null, -2);
        }
    }

    final static void a(id param0, int param1) {
        int var3 = BrickABrac.field_J ? 1 : 0;
        param0.b((byte) 111);
        if (param1 != 17574) {
            Object var4 = null;
            wl.a((id) null, 48);
        }
        id var2 = (id) (Object) ua.field_c.d(-69);
        while (var2 != null) {
            // ifeq L76
            var2 = (id) (Object) ua.field_c.a((byte) 116);
        }
        if (var2 != null) {
            il.a((nm) (Object) param0, 56, (nm) (Object) var2);
        } else {
            ua.field_c.a((nm) (Object) param0, (byte) 3);
        }
    }

    wl(ia param0) {
        ((wl) this).field_M = param0;
    }

    final String d(int param0) {
        if (param0 <= 6) {
            field_K = null;
        }
        if (!(!((wl) this).field_q)) {
            return ((wl) this).field_M.a(-87);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new int[8192];
        field_L = "Cancel";
        field_O = "Please check if address is correct";
        field_Q = "Loading sound effects";
    }
}
