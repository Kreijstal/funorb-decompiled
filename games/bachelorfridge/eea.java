/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eea {
    static kv field_a;
    static String field_c;
    static boolean field_b;

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            if (param0 != 127) {
                Object var4 = null;
                eea.a((byte) 106, (String) null, (java.applet.Applet) null);
            }
            try {
                var3 = new java.net.URL(param2.getCodeBase(), param1);
                var3 = ow.a(var3, (byte) -104, param2);
                gja.a(true, param2, var3.toString(), param0 ^ 89);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -79) {
            return;
        }
        field_c = null;
    }

    final static boolean a(String param0, long param1, int param2) {
        nea var4 = null;
        int var5 = 0;
        var5 = 39 / ((-47 - param2) / 49);
        var4 = bna.b(-116, param0);
        if (var4 != null) {
          if (var4.field_vb == null) {
            if (null != pw.field_w) {
              if (uka.a(param1, 28791) != null) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (null != pw.field_w) {
            if (uka.a(param1, 28791) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Only show lobby chat from my friends";
        field_b = false;
    }
}
