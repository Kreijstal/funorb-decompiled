/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    int[][] field_g;
    private int field_F;
    int[] field_J;
    int[] field_x;
    int[] field_A;
    int[] field_G;
    private int[] field_c;
    int[] field_z;
    static en field_f;
    int[][] field_d;
    int[] field_E;
    int[] field_y;
    int[] field_k;
    int[] field_K;
    private int field_p;
    int[] field_h;
    int[] field_H;
    int[][] field_t;
    private int[] field_e;
    int[] field_m;
    int[] field_l;
    hh[] field_s;
    int[][] field_v;
    int field_i;
    byte[][] field_C;
    int[] field_q;
    private ec field_o;
    int[] field_u;
    int[] field_b;
    int field_w;
    static int field_j;
    int field_D;
    int[] field_a;
    int field_L;
    int[] field_r;
    int[][] field_I;
    int[] field_n;
    int field_B;

    final static void d(int param0) {
        pl.field_n.a(0.5 > Math.random() ? ka.field_e : ri.field_b, 100, 6144 * qm.field_c / 64, param0);
    }

    final static String c(int param0) {
        if (!(dn.field_q != dg.field_o)) {
            return kl.field_o;
        }
        if (!(di.field_g.b(0))) {
            return di.field_g.a(-84);
        }
        if (ui.field_b == dg.field_o) {
            return di.field_g.a(-52);
        }
        return vk.field_v;
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != -32408) {
            field_j = -49;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        hh var4 = null;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        if (((ce) this).field_o == null) {
          return;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((ce) this).field_s.length) {
              L1: {
                if (var2 == 0) {
                  break L1;
                } else {
                  ((ce) this).field_o = null;
                  ((ce) this).field_e = null;
                  ((ce) this).field_c = null;
                  break L1;
                }
              }
              return;
            } else {
              if (((ce) this).field_s[var3] == null) {
                L2: {
                  if (((ce) this).field_E[var3] >> 4 != 0) {
                    var4 = ((ce) this).field_o.a(((ce) this).field_e[var3], (byte) -128, ((ce) this).field_c[var3]);
                    break L2;
                  } else {
                    var4 = ((ce) this).field_o.a((byte) 55, ((ce) this).field_c[var3], ((ce) this).field_e[var3]);
                    break L2;
                  }
                }
                if (var4 == null) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  ((ce) this).field_E[var3] = ae.a(((ce) this).field_E[var3], 15);
                  ((ce) this).field_s[var3] = var4;
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

    final static String a(byte param0, int param1, int param2) {
        if (param2 < -1) {
            return "";
        }
        if (-1 == param2) {
            return he.field_v;
        }
        int var3 = je.a(false, param1);
        if (param0 <= 75) {
            field_f = null;
        }
        if (!(var3 > param2)) {
            return "";
        }
        if (null == ge.field_b) {
            mj.field_e = jb.field_o;
            ge.field_b = new String[][]{mj.field_e, jb.field_o, vd.field_d, ck.field_u};
        }
        return ge.field_b[param1][param2];
    }

    ce(n param0, ec param1) {
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
            ((ce) this).field_o = param1;
            ((ce) this).field_w = param0.e(0) + 1;
            int discarded$7 = param0.e(0);
            ((ce) this).field_B = 1 + param0.e(0);
            ((ce) this).field_p = param0.e(0) + 1;
            ((ce) this).field_F = param0.e(0) - -1;
            var3_int = param0.e(0);
            ((ce) this).field_D = var3_int & 1;
            ((ce) this).field_L = param0.e(0);
            ((ce) this).field_i = param0.e(0);
            ((ce) this).field_x = new int[((ce) this).field_w];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((ce) this).field_w) {
                ((ce) this).field_C = new byte[256][];
                ((ce) this).field_l = new int[256];
                qg.a(((ce) this).field_l, 0, 256, 64);
                var5 = 0;
                L2: while (true) {
                  if (256 <= var5) {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((ce) this).field_p) {
                        ((ce) this).field_u = new int[((ce) this).field_F];
                        ((ce) this).field_K = new int[((ce) this).field_F];
                        ((ce) this).field_k = new int[((ce) this).field_F];
                        ((ce) this).field_m = new int[((ce) this).field_F];
                        ((ce) this).field_I = new int[((ce) this).field_F][];
                        ((ce) this).field_t = new int[((ce) this).field_F][];
                        ((ce) this).field_d = new int[((ce) this).field_F][96];
                        ((ce) this).field_r = new int[((ce) this).field_F];
                        ((ce) this).field_H = new int[((ce) this).field_F];
                        ((ce) this).field_J = new int[((ce) this).field_F];
                        ((ce) this).field_G = new int[((ce) this).field_F];
                        ((ce) this).field_g = new int[((ce) this).field_F][];
                        ((ce) this).field_q = new int[((ce) this).field_F];
                        ((ce) this).field_v = new int[((ce) this).field_F][];
                        var5 = param0.f(1952);
                        ((ce) this).field_y = new int[var5];
                        ((ce) this).field_n = new int[var5];
                        ((ce) this).field_E = new int[var5];
                        ((ce) this).field_e = new int[var5];
                        ((ce) this).field_a = new int[var5];
                        ((ce) this).field_b = new int[var5];
                        ((ce) this).field_s = new hh[var5];
                        ((ce) this).field_c = new int[var5];
                        ((ce) this).field_h = new int[var5];
                        ((ce) this).field_z = new int[var5];
                        ((ce) this).field_A = new int[var5];
                        var5 = 0;
                        var6 = 0;
                        L4: while (true) {
                          if (var6 >= ((ce) this).field_F) {
                            this.a(260404420);
                            break L0;
                          } else {
                            L5: {
                              var7 = param0.e(0);
                              if (var7 <= 0) {
                                break L5;
                              } else {
                                var4 = 0;
                                var8 = 0;
                                L6: while (true) {
                                  if (var8 >= 96) {
                                    ((ce) this).field_u[var6] = param0.e(0);
                                    var8 = param0.e(0);
                                    ((ce) this).field_J[var6] = param0.e(0);
                                    ((ce) this).field_r[var6] = param0.e(0);
                                    ((ce) this).field_G[var6] = ((ce) this).field_r[var6] + param0.e(0);
                                    ((ce) this).field_m[var6] = param0.e(0);
                                    var9 = param0.e(0);
                                    ((ce) this).field_q[var6] = param0.e(0);
                                    ((ce) this).field_k[var6] = param0.e(0);
                                    ((ce) this).field_K[var6] = ((ce) this).field_k[var6] + param0.e(0);
                                    var4 = 0;
                                    ((ce) this).field_v[var6] = new int[var8];
                                    var10 = 0;
                                    var11 = 0;
                                    L7: while (true) {
                                      if (var8 <= var11) {
                                        ((ce) this).field_g[var6] = new int[var8];
                                        var4 = 0;
                                        var11 = 0;
                                        L8: while (true) {
                                          if (var11 >= var8) {
                                            ((ce) this).field_I[var6] = new int[var9];
                                            var4 = 0;
                                            var10 = 0;
                                            var11 = 0;
                                            L9: while (true) {
                                              if (var9 <= var11) {
                                                var4 = 0;
                                                ((ce) this).field_t[var6] = new int[var9];
                                                var11 = 0;
                                                L10: while (true) {
                                                  if (var9 <= var11) {
                                                    ((ce) this).field_H[var6] = param0.f(1952);
                                                    var11 = 0;
                                                    L11: while (true) {
                                                      if (var11 >= var7) {
                                                        break L5;
                                                      } else {
                                                        ((ce) this).field_n[var5] = param0.d((byte) -112);
                                                        ((ce) this).field_h[var5] = param0.d((byte) -126);
                                                        ((ce) this).field_A[var5] = ((ce) this).field_h[var5] + param0.d((byte) -107);
                                                        ((ce) this).field_a[var5] = param0.e(0);
                                                        ((ce) this).field_z[var5] = param0.a(false);
                                                        ((ce) this).field_E[var5] = param0.e(0);
                                                        ((ce) this).field_y[var5] = param0.e(0);
                                                        ((ce) this).field_b[var5] = param0.a(false) + -1;
                                                        ((ce) this).field_e[var5] = param0.f(1952);
                                                        ((ce) this).field_c[var5] = param0.f(1952);
                                                        var5++;
                                                        var11++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    int dupTemp$8 = var4 + param0.e(0);
                                                    var4 = dupTemp$8;
                                                    ((ce) this).field_t[var6][var11] = ae.a(255, dupTemp$8);
                                                    var11++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                int dupTemp$9 = var10 + param0.e((byte) 114);
                                                var10 = dupTemp$9;
                                                var4 = var4 + dupTemp$9;
                                                ((ce) this).field_I[var6][var11] = var4 + dupTemp$9;
                                                var11++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            int dupTemp$10 = var4 + param0.e(0);
                                            var4 = dupTemp$10;
                                            ((ce) this).field_g[var6][var11] = ae.a(255, dupTemp$10);
                                            var11++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        int dupTemp$11 = var10 + param0.e((byte) 32);
                                        var10 = dupTemp$11;
                                        var4 = var4 + dupTemp$11;
                                        ((ce) this).field_v[var6][var11] = var4 + dupTemp$11;
                                        var11++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    int dupTemp$12 = var4 + param0.e(0);
                                    var4 = dupTemp$12;
                                    ((ce) this).field_d[var6][var8] = var5 + ae.a(255, dupTemp$12);
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
                          ((ce) this).field_l[var5] = param0.e(0) - -1;
                          var6 = param0.f(1952);
                          var16 = new byte[var6];
                          if (0 >= var6) {
                            break L12;
                          } else {
                            param0.a(var16, (byte) -96, 0, var6);
                            ((ce) this).field_C[var5] = var16;
                            break L12;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ((ce) this).field_C[var5] = um.field_b;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                int dupTemp$13 = var4 + param0.e(0);
                var4 = dupTemp$13;
                ((ce) this).field_x[var5] = ae.a(255, dupTemp$13);
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
            stackOut_36_1 = new StringBuilder().append("ce.<init>(");
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
          throw t.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new en();
    }
}
