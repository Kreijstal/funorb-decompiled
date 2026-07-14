/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static ul field_c;
    static int[] field_a;
    static wl field_b;
    static String field_d;

    final static boolean b(int param0) {
        if (param0 > -111) {
            return false;
        }
        return nc.field_q;
    }

    public static void d(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static dm a(String param0, int param1) {
        if (param1 > -82) {
            Object var3 = null;
            ri.a((String) null, (java.applet.Applet) null, 26);
        }
        if (gf.field_a.a((byte) -72)) {
            if (!param0.equals((Object) (Object) gf.field_a.a(true))) {
                gf.field_a = sf.a(param0, 16);
            }
        }
        return gf.field_a;
    }

    final static boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 6995) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((uj.field_d ^ -1) > -11) {
              break L2;
            } else {
              if (13 > nj.field_Q) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            dn.field_Ub = param0;
            try {
                var7 = param1.getParameter("cookieprefix");
                var5 = var7;
                var5 = var7;
                if (param2 < 123) {
                    Object var6 = null;
                    ri.a((String) null, (java.applet.Applet) null, 49);
                }
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var8 = var7 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                var5 = var8;
                if (0 == param0.length()) {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var8 + "; Expires=" + mj.b(94608000000L + mm.a(-102), 0) + "; Max-Age=" + 94608000L;
                }
                hn.a(param1, 27781, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            oh.a(param1, (byte) 117);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 16913) {
            boolean discarded$0 = ri.c(-124);
        }
        int var3 = Math.max(param0, (param1 & 16731221) >> -1245369328);
        int var4 = Math.max(param0, 255 & param1 >> 284019208);
        int var5 = Math.max(param0, 255 & param1);
        param1 = var5 | (var4 << 1023829480 | (param1 & -16777216 | var3 << 2138871344));
        return param1;
    }

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var5 = SteelSentinels.field_G;
        int var2 = param1.length();
        char[] var3 = new char[var2];
        if (param0 != -1) {
            field_d = null;
        }
        for (var4 = 0; var4 < var2; var4++) {
            var3[-1 + var2 + -var4] = param1.charAt(var4);
        }
        return new String(var3);
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 16731221) {
          L0: {
            L1: {
              if (10 > uj.field_d) {
                break L1;
              } else {
                if (mg.field_ac) {
                  break L1;
                } else {
                  if (ud.e(-111)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final static cc a(long param0, boolean param1) {
        if (param1) {
            return null;
        }
        return (cc) (Object) t.field_c.a(param0, (byte) 96);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{2, 20, 21, 6, 37, 45, 5, 13};
        field_c = new ul();
        field_d = "Spectating";
    }
}
