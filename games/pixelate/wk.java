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
          field_g = (bb) null;
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
            wk.a(45, 71, -79);
            return l.field_r;
        }
        return l.field_r;
    }

    wk(String param0, String param1) {
        try {
            this.field_k = param1;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, byte param6, boolean param7, int param8, int param9, int param10, int param11) {
        sk.a(param4, 16777215, param0, param2, param11, param10, param1, (byte) -119, param7, 16777215, param3, param8, param5, param9);
        int var12 = -97 % ((param6 - -37) / 37);
    }

    final void a(byte param0, we param1) {
        RuntimeException runtimeException = null;
        we var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.a((byte) -66, this.field_h);
              param1.a(-129, this.field_k);
              if (param0 == -12) {
                break L1;
              } else {
                var4 = (we) null;
                this.a((byte) -114, (we) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_i = new String[]{"The single-player challenge is simple - make as many pictures as you can for points and Achievements!", "The <col=FF9900>timer bar</col> is slowly draining at the bottom of the screen. Complete pictures quickly to <col=FF9900>bump</col> it back up. If it disappears completely the game is over."};
        field_f = "Fullscreen";
        field_g = new bb();
    }
}
