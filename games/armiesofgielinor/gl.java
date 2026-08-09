/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    private String field_a;
    static ka field_e;
    private boolean field_d;
    static int field_c;
    static boolean field_b;

    final String a(int param0) {
        int var2 = 87 % ((param0 - 53) / 55);
        return this.field_a;
    }

    final boolean a(byte param0) {
        int var2 = -118 / ((param0 - 29) / 41);
        return this.field_d;
    }

    final static void a(int param0, int param1) {
        if (param0 < 119) {
            return;
        }
        cn.field_r = param1;
    }

    gl(String param0) {
        this(param0, false);
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            gl.a(-75, -111);
        }
    }

    gl(String param0, boolean param1) {
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
              this.field_a = param0;
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
              ((gl) (this)).field_d = stackIn_4_1 != 0;
              if (null != this.field_a) {
                break L2;
              } else {
                this.field_a = "";
                break L2;
              }
            }
            if (0 != this.field_a.length()) {
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

            stackIn_11_1 = new StringBuilder().append("gl.<init>(");

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
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        field_b = false;
    }
}
