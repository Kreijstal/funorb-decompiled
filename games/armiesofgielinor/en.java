/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class en extends tj implements eg {
    private sb field_H;
    static tu field_E;
    static int field_F;
    static String field_G;

    abstract int a(byte param0);

    public static void n(int param0) {
        if (param0 != 0) {
            return;
        }
        field_G = null;
        field_E = null;
    }

    void a(byte param0, sb param1) {
        try {
            ((en) this).field_H = param1;
            ((en) this).field_H.field_j = (en) this;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "en.I(" + -108 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract int l(int param0);

    final static int[] a(vh param0, byte param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -24) {
                break L1;
              } else {
                en.n(-95);
                break L1;
              }
            }
            var5 = new int[param0.k(param1 ^ -24)];
            var2 = var5;
            var3 = 0;
            L2: while (true) {
              if (var5.length <= var3) {
                stackOut_6_0 = (int[]) var2;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var5[var3] = param0.k(0);
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2_ref;
            stackOut_8_1 = new StringBuilder().append("en.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    en(int param0, int param1, int param2, int param3, kh param4) {
        super(param0, param1, param2, param3, param4);
    }

    public final n a(int param0) {
        if (param0 != -918933630) {
            Object var3 = null;
            int[] discarded$0 = en.a((vh) null, (byte) 126);
            return (n) (Object) ((en) this).field_H;
        }
        return (n) (Object) ((en) this).field_H;
    }

    abstract int m(int param0);

    abstract boolean k(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Loading extra data";
    }
}
