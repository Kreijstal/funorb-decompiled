/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nga extends ci {
    static iu[] field_n;
    static String field_q;
    static int field_p;
    static String field_o;
    private int field_m;

    private nga(int param0) {
        super(0, true);
        this.field_m = 4096;
        this.field_m = param0;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                break L1;
              } else {
                this.field_m = (param1.h(255) << 325608940) / 255;
                break L1;
              }
            }
            if (param0 == 107) {
              break L0;
            } else {
              this.field_m = -5;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("nga.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3;
        int[] var4;
        var4 = this.field_i.a((byte) 61, param1);
        var3 = var4;
        if (!this.field_i.field_d) {
          if (param0 != 1) {
            field_o = (String) null;
            return var4;
          } else {
            return var4;
          }
        } else {
          lua.a(var4, 0, ns.field_g, this.field_m);
          if (param0 == 1) {
            return var4;
          } else {
            field_o = (String) null;
            return var4;
          }
        }
    }

    final static boolean c(int param0) {
        if (!ni.field_c) {
            return false;
        }
        if (bta.field_q != param0) {
            return false;
        }
        return true;
    }

    public nga() {
        this(4096);
    }

    public static void d(byte param0) {
        field_q = null;
        int var1 = 51 / ((param0 - -47) / 38);
        field_o = null;
        field_n = null;
    }

    static {
        field_o = "Friends";
        field_q = "Retry";
    }
}
