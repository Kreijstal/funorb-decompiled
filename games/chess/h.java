/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends o {
    static String field_m;
    int field_p;
    int field_o;
    static int field_n;
    int field_l;
    int[] field_q;
    int field_j;
    int field_k;
    static lb field_s;
    int field_r;

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        ((h) this).field_l = param5;
        ((h) this).field_j = param0;
        ((h) this).field_k = param6;
        ((h) this).field_o = param7;
        ((h) this).field_r = param1;
        ((h) this).field_q = param3;
        if (param2 != 0) {
            return;
        }
        try {
            ((h) this).field_p = param4;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "h.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_s = null;
        if (param0 != 1187598372) {
            Object var2 = null;
            h.a((byte[]) null, -55, 110, (int[]) null, 44);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        pg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          L0: {
            var4 = (pg) (Object) nd.field_h.g(-18110);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                tm.a(false, var4, 7);
                var4 = (pg) (Object) nd.field_h.a((byte) -122);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "h.A(" + 7 + ',' + 0 + ')');
        }
    }

    final static void a(byte[] param0, int param1, int param2, int[] param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= ge.field_eb.length) {
                L2: {
                  if (param2 == 1187598372) {
                    break L2;
                  } else {
                    h.a(104);
                    break L2;
                  }
                }
                break L0;
              } else {
                param1 = ge.field_eb[var5_int];
                var6 = var5_int << 4;
                L3: while (true) {
                  int incrementValue$4 = param1;
                  param1--;
                  if (incrementValue$4 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$5 = var6;
                    var6++;
                    param4 = ve.field_Hb[incrementValue$5];
                    param3[param0[param4]] = param3[param0[param4]] + 1;
                    ve.field_Hb[param3[param0[param4]]] = param4;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("h.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ')');
        }
    }

    h() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Mute this player for 48 hours";
    }
}
