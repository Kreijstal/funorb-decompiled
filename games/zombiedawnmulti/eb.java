/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    int[] field_g;
    int[] field_G;
    int field_H;
    int field_d;
    int field_o;
    static String field_e;
    static int field_A;
    int field_n;
    boolean[] field_I;
    static boolean field_p;
    byte[][] field_z;
    static int[] field_J;
    static ao field_w;
    static String field_L;
    byte[] field_C;
    int field_x;
    int[][] field_O;
    byte[] field_t;
    int field_D;
    int field_q;
    int[][] field_c;
    byte[] field_l;
    int field_K;
    int[] field_a;
    byte[] field_v;
    int[][] field_h;
    int field_b;
    byte[] field_r;
    int field_N;
    int field_P;
    boolean[] field_E;
    int field_F;
    byte field_j;
    int field_u;
    int field_s;
    static cj field_B;
    byte[] field_k;
    int field_f;
    int[] field_m;
    static int field_M;
    static String field_i;
    static String field_y;

    final static boolean a(byte param0, char param1) {
        int var2;
        int stackIn_7_0 = 0;
        L0: {
          L1: {
            var2 = 24 / ((param0 - -12) / 58);
            if (160 == param1) {
              break L1;
            } else {
              if (param1 == 32) {
                break L1;
              } else {
                if (param1 == 95) {
                  break L1;
                } else {
                  if (param1 != 45) {
                    stackIn_7_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_7_0 = 1;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static ja[] a(int param0) {
        ja[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        byte[] var10 = null;
        int[] var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    var1 = new ja[qc.field_v];
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var2 ^ -1) <= (qc.field_v ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = vj.field_p[var2] * oq.field_w[var2];
                    var10 = qp.field_t[var2];
                    var11 = new int[var3];
                    var9 = var11;
                    var5 = var9;
                    stackIn_11_0 = 0;
                    stackIn_3_0 = stackIn_11_0;
                    if (var7 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var3 <= var6) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5[var6] = tp.field_t[tq.b((int) var10[var6], 255)];
                    var6++;
                    if (var7 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var1[var2] = new ja(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], var11);
                    var2++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = param0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 > 2) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    eb.a(true, false, -9);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    fd.h((byte) 127);
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0, boolean param1, boolean param2) {
        if (param2) {
          L0: {
            if (!param1) {
              break L0;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                return gm.a(param0, param1, 10, -1);
              }
            }
          }
          return Integer.toString(param0);
        } else {
          return (String) null;
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        boolean stackIn_66_0 = false;
        int stackIn_71_0 = 0;
        boolean stackIn_77_0 = false;
        int stackIn_82_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_90_0 = 0;
        String[] stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        String[] stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        String[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        String[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        String stackIn_102_2 = null;
        String[] stackIn_106_0 = null;
        String[] stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        int stackIn_107_3 = 0;
        String[] stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        String[] stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        String[] stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        String stackIn_110_2 = null;
        String[] stackIn_127_0 = null;
        int stackIn_129_0 = 0;
        String[] stackIn_129_1 = null;
        int stackIn_130_0 = 0;
        String stackIn_130_1 = null;
        int stackIn_131_0 = 0;
        String stackIn_131_1 = null;
        int stackIn_132_0 = 0;
        String stackIn_132_1 = null;
        int stackIn_132_2 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        int stackIn_156_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        int stackIn_164_0 = 0;
        String[] stackIn_164_1 = null;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_171_0 = 0;
        int stackIn_171_1 = 0;
        Throwable caughtException = null;
        boolean stackOut_65_0;
        boolean stackOut_76_0;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    ho.field_q = param2;
                    bq.field_c = true;
                    if ((ho.field_q ^ -1) == -1) {
                        statePc = 112;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if ((ho.field_q ^ -1) != -2) {
                        statePc = 16;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3_int = mb.a(uq.field_f, false, oi.field_e, cq.field_e, ib.field_b);
                    var4 = var3_int + 2;
                    wd.field_Q = new int[var4];
                    hq.field_m = new String[var4];
                    var5 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    wd.field_Q[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var9 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    v.field_b = new int[1];
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var5 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    hq.field_m[var5] = cq.field_e[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var9 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    hq.field_m[var4 - 2] = "";
                    hq.field_m[var4 - 1] = ic.field_f;
                    wd.field_Q[var4 - 1] = 0;
                    v.field_b[0] = 5;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var9 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (ho.field_q == 2) {
                        statePc = 63;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (ho.field_q != 3) {
                        statePc = 34;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (pl.field_J.field_d) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var3_int = mb.a(uq.field_f, false, aa.field_j, cq.field_e, ib.field_b);
                    if (var9 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var3_int = mb.a(uq.field_f, param0, hg.field_sb, cq.field_e, ib.field_b);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var4 = 2 - -var3_int;
                    wd.field_Q = new int[var4];
                    hq.field_m = new String[var4];
                    var5 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((var5 ^ -1) <= (var4 ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    wd.field_Q[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var9 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    v.field_b = new int[1];
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var5 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    hq.field_m[var5] = cq.field_e[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var9 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    hq.field_m[-2 + var4] = "";
                    hq.field_m[-1 + var4] = ic.field_f;
                    wd.field_Q[-1 + var4] = 0;
                    v.field_b[0] = 5;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (var9 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (ho.field_q == 4) {
                        statePc = 50;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (ho.field_q == 5) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    throw new IllegalArgumentException();
                }
                case 37: {
                    var3_int = mb.a(uq.field_f, false, ga.field_t, cq.field_e, ib.field_b);
                    var4 = 3 + var3_int;
                    wd.field_Q = new int[var4];
                    hq.field_m = new String[var4];
                    var5 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    wd.field_Q[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var9 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    v.field_b = new int[2];
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var5 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var5 >= var3_int) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    hq.field_m[var5] = cq.field_e[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var9 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    hq.field_m[-3 + var4] = "";
                    hq.field_m[-2 + var4] = ei.field_d;
                    wd.field_Q[-2 + var4] = 0;
                    v.field_b[0] = 3;
                    hq.field_m[var4 - 1] = ic.field_f;
                    wd.field_Q[-1 + var4] = 1;
                    v.field_b[1] = 5;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var9 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var3_int = mb.a(uq.field_f, false, on.field_cb, cq.field_e, ib.field_b);
                    var4 = 2 - -var3_int;
                    hq.field_m = new String[var4];
                    wd.field_Q = new int[var4];
                    var5 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var5 >= var4) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    wd.field_Q[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var9 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    v.field_b = new int[1];
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var5 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    hq.field_m[var5] = cq.field_e[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 62;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (var9 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    hq.field_m[var4 - 2] = "";
                    hq.field_m[var4 - 1] = ic.field_f;
                    wd.field_Q[var4 - 1] = 0;
                    v.field_b[0] = 5;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (var9 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var3_int = mb.a(uq.field_f, param0, vl.a(ba.field_l, new String[]{"<br><%0><br>"}, 2), cq.field_e, ib.field_b);
                    var4 = -1;
                    var5 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (var3_int <= var5) {
                        statePc = 70;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = "<%0>".equals(cq.field_e[var5]);
                    stackIn_71_0 = stackOut_65_0 ? 1 : 0;
                    stackIn_66_0 = stackOut_65_0;
                    if (var9 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (!stackIn_66_0) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var4 = var5;
                    if (var9 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = var4 ^ -1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (stackIn_71_0 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    throw new IllegalStateException();
                }
                case 74: {
                    aa.field_n = new String[var4];
                    d.a(cq.field_e, 0, aa.field_n, 0, var4);
                    ik.field_a = new String[var3_int - var4 - 1];
                    d.a(cq.field_e, var4 + 1, ik.field_a, 0, var3_int + -var4 + -1);
                    var4 = -1;
                    var3_int = mb.a(uq.field_f, false, vl.a(rn.field_g, new String[]{"<br><%0><br>"}, 2), cq.field_e, ib.field_b);
                    var5 = 0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (var5 >= var3_int) {
                        statePc = 81;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackOut_76_0 = "<%0>".equals(cq.field_e[var5]);
                    stackIn_82_0 = stackOut_76_0 ? 1 : 0;
                    stackIn_77_0 = stackOut_76_0;
                    if (var9 != 0) {
                        statePc = 82;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (!stackIn_77_0) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var4 = var5;
                    if (var9 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = var4 ^ -1;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (stackIn_82_0 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    throw new IllegalStateException();
                }
                case 84: {
                    q.field_a = new String[var4];
                    d.a(cq.field_e, 0, q.field_a, 0, var4);
                    ud.field_N = new String[var3_int + -var4 + -1];
                    d.a(cq.field_e, var4 + 1, ud.field_N, 0, var3_int + (-var4 + -1));
                    if (aa.field_n.length >= q.field_a.length) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackIn_87_0 = q.field_a.length;
                    statePc = 87;
                    continue stateLoop;
                }
                case 86: {
                    stackIn_87_0 = aa.field_n.length;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    var5 = stackIn_87_0;
                    if ((ud.field_N.length ^ -1) >= (ik.field_a.length ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackIn_90_0 = ud.field_N.length;
                    statePc = 90;
                    continue stateLoop;
                }
                case 89: {
                    stackIn_90_0 = ik.field_a.length;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var6 = stackIn_90_0;
                    var7 = var6 + var5 + 7;
                    hq.field_m = new String[var7];
                    wd.field_Q = new int[var7];
                    var8 = 0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (var7 <= var8) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    wd.field_Q[var8] = -1;
                    var8++;
                    if (var9 != 0) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (var9 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    v.field_b = new int[2];
                    wd.field_Q[1] = 0;
                    hq.field_m[1] = rb.field_b;
                    hq.field_m[0] = mq.field_q;
                    hq.field_m[3] = dd.field_e;
                    v.field_b[1] = 2;
                    v.field_b[0] = 5;
                    hq.field_m[2] = cq.field_a;
                    hq.field_m[4] = wj.field_h;
                    hq.field_m[5] = "";
                    wd.field_Q[3] = 1;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    var8 = 0;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if ((var5 ^ -1) >= (var8 ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    stackIn_107_0 = hq.field_m;
                    stackIn_99_0 = stackIn_107_0;
                    stackIn_107_1 = 6 + var8;
                    stackIn_99_1 = stackIn_107_1;
                    stackIn_107_2 = 0;
                    stackIn_99_2 = stackIn_107_2;
                    stackIn_107_3 = var8 + (q.field_a.length + -var5);
                    stackIn_99_3 = stackIn_107_3;
                    if (var9 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackIn_101_0 = (String[]) ((Object) stackIn_99_0);
                    stackIn_100_0 = stackIn_101_0;
                    stackIn_101_1 = stackIn_99_1;
                    stackIn_100_1 = stackIn_101_1;
                    if (stackIn_99_2 > stackIn_99_3) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackIn_102_0 = (String[]) ((Object) stackIn_100_0);
                    stackIn_102_1 = stackIn_100_1;
                    stackIn_102_2 = q.field_a[var8 - -q.field_a.length + -var5];
                    statePc = 102;
                    continue stateLoop;
                }
                case 101: {
                    stackIn_102_0 = (String[]) ((Object) stackIn_101_0);
                    stackIn_102_1 = stackIn_101_1;
                    stackIn_102_2 = "";
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    stackIn_102_0[stackIn_102_1] = stackIn_102_2;
                    var8++;
                    if (var9 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    hq.field_m[6 + var5] = null;
                    wd.field_Q[var5 + 6] = -2;
                    var8 = 0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (var6 <= var8) {
                        statePc = 111;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackIn_127_0 = hq.field_m;
                    stackIn_106_0 = stackIn_127_0;
                    if (var9 != 0) {
                        statePc = 127;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_107_0 = (String[]) ((Object) stackIn_106_0);
                    stackIn_107_1 = var5 + 7 + var8;
                    stackIn_107_2 = var8 ^ -1;
                    stackIn_107_3 = ud.field_N.length ^ -1;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    stackIn_109_0 = (String[]) ((Object) stackIn_107_0);
                    stackIn_108_0 = stackIn_109_0;
                    stackIn_109_1 = stackIn_107_1;
                    stackIn_108_1 = stackIn_109_1;
                    if (stackIn_107_2 > stackIn_107_3) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackIn_110_0 = (String[]) ((Object) stackIn_108_0);
                    stackIn_110_1 = stackIn_108_1;
                    stackIn_110_2 = "";
                    statePc = 110;
                    continue stateLoop;
                }
                case 109: {
                    stackIn_110_0 = (String[]) ((Object) stackIn_109_0);
                    stackIn_110_1 = stackIn_109_1;
                    stackIn_110_2 = ud.field_N[var8];
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    stackIn_110_0[stackIn_110_1] = stackIn_110_2;
                    var8++;
                    if (var9 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    so.field_s = bl.a((byte) 41);
                    if (var9 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var3_int = mb.a(uq.field_f, false, oi.field_e, cq.field_e, ib.field_b);
                    var4 = 3 + var3_int;
                    hq.field_m = new String[var4];
                    wd.field_Q = new int[var4];
                    var5 = 0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    wd.field_Q[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 118;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (var9 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    v.field_b = new int[2];
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    var5 = 0;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (var3_int <= var5) {
                        statePc = 123;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    hq.field_m[var5] = cq.field_e[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var9 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    hq.field_m[-3 + var4] = "";
                    hq.field_m[-2 + var4] = p.field_b;
                    wd.field_Q[var4 - 2] = 0;
                    v.field_b[0] = 4;
                    hq.field_m[var4 + -1] = ic.field_f;
                    wd.field_Q[var4 + -1] = 1;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    v.field_b[1] = 5;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    aq.field_B.field_c = v.field_b.length;
                    var3_int = 0;
                    var4 = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    stackIn_127_0 = hq.field_m;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (stackIn_127_0.length <= var4) {
                        statePc = 136;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_164_0 = 0;
                    stackIn_129_0 = stackIn_164_0;
                    stackIn_164_1 = hq.field_m;
                    stackIn_129_1 = stackIn_164_1;
                    if (var9 != 0) {
                        statePc = 164;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_131_0 = stackIn_129_0;
                    stackIn_130_0 = stackIn_131_0;
                    stackIn_131_1 = stackIn_129_1[var4];
                    stackIn_130_1 = stackIn_131_1;
                    if (0 > wd.field_Q[var4]) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_132_0 = stackIn_130_0;
                    stackIn_132_1 = (String) ((Object) stackIn_130_1);
                    stackIn_132_2 = 1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = stackIn_131_0;
                    stackIn_132_1 = (String) ((Object) stackIn_131_1);
                    stackIn_132_2 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var5 = hn.a(stackIn_132_0, stackIn_132_1, stackIn_132_2 != 0);
                    if (var3_int < var5) {
                        statePc = 134;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var3_int = var5;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (-3 != (ho.field_q ^ -1)) {
                        statePc = 151;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var10 = aa.field_n;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if ((var10.length ^ -1) >= (var5 ^ -1)) {
                        statePc = 144;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var11 = var10[var5];
                    var7 = hn.a(0, var11, false);
                    stackIn_146_0 = var3_int;
                    stackIn_140_0 = stackIn_146_0;
                    stackIn_146_1 = var7;
                    stackIn_140_1 = stackIn_146_1;
                    if (var9 != 0) {
                        statePc = 146;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (stackIn_140_0 < stackIn_140_1) {
                        statePc = 142;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var3_int = var7;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 138;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var4_ref_String__ = ik.field_a;
                    var5 = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    stackIn_146_0 = var4_ref_String__.length ^ -1;
                    stackIn_146_1 = var5 ^ -1;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (stackIn_146_0 >= stackIn_146_1) {
                        statePc = 151;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var12 = var4_ref_String__[var5];
                    var7 = hn.a(0, var12, false);
                    stackIn_152_0 = var7 ^ -1;
                    stackIn_148_0 = stackIn_152_0;
                    stackIn_152_1 = var3_int ^ -1;
                    stackIn_148_1 = stackIn_152_1;
                    if (var9 != 0) {
                        statePc = 152;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (stackIn_148_0 >= stackIn_148_1) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var3_int = var7;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    qk.field_j = aq.field_B.field_c * (al.field_bb + wk.field_G << -2095370847);
                    ZombieDawnMulti.field_H = am.field_c - (var3_int >> 1283362145);
                    stackIn_152_0 = -(var3_int >> -641415647);
                    stackIn_152_1 = am.field_c - -var3_int;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    fl.field_a = stackIn_152_0 + stackIn_152_1;
                    var4 = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (hq.field_m.length <= var4) {
                        statePc = 159;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackIn_160_0 = qk.field_j;
                    stackIn_155_0 = stackIn_160_0;
                    stackIn_160_1 = wd.field_Q[var4] ^ -1;
                    stackIn_155_1 = stackIn_160_1;
                    stackIn_160_2 = -1;
                    stackIn_155_2 = stackIn_160_2;
                    if (var9 != 0) {
                        statePc = 160;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackIn_157_0 = stackIn_155_0;
                    stackIn_156_0 = stackIn_157_0;
                    if (stackIn_155_1 <= stackIn_155_2) {
                        statePc = 157;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    stackIn_158_0 = stackIn_156_0;
                    stackIn_158_1 = se.field_C;
                    statePc = 158;
                    continue stateLoop;
                }
                case 157: {
                    stackIn_158_0 = stackIn_157_0;
                    stackIn_158_1 = me.field_h;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    qk.field_j = stackIn_158_0 + stackIn_158_1;
                    var4++;
                    if (var9 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    stackIn_160_0 = bp.field_r;
                    stackIn_160_1 = qk.field_j;
                    stackIn_160_2 = 952257185;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    ce.field_k = stackIn_160_0 - (stackIn_160_1 >> stackIn_160_2);
                    uf.field_b = new int[hq.field_m.length][];
                    if (!param0) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    field_M = -108;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    var4 = 0;
                    var5 = ce.field_k;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    stackIn_164_0 = var4;
                    stackIn_164_1 = hq.field_m;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (stackIn_164_0 >= stackIn_164_1.length) {
                        statePc = 170;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var6 = wd.field_Q[var4];
                    stackIn_171_0 = -1;
                    stackIn_166_0 = stackIn_171_0;
                    stackIn_171_1 = var6 ^ -1;
                    stackIn_166_1 = stackIn_171_1;
                    if (var9 != 0) {
                        statePc = 171;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (stackIn_166_0 < stackIn_166_1) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var7 = hn.a(0, hq.field_m[var4], true);
                    var8 = am.field_c + -(var7 >> -573694047);
                    var5 = var5 + al.field_bb;
                    uf.field_b[var4] = new int[4];
                    uf.field_b[var4][0] = var8 + -no.field_Gb;
                    uf.field_b[var4][1] = var5;
                    uf.field_b[var4][2] = var7 - -(no.field_Gb << 290203713);
                    uf.field_b[var4][3] = (wk.field_G << -1501645247) + me.field_h;
                    var5 = var5 + ((wk.field_G << 2035462817) - (-al.field_bb + -me.field_h));
                    if (var9 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var5 = var5 + se.field_C;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 163;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    stackIn_171_0 = ho.field_q;
                    stackIn_171_1 = 2;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (stackIn_171_0 != stackIn_171_1) {
                        statePc = 174;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    aq.field_B.a(-1, param1, -31458, -1);
                    if (var9 == 0) {
                        statePc = 177;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    aq.field_B.a(0, param1, -31458, iq.a(bo.field_d, -1, bd.field_g));
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_L = null;
        if (!param0) {
            eb.a(-18, false, true);
        }
        field_e = null;
        field_w = null;
        field_J = null;
        field_y = null;
        field_i = null;
        field_B = null;
    }

    eb() {
        this.field_z = new byte[6][258];
        this.field_c = new int[6][258];
        this.field_I = new boolean[256];
        this.field_O = new int[6][258];
        this.field_b = 0;
        this.field_l = new byte[18002];
        this.field_C = new byte[256];
        this.field_t = new byte[18002];
        this.field_E = new boolean[16];
        this.field_D = 0;
        this.field_g = new int[16];
        this.field_v = new byte[4096];
        this.field_h = new int[6][258];
        this.field_G = new int[257];
        this.field_a = new int[6];
        this.field_m = new int[256];
    }

    static {
        field_e = "Field Marshal";
        field_L = "This game option has not yet been unlocked for use.";
        field_A = 2;
        field_J = new int[8192];
        field_w = new ao(15, 0, 1, 0);
        field_i = "Strong zombie is strong.";
        field_y = "Password is valid";
    }
}
