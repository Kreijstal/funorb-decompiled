/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ih extends hp implements ok, hh {
    static int field_J;
    static int field_F;
    private an field_K;
    private an field_Q;
    private tb field_M;
    private tb field_N;
    static String field_T;
    private String field_P;
    private boolean field_H;
    private boolean field_O;
    private boolean field_L;
    static boolean field_S;
    private an field_R;

    public final void a(tb param0, int param1) {
        if (param1 != 8) {
            Object var4 = null;
            ((ih) this).a((tb) null, 89);
        }
    }

    final String b(boolean param0) {
        if (param0) {
            ((ih) this).field_N = null;
        }
        if (null == ((ih) this).field_N.field_o) {
            return "";
        }
        return ((ih) this).field_N.field_o;
    }

    ih(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (io) null);
        vm var6 = null;
        rb var7 = null;
        String var8 = null;
        sn var9 = null;
        q var12 = null;
        q var13 = null;
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
        Object stackIn_15_0 = null;
        an stackIn_15_1 = null;
        an stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        an stackIn_16_1 = null;
        an stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        an stackIn_17_1 = null;
        an stackIn_17_2 = null;
        String stackIn_17_3 = null;
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
        Object stackOut_14_0 = null;
        an stackOut_14_1 = null;
        an stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        an stackOut_16_1 = null;
        an stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        an stackOut_15_1 = null;
        an stackOut_15_2 = null;
        String stackOut_15_3 = null;
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
          ((ih) this).field_L = stackIn_3_1 != 0;
          ((ih) this).field_P = param1;
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
          ((ih) this).field_O = stackIn_6_1 != 0;
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
          ((ih) this).field_H = stackIn_9_1 != 0;
          if (!((ih) this).field_O) {
            break L3;
          } else {
            L4: {
              if (((ih) this).field_L) {
                break L4;
              } else {
                if (!((ih) this).field_H) {
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
          ((ih) this).field_N = (tb) (Object) new ic(param0, (sk) this, 100);
          ((ih) this).field_M = (tb) (Object) new ic("", (sk) this, 20);
          if (((ih) this).field_O) {
            ((ih) this).field_R = new an(el.field_i, (sk) null);
            ((ih) this).field_Q = new an(qd.field_d, (sk) null);
            ((ih) this).field_N.field_C = false;
            break L5;
          } else {
            L6: {
              ((ih) this).field_R = new an(gk.field_H, (sk) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (!((ih) this).field_H) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = jk.field_g;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = hl.field_h;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new an(stackIn_17_3, (sk) null);
            ((ih) this).field_Q = stackIn_17_1;
            if (!((ih) this).field_L) {
              break L5;
            } else {
              ((ih) this).field_K = new an(hk.field_P, (sk) this);
              break L5;
            }
          }
        }
        L7: {
          ((ih) this).field_N.field_h = (io) (Object) new tc(10000536);
          ((ih) this).field_M.field_h = (io) (Object) new jm(10000536);
          var6 = new vm();
          ((ih) this).field_R.field_h = (io) (Object) var6;
          if (null == ((ih) this).field_Q) {
            break L7;
          } else {
            ((ih) this).field_Q.field_h = (io) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((ih) this).field_N.field_s = ia.field_a;
          if (null == ((ih) this).field_K) {
            break L8;
          } else {
            ((ih) this).field_K.field_h = (io) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((ih) this).field_K) {
            break L9;
          } else {
            ((ih) this).field_K.field_s = nk.field_f;
            break L9;
          }
        }
        L10: {
          if (((ih) this).field_O) {
            ((ih) this).field_Q.field_s = cm.field_a;
            break L10;
          } else {
            if (((ih) this).field_H) {
              ((ih) this).field_Q.field_s = fo.field_c;
              ((ih) this).field_Q.field_h = (io) (Object) new dp();
              break L10;
            } else {
              ((ih) this).field_Q.field_h = (io) (Object) new dp();
              break L10;
            }
          }
        }
        L11: {
          ((ih) this).field_j = 15;
          var7 = ia.field_e;
          if (((ih) this).field_P == null) {
            break L11;
          } else {
            ((ih) this).field_j = ((ih) this).field_j + (5 + var7.b(((ih) this).field_P, -40 + ((ih) this).field_i, var7.field_I));
            break L11;
          }
        }
        L12: {
          var8 = qi.field_C;
          var9 = ne.a(hc.a(0), 0);
          if (var9 != em.field_J) {
            if (wn.field_a != var9) {
              break L12;
            } else {
              var8 = uh.field_h;
              break L12;
            }
          } else {
            var8 = qn.field_a;
            break L12;
          }
        }
        L13: {
          var12 = new q(10, ((ih) this).field_j, -20 + ((ih) this).field_i, 25, (ga) (Object) ((ih) this).field_N, false, 80, 3, var7, 16777215, var8);
          ((ih) this).a((ga) (Object) new q(10, ((ih) this).field_j, -20 + ((ih) this).field_i, 25, (ga) (Object) ((ih) this).field_N, false, 80, 3, var7, 16777215, var8), 10);
          ((ih) this).field_j = ((ih) this).field_j + (((ga) (Object) var12).field_n + 5);
          var13 = new q(10, ((ih) this).field_j, ((ih) this).field_i - 20, 25, (ga) (Object) ((ih) this).field_M, false, 80, 3, var7, 16777215, ui.field_c);
          ((ih) this).a((ga) (Object) new q(10, ((ih) this).field_j, ((ih) this).field_i - 20, 25, (ga) (Object) ((ih) this).field_M, false, 80, 3, var7, 16777215, ui.field_c), 10);
          ((ih) this).field_R.field_v = (sk) this;
          ((ih) this).field_j = ((ih) this).field_j + (5 + ((ga) (Object) var13).field_n);
          if (null == ((ih) this).field_K) {
            break L13;
          } else {
            ((ih) this).field_K.field_v = (sk) this;
            break L13;
          }
        }
        L14: {
          if (((ih) this).field_Q == null) {
            break L14;
          } else {
            ((ih) this).field_Q.field_v = (sk) this;
            break L14;
          }
        }
        L15: {
          if (((ih) this).field_K == null) {
            ((ih) this).field_R.a(80, ((ih) this).field_j, 8, ((ih) this).field_i - 6 - 10, 30);
            ((ih) this).field_j = ((ih) this).field_j + 35;
            break L15;
          } else {
            ((ih) this).field_R.a(30, ((ih) this).field_j, 85, ((ih) this).field_i + -95, 30);
            ((ih) this).field_j = ((ih) this).field_j + 60;
            break L15;
          }
        }
        L16: {
          if (null == ((ih) this).field_K) {
            break L16;
          } else {
            ((ih) this).field_K.a(94, ((ih) this).field_j, 8, -6 + (((ih) this).field_i - 10), 30);
            ((ih) this).field_j = ((ih) this).field_j + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((ih) this).field_Q) {
            break L17;
          } else {
            L18: {
              if (((ih) this).field_O) {
                break L18;
              } else {
                if (((ih) this).field_H) {
                  break L18;
                } else {
                  ((ih) this).field_Q.a(81, ((ih) this).field_j, 8, 40, 20);
                  ((ih) this).field_j = ((ih) this).field_j + 25;
                  break L17;
                }
              }
            }
            ((ih) this).field_Q.a(-126, ((ih) this).field_j, 8, ((ih) this).field_i + -6 + -10, 30);
            ((ih) this).field_j = ((ih) this).field_j + 35;
            break L17;
          }
        }
        L19: {
          ((ih) this).a(-116, 0, 0, ((ih) this).field_i, ((ih) this).field_j - -3);
          ((ih) this).a((ga) (Object) ((ih) this).field_R, 10);
          if (((ih) this).field_K == null) {
            break L19;
          } else {
            ((ih) this).a((ga) (Object) ((ih) this).field_K, 10);
            break L19;
          }
        }
        L20: {
          if (null == ((ih) this).field_Q) {
            break L20;
          } else {
            ((ih) this).a((ga) (Object) ((ih) this).field_Q, 10);
            break L20;
          }
        }
    }

    final void h(int param0) {
        if (param0 >= -89) {
            field_F = -81;
        }
        ((ih) this).field_N.j(0);
        ((ih) this).field_M.j(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(((ih) this).field_P == null)) {
            int discarded$0 = ia.field_e.a(((ih) this).field_P, 20 + (param2 + ((ih) this).field_k), param0 - (-((ih) this).field_j - 15), ((ih) this).field_i - 40, ((ih) this).field_n, 16777215, -1, 1, 0, ia.field_e.field_I);
        }
        if (((ih) this).field_K != null) {
            bi.b(10 + param2, param0 + 134, -20 + ((ih) this).field_i, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0, int param1, boolean param2) {
        vj.field_q = 0;
        ul.field_f = false;
        ha.field_e = false;
        vj.field_o = 0;
        nm.field_b = false;
        if (!param2) {
          return;
        } else {
          vf.field_f = param1;
          ma.field_r = -1;
          uo.field_d = false;
          vk.field_c = param0;
          h.field_d = false;
          sm.field_a = -1;
          return;
        }
    }

    final void a(String param0, int param1) {
        tb var3 = ((ih) this).field_N;
        if (param1 != 20) {
            ((ih) this).field_R = null;
        }
        String var4 = param0;
        var3.a(false, false, var4);
        ((ih) this).field_M.j(0);
    }

    public final void b(tb param0, int param1) {
        if (!(param0 != ((ih) this).field_N)) {
            boolean discarded$0 = ((ih) this).field_M.a((byte) 125, (ga) this);
        }
        int var3 = -126 / ((param1 - 35) / 38);
        if (!(((ih) this).field_M != param0)) {
            this.e((byte) -127);
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          if (((ih) this).field_R != param2) {
            if (((ih) this).field_K == param2) {
              vj.d(51);
              break L0;
            } else {
              if (param2 == ((ih) this).field_Q) {
                if (!((ih) this).field_O) {
                  if (((ih) this).field_H) {
                    ZombieDawn.q(-10401);
                    break L0;
                  } else {
                    mk.a((byte) -121);
                    break L0;
                  }
                } else {
                  cj.d((byte) 111);
                  break L0;
                }
              } else {
                break L0;
              }
            }
          } else {
            this.e((byte) -66);
            break L0;
          }
        }
        L1: {
          if (param1 == -6) {
            break L1;
          } else {
            ((ih) this).field_L = true;
            break L1;
          }
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = 0;
        if (!super.a(-123, param1, param2, param3)) {
          if (param1 != 98) {
            if (99 == param1) {
              return ((ih) this).a(1, param2);
            } else {
              var5 = 116 / ((param0 - -83) / 32);
              return false;
            }
          } else {
            return ((ih) this).b((byte) 120, param2);
          }
        } else {
          return true;
        }
    }

    private final void e(byte param0) {
        if (param0 > -23) {
          return;
        } else {
          L0: {
            L1: {
              if (eo.b(127)) {
                break L1;
              } else {
                if (-1 <= (((ih) this).field_N.field_o.length() ^ -1)) {
                  break L0;
                } else {
                  if (((ih) this).field_M.field_o.length() > 0) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            rg.a(((ih) this).field_N.field_o, -27, ((ih) this).field_M.field_o);
            break L0;
          }
          return;
        }
    }

    public static void a(int param0) {
        field_T = null;
        if (param0 != -31608) {
            ih.a(120, -75, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Unable to connect to the data server. Please check any firewall you are using.";
        field_F = 0;
    }
}
