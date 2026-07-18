/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    int[] field_E;
    int[] field_h;
    int[] field_J;
    int[] field_A;
    int[][] field_g;
    int field_x;
    private int field_a;
    int field_b;
    int field_m;
    int field_o;
    int[] field_j;
    int[] field_z;
    int[] field_i;
    int field_v;
    int[] field_c;
    ib[] field_D;
    int[] field_u;
    static String field_w;
    byte[][] field_s;
    static int field_p;
    int[] field_I;
    private da field_l;
    int[] field_q;
    int[][] field_B;
    int[] field_f;
    int[] field_F;
    private int[] field_t;
    int[][] field_n;
    int[] field_L;
    private int field_d;
    int[] field_C;
    int[] field_r;
    int[] field_e;
    int[][] field_H;
    private int[] field_G;
    int[] field_k;
    int[][] field_y;
    int[] field_K;

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        ib var4 = null;
        int var5 = 0;
        var5 = Main.field_T;
        if (null == ((rj) this).field_l) {
          return;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (((rj) this).field_D.length <= var3) {
              L1: {
                if (var2 == 0) {
                  break L1;
                } else {
                  ((rj) this).field_G = null;
                  ((rj) this).field_t = null;
                  ((rj) this).field_l = null;
                  break L1;
                }
              }
              return;
            } else {
              if (null == ((rj) this).field_D[var3]) {
                L2: {
                  if (((rj) this).field_z[var3] >> 4 != 0) {
                    var4 = ((rj) this).field_l.b(((rj) this).field_t[var3], ((rj) this).field_G[var3], -14888);
                    break L2;
                  } else {
                    var4 = ((rj) this).field_l.a(((rj) this).field_G[var3], -1703274388, ((rj) this).field_t[var3]);
                    break L2;
                  }
                }
                if (var4 != null) {
                  ((rj) this).field_z[var3] = bc.a(((rj) this).field_z[var3], 15);
                  ((rj) this).field_D[var3] = var4;
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

    rj(pb param0, da param1) {
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
            ((rj) this).field_l = param1;
            ((rj) this).field_o = 1 + param0.f(86);
            int discarded$8 = param0.f(-125);
            ((rj) this).field_m = 1 + param0.f(116);
            ((rj) this).field_d = param0.f(90) - -1;
            ((rj) this).field_a = param0.f(-96) + 1;
            var3_int = param0.f(-118);
            ((rj) this).field_v = 1 & var3_int;
            ((rj) this).field_b = param0.f(-114);
            ((rj) this).field_x = param0.f(-106);
            ((rj) this).field_i = new int[((rj) this).field_o];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (((rj) this).field_o <= var5) {
                ((rj) this).field_c = new int[256];
                ((rj) this).field_s = new byte[256][];
                og.a(((rj) this).field_c, 0, 256, 64);
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 256) {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((rj) this).field_d) {
                        ((rj) this).field_J = new int[((rj) this).field_a];
                        ((rj) this).field_K = new int[((rj) this).field_a];
                        ((rj) this).field_B = new int[((rj) this).field_a][];
                        ((rj) this).field_j = new int[((rj) this).field_a];
                        ((rj) this).field_F = new int[((rj) this).field_a];
                        ((rj) this).field_e = new int[((rj) this).field_a];
                        ((rj) this).field_y = new int[((rj) this).field_a][];
                        ((rj) this).field_h = new int[((rj) this).field_a];
                        ((rj) this).field_n = new int[((rj) this).field_a][96];
                        ((rj) this).field_r = new int[((rj) this).field_a];
                        ((rj) this).field_H = new int[((rj) this).field_a][];
                        ((rj) this).field_g = new int[((rj) this).field_a][];
                        ((rj) this).field_k = new int[((rj) this).field_a];
                        ((rj) this).field_C = new int[((rj) this).field_a];
                        var5 = param0.d((byte) 72);
                        ((rj) this).field_D = new ib[var5];
                        ((rj) this).field_I = new int[var5];
                        ((rj) this).field_L = new int[var5];
                        ((rj) this).field_t = new int[var5];
                        ((rj) this).field_E = new int[var5];
                        ((rj) this).field_G = new int[var5];
                        ((rj) this).field_q = new int[var5];
                        ((rj) this).field_u = new int[var5];
                        ((rj) this).field_z = new int[var5];
                        ((rj) this).field_A = new int[var5];
                        ((rj) this).field_f = new int[var5];
                        var5 = 0;
                        var6 = 0;
                        L4: while (true) {
                          if (var6 >= ((rj) this).field_a) {
                            int discarded$9 = 15;
                            this.a();
                            break L0;
                          } else {
                            L5: {
                              var7 = param0.f(-101);
                              if (var7 <= 0) {
                                break L5;
                              } else {
                                var4 = 0;
                                var8 = 0;
                                L6: while (true) {
                                  if (var8 >= 96) {
                                    ((rj) this).field_k[var6] = param0.f(-97);
                                    var8 = param0.f(-128);
                                    ((rj) this).field_h[var6] = param0.f(73);
                                    ((rj) this).field_K[var6] = param0.f(80);
                                    ((rj) this).field_e[var6] = ((rj) this).field_K[var6] + param0.f(42);
                                    ((rj) this).field_j[var6] = param0.f(-120);
                                    var9 = param0.f(-122);
                                    ((rj) this).field_r[var6] = param0.f(-126);
                                    ((rj) this).field_F[var6] = param0.f(79);
                                    ((rj) this).field_C[var6] = ((rj) this).field_F[var6] + param0.f(-105);
                                    ((rj) this).field_y[var6] = new int[var8];
                                    var4 = 0;
                                    var10 = 0;
                                    var11 = 0;
                                    L7: while (true) {
                                      if (var8 <= var11) {
                                        ((rj) this).field_B[var6] = new int[var8];
                                        var4 = 0;
                                        var11 = 0;
                                        L8: while (true) {
                                          if (var11 >= var8) {
                                            var10 = 0;
                                            var4 = 0;
                                            ((rj) this).field_H[var6] = new int[var9];
                                            var11 = 0;
                                            L9: while (true) {
                                              if (var9 <= var11) {
                                                var4 = 0;
                                                ((rj) this).field_g[var6] = new int[var9];
                                                var11 = 0;
                                                L10: while (true) {
                                                  if (var11 >= var9) {
                                                    ((rj) this).field_J[var6] = param0.d((byte) 72);
                                                    var11 = 0;
                                                    L11: while (true) {
                                                      if (var11 >= var7) {
                                                        break L5;
                                                      } else {
                                                        ((rj) this).field_q[var5] = param0.e(true);
                                                        ((rj) this).field_A[var5] = param0.e(true);
                                                        ((rj) this).field_u[var5] = ((rj) this).field_A[var5] - -param0.e(true);
                                                        ((rj) this).field_E[var5] = param0.f(29);
                                                        ((rj) this).field_I[var5] = param0.a(true);
                                                        ((rj) this).field_z[var5] = param0.f(28);
                                                        ((rj) this).field_L[var5] = param0.f(-95);
                                                        ((rj) this).field_f[var5] = param0.a(true) - 1;
                                                        ((rj) this).field_t[var5] = param0.d((byte) 72);
                                                        ((rj) this).field_G[var5] = param0.d((byte) 72);
                                                        var5++;
                                                        var11++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    int dupTemp$10 = var4 + param0.f(51);
                                                    var4 = dupTemp$10;
                                                    ((rj) this).field_g[var6][var11] = bc.a(255, dupTemp$10);
                                                    var11++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                int dupTemp$11 = var10 + param0.b((byte) 59);
                                                var10 = dupTemp$11;
                                                var4 = var4 + dupTemp$11;
                                                ((rj) this).field_H[var6][var11] = var4 + dupTemp$11;
                                                var11++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            int dupTemp$12 = var4 + param0.f(99);
                                            var4 = dupTemp$12;
                                            ((rj) this).field_B[var6][var11] = bc.a(dupTemp$12, 255);
                                            var11++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        int dupTemp$13 = var10 + param0.b((byte) 59);
                                        var10 = dupTemp$13;
                                        var4 = var4 + dupTemp$13;
                                        ((rj) this).field_y[var6][var11] = var4 + dupTemp$13;
                                        var11++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    int dupTemp$14 = var4 + param0.f(98);
                                    var4 = dupTemp$14;
                                    ((rj) this).field_n[var6][var8] = bc.a(255, dupTemp$14) + var5;
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
                          ((rj) this).field_c[var5] = param0.f(-101) + 1;
                          var6 = param0.d((byte) 72);
                          var16 = new byte[var6];
                          if (var6 <= 0) {
                            break L12;
                          } else {
                            param0.a(66, var16, 0, var6);
                            ((rj) this).field_s[var5] = var16;
                            break L12;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ((rj) this).field_s[var5] = sh.field_j;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                int dupTemp$15 = var4 + param0.f(18);
                var4 = dupTemp$15;
                ((rj) this).field_i[var5] = bc.a(255, dupTemp$15);
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
            stackOut_36_1 = new StringBuilder().append("rj.<init>(");
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
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
    }

    public static void b(int param0) {
        field_w = null;
        if (param0 <= 57) {
            field_p = -35;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Loading extra data";
        field_p = 2014707693;
    }
}
