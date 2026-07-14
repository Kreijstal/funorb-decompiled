/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wva implements dja {
    static String field_a;
    static int field_b;

    final static void b(byte param0) {
        if (di.field_l != null) {
            di.field_l.a(-32339, dpa.field_p);
        }
        int var1 = -93 % ((param0 - -11) / 55);
    }

    public static void a(int param0) {
        int var1 = 101 % ((-83 - param0) / 37);
        field_a = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_b = 111;
        }
        return (tv[]) (Object) new qqb[param1];
    }

    final static void b(int param0, int param1) {
        if (param1 != 22681) {
            wva.b((byte) 45);
        }
        faa var2 = dpa.field_p;
        var2.h(24335, param0);
        var2.c(0, 1);
        var2.c(0, 0);
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            if (param1 != 56) {
                field_a = null;
            }
            cta.field_p = param2;
            try {
                var3 = param0.getParameter("cookieprefix");
                var5 = var3;
                var5 = var3;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (-1 == (param2.length() ^ -1)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ia.a((byte) -115, param0, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            hg.a(-102, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final tv a(byte param0) {
        int var2 = -42 % ((-64 - param0) / 50);
        return (tv) (Object) new qqb();
    }

    final static int a(int param0, String[] param1, int param2, String param3, no param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = VoidHunters.field_G;
          var5 = param4.b(param3);
          if (param0 < var5) {
            break L0;
          } else {
            if ((param3.indexOf("<br>") ^ -1) != 0) {
              break L0;
            } else {
              param1[0] = (String) (Object) param1;
              return 1;
            }
          }
        }
        var6 = (-1 + (param0 + var5)) / param0;
        param0 = var5 / var6;
        var6 = 0;
        var7 = param2;
        var8 = param3.length();
        var9 = 0;
        L1: while (true) {
          if (var9 >= var8) {
            L2: {
              if (var8 <= var7) {
                break L2;
              } else {
                var6++;
                param1[var6] = param3.substring(var7, var8).trim();
                break L2;
              }
            }
            return var6;
          } else {
            L3: {
              L4: {
                var10 = param3.charAt(var9);
                if (32 == var10) {
                  break L4;
                } else {
                  if (var10 != 45) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var11 = param3.substring(var7, var9 - -1).trim();
              var12 = param4.b(var11);
              if (var12 >= param0) {
                var7 = var9 + 1;
                var6++;
                param1[var6] = var11;
                break L3;
              } else {
                break L3;
              }
            }
            if (62 == var10) {
              if (param3.regionMatches(var9 + -3, "<br>", 0, 4)) {
                var6++;
                param1[var6] = param3.substring(var7, var9 - 3).trim();
                var7 = var9 - -1;
                var9++;
                continue L1;
              } else {
                var9++;
                continue L1;
              }
            } else {
              var9++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Best";
        field_b = 0;
    }
}
