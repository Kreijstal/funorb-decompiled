/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String[] field_c;
    static int field_b;
    static rb field_a;

    final static void a(int param0, String param1) {
        try {
          fb.field_b = param1;
          if (param0 != -1) {
            field_a = (rb) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ke.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, rk param1, java.awt.Frame param2) {
        en var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        java.awt.Frame var5 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          while (true) {
            var3 = param1.a(param2, param0 + 15850);
            while (var3.field_a == 0) {
              wf.a(10L, false);
            }
            if (var3.field_a != 1) {
              wf.a(100L, false);
              continue;
            }
            break;
          }
          param2.setVisible(false);
          param2.dispose();
          if (param0 == 973) {
            return;
          }
          var5 = (java.awt.Frame) null;
          ke.a(32, (rk) null, (java.awt.Frame) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ke.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -105 % ((param0 - 50) / 49);
    }

    static {
        field_c = new String[]{"You got the Double Gun!", "You got the Spreader Gun!", "You got the Gatling Gun!", "You got the Gun Coolant!"};
    }
}
