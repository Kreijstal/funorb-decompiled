/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends mh {
    static String field_n;
    static v field_o;
    static int field_m;
    static int field_l;
    static String field_p;

    public static void b(int param0) {
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
        Object stackIn_3_0 = null;
        String stackIn_32_0 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_31_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var3_ref = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 < -91) {
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
                    var2 = (Object) (Object) ("<img=1>" + var2);
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
                    var3 = var3 + var2 + ": ";
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
              stackOut_31_0 = (String) var3;
              stackIn_32_0 = stackOut_31_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_33_0 = var2;
            stackOut_33_1 = new StringBuilder().append("re.F(").append(param0).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L9;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
        return stackIn_32_0;
    }

    final static void c(byte param0) {
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
        Object stackIn_3_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (!param1) {
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
                    var8_int = param3.indexOf((int) param2, var8_int);
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
                var10 = param3.indexOf((int) param2, var9);
                if (0 > var10) {
                  StringBuilder discarded$6 = var8.append(param3.substring(var9));
                  stackOut_11_0 = var8.toString();
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  StringBuilder discarded$7 = var8.append(param3.substring(var9, var10));
                  var9 = var10 - -1;
                  StringBuilder discarded$8 = var8.append(param0);
                  continue L3;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("re.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_12_0;
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
