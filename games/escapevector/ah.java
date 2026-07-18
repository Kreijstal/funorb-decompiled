/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ah extends sm implements rj {
    static String field_i;
    static String field_g;
    static String field_l;
    static String field_m;
    static ed field_j;
    static boolean field_h;
    static long field_e;
    private ul field_f;
    static String field_k;

    final String a(byte param0) {
        int var2 = 91 / ((52 - param0) / 53);
        return ((ah) this).a((byte) -109, ((ah) this).field_f.field_l);
    }

    public final void a(boolean param0, ul param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ah.CA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    abstract rf a(int param0, String param1);

    public final boolean c(int param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = -113 % ((41 - param0) / 50);
        if (((ah) this).field_f.field_l != null) {
          if (((ah) this).field_f.field_l.length() == 0) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    public final void a(ul param0, int param1) {
        if (param1 != 0) {
            return;
        }
        try {
            ((ah) this).a(false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ah.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final rf d(int param0) {
        if (param0 >= -60) {
          ah.f(-116);
          return ((ah) this).a(-1, ((ah) this).field_f.field_l);
        } else {
          return ((ah) this).a(-1, ((ah) this).field_f.field_l);
        }
    }

    abstract String a(byte param0, String param1);

    public static void f(int param0) {
        field_j = null;
        field_m = null;
        field_g = null;
        field_l = null;
        field_k = null;
        field_i = null;
        if (param0 != -16187) {
            Object var2 = null;
            ah.a((java.awt.Canvas) null, -55);
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        try {
            if (!(ff.field_e != 11)) {
                bm.b((byte) 62);
            }
            si.a(pl.field_t, hd.field_e, pb.field_d, (byte) 14);
            nn.a(param0, param1, param1 + -1, 0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ah.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ah(ul param0) {
        try {
            ((ah) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ah.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        tg.field_nb = null;
        qm.field_f = null;
        nn.field_i = null;
        tb.field_G = null;
        tb.field_D = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "OK";
        field_g = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_l = "Waiting for graphics";
        field_h = false;
        field_m = "Open in popup window";
        field_k = "Close";
    }
}
