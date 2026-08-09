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
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            h.a((java.awt.Component) ((Object) param0), -8662);
            var2_int = -50 / ((-56 - param1) / 59);
            sa.a((java.awt.Component) ((Object) param0), true);
            if (wb.field_u == null) {
              break L0;
            } else {
              wb.field_u.a((byte) 71, (java.awt.Component) ((Object) param0));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("j.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param0) {
                      break L1;
                    } else {
                      field_p = -23L;
                      break L1;
                    }
                  }
                  var4 = param1.getCodeBase();
                  var3 = og.a(var4, param1, (byte) -85).getFile();
                  hp.a(param1, new Object[]{"home", var3 + "home.ws"}, 28989, "updatelinks");
                  hp.a(param1, new Object[]{"gamelist", var3 + "togamelist.ws"}, 28989, "updatelinks");
                  hp.a(param1, new Object[]{"serverlist", var3 + "toserverlist.ws"}, 28989, "updatelinks");
                  hp.a(param1, new Object[]{"options", var3 + "options.ws"}, 28989, "updatelinks");
                  hp.a(param1, new Object[]{"terms", var3 + "terms.ws"}, 28989, "updatelinks");
                  hp.a(param1, new Object[]{"privacy", var3 + "privacy.ws"}, 28989, "updatelinks");
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("j.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_F = null;
        if (param0 != 44) {
            java.awt.Canvas var2 = (java.awt.Canvas) null;
            j.a((java.awt.Canvas) null, (byte) -16);
            field_a = null;
            return;
        }
        field_a = null;
    }

    j() {
        this.field_r = new boolean[256];
        this.field_x = new byte[4096];
        this.field_A = new byte[18002];
        this.field_I = new byte[256];
        this.field_J = new int[16];
        this.field_y = new int[6];
        this.field_k = new int[6][258];
        this.field_E = 0;
        this.field_G = new int[257];
        this.field_g = 0;
        this.field_D = new int[6][258];
        this.field_f = new byte[6][258];
        this.field_l = new int[6][258];
        this.field_i = new int[256];
        this.field_d = new byte[18002];
        this.field_w = new boolean[16];
    }

    static {
        field_q = 0;
        field_a = null;
    }
}
