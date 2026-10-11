/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends bg {
    static String field_J;
    static int field_K;
    static int[] field_L;
    static String field_B;
    private Object field_I;

    final Object d(byte param0) {
        int var2 = -124 / ((70 - param0) / 38);
        return this.field_I;
    }

    final static void a(Object param0, int param1, pn param2) {
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
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param2.field_b == null) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (param2.field_b.peekEvent() != null) {
              a.a((byte) 125, 1L);
              continue;
            }
            break;
          }
          try {
            if (param0 != null) {
              param2.field_b.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
            }
            if (param1 != 50) {
              field_L = (int[]) null;
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
          stackIn_18_1 = new StringBuilder().append("le.J(");
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
          throw ci.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        NodeDeque.field_g = hh.field_i;
        ag.field_u = 0;
        ik.field_e = 0;
        lh.field_r = 0;
        jh.field_i = new rm(2);
        int var2 = 116 / ((param0 - 57) / 61);
        jh.field_i.a(param1, -1, 0, ei.a(pi.field_c, oh.field_f, true));
    }

    le(Object param0, int param1) {
        super(param1);
        try {
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "le.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void i(int param0) {
        if (param0 < 59) {
          return;
        }
        field_L = null;
        field_B = null;
        field_J = null;
    }

    final boolean h(int param0) {
        if (param0 != -29304) {
          return true;
        }
        return false;
    }

    static {
        field_J = "Back";
        field_B = "Options";
    }
}
