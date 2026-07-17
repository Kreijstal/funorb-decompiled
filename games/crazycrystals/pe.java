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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((pe) this).field_o = param4;
              ((pe) this).field_f = param6;
              ((pe) this).field_g = param0;
              ((pe) this).field_l = param7;
              ((pe) this).field_j = param5;
              ((pe) this).field_k = param1;
              ((pe) this).field_m = param2;
              if (param3 == -26690) {
                break L1;
              } else {
                pe.d(-95);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pe.C(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static void a() {
        RuntimeException var1 = null;
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
        RuntimeException decompiledCaughtException = null;
        var12 = CrazyCrystals.field_B;
        try {
          L0: {
            var15 = kd.field_n;
            var2 = var15.h(255);
            var3 = (hb) (Object) vm.field_g.g(32073);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_f != var2) {
                    var3 = (hb) (Object) vm.field_g.a(false);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 != null) {
                var4 = var15.h(255);
                L3: {
                  if (var4 != 0) {
                    th.field_A[0] = je.field_g;
                    var5 = var3.field_j;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        ei.a(var4, var5, false);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            go.a(var5, 240);
                            var6 = new String[2][var5];
                            var19 = new int[2][var5 * 4];
                            var8 = be.field_c;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var8 <= var13) {
                                    var3.a(false);
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = wp.field_d[var13 + var5];
                                      var6[1][var14] = th.field_A[var11];
                                      var19[1][4 * var14] = mh.field_l[var11];
                                      var19[1][var14 * 4 + 1] = dk.field_l[var11];
                                      var19[1][var14 * 4 + 2] = j.field_i[var11];
                                      var19[1][4 * var14 - -3] = cd.field_u[var11];
                                      if (ai.a((byte) 82, th.field_A[var11])) {
                                        if (j.field_i[var11] + (dk.field_l[var11] + cd.field_u[var11]) != 0) {
                                          break L8;
                                        } else {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var13++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = wp.field_d[var9];
                                  var6[0][var10] = th.field_A[var11];
                                  var19[0][var10 * 4] = mh.field_l[var11];
                                  var19[0][1 + var10 * 4] = dk.field_l[var11];
                                  var19[0][2 + var10 * 4] = j.field_i[var11];
                                  var19[0][3 + var10 * 4] = cd.field_u[var11];
                                  if (ai.a((byte) 82, th.field_A[var11])) {
                                    if (0 != j.field_i[var11] + dk.field_l[var11] - -cd.field_u[var11]) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              tb.a(-31416, (ng) (Object) var15);
                              if (var6_int != 0) {
                                ca.a(mc.field_q, jn.field_q, jd.field_I, var6_int, true, of.field_D);
                                break L10;
                              } else {
                                ca.a(mc.field_q, jn.field_q, jd.field_I, var6_int, true, of.field_D);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        th.field_A[var6_int] = var15.i(127);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.a(false);
                    break L3;
                  }
                }
                break L0;
              } else {
                jj.a(4);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "pe.A(" + -1 + 41);
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
