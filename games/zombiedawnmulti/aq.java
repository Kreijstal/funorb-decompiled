/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aq extends ag {
    static String field_r;
    private boolean field_m;
    static ja field_u;
    private int field_y;
    private int field_C;
    static String field_n;
    private boolean field_z;
    private int field_p;
    static hh field_B;
    private long field_D;
    private boolean field_s;
    static int field_x;
    static boolean field_t;
    private int field_A;
    static java.applet.Applet field_w;
    static String[] field_l;
    String field_v;
    private int field_q;
    private int field_o;

    private final void e(byte param0) {
        if (param0 < 116) {
            field_w = (java.applet.Applet) null;
        }
        wj.field_l[1] = true;
    }

    public static void o(int param0) {
        if (param0 != 10) {
            aq.o(-41);
        }
        field_u = null;
        field_r = null;
        field_B = null;
        field_w = null;
        field_l = null;
        field_n = null;
    }

    private final int i(int param0) {
        int var2 = 0;
        if (!this.field_f) {
          if (!gh.a(100)) {
            return -1;
          } else {
            if (bi.field_a) {
              return -1;
            } else {
              var2 = fd.a(14, true, this.field_s, bb.c(-19385), s.a((byte) 32), this.field_q);
              if (var2 != -1) {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (-2 == (var2 ^ -1)) {
                      break L0;
                    } else {
                      L1: {
                        if (q.field_e) {
                          break L1;
                        } else {
                          this.a(param0 + 13654, "reconnect");
                          break L1;
                        }
                      }
                      L2: {
                        ib.a(-114);
                        bf.a(true, var2, ol.field_q);
                        if (param0 == 13546) {
                          break L2;
                        } else {
                          field_B = (hh) null;
                          break L2;
                        }
                      }
                      bi.field_a = true;
                      dl.field_e = bl.a((byte) 39) - -15000L;
                      return var2;
                    }
                  }
                }
                L3: {
                  if (a.field_b != 11) {
                    break L3;
                  } else {
                    if (-1 == (gh.field_a ^ -1)) {
                      a.b(-1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            }
          }
        } else {
          return -1;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        p.field_e = this.field_C;
        gm.f(-7733, p.field_e);
        lf.a(param1, -5989, this.field_D, this.field_A, this.field_p, p.field_e, pl.field_J, param5, this.field_m, this.field_o, 5000, 5000, this.field_v, this.field_y);
        jj.a(this.field_p, this.field_y, this.field_v, p.field_e, this.field_A, pl.field_J, param5, this.field_o, (byte) -106);
        vc.a((byte) 116);
        ll.field_a = el.b(false);
        qi.a(100, dk.field_Ib);
        m.field_z = param3;
        sn.field_Lb = param2;
        h.field_G = param0;
        if (param7 > -35) {
            this.e((byte) 2);
        }
        sq.field_R = param6;
        m.field_y = param4;
        this.b((byte) 27);
        jo.a((byte) 81);
    }

    private final void n(int param0) {
        if (param0 != -26837) {
            this.p(-7);
        }
        wj.field_l[13] = true;
        wj.field_l[12] = true;
        wj.field_l[11] = true;
    }

    final static cj k(int param0) {
        if (param0 >= -45) {
            return (cj) null;
        }
        return eg.field_B.field_Ib;
    }

    final static pc a(int param0, boolean param1, int param2, int param3) {
        pc var4 = null;
        L0: {
          var4 = (pc) ((Object) a.field_c.g(69));
          if (var4 == null) {
            var4 = new pc();
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          return (pc) null;
        } else {
          var4.a(param3, param2, param1, param0);
          return var4;
        }
    }

    private final void b(boolean param0, int param1) {
        cj discarded$0 = null;
        wj.field_l[3] = true;
        if (param1 != -7793) {
            discarded$0 = aq.k(-38);
        }
        wj.field_l[16] = true;
        wj.field_l[0] = true;
        wj.field_l[18] = true;
        wj.field_l[7] = true;
        wj.field_l[8] = param0;
        wj.field_l[17] = true;
    }

    private final void a(String param0, int param1, int param2, int param3, byte param4) {
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.b(0)) {
                  L2: {
                    L3: {
                      this.field_v = this.getCodeBase().getHost();
                      var6_ref2 = this.field_v.toLowerCase();
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
                    ((aq) (this)).field_s = stackIn_7_1 != 0;
                    this.field_y = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_o = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 == null) {
                      break L4;
                    } else {
                      this.field_A = Integer.parseInt(var7);
                      break L4;
                    }
                  }
                  L5: {
                    this.field_p = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_D = Long.parseLong(this.getParameter("instanceid"));
                    this.field_m = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 == null) {
                      break L5;
                    } else {
                      this.field_C = Integer.parseInt(var8);
                      break L5;
                    }
                  }
                  L6: {
                    if ((this.field_C ^ -1) > -6) {
                      break L6;
                    } else {
                      this.field_C = 0;
                      break L6;
                    }
                  }
                  L7: {
                    var9 = this.getParameter("affid");
                    if (param4 < -125) {
                      break L7;
                    } else {
                      field_w = (java.applet.Applet) null;
                      break L7;
                    }
                  }
                  L8: {
                    if (var9 == null) {
                      break L8;
                    } else {
                      this.field_q = Integer.parseInt(var9);
                      break L8;
                    }
                  }
                  ii.field_e = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(this.field_p, param1, 32, 32000, param2, param0, param3);
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
                bd.a((String) null, (Throwable) ((Object) var6), false);
                this.a(27200, "crash");
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
            stackOut_21_0 = (RuntimeException) (var6_ref);
            stackOut_21_1 = new StringBuilder().append("aq.V(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void l(int param0) {
        wj.field_l[2] = true;
        if (param0 > -36) {
            this.field_q = -11;
        }
    }

    private final void c(boolean param0) {
        if (param0) {
            return;
        }
        String var2 = al.k(103);
        ra.a(jl.b(0), -44, var2);
    }

    private final void h(int param0) {
        int var2 = s.field_e.g(31365);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var5 = 84 % ((param0 - 53) / 42);
        int var4 = -1 + hd.field_q;
        byte[] var6 = new byte[var4];
        s.field_e.b(var4, 0, 0, var6);
        f.a(jl.b(0), var3 != 0, (byte) -45, qe.a(-2739, var6));
    }

    final void a(String param0, int param1, byte param2) {
        try {
            int var4_int = 121 % ((-11 - param2) / 51);
            this.a(param0, 640, 480, param1, (byte) -126);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "aq.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(byte param0) {
        sq.field_U[3] = -1;
        sq.field_U[10] = -1;
        sq.field_U[5] = -1;
        sq.field_U[6] = -2;
        sq.field_U[7] = -1;
        sq.field_U[8] = -2;
        sq.field_U[11] = -1;
        sq.field_U[2] = -2;
        sq.field_U[1] = 16;
        sq.field_U[17] = -1;
        sq.field_U[13] = -1;
        sq.field_U[16] = -1;
        sq.field_U[18] = 1;
        if (param0 != 27) {
          return;
        } else {
          sq.field_U[12] = -1;
          sq.field_U[9] = -1;
          sq.field_U[4] = -1;
          return;
        }
    }

    private final void d(byte param0) {
        if (param0 != 40) {
            this.field_m = true;
        }
        wj.field_l[4] = true;
    }

    final void j(int param0) {
        int var2 = 0;
        ka var3 = null;
        int var4 = 0;
        int stackIn_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -13) {
            break L0;
          } else {
            this.h(-72);
            break L0;
          }
        }
        L1: {
          var2 = op.field_i;
          if (-65 >= (var2 ^ -1)) {
            break L1;
          } else {
            if (!wj.field_l[var2]) {
              break L1;
            } else {
              if (var2 != 0) {
                L2: {
                  if (-2 == (var2 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if (-3 != (var2 ^ -1)) {
                        break L3;
                      } else {
                        rj.i(3);
                        if (var4 != 0) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                    L4: {
                      if (-4 != (var2 ^ -1)) {
                        break L4;
                      } else {
                        fh.c(1);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          return;
                        }
                      }
                    }
                    L5: {
                      if (var2 == 4) {
                        break L5;
                      } else {
                        L6: {
                          if (var2 != 5) {
                            break L6;
                          } else {
                            he.a(param0 ^ 9350);
                            if (var4 != 0) {
                              break L6;
                            } else {
                              return;
                            }
                          }
                        }
                        L7: {
                          if (var2 == 6) {
                            break L7;
                          } else {
                            L8: {
                              if ((var2 ^ -1) != -8) {
                                break L8;
                              } else {
                                this.c(false);
                                if (var4 != 0) {
                                  break L8;
                                } else {
                                  return;
                                }
                              }
                            }
                            L9: {
                              if (-9 != (var2 ^ -1)) {
                                break L9;
                              } else {
                                bp.a(hd.field_q, s.field_e, pl.field_J, -4);
                                if (var4 != 0) {
                                  break L9;
                                } else {
                                  return;
                                }
                              }
                            }
                            L10: {
                              if (-17 == (var2 ^ -1)) {
                                break L10;
                              } else {
                                L11: {
                                  if ((var2 ^ -1) == -12) {
                                    break L11;
                                  } else {
                                    if (-13 == (var2 ^ -1)) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var2 != 13) {
                                          break L12;
                                        } else {
                                          rp.e((byte) 96);
                                          if (var4 != 0) {
                                            break L12;
                                          } else {
                                            return;
                                          }
                                        }
                                      }
                                      L13: {
                                        if (var2 == 17) {
                                          break L13;
                                        } else {
                                          L14: {
                                            if (-19 != (var2 ^ -1)) {
                                              break L14;
                                            } else {
                                              pn.a((byte) 124);
                                              if (var4 != 0) {
                                                break L14;
                                              } else {
                                                return;
                                              }
                                            }
                                          }
                                          bd.a("MGS1: " + ci.a(0), (Throwable) null, false);
                                          ak.a((byte) -114);
                                          if (var4 != 0) {
                                            break L13;
                                          } else {
                                            return;
                                          }
                                        }
                                      }
                                      this.h(110);
                                      if (var4 != 0) {
                                        break L11;
                                      } else {
                                        return;
                                      }
                                    }
                                  }
                                }
                                L15: {
                                  if ((var2 ^ -1) != -13) {
                                    stackOut_51_0 = 0;
                                    stackIn_52_0 = stackOut_51_0;
                                    break L15;
                                  } else {
                                    stackOut_50_0 = 1;
                                    stackIn_52_0 = stackOut_50_0;
                                    break L15;
                                  }
                                }
                                var3 = nj.a(stackIn_52_0 != 0, (byte) 107);
                                bf.a(var3, -53);
                                if (var4 != 0) {
                                  break L10;
                                } else {
                                  return;
                                }
                              }
                            }
                            re.a(false);
                            if (var4 != 0) {
                              break L7;
                            } else {
                              return;
                            }
                          }
                        }
                        ga.i((byte) 104);
                        if (var4 != 0) {
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    qi.a((byte) 126);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
                mh.c(0);
                if (var4 == 0) {
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        bd.a("MGS2: " + ci.a(0), (Throwable) null, false);
        ak.a((byte) -125);
    }

    private final void q(int param0) {
        wj.field_l[5] = true;
        if (param0 < 120) {
            this.field_y = 46;
        }
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            k var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = ZombieDawnMulti.field_E ? 1 : 0;
            var4 = ak.a(p.field_e, -5, param2, t.field_d);
            if (var4 != 0) {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    var5_int = wf.a(l.a((byte) -118), an.a(param0 ^ -2198), 32475);
                    if ((var5_int ^ -1) == 0) {
                      break L1;
                    } else {
                      dd.a(0, hb.field_b, ol.field_q, var5_int);
                      ol.field_q = null;
                      hb.field_b = null;
                      break L1;
                    }
                  }
                  var11 = dl.c((byte) -125);
                  if (var11 != null) {
                    uc.b(16772, var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if ((var4 ^ -1) != -3) {
                  break L2;
                } else {
                  var5_int = ek.a(nh.c((byte) -98), this.field_q, gg.a(param0 ^ -2218), -125, bb.c(-19385), s.a((byte) 32), wb.h((byte) -80));
                  if ((var5_int ^ -1) != 0) {
                    sj.a(hb.field_b, 31407, var5_int, ol.field_q);
                    hb.field_b = null;
                    ol.field_q = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (3 != var4) {
                  break L3;
                } else {
                  L4: {
                    if (0 == (gh.field_a ^ -1)) {
                      break L4;
                    } else {
                      if (gh.field_a != 0) {
                        gh.field_a = -1;
                        vc.b((byte) -98);
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
                      break L5;
                    }
                  }
                  bi.field_a = false;
                  break L3;
                }
              }
              L6: {
                if (var4 == 4) {
                  L7: {
                    if (!cm.field_e) {
                      break L7;
                    } else {
                      wm.a(-1, jl.b(0));
                      if (var8 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  a.field_b = 10;
                  og.field_N = true;
                  break L6;
                } else {
                  break L6;
                }
              }
              L8: {
                if (5 != var4) {
                  break L8;
                } else {
                  cq.a(jl.b(param0 ^ -2197), false);
                  break L8;
                }
              }
              L9: {
                if (var4 != 6) {
                  break L9;
                } else {
                  if (hh.field_m) {
                    a.field_b = 10;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (-8 == (var4 ^ -1)) {
                  uq.a(jl.b(param0 ^ -2197), 3);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (-9 == (var4 ^ -1)) {
                  wm.a(param0 + 2196, jl.b(0));
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 == 9) {
                  ji.a(8355711, jl.b(0));
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var4 == 10) {
                  ma.field_a.b((byte) -35, 17);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (-12 != (var4 ^ -1)) {
                  break L14;
                } else {
                  em.a(false, jl.b(0));
                  break L14;
                }
              }
              L15: {
                if ((var4 ^ -1) == -13) {
                  ic.a(jl.b(0), qe.b(6958), 49);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (13 == var4) {
                  try {
                    L17: {
                      L18: {
                        if (null != wk.field_I) {
                          break L18;
                        } else {
                          wk.field_I = new mh(pl.field_J, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L18;
                        }
                      }
                      L19: {
                        if (!wk.field_I.b(-90)) {
                          break L19;
                        } else {
                          L20: {
                            L21: {
                              var12 = wk.field_I.a((byte) 21);
                              if (var12 != null) {
                                break L21;
                              } else {
                                var9 = (String) null;
                                ta.b((byte) -110, (String) null);
                                if (var8 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var7 = oe.a(var12.field_j, var12.field_m, false, 0);
                            ta.b((byte) 126, var7);
                            break L20;
                          }
                          wk.field_I = null;
                          break L19;
                        }
                      }
                      break L17;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L22: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      bd.a("S1", (Throwable) ((Object) var5), false);
                      var10 = (String) null;
                      ta.b((byte) -69, (String) null);
                      wk.field_I = null;
                      break L22;
                    }
                  }
                  break L16;
                } else {
                  break L16;
                }
              }
              L23: {
                if ((var4 ^ -1) != -16) {
                  break L23;
                } else {
                  a.field_b = 10;
                  break L23;
                }
              }
              L24: {
                if (param0 == -2197) {
                  break L24;
                } else {
                  this.field_z = false;
                  break L24;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (17 != var4) {
                  return 0;
                } else {
                  return 2;
                }
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

    private final void c(byte param0) {
        wj.field_l[6] = true;
        if (param0 > -35) {
            field_t = false;
        }
    }

    final void b(byte param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        String stackIn_111_0 = null;
        String stackIn_112_0 = null;
        String stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        String stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        String stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        String stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_145_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        String stackOut_110_0 = null;
        String stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        String stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        String stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        String stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        int stackOut_115_3 = 0;
        String stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_144_0 = 0;
        int stackOut_143_0 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          if (ng.field_g == null) {
            break L0;
          } else {
            L1: {
              if (rn.field_f == null) {
                var6 = nn.a(30);
                var4 = var6.getSize();
                ng.field_g.a(var4.width, (byte) -119, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            ng.field_g.b(-12371);
            break L0;
          }
        }
        L2: {
          ik.a(param0 ^ 50);
          hg.h((byte) -126);
          if (vk.l((byte) -126)) {
            break L2;
          } else {
            if (11 != a.field_b) {
              op.c(param0 + -93);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (ll.field_a == null) {
            break L3;
          } else {
            t.field_d = ll.field_a.b(param0 + -216);
            break L3;
          }
        }
        L4: {
          if (!vo.e(1)) {
            break L4;
          } else {
            L5: {
              var3 = wq.a((byte) 63) * 1200;
              if (this.field_z) {
                break L5;
              } else {
                if ((var3 ^ -1) <= (t.b(param0 + -220) ^ -1)) {
                  break L4;
                } else {
                  if (b.a(true) > var3) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            this.field_z = false;
            ak.a((byte) -113);
            ib.a(-107);
            bf.a(true, 2, ei.field_c);
            wp.c(param0 ^ 8287);
            bi.field_a = true;
            dl.field_e = bl.a((byte) 102) - -15000L;
            break L4;
          }
        }
        L6: {
          L7: {
            if ((gh.field_a ^ -1) == 0) {
              break L7;
            } else {
              if (0 == gh.field_a) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (gh.field_a != -1) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L8;
            } else {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_23_0;
            gh.field_a = ua.h(param0 + -104);
            if (var3 == 0) {
              break L9;
            } else {
              if (-1 != (gh.field_a ^ -1)) {
                break L9;
              } else {
                if (11 != a.field_b) {
                  break L9;
                } else {
                  if (gh.a(111)) {
                    break L9;
                  } else {
                    a.b(param0 + -96);
                    break L9;
                  }
                }
              }
            }
          }
          if (-1 == gh.field_a) {
            break L6;
          } else {
            if (0 != gh.field_a) {
              dl.field_e = 15000L + bl.a((byte) 113);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (gh.field_a == -1) {
            break L10;
          } else {
            if (gh.field_a != 0) {
              L11: {
                if (10 > fn.field_i) {
                  break L11;
                } else {
                  if ((a.field_b ^ -1) > -11) {
                    break L10;
                  } else {
                    L12: {
                      L13: {
                        ib.a(-69);
                        if ((gh.field_a ^ -1) == -4) {
                          break L13;
                        } else {
                          L14: {
                            if (-5 == (gh.field_a ^ -1)) {
                              break L14;
                            } else {
                              L15: {
                                if (gh.field_a != 2) {
                                  break L15;
                                } else {
                                  bf.a(true, 256, qq.field_g);
                                  if (var5 == 0) {
                                    break L12;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                if (5 == gh.field_a) {
                                  break L16;
                                } else {
                                  bf.a(true, 256, ko.field_j);
                                  if (var5 == 0) {
                                    break L12;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              bf.a(true, 5, bd.field_a);
                              if (var5 == 0) {
                                break L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                          bf.a(true, 256, wq.field_b);
                          if (var5 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      bf.a(true, 256, sb.field_d);
                      break L12;
                    }
                    bi.field_a = true;
                    if (var5 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              L17: {
                if (-4 == (gh.field_a ^ -1)) {
                  break L17;
                } else {
                  L18: {
                    if (-5 == (gh.field_a ^ -1)) {
                      break L18;
                    } else {
                      L19: {
                        if (gh.field_a != 2) {
                          break L19;
                        } else {
                          this.a(27200, "js5connect_full");
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (5 == gh.field_a) {
                          break L20;
                        } else {
                          this.a(param0 + 27105, "js5connect");
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L20;
                          }
                        }
                      }
                      this.a(27200, "outofdate");
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L18;
                      }
                    }
                  }
                  this.a(27200, "js5io");
                  if (var5 == 0) {
                    break L10;
                  } else {
                    break L17;
                  }
                }
              }
              this.a(27200, "js5crc");
              break L10;
            } else {
              break L10;
            }
          }
        }
        if (param0 == 95) {
          L21: {
            L22: {
              L23: {
                if (0 == (gh.field_a ^ -1)) {
                  break L23;
                } else {
                  if (-1 != (gh.field_a ^ -1)) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
              }
              if (!gh.a(86)) {
                break L21;
              } else {
                break L22;
              }
            }
            if (bl.a((byte) 79) >= dl.field_e) {
              bi.field_a = false;
              if ((gh.field_a ^ -1) == 0) {
                break L21;
              } else {
                if (-1 != (gh.field_a ^ -1)) {
                  gh.field_a = -1;
                  vc.b((byte) -111);
                  break L21;
                } else {
                  break L21;
                }
              }
            } else {
              break L21;
            }
          }
          L24: {
            if (-1 != (gh.field_a ^ -1)) {
              break L24;
            } else {
              if (gh.a(119)) {
                break L24;
              } else {
                eb.field_p = false;
                break L24;
              }
            }
          }
          L25: {
            if (fn.field_i != 0) {
              break L25;
            } else {
              if (c.a((byte) 98)) {
                fn.field_i = 1;
                break L25;
              } else {
                break L25;
              }
            }
          }
          L26: {
            if ((fn.field_i ^ -1) == -2) {
              L27: {
                if ((p.field_e ^ -1) != -1) {
                  cp.field_P = u.a(5, sn.field_Lb);
                  break L27;
                } else {
                  break L27;
                }
              }
              ra.field_l = oj.a(false, h.field_G, 1, -24285, true);
              fe.field_L = oj.a(false, m.field_y, 1, -24285, true);
              wm.field_V = oj.a(false, m.field_z, 1, -24285, true);
              fn.field_i = 2;
              he.field_f = fe.field_L;
              al.field_eb = ra.field_l;
              break L26;
            } else {
              break L26;
            }
          }
          L28: {
            if ((fn.field_i ^ -1) != -3) {
              break L28;
            } else {
              L29: {
                if (cp.field_P == null) {
                  break L29;
                } else {
                  if (cp.field_P.a((byte) -126)) {
                    L30: {
                      if (cp.field_P.a("", 2)) {
                        break L30;
                      } else {
                        cp.field_P = null;
                        if (var5 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    if (cp.field_P.a(false, "")) {
                      ah.a(true, cp.field_P);
                      cp.field_P = null;
                      o.d(26673);
                      break L29;
                    } else {
                      break L29;
                    }
                  } else {
                    break L29;
                  }
                }
              }
              if (null == cp.field_P) {
                fn.field_i = 3;
                break L28;
              } else {
                break L28;
              }
            }
          }
          L31: {
            if (fn.field_i == 3) {
              if (!h.a(fe.field_L, param0 ^ -3795, ra.field_l, wm.field_V)) {
                break L31;
              } else {
                if (!jo.a(wm.field_V, 0)) {
                  break L31;
                } else {
                  L32: {
                    L33: {
                      sc.b(1);
                      lc.a(62);
                      hh.field_m = false;
                      od.field_Bb = hj.field_e;
                      si.a(false, cm.field_e, wm.field_V, ra.field_l, fe.field_L);
                      if (gj.field_f) {
                        break L33;
                      } else {
                        if (null != kj.field_g) {
                          break L33;
                        } else {
                          break L32;
                        }
                      }
                    }
                    L34: {
                      stackOut_110_0 = kj.field_g;
                      stackIn_112_0 = stackOut_110_0;
                      stackIn_111_0 = stackOut_110_0;
                      if (gj.field_f) {
                        stackOut_112_0 = (String) ((Object) stackIn_112_0);
                        stackOut_112_1 = 0;
                        stackIn_113_0 = stackOut_112_0;
                        stackIn_113_1 = stackOut_112_1;
                        break L34;
                      } else {
                        stackOut_111_0 = (String) ((Object) stackIn_111_0);
                        stackOut_111_1 = 1;
                        stackIn_113_0 = stackOut_111_0;
                        stackIn_113_1 = stackOut_111_1;
                        break L34;
                      }
                    }
                    L35: {
                      stackOut_113_0 = (String) ((Object) stackIn_113_0);
                      stackOut_113_1 = stackIn_113_1;
                      stackOut_113_2 = 127;
                      stackIn_115_0 = stackOut_113_0;
                      stackIn_115_1 = stackOut_113_1;
                      stackIn_115_2 = stackOut_113_2;
                      stackIn_114_0 = stackOut_113_0;
                      stackIn_114_1 = stackOut_113_1;
                      stackIn_114_2 = stackOut_113_2;
                      if (gj.field_f) {
                        stackOut_115_0 = (String) ((Object) stackIn_115_0);
                        stackOut_115_1 = stackIn_115_1;
                        stackOut_115_2 = stackIn_115_2;
                        stackOut_115_3 = 0;
                        stackIn_116_0 = stackOut_115_0;
                        stackIn_116_1 = stackOut_115_1;
                        stackIn_116_2 = stackOut_115_2;
                        stackIn_116_3 = stackOut_115_3;
                        break L35;
                      } else {
                        stackOut_114_0 = (String) ((Object) stackIn_114_0);
                        stackOut_114_1 = stackIn_114_1;
                        stackOut_114_2 = stackIn_114_2;
                        stackOut_114_3 = 1;
                        stackIn_116_0 = stackOut_114_0;
                        stackIn_116_1 = stackOut_114_1;
                        stackIn_116_2 = stackOut_114_2;
                        stackIn_116_3 = stackOut_114_3;
                        break L35;
                      }
                    }
                    oi.a(stackIn_116_0, stackIn_116_1 != 0, (byte) stackIn_116_2, stackIn_116_3 != 0);
                    break L32;
                  }
                  L36: {
                    if (!ii.field_e) {
                      break L36;
                    } else {
                      bo.b(4);
                      break L36;
                    }
                  }
                  L37: {
                    if (null == k.field_l) {
                      k.field_l = dg.a(30);
                      c.field_e = vh.h(32);
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  ud.a(-3758, c.field_e, wm.field_V, k.field_l);
                  wm.field_V = null;
                  fe.field_L = null;
                  ra.field_l = null;
                  bk.a((java.applet.Applet) (this), -17708);
                  o.d(26673);
                  fn.field_i = 10;
                  break L31;
                }
              }
            } else {
              break L31;
            }
          }
          L38: {
            if (fn.field_i == 10) {
              L39: {
                if (p.field_e == 0) {
                  break L39;
                } else {
                  qc.field_s = u.a(5, sq.field_R);
                  break L39;
                }
              }
              fn.field_i = 11;
              break L38;
            } else {
              break L38;
            }
          }
          L40: {
            if (11 != fn.field_i) {
              break L40;
            } else {
              L41: {
                if (null == qc.field_s) {
                  break L41;
                } else {
                  L42: {
                    if (!qc.field_s.a((byte) -120)) {
                      break L42;
                    } else {
                      if (qc.field_s.a(param0 + -95)) {
                        break L41;
                      } else {
                        break L42;
                      }
                    }
                  }
                  qm.a(0.0f, 80, jj.a(nh.field_n, (byte) 121, qc.field_s, ud.field_Y));
                  if (var5 == 0) {
                    break L40;
                  } else {
                    break L41;
                  }
                }
              }
              fn.field_i = 12;
              kn.field_f = true;
              break L40;
            }
          }
          L43: {
            if (fn.field_i != 12) {
              break L43;
            } else {
              if (!kn.field_f) {
                fn.field_i = 13;
                break L43;
              } else {
                break L43;
              }
            }
          }
          L44: {
            if (13 != fn.field_i) {
              break L44;
            } else {
              L45: {
                var3 = 1;
                if (null == bg.field_k) {
                  break L45;
                } else {
                  L46: {
                    if (!bg.field_k.a(-94)) {
                      stackOut_144_0 = 0;
                      stackIn_145_0 = stackOut_144_0;
                      break L46;
                    } else {
                      stackOut_143_0 = 1;
                      stackIn_145_0 = stackOut_143_0;
                      break L46;
                    }
                  }
                  var3 = stackIn_145_0;
                  qm.a(bg.field_k.field_d, 80, bg.field_k.field_j);
                  break L45;
                }
              }
              if (var3 == 0) {
                break L44;
              } else {
                fn.field_i = 20;
                break L44;
              }
            }
          }
          L47: {
            if (param1) {
              break L47;
            } else {
              if (hn.field_h) {
                nq.a(95, dk.field_Ib);
                this.f(-58);
                qi.a(100, dk.field_Ib);
                break L47;
              } else {
                break L47;
              }
            }
          }
          L48: {
            if (!wj.field_l[8]) {
              break L48;
            } else {
              wp.a(param0 ^ -10926);
              break L48;
            }
          }
          return;
        } else {
          return;
        }
    }

    protected aq() {
    }

    final int a(boolean param0, int param1) {
        int var3 = -56 / ((6 - param1) / 38);
        return this.a(-2197, true, param0);
    }

    final void p(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= 17) {
          return;
        } else {
          L0: {
            L1: {
              if (!ge.p(-86)) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = this;
                  stackOut_2_1 = -2197;
                  stackOut_2_2 = 0;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  stackIn_3_2 = stackOut_2_2;
                  if (rn.field_f == null) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = stackIn_4_2;
                    stackOut_4_3 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = stackIn_3_1;
                    stackOut_3_2 = stackIn_3_2;
                    stackOut_3_3 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    stackIn_5_3 = stackOut_3_3;
                    break L2;
                  }
                }
                discarded$2 = this.a(stackIn_5_1, stackIn_5_2 != 0, stackIn_5_3 != 0);
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (10 > fn.field_i) {
              break L0;
            } else {
              L3: {
                if (!gb.a(250)) {
                  break L3;
                } else {
                  L4: {
                    if (a.field_b == 0) {
                      break L4;
                    } else {
                      ud.a(t.field_d, 1000);
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  discarded$3 = this.a(-2197, false, false);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              fc.b((byte) -9);
              break L0;
            }
          }
          return;
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        pc discarded$0 = null;
        this.b(true, -7793);
        if (param1 != -27) {
            discarded$0 = aq.a(-38, false, -82, 45);
        }
        if (param5) {
            this.e((byte) 119);
        }
        if (param3) {
            this.l(-105);
        }
        if (!(!param2)) {
            this.d((byte) 40);
        }
        if (param4) {
            this.q(param1 + 154);
        }
        if (param0) {
            this.c((byte) -128);
        }
        if (!(!param6)) {
            this.n(param1 ^ 26830);
        }
    }

    final int m(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = this.i(13546);
            if (var2 == 0) {
              break L1;
            } else {
              if (1 != var2) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!wj.field_l[1]) {
              break L2;
            } else {
              dp.a((byte) 80, 2);
              break L2;
            }
          }
          L3: {
            if (!wj.field_l[2]) {
              break L3;
            } else {
              uq.a(3, -79);
              break L3;
            }
          }
          L4: {
            if (!wj.field_l[3]) {
              break L4;
            } else {
              km.a(4, (byte) 73);
              break L4;
            }
          }
          L5: {
            if (!wj.field_l[4]) {
              break L5;
            } else {
              gl.b(true, 5);
              break L5;
            }
          }
          L6: {
            if (wj.field_l[5]) {
              fe.a((byte) -121, 6);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!wj.field_l[6]) {
              break L7;
            } else {
              ff.a((byte) 126, 7);
              break L7;
            }
          }
          if (wj.field_l[8]) {
            of.b((byte) 105);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 10) {
          return 98;
        } else {
          return var2;
        }
    }

    static {
        field_r = "Previous";
        field_n = "Please select options in the following rows:  ";
        field_l = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_t = false;
        field_B = new hh(1);
    }
}
