/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qm extends se implements fi, in {
    static String field_I;
    private pm field_M;
    private boolean field_L;
    private gn field_P;
    private gn field_J;
    private boolean field_K;
    static String field_N;
    private pm field_H;
    private gn field_G;
    private boolean field_Q;
    private String field_O;

    final void a(int param0, String param1) {
        int var3 = 62 / ((-46 - param0) / 51);
        pm var4 = ((qm) this).field_H;
        String var5 = param1;
        var4.a(false, var5, (byte) 119);
        ((qm) this).field_M.b(true);
    }

    final static void a(jh param0, boolean param1, String param2, int param3) {
        jb var7 = null;
        String var8 = null;
        String var10 = null;
        jb var11 = null;
        String var12 = null;
        jb var9 = null;
        ve.a(0L, 196, (String) null, ek.field_H, (String) null, (cj) (Object) param0, -1, (int[]) null, param0.i(6));
        if (param0.field_Fb) {
            if (param0.field_fc != 2) {
                // if_icmplt L94
            }
            var7 = pk.field_b;
            var8 = vl.a(wj.field_f, new String[1], 2);
            var7.field_j.a((byte) -118, var8, 10);
        }
        pk.field_b.a((byte) -120);
        if (!param1) {
        } else {
            if (ao.field_e != pk.field_b.field_b) {
                var9 = pk.field_b;
                var10 = vl.a(kj.field_f, new String[1], 2);
                var9.field_j.a((byte) -118, var10, 15);
            } else {
                var11 = pk.field_b;
                var12 = vl.a(ag.field_g, new String[1], 2);
                var11.field_j.a((byte) -118, var12, 16);
            }
        }
        jb var13 = pk.field_b;
        int var5 = vb.field_f;
        if (param3 >= -117) {
            field_I = null;
        }
        int var6 = ka.field_t;
        var13.field_j.b(4542, var5, 0, var6, 0);
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param3 >= -83) {
          return;
        } else {
          L0: {
            if (((qm) this).field_G == param2) {
              this.a((byte) -95);
              break L0;
            } else {
              if (((qm) this).field_P == param2) {
                hb.a(0);
                break L0;
              } else {
                if (param2 == ((qm) this).field_J) {
                  if (!((qm) this).field_K) {
                    if (!((qm) this).field_L) {
                      qi.a(false);
                      break L0;
                    } else {
                      dq.c(-118);
                      break L0;
                    }
                  } else {
                    oi.a(-124);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != ((qm) this).field_O) {
            int discarded$0 = ke.field_h.a(((qm) this).field_O, param3 - (-((qm) this).field_y + -20), 15 + (((qm) this).field_i + param1), ((qm) this).field_n - 40, ((qm) this).field_w, 16777215, -1, 1, 0, ke.field_h.field_C);
        }
        if (null != ((qm) this).field_P) {
            oo.b(param3 + 10, param1 - -134, -20 + ((qm) this).field_n, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final String h(int param0) {
        if (param0 != 6728) {
            return null;
        }
        if (!(null != ((qm) this).field_H.field_j)) {
            return "";
        }
        return ((qm) this).field_H.field_j;
    }

    final void g(byte param0) {
        ((qm) this).field_H.b(true);
        if (param0 < 101) {
            Object var3 = null;
            boolean discarded$0 = ((qm) this).a(39, '￟', (cf) null, 8);
        }
        ((qm) this).field_M.b(true);
    }

    qm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (nl) null);
        oq var6 = null;
        fm var7 = null;
        String var8 = null;
        bo var9 = null;
        el var12 = null;
        el var13 = null;
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
        gn stackIn_16_1 = null;
        gn stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        gn stackIn_17_1 = null;
        gn stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        gn stackIn_18_1 = null;
        gn stackIn_18_2 = null;
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
        gn stackOut_15_1 = null;
        gn stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        gn stackOut_17_1 = null;
        gn stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        gn stackOut_16_1 = null;
        gn stackOut_16_2 = null;
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
          ((qm) this).field_Q = stackIn_3_1 != 0;
          ((qm) this).field_O = param1;
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
          ((qm) this).field_L = stackIn_6_1 != 0;
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
          ((qm) this).field_K = stackIn_9_1 != 0;
          if (!((qm) this).field_K) {
            break L3;
          } else {
            L4: {
              if (((qm) this).field_Q) {
                break L4;
              } else {
                if (!((qm) this).field_L) {
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
          ((qm) this).field_H = (pm) (Object) new on(param0, (bj) this, 100);
          ((qm) this).field_M = (pm) (Object) new on("", (bj) this, 20);
          if (!((qm) this).field_K) {
            L6: {
              ((qm) this).field_G = new gn(qo.field_s, (bj) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((qm) this).field_L) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = sn.field_Zb;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = gf.field_a;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new gn(stackIn_18_3, (bj) null);
            ((qm) this).field_J = stackIn_18_1;
            if (!((qm) this).field_Q) {
              break L5;
            } else {
              ((qm) this).field_P = new gn(en.field_a, (bj) this);
              break L5;
            }
          } else {
            ((qm) this).field_G = new gn(ci.field_g, (bj) null);
            ((qm) this).field_J = new gn(oe.field_b, (bj) null);
            ((qm) this).field_H.field_F = false;
            break L5;
          }
        }
        L7: {
          ((qm) this).field_H.field_h = (nl) (Object) new tb(10000536);
          ((qm) this).field_M.field_h = (nl) (Object) new m(10000536);
          var6 = new oq();
          ((qm) this).field_G.field_h = (nl) (Object) var6;
          if (((qm) this).field_J == null) {
            break L7;
          } else {
            ((qm) this).field_J.field_h = (nl) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (null == ((qm) this).field_P) {
            break L8;
          } else {
            ((qm) this).field_P.field_h = (nl) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((qm) this).field_H.field_x = lh.field_e;
          if (null == ((qm) this).field_P) {
            break L9;
          } else {
            ((qm) this).field_P.field_x = field_I;
            break L9;
          }
        }
        L10: {
          if (((qm) this).field_K) {
            ((qm) this).field_J.field_x = gi.field_p;
            break L10;
          } else {
            if (((qm) this).field_L) {
              ((qm) this).field_J.field_x = de.field_a;
              ((qm) this).field_J.field_h = (nl) (Object) new he();
              break L10;
            } else {
              ((qm) this).field_J.field_h = (nl) (Object) new he();
              break L10;
            }
          }
        }
        L11: {
          ((qm) this).field_i = 15;
          var7 = ke.field_h;
          if (null == ((qm) this).field_O) {
            break L11;
          } else {
            ((qm) this).field_i = ((qm) this).field_i + (var7.a(((qm) this).field_O, ((qm) this).field_n - 40, var7.field_C) - -5);
            break L11;
          }
        }
        L12: {
          var8 = sh.field_M;
          var9 = me.a(-57, jl.b(0));
          if (wp.field_b != var9) {
            if (l.field_c != var9) {
              break L12;
            } else {
              var8 = lj.field_f;
              break L12;
            }
          } else {
            var8 = fa.field_Gb;
            break L12;
          }
        }
        L13: {
          var12 = new el(10, ((qm) this).field_i, -20 + ((qm) this).field_n, 25, (cf) (Object) ((qm) this).field_H, false, 80, 3, var7, 16777215, var8);
          ((qm) this).b((byte) 112, (cf) (Object) new el(10, ((qm) this).field_i, -20 + ((qm) this).field_n, 25, (cf) (Object) ((qm) this).field_H, false, 80, 3, var7, 16777215, var8));
          ((qm) this).field_i = ((qm) this).field_i + (((cf) (Object) var12).field_w + 5);
          var13 = new el(10, ((qm) this).field_i, -20 + ((qm) this).field_n, 25, (cf) (Object) ((qm) this).field_M, false, 80, 3, var7, 16777215, gn.field_D);
          ((qm) this).b((byte) 108, (cf) (Object) new el(10, ((qm) this).field_i, -20 + ((qm) this).field_n, 25, (cf) (Object) ((qm) this).field_M, false, 80, 3, var7, 16777215, gn.field_D));
          ((qm) this).field_i = ((qm) this).field_i + (5 + ((cf) (Object) var13).field_w);
          ((qm) this).field_G.field_A = (bj) this;
          if (null == ((qm) this).field_P) {
            break L13;
          } else {
            ((qm) this).field_P.field_A = (bj) this;
            break L13;
          }
        }
        L14: {
          if (null == ((qm) this).field_J) {
            break L14;
          } else {
            ((qm) this).field_J.field_A = (bj) this;
            break L14;
          }
        }
        L15: {
          if (((qm) this).field_P == null) {
            ((qm) this).field_G.b(8, ((qm) this).field_i, 28972, ((qm) this).field_n - 6 + -10, 30);
            ((qm) this).field_i = ((qm) this).field_i + 35;
            break L15;
          } else {
            ((qm) this).field_G.b(85, ((qm) this).field_i, 28972, ((qm) this).field_n + -95, 30);
            ((qm) this).field_i = ((qm) this).field_i + 60;
            break L15;
          }
        }
        L16: {
          if (((qm) this).field_P == null) {
            break L16;
          } else {
            ((qm) this).field_P.b(8, ((qm) this).field_i, 28972, -10 + (-6 + ((qm) this).field_n), 30);
            ((qm) this).field_i = ((qm) this).field_i + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((qm) this).field_J) {
            break L17;
          } else {
            L18: {
              if (((qm) this).field_K) {
                break L18;
              } else {
                if (((qm) this).field_L) {
                  break L18;
                } else {
                  ((qm) this).field_J.b(8, ((qm) this).field_i, 28972, 40, 20);
                  ((qm) this).field_i = ((qm) this).field_i + 25;
                  break L17;
                }
              }
            }
            ((qm) this).field_J.b(8, ((qm) this).field_i, 28972, -10 + (((qm) this).field_n + -6), 30);
            ((qm) this).field_i = ((qm) this).field_i + 35;
            break L17;
          }
        }
        L19: {
          ((qm) this).b(0, 0, 28972, ((qm) this).field_n, 3 + ((qm) this).field_i);
          ((qm) this).b((byte) 70, (cf) (Object) ((qm) this).field_G);
          if (null == ((qm) this).field_P) {
            break L19;
          } else {
            ((qm) this).b((byte) 71, (cf) (Object) ((qm) this).field_P);
            break L19;
          }
        }
        L20: {
          if (((qm) this).field_J == null) {
            break L20;
          } else {
            ((qm) this).b((byte) 126, (cf) (Object) ((qm) this).field_J);
            break L20;
          }
        }
    }

    public static void a(int param0) {
        int var1 = 19 % ((-23 - param0) / 59);
        field_N = null;
        field_I = null;
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (param0 != 98) {
            if (-100 != (param0 ^ -1)) {
              return false;
            } else {
              return ((qm) this).a(66, param2);
            }
          } else {
            return ((qm) this).a((byte) -1, param2);
          }
        }
    }

    final static ae a(ga param0, boolean param1) {
        int var2 = param0.d((byte) 69);
        int var3 = param0.d((byte) 69);
        int var4 = param0.d((byte) 69);
        int var5 = param0.d((byte) 69);
        if (!param1) {
            qm.a(16);
        }
        int var6 = param0.d((byte) 69);
        return (ae) (Object) fn.a(var6, var4, var3, (byte) 104, var2, var5);
    }

    public final void a(pm param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            qm.a(-1.2370823621749878f, -17, (String) null);
        }
    }

    public final void a(pm param0, boolean param1) {
        if (!(((qm) this).field_H != param0)) {
            boolean discarded$0 = ((qm) this).field_M.a((cf) this, 0);
        }
        if (((qm) this).field_M == param0) {
            this.a((byte) -99);
        }
        if (!param1) {
            ((qm) this).field_G = null;
        }
    }

    final static vg b(int param0, int param1, int param2, int param3) {
        vg var4 = null;
        vg var4_ref = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = (vg) (Object) ag.field_i.c(78);
        L0: while (true) {
          if (var4 != null) {
            if (param2 == var4_ref.field_i) {
              return var4_ref;
            } else {
              var4 = (vg) (Object) ag.field_i.b(6);
              continue L0;
            }
          } else {
            L1: {
              if (param0 > 97) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            var4_ref = new vg();
            var4_ref.field_p = param3;
            var4_ref.field_i = param2;
            ag.field_i.a((br) (Object) var4_ref, false);
            vi.a(param1, var4_ref, (byte) -126);
            return var4_ref;
          }
        }
    }

    final static void a(float param0, int param1, String param2) {
        lh.field_i = param0;
        if (param1 != 80) {
            Object var4 = null;
            qm.a(-1.1143913269042969f, -113, (String) null);
        }
        od.field_Bb = param2;
    }

    private final void a(byte param0) {
        int var2 = 12 % ((param0 - 8) / 49);
        if (!aa.e(0)) {
            // if_icmple L72
            // ifle L72
        }
        hq.a(((qm) this).field_H.field_j, (byte) -125, ((qm) this).field_M.field_j);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Create your own free Jagex account";
        field_N = "TRAITS";
    }
}
