/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends re {
    static int field_gb;
    static uk field_fb;
    static String field_eb;
    static String field_db;

    qj(eg param0, w param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void g(boolean param0) {
        if (!param0) {
            field_db = (String) null;
        }
        field_db = null;
        field_fb = null;
        field_eb = null;
    }

    final static String h(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = Lexicominos.field_L ? 1 : 0;
        String var6 = "(" + vh.field_b + " " + df.field_a + " " + wl.field_i + ") " + pg.field_d;
        String var1 = var6;
        if (param0 > -83) {
            return (String) null;
        }
        if (0 < a.field_c) {
            var1 = var6 + ":";
            for (var2 = 0; var2 < a.field_c; var2++) {
                var7 = var1 + ' ';
                var3 = 255 & ig.field_a.field_j[var2];
                var4 = var3 >> -363051100;
                var3 = var3 & 15;
                if ((var4 ^ -1) <= -11) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                if (-11 >= (var3 ^ -1)) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    final void b(int param0, w param1) {
        try {
            super.b(127, param1);
            if (param0 < 115) {
                w var4 = (w) null;
                this.b(90, (w) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "qj.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 33) {
                break L1;
              } else {
                qj.g(true);
                break L1;
              }
            }
            stackIn_3_0 = hc.field_eb.a((byte) 127, param1, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qj.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_gb = -1;
        field_db = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_eb = "Change display name";
    }
}
