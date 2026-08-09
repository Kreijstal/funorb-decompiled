/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static um field_c;
    static String field_b;
    static w field_a;

    final static void a(int param0, ui param1, boolean param2) {
        Object var3 = null;
        Throwable var4 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param2) {
              break L0;
            } else {
              field_c = (um) null;
              break L0;
            }
          }
          var3 = km.field_z;
          synchronized (var3) {
            L1: {
              L2: {
                if (null != wj.field_Ob) {
                  sh.field_a.c(wj.field_Ob);
                  wj.field_Ob = null;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param1 != null) {
                  wj.field_Ob = new ia(param1);
                  wj.field_Ob.a(a.field_g * 50 / 128);
                  wj.field_Ob.c(param0);
                  sh.field_a.a(wj.field_Ob);
                  break L3;
                } else {
                  break L3;
                }
              }
              km.field_z.a();
              rc.field_d = param1;
              break L1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3;

            stackIn_16_1 = new StringBuilder().append("nn.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = stackIn_16_0;
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = stackIn_16_0;
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 14925) {
            nn.a(-43);
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = oa.a(param1, -1);
              if (!param0) {
                break L1;
              } else {
                field_c = (um) null;
                break L1;
              }
            }
            L2: {
              if (param2.indexOf(param1) != -1) {
                break L2;
              } else {
                if (-1 != param2.indexOf(var3)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (param2.startsWith(param1)) {
                        break L4;
                      } else {
                        if (param2.startsWith(var3)) {
                          break L4;
                        } else {
                          if (param2.endsWith(param1)) {
                            break L4;
                          } else {
                            if (!param2.endsWith(var3)) {
                              stackIn_14_0 = 0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackIn_14_0 = 1;
                    break L3;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("nn.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    static {
        field_c = new um();
        field_b = "Please remove <%0> from your friend list first.";
    }
}
