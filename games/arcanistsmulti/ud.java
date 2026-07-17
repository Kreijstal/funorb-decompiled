/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ud extends dc {
    private int field_m;
    static int[][] field_z;
    static int[] field_p;
    static String field_u;
    private int field_n;
    private long field_v;
    static int field_w;
    static String field_o;
    static String field_r;
    private int field_C;
    private int field_B;
    static long field_E;
    private boolean field_A;
    String field_q;
    static eg field_D;
    static String field_y;
    private int field_l;
    private boolean field_s;
    private int field_x;
    private boolean field_t;

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ud) this).setBackground(java.awt.Color.black);
        gm.field_f = ((ud) this).field_n;
        nh.a(false, gm.field_f);
        na.a(((ud) this).field_B, param2, ((ud) this).field_l, 0, ((ud) this).field_s, ((ud) this).field_q, param4, ((ud) this).field_x, gm.field_f, 5000, ((ud) this).field_v, ((ud) this).field_C, fi.field_d, param0);
        ve.a((byte) -81, gm.field_f, ((ud) this).field_C, ((ud) this).field_x, fi.field_d, param2, ((ud) this).field_B, ((ud) this).field_l, ((ud) this).field_q);
        ag.a((byte) -60);
        nh.field_w = qj.a((byte) -86);
        n.a(on.field_c, (byte) 122);
        sa.field_Bb = param6;
        u.field_g = param1;
        dm.field_H = param7;
        ce.field_n = param5;
        cj.field_d = param3;
        this.k(param4 ^ 5016);
        kn.g(false);
    }

    private final void l(int param0) {
        cc.field_d[1] = true;
        if (param0 > -72) {
            ((ud) this).field_n = -27;
        }
    }

    private final void c(int param0) {
        cc.field_d[6] = true;
    }

    public static void d(boolean param0) {
        field_u = null;
        field_D = null;
        field_o = null;
        field_r = null;
        field_y = null;
        field_p = null;
        field_z = null;
    }

    private final void j(int param0) {
        int var2 = 9 / ((56 - param0) / 58);
        cc.field_d[4] = true;
    }

    final int b(boolean param0, boolean param1) {
        if (!param1) {
            Object var4 = null;
            ((ud) this).a(119, (String) null, 12, (byte) -85, -59);
        }
        return this.a(false, true, param0);
    }

    final void a(int param0, String param1, int param2, byte param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        String var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          try {
            L0: {
              if (((ud) this).a((byte) -71)) {
                L1: {
                  L2: {
                    ((ud) this).field_q = ((ud) this).getCodeBase().getHost();
                    var11 = ((ud) this).field_q.toLowerCase();
                    stackOut_2_0 = this;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var11.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (!var11.endsWith(".jagex.com")) {
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
                  ((ud) this).field_t = stackIn_7_1 != 0;
                  ((ud) this).field_C = Integer.parseInt(((ud) this).getParameter("gameport1"));
                  ((ud) this).field_x = Integer.parseInt(((ud) this).getParameter("gameport2"));
                  var7 = ((ud) this).getParameter("servernum");
                  if (var7 != null) {
                    ((ud) this).field_l = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((ud) this).field_B = Integer.parseInt(((ud) this).getParameter("gamecrc"));
                  ((ud) this).field_v = Long.parseLong(((ud) this).getParameter("instanceid"));
                  ((ud) this).field_s = ((ud) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((ud) this).getParameter("lang");
                  if (var8 != null) {
                    ((ud) this).field_n = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param3 <= -65) {
                    break L5;
                  } else {
                    ((ud) this).field_l = 7;
                    break L5;
                  }
                }
                L6: {
                  if (((ud) this).field_n < 5) {
                    break L6;
                  } else {
                    ((ud) this).field_n = 0;
                    break L6;
                  }
                }
                L7: {
                  var9 = ((ud) this).getParameter("affid");
                  if (var9 != null) {
                    ((ud) this).field_m = Integer.parseInt(var9);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                wa.field_Nb = Boolean.valueOf(((ud) this).getParameter("simplemode")).booleanValue();
                ((ud) this).a(32, param0, param1, 11431, ((ud) this).field_B, param2, param4);
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L8: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              jh.a((Throwable) (Object) var6, (String) null, (byte) 20);
              ((ud) this).a("crash", (byte) -125);
              break L8;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6_ref;
            stackOut_24_1 = new StringBuilder().append("ud.P(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Boolean var10 = null;
            wk var11 = null;
            int stackIn_24_0 = 0;
            String stackIn_66_0 = null;
            String stackIn_67_0 = null;
            String stackIn_68_0 = null;
            int stackIn_68_1 = 0;
            Object stackIn_70_0 = null;
            Object stackIn_71_0 = null;
            Object stackIn_72_0 = null;
            int stackIn_72_1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_23_0 = 0;
            int stackOut_22_0 = 0;
            Object stackOut_69_0 = null;
            Object stackOut_71_0 = null;
            int stackOut_71_1 = 0;
            Object stackOut_70_0 = null;
            int stackOut_70_1 = 0;
            String stackOut_65_0 = null;
            String stackOut_67_0 = null;
            int stackOut_67_1 = 0;
            String stackOut_66_0 = null;
            int stackOut_66_1 = 0;
            var8 = ArcanistsMulti.field_G ? 1 : 0;
            var4 = tg.a(wn.field_y, param2, gm.field_f, 17);
            if (var4 != 0) {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    var5_int = e.a(nl.f((byte) 13), -67, h.g((byte) 126));
                    if (var5_int != -1) {
                      fl.a(20657, me.field_E, ul.field_M, var5_int);
                      ul.field_M = null;
                      me.field_E = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var10 = dm.f(18727);
                  if (var10 != null) {
                    wh.a((byte) 117, var10.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 == 2) {
                  var5_int = tk.a(ho.a((byte) 93), jd.b(-94), ed.k(-952), hc.b((byte) -107), ((ud) this).field_m, k.a(0), (byte) -110);
                  if (var5_int == -1) {
                    break L2;
                  } else {
                    pn.a(ul.field_M, var5_int, -42, me.field_E);
                    me.field_E = null;
                    ul.field_M = null;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (3 != var4) {
                  break L3;
                } else {
                  L4: {
                    if (u.field_b == -1) {
                      break L4;
                    } else {
                      if (u.field_b == 0) {
                        break L4;
                      } else {
                        u.field_b = -1;
                        o.a((byte) -34);
                        break L4;
                      }
                    }
                  }
                  if (param1) {
                    kg.field_f = false;
                    break L3;
                  } else {
                    L5: {
                      var5_int = wn.a(((ud) this).field_m, 57, ((ud) this).field_t, ed.k(-952), false, hc.b((byte) -108));
                      if (-1 == var5_int) {
                        break L5;
                      } else {
                        if (var5_int != 0) {
                          L6: {
                            if (param0) {
                              stackOut_23_0 = 0;
                              stackIn_24_0 = stackOut_23_0;
                              break L6;
                            } else {
                              stackOut_22_0 = 1;
                              stackIn_24_0 = stackOut_22_0;
                              break L6;
                            }
                          }
                          oa.a(stackIn_24_0 != 0, var5_int, me.field_E);
                          me.field_E = null;
                          break L5;
                        } else {
                          vg.field_K = fk.field_k;
                          ArcanistsMulti.j((byte) 48);
                          qe.field_p = false;
                          fj.field_j = 10;
                          break L3;
                        }
                      }
                    }
                    break L3;
                  }
                }
              }
              L7: {
                if (var4 == 4) {
                  if (!lk.field_d) {
                    qe.field_p = true;
                    fj.field_j = 10;
                    break L7;
                  } else {
                    gh.a(2, cd.e(120));
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (5 == var4) {
                  im.a((byte) 125, cd.e(121));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (6 == var4) {
                  if (lh.field_n) {
                    fj.field_j = 10;
                    break L9;
                  } else {
                    break L9;
                  }
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 == 7) {
                  hc.a(cd.e(116), 27901);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 == 8) {
                  gh.a(2, cd.e(118));
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 == 9) {
                  g.a(cd.e(122), -10400);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (10 != var4) {
                  break L13;
                } else {
                  he.field_e.b((byte) -68, 17);
                  break L13;
                }
              }
              L14: {
                if (var4 == 11) {
                  mc.a(30449, cd.e(122));
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var4 == 12) {
                  fk.a(cd.e(116), false, tl.b((byte) 121));
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (var4 == 13) {
                  try {
                    L17: {
                      L18: {
                        if (nf.field_P == null) {
                          nf.field_P = new hn(fi.field_d, new java.net.URL(((ud) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (nf.field_P.c(-91)) {
                          L20: {
                            var11 = nf.field_P.b(21496);
                            if (var11 == null) {
                              L21: {
                                stackOut_69_0 = null;
                                stackIn_71_0 = stackOut_69_0;
                                stackIn_70_0 = stackOut_69_0;
                                if (param0) {
                                  stackOut_71_0 = stackIn_71_0;
                                  stackOut_71_1 = 0;
                                  stackIn_72_0 = stackOut_71_0;
                                  stackIn_72_1 = stackOut_71_1;
                                  break L21;
                                } else {
                                  stackOut_70_0 = stackIn_70_0;
                                  stackOut_70_1 = 1;
                                  stackIn_72_0 = stackOut_70_0;
                                  stackIn_72_1 = stackOut_70_1;
                                  break L21;
                                }
                              }
                              bc.a((String) (Object) stackIn_72_0, stackIn_72_1 != 0);
                              break L20;
                            } else {
                              L22: {
                                var7 = ba.a(0, var11.field_g, (byte) -123, var11.field_j);
                                stackOut_65_0 = (String) var7;
                                stackIn_67_0 = stackOut_65_0;
                                stackIn_66_0 = stackOut_65_0;
                                if (param0) {
                                  stackOut_67_0 = (String) (Object) stackIn_67_0;
                                  stackOut_67_1 = 0;
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  break L22;
                                } else {
                                  stackOut_66_0 = (String) (Object) stackIn_66_0;
                                  stackOut_66_1 = 1;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_68_1 = stackOut_66_1;
                                  break L22;
                                }
                              }
                              bc.a(stackIn_68_0, stackIn_68_1 != 0);
                              break L20;
                            }
                          }
                          nf.field_P = null;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      break L17;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L23: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      jh.a((Throwable) (Object) var5, "S1", (byte) 20);
                      var9 = null;
                      bc.a((String) null, true);
                      nf.field_P = null;
                      break L23;
                    }
                  }
                  break L16;
                } else {
                  break L16;
                }
              }
              if (!param0) {
                L24: {
                  if (15 != var4) {
                    break L24;
                  } else {
                    fj.field_j = 10;
                    break L24;
                  }
                }
                if (var4 == 16) {
                  return 1;
                } else {
                  if (17 == var4) {
                    return 2;
                  } else {
                    return 0;
                  }
                }
              } else {
                return 118;
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

    final void d(int param0) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 >= -87) {
            ((ud) this).field_l = 90;
        }
        if (ue.a(122)) {
            int discarded$1 = this.a(false, false, ka.field_m != null ? true : false);
        } else {
            if (ih.field_f >= 10) {
                if (!rl.d(true)) {
                    wm.g((byte) 27);
                } else {
                    if (0 != fj.field_j) {
                        ia.a(-14296, wn.field_y);
                    } else {
                        int discarded$2 = this.a(false, false, false);
                    }
                }
            }
        }
    }

    private final void g(byte param0) {
        cc.field_d[13] = true;
        cc.field_d[12] = true;
        cc.field_d[11] = true;
    }

    final int e(int param0) {
        int var2 = 0;
        if (((ud) this).field_d) {
          return -1;
        } else {
          if (!ka.c((byte) -44)) {
            return -1;
          } else {
            if (!kg.field_f) {
              var2 = wn.a(((ud) this).field_m, 85, ((ud) this).field_t, ed.k(-952), true, hc.b((byte) -112));
              if (var2 == -1) {
                return -1;
              } else {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (1 != var2) {
                      L1: {
                        if (!oj.field_h) {
                          ((ud) this).a("reconnect", (byte) -117);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L2: {
                        fk.d(-11);
                        if (param0 >= 70) {
                          break L2;
                        } else {
                          this.j(92);
                          break L2;
                        }
                      }
                      oa.a(true, var2, me.field_E);
                      kg.field_f = true;
                      tn.field_Hb = qj.b(-26572) + 15000L;
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L3: {
                  if (fj.field_j != 11) {
                    break L3;
                  } else {
                    if (u.field_b != 0) {
                      break L3;
                    } else {
                      ArcanistsMulti.j((byte) 48);
                      break L3;
                    }
                  }
                }
                return var2;
              }
            } else {
              return -1;
            }
          }
        }
    }

    private final void k(int param0) {
        di.field_n[8] = -2;
        di.field_n[12] = -1;
        di.field_n[13] = -1;
        di.field_n[18] = 1;
        di.field_n[10] = -1;
        di.field_n[17] = -1;
        di.field_n[3] = -1;
        di.field_n[2] = -2;
        di.field_n[5] = -1;
        di.field_n[param0] = -1;
        di.field_n[11] = -1;
        di.field_n[6] = -2;
        di.field_n[4] = -1;
        di.field_n[1] = 16;
        di.field_n[9] = -1;
        di.field_n[7] = -1;
    }

    private final void b(boolean param0, int param1) {
        cc.field_d[7] = true;
        cc.field_d[17] = true;
        cc.field_d[18] = true;
        cc.field_d[8] = param0;
        cc.field_d[16] = true;
        cc.field_d[3] = true;
        cc.field_d[0] = true;
    }

    private final void f(int param0) {
        String var2 = qj.a(10040319);
        um.a(var2, cd.e(105), 13680);
    }

    final void g(int param0) {
        int var2 = 0;
        jg var3 = null;
        int var4 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = on.field_g;
          if (var2 >= 64) {
            break L0;
          } else {
            if (!cc.field_d[var2]) {
              break L0;
            } else {
              L1: {
                if (param0 <= -3) {
                  break L1;
                } else {
                  ((ud) this).a(true, true);
                  break L1;
                }
              }
              if (var2 == 0) {
                return;
              } else {
                L2: {
                  if (var2 != 1) {
                    if (var2 != 2) {
                      if (var2 == 3) {
                        fk.a((byte) -20);
                        break L2;
                      } else {
                        if (4 == var2) {
                          om.g((byte) 29);
                          break L2;
                        } else {
                          if (var2 == 5) {
                            rb.c(-54);
                            break L2;
                          } else {
                            if (6 == var2) {
                              pg.b(-112);
                              break L2;
                            } else {
                              if (var2 == 7) {
                                this.f(-18075);
                                break L2;
                              } else {
                                if (var2 == 8) {
                                  qe.a(fi.field_d, fj.field_h, (wk) (Object) df.field_z, 0);
                                  break L2;
                                } else {
                                  if (var2 != 16) {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (var2 == 12) {
                                          break L3;
                                        } else {
                                          if (13 != var2) {
                                            if (var2 == 17) {
                                              this.c(false);
                                              break L2;
                                            } else {
                                              if (var2 == 18) {
                                                hf.c(105);
                                                break L2;
                                              } else {
                                                jh.a((Throwable) null, "MGS1: " + nn.g((byte) -25), (byte) 20);
                                                ka.b(false);
                                                break L2;
                                              }
                                            }
                                          } else {
                                            nh.i((byte) 46);
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if (var2 != 12) {
                                        stackOut_30_0 = 0;
                                        stackIn_31_0 = stackOut_30_0;
                                        break L4;
                                      } else {
                                        stackOut_29_0 = 1;
                                        stackIn_31_0 = stackOut_29_0;
                                        break L4;
                                      }
                                    }
                                    var3 = wl.a(stackIn_31_0 != 0, 86);
                                    ql.a(var3, (byte) 111);
                                    break L2;
                                  } else {
                                    ql.a(true);
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      df.d(false);
                      break L2;
                    }
                  } else {
                    eh.b((byte) -128);
                    break L2;
                  }
                }
                return;
              }
            }
          }
        }
        jh.a((Throwable) null, "MGS2: " + nn.g((byte) -25), (byte) 20);
        ka.b(false);
    }

    private final void h(int param0) {
        cc.field_d[2] = true;
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        String stackIn_102_1 = null;
        int stackIn_103_0 = 0;
        String stackIn_103_1 = null;
        int stackIn_104_0 = 0;
        String stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        int stackIn_133_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_101_0 = 0;
        String stackOut_101_1 = null;
        int stackOut_103_0 = 0;
        String stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        int stackOut_102_0 = 0;
        String stackOut_102_1 = null;
        int stackOut_102_2 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if (ob.field_Y == null) {
            break L0;
          } else {
            L1: {
              if (ka.field_m == null) {
                var6 = qe.a(-4);
                var4 = var6.getSize();
                ob.field_Y.a(var4.height, var4.width, true);
                break L1;
              } else {
                break L1;
              }
            }
            ob.field_Y.a((byte) 93);
            break L0;
          }
        }
        L2: {
          j.a(24);
          vm.a(0);
          if (oc.a(-15576)) {
            break L2;
          } else {
            if (fj.field_j != 11) {
              i.a(0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null == nh.field_w) {
            break L3;
          } else {
            wn.field_y = nh.field_w.a(-1);
            break L3;
          }
        }
        L4: {
          if (td.a(-97)) {
            L5: {
              var3 = gm.b(-2) * 1200;
              if (((ud) this).field_A) {
                break L5;
              } else {
                if (be.a(1497225488) <= var3) {
                  break L4;
                } else {
                  if (ao.a(true) > var3) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ((ud) this).field_A = false;
            ka.b(false);
            fk.d(-11);
            oa.a(true, 2, rl.field_j);
            hm.b(0);
            kg.field_f = true;
            tn.field_Hb = 15000L + qj.b(-26572);
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (u.field_b == -1) {
              break L7;
            } else {
              if (u.field_b != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (u.field_b != -1) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_24_0;
            u.field_b = si.a((byte) 116);
            if (var3 == 0) {
              break L9;
            } else {
              if (u.field_b != 0) {
                break L9;
              } else {
                if (11 != fj.field_j) {
                  break L9;
                } else {
                  if (ka.c((byte) -44)) {
                    break L9;
                  } else {
                    ArcanistsMulti.j((byte) 48);
                    break L9;
                  }
                }
              }
            }
          }
          if (u.field_b == -1) {
            break L6;
          } else {
            if (u.field_b == 0) {
              break L6;
            } else {
              tn.field_Hb = qj.b(-26572) + 15000L;
              break L6;
            }
          }
        }
        L10: {
          if (u.field_b == -1) {
            break L10;
          } else {
            if (u.field_b == 0) {
              break L10;
            } else {
              if (ih.field_f < 10) {
                if (3 == u.field_b) {
                  ((ud) this).a("js5crc", (byte) -128);
                  break L10;
                } else {
                  if (u.field_b == 4) {
                    ((ud) this).a("js5io", (byte) -128);
                    break L10;
                  } else {
                    if (u.field_b == 2) {
                      ((ud) this).a("js5connect_full", (byte) -126);
                      break L10;
                    } else {
                      if (5 == u.field_b) {
                        ((ud) this).a("outofdate", (byte) -117);
                        break L10;
                      } else {
                        ((ud) this).a("js5connect", (byte) -126);
                        break L10;
                      }
                    }
                  }
                }
              } else {
                if (fj.field_j < 10) {
                  break L10;
                } else {
                  L11: {
                    fk.d(-11);
                    if (u.field_b != 3) {
                      if (u.field_b == 4) {
                        oa.a(true, 256, le.field_N);
                        break L11;
                      } else {
                        if (u.field_b == 2) {
                          oa.a(true, 256, ib.field_p);
                          break L11;
                        } else {
                          if (u.field_b != 5) {
                            oa.a(true, 256, dd.field_a);
                            break L11;
                          } else {
                            oa.a(true, 5, s.field_d);
                            break L11;
                          }
                        }
                      }
                    } else {
                      oa.a(param0, 256, hn.field_e);
                      break L11;
                    }
                  }
                  kg.field_f = true;
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (u.field_b == -1) {
                break L14;
              } else {
                if (u.field_b != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (ka.c((byte) -44)) {
              break L13;
            } else {
              break L12;
            }
          }
          if (~qj.b(-26572) <= ~tn.field_Hb) {
            kg.field_f = false;
            if (u.field_b == -1) {
              break L12;
            } else {
              if (0 != u.field_b) {
                u.field_b = -1;
                o.a((byte) -34);
                break L12;
              } else {
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (u.field_b != 0) {
            break L15;
          } else {
            if (ka.c((byte) -44)) {
              break L15;
            } else {
              ii.field_f = false;
              break L15;
            }
          }
        }
        L16: {
          if (ih.field_f == 0) {
            if (!hg.b(0)) {
              break L16;
            } else {
              ih.field_f = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (param0) {
            break L17;
          } else {
            field_p = null;
            break L17;
          }
        }
        L18: {
          if (1 == ih.field_f) {
            L19: {
              if (gm.field_f == 0) {
                break L19;
              } else {
                lh.field_g = sd.a(ce.field_n, (byte) 65);
                break L19;
              }
            }
            da.field_b = v.a((byte) -93, false, true, cj.field_d, 1);
            ea.field_C = v.a((byte) -93, false, true, dm.field_H, 1);
            ho.field_g = v.a((byte) -93, false, true, u.field_g, 1);
            field_D = ea.field_C;
            ih.field_f = 2;
            rc.field_a = da.field_b;
            break L18;
          } else {
            break L18;
          }
        }
        L20: {
          if (ih.field_f == 2) {
            L21: {
              if (lh.field_g == null) {
                break L21;
              } else {
                if (!lh.field_g.c(-10923)) {
                  break L21;
                } else {
                  if (!lh.field_g.a(true, "")) {
                    lh.field_g = null;
                    break L21;
                  } else {
                    if (lh.field_g.a("", -24417)) {
                      on.a((byte) -84, lh.field_g);
                      lh.field_g = null;
                      bk.a(2);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
              }
            }
            if (null != lh.field_g) {
              break L20;
            } else {
              ih.field_f = 3;
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if (ih.field_f != 3) {
            break L22;
          } else {
            if (!vn.a(ho.field_g, param0, ea.field_C, da.field_b)) {
              break L22;
            } else {
              if (eh.a(18306, ho.field_g)) {
                L23: {
                  L24: {
                    rk.f(-73);
                    cj.b(-128);
                    kl.field_C = hn.field_l;
                    lh.field_n = false;
                    th.a(da.field_b, ho.field_g, ea.field_C, (byte) -40, lk.field_d);
                    if (af.field_Ib) {
                      break L24;
                    } else {
                      if (null != ul.field_y) {
                        break L24;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L25: {
                    if (af.field_Ib) {
                      stackOut_100_0 = 0;
                      stackIn_101_0 = stackOut_100_0;
                      break L25;
                    } else {
                      stackOut_99_0 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_101_0 = stackIn_101_0;
                    stackOut_101_1 = ul.field_y;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    stackIn_102_0 = stackOut_101_0;
                    stackIn_102_1 = stackOut_101_1;
                    if (af.field_Ib) {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = (String) (Object) stackIn_103_1;
                      stackOut_103_2 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      stackIn_104_2 = stackOut_103_2;
                      break L26;
                    } else {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = (String) (Object) stackIn_102_1;
                      stackOut_102_2 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      stackIn_104_2 = stackOut_102_2;
                      break L26;
                    }
                  }
                  j.a(stackIn_104_0 != 0, stackIn_104_1, stackIn_104_2 != 0, false);
                  break L23;
                }
                L27: {
                  if (!wa.field_Nb) {
                    break L27;
                  } else {
                    oo.g(4);
                    break L27;
                  }
                }
                L28: {
                  if (null == gk.field_k) {
                    gk.field_k = ld.a(false);
                    mb.field_P = sc.h((byte) -34);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                ug.a(mb.field_P, gk.field_k, ho.field_g, 121);
                ho.field_g = null;
                ea.field_C = null;
                da.field_b = null;
                ArcanistsMulti.a((java.applet.Applet) this, -1);
                bk.a(2);
                ih.field_f = 10;
                break L22;
              } else {
                break L22;
              }
            }
          }
        }
        L29: {
          if (ih.field_f != 10) {
            break L29;
          } else {
            L30: {
              if (gm.field_f == 0) {
                break L30;
              } else {
                va.field_c = sd.a(sa.field_Bb, (byte) 94);
                break L30;
              }
            }
            ih.field_f = 11;
            break L29;
          }
        }
        L31: {
          if (ih.field_f != 11) {
            break L31;
          } else {
            L32: {
              if (null == va.field_c) {
                break L32;
              } else {
                L33: {
                  if (!va.field_c.c(-10923)) {
                    break L33;
                  } else {
                    if (va.field_c.a(-49)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                rb.a(qe.a(ld.field_o, 87, va.field_c, vn.field_f), false, 0.0f);
                break L31;
              }
            }
            ja.field_y = true;
            ih.field_f = 12;
            break L31;
          }
        }
        L34: {
          if (ih.field_f == 12) {
            if (!ja.field_y) {
              ih.field_f = 13;
              break L34;
            } else {
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if (ih.field_f != 13) {
            break L35;
          } else {
            L36: {
              var3 = 1;
              if (pm.field_h != null) {
                L37: {
                  if (!pm.field_h.d(93)) {
                    stackOut_132_0 = 0;
                    stackIn_133_0 = stackOut_132_0;
                    break L37;
                  } else {
                    stackOut_131_0 = 1;
                    stackIn_133_0 = stackOut_131_0;
                    break L37;
                  }
                }
                var3 = stackIn_133_0;
                rb.a(pm.field_h.field_j, false, pm.field_h.field_b);
                break L36;
              } else {
                break L36;
              }
            }
            if (var3 == 0) {
              break L35;
            } else {
              ih.field_f = 20;
              break L35;
            }
          }
        }
        L38: {
          if (param1) {
            break L38;
          } else {
            if (jm.field_j) {
              qm.a(on.field_c, (byte) 117);
              ((ud) this).a(-11232);
              n.a(on.field_c, (byte) 125);
              break L38;
            } else {
              break L38;
            }
          }
        }
        L39: {
          if (cc.field_d[8]) {
            im.c(-99);
            break L39;
          } else {
            break L39;
          }
        }
    }

    private final void c(boolean param0) {
        int var2 = df.field_z.e((byte) 97);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + fj.field_h;
        byte[] var5 = new byte[var4];
        df.field_z.a(var5, (byte) 108, 0, var4);
        jh.a(sc.a((byte) 113, var5), cd.e(127), var3 != 0, (byte) -116);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, byte param5, boolean param6) {
        int var8 = -88 % ((param5 - 66) / 60);
        this.b(true, 51);
        if (!(!param2)) {
            this.l(-86);
        }
        if (param6) {
            this.h(-89);
        }
        if (!(!param0)) {
            this.j(115);
        }
        if (!(!param4)) {
            this.i(6);
        }
        if (param1) {
            this.c(101);
        }
        if (!(!param3)) {
            this.g((byte) 97);
        }
    }

    private final void i(int param0) {
        cc.field_d[5] = true;
    }

    protected ud() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 72;
        field_o = "Please log in to access this feature.";
        field_u = "Quick Start:";
        field_r = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_z = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_y = "Month";
        field_p = new int[8192];
    }
}
