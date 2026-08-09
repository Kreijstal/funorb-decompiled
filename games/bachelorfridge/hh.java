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
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_a = param0;
              if (null != this.field_a) {
                break L1;
              } else {
                this.field_a = "";
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = this;

              if (!param1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            ((hh) (this)).field_c = stackIn_6_1 != 0;
            if (this.field_a.length() != 0) {
              break L0;
            } else {
              this.field_c = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("hh.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
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
