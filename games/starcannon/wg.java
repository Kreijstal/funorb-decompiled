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
        int var2 = 0;
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
                int discarded$1 = wg.a(false, -64);
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
                if (255 >= param1) {
                  break L6;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L6;
                }
              }
              L7: {
                if (15 > param1) {
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
                if (255 >= param1) {
                  break L11;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L11;
                }
              }
              L12: {
                if (15 > param1) {
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
            Throwable throwable = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var8 = param2.getParameter("cookiehost");
                            var7 = var8;
                            var7 = var8;
                            var9 = param3 + "=" + param1 + "; version=1; path=/; domain=" + var8;
                            var7 = var9;
                            var7 = var9;
                            if (0L > param4) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var7 = var9 + "; Expires=" + ge.a((byte) -36, dd.b(84) + 1000L * param4) + "; Max-Age=" + param4;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7 = var9 + "; Discard;";
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            mb.a("document.cookie=\"" + var7 + "\"", param2, 790);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        throwable = caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (param0 < 82) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        int discarded$2 = wg.a(true, -125);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
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
        field_b = 0;
        field_d = new o(11, 0, 1, 2);
    }
}
