/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf extends iv {
    static wk[] field_B;
    static String field_u;
    static int[] field_y;
    static String field_A;
    static String field_s;
    private boolean field_r;
    private int field_C;
    private boolean field_o;
    static String[] field_F;
    private long field_x;
    String field_p;
    private boolean field_w;
    static int field_D;
    private int field_G;
    private int field_n;
    private int field_t;
    private int field_z;
    static int field_v;
    private int field_E;
    static String[] field_q;

    private final void a(int param0, int param1, boolean param2, byte param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param3 <= 73) {
            field_v = 91;
        }
        og.field_m = this.field_z;
        qa.b(og.field_m, 1);
        hq.a(param6, 5000, this.field_E, 5000, param2, og.field_m, this.field_C, 0, this.field_t, this.field_o, this.field_p, ft.field_m, this.field_x, this.field_G);
        qf.a(og.field_m, this.field_p, this.field_G, (byte) 103, this.field_C, param6, this.field_E, this.field_t, ft.field_m);
        rf.b((byte) 112);
        om.field_I = jk.b(68);
        lk.a(101, si.field_b);
        mo.field_c = param7;
        on.field_n = param5;
        lk.field_p = param0;
        wl.field_E = param1;
        ms.field_t = param4;
        this.f((byte) -51);
        df.l(0);
    }

    final static void g(int param0) {
        dp.field_Lb = vi.b(-83);
        mu.field_d = 0;
        if (param0 != -20873) {
            wf.h(-23);
        }
    }

    private final void k(int param0) {
        tk.field_f[12] = true;
        tk.field_f[13] = true;
        tk.field_f[11] = true;
        if (param0 != -13) {
            this.b(true);
        }
    }

    public static void h(int param0) {
        field_u = null;
        field_s = null;
        field_A = null;
        int var1 = -43 / ((-1 - param0) / 41);
        field_q = null;
        field_F = null;
        field_y = null;
        field_B = null;
    }

    private final void a(boolean param0, boolean param1) {
        tk.field_f[8] = param1;
        tk.field_f[7] = param0;
        tk.field_f[0] = true;
        tk.field_f[18] = true;
        tk.field_f[16] = true;
        tk.field_f[3] = true;
        tk.field_f[17] = true;
    }

    final int h(byte param0) {
        int var2;
        if (this.field_i) {
          return -1;
        } else {
          if (!qv.j(-11)) {
            return -1;
          } else {
            if (!ol.field_C) {
              L0: {
                if (param0 < -15) {
                  break L0;
                } else {
                  this.field_o = true;
                  break L0;
                }
              }
              var2 = rk.a((byte) -53, this.field_n, this.field_w, jr.a(-1), sk.i(-4938), true);
              if (0 != (var2 ^ -1)) {
                L1: {
                  if (var2 != 0) {
                    if (var2 == 1) {
                      if (p.field_b != 11) {
                        break L1;
                      } else {
                        if (-1 != (gk.field_K ^ -1)) {
                          break L1;
                        } else {
                          ms.e(116);
                          break L1;
                        }
                      }
                    } else {
                      L2: {
                        if (st.field_C) {
                          break L2;
                        } else {
                          this.a("reconnect", (byte) -81);
                          break L2;
                        }
                      }
                      er.b(-11);
                      wv.a(lk.field_r, 10, var2);
                      ol.field_C = true;
                      jl.field_a = vi.b(-111) - -15000L;
                      return var2;
                    }
                  } else {
                    if (p.field_b == 11) {
                      if (-1 == (gk.field_K ^ -1)) {
                        ms.e(116);
                        break L1;
                      } else {
                        return var2;
                      }
                    } else {
                      return var2;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    private final void l(int param0) {
        tk.field_f[param0] = true;
    }

    private final void e(byte param0) {
        if (param0 <= 119) {
            return;
        }
        String var2 = hr.b((byte) 61);
        dj.a(ag.d((byte) 47), 0, var2);
    }

    private final void m(int param0) {
        if (param0 != -7532) {
            field_u = (String) null;
        }
        tk.field_f[4] = true;
    }

    private final void i(int param0) {
        if (param0 <= 77) {
            field_s = (String) null;
        }
        tk.field_f[5] = true;
    }

    private final void b(boolean param0) {
        if (param0) {
            return;
        }
        tk.field_f[2] = true;
    }

    private final void f(int param0) {
        tk.field_f[6] = true;
        if (param0 != 9) {
            this.field_t = -103;
        }
    }

    final int a(byte param0, boolean param1) {
        int var3 = 14 % ((-26 - param0) / 53);
        return this.a(param1, true, (byte) -109);
    }

    final void a(byte param0, int param1, String param2) {
        try {
            this.a(param1, -26261, 480, 640, param2);
            int var4_int = -77 % ((param0 - -5) / 34);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wf.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void n(int param0) {
        int var2 = mg.field_e.k(0);
        int var3 = -1 != (var2 & 1 ^ -1) ? 1 : 0;
        int var4 = fk.field_b - 1;
        byte[] var5 = new byte[var4];
        mg.field_e.a(var4, var5, false, 0);
        ua.a(ag.d((byte) -125), 87, uu.a(var5, (byte) 127), var3 != 0);
        if (param0 != 16433) {
            this.j(-76);
        }
    }

    private final int a(boolean param0, boolean param1, byte param2) {
        try {
            Throwable decompiledCaughtException = null;
            int var4 = 0;
            int var5_int = 0;
            Exception var5 = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            vh var12 = null;
            L0: {
              var8 = ArmiesOfGielinor.field_M ? 1 : 0;
              if (param2 < -68) {
                break L0;
              } else {
                this.field_r = true;
                break L0;
              }
            }
            var4 = tc.a(el.field_d, param0, true, og.field_m);
            if (-1 != (var4 ^ -1)) {
              L1: {
                if (1 != var4) {
                  break L1;
                } else {
                  L2: {
                    var5_int = sa.a(false, om.c((byte) -27), fp.l(-117));
                    if (var5_int != -1) {
                      sm.a(103, br.field_b, lk.field_r, var5_int);
                      lk.field_r = null;
                      br.field_b = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var11 = r.l(-11506);
                  if (var11 == null) {
                    break L1;
                  } else {
                    dl.a((byte) 32, var11.booleanValue());
                    break L1;
                  }
                }
              }
              L3: {
                if (2 == var4) {
                  var5_int = vo.a((byte) -46, sk.i(-4938), cn.e(488997228), lb.b(0), this.field_n, qp.e((byte) -127), jr.a(-1));
                  if (var5_int == -1) {
                    break L3;
                  } else {
                    cq.a(lk.field_r, -14, br.field_b, var5_int);
                    lk.field_r = null;
                    br.field_b = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if (3 == var4) {
                  L5: {
                    if ((gk.field_K ^ -1) == 0) {
                      break L5;
                    } else {
                      if ((gk.field_K ^ -1) == -1) {
                        break L5;
                      } else {
                        gk.field_K = -1;
                        lb.a((byte) -8);
                        break L5;
                      }
                    }
                  }
                  if (param1) {
                    ol.field_C = false;
                    break L4;
                  } else {
                    var5_int = rk.a((byte) -53, this.field_n, this.field_w, jr.a(-1), sk.i(-4938), false);
                    if ((var5_int ^ -1) != 0) {
                      if (-1 != (var5_int ^ -1)) {
                        wv.a(lk.field_r, 10, var5_int);
                        lk.field_r = null;
                        break L4;
                      } else {
                        ck.field_b = dc.field_o;
                        ms.e(112);
                        bl.field_b = false;
                        p.field_b = 10;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                if (var4 == 4) {
                  if (aw.field_l) {
                    bl.a(ag.d((byte) -116), true);
                    break L6;
                  } else {
                    bl.field_b = true;
                    p.field_b = 10;
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (5 != var4) {
                  break L7;
                } else {
                  ho.a(ag.d((byte) -115), (byte) -3);
                  break L7;
                }
              }
              L8: {
                if (6 == var4) {
                  if (!it.field_b) {
                    break L8;
                  } else {
                    p.field_b = 10;
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if (var4 != 7) {
                  break L9;
                } else {
                  ws.a(ag.d((byte) 53), -126);
                  break L9;
                }
              }
              L10: {
                if (-9 != (var4 ^ -1)) {
                  break L10;
                } else {
                  bl.a(ag.d((byte) -120), true);
                  break L10;
                }
              }
              L11: {
                if (9 == var4) {
                  ov.a(ag.d((byte) 48), 11982);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (10 != var4) {
                  break L12;
                } else {
                  vl.field_n.h(32161, 17);
                  break L12;
                }
              }
              L13: {
                if (11 != var4) {
                  break L13;
                } else {
                  t.a((byte) -118, ag.d((byte) 7));
                  break L13;
                }
              }
              L14: {
                if (var4 == 12) {
                  ra.a(ag.d((byte) -123), -69, ob.j(-129));
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var4 == 13) {
                  try {
                    L16: {
                      L17: {
                        if (fq.field_h == null) {
                          fq.field_h = new fa(ft.field_m, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (fq.field_h.b(0)) {
                          L19: {
                            var12 = fq.field_h.a(3);
                            if (var12 != null) {
                              var7 = co.a(0, var12.field_q, -127, var12.field_o);
                              df.a(var7, -73);
                              break L19;
                            } else {
                              var9 = (String) null;
                              df.a((String) null, -108);
                              break L19;
                            }
                          }
                          fq.field_h = null;
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
                      af.a((Throwable) ((Object) var5), -99, "S1");
                      var10 = (String) null;
                      df.a((String) null, -119);
                      fq.field_h = null;
                      break L20;
                    }
                  }
                  break L15;
                } else {
                  break L15;
                }
              }
              L21: {
                if (15 == var4) {
                  p.field_b = 10;
                  break L21;
                } else {
                  break L21;
                }
              }
              if (-17 != (var4 ^ -1)) {
                if (-18 == (var4 ^ -1)) {
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

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 >= -60) {
            this.a(85, -61, 12, -69, -2, -25, 37);
        }
        this.a(param0, param3, false, (byte) 126, param2, param5, param1, param6);
    }

    private final void f(byte param0) {
        sh.field_a[9] = -1;
        sh.field_a[7] = -1;
        sh.field_a[1] = 16;
        sh.field_a[18] = 1;
        if (param0 != -51) {
          return;
        } else {
          sh.field_a[13] = -1;
          sh.field_a[4] = -1;
          sh.field_a[12] = -1;
          sh.field_a[6] = -2;
          sh.field_a[5] = -1;
          sh.field_a[3] = -1;
          sh.field_a[11] = -1;
          sh.field_a[16] = -1;
          sh.field_a[8] = -2;
          sh.field_a[17] = -1;
          sh.field_a[10] = -1;
          sh.field_a[2] = -2;
          return;
        }
    }

    final void g(byte param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var3;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 4) {
            break L0;
          } else {
            this.a((byte) 113, true);
            break L0;
          }
        }
        L1: {
          if (!wd.a((byte) 60)) {
            if (-11 < (f.field_E ^ -1)) {
              break L1;
            } else {
              if (!lk.b(true)) {
                qq.e((byte) -84);
                break L1;
              } else {
                if (p.field_b == 0) {
                  discarded$6 = this.a(false, false, (byte) -92);
                  break L1;
                } else {
                  ii.a(el.field_d, (byte) -89);
                  break L1;
                }
              }
            }
          } else {
            L2: {
              stackIn_5_0 = this;

              if (null == wq.field_a) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            discarded$7 = this.a(stackIn_6_1 != 0, false, (byte) -97);
            break L1;
          }
        }
    }

    final void j(int param0) {
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int var2;
        mo var3;
        int var4;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = nm.field_o;
          if (var2 >= 64) {
            break L0;
          } else {
            if (tk.field_f[var2]) {
              if (0 == var2) {
                return;
              } else {
                L1: {
                  if (1 != var2) {
                    if (2 == var2) {
                      gm.d(9);
                      break L1;
                    } else {
                      if ((var2 ^ -1) != -4) {
                        if (var2 == 4) {
                          da.a((byte) -101);
                          break L1;
                        } else {
                          if (5 != var2) {
                            if ((var2 ^ -1) == -7) {
                              ir.a(true);
                              break L1;
                            } else {
                              if (-8 != (var2 ^ -1)) {
                                if (8 != var2) {
                                  if (16 == var2) {
                                    da.a(67);
                                    break L1;
                                  } else {
                                    L2: {
                                      if ((var2 ^ -1) == -12) {
                                        break L2;
                                      } else {
                                        if (var2 == 12) {
                                          break L2;
                                        } else {
                                          if ((var2 ^ -1) != -14) {
                                            if (-18 == (var2 ^ -1)) {
                                              this.n(16433);
                                              break L1;
                                            } else {
                                              if (18 != var2) {
                                                af.a((Throwable) null, param0 ^ -100, "MGS1: " + cm.b(false));
                                                dj.a((byte) -124);
                                                break L1;
                                              } else {
                                                fq.b((byte) 119);
                                                break L1;
                                              }
                                            }
                                          } else {
                                            u.a(param0 + -11);
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      stackIn_30_0 = -34;

                                      if (-13 != (var2 ^ -1)) {
                                        stackIn_31_0 = stackIn_30_0;
                                        stackIn_31_1 = 0;
                                        break L3;
                                      } else {
                                        stackIn_31_0 = stackIn_30_0;
                                        stackIn_31_1 = 1;
                                        break L3;
                                      }
                                    }
                                    var3 = ea.a((byte) stackIn_31_0, stackIn_31_1 != 0);
                                    lo.a(var3, -1);
                                    break L1;
                                  }
                                } else {
                                  jh.a(mg.field_e, ft.field_m, fk.field_b, param0 + -13);
                                  break L1;
                                }
                              } else {
                                this.e((byte) 127);
                                break L1;
                              }
                            }
                          } else {
                            cd.b(param0 + -48);
                            break L1;
                          }
                        }
                      } else {
                        jg.e(0);
                        break L1;
                      }
                    }
                  } else {
                    rk.e(param0 + -135);
                    break L1;
                  }
                }
                L4: {
                  if (param0 == 12) {
                    break L4;
                  } else {
                    field_B = (wk[]) null;
                    break L4;
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        af.a((Throwable) null, -115, "MGS2: " + cm.b(false));
        dj.a((byte) -126);
    }

    protected wf() {
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6) {
        this.a(true, true);
        if (param5) {
            this.l(1);
        }
        if (!(!param6)) {
            this.b(false);
        }
        if (param1) {
            this.m(-7532);
        }
        if (param2) {
            this.i(125);
        }
        if (param0) {
            this.f(9);
        }
        if (!(!param3)) {
            this.k(-13);
        }
        if (param4 <= 6) {
            field_B = (wk[]) null;
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_25_0 = 0;
        int stackIn_96_0 = 0;
        String stackIn_96_1 = null;
        int stackIn_97_0 = 0;
        String stackIn_97_1 = null;
        int stackIn_97_2 = 0;
        int stackIn_100_3;
        int stackIn_127_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (null == ra.field_e) {
            break L0;
          } else {
            L1: {
              if (null == wq.field_a) {
                var6 = sp.a(0);
                var4 = var6.getSize();
                ra.field_e.b(var4.height, var4.width, -30514);
                break L1;
              } else {
                break L1;
              }
            }
            ra.field_e.a(0);
            break L0;
          }
        }
        r.c(true);
        ds.a((byte) 118);
        if (param0 > 124) {
          L2: {
            if (ql.h(31337)) {
              break L2;
            } else {
              if ((p.field_b ^ -1) == -12) {
                break L2;
              } else {
                pf.a((byte) 73);
                break L2;
              }
            }
          }
          L3: {
            if (om.field_I != null) {
              el.field_d = om.field_I.a(9);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (!go.a(99)) {
              break L4;
            } else {
              L5: {
                var3 = tp.b(-113) * 1200;
                if (this.field_r) {
                  break L5;
                } else {
                  if ((var3 ^ -1) <= (bs.a((byte) 99) ^ -1)) {
                    break L4;
                  } else {
                    if (os.g(4) <= var3) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              this.field_r = false;
              dj.a((byte) -126);
              er.b(-11);
              wv.a(of.field_bc, 10, 2);
              qf.b(56);
              ol.field_C = true;
              jl.field_a = 15000L + vi.b(-49);
              break L4;
            }
          }
          L6: {
            L7: {
              if (0 == (gk.field_K ^ -1)) {
                break L7;
              } else {
                if (0 == gk.field_K) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (0 != (gk.field_K ^ -1)) {
                stackIn_25_0 = 0;
                break L8;
              } else {
                stackIn_25_0 = 1;
                break L8;
              }
            }
            L9: {
              var3 = stackIn_25_0;
              gk.field_K = tc.b(86);
              if (var3 == 0) {
                break L9;
              } else {
                if (-1 != (gk.field_K ^ -1)) {
                  break L9;
                } else {
                  if (11 != p.field_b) {
                    break L9;
                  } else {
                    if (qv.j(-11)) {
                      break L9;
                    } else {
                      ms.e(112);
                      break L9;
                    }
                  }
                }
              }
            }
            if (0 == (gk.field_K ^ -1)) {
              break L6;
            } else {
              if (-1 == (gk.field_K ^ -1)) {
                break L6;
              } else {
                jl.field_a = vi.b(98) + 15000L;
                break L6;
              }
            }
          }
          L10: {
            if (gk.field_K == -1) {
              break L10;
            } else {
              if ((gk.field_K ^ -1) == -1) {
                break L10;
              } else {
                if (-11 < (f.field_E ^ -1)) {
                  if (3 == gk.field_K) {
                    this.a("js5crc", (byte) -107);
                    break L10;
                  } else {
                    if ((gk.field_K ^ -1) != -5) {
                      if (gk.field_K == 2) {
                        this.a("js5connect_full", (byte) -37);
                        break L10;
                      } else {
                        if (-6 == (gk.field_K ^ -1)) {
                          this.a("outofdate", (byte) -67);
                          break L10;
                        } else {
                          this.a("js5connect", (byte) -41);
                          break L10;
                        }
                      }
                    } else {
                      this.a("js5io", (byte) -113);
                      break L10;
                    }
                  }
                } else {
                  if ((p.field_b ^ -1) > -11) {
                    break L10;
                  } else {
                    L11: {
                      er.b(-11);
                      if (3 != gk.field_K) {
                        if (-5 != (gk.field_K ^ -1)) {
                          if (gk.field_K != 2) {
                            if (-6 == (gk.field_K ^ -1)) {
                              wv.a(fk.field_f, 10, 5);
                              break L11;
                            } else {
                              wv.a(wm.field_a, 10, 256);
                              break L11;
                            }
                          } else {
                            wv.a(kl.field_d, 10, 256);
                            break L11;
                          }
                        } else {
                          wv.a(cv.field_k, 10, 256);
                          break L11;
                        }
                      } else {
                        wv.a(oq.field_k, 10, 256);
                        break L11;
                      }
                    }
                    ol.field_C = true;
                    break L10;
                  }
                }
              }
            }
          }
          L12: {
            L13: {
              L14: {
                if (gk.field_K == -1) {
                  break L14;
                } else {
                  if (gk.field_K != 0) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              if (qv.j(-11)) {
                break L13;
              } else {
                break L12;
              }
            }
            if (jl.field_a > vi.b(74)) {
              break L12;
            } else {
              ol.field_C = false;
              if (0 == (gk.field_K ^ -1)) {
                break L12;
              } else {
                if ((gk.field_K ^ -1) == -1) {
                  break L12;
                } else {
                  gk.field_K = -1;
                  lb.a((byte) -8);
                  break L12;
                }
              }
            }
          }
          L15: {
            if (-1 != (gk.field_K ^ -1)) {
              break L15;
            } else {
              if (!qv.j(-11)) {
                dd.field_a = false;
                break L15;
              } else {
                break L15;
              }
            }
          }
          L16: {
            if (-1 != (f.field_E ^ -1)) {
              break L16;
            } else {
              if (!us.b(94)) {
                break L16;
              } else {
                f.field_E = 1;
                break L16;
              }
            }
          }
          L17: {
            if ((f.field_E ^ -1) != -2) {
              break L17;
            } else {
              L18: {
                if (og.field_m == 0) {
                  break L18;
                } else {
                  nf.field_Nb = nu.a(on.field_n, true);
                  break L18;
                }
              }
              ps.field_u = nw.a(1, mo.field_c, (byte) 119, false, true);
              sk.field_M = nw.a(1, wl.field_E, (byte) 122, false, true);
              h.field_g = nw.a(1, ms.field_t, (byte) 127, false, true);
              gg.field_K = ps.field_u;
              f.field_E = 2;
              ks.field_A = sk.field_M;
              break L17;
            }
          }
          L19: {
            if (f.field_E == 2) {
              L20: {
                if (null != nf.field_Nb) {
                  if (nf.field_Nb.a((byte) 82)) {
                    if (!nf.field_Nb.a((byte) -128, "")) {
                      nf.field_Nb = null;
                      break L20;
                    } else {
                      if (!nf.field_Nb.a(28979, "")) {
                        break L20;
                      } else {
                        id.a((byte) -82, nf.field_Nb);
                        nf.field_Nb = null;
                        wl.a(0);
                        break L20;
                      }
                    }
                  } else {
                    break L20;
                  }
                } else {
                  break L20;
                }
              }
              if (nf.field_Nb != null) {
                break L19;
              } else {
                f.field_E = 3;
                break L19;
              }
            } else {
              break L19;
            }
          }
          L21: {
            if (-4 != (f.field_E ^ -1)) {
              break L21;
            } else {
              if (!wh.a(ps.field_u, (byte) 127, h.field_g, sk.field_M)) {
                break L21;
              } else {
                if (!wh.a(h.field_g, -27701)) {
                  break L21;
                } else {
                  L22: {
                    L23: {
                      cd.a(12);
                      vl.c((byte) 91);
                      it.field_b = false;
                      wa.field_e = ef.field_a;
                      qq.a(sk.field_M, ps.field_u, h.field_g, 0, aw.field_l);
                      if (mo.field_r) {
                        break L23;
                      } else {
                        if (pd.field_b == null) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      stackIn_96_0 = 3;

                      stackIn_96_1 = pd.field_b;

                      if (mo.field_r) {
                        stackIn_97_0 = stackIn_96_0;
                        stackIn_97_1 = (String) ((Object) stackIn_96_1);
                        stackIn_97_2 = 0;
                        break L24;
                      } else {
                        stackIn_97_0 = stackIn_96_0;
                        stackIn_97_1 = (String) ((Object) stackIn_96_1);
                        stackIn_97_2 = 1;
                        break L24;
                      }
                    }
                    L25: {






                      if (mo.field_r) {

                        stackIn_97_1 = (String) ((Object) stackIn_97_1);

                        stackIn_100_3 = 0;
                        break L25;
                      } else {

                        stackIn_97_1 = (String) ((Object) stackIn_97_1);

                        stackIn_100_3 = 1;
                        break L25;
                      }
                    }
                    rn.a(stackIn_97_0, stackIn_97_1, stackIn_97_2 != 0, stackIn_100_3 != 0);
                    break L22;
                  }
                  L26: {
                    if (!hc.field_i) {
                      break L26;
                    } else {
                      di.c((byte) -128);
                      break L26;
                    }
                  }
                  L27: {
                    if (null != pt.field_eb) {
                      break L27;
                    } else {
                      pt.field_eb = fq.a(18757);
                      ko.field_e = nb.c((byte) 111);
                      break L27;
                    }
                  }
                  qd.a(h.field_g, (byte) 76, pt.field_eb, ko.field_e);
                  ps.field_u = null;
                  sk.field_M = null;
                  h.field_g = null;
                  p.a(-24602, (java.applet.Applet) (this));
                  wl.a(0);
                  f.field_E = 10;
                  break L21;
                }
              }
            }
          }
          L28: {
            if (f.field_E == 10) {
              L29: {
                if (0 == og.field_m) {
                  break L29;
                } else {
                  a.field_o = nu.a(lk.field_p, true);
                  break L29;
                }
              }
              f.field_E = 11;
              break L28;
            } else {
              break L28;
            }
          }
          L30: {
            if (-12 != (f.field_E ^ -1)) {
              break L30;
            } else {
              L31: {
                if (a.field_o == null) {
                  break L31;
                } else {
                  L32: {
                    if (!a.field_o.a((byte) 82)) {
                      break L32;
                    } else {
                      if (a.field_o.d(-27927)) {
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  bn.a((byte) -24, 0.0f, ao.a(db.field_b, true, of.field_Jb, a.field_o));
                  break L30;
                }
              }
              ts.field_l = true;
              f.field_E = 12;
              break L30;
            }
          }
          L33: {
            if (-13 != (f.field_E ^ -1)) {
              break L33;
            } else {
              if (!ts.field_l) {
                f.field_E = 13;
                break L33;
              } else {
                break L33;
              }
            }
          }
          L34: {
            if (13 != f.field_E) {
              break L34;
            } else {
              L35: {
                var3 = 1;
                if (null == sk.field_G) {
                  break L35;
                } else {
                  L36: {
                    if (!sk.field_G.a(2189)) {
                      stackIn_127_0 = 0;
                      break L36;
                    } else {
                      stackIn_127_0 = 1;
                      break L36;
                    }
                  }
                  var3 = stackIn_127_0;
                  bn.a((byte) -24, sk.field_G.field_d, sk.field_G.field_b);
                  break L35;
                }
              }
              if (var3 != 0) {
                f.field_E = 20;
                break L34;
              } else {
                break L34;
              }
            }
          }
          L37: {
            if (param1) {
              break L37;
            } else {
              if (tq.field_a) {
                dt.a(si.field_b, 23678);
                this.c((byte) 87);
                lk.a(123, si.field_b);
                break L37;
              } else {
                break L37;
              }
            }
          }
          L38: {
            if (!tk.field_f[8]) {
              break L38;
            } else {
              pu.b(28704);
              break L38;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        int discarded$0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.e(param1 + 26203)) {
                  L2: {
                    L3: {
                      this.field_p = this.getCodeBase().getHost();
                      var6 = this.field_p.toLowerCase();
                      stackIn_5_0 = this;

                      if (var6.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackIn_6_0 = this;

                        if (!var6.endsWith(".jagex.com")) {
                          stackIn_7_0 = this;
                          stackIn_7_1 = 0;
                          break L2;
                        } else {
                          stackIn_5_0 = this;
                          break L3;
                        }
                      }
                    }
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L2;
                  }
                  L4: {
                    ((wf) (this)).field_w = stackIn_7_1 != 0;
                    this.field_t = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_E = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 == null) {
                      break L4;
                    } else {
                      this.field_C = Integer.parseInt(var7);
                      break L4;
                    }
                  }
                  L5: {
                    this.field_G = Integer.parseInt(this.getParameter("gamecrc"));
                    if (param1 == -26261) {
                      break L5;
                    } else {
                      discarded$0 = this.a(true, true, (byte) -74);
                      break L5;
                    }
                  }
                  L6: {
                    this.field_x = Long.parseLong(this.getParameter("instanceid"));
                    this.field_o = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 == null) {
                      break L6;
                    } else {
                      this.field_z = Integer.parseInt(var8);
                      break L6;
                    }
                  }
                  L7: {
                    if (this.field_z >= 5) {
                      this.field_z = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var9 = this.getParameter("affid");
                    if (var9 == null) {
                      break L8;
                    } else {
                      this.field_n = Integer.parseInt(var9);
                      break L8;
                    }
                  }
                  hc.field_i = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(param3, 32, param4, 10, this.field_G, param0, param2);
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                af.a((Throwable) ((Object) var6_ref), 98, (String) null);
                this.a("crash", (byte) -40);
                decompiledRegionSelector0 = 1;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var6_ref2);

            stackIn_24_1 = new StringBuilder().append("wf.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(String param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int stackIn_6_0 = 0;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        og[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        og var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        og[] var11 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3 = 107 % ((param1 - -11) / 61);
            var11 = vv.a(param0, 119);
            var2 = var11;
            var4 = new StringBuilder();
            var5 = 0;
            L1: while (true) {
              if (var11.length <= var5) {
                stackIn_19_0 = var4.toString();
                break L0;
              } else {
                L2: {
                  var6 = var11[var5];
                  var7 = var6.field_s;
                  if (var5 == -1 + var11.length) {
                    stackIn_6_0 = param0.length();
                    break L2;
                  } else {
                    stackIn_6_0 = var2[1 + var5].field_s;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_6_0;
                  var9 = param0.substring(var7, var8);
                  if (var6.field_q == iu.field_x) {
                    discarded$0 = var4.append("<col=66ffff>").append(var9).append("</col>");
                    break L3;
                  } else {
                    if (hf.field_h != var6.field_q) {
                      if (var6.field_q != rn.field_c) {
                        if (var6.field_q != gg.field_G) {
                          if (var6.field_q != gb.field_z) {
                            discarded$1 = var4.append(var9);
                            break L3;
                          } else {
                            discarded$2 = var4.append("<col=33ffaa>").append(var9).append("</col>");
                            break L3;
                          }
                        } else {
                          discarded$3 = var4.append("<col=ffaaff>").append(var9).append("</col>");
                          break L3;
                        }
                      } else {
                        discarded$4 = var4.append("<col=ffff99>").append(var9).append("</col>");
                        break L3;
                      }
                    } else {
                      discarded$5 = var4.append("<col=33bbff>").append(var9).append("</col>");
                      break L3;
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref);

            stackIn_22_1 = new StringBuilder().append("wf.C(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_19_0;
    }

    static {
        field_s = "Players: ";
        field_A = "Attack";
        field_y = new int[]{14, 15, 8};
        field_F = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_v = 3000;
        field_D = 0;
        field_u = "Public";
        field_q = new String[]{"Neutral", "Saradomin", "Zamorak", "Guthix", "Seren", "Bandos", "Menaphite pantheon"};
    }
}
