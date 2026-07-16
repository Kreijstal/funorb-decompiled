/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class pd extends wj implements sv, vh {
    private ga field_J;
    private ga field_N;
    private wi field_K;
    private boolean field_C;
    private wi field_F;
    private boolean field_H;
    static Random field_E;
    private wi field_L;
    private String field_D;
    private boolean field_I;
    static ew field_G;
    static int[] field_B;
    static String[] field_M;

    final void h(byte param0) {
        ((pd) this).field_N.i((byte) -55);
        ((pd) this).field_J.i((byte) -70);
        if (param0 >= -65) {
            ((pd) this).field_C = false;
        }
    }

    private final void l(int param0) {
        L0: {
          L1: {
            if (cd.a(3)) {
              break L1;
            } else {
              if (((pd) this).field_N.field_q.length() <= 0) {
                break L0;
              } else {
                if ((((pd) this).field_J.field_q.length() ^ -1) >= -1) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ss.a(((pd) this).field_J.field_q, (byte) -118, ((pd) this).field_N.field_q);
          break L0;
        }
        L2: {
          if (param0 == 60) {
            break L2;
          } else {
            field_E = null;
            break L2;
          }
        }
    }

    final static void a(ut param0, int param1) {
        if (ih.field_c == 0) {
            return;
        }
        if (param1 != 20684) {
            field_B = null;
        }
        double[] var3 = oh.field_a[ih.field_c];
        double[] var2 = var3;
        nh.a(param0, var3[0], var3[1], var3[2]);
    }

    final static void a(byte param0, int param1, sm param2) {
        if (param0 != 70) {
            pd.a((byte) -2);
        }
        ia.field_d.a((gn) (Object) param2, param0 + -67);
        mp.a(125, param1, param2);
    }

    public final void a(int param0, ga param1) {
        if (!(((pd) this).field_N != param1)) {
            boolean discarded$0 = ((pd) this).field_J.a((fd) this, 0);
        }
        if (((pd) this).field_J == param1) {
            this.l(60);
        }
        int var3 = 35 / ((param0 - 8) / 47);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(((pd) this).field_D == null)) {
            int discarded$0 = gf.field_a.a(((pd) this).field_D, 20 + param2 - -((pd) this).field_t, 15 + param3 + ((pd) this).field_g, -40 + ((pd) this).field_n, ((pd) this).field_i, 16777215, -1, 1, 0, gf.field_a.field_G);
        }
        if (!(null == ((pd) this).field_L)) {
            on.f(param2 - -10, param3 + 134, -20 + ((pd) this).field_n, 4210752);
        }
        super.a(param0, (int) (char)param1, param2, param3);
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        int var7 = Kickabout.field_G;
        if (param1 == ((pd) this).field_K) {
            this.l(60);
        } else {
            if (((pd) this).field_L == param1) {
                fr.a((byte) -76);
            } else {
                if (((pd) this).field_F != param1) {
                } else {
                    if (((pd) this).field_H) {
                        uv.a(false);
                    } else {
                        if (!((pd) this).field_C) {
                            iw.g(4);
                        } else {
                            jk.a((byte) -124);
                        }
                    }
                }
            }
        }
        if (param3 < 64) {
            field_B = null;
        }
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        if (param1 > -60) {
            ((pd) this).field_H = true;
        }
        if (!(!super.a(param0, (byte) -62, param2, param3))) {
            return true;
        }
        if (!(param3 != 98)) {
            return ((pd) this).a(param2, (byte) -100);
        }
        if ((param3 ^ -1) == -100) {
            return ((pd) this).b(param2, (byte) 126);
        }
        return false;
    }

    final void a(String param0, byte param1) {
        ga var3 = ((pd) this).field_N;
        String var4 = param0;
        int var5 = 25 % ((33 - param1) / 48);
        var3.a(var4, (byte) -17, false);
        ((pd) this).field_J.i((byte) -41);
    }

    public static void k(int param0) {
        if (param0 != -11203) {
            field_E = null;
        }
        field_B = null;
        field_E = null;
        field_G = null;
        field_M = null;
    }

    public final void a(byte param0, ga param1) {
        if (param0 < 65) {
            ((pd) this).h((byte) -105);
        }
    }

    pd(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (gj) null);
        op var6 = null;
        hu var7 = null;
        String var8 = null;
        vl var9 = null;
        cg var12 = null;
        cg var13 = null;
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
        wi stackIn_16_1 = null;
        wi stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        wi stackIn_17_1 = null;
        wi stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        wi stackIn_18_1 = null;
        wi stackIn_18_2 = null;
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
        wi stackOut_15_1 = null;
        wi stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        wi stackOut_17_1 = null;
        wi stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        wi stackOut_16_1 = null;
        wi stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          ((pd) this).field_D = param1;
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
          ((pd) this).field_C = stackIn_3_1 != 0;
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
          ((pd) this).field_I = stackIn_6_1 != 0;
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
          ((pd) this).field_H = stackIn_9_1 != 0;
          if (!((pd) this).field_H) {
            break L3;
          } else {
            L4: {
              if (((pd) this).field_I) {
                break L4;
              } else {
                if (!((pd) this).field_C) {
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
          ((pd) this).field_N = (ga) (Object) new mr(param0, (jv) this, 100);
          ((pd) this).field_J = (ga) (Object) new mr("", (jv) this, 20);
          if (!((pd) this).field_H) {
            L6: {
              ((pd) this).field_K = new wi(ju.field_P, (jv) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((pd) this).field_C) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = is.field_f;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = ba.field_o;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            ((pd) this).field_F = new wi(stackIn_18_3, (jv) null);
            if (!((pd) this).field_I) {
              break L5;
            } else {
              ((pd) this).field_L = new wi(dw.field_f, (jv) this);
              break L5;
            }
          } else {
            ((pd) this).field_K = new wi(bt.field_d, (jv) null);
            ((pd) this).field_F = new wi(bv.field_o, (jv) null);
            ((pd) this).field_N.field_y = false;
            break L5;
          }
        }
        L7: {
          ((pd) this).field_N.field_r = (gj) (Object) new ri(10000536);
          ((pd) this).field_J.field_r = (gj) (Object) new rp(10000536);
          var6 = new op();
          ((pd) this).field_K.field_r = (gj) (Object) var6;
          if (((pd) this).field_F == null) {
            break L7;
          } else {
            ((pd) this).field_F.field_r = (gj) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((pd) this).field_N.field_u = mf.field_yb;
          if (null == ((pd) this).field_L) {
            break L8;
          } else {
            ((pd) this).field_L.field_r = (gj) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((pd) this).field_L) {
            break L9;
          } else {
            ((pd) this).field_L.field_u = so.field_c;
            break L9;
          }
        }
        L10: {
          if (!((pd) this).field_H) {
            if (!((pd) this).field_C) {
              ((pd) this).field_F.field_r = (gj) (Object) new cr();
              break L10;
            } else {
              ((pd) this).field_F.field_u = pv.field_G;
              ((pd) this).field_F.field_r = (gj) (Object) new cr();
              break L10;
            }
          } else {
            ((pd) this).field_F.field_u = kd.field_x;
            break L10;
          }
        }
        L11: {
          ((pd) this).field_g = 15;
          var7 = gf.field_a;
          if (((pd) this).field_D == null) {
            break L11;
          } else {
            ((pd) this).field_g = ((pd) this).field_g + (5 + var7.c(((pd) this).field_D, -40 + ((pd) this).field_n, var7.field_G));
            break L11;
          }
        }
        L12: {
          var8 = ne.field_J;
          var9 = lm.a(so.a(104), -7465);
          if (pb.field_F == var9) {
            var8 = uj.field_A;
            break L12;
          } else {
            if (var9 != ae.field_I) {
              break L12;
            } else {
              var8 = q.field_c;
              break L12;
            }
          }
        }
        L13: {
          cg dupTemp$2 = new cg(10, ((pd) this).field_g, -20 + ((pd) this).field_n, 25, (fd) (Object) ((pd) this).field_N, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$2;
          ((pd) this).a(-120, (fd) (Object) dupTemp$2);
          ((pd) this).field_g = ((pd) this).field_g + (((fd) (Object) var12).field_i - -5);
          cg dupTemp$3 = new cg(10, ((pd) this).field_g, -20 + ((pd) this).field_n, 25, (fd) (Object) ((pd) this).field_J, false, 80, 3, var7, 16777215, at.field_Ib);
          var13 = dupTemp$3;
          ((pd) this).a(-55, (fd) (Object) dupTemp$3);
          ((pd) this).field_K.field_k = (jv) this;
          ((pd) this).field_g = ((pd) this).field_g + (((fd) (Object) var13).field_i + 5);
          if (((pd) this).field_L == null) {
            break L13;
          } else {
            ((pd) this).field_L.field_k = (jv) this;
            break L13;
          }
        }
        L14: {
          if (null == ((pd) this).field_F) {
            break L14;
          } else {
            ((pd) this).field_F.field_k = (jv) this;
            break L14;
          }
        }
        L15: {
          if (((pd) this).field_L == null) {
            ((pd) this).field_K.a(30, 1, 8, -10 + (-6 + ((pd) this).field_n), ((pd) this).field_g);
            ((pd) this).field_g = ((pd) this).field_g + 35;
            break L15;
          } else {
            ((pd) this).field_K.a(30, 1, 85, -95 + ((pd) this).field_n, ((pd) this).field_g);
            ((pd) this).field_g = ((pd) this).field_g + 60;
            break L15;
          }
        }
        L16: {
          if (null == ((pd) this).field_L) {
            break L16;
          } else {
            ((pd) this).field_L.a(30, 1, 8, -16 + ((pd) this).field_n, ((pd) this).field_g);
            ((pd) this).field_g = ((pd) this).field_g + 35;
            break L16;
          }
        }
        L17: {
          if (((pd) this).field_F == null) {
            break L17;
          } else {
            L18: {
              if (((pd) this).field_H) {
                break L18;
              } else {
                if (((pd) this).field_C) {
                  break L18;
                } else {
                  ((pd) this).field_F.a(20, 1, 8, 40, ((pd) this).field_g);
                  ((pd) this).field_g = ((pd) this).field_g + 25;
                  break L17;
                }
              }
            }
            ((pd) this).field_F.a(30, 1, 8, -10 + (((pd) this).field_n - 6), ((pd) this).field_g);
            ((pd) this).field_g = ((pd) this).field_g + 35;
            break L17;
          }
        }
        L19: {
          ((pd) this).a(((pd) this).field_g - -3, 1, 0, ((pd) this).field_n, 0);
          ((pd) this).a(-63, (fd) (Object) ((pd) this).field_K);
          if (null == ((pd) this).field_L) {
            break L19;
          } else {
            ((pd) this).a(-42, (fd) (Object) ((pd) this).field_L);
            break L19;
          }
        }
        L20: {
          if (((pd) this).field_F == null) {
            break L20;
          } else {
            ((pd) this).a(-82, (fd) (Object) ((pd) this).field_F);
            break L20;
          }
        }
    }

    final String a(int param0) {
        if (param0 <= 84) {
            Object var3 = null;
            boolean discarded$0 = ((pd) this).a('f', (byte) 111, (fd) null, -119);
        }
        if (!(null != ((pd) this).field_N.field_q)) {
            return "";
        }
        return ((pd) this).field_N.field_q;
    }

    final static void a(byte param0) {
        int var7 = 0;
        kg[] var8 = null;
        kg[] var9 = null;
        int var10 = Kickabout.field_G;
        ut var12 = j.a(param0 ^ 5332);
        int var2 = b.c(param0 ^ 62, -var12.field_o - 15 - -120);
        int var3 = b.c(-54, 10 + var12.field_o * 3 + -15);
        int var4 = var12.field_v;
        int var5 = 6 * fp.field_f >> -1033728664;
        int var6 = -15;
        if (param0 != -79) {
            Object var11 = null;
            pd.a((byte) -91, 14, (sm) null);
        }
        for (var7 = 0; (var7 ^ -1) > -5; var7++) {
            var8 = (var7 & 1) != 0 ? am.field_h : hl.field_e;
            var9 = -1 == (var7 & 1 ^ -1) ? hq.field_e : ub.field_G;
            wf.a(-840618968, var2, var8[var5], go.a(var6, (byte) -56));
            wf.a(-840618968, var3, var9[var5], go.a(var6, (byte) -56));
            var6 = var6 + var4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new Random();
        field_B = new int[4];
        field_B[1] = 3385873;
        field_B[0] = 30651;
        field_B[3] = 16776960;
        field_B[2] = 13369344;
    }
}
