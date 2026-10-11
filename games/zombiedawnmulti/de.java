/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static ul field_e;
    static ip field_h;
    static int[] field_c;
    static qh field_b;
    static cj field_f;
    static String field_a;
    static String field_d;
    static volatile int field_g;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        if (param0 == 19091) {
          field_e = null;
          field_h = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        de.a(-77);
        field_e = null;
        field_h = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(go param0, byte param1, Object param2) {
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (null == param0.field_j) {
            return;
          }
          if (param1 != 99) {
            de.a(-110);
          }
          for (var3_int = 0; 50 > var3_int; var3_int++) {
            if (param0.field_j.peekEvent() != null) {
              vd.a(false, 1L);
              continue;
            }
            break;
          }
          try {
            if (param2 == null) {
              return;
            }
            param0.field_j.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("de.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_c = new int[8192];
        field_h = new ip();
        field_a = "Play the game without logging in just yet";
        field_d = "This entry doesn't match";
        field_g = 0;
    }
}
