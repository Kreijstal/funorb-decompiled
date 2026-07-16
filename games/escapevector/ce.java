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
        if (param0 != 31069) {
            ce.b(-82);
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
          L0: {
            var2 = 1;
            if (param0 == 260404420) {
              break L0;
            } else {
              ((ce) this).field_H = null;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((ce) this).field_s.length) {
              L2: {
                if (var2 == 0) {
                  break L2;
                } else {
                  ((ce) this).field_o = null;
                  ((ce) this).field_e = null;
                  ((ce) this).field_c = null;
                  break L2;
                }
              }
              return;
            } else {
              if (((ce) this).field_s[var3] == null) {
                L3: {
                  if (((ce) this).field_E[var3] >> 260404420 != 0) {
                    var4 = ((ce) this).field_o.a(((ce) this).field_e[var3], (byte) -128, ((ce) this).field_c[var3]);
                    break L3;
                  } else {
                    var4 = ((ce) this).field_o.a((byte) 55, ((ce) this).field_c[var3], ((ce) this).field_e[var3]);
                    break L3;
                  }
                }
                if (var4 == null) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  ((ce) this).field_E[var3] = ae.a(((ce) this).field_E[var3], 15);
                  ((ce) this).field_s[var3] = var4;
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
        ((ce) this).field_o = param1;
        ((ce) this).field_w = param0.e(0) + 1;
        int discarded$7 = param0.e(0);
        ((ce) this).field_B = 1 + param0.e(0);
        ((ce) this).field_p = param0.e(0) + 1;
        ((ce) this).field_F = param0.e(0) - -1;
        var3 = param0.e(0);
        ((ce) this).field_D = var3 & 1;
        ((ce) this).field_L = param0.e(0);
        ((ce) this).field_i = param0.e(0);
        ((ce) this).field_x = new int[((ce) this).field_w];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((ce) this).field_w) {
            ((ce) this).field_C = new byte[256][];
            ((ce) this).field_l = new int[256];
            qg.a(((ce) this).field_l, 0, 256, 64);
            var5 = 0;
            L1: while (true) {
              if (256 <= var5) {
                var5 = 0;
                L2: while (true) {
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
                    L3: while (true) {
                      if (var6 >= ((ce) this).field_F) {
                        this.a(260404420);
                        return;
                      } else {
                        var7 = param0.e(0);
                        if ((var7 ^ -1) < -1) {
                          var4 = 0;
                          var8 = 0;
                          L4: while (true) {
                            if ((var8 ^ -1) <= -97) {
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
                              L5: while (true) {
                                if (var8 <= var11) {
                                  ((ce) this).field_g[var6] = new int[var8];
                                  var4 = 0;
                                  var11 = 0;
                                  L6: while (true) {
                                    if (var11 >= var8) {
                                      ((ce) this).field_I[var6] = new int[var9];
                                      var4 = 0;
                                      var10 = 0;
                                      var11 = 0;
                                      L7: while (true) {
                                        if (var9 <= var11) {
                                          var4 = 0;
                                          ((ce) this).field_t[var6] = new int[var9];
                                          var11 = 0;
                                          L8: while (true) {
                                            if (var9 <= var11) {
                                              ((ce) this).field_H[var6] = param0.f(1952);
                                              var11 = 0;
                                              L9: while (true) {
                                                if (var11 < var7) {
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
                                                  continue L9;
                                                } else {
                                                  var6++;
                                                  continue L3;
                                                }
                                              }
                                            } else {
                                              int dupTemp$8 = var4 + param0.e(0);
                                              var4 = dupTemp$8;
                                              ((ce) this).field_t[var6][var11] = ae.a(255, dupTemp$8);
                                              var11++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          int dupTemp$9 = var10 + param0.e((byte) 114);
                                          var10 = dupTemp$9;
                                          var4 = var4 + dupTemp$9;
                                          ((ce) this).field_I[var6][var11] = var4 + dupTemp$9;
                                          var11++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      int dupTemp$10 = var4 + param0.e(0);
                                      var4 = dupTemp$10;
                                      ((ce) this).field_g[var6][var11] = ae.a(255, dupTemp$10);
                                      var11++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  int dupTemp$11 = var10 + param0.e((byte) 32);
                                  var10 = dupTemp$11;
                                  var4 = var4 + dupTemp$11;
                                  ((ce) this).field_v[var6][var11] = var4 + dupTemp$11;
                                  var11++;
                                  continue L5;
                                }
                              }
                            } else {
                              int dupTemp$12 = var4 + param0.e(0);
                              var4 = dupTemp$12;
                              ((ce) this).field_d[var6][var8] = var5 + ae.a(255, dupTemp$12);
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
                    ((ce) this).field_l[var5] = param0.e(0) - -1;
                    var6 = param0.f(1952);
                    var16 = new byte[var6];
                    if (0 < var6) {
                      param0.a(var16, (byte) -96, 0, var6);
                      ((ce) this).field_C[var5] = var16;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                ((ce) this).field_C[var5] = um.field_b;
                var5++;
                continue L1;
              }
            }
          } else {
            int dupTemp$13 = var4 + param0.e(0);
            var4 = dupTemp$13;
            ((ce) this).field_x[var5] = ae.a(255, dupTemp$13);
            var5++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new en();
    }
}
