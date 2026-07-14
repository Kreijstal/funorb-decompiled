/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ob extends cj implements ih, ij {
    private kp field_O;
    private d field_K;
    private boolean field_S;
    private boolean field_N;
    private kp field_H;
    private String field_P;
    private d field_G;
    private boolean field_R;
    static nj field_Q;
    static String field_I;
    static nj field_M;
    private d field_J;
    static int field_L;
    static double field_F;

    private final void a(int param0) {
        if (!hi.c((byte) 6)) {
            // if_icmple L63
            // if_icmplt L43
        } else {
            la.a(((ob) this).field_H.field_w, ((ob) this).field_O.field_w, 26806);
        }
        if (param0 >= -86) {
            ((ob) this).field_S = false;
        }
    }

    public final void a(byte param0, kp param1) {
        if (!(param1 != ((ob) this).field_H)) {
            boolean discarded$0 = ((ob) this).field_O.a((byte) 116, (iq) this);
        }
        if (param0 < 16) {
            Object var4 = null;
            ((ob) this).a((byte) -64, (kp) null);
        }
        if (!(((ob) this).field_O != param1)) {
            this.a(-123);
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (-99 == (param2 ^ -1)) {
            return ((ob) this).a(32345, param3);
          } else {
            if (99 == param2) {
              return ((ob) this).b((byte) -70, param3);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final void a(byte param0, String param1) {
        if (param0 != -79) {
            field_Q = null;
        }
        kp var3 = ((ob) this).field_H;
        String var4 = param1;
        var3.a(var4, -110, false);
        ((ob) this).field_O.j(param0 ^ -79);
    }

    final static java.applet.Applet e(byte param0) {
        int var1 = 8 % ((6 - param0) / 58);
        if (null != va.field_o) {
            return va.field_o;
        }
        return (java.applet.Applet) (Object) qe.field_T;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
            Object var6 = null;
            boolean discarded$0 = ((ob) this).a('g', -59, 99, (iq) null);
        }
        if (!(null == ((ob) this).field_P)) {
            int discarded$1 = qc.field_x.a(((ob) this).field_P, ((ob) this).field_o + param2 - -20, 15 + ((ob) this).field_t + param3, ((ob) this).field_n + -40, ((ob) this).field_s, 16777215, -1, 1, 0, qc.field_x.field_z);
        }
        if (!(null == ((ob) this).field_K)) {
            bi.b(10 + param2, 134 + param3, ((ob) this).field_n - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void a(byte param0) {
        field_M = null;
        if (param0 != -103) {
            java.applet.Applet discarded$0 = ob.e((byte) 61);
        }
        field_Q = null;
        field_I = null;
    }

    public final void a(int param0, kp param1) {
        if (param0 >= -10) {
            ((ob) this).field_H = null;
        }
    }

    ob(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ur) null);
        vo var6 = null;
        cc var7 = null;
        String var8 = null;
        ej var9 = null;
        mg var12 = null;
        mg var13 = null;
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
        d stackIn_15_1 = null;
        d stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        d stackIn_16_1 = null;
        d stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        d stackIn_17_1 = null;
        d stackIn_17_2 = null;
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
        d stackOut_14_1 = null;
        d stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        d stackOut_16_1 = null;
        d stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        d stackOut_15_1 = null;
        d stackOut_15_2 = null;
        String stackOut_15_3 = null;
        L0: {
          ((ob) this).field_P = param1;
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
          ((ob) this).field_N = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param4) {
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
          ((ob) this).field_R = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param3) {
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
          ((ob) this).field_S = stackIn_9_1 != 0;
          if (!((ob) this).field_N) {
            break L3;
          } else {
            L4: {
              if (((ob) this).field_S) {
                break L4;
              } else {
                if (!((ob) this).field_R) {
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
          ((ob) this).field_H = (kp) (Object) new br(param0, (uf) this, 100);
          ((ob) this).field_O = (kp) (Object) new br("", (uf) this, 20);
          if (((ob) this).field_N) {
            ((ob) this).field_J = new d(bk.field_d, (uf) null);
            ((ob) this).field_G = new d(jd.field_b, (uf) null);
            ((ob) this).field_H.field_F = false;
            break L5;
          } else {
            L6: {
              ((ob) this).field_J = new d(wp.field_d, (uf) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (!((ob) this).field_R) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = ap.field_f;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = fd.field_o;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new d(stackIn_17_3, (uf) null);
            ((ob) this).field_G = stackIn_17_1;
            if (!((ob) this).field_S) {
              break L5;
            } else {
              ((ob) this).field_K = new d(pk.field_r, (uf) this);
              break L5;
            }
          }
        }
        L7: {
          ((ob) this).field_H.field_B = (ur) (Object) new ml(10000536);
          ((ob) this).field_O.field_B = (ur) (Object) new om(10000536);
          var6 = new vo();
          ((ob) this).field_J.field_B = (ur) (Object) var6;
          if (((ob) this).field_G == null) {
            break L7;
          } else {
            ((ob) this).field_G.field_B = (ur) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((ob) this).field_H.field_q = wh.field_A;
          if (((ob) this).field_K == null) {
            break L8;
          } else {
            ((ob) this).field_K.field_B = (ur) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((ob) this).field_K) {
            break L9;
          } else {
            ((ob) this).field_K.field_q = ni.field_h;
            break L9;
          }
        }
        L10: {
          if (((ob) this).field_N) {
            ((ob) this).field_G.field_q = fm.field_h;
            break L10;
          } else {
            if (!((ob) this).field_R) {
              ((ob) this).field_G.field_B = (ur) (Object) new jc();
              break L10;
            } else {
              ((ob) this).field_G.field_q = he.field_z;
              ((ob) this).field_G.field_B = (ur) (Object) new jc();
              break L10;
            }
          }
        }
        L11: {
          ((ob) this).field_t = 15;
          var7 = qc.field_x;
          if (((ob) this).field_P == null) {
            break L11;
          } else {
            ((ob) this).field_t = ((ob) this).field_t + (5 + var7.a(((ob) this).field_P, ((ob) this).field_n - 40, var7.field_z));
            break L11;
          }
        }
        L12: {
          var8 = ll.field_a;
          var9 = kf.a((byte) -100, ob.e((byte) -52));
          if (li.field_j == var9) {
            var8 = la.field_c;
            break L12;
          } else {
            if (var9 != la.field_i) {
              break L12;
            } else {
              var8 = w.field_A;
              break L12;
            }
          }
        }
        L13: {
          var12 = new mg(10, ((ob) this).field_t, -20 + ((ob) this).field_n, 25, (iq) (Object) ((ob) this).field_H, false, 80, 3, var7, 16777215, var8);
          ((ob) this).c((byte) -107, (iq) (Object) new mg(10, ((ob) this).field_t, -20 + ((ob) this).field_n, 25, (iq) (Object) ((ob) this).field_H, false, 80, 3, var7, 16777215, var8));
          ((ob) this).field_t = ((ob) this).field_t + (5 + ((iq) (Object) var12).field_s);
          var13 = new mg(10, ((ob) this).field_t, -20 + ((ob) this).field_n, 25, (iq) (Object) ((ob) this).field_O, false, 80, 3, var7, 16777215, uc.field_c);
          ((ob) this).c((byte) 83, (iq) (Object) new mg(10, ((ob) this).field_t, -20 + ((ob) this).field_n, 25, (iq) (Object) ((ob) this).field_O, false, 80, 3, var7, 16777215, uc.field_c));
          ((ob) this).field_J.field_v = (uf) this;
          ((ob) this).field_t = ((ob) this).field_t + (((iq) (Object) var13).field_s + 5);
          if (null == ((ob) this).field_K) {
            break L13;
          } else {
            ((ob) this).field_K.field_v = (uf) this;
            break L13;
          }
        }
        L14: {
          if (((ob) this).field_G == null) {
            break L14;
          } else {
            ((ob) this).field_G.field_v = (uf) this;
            break L14;
          }
        }
        L15: {
          if (((ob) this).field_K != null) {
            ((ob) this).field_J.a(false, 85, ((ob) this).field_t, 30, -95 + ((ob) this).field_n);
            ((ob) this).field_t = ((ob) this).field_t + 60;
            break L15;
          } else {
            ((ob) this).field_J.a(false, 8, ((ob) this).field_t, 30, -10 + (-6 + ((ob) this).field_n));
            ((ob) this).field_t = ((ob) this).field_t + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((ob) this).field_K) {
            break L16;
          } else {
            ((ob) this).field_K.a(false, 8, ((ob) this).field_t, 30, ((ob) this).field_n - 6 + -10);
            ((ob) this).field_t = ((ob) this).field_t + 35;
            break L16;
          }
        }
        L17: {
          if (((ob) this).field_G == null) {
            break L17;
          } else {
            L18: {
              if (((ob) this).field_N) {
                break L18;
              } else {
                if (((ob) this).field_R) {
                  break L18;
                } else {
                  ((ob) this).field_G.a(false, 8, ((ob) this).field_t, 20, 40);
                  ((ob) this).field_t = ((ob) this).field_t + 25;
                  break L17;
                }
              }
            }
            ((ob) this).field_G.a(false, 8, ((ob) this).field_t, 30, -6 + ((ob) this).field_n + -10);
            ((ob) this).field_t = ((ob) this).field_t + 35;
            break L17;
          }
        }
        L19: {
          ((ob) this).a(false, 0, 0, ((ob) this).field_t - -3, ((ob) this).field_n);
          ((ob) this).c((byte) 85, (iq) (Object) ((ob) this).field_J);
          if (null == ((ob) this).field_K) {
            break L19;
          } else {
            ((ob) this).c((byte) -43, (iq) (Object) ((ob) this).field_K);
            break L19;
          }
        }
        L20: {
          if (null == ((ob) this).field_G) {
            break L20;
          } else {
            ((ob) this).c((byte) 99, (iq) (Object) ((ob) this).field_G);
            break L20;
          }
        }
    }

    final String j(int param0) {
        if (null == ((ob) this).field_H.field_w) {
          return "";
        } else {
          L0: {
            if (param0 == 5607) {
              break L0;
            } else {
              ((ob) this).a(true, 116, -61, 8);
              break L0;
            }
          }
          return ((ob) this).field_H.field_w;
        }
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          var6 = -35 / ((param2 - -63) / 51);
          if (param1 == ((ob) this).field_J) {
            this.a(-113);
            break L0;
          } else {
            if (param1 != ((ob) this).field_K) {
              if (((ob) this).field_G == param1) {
                if (((ob) this).field_N) {
                  rk.h(-128);
                  break L0;
                } else {
                  if (((ob) this).field_R) {
                    sg.b((byte) 81);
                    break L0;
                  } else {
                    oq.a(true);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            } else {
              ff.b((byte) -104);
              break L0;
            }
          }
        }
    }

    final void i(int param0) {
        ((ob) this).field_H.j(param0 ^ param0);
        ((ob) this).field_O.j(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new nj();
        field_I = "Please log in as a subscribing member to access this feature.";
        field_F = -1.0;
        field_M = new nj();
    }
}
