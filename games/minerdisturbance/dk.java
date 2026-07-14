/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dk {
    static ae field_c;
    static ia field_b;
    static byte[][][] field_d;
    static Random field_a;
    static int field_e;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            try {
                int var3 = 18 % ((37 - param1) / 58);
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(nn.a(110, param0, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        bi var1 = null;
        ld var2 = null;
        var1 = (bi) (Object) bb.field_a.b(param0 + -22211);
        if (var1 != null) {
          var2 = kj.field_a;
          int discarded$48 = var2.b((byte) 46);
          int discarded$49 = var2.b((byte) 19);
          int discarded$50 = var2.b((byte) 117);
          int discarded$51 = var2.b((byte) 49);
          if (param0 != 22288) {
            dk.b(-78);
            var1.b(param0 ^ 22322);
            return;
          } else {
            var1.b(param0 ^ 22322);
            return;
          }
        } else {
          si.a(param0 ^ -22307);
          return;
        }
    }

    public static void b(int param0) {
        if (param0 <= 69) {
          field_b = null;
          field_d = null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ae();
        field_e = 0;
        field_a = new Random();
    }
}
