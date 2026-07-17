/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bf extends ma implements ee {
    static dk field_M;
    private ri field_L;
    static ci field_K;
    static String field_N;

    abstract int i(int param0);

    abstract int c(boolean param0);

    final static void g(byte param0) {
        o.field_a[520] = 59;
        o.field_a[222] = 58;
        o.field_a[192] = 28;
        o.field_a[91] = 42;
        o.field_a[45] = 26;
        o.field_a[47] = 73;
        o.field_a[59] = 57;
        o.field_a[93] = 43;
        o.field_a[44] = 71;
        o.field_a[61] = 27;
        o.field_a[92] = 74;
        o.field_a[46] = 72;
    }

    abstract boolean h(byte param0);

    bf(int param0, int param1, int param2, int param3, jm param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static void a(boolean param0, int param1) {
        ji.field_U = 20000000L;
        if (!param0) {
            bf.d(true);
        }
    }

    public static void d(boolean param0) {
        field_M = null;
        if (param0) {
            return;
        }
        field_N = null;
        field_K = null;
    }

    public final vb a(int param0) {
        if (param0 > -80) {
            field_K = null;
            return (vb) (Object) ((bf) this).field_L;
        }
        return (vb) (Object) ((bf) this).field_L;
    }

    void a(boolean param0, ri param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((bf) this).field_L = param1;
              ((bf) this).field_L.field_j = (bf) this;
              if (!param0) {
                break L1;
              } else {
                bf.d(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bf.F(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract int h(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Create a free account to start using this feature";
    }
}
