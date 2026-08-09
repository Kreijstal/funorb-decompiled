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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_d = param0;
              stackIn_3_0 = this;

              if (!param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((hf) (this)).field_c = stackIn_4_1 != 0;
              if (this.field_d != null) {
                break L2;
              } else {
                this.field_d = "";
                break L2;
              }
            }
            if (0 == this.field_d.length()) {
              this.field_c = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("hf.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
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
