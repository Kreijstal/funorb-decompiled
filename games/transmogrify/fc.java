/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static volatile int field_g;
    static ti[] field_h;
    private boolean field_a;
    private String field_c;
    private boolean field_b;
    static String field_e;
    static int field_d;
    static int field_f;

    final static void a(int param0, String param1) {
        if (param0 >= 111) {
          System.out.println("Error: " + mg.a("%0a", false, "\n", param1));
          return;
        }
        field_g = -123;
        System.out.println("Error: " + mg.a("%0a", false, "\n", param1));
    }

    final boolean a(int param0) {
        if (param0 != -1) {
          this.b(-123);
          return this.field_a;
        }
        return this.field_a;
    }

    final void a(boolean param0, boolean param1) {
        this.field_b = true;
        this.field_a = param0 ? true : false;
        if (param1) {
          this.a(false, false);
        }
    }

    final static boolean a(byte param0, uk param1, uk param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 < 115) {
            field_e = (String) null;
          }
          var3_int = -param1.field_hb + param2.field_hb;
          if (param2.field_fb == bd.field_v) {
            var3_int -= 200;
          } else {
            if (param2.field_fb == null) {
              var3_int += 200;
            }
          }
          if (bd.field_v != param1.field_fb) {
            if (null == param1.field_fb) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("fc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = vl.b(-1, param2);
          if (param0 != 19) {
            field_d = 73;
          }
          if (param1.indexOf(param2) == -1 &&
            param1.indexOf(var3) == -1) {
            stackIn_14_0 = (param1.startsWith(param2)) || (param1.startsWith(var3)) || (param1.endsWith(param2)) || (param1.endsWith(var3));
            return stackIn_14_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("fc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_g = -17;
          field_h = null;
          field_e = null;
          return;
        }
        field_h = null;
        field_e = null;
    }

    fc(String param0) {
        this.field_a = false;
        this.field_b = false;
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0) {
        int var2 = -39 / ((param0 - 19) / 35);
        return this.field_c;
    }

    final boolean b(int param0) {
        if (param0 != -26753) {
          this.field_a = false;
          return this.field_b;
        }
        return this.field_b;
    }

    static {
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
        field_g = -1;
    }
}
