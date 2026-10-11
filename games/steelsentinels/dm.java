/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static String field_h;
    private boolean field_b;
    static u field_f;
    static boolean field_c;
    static int field_a;
    private String field_i;
    static String field_e;
    private boolean field_g;
    static String field_d;

    final void a(int param0, boolean param1) {
        this.field_g = true;
        if (param0 == 200) {
          this.field_b = param1 ? true : false;
          return;
        }
        field_a = 9;
        this.field_b = param1 ? true : false;
    }

    final boolean b(int param0) {
        if (param0 != 200) {
          this.a(false);
          return this.field_b;
        }
        return this.field_b;
    }

    final static boolean a(ah param0, int param1, ah param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        StringBuilder var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param1 != 22635) {
            var5 = (StringBuilder) null;
            dm.a('\037', -119, (StringBuilder) null, -20);
          }
          var3_int = -param0.field_bc + param2.field_bc;
          if (param2.field_ac != nn.field_f) {
            if (param2.field_ac == null) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (nn.field_f != param0.field_ac) {
            if (param0.field_ac == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("dm.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        if (param0 != -72) {
          return true;
        }
        return this.field_g;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 <= -99) {
          field_f = null;
          field_d = null;
          field_h = null;
          return;
        }
        dm.a(120);
        field_f = null;
        field_d = null;
        field_h = null;
    }

    final String a(boolean param0) {
        if (!param0) {
          return (String) null;
        }
        return this.field_i;
    }

    final static StringBuilder a(char param0, int param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var4_int = param2.length();
          param2.setLength(param3);
          for (var5 = var4_int; param3 > var5; var5++) {
            param2.setCharAt(var5, param0);
          }
          if (param1 != 200) {
            field_a = 21;
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("dm.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    dm(String param0) {
        this.field_g = false;
        this.field_b = false;
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "dm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = true;
        field_h = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = "Sentinels Expansion";
        field_a = 3;
        field_d = "Friends";
    }
}
