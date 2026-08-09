/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static String field_d;
    static String field_e;
    static String field_a;
    static int field_c;
    static int[] field_b;

    final static vn[] a(int param0, int param1, int param2, int param3, int param4) {
        vn[] var5;
        vn[] var6;
        var6 = new vn[9];
        var5 = var6;
        vn dupTemp$2 = qk.c(param4, (byte) -71, param0);
        var6[6] = dupTemp$2;
        var5[3] = dupTemp$2;
        var5[2] = dupTemp$2;
        var5[1] = dupTemp$2;
        var5[0] = dupTemp$2;
        vn dupTemp$3 = qk.c(param3, (byte) -71, param0);
        var6[8] = dupTemp$3;
        var5[7] = dupTemp$3;
        var5[5] = dupTemp$3;
        if (param2 == 12692) {
          if (-1 != (param1 ^ -1)) {
            var6[4] = qk.c(param1, (byte) -71, 64);
            return var5;
          } else {
            return var5;
          }
        } else {
          field_a = (String) null;
          if (-1 == (param1 ^ -1)) {
            return var5;
          } else {
            var6[4] = qk.c(param1, (byte) -71, 64);
            return var5;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 <= 57) {
            field_d = (String) null;
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
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
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            try {
              L1: {
                if (!ec.field_n.startsWith("win")) {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param0.startsWith("https://")) {
                        stackIn_9_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    if (param0.length() <= var3) {
                      L4: {
                        if (param1 == 27994) {
                          break L4;
                        } else {
                          field_a = (String) null;
                          break L4;
                        }
                      }
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_21_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                        stackIn_16_0 = 0;
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
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2_ref2);

            stackIn_26_1 = new StringBuilder().append("kj.C(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    static {
        field_e = "Screen Size";
        field_d = "Orb coins: ";
        field_a = "Connection restored.";
        field_b = new int[8192];
    }
}
