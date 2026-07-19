/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hca extends rqa {
    static llb field_o;

    hca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        nc stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ak.field_o = param0[0].a(false);
            if (param1 < -119) {
              stackOut_3_0 = new nc("void");
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("hca.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void e(byte param0) {
        if (param0 < 91) {
            field_o = (llb) null;
        }
        field_o = null;
    }

    final static lkb a(byte param0, String param1) {
        lkb discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        lkb stackIn_6_0 = null;
        lkb stackIn_10_0 = null;
        lkb stackIn_15_0 = null;
        int stackIn_23_0 = 0;
        lkb stackIn_28_0 = null;
        lkb stackIn_42_0 = null;
        lkb stackIn_47_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lkb stackOut_5_0 = null;
        lkb stackOut_9_0 = null;
        lkb stackOut_41_0 = null;
        lkb stackOut_46_0 = null;
        lkb stackOut_14_0 = null;
        lkb stackOut_27_0 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 > 95) {
                break L1;
              } else {
                var7 = (String) null;
                discarded$1 = hca.a((byte) 73, (String) null);
                break L1;
              }
            }
            if (0 == var2_int) {
              stackOut_5_0 = br.field_f;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 > (var2_int ^ -1)) {
                stackOut_9_0 = qw.field_j;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var4 < var2_int) {
                      L3: {
                        var5 = param1.charAt(var4);
                        if (var5 == 46) {
                          L4: {
                            if (0 == var4) {
                              break L4;
                            } else {
                              if (var4 == -1 + var2_int) {
                                break L4;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          stackOut_41_0 = ira.field_b;
                          stackIn_42_0 = stackOut_41_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (es.field_a.indexOf(var5) == -1) {
                            stackOut_46_0 = ira.field_b;
                            stackIn_47_0 = stackOut_46_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L3;
                          }
                        }
                      }
                      var4++;
                      continue L2;
                    } else {
                      return null;
                    }
                  }
                } else {
                  if (param1.charAt(var2_int + -1) != 34) {
                    stackOut_14_0 = ira.field_b;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L5: while (true) {
                      if (-1 + var2_int > var4) {
                        L6: {
                          var5 = param1.charAt(var4);
                          if (var5 != 92) {
                            L7: {
                              if (34 != var5) {
                                break L7;
                              } else {
                                if (var3 == 0) {
                                  stackOut_27_0 = ira.field_b;
                                  stackIn_28_0 = stackOut_27_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 = 0;
                            break L6;
                          } else {
                            L8: {
                              if (var3 != 0) {
                                stackOut_22_0 = 0;
                                stackIn_23_0 = stackOut_22_0;
                                break L8;
                              } else {
                                stackOut_21_0 = 1;
                                stackIn_23_0 = stackOut_21_0;
                                break L8;
                              }
                            }
                            var3 = stackIn_23_0;
                            break L6;
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) (var2);
            stackOut_51_1 = new StringBuilder().append("hca.C(").append(param0).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L9;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0;
                } else {
                  return stackIn_47_0;
                }
              }
            }
          }
        }
    }

    static {
    }
}
