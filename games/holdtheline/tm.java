/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    private ah field_d;
    private hl field_a;
    static String[] field_b;
    static long field_c;

    final hl a(hl param0, byte param1) {
        hl var3 = null;
        L0: {
          if (param0 == null) {
            var3 = ((tm) this).field_d.field_e.field_h;
            break L0;
          } else {
            var3 = param0;
            break L0;
          }
        }
        if (var3 != ((tm) this).field_d.field_e) {
          ((tm) this).field_a = var3.field_h;
          if (param1 >= -100) {
            ((tm) this).field_a = null;
            return var3;
          } else {
            return var3;
          }
        } else {
          ((tm) this).field_a = null;
          return null;
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            if (param0 != -32312) {
                tm.b((byte) 13);
            }
            il.field_a = param1;
            try {
                var6 = param2.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (param1.length() == 0) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var7 + "; Expires=" + cd.a(param0 + 32381, bb.b(-1) - -94608000000L) + "; Max-Age=" + 94608000L;
                }
                eo.a(param2, -31645, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            bb.a(param2, (byte) 49);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final hl a(int param0) {
        hl var2 = null;
        var2 = ((tm) this).field_d.field_e.field_a;
        if (param0 == 8115) {
          if (var2 == ((tm) this).field_d.field_e) {
            ((tm) this).field_a = null;
            return null;
          } else {
            ((tm) this).field_a = var2.field_a;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return !fj.field_o.a(250) ? true : false;
    }

    final hl a(int param0, hl param1) {
        hl var3 = null;
        if (param0 == -10279) {
          L0: {
            if (param1 == null) {
              var3 = ((tm) this).field_d.field_e.field_a;
              break L0;
            } else {
              var3 = param1;
              break L0;
            }
          }
          if (var3 == ((tm) this).field_d.field_e) {
            ((tm) this).field_a = null;
            return null;
          } else {
            ((tm) this).field_a = var3.field_a;
            return var3;
          }
        } else {
          L1: {
            field_b = null;
            if (param1 == null) {
              var3 = ((tm) this).field_d.field_e.field_a;
              break L1;
            } else {
              var3 = param1;
              break L1;
            }
          }
          if (var3 == ((tm) this).field_d.field_e) {
            ((tm) this).field_a = null;
            return null;
          } else {
            ((tm) this).field_a = var3.field_a;
            return var3;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = 15 / ((param0 - 73) / 50);
        field_b = null;
    }

    final hl a(boolean param0) {
        hl var2 = null;
        var2 = ((tm) this).field_a;
        if (var2 == ((tm) this).field_d.field_e) {
          ((tm) this).field_a = null;
          return null;
        } else {
          if (param0) {
            return null;
          } else {
            ((tm) this).field_a = var2.field_a;
            return var2;
          }
        }
    }

    final hl a(byte param0) {
        hl var2 = null;
        Object var3 = null;
        if (param0 == -104) {
          var2 = ((tm) this).field_a;
          if (((tm) this).field_d.field_e == var2) {
            ((tm) this).field_a = null;
            return null;
          } else {
            ((tm) this).field_a = var2.field_h;
            return var2;
          }
        } else {
          var3 = null;
          hl discarded$2 = ((tm) this).a(-43, (hl) null);
          var2 = ((tm) this).field_a;
          if (((tm) this).field_d.field_e == var2) {
            ((tm) this).field_a = null;
            return null;
          } else {
            ((tm) this).field_a = var2.field_h;
            return var2;
          }
        }
    }

    tm(ah param0) {
        ((tm) this).field_d = param0;
    }

    final hl c(byte param0) {
        hl var2 = null;
        int var3 = 0;
        var3 = -72 % ((param0 - -65) / 49);
        var2 = ((tm) this).field_d.field_e.field_h;
        if (var2 == ((tm) this).field_d.field_e) {
          ((tm) this).field_a = null;
          return null;
        } else {
          ((tm) this).field_a = var2.field_h;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 20000000L;
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
