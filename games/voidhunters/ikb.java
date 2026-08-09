/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ikb extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(221, 113));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ikb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int[] param0, int[] param1, boolean param2) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            int stackIn_6_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_21_0 = 0;
            int stackIn_33_0 = 0;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            StringBuilder stackIn_39_1 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            int decompiledRegionSelector0 = 0;
            RuntimeException decompiledCaughtException = null;
            int var3_int = 0;
            RuntimeException var3 = null;
            StringBuilder var4 = null;
            int var5 = 0;
            int var6 = 0;
            var6 = VoidHunters.field_G;
            try {
              L0: {
                if (param0 == null) {
                  L1: {
                    if (param1 == null) {
                      stackIn_6_0 = 0;
                      break L1;
                    } else {
                      stackIn_6_0 = 1;
                      break L1;
                    }
                  }
                  L2: {
                    var3_int = stackIn_6_0;
                    if (var3_int != 0) {
                      System.out.println("Before=" + param1 + ", after=" + param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  stackIn_10_0 = var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (param0 == param1) {
                    System.out.println("Using duplicate array reference in debug diffs!");
                    new Throwable().printStackTrace();
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (param1 == null) {
                      System.out.println("Before=" + param1 + ", after=" + param0);
                      stackIn_18_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (param1.length == param0.length) {
                        var3_int = param2 ? 1 : 0;
                        var4 = new StringBuilder();
                        discarded$0 = var4.append("{");
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= param0.length) {
                            L4: {
                              discarded$1 = var4.append("}");
                              if (var3_int == 0) {
                                break L4;
                              } else {
                                System.out.println(var4);
                                break L4;
                              }
                            }
                            stackIn_33_0 = var3_int;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            L5: {
                              if (var5 <= 0) {
                                break L5;
                              } else {
                                discarded$2 = var4.append(",");
                                break L5;
                              }
                            }
                            L6: {
                              if (param1[var5] == param0[var5]) {
                                discarded$3 = var4.append("_");
                                break L6;
                              } else {
                                discarded$4 = var4.append(param1[var5] + "->" + param0[var5]);
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
                        stackIn_21_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = decompiledCaughtException;
                stackIn_36_0 = (RuntimeException) (var3);

                stackIn_36_1 = new StringBuilder().append("ikb.C(");

                if (param0 == null) {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackIn_37_2 = "null";
                  break L7;
                } else {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackIn_37_2 = "{...}";
                  break L7;
                }
              }
              L8: {


                stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

                if (param1 == null) {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "null";
                  break L8;
                } else {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "{...}";
                  break L8;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_18_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_21_0 != 0;
                  } else {
                    return stackIn_33_0 != 0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ikb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 221) {
            int[] var2 = (int[]) null;
            ikb.a((int[]) null, (int[]) null, false);
        }
    }

    final static void e(byte param0) {
        if (param0 > -116) {
            return;
        }
        if (null != hg.field_b) {
            hg.field_b.b(-85);
        }
    }

    static {
        field_o = "Open";
    }
}
