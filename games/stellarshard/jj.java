/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    int[] field_v;
    private int field_z;
    int[] field_J;
    int[] field_D;
    int field_s;
    int[] field_B;
    int[] field_q;
    int field_w;
    private int[] field_G;
    int[] field_m;
    int[] field_E;
    int[] field_n;
    private int field_K;
    int[] field_l;
    int[] field_b;
    int[][] field_C;
    int[][] field_g;
    int field_r;
    int[][] field_I;
    static di field_k;
    int field_d;
    int[] field_H;
    int[] field_A;
    int[] field_f;
    static long field_p;
    byte[][] field_y;
    int[][] field_x;
    int[] field_o;
    private gk field_u;
    int[] field_t;
    int[] field_e;
    int[][] field_L;
    int[] field_c;
    int field_a;
    int[] field_F;
    int[] field_h;
    ud[] field_j;
    private int[] field_i;

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = stellarshard.field_B;
        int var4 = -1;
        if (param3 > -48) {
            jj.a((byte) 14, -35L);
        }
        for (var5 = param0; var5 < param2; var5++) {
            var4 = nb.field_F[255 & (var4 ^ param1[var5])] ^ var4 >>> 1392494472;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    public static void a(int param0) {
        if (param0 != 18917) {
            Object var2 = null;
            int discarded$0 = jj.a(-53, (byte[]) null, 76, -35);
        }
        field_k = null;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        ud var4 = null;
        int var5 = 0;
        var5 = stellarshard.field_B;
        if (((jj) this).field_u == null) {
          return;
        } else {
          var2 = param0 ? 1 : 0;
          var3 = 0;
          L0: while (true) {
            if (((jj) this).field_j.length <= var3) {
              L1: {
                if (var2 == 0) {
                  break L1;
                } else {
                  ((jj) this).field_G = null;
                  ((jj) this).field_u = null;
                  ((jj) this).field_i = null;
                  break L1;
                }
              }
              return;
            } else {
              if (null == ((jj) this).field_j[var3]) {
                L2: {
                  if (((jj) this).field_c[var3] >> -909039804 == 0) {
                    var4 = ((jj) this).field_u.a(((jj) this).field_i[var3], ((jj) this).field_G[var3], false);
                    break L2;
                  } else {
                    var4 = ((jj) this).field_u.a((byte) -65, ((jj) this).field_G[var3], ((jj) this).field_i[var3]);
                    break L2;
                  }
                }
                if (var4 != null) {
                  ((jj) this).field_c[var3] = sa.a(((jj) this).field_c[var3], 15);
                  ((jj) this).field_j[var3] = var4;
                  var3++;
                  continue L0;
                } else {
                  var2 = 0;
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(byte param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (param0 >= -112) {
            field_p = 50L;
        }
        if (param1 % 10L != 0L) {
            ef.a(11, param1);
        } else {
            ef.a(11, -1L + param1);
            ef.a(11, 1L);
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, pb[] param7, pb[] param8, int param9, int param10, int param11, bd param12, bd param13) {
        pk.a(4);
        if (!param0) {
            Object var15 = null;
            int discarded$0 = jj.a(-44, (byte[]) null, -58, 66);
        }
    }

    final static bh[] b(int param0) {
        if (param0 != -1) {
            return null;
        }
        return new bh[]{kk.field_k, ak.field_d, ma.field_m};
    }

    jj(ka param0, gk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var16 = null;
        ((jj) this).field_u = param1;
        ((jj) this).field_d = 1 + param0.f(4);
        int discarded$7 = param0.f(4);
        ((jj) this).field_r = 1 + param0.f(4);
        ((jj) this).field_z = param0.f(4) - -1;
        ((jj) this).field_K = param0.f(4) + 1;
        var3 = param0.f(4);
        ((jj) this).field_s = 1 & var3;
        ((jj) this).field_a = param0.f(4);
        ((jj) this).field_w = param0.f(4);
        ((jj) this).field_f = new int[((jj) this).field_d];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((jj) this).field_d) {
            ((jj) this).field_l = new int[256];
            ((jj) this).field_y = new byte[256][];
            ri.a(((jj) this).field_l, 0, 256, 64);
            var5 = 0;
            L1: while (true) {
              if (256 <= var5) {
                var5 = 0;
                L2: while (true) {
                  if (((jj) this).field_z <= var5) {
                    ((jj) this).field_D = new int[((jj) this).field_K];
                    ((jj) this).field_B = new int[((jj) this).field_K];
                    ((jj) this).field_E = new int[((jj) this).field_K];
                    ((jj) this).field_g = new int[((jj) this).field_K][];
                    ((jj) this).field_L = new int[((jj) this).field_K][];
                    ((jj) this).field_C = new int[((jj) this).field_K][96];
                    ((jj) this).field_e = new int[((jj) this).field_K];
                    ((jj) this).field_I = new int[((jj) this).field_K][];
                    ((jj) this).field_H = new int[((jj) this).field_K];
                    ((jj) this).field_q = new int[((jj) this).field_K];
                    ((jj) this).field_b = new int[((jj) this).field_K];
                    ((jj) this).field_x = new int[((jj) this).field_K][];
                    ((jj) this).field_F = new int[((jj) this).field_K];
                    ((jj) this).field_A = new int[((jj) this).field_K];
                    var5 = param0.c((byte) 124);
                    ((jj) this).field_h = new int[var5];
                    ((jj) this).field_n = new int[var5];
                    ((jj) this).field_J = new int[var5];
                    ((jj) this).field_t = new int[var5];
                    ((jj) this).field_v = new int[var5];
                    ((jj) this).field_c = new int[var5];
                    ((jj) this).field_G = new int[var5];
                    ((jj) this).field_o = new int[var5];
                    ((jj) this).field_i = new int[var5];
                    ((jj) this).field_j = new ud[var5];
                    ((jj) this).field_m = new int[var5];
                    var5 = 0;
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= ((jj) this).field_K) {
                        this.a(true);
                        return;
                      } else {
                        var7 = param0.f(4);
                        if (0 < var7) {
                          var4 = 0;
                          var8 = 0;
                          L4: while (true) {
                            if ((var8 ^ -1) <= -97) {
                              ((jj) this).field_A[var6] = param0.f(4);
                              var8 = param0.f(4);
                              ((jj) this).field_D[var6] = param0.f(4);
                              ((jj) this).field_e[var6] = param0.f(4);
                              ((jj) this).field_q[var6] = ((jj) this).field_e[var6] + param0.f(4);
                              ((jj) this).field_F[var6] = param0.f(4);
                              var9 = param0.f(4);
                              ((jj) this).field_B[var6] = param0.f(4);
                              ((jj) this).field_E[var6] = param0.f(4);
                              ((jj) this).field_H[var6] = ((jj) this).field_E[var6] - -param0.f(4);
                              ((jj) this).field_L[var6] = new int[var8];
                              var4 = 0;
                              var10 = 0;
                              var11 = 0;
                              L5: while (true) {
                                if (var8 <= var11) {
                                  var4 = 0;
                                  ((jj) this).field_I[var6] = new int[var8];
                                  var11 = 0;
                                  L6: while (true) {
                                    if (var8 <= var11) {
                                      ((jj) this).field_x[var6] = new int[var9];
                                      var4 = 0;
                                      var10 = 0;
                                      var11 = 0;
                                      L7: while (true) {
                                        if (var11 >= var9) {
                                          ((jj) this).field_g[var6] = new int[var9];
                                          var4 = 0;
                                          var11 = 0;
                                          L8: while (true) {
                                            if (var11 >= var9) {
                                              ((jj) this).field_b[var6] = param0.c((byte) 85);
                                              var11 = 0;
                                              L9: while (true) {
                                                if (var11 < var7) {
                                                  ((jj) this).field_m[var5] = param0.c(true);
                                                  ((jj) this).field_t[var5] = param0.c(true);
                                                  ((jj) this).field_v[var5] = ((jj) this).field_t[var5] + param0.c(true);
                                                  ((jj) this).field_J[var5] = param0.f(4);
                                                  ((jj) this).field_n[var5] = param0.g(110);
                                                  ((jj) this).field_c[var5] = param0.f(4);
                                                  ((jj) this).field_h[var5] = param0.f(4);
                                                  ((jj) this).field_o[var5] = param0.g(112) + -1;
                                                  ((jj) this).field_i[var5] = param0.c((byte) 71);
                                                  ((jj) this).field_G[var5] = param0.c((byte) 60);
                                                  var5++;
                                                  var11++;
                                                  continue L9;
                                                } else {
                                                  var6++;
                                                  continue L3;
                                                }
                                              }
                                            } else {
                                              int dupTemp$8 = var4 + param0.f(4);
                                              var4 = dupTemp$8;
                                              ((jj) this).field_g[var6][var11] = sa.a(dupTemp$8, 255);
                                              var11++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          int dupTemp$9 = var10 + param0.e(-64);
                                          var10 = dupTemp$9;
                                          var4 = var4 + dupTemp$9;
                                          ((jj) this).field_x[var6][var11] = var4 + dupTemp$9;
                                          var11++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      int dupTemp$10 = var4 + param0.f(4);
                                      var4 = dupTemp$10;
                                      ((jj) this).field_I[var6][var11] = sa.a(255, dupTemp$10);
                                      var11++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  int dupTemp$11 = var10 + param0.e(-64);
                                  var10 = dupTemp$11;
                                  var4 = var4 + dupTemp$11;
                                  ((jj) this).field_L[var6][var11] = var4 + dupTemp$11;
                                  var11++;
                                  continue L5;
                                }
                              }
                            } else {
                              int dupTemp$12 = var4 + param0.f(4);
                              var4 = dupTemp$12;
                              ((jj) this).field_C[var6][var8] = var5 - -sa.a(255, dupTemp$12);
                              var8++;
                              continue L4;
                            }
                          }
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    ((jj) this).field_l[var5] = param0.f(4) - -1;
                    var6 = param0.c((byte) 73);
                    var16 = new byte[var6];
                    if (-1 > (var6 ^ -1)) {
                      param0.a(0, (byte) -104, var6, var16);
                      ((jj) this).field_y[var5] = var16;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                ((jj) this).field_y[var5] = sb.field_i;
                var5++;
                continue L1;
              }
            }
          } else {
            int dupTemp$13 = var4 + param0.f(4);
            var4 = dupTemp$13;
            ((jj) this).field_f[var5] = sa.a(dupTemp$13, 255);
            var5++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new di();
    }
}
