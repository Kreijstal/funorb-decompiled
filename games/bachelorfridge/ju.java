/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ju extends bca {
    static ht field_r;
    static int[] field_q;

    ju(int param0, nq param1) {
        super(param0, param1);
    }

    public static void e(byte param0) {
        field_q = null;
        if (param0 != -67) {
            return;
        }
        field_r = null;
    }

    final void a(op param0, int param1) {
        try {
            int var3_int = 4 / ((param1 - 12) / 35);
            ((ju) this).a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ju.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ju(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException var2 = null;
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
            ((ju) this).field_k = param0.e((byte) 53);
            ((ju) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (var2_int < 0) {
                break L0;
              } else {
                ((ju) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ju.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final int[][] d(byte param0) {
        int[][] var2 = null;
        Object var3 = null;
        int[][] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int[][] var7 = null;
        int[][] var8 = null;
        if (param0 != 27) {
          var3 = null;
          at discarded$1 = ((ju) this).a(-99, (gj) null);
          var7 = new int[17][17];
          var5 = var7;
          var4 = var5;
          var2 = var4;
          var7[7][9] = 1;
          var7[7][8] = 1;
          var7[7][7] = 1;
          var7[8][7] = 1;
          var7[8][9] = 1;
          var7[9][7] = 1;
          var7[9][9] = 1;
          var7[9][8] = 1;
          return var2;
        } else {
          var8 = new int[17][17];
          var6 = var8;
          var4 = var6;
          var2 = var4;
          var8[7][9] = 1;
          var8[7][8] = 1;
          var8[7][7] = 1;
          var8[8][7] = 1;
          var8[8][9] = 1;
          var8[9][7] = 1;
          var8[9][9] = 1;
          var8[9][8] = 1;
          return var2;
        }
    }

    final static boolean c(int param0, int param1) {
        if (param1 == 22) {
            return false;
        }
        if (!(param1 != 21)) {
            return false;
        }
        if (param1 == 28) {
            return false;
        }
        if (39 == param1) {
            return false;
        }
        if (param1 == 36) {
            return false;
        }
        if (param0 != 23745) {
            ju.e((byte) -97);
            return true;
        }
        return true;
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        kla stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kla stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                boolean discarded$2 = ju.c(17, -17);
                break L1;
              }
            }
            stackOut_2_0 = new kla(param1, (ju) this);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ju.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return (at) (Object) stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[]{6500, 5000, 3500, 2750, 2000};
    }
}
