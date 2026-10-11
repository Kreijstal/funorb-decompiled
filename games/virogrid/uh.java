/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static String field_g;
    static String field_d;
    private boolean field_f;
    static int field_b;
    static eh field_e;
    private String field_a;
    static int field_c;

    final boolean a(int param0) {
        if (param0 != 0) {
          this.field_a = (String) null;
          return this.field_f;
        }
        return this.field_f;
    }

    final String b(int param0) {
        int var2 = -63 / ((param0 + 89) / 34);
        return this.field_a;
    }

    final static String a(String param0, String param1, String param2, int param3, eh param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -1) {
            field_d = (String) null;
          }
          if (!param4.c(0)) {
            stackIn_5_0 = (String) (param2);
            return stackIn_5_0;
          }
          stackIn_7_0 = param1 + " - " + param4.a(param0, 95) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("uh.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        if (j.field_l == 11) {
          rl.b((byte) 29);
        }
        if (param0 < 29) {
          return;
        }
        try {
          sm.a(j.field_i, true, j.field_g, ne.field_g);
          td.a(-30179, param1, 0, 0);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "uh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    uh(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          if (this.field_a == null) {
            this.field_a = "";
          }
          stackIn_6_1 = (param1);
          this.field_f = stackIn_6_1;
          if (this.field_a.length() != 0) {
            return;
          }
          this.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("uh.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.setFocusTraversalKeysEnabled(false);
          if (param1 <= 94) {
            field_e = (eh) null;
          }
          param0.addKeyListener(w.field_L);
          param0.addFocusListener(w.field_L);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "uh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    uh(String param0) {
        this(param0, false);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
          field_d = (String) null;
          field_d = null;
          field_e = null;
          return;
        }
        field_d = null;
        field_e = null;
    }

    static {
        field_d = "Searching for opponents";
        field_g = "Login: ";
        field_c = -1;
    }
}
