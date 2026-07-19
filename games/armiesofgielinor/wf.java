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
        int var2 = 0;
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
                  if (var2 == 0) {
                    if (p.field_b == 11) {
                      if (-1 == (gk.field_K ^ -1)) {
                        ms.e(116);
                        break L1;
                      } else {
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
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            vh var12 = null;
            Throwable decompiledCaughtException = null;
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
                  L6: {
                    if (param1) {
                      break L6;
                    } else {
                      L7: {
                        var5_int = rk.a((byte) -53, this.field_n, this.field_w, jr.a(-1), sk.i(-4938), false);
                        if ((var5_int ^ -1) != 0) {
                          L8: {
                            if (-1 != (var5_int ^ -1)) {
                              break L8;
                            } else {
                              ck.field_b = dc.field_o;
                              ms.e(112);
                              bl.field_b = false;
                              p.field_b = 10;
                              if (var8 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          wv.a(lk.field_r, 10, var5_int);
                          lk.field_r = null;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (var8 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ol.field_C = false;
                  break L4;
                } else {
                  break L4;
                }
              }
              L9: {
                if (var4 == 4) {
                  L10: {
                    if (aw.field_l) {
                      break L10;
                    } else {
                      bl.field_b = true;
                      p.field_b = 10;
                      if (var8 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  bl.a(ag.d((byte) -116), true);
                  break L9;
                } else {
                  break L9;
                }
              }
              L11: {
                if (5 != var4) {
                  break L11;
                } else {
                  ho.a(ag.d((byte) -115), (byte) -3);
                  break L11;
                }
              }
              L12: {
                if (6 == var4) {
                  if (!it.field_b) {
                    break L12;
                  } else {
                    p.field_b = 10;
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if (var4 != 7) {
                  break L13;
                } else {
                  ws.a(ag.d((byte) 53), -126);
                  break L13;
                }
              }
              L14: {
                if (-9 != (var4 ^ -1)) {
                  break L14;
                } else {
                  bl.a(ag.d((byte) -120), true);
                  break L14;
                }
              }
              L15: {
                if (9 == var4) {
                  ov.a(ag.d((byte) 48), 11982);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (10 != var4) {
                  break L16;
                } else {
                  vl.field_n.h(32161, 17);
                  break L16;
                }
              }
              L17: {
                if (11 != var4) {
                  break L17;
                } else {
                  t.a((byte) -118, ag.d((byte) 7));
                  break L17;
                }
              }
              L18: {
                if (var4 == 12) {
                  ra.a(ag.d((byte) -123), -69, ob.j(-129));
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (var4 == 13) {
                  try {
                    L20: {
                      L21: {
                        if (fq.field_h == null) {
                          fq.field_h = new fa(ft.field_m, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (fq.field_h.b(0)) {
                          L23: {
                            L24: {
                              var12 = fq.field_h.a(3);
                              if (var12 != null) {
                                break L24;
                              } else {
                                var9 = (String) null;
                                df.a((String) null, -108);
                                if (var8 == 0) {
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var7 = co.a(0, var12.field_q, -127, var12.field_o);
                            df.a(var7, -73);
                            break L23;
                          }
                          fq.field_h = null;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      break L20;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L25: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      af.a((Throwable) ((Object) var5), -99, "S1");
                      var10 = (String) null;
                      df.a((String) null, -119);
                      fq.field_h = null;
                      break L25;
                    }
                  }
                  break L19;
                } else {
                  break L19;
                }
              }
              L26: {
                if (15 == var4) {
                  p.field_b = 10;
                  break L26;
                } else {
                  break L26;
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
        int discarded$8 = 0;
        int var3 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 4) {
            break L0;
          } else {
            discarded$6 = this.a((byte) 113, true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!wd.a((byte) 60)) {
              break L2;
            } else {
              L3: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (null == wq.field_a) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L3;
                }
              }
              discarded$7 = this.a(stackIn_6_1 != 0, false, (byte) -97);
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (-11 < (f.field_E ^ -1)) {
            break L1;
          } else {
            L4: {
              if (!lk.b(true)) {
                break L4;
              } else {
                L5: {
                  if (p.field_b == 0) {
                    break L5;
                  } else {
                    ii.a(el.field_d, (byte) -89);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                discarded$8 = this.a(false, false, (byte) -92);
                if (var3 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
            }
            qq.e((byte) -84);
            break L1;
          }
        }
    }

    final void j(int param0) {
        int var2 = 0;
        mo var3 = null;
        int var4 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
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
                  L2: {
                    if (1 != var2) {
                      break L2;
                    } else {
                      rk.e(param0 + -135);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (2 == var2) {
                      break L3;
                    } else {
                      L4: {
                        if ((var2 ^ -1) != -4) {
                          break L4;
                        } else {
                          jg.e(0);
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var2 == 4) {
                          break L5;
                        } else {
                          L6: {
                            if (5 != var2) {
                              break L6;
                            } else {
                              cd.b(param0 + -48);
                              if (var4 == 0) {
                                break L1;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if ((var2 ^ -1) == -7) {
                              break L7;
                            } else {
                              L8: {
                                if (-8 != (var2 ^ -1)) {
                                  break L8;
                                } else {
                                  this.e((byte) 127);
                                  if (var4 == 0) {
                                    break L1;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (8 != var2) {
                                  break L9;
                                } else {
                                  jh.a(mg.field_e, ft.field_m, fk.field_b, param0 + -13);
                                  if (var4 == 0) {
                                    break L1;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (16 == var2) {
                                  break L10;
                                } else {
                                  L11: {
                                    if ((var2 ^ -1) == -12) {
                                      break L11;
                                    } else {
                                      if (var2 == 12) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if ((var2 ^ -1) != -14) {
                                            break L12;
                                          } else {
                                            u.a(param0 + -11);
                                            if (var4 == 0) {
                                              break L1;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        L13: {
                                          if (-18 == (var2 ^ -1)) {
                                            break L13;
                                          } else {
                                            L14: {
                                              if (18 != var2) {
                                                break L14;
                                              } else {
                                                fq.b((byte) 119);
                                                if (var4 == 0) {
                                                  break L1;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            af.a((Throwable) null, param0 ^ -100, "MGS1: " + cm.b(false));
                                            dj.a((byte) -124);
                                            if (var4 == 0) {
                                              break L1;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        this.n(16433);
                                        if (var4 == 0) {
                                          break L1;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  L15: {
                                    stackOut_37_0 = -34;
                                    stackIn_39_0 = stackOut_37_0;
                                    stackIn_38_0 = stackOut_37_0;
                                    if (-13 != (var2 ^ -1)) {
                                      stackOut_39_0 = stackIn_39_0;
                                      stackOut_39_1 = 0;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackIn_40_1 = stackOut_39_1;
                                      break L15;
                                    } else {
                                      stackOut_38_0 = stackIn_38_0;
                                      stackOut_38_1 = 1;
                                      stackIn_40_0 = stackOut_38_0;
                                      stackIn_40_1 = stackOut_38_1;
                                      break L15;
                                    }
                                  }
                                  var3 = ea.a((byte) stackIn_40_0, stackIn_40_1 != 0);
                                  lo.a(var3, -1);
                                  if (var4 == 0) {
                                    break L1;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              da.a(67);
                              if (var4 == 0) {
                                break L1;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ir.a(true);
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      da.a((byte) -101);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  gm.d(9);
                  break L1;
                }
                L16: {
                  if (param0 == 12) {
                    break L16;
                  } else {
                    field_B = (wk[]) null;
                    break L16;
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
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_25_0 = 0;
        int stackIn_104_0 = 0;
        String stackIn_104_1 = null;
        int stackIn_105_0 = 0;
        String stackIn_105_1 = null;
        int stackIn_106_0 = 0;
        String stackIn_106_1 = null;
        int stackIn_106_2 = 0;
        int stackIn_107_0 = 0;
        String stackIn_107_1 = null;
        int stackIn_107_2 = 0;
        int stackIn_108_0 = 0;
        String stackIn_108_1 = null;
        int stackIn_108_2 = 0;
        int stackIn_109_0 = 0;
        String stackIn_109_1 = null;
        int stackIn_109_2 = 0;
        int stackIn_109_3 = 0;
        int stackIn_137_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_103_0 = 0;
        String stackOut_103_1 = null;
        int stackOut_105_0 = 0;
        String stackOut_105_1 = null;
        int stackOut_105_2 = 0;
        int stackOut_104_0 = 0;
        String stackOut_104_1 = null;
        int stackOut_104_2 = 0;
        int stackOut_106_0 = 0;
        String stackOut_106_1 = null;
        int stackOut_106_2 = 0;
        int stackOut_108_0 = 0;
        String stackOut_108_1 = null;
        int stackOut_108_2 = 0;
        int stackOut_108_3 = 0;
        int stackOut_107_0 = 0;
        String stackOut_107_1 = null;
        int stackOut_107_2 = 0;
        int stackOut_107_3 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
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
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L8;
              } else {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
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
                L11: {
                  if (-11 < (f.field_E ^ -1)) {
                    break L11;
                  } else {
                    if ((p.field_b ^ -1) > -11) {
                      break L10;
                    } else {
                      L12: {
                        L13: {
                          er.b(-11);
                          if (3 != gk.field_K) {
                            break L13;
                          } else {
                            wv.a(oq.field_k, 10, 256);
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          if (-5 != (gk.field_K ^ -1)) {
                            break L14;
                          } else {
                            wv.a(cv.field_k, 10, 256);
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (gk.field_K != 2) {
                            break L15;
                          } else {
                            wv.a(kl.field_d, 10, 256);
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (-6 == (gk.field_K ^ -1)) {
                            break L16;
                          } else {
                            wv.a(wm.field_a, 10, 256);
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L16;
                            }
                          }
                        }
                        wv.a(fk.field_f, 10, 5);
                        break L12;
                      }
                      ol.field_C = true;
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                L17: {
                  if (3 == gk.field_K) {
                    break L17;
                  } else {
                    L18: {
                      if ((gk.field_K ^ -1) != -5) {
                        break L18;
                      } else {
                        this.a("js5io", (byte) -113);
                        if (var5 == 0) {
                          break L10;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (gk.field_K == 2) {
                        break L19;
                      } else {
                        L20: {
                          if (-6 == (gk.field_K ^ -1)) {
                            break L20;
                          } else {
                            this.a("js5connect", (byte) -41);
                            if (var5 == 0) {
                              break L10;
                            } else {
                              break L20;
                            }
                          }
                        }
                        this.a("outofdate", (byte) -67);
                        if (var5 == 0) {
                          break L10;
                        } else {
                          break L19;
                        }
                      }
                    }
                    this.a("js5connect_full", (byte) -37);
                    if (var5 == 0) {
                      break L10;
                    } else {
                      break L17;
                    }
                  }
                }
                this.a("js5crc", (byte) -107);
                break L10;
              }
            }
          }
          L21: {
            L22: {
              L23: {
                if (gk.field_K == -1) {
                  break L23;
                } else {
                  if (gk.field_K != 0) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
              }
              if (qv.j(-11)) {
                break L22;
              } else {
                break L21;
              }
            }
            if (jl.field_a > vi.b(74)) {
              break L21;
            } else {
              ol.field_C = false;
              if (0 == (gk.field_K ^ -1)) {
                break L21;
              } else {
                if ((gk.field_K ^ -1) == -1) {
                  break L21;
                } else {
                  gk.field_K = -1;
                  lb.a((byte) -8);
                  break L21;
                }
              }
            }
          }
          L24: {
            if (-1 != (gk.field_K ^ -1)) {
              break L24;
            } else {
              if (!qv.j(-11)) {
                dd.field_a = false;
                break L24;
              } else {
                break L24;
              }
            }
          }
          L25: {
            if (-1 != (f.field_E ^ -1)) {
              break L25;
            } else {
              if (!us.b(94)) {
                break L25;
              } else {
                f.field_E = 1;
                break L25;
              }
            }
          }
          L26: {
            if ((f.field_E ^ -1) != -2) {
              break L26;
            } else {
              L27: {
                if (og.field_m == 0) {
                  break L27;
                } else {
                  nf.field_Nb = nu.a(on.field_n, true);
                  break L27;
                }
              }
              ps.field_u = nw.a(1, mo.field_c, (byte) 119, false, true);
              sk.field_M = nw.a(1, wl.field_E, (byte) 122, false, true);
              h.field_g = nw.a(1, ms.field_t, (byte) 127, false, true);
              gg.field_K = ps.field_u;
              f.field_E = 2;
              ks.field_A = sk.field_M;
              break L26;
            }
          }
          L28: {
            if (f.field_E == 2) {
              L29: {
                if (null != nf.field_Nb) {
                  if (nf.field_Nb.a((byte) 82)) {
                    L30: {
                      if (!nf.field_Nb.a((byte) -128, "")) {
                        break L30;
                      } else {
                        if (!nf.field_Nb.a(28979, "")) {
                          break L29;
                        } else {
                          id.a((byte) -82, nf.field_Nb);
                          nf.field_Nb = null;
                          wl.a(0);
                          if (var5 == 0) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                    nf.field_Nb = null;
                    break L29;
                  } else {
                    break L29;
                  }
                } else {
                  break L29;
                }
              }
              if (nf.field_Nb != null) {
                break L28;
              } else {
                f.field_E = 3;
                break L28;
              }
            } else {
              break L28;
            }
          }
          L31: {
            if (-4 != (f.field_E ^ -1)) {
              break L31;
            } else {
              if (!wh.a(ps.field_u, (byte) 127, h.field_g, sk.field_M)) {
                break L31;
              } else {
                if (!wh.a(h.field_g, -27701)) {
                  break L31;
                } else {
                  L32: {
                    L33: {
                      cd.a(12);
                      vl.c((byte) 91);
                      it.field_b = false;
                      wa.field_e = ef.field_a;
                      qq.a(sk.field_M, ps.field_u, h.field_g, 0, aw.field_l);
                      if (mo.field_r) {
                        break L33;
                      } else {
                        if (pd.field_b == null) {
                          break L32;
                        } else {
                          break L33;
                        }
                      }
                    }
                    L34: {
                      stackOut_103_0 = 3;
                      stackOut_103_1 = pd.field_b;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      if (mo.field_r) {
                        stackOut_105_0 = stackIn_105_0;
                        stackOut_105_1 = (String) ((Object) stackIn_105_1);
                        stackOut_105_2 = 0;
                        stackIn_106_0 = stackOut_105_0;
                        stackIn_106_1 = stackOut_105_1;
                        stackIn_106_2 = stackOut_105_2;
                        break L34;
                      } else {
                        stackOut_104_0 = stackIn_104_0;
                        stackOut_104_1 = (String) ((Object) stackIn_104_1);
                        stackOut_104_2 = 1;
                        stackIn_106_0 = stackOut_104_0;
                        stackIn_106_1 = stackOut_104_1;
                        stackIn_106_2 = stackOut_104_2;
                        break L34;
                      }
                    }
                    L35: {
                      stackOut_106_0 = stackIn_106_0;
                      stackOut_106_1 = (String) ((Object) stackIn_106_1);
                      stackOut_106_2 = stackIn_106_2;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      stackIn_108_2 = stackOut_106_2;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      stackIn_107_2 = stackOut_106_2;
                      if (mo.field_r) {
                        stackOut_108_0 = stackIn_108_0;
                        stackOut_108_1 = (String) ((Object) stackIn_108_1);
                        stackOut_108_2 = stackIn_108_2;
                        stackOut_108_3 = 0;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        stackIn_109_2 = stackOut_108_2;
                        stackIn_109_3 = stackOut_108_3;
                        break L35;
                      } else {
                        stackOut_107_0 = stackIn_107_0;
                        stackOut_107_1 = (String) ((Object) stackIn_107_1);
                        stackOut_107_2 = stackIn_107_2;
                        stackOut_107_3 = 1;
                        stackIn_109_0 = stackOut_107_0;
                        stackIn_109_1 = stackOut_107_1;
                        stackIn_109_2 = stackOut_107_2;
                        stackIn_109_3 = stackOut_107_3;
                        break L35;
                      }
                    }
                    rn.a(stackIn_109_0, stackIn_109_1, stackIn_109_2 != 0, stackIn_109_3 != 0);
                    break L32;
                  }
                  L36: {
                    if (!hc.field_i) {
                      break L36;
                    } else {
                      di.c((byte) -128);
                      break L36;
                    }
                  }
                  L37: {
                    if (null != pt.field_eb) {
                      break L37;
                    } else {
                      pt.field_eb = fq.a(18757);
                      ko.field_e = nb.c((byte) 111);
                      break L37;
                    }
                  }
                  qd.a(h.field_g, (byte) 76, pt.field_eb, ko.field_e);
                  ps.field_u = null;
                  sk.field_M = null;
                  h.field_g = null;
                  p.a(-24602, (java.applet.Applet) (this));
                  wl.a(0);
                  f.field_E = 10;
                  break L31;
                }
              }
            }
          }
          L38: {
            if (f.field_E == 10) {
              L39: {
                if (0 == og.field_m) {
                  break L39;
                } else {
                  a.field_o = nu.a(lk.field_p, true);
                  break L39;
                }
              }
              f.field_E = 11;
              break L38;
            } else {
              break L38;
            }
          }
          L40: {
            if (-12 != (f.field_E ^ -1)) {
              break L40;
            } else {
              L41: {
                if (a.field_o == null) {
                  break L41;
                } else {
                  L42: {
                    if (!a.field_o.a((byte) 82)) {
                      break L42;
                    } else {
                      if (a.field_o.d(-27927)) {
                        break L41;
                      } else {
                        break L42;
                      }
                    }
                  }
                  bn.a((byte) -24, 0.0f, ao.a(db.field_b, true, of.field_Jb, a.field_o));
                  if (var5 == 0) {
                    break L40;
                  } else {
                    break L41;
                  }
                }
              }
              ts.field_l = true;
              f.field_E = 12;
              break L40;
            }
          }
          L43: {
            if (-13 != (f.field_E ^ -1)) {
              break L43;
            } else {
              if (!ts.field_l) {
                f.field_E = 13;
                break L43;
              } else {
                break L43;
              }
            }
          }
          L44: {
            if (13 != f.field_E) {
              break L44;
            } else {
              L45: {
                var3 = 1;
                if (null == sk.field_G) {
                  break L45;
                } else {
                  L46: {
                    if (!sk.field_G.a(2189)) {
                      stackOut_136_0 = 0;
                      stackIn_137_0 = stackOut_136_0;
                      break L46;
                    } else {
                      stackOut_135_0 = 1;
                      stackIn_137_0 = stackOut_135_0;
                      break L46;
                    }
                  }
                  var3 = stackIn_137_0;
                  bn.a((byte) -24, sk.field_G.field_d, sk.field_G.field_b);
                  break L45;
                }
              }
              if (var3 != 0) {
                f.field_E = 20;
                break L44;
              } else {
                break L44;
              }
            }
          }
          L47: {
            if (param1) {
              break L47;
            } else {
              if (tq.field_a) {
                dt.a(si.field_b, 23678);
                this.c((byte) 87);
                lk.a(123, si.field_b);
                break L47;
              } else {
                break L47;
              }
            }
          }
          L48: {
            if (!tk.field_f[8]) {
              break L48;
            } else {
              pu.b(28704);
              break L48;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        int discarded$1 = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.e(param1 + 26203)) {
                  L2: {
                    L3: {
                      this.field_p = this.getCodeBase().getHost();
                      var6_ref2 = this.field_p.toLowerCase();
                      stackOut_2_0 = this;
                      stackIn_5_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var6_ref2.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackOut_3_0 = this;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_6_0 = this;
                          stackOut_6_1 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          break L2;
                        } else {
                          stackOut_4_0 = this;
                          stackIn_5_0 = stackOut_4_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
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
                      discarded$1 = this.a(true, true, (byte) -74);
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
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                af.a((Throwable) ((Object) var6), 98, (String) null);
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
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6_ref);
            stackOut_22_1 = new StringBuilder().append("wf.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
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
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        RuntimeException var2 = null;
        og[] var2_array = null;
        int var3 = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        og var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        og[] var11 = null;
        int stackIn_6_0 = 0;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        String stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3 = 107 % ((param1 - -11) / 61);
            var11 = vv.a(param0, 119);
            var2_array = var11;
            var4 = new StringBuilder();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var11.length <= var5) {
                  break L2;
                } else {
                  L3: {
                    var6 = var11[var5];
                    var7 = var6.field_s;
                    if (var5 == -1 + var11.length) {
                      stackOut_5_0 = param0.length();
                      stackIn_6_0 = stackOut_5_0;
                      break L3;
                    } else {
                      stackOut_4_0 = var11[1 + var5].field_s;
                      stackIn_6_0 = stackOut_4_0;
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      var8 = stackIn_6_0;
                      var9 = param0.substring(var7, var8);
                      if (var6.field_q == iu.field_x) {
                        break L5;
                      } else {
                        L6: {
                          if (hf.field_h != var6.field_q) {
                            break L6;
                          } else {
                            discarded$6 = var4.append("<col=33bbff>").append(var9).append("</col>");
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (var6.field_q != rn.field_c) {
                            break L7;
                          } else {
                            discarded$7 = var4.append("<col=ffff99>").append(var9).append("</col>");
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (var6.field_q != gg.field_G) {
                            break L8;
                          } else {
                            discarded$8 = var4.append("<col=ffaaff>").append(var9).append("</col>");
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var6.field_q != gb.field_z) {
                            break L9;
                          } else {
                            discarded$9 = var4.append("<col=33ffaa>").append(var9).append("</col>");
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L9;
                            }
                          }
                        }
                        discarded$10 = var4.append(var9);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    discarded$11 = var4.append("<col=66ffff>").append(var9).append("</col>");
                    break L4;
                  }
                  var5++;
                  if (var10 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_23_0 = var4.toString();
              stackIn_24_0 = stackOut_23_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("wf.C(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
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
