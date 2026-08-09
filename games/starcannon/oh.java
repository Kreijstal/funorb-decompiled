/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int[][] field_e;
    static int[] field_c;
    static hl[] field_d;
    static rj field_a;
    static String field_b;

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 18097) {
                break L1;
              } else {
                field_e = (int[][]) null;
                break L1;
              }
            }
            stackIn_3_0 = cc.a(param1, param0, true, param2 + -18162);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("oh.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        if (param0 != -1) {
          field_b = (String) null;
          field_b = null;
          field_c = null;
          field_d = null;
          field_e = (int[][]) null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_d = null;
          field_e = (int[][]) null;
          field_a = null;
          return;
        }
    }

    final static java.awt.Frame a(int param0, ka param1, int param2, int param3, int param4, int param5) {
        Object stackIn_4_0 = null;
        Object stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jk[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        jk[] var9 = null;
        bk var10 = null;
        try {
          L0: {
            L1: {
              if (param5 < -91) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            if (param1.a((byte) -68)) {
              L2: {
                if (0 != param2) {
                  break L2;
                } else {
                  var9 = el.a(false, param1);
                  var6 = var9;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L3: while (true) {
                      if (var9.length <= var8) {
                        if (var7_int != 0) {
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        L4: {
                          if (var9[var8].field_d != param3) {
                            break L4;
                          } else {
                            if (var9[var8].field_h != param0) {
                              break L4;
                            } else {
                              L5: {
                                if (param4 == 0) {
                                  break L5;
                                } else {
                                  if (var9[var8].field_i != param4) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L6: {
                                if (var7_int == 0) {
                                  break L6;
                                } else {
                                  if (var9[var8].field_e <= param2) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var7_int = 1;
                              param2 = var9[var8].field_e;
                              break L4;
                            }
                          }
                        }
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
              var10 = param1.a(param4, param0, param2, param3, 2024561328);
              L7: while (true) {
                if (0 != var10.field_b) {
                  var7 = (java.awt.Frame) (var10.field_f);
                  if (var7 != null) {
                    if (var10.field_b == 2) {
                      eg.a(var7, (byte) -47, param1);
                      stackIn_34_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    return null;
                  }
                } else {
                  uc.a(-119, 10L);
                  continue L7;
                }
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var6_ref);

            stackIn_37_1 = new StringBuilder().append("oh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L8;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_4_0);
        } else {
          return (java.awt.Frame) ((Object) stackIn_34_0);
        }
    }

    static {
        field_b = "Connection lost. <%0>";
    }
}
