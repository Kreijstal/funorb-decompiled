/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static int field_b;
    static String field_a;

    final static void a(int param0, boolean param1) {
        if (param1) {
            field_b = 93;
        }
        de.a((byte) 92);
    }

    public static void a(byte param0) {
        if (param0 >= -43) {
            String var2 = (String) null;
            ic.a((String) null, true);
        }
        field_a = null;
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        L0: {
          if (ua.field_d != null) {
            var1 = ua.field_d;
            synchronized (var1) {
              L1: {
                ua.field_d = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            ic.a((byte) -120);
            break L2;
          }
        }
    }

    final static w a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        w stackIn_4_0 = null;
        w stackIn_7_0 = null;
        w stackIn_15_0 = null;
        w stackIn_18_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 == (var2_int ^ -1)) {
              stackIn_4_0 = nh.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (63 >= var2_int) {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var2_int) {
                    if (param1) {
                      field_a = (String) null;
                      stackIn_23_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param0.charAt(var3);
                      if (var4 != 45) {
                        if (0 != (ml.field_l.indexOf(var4) ^ -1)) {
                          break L2;
                        } else {
                          stackIn_18_0 = td.field_d;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L3: {
                          if (0 == var3) {
                            break L3;
                          } else {
                            if (var3 == -1 + var2_int) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_15_0 = td.field_d;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = ei.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("ic.D(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return (w) ((Object) stackIn_23_0);
              }
            }
          }
        }
    }

    static {
        field_b = 0;
        field_a = "End Game";
    }
}
