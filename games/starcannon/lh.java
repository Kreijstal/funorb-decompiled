/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lh {
    static int field_I;
    int[] field_q;
    int[] field_v;
    int[][] field_f;
    int[] field_b;
    int[] field_a;
    ud[] field_L;
    int[] field_e;
    int field_w;
    static hl field_N;
    static String field_D;
    int field_p;
    int[] field_A;
    int[][] field_H;
    byte[][] field_l;
    int[] field_K;
    int[] field_J;
    int[][] field_k;
    int[] field_F;
    int[] field_i;
    static java.util.zip.CRC32 field_g;
    private int field_h;
    int[] field_B;
    int[] field_z;
    int[] field_O;
    int[] field_d;
    static int field_s;
    private int field_G;
    int field_M;
    int[] field_C;
    int[][] field_j;
    int field_u;
    private int[] field_x;
    int[] field_o;
    int[][] field_r;
    private int[] field_t;
    int[] field_E;
    int[] field_c;
    int[] field_P;
    private ja field_y;
    static String field_n;
    int field_m;

    public static void a() {
        field_g = null;
        field_N = null;
        field_n = null;
        field_D = null;
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = StarCannon.field_A;
        if (qb.field_h >= 0) {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (75 <= qb.field_h) {
              break L0;
            } else {
              var5 = (qb.field_h << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (qb.field_h > 200) {
              var5 = (250 - qb.field_h << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            bc.a(wj.field_g, 26095);
            gl.b();
            ki.b();
            nc.a(-1196777214);
            if (var5 < 256) {
              ki.b(0, 0, ki.field_j, ki.field_f, 0, 256 - var5);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            wf.a(-123);
            if (qb.field_h >= 150) {
              m.field_a.e(var3 + 15, 10 + var4, var5);
              break L3;
            } else {
              wj.field_g.a(var3, var4);
              break L3;
            }
          }
          L4: {
            var6 = -125 + qb.field_h;
            if (var6 <= 0) {
              break L4;
            } else {
              if (var6 >= 50) {
                break L4;
              } else {
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  ak.field_f.f(var3, var4, var7);
                  break L4;
                } else {
                  if (var6 >= 30) {
                    var7 = 256 * (-var6 + 50) / 20;
                    ak.field_f.f(var3, var4, var7);
                    break L4;
                  } else {
                    ak.field_f.f(var3, var4, 256);
                    break L4;
                  }
                }
              }
            }
          }
          L5: {
            var6 = -140 + qb.field_h;
            if (var6 > 0) {
              L6: {
                var7 = 256;
                if (var6 >= 20) {
                  break L6;
                } else {
                  var7 = var6 * 256 / 20;
                  break L6;
                }
              }
              ai.field_g.e(var3 + 15, 10 + var4, var5 * var7 >> 8);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ud var5 = null;
        int var6 = 0;
        var6 = StarCannon.field_A;
        if (((lh) this).field_y != null) {
          var2 = 1;
          var4 = 0;
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((lh) this).field_L.length) {
              L1: {
                if (var2 != 0) {
                  ((lh) this).field_x = null;
                  ((lh) this).field_t = null;
                  ((lh) this).field_y = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              if (null == ((lh) this).field_L[var3]) {
                L2: {
                  if (((lh) this).field_B[var3] >> 4 == 0) {
                    var5 = ((lh) this).field_y.b(((lh) this).field_t[var3], ((lh) this).field_x[var3], 91);
                    break L2;
                  } else {
                    var5 = ((lh) this).field_y.a(((lh) this).field_x[var3], ((lh) this).field_t[var3], (byte) 41);
                    break L2;
                  }
                }
                if (var5 != null) {
                  ((lh) this).field_B[var3] = w.a(((lh) this).field_B[var3], 15);
                  ((lh) this).field_L[var3] = var5;
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
        } else {
          return;
        }
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                L2: {
                  if (param2 != param1.charAt(var5)) {
                    break L2;
                  } else {
                    var3_int++;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("lh.A(").append(-15790).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    lh(rb param0, ja param1) {
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
            ((lh) this).field_y = param1;
            ((lh) this).field_M = param0.j(7909) + 1;
            int discarded$8 = param0.j(7909);
            ((lh) this).field_p = 1 + param0.j(7909);
            ((lh) this).field_h = 1 + param0.j(7909);
            ((lh) this).field_G = param0.j(7909) - -1;
            var3_int = param0.j(7909);
            ((lh) this).field_m = var3_int & 1;
            ((lh) this).field_w = param0.j(7909);
            ((lh) this).field_u = param0.j(7909);
            ((lh) this).field_F = new int[((lh) this).field_M];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((lh) this).field_M) {
                ((lh) this).field_c = new int[256];
                ((lh) this).field_l = new byte[256][];
                ug.a(((lh) this).field_c, 0, 256, 64);
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 256) {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((lh) this).field_h) {
                        ((lh) this).field_K = new int[((lh) this).field_G];
                        ((lh) this).field_v = new int[((lh) this).field_G];
                        ((lh) this).field_r = new int[((lh) this).field_G][];
                        ((lh) this).field_k = new int[((lh) this).field_G][];
                        ((lh) this).field_f = new int[((lh) this).field_G][];
                        ((lh) this).field_a = new int[((lh) this).field_G];
                        ((lh) this).field_H = new int[((lh) this).field_G][];
                        ((lh) this).field_P = new int[((lh) this).field_G];
                        ((lh) this).field_b = new int[((lh) this).field_G];
                        ((lh) this).field_j = new int[((lh) this).field_G][96];
                        ((lh) this).field_z = new int[((lh) this).field_G];
                        ((lh) this).field_C = new int[((lh) this).field_G];
                        ((lh) this).field_O = new int[((lh) this).field_G];
                        ((lh) this).field_i = new int[((lh) this).field_G];
                        var5 = param0.i(-1174051992);
                        ((lh) this).field_J = new int[var5];
                        ((lh) this).field_A = new int[var5];
                        ((lh) this).field_E = new int[var5];
                        ((lh) this).field_e = new int[var5];
                        ((lh) this).field_d = new int[var5];
                        ((lh) this).field_q = new int[var5];
                        ((lh) this).field_t = new int[var5];
                        ((lh) this).field_L = new ud[var5];
                        ((lh) this).field_B = new int[var5];
                        ((lh) this).field_o = new int[var5];
                        ((lh) this).field_x = new int[var5];
                        var5 = 0;
                        var6 = 0;
                        L4: while (true) {
                          if (((lh) this).field_G <= var6) {
                            int discarded$9 = 123;
                            this.b();
                            break L0;
                          } else {
                            L5: {
                              var7 = param0.j(7909);
                              if (0 >= var7) {
                                break L5;
                              } else {
                                var4 = 0;
                                var8 = 0;
                                L6: while (true) {
                                  if (96 <= var8) {
                                    ((lh) this).field_a[var6] = param0.j(7909);
                                    var8 = param0.j(7909);
                                    ((lh) this).field_P[var6] = param0.j(7909);
                                    ((lh) this).field_K[var6] = param0.j(7909);
                                    ((lh) this).field_v[var6] = ((lh) this).field_K[var6] - -param0.j(7909);
                                    ((lh) this).field_b[var6] = param0.j(7909);
                                    var9 = param0.j(7909);
                                    ((lh) this).field_C[var6] = param0.j(7909);
                                    ((lh) this).field_z[var6] = param0.j(7909);
                                    ((lh) this).field_O[var6] = ((lh) this).field_z[var6] - -param0.j(7909);
                                    var4 = 0;
                                    ((lh) this).field_k[var6] = new int[var8];
                                    var10 = 0;
                                    var11 = 0;
                                    L7: while (true) {
                                      if (var8 <= var11) {
                                        var4 = 0;
                                        ((lh) this).field_f[var6] = new int[var8];
                                        var11 = 0;
                                        L8: while (true) {
                                          if (var11 >= var8) {
                                            var10 = 0;
                                            ((lh) this).field_r[var6] = new int[var9];
                                            var4 = 0;
                                            var11 = 0;
                                            L9: while (true) {
                                              if (var9 <= var11) {
                                                var4 = 0;
                                                ((lh) this).field_H[var6] = new int[var9];
                                                var11 = 0;
                                                L10: while (true) {
                                                  if (var11 >= var9) {
                                                    ((lh) this).field_i[var6] = param0.i(-1174051992);
                                                    var11 = 0;
                                                    L11: while (true) {
                                                      if (var11 >= var7) {
                                                        break L5;
                                                      } else {
                                                        ((lh) this).field_d[var5] = param0.g(-89);
                                                        ((lh) this).field_e[var5] = param0.g(62);
                                                        ((lh) this).field_A[var5] = ((lh) this).field_e[var5] + param0.g(123);
                                                        ((lh) this).field_E[var5] = param0.j(7909);
                                                        ((lh) this).field_o[var5] = param0.a(false);
                                                        ((lh) this).field_B[var5] = param0.j(7909);
                                                        ((lh) this).field_q[var5] = param0.j(7909);
                                                        ((lh) this).field_J[var5] = param0.a(false) - 1;
                                                        ((lh) this).field_x[var5] = param0.i(-1174051992);
                                                        ((lh) this).field_t[var5] = param0.i(-1174051992);
                                                        var5++;
                                                        var11++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    int dupTemp$10 = var4 + param0.j(7909);
                                                    var4 = dupTemp$10;
                                                    ((lh) this).field_H[var6][var11] = w.a(255, dupTemp$10);
                                                    var11++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                int dupTemp$11 = var10 + param0.d((byte) 86);
                                                var10 = dupTemp$11;
                                                var4 = var4 + dupTemp$11;
                                                ((lh) this).field_r[var6][var11] = var4 + dupTemp$11;
                                                var11++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            int dupTemp$12 = var4 + param0.j(7909);
                                            var4 = dupTemp$12;
                                            ((lh) this).field_f[var6][var11] = w.a(dupTemp$12, 255);
                                            var11++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        int dupTemp$13 = var10 + param0.d((byte) 26);
                                        var10 = dupTemp$13;
                                        var4 = var4 + dupTemp$13;
                                        ((lh) this).field_k[var6][var11] = var4 + dupTemp$13;
                                        var11++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    int dupTemp$14 = var4 + param0.j(7909);
                                    var4 = dupTemp$14;
                                    ((lh) this).field_j[var6][var8] = var5 - -w.a(dupTemp$14, 255);
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
                          ((lh) this).field_c[var5] = param0.j(7909) + 1;
                          var6 = param0.i(-1174051992);
                          var16 = new byte[var6];
                          if (var6 <= 0) {
                            break L12;
                          } else {
                            param0.a(var6, (byte) 88, var16, 0);
                            ((lh) this).field_l[var5] = var16;
                            break L12;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ((lh) this).field_l[var5] = mc.field_g;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                int dupTemp$15 = var4 + param0.j(7909);
                var4 = dupTemp$15;
                ((lh) this).field_F[var5] = w.a(dupTemp$15, 255);
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
            stackOut_36_1 = new StringBuilder().append("lh.<init>(");
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
          throw sd.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Type your password again to make sure it's correct";
        field_g = new java.util.zip.CRC32();
    }
}
