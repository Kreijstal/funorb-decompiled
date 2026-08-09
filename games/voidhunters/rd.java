/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends rqa {
    static ij field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != -1) {
            field_o = (ij) null;
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
              stackIn_4_0 = new nc(frb.a(114, 84));
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

            stackIn_7_1 = new StringBuilder().append("rd.A(");

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

    rd(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            try {
              L1: {
                if (!eab.field_s.startsWith("win")) {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param0.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_8_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    if (var3 >= param0.length()) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      if (param1 > 28) {
                        stackIn_21_0 = 1;
                        decompiledRegionSelector0 = 4;
                        break L1;
                      } else {
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L1;
                      }
                    } else {
                      if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                        stackIn_15_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        var3++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_23_0 = 0;
              return stackIn_23_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2_ref2);

            stackIn_26_1 = new StringBuilder().append("rd.B(");

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
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_21_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_o = null;
    }
}
