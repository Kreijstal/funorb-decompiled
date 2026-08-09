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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ak.field_o = param0[0].a(false);
            if (param1 < -119) {
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("hca.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        lkb stackIn_6_0 = null;
        lkb stackIn_10_0 = null;
        lkb stackIn_15_0 = null;
        int stackIn_23_0 = 0;
        lkb stackIn_28_0 = null;
        lkb stackIn_42_0 = null;
        lkb stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 > 95) {
                break L1;
              } else {
                var7 = (String) null;
                hca.a((byte) 73, (String) null);
                break L1;
              }
            }
            if (0 == var2_int) {
              stackIn_6_0 = br.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 > (var2_int ^ -1)) {
                stackIn_10_0 = qw.field_j;
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
                          stackIn_42_0 = ira.field_b;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (es.field_a.indexOf(var5) == -1) {
                            stackIn_47_0 = ira.field_b;
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
                    stackIn_15_0 = ira.field_b;
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
                                  stackIn_28_0 = ira.field_b;
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
                                stackIn_23_0 = 0;
                                break L8;
                              } else {
                                stackIn_23_0 = 1;
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
            stackIn_53_0 = (RuntimeException) (var2);

            stackIn_53_1 = new StringBuilder().append("hca.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L9;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
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
