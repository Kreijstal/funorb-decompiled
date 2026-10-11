/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static int field_a;
    static int field_b;

    final static void a(vh param0, int param1, Object param2) {
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
        var4 = Torquing.field_u;
        try {
          if (param0.field_p == null) {
            return;
          }
          for (var3_int = param1; var3_int < 50; var3_int++) {
            if (null != param0.field_p.peekEvent()) {
              ub.a(param1 + 1976, 1L);
              continue;
            }
            break;
          }
          try {
            if (param2 != null) {
              param0.field_p.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
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
          stackIn_18_1 = new StringBuilder().append("oe.A(");
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
          throw rb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        eg.field_u = 1000000000L / (long)param0;
        if (param1 != 44) {
          field_a = -12;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param2) {
          return;
        }
        ik var4 = new ik(qo.field_t, bl.field_d);
        ik var3 = var4;
        if (param0) {
          var4.field_l = -var4.field_s[0] + param1 << 2;
          var3.field_p = -2;
        }
        qc.field_Y.a((byte) 54, var3);
    }

    static {
        field_b = 9;
    }
}
