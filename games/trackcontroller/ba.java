/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static String field_e;
    static int[] field_a;
    static long field_f;
    static String field_d;
    static String[] field_c;
    static oh field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, boolean param1, String param2, String param3, String param4, int param5, int param6) {
        kh var7 = null;
        RuntimeException var7_ref = null;
        kh var8 = null;
        String var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new kh(param4);
          var8 = new kh(param3);
          if (param6 != 0) {
            var9 = (String) null;
            ba.a((String) null, true);
          }
          stackIn_3_0 = me.a(param2, param1, param5, var7, param0, param6 + 92, var8);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("ba.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          var2_int = param0.charAt(0);
          var3 = 1;
          if (param1) {
            return true;
          }
          while (var3 < param0.length()) {
            if (var2_int != param0.charAt(var3)) {
              return false;
            }
            var3++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ba.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 0) {
          return false;
        }
        stackIn_8_0 = (this == ca.field_b) || (qe.field_C == this) || (ka.field_b == this);
        return stackIn_8_0;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 <= 104) {
          String var2 = (String) null;
          ba.a(-84, true, (String) null, (String) null, (String) null, 4, 89);
        }
    }

    static {
        field_e = "Level value: ";
        field_c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_d = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_f = 20000000L;
    }
}
