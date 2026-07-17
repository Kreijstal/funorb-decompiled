/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wp {
    static gh field_a;
    static String field_b;
    static String field_c;

    final static void a(int param0) {
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (ce.field_x.field_M) {
          if ((1 << ce.field_x.field_h & ce.field_x.field_P.field_e) == 0) {
            if (ce.field_x.field_P.field_e == 0) {
              if ((1 << ce.field_x.field_P.field_r) + -1 == (1 << ce.field_x.field_h | ce.field_x.field_i)) {
                oq.field_i[13] = mq.field_a;
                return;
              } else {
                oq.field_i[13] = uo.field_b;
                return;
              }
            } else {
              oq.field_i[13] = qq.field_s;
              return;
            }
          } else {
            oq.field_i[13] = eq.field_i;
            return;
          }
        } else {
          if (0 == (ce.field_x.field_P.field_e & 1 << ce.field_x.field_h)) {
            if (ce.field_x.field_P.field_e == 0) {
              if (-1 + (1 << ce.field_x.field_P.field_r) != (ce.field_x.field_i | 1 << ce.field_x.field_h)) {
                oq.field_i[13] = hn.field_a;
                return;
              } else {
                oq.field_i[13] = ip.field_d;
                return;
              }
            } else {
              oq.field_i[13] = en.field_d;
              return;
            }
          } else {
            oq.field_i[13] = qc.field_s;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0, oh param1, oh param2) {
        RuntimeException var3 = null;
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
            L1: {
              if (param1.field_e == null) {
                break L1;
              } else {
                param1.b((byte) -111);
                break L1;
              }
            }
            param1.field_f = param2;
            param1.field_e = param2.field_e;
            param1.field_e.field_f = param1;
            param1.field_f.field_e = param1;
            if (param0 <= -122) {
              break L0;
            } else {
              field_c = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wp.A(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_34_0 = null;
        String stackOut_29_0 = null;
        String stackOut_20_0 = null;
        Object stackOut_15_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = ji.a(param1, true);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          if (param0 <= -46) {
                            L3: {
                              if (tc.a(var4.charAt(0), 2)) {
                                break L3;
                              } else {
                                if (!tc.a(var4.charAt(-1 + var4.length()), 2)) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    if (param1.length() <= var6) {
                                      if (var5 > 0) {
                                        stackOut_34_0 = cr.field_a;
                                        stackIn_35_0 = stackOut_34_0;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param1.charAt(var6);
                                        if (!tc.a((char) var7, 2)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (var5 < 2) {
                                          break L6;
                                        } else {
                                          if (param2) {
                                            break L6;
                                          } else {
                                            stackOut_29_0 = ms.field_g;
                                            stackIn_30_0 = stackOut_29_0;
                                            return stackIn_30_0;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackOut_20_0 = cr.field_a;
                            stackIn_21_0 = stackOut_20_0;
                            return stackIn_21_0;
                          } else {
                            stackOut_15_0 = null;
                            stackIn_16_0 = stackOut_15_0;
                            return (String) (Object) stackIn_16_0;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = fp.field_a;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
              stackOut_7_0 = fp.field_a;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = fp.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("wp.B(").append(param0).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L7;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param2 + 41);
        }
        return stackIn_35_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Click";
        field_c = "Place fleets in territory <%0> (<%1> remaining)";
    }
}
