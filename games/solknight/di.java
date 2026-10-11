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
          java.applet.Applet var3 = (java.applet.Applet) null;
          di.a((java.applet.Applet) null, 18);
        }
        return var2;
    }

    public static void a(int param0) {
        field_i = null;
        field_l = null;
        field_n = null;
        if (param0 != 7) {
          field_i = (ff) null;
        }
        field_j = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              var3 = var2.indexOf((int) (char)param1);
              var4Lifetime2 = "reload.ws";
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
              param0.getAppletContext().showDocument(kk.a(109, var5, param0), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("di.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
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
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_j = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_l = new kb();
        field_i = new ff(7, 0, 1, 1);
        field_n = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if (1L == (var0 & 1L)) {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_n[var2] = var0;
        }
    }
}
