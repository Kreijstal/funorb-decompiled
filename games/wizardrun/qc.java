/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qc extends pe implements fj, qd {
    private boolean field_O;
    private boolean field_P;
    private og field_Q;
    private pl field_M;
    static o[] field_E;
    private String field_F;
    private pl field_G;
    private boolean field_J;
    private og field_K;
    static String field_N;
    static String field_I;
    static int field_L;
    private pl field_H;

    final void a(int param0, String param1) {
        og var3 = ((qc) this).field_K;
        if (param0 != 5990) {
            field_E = null;
        }
        String var4 = param1;
        var3.a(-1, false, var4);
        ((qc) this).field_Q.e(true);
    }

    public final void a(og param0, int param1) {
        if (param1 != 5) {
            Object var4 = null;
            ((qc) this).a(56, (pl) null, 121, 39, 55);
        }
    }

    private final void a(int param0) {
        if (param0 != 4210752) {
          return;
        } else {
          L0: {
            L1: {
              if (qi.d(-1)) {
                break L1;
              } else {
                if (0 >= ((qc) this).field_K.field_k.length()) {
                  break L0;
                } else {
                  if (((qc) this).field_Q.field_k.length() <= 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            w.a(((qc) this).field_Q.field_k, ((qc) this).field_K.field_k, -124);
            break L0;
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (((qc) this).field_F != null) {
            int discarded$0 = gh.field_b.a(((qc) this).field_F, 20 + (param0 - -((qc) this).field_o), 15 + (((qc) this).field_l + param3), ((qc) this).field_r - 40, ((qc) this).field_n, 16777215, -1, 1, 0, gh.field_b.field_M);
        }
        if (!(null == ((qc) this).field_M)) {
            ed.f(10 + param0, 134 + param3, ((qc) this).field_r + -20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        if (!(!param0.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (param1 != -39) {
            return null;
        }
        if (param0.equals((Object) (Object) "I")) {
            return Integer.TYPE;
        }
        if (param0.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "Z"))) {
            return Boolean.TYPE;
        }
        if (param0.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (param0.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param0);
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        if (super.a(param0, param1, (byte) -125, param3)) {
          return true;
        } else {
          if (param1 != 98) {
            if (param2 <= -96) {
              if (param1 == 99) {
                return ((qc) this).b(param3, 1);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return ((qc) this).a((byte) -117, param3);
          }
        }
    }

    public final void a(int param0, og param1) {
        if (((qc) this).field_K == param1) {
            boolean discarded$0 = ((qc) this).field_Q.a((ub) this, 8);
        }
        if (!(((qc) this).field_Q != param1)) {
            this.a(4210752);
        }
        if (param0 > -111) {
            ((qc) this).field_O = false;
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = wizardrun.field_H;
          if (param0 == -18905) {
            break L0;
          } else {
            field_E = null;
            break L0;
          }
        }
        L1: {
          if (((qc) this).field_H == param1) {
            this.a(4210752);
            break L1;
          } else {
            if (((qc) this).field_M != param1) {
              if (((qc) this).field_G != param1) {
                break L1;
              } else {
                if (((qc) this).field_J) {
                  ea.c(param0 ^ 12849);
                  break L1;
                } else {
                  if (!((qc) this).field_O) {
                    sf.a((byte) -89);
                    break L1;
                  } else {
                    pg.a((byte) -97);
                    break L1;
                  }
                }
              }
            } else {
              w.b(param0 ^ 18904);
              break L1;
            }
          }
        }
    }

    final void h(int param0) {
        ((qc) this).field_K.e(true);
        ((qc) this).field_Q.e(true);
        int var2 = 127 % ((-20 - param0) / 50);
    }

    qc(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (bf) null);
        jl var6 = null;
        vd var7 = null;
        String var8 = null;
        uf var9 = null;
        ik var12 = null;
        ik var13 = null;
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
        pl stackIn_16_1 = null;
        pl stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        pl stackIn_17_1 = null;
        pl stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        pl stackIn_18_1 = null;
        pl stackIn_18_2 = null;
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
        pl stackOut_15_1 = null;
        pl stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        pl stackOut_17_1 = null;
        pl stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        pl stackOut_16_1 = null;
        pl stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          ((qc) this).field_F = param1;
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
          ((qc) this).field_O = stackIn_3_1 != 0;
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
          ((qc) this).field_J = stackIn_6_1 != 0;
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
          ((qc) this).field_P = stackIn_9_1 != 0;
          if (!((qc) this).field_J) {
            break L3;
          } else {
            L4: {
              if (((qc) this).field_P) {
                break L4;
              } else {
                if (!((qc) this).field_O) {
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
          ((qc) this).field_K = (og) (Object) new p(param0, (ce) this, 100);
          ((qc) this).field_Q = (og) (Object) new p("", (ce) this, 20);
          if (!((qc) this).field_J) {
            L6: {
              ((qc) this).field_H = new pl(dj.field_a, (ce) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((qc) this).field_O) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = ti.field_h;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = th.field_b;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new pl(stackIn_18_3, (ce) null);
            ((qc) this).field_G = stackIn_18_1;
            if (!((qc) this).field_P) {
              break L5;
            } else {
              ((qc) this).field_M = new pl(qk.field_h, (ce) this);
              break L5;
            }
          } else {
            ((qc) this).field_H = new pl(me.field_a, (ce) null);
            ((qc) this).field_G = new pl(pk.field_q, (ce) null);
            ((qc) this).field_K.field_B = false;
            break L5;
          }
        }
        L7: {
          ((qc) this).field_K.field_w = (bf) (Object) new qb(10000536);
          ((qc) this).field_Q.field_w = (bf) (Object) new ke(10000536);
          var6 = new jl();
          ((qc) this).field_H.field_w = (bf) (Object) var6;
          if (null == ((qc) this).field_G) {
            break L7;
          } else {
            ((qc) this).field_G.field_w = (bf) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((qc) this).field_M == null) {
            break L8;
          } else {
            ((qc) this).field_M.field_w = (bf) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((qc) this).field_K.field_p = tf.field_a;
          if (((qc) this).field_M == null) {
            break L9;
          } else {
            ((qc) this).field_M.field_p = hb.field_i;
            break L9;
          }
        }
        L10: {
          if (!((qc) this).field_J) {
            if (((qc) this).field_O) {
              ((qc) this).field_G.field_p = hf.field_a;
              ((qc) this).field_G.field_w = (bf) (Object) new tk();
              break L10;
            } else {
              ((qc) this).field_G.field_w = (bf) (Object) new tk();
              break L10;
            }
          } else {
            ((qc) this).field_G.field_p = sh.field_a;
            break L10;
          }
        }
        L11: {
          ((qc) this).field_l = 15;
          var7 = gh.field_b;
          if (null == ((qc) this).field_F) {
            break L11;
          } else {
            ((qc) this).field_l = ((qc) this).field_l + (5 + var7.a(((qc) this).field_F, -40 + ((qc) this).field_r, var7.field_M));
            break L11;
          }
        }
        L12: {
          var8 = ai.field_j;
          var9 = jf.a(jg.f(1), (byte) 48);
          if (var9 == hd.field_C) {
            var8 = dc.field_q;
            break L12;
          } else {
            if (var9 != jf.field_e) {
              break L12;
            } else {
              var8 = tl.field_b;
              break L12;
            }
          }
        }
        L13: {
          var12 = new ik(10, ((qc) this).field_l, -20 + ((qc) this).field_r, 25, (ub) (Object) ((qc) this).field_K, false, 80, 3, var7, 16777215, var8);
          ((qc) this).a((ub) (Object) new ik(10, ((qc) this).field_l, -20 + ((qc) this).field_r, 25, (ub) (Object) ((qc) this).field_K, false, 80, 3, var7, 16777215, var8), (byte) 57);
          ((qc) this).field_l = ((qc) this).field_l + (5 + ((ub) (Object) var12).field_n);
          var13 = new ik(10, ((qc) this).field_l, -20 + ((qc) this).field_r, 25, (ub) (Object) ((qc) this).field_Q, false, 80, 3, var7, 16777215, qk.field_d);
          ((qc) this).a((ub) (Object) new ik(10, ((qc) this).field_l, -20 + ((qc) this).field_r, 25, (ub) (Object) ((qc) this).field_Q, false, 80, 3, var7, 16777215, qk.field_d), (byte) 85);
          ((qc) this).field_l = ((qc) this).field_l + (5 + ((ub) (Object) var13).field_n);
          ((qc) this).field_H.field_s = (ce) this;
          if (((qc) this).field_M == null) {
            break L13;
          } else {
            ((qc) this).field_M.field_s = (ce) this;
            break L13;
          }
        }
        L14: {
          if (((qc) this).field_G == null) {
            break L14;
          } else {
            ((qc) this).field_G.field_s = (ce) this;
            break L14;
          }
        }
        L15: {
          if (((qc) this).field_M != null) {
            ((qc) this).field_H.a(118, ((qc) this).field_l, 30, ((qc) this).field_r + -95, 85);
            ((qc) this).field_l = ((qc) this).field_l + 60;
            break L15;
          } else {
            ((qc) this).field_H.a(118, ((qc) this).field_l, 30, -10 + (((qc) this).field_r - 6), 8);
            ((qc) this).field_l = ((qc) this).field_l + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((qc) this).field_M) {
            break L16;
          } else {
            ((qc) this).field_M.a(121, ((qc) this).field_l, 30, ((qc) this).field_r + -16, 8);
            ((qc) this).field_l = ((qc) this).field_l + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((qc) this).field_G) {
            break L17;
          } else {
            L18: {
              if (((qc) this).field_J) {
                break L18;
              } else {
                if (((qc) this).field_O) {
                  break L18;
                } else {
                  ((qc) this).field_G.a(121, ((qc) this).field_l, 20, 40, 8);
                  ((qc) this).field_l = ((qc) this).field_l + 25;
                  break L17;
                }
              }
            }
            ((qc) this).field_G.a(110, ((qc) this).field_l, 30, -10 + (-6 + ((qc) this).field_r), 8);
            ((qc) this).field_l = ((qc) this).field_l + 35;
            break L17;
          }
        }
        L19: {
          ((qc) this).a(110, 0, ((qc) this).field_l + 3, ((qc) this).field_r, 0);
          ((qc) this).a((ub) (Object) ((qc) this).field_H, (byte) 84);
          if (null == ((qc) this).field_M) {
            break L19;
          } else {
            ((qc) this).a((ub) (Object) ((qc) this).field_M, (byte) 126);
            break L19;
          }
        }
        L20: {
          if (((qc) this).field_G == null) {
            break L20;
          } else {
            ((qc) this).a((ub) (Object) ((qc) this).field_G, (byte) 58);
            break L20;
          }
        }
    }

    final static void a(int param0, int param1, int param2, vh param3, int param4, String param5, boolean param6, int param7, int param8) {
        he.field_q = param1;
        ej.field_d = param8;
        fg.field_c = param4;
        pg.field_j = param7;
        if (!param6) {
          return;
        } else {
          vk.field_p = param3;
          kj.field_a = param0;
          nf.field_b = param2;
          aa.field_hb = param5;
          ii.field_f = (na) (Object) new sl();
          ig.field_q = new cd(param3);
          wi.field_L = new ad(ii.field_f, ig.field_q);
          return;
        }
    }

    public static void g(int param0) {
        field_N = null;
        if (param0 != -6664) {
            field_L = 3;
        }
        field_E = null;
        field_I = null;
    }

    final String d(boolean param0) {
        if (param0) {
            return null;
        }
        if (!(((qc) this).field_K.field_k != null)) {
            return "";
        }
        return ((qc) this).field_K.field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Sound         ";
    }
}
