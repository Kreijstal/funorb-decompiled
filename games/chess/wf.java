/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wf extends ma implements ha, mj {
    private String field_V;
    static km field_Q;
    private qn field_N;
    private boolean field_Y;
    private fb field_M;
    static pf field_R;
    private fb field_L;
    private boolean field_T;
    static String field_X;
    private fb field_O;
    static String field_S;
    static String field_P;
    private boolean field_K;
    static id field_W;
    private qn field_U;

    public final void b(qn param0, int param1) {
        if (param1 != 3) {
          return;
        } else {
          L0: {
            if (((wf) this).field_N != param0) {
              break L0;
            } else {
              boolean discarded$2 = ((wf) this).field_U.a(0, (mf) this);
              break L0;
            }
          }
          L1: {
            if (((wf) this).field_U == param0) {
              this.h((byte) -85);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    wf(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (jm) null);
        sf var6 = null;
        lh var7 = null;
        String var8 = null;
        jd var9 = null;
        kg var12 = null;
        kg var13 = null;
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
        fb stackIn_16_1 = null;
        fb stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        fb stackIn_17_1 = null;
        fb stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        fb stackIn_18_1 = null;
        fb stackIn_18_2 = null;
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
        fb stackOut_15_1 = null;
        fb stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        fb stackOut_17_1 = null;
        fb stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        fb stackOut_16_1 = null;
        fb stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
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
          ((wf) this).field_Y = stackIn_3_1 != 0;
          ((wf) this).field_V = param1;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param2) {
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
          ((wf) this).field_T = stackIn_6_1 != 0;
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
          ((wf) this).field_K = stackIn_9_1 != 0;
          if (!((wf) this).field_T) {
            break L3;
          } else {
            L4: {
              if (((wf) this).field_Y) {
                break L4;
              } else {
                if (!((wf) this).field_K) {
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
          ((wf) this).field_N = (qn) (Object) new bg(param0, (rg) this, 100);
          ((wf) this).field_U = (qn) (Object) new bg("", (rg) this, 20);
          if (!((wf) this).field_T) {
            L6: {
              ((wf) this).field_M = new fb(ua.field_c, (rg) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((wf) this).field_K) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = fa.field_k;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = jd.field_g;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            ((wf) this).field_O = new fb(stackIn_18_3, (rg) null);
            if (!((wf) this).field_Y) {
              break L5;
            } else {
              ((wf) this).field_L = new fb(fd.field_o, (rg) this);
              break L5;
            }
          } else {
            ((wf) this).field_M = new fb(hl.field_f, (rg) null);
            ((wf) this).field_O = new fb(sn.field_b, (rg) null);
            ((wf) this).field_N.field_H = false;
            break L5;
          }
        }
        L7: {
          ((wf) this).field_N.field_n = (jm) (Object) new wc(10000536);
          ((wf) this).field_U.field_n = (jm) (Object) new hk(10000536);
          var6 = new sf();
          ((wf) this).field_M.field_n = (jm) (Object) var6;
          if (null == ((wf) this).field_O) {
            break L7;
          } else {
            ((wf) this).field_O.field_n = (jm) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((wf) this).field_N.field_j = lk.field_b;
          if (null == ((wf) this).field_L) {
            break L8;
          } else {
            ((wf) this).field_L.field_n = (jm) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((wf) this).field_L) {
            break L9;
          } else {
            ((wf) this).field_L.field_j = sl.field_d;
            break L9;
          }
        }
        L10: {
          if (!((wf) this).field_T) {
            if (!((wf) this).field_K) {
              ((wf) this).field_O.field_n = (jm) (Object) new wj();
              break L10;
            } else {
              ((wf) this).field_O.field_j = qd.field_I;
              ((wf) this).field_O.field_n = (jm) (Object) new wj();
              break L10;
            }
          } else {
            ((wf) this).field_O.field_j = ao.field_i;
            break L10;
          }
        }
        L11: {
          ((wf) this).field_r = 15;
          var7 = rb.field_b;
          if (((wf) this).field_V == null) {
            break L11;
          } else {
            ((wf) this).field_r = ((wf) this).field_r + (5 + var7.b(((wf) this).field_V, ((wf) this).field_y + -40, var7.field_C));
            break L11;
          }
        }
        L12: {
          var8 = rc.field_e;
          var9 = ja.a((byte) 127, bh.i(81));
          if (var9 != ph.field_g) {
            if (le.field_g != var9) {
              break L12;
            } else {
              var8 = oj.field_a;
              break L12;
            }
          } else {
            var8 = em.field_k;
            break L12;
          }
        }
        L13: {
          kg dupTemp$2 = new kg(10, ((wf) this).field_r, ((wf) this).field_y - 20, 25, (mf) (Object) ((wf) this).field_N, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$2;
          ((wf) this).b((mf) (Object) dupTemp$2, 95);
          ((wf) this).field_r = ((wf) this).field_r + (((mf) (Object) var12).field_C - -5);
          kg dupTemp$3 = new kg(10, ((wf) this).field_r, ((wf) this).field_y - 20, 25, (mf) (Object) ((wf) this).field_U, false, 80, 3, var7, 16777215, di.field_Qb);
          var13 = dupTemp$3;
          ((wf) this).b((mf) (Object) dupTemp$3, 95);
          ((wf) this).field_r = ((wf) this).field_r + (5 + ((mf) (Object) var13).field_C);
          ((wf) this).field_M.field_p = (rg) this;
          if (null == ((wf) this).field_L) {
            break L13;
          } else {
            ((wf) this).field_L.field_p = (rg) this;
            break L13;
          }
        }
        L14: {
          if (((wf) this).field_O == null) {
            break L14;
          } else {
            ((wf) this).field_O.field_p = (rg) this;
            break L14;
          }
        }
        L15: {
          if (null == ((wf) this).field_L) {
            ((wf) this).field_M.a(((wf) this).field_r, 34, 30, -6 + ((wf) this).field_y + -10, 8);
            ((wf) this).field_r = ((wf) this).field_r + 35;
            break L15;
          } else {
            ((wf) this).field_M.a(((wf) this).field_r, 34, 30, -95 + ((wf) this).field_y, 85);
            ((wf) this).field_r = ((wf) this).field_r + 60;
            break L15;
          }
        }
        L16: {
          if (((wf) this).field_L == null) {
            break L16;
          } else {
            ((wf) this).field_L.a(((wf) this).field_r, 34, 30, -6 + ((wf) this).field_y + -10, 8);
            ((wf) this).field_r = ((wf) this).field_r + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((wf) this).field_O) {
            break L17;
          } else {
            L18: {
              if (((wf) this).field_T) {
                break L18;
              } else {
                if (((wf) this).field_K) {
                  break L18;
                } else {
                  ((wf) this).field_O.a(((wf) this).field_r, 34, 20, 40, 8);
                  ((wf) this).field_r = ((wf) this).field_r + 25;
                  break L17;
                }
              }
            }
            ((wf) this).field_O.a(((wf) this).field_r, 34, 30, -10 + (((wf) this).field_y - 6), 8);
            ((wf) this).field_r = ((wf) this).field_r + 35;
            break L17;
          }
        }
        L19: {
          ((wf) this).a(0, 34, ((wf) this).field_r + 3, ((wf) this).field_y, 0);
          ((wf) this).b((mf) (Object) ((wf) this).field_M, 95);
          if (null == ((wf) this).field_L) {
            break L19;
          } else {
            ((wf) this).b((mf) (Object) ((wf) this).field_L, 95);
            break L19;
          }
        }
        L20: {
          if (((wf) this).field_O == null) {
            break L20;
          } else {
            ((wf) this).b((mf) (Object) ((wf) this).field_O, 95);
            break L20;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -80) {
            wf.a(-118);
        }
        if (!(((wf) this).field_V == null)) {
            int discarded$0 = rb.field_b.a(((wf) this).field_V, 20 + (((wf) this).field_u + param3), ((wf) this).field_r + param0 + 15, -40 + ((wf) this).field_y, ((wf) this).field_C, 16777215, -1, 1, 0, rb.field_b.field_C);
        }
        if (!(null == ((wf) this).field_L)) {
            wb.a(param3 - -10, 134 + param0, -20 + ((wf) this).field_y, 4210752);
        }
        super.a(param0, param1, -117, param3);
    }

    public static void a(int param0) {
        field_S = null;
        if (param0 != 35) {
            field_W = null;
        }
        field_W = null;
        field_X = null;
        field_Q = null;
        field_R = null;
        field_P = null;
    }

    final static void a(lm param0, int param1) {
        if (param0 == null) {
            return;
        }
        bj.a(na.a(param0, 100, 96), true);
        int var2 = -101 % ((param1 - -24) / 39);
    }

    private final void h(byte param0) {
        int var2 = 0;
        L0: {
          L1: {
            if (dc.a(124)) {
              break L1;
            } else {
              if (-1 <= ((wf) this).field_N.field_v.length()) {
                break L0;
              } else {
                if (-1 >= ((wf) this).field_U.field_v.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          cb.a(82, ((wf) this).field_U.field_v, ((wf) this).field_N.field_v);
          break L0;
        }
        var2 = 39 % ((-30 - param0) / 52);
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = Chess.field_G;
          if (((wf) this).field_M != param0) {
            if (((wf) this).field_L != param0) {
              if (((wf) this).field_O != param0) {
                break L0;
              } else {
                if (((wf) this).field_T) {
                  oa.b(-16586);
                  break L0;
                } else {
                  if (!((wf) this).field_K) {
                    el.h(-117);
                    break L0;
                  } else {
                    qf.a(108);
                    break L0;
                  }
                }
              }
            } else {
              dc.c((byte) 127);
              break L0;
            }
          } else {
            this.h((byte) -121);
            break L0;
          }
        }
        L1: {
          if (param4 == -24221) {
            break L1;
          } else {
            ((wf) this).field_K = true;
            break L1;
          }
        }
    }

    public final void a(qn param0, int param1) {
        if (param1 != 10999) {
            wf.a(-13);
        }
    }

    final static void a(java.awt.Frame param0, jk param1, int param2) {
        nl var3 = null;
        int var4 = 0;
        var4 = Chess.field_G;
        L0: while (true) {
          var3 = param1.a(param0, false);
          L1: while (true) {
            if (0 != var3.field_f) {
              if ((var3.field_f ^ -1) == -2) {
                if (param2 < 48) {
                  return;
                } else {
                  param0.setVisible(false);
                  param0.dispose();
                  return;
                }
              } else {
                bc.a(100L, (byte) -104);
                continue L0;
              }
            } else {
              bc.a(10L, (byte) 17);
              continue L1;
            }
          }
        }
    }

    final void g(byte param0) {
        int var2 = -102 % ((param0 - 40) / 38);
        ((wf) this).field_N.i(-12881);
        ((wf) this).field_U.i(-12881);
    }

    final void a(String param0, int param1) {
        qn var3 = null;
        String var4 = null;
        if (param1 != 20) {
          return;
        } else {
          var3 = ((wf) this).field_N;
          var4 = param0;
          var3.a(0, false, var4);
          ((wf) this).field_U.i(param1 ^ -12869);
          return;
        }
    }

    final String i(byte param0) {
        if (!(((wf) this).field_N.field_v != null)) {
            return "";
        }
        int var2 = 33 % ((param0 - -23) / 48);
        return ((wf) this).field_N.field_v;
    }

    final static int c(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Chess.field_G;
          var1 = 0;
          if (param0) {
            break L0;
          } else {
            var8 = null;
            wf.a((java.awt.Frame) null, (jk) null, -94);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (!kf.d(18954)) {
            L2: {
              ol.field_R.a(fe.a(re.field_m, 1, ag.field_f), 99, fe.a(hn.field_k, 1, rf.field_b));
              if (ol.field_R.d((byte) 124)) {
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
                  if (-1 < (ol.field_R.field_h ^ -1)) {
                    break L4;
                  } else {
                    L5: {
                      var3 = fi.field_c[ol.field_R.field_h];
                      if ((var3 ^ -1) == -3) {
                        break L5;
                      } else {
                        if (var3 != 5) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    mh.b(13);
                    break L3;
                  }
                }
              }
              if (var2 == 0) {
                break L3;
              } else {
                if ((gm.field_f ^ -1) == -3) {
                  break L3;
                } else {
                  mh.b(13);
                  break L3;
                }
              }
            }
            L6: {
              if (0 != var3) {
                break L6;
              } else {
                if (gm.field_f == 2) {
                  var4 = -jg.field_M + ud.a(2);
                  var6 = (int)((10999L + -var4) / 1000L);
                  if (0 >= var6) {
                    qh.a(false, true, 5);
                    var3 = 2;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
            }
            return var3;
          } else {
            L7: {
              ol.field_R.c((byte) -42);
              if (ol.field_R.d((byte) 101)) {
                var1 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            if (13 == vg.field_a) {
              var2 = 1;
              continue L1;
            } else {
              continue L1;
            }
          }
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if ((param1 ^ -1) != -99) {
            if ((param1 ^ -1) != -100) {
              return false;
            } else {
              return ((wf) this).a(param3, (byte) -73);
            }
          } else {
            return ((wf) this).a(param3, 27964);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "Only show private chat from my friends and opponents";
        field_S = "<%0>%";
        field_P = "Bishop";
    }
}
