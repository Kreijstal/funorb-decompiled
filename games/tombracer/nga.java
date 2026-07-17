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
        ((nga) this).field_m = 4096;
        ((nga) this).field_m = param0;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                break L1;
              } else {
                ((nga) this).field_m = (param1.h(255) << 12) / 255;
                break L1;
              }
            }
            if (param0 == 107) {
              break L0;
            } else {
              ((nga) this).field_m = -5;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("nga.A(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = ((nga) this).field_i.a((byte) 61, param1);
        var3 = var4;
        if (!((nga) this).field_i.field_d) {
          if (param0 != 1) {
            field_o = null;
            return var4;
          } else {
            return var4;
          }
        } else {
          lua.a(var4, 0, ns.field_g, ((nga) this).field_m);
          if (param0 == 1) {
            return var4;
          } else {
            field_o = null;
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
        int var1 = -51;
        field_o = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Friends";
        field_q = "Retry";
    }
}
