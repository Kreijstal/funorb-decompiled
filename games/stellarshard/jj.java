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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param3 <= -48) {
                break L1;
              } else {
                jj.a((byte) 14, -35L);
                break L1;
              }
            }
            var5 = param0;
            L2: while (true) {
              if (var5 >= param2) {
                var4_int = ~var4_int;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4_int = nb.field_F[255 & (var4_int ^ param1[var5])] ^ var4_int >>> 8;
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("jj.C(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    public static void a(int param0) {
        if (param0 != 18917) {
            Object var2 = null;
            int discarded$0 = jj.a(-53, (byte[]) null, 76, -35);
        }
        field_k = null;
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        ud var4 = null;
        int var5 = 0;
        var5 = stellarshard.field_B;
        if (((jj) this).field_u == null) {
          return;
        } else {
          var2 = 1;
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
                  if (((jj) this).field_c[var3] >> 4 == 0) {
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
        RuntimeException var14 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            pk.a(4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var14 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var14;
            stackOut_2_1 = new StringBuilder().append("jj.B(").append(1).append(44).append(0).append(44).append(8).append(44).append(240).append(44).append(320).append(44).append(8).append(44).append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param7 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param8 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param9).append(44).append(0).append(44).append(param11).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param12 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param13 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final static bh[] b() {
        return new bh[]{kk.field_k, ak.field_d, ma.field_m};
    }

    jj(ka param0, gk param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var16 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        try {
          L0: {
            ((jj) this).field_u = param1;
            ((jj) this).field_d = 1 + param0.f(4);
            int discarded$8 = param0.f(4);
            ((jj) this).field_r = 1 + param0.f(4);
            ((jj) this).field_z = param0.f(4) - -1;
            ((jj) this).field_K = param0.f(4) + 1;
            var3_int = param0.f(4);
            ((jj) this).field_s = 1 & var3_int;
            ((jj) this).field_a = param0.f(4);
            ((jj) this).field_w = param0.f(4);
            ((jj) this).field_f = new int[((jj) this).field_d];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((jj) this).field_d) {
                ((jj) this).field_l = new int[256];
                ((jj) this).field_y = new byte[256][];
                ri.a(((jj) this).field_l, 0, 256, 64);
                var5 = 0;
                L2: while (true) {
                  if (256 <= var5) {
                    var5 = 0;
                    L3: while (true) {
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
                        L4: while (true) {
                          if (var6 >= ((jj) this).field_K) {
                            int discarded$9 = 1;
                            this.a();
                            break L0;
                          } else {
                            L5: {
                              var7 = param0.f(4);
                              if (0 >= var7) {
                                break L5;
                              } else {
                                var4 = 0;
                                var8 = 0;
                                L6: while (true) {
                                  if (var8 >= 96) {
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
                                    L7: while (true) {
                                      if (var8 <= var11) {
                                        var4 = 0;
                                        ((jj) this).field_I[var6] = new int[var8];
                                        var11 = 0;
                                        L8: while (true) {
                                          if (var8 <= var11) {
                                            ((jj) this).field_x[var6] = new int[var9];
                                            var4 = 0;
                                            var10 = 0;
                                            var11 = 0;
                                            L9: while (true) {
                                              if (var11 >= var9) {
                                                ((jj) this).field_g[var6] = new int[var9];
                                                var4 = 0;
                                                var11 = 0;
                                                L10: while (true) {
                                                  if (var11 >= var9) {
                                                    ((jj) this).field_b[var6] = param0.c((byte) 85);
                                                    var11 = 0;
                                                    L11: while (true) {
                                                      if (var11 >= var7) {
                                                        break L5;
                                                      } else {
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
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    int dupTemp$10 = var4 + param0.f(4);
                                                    var4 = dupTemp$10;
                                                    ((jj) this).field_g[var6][var11] = sa.a(dupTemp$10, 255);
                                                    var11++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                int dupTemp$11 = var10 + param0.e(-64);
                                                var10 = dupTemp$11;
                                                var4 = var4 + dupTemp$11;
                                                ((jj) this).field_x[var6][var11] = var4 + dupTemp$11;
                                                var11++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            int dupTemp$12 = var4 + param0.f(4);
                                            var4 = dupTemp$12;
                                            ((jj) this).field_I[var6][var11] = sa.a(255, dupTemp$12);
                                            var11++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        int dupTemp$13 = var10 + param0.e(-64);
                                        var10 = dupTemp$13;
                                        var4 = var4 + dupTemp$13;
                                        ((jj) this).field_L[var6][var11] = var4 + dupTemp$13;
                                        var11++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    int dupTemp$14 = var4 + param0.f(4);
                                    var4 = dupTemp$14;
                                    ((jj) this).field_C[var6][var8] = var5 - -sa.a(255, dupTemp$14);
                                    var8++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                            var6++;
                            continue L4;
                          }
                        }
                      } else {
                        L12: {
                          ((jj) this).field_l[var5] = param0.f(4) - -1;
                          var6 = param0.c((byte) 73);
                          var16 = new byte[var6];
                          if (var6 <= 0) {
                            break L12;
                          } else {
                            param0.a(0, (byte) -104, var6, var16);
                            ((jj) this).field_y[var5] = var16;
                            break L12;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ((jj) this).field_y[var5] = sb.field_i;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                int dupTemp$15 = var4 + param0.f(4);
                var4 = dupTemp$15;
                ((jj) this).field_f[var5] = sa.a(dupTemp$15, 255);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("jj.<init>(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          L14: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L14;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new di();
    }
}
