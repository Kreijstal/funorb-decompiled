/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class drb extends le {
    static int field_j;
    static String field_k;
    private int field_i;

    public static void e(byte param0) {
        field_k = null;
        if (param0 > -80) {
            field_k = null;
        }
    }

    final static kob a(boolean param0, int param1) {
        kob var2 = new kob();
        cnb.field_q.b(-10258, (ksa) (Object) var2);
        wva.b(6, 22681);
        return var2;
    }

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param1) {
          var4 = ((drb) this).field_f.a((byte) 117, param0);
          var3 = var4;
          if (((drb) this).field_f.field_e) {
            cua.a(var4, 0, hob.field_d, ((drb) this).field_i);
            return var4;
          } else {
            return var4;
          }
        } else {
          return null;
        }
    }

    private drb(int param0) {
        super(0, true);
        ((drb) this).field_i = 4096;
        ((drb) this).field_i = param0;
    }

    public drb() {
        this(4096);
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -60) {
                break L1;
              } else {
                drb.e((byte) 48);
                break L1;
              }
            }
            var4_int = param0;
            if (0 == var4_int) {
              ((drb) this).field_i = (param2.e((byte) -115) << 12) / 255;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("drb.F(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_k = "Loading graphics";
    }
}
