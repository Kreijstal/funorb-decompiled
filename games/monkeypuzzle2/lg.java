/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static wl field_n;
    td[] field_h;
    int[] field_k;
    int[] field_J;
    byte[][] field_L;
    static te field_E;
    int[] field_q;
    int[] field_a;
    int field_K;
    int field_e;
    int[] field_A;
    int field_f;
    int[] field_b;
    int[] field_C;
    int[] field_x;
    private int field_G;
    int[] field_c;
    private ud field_i;
    int[][] field_t;
    static lg field_M;
    int[][] field_y;
    private int[] field_p;
    int[] field_N;
    int[] field_B;
    int[][] field_z;
    int field_j;
    int[] field_H;
    int[] field_O;
    int[] field_g;
    int[] field_d;
    int[] field_v;
    int[] field_o;
    static int field_w;
    int[] field_m;
    int[] field_F;
    private int[] field_l;
    int[][] field_u;
    int[][] field_r;
    int field_s;
    private int field_D;
    static String field_I;

    public static void b(int param0) {
        field_I = null;
        field_M = null;
        field_E = null;
        field_n = null;
    }

    final static void a(byte param0) {
        if (param0 < 62) {
            lg.a((byte) 84);
        }
        cl.field_e = MonkeyPuzzle2.field_D.f(-1);
        CharSequence var2 = (CharSequence) (Object) cl.field_e;
        uj.field_f = pl.a((byte) 112, var2);
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        td var4 = null;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((lg) this).field_i != null) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((lg) this).field_h.length) {
              L1: {
                if (var2 == 0) {
                  break L1;
                } else {
                  ((lg) this).field_i = null;
                  ((lg) this).field_l = null;
                  ((lg) this).field_p = null;
                  break L1;
                }
              }
              return;
            } else {
              if (((lg) this).field_h[var3] == null) {
                L2: {
                  if (((lg) this).field_c[var3] >> 4 != 0) {
                    var4 = ((lg) this).field_i.a(((lg) this).field_p[var3], ((lg) this).field_l[var3], true);
                    break L2;
                  } else {
                    var4 = ((lg) this).field_i.a(-18480, ((lg) this).field_l[var3], ((lg) this).field_p[var3]);
                    break L2;
                  }
                }
                if (var4 == null) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  ((lg) this).field_c[var3] = ch.a(((lg) this).field_c[var3], 15);
                  ((lg) this).field_h[var3] = var4;
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    lg(gk param0, ud param1) {
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
            ((lg) this).field_i = param1;
            ((lg) this).field_s = 1 + param0.a((byte) 114);
            int discarded$7 = param0.a((byte) 114);
            ((lg) this).field_j = 1 + param0.a((byte) 114);
            ((lg) this).field_D = 1 + param0.a((byte) 114);
            ((lg) this).field_G = param0.a((byte) 114) + 1;
            var3_int = param0.a((byte) 114);
            ((lg) this).field_e = 1 & var3_int;
            ((lg) this).field_f = param0.a((byte) 114);
            ((lg) this).field_K = param0.a((byte) 114);
            ((lg) this).field_q = new int[((lg) this).field_s];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (((lg) this).field_s <= var5) {
                ((lg) this).field_L = new byte[256][];
                ((lg) this).field_x = new int[256];
                gl.a(((lg) this).field_x, 0, 256, 64);
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 256) {
                    var5 = 0;
                    L3: while (true) {
                      if (((lg) this).field_D <= var5) {
                        ((lg) this).field_r = new int[((lg) this).field_G][];
                        ((lg) this).field_H = new int[((lg) this).field_G];
                        ((lg) this).field_J = new int[((lg) this).field_G];
                        ((lg) this).field_y = new int[((lg) this).field_G][];
                        ((lg) this).field_t = new int[((lg) this).field_G][96];
                        ((lg) this).field_z = new int[((lg) this).field_G][];
                        ((lg) this).field_k = new int[((lg) this).field_G];
                        ((lg) this).field_C = new int[((lg) this).field_G];
                        ((lg) this).field_F = new int[((lg) this).field_G];
                        ((lg) this).field_d = new int[((lg) this).field_G];
                        ((lg) this).field_v = new int[((lg) this).field_G];
                        ((lg) this).field_b = new int[((lg) this).field_G];
                        ((lg) this).field_m = new int[((lg) this).field_G];
                        ((lg) this).field_u = new int[((lg) this).field_G][];
                        var5 = param0.j(17277);
                        ((lg) this).field_l = new int[var5];
                        ((lg) this).field_B = new int[var5];
                        ((lg) this).field_h = new td[var5];
                        ((lg) this).field_c = new int[var5];
                        ((lg) this).field_g = new int[var5];
                        ((lg) this).field_a = new int[var5];
                        ((lg) this).field_N = new int[var5];
                        ((lg) this).field_A = new int[var5];
                        ((lg) this).field_p = new int[var5];
                        ((lg) this).field_o = new int[var5];
                        ((lg) this).field_O = new int[var5];
                        var5 = 0;
                        var6 = 0;
                        L4: while (true) {
                          if (~((lg) this).field_G >= ~var6) {
                            this.a(-1);
                            break L0;
                          } else {
                            L5: {
                              var7 = param0.a((byte) 114);
                              if (var7 <= 0) {
                                break L5;
                              } else {
                                var4 = 0;
                                var8 = 0;
                                L6: while (true) {
                                  if (var8 >= 96) {
                                    ((lg) this).field_d[var6] = param0.a((byte) 114);
                                    var8 = param0.a((byte) 114);
                                    ((lg) this).field_k[var6] = param0.a((byte) 114);
                                    ((lg) this).field_b[var6] = param0.a((byte) 114);
                                    ((lg) this).field_H[var6] = ((lg) this).field_b[var6] + param0.a((byte) 114);
                                    ((lg) this).field_J[var6] = param0.a((byte) 114);
                                    var9 = param0.a((byte) 114);
                                    ((lg) this).field_F[var6] = param0.a((byte) 114);
                                    ((lg) this).field_C[var6] = param0.a((byte) 114);
                                    ((lg) this).field_v[var6] = ((lg) this).field_C[var6] + param0.a((byte) 114);
                                    var4 = 0;
                                    ((lg) this).field_y[var6] = new int[var8];
                                    var10 = 0;
                                    var11 = 0;
                                    L7: while (true) {
                                      if (~var8 >= ~var11) {
                                        ((lg) this).field_u[var6] = new int[var8];
                                        var4 = 0;
                                        var11 = 0;
                                        L8: while (true) {
                                          if (var11 >= var8) {
                                            ((lg) this).field_r[var6] = new int[var9];
                                            var4 = 0;
                                            var10 = 0;
                                            var11 = 0;
                                            L9: while (true) {
                                              if (~var11 <= ~var9) {
                                                var4 = 0;
                                                ((lg) this).field_z[var6] = new int[var9];
                                                var11 = 0;
                                                L10: while (true) {
                                                  if (~var9 >= ~var11) {
                                                    ((lg) this).field_m[var6] = param0.j(17277);
                                                    var11 = 0;
                                                    L11: while (true) {
                                                      if (var11 >= var7) {
                                                        break L5;
                                                      } else {
                                                        ((lg) this).field_o[var5] = param0.c((byte) -127);
                                                        ((lg) this).field_B[var5] = param0.c((byte) 109);
                                                        ((lg) this).field_A[var5] = ((lg) this).field_B[var5] + param0.c((byte) 86);
                                                        ((lg) this).field_a[var5] = param0.a((byte) 114);
                                                        ((lg) this).field_g[var5] = param0.k(102);
                                                        ((lg) this).field_c[var5] = param0.a((byte) 114);
                                                        ((lg) this).field_N[var5] = param0.a((byte) 114);
                                                        ((lg) this).field_O[var5] = param0.k(28) + -1;
                                                        ((lg) this).field_l[var5] = param0.j(17277);
                                                        ((lg) this).field_p[var5] = param0.j(17277);
                                                        var5++;
                                                        var11++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    int dupTemp$8 = var4 + param0.a((byte) 114);
                                                    var4 = dupTemp$8;
                                                    ((lg) this).field_z[var6][var11] = ch.a(dupTemp$8, 255);
                                                    var11++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                int dupTemp$9 = var10 + param0.h(-129);
                                                var10 = dupTemp$9;
                                                var4 = var4 + dupTemp$9;
                                                ((lg) this).field_r[var6][var11] = var4 + dupTemp$9;
                                                var11++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            int dupTemp$10 = var4 + param0.a((byte) 114);
                                            var4 = dupTemp$10;
                                            ((lg) this).field_u[var6][var11] = ch.a(255, dupTemp$10);
                                            var11++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        int dupTemp$11 = var10 + param0.h(-129);
                                        var10 = dupTemp$11;
                                        var4 = var4 + dupTemp$11;
                                        ((lg) this).field_y[var6][var11] = var4 + dupTemp$11;
                                        var11++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    int dupTemp$12 = var4 + param0.a((byte) 114);
                                    var4 = dupTemp$12;
                                    ((lg) this).field_t[var6][var8] = ch.a(255, dupTemp$12) + var5;
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
                          ((lg) this).field_x[var5] = 1 + param0.a((byte) 114);
                          var6 = param0.j(17277);
                          var16 = new byte[var6];
                          if (var6 <= 0) {
                            break L12;
                          } else {
                            param0.a(var16, var6, -121, 0);
                            ((lg) this).field_L[var5] = var16;
                            break L12;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ((lg) this).field_L[var5] = ah.field_c;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                int dupTemp$13 = var4 + param0.a((byte) 114);
                var4 = dupTemp$13;
                ((lg) this).field_q[var5] = ch.a(255, dupTemp$13);
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
            stackOut_36_1 = new StringBuilder().append("lg.<init>(");
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
          throw la.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new te(9, 0, 4, 1);
        field_I = "The tips are currently off.";
    }
}
