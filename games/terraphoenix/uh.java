/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class uh extends gb implements pa, n {
    private boolean field_O;
    static String[] field_L;
    static String[] field_J;
    private boolean field_Q;
    private eb field_G;
    static int field_P;
    private eb field_K;
    static int field_H;
    private ej field_N;
    private ej field_R;
    private eb field_F;
    private boolean field_M;
    private String field_I;

    final void g(byte param0) {
        ((uh) this).field_N.k(-1);
        ((uh) this).field_R.k(-1);
        if (param0 >= -78) {
            field_L = null;
        }
    }

    final static void a(bm param0, bm param1, int param2, int param3, int param4, int param5) {
        hi.field_ab = param3;
        if (param4 >= -125) {
            return;
        }
        pj.field_q = param1;
        se.field_j = param5;
        dc.field_b = param2;
        sa.field_c = param0;
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        if (super.a(param0, param1, param2 + 0, param3)) {
          return true;
        } else {
          if ((param3 ^ -1) != -99) {
            L0: {
              if (param2 == 30) {
                break L0;
              } else {
                field_H = -39;
                break L0;
              }
            }
            if ((param3 ^ -1) == -100) {
              return ((uh) this).a(param1, (byte) 84);
            } else {
              return false;
            }
          } else {
            return ((uh) this).a(48, param1);
          }
        }
    }

    uh(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (cj) null);
        ic var6 = null;
        pk var7 = null;
        String var8 = null;
        kf var9 = null;
        j var12 = null;
        j var13 = null;
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
        eb stackIn_15_1 = null;
        eb stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        eb stackIn_16_1 = null;
        eb stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        eb stackIn_17_1 = null;
        eb stackIn_17_2 = null;
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
        eb stackOut_14_1 = null;
        eb stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        eb stackOut_16_1 = null;
        eb stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        eb stackOut_15_1 = null;
        eb stackOut_15_2 = null;
        String stackOut_15_3 = null;
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
          ((uh) this).field_Q = stackIn_3_1 != 0;
          ((uh) this).field_I = param1;
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
          ((uh) this).field_M = stackIn_6_1 != 0;
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
          ((uh) this).field_O = stackIn_9_1 != 0;
          if (!((uh) this).field_O) {
            break L3;
          } else {
            L4: {
              if (((uh) this).field_M) {
                break L4;
              } else {
                if (!((uh) this).field_Q) {
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
          ((uh) this).field_N = (ej) (Object) new ib(param0, (sc) this, 100);
          ((uh) this).field_R = (ej) (Object) new ib("", (sc) this, 20);
          if (((uh) this).field_O) {
            ((uh) this).field_F = new eb(rb.field_c, (sc) null);
            ((uh) this).field_G = new eb(ed.field_c, (sc) null);
            ((uh) this).field_N.field_A = false;
            break L5;
          } else {
            L6: {
              ((uh) this).field_F = new eb(ik.field_a, (sc) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (!((uh) this).field_Q) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = gd.field_b;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = aj.field_c;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new eb(stackIn_17_3, (sc) null);
            ((uh) this).field_G = stackIn_17_1;
            if (!((uh) this).field_M) {
              break L5;
            } else {
              ((uh) this).field_K = new eb(td.field_j, (sc) this);
              break L5;
            }
          }
        }
        L7: {
          ((uh) this).field_N.field_l = (cj) (Object) new ng(10000536);
          ((uh) this).field_R.field_l = (cj) (Object) new ah(10000536);
          var6 = new ic();
          ((uh) this).field_F.field_l = (cj) (Object) var6;
          if (null == ((uh) this).field_G) {
            break L7;
          } else {
            ((uh) this).field_G.field_l = (cj) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((uh) this).field_K == null) {
            break L8;
          } else {
            ((uh) this).field_K.field_l = (cj) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((uh) this).field_N.field_x = hi.field_Z;
          if (((uh) this).field_K == null) {
            break L9;
          } else {
            ((uh) this).field_K.field_x = sj.field_d;
            break L9;
          }
        }
        L10: {
          if (((uh) this).field_O) {
            ((uh) this).field_G.field_x = ie.field_c;
            break L10;
          } else {
            if (((uh) this).field_Q) {
              ((uh) this).field_G.field_x = qf.field_b;
              ((uh) this).field_G.field_l = (cj) (Object) new qh();
              break L10;
            } else {
              ((uh) this).field_G.field_l = (cj) (Object) new qh();
              break L10;
            }
          }
        }
        L11: {
          ((uh) this).field_u = 15;
          var7 = qk.field_e;
          if (null == ((uh) this).field_I) {
            break L11;
          } else {
            ((uh) this).field_u = ((uh) this).field_u + (var7.a(((uh) this).field_I, ((uh) this).field_p - 40, var7.field_s) - -5);
            break L11;
          }
        }
        L12: {
          var8 = gb.field_D;
          var9 = vk.a(false, dg.a(false));
          if (var9 == te.field_g) {
            var8 = ed.field_b;
            break L12;
          } else {
            if (gf.field_u != var9) {
              break L12;
            } else {
              var8 = mm.field_a;
              break L12;
            }
          }
        }
        L13: {
          var12 = new j(10, ((uh) this).field_u, ((uh) this).field_p - 20, 25, (gl) (Object) ((uh) this).field_N, false, 80, 3, var7, 16777215, var8);
          ((uh) this).b((byte) 95, (gl) (Object) new j(10, ((uh) this).field_u, ((uh) this).field_p - 20, 25, (gl) (Object) ((uh) this).field_N, false, 80, 3, var7, 16777215, var8));
          ((uh) this).field_u = ((uh) this).field_u + (((gl) (Object) var12).field_n - -5);
          var13 = new j(10, ((uh) this).field_u, ((uh) this).field_p + -20, 25, (gl) (Object) ((uh) this).field_R, false, 80, 3, var7, 16777215, eb.field_E);
          ((uh) this).b((byte) 95, (gl) (Object) new j(10, ((uh) this).field_u, ((uh) this).field_p + -20, 25, (gl) (Object) ((uh) this).field_R, false, 80, 3, var7, 16777215, eb.field_E));
          ((uh) this).field_F.field_r = (sc) this;
          ((uh) this).field_u = ((uh) this).field_u + (((gl) (Object) var13).field_n + 5);
          if (null == ((uh) this).field_K) {
            break L13;
          } else {
            ((uh) this).field_K.field_r = (sc) this;
            break L13;
          }
        }
        L14: {
          if (null == ((uh) this).field_G) {
            break L14;
          } else {
            ((uh) this).field_G.field_r = (sc) this;
            break L14;
          }
        }
        L15: {
          if (null != ((uh) this).field_K) {
            ((uh) this).field_F.a(((uh) this).field_u, (byte) 83, -95 + ((uh) this).field_p, 85, 30);
            ((uh) this).field_u = ((uh) this).field_u + 60;
            break L15;
          } else {
            ((uh) this).field_F.a(((uh) this).field_u, (byte) 94, -10 + (-6 + ((uh) this).field_p), 8, 30);
            ((uh) this).field_u = ((uh) this).field_u + 35;
            break L15;
          }
        }
        L16: {
          if (((uh) this).field_K == null) {
            break L16;
          } else {
            ((uh) this).field_K.a(((uh) this).field_u, (byte) 83, -10 + (-6 + ((uh) this).field_p), 8, 30);
            ((uh) this).field_u = ((uh) this).field_u + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((uh) this).field_G) {
            break L17;
          } else {
            L18: {
              if (((uh) this).field_O) {
                break L18;
              } else {
                if (!((uh) this).field_Q) {
                  ((uh) this).field_G.a(((uh) this).field_u, (byte) 99, 40, 8, 20);
                  ((uh) this).field_u = ((uh) this).field_u + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((uh) this).field_G.a(((uh) this).field_u, (byte) 94, -10 + (((uh) this).field_p - 6), 8, 30);
            ((uh) this).field_u = ((uh) this).field_u + 35;
            break L17;
          }
        }
        L19: {
          ((uh) this).a(0, (byte) 93, ((uh) this).field_p, 0, 3 + ((uh) this).field_u);
          ((uh) this).b((byte) 95, (gl) (Object) ((uh) this).field_F);
          if (((uh) this).field_K == null) {
            break L19;
          } else {
            ((uh) this).b((byte) 95, (gl) (Object) ((uh) this).field_K);
            break L19;
          }
        }
        L20: {
          if (((uh) this).field_G == null) {
            break L20;
          } else {
            ((uh) this).b((byte) 95, (gl) (Object) ((uh) this).field_G);
            break L20;
          }
        }
    }

    public static void a(int param0) {
        field_L = null;
        if (param0 != 8) {
            Object var2 = null;
            uh.a((bm) null, (bm) null, 103, -96, 28, 84);
        }
        field_J = null;
    }

    public final void a(ej param0, boolean param1) {
        if (param1) {
            ((uh) this).g((byte) 36);
        }
        if (!(((uh) this).field_N != param0)) {
            boolean discarded$0 = ((uh) this).field_R.a((byte) 17, (gl) this);
        }
        if (((uh) this).field_R == param0) {
            this.f((byte) 121);
        }
    }

    public final void a(ej param0, byte param1) {
        if (param1 != 83) {
            uh.a(-1);
        }
    }

    final String d(boolean param0) {
        if (!(((uh) this).field_N.field_o != null)) {
            return "";
        }
        if (param0) {
            return null;
        }
        return ((uh) this).field_N.field_o;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        CharSequence var3 = null;
        L0: {
          if (param0 == -31312) {
            break L0;
          } else {
            String discarded$2 = uh.a(116, 56, '￾');
            break L0;
          }
        }
        var2 = param1.getParameter("username");
        if (var2 != null) {
          var3 = (CharSequence) (Object) var2;
          if (0L == qd.a(-82, var3)) {
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(String param0, int param1) {
        ej var3 = ((uh) this).field_N;
        String var4 = param0;
        var3.a(false, (byte) -128, var4);
        ((uh) this).field_R.k(param1);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(null == ((uh) this).field_I)) {
            int discarded$0 = qk.field_e.a(((uh) this).field_I, ((uh) this).field_w + param0 + 20, ((uh) this).field_u + (param3 - -15), -40 + ((uh) this).field_p, ((uh) this).field_n, 16777215, -1, 1, 0, qk.field_e.field_s);
        }
        if (!(((uh) this).field_K == null)) {
            l.d(param0 + 10, param3 - -134, ((uh) this).field_p - 20, 4210752);
        }
        if (param1 > -106) {
            ((uh) this).field_R = null;
        }
        super.a(param0, -118, param2, param3);
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Terraphoenix.field_V;
          if (param0 != ((uh) this).field_F) {
            if (param0 != ((uh) this).field_K) {
              if (((uh) this).field_G != param0) {
                break L0;
              } else {
                if (((uh) this).field_O) {
                  si.m(-74);
                  break L0;
                } else {
                  if (((uh) this).field_Q) {
                    fd.c(-24);
                    break L0;
                  } else {
                    ie.a(4);
                    break L0;
                  }
                }
              }
            } else {
              oe.a(-110);
              break L0;
            }
          } else {
            this.f((byte) 112);
            break L0;
          }
        }
        var6 = -66 % ((-5 - param4) / 57);
    }

    private final void f(byte param0) {
        if (param0 < 77) {
            ((uh) this).a(-35, 9, -77, 87);
        }
        if (!ja.a(true)) {
            // if_icmpge L79
            // ifgt L60
        } else {
            ae.a(((uh) this).field_R.field_o, (byte) 75, ((uh) this).field_N.field_o);
        }
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = Terraphoenix.field_V;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = param0; param1 > var4; var4++) {
            var6[var4] = param2;
        }
        return new String(var6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_P = 0;
        field_L = new String[]{"Pistol", "Shotgun", "Automatic Rifle", "Submachine Gun", "Rocket Launcher", "Grenade", "Laser Cannon", "Miniturised Laser", "Pulse Pistol", "Pulse Gun", "Pulse Carbine", "Pulse Grenade", "Fusion Pistol", "Fusion Gun", "Fusion Cannon", "Fusion Launcher", "Fusion Rifle", "Shield Module", "Light Machine Gun", "", ""};
    }
}
