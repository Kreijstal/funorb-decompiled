/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni implements de {
    static int field_k;
    private int field_n;
    private int field_c;
    private int field_l;
    private int field_i;
    private int field_d;
    private qe field_m;
    private int field_j;
    private int field_b;
    private int field_a;
    private int field_h;
    private int field_g;
    private int field_e;
    static String[] field_f;

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gh var12 = null;
        uj stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj stackOut_2_0 = null;
        Object stackOut_1_0 = null;
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
              if (param4 instanceof gh) {
                stackOut_2_0 = (uj) param4;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (uj) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var12 = (gh) (Object) stackIn_3_0;
              if (var12 == null) {
                break L2;
              } else {
                param1 = param1 & var12.field_u;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              ki.d(param0 + param4.field_s, param3 - -param4.field_j, param4.field_i, param4.field_f, ((ni) this).field_d);
              if (!param1) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              var10 = 97 % ((2 - param2) / 54);
              var8 = param4.field_s + (param0 - -((ni) this).field_l);
              var9 = ((ni) this).field_g + param4.field_j + param3;
              ki.b(var8, var9, ((ni) this).field_b, ((ni) this).field_c, 5592405);
              ki.d(var8, var9, ((ni) this).field_b, ((ni) this).field_c, var7);
              if (!var12.field_z) {
                break L4;
              } else {
                ki.a(var8, var9, var8 + ((ni) this).field_b, var9 + ((ni) this).field_c, 1);
                ki.a(((ni) this).field_b + var8, var9, var8, ((ni) this).field_c + var9, 1);
                break L4;
              }
            }
            L5: {
              if (((ni) this).field_m != null) {
                var11 = ((ni) this).field_b + ((ni) this).field_l - -((ni) this).field_i;
                int discarded$1 = ((ni) this).field_m.a(param4.field_k, param4.field_s + (param0 - -var11), ((ni) this).field_a + (param4.field_j + param3), param4.field_i + (-((ni) this).field_i + -var11), -(((ni) this).field_i << 1) + param4.field_f, ((ni) this).field_j, ((ni) this).field_e, ((ni) this).field_n, ((ni) this).field_h, 0);
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("ni.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public static void a() {
        field_f = null;
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_29_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!dk.a((byte) -122, param1.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!dk.a((byte) -126, param1.charAt(var3 - 1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if (12 >= var4) {
                      var5 = new StringBuilder(var4);
                      if (param0 >= 106) {
                        var6 = var2_int;
                        L5: while (true) {
                          if (var6 >= var3) {
                            if (var5.length() != 0) {
                              stackOut_29_0 = var5.toString();
                              stackIn_30_0 = stackOut_29_0;
                              break L0;
                            } else {
                              stackOut_27_0 = null;
                              stackIn_28_0 = stackOut_27_0;
                              return (String) (Object) stackIn_28_0;
                            }
                          } else {
                            L6: {
                              var7 = param1.charAt(var6);
                              int discarded$2 = 90;
                              if (dk.a((char) var7)) {
                                var8 = pa.a((char) var7, -80);
                                if (var8 == 0) {
                                  break L6;
                                } else {
                                  StringBuilder discarded$3 = var5.append((char) var8);
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                            var6++;
                            continue L5;
                          }
                        }
                      } else {
                        stackOut_17_0 = null;
                        stackIn_18_0 = stackOut_17_0;
                        return (String) (Object) stackIn_18_0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("ni.B(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
        return stackIn_30_0;
    }

    ni(qe param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((ni) this).field_n = 1;
        ((ni) this).field_h = 1;
        try {
            ((ni) this).field_l = param5;
            ((ni) this).field_g = param6;
            ((ni) this).field_d = param9;
            ((ni) this).field_i = param1;
            ((ni) this).field_c = param7;
            ((ni) this).field_e = param4;
            ((ni) this).field_b = param8;
            ((ni) this).field_a = param2;
            ((ni) this).field_m = param0;
            ((ni) this).field_j = param3;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ni.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
        field_f = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
