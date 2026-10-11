/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_b;
    static bi field_e;
    static qr field_d;
    static String field_c;
    static int field_a;

    final static qf a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        qf stackIn_2_0 = null;
        qf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 128) {
            stackIn_4_0 = new qf(mj.field_Sb.a(param0 + 27988, param2, ""), param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (qf) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gg.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0 != 0) {
          field_e = (bi) null;
        }
    }

    final static void a(byte[] param0, byte param1) {
        try {
          if (param0[0] >= 0) {
            uc.field_A = param0[1];
          }
          int var2_int = -79 / ((-55 - param1) / 60);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "gg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Reload game";
        field_c = "There are no valid types of game that match your preferences.";
        field_a = 128;
    }
}
