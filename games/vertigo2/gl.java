/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_c;
    static boolean field_o;
    int field_j;
    int field_h;
    int field_n;
    int field_d;
    static String field_a;
    byte[] field_e;
    int field_b;
    static mp field_i;
    static int field_l;
    static String[] field_p;
    byte[] field_g;
    static boolean field_k;
    static String field_m;
    int field_f;

    final static void a(int param0, long param1, java.applet.Applet param2, String param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param2.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                if (param0 == -11) {
                  break L0;
                } else {
                  field_o = false;
                  break L0;
                }
              }
              L1: {
                var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (-1L >= (param1 ^ -1L)) {
                  var7 = var9 + "; Expires=" + uh.a((byte) -66, param1 * 1000L + gk.a(param0 ^ -95)) + "; Max-Age=" + param1;
                  break L1;
                } else {
                  var7 = var9 + "; Discard;";
                  break L1;
                }
              }
              je.a(param2, "document.cookie=\"" + var7 + "\"", (byte) 124);
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

    final static void a(int param0) {
        kg.c((byte) 76);
        if (param0 != 26780) {
          field_o = false;
          nn.a(1, ia.field_G, r.field_f, re.field_k, kb.field_d[0].field_x, nl.field_k);
          return;
        } else {
          nn.a(1, ia.field_G, r.field_f, re.field_k, kb.field_d[0].field_x, nl.field_k);
          return;
        }
    }

    final static String a(int param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        String var14 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        var4 = param3 % 50;
        var4 = var4 * 2;
        var5 = param3 / 50;
        var6 = var5 / 60;
        var5 = var5 % 60;
        var7 = var6 / 60;
        if (param0 < -26) {
          L0: {
            var6 = var6 % 60;
            if (10 > var4) {
              var8 = "0" + var4;
              var9 = var8;
              var10 = var9;
              var9 = var8;
              break L0;
            } else {
              var8 = Integer.toString(var4);
              break L0;
            }
          }
          L1: {
            if (-11 >= (var5 ^ -1)) {
              var9 = Integer.toString(var5);
              var10 = var9;
              var10 = var9;
              break L1;
            } else {
              var9 = "0" + var5;
              break L1;
            }
          }
          L2: {
            if (10 > var6) {
              var10 = "0" + var6;
              break L2;
            } else {
              var10 = Integer.toString(var6);
              break L2;
            }
          }
          var11 = Integer.toString(var7);
          var12 = "";
          if (!param2) {
            if (-1 > (var7 ^ -1)) {
              L3: {
                var14 = var11 + ":" + var10 + ":" + var9;
                if (!param1) {
                  break L3;
                } else {
                  var12 = var14 + "." + var8;
                  break L3;
                }
              }
              return var12;
            } else {
              L4: {
                var12 = var10 + ":" + var9;
                if (!param1) {
                  break L4;
                } else {
                  var12 = var12 + "." + var8;
                  break L4;
                }
              }
              return var12;
            }
          } else {
            var12 = var11 + ":" + var10 + ":" + var9;
            L5: {
              if (!param1) {
                break L5;
              } else {
                var12 = var12 + "." + var8;
                break L5;
              }
            }
            return var12;
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_i = null;
          field_i = null;
          field_p = null;
          field_m = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_p = null;
          field_m = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
        field_a = "This entry doesn't match";
        field_m = "Day";
    }
}
