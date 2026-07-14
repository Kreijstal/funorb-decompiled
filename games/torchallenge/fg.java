/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fg extends kj implements cc, sg {
    private boolean field_P;
    private ng field_R;
    private boolean field_K;
    private String field_U;
    private dj field_T;
    private dj field_Q;
    private ng field_O;
    static boolean field_S;
    static int[] field_M;
    private boolean field_L;
    static int field_N;
    private ng field_J;

    final static void i(int param0) {
        eb.field_m = false;
        hl.field_e = false;
        fk.a(true, -1);
        eh.field_p = mg.field_c;
        gj.field_a = mg.field_c;
        int var1 = -11 / ((83 - param0) / 37);
    }

    final void h(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((fg) this).a((dj) null, 64);
        }
        ((fg) this).field_T.i(param0 + -22617);
        ((fg) this).field_Q.i(param0 ^ -22617);
    }

    final static void a(int param0, boolean param1) {
        int var3 = TorChallenge.field_F ? 1 : 0;
        if (param1) {
            field_M = null;
        }
        rd var4 = (rd) (Object) bb.field_d.c((byte) 118);
        while (var4 != null) {
            mg.a(-127, var4, param0);
            var4 = (rd) (Object) bb.field_d.c(-270);
        }
        da var2 = ji.field_q.c((byte) -49);
        while (var2 != null) {
            af.b(9245, param0);
            var2 = ji.field_q.c(-270);
        }
    }

    public static void f(byte param0) {
        field_M = null;
        if (param0 >= -7) {
            field_M = null;
        }
    }

    final void a(String param0, int param1) {
        dj var3 = null;
        String var4 = null;
        var3 = ((fg) this).field_T;
        var4 = param0;
        if (param1 != 10) {
          return;
        } else {
          var3.a(var4, false, (byte) -21);
          ((fg) this).field_Q.i(-22617);
          return;
        }
    }

    fg(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (j) null);
        cl var6 = null;
        eg var7 = null;
        String var8 = null;
        hb var9 = null;
        bg var12 = null;
        bg var13 = null;
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
        ng stackIn_16_1 = null;
        ng stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        ng stackIn_17_1 = null;
        ng stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        ng stackIn_18_1 = null;
        ng stackIn_18_2 = null;
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
        ng stackOut_15_1 = null;
        ng stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        ng stackOut_17_1 = null;
        ng stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        ng stackOut_16_1 = null;
        ng stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          ((fg) this).field_U = param1;
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
          ((fg) this).field_L = stackIn_3_1 != 0;
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
          ((fg) this).field_P = stackIn_6_1 != 0;
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
          ((fg) this).field_K = stackIn_9_1 != 0;
          if (!((fg) this).field_P) {
            break L3;
          } else {
            L4: {
              if (((fg) this).field_L) {
                break L4;
              } else {
                if (!((fg) this).field_K) {
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
          ((fg) this).field_T = (dj) (Object) new rf(param0, (gg) this, 100);
          ((fg) this).field_Q = (dj) (Object) new rf("", (gg) this, 20);
          if (!((fg) this).field_P) {
            L6: {
              ((fg) this).field_J = new ng(s.field_p, (gg) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((fg) this).field_K) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = cj.field_k;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = b.field_R;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new ng(stackIn_18_3, (gg) null);
            ((fg) this).field_R = stackIn_18_1;
            if (!((fg) this).field_L) {
              break L5;
            } else {
              ((fg) this).field_O = new ng(nd.field_a, (gg) this);
              break L5;
            }
          } else {
            ((fg) this).field_J = new ng(qb.field_e, (gg) null);
            ((fg) this).field_R = new ng(ph.field_f, (gg) null);
            ((fg) this).field_T.field_F = false;
            break L5;
          }
        }
        L7: {
          ((fg) this).field_T.field_q = (j) (Object) new fk(10000536);
          ((fg) this).field_Q.field_q = (j) (Object) new ij(10000536);
          var6 = new cl();
          ((fg) this).field_J.field_q = (j) (Object) var6;
          if (null == ((fg) this).field_R) {
            break L7;
          } else {
            ((fg) this).field_R.field_q = (j) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((fg) this).field_O == null) {
            break L8;
          } else {
            ((fg) this).field_O.field_q = (j) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((fg) this).field_T.field_r = qf.field_d;
          if (((fg) this).field_O == null) {
            break L9;
          } else {
            ((fg) this).field_O.field_r = am.field_c;
            break L9;
          }
        }
        L10: {
          if (!((fg) this).field_P) {
            if (!((fg) this).field_K) {
              ((fg) this).field_R.field_q = (j) (Object) new me();
              break L10;
            } else {
              ((fg) this).field_R.field_r = vk.field_c;
              ((fg) this).field_R.field_q = (j) (Object) new me();
              break L10;
            }
          } else {
            ((fg) this).field_R.field_r = ng.field_J;
            break L10;
          }
        }
        L11: {
          ((fg) this).field_i = 15;
          var7 = oe.field_g;
          if (((fg) this).field_U == null) {
            break L11;
          } else {
            ((fg) this).field_i = ((fg) this).field_i + (5 + var7.b(((fg) this).field_U, -40 + ((fg) this).field_p, var7.field_x));
            break L11;
          }
        }
        L12: {
          var8 = ea.field_b;
          var9 = lg.a(gi.b(12476), 126);
          if (sd.field_e == var9) {
            var8 = wl.field_d;
            break L12;
          } else {
            if (var9 != ee.field_x) {
              break L12;
            } else {
              var8 = ib.field_N;
              break L12;
            }
          }
        }
        L13: {
          var12 = new bg(10, ((fg) this).field_i, ((fg) this).field_p - 20, 25, (ee) (Object) ((fg) this).field_T, false, 80, 3, var7, 16777215, var8);
          ((fg) this).a(0, (ee) (Object) new bg(10, ((fg) this).field_i, ((fg) this).field_p - 20, 25, (ee) (Object) ((fg) this).field_T, false, 80, 3, var7, 16777215, var8));
          ((fg) this).field_i = ((fg) this).field_i + (5 + ((ee) (Object) var12).field_l);
          var13 = new bg(10, ((fg) this).field_i, ((fg) this).field_p + -20, 25, (ee) (Object) ((fg) this).field_Q, false, 80, 3, var7, 16777215, bd.field_n);
          ((fg) this).a(0, (ee) (Object) new bg(10, ((fg) this).field_i, ((fg) this).field_p + -20, 25, (ee) (Object) ((fg) this).field_Q, false, 80, 3, var7, 16777215, bd.field_n));
          ((fg) this).field_i = ((fg) this).field_i + (5 + ((ee) (Object) var13).field_l);
          ((fg) this).field_J.field_k = (gg) this;
          if (null == ((fg) this).field_O) {
            break L13;
          } else {
            ((fg) this).field_O.field_k = (gg) this;
            break L13;
          }
        }
        L14: {
          if (((fg) this).field_R == null) {
            break L14;
          } else {
            ((fg) this).field_R.field_k = (gg) this;
            break L14;
          }
        }
        L15: {
          if (((fg) this).field_O == null) {
            ((fg) this).field_J.a((byte) 126, 8, 30, -6 + ((fg) this).field_p - 10, ((fg) this).field_i);
            ((fg) this).field_i = ((fg) this).field_i + 35;
            break L15;
          } else {
            ((fg) this).field_J.a((byte) 109, 85, 30, -95 + ((fg) this).field_p, ((fg) this).field_i);
            ((fg) this).field_i = ((fg) this).field_i + 60;
            break L15;
          }
        }
        L16: {
          if (null == ((fg) this).field_O) {
            break L16;
          } else {
            ((fg) this).field_O.a((byte) 106, 8, 30, -16 + ((fg) this).field_p, ((fg) this).field_i);
            ((fg) this).field_i = ((fg) this).field_i + 35;
            break L16;
          }
        }
        L17: {
          if (((fg) this).field_R == null) {
            break L17;
          } else {
            L18: {
              if (((fg) this).field_P) {
                break L18;
              } else {
                if (((fg) this).field_K) {
                  break L18;
                } else {
                  ((fg) this).field_R.a((byte) 103, 8, 20, 40, ((fg) this).field_i);
                  ((fg) this).field_i = ((fg) this).field_i + 25;
                  break L17;
                }
              }
            }
            ((fg) this).field_R.a((byte) 116, 8, 30, -6 + ((fg) this).field_p + -10, ((fg) this).field_i);
            ((fg) this).field_i = ((fg) this).field_i + 35;
            break L17;
          }
        }
        L19: {
          ((fg) this).a((byte) 125, 0, 3 + ((fg) this).field_i, ((fg) this).field_p, 0);
          ((fg) this).a(0, (ee) (Object) ((fg) this).field_J);
          if (null == ((fg) this).field_O) {
            break L19;
          } else {
            ((fg) this).a(0, (ee) (Object) ((fg) this).field_O);
            break L19;
          }
        }
        L20: {
          if (null == ((fg) this).field_R) {
            break L20;
          } else {
            ((fg) this).a(0, (ee) (Object) ((fg) this).field_R);
            break L20;
          }
        }
    }

    private final void a(int param0) {
        if (!TorChallenge.r(-1592)) {
            // if_icmpge L61
            // if_icmplt L42
        } else {
            kb.a(((fg) this).field_T.field_v, ((fg) this).field_Q.field_v, (byte) 44);
        }
        int var2 = 83 % ((46 - param0) / 56);
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (null != ((fg) this).field_U) {
            int discarded$0 = oe.field_g.a(((fg) this).field_U, 20 + (param1 - -((fg) this).field_m), 15 + ((fg) this).field_i + param0, -40 + ((fg) this).field_p, ((fg) this).field_l, 16777215, -1, 1, 0, oe.field_g.field_x);
        }
        if (((fg) this).field_O != null) {
            qg.b(10 + param1, 134 + param0, ((fg) this).field_p + -20, 4210752);
        }
        super.a(param0, param1, param2, param3);
        if (param2) {
            ((fg) this).field_J = null;
        }
    }

    public final void b(dj param0, int param1) {
        if (param1 != 3) {
            ((fg) this).field_U = null;
        }
    }

    public final void a(dj param0, int param1) {
        if (!(param0 != ((fg) this).field_T)) {
            boolean discarded$0 = ((fg) this).field_Q.a((ee) this, 0);
        }
        if (!(param0 != ((fg) this).field_Q)) {
            this.a(126);
        }
        if (param1 != 5) {
            this.a(13);
        }
    }

    final String g(byte param0) {
        if (!(null != ((fg) this).field_T.field_v)) {
            return "";
        }
        if (param0 != -39) {
            return null;
        }
        return ((fg) this).field_T.field_v;
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        if (!super.a(param0, param1, (byte) 116, param3)) {
          if (param2 >= 9) {
            if (param0 == 98) {
              return ((fg) this).a(param3, (byte) -16);
            } else {
              if ((param0 ^ -1) != -100) {
                return false;
              } else {
                return ((fg) this).b(72, param3);
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          if (param0 != ((fg) this).field_J) {
            if (((fg) this).field_O == param0) {
              k.a(-14956);
              break L0;
            } else {
              if (((fg) this).field_R != param0) {
                break L0;
              } else {
                if (((fg) this).field_P) {
                  L1: {
                    if (param4) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L1;
                    }
                  }
                  bj.a(stackIn_11_0 != 0);
                  break L0;
                } else {
                  if (((fg) this).field_K) {
                    fd.a(-2068);
                    break L0;
                  } else {
                    ek.h(1);
                    break L0;
                  }
                }
              }
            }
          } else {
            this.a(110);
            break L0;
          }
        }
        L2: {
          if (!param4) {
            break L2;
          } else {
            ((fg) this).field_O = null;
            break L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[]{41, 10, 22, 2, 2};
    }
}
