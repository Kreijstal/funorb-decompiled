/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends gg {
    static String[] field_j;
    int field_o;
    static kb field_l;
    int[] field_p;
    int[] field_r;
    int field_h;
    nj[] field_k;
    int[] field_m;
    byte[][][] field_q;
    nj[] field_s;
    static ff field_i;
    private static long[] field_n;

    final static wg a(boolean param0, boolean param1) {
        wg var2 = new wg(true);
        var2.field_f = param1 ? true : false;
        if (param0) {
            Object var3 = null;
            di.a((java.applet.Applet) null, 18);
        }
        return var2;
    }

    public static void a(int param0) {
        field_i = null;
        field_l = null;
        field_n = null;
        if (param0 != 7) {
            field_i = null;
        }
        field_j = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf((int) (char)param1);
                var4 = "reload.ws";
                if ((var3 ^ -1) <= -1) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(kk.a(109, var5, param0), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    di() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_j = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_l = new kb();
        field_i = new ff(7, 0, 1, 1);
        field_n = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= -9) {
                field_n[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (1L == (var0 & 1L)) {
                  var0 = var0 >>> -1357534591 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
