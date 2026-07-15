/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    int field_N;
    int[] field_d;
    int[] field_M;
    int[][] field_q;
    static w field_x;
    int[] field_B;
    static gh field_t;
    int[] field_I;
    int[] field_G;
    int[][] field_a;
    int field_m;
    int[] field_j;
    private int field_A;
    int[] field_J;
    int[] field_l;
    int[] field_s;
    int[][] field_F;
    private int[] field_D;
    int[] field_O;
    int[] field_f;
    private int[] field_y;
    int[] field_b;
    static w[] field_E;
    int[] field_z;
    private int field_u;
    int[] field_w;
    int[][] field_c;
    int[] field_K;
    static String field_o;
    byte[][] field_e;
    int field_H;
    int[] field_n;
    int field_k;
    int[][] field_p;
    int[] field_C;
    int[] field_r;
    int[] field_v;
    int field_i;
    ud[] field_g;
    private pl field_h;
    static String field_L;

    final static ta a(int param0, String param1) {
        if (param0 != 0) {
            field_E = null;
        }
        return new ta(param1);
    }

    final static String a(int param0) {
        if (param0 != -12040) {
            return null;
        }
        return de.field_V.c((byte) -38);
    }

    public static void b(int param0) {
        field_o = null;
        field_t = null;
        field_L = null;
        field_x = null;
        field_E = null;
        if (param0 != 31158) {
            field_x = null;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ud var4 = null;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        if (((ui) this).field_h != null) {
          L0: {
            var2 = 1;
            if (param0 == 103) {
              break L0;
            } else {
              String discarded$2 = ui.a(-5);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((ui) this).field_g.length) {
              L2: {
                if (var2 != 0) {
                  ((ui) this).field_h = null;
                  ((ui) this).field_D = null;
                  ((ui) this).field_y = null;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              if (((ui) this).field_g[var3] == null) {
                L3: {
                  if (((ui) this).field_M[var3] >> 1040524164 == 0) {
                    var4 = ((ui) this).field_h.a(-62, ((ui) this).field_y[var3], ((ui) this).field_D[var3]);
                    break L3;
                  } else {
                    var4 = ((ui) this).field_h.b(((ui) this).field_y[var3], ((ui) this).field_D[var3], -1);
                    break L3;
                  }
                }
                if (var4 != null) {
                  ((ui) this).field_M[var3] = lb.a(((ui) this).field_M[var3], 15);
                  ((ui) this).field_g[var3] = var4;
                  var3++;
                  continue L1;
                } else {
                  var2 = 0;
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    ui(wl param0, pl param1) {
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
        ((ui) this).field_h = param1;
        ((ui) this).field_i = 1 + param0.d((byte) -58);
        int discarded$7 = param0.d((byte) -61);
        ((ui) this).field_H = 1 + param0.d((byte) -112);
        ((ui) this).field_u = 1 + param0.d((byte) -84);
        ((ui) this).field_A = param0.d((byte) -122) + 1;
        var3 = param0.d((byte) -98);
        ((ui) this).field_N = 1 & var3;
        ((ui) this).field_k = param0.d((byte) -27);
        ((ui) this).field_m = param0.d((byte) -30);
        ((ui) this).field_s = new int[((ui) this).field_i];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((ui) this).field_i) {
            ((ui) this).field_e = new byte[256][];
            ((ui) this).field_d = new int[256];
            an.a(((ui) this).field_d, 0, 256, 64);
            var5 = 0;
            L1: while (true) {
              if ((var5 ^ -1) <= -257) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((ui) this).field_u) {
                    ((ui) this).field_z = new int[((ui) this).field_A];
                    ((ui) this).field_v = new int[((ui) this).field_A];
                    ((ui) this).field_J = new int[((ui) this).field_A];
                    ((ui) this).field_F = new int[((ui) this).field_A][];
                    ((ui) this).field_K = new int[((ui) this).field_A];
                    ((ui) this).field_p = new int[((ui) this).field_A][96];
                    ((ui) this).field_j = new int[((ui) this).field_A];
                    ((ui) this).field_a = new int[((ui) this).field_A][];
                    ((ui) this).field_C = new int[((ui) this).field_A];
                    ((ui) this).field_I = new int[((ui) this).field_A];
                    ((ui) this).field_c = new int[((ui) this).field_A][];
                    ((ui) this).field_O = new int[((ui) this).field_A];
                    ((ui) this).field_r = new int[((ui) this).field_A];
                    ((ui) this).field_q = new int[((ui) this).field_A][];
                    var5 = param0.e(3);
                    ((ui) this).field_M = new int[var5];
                    ((ui) this).field_D = new int[var5];
                    ((ui) this).field_f = new int[var5];
                    ((ui) this).field_b = new int[var5];
                    ((ui) this).field_w = new int[var5];
                    ((ui) this).field_y = new int[var5];
                    ((ui) this).field_G = new int[var5];
                    ((ui) this).field_n = new int[var5];
                    ((ui) this).field_l = new int[var5];
                    ((ui) this).field_g = new ud[var5];
                    ((ui) this).field_B = new int[var5];
                    var5 = 0;
                    var6 = 0;
                    L3: while (true) {
                      if (((ui) this).field_A <= var6) {
                        this.a((byte) 103);
                        return;
                      } else {
                        var7 = param0.d((byte) -33);
                        if (-1 > (var7 ^ -1)) {
                          var4 = 0;
                          var8 = 0;
                          L4: while (true) {
                            if (96 <= var8) {
                              ((ui) this).field_z[var6] = param0.d((byte) -64);
                              var8 = param0.d((byte) -99);
                              ((ui) this).field_r[var6] = param0.d((byte) -19);
                              ((ui) this).field_j[var6] = param0.d((byte) -110);
                              ((ui) this).field_K[var6] = ((ui) this).field_j[var6] + param0.d((byte) -66);
                              ((ui) this).field_O[var6] = param0.d((byte) -110);
                              var9 = param0.d((byte) -78);
                              ((ui) this).field_J[var6] = param0.d((byte) -64);
                              ((ui) this).field_C[var6] = param0.d((byte) -46);
                              ((ui) this).field_I[var6] = ((ui) this).field_C[var6] + param0.d((byte) -58);
                              ((ui) this).field_q[var6] = new int[var8];
                              var4 = 0;
                              var10 = 0;
                              var11 = 0;
                              L5: while (true) {
                                if (var8 <= var11) {
                                  var4 = 0;
                                  ((ui) this).field_F[var6] = new int[var8];
                                  var11 = 0;
                                  L6: while (true) {
                                    if (var11 >= var8) {
                                      var10 = 0;
                                      ((ui) this).field_c[var6] = new int[var9];
                                      var4 = 0;
                                      var11 = 0;
                                      L7: while (true) {
                                        if (var9 <= var11) {
                                          var4 = 0;
                                          ((ui) this).field_a[var6] = new int[var9];
                                          var11 = 0;
                                          L8: while (true) {
                                            if (var9 <= var11) {
                                              ((ui) this).field_v[var6] = param0.e(3);
                                              var11 = 0;
                                              L9: while (true) {
                                                if (var7 > var11) {
                                                  ((ui) this).field_B[var5] = param0.h(65280);
                                                  ((ui) this).field_w[var5] = param0.h(65280);
                                                  ((ui) this).field_f[var5] = ((ui) this).field_w[var5] + param0.h(65280);
                                                  ((ui) this).field_G[var5] = param0.d((byte) -112);
                                                  ((ui) this).field_l[var5] = param0.g((byte) -104);
                                                  ((ui) this).field_M[var5] = param0.d((byte) -65);
                                                  ((ui) this).field_n[var5] = param0.d((byte) -54);
                                                  ((ui) this).field_b[var5] = -1 + param0.g((byte) -108);
                                                  ((ui) this).field_D[var5] = param0.e(3);
                                                  ((ui) this).field_y[var5] = param0.e(3);
                                                  var5++;
                                                  var11++;
                                                  continue L9;
                                                } else {
                                                  var6++;
                                                  continue L3;
                                                }
                                              }
                                            } else {
                                              int dupTemp$8 = var4 + param0.d((byte) -110);
                                              var4 = dupTemp$8;
                                              ((ui) this).field_a[var6][var11] = lb.a(255, dupTemp$8);
                                              var11++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          int dupTemp$9 = var10 + param0.e((byte) -2);
                                          var10 = dupTemp$9;
                                          var4 = var4 + dupTemp$9;
                                          ((ui) this).field_c[var6][var11] = var4 + dupTemp$9;
                                          var11++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      int dupTemp$10 = var4 + param0.d((byte) -27);
                                      var4 = dupTemp$10;
                                      ((ui) this).field_F[var6][var11] = lb.a(255, dupTemp$10);
                                      var11++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  int dupTemp$11 = var10 + param0.e((byte) 126);
                                  var10 = dupTemp$11;
                                  var4 = var4 + dupTemp$11;
                                  ((ui) this).field_q[var6][var11] = var4 + dupTemp$11;
                                  var11++;
                                  continue L5;
                                }
                              }
                            } else {
                              int dupTemp$12 = var4 + param0.d((byte) -79);
                              var4 = dupTemp$12;
                              ((ui) this).field_p[var6][var8] = var5 - -lb.a(dupTemp$12, 255);
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
                    ((ui) this).field_d[var5] = 1 + param0.d((byte) -103);
                    var6 = param0.e(3);
                    var16 = new byte[var6];
                    if (0 < var6) {
                      param0.a(var16, 0, (byte) 127, var6);
                      ((ui) this).field_e[var5] = var16;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                ((ui) this).field_e[var5] = client.field_D;
                var5++;
                continue L1;
              }
            }
          } else {
            int dupTemp$13 = var4 + param0.d((byte) -126);
            var4 = dupTemp$13;
            ((ui) this).field_s[var5] = lb.a(255, dupTemp$13);
            var5++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Steady...";
        field_t = new gh(2);
        field_L = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
