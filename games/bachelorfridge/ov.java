/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ov extends uo {
    static sna field_d;
    static String field_g;
    static int field_c;
    static int[] field_e;
    static java.applet.Applet field_f;

    final static int b(int param0, int param1) {
        if (param1 != 60) {
          return 32;
        }
        if (param0 <= 0) {
          return 0;
        }
        if (param0 <= 4) {
          return param0 < 3 ? param0 + 2 : -2 + param0;
        }
        return 0;
    }

    public static void c(int param0) {
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != -5) {
          return;
        }
        field_d = null;
    }

    final static iga a(long param0, boolean param1, String param2, String param3, byte param4) {
        RuntimeException var6 = null;
        bd stackIn_5_0 = null;
        jda stackIn_7_0 = null;
        iga stackIn_10_0 = null;
        ot stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0L &&
            param2 != null) {
            stackIn_7_0 = new jda(param2, param3);
            return (iga) ((Object) stackIn_7_0);
          }
          if (param1) {
            stackIn_5_0 = new bd(param0, param3);
            return (iga) ((Object) stackIn_5_0);
          }
          if (param4 >= 41) {
            stackIn_12_0 = new ot(param0, param3);
            return (iga) ((Object) stackIn_12_0);
          }
          stackIn_10_0 = (iga) null;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ov.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_g = null;
        field_e = new int[]{100, 60, 30, 10};
    }
}
