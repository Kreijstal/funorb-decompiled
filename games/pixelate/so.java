/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    int field_a;
    boolean field_f;
    private int field_o;
    private int field_j;
    private int field_g;
    int field_m;
    boolean field_h;
    int field_k;
    private int field_l;
    private int[] field_i;
    boolean field_n;
    private int field_p;
    int field_e;
    static tf[] field_d;
    static int[][] field_c;
    private int field_b;

    final int a(int param0) {
        if (!(((so) this).field_p != ((so) this).field_i.length)) {
            ((so) this).field_h = true;
            return -1;
        }
        if (param0 != 0) {
            ((so) this).field_n = true;
        }
        if (!(((so) this).field_p <= 0)) {
            ((so) this).field_l = ((so) this).field_l + 37;
        }
        int fieldTemp$0 = ((so) this).field_p;
        ((so) this).field_p = ((so) this).field_p + 1;
        return ((so) this).field_i[fieldTemp$0];
    }

    final int a(byte param0) {
        if (param0 >= -88) {
            ((so) this).field_a = -66;
        }
        return ((so) this).field_i.length;
    }

    final void d(int param0) {
        if (((so) this).field_l > ((so) this).field_g) {
            ((so) this).field_g = ((so) this).field_g + 3;
        }
        if (((so) this).field_g > ((so) this).field_l) {
            ((so) this).field_g = ((so) this).field_l;
        }
        if (param0 != 27420) {
            so.a(true);
        }
    }

    final dd b(int param0) {
        if (param0 != -3060) {
            ((so) this).field_a = 17;
        }
        return new dd(((so) this).field_m, ((so) this).field_k, ((so) this).field_j, 60, 30, lp.field_d, 0, 0, new hh[1]);
    }

    final void b(boolean param0) {
        ((so) this).field_p = 0;
        ((so) this).field_n = false;
        ((so) this).field_h = false;
        ((so) this).field_f = param0 ? true : false;
        ((so) this).field_o = 240 + -((37 * ((so) this).field_i.length + -5) / 2);
        ((so) this).field_g = ((so) this).field_o;
        ((so) this).field_l = ((so) this).field_g;
    }

    final static void c(int param0) {
        if (!ik.field_a) {
            if (null == pk.field_f) {
                pk.field_f = wg.b(255, 4);
            }
            if (pk.field_f.field_p) {
                go.field_k = go.field_k & ~pk.field_f.field_s;
                de.field_n = de.field_n | pk.field_f.field_s;
                ik.field_a = true;
                pk.field_f = null;
            }
        }
        if (!db.field_U) {
            if (null == up.field_g) {
                up.field_g = ni.a(6, -90);
            }
            if (!(!up.field_g.field_p)) {
                db.a(false, up.field_g.field_n);
                if (ef.field_a) {
                    kp.b((byte) 74);
                }
                up.field_g = null;
                db.field_U = true;
            }
        }
        if (ik.field_a) {
            if (!(!db.field_U)) {
                eh.c(5);
                ni.a(-31470);
                if (fc.field_e == 9) {
                    if (!(go.field_k != 0)) {
                        fc.field_e = 5;
                        la.a(ti.field_t, 5, false, -25528);
                    }
                }
            }
        }
    }

    final void e(int param0) {
        ((so) this).field_n = true;
        long var2 = 1L << ((so) this).field_e | jo.field_h;
        if (param0 != 20604) {
            return;
        }
        if (var2 != jo.field_h) {
            jo.field_h = var2;
            kp.b((byte) 74);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        boolean[] var4 = null;
        int var5 = 0;
        tf[] stackIn_5_0 = null;
        tf[] stackIn_6_0 = null;
        tf[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        tf[] stackIn_8_0 = null;
        tf[] stackIn_9_0 = null;
        tf[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        tf[] stackIn_11_0 = null;
        tf[] stackIn_12_0 = null;
        tf[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        tf[] stackIn_14_0 = null;
        tf[] stackIn_15_0 = null;
        tf[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        tf[] stackOut_4_0 = null;
        tf[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        tf[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        tf[] stackOut_7_0 = null;
        tf[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        tf[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        tf[] stackOut_10_0 = null;
        tf[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        tf[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        tf[] stackOut_13_0 = null;
        tf[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        tf[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          t.e(535, -15 + ((so) this).field_o, 62, 15 + ((so) this).field_b + 15, 6, 0);
          t.a(535, -15 + ((so) this).field_o, 62, 15 + (((so) this).field_b - -15), 6, 0, 128);
          li.field_d.b(542, ((so) this).field_g + -8, 256);
          var2 = ((so) this).field_o;
          if (param0 == 550) {
            break L0;
          } else {
            ((so) this).field_l = -112;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= ((so) this).field_i.length) {
            rk.field_e.a("Puzzle " + (((so) this).field_e - -1), 30, 50, 0, -1);
            return;
          } else {
            L2: {
              var4 = vn.field_e[((so) this).field_i[var3]];
              stackOut_4_0 = rg.field_e.field_a;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!var4[0]) {
                stackOut_6_0 = (tf[]) (Object) stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = (tf[]) (Object) stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((tf) (Object) stackIn_7_0[stackIn_7_1]).b(550, var2);
              stackOut_7_0 = rg.field_e.field_a;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var4[1]) {
                stackOut_9_0 = (tf[]) (Object) stackIn_9_0;
                stackOut_9_1 = 1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = (tf[]) (Object) stackIn_8_0;
                stackOut_8_1 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((tf) (Object) stackIn_10_0[stackIn_10_1]).b(566, var2);
              stackOut_10_0 = rg.field_e.field_a;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (var4[2]) {
                stackOut_12_0 = (tf[]) (Object) stackIn_12_0;
                stackOut_12_1 = 1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = (tf[]) (Object) stackIn_11_0;
                stackOut_11_1 = 0;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              ((tf) (Object) stackIn_13_0[stackIn_13_1]).b(550, var2 - -16);
              stackOut_13_0 = rg.field_e.field_a;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (!var4[3]) {
                stackOut_15_0 = (tf[]) (Object) stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L5;
              } else {
                stackOut_14_0 = (tf[]) (Object) stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L5;
              }
            }
            ((tf) (Object) stackIn_16_0[stackIn_16_1]).b(566, 16 + var2);
            if (var3 < -1 + ((so) this).field_p) {
              t.a(550, var2, 32, 32, 0, 128);
              var2 += 37;
              var3++;
              continue L1;
            } else {
              var2 += 37;
              var3++;
              continue L1;
            }
          }
        }
    }

    so(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        ((so) this).field_f = false;
        ((so) this).field_p = 0;
        try {
            ((so) this).field_a = param4;
            ((so) this).field_e = param0;
            ((so) this).field_i = param5;
            ((so) this).field_k = param2;
            ((so) this).field_m = param1;
            ((so) this).field_j = param3;
            ((so) this).field_b = ((so) this).field_i.length * 37 - 5;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "so.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
