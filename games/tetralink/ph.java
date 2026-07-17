/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ph extends bg {
    static boolean field_s;
    static String field_A;
    private int field_q;
    private boolean field_H;
    private int field_B;
    private int field_u;
    private boolean field_o;
    private int field_p;
    String field_y;
    private int field_G;
    private boolean field_r;
    private int field_v;
    private long field_E;
    static je field_F;
    static int field_z;
    static String field_D;
    static rb field_t;
    static String field_w;
    static String field_x;
    static String[] field_C;

    private final void a(int param0, String param1, int param2, int param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        String var11 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          try {
            L0: {
              if (!((ph) this).a((byte) -128)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((ph) this).field_y = ((ph) this).getCodeBase().getHost();
                    var11 = ((ph) this).field_y.toLowerCase();
                    stackOut_3_0 = this;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var11.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackIn_7_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (!var11.endsWith(".jagex.com")) {
                        stackOut_7_0 = this;
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L1;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L1;
                }
                L3: {
                  ((ph) this).field_r = stackIn_8_1 != 0;
                  ((ph) this).field_v = Integer.parseInt(((ph) this).getParameter("gameport1"));
                  ((ph) this).field_G = Integer.parseInt(((ph) this).getParameter("gameport2"));
                  var7 = ((ph) this).getParameter("servernum");
                  if (var7 == null) {
                    break L3;
                  } else {
                    ((ph) this).field_B = Integer.parseInt(var7);
                    break L3;
                  }
                }
                L4: {
                  ((ph) this).field_q = Integer.parseInt(((ph) this).getParameter("gamecrc"));
                  ((ph) this).field_E = Long.parseLong(((ph) this).getParameter("instanceid"));
                  ((ph) this).field_H = ((ph) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((ph) this).getParameter("lang");
                  if (var8 != null) {
                    ((ph) this).field_u = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((ph) this).field_u < 5) {
                    break L5;
                  } else {
                    ((ph) this).field_u = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((ph) this).getParameter("affid");
                  if (var9 != null) {
                    ((ph) this).field_p = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                i.field_w = Boolean.valueOf(((ph) this).getParameter("simplemode")).booleanValue();
                ((ph) this).a(param3, (byte) 124, param1, param0, 32, param2, ((ph) this).field_q);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              fk.a(-95, (Throwable) (Object) var6, (String) null);
              ((ph) this).a(24044, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6_ref;
            stackOut_22_1 = new StringBuilder().append("ph.T(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param2 + 44 + param3 + 44 + 124 + 41);
        }
    }

    private final void b(boolean param0) {
        int var2 = kb.field_q.d((byte) -99);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = rl.field_d + -1;
        byte[] var5 = new byte[var4];
        kb.field_q.a(116, var5, 0, var4);
        oi.a((byte) -60, ud.a(var5, -107), var3 != 0, lk.q(13));
    }

    final void a(String param0, int param1, int param2) {
        try {
            this.a(param1, param0, 480, param2, 124);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ph.CA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void c(boolean param0) {
        hc.field_u[2] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, byte param6) {
        this.c(param6 + 24, true);
        if (param2) {
            this.k(-7);
        }
        if (param6 != -6) {
            this.i(-86);
        }
        if (param4) {
            this.c(true);
        }
        if (param5) {
            this.j(29668);
        }
        if (!(!param0)) {
            this.e(true);
        }
        if (param3) {
            this.m(27840);
        }
        if (!(!param1)) {
            this.d((byte) 30);
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ph) this).setBackground(java.awt.Color.black);
        th.field_l = ((ph) this).field_u;
        wa.a(th.field_l, true);
        t.a(((ph) this).field_H, nd.field_Pb, ((ph) this).field_E, th.field_l, 5000, ((ph) this).field_G, ((ph) this).field_B, 5000, ((ph) this).field_v, (byte) 118, param0, ((ph) this).field_y, param4, ((ph) this).field_q);
        gi.a(((ph) this).field_B, ((ph) this).field_q, 1, th.field_l, nd.field_Pb, ((ph) this).field_v, ((ph) this).field_y, ((ph) this).field_G, param0);
        wd.a(false);
        qf.field_k = ed.e((byte) 124);
        da.a((byte) -70, uh.field_b);
        jg.field_a = param1;
        kd.field_l = param7;
        il.field_R = param2;
        fl.field_g = param6;
        ai.field_b = param5;
        this.l(-6848);
        l.a(param3 ^ param3);
    }

    private final void d(byte param0) {
        hc.field_u[11] = true;
        int var2 = 22;
        hc.field_u[13] = true;
        hc.field_u[12] = true;
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            int var5 = 0;
            Exception var6 = null;
            bh var7 = null;
            String var8 = null;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            Boolean var12 = null;
            Throwable decompiledCaughtException = null;
            var9 = TetraLink.field_J;
            var4 = wk.a(15658734, param1, hc.field_p, th.field_l);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (1 == var4) {
                  L1: {
                    var5 = a.a(cf.a(113), fl.e(1), (byte) -62);
                    if (var5 != -1) {
                      g.a(og.field_h, tg.field_d, var5, (byte) 3);
                      tg.field_d = null;
                      og.field_h = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var12 = gh.a((byte) 116);
                  if (var12 == null) {
                    break L0;
                  } else {
                    ec.a(var12.booleanValue(), 124);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (var4 != 2) {
                  break L2;
                } else {
                  var5 = nd.a(((ph) this).field_p, rb.c(false), sa.a((byte) -68), i.e(122), ka.c((byte) -114), qa.c((byte) -97), -8769);
                  if (var5 != -1) {
                    ki.a(var5, tg.field_d, og.field_h, -106);
                    tg.field_d = null;
                    og.field_h = null;
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
                    if (a.field_h == -1) {
                      break L4;
                    } else {
                      if (a.field_h == 0) {
                        break L4;
                      } else {
                        a.field_h = -1;
                        ml.o(0);
                        break L4;
                      }
                    }
                  }
                  if (param2) {
                    jm.field_b = false;
                    break L3;
                  } else {
                    var5 = hn.a(((ph) this).field_r, ka.c((byte) 22), -2472, false, ((ph) this).field_p, sa.a((byte) -107));
                    if (var5 == -1) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        kk.field_U = ua.field_g;
                        bk.a(1);
                        bh.field_r = false;
                        fn.field_R = 10;
                        break L3;
                      } else {
                        fi.a(tg.field_d, var5, (byte) 20);
                        tg.field_d = null;
                        break L3;
                      }
                    }
                  }
                }
              }
              L5: {
                if (var4 == 4) {
                  if (pg.field_m) {
                    ia.a(lk.q(13), false);
                    break L5;
                  } else {
                    fn.field_R = 10;
                    bh.field_r = true;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 == 5) {
                  ma.a(lk.q(13), (byte) 34);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 != 6) {
                  break L7;
                } else {
                  if (k.field_c) {
                    fn.field_R = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (var4 == 7) {
                  jd.a(lk.q(13), (byte) -126);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                var5 = 77 / ((81 - param0) / 34);
                if (var4 == 8) {
                  ia.a(lk.q(13), false);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 == 9) {
                  el.a(16, lk.q(13));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  nd.field_Lb.f(17, (byte) -92);
                  break L11;
                }
              }
              L12: {
                if (11 != var4) {
                  break L12;
                } else {
                  in.a(lk.q(13), 63);
                  break L12;
                }
              }
              L13: {
                if (12 != var4) {
                  break L13;
                } else {
                  ha.a(-119, sn.b(11137), lk.q(13));
                  break L13;
                }
              }
              L14: {
                if (var4 != 13) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (null == af.field_g) {
                          af.field_g = new un(nd.field_Pb, new java.net.URL(((ph) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (af.field_g.b((byte) -75)) {
                          L18: {
                            var7 = af.field_g.a((byte) 79);
                            if (var7 != null) {
                              var8 = cl.a(-1095, var7.field_t, var7.field_u, 0);
                              ci.a(var8, -14710);
                              break L18;
                            } else {
                              var10 = null;
                              ci.a((String) null, -14710);
                              break L18;
                            }
                          }
                          af.field_g = null;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      fk.a(-54, (Throwable) (Object) var6, "S1");
                      var11 = null;
                      ci.a((String) null, -14710);
                      af.field_g = null;
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
                  fn.field_R = 10;
                  break L20;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (var4 != 17) {
                  return 0;
                } else {
                  return 2;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void o(int param0) {
        field_D = null;
        field_t = null;
        field_C = null;
        field_w = null;
        if (param0 != -6) {
            field_w = null;
        }
        field_A = null;
        field_x = null;
        field_F = null;
    }

    final int n(int param0) {
        int var2 = 0;
        if (!((ph) this).field_b) {
          if (ca.c(-25945)) {
            if (!jm.field_b) {
              var2 = hn.a(((ph) this).field_r, ka.c((byte) -80), -2472, true, ((ph) this).field_p, sa.a((byte) -94));
              if (var2 == -1) {
                return -1;
              } else {
                L0: {
                  if (param0 == ~var2) {
                    break L0;
                  } else {
                    if (var2 != 1) {
                      L1: {
                        if (fa.field_e) {
                          break L1;
                        } else {
                          ((ph) this).a(24044, "reconnect");
                          break L1;
                        }
                      }
                      sd.q(param0 + 27113);
                      fi.a(tg.field_d, var2, (byte) 20);
                      jm.field_b = true;
                      hk.field_c = 15000L + k.a(0);
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (fn.field_R != 11) {
                    break L2;
                  } else {
                    if (a.field_h != 0) {
                      break L2;
                    } else {
                      bk.a(1);
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

    final int a(boolean param0, byte param1) {
        if (param1 != -108) {
            ((ph) this).b(-79, true);
        }
        return this.a(param1 + 111, param0, true);
    }

    private final void m(int param0) {
        hc.field_u[6] = true;
    }

    private final void e(boolean param0) {
        hc.field_u[5] = true;
    }

    final void c(byte param0) {
        int var3 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        L0: {
          var3 = TetraLink.field_J;
          if (!ac.a(-19403)) {
            if (vd.field_a < 10) {
              break L0;
            } else {
              if (!me.a((byte) -99)) {
                vh.b(-57);
                break L0;
              } else {
                if (fn.field_R == 0) {
                  int discarded$34 = this.a(-37, false, false);
                  break L0;
                } else {
                  t.b(hc.field_p, -21901);
                  break L0;
                }
              }
            }
          } else {
            L1: {
              stackOut_1_0 = this;
              stackOut_1_1 = 116;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (null == hd.field_u) {
                stackOut_3_0 = this;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            int discarded$35 = this.a(stackIn_4_1, stackIn_4_2 != 0, false);
            break L0;
          }
        }
        L2: {
          if (param0 <= -19) {
            break L2;
          } else {
            int discarded$36 = ((ph) this).n(2);
            break L2;
          }
        }
    }

    private final void j(int param0) {
        hc.field_u[4] = true;
    }

    private final void l(int param0) {
        je.field_b[18] = 1;
        je.field_b[8] = -2;
        je.field_b[3] = -1;
        je.field_b[9] = -1;
        je.field_b[2] = -2;
        je.field_b[5] = -1;
        je.field_b[17] = -1;
        je.field_b[4] = -1;
        je.field_b[1] = 16;
        je.field_b[11] = -1;
        je.field_b[12] = -1;
        je.field_b[13] = -1;
        je.field_b[7] = -1;
        je.field_b[6] = -2;
        je.field_b[10] = -1;
        je.field_b[16] = -1;
    }

    final void d(boolean param0) {
        int var2 = 0;
        fj var3 = null;
        int var4 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_29_0 = 0;
        Object stackIn_29_1 = null;
        StringBuilder stackIn_29_2 = null;
        int stackIn_30_0 = 0;
        Object stackIn_30_1 = null;
        StringBuilder stackIn_30_2 = null;
        int stackIn_31_0 = 0;
        Object stackIn_31_1 = null;
        StringBuilder stackIn_31_2 = null;
        int stackIn_31_3 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackOut_28_0 = 0;
        Object stackOut_28_1 = null;
        StringBuilder stackOut_28_2 = null;
        int stackOut_30_0 = 0;
        Object stackOut_30_1 = null;
        StringBuilder stackOut_30_2 = null;
        int stackOut_30_3 = 0;
        int stackOut_29_0 = 0;
        Object stackOut_29_1 = null;
        StringBuilder stackOut_29_2 = null;
        int stackOut_29_3 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        L0: {
          var4 = TetraLink.field_J;
          var2 = ua.field_c;
          if (var2 >= 64) {
            break L0;
          } else {
            if (!hc.field_u[var2]) {
              break L0;
            } else {
              if (var2 == 0) {
                return;
              } else {
                L1: {
                  if (var2 == 1) {
                    fn.h(-1);
                    break L1;
                  } else {
                    if (var2 == 2) {
                      i.c(1);
                      break L1;
                    } else {
                      if (3 == var2) {
                        dg.d(-1);
                        break L1;
                      } else {
                        if (var2 != 4) {
                          if (5 != var2) {
                            if (6 != var2) {
                              if (var2 != 7) {
                                if (var2 == 8) {
                                  qf.a(rl.field_d, 4, (bh) (Object) kb.field_q, nd.field_Pb);
                                  break L1;
                                } else {
                                  if (var2 != 16) {
                                    L2: {
                                      if (var2 == 11) {
                                        break L2;
                                      } else {
                                        if (var2 == 12) {
                                          break L2;
                                        } else {
                                          if (13 == var2) {
                                            wc.h(1);
                                            break L1;
                                          } else {
                                            if (17 != var2) {
                                              if (18 == var2) {
                                                ua.a(-1);
                                                break L1;
                                              } else {
                                                L3: {
                                                  stackOut_28_0 = -111;
                                                  stackOut_28_1 = null;
                                                  stackOut_28_2 = new StringBuilder().append("MGS1: ");
                                                  stackIn_30_0 = stackOut_28_0;
                                                  stackIn_30_1 = stackOut_28_1;
                                                  stackIn_30_2 = stackOut_28_2;
                                                  stackIn_29_0 = stackOut_28_0;
                                                  stackIn_29_1 = stackOut_28_1;
                                                  stackIn_29_2 = stackOut_28_2;
                                                  if (param0) {
                                                    stackOut_30_0 = stackIn_30_0;
                                                    stackOut_30_1 = stackIn_30_1;
                                                    stackOut_30_2 = (StringBuilder) (Object) stackIn_30_2;
                                                    stackOut_30_3 = 0;
                                                    stackIn_31_0 = stackOut_30_0;
                                                    stackIn_31_1 = stackOut_30_1;
                                                    stackIn_31_2 = stackOut_30_2;
                                                    stackIn_31_3 = stackOut_30_3;
                                                    break L3;
                                                  } else {
                                                    stackOut_29_0 = stackIn_29_0;
                                                    stackOut_29_1 = stackIn_29_1;
                                                    stackOut_29_2 = (StringBuilder) (Object) stackIn_29_2;
                                                    stackOut_29_3 = 1;
                                                    stackIn_31_0 = stackOut_29_0;
                                                    stackIn_31_1 = stackOut_29_1;
                                                    stackIn_31_2 = stackOut_29_2;
                                                    stackIn_31_3 = stackOut_29_3;
                                                    break L3;
                                                  }
                                                }
                                                fk.a(stackIn_31_0, (Throwable) (Object) stackIn_31_1, hc.a(stackIn_31_3 != 0));
                                                mk.a(false);
                                                break L1;
                                              }
                                            } else {
                                              L4: {
                                                stackOut_23_0 = this;
                                                stackIn_25_0 = stackOut_23_0;
                                                stackIn_24_0 = stackOut_23_0;
                                                if (param0) {
                                                  stackOut_25_0 = this;
                                                  stackOut_25_1 = 0;
                                                  stackIn_26_0 = stackOut_25_0;
                                                  stackIn_26_1 = stackOut_25_1;
                                                  break L4;
                                                } else {
                                                  stackOut_24_0 = this;
                                                  stackOut_24_1 = 1;
                                                  stackIn_26_0 = stackOut_24_0;
                                                  stackIn_26_1 = stackOut_24_1;
                                                  break L4;
                                                }
                                              }
                                              this.b(stackIn_26_1 != 0);
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L5: {
                                      stackOut_34_0 = 85;
                                      stackIn_36_0 = stackOut_34_0;
                                      stackIn_35_0 = stackOut_34_0;
                                      if (var2 != 12) {
                                        stackOut_36_0 = stackIn_36_0;
                                        stackOut_36_1 = 0;
                                        stackIn_37_0 = stackOut_36_0;
                                        stackIn_37_1 = stackOut_36_1;
                                        break L5;
                                      } else {
                                        stackOut_35_0 = stackIn_35_0;
                                        stackOut_35_1 = 1;
                                        stackIn_37_0 = stackOut_35_0;
                                        stackIn_37_1 = stackOut_35_1;
                                        break L5;
                                      }
                                    }
                                    var3 = wg.a((byte) stackIn_37_0, stackIn_37_1 != 0);
                                    ao.a(var3, -127);
                                    break L1;
                                  } else {
                                    pe.a((byte) 58);
                                    break L1;
                                  }
                                }
                              } else {
                                this.i(92);
                                break L1;
                              }
                            } else {
                              oj.b((byte) -122);
                              break L1;
                            }
                          } else {
                            se.a(false);
                            break L1;
                          }
                        } else {
                          vg.d((byte) 78);
                          break L1;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (param0) {
                    break L6;
                  } else {
                    field_A = null;
                    break L6;
                  }
                }
                return;
              }
            }
          }
        }
        fk.a(-72, (Throwable) null, "MGS2: " + hc.a(false));
        mk.a(false);
    }

    protected ph() {
    }

    private final void i(int param0) {
        String var2 = ll.f(0);
        ld.a(var2, lk.q(13), -1);
        if (param0 < 40) {
            ((ph) this).a(false, true, false, true, false, true, (byte) 49);
        }
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4_ref_java_awt_Dimension = null;
        int var4 = 0;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        String stackIn_100_1 = null;
        int stackIn_100_2 = 0;
        int stackIn_101_0 = 0;
        String stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_102_0 = 0;
        String stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        int stackIn_102_3 = 0;
        int stackIn_133_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_99_0 = 0;
        String stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        int stackOut_101_0 = 0;
        String stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        int stackOut_100_0 = 0;
        String stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        L0: {
          var5 = TetraLink.field_J;
          if (null == hn.field_M) {
            break L0;
          } else {
            L1: {
              if (hd.field_u == null) {
                var6 = pj.a((byte) -26);
                var4_ref_java_awt_Dimension = var6.getSize();
                hn.field_M.a(var4_ref_java_awt_Dimension.height, var4_ref_java_awt_Dimension.width, (byte) 37);
                break L1;
              } else {
                break L1;
              }
            }
            hn.field_M.b(29768);
            break L0;
          }
        }
        L2: {
          je.a(13397);
          qb.a(false);
          var3 = -117 / ((param0 - 84) / 32);
          if (rm.a(false)) {
            break L2;
          } else {
            if (11 != fn.field_R) {
              mf.a(0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (qf.field_k != null) {
            hc.field_p = qf.field_k.a(12224);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!r.d(0)) {
            break L4;
          } else {
            L5: {
              var4 = va.a(-1) * 1200;
              if (((ph) this).field_o) {
                break L5;
              } else {
                if (~var4 <= ~pm.a((byte) 26)) {
                  break L4;
                } else {
                  if (~nn.i(78) >= ~var4) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ph) this).field_o = false;
            mk.a(false);
            sd.q(27112);
            fi.a(dh.field_c, 2, (byte) 20);
            dl.a(18278);
            jm.field_b = true;
            hk.field_c = 15000L + k.a(0);
            break L4;
          }
        }
        L6: {
          L7: {
            if (a.field_h == -1) {
              break L7;
            } else {
              if (a.field_h != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (a.field_h != -1) {
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
            var4 = stackIn_24_0;
            a.field_h = pb.a(true);
            if (var4 == 0) {
              break L9;
            } else {
              if (0 == a.field_h) {
                if (fn.field_R != 11) {
                  break L9;
                } else {
                  if (!ca.c(-25945)) {
                    bk.a(1);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (-1 == a.field_h) {
            break L6;
          } else {
            if (a.field_h == 0) {
              break L6;
            } else {
              hk.field_c = k.a(0) + 15000L;
              break L6;
            }
          }
        }
        L10: {
          if (-1 == a.field_h) {
            break L10;
          } else {
            if (a.field_h != 0) {
              if (vd.field_a < 10) {
                if (a.field_h != 3) {
                  if (4 != a.field_h) {
                    if (a.field_h != 2) {
                      if (5 == a.field_h) {
                        ((ph) this).a(24044, "outofdate");
                        break L10;
                      } else {
                        ((ph) this).a(24044, "js5connect");
                        break L10;
                      }
                    } else {
                      ((ph) this).a(24044, "js5connect_full");
                      break L10;
                    }
                  } else {
                    ((ph) this).a(24044, "js5io");
                    break L10;
                  }
                } else {
                  ((ph) this).a(24044, "js5crc");
                  break L10;
                }
              } else {
                if (fn.field_R >= 10) {
                  L11: {
                    sd.q(27112);
                    if (a.field_h != 3) {
                      if (4 != a.field_h) {
                        if (a.field_h == 2) {
                          fi.a(je.field_g, 256, (byte) 20);
                          break L11;
                        } else {
                          if (a.field_h != 5) {
                            fi.a(ul.field_a, 256, (byte) 20);
                            break L11;
                          } else {
                            fi.a(ia.field_O, 5, (byte) 20);
                            break L11;
                          }
                        }
                      } else {
                        fi.a(ej.field_p, 256, (byte) 20);
                        break L11;
                      }
                    } else {
                      fi.a(ea.field_c, 256, (byte) 20);
                      break L11;
                    }
                  }
                  jm.field_b = true;
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
        L12: {
          L13: {
            L14: {
              if (-1 == a.field_h) {
                break L14;
              } else {
                if (a.field_h != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!ca.c(-25945)) {
              break L12;
            } else {
              break L13;
            }
          }
          if (k.a(0) < hk.field_c) {
            break L12;
          } else {
            jm.field_b = false;
            if (a.field_h == -1) {
              break L12;
            } else {
              if (0 == a.field_h) {
                break L12;
              } else {
                a.field_h = -1;
                ml.o(0);
                break L12;
              }
            }
          }
        }
        L15: {
          if (a.field_h != 0) {
            break L15;
          } else {
            if (!ca.c(-25945)) {
              n.field_Q = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (vd.field_a == 0) {
            if (!bn.a(21747)) {
              break L16;
            } else {
              vd.field_a = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (1 != vd.field_a) {
            break L17;
          } else {
            L18: {
              if (th.field_l == 0) {
                break L18;
              } else {
                d.field_i = ve.b(57, il.field_R);
                break L18;
              }
            }
            rm.field_i = pl.a(fl.field_g, true, false, 1, (byte) -85);
            ib.field_a = pl.a(jg.field_a, true, false, 1, (byte) -100);
            q.field_b = pl.a(kd.field_l, true, false, 1, (byte) -93);
            sb.field_a = ib.field_a;
            v.field_v = rm.field_i;
            vd.field_a = 2;
            break L17;
          }
        }
        L19: {
          if (2 != vd.field_a) {
            break L19;
          } else {
            L20: {
              if (d.field_i == null) {
                break L20;
              } else {
                if (d.field_i.c(120)) {
                  if (!d.field_i.a("", 0)) {
                    d.field_i = null;
                    break L20;
                  } else {
                    if (!d.field_i.a("", (byte) -76)) {
                      break L20;
                    } else {
                      gi.a(1, d.field_i);
                      d.field_i = null;
                      rk.c(-8243);
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
            }
            if (d.field_i != null) {
              break L19;
            } else {
              vd.field_a = 3;
              break L19;
            }
          }
        }
        L21: {
          if (vd.field_a != 3) {
            break L21;
          } else {
            if (!da.a(rm.field_i, ib.field_a, 97, q.field_b)) {
              break L21;
            } else {
              if (!sd.a((byte) -68, q.field_b)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    rn.a(1);
                    bg.c(67);
                    bn.field_a = kl.field_f;
                    k.field_c = false;
                    fa.a(rm.field_i, pg.field_m, q.field_b, ib.field_a, (byte) 91);
                    if (nl.field_j) {
                      break L23;
                    } else {
                      if (null != vg.field_Pb) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    if (nl.field_j) {
                      stackOut_98_0 = 0;
                      stackIn_99_0 = stackOut_98_0;
                      break L24;
                    } else {
                      stackOut_97_0 = 1;
                      stackIn_99_0 = stackOut_97_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_99_0 = stackIn_99_0;
                    stackOut_99_1 = vg.field_Pb;
                    stackOut_99_2 = 93;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_101_1 = stackOut_99_1;
                    stackIn_101_2 = stackOut_99_2;
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    stackIn_100_2 = stackOut_99_2;
                    if (nl.field_j) {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = (String) (Object) stackIn_101_1;
                      stackOut_101_2 = stackIn_101_2;
                      stackOut_101_3 = 0;
                      stackIn_102_0 = stackOut_101_0;
                      stackIn_102_1 = stackOut_101_1;
                      stackIn_102_2 = stackOut_101_2;
                      stackIn_102_3 = stackOut_101_3;
                      break L25;
                    } else {
                      stackOut_100_0 = stackIn_100_0;
                      stackOut_100_1 = (String) (Object) stackIn_100_1;
                      stackOut_100_2 = stackIn_100_2;
                      stackOut_100_3 = 1;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      stackIn_102_2 = stackOut_100_2;
                      stackIn_102_3 = stackOut_100_3;
                      break L25;
                    }
                  }
                  hn.a(stackIn_102_0 != 0, stackIn_102_1, stackIn_102_2, stackIn_102_3 != 0);
                  break L22;
                }
                L26: {
                  if (i.field_w) {
                    vg.i(5959);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null == rl.field_f) {
                    rl.field_f = im.a(28357);
                    ci.field_z = fa.a(-116);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                ni.a(q.field_b, rl.field_f, ci.field_z, (byte) -5);
                rm.field_i = null;
                q.field_b = null;
                ib.field_a = null;
                pk.a(-73, (java.applet.Applet) this);
                rk.c(-8243);
                vd.field_a = 10;
                break L21;
              }
            }
          }
        }
        L28: {
          if (10 == vd.field_a) {
            L29: {
              if (0 == th.field_l) {
                break L29;
              } else {
                um.field_k = ve.b(118, ai.field_b);
                break L29;
              }
            }
            vd.field_a = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          if (11 != vd.field_a) {
            break L30;
          } else {
            L31: {
              if (null == um.field_k) {
                break L31;
              } else {
                L32: {
                  if (!um.field_k.c(124)) {
                    break L32;
                  } else {
                    if (um.field_k.a(false)) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                ak.a(0, fn.a(0, um.field_k, eg.field_N, nj.field_e), 0.0f);
                break L30;
              }
            }
            oa.field_w = true;
            vd.field_a = 12;
            break L30;
          }
        }
        L33: {
          if (vd.field_a == 12) {
            if (oa.field_w) {
              break L33;
            } else {
              vd.field_a = 13;
              break L33;
            }
          } else {
            break L33;
          }
        }
        L34: {
          if (vd.field_a == 13) {
            L35: {
              var4 = 1;
              if (en.field_L != null) {
                L36: {
                  if (!en.field_L.a(-1210)) {
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
                ak.a(0, en.field_L.field_e, en.field_L.field_f);
                break L35;
              } else {
                break L35;
              }
            }
            if (var4 == 0) {
              break L34;
            } else {
              vd.field_a = 20;
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
            if (ha.field_h) {
              oa.a((byte) -117, uh.field_b);
              ((ph) this).d(-66);
              da.a((byte) -118, uh.field_b);
              break L37;
            } else {
              break L37;
            }
          }
        }
        L38: {
          if (!hc.field_u[8]) {
            break L38;
          } else {
            dh.a(true);
            break L38;
          }
        }
    }

    private final void c(int param0, boolean param1) {
        hc.field_u[16] = true;
        hc.field_u[8] = true;
        hc.field_u[17] = true;
        hc.field_u[7] = true;
        hc.field_u[0] = true;
        hc.field_u[3] = true;
        hc.field_u[param0] = true;
    }

    private final void k(int param0) {
        if (param0 != -7) {
            return;
        }
        hc.field_u[1] = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Wins";
        field_F = new je();
        field_D = "Not yet achieved";
        field_z = -1;
        field_x = "Achievements";
        field_C = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
