/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static String[] field_a;
    static wd field_b;

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = fleas.field_A ? 1 : 0;
        var2 = 33 / ((param0 - -55) / 38);
        if (param1 != null) {
          var3 = 0;
          var4 = param1.length();
          L0: while (true) {
            L1: {
              if (var3 >= var4) {
                break L1;
              } else {
                if (!r.a(param1.charAt(var3), 83)) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var4 <= var3) {
                  break L3;
                } else {
                  if (!r.a(param1.charAt(-1 + var4), 109)) {
                    break L3;
                  } else {
                    var4--;
                    continue L2;
                  }
                }
              }
              var5 = var4 - var3;
              if (-2 >= (var5 ^ -1)) {
                if (12 >= var5) {
                  var6 = new StringBuilder(var5);
                  var7 = var3;
                  L4: while (true) {
                    if (var4 <= var7) {
                      if (var6.length() != 0) {
                        return var6.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var8 = param1.charAt(var7);
                      if (sg.a((char) var8, (byte) -95)) {
                        var9 = kl.a((byte) -78, (char) var8);
                        if (0 != var9) {
                          StringBuilder discarded$1 = var6.append(var9);
                          var7++;
                          continue L4;
                        } else {
                          var7++;
                          continue L4;
                        }
                      } else {
                        var7++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static boolean b(int param0) {
        if (param0 != 15000) {
            field_a = null;
        }
        lj.field_e = true;
        ua.field_sb = 15000L + lj.a((byte) -68);
        return -12 == (bh.field_t ^ -1) ? true : false;
    }

    final static void a(String param0, long param1, int param2, java.applet.Applet param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param3.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (param2 == 0) {
                  break L0;
                } else {
                  field_a = null;
                  break L0;
                }
              }
              L1: {
                if (-1L >= (param1 ^ -1L)) {
                  var7 = var9 + "; Expires=" + wd.a((byte) -61, param1 * 1000L + lj.a((byte) -95)) + "; Max-Age=" + param1;
                  break L1;
                } else {
                  var7 = var9 + "; Discard;";
                  break L1;
                }
              }
              eb.a("document.cookie=\"" + var7 + "\"", -28924, param3);
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

    public static void a(int param0) {
        field_b = null;
        if (param0 != -9435) {
            field_b = null;
        }
        field_a = null;
    }

    final static bi a(byte param0, int[] param1, bi param2) {
        bi var3 = new bi(0, 0, 0);
        var3.field_e = param2.field_e;
        int var4 = 40 / ((param0 - 41) / 34);
        var3.field_l = param1;
        var3.field_d = param2.field_d;
        var3.field_c = param2.field_c;
        var3.field_g = param2.field_g;
        var3.field_h = param2.field_h;
        var3.field_a = param2.field_a;
        var3.field_k = param2.field_k;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new wd();
    }
}
