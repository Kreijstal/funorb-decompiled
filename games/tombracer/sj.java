/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static int[] field_b;
    static String field_a;

    final static String a(byte param0) {
        if (param0 != 120) {
          jg var2 = (jg) null;
          sj.a((byte) 105, 20, 6, -92, 0.43005454540252686f, 0.0913710817694664f, (byte[]) null, 0.566550612449646f, 1.7519813776016235f, (jg) null, 105, 0.6303681135177612f, -47, 32);
        }
        return "Hi!";
    }

    public static void a(boolean param0) {
        if (!param0) {
          sj.a(false);
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, float param4, float param5, byte[] param6, float param7, float param8, jg param9, int param10, float param11, int param12, int param13) {
        int var18 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int var20 = 0;
        float[] var24 = null;
        int var16Lifetime1;
        int var17Lifetime1;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          var14_int = param2 * param3;
          var24 = new float[var14_int];
          for (var16 = 0; var16 < param10; var16++) {
            var17 = param12;
            param9.a(param4 * 127.0f, param11 / (float)param1, param8 / (float)param2, param1, var24, param5 / (float)param3, 1, 0, param3, param13, param2);
            param8 = param8 * 2.0f;
            for (var18 = 0; var18 < var14_int; var18++) {
              param6[var17] = (byte)(int)((float)param6[var17] + var24[var18]);
              var17++;
            }
            param4 = param4 * param7;
            param11 = param11 * 2.0f;
            param5 = param5 * 2.0f;
          }
          if (param0 != 79) {
            field_b = (int[]) null;
          }
          var20 = param12;
          var16Lifetime1 = var20;
          for (var17Lifetime1 = 0; var14_int > var17Lifetime1; var17Lifetime1++) {
            param6[var20] = (byte)(param6[var20] + 127);
            var20++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_15_0 = var14;
          stackIn_15_1 = new StringBuilder().append("sj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
        }
    }

    static {
        field_a = "(1 player wants to join)";
    }
}
