/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ug extends jna {
    private long field_w;
    private boolean field_A;
    private boolean field_y;
    private boolean field_q;
    private int field_s;
    String field_x;
    private int field_z;
    private int field_t;
    private static String[] field_r;
    private int field_u;
    private int field_p;
    private int field_v;

    final int t(int param0) {
        int var2 = 0;
        if (param0 == 8) {
          L0: {
            L1: {
              var2 = this.e((byte) -46);
              if (-1 == (var2 ^ -1)) {
                break L1;
              } else {
                if ((var2 ^ -1) == -2) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              if (hd.field_a[1]) {
                ql.a(2, -28521);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (hd.field_a[2]) {
                ki.b(false, 3);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (hd.field_a[3]) {
                ua.b(4, 2);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!hd.field_a[4]) {
                break L5;
              } else {
                qda.a(5, -21);
                break L5;
              }
            }
            L6: {
              if (hd.field_a[5]) {
                gw.b(param0 ^ -109, 6);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (hd.field_a[6]) {
                mda.b(7, (byte) -105);
                break L7;
              } else {
                break L7;
              }
            }
            if (hd.field_a[8]) {
              nf.a((byte) 5);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return 102;
        }
    }

    private final void k(int param0) {
        if (param0 <= 95) {
            this.field_v = 64;
        }
        String var2 = dca.f(12);
        cc.a(55, di.a(78), var2);
    }

    private final void f(byte param0) {
        int var2 = vc.field_q.h(255);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = uca.field_d + -1;
        if (param0 != -15) {
            ug.n(39);
        }
        byte[] var5 = new byte[var4];
        vc.field_q.a(0, param0 + -103, var5, var4);
        eq.a(param0 ^ -16, di.a(param0 + 82), jaa.a((byte) 64, var5), var3 != 0);
    }

    final static boolean q(int param0) {
        boolean discarded$0 = false;
        if (param0 != -1) {
            discarded$0 = ug.q(12);
        }
        return !ok.field_s ? true : false;
    }

    final void p(int param0) {
        int var2 = -114 / ((param0 - 66) / 34);
        hd.field_a[6] = true;
    }

    private final int a(byte param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            int var5 = 0;
            Exception var6 = null;
            uia var7 = null;
            String var8 = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            Boolean var12 = null;
            Throwable decompiledCaughtException = null;
            var9 = TombRacer.field_G ? 1 : 0;
            var4 = si.a(bg.field_t, pg.field_y, 103, param2);
            if ((var4 ^ -1) == -1) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    var5 = cha.a(pla.a(-1), sua.A(49), 2);
                    if (-1 == var5) {
                      break L1;
                    } else {
                      ifa.a(dja.field_s, var5, io.field_b, (byte) 100);
                      io.field_b = null;
                      dja.field_s = null;
                      break L1;
                    }
                  }
                  var12 = nw.e((byte) 78);
                  if (var12 != null) {
                    kb.a(2753, var12.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 == 2) {
                  var5 = pe.a(vk.b(69), toa.a(false), hha.a(false), this.field_u, cs.a((byte) 105), cja.a(0), (byte) 53);
                  if (0 == (var5 ^ -1)) {
                    break L2;
                  } else {
                    ura.a(var5, dja.field_s, (byte) -103, io.field_b);
                    dja.field_s = null;
                    io.field_b = null;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (-4 != (var4 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (-1 == fsa.field_m) {
                      break L4;
                    } else {
                      if ((fsa.field_m ^ -1) != -1) {
                        fsa.field_m = -1;
                        vja.b(true);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param1) {
                      break L5;
                    } else {
                      L6: {
                        var5 = ila.a(this.field_q, cja.a(0), 50, this.field_u, cs.a((byte) 81), false);
                        if (0 == (var5 ^ -1)) {
                          break L6;
                        } else {
                          L7: {
                            if ((var5 ^ -1) == -1) {
                              break L7;
                            } else {
                              epa.a(var5, (byte) -84, io.field_b);
                              io.field_b = null;
                              if (var9 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ic.field_b = tr.field_g;
                          ak.g(0);
                          gda.field_c = 10;
                          qga.field_m = false;
                          break L6;
                        }
                      }
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  wta.field_G = false;
                  break L3;
                }
              }
              L8: {
                if (var4 == 4) {
                  L9: {
                    if (!ft.field_a) {
                      break L9;
                    } else {
                      cua.a((byte) -26, di.a(118));
                      if (var9 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  qga.field_m = true;
                  gda.field_c = 10;
                  break L8;
                } else {
                  break L8;
                }
              }
              L10: {
                if (5 == var4) {
                  hha.a(di.a(104), (byte) -117);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 == 6) {
                  if (sra.field_t) {
                    gda.field_c = 10;
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              L12: {
                if (-8 == (var4 ^ -1)) {
                  ft.a(89, di.a(113));
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (8 == var4) {
                  cua.a((byte) -65, di.a(37));
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (9 != var4) {
                  break L14;
                } else {
                  qea.a(di.a(104), -87);
                  break L14;
                }
              }
              L15: {
                if (-11 == (var4 ^ -1)) {
                  ql.field_k.k(17, -2988);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (11 != var4) {
                  break L16;
                } else {
                  nt.a(di.a(41), -1978);
                  break L16;
                }
              }
              L17: {
                var5 = 70 / ((param0 - -35) / 35);
                if ((var4 ^ -1) != -13) {
                  break L17;
                } else {
                  jc.a(mn.g(-128), di.a(28), (byte) -74);
                  break L17;
                }
              }
              L18: {
                if (13 != var4) {
                  break L18;
                } else {
                  try {
                    L19: {
                      L20: {
                        if (ana.field_o != null) {
                          break L20;
                        } else {
                          ana.field_o = new caa(dsa.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L20;
                        }
                      }
                      L21: {
                        if (!ana.field_o.a(false)) {
                          break L21;
                        } else {
                          L22: {
                            L23: {
                              var7 = ana.field_o.b((byte) -123);
                              if (var7 != null) {
                                break L23;
                              } else {
                                var10 = (String) null;
                                nd.a((String) null, -1);
                                if (var9 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            var8 = nia.a(var7.field_g, 0, var7.field_h, 255);
                            nd.a(var8, -1);
                            break L22;
                          }
                          ana.field_o = null;
                          break L21;
                        }
                      }
                      break L19;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L24: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      ssa.a("S1", (byte) 121, (Throwable) ((Object) var6));
                      var11 = (String) null;
                      nd.a((String) null, -1);
                      ana.field_o = null;
                      break L24;
                    }
                  }
                  break L18;
                }
              }
              L25: {
                if (-16 != (var4 ^ -1)) {
                  break L25;
                } else {
                  gda.field_c = 10;
                  break L25;
                }
              }
              if (16 != var4) {
                if (-18 == (var4 ^ -1)) {
                  return 2;
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        this.a(rd.field_r.field_c, wla.field_Eb.field_c, gfa.field_l.field_c, dba.field_d.field_c, 5000, param1, rm.field_d.field_c, param2);
        if (param0 >= -25) {
            this.field_w = 116L;
        }
    }

    final void m(int param0) {
        int var2 = 0;
        gqa var3 = null;
        int var4 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var2 = oka.field_z;
          if (param0 == -5) {
            break L0;
          } else {
            this.field_z = 113;
            break L0;
          }
        }
        L1: {
          if (-65 >= (var2 ^ -1)) {
            break L1;
          } else {
            if (!hd.field_a[var2]) {
              break L1;
            } else {
              L2: {
                if (-1 == (var2 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if ((var2 ^ -1) == -2) {
                        break L4;
                      } else {
                        L5: {
                          if ((var2 ^ -1) == -3) {
                            break L5;
                          } else {
                            L6: {
                              if (-4 == (var2 ^ -1)) {
                                break L6;
                              } else {
                                L7: {
                                  if (var2 == 4) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (var2 != 5) {
                                        break L8;
                                      } else {
                                        rj.a(param0 + 9);
                                        if (var4 == 0) {
                                          break L3;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (-7 == (var2 ^ -1)) {
                                        break L9;
                                      } else {
                                        L10: {
                                          if (var2 != 7) {
                                            break L10;
                                          } else {
                                            this.k(116);
                                            if (var4 == 0) {
                                              break L3;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L11: {
                                          if (8 == var2) {
                                            break L11;
                                          } else {
                                            L12: {
                                              if (var2 != 16) {
                                                break L12;
                                              } else {
                                                fq.a((byte) -68);
                                                if (var4 == 0) {
                                                  break L3;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            L13: {
                                              L14: {
                                                if (-12 == (var2 ^ -1)) {
                                                  break L14;
                                                } else {
                                                  if (-13 != (var2 ^ -1)) {
                                                    break L13;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                              L15: {
                                                stackOut_25_0 = -18787;
                                                stackIn_27_0 = stackOut_25_0;
                                                stackIn_26_0 = stackOut_25_0;
                                                if (-13 != (var2 ^ -1)) {
                                                  stackOut_27_0 = stackIn_27_0;
                                                  stackOut_27_1 = 0;
                                                  stackIn_28_0 = stackOut_27_0;
                                                  stackIn_28_1 = stackOut_27_1;
                                                  break L15;
                                                } else {
                                                  stackOut_26_0 = stackIn_26_0;
                                                  stackOut_26_1 = 1;
                                                  stackIn_28_0 = stackOut_26_0;
                                                  stackIn_28_1 = stackOut_26_1;
                                                  break L15;
                                                }
                                              }
                                              var3 = ila.a(stackIn_28_0, stackIn_28_1 != 0);
                                              k.a((byte) 113, var3);
                                              if (var4 == 0) {
                                                break L3;
                                              } else {
                                                break L13;
                                              }
                                            }
                                            L16: {
                                              if ((var2 ^ -1) != -14) {
                                                break L16;
                                              } else {
                                                ri.e(14180);
                                                if (var4 == 0) {
                                                  break L3;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            L17: {
                                              if (var2 == 17) {
                                                break L17;
                                              } else {
                                                L18: {
                                                  if ((var2 ^ -1) == -19) {
                                                    break L18;
                                                  } else {
                                                    ssa.a("MGS1: " + kk.a(32), (byte) 123, (Throwable) null);
                                                    dea.a(60);
                                                    if (var4 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                vta.c((byte) 101);
                                                if (var4 == 0) {
                                                  break L3;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            this.f((byte) -15);
                                            if (var4 == 0) {
                                              break L3;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        kq.a(uca.field_d, dsa.field_c, (byte) 72, vc.field_q);
                                        if (var4 == 0) {
                                          break L3;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    vh.a((byte) -44);
                                    if (var4 == 0) {
                                      break L3;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                iv.f(0);
                                if (var4 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            au.a(3);
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        voa.d(-95);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    bma.d((byte) 82);
                    if (var4 == 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              }
              return;
            }
          }
        }
        ssa.a("MGS2: " + kk.a(32), (byte) 120, (Throwable) null);
        dea.a(60);
    }

    private final int e(byte param0) {
        int var2 = 0;
        if (!this.field_b) {
          if (uma.b(-1)) {
            if (wta.field_G) {
              return -1;
            } else {
              var2 = ila.a(this.field_q, cja.a(0), 50, this.field_u, cs.a((byte) -118), true);
              if (0 == (var2 ^ -1)) {
                return -1;
              } else {
                L0: {
                  if (0 == var2) {
                    break L0;
                  } else {
                    if (var2 == 1) {
                      break L0;
                    } else {
                      L1: {
                        if (!fpa.field_c) {
                          this.a(-6738, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      dw.b(param0);
                      epa.a(var2, (byte) -84, io.field_b);
                      wta.field_G = true;
                      oga.field_f = bva.b((byte) -107) - -15000L;
                      return var2;
                    }
                  }
                }
                L2: {
                  if (gda.field_c != 11) {
                    break L2;
                  } else {
                    if (0 != fsa.field_m) {
                      break L2;
                    } else {
                      ak.g(param0 + 46);
                      break L2;
                    }
                  }
                }
                return var2;
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int a(int param0, boolean param1) {
        if (param0 > -26) {
            return 16;
        }
        return this.a((byte) 73, true, param1);
    }

    final void o(int param0) {
        hd.field_a[5] = true;
        if (param0 != 9822) {
            this.field_A = false;
        }
    }

    final void j(int param0) {
        hd.field_a[2] = true;
        if (param0 != -13) {
            this.field_t = -50;
        }
    }

    final void a(int param0, int param1) {
        this.a((byte) -86, param1, false);
        int var3 = 53 % ((param0 - 38) / 36);
    }

    public static void l(int param0) {
        field_r = null;
        if (param0 != -1) {
            field_r = (String[]) null;
        }
    }

    private final void i(int param0) {
        vca.field_c[11] = -1;
        vca.field_c[9] = -1;
        vca.field_c[5] = -1;
        vca.field_c[10] = -1;
        vca.field_c[6] = -2;
        vca.field_c[7] = -1;
        vca.field_c[4] = -1;
        vca.field_c[3] = -1;
        vca.field_c[12] = -1;
        vca.field_c[18] = 1;
        vca.field_c[1] = param0;
        vca.field_c[17] = -1;
        vca.field_c[16] = -1;
        vca.field_c[2] = -2;
        vca.field_c[8] = -2;
        vca.field_c[13] = -1;
    }

    final void d(byte param0) {
        hd.field_a[11] = true;
        hd.field_a[13] = true;
        hd.field_a[12] = true;
        if (param0 != 87) {
            this.field_u = 29;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        bg.field_t = this.field_z;
        pt.b(bg.field_t, (byte) 65);
        qea.a(this.field_s, this.field_v, dsa.field_c, this.field_p, this.field_x, this.field_t, 5000, param4, -1367135824, param7, this.field_A, bg.field_t, param5, this.field_w);
        av.a(bg.field_t, dsa.field_c, 103, this.field_x, this.field_v, param5, this.field_p, this.field_s, this.field_t);
        wka.b(520);
        tja.field_q = dka.a((byte) -86);
        fpa.a(nma.field_l, (byte) 75);
        bi.field_c = param2;
        nga.field_p = param3;
        tj.field_c = param6;
        fq.field_g = param1;
        fm.field_j = param0;
        this.i(16);
        ws.f(29320);
    }

    final void g(byte param0) {
        hd.field_a[4] = true;
        if (param0 >= -45) {
            this.s(120);
        }
    }

    final void a(int param0, int param1, int param2, String param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (!this.a((byte) 51)) {
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    this.field_x = this.getCodeBase().getHost();
                    var6_ref2 = this.field_x.toLowerCase();
                    if (param4 == 20575) {
                      break L2;
                    } else {
                      this.s(118);
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      stackOut_5_0 = this;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var6_ref2.equals("jagex.com")) {
                        break L4;
                      } else {
                        stackOut_6_0 = this;
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_9_0 = this;
                          stackOut_9_1 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          break L3;
                        } else {
                          stackOut_7_0 = this;
                          stackIn_8_0 = stackOut_7_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L3;
                  }
                  L5: {
                    ((ug) (this)).field_q = stackIn_10_1 != 0;
                    this.field_p = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_t = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 != null) {
                      this.field_s = Integer.parseInt(var7);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    this.field_v = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_w = Long.parseLong(this.getParameter("instanceid"));
                    this.field_A = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_z = Integer.parseInt(var8);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((this.field_z ^ -1) <= -6) {
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
                      this.field_u = Integer.parseInt(var9);
                      break L8;
                    }
                  }
                  vv.field_r = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(false, param2, param1, param0, this.field_v, 32, param3);
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                ssa.a((String) null, (byte) 126, (Throwable) ((Object) var6));
                this.a(-6738, "crash");
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
            stackOut_25_0 = (RuntimeException) (var6_ref);
            stackOut_25_1 = new StringBuilder().append("ug.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void n(int param0) {
        qoa.field_a = false;
        if (param0 != -18) {
            return;
        }
        wr.field_o = null;
        cia.field_a = null;
        ea.field_k = null;
        pm.field_d = null;
    }

    final void r(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 > 89) {
            break L0;
          } else {
            ug.n(-80);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!wua.c((byte) 49)) {
              break L2;
            } else {
              L3: {
                stackOut_3_0 = this;
                stackOut_3_1 = -72;
                stackOut_3_2 = 0;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (null == dq.field_f) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  break L3;
                }
              }
              discarded$4 = this.a((byte) stackIn_6_1, stackIn_6_2 != 0, stackIn_6_3 != 0);
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (-11 >= (cga.field_f ^ -1)) {
            L4: {
              if (qk.i(250)) {
                break L4;
              } else {
                pw.C(-5);
                if (var3 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (0 != gda.field_c) {
                break L5;
              } else {
                discarded$5 = this.a((byte) -111, false, false);
                if (var3 == 0) {
                  break L1;
                } else {
                  break L5;
                }
              }
            }
            tc.a(pg.field_y, -2886);
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void c(byte param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4_ref_java_awt_Dimension = null;
        int var4 = 0;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_26_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_143_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_142_0 = 0;
        int stackOut_141_0 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (null != wba.field_o) {
            L1: {
              if (null == dq.field_f) {
                var6 = tj.b(25128);
                var4_ref_java_awt_Dimension = var6.getSize();
                wba.field_o.a(var4_ref_java_awt_Dimension.width, false, var4_ref_java_awt_Dimension.height);
                break L1;
              } else {
                break L1;
              }
            }
            wba.field_o.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          at.j(3321);
          uka.s((byte) -44);
          if (wna.c(-112)) {
            break L2;
          } else {
            if (-12 != (gda.field_c ^ -1)) {
              sw.h(100);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != tja.field_q) {
            pg.field_y = tja.field_q.b(65);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (o.e(540800)) {
            L5: {
              var3 = aqa.a(1188664449) * 1200;
              if (this.field_y) {
                break L5;
              } else {
                if (rg.g((byte) 118) <= var3) {
                  break L4;
                } else {
                  if (var3 < ada.b(false)) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            this.field_y = false;
            dea.a(60);
            dw.b((byte) -84);
            epa.a(2, (byte) -84, th.field_n);
            bk.c(9033);
            wta.field_G = true;
            oga.field_f = 15000L + bva.b((byte) -107);
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if ((fsa.field_m ^ -1) == 0) {
              break L7;
            } else {
              if (0 == fsa.field_m) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (fsa.field_m != -1) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L8;
            } else {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_26_0;
            fsa.field_m = si.A(61);
            if (var3 == 0) {
              break L9;
            } else {
              if ((fsa.field_m ^ -1) != -1) {
                break L9;
              } else {
                if (-12 != (gda.field_c ^ -1)) {
                  break L9;
                } else {
                  if (uma.b(-1)) {
                    break L9;
                  } else {
                    ak.g(0);
                    break L9;
                  }
                }
              }
            }
          }
          if (fsa.field_m == -1) {
            break L6;
          } else {
            if (-1 == (fsa.field_m ^ -1)) {
              break L6;
            } else {
              oga.field_f = bva.b((byte) -107) + 15000L;
              break L6;
            }
          }
        }
        L10: {
          if (-1 == fsa.field_m) {
            break L10;
          } else {
            if (fsa.field_m == 0) {
              break L10;
            } else {
              L11: {
                if ((cga.field_f ^ -1) > -11) {
                  break L11;
                } else {
                  if (gda.field_c < 10) {
                    break L10;
                  } else {
                    L12: {
                      L13: {
                        dw.b((byte) -123);
                        if (-4 != (fsa.field_m ^ -1)) {
                          break L13;
                        } else {
                          epa.a(256, (byte) -84, oe.field_l);
                          if (var5 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (-5 != (fsa.field_m ^ -1)) {
                          break L14;
                        } else {
                          epa.a(256, (byte) -84, uta.field_e);
                          if (var5 == 0) {
                            break L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if ((fsa.field_m ^ -1) != -3) {
                          break L15;
                        } else {
                          epa.a(256, (byte) -84, kka.field_r);
                          if (var5 == 0) {
                            break L12;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if (fsa.field_m != 5) {
                          break L16;
                        } else {
                          epa.a(5, (byte) -84, wq.field_a);
                          if (var5 == 0) {
                            break L12;
                          } else {
                            break L16;
                          }
                        }
                      }
                      epa.a(256, (byte) -84, wqa.field_H);
                      break L12;
                    }
                    wta.field_G = true;
                    if (var5 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              L17: {
                if (-4 != (fsa.field_m ^ -1)) {
                  break L17;
                } else {
                  this.a(-6738, "js5crc");
                  if (var5 == 0) {
                    break L10;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (-5 == (fsa.field_m ^ -1)) {
                  break L18;
                } else {
                  L19: {
                    if (-3 == (fsa.field_m ^ -1)) {
                      break L19;
                    } else {
                      L20: {
                        if (-6 != (fsa.field_m ^ -1)) {
                          break L20;
                        } else {
                          this.a(-6738, "outofdate");
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L20;
                          }
                        }
                      }
                      this.a(-6738, "js5connect");
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L19;
                      }
                    }
                  }
                  this.a(-6738, "js5connect_full");
                  if (var5 == 0) {
                    break L10;
                  } else {
                    break L18;
                  }
                }
              }
              this.a(-6738, "js5io");
              break L10;
            }
          }
        }
        L21: {
          L22: {
            L23: {
              if (fsa.field_m == -1) {
                break L23;
              } else {
                if ((fsa.field_m ^ -1) != -1) {
                  break L22;
                } else {
                  break L23;
                }
              }
            }
            if (uma.b(-1)) {
              break L22;
            } else {
              break L21;
            }
          }
          if (oga.field_f <= bva.b((byte) -107)) {
            wta.field_G = false;
            if (-1 == fsa.field_m) {
              break L21;
            } else {
              if ((fsa.field_m ^ -1) == -1) {
                break L21;
              } else {
                fsa.field_m = -1;
                vja.b(true);
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L24: {
          if (fsa.field_m != 0) {
            break L24;
          } else {
            if (uma.b(-1)) {
              break L24;
            } else {
              rca.field_l = false;
              break L24;
            }
          }
        }
        L25: {
          if (cga.field_f != 0) {
            break L25;
          } else {
            if (!ula.k((byte) -117)) {
              break L25;
            } else {
              cga.field_f = 1;
              break L25;
            }
          }
        }
        L26: {
          if ((cga.field_f ^ -1) == -2) {
            L27: {
              if (0 == bg.field_t) {
                break L27;
              } else {
                nja.field_J = dd.a(nga.field_p, 1);
                break L27;
              }
            }
            tk.field_b = sa.a(true, fq.field_g, false, 1, (byte) -95);
            hm.field_n = sa.a(true, bi.field_c, false, 1, (byte) -109);
            vc.field_p = sa.a(true, fm.field_j, false, 1, (byte) -79);
            cga.field_f = 2;
            oma.field_G = tk.field_b;
            ota.field_b = hm.field_n;
            break L26;
          } else {
            break L26;
          }
        }
        L28: {
          if ((cga.field_f ^ -1) == -3) {
            L29: {
              if (null != nja.field_J) {
                if (!nja.field_J.b(-79)) {
                  break L29;
                } else {
                  L30: {
                    if (nja.field_J.a("", 108)) {
                      break L30;
                    } else {
                      nja.field_J = null;
                      if (var5 == 0) {
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                  if (nja.field_J.c("", -127)) {
                    jga.a((byte) -45, nja.field_J);
                    nja.field_J = null;
                    ea.a(-33);
                    break L29;
                  } else {
                    break L29;
                  }
                }
              } else {
                break L29;
              }
            }
            if (null != nja.field_J) {
              break L28;
            } else {
              cga.field_f = 3;
              break L28;
            }
          } else {
            break L28;
          }
        }
        L31: {
          if (-4 == (cga.field_f ^ -1)) {
            if (!esa.a(vc.field_p, tk.field_b, -128, hm.field_n)) {
              break L31;
            } else {
              if (tt.a(vc.field_p, (byte) -53)) {
                L32: {
                  L33: {
                    ee.a(-1);
                    eha.a((byte) -27);
                    ura.field_b = nl.field_c;
                    sra.field_t = false;
                    cra.a(tk.field_b, hm.field_n, 1, ft.field_a, vc.field_p);
                    if (ofa.field_I) {
                      break L33;
                    } else {
                      if (null != bma.field_s) {
                        break L33;
                      } else {
                        break L32;
                      }
                    }
                  }
                  L34: {
                    if (ofa.field_I) {
                      stackOut_109_0 = 0;
                      stackIn_110_0 = stackOut_109_0;
                      break L34;
                    } else {
                      stackOut_108_0 = 1;
                      stackIn_110_0 = stackOut_108_0;
                      break L34;
                    }
                  }
                  L35: {
                    stackOut_110_0 = stackIn_110_0;
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_111_0 = stackOut_110_0;
                    if (ofa.field_I) {
                      stackOut_112_0 = stackIn_112_0;
                      stackOut_112_1 = 0;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      break L35;
                    } else {
                      stackOut_111_0 = stackIn_111_0;
                      stackOut_111_1 = 1;
                      stackIn_113_0 = stackOut_111_0;
                      stackIn_113_1 = stackOut_111_1;
                      break L35;
                    }
                  }
                  ag.a(stackIn_113_0 != 0, stackIn_113_1 != 0, false, bma.field_s);
                  break L32;
                }
                L36: {
                  if (!vv.field_r) {
                    break L36;
                  } else {
                    aoa.b(true);
                    break L36;
                  }
                }
                L37: {
                  if (null != sma.field_c) {
                    break L37;
                  } else {
                    sma.field_c = epa.d((byte) -91);
                    ci.field_k = fta.c(-93);
                    break L37;
                  }
                }
                wk.a(sma.field_c, ci.field_k, 11861, vc.field_p);
                hm.field_n = null;
                tk.field_b = null;
                vc.field_p = null;
                vga.a((java.applet.Applet) (this), (byte) -128);
                ea.a(-33);
                cga.field_f = 10;
                break L31;
              } else {
                break L31;
              }
            }
          } else {
            break L31;
          }
        }
        L38: {
          if (10 == cga.field_f) {
            L39: {
              if ((bg.field_t ^ -1) == -1) {
                break L39;
              } else {
                oqa.field_v = dd.a(tj.field_c, 1);
                break L39;
              }
            }
            cga.field_f = 11;
            break L38;
          } else {
            break L38;
          }
        }
        L40: {
          var3 = 69 % ((param0 - -63) / 62);
          if ((cga.field_f ^ -1) == -12) {
            L41: {
              L42: {
                if (oqa.field_v == null) {
                  break L42;
                } else {
                  if (!oqa.field_v.b(-100)) {
                    break L41;
                  } else {
                    if (!oqa.field_v.a(0)) {
                      break L41;
                    } else {
                      break L42;
                    }
                  }
                }
              }
              lpa.field_w = true;
              cga.field_f = 12;
              if (var5 == 0) {
                break L40;
              } else {
                break L41;
              }
            }
            ima.a(0.0f, vca.a(voa.field_s, hra.field_c, oqa.field_v, (byte) 92), -80);
            break L40;
          } else {
            break L40;
          }
        }
        L43: {
          if (12 != cga.field_f) {
            break L43;
          } else {
            if (!lpa.field_w) {
              cga.field_f = 13;
              break L43;
            } else {
              break L43;
            }
          }
        }
        L44: {
          if (cga.field_f == 13) {
            L45: {
              var4 = 1;
              if (null == lba.field_r) {
                break L45;
              } else {
                L46: {
                  if (!lba.field_r.a((byte) 37)) {
                    stackOut_142_0 = 0;
                    stackIn_143_0 = stackOut_142_0;
                    break L46;
                  } else {
                    stackOut_141_0 = 1;
                    stackIn_143_0 = stackOut_141_0;
                    break L46;
                  }
                }
                var4 = stackIn_143_0;
                ima.a(lba.field_r.field_i, lba.field_r.field_b, -65);
                break L45;
              }
            }
            if (var4 == 0) {
              break L44;
            } else {
              cga.field_f = 20;
              break L44;
            }
          } else {
            break L44;
          }
        }
        L47: {
          if (param1) {
            break L47;
          } else {
            if (!wla.field_Cb) {
              break L47;
            } else {
              pq.a(nma.field_l, false);
              this.b((byte) 14);
              fpa.a(nma.field_l, (byte) 75);
              break L47;
            }
          }
        }
        L48: {
          if (!hd.field_a[8]) {
            break L48;
          } else {
            dra.a(true);
            break L48;
          }
        }
    }

    final void b(byte param0, boolean param1) {
        hd.field_a[3] = true;
        if (param0 < 101) {
            this.d((byte) 96);
        }
        hd.field_a[8] = param1;
        hd.field_a[7] = true;
        hd.field_a[16] = true;
        hd.field_a[0] = true;
        hd.field_a[17] = true;
        hd.field_a[18] = true;
    }

    ug() {
    }

    final void s(int param0) {
        hd.field_a[1] = true;
        if (param0 != -1) {
            this.field_t = -30;
        }
    }

    static {
        field_r = new String[4];
        field_r[2] = "Prim's Algorithm";
        field_r[0] = "Recursive Backtracker";
        field_r[1] = "Striped";
        field_r[3] = "Division";
    }
}
