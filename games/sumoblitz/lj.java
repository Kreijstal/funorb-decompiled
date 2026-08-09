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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_c = param0;
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
              ((lj) (this)).field_d = stackIn_4_1 != 0;
              if (null != this.field_c) {
                break L2;
              } else {
                this.field_c = "";
                break L2;
              }
            }
            if (0 != this.field_c.length()) {
              break L0;
            } else {
              this.field_d = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("lj.<init>(");

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
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
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
