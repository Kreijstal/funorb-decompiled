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
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = Lexicominos.field_L ? 1 : 0;
        var6 = "(" + vh.field_b + " " + df.field_a + " " + wl.field_i + ") " + pg.field_d;
        var1 = var6;
        if (param0 > -83) {
          return (String) null;
        }
        if (0 < a.field_c) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < a.field_c; var2++) {
            var7 = var1 + ' ';
            var3 = 255 & ig.field_a.field_j[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 < 10) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 33) {
            qj.g(true);
          }
          stackIn_3_0 = hc.field_eb.a((byte) 127, param1, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qj.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_gb = -1;
        field_db = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_eb = "Change display name";
    }
}
