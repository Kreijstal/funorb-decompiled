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
        if (param0 != 8) {
          return 102;
        } else {
          L0: {
            L1: {
              var2 = this.e((byte) -46);
              if (var2 == 0) {
                break L1;
              } else {
                if (var2 == 1) {
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
        }
    }

    private final void k(int param0) {
        String var2 = dca.f(12);
        cc.a(55, di.a(78), var2);
    }

    private final void f(byte param0) {
        int var2 = vc.field_q.h(255);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = uca.field_d + -1;
        byte[] var5 = new byte[var4];
        vc.field_q.a(0, -118, var5, var4);
        eq.a(1, di.a(67), jaa.a((byte) 64, var5), var3 != 0);
    }

    final static boolean q(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = ug.q(12);
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
            Object var10 = null;
            Object var11 = null;
            Boolean var12 = null;
            Throwable decompiledCaughtException = null;
            var9 = TombRacer.field_G ? 1 : 0;
            var4 = si.a(bg.field_t, pg.field_y, 103, param2);
            if (var4 == 0) {
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
                  var5 = pe.a(vk.b(69), toa.a(false), hha.a(false), ((ug) this).field_u, cs.a((byte) 105), cja.a(0), (byte) 53);
                  if (var5 == -1) {
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
                if (var4 != 3) {
                  break L3;
                } else {
                  L4: {
                    if (-1 == fsa.field_m) {
                      break L4;
                    } else {
                      if (fsa.field_m != 0) {
                        fsa.field_m = -1;
                        vja.b(true);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param1) {
                    wta.field_G = false;
                    break L3;
                  } else {
                    var5 = ila.a(((ug) this).field_q, cja.a(0), 50, ((ug) this).field_u, cs.a((byte) 81), false);
                    if (var5 == -1) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        ic.field_b = tr.field_g;
                        ak.g(0);
                        gda.field_c = 10;
                        qga.field_m = false;
                        break L3;
                      } else {
                        epa.a(var5, (byte) -84, io.field_b);
                        io.field_b = null;
                        break L3;
                      }
                    }
                  }
                }
              }
              L5: {
                if (var4 == 4) {
                  if (!ft.field_a) {
                    qga.field_m = true;
                    gda.field_c = 10;
                    break L5;
                  } else {
                    cua.a((byte) -26, di.a(118));
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (5 == var4) {
                  hha.a(di.a(104), (byte) -117);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (sra.field_t) {
                    gda.field_c = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (var4 == 7) {
                  ft.a(89, di.a(113));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (8 == var4) {
                  cua.a((byte) -65, di.a(37));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (9 != var4) {
                  break L10;
                } else {
                  qea.a(di.a(104), -87);
                  break L10;
                }
              }
              L11: {
                if (var4 == 10) {
                  ql.field_k.k(17, -2988);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (11 != var4) {
                  break L12;
                } else {
                  nt.a(di.a(41), -1978);
                  break L12;
                }
              }
              L13: {
                var5 = 70 / ((param0 - -35) / 35);
                if (var4 != 12) {
                  break L13;
                } else {
                  jc.a(mn.g(-128), di.a(28), (byte) -74);
                  break L13;
                }
              }
              L14: {
                if (13 != var4) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (ana.field_o != null) {
                          break L16;
                        } else {
                          ana.field_o = new caa(dsa.field_c, new java.net.URL(((ug) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (!ana.field_o.a(false)) {
                          break L17;
                        } else {
                          L18: {
                            var7 = ana.field_o.b((byte) -123);
                            if (var7 != null) {
                              var8 = nia.a(var7.field_g, 0, var7.field_h, 255);
                              nd.a(var8, -1);
                              break L18;
                            } else {
                              var10 = null;
                              nd.a((String) null, -1);
                              break L18;
                            }
                          }
                          ana.field_o = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      ssa.a("S1", (byte) 121, (Throwable) (Object) var6);
                      var11 = null;
                      nd.a((String) null, -1);
                      ana.field_o = null;
                      break L19;
                    }
                  }
                  break L14;
                }
              }
              L20: {
                if (var4 != 15) {
                  break L20;
                } else {
                  gda.field_c = 10;
                  break L20;
                }
              }
              if (16 != var4) {
                if (var4 == 17) {
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
        this.a(rd.field_r.field_c, wla.field_Eb.field_c, gfa.field_l.field_c, dba.field_d.field_c, 5000, param1, rm.field_d.field_c, false);
    }

    final void m(int param0) {
        int var2 = 0;
        gqa var3 = null;
        int var4 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var2 = oka.field_z;
          if (param0 == -5) {
            break L0;
          } else {
            ((ug) this).field_z = 113;
            break L0;
          }
        }
        L1: {
          if (var2 >= 64) {
            break L1;
          } else {
            if (!hd.field_a[var2]) {
              break L1;
            } else {
              if (var2 == 0) {
                return;
              } else {
                L2: {
                  if (var2 == 1) {
                    bma.d((byte) 82);
                    break L2;
                  } else {
                    if (var2 == 2) {
                      voa.d(-95);
                      break L2;
                    } else {
                      if (var2 == 3) {
                        au.a(3);
                        break L2;
                      } else {
                        if (var2 == 4) {
                          iv.f(0);
                          break L2;
                        } else {
                          if (var2 != 5) {
                            if (var2 == 6) {
                              vh.a((byte) -44);
                              break L2;
                            } else {
                              if (var2 != 7) {
                                if (8 == var2) {
                                  kq.a(uca.field_d, dsa.field_c, (byte) 72, (uia) (Object) vc.field_q);
                                  break L2;
                                } else {
                                  if (var2 != 16) {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (var2 != 12) {
                                          if (var2 != 13) {
                                            if (var2 == 17) {
                                              this.f((byte) -15);
                                              break L2;
                                            } else {
                                              if (var2 == 18) {
                                                vta.c((byte) 101);
                                                break L2;
                                              } else {
                                                ssa.a("MGS1: " + kk.a(32), (byte) 123, (Throwable) null);
                                                dea.a(60);
                                                break L2;
                                              }
                                            }
                                          } else {
                                            ri.e(14180);
                                            break L2;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L4: {
                                      stackOut_22_0 = -18787;
                                      stackIn_24_0 = stackOut_22_0;
                                      stackIn_23_0 = stackOut_22_0;
                                      if (var2 != 12) {
                                        stackOut_24_0 = stackIn_24_0;
                                        stackOut_24_1 = 0;
                                        stackIn_25_0 = stackOut_24_0;
                                        stackIn_25_1 = stackOut_24_1;
                                        break L4;
                                      } else {
                                        stackOut_23_0 = stackIn_23_0;
                                        stackOut_23_1 = 1;
                                        stackIn_25_0 = stackOut_23_0;
                                        stackIn_25_1 = stackOut_23_1;
                                        break L4;
                                      }
                                    }
                                    var3 = ila.a(stackIn_25_0, stackIn_25_1 != 0);
                                    k.a((byte) 113, var3);
                                    break L2;
                                  } else {
                                    fq.a((byte) -68);
                                    break L2;
                                  }
                                }
                              } else {
                                this.k(116);
                                break L2;
                              }
                            }
                          } else {
                            rj.a(param0 + 9);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
        ssa.a("MGS2: " + kk.a(32), (byte) 120, (Throwable) null);
        dea.a(60);
    }

    private final int e(byte param0) {
        int var2 = 0;
        if (!((ug) this).field_b) {
          if (uma.b(-1)) {
            if (wta.field_G) {
              return -1;
            } else {
              var2 = ila.a(((ug) this).field_q, cja.a(0), 50, ((ug) this).field_u, cs.a((byte) -118), true);
              if (var2 == -1) {
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
                          ((ug) this).a(-6738, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      dw.b((byte) -46);
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
                      ak.g(0);
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
            ((ug) this).field_A = false;
        }
    }

    final void j(int param0) {
        hd.field_a[2] = true;
        if (param0 != -13) {
            ((ug) this).field_t = -50;
        }
    }

    final void a(int param0, int param1) {
        this.a((byte) -86, param1, false);
        int var3 = 53 % ((param0 - 38) / 36);
    }

    public static void l(int param0) {
        field_r = null;
        if (param0 != -1) {
            field_r = null;
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
        vca.field_c[1] = 16;
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
            ((ug) this).field_u = 29;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ug) this).setBackground(java.awt.Color.black);
        bg.field_t = ((ug) this).field_z;
        pt.b(bg.field_t, (byte) 65);
        qea.a(((ug) this).field_s, ((ug) this).field_v, dsa.field_c, ((ug) this).field_p, ((ug) this).field_x, ((ug) this).field_t, 5000, 5000, -1367135824, false, ((ug) this).field_A, bg.field_t, param5, ((ug) this).field_w);
        av.a(bg.field_t, dsa.field_c, 103, ((ug) this).field_x, ((ug) this).field_v, param5, ((ug) this).field_p, ((ug) this).field_s, ((ug) this).field_t);
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
            ((ug) this).s(120);
        }
    }

    final void a(int param0, int param1, int param2, String param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
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
          try {
            L0: {
              if (!((ug) this).a((byte) 51)) {
                return;
              } else {
                L1: {
                  ((ug) this).field_x = ((ug) this).getCodeBase().getHost();
                  var6_ref2 = ((ug) this).field_x.toLowerCase();
                  if (param4 == 20575) {
                    break L1;
                  } else {
                    ((ug) this).s(118);
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    stackOut_5_0 = this;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L3;
                    } else {
                      stackOut_6_0 = this;
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L2;
                      } else {
                        stackOut_7_0 = this;
                        stackIn_8_0 = stackOut_7_0;
                        break L3;
                      }
                    }
                  }
                  stackOut_8_0 = this;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L2;
                }
                L4: {
                  ((ug) this).field_q = stackIn_10_1 != 0;
                  ((ug) this).field_p = Integer.parseInt(((ug) this).getParameter("gameport1"));
                  ((ug) this).field_t = Integer.parseInt(((ug) this).getParameter("gameport2"));
                  var7 = ((ug) this).getParameter("servernum");
                  if (var7 != null) {
                    ((ug) this).field_s = Integer.parseInt(var7);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  ((ug) this).field_v = Integer.parseInt(((ug) this).getParameter("gamecrc"));
                  ((ug) this).field_w = Long.parseLong(((ug) this).getParameter("instanceid"));
                  ((ug) this).field_A = ((ug) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((ug) this).getParameter("lang");
                  if (var8 != null) {
                    ((ug) this).field_z = Integer.parseInt(var8);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (((ug) this).field_z >= 5) {
                    ((ug) this).field_z = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var9 = ((ug) this).getParameter("affid");
                  if (var9 == null) {
                    break L7;
                  } else {
                    ((ug) this).field_u = Integer.parseInt(var9);
                    break L7;
                  }
                }
                vv.field_r = Boolean.valueOf(((ug) this).getParameter("simplemode")).booleanValue();
                ((ug) this).a(false, param2, param1, param0, ((ug) this).field_v, 32, param3);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L8: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              ssa.a((String) null, (byte) 126, (Throwable) (Object) var6);
              ((ug) this).a(-6738, "crash");
              break L8;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var6_ref;
            stackOut_25_1 = new StringBuilder().append("ug.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param4 + ')');
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
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 89) {
            ug.n(-80);
        }
        if (wua.c((byte) 49)) {
            int discarded$1 = this.a((byte) -72, false, null != dq.field_f ? true : false);
        } else {
            if (cga.field_f < 10) {
            } else {
                if (!qk.i(250)) {
                    pw.C(-5);
                } else {
                    if (0 == gda.field_c) {
                        int discarded$3 = this.a((byte) -111, false, false);
                    } else {
                        tc.a(pg.field_y, -2886);
                    }
                }
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
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_133_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
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
            if (gda.field_c != 11) {
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
              if (((ug) this).field_y) {
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
            ((ug) this).field_y = false;
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
            if (fsa.field_m == -1) {
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
              if (fsa.field_m != 0) {
                break L9;
              } else {
                if (gda.field_c != 11) {
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
            if (fsa.field_m == 0) {
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
              if (cga.field_f < 10) {
                if (fsa.field_m != 3) {
                  if (fsa.field_m == 4) {
                    ((ug) this).a(-6738, "js5io");
                    break L10;
                  } else {
                    if (fsa.field_m == 2) {
                      ((ug) this).a(-6738, "js5connect_full");
                      break L10;
                    } else {
                      if (fsa.field_m != 5) {
                        ((ug) this).a(-6738, "js5connect");
                        break L10;
                      } else {
                        ((ug) this).a(-6738, "outofdate");
                        break L10;
                      }
                    }
                  }
                } else {
                  ((ug) this).a(-6738, "js5crc");
                  break L10;
                }
              } else {
                if (gda.field_c < 10) {
                  break L10;
                } else {
                  L11: {
                    dw.b((byte) -123);
                    if (fsa.field_m != 3) {
                      if (fsa.field_m != 4) {
                        if (fsa.field_m != 2) {
                          if (fsa.field_m != 5) {
                            epa.a(256, (byte) -84, wqa.field_H);
                            break L11;
                          } else {
                            epa.a(5, (byte) -84, wq.field_a);
                            break L11;
                          }
                        } else {
                          epa.a(256, (byte) -84, kka.field_r);
                          break L11;
                        }
                      } else {
                        epa.a(256, (byte) -84, uta.field_e);
                        break L11;
                      }
                    } else {
                      epa.a(256, (byte) -84, oe.field_l);
                      break L11;
                    }
                  }
                  wta.field_G = true;
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (fsa.field_m == -1) {
                break L14;
              } else {
                if (fsa.field_m != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (uma.b(-1)) {
              break L13;
            } else {
              break L12;
            }
          }
          if (oga.field_f <= bva.b((byte) -107)) {
            wta.field_G = false;
            if (-1 == fsa.field_m) {
              break L12;
            } else {
              if (fsa.field_m == 0) {
                break L12;
              } else {
                fsa.field_m = -1;
                vja.b(true);
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (fsa.field_m != 0) {
            break L15;
          } else {
            if (uma.b(-1)) {
              break L15;
            } else {
              rca.field_l = false;
              break L15;
            }
          }
        }
        L16: {
          if (cga.field_f != 0) {
            break L16;
          } else {
            if (!ula.k((byte) -117)) {
              break L16;
            } else {
              cga.field_f = 1;
              break L16;
            }
          }
        }
        L17: {
          if (cga.field_f == 1) {
            L18: {
              if (0 == bg.field_t) {
                break L18;
              } else {
                nja.field_J = dd.a(nga.field_p, 1);
                break L18;
              }
            }
            tk.field_b = sa.a(true, fq.field_g, false, 1, (byte) -95);
            hm.field_n = sa.a(true, bi.field_c, false, 1, (byte) -109);
            vc.field_p = sa.a(true, fm.field_j, false, 1, (byte) -79);
            cga.field_f = 2;
            oma.field_G = tk.field_b;
            ota.field_b = hm.field_n;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (cga.field_f == 2) {
            L20: {
              if (null != nja.field_J) {
                if (!nja.field_J.b(-79)) {
                  break L20;
                } else {
                  if (nja.field_J.a("", 108)) {
                    if (nja.field_J.c("", -127)) {
                      jga.a((byte) -45, nja.field_J);
                      nja.field_J = null;
                      ea.a(-33);
                      break L20;
                    } else {
                      break L20;
                    }
                  } else {
                    nja.field_J = null;
                    break L20;
                  }
                }
              } else {
                break L20;
              }
            }
            if (null != nja.field_J) {
              break L19;
            } else {
              cga.field_f = 3;
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (cga.field_f == 3) {
            if (!esa.a(vc.field_p, tk.field_b, -128, hm.field_n)) {
              break L21;
            } else {
              if (tt.a(vc.field_p, (byte) -53)) {
                L22: {
                  L23: {
                    ee.a(-1);
                    eha.a((byte) -27);
                    ura.field_b = nl.field_c;
                    sra.field_t = false;
                    cra.a(tk.field_b, hm.field_n, 1, ft.field_a, vc.field_p);
                    if (ofa.field_I) {
                      break L23;
                    } else {
                      if (null != bma.field_s) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    if (ofa.field_I) {
                      stackOut_100_0 = 0;
                      stackIn_101_0 = stackOut_100_0;
                      break L24;
                    } else {
                      stackOut_99_0 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_101_0 = stackIn_101_0;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_102_0 = stackOut_101_0;
                    if (ofa.field_I) {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      break L25;
                    } else {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      break L25;
                    }
                  }
                  ag.a(stackIn_104_0 != 0, stackIn_104_1 != 0, false, bma.field_s);
                  break L22;
                }
                L26: {
                  if (!vv.field_r) {
                    break L26;
                  } else {
                    aoa.b(true);
                    break L26;
                  }
                }
                L27: {
                  if (null != sma.field_c) {
                    break L27;
                  } else {
                    sma.field_c = epa.d((byte) -91);
                    ci.field_k = fta.c(-93);
                    break L27;
                  }
                }
                wk.a(sma.field_c, ci.field_k, 11861, vc.field_p);
                hm.field_n = null;
                tk.field_b = null;
                vc.field_p = null;
                vga.a((java.applet.Applet) this, (byte) -128);
                ea.a(-33);
                cga.field_f = 10;
                break L21;
              } else {
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L28: {
          if (10 == cga.field_f) {
            L29: {
              if (bg.field_t == 0) {
                break L29;
              } else {
                oqa.field_v = dd.a(tj.field_c, 1);
                break L29;
              }
            }
            cga.field_f = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          var3 = 69 % ((param0 - -63) / 62);
          if (cga.field_f == 11) {
            L31: {
              if (oqa.field_v == null) {
                break L31;
              } else {
                L32: {
                  if (!oqa.field_v.b(-100)) {
                    break L32;
                  } else {
                    if (!oqa.field_v.a(0)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                ima.a(0.0f, vca.a(voa.field_s, hra.field_c, oqa.field_v, (byte) 92), -80);
                break L30;
              }
            }
            lpa.field_w = true;
            cga.field_f = 12;
            break L30;
          } else {
            break L30;
          }
        }
        L33: {
          if (12 != cga.field_f) {
            break L33;
          } else {
            if (!lpa.field_w) {
              cga.field_f = 13;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L34: {
          if (cga.field_f == 13) {
            L35: {
              var4 = 1;
              if (null == lba.field_r) {
                break L35;
              } else {
                L36: {
                  if (!lba.field_r.a((byte) 37)) {
                    stackOut_132_0 = 0;
                    stackIn_133_0 = stackOut_132_0;
                    break L36;
                  } else {
                    stackOut_131_0 = 1;
                    stackIn_133_0 = stackOut_131_0;
                    break L36;
                  }
                }
                var4 = stackIn_133_0;
                ima.a(lba.field_r.field_i, lba.field_r.field_b, -65);
                break L35;
              }
            }
            if (var4 == 0) {
              break L34;
            } else {
              cga.field_f = 20;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L37: {
          if (param1) {
            break L37;
          } else {
            if (!wla.field_Cb) {
              break L37;
            } else {
              pq.a(nma.field_l, false);
              ((ug) this).b((byte) 14);
              fpa.a(nma.field_l, (byte) 75);
              break L37;
            }
          }
        }
        L38: {
          if (!hd.field_a[8]) {
            break L38;
          } else {
            dra.a(true);
            break L38;
          }
        }
    }

    final void b(byte param0, boolean param1) {
        hd.field_a[3] = true;
        if (param0 < 101) {
            ((ug) this).d((byte) 96);
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
            ((ug) this).field_t = -30;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[4];
        field_r[2] = "Prim's Algorithm";
        field_r[0] = "Recursive Backtracker";
        field_r[1] = "Striped";
        field_r[3] = "Division";
    }
}
