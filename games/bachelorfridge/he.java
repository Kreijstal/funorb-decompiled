/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends pu {
    static String field_n;
    static int field_l;
    static String field_m;
    static String field_o;

    public static void d(byte param0) {
        if (param0 < 81) {
          he.d((byte) 27);
        }
        field_m = null;
        field_n = null;
        field_o = null;
    }

    final static void a(ht param0, boolean param1, Object param2) {
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
        var4 = BachelorFridge.field_y;
        try {
          if (null == param0.field_x) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param0.field_x.peekEvent()) {
              gda.a(false, 1L);
              continue;
            }
            break;
          }
          if (param1) {
            field_l = 106;
          }
          try {
            if (param2 != null) {
              param0.field_x.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("he.A(");
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
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_n = "To play a multiplayer game, please log in or create a free account.";
        field_o = "Your <%0> will be lost!";
        field_m = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
