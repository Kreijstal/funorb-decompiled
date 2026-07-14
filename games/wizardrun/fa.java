/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static ai field_a;
    static o field_c;
    static o[] field_b;
    static String field_d;

    final static void a(long param0, String param1, boolean param2, String param3, java.applet.Applet param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (!param2) {
                L0: {
                  var8 = param4.getParameter("cookiehost");
                  var7 = var8;
                  var7 = var8;
                  var9 = param1 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                  var7 = var9;
                  var7 = var9;
                  if (param0 < 0L) {
                    var7 = var9 + "; Discard;";
                    break L0;
                  } else {
                    var7 = var9 + "; Expires=" + fc.a((byte) -23, d.a((byte) 90) + 1000L * param0) + "; Max-Age=" + param0;
                    break L0;
                  }
                }
                cl.a(param4, "document.cookie=\"" + var7 + "\"", (byte) -121);
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(byte param0, String param1, String param2, char param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = wizardrun.field_H;
        if (param0 > 42) {
          var4 = param2.length();
          var5 = param1.length();
          var6 = var4;
          var7 = -1 + var5;
          if (var7 != 0) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param2.indexOf((int) param3, var8_int);
              if ((var8_int ^ -1) <= -1) {
                var6 = var6 + var7;
                var8_int++;
                continue L0;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L1: while (true) {
                  var10 = param2.indexOf((int) param3, var9);
                  if (var10 < 0) {
                    StringBuilder discarded$12 = var13.append(param2.substring(var9));
                    return var13.toString();
                  } else {
                    StringBuilder discarded$13 = var13.append(param2.substring(var9, var10));
                    StringBuilder discarded$14 = var13.append(param1);
                    var9 = 1 + var10;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param2.indexOf((int) param3, var9);
              if (var10 < 0) {
                StringBuilder discarded$15 = var12.append(param2.substring(var9));
                return var12.toString();
              } else {
                StringBuilder discarded$16 = var12.append(param2.substring(var9, var10));
                StringBuilder discarded$17 = var12.append(param1);
                var9 = 1 + var10;
                continue L2;
              }
            }
          }
        } else {
          field_d = null;
          var4 = param2.length();
          var5 = param1.length();
          var6 = var4;
          var7 = -1 + var5;
          if (var7 != 0) {
            var8_int = 0;
            L3: while (true) {
              var8_int = param2.indexOf((int) param3, var8_int);
              if ((var8_int ^ -1) <= -1) {
                var6 = var6 + var7;
                var8_int++;
                continue L3;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L4: while (true) {
                  var10 = param2.indexOf((int) param3, var9);
                  if (var10 < 0) {
                    StringBuilder discarded$18 = var8.append(param2.substring(var9));
                    return var8.toString();
                  } else {
                    StringBuilder discarded$19 = var8.append(param2.substring(var9, var10));
                    StringBuilder discarded$20 = var8.append(param1);
                    var9 = 1 + var10;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L5: while (true) {
              var10 = param2.indexOf((int) param3, var9);
              if (var10 < 0) {
                StringBuilder discarded$21 = var8.append(param2.substring(var9));
                return var8.toString();
              } else {
                StringBuilder discarded$22 = var8.append(param2.substring(var9, var10));
                StringBuilder discarded$23 = var8.append(param1);
                var9 = 1 + var10;
                continue L5;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 != 52) {
            Object var2 = null;
            String discarded$0 = fa.a((byte) -111, (String) null, (String) null, '7');
        }
    }

    final static void a(String param0, int param1) {
        dh.field_c = param0;
        jc.a((byte) 42, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Falling off the bottom of the screen will";
    }
}
