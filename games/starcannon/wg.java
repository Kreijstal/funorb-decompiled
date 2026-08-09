/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static int field_e;
    static int field_c;
    static String field_a;
    static o field_d;
    static int field_b;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 > -20) {
            wg.a((byte) -100);
        }
    }

    final static int a(boolean param0, int param1) {
        int var2;
        if (0 == param1) {
          return 0;
        } else {
          if (-1 > (param1 ^ -1)) {
            L0: {
              var2 = 1;
              if (param1 > 65535) {
                param1 = param1 >> 16;
                var2 += 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param1 > 255) {
                param1 = param1 >> 8;
                var2 += 8;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (15 >= param1) {
                break L2;
              } else {
                var2 += 4;
                param1 = param1 >> 4;
                break L2;
              }
            }
            L3: {
              if ((param1 ^ -1) < -4) {
                param1 = param1 >> 2;
                var2 += 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 > 1) {
                param1 = param1 >> 1;
                var2++;
                break L4;
              } else {
                break L4;
              }
            }
            return var2;
          } else {
            if (param0) {
              L5: {
                wg.a(false, -64);
                var2 = 2;
                if (-65536 <= param1) {
                  break L5;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L5;
                }
              }
              L6: {
                if (255 >= (param1 ^ -1)) {
                  break L6;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L6;
                }
              }
              L7: {
                if (15 < (param1 ^ -1)) {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if ((param1 ^ -1) > 3) {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param1 >= -2) {
                  break L9;
                } else {
                  param1 = param1 >> 1;
                  var2++;
                  break L9;
                }
              }
              return var2;
            } else {
              L10: {
                var2 = 2;
                if (-65536 <= param1) {
                  break L10;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L10;
                }
              }
              L11: {
                if (255 >= (param1 ^ -1)) {
                  break L11;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L11;
                }
              }
              L12: {
                if (15 < (param1 ^ -1)) {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if ((param1 ^ -1) > 3) {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (param1 >= -2) {
                  break L14;
                } else {
                  param1 = param1 >> 1;
                  var2++;
                  break L14;
                }
              }
              return var2;
            }
          }
        }
    }

    final static void a(byte param0, String param1, java.applet.Applet param2, String param3, long param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = param2.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      var9 = param3 + "=" + param1 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (0L > param4) {
                        var7 = var9 + "; Discard;";
                        break L2;
                      } else {
                        var7 = var9 + "; Expires=" + ge.a((byte) -36, dd.b(84) + 1000L * param4) + "; Max-Age=" + param4;
                        break L2;
                      }
                    }
                    mb.a("document.cookie=\"" + var7 + "\"", param2, 790);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var6 = decompiledCaughtException;
                    break L3;
                  }
                }
                if (param0 >= 82) {
                  break L0;
                } else {
                  wg.a(true, -125);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("wg.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = 0;
        field_d = new o(11, 0, 1, 2);
    }
}
