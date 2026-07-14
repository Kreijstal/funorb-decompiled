/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    int[] field_v;
    byte[] field_h;
    int field_F;
    byte[] field_b;
    byte[] field_l;
    int field_I;
    int field_p;
    int field_B;
    byte[][] field_C;
    int[][] field_k;
    int field_c;
    int field_g;
    int[][] field_a;
    int field_q;
    int field_n;
    boolean[] field_j;
    int field_z;
    byte[] field_G;
    byte[] field_d;
    static int field_f;
    int field_i;
    byte field_H;
    static int field_u;
    boolean[] field_o;
    byte[] field_y;
    int field_t;
    int[][] field_x;
    int field_w;
    int field_m;
    int[] field_s;
    int field_A;
    static le[] field_D;
    int[] field_r;
    int field_E;
    int[] field_e;

    public static void a(int param0) {
        field_D = null;
        if (param0 != 0) {
            field_f = -53;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var6 = null;
            try {
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf('?');
                int var5 = -55 / ((param1 - -23) / 46);
                var4 = "reload.ws";
                if (0 <= var3) {
                    var4 = var4 + var2.substring(var3);
                }
                var6 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(uf.a(param0, (byte) 97, var6), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    l() {
        ((l) this).field_g = 0;
        ((l) this).field_C = new byte[6][258];
        ((l) this).field_b = new byte[256];
        ((l) this).field_a = new int[6][258];
        ((l) this).field_j = new boolean[256];
        ((l) this).field_d = new byte[18002];
        ((l) this).field_h = new byte[4096];
        ((l) this).field_o = new boolean[16];
        ((l) this).field_y = new byte[18002];
        ((l) this).field_n = 0;
        ((l) this).field_v = new int[16];
        ((l) this).field_x = new int[6][258];
        ((l) this).field_s = new int[256];
        ((l) this).field_r = new int[257];
        ((l) this).field_e = new int[6];
        ((l) this).field_k = new int[6][258];
    }

    static {
    }
}
