/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    private String field_b;
    private boolean field_c;
    static String field_a;

    dj(String param0) {
        this(param0, false);
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -35 / ((param0 - 60) / 53);
    }

    final String b(byte param0) {
        if (param0 < 40) {
          this.field_c = false;
          return this.field_b;
        }
        return this.field_b;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        return this.field_c;
    }

    dj(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b = param0;
          if (null == this.field_b) {
            this.field_b = "";
          }
          stackIn_6_1 = (param1);
          this.field_c = stackIn_6_1;
          if (this.field_b.length() != 0) {
            return;
          }
          this.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("dj.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Type your email address again to make sure it's correct";
    }
}
