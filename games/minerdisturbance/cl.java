/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cl extends kn implements wg, sh {
    static int field_T;
    private hc field_S;
    private hc field_J;
    private boolean field_K;
    private boolean field_N;
    private boolean field_O;
    private ui field_L;
    static int field_I;
    private String field_R;
    private ui field_P;
    static String field_M;
    private hc field_Q;

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            if (param3 != 310) {
                field_M = null;
            }
            var4 = param0.getGraphics();
            bj.field_e.a(param1, param3 + -197, var4, param2);
            var4.dispose();
        } catch (Exception exception) {
            param0.repaint();
        }
    }

    final void n(int param0) {
        if (param0 != -6) {
            ((cl) this).n(68);
        }
        ((cl) this).field_P.f((byte) 112);
        ((cl) this).field_L.f((byte) 112);
    }

    final void a(String param0, int param1) {
        ui var3 = null;
        String var4 = null;
        var3 = ((cl) this).field_P;
        var4 = param0;
        var3.a(false, false, var4);
        if (param1 < 50) {
          return;
        } else {
          ((cl) this).field_L.f((byte) 112);
          return;
        }
    }

    private final void r(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            if (dl.a(55)) {
              break L1;
            } else {
              if (-1 <= (((cl) this).field_P.field_s.length() ^ -1)) {
                break L0;
              } else {
                if (0 < ((cl) this).field_L.field_s.length()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          sj.a(((cl) this).field_L.field_s, 19260, ((cl) this).field_P.field_s);
          break L0;
        }
        var2 = 33 % ((param0 - 78) / 45);
    }

    public final void b(ui param0, int param1) {
        if (param1 != 60) {
            Object var4 = null;
            ((cl) this).a(-73, (byte) -46, (hc) null, -35, 115);
        }
    }

    public static void o(int param0) {
        field_M = null;
        if (param0 != 20) {
            field_T = 49;
        }
    }

    final String a(byte param0) {
        if (!(null != ((cl) this).field_P.field_s)) {
            return "";
        }
        int var2 = 25 / ((param0 - 61) / 46);
        return ((cl) this).field_P.field_s;
    }

    cl(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ad) null);
        wi var6 = null;
        we var7 = null;
        String var8 = null;
        sj var9 = null;
        am var12 = null;
        am var13 = null;
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
        hc stackIn_16_1 = null;
        hc stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        hc stackIn_17_1 = null;
        hc stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        hc stackIn_18_1 = null;
        hc stackIn_18_2 = null;
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
        hc stackOut_15_1 = null;
        hc stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        hc stackOut_17_1 = null;
        hc stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        hc stackOut_16_1 = null;
        hc stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
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
          ((cl) this).field_N = stackIn_3_1 != 0;
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
          ((cl) this).field_K = stackIn_6_1 != 0;
          ((cl) this).field_R = param1;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param4) {
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
          ((cl) this).field_O = stackIn_9_1 != 0;
          if (!((cl) this).field_N) {
            break L3;
          } else {
            L4: {
              if (((cl) this).field_K) {
                break L4;
              } else {
                if (!((cl) this).field_O) {
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
          ((cl) this).field_P = (ui) (Object) new ke(param0, (rm) this, 100);
          ((cl) this).field_L = (ui) (Object) new ke("", (rm) this, 20);
          if (!((cl) this).field_N) {
            L6: {
              ((cl) this).field_S = new hc(lj.field_o, (rm) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((cl) this).field_O) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = hj.field_a;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = hk.field_d;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            ((cl) this).field_Q = new hc(stackIn_18_3, (rm) null);
            if (!((cl) this).field_K) {
              break L5;
            } else {
              ((cl) this).field_J = new hc(u.field_a, (rm) this);
              break L5;
            }
          } else {
            ((cl) this).field_S = new hc(af.field_s, (rm) null);
            ((cl) this).field_Q = new hc(o.field_b, (rm) null);
            ((cl) this).field_P.field_E = false;
            break L5;
          }
        }
        L7: {
          ((cl) this).field_P.field_A = (ad) (Object) new gk(10000536);
          ((cl) this).field_L.field_A = (ad) (Object) new mn(10000536);
          var6 = new wi();
          ((cl) this).field_S.field_A = (ad) (Object) var6;
          if (null == ((cl) this).field_Q) {
            break L7;
          } else {
            ((cl) this).field_Q.field_A = (ad) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (null == ((cl) this).field_J) {
            break L8;
          } else {
            ((cl) this).field_J.field_A = (ad) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((cl) this).field_P.field_n = in.field_a;
          if (null == ((cl) this).field_J) {
            break L9;
          } else {
            ((cl) this).field_J.field_n = ha.field_f;
            break L9;
          }
        }
        L10: {
          if (((cl) this).field_N) {
            ((cl) this).field_Q.field_n = eb.field_c;
            break L10;
          } else {
            if (!((cl) this).field_O) {
              ((cl) this).field_Q.field_A = (ad) (Object) new nc();
              break L10;
            } else {
              ((cl) this).field_Q.field_n = si.field_c;
              ((cl) this).field_Q.field_A = (ad) (Object) new nc();
              break L10;
            }
          }
        }
        L11: {
          ((cl) this).field_t = 15;
          var7 = bn.field_d;
          if (null == ((cl) this).field_R) {
            break L11;
          } else {
            ((cl) this).field_t = ((cl) this).field_t + (5 + var7.b(((cl) this).field_R, ((cl) this).field_v - 40, var7.field_I));
            break L11;
          }
        }
        L12: {
          var8 = oe.field_c;
          var9 = hm.a(28, bm.c(-83));
          if (var9 != ak.field_b) {
            if (var9 != hj.field_e) {
              break L12;
            } else {
              var8 = ka.field_b;
              break L12;
            }
          } else {
            var8 = bg.field_b;
            break L12;
          }
        }
        L13: {
          am dupTemp$2 = new am(10, ((cl) this).field_t, ((cl) this).field_v - 20, 25, (fe) (Object) ((cl) this).field_P, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$2;
          ((cl) this).a(-1, (fe) (Object) dupTemp$2);
          ((cl) this).field_t = ((cl) this).field_t + (((fe) (Object) var12).field_q + 5);
          am dupTemp$3 = new am(10, ((cl) this).field_t, ((cl) this).field_v - 20, 25, (fe) (Object) ((cl) this).field_L, false, 80, 3, var7, 16777215, tk.field_c);
          var13 = dupTemp$3;
          ((cl) this).a(-1, (fe) (Object) dupTemp$3);
          ((cl) this).field_S.field_y = (rm) this;
          ((cl) this).field_t = ((cl) this).field_t + (((fe) (Object) var13).field_q - -5);
          if (null == ((cl) this).field_J) {
            break L13;
          } else {
            ((cl) this).field_J.field_y = (rm) this;
            break L13;
          }
        }
        L14: {
          if (((cl) this).field_Q == null) {
            break L14;
          } else {
            ((cl) this).field_Q.field_y = (rm) this;
            break L14;
          }
        }
        L15: {
          if (null != ((cl) this).field_J) {
            ((cl) this).field_S.a(30, -102, 85, -95 + ((cl) this).field_v, ((cl) this).field_t);
            ((cl) this).field_t = ((cl) this).field_t + 60;
            break L15;
          } else {
            ((cl) this).field_S.a(30, -127, 8, -6 + ((cl) this).field_v - 10, ((cl) this).field_t);
            ((cl) this).field_t = ((cl) this).field_t + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((cl) this).field_J) {
            break L16;
          } else {
            ((cl) this).field_J.a(30, -115, 8, ((cl) this).field_v + -16, ((cl) this).field_t);
            ((cl) this).field_t = ((cl) this).field_t + 35;
            break L16;
          }
        }
        L17: {
          if (((cl) this).field_Q == null) {
            break L17;
          } else {
            L18: {
              if (((cl) this).field_N) {
                break L18;
              } else {
                if (!((cl) this).field_O) {
                  ((cl) this).field_Q.a(20, -115, 8, 40, ((cl) this).field_t);
                  ((cl) this).field_t = ((cl) this).field_t + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((cl) this).field_Q.a(30, -124, 8, ((cl) this).field_v + -6 - 10, ((cl) this).field_t);
            ((cl) this).field_t = ((cl) this).field_t + 35;
            break L17;
          }
        }
        L19: {
          ((cl) this).a(((cl) this).field_t + 3, -84, 0, ((cl) this).field_v, 0);
          ((cl) this).a(-1, (fe) (Object) ((cl) this).field_S);
          if (null == ((cl) this).field_J) {
            break L19;
          } else {
            ((cl) this).a(-1, (fe) (Object) ((cl) this).field_J);
            break L19;
          }
        }
        L20: {
          if (null == ((cl) this).field_Q) {
            break L20;
          } else {
            ((cl) this).a(-1, (fe) (Object) ((cl) this).field_Q);
            break L20;
          }
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (98 == param3) {
            return ((cl) this).b(param1, 0);
          } else {
            if (param3 == 99) {
              return ((cl) this).a(param1, (byte) 12);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void p(int param0) {
        int var1 = 0;
        if (ee.field_J <= 32) {
            fc.a(0, (byte) 44);
        } else {
            var1 = ee.field_J % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            fc.a(-var1 + ee.field_J, (byte) 112);
        }
        if (param0 < 1) {
            Object var2 = null;
            cl.a((java.awt.Canvas) null, 116, -52, -33);
        }
    }

    final static void q(int param0) {
        pj.a(u.b(-4440) < mk.b(45) ? true : false, (byte) -119);
        if (param0 > -59) {
            field_I = 80;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = MinerDisturbance.field_ab;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!ra.a(122, param1.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!ra.a(122, param1.charAt(-1 + var3))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              if (param0 == -95) {
                var4 = -var2 + var3;
                if (1 <= var4) {
                  if (-13 <= (var4 ^ -1)) {
                    var5 = new StringBuilder(var4);
                    var6 = var2;
                    L4: while (true) {
                      if (var3 <= var6) {
                        if (var5.length() == 0) {
                          return null;
                        } else {
                          return var5.toString();
                        }
                      } else {
                        var7 = param1.charAt(var6);
                        if (wj.a((char) var7, 96)) {
                          var8 = ha.a(242, (char) var7);
                          if (0 != var8) {
                            StringBuilder discarded$1 = var5.append(var8);
                            var6++;
                            continue L4;
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          if (param2 != ((cl) this).field_S) {
            if (param2 == ((cl) this).field_J) {
              fe.e(param1 ^ 26319);
              break L0;
            } else {
              if (param2 == ((cl) this).field_Q) {
                if (((cl) this).field_N) {
                  ta.f((byte) 67);
                  break L0;
                } else {
                  if (!((cl) this).field_O) {
                    nm.a(-6145);
                    break L0;
                  } else {
                    hk.c(-121);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          } else {
            this.r(125);
            break L0;
          }
        }
        L1: {
          if (param1 == 6) {
            break L1;
          } else {
            ((cl) this).field_L = null;
            break L1;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (((cl) this).field_R != null) {
            int discarded$0 = bn.field_d.a(((cl) this).field_R, 20 + param1 + ((cl) this).field_u, 15 + ((cl) this).field_t + param2, ((cl) this).field_v + -40, ((cl) this).field_q, 16777215, -1, 1, 0, bn.field_d.field_I);
        }
        if (!(null == ((cl) this).field_J)) {
            eh.e(10 + param1, 134 + param2, -20 + ((cl) this).field_v, 4210752);
        }
        if (param0 != 4) {
            Object var6 = null;
            ((cl) this).a((String) null, 73);
        }
        super.a((byte) 4, param1, param2, param3);
    }

    public final void a(ui param0, int param1) {
        if (param1 != -7802) {
          return;
        } else {
          L0: {
            if (param0 == ((cl) this).field_P) {
              boolean discarded$2 = ((cl) this).field_L.a((fe) this, param1 ^ -7687);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((cl) this).field_L == param0) {
              this.r(param1 ^ 7749);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "These platinum climbing hooks let you hold on to rock faces while mining them. Jump onto a wall to hold on and press down or turn away to fall off.";
    }
}
