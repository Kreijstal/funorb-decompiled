/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rg extends vk implements si, ga {
    private boolean field_A;
    private dk field_C;
    static String field_E;
    private boolean field_H;
    static String field_K;
    private String field_J;
    private dk field_F;
    private fe field_I;
    static int field_D;
    static int field_B;
    private fe field_G;
    private dk field_y;
    private boolean field_z;

    final static hl[] i(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = StarCannon.field_A;
        hl[] var1 = new hl[bj.field_b];
        for (var2 = 0; bj.field_b > var2; var2++) {
            var3 = gh.field_C[var2] * gg.field_d[var2];
            var10 = og.field_c[var2];
            var11 = new int[var3];
            var9 = var11;
            var5 = var9;
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = of.field_g[w.a(255, (int) var10[var6])];
            }
            var1[var2] = new hl(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], var11);
        }
        var2 = 57 / ((47 - param0) / 46);
        rc.b((byte) -82);
        return var1;
    }

    final String j(int param0) {
        if (!(((rg) this).field_I.field_k != null)) {
            return "";
        }
        if (param0 != 190) {
            field_E = null;
        }
        return ((rg) this).field_I.field_k;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(((rg) this).field_J == null)) {
            int discarded$0 = nb.field_c.a(((rg) this).field_J, 20 + param1 + ((rg) this).field_s, 15 + (param3 - -((rg) this).field_j), ((rg) this).field_i + -40, ((rg) this).field_f, 16777215, -1, 1, 0, nb.field_c.field_p);
        }
        if (((rg) this).field_y != null) {
            ki.b(10 + param1, param3 + 134, -20 + ((rg) this).field_i, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void k(int param0) {
        field_K = null;
        if (param0 > -94) {
            return;
        }
        field_E = null;
    }

    public final void a(int param0, fe param1) {
        if (param0 != -4312) {
            Object var4 = null;
            boolean discarded$0 = ((rg) this).a((uj) null, 'ﾠ', (byte) 81, -62);
        }
    }

    rg(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (de) null);
        gb var6 = null;
        qe var7 = null;
        String var8 = null;
        mj var9 = null;
        ad var11 = null;
        ad var12 = null;
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
        dk stackIn_15_1 = null;
        dk stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        dk stackIn_16_1 = null;
        dk stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        dk stackIn_17_1 = null;
        dk stackIn_17_2 = null;
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
        dk stackOut_14_1 = null;
        dk stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        dk stackOut_16_1 = null;
        dk stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        dk stackOut_15_1 = null;
        dk stackOut_15_2 = null;
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
          ((rg) this).field_H = stackIn_3_1 != 0;
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
          ((rg) this).field_z = stackIn_6_1 != 0;
          ((rg) this).field_J = param1;
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
          ((rg) this).field_A = stackIn_9_1 != 0;
          if (!((rg) this).field_z) {
            break L3;
          } else {
            L4: {
              if (((rg) this).field_H) {
                break L4;
              } else {
                if (!((rg) this).field_A) {
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
          ((rg) this).field_I = (fe) (Object) new ng(param0, (qg) this, 100);
          ((rg) this).field_G = (fe) (Object) new ng("", (qg) this, 20);
          if (((rg) this).field_z) {
            ((rg) this).field_C = new dk(ma.field_g, (qg) null);
            ((rg) this).field_F = new dk(bg.field_b, (qg) null);
            ((rg) this).field_I.field_u = false;
            break L5;
          } else {
            L6: {
              ((rg) this).field_C = new dk(s.field_l, (qg) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (((rg) this).field_A) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = (String) field_E;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = dk.field_t;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new dk(stackIn_17_3, (qg) null);
            ((rg) this).field_F = stackIn_17_1;
            if (!((rg) this).field_H) {
              break L5;
            } else {
              ((rg) this).field_y = new dk(qj.field_V, (qg) this);
              break L5;
            }
          }
        }
        L7: {
          ((rg) this).field_I.field_o = (de) (Object) new fh(10000536);
          ((rg) this).field_G.field_o = (de) (Object) new sh(10000536);
          var6 = new gb();
          ((rg) this).field_C.field_o = (de) (Object) var6;
          if (((rg) this).field_F == null) {
            break L7;
          } else {
            ((rg) this).field_F.field_o = (de) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((rg) this).field_I.field_p = ne.field_a;
          if (null == ((rg) this).field_y) {
            break L8;
          } else {
            ((rg) this).field_y.field_o = (de) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((rg) this).field_y) {
            break L9;
          } else {
            ((rg) this).field_y.field_p = wj.field_f;
            break L9;
          }
        }
        L10: {
          if (((rg) this).field_z) {
            ((rg) this).field_F.field_p = qd.field_B;
            break L10;
          } else {
            if (!((rg) this).field_A) {
              ((rg) this).field_F.field_o = (de) (Object) new wa();
              break L10;
            } else {
              ((rg) this).field_F.field_p = ej.field_t;
              ((rg) this).field_F.field_o = (de) (Object) new wa();
              break L10;
            }
          }
        }
        L11: {
          ((rg) this).field_j = 15;
          var7 = nb.field_c;
          if (null == ((rg) this).field_J) {
            break L11;
          } else {
            ((rg) this).field_j = ((rg) this).field_j + (var7.a(((rg) this).field_J, -40 + ((rg) this).field_i, var7.field_p) - -5);
            break L11;
          }
        }
        L12: {
          var8 = pf.field_b;
          var9 = kl.a(ll.b(95), (byte) 84);
          if (var9 != p.field_a) {
            if (bh.field_b != var9) {
              break L12;
            } else {
              var8 = rc.field_c;
              break L12;
            }
          } else {
            var8 = v.field_a;
            break L12;
          }
        }
        L13: {
          var11 = new ad(10, ((rg) this).field_j, -20 + ((rg) this).field_i, 25, (uj) (Object) ((rg) this).field_I, false, 80, 3, var7, 16777215, var8);
          ((rg) this).a(true, (uj) (Object) new ad(10, ((rg) this).field_j, -20 + ((rg) this).field_i, 25, (uj) (Object) ((rg) this).field_I, false, 80, 3, var7, 16777215, var8));
          ((rg) this).field_j = ((rg) this).field_j + (((uj) (Object) var11).field_f + 5);
          var12 = new ad(10, ((rg) this).field_j, -20 + ((rg) this).field_i, 25, (uj) (Object) ((rg) this).field_G, false, 80, 3, var7, 16777215, tj.field_y);
          ((rg) this).a(true, (uj) (Object) new ad(10, ((rg) this).field_j, -20 + ((rg) this).field_i, 25, (uj) (Object) ((rg) this).field_G, false, 80, 3, var7, 16777215, tj.field_y));
          ((rg) this).field_C.field_g = (qg) this;
          ((rg) this).field_j = ((rg) this).field_j + (5 + ((uj) (Object) var12).field_f);
          if (null == ((rg) this).field_y) {
            break L13;
          } else {
            ((rg) this).field_y.field_g = (qg) this;
            break L13;
          }
        }
        L14: {
          if (null == ((rg) this).field_F) {
            break L14;
          } else {
            ((rg) this).field_F.field_g = (qg) this;
            break L14;
          }
        }
        L15: {
          if (((rg) this).field_y != null) {
            ((rg) this).field_C.a(85, ((rg) this).field_i - 95, (byte) 121, 30, ((rg) this).field_j);
            ((rg) this).field_j = ((rg) this).field_j + 60;
            break L15;
          } else {
            ((rg) this).field_C.a(8, -10 + ((rg) this).field_i - 6, (byte) 118, 30, ((rg) this).field_j);
            ((rg) this).field_j = ((rg) this).field_j + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((rg) this).field_y) {
            break L16;
          } else {
            ((rg) this).field_y.a(8, ((rg) this).field_i + -6 + -10, (byte) 117, 30, ((rg) this).field_j);
            ((rg) this).field_j = ((rg) this).field_j + 35;
            break L16;
          }
        }
        L17: {
          if (((rg) this).field_F == null) {
            break L17;
          } else {
            L18: {
              if (((rg) this).field_z) {
                break L18;
              } else {
                if (((rg) this).field_A) {
                  break L18;
                } else {
                  ((rg) this).field_F.a(8, 40, (byte) 120, 20, ((rg) this).field_j);
                  ((rg) this).field_j = ((rg) this).field_j + 25;
                  break L17;
                }
              }
            }
            ((rg) this).field_F.a(8, -6 + ((rg) this).field_i + -10, (byte) 127, 30, ((rg) this).field_j);
            ((rg) this).field_j = ((rg) this).field_j + 35;
            break L17;
          }
        }
        L19: {
          ((rg) this).a(0, ((rg) this).field_i, (byte) 120, 3 + ((rg) this).field_j, 0);
          ((rg) this).a(true, (uj) (Object) ((rg) this).field_C);
          if (null == ((rg) this).field_y) {
            break L19;
          } else {
            ((rg) this).a(true, (uj) (Object) ((rg) this).field_y);
            break L19;
          }
        }
        L20: {
          if (((rg) this).field_F == null) {
            break L20;
          } else {
            ((rg) this).a(true, (uj) (Object) ((rg) this).field_F);
            break L20;
          }
        }
    }

    final void a(boolean param0) {
        ((rg) this).field_I.i(19293);
        ((rg) this).field_G.i(19293);
        if (param0) {
            Object var3 = null;
            ((rg) this).a(false, (fe) null);
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!(param3 != 98)) {
            return ((rg) this).b(-112, param0);
        }
        if (-100 != (param3 ^ -1)) {
            return false;
        }
        return ((rg) this).a((byte) -103, param0);
    }

    public final void a(boolean param0, fe param1) {
        if (!(param1 != ((rg) this).field_I)) {
            boolean discarded$0 = ((rg) this).field_G.a(0, (uj) this);
        }
        if (!(((rg) this).field_G != param1)) {
            this.a(-100);
        }
        if (param0) {
            Object var4 = null;
            ((rg) this).b((byte) -93, (String) null);
        }
    }

    private final void a(int param0) {
        if (param0 != -100) {
            ((rg) this).field_J = null;
        }
        if (!se.d((byte) 125)) {
            // if_icmple L77
            // if_icmpge L77
        }
        ia.a(((rg) this).field_I.field_k, ((rg) this).field_G.field_k, 0);
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2 = param1.length;
        if (param0 != 10) {
            field_D = -57;
        }
        byte[] var3 = new byte[var2];
        ug.a(param1, 0, var3, 0, var2);
        return var3;
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        int var7 = StarCannon.field_A;
        if (param2) {
            field_K = null;
        }
        if (param0 == ((rg) this).field_C) {
            this.a(-100);
        } else {
            if (param0 == ((rg) this).field_y) {
                pb.b(106);
            } else {
                if (((rg) this).field_F == param0) {
                    if (((rg) this).field_z) {
                        ik.g(17);
                    } else {
                        if (!((rg) this).field_A) {
                            vk.e(-59);
                        } else {
                            ob.b(11);
                        }
                    }
                }
            }
        }
    }

    final void b(byte param0, String param1) {
        fe var3 = ((rg) this).field_I;
        String var4 = param1;
        var3.a((byte) -91, false, var4);
        if (param0 != -79) {
            ((rg) this).field_I = null;
        }
        ((rg) this).field_G.i(19293);
    }

    final static String a(boolean param0, CharSequence[] param1) {
        if (!param0) {
            return null;
        }
        return bf.a(param1.length, 0, 4, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "This password contains repeated characters, and would be easy to guess";
        field_B = 0;
        field_E = "Just play";
    }
}
