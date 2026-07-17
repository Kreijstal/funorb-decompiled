/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap {
    static int field_a;
    static int field_c;
    static String[][] field_d;
    static String field_g;
    private int[] field_h;
    static String field_b;
    static String field_i;
    static int field_e;
    static int field_f;

    final static void a(String param0, int param1, int param2, int param3, String param4) {
        try {
            nf.field_d.field_qb = param0;
            nf.field_d.field_K = nf.field_d.field_K + rh.field_y.field_K;
            nf.field_d.field_cb = param4;
            nf.field_d.field_N = param2;
            rh.field_y.field_D = rh.field_y.field_D + rh.field_y.field_K;
            rh.field_y.field_K = 0;
            nf.field_d.field_K = nf.field_d.field_K - rh.field_y.field_K;
            rh.field_y.field_D = rh.field_y.field_D - rh.field_y.field_K;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ap.A(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 44 + param2 + 44 + 24092 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var3 = -1 + (((ap) this).field_h.length >> 1);
        var4 = param0 & var3;
        if (param1 == -67) {
          L0: while (true) {
            var5 = ((ap) this).field_h[var4 + var4 - -1];
            if (var5 != -1) {
              if (((ap) this).field_h[var4 - -var4] != param0) {
                var4 = 1 + var4 & var3;
                continue L0;
              } else {
                return var5;
              }
            } else {
              return -1;
            }
          }
        } else {
          return 123;
        }
    }

    final static tf[] a(int param0, int param1, int param2, int param3) {
        tf[] var5 = null;
        tf[] var6 = null;
        var6 = new tf[9];
        var5 = var6;
        tf dupTemp$4 = cl.a(1, param3, (byte) -108);
        var6[6] = dupTemp$4;
        var5[3] = dupTemp$4;
        var5[2] = dupTemp$4;
        var5[1] = dupTemp$4;
        var5[0] = dupTemp$4;
        tf dupTemp$5 = cl.a(1, param0, (byte) -116);
        var6[8] = dupTemp$5;
        var5[7] = dupTemp$5;
        var5[5] = dupTemp$5;
        if (param1 != 0) {
          var6[4] = cl.a(64, param1, (byte) -50);
          return var5;
        } else {
          return var5;
        }
    }

    ap(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (param0.length - -(param0.length >> 1) < var2_int) {
                ((ap) this).field_h = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int - -var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = -1 + var2_int & param0[var3];
                        L4: while (true) {
                          if (((ap) this).field_h[1 + (var4 + var4)] == -1) {
                            ((ap) this).field_h[var4 + var4] = param0[var3];
                            ((ap) this).field_h[var4 + var4 - -1] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var2_int - 1 & var4 - -1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((ap) this).field_h[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("ap.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_i = null;
        field_g = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 70;
        field_a = field_c << 2;
        field_d = new String[][]{new String[3], new String[3]};
        field_g = "Concluded";
        field_e = 65;
        field_b = "Show lobby chat from my friends";
        field_i = "Solicitation";
    }
}
