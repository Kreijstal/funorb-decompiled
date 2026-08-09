/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private String field_a;
    static boolean field_b;
    static md field_g;
    static gd field_d;
    private boolean field_c;
    static String field_h;
    static int field_e;
    static rg field_f;

    final boolean a(byte param0) {
        int var2 = -99 % ((param0 - 83) / 38);
        return this.field_c;
    }

    cd(String param0) {
        this(param0, false);
    }

    final String b(int param0) {
        if (param0 != -1) {
            cd.a(96);
            return this.field_a;
        }
        return this.field_a;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_h = null;
        field_d = null;
        field_f = null;
        field_g = null;
    }

    cd(String param0, boolean param1) {
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
            ((cd) (this)).field_c = stackIn_6_1 != 0;
            if (-1 != (this.field_a.length() ^ -1)) {
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

            stackIn_11_1 = new StringBuilder().append("cd.<init>(");

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
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        field_b = false;
        field_h = "Quit";
        field_g = new md();
    }
}
