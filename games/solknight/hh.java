/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends pj {
    int field_I;
    static char[] field_N;
    private int field_K;
    static String field_J;
    private of field_M;
    int field_L;

    final int b(int param0, int param1) {
        int var3 = 0;
        var3 = 0 / ((-49 - param1) / 44);
        if ((param0 ^ -1) <= -1) {
          if (param0 >= ((hh) this).field_M.b(100)) {
            return -1;
          } else {
            return ((hh) this).field_M.a((byte) 43, param0);
          }
        } else {
          return -1;
        }
    }

    public static void a(byte param0) {
        if (param0 < 32) {
            return;
        }
        field_N = null;
        field_J = null;
    }

    final static ce a(String param0, boolean param1) {
        if (param1) {
            return null;
        }
        return new ce(param0);
    }

    final int a(int param0) {
        if (param0 != -3) {
            return 14;
        }
        return ((hh) this).field_K;
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = SolKnight.field_L ? 1 : 0;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var8 = param3 + -param1 - ((hh) this).field_I;
            var9 = -(2 * ((hh) this).field_I) + ((hh) this).field_t;
            if ((var9 ^ -1) > (var8 ^ -1)) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 < (var8 ^ -1)) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          var8 = var8 * ((hh) this).field_K / var9;
          if (1 == param0) {
            ((hh) this).field_M.c(-120, var8);
            return true;
          } else {
            if (-3 == (param0 ^ -1)) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if ((((hh) this).field_M.b(120) ^ -1) >= (var12 ^ -1)) {
                  if (var11 >= 0) {
                    ((hh) this).field_M.a(true, var11);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  L3: {
                    var13 = ((hh) this).field_M.a((byte) 43, var12) + -var8;
                    var13 = var13 * var13;
                    if ((var10 ^ -1) < (var13 ^ -1)) {
                      var10 = var13;
                      var11 = var12;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var12++;
                  continue L2;
                }
              }
            } else {
              return true;
            }
          }
        }
    }

    final int i(int param0) {
        int var2 = 4 / ((19 - param0) / 61);
        return ((hh) this).field_M.b(110);
    }

    final static String a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            String stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            String stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            String stackIn_11_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            String stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            String stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            String stackOut_10_0 = null;
            var8 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  var9 = param1.getParameter("cookieprefix");
                  var3 = var9 + "settings";
                  if (!param0) {
                    break L1;
                  } else {
                    hh.a((byte) -44);
                    break L1;
                  }
                }
                L2: {
                  var4 = (String) fd.a(param1, "getcookies", (byte) 116);
                  stackOut_3_0 = (String) var4;
                  stackOut_3_1 = 59;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (param0) {
                    stackOut_5_0 = (String) (Object) stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L2;
                  } else {
                    stackOut_4_0 = (String) (Object) stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L2;
                  }
                }
                var5 = b.a(stackIn_6_0, (char) stackIn_6_1, stackIn_6_2 != 0);
                var6 = 0;
                L3: while (true) {
                  if (var5.length <= var6) {
                    break L0;
                  } else {
                    L4: {
                      var7 = var5[var6].indexOf('=');
                      if (0 > var7) {
                        break L4;
                      } else {
                        if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                          break L4;
                        } else {
                          stackOut_10_0 = var5[var6].substring(var7 - -1).trim();
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0;
                        }
                      }
                    }
                    var6++;
                    continue L3;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var2 = decompiledCaughtException;
                break L5;
              }
            }
            if (td.field_i != null) {
              return td.field_i;
            } else {
              return param1.getParameter("settings");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private hh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_J = "Login: ";
    }
}
