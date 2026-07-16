/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    int[] field_F;
    int[][] field_e;
    static boolean field_J;
    int[] field_h;
    private fi field_a;
    int field_c;
    int[] field_C;
    int field_k;
    int[] field_v;
    int[][] field_l;
    int[] field_i;
    private int[] field_s;
    int[] field_K;
    gg[] field_o;
    int[] field_p;
    int[] field_N;
    int[] field_w;
    byte[][] field_m;
    int[] field_b;
    int[][] field_f;
    int[][] field_D;
    int[] field_L;
    int field_B;
    private int[] field_n;
    int[] field_q;
    int[] field_t;
    int field_E;
    int field_M;
    int[] field_z;
    private int field_d;
    int[] field_y;
    static uc field_O;
    private int field_r;
    int[] field_j;
    static ne field_u;
    int[] field_x;
    int[] field_I;
    int[][] field_g;
    int[] field_G;

    final static ha a(int param0) {
        if (param0 != -24858) {
            ha discarded$0 = lh.a(5);
        }
        return (ha) (Object) new np();
    }

    public static void b(int param0) {
        field_O = null;
        field_u = null;
        int var1 = -85 / ((-35 - param0) / 46);
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        gg var4 = null;
        int var5 = 0;
        var5 = Torquing.field_u;
        if (((lh) this).field_a == null) {
          return;
        } else {
          L0: {
            var2 = 1;
            if (param0 == -71) {
              break L0;
            } else {
              ((lh) this).field_d = -53;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((lh) this).field_o.length) {
              L2: {
                if (var2 != 0) {
                  ((lh) this).field_a = null;
                  ((lh) this).field_n = null;
                  ((lh) this).field_s = null;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              if (((lh) this).field_o[var3] == null) {
                L3: {
                  if (-1 == (((lh) this).field_y[var3] >> 809422884 ^ -1)) {
                    var4 = ((lh) this).field_a.a(((lh) this).field_s[var3], ((lh) this).field_n[var3], (byte) -84);
                    break L3;
                  } else {
                    var4 = ((lh) this).field_a.b(((lh) this).field_s[var3], ((lh) this).field_n[var3], (byte) 122);
                    break L3;
                  }
                }
                if (var4 == null) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  ((lh) this).field_y[var3] = ie.a(((lh) this).field_y[var3], 15);
                  ((lh) this).field_o[var3] = var4;
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    lh(fj param0, fi param1) {
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
        ((lh) this).field_a = param1;
        ((lh) this).field_k = param0.i((byte) -101) - -1;
        int discarded$7 = param0.i((byte) -101);
        ((lh) this).field_M = param0.i((byte) -101) - -1;
        ((lh) this).field_d = 1 + param0.i((byte) -101);
        ((lh) this).field_r = 1 + param0.i((byte) -101);
        var3 = param0.i((byte) -101);
        ((lh) this).field_E = var3 & 1;
        ((lh) this).field_B = param0.i((byte) -101);
        ((lh) this).field_c = param0.i((byte) -101);
        ((lh) this).field_K = new int[((lh) this).field_k];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((lh) this).field_k) {
            ((lh) this).field_j = new int[256];
            ((lh) this).field_m = new byte[256][];
            dk.a(((lh) this).field_j, 0, 256, 64);
            var5 = 0;
            L1: while (true) {
              if (256 <= var5) {
                var5 = 0;
                L2: while (true) {
                  if (((lh) this).field_d <= var5) {
                    ((lh) this).field_L = new int[((lh) this).field_r];
                    ((lh) this).field_f = new int[((lh) this).field_r][];
                    ((lh) this).field_q = new int[((lh) this).field_r];
                    ((lh) this).field_N = new int[((lh) this).field_r];
                    ((lh) this).field_b = new int[((lh) this).field_r];
                    ((lh) this).field_G = new int[((lh) this).field_r];
                    ((lh) this).field_l = new int[((lh) this).field_r][96];
                    ((lh) this).field_D = new int[((lh) this).field_r][];
                    ((lh) this).field_h = new int[((lh) this).field_r];
                    ((lh) this).field_I = new int[((lh) this).field_r];
                    ((lh) this).field_p = new int[((lh) this).field_r];
                    ((lh) this).field_g = new int[((lh) this).field_r][];
                    ((lh) this).field_e = new int[((lh) this).field_r][];
                    ((lh) this).field_i = new int[((lh) this).field_r];
                    var5 = param0.i(7088);
                    ((lh) this).field_x = new int[var5];
                    ((lh) this).field_o = new gg[var5];
                    ((lh) this).field_F = new int[var5];
                    ((lh) this).field_z = new int[var5];
                    ((lh) this).field_w = new int[var5];
                    ((lh) this).field_v = new int[var5];
                    ((lh) this).field_s = new int[var5];
                    ((lh) this).field_C = new int[var5];
                    ((lh) this).field_t = new int[var5];
                    ((lh) this).field_n = new int[var5];
                    ((lh) this).field_y = new int[var5];
                    var5 = 0;
                    var6 = 0;
                    L3: while (true) {
                      if (((lh) this).field_r <= var6) {
                        this.a((byte) -71);
                        return;
                      } else {
                        var7 = param0.i((byte) -101);
                        if (0 < var7) {
                          var4 = 0;
                          var8 = 0;
                          L4: while (true) {
                            if (96 <= var8) {
                              ((lh) this).field_I[var6] = param0.i((byte) -101);
                              var8 = param0.i((byte) -101);
                              ((lh) this).field_L[var6] = param0.i((byte) -101);
                              ((lh) this).field_N[var6] = param0.i((byte) -101);
                              ((lh) this).field_G[var6] = ((lh) this).field_N[var6] + param0.i((byte) -101);
                              ((lh) this).field_h[var6] = param0.i((byte) -101);
                              var9 = param0.i((byte) -101);
                              ((lh) this).field_b[var6] = param0.i((byte) -101);
                              ((lh) this).field_q[var6] = param0.i((byte) -101);
                              ((lh) this).field_p[var6] = ((lh) this).field_q[var6] + param0.i((byte) -101);
                              var4 = 0;
                              ((lh) this).field_e[var6] = new int[var8];
                              var10 = 0;
                              var11 = 0;
                              L5: while (true) {
                                if (var11 >= var8) {
                                  ((lh) this).field_D[var6] = new int[var8];
                                  var4 = 0;
                                  var11 = 0;
                                  L6: while (true) {
                                    if (var11 >= var8) {
                                      var4 = 0;
                                      var10 = 0;
                                      ((lh) this).field_g[var6] = new int[var9];
                                      var11 = 0;
                                      L7: while (true) {
                                        if (var9 <= var11) {
                                          var4 = 0;
                                          ((lh) this).field_f[var6] = new int[var9];
                                          var11 = 0;
                                          L8: while (true) {
                                            if (var9 <= var11) {
                                              ((lh) this).field_i[var6] = param0.i(7088);
                                              var11 = 0;
                                              L9: while (true) {
                                                if (var11 < var7) {
                                                  ((lh) this).field_v[var5] = param0.e((byte) 62);
                                                  ((lh) this).field_w[var5] = param0.e((byte) 62);
                                                  ((lh) this).field_t[var5] = ((lh) this).field_w[var5] - -param0.e((byte) 62);
                                                  ((lh) this).field_F[var5] = param0.i((byte) -101);
                                                  ((lh) this).field_z[var5] = param0.f((byte) 90);
                                                  ((lh) this).field_y[var5] = param0.i((byte) -101);
                                                  ((lh) this).field_x[var5] = param0.i((byte) -101);
                                                  ((lh) this).field_C[var5] = param0.f((byte) 25) + -1;
                                                  ((lh) this).field_n[var5] = param0.i(7088);
                                                  ((lh) this).field_s[var5] = param0.i(7088);
                                                  var5++;
                                                  var11++;
                                                  continue L9;
                                                } else {
                                                  var6++;
                                                  continue L3;
                                                }
                                              }
                                            } else {
                                              int dupTemp$8 = var4 + param0.i((byte) -101);
                                              var4 = dupTemp$8;
                                              ((lh) this).field_f[var6][var11] = ie.a(dupTemp$8, 255);
                                              var11++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          int dupTemp$9 = var10 + param0.g((byte) -116);
                                          var10 = dupTemp$9;
                                          var4 = var4 + dupTemp$9;
                                          ((lh) this).field_g[var6][var11] = var4 + dupTemp$9;
                                          var11++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      int dupTemp$10 = var4 + param0.i((byte) -101);
                                      var4 = dupTemp$10;
                                      ((lh) this).field_D[var6][var11] = ie.a(dupTemp$10, 255);
                                      var11++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  int dupTemp$11 = var10 + param0.g((byte) -119);
                                  var10 = dupTemp$11;
                                  var4 = var4 + dupTemp$11;
                                  ((lh) this).field_e[var6][var11] = var4 + dupTemp$11;
                                  var11++;
                                  continue L5;
                                }
                              }
                            } else {
                              int dupTemp$12 = var4 + param0.i((byte) -101);
                              var4 = dupTemp$12;
                              ((lh) this).field_l[var6][var8] = ie.a(dupTemp$12, 255) + var5;
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
                    ((lh) this).field_j[var5] = 1 + param0.i((byte) -101);
                    var6 = param0.i(7088);
                    var16 = new byte[var6];
                    if (var6 > 0) {
                      param0.a(48, var6, var16, 0);
                      ((lh) this).field_m[var5] = var16;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                ((lh) this).field_m[var5] = ob.field_a;
                var5++;
                continue L1;
              }
            }
          } else {
            int dupTemp$13 = var4 + param0.i((byte) -101);
            var4 = dupTemp$13;
            ((lh) this).field_K[var5] = ie.a(dupTemp$13, 255);
            var5++;
            continue L0;
          }
        }
    }

    static {
    }
}
