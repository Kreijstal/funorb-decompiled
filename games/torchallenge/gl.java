/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class gl {
    static int[][][][] field_l;
    int field_d;
    static aa field_e;
    static int field_k;
    static String field_j;
    static boolean field_f;
    static boolean field_a;
    static int[][] field_c;
    static uk field_b;
    String field_i;
    static int[] field_g;
    static ka field_h;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 17) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(mc.a(var2, param1 ^ -18, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        field_g = null;
        field_e = null;
        field_c = null;
        field_b = null;
        field_l = null;
        if (param0 != -26425) {
            gl.a(-19);
        }
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    final static nf a(byte[] param0, byte param1) {
        nf var2 = null;
        Object var3 = null;
        if (param0 != null) {
          var2 = new nf(param0, ug.field_e, dd.field_t, pg.field_r, lg.field_e, h.field_a);
          p.a(0);
          if (param1 <= 107) {
            var3 = null;
            nf discarded$2 = gl.a((byte[]) null, (byte) -57);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 1) {
            return null;
        }
        return new java.net.Socket(((gl) this).field_i, ((gl) this).field_d);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[25][2][3][2];
        field_f = false;
        field_g = new int[]{1, 0, -1, -1, -1, -1, -1, -1, 2, 2, 0, 0};
        field_j = "Email (Login):";
        field_a = false;
        field_c = new int[][]{new int[2], new int[2]};
    }
}
