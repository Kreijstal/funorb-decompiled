/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends jb {
    int field_f;
    int[] field_k;
    int field_m;
    int field_l;
    static oi field_p;
    int field_g;
    int field_j;
    int field_o;
    static String field_n;
    static ko field_h;
    static int field_i;

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((pe) this).field_o = param4;
        ((pe) this).field_f = param6;
        ((pe) this).field_g = param0;
        ((pe) this).field_l = param7;
        ((pe) this).field_j = param5;
        ((pe) this).field_k = param1;
        ((pe) this).field_m = param2;
        if (param3 != -26690) {
            pe.d(-95);
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        hb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        md var15 = null;
        int[][] var19 = null;
        var12 = CrazyCrystals.field_B;
        var15 = kd.field_n;
        var2 = var15.h(255);
        var3 = (hb) (Object) vm.field_g.g(32073);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var3.field_f != var2) {
                var3 = (hb) (Object) vm.field_g.a(false);
                continue L0;
              } else {
                break L1;
              }
            }
          }
          if (var3 != null) {
            var4 = var15.h(255);
            if (param0 == -1) {
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  th.field_A[0] = je.field_g;
                  var5 = var3.field_j;
                  var6_int = 1;
                  L3: while (true) {
                    if (var6_int >= var4) {
                      ei.a(var4, var5, false);
                      var6_int = 0;
                      L4: while (true) {
                        if (var6_int >= var4) {
                          go.a(var5, 240);
                          var6 = new String[2][var5];
                          var19 = new int[2][var5 * 4];
                          var8 = be.field_c;
                          var9 = 0;
                          var10 = 0;
                          L5: while (true) {
                            if (var9 >= var8) {
                              var13 = 0;
                              var9 = var13;
                              var14 = 0;
                              var10 = var14;
                              L6: while (true) {
                                if (var8 <= var13) {
                                  break L2;
                                } else {
                                  var11 = wp.field_d[var13 + var5];
                                  var6[1][var14] = th.field_A[var11];
                                  var19[1][4 * var14] = mh.field_l[var11];
                                  var19[1][var14 * 4 + 1] = dk.field_l[var11];
                                  var19[1][var14 * 4 + 2] = j.field_i[var11];
                                  var19[1][4 * var14 - -3] = cd.field_u[var11];
                                  if (ai.a((byte) 82, th.field_A[var11])) {
                                    if (-1 == (j.field_i[var11] + (dk.field_l[var11] + cd.field_u[var11]) ^ -1)) {
                                      var6[1][var14] = null;
                                      var14--;
                                      var14++;
                                      var13++;
                                      continue L6;
                                    } else {
                                      var14++;
                                      var13++;
                                      continue L6;
                                    }
                                  } else {
                                    var14++;
                                    var13++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              var11 = wp.field_d[var9];
                              var6[0][var10] = th.field_A[var11];
                              var19[0][var10 * 4] = mh.field_l[var11];
                              var19[0][1 + var10 * 4] = dk.field_l[var11];
                              var19[0][2 + var10 * 4] = j.field_i[var11];
                              var19[0][3 + var10 * 4] = cd.field_u[var11];
                              if (ai.a((byte) 82, th.field_A[var11])) {
                                if (0 == j.field_i[var11] + dk.field_l[var11] - -cd.field_u[var11]) {
                                  var6[0][var10] = null;
                                  var10--;
                                  var10++;
                                  var9++;
                                  continue L5;
                                } else {
                                  var10++;
                                  var9++;
                                  continue L5;
                                }
                              } else {
                                var10++;
                                var9++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          tb.a(-31416, (ng) (Object) var15);
                          if (var6_int != 0) {
                            ca.a(mc.field_q, jn.field_q, jd.field_I, var6_int, true, of.field_D);
                            var6_int++;
                            continue L4;
                          } else {
                            ca.a(mc.field_q, jn.field_q, jd.field_I, var6_int, true, of.field_D);
                            var6_int++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      th.field_A[var6_int] = var15.i(param0 + 128);
                      var6_int++;
                      continue L3;
                    }
                  }
                }
              }
              var3.a(false);
              return;
            } else {
              return;
            }
          } else {
            jj.a(4);
            return;
          }
        }
    }

    pe() {
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != 1) {
            field_h = null;
        }
        field_h = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = " (taster)";
        field_i = -1;
        field_p = new oi();
    }
}
