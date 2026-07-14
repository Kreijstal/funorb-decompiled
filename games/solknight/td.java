/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td implements j {
    static String field_i;
    static int field_l;
    private int field_m;
    private int field_p;
    private int field_f;
    private int field_j;
    static String field_n;
    private int field_q;
    static ce field_h;
    private int field_o;
    private int field_a;
    private int field_c;
    private int field_d;
    private mg field_g;
    private int field_k;
    static o[] field_e;
    private int field_b;

    final static void a(int param0) {
        int var2 = 0;
        dj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        jd var14 = null;
        int var15 = 0;
        int var16 = 0;
        jd var17 = null;
        int[][] var21 = null;
        var12 = SolKnight.field_L ? 1 : 0;
        var14 = te.field_N;
        var17 = var14;
        var2 = var17.j(255);
        var3 = (dj) (Object) sa.field_n.a((byte) 51);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var3.field_i == var2) {
                break L1;
              } else {
                var3 = (dj) (Object) sa.field_n.b(-44);
                continue L0;
              }
            }
          }
          if (var3 != null) {
            L2: {
              var4 = var17.j(255);
              if (0 == var4) {
                break L2;
              } else {
                var5 = var3.field_h;
                cg.field_a[0] = ne.field_g;
                var6_int = 1;
                L3: while (true) {
                  if (var4 <= var6_int) {
                    ld.c(var5, var4, 42);
                    var6_int = 0;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        ta.b((byte) 105, var5);
                        var6 = new String[2][var5];
                        var21 = new int[2][var5 * 4];
                        var8 = kg.field_c;
                        var9 = 0;
                        var10 = 0;
                        L5: while (true) {
                          if (var8 <= var9) {
                            var15 = 0;
                            var9 = var15;
                            var16 = 0;
                            var10 = var16;
                            L6: while (true) {
                              if (var15 >= var8) {
                                break L2;
                              } else {
                                var11 = pd.field_e[var15 + var5];
                                var6[1][var16] = cg.field_a[var11];
                                var21[1][4 * var16] = qg.field_c[var11];
                                var21[1][1 + 4 * var16] = eh.field_a[var11];
                                var21[1][2 + 4 * var16] = ld.field_M[var11];
                                var21[1][3 + var16 * 4] = ma.field_n[var11];
                                if (kj.a(cg.field_a[var11], (byte) -75)) {
                                  if (-1 == (ld.field_M[var11] + eh.field_a[var11] + ma.field_n[var11] ^ -1)) {
                                    var6[1][var16] = null;
                                    var16--;
                                    var16++;
                                    var15++;
                                    continue L6;
                                  } else {
                                    var16++;
                                    var15++;
                                    continue L6;
                                  }
                                } else {
                                  var16++;
                                  var15++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            var11 = pd.field_e[var9];
                            var6[0][var10] = cg.field_a[var11];
                            var21[0][var10 * 4] = qg.field_c[var11];
                            var21[0][var10 * 4 + 1] = eh.field_a[var11];
                            var21[0][2 + 4 * var10] = ld.field_M[var11];
                            var21[0][4 * var10 - -3] = ma.field_n[var11];
                            if (kj.a(cg.field_a[var11], (byte) -66)) {
                              if (ld.field_M[var11] + eh.field_a[var11] + ma.field_n[var11] == 0) {
                                var6[0][var10] = null;
                                var10--;
                                var9++;
                                var10++;
                                continue L5;
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            } else {
                              var9++;
                              var10++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        eh.a((byte) 68, (gb) (Object) var17);
                        if (var6_int != 0) {
                          sf.a(fh.field_a, false, var6_int, vg.field_P, nf.field_S, dk.field_i);
                          var6_int++;
                          continue L4;
                        } else {
                          sf.a(fh.field_a, false, var6_int, vg.field_P, nf.field_S, dk.field_i);
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    cg.field_a[var6_int] = var14.h(20);
                    var6_int++;
                    continue L3;
                  }
                }
              }
            }
            L7: {
              if (param0 <= -125) {
                break L7;
              } else {
                var13 = null;
                boolean discarded$1 = td.a(25, (da) null);
                break L7;
              }
            }
            var3.c(10);
            return;
          } else {
            je.a(false);
            return;
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        tg var11 = null;
        rc stackIn_3_0 = null;
        rc stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param4 instanceof tg) {
            stackOut_2_0 = (rc) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (rc) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (tg) (Object) stackIn_3_0;
          if (var11 == null) {
            break L1;
          } else {
            param2 = param2 & var11.field_B;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          mi.b(param4.field_m + param3, param4.field_j + param1, param4.field_t, param4.field_x, ((td) this).field_f);
          if (!param2) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        L3: {
          var8 = ((td) this).field_c + (param3 + param4.field_m);
          var9 = param1 - (-param4.field_j - ((td) this).field_o);
          mi.d(var8, var9, ((td) this).field_k, ((td) this).field_j, 5592405);
          mi.b(var8, var9, ((td) this).field_k, ((td) this).field_j, var7);
          if (param0 > 113) {
            break L3;
          } else {
            field_e = null;
            break L3;
          }
        }
        L4: {
          if (!var11.field_F) {
            break L4;
          } else {
            mi.e(var8, var9, ((td) this).field_k + var8, var9 + ((td) this).field_j, 1);
            mi.e(((td) this).field_k + var8, var9, var8, ((td) this).field_j + var9, 1);
            break L4;
          }
        }
        L5: {
          if (null == ((td) this).field_g) {
            break L5;
          } else {
            var10 = ((td) this).field_k + ((td) this).field_c + ((td) this).field_p;
            int discarded$1 = ((td) this).field_g.a(param4.field_i, param4.field_m + (param3 + var10), param1 + param4.field_j - -((td) this).field_m, param4.field_t - ((td) this).field_p - var10, param4.field_x + -(((td) this).field_p << 1320919649), ((td) this).field_q, ((td) this).field_a, ((td) this).field_b, ((td) this).field_d, 0);
            break L5;
          }
        }
    }

    final static boolean a(int param0, da param1) {
        if (param0 != -3) {
            td.a(-37);
        }
        return param1.b(true);
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
            field_h = null;
        }
        field_h = null;
        field_n = null;
        field_e = null;
    }

    td(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((td) this).field_d = 1;
        ((td) this).field_b = 1;
        ((td) this).field_c = param5;
        ((td) this).field_j = param7;
        ((td) this).field_a = param4;
        ((td) this).field_f = param9;
        ((td) this).field_k = param8;
        ((td) this).field_m = param2;
        ((td) this).field_o = param6;
        ((td) this).field_q = param3;
        ((td) this).field_p = param1;
        ((td) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 256;
        field_n = "Names cannot contain consecutive spaces";
    }
}
