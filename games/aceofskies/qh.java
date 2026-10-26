/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static String field_b;
    static String[] field_a;

    final static void a(int param0, ai param1, int param2, float param3, float param4, float param5, float param6, int param7, int param8, byte[] param9, float param10, int param11, int param12, int param13) {
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        try {
          int var14_int = param13 * param12;
          float[] var23 = new float[var14_int];
          for (int var16 = 0; var16 < param2; var16++) {
            param1.a(param11, 127.0f * param10, param13, param5 / (float)param8, param8, -79, param3 / (float)param13, param6 / (float)param12, 0, var23, param12);
            int var17 = param7;
            for (int var18 = 0; var18 < var14_int; var18++) {
              param9[var17] = (byte)(int)((float)param9[var17] + var23[var18]);
              var17++;
            }
            param6 = param6 * 2.0f;
            param5 = param5 * 2.0f;
            param10 = param10 * param4;
            param3 = param3 * 2.0f;
          }
          int var19 = param7;
          int var16Lifetime1 = var19;
          if (param0 != 2) {
            field_a = (String[]) null;
          }
          for (int var17Lifetime1 = 0; var17Lifetime1 < var14_int; var17Lifetime1++) {
            param9[var19] = (byte)(127 + param9[var19]);
            var19++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var14 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var14;
          StringBuilder stackIn_14_1 = new StringBuilder().append("qh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 != -3) {
          field_b = (String) null;
        }
        return (param0 & 52) != 0 ? true : false;
    }

    public static void a(int param0) {
        if (param0 >= -77) {
          field_b = (String) null;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = null;
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
