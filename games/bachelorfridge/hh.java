/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static kv[] field_b;
    private String field_a;
    static int field_d;
    private boolean field_c;

    final boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        return this.field_c;
    }

    final String a(int param0) {
        if (param0 != -1) {
          this.a(false);
          return this.field_a;
        }
        return this.field_a;
    }

    hh(String param0) {
        this(param0, false);
    }

    hh(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          if (null == this.field_a) {
            this.field_a = "";
          }
          stackIn_6_1 = (param1);
          this.field_c = stackIn_6_1;
          if (this.field_a.length() != 0) {
            return;
          }
          this.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hh.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
          field_b = (kv[]) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
    }
}
