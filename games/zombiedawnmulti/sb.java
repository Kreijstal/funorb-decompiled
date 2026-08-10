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
        ma stackIn_3_0 = null;
        ma stackIn_9_0 = null;
        ma stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        ma stackIn_27_0 = null;
        ma stackIn_40_0 = null;
        ma stackIn_44_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
                stackIn_9_0 = er.field_f;
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
                        if (46 != var5) {
                          if (0 != (cd.field_Kb.indexOf(var5) ^ -1)) {
                            var3 = 0;
                            break L3;
                          } else {
                            stackIn_44_0 = so.field_t;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          L4: {
                            if (var4 == 0) {
                              break L4;
                            } else {
                              if (var2_int - 1 == var4) {
                                break L4;
                              } else {
                                if (var3 != 0) {
                                  break L4;
                                } else {
                                  var3 = 1;
                                  break L3;
                                }
                              }
                            }
                          }
                          stackIn_40_0 = so.field_t;
                          decompiledRegionSelector0 = 4;
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
                    L5: while (true) {
                      if (var4 < -1 + var2_int) {
                        L6: {
                          var5 = param1.charAt(var4);
                          if (var5 == 92) {
                            L7: {
                              if (var3 != 0) {
                                stackIn_22_0 = 0;
                                break L7;
                              } else {
                                stackIn_22_0 = 1;
                                break L7;
                              }
                            }
                            var3 = stackIn_22_0;
                            break L6;
                          } else {
                            L8: {
                              if (var5 != 34) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  stackIn_27_0 = so.field_t;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var3 = 0;
                            break L6;
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_13_0 = so.field_t;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = jo.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var2);

            stackIn_50_1 = new StringBuilder().append("sb.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L9;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ')');
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
                  return stackIn_40_0;
                } else {
                  return stackIn_44_0;
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
