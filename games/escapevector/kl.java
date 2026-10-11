/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends ah {
    static int field_n;
    static String field_o;
    static String field_p;

    public static void g(int param0) {
        if (param0 != -17) {
          field_o = (String) null;
          field_p = null;
          field_o = null;
          return;
        }
        field_p = null;
        field_o = null;
    }

    kl(ul param0) {
        super(param0);
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_6_0 = (fk.a(-1465, param0) != null);
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("kl.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
          return false;
        }
        if (!hi.a(param1, -2)) {
          if (2 != param1) {
            return false;
          }
          if (4 == param0) {
            return true;
          }
          if (param0 == 8) {
            return true;
          }
          if (param0 == 12) {
            return true;
          }
          if (param0 == 16) {
            return true;
          }
          return false;
        }
        if (param0 == 2) {
          return true;
        }
        if (4 == param0) {
          return true;
        }
        if (param0 == 8) {
          return true;
        }
        if (param0 == 12) {
          return true;
        }
        if (16 == param0) {
          return true;
        }
        if (2 != param1) {
          return false;
        }
        if (4 == param0) {
          return true;
        }
        if (param0 == 8) {
          return true;
        }
        if (param0 == 12) {
          return true;
        }
        if (param0 == 16) {
          return true;
        }
        return false;
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 95 / ((param0 - 10) / 51);
          if (this.a(-1, param1) != ob.field_a) {
            return null;
          }
          stackIn_3_0 = tb.field_E;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kl.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final rf a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        rf stackIn_2_0 = null;
        rf stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          if (!fk.a(false, var5)) {
            stackIn_2_0 = ob.field_a;
            return stackIn_2_0;
          }
          var6 = (CharSequence) ((Object) param1);
          var3_int = gn.a(param0 ^ -16777216, var6);
          if (param0 != -1) {
            var4 = (String) null;
            this.a(-6, (String) null);
          }
          if (0 < var3_int &&
            130 >= var3_int) {
            return df.field_h;
          }
          stackIn_9_0 = ob.field_a;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("kl.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_p = "Names should contain a maximum of 12 characters";
    }
}
