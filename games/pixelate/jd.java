/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends fa {
    static int field_s;
    static String field_p;
    int field_w;
    static int field_r;
    int field_q;
    static byte[][][] field_o;
    int field_l;
    static u field_k;
    static int field_n;
    int[] field_t;
    int field_u;
    int field_v;
    int field_m;

    public static void e(int param0) {
        field_k = null;
        field_p = null;
        if (param0 != -32301) {
            return;
        }
        field_o = (byte[][][]) null;
    }

    final void a(int[] param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        int[] var10 = null;
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
              this.field_w = param3;
              this.field_t = param0;
              this.field_l = param1;
              this.field_v = param6;
              this.field_m = param5;
              this.field_q = param7;
              this.field_u = param2;
              if (param4 < -99) {
                break L1;
              } else {
                var10 = (int[]) null;
                this.a((int[]) null, 104, -115, 98, (byte) -50, -62, -94, 1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("jd.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        ql.field_m = -1;
        sd.field_N = false;
    }

    jd() {
    }

    static {
        field_p = "Waiting for extra data";
        field_s = 0;
        field_n = 0;
    }
}
