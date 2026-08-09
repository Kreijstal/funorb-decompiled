/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    private String field_e;
    static int field_c;
    static String field_a;
    private boolean field_d;
    static int[] field_b;

    qj(String param0, boolean param1) {
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
              this.field_e = param0;
              if (this.field_e != null) {
                break L1;
              } else {
                this.field_e = "";
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
            ((qj) (this)).field_d = stackIn_6_1 != 0;
            if (0 != this.field_e.length()) {
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

            stackIn_11_1 = new StringBuilder().append("qj.<init>(");

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
          throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 <= 57) {
            return false;
        }
        return this.field_d;
    }

    final String a(boolean param0) {
        if (param0) {
            this.field_e = (String) null;
            return this.field_e;
        }
        return this.field_e;
    }

    public static void a(byte param0) {
        if (param0 != 56) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    qj(String param0) {
        this(param0, false);
    }

    static {
        field_a = "Ask to join <%0>'s game";
        field_b = new int[4096];
    }
}
