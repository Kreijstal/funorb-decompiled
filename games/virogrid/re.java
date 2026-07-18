/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends mh {
    static String field_n;
    static v field_o;
    static int field_m;
    static int field_l;
    static String field_p;

    public static void b() {
        field_p = null;
        field_o = null;
        int var1 = 0;
        field_n = null;
    }

    final ul a(boolean param0) {
        if (!param0) {
            field_o = null;
            return oh.field_e;
        }
        return oh.field_e;
    }

    re(long param0, String param1) {
        super(param0, param1);
    }

    final static String a(byte param0, cj param1) {
        Object var3_ref = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String stackIn_31_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var3_ref = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param1.field_r == null) {
                break L1;
              } else {
                L2: {
                  var5 = param1.field_r;
                  var2 = (Object) (Object) var5;
                  var2 = (Object) (Object) var5;
                  if (param1.field_e != 1) {
                    break L2;
                  } else {
                    var2 = (Object) (Object) ("<img=0>" + var5);
                    break L2;
                  }
                }
                if (2 != param1.field_e) {
                  break L1;
                } else {
                  var2 = (Object) (Object) ("<img=1>" + (String) var2);
                  var3_ref = var2;
                  var3_ref = var2;
                  break L1;
                }
              }
            }
            L3: {
              var3 = "";
              if (2 != param1.field_n) {
                L4: {
                  if (0 != param1.field_n) {
                    break L4;
                  } else {
                    if (ch.field_e) {
                      var3 = "[" + fj.field_a + "] ";
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param1.field_n != 1) {
                    break L5;
                  } else {
                    var3 = "[" + oi.a(new String[1], ra.field_c, 2) + "] ";
                    break L5;
                  }
                }
                L6: {
                  if (param1.field_n != 4) {
                    break L6;
                  } else {
                    if (tl.field_e != null) {
                      var3 = "[" + tl.field_e + "] ";
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (3 != param1.field_n) {
                    break L7;
                  } else {
                    var3 = "[#" + param1.field_d + "] ";
                    break L7;
                  }
                }
                if (!param1.field_j) {
                  var3 = var3 + (String) var2 + ": ";
                  break L3;
                } else {
                  break L3;
                }
              } else {
                if (param1.field_j) {
                  break L3;
                } else {
                  L8: {
                    if (param1.field_m != 0) {
                      break L8;
                    } else {
                      if (0 == param1.field_a) {
                        var3 = oi.a(new String[1], lm.field_c, 2);
                        break L3;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var3 = oi.a(new String[1], mf.field_d, 2);
                  break L3;
                }
              }
            }
            stackOut_30_0 = (String) var3;
            stackIn_31_0 = stackOut_30_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_32_0 = var2;
            stackOut_32_1 = new StringBuilder().append("re.F(").append(-100).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_31_0;
    }

    final static void c() {
        oi.field_h.setLength(0);
        sd.field_e = 0;
    }

    final static String a(String param0, boolean param1, char param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              var5 = param0.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (0 == var7) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param3.indexOf('_', var8_int);
                  if (var8_int < 0) {
                    break L1;
                  } else {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L2;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param3.indexOf('_', var9);
              if (0 > var10) {
                StringBuilder discarded$6 = var8.append(param3.substring(var9));
                stackOut_10_0 = var8.toString();
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                StringBuilder discarded$7 = var8.append(param3.substring(var9, var10));
                var9 = var10 - -1;
                StringBuilder discarded$8 = var8.append(param0);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("re.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(false).append(',').append('_').append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_l = 0;
        field_p = "Please enter a year between <%0> and <%1>";
    }
}
