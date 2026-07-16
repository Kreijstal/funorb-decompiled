/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static hm field_e;
    static int field_h;
    static String field_f;
    static String field_d;
    static String field_g;
    static boolean field_c;
    static ia field_j;
    static int[] field_i;
    static String field_b;
    static di field_a;

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        if (param0 != 0) {
          return;
        } else {
          field_g = null;
          field_j = null;
          field_d = null;
          field_b = null;
          field_i = null;
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            Object var5 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (!sj.field_w.startsWith("win")) {
                break L0;
              } else {
                if (!ll.a(param2, param0 ^ -10570)) {
                  break L0;
                } else {
                  return;
                }
              }
            }
            try {
              L1: {
                param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                if (param0 == -10553) {
                  break L1;
                } else {
                  var5 = null;
                  String[] discarded$2 = jc.a(113, (String) null, 'h');
                  return;
                }
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                tc.a((Throwable) null, "MGR1: " + param2, -8555);
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        Object var3 = null;
        param1.setFocusTraversalKeysEnabled(false);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) wn.field_a);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) wn.field_a);
        if (param0 == 0) {
          return;
        } else {
          var3 = null;
          jc.a(-84, (java.applet.Applet) null, (String) null, false);
          return;
        }
    }

    final static String[] a(int param0, String param1, char param2) {
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        CharSequence var10 = null;
        var10 = (CharSequence) (Object) param1;
        var3 = pl.a(var10, -115, param2);
        var4 = new String[var3 + 1];
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (param0 == 30634) {
          L0: while (true) {
            if (var3 <= var7) {
              var4[var3] = param1.substring(var6);
              return var4;
            } else {
              var8 = var6;
              L1: while (true) {
                if (param2 == param1.charAt(var8)) {
                  int incrementValue$2 = var5;
                  var5++;
                  var4[incrementValue$2] = param1.substring(var6, var8);
                  var6 = 1 + var8;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } else {
          var9 = null;
          jc.a(111, (java.applet.Applet) null, (String) null, false);
          L2: while (true) {
            if (var3 <= var7) {
              var4[var3] = param1.substring(var6);
              return var4;
            } else {
              var8 = var6;
              L3: while (true) {
                if (param2 == param1.charAt(var8)) {
                  int incrementValue$3 = var5;
                  var5++;
                  var4[incrementValue$3] = param1.substring(var6, var8);
                  var6 = 1 + var8;
                  var7++;
                  continue L2;
                } else {
                  var8++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Accept";
        field_f = "ON";
        field_b = "You are invited to <%0>'s game.";
        field_d = "Please log in as a subscribing member to access this feature.";
    }
}
