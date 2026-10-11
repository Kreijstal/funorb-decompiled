/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vca implements bo {
    private pi field_a;
    static int[] field_c;
    static jea field_e;
    static ur field_d;
    static String field_b;

    final pi a(byte param0) {
        if (param0 <= 71) {
          field_d = (ur) null;
          return this.field_a;
        }
        return this.field_a;
    }

    public final String toString() {
        return "S2CEventPacket";
    }

    public final void a(kh param0, byte param1) {
        try {
          this.field_a = new pi(param0);
          if (param1 != -19) {
            field_e = (jea) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vca.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
          return;
        }
        try {
          this.field_a.b(param1, -19733);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vca.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        if (param0 != 256) {
          return;
        }
        field_c = null;
    }

    final static String a(String param0, String param1, cn param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.b(-53)) {
            stackIn_3_0 = (String) (param1);
            return stackIn_3_0;
          }
          var4_int = 45 / ((14 - param3) / 48);
          stackIn_5_0 = param0 + " - " + param2.a(true) + "%";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("vca.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = new int[256];
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = new ur(0);
    }
}
