/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static ji field_e;
    static ae field_c;
    static rj field_d;
    static boolean field_a;
    static int field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 != -44) {
            Object var2 = null;
            ga.a((java.applet.Applet) null, (byte) -46);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = wizardrun.field_H;
        if (-3 >= param1) {
          if (-37 >= param1) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            var8 = -22 / ((-39 - param2) / 59);
            var9 = 0;
            L0: while (true) {
              if (var7 > var9) {
                L1: {
                  var10 = param0.charAt(var9);
                  if (var9 != 0) {
                    break L1;
                  } else {
                    if (var10 != 45) {
                      if (var10 != 43) {
                        break L1;
                      } else {
                        if (!param3) {
                          break L1;
                        } else {
                          var9++;
                          continue L0;
                        }
                      }
                    } else {
                      var4 = 1;
                      var9++;
                      var9++;
                      continue L0;
                    }
                  }
                }
                L2: {
                  L3: {
                    if (var10 < 48) {
                      break L3;
                    } else {
                      if (var10 > 57) {
                        break L3;
                      } else {
                        var10 -= 48;
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (var10 < 65) {
                      break L4;
                    } else {
                      if (var10 <= 90) {
                        var10 -= 55;
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var10 < 97) {
                      break L5;
                    } else {
                      if (var10 <= 122) {
                        var10 -= 87;
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  return false;
                }
                if (var10 < param1) {
                  L6: {
                    if (var4 != 0) {
                      var10 = -var10;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var11 = var10 + var6 * param1;
                  if (var6 == var11 / param1) {
                    var5 = 1;
                    var6 = var11;
                    var9++;
                    continue L0;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return var5 != 0;
              }
            }
          } else {
            throw new IllegalArgumentException("" + param1);
          }
        } else {
          throw new IllegalArgumentException("" + param1);
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                if (param1 > -28) {
                    ga.a(40);
                }
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if ((var3 ^ -1) <= -1) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(jl.a(-122, var5, param0), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
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
        field_c = new ae();
        field_a = false;
        field_d = new rj(1);
    }
}
