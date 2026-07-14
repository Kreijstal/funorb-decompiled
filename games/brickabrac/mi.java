/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static int[] field_b;
    static int field_d;
    static volatile int field_c;
    static String field_a;
    static String[] field_e;

    public static void a(int param0) {
        Object var2 = null;
        if (param0 >= -62) {
          var2 = null;
          pq discarded$2 = mi.a((mf) null, 51, -113);
          field_e = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String var5 = null;
            int var4 = 0;
            java.net.URL var6 = null;
            try {
                int var2_int = -55 / ((param0 - -30) / 60);
                var3 = param1.getDocumentBase().getFile();
                var5 = var3;
                var5 = var3;
                var4 = var3.indexOf('?');
                var5 = "reload.ws";
                if (0 <= var4) {
                    var5 = var5 + var3.substring(var4);
                }
                var6 = new java.net.URL(param1.getCodeBase(), var5);
                param1.getAppletContext().showDocument(hg.a(param1, var6, -1), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static pq a(mf param0, int param1, int param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = param0.b(param1, (byte) 113);
        var3 = var4;
        if (param2 == 8) {
          if (var4 == null) {
            return null;
          } else {
            return new pq(var4);
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{44, 45, 8};
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_a = "Cancel unrated rematch";
        field_c = 0;
    }
}
