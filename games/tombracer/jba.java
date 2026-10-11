/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jba extends kca {
    static float[] field_k;
    static String field_l;
    static int field_j;

    final static int a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1) {
          var3 = param2 - param0 >> 16;
          var4 = 128 + 128 * var3 / 256;
          var4 = za.$cfr$intArgs$a$c604db63f465(0, 40, 255, var4);
          return var4;
        }
        field_j = -65;
        var3Lifetime1 = param2 - param0 >> 16;
        var4Lifetime1 = 128 + 128 * var3Lifetime1 / 256;
        var4Lifetime1 = za.$cfr$intArgs$a$c604db63f465(0, 40, 255, var4Lifetime1);
        return var4Lifetime1;
    }

    final it a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        it stackIn_2_0 = null;
        it stackIn_5_0 = null;
        it stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!sqa.a(var4, -3)) {
            stackIn_2_0 = fp.field_c;
            return stackIn_2_0;
          }
          if (param0 != 14) {
            stackIn_5_0 = (it) null;
            return stackIn_5_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = jb.a(var5, (byte) 70);
          if (var3_int > 0 &&
            130 >= var3_int) {
            return uh.field_k;
          }
          stackIn_10_0 = fp.field_c;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("jba.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    jba(tra param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 14, param1) == fp.field_c) {
            stackIn_2_0 = fm.field_l;
            return stackIn_2_0;
          }
          if (param0 == -1) {
            return null;
          }
          field_k = (float[]) null;
          stackIn_6_0 = null;
          return (String) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jba.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 501386288) {
          field_j = 108;
        }
    }

    static {
        field_k = new float[16];
        field_l = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_j = 0;
    }
}
