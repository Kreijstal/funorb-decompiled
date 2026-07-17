/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fi extends lh {
    int[] field_m;
    boolean field_p;
    static String field_k;
    static sf field_n;
    int field_i;
    static int field_j;
    static String field_l;
    static String[] field_o;

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_33_0 = null;
        String stackOut_28_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = uk.a(53, param0);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (r.a(var4.charAt(0), 120)) {
                              break L3;
                            } else {
                              if (!r.a(var4.charAt(-1 + var4.length()), -43)) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (param0.length() <= var6) {
                                    if (0 < var5) {
                                      stackOut_33_0 = ha.field_m;
                                      stackIn_34_0 = stackOut_33_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param0.charAt(var6);
                                      if (!r.a((char) var7, -122)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (2 > var5) {
                                        break L6;
                                      } else {
                                        if (!param1) {
                                          stackOut_28_0 = wf.field_e;
                                          stackIn_29_0 = stackOut_28_0;
                                          return stackIn_29_0;
                                        } else {
                                          break L6;
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
                          stackOut_17_0 = ha.field_m;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        }
                      }
                    }
                    stackOut_12_0 = hi.field_k;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_7_0 = hi.field_k;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = hi.field_k;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("fi.B(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L7;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L7;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param1 + 44 + 124 + 41);
        }
        return stackIn_34_0;
    }

    final static n a(rh param0, rh param1, String param2, String param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        n stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param0.a(param2, (byte) -100);
              if (param4 == 82) {
                break L1;
              } else {
                var7 = null;
                n discarded$2 = fi.a((rh) null, (rh) null, (String) null, (String) null, (byte) 26);
                break L1;
              }
            }
            var6 = param0.a(param3, (byte) -15, var5_int);
            stackOut_2_0 = dl.a(var6, 2, var5_int, param1, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("fi.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        field_k = null;
        field_l = null;
        if (param0 != -2) {
            fi.a(38);
        }
    }

    fi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "<%0>Green Switches:<%1> Causes all the recessed walls to slide out, and become normal wall blocks. Warning! Fleas standing in the way are crushed and die!";
        field_l = "Level complete!";
        field_o = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
