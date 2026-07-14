/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    private int field_g;
    static String field_b;
    static int field_a;
    private br field_f;
    private int field_e;
    private br[] field_d;
    private br field_h;
    static int field_c;

    final br b(int param0) {
        int var3 = 0;
        Object var4 = null;
        br var5 = null;
        br var6 = null;
        br var9 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if ((((f) this).field_e ^ -1) < -1) {
          if (((f) this).field_h != ((f) this).field_d[((f) this).field_e + -1]) {
            var9 = ((f) this).field_h;
            ((f) this).field_h = var9.field_d;
            return var9;
          } else {
            L0: while (true) {
              if (((f) this).field_g <= ((f) this).field_e) {
                if (param0 > -105) {
                  var4 = null;
                  ((f) this).a(false, -86L, (br) null);
                  return null;
                } else {
                  return null;
                }
              } else {
                ((f) this).field_e = ((f) this).field_e + 1;
                var6 = ((f) this).field_d[((f) this).field_e].field_d;
                if (((f) this).field_d[-1 + ((f) this).field_e] != var6) {
                  ((f) this).field_h = var6.field_d;
                  return var6;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (((f) this).field_g <= ((f) this).field_e) {
              if (param0 > -105) {
                var4 = null;
                ((f) this).a(false, -86L, (br) null);
                return null;
              } else {
                return null;
              }
            } else {
              ((f) this).field_e = ((f) this).field_e + 1;
              var5 = ((f) this).field_d[((f) this).field_e].field_d;
              if (((f) this).field_d[-1 + ((f) this).field_e] != var5) {
                ((f) this).field_h = var5.field_d;
                return var5;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < -31) {
            return;
        }
        f.a((byte) -51);
    }

    final br a(int param0, long param1) {
        br var4 = null;
        br var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = ((f) this).field_d[(int)(param1 & (long)(((f) this).field_g - 1))];
        if (param0 == 0) {
          ((f) this).field_f = var4.field_d;
          L0: while (true) {
            if (((f) this).field_f == var4) {
              ((f) this).field_f = null;
              return null;
            } else {
              if (param1 == ((f) this).field_f.field_e) {
                var5 = ((f) this).field_f;
                ((f) this).field_f = ((f) this).field_f.field_d;
                return var5;
              } else {
                ((f) this).field_f = ((f) this).field_f.field_d;
                continue L0;
              }
            }
          }
        } else {
          ((f) this).field_g = -49;
          ((f) this).field_f = var4.field_d;
          L1: while (true) {
            if (((f) this).field_f == var4) {
              ((f) this).field_f = null;
              return null;
            } else {
              if (param1 == ((f) this).field_f.field_e) {
                var5 = ((f) this).field_f;
                ((f) this).field_f = ((f) this).field_f.field_d;
                return var5;
              } else {
                ((f) this).field_f = ((f) this).field_f.field_d;
                continue L1;
              }
            }
          }
        }
    }

    final void a(boolean param0, long param1, br param2) {
        br var5 = null;
        if (!(param2.field_b == null)) {
            param2.a(true);
        }
        if (!param0) {
            ((f) this).field_g = 88;
            var5 = ((f) this).field_d[(int)(param1 & (long)(((f) this).field_g - 1))];
            param2.field_d = var5;
            param2.field_b = var5.field_b;
            param2.field_b.field_d = param2;
            param2.field_e = param1;
            param2.field_d.field_b = param2;
            return;
        }
        var5 = ((f) this).field_d[(int)(param1 & (long)(((f) this).field_g - 1))];
        param2.field_d = var5;
        param2.field_b = var5.field_b;
        param2.field_b.field_d = param2;
        param2.field_e = param1;
        param2.field_d.field_b = param2;
    }

    final br a(int param0) {
        ((f) this).field_e = param0;
        return ((f) this).b(-119);
    }

    final static void a(java.applet.Applet param0, boolean param1, byte param2, String param3) {
        try {
            if (go.field_l.startsWith("win")) {
                if (va.a(9805, param3)) {
                    return;
                }
            }
            try {
                param0.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                int var4_int = 3 / ((param2 - 39) / 61);
            } catch (java.net.MalformedURLException malformedURLException) {
                bd.a("MGR1: " + param3, (Throwable) null, false);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    f(int param0) {
        int var2 = 0;
        br var3 = null;
        ((f) this).field_e = 0;
        ((f) this).field_g = param0;
        ((f) this).field_d = new br[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new br();
            ((f) this).field_d[var2] = new br();
            var3.field_d = var3;
            var3.field_b = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_c = 0;
    }
}
