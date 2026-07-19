/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sb {
    int field_j;
    int field_h;
    int field_a;
    static ip field_i;
    int field_b;
    static String field_g;
    static String field_k;
    static int field_c;
    int field_e;
    int field_f;
    static String field_d;

    final static ma a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ma stackIn_3_0 = null;
        ma stackIn_9_0 = null;
        ma stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        ma stackIn_27_0 = null;
        ma stackIn_41_0 = null;
        ma stackIn_45_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_8_0 = null;
        ma stackOut_40_0 = null;
        ma stackOut_44_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        ma stackOut_26_0 = null;
        ma stackOut_12_0 = null;
        ma stackOut_2_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (-1 != (var2_int ^ -1)) {
              L1: {
                if (param0 == 32351) {
                  break L1;
                } else {
                  field_d = (String) null;
                  break L1;
                }
              }
              if (64 < var2_int) {
                stackOut_8_0 = er.field_f;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var4 < var2_int) {
                      L3: {
                        L4: {
                          var5 = param1.charAt(var4);
                          if (46 != var5) {
                            break L4;
                          } else {
                            L5: {
                              if (var4 == 0) {
                                break L5;
                              } else {
                                if (var2_int - 1 == var4) {
                                  break L5;
                                } else {
                                  if (var3 != 0) {
                                    break L5;
                                  } else {
                                    var3 = 1;
                                    if (var6 == 0) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_40_0 = so.field_t;
                            stackIn_41_0 = stackOut_40_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                        if (0 != (cd.field_Kb.indexOf(var5) ^ -1)) {
                          var3 = 0;
                          break L3;
                        } else {
                          stackOut_44_0 = so.field_t;
                          stackIn_45_0 = stackOut_44_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                      var4++;
                      continue L2;
                    } else {
                      return null;
                    }
                  }
                } else {
                  if (param1.charAt(var2_int + -1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L6: while (true) {
                      if (var4 < -1 + var2_int) {
                        L7: {
                          L8: {
                            var5 = param1.charAt(var4);
                            if (var5 == 92) {
                              L9: {
                                if (var3 != 0) {
                                  stackOut_21_0 = 0;
                                  stackIn_22_0 = stackOut_21_0;
                                  break L9;
                                } else {
                                  stackOut_20_0 = 1;
                                  stackIn_22_0 = stackOut_20_0;
                                  break L9;
                                }
                              }
                              var3 = stackIn_22_0;
                              if (var6 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          L10: {
                            if (var5 != 34) {
                              break L10;
                            } else {
                              if (var3 == 0) {
                                stackOut_26_0 = so.field_t;
                                stackIn_27_0 = stackOut_26_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var3 = 0;
                          break L7;
                        }
                        var4++;
                        continue L6;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_12_0 = so.field_t;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = jo.field_e;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var2);
            stackOut_50_1 = new StringBuilder().append("sb.V(").append(param0).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L11;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_41_0;
                } else {
                  return stackIn_45_0;
                }
              }
            }
          }
        }
    }

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_k = null;
        int var1 = 50 % ((-63 - param0) / 43);
        field_i = null;
    }

    abstract void a(int param0, int param1);

    static {
        field_g = "Add <%0> to ignore list";
        field_d = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_i = new ip();
    }
}
