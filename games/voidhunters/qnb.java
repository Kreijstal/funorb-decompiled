/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qnb extends rqa {
    static asb field_o;

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = cm.a((byte) -87, param2);
              if (param1 != param0.indexOf(param2)) {
                break L1;
              } else {
                if (-1 != param0.indexOf(var3)) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param0.startsWith(param2)) {
                        break L3;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L3;
                        } else {
                          if (param0.endsWith(param2)) {
                            break L3;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackIn_12_0 = 0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackIn_12_0 = 1;
                    break L2;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("qnb.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_o = null;
    }

    qnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 <= -3) {
                break L1;
              } else {
                qnb.a(-64);
                break L1;
              }
            }
            if (!Character.isISOControl(param1)) {
              if (hoa.a(param1, false)) {
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = wjb.field_o;
                var2 = var6;
                var3 = 0;
                L2: while (true) {
                  if (var6.length <= var3) {
                    var2 = ufa.field_p;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2.length) {
                        stackIn_25_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param1 != var4) {
                          var3++;
                          continue L3;
                        } else {
                          stackIn_22_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if ((var4 ^ -1) == (param1 ^ -1)) {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2_ref), "qnb.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                return stackIn_25_0 != 0;
              }
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackIn_4_0 = new nc(frb.a(179, 123));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("qnb.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        nma discarded$0 = new nma();
    }
}
