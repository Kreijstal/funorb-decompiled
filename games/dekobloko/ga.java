/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga implements lh {
    static String field_d;
    static jc field_e;
    static String field_a;
    static String field_c;
    static String field_b;

    final static int a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, mm param7, byte param8, int param9, int param10) {
        int var11_int = 0;
        RuntimeException var11 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var11_int = 2;
              if (param7 == se.field_S) {
                var11_int = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param7.a(param3, param10 - var11_int, -var11_int + param2, param0, param5, 65793, -1, param9, param1, param4);
              param7.a(param3, -var11_int + param10, param2, param0, param5, 65793, -1, param9, param1, param4);
              param7.a(param3, param10 + -var11_int, param2 - -var11_int, param0, param5, 65793, -1, param9, param1, param4);
              param7.a(param3, param10, -var11_int + param2, param0, param5, 65793, -1, param9, param1, param4);
              if (param8 <= -123) {
                break L2;
              } else {
                ga.a(false, -18, 81);
                break L2;
              }
            }
            L3: {
              param7.a(param3, param10, param2 - -var11_int, param0, param5, 65793, -1, param9, param1, param4);
              param7.a(param3, param10 - -var11_int, param2 + -var11_int, param0, param5, 65793, -1, param9, param1, param4);
              param7.a(param3, param10 - -var11_int, param2, param0, param5, 65793, -1, param9, param1, param4);
              param7.a(param3, var11_int + param10, param2 + var11_int, param0, param5, 65793, -1, param9, param1, param4);
              if (param7 != w.field_kb) {
                break L3;
              } else {
                param7.a(param3, 1 + param10, -var11_int + param2, param0, param5, 65793, -1, param9, param1, param4);
                param7.a(param3, param10 + -1, -var11_int + param2, param0, param5, 65793, -1, param9, param1, param4);
                param7.a(param3, param10 + var11_int, -1 + param2, param0, param5, 65793, -1, param9, param1, param4);
                param7.a(param3, -var11_int + param10, param2 + -1, param0, param5, 65793, -1, param9, param1, param4);
                param7.a(param3, var11_int + param10, 1 + param2, param0, param5, 65793, -1, param9, param1, param4);
                param7.a(param3, param10 - var11_int, param2 - -1, param0, param5, 65793, -1, param9, param1, param4);
                param7.a(param3, param10 + 1, var11_int + param2, param0, param5, 65793, -1, param9, param1, param4);
                param7.a(param3, -1 + param10, param2 - -var11_int, param0, param5, 65793, -1, param9, param1, param4);
                break L3;
              }
            }
            stackIn_8_0 = param7.a(param3, param10, param2, param0, param5, param6, -1, param9, param1, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var11 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var11);

            stackIn_11_1 = new StringBuilder().append("ga.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        return stackIn_8_0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -52) {
          field_d = (String) null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static void b(byte param0) {
        aa.field_f = new vj();
        if (param0 == -112) {
            return;
        }
        field_e = (jc) null;
    }

    final static void a(boolean param0, int param1, int param2) {
        uf var3;
        if (param0) {
          field_a = (String) null;
          var3 = we.field_b;
          var3.f(param2, -4);
          var3.a(true, 3);
          var3.a(true, 10);
          var3.d(-1, param1);
          return;
        } else {
          var3 = we.field_b;
          var3.f(param2, -4);
          var3.a(true, 3);
          var3.a(true, 10);
          var3.d(-1, param1);
          return;
        }
    }

    final static jc a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jc stackIn_4_0 = null;
        jc stackIn_8_0 = null;
        jc stackIn_18_0 = null;
        jc stackIn_22_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackIn_4_0 = hm.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2_int > 63) {
                stackIn_8_0 = (jc) (field_e);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var3 = 0;
                  if (param0 == 7017) {
                    break L1;
                  } else {
                    field_d = (String) null;
                    break L1;
                  }
                }
                L2: while (true) {
                  if (var3 < var2_int) {
                    L3: {
                      var4 = param1.charAt(var3);
                      if (45 != var4) {
                        if (0 == (v.field_c.indexOf(var4) ^ -1)) {
                          stackIn_22_0 = be.field_x;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      } else {
                        L4: {
                          if (-1 == (var3 ^ -1)) {
                            break L4;
                          } else {
                            if (var3 != -1 + var2_int) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        stackIn_18_0 = be.field_x;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      stackIn_25_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("ga.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0;
              } else {
                return (jc) ((Object) stackIn_25_0);
              }
            }
          }
        }
    }

    static {
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_a = "Rating";
        field_e = new jc();
        field_c = "Confirm Password: ";
        field_b = "Loading backgrounds";
    }
}
