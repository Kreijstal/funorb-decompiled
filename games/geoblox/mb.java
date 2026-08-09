/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String[] field_a;
    private String field_d;
    private boolean field_c;
    static od field_b;

    mb(String param0) {
        this(param0, false);
    }

    final String b(int param0) {
        if (param0 != 16925) {
            this.a((byte) -83);
            return this.field_d;
        }
        return this.field_d;
    }

    mb(String param0, boolean param1) {
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
              this.field_d = param0;
              if (null != this.field_d) {
                break L1;
              } else {
                this.field_d = "";
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
            ((mb) (this)).field_c = stackIn_6_1 != 0;
            if (this.field_d.length() == 0) {
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

            stackIn_12_1 = new StringBuilder().append("mb.<init>(");

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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final boolean a(byte param0) {
        if (param0 <= 74) {
            return false;
        }
        return this.field_c;
    }

    static {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = new od("email");
    }
}
