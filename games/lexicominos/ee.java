/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ee {
    static int[] field_b;
    static String[] field_g;
    static ki field_c;
    static String field_e;
    static boolean field_d;
    static int field_a;
    static int[] field_f;

    final static vj a(String param0, String param1, boolean param2, sh param3, sh param4) {
        if (param2) {
            return null;
        }
        int var5 = param4.c(param0, (byte) -89);
        int var6 = param4.a(param1, -27964, var5);
        return eg.a(var6, var5, param4, param3, 96);
    }

    abstract int c(int param0);

    final static void b(int param0) {
        if (param0 != 95) {
            Object var2 = null;
            ee.a((byte) -44, (db) null);
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            mb.field_a = param0;
            try {
                var7 = param2.getParameter("cookieprefix");
                var5 = var7;
                var5 = var7;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var8 = var7 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                var5 = var8;
                if (param1 != -11971) {
                    Object var6 = null;
                    ee.a((byte) -4, (db) null);
                }
                if (param0.length() != 0) {
                    var5 = var8 + "; Expires=" + q.a(rf.c(0) - -94608000000L, (byte) 28) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                oa.a("document.cookie=\"" + var5 + "\"", param2, param1 ^ 23345);
            } catch (Throwable throwable) {
            }
            vg.a(false, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        int var1 = -86 % ((64 - param0) / 50);
        field_c = null;
        field_f = null;
        field_g = null;
        field_e = null;
        field_b = null;
    }

    final static void a(byte param0, db param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        if ((3 & (param1.field_u | param1.field_p | param1.field_s | param1.field_w)) == 0) {
          return;
        } else {
          L0: {
            if (param0 == -102) {
              break L0;
            } else {
              boolean discarded$1 = ee.a(31, '');
              break L0;
            }
          }
          var2 = (3 & param1.field_s) + param1.field_p;
          var3 = (param1.field_w & 3) + param1.field_u;
          var2 = var2 + (4 - (3 & var2));
          var3 = 4 - (var3 & 3) + var3;
          var4 = new int[var2 * var3];
          var5 = 0;
          var6 = (3 & param1.field_w) * var2 + (param1.field_s & 3);
          var7 = 0;
          L1: while (true) {
            if (var7 >= param1.field_u) {
              param1.field_p = var2;
              param1.field_u = var3;
              param1.field_y = var4;
              param1.field_s = param1.field_s & -4;
              param1.field_w = param1.field_w & -4;
              return;
            } else {
              var8 = 0;
              L2: while (true) {
                if (var8 >= param1.field_p) {
                  var6 = var6 + (-param1.field_p + var2);
                  var7++;
                  continue L1;
                } else {
                  var6++;
                  var5++;
                  var4[var6] = param1.field_y[var5];
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    abstract void a(boolean param0, java.awt.Component param1);

    abstract void a(int param0, java.awt.Component param1);

    final static String a(byte param0, String param1, String param2, sh param3) {
        if (!(param3.c(104))) {
            return param1;
        }
        if (param0 < 123) {
            Object var5 = null;
            ee.a((String) null, 36, (java.applet.Applet) null);
        }
        return param2 + " - " + param3.a(false) + "%";
    }

    final static boolean a(int param0, char param1) {
        int var2 = 0;
        if (Character.isISOControl(param1)) {
          return false;
        } else {
          if (jd.a((byte) -16, param1)) {
            return true;
          } else {
            L0: {
              if (param1 == 45) {
                break L0;
              } else {
                if (160 == param1) {
                  break L0;
                } else {
                  if (param1 == 32) {
                    break L0;
                  } else {
                    if (95 != param1) {
                      var2 = -12 % ((-54 - param0) / 63);
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_d = false;
        field_b = new int[8192];
        field_e = "Waiting for animations";
    }
}
