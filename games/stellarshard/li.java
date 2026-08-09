/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_a;
    int field_c;
    static String field_b;
    int field_e;
    static int field_d;

    final static boolean a(String param0, byte param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            try {
              L1: {
                if (ej.field_k.startsWith("win")) {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param0.startsWith("https://")) {
                        stackIn_8_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  if (param1 == -5) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length() <= var3) {
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackIn_19_0 = 1;
                        decompiledRegionSelector0 = 4;
                        break L1;
                      } else {
                        if (-1 != var2.indexOf((int) param0.charAt(var3))) {
                          var3++;
                          continue L3;
                        } else {
                          stackIn_16_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L1;
                        }
                      }
                    }
                  } else {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_21_0 = 0;
              return stackIn_21_0 != 0;
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
            stackIn_24_0 = (RuntimeException) (var2_ref2);

            stackIn_24_1 = new StringBuilder().append("li.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_16_0 != 0;
              } else {
                return stackIn_19_0 != 0;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = -88 / ((37 - param0) / 52);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    li(int param0, int param1, int param2, int param3) {
        this.field_c = param3;
        this.field_e = param0;
    }

    static {
        field_a = "Members' Benefits";
        field_b = "Menu";
    }
}
