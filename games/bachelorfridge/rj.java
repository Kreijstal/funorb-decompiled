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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var4 = ((rj) this).field_r * param0 >> 12;
        var5 = param2 * ((rj) this).field_p >> 12;
        var6 = ((rj) this).field_s * param0 >> 12;
        if (param1 != -25222) {
          return;
        } else {
          var7 = ((rj) this).field_n * param2 >> 12;
          var8 = param0 * ((rj) this).field_g >> 12;
          var9 = ((rj) this).field_h * param2 >> 12;
          var10 = ((rj) this).field_k * param0 >> 12;
          var11 = param2 * ((rj) this).field_m >> 12;
          ok.a(var5, false, var11, var7, var4, var6, var8, var9, var10, ((rj) this).field_f);
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            Object var3 = null;
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
                    if (param0 == -30136) {
                      break L1;
                    } else {
                      var3 = null;
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
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("rj.G(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
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
              throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
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
        ((rj) this).field_p = param1;
        ((rj) this).field_h = param5;
        ((rj) this).field_m = param7;
        ((rj) this).field_s = param2;
        ((rj) this).field_k = param6;
        ((rj) this).field_n = param3;
        ((rj) this).field_g = param4;
        ((rj) this).field_r = param0;
    }

    public static void b(byte param0) {
        field_q = null;
        int var1 = 0;
        field_o = null;
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 15;
        field_o = "You must play <%1> more rated games before playing with the current options.";
    }
}
