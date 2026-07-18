/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends hf {
    static String field_o;
    int field_k;
    static long[] field_l;
    static dm[] field_r;
    static String[] field_f;
    int[] field_q;
    int field_m;
    static int field_h;
    int field_n;
    static ja[] field_g;
    int field_p;
    int field_i;
    int field_j;

    final static void a(java.applet.Applet param0) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
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
                  var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                  param0.getAppletContext().showDocument(wf.a(var2, 68, param0), "_top");
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
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("tl.A(");
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
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + -91 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 != 6491) {
          tl.b(-67);
          field_o = null;
          field_g = null;
          field_l = null;
          field_f = null;
          field_r = null;
          return;
        } else {
          field_o = null;
          field_g = null;
          field_l = null;
          field_f = null;
          field_r = null;
          return;
        }
    }

    tl() {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7) {
        try {
            ((tl) this).field_p = param5;
            ((tl) this).field_n = param0;
            ((tl) this).field_q = param6;
            ((tl) this).field_m = param2;
            ((tl) this).field_i = param1;
            if (!param7) {
                tl.b(-125);
            }
            ((tl) this).field_k = param4;
            ((tl) this).field_j = param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "tl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Prev";
        field_l = new long[32];
        field_g = new ja[1000];
    }
}
