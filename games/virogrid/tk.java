/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class tk {
    static ml[] field_c;
    static rm[] field_d;
    static qh field_b;
    static String field_a;

    final static boolean a(int param0, hg param1) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 1) {
          L0: {
            var3 = null;
            boolean discarded$6 = tk.a(34, (hg) null);
            if (1 != param1.c((byte) -78, 1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (1 != param1.c((byte) -78, 1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          boolean discarded$2 = tk.a(89, (hg) null);
          field_b = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static java.net.URL a(java.net.URL param0, String param1, String param2, int param3, byte param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            int var8 = 0;
            Exception var9 = null;
            int var10 = 0;
            java.net.URL stackIn_37_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_36_0 = null;
            var10 = Virogrid.field_F ? 1 : 0;
            var5 = param0.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((var7_int ^ -1) > -1) {
                    break L1;
                  } else {
                    if (0 <= param3) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                  break L2;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 <= var7_int) {
                    var6 = var7_int;
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L3;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (-1 < (var7_int ^ -1)) {
                    break L3;
                  } else {
                    if (param1 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                var7_int = var5.indexOf('/', var6 - -1);
                if (var7_int < 0) {
                  break L4;
                } else {
                  if (param2 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                }
              }
              L6: {
                var8 = -46 % ((-83 - param4) / 41);
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if ((param3 ^ -1) >= -1) {
                  break L6;
                } else {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                  break L6;
                }
              }
              L7: {
                if (param1 == null) {
                  if (param2 == null) {
                    break L7;
                  } else {
                    if (0 >= param2.length()) {
                      break L7;
                    } else {
                      StringBuilder discarded$12 = var7.append("/s=");
                      StringBuilder discarded$13 = var7.append(param2);
                      break L7;
                    }
                  }
                } else {
                  if (param2 == null) {
                    break L7;
                  } else {
                    if (0 >= param2.length()) {
                      break L7;
                    } else {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param2);
                      break L7;
                    }
                  }
                }
              }
              L8: {
                if (var5.length() <= var6) {
                  StringBuilder discarded$16 = var7.append(47);
                  break L8;
                } else {
                  StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                  break L8;
                }
              }
              try {
                L9: {
                  stackOut_36_0 = new java.net.URL(param0, var7.toString());
                  stackIn_37_0 = stackOut_36_0;
                  break L9;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var9 = (Exception) (Object) decompiledCaughtException;
                var9.printStackTrace();
                return param0;
              }
              return stackIn_37_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Game options";
    }
}
