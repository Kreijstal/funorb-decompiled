/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends nm {
    static int[] field_j;
    static String field_l;
    byte[] field_i;
    static jp field_k;

    final static jp[] a(int param0, byte param1, int param2) {
        CharSequence var4;
        if (param1 != -18) {
          var4 = (CharSequence) null;
          se.a(21, (CharSequence) null);
          return hn.a(param2, param0, 1, param1 ^ 24);
        } else {
          return hn.a(param2, param0, 1, param1 ^ 24);
        }
    }

    public static void a(int param0) {
        field_j = null;
        int var1 = 10 / ((param0 - -33) / 35);
        field_k = null;
        field_l = null;
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 17165) {
                break L1;
              } else {
                se.a(-74, (byte) 25, 127);
                break L1;
              }
            }
            stackIn_3_0 = jd.a((byte) 122, false, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("se.C(").append(param0).append(',');

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    se(byte[] param0) {
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "se.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new int[]{17, 18, 8};
        field_l = "Go Back";
    }
}
