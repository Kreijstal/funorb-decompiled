/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    private boolean field_d;
    private String field_c;
    static int[] field_a;
    static int field_b;

    lj(String param0) {
        this(param0, false);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 108) {
          field_a = (int[]) null;
        }
    }

    lj(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = param0;
          stackIn_4_1 = (param1);
          this.field_d = stackIn_4_1;
          if (null == this.field_c) {
            this.field_c = "";
          }
          if (0 != this.field_c.length()) {
            return;
          }
          this.field_d = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("lj.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0) {
        if (param0 <= 86) {
          this.field_c = (String) null;
          return this.field_d;
        }
        return this.field_d;
    }

    final String a(boolean param0) {
        if (!param0) {
          lj.a((byte) 48);
          return this.field_c;
        }
        return this.field_c;
    }

    static {
        field_b = 640;
    }
}
