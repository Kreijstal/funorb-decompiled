/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends pi {
    int[] field_r;
    int field_u;
    int field_v;
    int field_t;
    int field_s;
    static int field_p;
    int field_o;
    int field_n;
    static String field_q;
    int field_w;

    final static int a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param2 <= 0) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = param0 & 1 | var3_int << 1;
                param2--;
                param0 = param0 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "wb.B(" + param0 + ',' + true + ',' + param2 + ')');
        }
        return stackIn_5_0;
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 0) {
            field_q = null;
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        qm var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
                var4 = param2;
                break L1;
              } else {
                var8 = new byte[param0];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param0) {
                    break L1;
                  } else {
                    var8[var5_int] = param2[param1 + var5_int];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            var5 = new qm();
            var5.a((byte) -29);
            var5.a(var4, -21816, (long)(8 * param0));
            var6 = new byte[64];
            var5.a(0, var6, 8);
            stackOut_8_0 = (byte[]) var6;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("wb.A(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 18738 + ')');
        }
        return stackIn_9_0;
    }

    wb(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((wb) this).field_r = param6;
            ((wb) this).field_v = param0;
            ((wb) this).field_o = param3;
            ((wb) this).field_u = param2;
            int fieldTemp$0 = nf.field_c;
            nf.field_c = nf.field_c + 1;
            ((wb) this).field_w = 65535 & fieldTemp$0;
            ((wb) this).field_t = param4;
            ((wb) this).field_s = param1;
            ((wb) this).field_n = param5;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "wb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "To server list";
    }
}
