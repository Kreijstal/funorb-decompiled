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
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_b = param0;
              if (null != this.field_b) {
                break L1;
              } else {
                this.field_b = "";
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
            ((dj) (this)).field_c = stackIn_6_1 != 0;
            if (-1 == (this.field_b.length() ^ -1)) {
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

            stackIn_12_1 = new StringBuilder().append("dj.<init>(");

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
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Type your email address again to make sure it's correct";
    }
}
