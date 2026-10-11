/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static ll field_d;
    static String field_a;
    static sf field_c;
    static o field_b;
    static String field_e;

    public static void a(int param0) {
        if (param0 == -7077) {
          field_a = null;
          field_d = null;
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        }
        field_a = (String) null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, int param1, vd param2, int param3, o[] param4, int param5, int param6, int param7, vd param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, o[] param17, int param18, o[] param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          w.a(param16, param11, param10, param14, param2, param5, param20, param0, param7, param6, param8, new qj(param4), param15, (byte) -118, new qj(param19), param18, param13, new qj(param17), param12, param3, param9);
          if (param1 > -44) {
            we.a(-54);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("we.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param20).append(')').toString());
        }
    }

    static {
        field_e = "Friends can be added in multiplayer<nbsp>games";
    }
}
