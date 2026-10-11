/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static String field_a;
    static uh field_d;
    static ld field_c;
    static byte[][][] field_b;
    static String field_f;
    static String field_e;

    final static boolean a(int param0, String param1, byte param2, int[] param3, long param4) {
        RuntimeException var6 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -53) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3 != null && (param0 != 2 ||
            nq.a(false, param1, param4))) {
            stackIn_9_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_9_0 = false;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("cb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = (byte[][][]) null;
        field_e = null;
        field_a = null;
        field_f = null;
        int var1 = -18 / ((param0 + 33) / 61);
        field_d = null;
        field_c = null;
    }

    final static void a(jt param0, byte param1) {
        try {
          np.field_Jb.a(new vf(param0), 3);
          if (param1 < 118) {
            field_d = (uh) null;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "cb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Waiting for opponent to choose a formation.";
        field_c = new ld();
        field_f = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_e = "Account created successfully!";
    }
}
