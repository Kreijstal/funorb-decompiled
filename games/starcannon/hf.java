/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends fi {
    private long field_p;
    private long[] field_k;
    private int field_o;
    static hl field_i;
    private long field_n;
    private long field_m;
    static int field_l;
    private int field_j;

    final int a(byte param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = StarCannon.field_A;
        var4 = 99 / ((param0 - -23) / 40);
        if (~((hf) this).field_m < ~((hf) this).field_p) {
          ((hf) this).field_n = ((hf) this).field_n + (((hf) this).field_m + -((hf) this).field_p);
          ((hf) this).field_p = ((hf) this).field_p + (((hf) this).field_m - ((hf) this).field_p);
          ((hf) this).field_m = ((hf) this).field_m + param1;
          return 1;
        } else {
          var5 = 0;
          L0: while (true) {
            L1: {
              ((hf) this).field_m = ((hf) this).field_m + param1;
              var5++;
              if (var5 >= 10) {
                break L1;
              } else {
                if (~((hf) this).field_p < ~((hf) this).field_m) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((hf) this).field_m < ((hf) this).field_p) {
                ((hf) this).field_m = ((hf) this).field_p;
                break L2;
              } else {
                break L2;
              }
            }
            return var5;
          }
        }
    }

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
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
              var2 = ue.a(ik.a(param0, (byte) -113), 16778);
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = (String) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("hf.F(");
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
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
        return stackIn_4_0;
    }

    final void b(byte param0) {
        int var2 = 47 % ((15 - param0) / 35);
        if (!(((hf) this).field_p >= ((hf) this).field_m)) {
            ((hf) this).field_p = ((hf) this).field_p + (((hf) this).field_m - ((hf) this).field_p);
        }
        ((hf) this).field_n = 0L;
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = StarCannon.field_A;
        long var2 = System.nanoTime();
        long var4 = -((hf) this).field_n + var2;
        ((hf) this).field_n = var2;
        if (var4 > -5000000000L) {
            if (!(5000000000L <= var4)) {
                ((hf) this).field_k[((hf) this).field_o] = var4;
                ((hf) this).field_o = (((hf) this).field_o + 1) % 10;
                if (!(((hf) this).field_j >= 1)) {
                    ((hf) this).field_j = ((hf) this).field_j + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((hf) this).field_j; var8++) {
            var6 = var6 + ((hf) this).field_k[(10 + -var8 + ((hf) this).field_o) % 10];
        }
        return var6 / (long)((hf) this).field_j;
    }

    final static void a(int param0, int param1, int param2, hl[] param3, int param4, int param5, hl[] param6, int param7, qe param8, int param9, int param10, boolean param11) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              qc.a(param3, param4, param2, param6, param4, -109, param2, param7, param11, param5, param0, param8, param10, param1, param8);
              if (param9 == -11) {
                break L1;
              } else {
                hf.b(-126);
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
            stackOut_3_1 = new StringBuilder().append("hf.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param7).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param8 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param9 + 44 + param10 + 44 + param11 + 41);
        }
    }

    public static void b(int param0) {
        if (param0 != -22720) {
            Object var2 = null;
            hf.a(91, -55, 77, (hl[]) null, -30, 57, (hl[]) null, 31, (qe) null, 69, -32, false);
        }
        field_i = null;
    }

    final long a(byte param0) {
        if (param0 != -51) {
            return 99L;
        }
        ((hf) this).field_p = ((hf) this).field_p + this.c(4216);
        if (~((hf) this).field_p > ~((hf) this).field_m) {
            return (((hf) this).field_m + -((hf) this).field_p) / 1000000L;
        }
        return 0L;
    }

    hf() {
        ((hf) this).field_p = 0L;
        ((hf) this).field_k = new long[10];
        ((hf) this).field_n = 0L;
        ((hf) this).field_o = 0;
        ((hf) this).field_m = 0L;
        ((hf) this).field_j = 1;
        ((hf) this).field_p = System.nanoTime();
        ((hf) this).field_m = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 250;
    }
}
