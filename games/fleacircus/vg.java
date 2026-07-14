/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends wi {
    int field_B;
    int field_D;
    private boolean field_q;
    int field_C;
    private fa field_G;
    int field_w;
    static af field_r;
    static sg[] field_H;
    static String[] field_u;
    private boolean field_s;
    int field_F;
    int field_E;
    private int field_y;
    static int field_z;
    int field_A;
    static int[] field_I;
    private String field_t;
    static String field_v;
    int field_x;

    final static int c(int param0) {
        if (param0 >= -120) {
            vg.b((byte) -29);
        }
        return m.field_a;
    }

    private final boolean f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (((vg) this).a((byte) 104)) {
            if (1 == kc.field_f) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_6_0;
        var2 = var2 != 0 & ((vg) this).field_k ? 1 : 0;
        var3 = -124 % ((param0 - 42) / 43);
        return var2 != 0;
    }

    final static void b(byte param0) {
        ah.field_g[93] = 43;
        ah.field_g[59] = 57;
        ah.field_g[47] = 73;
        ah.field_g[44] = 71;
        ah.field_g[92] = 74;
        ah.field_g[192] = 28;
        ah.field_g[520] = 59;
        ah.field_g[222] = 58;
        ah.field_g[46] = 72;
        ah.field_g[45] = 26;
        ah.field_g[61] = 27;
        ah.field_g[91] = 42;
        if (param0 != 32) {
            vg.c((byte) -26);
        }
    }

    public static void c(byte param0) {
        field_I = null;
        field_v = null;
        field_r = null;
        field_H = null;
        if (param0 != -53) {
            return;
        }
        field_u = null;
    }

    final void b(boolean param0) {
        int var3 = fleas.field_A ? 1 : 0;
        if (!((vg) this).field_k) {
            ((vg) this).field_c = false;
            ((vg) this).field_g = false;
        } else {
            this.d(-25579);
            if (((vg) this).field_g) {
                if (-1 != (kc.field_f ^ -1)) {
                    if (0 != (!((vg) this).field_s ? 1 : 0)) {
                    }
                    ((vg) this).field_s = true;
                } else {
                    ((vg) this).field_s = false;
                }
            }
            ((vg) this).field_c = -2 == (kc.field_f ^ -1) ? true : false;
        }
        if (!param0) {
            int discarded$0 = vg.c(114);
        }
    }

    private final void d(int param0) {
        int var3 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          if (!((vg) this).field_g) {
            if (((vg) this).a((byte) 89)) {
              if (kc.field_f != 1) {
                ((vg) this).field_o = li.field_j;
                break L0;
              } else {
                ((vg) this).field_o = ji.field_i;
                break L0;
              }
            } else {
              ((vg) this).field_o = id.field_g;
              break L0;
            }
          } else {
            ((vg) this).field_o = ji.field_i;
            break L0;
          }
        }
        L1: {
          if (((vg) this).field_q) {
            if (this.f(-93)) {
              L2: {
                stackOut_13_0 = this;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (((vg) this).field_g) {
                  stackOut_15_0 = this;
                  stackOut_15_1 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L2;
                } else {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L2;
                }
              }
              ((vg) this).field_g = stackIn_16_1 != 0;
              break L1;
            } else {
              break L1;
            }
          } else {
            if (this.f(109)) {
              ((vg) this).field_g = true;
              break L1;
            } else {
              ((vg) this).field_g = false;
              break L1;
            }
          }
        }
        L3: {
          if (param0 == -25579) {
            break L3;
          } else {
            ((vg) this).b(true);
            break L3;
          }
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (ji.field_i == ((vg) this).field_o) {
            stackOut_2_0 = ((vg) this).field_w;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((vg) this).field_B;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (ji.field_i != ((vg) this).field_o) {
            stackOut_5_0 = ((vg) this).field_w;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = ((vg) this).field_B;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_6_0;
          if (param0 == -1) {
            break L2;
          } else {
            ((vg) this).field_F = -98;
            break L2;
          }
        }
        L3: {
          if ((((vg) this).field_A ^ -1) > -256) {
            if (0 >= ((vg) this).field_A) {
              break L3;
            } else {
              gb.g(((vg) this).field_l, ((vg) this).field_a, ((vg) this).field_n, ((vg) this).field_d, ((vg) this).field_E, ((vg) this).field_A);
              var4 = 0;
              L4: while (true) {
                if (((vg) this).field_D <= var4) {
                  break L3;
                } else {
                  gb.f(var4 + ((vg) this).field_l, var4 + ((vg) this).field_a, -var4 + ((vg) this).field_n + ((vg) this).field_l, ((vg) this).field_a + var4, var3, ((vg) this).field_A);
                  gb.f(((vg) this).field_l - -var4, var4 + ((vg) this).field_a, var4 + ((vg) this).field_l, -var4 + (((vg) this).field_d + ((vg) this).field_a), var3, ((vg) this).field_A);
                  gb.f(((vg) this).field_l + var4, ((vg) this).field_a - -((vg) this).field_d - var4, -var4 + ((vg) this).field_n + ((vg) this).field_l, ((vg) this).field_d + (((vg) this).field_a + -var4), var2, ((vg) this).field_A);
                  gb.f(((vg) this).field_n + (((vg) this).field_l + -var4), var4 + ((vg) this).field_a, ((vg) this).field_l - (-((vg) this).field_n + var4), ((vg) this).field_a + (((vg) this).field_d + -var4), var2, ((vg) this).field_A);
                  var4++;
                  continue L4;
                }
              }
            }
          } else {
            gb.e(((vg) this).field_l, ((vg) this).field_a, ((vg) this).field_n, ((vg) this).field_d, ((vg) this).field_E);
            var4 = 0;
            L5: while (true) {
              if (var4 >= ((vg) this).field_D) {
                break L3;
              } else {
                gb.d(((vg) this).field_l + var4, var4 + ((vg) this).field_a, -var4 + (((vg) this).field_l + ((vg) this).field_n), var4 + ((vg) this).field_a, var3);
                gb.d(var4 + ((vg) this).field_l, ((vg) this).field_a - -var4, ((vg) this).field_l - -var4, -var4 + (((vg) this).field_a - -((vg) this).field_d), var3);
                gb.d(var4 + ((vg) this).field_l, -var4 + ((vg) this).field_a + ((vg) this).field_d, ((vg) this).field_n + ((vg) this).field_l - var4, -var4 + ((vg) this).field_d + ((vg) this).field_a, var2);
                gb.d(((vg) this).field_n + (((vg) this).field_l + -var4), var4 + ((vg) this).field_a, ((vg) this).field_l - (-((vg) this).field_n - -var4), ((vg) this).field_a + (((vg) this).field_d + -var4), var2);
                var4++;
                continue L5;
              }
            }
          }
        }
        gb.a(ia.field_q);
        ((vg) this).field_G.a(((vg) this).field_t, (((vg) this).field_n >> -836297087) + ((vg) this).field_l + ((vg) this).field_y, ((vg) this).field_a + (((vg) this).field_C - -(((vg) this).field_d >> -270619007)) - -(((vg) this).field_G.field_y >> -815560191), ((vg) this).field_F, ((vg) this).field_x);
        gb.b(ia.field_q);
    }

    vg(String param0, int param1, int param2, fa param3) {
        ((vg) this).field_C = 0;
        ((vg) this).field_w = 12369084;
        ((vg) this).field_D = 1;
        ((vg) this).field_y = 0;
        ((vg) this).field_s = false;
        ((vg) this).field_q = false;
        ((vg) this).field_E = 8421504;
        ((vg) this).field_B = 4737096;
        ((vg) this).field_F = 16777215;
        ((vg) this).field_A = 255;
        ((vg) this).field_x = 0;
        ((vg) this).field_t = param0;
        ((vg) this).field_a = param1;
        ((vg) this).field_n = 69;
        ((vg) this).field_G = param3;
        ((vg) this).field_l = param2;
        ((vg) this).field_d = ((vg) this).field_G.field_H + ((vg) this).field_G.field_K;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "There are a few limitations on what you can do with these tiles though:";
    }
}
