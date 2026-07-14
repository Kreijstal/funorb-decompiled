/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static gh field_b;
    static boolean[] field_c;
    static int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        int var1 = 25 / ((param0 - 33) / 55);
        field_c = null;
        field_b = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (param0) {
            field_a = 117;
            pb.field_k.a(param1, (byte) -112);
            return;
        }
        pb.field_k.a(param1, (byte) -112);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                var2 = param1.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (param0 <= var3) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(ag.a(param1, var5, false), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
