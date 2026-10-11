/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mga extends vg {
    static char[] field_j;
    int field_k;
    static String[] field_f;
    dl field_h;
    static long field_i;
    static int[] field_g;

    public static void a(int param0) {
        field_g = null;
        field_j = null;
        if (param0 != 34037) {
          field_i = -35L;
          field_f = null;
          return;
        }
        field_f = null;
    }

    final static qk a(int param0, int param1, int[] param2, int param3, boolean param4, int param5, boolean param6, cka param7) {
        RuntimeException var8 = null;
        qk stackIn_2_0 = null;
        qk stackIn_9_0 = null;
        qk stackIn_11_0 = null;
        qk stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4) {
            stackIn_2_0 = (qk) null;
            return stackIn_2_0;
          }
          if (!param7.field_Gb && (!cla.a(9181, param1) ||
            !cla.a(9181, param0))) {
            if (param7.field_Cc) {
              stackIn_11_0 = new qk(param7, 34037, param1, param0, param6, param2, param3, param5);
              return stackIn_11_0;
            }
            stackIn_9_0 = new qk(param7, param1, param0, lla.a(false, param1), lla.a(false, param0), param2);
            return stackIn_9_0;
          }
          stackIn_13_0 = new qk(param7, 3553, param1, param0, param6, param2, param3, param5);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("mga.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    mga(dl param0, int param1) {
        try {
          this.field_h = param0;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_j = new char[]{(char)13, (char)10};
        field_f = new String[]{"Course Length", "Rounds to Win"};
        field_i = 20000000L;
    }
}
