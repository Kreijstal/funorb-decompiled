/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private boolean field_d;
    static String field_c;
    static eg field_a;
    private String field_e;
    static int field_f;
    static int field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        String stackIn_9_2 = null;
        try {
          ei.a(107, (java.awt.Component) ((Object) param0));
          de.a((java.awt.Component) ((Object) param0), false);
          if (param1 < 22) {
            field_c = (String) null;
          }
          if (null == SteeringMode.field_c) {
            return;
          }
          SteeringMode.field_c.a((java.awt.Component) ((Object) param0), -104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var2;
          StringBuilder stackIn_8_1 = new StringBuilder().append("cd.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0) {
        int var2 = -76 % ((-50 - param0) / 53);
        return this.field_d;
    }

    final String b(int param0) {
        if (param0 != -17233) {
          field_b = -105;
          return this.field_e;
        }
        return this.field_e;
    }

    final static IndexedSprite a(ResourceArchive param0, String param1, String param2, int param3) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          int var4_int = param0.b(param1, 0);
          int var5 = param0.a(-125, var4_int, param2);
          if (param3 >= -43) {
            String var6 = (String) null;
            cd.a((ResourceArchive) null, (String) null, (String) null, -13);
          }
          IndexedSprite stackIn_3_0 = bl.a((byte) -123, var5, param0, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("cd.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    cd(String param0) {
        this(param0, false);
    }

    cd(String param0, boolean param1) {
        String stackIn_13_2 = null;
        try {
          this.field_e = param0;
          if (null == this.field_e) {
            this.field_e = "";
          }
          boolean stackIn_6_1 = (param1);
          this.field_d = stackIn_6_1;
          if (this.field_e.length() != 0) {
            return;
          }
          this.field_d = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3;
          StringBuilder stackIn_12_1 = new StringBuilder().append("cd.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    static {
        field_c = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_a = new eg();
        field_b = 0;
    }
}
