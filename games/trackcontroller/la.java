/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends be {
    private int field_r;
    static volatile int field_s;
    private nf field_n;
    static int[] field_p;
    static String field_q;
    static int field_o;

    final int d(int param0, int param1) {
        int var6 = TrackController.field_F ? 1 : 0;
        int var3 = ((la) this).field_r >> 3;
        int var4 = 8 + -(((la) this).field_r & 7);
        int var5 = param0;
        ((la) this).field_r = ((la) this).field_r + param1;
        while (var4 < param1) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((pf.field_c[var4] & ((la) this).field_j[incrementValue$0]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 == var4) {
            var5 = var5 + (((la) this).field_j[var3] & pf.field_c[var4]);
        } else {
            var5 = var5 + (((la) this).field_j[var3] >> var4 + -param1 & pf.field_c[param1]);
        }
        return var5;
    }

    la(byte[] param0) {
        super(param0);
    }

    final void a(int param0, boolean param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            if (!param1) {
              L1: while (true) {
                if (var5_int >= param0) {
                  break L0;
                } else {
                  int fieldTemp$5 = ((la) this).field_k;
                  ((la) this).field_k = ((la) this).field_k + 1;
                  param3[var5_int + param2] = (byte)(((la) this).field_j[fieldTemp$5] + -((la) this).field_n.c(127));
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("la.UA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void g(byte param0) {
        ((la) this).field_k = (((la) this).field_r - -7) / 8;
        if (param0 <= -25) {
            return;
        }
        field_p = null;
    }

    final void a(byte param0, int[] param1) {
        if (param0 != -83) {
            return;
        }
        try {
            ((la) this).field_n = new nf(param1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "la.TA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    la(int param0) {
        super(param0);
    }

    public static void d() {
        field_p = null;
        field_q = null;
    }

    final void h(byte param0) {
        ((la) this).field_r = 8 * ((la) this).field_k;
        if (param0 == 31) {
            return;
        }
        ((la) this).field_r = -2;
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = ((la) this).field_k;
        ((la) this).field_k = ((la) this).field_k + 1;
        ((la) this).field_j[fieldTemp$0] = (byte)(((la) this).field_n.c(126) + param0);
        if (param1 == 7) {
            return;
        }
        ((la) this).g((byte) 52);
    }

    final int e(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((la) this).a(-123, false, 4, (byte[]) null);
            int fieldTemp$0 = ((la) this).field_k;
            ((la) this).field_k = ((la) this).field_k + 1;
            return ((la) this).field_j[fieldTemp$0] - ((la) this).field_n.c(125) & 255;
        }
        int fieldTemp$1 = ((la) this).field_k;
        ((la) this).field_k = ((la) this).field_k + 1;
        return ((la) this).field_j[fieldTemp$1] - ((la) this).field_n.c(125) & 255;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = -1;
        field_p = new int[8192];
    }
}
