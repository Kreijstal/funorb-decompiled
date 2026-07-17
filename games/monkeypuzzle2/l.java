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

    public static void a() {
        field_D = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            int var5 = 0;
            java.net.URL var6 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = param0.getDocumentBase().getFile();
                    var4 = var2;
                    var4 = var2;
                    var3 = var2.indexOf('?');
                    var5 = -55 / ((param1 - -23) / 46);
                    var4 = "reload.ws";
                    if (0 > var3) {
                      break L1;
                    } else {
                      var4 = var4 + var2.substring(var3);
                      break L1;
                    }
                  }
                  var6 = new java.net.URL(param0.getCodeBase(), var4);
                  param0.getAppletContext().showDocument(uf.a(param0, (byte) 97, var6), "_self");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("l.B(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
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
