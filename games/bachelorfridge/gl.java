/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends pk implements fca, ufa {
    static String field_g;
    sh field_e;
    static String field_f;

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            gl.d(0);
          }
          stackIn_5_0 = (null != bna.b(-56, param1));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("gl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void a(lka param0, int param1) {
        try {
          if (param1 != 0) {
            field_g = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(byte param0) {
        NumberFormatException numberFormatException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_e.d((byte) 112);
          var3 = this.field_e.f((byte) 99);
          var4 = this.field_e.j(-1);
          var5 = kja.a(27168);
          if (1890 <= var4 &&
            -3 + var5 >= var4) {
            if (jp.a(var4, var3, (byte) 85, var2_int)) {
              return null;
            }
            if (param0 <= 97) {
              field_g = (String) null;
            }
          } else {
            stackIn_4_0 = lga.a(true, new String[]{"1890", Integer.toString(var5 - 3)}, vo.field_c);
            return stackIn_4_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return eb.field_s;
    }

    public gl() {
    }

    public static void d(int param0) {
        field_f = null;
        field_g = null;
        if (param0 > -1) {
          field_f = (String) null;
        }
    }

    public final boolean b(byte param0) {
        if (param0 == 5) {
          return this.field_e.k(param0 ^ -81);
        }
        gl.d(97);
        return this.field_e.k(param0 ^ -81);
    }

    final jg c(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jg stackIn_5_0 = null;
        jg stackIn_9_0 = null;
        jg stackIn_13_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_e.d((byte) 107);
          var3 = this.field_e.f((byte) 73);
          var4 = this.field_e.j(param0 - 36);
          if (param0 != 35) {
            field_g = (String) null;
          }
          var5 = kja.a(27168);
          if (var4 < 1890) {
            stackIn_5_0 = jt.field_f;
            return stackIn_5_0;
          }
          if (var5 - 3 < var4) {
            stackIn_9_0 = jt.field_f;
            return stackIn_9_0;
          }
          if (!jp.a(var4, var3, (byte) 91, var2_int)) {
            stackIn_13_0 = jt.field_f;
            return stackIn_13_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return jt.field_f;
        }
        return cm.field_u;
    }

    public final void a(lka param0, byte param1) {
        try {
          int var3_int = -85 / ((param1 - 0) / 49);
          this.a(574);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gl.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_g = "Remove <%0> from friend list";
        field_f = "You have not yet unlocked this option for use.";
    }
}
