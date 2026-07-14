/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lc {
    private int field_a;
    private Hashtable field_c;
    static bs field_b;

    final static void a(int param0, ml param1) {
        param1.a(1, 9, new ml(16));
        param1.a(1, 14, new ml(13));
        param1.a(1, 4, new ml(13));
        param1.a(1, 0, new ml(13));
        param1.a(1, 18, new ml(13));
        ml var4 = new ml(39);
        ml var5 = new ml(30);
        var5.a(1, 0, new ml(24));
        var4.a(param0 ^ 39, 3, var5);
        var4.a(param0 ^ 39, 1, new ml(13));
        param1.a(1, 3, var4);
        ml var6 = new ml(param0);
        ml var7 = new ml(30);
        var7.a(1, 1, new ml(24));
        var6.a(param0 ^ 39, 2, var7);
        var6.a(1, 4, new ml(13));
        param1.a(1, 15, var6);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 95) {
            Object var2 = null;
            lc.a(-56, (ml) null);
        }
    }

    public final String toString() {
        String var1 = "Release mode=" + jqa.field_o[((lc) this).field_a] + "\n";
        var1 = var1 + ((lc) this).field_c.toString();
        return var1;
    }

    final void a(String param0, int param1, boolean param2) {
        Number var4 = null;
        param0 = param0.toLowerCase();
        if (param2) {
          L0: {
            String discarded$3 = ((lc) this).toString();
            param0 = param0.replace(' ', '_');
            var4 = (Number) ((lc) this).field_c.get((Object) (Object) param0);
            if (var4 == null) {
              break L0;
            } else {
              param1 = param1 + var4.intValue();
              break L0;
            }
          }
          Object discarded$4 = ((lc) this).field_c.put((Object) (Object) param0, (Object) (Object) new Integer(param1));
          return;
        } else {
          L1: {
            param0 = param0.replace(' ', '_');
            var4 = (Number) ((lc) this).field_c.get((Object) (Object) param0);
            if (var4 == null) {
              break L1;
            } else {
              param1 = param1 + var4.intValue();
              break L1;
            }
          }
          Object discarded$5 = ((lc) this).field_c.put((Object) (Object) param0, (Object) (Object) new Integer(param1));
          return;
        }
    }

    private lc() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
            java.net.URL var3 = null;
            if (param0 != 86) {
                Object var4 = null;
                lc.a(-123, (ml) null);
            }
            try {
                var3 = new java.net.URL(param1.getCodeBase(), param2);
                var3 = ne.a(var3, (byte) -118, param1);
                qp.a(true, 0, param1, var3.toString());
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
