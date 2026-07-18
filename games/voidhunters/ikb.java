/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ikb extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(221, 113));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ikb.A(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int[] param0, int[] param1) {
        try {
            RuntimeException var3 = null;
            int var3_int = 0;
            StringBuilder var4 = null;
            int var5 = 0;
            int var6 = 0;
            int stackIn_6_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_21_0 = 0;
            int stackIn_33_0 = 0;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            RuntimeException decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_20_0 = 0;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            var6 = VoidHunters.field_G;
            try {
              L0: {
                if (param0 == null) {
                  L1: {
                    if (param1 == null) {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      break L1;
                    } else {
                      stackOut_4_0 = 1;
                      stackIn_6_0 = stackOut_4_0;
                      break L1;
                    }
                  }
                  L2: {
                    var3_int = stackIn_6_0;
                    if (var3_int != 0) {
                      System.out.println("Before=" + (Object) (Object) param1 + ", after=" + (Object) (Object) param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  if (param0 == param1) {
                    System.out.println("Using duplicate array reference in debug diffs!");
                    new Throwable().printStackTrace();
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  } else {
                    if (param1 == null) {
                      System.out.println("Before=" + (Object) (Object) param1 + ", after=" + (Object) (Object) param0);
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    } else {
                      if (param1.length == param0.length) {
                        var3_int = 0;
                        var4 = new StringBuilder();
                        StringBuilder discarded$5 = var4.append("{");
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= param0.length) {
                            L4: {
                              StringBuilder discarded$6 = var4.append("}");
                              if (var3_int == 0) {
                                break L4;
                              } else {
                                System.out.println((Object) (Object) var4);
                                break L4;
                              }
                            }
                            stackOut_32_0 = var3_int;
                            stackIn_33_0 = stackOut_32_0;
                            break L0;
                          } else {
                            L5: {
                              if (var5 <= 0) {
                                break L5;
                              } else {
                                StringBuilder discarded$7 = var4.append(",");
                                break L5;
                              }
                            }
                            L6: {
                              if (param1[var5] == param0[var5]) {
                                StringBuilder discarded$8 = var4.append("_");
                                break L6;
                              } else {
                                StringBuilder discarded$9 = var4.append(param1[var5] + "->" + param0[var5]);
                                var3_int = 1;
                                break L6;
                              }
                            }
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        System.out.println("Before length=" + param1.length + ", after length=" + param0.length);
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) var3;
                stackOut_34_1 = new StringBuilder().append("ikb.C(");
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param0 == null) {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L7;
                } else {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L7;
                }
              }
              L8: {
                stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
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
                  break L8;
                } else {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L8;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + false + ')');
            }
            return stackIn_33_0 != 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ikb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a() {
        field_o = null;
    }

    final static void e() {
        if (null != hg.field_b) {
            hg.field_b.b(-85);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Open";
    }
}
