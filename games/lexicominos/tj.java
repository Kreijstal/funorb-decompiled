/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tj extends ri implements nf {
    static String field_k;
    private rl field_g;
    static String[] field_j;
    static int field_i;
    static int field_h;

    public final boolean a(int param0) {
        int var2;
        int stackIn_3_0 = 0;
        var2 = 28 / ((-29 - param0) / 42);
        if (this.field_g.field_u != null) {
          if (0 == this.field_g.field_u.length()) {
            return true;
          } else {
            return false;
          }
        } else {
          stackIn_3_0 = 1;
          return stackIn_3_0 != 0;
        }
    }

    public final void a(rl param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_h = -98;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("tj.E(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final sc b(boolean param0) {
        if (!param0) {
          this.b(-1);
          return this.a(0, this.field_g.field_u);
        } else {
          return this.a(0, this.field_g.field_u);
        }
    }

    abstract String a(byte param0, String param1);

    final static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        String var2 = (String) null;
        cl.a((byte) 41, (String) null, Lexicominos.field_H);
    }

    tj(rl param0) {
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0, rl param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(true);
              if (param0 == 10) {
                break L1;
              } else {
                tj.d(95);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("tj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract sc a(int param0, String param1);

    final String b(int param0) {
        if (param0 <= 21) {
          field_h = -22;
          return this.a((byte) -126, this.field_g.field_u);
        } else {
          return this.a((byte) -126, this.field_g.field_u);
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
            field_k = (String) null;
            field_j = null;
            field_k = null;
            return;
        }
        field_j = null;
        field_k = null;
    }

    static {
        field_k = "Mouse over an icon for details";
        field_j = new String[]{"Using the cursor keys, the 'SPACE' bar, 'Z', and 'X', move and rotate the falling blocks to make words both across and down.", "If you make more than one word with a block, you get a multiplier bonus."};
        field_i = 0;
        field_h = 0;
    }
}
