/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nda extends pu {
    static kv field_l;

    final static void a(int param0, lda param1, int param2, int param3, int param4, po param5, po param6, lda param7, int param8, boolean param9, lda param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        int stackIn_4_0 = 0;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          qm.field_a = param6;
          lha.field_b = param5;
          jk.a(param15, param17, param13, (byte) -64, param3);
          jn.a(param2, param10, param14, param9);
          if (param9) {
            return;
          }
          v.a(param8, (byte) 124, param0, param1, param7, param19);
          stackIn_4_0 = param12;
          stackIn_5_1 = !(param9);
          fg.a(stackIn_4_0, stackIn_5_1, param16);
          cm.a(param4, param11, param18, -123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_9_0 = var20;
          stackIn_9_1 = new StringBuilder().append("nda.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(')').toString());
        }
    }

    public static void b(int param0) {
        int var1 = -73 / ((0 - param0) / 41);
        field_l = null;
    }

    static {
    }
}
