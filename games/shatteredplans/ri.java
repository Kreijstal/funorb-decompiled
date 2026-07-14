/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ri extends f implements od, bp {
    private boolean field_L;
    private kg field_K;
    private String field_J;
    static String field_G;
    static int field_F;
    static String field_N;
    private kg field_P;
    static gr field_I;
    private go field_H;
    private kg field_Q;
    private go field_R;
    private boolean field_D;
    private boolean field_E;
    static String field_M;
    static int field_O;

    final void a(int param0, String param1) {
        go var3 = null;
        String var4 = null;
        if (param0 != 16311) {
          return;
        } else {
          var3 = ((ri) this).field_H;
          var4 = param1;
          var3.a(108, var4, false);
          ((ri) this).field_R.e(true);
          return;
        }
    }

    final static void k(int param0) {
        int var2 = 0;
        L0: {
          var2 = ShatteredPlansClient.field_F ? 1 : 0;
          if ((ce.field_x.field_P.field_y & 1 << ce.field_x.field_h) != 0) {
            oq.field_i[11] = te.field_a;
            break L0;
          } else {
            if (-1 == (ce.field_x.field_P.field_y ^ -1)) {
              oq.field_i[11] = kd.field_c;
              break L0;
            } else {
              oq.field_i[11] = bb.field_a;
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 8) {
            break L1;
          } else {
            field_N = null;
            break L1;
          }
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (-99 != (param0 ^ -1)) {
            if (param0 == 99) {
              return ((ri) this).a(param3, 102);
            } else {
              return false;
            }
          } else {
            return ((ri) this).a(param3, true);
          }
        }
    }

    final static th a(String param0, String param1, bc param2, bc param3, byte param4) {
        int var5 = param2.a(126, param1);
        int var6 = param2.a(var5, (byte) 106, param0);
        int var7 = 72 % ((38 - param4) / 49);
        return mf.a(var6, var5, param2, param3, -121);
    }

    public final void a(go param0, int param1) {
        if (param1 != 95) {
            ((ri) this).field_K = null;
        }
    }

    private final void a(int param0) {
        if (!i.a(1)) {
            // if_icmple L59
            // if_icmplt L40
        } else {
            bh.a((byte) 81, ((ri) this).field_R.field_s, ((ri) this).field_H.field_s);
        }
        if (param0 > -126) {
            this.a(-6);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(((ri) this).field_J == null)) {
            int discarded$0 = gn.field_u.a(((ri) this).field_J, 20 + (param3 - -((ri) this).field_m), 15 + ((ri) this).field_q + param2, -40 + ((ri) this).field_x, ((ri) this).field_n, 16777215, -1, 1, 0, gn.field_u.field_J);
        }
        if (!(((ri) this).field_Q == null)) {
            gf.f(param3 - -10, 134 + param2, ((ri) this).field_x - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public final void a(int param0, go param1) {
        if (!(param1 != ((ri) this).field_H)) {
            boolean discarded$0 = ((ri) this).field_R.a((byte) -21, (vg) this);
        }
        if (((ri) this).field_R == param1) {
            this.a(param0 + -4468);
        }
        if (param0 != 4340) {
            Object var4 = null;
            th discarded$1 = ri.a((String) null, (String) null, (bc) null, (bc) null, (byte) -106);
        }
    }

    ri(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (iq) null);
        qp var6 = null;
        nq var7 = null;
        String var8 = null;
        bg var9 = null;
        pg var12 = null;
        pg var13 = null;
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
        kg stackIn_16_1 = null;
        kg stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        kg stackIn_17_1 = null;
        kg stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        kg stackIn_18_1 = null;
        kg stackIn_18_2 = null;
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
        kg stackOut_15_1 = null;
        kg stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        kg stackOut_17_1 = null;
        kg stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        kg stackOut_16_1 = null;
        kg stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          ((ri) this).field_J = param1;
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
          ((ri) this).field_E = stackIn_3_1 != 0;
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
          ((ri) this).field_D = stackIn_6_1 != 0;
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
          ((ri) this).field_L = stackIn_9_1 != 0;
          if (!((ri) this).field_L) {
            break L3;
          } else {
            L4: {
              if (((ri) this).field_E) {
                break L4;
              } else {
                if (!((ri) this).field_D) {
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
          ((ri) this).field_H = (go) (Object) new fa(param0, (ko) this, 100);
          ((ri) this).field_R = (go) (Object) new fa("", (ko) this, 20);
          if (!((ri) this).field_L) {
            L6: {
              ((ri) this).field_K = new kg(wl.field_e, (ko) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((ri) this).field_D) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = ss.field_e;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = tr.field_Pb;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new kg(stackIn_18_3, (ko) null);
            ((ri) this).field_P = stackIn_18_1;
            if (!((ri) this).field_E) {
              break L5;
            } else {
              ((ri) this).field_Q = new kg(oj.field_Ab, (ko) this);
              break L5;
            }
          } else {
            ((ri) this).field_K = new kg(ts.field_E, (ko) null);
            ((ri) this).field_P = new kg(em.field_g, (ko) null);
            ((ri) this).field_H.field_y = false;
            break L5;
          }
        }
        L7: {
          ((ri) this).field_H.field_p = (iq) (Object) new rr(10000536);
          ((ri) this).field_R.field_p = (iq) (Object) new ce(10000536);
          var6 = new qp();
          ((ri) this).field_K.field_p = (iq) (Object) var6;
          if (((ri) this).field_P == null) {
            break L7;
          } else {
            ((ri) this).field_P.field_p = (iq) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((ri) this).field_Q == null) {
            break L8;
          } else {
            ((ri) this).field_Q.field_p = (iq) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((ri) this).field_H.field_v = sf.field_a;
          if (null == ((ri) this).field_Q) {
            break L9;
          } else {
            ((ri) this).field_Q.field_v = nc.field_m;
            break L9;
          }
        }
        L10: {
          if (((ri) this).field_L) {
            ((ri) this).field_P.field_v = ed.field_a;
            break L10;
          } else {
            if (((ri) this).field_D) {
              ((ri) this).field_P.field_v = bs.field_c;
              ((ri) this).field_P.field_p = (iq) (Object) new rq();
              break L10;
            } else {
              ((ri) this).field_P.field_p = (iq) (Object) new rq();
              break L10;
            }
          }
        }
        L11: {
          ((ri) this).field_q = 15;
          var7 = gn.field_u;
          if (null == ((ri) this).field_J) {
            break L11;
          } else {
            ((ri) this).field_q = ((ri) this).field_q + (var7.c(((ri) this).field_J, ((ri) this).field_x + -40, var7.field_J) - -5);
            break L11;
          }
        }
        L12: {
          var8 = ph.field_e;
          var9 = jc.a(kq.f((byte) 124), true);
          if (var9 == og.field_b) {
            var8 = cn.field_v;
            break L12;
          } else {
            if (dm.field_f != var9) {
              break L12;
            } else {
              var8 = ba.field_b;
              break L12;
            }
          }
        }
        L13: {
          var12 = new pg(10, ((ri) this).field_q, -20 + ((ri) this).field_x, 25, (vg) (Object) ((ri) this).field_H, false, 80, 3, var7, 16777215, var8);
          ((ri) this).b((byte) -65, (vg) (Object) new pg(10, ((ri) this).field_q, -20 + ((ri) this).field_x, 25, (vg) (Object) ((ri) this).field_H, false, 80, 3, var7, 16777215, var8));
          ((ri) this).field_q = ((ri) this).field_q + (((vg) (Object) var12).field_n + 5);
          var13 = new pg(10, ((ri) this).field_q, ((ri) this).field_x + -20, 25, (vg) (Object) ((ri) this).field_R, false, 80, 3, var7, 16777215, co.field_t);
          ((ri) this).b((byte) -66, (vg) (Object) new pg(10, ((ri) this).field_q, ((ri) this).field_x + -20, 25, (vg) (Object) ((ri) this).field_R, false, 80, 3, var7, 16777215, co.field_t));
          ((ri) this).field_q = ((ri) this).field_q + (((vg) (Object) var13).field_n + 5);
          ((ri) this).field_K.field_u = (ko) this;
          if (null == ((ri) this).field_Q) {
            break L13;
          } else {
            ((ri) this).field_Q.field_u = (ko) this;
            break L13;
          }
        }
        L14: {
          if (null == ((ri) this).field_P) {
            break L14;
          } else {
            ((ri) this).field_P.field_u = (ko) this;
            break L14;
          }
        }
        L15: {
          if (null == ((ri) this).field_Q) {
            ((ri) this).field_K.a(((ri) this).field_q, 30, (byte) 106, 8, -6 + (((ri) this).field_x - 10));
            ((ri) this).field_q = ((ri) this).field_q + 35;
            break L15;
          } else {
            ((ri) this).field_K.a(((ri) this).field_q, 30, (byte) 110, 85, ((ri) this).field_x - 95);
            ((ri) this).field_q = ((ri) this).field_q + 60;
            break L15;
          }
        }
        L16: {
          if (null == ((ri) this).field_Q) {
            break L16;
          } else {
            ((ri) this).field_Q.a(((ri) this).field_q, 30, (byte) 115, 8, ((ri) this).field_x + -16);
            ((ri) this).field_q = ((ri) this).field_q + 35;
            break L16;
          }
        }
        L17: {
          if (((ri) this).field_P == null) {
            break L17;
          } else {
            L18: {
              if (((ri) this).field_L) {
                break L18;
              } else {
                if (((ri) this).field_D) {
                  break L18;
                } else {
                  ((ri) this).field_P.a(((ri) this).field_q, 20, (byte) 108, 8, 40);
                  ((ri) this).field_q = ((ri) this).field_q + 25;
                  break L17;
                }
              }
            }
            ((ri) this).field_P.a(((ri) this).field_q, 30, (byte) 124, 8, -10 + ((ri) this).field_x + -6);
            ((ri) this).field_q = ((ri) this).field_q + 35;
            break L17;
          }
        }
        L19: {
          ((ri) this).a(0, ((ri) this).field_q - -3, (byte) 100, 0, ((ri) this).field_x);
          ((ri) this).b((byte) -98, (vg) (Object) ((ri) this).field_K);
          if (null == ((ri) this).field_Q) {
            break L19;
          } else {
            ((ri) this).b((byte) -44, (vg) (Object) ((ri) this).field_Q);
            break L19;
          }
        }
        L20: {
          if (((ri) this).field_P == null) {
            break L20;
          } else {
            ((ri) this).b((byte) -87, (vg) (Object) ((ri) this).field_P);
            break L20;
          }
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (((ri) this).field_K != param0) {
            if (((ri) this).field_Q == param0) {
              cs.a((byte) 115);
              break L0;
            } else {
              if (((ri) this).field_P == param0) {
                if (((ri) this).field_L) {
                  o.a(0);
                  break L0;
                } else {
                  if (((ri) this).field_D) {
                    ol.b((byte) -125);
                    break L0;
                  } else {
                    qc.h(30252);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          } else {
            this.a(-127);
            break L0;
          }
        }
        L1: {
          if (param1 == 6) {
            break L1;
          } else {
            ((ri) this).l(-45);
            break L1;
          }
        }
    }

    public static void a(byte param0) {
        field_M = null;
        field_I = null;
        field_N = null;
        if (param0 > -55) {
            ri.a((byte) 58);
        }
        field_G = null;
    }

    final String d(boolean param0) {
        if (param0) {
            return null;
        }
        if (null == ((ri) this).field_H.field_s) {
            return "";
        }
        return ((ri) this).field_H.field_s;
    }

    final void l(int param0) {
        if (param0 != 8) {
            return;
        }
        ((ri) this).field_H.e(true);
        ((ri) this).field_R.e(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Auto-respond to <%0>";
        field_N = "<%highlight>FLEET MOVEMENT</col> - To issue a fleet order, <%key>click</col> on a <%glossary>system</col> you control that has available fleets, then <%key>click</col> on a destination system. Fleets can make <%highlight>one</col> <%glossary>wormhole</col> jump per turn through hostile territory, but can move an unlimited distance through your own systems. Fleets that are about to move are displayed as a <%highlight>curved arrow</col> between the source and destination system.";
        field_F = 50;
        field_I = null;
        field_M = "Invalid date";
    }
}
