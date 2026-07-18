/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends rg {
    static fm field_j;
    private String field_k;
    static String[] field_i;
    static bb field_g;
    private String field_h;
    static String field_f;

    final static tf[] a(int param0, int param1, int param2) {
        if (param2 != 1) {
            wk.c(-57);
            return tk.a(1, param1, true, param0);
        }
        return tk.a(1, param1, true, param0);
    }

    public static void c(int param0) {
        if (param0 != -19101) {
          field_g = null;
          field_j = null;
          field_f = null;
          field_g = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_f = null;
          field_g = null;
          field_i = null;
          return;
        }
    }

    final ea b(int param0) {
        if (param0 != -27096) {
            tf[] discarded$0 = wk.a(45, 71, -79);
            return l.field_r;
        }
        return l.field_r;
    }

    wk(String param0, String param1) {
        try {
            ((wk) this).field_k = param1;
            ((wk) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, byte param6, boolean param7, int param8, int param9, int param10, int param11) {
        int discarded$0 = 13;
        sk.a(param4, 16777215, 15, param2, param11, 11, 14, (byte) -119, true, 16777215, param3, 0, param5);
        int var12 = -1;
    }

    final void a(byte param0, we param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              param1.a((byte) -66, ((wk) this).field_h);
              param1.a(-129, ((wk) this).field_k);
              if (param0 == -12) {
                break L1;
              } else {
                var4 = null;
                ((wk) this).a((byte) -114, (we) null);
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
            stackOut_3_1 = new StringBuilder().append("wk.C(").append(param0).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"The single-player challenge is simple - make as many pictures as you can for points and Achievements!", "The <col=FF9900>timer bar</col> is slowly draining at the bottom of the screen. Complete pictures quickly to <col=FF9900>bump</col> it back up. If it disappears completely the game is over."};
        field_f = "Fullscreen";
        field_g = new bb();
    }
}
