/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    int field_C;
    byte[] field_B;
    int field_c;
    byte[] field_I;
    static int field_q;
    int field_j;
    int field_u;
    boolean[] field_r;
    byte[] field_x;
    int field_n;
    int field_v;
    int[] field_J;
    byte[] field_e;
    byte[][] field_f;
    byte[] field_A;
    static nj field_a;
    int[] field_y;
    int[] field_i;
    int[][] field_k;
    int field_t;
    int field_g;
    int field_E;
    static t field_F;
    int[] field_G;
    int field_z;
    byte field_h;
    int[][] field_D;
    static long field_p;
    boolean[] field_w;
    int field_s;
    int[][] field_l;
    int field_b;
    int field_o;
    byte[] field_d;
    int field_H;
    int field_m;

    final static void a(java.awt.Canvas param0, byte param1) {
        int var2 = 0;
        h.a((java.awt.Component) (Object) param0, -8662);
        var2 = -50 / ((-56 - param1) / 59);
        sa.a((java.awt.Component) (Object) param0, true);
        if (wb.field_u != null) {
          wb.field_u.a((byte) 71, (java.awt.Component) (Object) param0);
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0) {
                  break L0;
                } else {
                  field_p = -23L;
                  break L0;
                }
              }
              var4 = param1.getCodeBase();
              var3 = og.a(var4, param1, (byte) -85).getFile();
              Object discarded$6 = hp.a(param1, new Object[2], 28989, "updatelinks");
              Object discarded$7 = hp.a(param1, new Object[2], 28989, "updatelinks");
              Object discarded$8 = hp.a(param1, new Object[2], 28989, "updatelinks");
              Object discarded$9 = hp.a(param1, new Object[2], 28989, "updatelinks");
              Object discarded$10 = hp.a(param1, new Object[2], 28989, "updatelinks");
              Object discarded$11 = hp.a(param1, new Object[2], 28989, "updatelinks");
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_F = null;
        if (param0 != 44) {
            Object var2 = null;
            j.a((java.awt.Canvas) null, (byte) -16);
            field_a = null;
            return;
        }
        field_a = null;
    }

    j() {
        ((j) this).field_r = new boolean[256];
        ((j) this).field_x = new byte[4096];
        ((j) this).field_A = new byte[18002];
        ((j) this).field_I = new byte[256];
        ((j) this).field_J = new int[16];
        ((j) this).field_y = new int[6];
        ((j) this).field_k = new int[6][258];
        ((j) this).field_E = 0;
        ((j) this).field_G = new int[257];
        ((j) this).field_g = 0;
        ((j) this).field_D = new int[6][258];
        ((j) this).field_f = new byte[6][258];
        ((j) this).field_l = new int[6][258];
        ((j) this).field_i = new int[256];
        ((j) this).field_d = new byte[18002];
        ((j) this).field_w = new boolean[16];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_a = null;
    }
}
