/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String field_b;
    static int field_c;
    static String field_d;
    static lk field_a;

    final static boolean a(ad param0, ad param1, ad param2, byte param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.a(92)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.a(0, "commonui")) {
                L1: {
                  if (!param1.a(-33)) {
                    break L1;
                  } else {
                    if (param1.a(0, "commonui")) {
                      if (param3 >= 100) {
                        L2: {
                          if (!param2.a(-82)) {
                            break L2;
                          } else {
                            if (!param2.a(0, "button.gif")) {
                              break L2;
                            } else {
                              return true;
                            }
                          }
                        }
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        stackIn_12_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("di.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    final static d a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, byte param8) {
        d var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        d stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = -126 % ((param8 - -23) / 61);
            var9 = new d(param5, param1, param6, param3, param0, param2, param4);
            wk.field_b.a(-8212, var9);
            pj.a(param7, var9, true);
            stackIn_1_0 = (d) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var9_ref);

            stackIn_4_1 = new StringBuilder().append("di.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0) {
            field_a = (lk) null;
        }
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.equals("B")) {
              if (param0.equals("I")) {
                stackIn_6_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.equals("S")) {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param0.equals("J")) {
                    if (!param0.equals("Z")) {
                      if (param0.equals("F")) {
                        stackIn_20_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param0.equals("D")) {
                          var2_int = -5 / ((param1 - 0) / 59);
                          if (param0.equals("C")) {
                            stackIn_27_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param0);
                          }
                        } else {
                          stackIn_23_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_16_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("di.B(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L1;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      return stackIn_27_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                param1 = am.a((char)param0, param1, "", -23026);
                var3 = ki.a((byte) 55, param1);
                if (0 != (param2.indexOf(param1) ^ -1)) {
                  break L2;
                } else {
                  if ((param2.indexOf(var3) ^ -1) == 0) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("di.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        field_b = "Start Game";
        field_a = new lk();
    }
}
