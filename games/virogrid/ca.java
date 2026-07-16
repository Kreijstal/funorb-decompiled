/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ca extends fd implements bo, ta {
    private boolean field_T;
    private wa field_E;
    private wa field_K;
    private boolean field_I;
    private tg field_J;
    private tg field_P;
    static wf field_M;
    private String field_S;
    private boolean field_H;
    private tg field_F;
    static String field_O;
    static int field_D;
    static id field_Q;
    static int field_G;
    static String field_R;
    static String field_L;

    final void a(int param0, String param1) {
        wa var3 = null;
        String var4 = null;
        if (param0 > -101) {
          return;
        } else {
          var3 = ((ca) this).field_E;
          var4 = param1;
          var3.a(var4, 81, false);
          ((ca) this).field_K.g(0);
          return;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 63 / ((param0 - -91) / 35);
            if (sd.a(-11532)) {
              break L1;
            } else {
              if ((((ca) this).field_E.field_n.length() ^ -1) >= -1) {
                break L0;
              } else {
                if (0 >= ((ca) this).field_K.field_n.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ub.a((byte) 102, ((ca) this).field_E.field_n, ((ca) this).field_K.field_n);
          break L0;
        }
    }

    public final void a(wa param0, int param1) {
        if (param1 != 13) {
            field_R = null;
        }
    }

    public static void f(byte param0) {
        field_L = null;
        field_Q = null;
        field_R = null;
        field_M = null;
        field_O = null;
        if (param0 != 15) {
            int discarded$0 = ca.b(-80, -39, -127);
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          var1 = 0;
          var2 = 0;
          if (param0 == 2) {
            break L0;
          } else {
            field_M = null;
            break L0;
          }
        }
        L1: while (true) {
          if (!nd.b((byte) -103)) {
            L2: {
              co.field_k.a(pn.a(hk.field_Jb, nl.field_u, (byte) 97), false, pn.a(a.field_y, ii.field_b, (byte) 10));
              if (co.field_k.b(false)) {
                var1 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = 0;
                if (var1 == 0) {
                  break L4;
                } else {
                  if (co.field_k.field_d < 0) {
                    break L4;
                  } else {
                    L5: {
                      var3 = rb.field_a[co.field_k.field_d];
                      if (2 == var3) {
                        break L5;
                      } else {
                        if (5 != var3) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    nm.b(param0 ^ 3);
                    break L3;
                  }
                }
              }
              if (var2 == 0) {
                break L3;
              } else {
                if (-3 == (p.field_d ^ -1)) {
                  break L3;
                } else {
                  nm.b(1);
                  break L3;
                }
              }
            }
            L6: {
              if (0 != var3) {
                break L6;
              } else {
                if (2 != p.field_d) {
                  break L6;
                } else {
                  var4 = hc.a(-9986) - af.field_e;
                  var6 = (int)((10999L - var4) / 1000L);
                  if (var6 > 0) {
                    break L6;
                  } else {
                    nm.a(true, 5, (byte) 71);
                    var3 = 2;
                    break L6;
                  }
                }
              }
            }
            return var3;
          } else {
            L7: {
              co.field_k.e(-126);
              if (!co.field_k.b(false)) {
                break L7;
              } else {
                var1 = 1;
                break L7;
              }
            }
            if (um.field_Gb != 13) {
              continue L1;
            } else {
              var2 = 1;
              continue L1;
            }
          }
        }
    }

    final void e(byte param0) {
        ((ca) this).field_E.g(0);
        ((ca) this).field_K.g(0);
        if (param0 > -77) {
            ((ca) this).field_P = null;
        }
    }

    ca(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ol) null);
        hf var6 = null;
        e var7 = null;
        String var8 = null;
        co var9 = null;
        ej var12 = null;
        ej var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_16_0 = null;
        tg stackIn_16_1 = null;
        tg stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        tg stackIn_17_1 = null;
        tg stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        tg stackIn_18_1 = null;
        tg stackIn_18_2 = null;
        String stackIn_18_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_15_0 = null;
        tg stackOut_15_1 = null;
        tg stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        tg stackOut_17_1 = null;
        tg stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        tg stackOut_16_1 = null;
        tg stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((ca) this).field_T = stackIn_3_1 != 0;
          ((ca) this).field_S = param1;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param3) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((ca) this).field_I = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param2) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((ca) this).field_H = stackIn_9_1 != 0;
          if (!((ca) this).field_H) {
            break L3;
          } else {
            L4: {
              if (((ca) this).field_I) {
                break L4;
              } else {
                if (!((ca) this).field_T) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((ca) this).field_E = (wa) (Object) new vd(param0, (cd) this, 100);
          ((ca) this).field_K = (wa) (Object) new vd("", (cd) this, 20);
          if (!((ca) this).field_H) {
            L6: {
              ((ca) this).field_F = new tg(aj.field_q, (cd) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((ca) this).field_T) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = dd.field_e;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = jl.field_D;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            ((ca) this).field_P = new tg(stackIn_18_3, (cd) null);
            if (!((ca) this).field_I) {
              break L5;
            } else {
              ((ca) this).field_J = new tg(bj.field_g, (cd) this);
              break L5;
            }
          } else {
            ((ca) this).field_F = new tg(tn.field_e, (cd) null);
            ((ca) this).field_P = new tg(og.field_k, (cd) null);
            ((ca) this).field_E.field_C = false;
            break L5;
          }
        }
        L7: {
          ((ca) this).field_E.field_w = (ol) (Object) new cc(10000536);
          ((ca) this).field_K.field_w = (ol) (Object) new a(10000536);
          var6 = new hf();
          ((ca) this).field_F.field_w = (ol) (Object) var6;
          if (((ca) this).field_P == null) {
            break L7;
          } else {
            ((ca) this).field_P.field_w = (ol) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((ca) this).field_E.field_h = sn.field_n;
          if (((ca) this).field_J == null) {
            break L8;
          } else {
            ((ca) this).field_J.field_w = (ol) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((ca) this).field_J) {
            break L9;
          } else {
            ((ca) this).field_J.field_h = mh.field_j;
            break L9;
          }
        }
        L10: {
          if (!((ca) this).field_H) {
            if (!((ca) this).field_T) {
              ((ca) this).field_P.field_w = (ol) (Object) new ti();
              break L10;
            } else {
              ((ca) this).field_P.field_h = fn.field_f;
              ((ca) this).field_P.field_w = (ol) (Object) new ti();
              break L10;
            }
          } else {
            ((ca) this).field_P.field_h = pj.field_b;
            break L10;
          }
        }
        L11: {
          ((ca) this).field_u = 15;
          var7 = dj.field_h;
          if (((ca) this).field_S == null) {
            break L11;
          } else {
            ((ca) this).field_u = ((ca) this).field_u + (var7.a(((ca) this).field_S, -40 + ((ca) this).field_g, var7.field_H) - -5);
            break L11;
          }
        }
        L12: {
          var8 = uh.field_g;
          var9 = bd.a(-78, mb.g((byte) 39));
          if (aa.field_b != var9) {
            if (var9 != Virogrid.field_O) {
              break L12;
            } else {
              var8 = ll.field_c;
              break L12;
            }
          } else {
            var8 = gf.field_y;
            break L12;
          }
        }
        L13: {
          ej dupTemp$2 = new ej(10, ((ca) this).field_u, ((ca) this).field_g + -20, 25, (fi) (Object) ((ca) this).field_E, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$2;
          ((ca) this).a((fi) (Object) dupTemp$2, (byte) -78);
          ((ca) this).field_u = ((ca) this).field_u + (5 + ((fi) (Object) var12).field_m);
          ej dupTemp$3 = new ej(10, ((ca) this).field_u, ((ca) this).field_g + -20, 25, (fi) (Object) ((ca) this).field_K, false, 80, 3, var7, 16777215, hm.field_b);
          var13 = dupTemp$3;
          ((ca) this).a((fi) (Object) dupTemp$3, (byte) -78);
          ((ca) this).field_u = ((ca) this).field_u + (5 + ((fi) (Object) var13).field_m);
          ((ca) this).field_F.field_o = (cd) this;
          if (((ca) this).field_J == null) {
            break L13;
          } else {
            ((ca) this).field_J.field_o = (cd) this;
            break L13;
          }
        }
        L14: {
          if (((ca) this).field_P == null) {
            break L14;
          } else {
            ((ca) this).field_P.field_o = (cd) this;
            break L14;
          }
        }
        L15: {
          if (((ca) this).field_J != null) {
            ((ca) this).field_F.a(30, true, ((ca) this).field_u, 85, ((ca) this).field_g - 95);
            ((ca) this).field_u = ((ca) this).field_u + 60;
            break L15;
          } else {
            ((ca) this).field_F.a(30, true, ((ca) this).field_u, 8, ((ca) this).field_g + -16);
            ((ca) this).field_u = ((ca) this).field_u + 35;
            break L15;
          }
        }
        L16: {
          if (((ca) this).field_J == null) {
            break L16;
          } else {
            ((ca) this).field_J.a(30, true, ((ca) this).field_u, 8, ((ca) this).field_g + -6 - 10);
            ((ca) this).field_u = ((ca) this).field_u + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((ca) this).field_P) {
            break L17;
          } else {
            L18: {
              if (((ca) this).field_H) {
                break L18;
              } else {
                if (((ca) this).field_T) {
                  break L18;
                } else {
                  ((ca) this).field_P.a(20, true, ((ca) this).field_u, 8, 40);
                  ((ca) this).field_u = ((ca) this).field_u + 25;
                  break L17;
                }
              }
            }
            ((ca) this).field_P.a(30, true, ((ca) this).field_u, 8, -10 + (-6 + ((ca) this).field_g));
            ((ca) this).field_u = ((ca) this).field_u + 35;
            break L17;
          }
        }
        L19: {
          ((ca) this).a(((ca) this).field_u - -3, true, 0, 0, ((ca) this).field_g);
          ((ca) this).a((fi) (Object) ((ca) this).field_F, (byte) -78);
          if (null == ((ca) this).field_J) {
            break L19;
          } else {
            ((ca) this).a((fi) (Object) ((ca) this).field_J, (byte) -78);
            break L19;
          }
        }
        L20: {
          if (null == ((ca) this).field_P) {
            break L20;
          } else {
            ((ca) this).a((fi) (Object) ((ca) this).field_P, (byte) -78);
            break L20;
          }
        }
    }

    final static void a(String param0, byte param1) {
        if (param1 >= -23) {
            field_D = 103;
        }
        pi.a(param0, 0);
        gk.a(false, bn.field_a, false);
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5 = 0;
        if (!super.a(param0, param1, param2, 60)) {
          if (98 == param2) {
            return ((ca) this).b(2, param0);
          } else {
            var5 = -8 % ((-75 - param3) / 36);
            if ((param2 ^ -1) != -100) {
              return false;
            } else {
              return ((ca) this).a(-16234, param0);
            }
          }
        } else {
          return true;
        }
    }

    public final void a(boolean param0, wa param1) {
        if (((ca) this).field_E == param1) {
            boolean discarded$0 = ((ca) this).field_K.a((fi) this, -8515);
        }
        if (param0) {
            field_G = 96;
        }
        if (((ca) this).field_K == param1) {
            this.a((byte) -46);
        }
    }

    final static void b(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = Virogrid.field_F ? 1 : 0;
            if (param0) {
              break L1;
            } else {
              if (wl.field_d == null) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ad.field_h = false;
          break L0;
        }
        if (param1 <= -105) {
          L2: {
            L3: {
              if (param0) {
                if (-1 > (kh.field_d ^ -1)) {
                  kh.field_d = kh.field_d - 1;
                  break L2;
                } else {
                  if ((hn.field_h ^ -1) >= -1) {
                    if (th.field_z <= 0) {
                      break L3;
                    } else {
                      th.field_z = th.field_z - 1;
                      break L2;
                    }
                  } else {
                    hn.field_h = hn.field_h - 1;
                    break L2;
                  }
                }
              } else {
                if (wl.field_d == null) {
                  if (la.field_h != null) {
                    if ((kh.field_d ^ -1) < -1) {
                      kh.field_d = kh.field_d - 1;
                      break L2;
                    } else {
                      if (0 < th.field_z) {
                        th.field_z = th.field_z - 1;
                        break L2;
                      } else {
                        if ((hn.field_h ^ -1) <= (ve.field_t ^ -1)) {
                          break L3;
                        } else {
                          L4: {
                            if (-1 == (hn.field_h ^ -1)) {
                              qh.a((byte) -68, true);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          hn.field_h = hn.field_h + 1;
                          break L2;
                        }
                      }
                    }
                  } else {
                    ad.field_h = false;
                    if (-1 > (hn.field_h ^ -1)) {
                      hn.field_h = hn.field_h - 1;
                      break L2;
                    } else {
                      if ((th.field_z ^ -1) >= -1) {
                        if (kh.field_d < ve.field_t) {
                          L5: {
                            if ((kh.field_d ^ -1) == -1) {
                              ld.a(0);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          kh.field_d = kh.field_d + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        th.field_z = th.field_z - 1;
                        break L2;
                      }
                    }
                  }
                } else {
                  if (-1 <= (kh.field_d ^ -1)) {
                    if (hn.field_h <= 0) {
                      if (th.field_z < ve.field_t) {
                        L6: {
                          if (-1 != (th.field_z ^ -1)) {
                            break L6;
                          } else {
                            qh.a((byte) -68, false);
                            break L6;
                          }
                        }
                        th.field_z = th.field_z + 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      hn.field_h = hn.field_h - 1;
                      break L2;
                    }
                  } else {
                    kh.field_d = kh.field_d - 1;
                    break L2;
                  }
                }
              }
            }
            break L2;
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (((ca) this).field_S != null) {
            int discarded$0 = dj.field_h.a(((ca) this).field_S, ((ca) this).field_l + param1 + 20, param2 - (-((ca) this).field_u + -15), -40 + ((ca) this).field_g, ((ca) this).field_m, 16777215, -1, 1, 0, dj.field_h.field_H);
        }
        if (((ca) this).field_J != null) {
            df.b(param1 + 10, param2 + 134, -20 + ((ca) this).field_g, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final String f(int param0) {
        if (!(null != ((ca) this).field_E.field_n)) {
            return "";
        }
        if (param0 != -3) {
            return null;
        }
        return ((ca) this).field_E.field_n;
    }

    final static int b(int param0, int param1, int param2) {
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param2 != 13760) {
            field_L = null;
        }
        int var3 = 0;
        while (-1 > (param0 ^ -1)) {
            var3 = 1 & param1 | var3 << 639770721;
            param0--;
            param1 = param1 >>> 1;
        }
        return var3;
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (param0 == 12085) {
            break L0;
          } else {
            var8 = null;
            boolean discarded$2 = ((ca) this).a((fi) null, '', 57, -15);
            break L0;
          }
        }
        L1: {
          if (((ca) this).field_F == param1) {
            this.a((byte) -127);
            break L1;
          } else {
            if (((ca) this).field_J != param1) {
              if (param1 == ((ca) this).field_P) {
                if (!((ca) this).field_H) {
                  if (((ca) this).field_T) {
                    ee.a((byte) 49);
                    break L1;
                  } else {
                    g.a((byte) -33);
                    break L1;
                  }
                } else {
                  ne.a(17);
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              va.a(false);
              break L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Similar rating";
        field_L = "This game option is only available to members.";
    }
}
