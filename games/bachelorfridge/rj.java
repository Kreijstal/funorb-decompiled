/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends vo {
    private int field_s;
    static String field_o;
    static int field_j;
    private int field_k;
    private int field_p;
    static String field_q;
    private int field_m;
    private int field_r;
    private int field_h;
    private int field_n;
    static ee field_l;
    private int field_g;
    static int field_i;

    final void a(byte param0, int param1, int param2) {
        if (param0 >= -70) {
            field_j = -32;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var4 = this.field_r * param0 >> 1291318284;
        var5 = param2 * this.field_p >> 1774861004;
        var6 = this.field_s * param0 >> -903849492;
        if (param1 != -25222) {
          return;
        } else {
          var7 = this.field_n * param2 >> 837395372;
          var8 = param0 * this.field_g >> 617557900;
          var9 = this.field_h * param2 >> -882733876;
          var10 = this.field_k * param0 >> 503105292;
          var11 = param2 * this.field_m >> -146848180;
          ok.a(var5, false, var11, var7, var4, var6, var8, var9, var10, this.field_f);
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            java.applet.Applet var3 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param0 == -30136) {
                      break L1;
                    } else {
                      var3 = (java.applet.Applet) null;
                      rj.a(33, (java.applet.Applet) null);
                      break L1;
                    }
                  }
                  var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                  param1.getAppletContext().showDocument(ow.a(var2, (byte) -122, param1), "_top");
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
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("rj.G(").append(param0).append(',');

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
              throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = -3 / ((param1 - 14) / 62);
    }

    rj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        super(-1, param8, param9);
        this.field_p = param1;
        this.field_h = param5;
        this.field_m = param7;
        this.field_s = param2;
        this.field_k = param6;
        this.field_n = param3;
        this.field_g = param4;
        this.field_r = param0;
    }

    public static void b(byte param0) {
        field_q = null;
        int var1 = -2 % ((param0 - -17) / 59);
        field_o = null;
        field_l = null;
    }

    static {
        field_j = 15;
        field_o = "You must play <%1> more rated games before playing with the current options.";
    }
}
