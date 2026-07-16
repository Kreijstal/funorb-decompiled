/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends an {
    static int field_F;
    int field_G;
    static int field_I;
    private rl field_H;
    static vn field_E;
    int field_K;
    private int field_J;

    final int b(boolean param0) {
        if (param0) {
            Object var3 = null;
            String discarded$0 = hf.a(false, (java.applet.Applet) null, (String) null);
        }
        return ((hf) this).field_J;
    }

    final static String a(boolean param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_7_0 = null;
            var7 = ZombieDawn.field_J;
            try {
              L0: {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    hf.d((byte) -83);
                    break L1;
                  }
                }
                var3 = (String) qe.a(param1, "getcookies", -91);
                var4 = de.a(';', var3, -126);
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4.length) {
                    break L0;
                  } else {
                    L3: {
                      var6 = var4[var5].indexOf('=');
                      if (-1 < (var6 ^ -1)) {
                        break L3;
                      } else {
                        if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param2)) {
                          break L3;
                        } else {
                          stackOut_7_0 = var4[var5].substring(var6 - -1).trim();
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0;
                        }
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3_ref = decompiledCaughtException;
                break L4;
              }
            }
            return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ZombieDawn.field_J;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var8 = -((hf) this).field_K + (-param4 + param0);
            var9 = -(((hf) this).field_K * 2) + ((hf) this).field_i;
            if (var8 <= var9) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if ((var8 ^ -1) <= -1) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          L2: {
            var8 = var8 * ((hf) this).field_J / var9;
            if (1 != param5) {
              if (param5 != 2) {
                break L2;
              } else {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((hf) this).field_H.a(param1 + 11)) {
                    if (-1 >= (var11 ^ -1)) {
                      ((hf) this).field_H.b(var11, 1);
                      break L2;
                    } else {
                      return true;
                    }
                  } else {
                    var13 = -var8 + ((hf) this).field_H.a(var12, (byte) -116);
                    var13 = var13 * var13;
                    if (var13 < var10) {
                      var11 = var12;
                      var10 = var13;
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              ((hf) this).field_H.b(var8, (byte) -3);
              break L2;
            }
          }
          return true;
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        L0: {
          if (-1 < (param1 ^ -1)) {
            break L0;
          } else {
            if (((hf) this).field_H.a(12) > param1) {
              var3 = -38 % ((-25 - param0) / 57);
              return ((hf) this).field_H.a(param1, (byte) -110);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final static tj a(dj param0, String param1, String param2, dj param3, byte param4) {
        int var5 = param3.a(param1, (byte) 8);
        int var6 = 124 / ((param4 - 40) / 57);
        int var7 = param3.a(var5, param2, true);
        return sn.a(var5, 90, param3, param0, var7);
    }

    public static void d(byte param0) {
        if (param0 >= -8) {
            return;
        }
        field_E = null;
    }

    final int a(int param0) {
        if (param0 >= -73) {
            field_E = null;
        }
        return ((hf) this).field_H.a(12);
    }

    private hf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 0;
    }
}
