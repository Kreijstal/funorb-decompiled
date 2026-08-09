/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_a;

    final static int a(int param0, de param1, int param2, d param3) {
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (null == param1.field_i) {
                  break L1;
                } else {
                  if (param3 == null) {
                    break L1;
                  } else {
                    if (param1.field_k != param3.field_m) {
                      break L1;
                    } else {
                      var4_int = param3.field_f.length;
                      var5 = param1.field_i[param2].length / var4_int;
                      var6 = param0;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if (var6 >= var5) {
                              break L4;
                            } else {
                              stackIn_23_0 = (param3.field_g < param1.field_p[param2][var6] ? -1 : (param3.field_g == param1.field_p[param2][var6] ? 0 : 1));

                              if (var8 != 0) {
                                break L3;
                              } else {
                                L5: {
                                  if (stackIn_23_0 != 0) {
                                    break L5;
                                  } else {
                                    if (!f.a(-15189, param1.field_g[param2][var6])) {
                                      break L5;
                                    } else {
                                      var7 = 0;
                                      L6: while (true) {
                                        L7: {
                                          L8: {
                                            if (var7 >= var4_int) {
                                              break L8;
                                            } else {
                                              stackIn_20_0 = param1.field_i[param2][var6 * var4_int + var7] ^ -1;

                                              if (var8 != 0) {
                                                break L7;
                                              } else {
                                                if (stackIn_20_0 != (param3.field_f[var7] ^ -1)) {
                                                  break L5;
                                                } else {
                                                  var7++;
                                                  if (var8 == 0) {
                                                    continue L6;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          stackIn_20_0 = var6;
                                          break L7;
                                        }
                                        decompiledRegionSelector0 = 2;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                                var6++;
                                if (var8 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          stackIn_23_0 = -1;
                          break L3;
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("ti.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        bb.field_a.b(16564, param1);
        if (param0 != 0) {
            d var3 = (d) null;
            ti.a(72, (de) null, -117, (d) null);
        }
    }

    static {
    }
}
