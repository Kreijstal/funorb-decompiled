/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ep extends kq {
    private int field_q;
    static ko field_A;
    private int field_E;
    static di field_F;
    static String field_v;
    private int field_B;
    static String field_G;
    String field_t;
    private long field_o;
    private int field_w;
    private boolean field_x;
    private int field_u;
    static dd field_s;
    private boolean field_r;
    static boolean field_z;
    private boolean field_C;
    private int field_D;
    static String field_p;
    static int[] field_H;
    static String field_y;

    private final void c(int param0) {
        int var2 = -25 / ((param0 - 25) / 53);
        fe.field_H[12] = true;
        fe.field_H[11] = true;
        fe.field_H[13] = true;
    }

    final void a(int param0, String param1, int param2, int param3, int param4) {
        Exception var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        try {
          L0: {
            if (((ep) this).b(param3 ^ -26164)) {
              L1: {
                L2: {
                  ((ep) this).field_t = ((ep) this).getCodeBase().getHost();
                  var10 = ((ep) this).field_t.toLowerCase();
                  stackOut_2_0 = this;
                  stackIn_5_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (var10.equals((Object) (Object) "jagex.com")) {
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (!var10.endsWith(".jagex.com")) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L1;
                    } else {
                      stackOut_4_0 = this;
                      stackIn_5_0 = stackOut_4_0;
                      break L2;
                    }
                  }
                }
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L1;
              }
              L3: {
                ((ep) this).field_x = stackIn_7_1 != 0;
                ((ep) this).field_u = Integer.parseInt(((ep) this).getParameter("gameport1"));
                ((ep) this).field_B = Integer.parseInt(((ep) this).getParameter("gameport2"));
                var7 = ((ep) this).getParameter("servernum");
                if (var7 != null) {
                  ((ep) this).field_q = Integer.parseInt(var7);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                ((ep) this).field_D = Integer.parseInt(((ep) this).getParameter("gamecrc"));
                ((ep) this).field_o = Long.parseLong(((ep) this).getParameter("instanceid"));
                ((ep) this).field_r = ((ep) this).getParameter("member").equals((Object) (Object) "yes");
                var8 = ((ep) this).getParameter("lang");
                if (var8 != null) {
                  ((ep) this).field_E = Integer.parseInt(var8);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if ((((ep) this).field_E ^ -1) > -6) {
                  break L5;
                } else {
                  ((ep) this).field_E = 0;
                  break L5;
                }
              }
              L6: {
                var9 = ((ep) this).getParameter("affid");
                if (var9 == null) {
                  break L6;
                } else {
                  ((ep) this).field_w = Integer.parseInt(var9);
                  break L6;
                }
              }
              L7: {
                sd.field_T = Boolean.valueOf(((ep) this).getParameter("simplemode")).booleanValue();
                ((ep) this).a(((ep) this).field_D, param2, param1, (byte) 115, 32, param4, param0);
                if (param3 == 0) {
                  break L7;
                } else {
                  ((ep) this).a(-57, 27, 54, 110, 115, false, -63, 23);
                  break L7;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = (Exception) (Object) decompiledCaughtException;
            tc.a((Throwable) (Object) var6, (String) null, param3 + -8555);
            ((ep) this).a((byte) 100, "crash");
            break L8;
          }
        }
    }

    final void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        L0: {
          this.b(0, true);
          if (param3) {
            this.j(param0 ^ -42);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param6) {
            this.i(7);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!param1) {
            break L2;
          } else {
            this.g(-22045);
            break L2;
          }
        }
        if (param0 != -1) {
          return;
        } else {
          L3: {
            if (!param5) {
              break L3;
            } else {
              this.j((byte) -98);
              break L3;
            }
          }
          L4: {
            if (!param4) {
              break L4;
            } else {
              this.b(true);
              break L4;
            }
          }
          L5: {
            if (param2) {
              this.c(-55);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    private final void b(boolean param0) {
        fe.field_H[6] = param0;
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            ge var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = Pool.field_O;
            var4 = ek.a((byte) -88, param1, wp.field_d, gj.field_S);
            if (0 != var4) {
              L0: {
                if ((var4 ^ -1) != -2) {
                  break L0;
                } else {
                  L1: {
                    var5_int = kb.a(9539, lg.c(5), eh.c(8388));
                    if (-1 != var5_int) {
                      sq.a(bi.field_b, false, var5_int, ke.field_g);
                      bi.field_b = null;
                      ke.field_g = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var11 = sb.a(118);
                  if (var11 != null) {
                    cq.a(var11.booleanValue(), 68);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if ((var4 ^ -1) == -3) {
                  var5_int = fn.a(gd.a(true), ((ep) this).field_w, sa.a(false), 50, cn.a((byte) 108), kg.c((byte) 64), ng.c(12854));
                  if (-1 == var5_int) {
                    break L2;
                  } else {
                    ke.a(ke.field_g, var5_int, bi.field_b, (byte) -16);
                    bi.field_b = null;
                    ke.field_g = null;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if ((var4 ^ -1) != -4) {
                  break L3;
                } else {
                  L4: {
                    if ((sk.field_a ^ -1) == 0) {
                      break L4;
                    } else {
                      if (0 == sk.field_a) {
                        break L4;
                      } else {
                        sk.field_a = -1;
                        wa.i((byte) 72);
                        break L4;
                      }
                    }
                  }
                  if (!param0) {
                    var5_int = np.a(false, sa.a(false), false, ((ep) this).field_x, ((ep) this).field_w, kg.c((byte) 54));
                    if (0 == (var5_int ^ -1)) {
                      break L3;
                    } else {
                      if (var5_int == 0) {
                        hf.field_e = hm.field_a;
                        kh.f((byte) 121);
                        gk.field_kb = false;
                        fk.field_ab = 10;
                        break L3;
                      } else {
                        re.a(true, ke.field_g, var5_int);
                        ke.field_g = null;
                        break L3;
                      }
                    }
                  } else {
                    rg.field_v = false;
                    break L3;
                  }
                }
              }
              L5: {
                if (4 != var4) {
                  break L5;
                } else {
                  if (bf.field_g) {
                    wb.a(false, hk.d(76));
                    break L5;
                  } else {
                    fk.field_ab = 10;
                    gk.field_kb = true;
                    break L5;
                  }
                }
              }
              L6: {
                if (5 != var4) {
                  break L6;
                } else {
                  tk.a(-1, hk.d(79));
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (!mf.field_o) {
                    break L7;
                  } else {
                    fk.field_ab = 10;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if ((var4 ^ -1) == -8) {
                  nl.a((byte) 112, hk.d(99));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (8 != var4) {
                  break L9;
                } else {
                  wb.a(false, hk.d(104));
                  break L9;
                }
              }
              L10: {
                if (-10 != (var4 ^ -1)) {
                  break L10;
                } else {
                  hp.a((byte) 83, hk.d(60));
                  break L10;
                }
              }
              L11: {
                if ((var4 ^ -1) != -11) {
                  break L11;
                } else {
                  ej.field_j.b(false, 17);
                  break L11;
                }
              }
              L12: {
                if (-12 != (var4 ^ -1)) {
                  break L12;
                } else {
                  gg.a(hk.d(114), (byte) -121);
                  break L12;
                }
              }
              L13: {
                if (param2 < -96) {
                  break L13;
                } else {
                  ((ep) this).f(91);
                  break L13;
                }
              }
              L14: {
                if ((var4 ^ -1) != -13) {
                  break L14;
                } else {
                  ui.a(rc.b(true), hk.d(109), false);
                  break L14;
                }
              }
              L15: {
                if (13 == var4) {
                  try {
                    L16: {
                      L17: {
                        if (null == l.field_d) {
                          l.field_d = new ej(lg.field_s, new java.net.URL(((ep) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (l.field_d.a((byte) -118)) {
                          L19: {
                            var12 = l.field_d.a(-25955);
                            if (var12 != null) {
                              var7 = tl.a(var12.field_v, -7510, var12.field_t, 0);
                              hg.a(var7, true);
                              break L19;
                            } else {
                              var9 = null;
                              hg.a((String) null, true);
                              break L19;
                            }
                          }
                          l.field_d = null;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      break L16;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L20: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      tc.a((Throwable) (Object) var5, "S1", -8555);
                      var10 = null;
                      hg.a((String) null, true);
                      l.field_d = null;
                      break L20;
                    }
                  }
                  break L15;
                } else {
                  break L15;
                }
              }
              L21: {
                if (var4 != 15) {
                  break L21;
                } else {
                  fk.field_ab = 10;
                  break L21;
                }
              }
              if ((var4 ^ -1) != -17) {
                if ((var4 ^ -1) == -18) {
                  return 2;
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            } else {
              throw new IllegalStateException();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            ep.a(false);
        }
        field_p = null;
        field_H = null;
        field_v = null;
        field_F = null;
        field_y = null;
        field_A = null;
        field_G = null;
        field_s = null;
    }

    private final void j(byte param0) {
        fe.field_H[5] = true;
        if (param0 != -98) {
            this.j((byte) -122);
        }
    }

    final void f(int param0) {
        int var2 = 0;
        pn var3 = null;
        int var4 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        L0: {
          var4 = Pool.field_O;
          var2 = uq.field_c;
          if ((var2 ^ -1) <= -65) {
            break L0;
          } else {
            if (!fe.field_H[var2]) {
              break L0;
            } else {
              if (-1 == (var2 ^ -1)) {
                return;
              } else {
                L1: {
                  if (var2 == 1) {
                    cm.f(80);
                    break L1;
                  } else {
                    if (2 == var2) {
                      id.c(param0 + -14873);
                      break L1;
                    } else {
                      if (var2 != 3) {
                        if (-5 == (var2 ^ -1)) {
                          wi.a(199);
                          break L1;
                        } else {
                          if (5 != var2) {
                            if ((var2 ^ -1) == -7) {
                              da.a((byte) 106);
                              break L1;
                            } else {
                              if (var2 != 7) {
                                if (var2 == 8) {
                                  vn.a((byte) 34, of.field_Pb, lg.field_s, (ge) (Object) kn.field_e);
                                  break L1;
                                } else {
                                  if (-17 != (var2 ^ -1)) {
                                    L2: {
                                      if (-12 == (var2 ^ -1)) {
                                        break L2;
                                      } else {
                                        if (-13 == (var2 ^ -1)) {
                                          break L2;
                                        } else {
                                          if (-14 != (var2 ^ -1)) {
                                            if (-18 == (var2 ^ -1)) {
                                              this.d(70);
                                              break L1;
                                            } else {
                                              if (-19 != (var2 ^ -1)) {
                                                tc.a((Throwable) null, "MGS1: " + t.a(127), param0 + -23555);
                                                dn.c(-75);
                                                break L1;
                                              } else {
                                                ul.i(3);
                                                break L1;
                                              }
                                            }
                                          } else {
                                            ga.n(29769);
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      stackOut_27_0 = -31;
                                      stackIn_29_0 = stackOut_27_0;
                                      stackIn_28_0 = stackOut_27_0;
                                      if (-13 != (var2 ^ -1)) {
                                        stackOut_29_0 = stackIn_29_0;
                                        stackOut_29_1 = 0;
                                        stackIn_30_0 = stackOut_29_0;
                                        stackIn_30_1 = stackOut_29_1;
                                        break L3;
                                      } else {
                                        stackOut_28_0 = stackIn_28_0;
                                        stackOut_28_1 = 1;
                                        stackIn_30_0 = stackOut_28_0;
                                        stackIn_30_1 = stackOut_28_1;
                                        break L3;
                                      }
                                    }
                                    var3 = ee.a((byte) stackIn_30_0, stackIn_30_1 != 0);
                                    ee.a(var3, 101);
                                    break L1;
                                  } else {
                                    ea.c((byte) -56);
                                    break L1;
                                  }
                                }
                              } else {
                                this.h(6);
                                break L1;
                              }
                            }
                          } else {
                            nk.a(param0 + -14874);
                            break L1;
                          }
                        }
                      } else {
                        uo.f(-104);
                        break L1;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 == 15000) {
                    break L4;
                  } else {
                    int discarded$1 = ((ep) this).a(true, true);
                    break L4;
                  }
                }
                return;
              }
            }
          }
        }
        tc.a((Throwable) null, "MGS2: " + t.a(param0 + -14914), -8555);
        dn.c(-108);
    }

    private final void i(int param0) {
        if (param0 != 7) {
            field_F = null;
        }
        fe.field_H[2] = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ep) this).setBackground(java.awt.Color.black);
        gj.field_S = ((ep) this).field_E;
        th.a((byte) -94, gj.field_S);
        vp.a(((ep) this).field_u, ((ep) this).field_D, (byte) 86, ((ep) this).field_r, gj.field_S, ((ep) this).field_B, param5, ((ep) this).field_t, lg.field_s, 5000, ((ep) this).field_q, 5000, param6, ((ep) this).field_o);
        je.a(lg.field_s, param6, ((ep) this).field_D, ((ep) this).field_B, ((ep) this).field_t, (byte) -96, ((ep) this).field_u, gj.field_S, ((ep) this).field_q);
        fl.a(true);
        oa.field_a = nn.b(96);
        kc.a(pa.field_K, param4 + param4);
        jd.field_d = param2;
        mk.field_c = param0;
        pp.field_a = param7;
        cj.field_eb = param1;
        ie.field_g = param3;
        this.i((byte) -81);
        ao.c(false);
    }

    final static void a(byte param0, uf param1) {
        ij var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        ij var6 = null;
        Object var7 = null;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var7 = null;
          var4 = Pool.field_O;
          if (!nd.field_i.c(0)) {
            L1: {
              kg.field_m = kg.field_m + 1;
              if (kq.field_l != null) {
                kq.field_l.a(false, 50, kg.field_m);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == nl.field_b) {
                break L2;
              } else {
                nl.field_b.a(false, 50, kg.field_m);
                break L2;
              }
            }
            L3: {
              var6 = (ij) (Object) nd.field_i.c((byte) 80);
              if (var6.field_H - -var6.field_B + var6.field_y <= kg.field_m) {
                L4: {
                  ij dupTemp$1 = (ij) (Object) nd.field_i.e((byte) -41);
                  var2 = dupTemp$1;
                  if (dupTemp$1 != null) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L4;
                  } else {
                    stackOut_14_0 = -1;
                    stackIn_16_0 = stackOut_14_0;
                    break L4;
                  }
                }
                kg.field_m = stackIn_16_0;
                var7 = (Object) (Object) (ij) (Object) nd.field_i.c((byte) -27);
                break L3;
              } else {
                break L3;
              }
            }
            if (var7 != null) {
              L5: {
                if (((ij) var7).field_I != null) {
                  ((ij) var7).field_L[1] = (((ij) var7).field_I.field_Db >> -1610738527) + ((ij) var7).field_I.field_ib;
                  ((ij) var7).field_L[0] = (((ij) var7).field_I.field_gb >> 1762403489) + ((ij) var7).field_I.field_sb;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (null == ((ij) var7).field_l) {
                  break L6;
                } else {
                  ((ij) var7).field_z[0] = (((ij) var7).field_l.field_gb >> -695968895) + ((ij) var7).field_l.field_sb;
                  ((ij) var7).field_z[1] = (((ij) var7).field_l.field_Db >> 630292417) + ((ij) var7).field_l.field_ib;
                  break L6;
                }
              }
              L7: {
                if (null == ((ij) var7).field_q) {
                  break L7;
                } else {
                  ((ij) var7).field_x[1] = ((ij) var7).field_q.field_ib - -(((ij) var7).field_q.field_Db >> 1613030337);
                  ((ij) var7).field_x[0] = ((ij) var7).field_q.field_sb + (((ij) var7).field_q.field_gb >> 1142865089);
                  break L7;
                }
              }
              L8: {
                if (null == ((ij) var7).field_p) {
                  break L8;
                } else {
                  uj.a(param1, (ij) var7, ((ij) var7).field_L, ((ij) var7).field_p, 1);
                  break L8;
                }
              }
              L9: {
                if (((ij) var7).field_F != null) {
                  uj.a(param1, (ij) var7, ((ij) var7).field_z, ((ij) var7).field_F, 1);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (((ij) var7).field_D == null) {
                  break L10;
                } else {
                  uj.a(param1, (ij) var7, ((ij) var7).field_x, ((ij) var7).field_D, 1);
                  break L10;
                }
              }
              if (kg.field_m < ((ij) var7).field_H) {
                L11: {
                  if (-1 != (1 & ((ij) var7).field_v ^ -1)) {
                    ((ij) var7).field_J = ((ij) var7).field_L[0] + bc.a(-((ij) var7).field_L[0] + ((ij) var7).field_z[0], kg.field_m, ((ij) var7).field_H, param0 + 13849);
                    ((ij) var7).field_C = ((ij) var7).field_L[1] + bc.a(-((ij) var7).field_L[1] + ((ij) var7).field_z[1], kg.field_m, ((ij) var7).field_H, 13776);
                    break L11;
                  } else {
                    ((ij) var7).field_J = ((ij) var7).field_z[0];
                    ((ij) var7).field_C = ((ij) var7).field_z[1];
                    break L11;
                  }
                }
                L12: {
                  if (0 != (((ij) var7).field_v & 8)) {
                    ((ij) var7).field_w = bc.a(256, kg.field_m, ((ij) var7).field_H, 13776);
                    break L12;
                  } else {
                    ((ij) var7).field_w = 256;
                    break L12;
                  }
                }
                if ((4 & ((ij) var7).field_v) != 0) {
                  ((ij) var7).field_E = ck.a((byte) -127, 4000, ((ij) var7).field_y, kg.field_m) + 96;
                  break L0;
                } else {
                  if (0 != (((ij) var7).field_v & 2)) {
                    ((ij) var7).field_E = 4096 + bc.a(2048, kg.field_m, ((ij) var7).field_H, 13776);
                    break L0;
                  } else {
                    ((ij) var7).field_E = 0;
                    break L0;
                  }
                }
              } else {
                if (kg.field_m >= ((ij) var7).field_H + ((ij) var7).field_B) {
                  if (((ij) var7).field_y + ((ij) var7).field_H + ((ij) var7).field_B > kg.field_m) {
                    L13: {
                      var3 = -((ij) var7).field_B + -((ij) var7).field_H + kg.field_m;
                      if (-1 != (((ij) var7).field_r & 1 ^ -1)) {
                        ((ij) var7).field_J = ((ij) var7).field_z[0] + bc.a(-((ij) var7).field_z[0] + ((ij) var7).field_x[0], var3, ((ij) var7).field_y, 13776);
                        ((ij) var7).field_C = ((ij) var7).field_z[1] - -bc.a(-((ij) var7).field_z[1] + ((ij) var7).field_x[1], var3, ((ij) var7).field_y, 13776);
                        break L13;
                      } else {
                        ((ij) var7).field_C = ((ij) var7).field_x[1];
                        ((ij) var7).field_J = ((ij) var7).field_x[0];
                        break L13;
                      }
                    }
                    L14: {
                      if ((8 & ((ij) var7).field_r) != 0) {
                        ((ij) var7).field_w = ec.a(32635, ((ij) var7).field_y, -var3 + ((ij) var7).field_y, 256);
                        break L14;
                      } else {
                        ((ij) var7).field_w = 256;
                        break L14;
                      }
                    }
                    if (-1 == (4 & ((ij) var7).field_r ^ -1)) {
                      if ((((ij) var7).field_r & 2) == 0) {
                        ((ij) var7).field_E = 0;
                        break L0;
                      } else {
                        ((ij) var7).field_E = bc.a(2048, var3, ((ij) var7).field_y, param0 + 13849) + 4096;
                        break L0;
                      }
                    } else {
                      ((ij) var7).field_E = 96 + ck.a((byte) -126, 4000, ((ij) var7).field_y, -var3 + ((ij) var7).field_y);
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                } else {
                  ((ij) var7).field_E = 0;
                  ((ij) var7).field_J = ((ij) var7).field_z[0];
                  ((ij) var7).field_C = ((ij) var7).field_z[1];
                  break L0;
                }
              }
            } else {
              return;
            }
          } else {
            if (-1 != kg.field_m) {
              kg.field_m = -1;
              break L0;
            } else {
              L15: {
                if (param0 == -73) {
                  break L15;
                } else {
                  var5 = null;
                  ep.a((byte) -7, (uf) null);
                  break L15;
                }
              }
              return;
            }
          }
        }
        L16: {
          if (param0 == -73) {
            break L16;
          } else {
            var5 = null;
            ep.a((byte) -7, (uf) null);
            break L16;
          }
        }
    }

    private final void g(int param0) {
        fe.field_H[4] = true;
        if (param0 != -22045) {
            ((ep) this).field_D = 101;
        }
    }

    final void l(byte param0) {
        int var3 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        var3 = Pool.field_O;
        if (param0 > -64) {
          return;
        } else {
          L0: {
            if (gg.a(true)) {
              L1: {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (ne.field_u == null) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L1;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L1;
                }
              }
              int discarded$370 = this.a(stackIn_11_1 != 0, stackIn_11_2 != 0, -114);
              break L0;
            } else {
              if (sf.field_y < 10) {
                break L0;
              } else {
                if (!u.a(77)) {
                  un.b(121);
                  break L0;
                } else {
                  if (fk.field_ab != 0) {
                    ln.a(0, wp.field_d);
                    break L0;
                  } else {
                    int discarded$371 = this.a(false, false, -124);
                    break L0;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void h(int param0) {
        if (param0 != 6) {
            ((ep) this).l((byte) -16);
        }
        String var2 = ec.a(false);
        aj.a(hk.d(115), -18788, var2);
    }

    final int a(boolean param0, boolean param1) {
        if (param1) {
            return -1;
        }
        return this.a(true, param0, -105);
    }

    private final void d(int param0) {
        int var4 = 122 % ((-11 - param0) / 50);
        int var2 = kn.field_e.g(-74);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var5 = -1 + of.field_Pb;
        byte[] var6 = new byte[var5];
        kn.field_e.a(0, -109, var6, var5);
        jc.a(-10553, hk.d(70), a.a(var6, -99), var3 != 0);
    }

    private final int e(int param0) {
        int var2 = 0;
        if (!((ep) this).field_n) {
          if (pk.b((byte) 109)) {
            if (!rg.field_v) {
              var2 = np.a(false, sa.a(false), true, ((ep) this).field_x, ((ep) this).field_w, kg.c((byte) 121));
              if (param0 == (var2 ^ -1)) {
                return -1;
              } else {
                L0: {
                  if (-1 == (var2 ^ -1)) {
                    break L0;
                  } else {
                    if (1 != var2) {
                      L1: {
                        if (!bi.field_f) {
                          ((ep) this).a((byte) 22, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      de.c(param0 + 11);
                      re.a(true, ke.field_g, var2);
                      rg.field_v = true;
                      ia.field_k = rl.a((byte) -93) + 15000L;
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (fk.field_ab != 11) {
                    break L2;
                  } else {
                    if (0 == sk.field_a) {
                      kh.f((byte) -50);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                return var2;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private final void j(int param0) {
        if (param0 < 27) {
            field_s = null;
        }
        fe.field_H[1] = true;
    }

    final void c(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_26_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        int stackIn_138_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        L0: {
          var5 = Pool.field_O;
          if (fk.field_gb == null) {
            break L0;
          } else {
            L1: {
              if (ne.field_u == null) {
                var6 = hg.a(false);
                var4 = var6.getSize();
                fk.field_gb.a(var4.width, 51, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            fk.field_gb.a(true);
            break L0;
          }
        }
        L2: {
          id.a(127);
          bo.a((byte) 123);
          if (ue.a((byte) -124)) {
            break L2;
          } else {
            if ((fk.field_ab ^ -1) != -12) {
              t.b(-11);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null == oa.field_a) {
            break L3;
          } else {
            wp.field_d = oa.field_a.b(2);
            break L3;
          }
        }
        L4: {
          if (mg.a(-66)) {
            L5: {
              var3 = up.a(-21282) * 1200;
              if (((ep) this).field_C) {
                break L5;
              } else {
                if ((var3 ^ -1) <= (nj.a(-21055) ^ -1)) {
                  break L4;
                } else {
                  if ((sk.a((byte) 119) ^ -1) >= (var3 ^ -1)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ep) this).field_C = false;
            dn.c(-80);
            de.c(param0 + 15);
            re.a(true, bm.field_l, 2);
            qr.c(640);
            rg.field_v = true;
            ia.field_k = 15000L + rl.a((byte) -101);
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          if (param0 == -4) {
            break L6;
          } else {
            int discarded$1 = ((ep) this).a(true, false);
            break L6;
          }
        }
        L7: {
          L8: {
            if (sk.field_a == -1) {
              break L8;
            } else {
              if ((sk.field_a ^ -1) != -1) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (0 != (sk.field_a ^ -1)) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L9;
            } else {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L9;
            }
          }
          L10: {
            var3 = stackIn_26_0;
            sk.field_a = dp.b(-69);
            if (var3 == 0) {
              break L10;
            } else {
              if (sk.field_a == 0) {
                if (11 != fk.field_ab) {
                  break L10;
                } else {
                  if (!pk.b((byte) 109)) {
                    kh.f((byte) 124);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              } else {
                break L10;
              }
            }
          }
          if (-1 == sk.field_a) {
            break L7;
          } else {
            if (sk.field_a != 0) {
              ia.field_k = rl.a((byte) -99) - -15000L;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L11: {
          if ((sk.field_a ^ -1) == 0) {
            break L11;
          } else {
            if ((sk.field_a ^ -1) == -1) {
              break L11;
            } else {
              if (10 <= sf.field_y) {
                if (-11 < (fk.field_ab ^ -1)) {
                  break L11;
                } else {
                  L12: {
                    de.c(11);
                    if (3 != sk.field_a) {
                      if (-5 != (sk.field_a ^ -1)) {
                        if (sk.field_a == 2) {
                          re.a(true, hh.field_b, 256);
                          break L12;
                        } else {
                          if (sk.field_a == 5) {
                            re.a(true, dk.field_h, 5);
                            break L12;
                          } else {
                            re.a(true, bc.field_e, 256);
                            break L12;
                          }
                        }
                      } else {
                        re.a(true, cm.field_I, 256);
                        break L12;
                      }
                    } else {
                      re.a(true, br.field_L, 256);
                      break L12;
                    }
                  }
                  rg.field_v = true;
                  break L11;
                }
              } else {
                if (-4 != (sk.field_a ^ -1)) {
                  if (sk.field_a != 4) {
                    if ((sk.field_a ^ -1) != -3) {
                      if (5 != sk.field_a) {
                        ((ep) this).a((byte) -93, "js5connect");
                        break L11;
                      } else {
                        ((ep) this).a((byte) 103, "outofdate");
                        break L11;
                      }
                    } else {
                      ((ep) this).a((byte) -30, "js5connect_full");
                      break L11;
                    }
                  } else {
                    ((ep) this).a((byte) -2, "js5io");
                    break L11;
                  }
                } else {
                  ((ep) this).a((byte) -117, "js5crc");
                  break L11;
                }
              }
            }
          }
        }
        L13: {
          L14: {
            L15: {
              if (-1 == sk.field_a) {
                break L15;
              } else {
                if (sk.field_a != 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (pk.b((byte) 109)) {
              break L14;
            } else {
              break L13;
            }
          }
          if ((ia.field_k ^ -1L) < (rl.a((byte) -126) ^ -1L)) {
            break L13;
          } else {
            rg.field_v = false;
            if (-1 == sk.field_a) {
              break L13;
            } else {
              if (0 == sk.field_a) {
                break L13;
              } else {
                sk.field_a = -1;
                wa.i((byte) 72);
                break L13;
              }
            }
          }
        }
        L16: {
          if ((sk.field_a ^ -1) != -1) {
            break L16;
          } else {
            if (!pk.b((byte) 109)) {
              uh.field_o = false;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if (-1 == (sf.field_y ^ -1)) {
            if (!hi.e(-11071)) {
              break L17;
            } else {
              sf.field_y = 1;
              break L17;
            }
          } else {
            break L17;
          }
        }
        L18: {
          if (1 != sf.field_y) {
            break L18;
          } else {
            L19: {
              if (gj.field_S == 0) {
                break L19;
              } else {
                wh.field_a = fh.a(jd.field_d, (byte) 103);
                break L19;
              }
            }
            uj.field_d = oq.a(false, -4, 1, pp.field_a, true);
            vf.field_nb = oq.a(false, -49, 1, ie.field_g, true);
            rg.field_r = oq.a(false, -40, 1, cj.field_eb, true);
            qp.field_Zb = vf.field_nb;
            sf.field_y = 2;
            sd.field_R = uj.field_d;
            break L18;
          }
        }
        L20: {
          if (-3 != (sf.field_y ^ -1)) {
            break L20;
          } else {
            L21: {
              if (wh.field_a != null) {
                if (!wh.field_a.d(85)) {
                  break L21;
                } else {
                  if (!wh.field_a.a((byte) -122, "")) {
                    wh.field_a = null;
                    break L21;
                  } else {
                    if (wh.field_a.a("", param0 ^ -4)) {
                      nk.a(wh.field_a, -21013);
                      wh.field_a = null;
                      fm.a(0);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
              } else {
                break L21;
              }
            }
            if (wh.field_a != null) {
              break L20;
            } else {
              sf.field_y = 3;
              break L20;
            }
          }
        }
        L22: {
          if (sf.field_y == 3) {
            if (!k.a(uj.field_d, vf.field_nb, rg.field_r, true)) {
              break L22;
            } else {
              if (ab.a(rg.field_r, true)) {
                L23: {
                  L24: {
                    dn.d(8192);
                    ia.a((byte) 98);
                    am.field_n = o.field_A;
                    mf.field_o = false;
                    uf.a(param0 ^ 11934, bf.field_g, uj.field_d, rg.field_r, vf.field_nb);
                    if (pd.field_g) {
                      break L24;
                    } else {
                      if (null == b.field_J) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    stackOut_100_0 = -122;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_101_0 = stackOut_100_0;
                    if (pd.field_g) {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = 0;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      break L25;
                    } else {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_103_0 = stackIn_103_0;
                    stackOut_103_1 = stackIn_103_1;
                    stackIn_105_0 = stackOut_103_0;
                    stackIn_105_1 = stackOut_103_1;
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    if (pd.field_g) {
                      stackOut_105_0 = stackIn_105_0;
                      stackOut_105_1 = stackIn_105_1;
                      stackOut_105_2 = 0;
                      stackIn_106_0 = stackOut_105_0;
                      stackIn_106_1 = stackOut_105_1;
                      stackIn_106_2 = stackOut_105_2;
                      break L26;
                    } else {
                      stackOut_104_0 = stackIn_104_0;
                      stackOut_104_1 = stackIn_104_1;
                      stackOut_104_2 = 1;
                      stackIn_106_0 = stackOut_104_0;
                      stackIn_106_1 = stackOut_104_1;
                      stackIn_106_2 = stackOut_104_2;
                      break L26;
                    }
                  }
                  tg.a(stackIn_106_0, stackIn_106_1 != 0, stackIn_106_2 != 0, b.field_J);
                  break L23;
                }
                L27: {
                  if (sd.field_T) {
                    al.m(4);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (null == oh.field_c) {
                    oh.field_c = vb.b(105);
                    u.field_a = sq.g(108);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                wj.a(rg.field_r, u.field_a, false, oh.field_c);
                rg.field_r = null;
                vf.field_nb = null;
                uj.field_d = null;
                pr.a(-23989, (java.applet.Applet) this);
                fm.a(0);
                sf.field_y = 10;
                break L22;
              } else {
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L29: {
          if ((sf.field_y ^ -1) == -11) {
            L30: {
              if (-1 == (gj.field_S ^ -1)) {
                break L30;
              } else {
                kq.field_m = fh.a(mk.field_c, (byte) 103);
                break L30;
              }
            }
            sf.field_y = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if (-12 == (sf.field_y ^ -1)) {
            L32: {
              if (kq.field_m == null) {
                break L32;
              } else {
                L33: {
                  if (!kq.field_m.d(param0 ^ -52)) {
                    break L33;
                  } else {
                    if (kq.field_m.c(param0 ^ 61)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                fo.a(hp.a(kq.field_m, ir.field_b, -641, ud.field_F), 0.0f, false);
                break L31;
              }
            }
            od.field_c = true;
            sf.field_y = 12;
            break L31;
          } else {
            break L31;
          }
        }
        L34: {
          if (-13 == (sf.field_y ^ -1)) {
            if (!od.field_c) {
              sf.field_y = 13;
              break L34;
            } else {
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if (-14 == (sf.field_y ^ -1)) {
            L36: {
              var3 = 1;
              if (jl.field_e == null) {
                break L36;
              } else {
                L37: {
                  if (!jl.field_e.b((byte) -51)) {
                    stackOut_137_0 = 0;
                    stackIn_138_0 = stackOut_137_0;
                    break L37;
                  } else {
                    stackOut_136_0 = 1;
                    stackIn_138_0 = stackOut_136_0;
                    break L37;
                  }
                }
                var3 = stackIn_138_0;
                fo.a(jl.field_e.field_m, jl.field_e.field_c, false);
                break L36;
              }
            }
            if (var3 == 0) {
              break L35;
            } else {
              sf.field_y = 20;
              break L35;
            }
          } else {
            break L35;
          }
        }
        L38: {
          if (param1) {
            break L38;
          } else {
            if (!wd.field_Sb) {
              break L38;
            } else {
              he.a(pa.field_K, 0);
              ((ep) this).f((byte) 86);
              kc.a(pa.field_K, 2);
              break L38;
            }
          }
        }
        L39: {
          if (!fe.field_H[8]) {
            break L39;
          } else {
            fd.h(119);
            break L39;
          }
        }
    }

    private final void b(int param0, boolean param1) {
        fe.field_H[18] = true;
        fe.field_H[3] = true;
        fe.field_H[17] = true;
        fe.field_H[param0] = true;
        fe.field_H[7] = true;
        fe.field_H[16] = true;
        fe.field_H[8] = param1;
    }

    private final void i(byte param0) {
        r.field_m[4] = -1;
        r.field_m[2] = -2;
        r.field_m[16] = -1;
        r.field_m[8] = -2;
        r.field_m[13] = -1;
        r.field_m[3] = -1;
        r.field_m[9] = -1;
        r.field_m[18] = 1;
        r.field_m[12] = -1;
        r.field_m[17] = -1;
        r.field_m[1] = 16;
        r.field_m[6] = -2;
        r.field_m[5] = -1;
        r.field_m[7] = -1;
        r.field_m[10] = -1;
        r.field_m[11] = -1;
        if (param0 != -81) {
            ((ep) this).field_u = 93;
        }
    }

    final static dd[] a(int param0, di param1, String param2, String param3) {
        if (param0 < 36) {
            Object var6 = null;
            ep.a((byte) -107, (uf) null);
        }
        int var4 = param1.b(param3, -1);
        int var5 = param1.a(var4, 0, param2);
        return im.a(var4, var5, 0, param1);
    }

    protected ep() {
    }

    final int k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var2 = -86 % ((param0 - -81) / 39);
            var3 = this.e(0);
            if (-1 == (var3 ^ -1)) {
              break L1;
            } else {
              if ((var3 ^ -1) == -2) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (fe.field_H[1]) {
              tp.a(true, 2);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!fe.field_H[2]) {
              break L3;
            } else {
              eh.a(3, true);
              break L3;
            }
          }
          L4: {
            if (fe.field_H[3]) {
              db.a((byte) 58, 4);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!fe.field_H[4]) {
              break L5;
            } else {
              af.a(5, true);
              break L5;
            }
          }
          L6: {
            if (!fe.field_H[5]) {
              break L6;
            } else {
              um.a(10, 6);
              break L6;
            }
          }
          L7: {
            if (!fe.field_H[6]) {
              break L7;
            } else {
              nk.a(7, (byte) -91);
              break L7;
            }
          }
          if (!fe.field_H[8]) {
            break L0;
          } else {
            rq.c(946);
            break L0;
          }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Nine-ball Tutorial";
        field_v = "This is <%0>'s RuneScape clan if they have one.";
        field_z = false;
        field_p = "Report <%0> for abuse";
        field_s = new dd(360, 240);
        field_y = "Log in / Create account";
    }
}
