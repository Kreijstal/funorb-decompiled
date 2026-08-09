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
        bg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -36) {
                break L1;
              } else {
                qb.a('ﾓ', (byte) -10);
                break L1;
              }
            }
            var4_int = param3.c(-1, param2);
            var5 = param3.a(param1 + -90, var4_int, param0);
            stackIn_3_0 = jj.a(param3, var5, (byte) 18, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("qb.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 > -31) {
            return;
        }
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
        int var2 = -119 % ((param1 - 0) / 56);
        if (param0 != 45 && 160 != param0 && param0 != 32 && param0 != 95) {
            return false;
        }
        return true;
    }

    final static void b(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        uc var15 = null;
        int[][] var19 = null;
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == 0) {
              var13 = mk.field_j;
              var15 = var13;
              var2 = var15.a(param0 ^ -16384);
              var3 = (ja) ((Object) vd.field_l.d(9272));
              L1: while (true) {
                L2: {
                  if (var3 == null) {
                    break L2;
                  } else {
                    if (var3.field_o == var2) {
                      break L2;
                    } else {
                      var3 = (ja) ((Object) vd.field_l.e((byte) -119));
                      continue L1;
                    }
                  }
                }
                if (var3 != null) {
                  L3: {
                    var4 = var15.a(-16384);
                    if (var4 != 0) {
                      eh.field_k[0] = kj.field_f;
                      var5 = var3.field_k;
                      var6_int = 1;
                      L4: while (true) {
                        if (var6_int >= var4) {
                          le.a(var4, var5, false);
                          var6_int = 0;
                          L5: while (true) {
                            if (var6_int >= var4) {
                              df.b(param0 + 0, var5);
                              var6 = new String[2][var5];
                              var19 = new int[2][4 * var5];
                              var8 = pb.field_b;
                              var9 = 0;
                              var10 = 0;
                              L6: while (true) {
                                if (var8 <= var9) {
                                  var9 = 0;
                                  var14 = 0;
                                  var10 = var14;
                                  L7: while (true) {
                                    if (var8 <= var9) {
                                      var3.b((byte) 12);
                                      break L3;
                                    } else {
                                      L8: {
                                        var11 = pf.field_b[var9 + var5];
                                        var6[1][var14] = eh.field_k[var11];
                                        var19[1][4 * var14] = a.field_c[var11];
                                        var19[1][1 + var14 * 4] = oa.field_a[var11];
                                        var19[1][2 + var14 * 4] = oa.field_c[var11];
                                        var19[1][3 + var14 * 4] = dd.field_L[var11];
                                        if (!me.a(-88, eh.field_k[var11])) {
                                          break L8;
                                        } else {
                                          if (0 != oa.field_c[var11] + (oa.field_a[var11] + dd.field_L[var11])) {
                                            break L8;
                                          } else {
                                            var6[1][var14] = null;
                                            var14--;
                                            break L8;
                                          }
                                        }
                                      }
                                      var14++;
                                      var9++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  L9: {
                                    var11 = pf.field_b[var9];
                                    var6[0][var10] = eh.field_k[var11];
                                    var19[0][4 * var10] = a.field_c[var11];
                                    var19[0][var10 * 4 + 1] = oa.field_a[var11];
                                    var19[0][2 + var10 * 4] = oa.field_c[var11];
                                    var19[0][3 + 4 * var10] = dd.field_L[var11];
                                    if (me.a(122, eh.field_k[var11])) {
                                      if (-1 == (dd.field_L[var11] + oa.field_a[var11] - -oa.field_c[var11] ^ -1)) {
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
                                fb.a(-20936, var15);
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
                          eh.field_k[var6_int] = var13.e(param0 + -1);
                          var6_int++;
                          continue L4;
                        }
                      }
                    } else {
                      var3.b((byte) 12);
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  gb.g(-17464);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "qb.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_d = "Music: ";
        field_a = new jj();
        field_h = new rj();
        field_g = 64;
    }
}
