/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static tq field_e;
    private boolean field_c;
    static String field_a;
    static String field_b;
    private String field_d;

    public static void b(byte param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        if (param0 != 45) {
          hf.b((byte) -95);
        }
    }

    hf(String param0) {
        this(param0, false);
    }

    final boolean a(byte param0) {
        if (param0 < 55) {
          this.field_d = (String) null;
          return this.field_c;
        }
        return this.field_c;
    }

    hf(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_d = param0;
          stackIn_4_1 = (param1);
          this.field_c = stackIn_4_1;
          if (this.field_d == null) {
            this.field_d = "";
          }
          if (0 != this.field_d.length()) {
            return;
          }
          this.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("hf.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final String c(byte param0) {
        if (param0 != 99) {
          return (String) null;
        }
        return this.field_d;
    }

    static {
        field_a = "Fireball";
        field_b = "You cannot add yourself!";
    }
}
