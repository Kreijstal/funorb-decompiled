/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static long field_e;
    static int[] field_b;
    static int field_a;
    static String[] field_d;
    static String[] field_c;

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            al.field_n = param2;
            try {
                var3 = param0.getParameter("cookieprefix");
                var4 = param0.getParameter("cookiehost");
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (!(param1 != param2.length())) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                lj.a((byte) -110, param0, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            ld.a(16058, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        if (null != am.field_z) {
            am.field_z.c((byte) -45);
            am.field_z = null;
        }
        if (param0 > -123) {
            field_b = null;
        }
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = param1.length();
        var5 = param2.length();
        var6 = param3.length();
        if (-1 != (var5 ^ -1)) {
          L0: {
            var7 = var4;
            var8 = var6 - var5;
            if (var8 == 0) {
              break L0;
            } else {
              var9_int = 0;
              L1: while (true) {
                var9_int = param1.indexOf(param2, var9_int);
                if (var9_int < 0) {
                  break L0;
                } else {
                  var7 = var7 + var8;
                  var9_int = var9_int + var5;
                  continue L1;
                }
              }
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          L2: while (true) {
            var11 = param1.indexOf(param2, var10);
            if (var11 >= 0) {
              StringBuilder discarded$7 = var9.append(param1.substring(var10, var11));
              var10 = var5 + var11;
              StringBuilder discarded$8 = var9.append(param3);
              continue L2;
            } else {
              StringBuilder discarded$9 = var9.append(param1.substring(var10));
              if (param0 == 6609) {
                return var9.toString();
              } else {
                return null;
              }
            }
          }
        } else {
          throw new IllegalArgumentException("Key cannot have zero length");
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int var8 = 0;
        int var9 = 0;
        int var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        CharSequence var11 = (CharSequence) (Object) param2;
        int var3 = rt.a(var11, 0, param1);
        String[] var4 = new String[var3 - -1];
        int var5 = 0;
        int var6 = 0;
        int var7 = -23 / ((param0 - -52) / 48);
        for (var8 = 0; var8 < var3; var8++) {
            for (var9 = var6; param1 != param2.charAt(var9); var9++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var9);
            var6 = var9 - -1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    final static rd a(int param0, int param1, hd param2, int param3, int param4, int param5) {
        java.awt.Frame var8 = ug.a(param4, param1, -1, param2, param0, param5);
        java.awt.Frame var6 = var8;
        if (var8 == null) {
            return null;
        }
        rd var7 = new rd();
        var7.field_c = var8;
        java.awt.Component discarded$6 = var7.field_c.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, 0, param0, param5);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        if (param3 > -15) {
            return null;
        }
        return var7;
    }

    public static void b(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 <= 20) {
            Object var2 = null;
            String[] discarded$0 = dj.a(74, '{', (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_c = new String[]{"Misthalin", "Kharidian Desert", "Frozen Wastes", "Hallowvale Swamps", "Forinthry Barrens"};
        field_d = new String[]{null, null, null, null, "Riverbed", null, "Sea of Lava", null, null, null, null, null, null, null, null, null};
    }
}
