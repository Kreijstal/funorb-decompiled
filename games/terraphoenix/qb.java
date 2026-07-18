/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static bg field_c;
    static jj field_a;
    static ci[] field_f;
    static String field_d;
    static fd field_b;
    static rj field_h;
    static String field_e;
    static int field_g;

    final static bg a(String param0, byte param1, String param2, fa param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bg stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        bg stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param3.c(-1, param2);
            var5 = param3.a(-126, var4_int, param0);
            stackOut_0_0 = jj.a(param3, var5, (byte) 18, var4_int);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("qb.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(-36).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a() {
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_h = null;
        field_c = null;
    }

    final static boolean a(char param0, byte param1) {
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (!(!pd.a(75, param0))) {
            return true;
        }
        int var2 = -119 % (param1 / 56);
        if (param0 != 45) {
            if (160 != param0) {
                if (param0 != 32) {
                    if (param0 != 95) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        ja var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        uc var13 = null;
        int var14 = 0;
        int var15 = 0;
        uc var16 = null;
        int[][] var20 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            var13 = mk.field_j;
            var16 = var13;
            var2 = var16.a(-16384);
            var3 = (ja) (Object) vd.field_l.d(9272);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_o == var2) {
                    break L2;
                  } else {
                    var3 = (ja) (Object) vd.field_l.e((byte) -119);
                    continue L1;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var16.a(-16384);
                  if (var4 != 0) {
                    eh.field_k[0] = kj.field_f;
                    var5 = var3.field_k;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        int discarded$1 = 0;
                        le.a(var4, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            df.b(0, var5);
                            var6 = new String[2][var5];
                            var20 = new int[2][4 * var5];
                            var8 = pb.field_b;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L7: while (true) {
                                  if (var8 <= var14) {
                                    var3.b((byte) 12);
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = pf.field_b[var14 + var5];
                                      var6[1][var15] = eh.field_k[var11];
                                      var20[1][4 * var15] = a.field_c[var11];
                                      var20[1][1 + var15 * 4] = oa.field_a[var11];
                                      var20[1][2 + var15 * 4] = oa.field_c[var11];
                                      var20[1][3 + var15 * 4] = dd.field_L[var11];
                                      if (!me.a(-88, eh.field_k[var11])) {
                                        break L8;
                                      } else {
                                        if (0 != oa.field_c[var11] + (oa.field_a[var11] + dd.field_L[var11])) {
                                          break L8;
                                        } else {
                                          var6[1][var15] = null;
                                          var15--;
                                          break L8;
                                        }
                                      }
                                    }
                                    var15++;
                                    var14++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = pf.field_b[var9];
                                  var6[0][var10] = eh.field_k[var11];
                                  var20[0][4 * var10] = a.field_c[var11];
                                  var20[0][var10 * 4 + 1] = oa.field_a[var11];
                                  var20[0][2 + var10 * 4] = oa.field_c[var11];
                                  var20[0][3 + 4 * var10] = dd.field_L[var11];
                                  if (me.a(122, eh.field_k[var11])) {
                                    if (dd.field_L[var11] + oa.field_a[var11] - -oa.field_c[var11] == 0) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              fb.a(-20936, (dh) (Object) var16);
                              if (0 != var6_int) {
                                th.a(var6_int, -1, jc.field_D, hb.field_j, dc.field_a, lb.field_d);
                                break L10;
                              } else {
                                th.a(var6_int, -1, jc.field_D, hb.field_j, dc.field_a, lb.field_d);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        eh.field_k[var6_int] = var13.e(-1);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.b((byte) 12);
                    break L3;
                  }
                }
                break L0;
              } else {
                gb.g(-17464);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "qb.A(" + 0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Music: ";
        field_a = new jj();
        field_h = new rj();
        field_g = 64;
    }
}
