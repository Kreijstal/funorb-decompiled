/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fb extends me {
    static String field_n;
    static cm field_h;
    static gh field_r;
    private long field_i;
    static java.applet.Applet field_o;
    static String[] field_j;
    private String field_m;
    static gh field_l;
    static String field_p;
    static String field_q;
    static String field_k;

    final static boolean a(int param0, int param1, String param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wk[] var8 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= oh.field_f) {
            if (param3 + param4 > oh.field_f) {
              if (param1 <= pi.field_c) {
                stackIn_10_0 = (pi.field_c <= param1 + param0) ? 1 : 0;
              } else {
                stackIn_10_0 = 0;
              }
            } else {
              stackIn_10_0 = 0;
            }
          } else {
            stackIn_10_0 = 0;
          }
          var6_int = stackIn_10_0;
          stackIn_13_0 = (var6_int == 0) ? 1021128 : 1044724;
          var7 = stackIn_13_0;
          if (param5 != 12490) {
            return false;
          }
          var8 = pl.field_T;
          jm.a(param1, param0, var8, 1, param4, param3);
          if (param2 != null) {
            ui.field_U.a(ke.a(param5 - 12448, param2), param4 + param3 / 2, param1 + (ui.field_U.field_U + (param0 + 1)) / 2, var7, -1);
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("fb.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(gi param0, boolean param1) {
        try {
          param0.b(-28875, this.field_i);
          if (param1) {
            field_q = (String) null;
          }
          param0.a(this.field_m, (byte) -66);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "fb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    dj a(byte param0) {
        if (param0 <= 47) {
          return (dj) null;
        }
        return ol.field_Sb;
    }

    fb(long param0, String param1) {
        try {
          this.field_m = param1;
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "fb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_q = null;
        field_o = null;
        field_p = null;
        field_k = null;
        field_j = null;
        field_r = null;
        if (param0 <= -111) {
          field_n = null;
          field_h = null;
          return;
        }
        fb.b((byte) 119);
        field_n = null;
        field_h = null;
    }

    final static void b(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = SteelSentinels.field_G;
        try {
          var5 = qe.field_a;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "fb.B(" + param0 + ')');
        }
    }

    static {
        field_n = "Day";
        field_j = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_p = "You can ask to join this game";
        field_q = "Return to game";
        field_k = "Options Menu";
    }
}
