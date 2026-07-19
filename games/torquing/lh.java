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
        ha discarded$0 = null;
        if (param0 != -24858) {
            discarded$0 = lh.a(5);
        }
        return (ha) ((Object) new np());
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
        if (this.field_a == null) {
          return;
        } else {
          L0: {
            var2 = 1;
            if (param0 == -71) {
              break L0;
            } else {
              this.field_d = -53;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= this.field_o.length) {
              L2: {
                if (var2 != 0) {
                  this.field_a = null;
                  this.field_n = null;
                  this.field_s = null;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              if (this.field_o[var3] == null) {
                L3: {
                  if (-1 == (this.field_y[var3] >> 809422884 ^ -1)) {
                    var4 = this.field_a.a(this.field_s[var3], this.field_n[var3], (byte) -84);
                    break L3;
                  } else {
                    var4 = this.field_a.b(this.field_s[var3], this.field_n[var3], (byte) 122);
                    break L3;
                  }
                }
                if (var4 == null) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  this.field_y[var3] = ie.a(this.field_y[var3], 15);
                  this.field_o[var3] = var4;
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
        int discarded$11 = 0;
        int[] array$12 = null;
        int[] array$13 = null;
        int[] array$14 = null;
        int[] array$15 = null;
        int dupTemp$16 = 0;
        int dupTemp$17 = 0;
        int dupTemp$18 = 0;
        int dupTemp$19 = 0;
        int dupTemp$20 = 0;
        int dupTemp$21 = 0;
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
            this.field_a = param1;
            this.field_k = param0.i((byte) -101) - -1;
            discarded$11 = param0.i((byte) -101);
            this.field_M = param0.i((byte) -101) - -1;
            this.field_d = 1 + param0.i((byte) -101);
            this.field_r = 1 + param0.i((byte) -101);
            var3_int = param0.i((byte) -101);
            this.field_E = var3_int & 1;
            this.field_B = param0.i((byte) -101);
            this.field_c = param0.i((byte) -101);
            this.field_K = new int[this.field_k];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_k) {
                this.field_j = new int[256];
                this.field_m = new byte[256][];
                dk.a(this.field_j, 0, 256, 64);
                var5 = 0;
                L2: while (true) {
                  if (256 <= var5) {
                    var5 = 0;
                    L3: while (true) {
                      if (this.field_d <= var5) {
                        this.field_L = new int[this.field_r];
                        this.field_f = new int[this.field_r][];
                        this.field_q = new int[this.field_r];
                        this.field_N = new int[this.field_r];
                        this.field_b = new int[this.field_r];
                        this.field_G = new int[this.field_r];
                        this.field_l = new int[this.field_r][96];
                        this.field_D = new int[this.field_r][];
                        this.field_h = new int[this.field_r];
                        this.field_I = new int[this.field_r];
                        this.field_p = new int[this.field_r];
                        this.field_g = new int[this.field_r][];
                        this.field_e = new int[this.field_r][];
                        this.field_i = new int[this.field_r];
                        var5 = param0.i(7088);
                        this.field_x = new int[var5];
                        this.field_o = new gg[var5];
                        this.field_F = new int[var5];
                        this.field_z = new int[var5];
                        this.field_w = new int[var5];
                        this.field_v = new int[var5];
                        this.field_s = new int[var5];
                        this.field_C = new int[var5];
                        this.field_t = new int[var5];
                        this.field_n = new int[var5];
                        this.field_y = new int[var5];
                        var5 = 0;
                        var6 = 0;
                        L4: while (true) {
                          if (this.field_r <= var6) {
                            this.a((byte) -71);
                            break L0;
                          } else {
                            L5: {
                              var7 = param0.i((byte) -101);
                              if (0 >= var7) {
                                break L5;
                              } else {
                                var4 = 0;
                                var8 = 0;
                                L6: while (true) {
                                  if (96 <= var8) {
                                    this.field_I[var6] = param0.i((byte) -101);
                                    var8 = param0.i((byte) -101);
                                    this.field_L[var6] = param0.i((byte) -101);
                                    this.field_N[var6] = param0.i((byte) -101);
                                    this.field_G[var6] = this.field_N[var6] + param0.i((byte) -101);
                                    this.field_h[var6] = param0.i((byte) -101);
                                    var9 = param0.i((byte) -101);
                                    this.field_b[var6] = param0.i((byte) -101);
                                    this.field_q[var6] = param0.i((byte) -101);
                                    this.field_p[var6] = this.field_q[var6] + param0.i((byte) -101);
                                    var4 = 0;
                                    array$12 = new int[var8];
                                    this.field_e[var6] = array$12;
                                    var10 = 0;
                                    var11 = 0;
                                    L7: while (true) {
                                      if (var11 >= var8) {
                                        array$13 = new int[var8];
                                        this.field_D[var6] = array$13;
                                        var4 = 0;
                                        var11 = 0;
                                        L8: while (true) {
                                          if (var11 >= var8) {
                                            var4 = 0;
                                            var10 = 0;
                                            array$14 = new int[var9];
                                            this.field_g[var6] = array$14;
                                            var11 = 0;
                                            L9: while (true) {
                                              if (var9 <= var11) {
                                                var4 = 0;
                                                array$15 = new int[var9];
                                                this.field_f[var6] = array$15;
                                                var11 = 0;
                                                L10: while (true) {
                                                  if (var9 <= var11) {
                                                    this.field_i[var6] = param0.i(7088);
                                                    var11 = 0;
                                                    L11: while (true) {
                                                      if (var11 >= var7) {
                                                        break L5;
                                                      } else {
                                                        this.field_v[var5] = param0.e((byte) 62);
                                                        this.field_w[var5] = param0.e((byte) 62);
                                                        this.field_t[var5] = this.field_w[var5] - -param0.e((byte) 62);
                                                        this.field_F[var5] = param0.i((byte) -101);
                                                        this.field_z[var5] = param0.f((byte) 90);
                                                        this.field_y[var5] = param0.i((byte) -101);
                                                        this.field_x[var5] = param0.i((byte) -101);
                                                        this.field_C[var5] = param0.f((byte) 25) + -1;
                                                        this.field_n[var5] = param0.i(7088);
                                                        this.field_s[var5] = param0.i(7088);
                                                        var5++;
                                                        var11++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    dupTemp$16 = var4 + param0.i((byte) -101);
                                                    var4 = dupTemp$16;
                                                    this.field_f[var6][var11] = ie.a(dupTemp$16, 255);
                                                    var11++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                dupTemp$17 = var10 + param0.g((byte) -116);
                                                var10 = dupTemp$17;
                                                var4 = var4 + dupTemp$17;
                                                this.field_g[var6][var11] = var4 + dupTemp$17;
                                                var11++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            dupTemp$18 = var4 + param0.i((byte) -101);
                                            var4 = dupTemp$18;
                                            this.field_D[var6][var11] = ie.a(dupTemp$18, 255);
                                            var11++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        dupTemp$19 = var10 + param0.g((byte) -119);
                                        var10 = dupTemp$19;
                                        var4 = var4 + dupTemp$19;
                                        this.field_e[var6][var11] = var4 + dupTemp$19;
                                        var11++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    dupTemp$20 = var4 + param0.i((byte) -101);
                                    var4 = dupTemp$20;
                                    this.field_l[var6][var8] = ie.a(dupTemp$20, 255) + var5;
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
                          this.field_j[var5] = 1 + param0.i((byte) -101);
                          var6 = param0.i(7088);
                          var16 = new byte[var6];
                          if (var6 <= 0) {
                            break L12;
                          } else {
                            param0.a(48, var6, var16, 0);
                            this.field_m[var5] = var16;
                            break L12;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_m[var5] = ob.field_a;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                dupTemp$21 = var4 + param0.i((byte) -101);
                var4 = dupTemp$21;
                this.field_K[var5] = ie.a(dupTemp$21, 255);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var3);
            stackOut_36_1 = new StringBuilder().append("lh.<init>(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          L14: {
            stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L14;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
    }

    static {
    }
}
