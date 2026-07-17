/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends hk {
    static String field_F;
    static long field_H;
    static String field_G;
    static int field_E;

    public static void f(int param0) {
        field_F = null;
        field_G = null;
    }

    private vi(String param0, bb param1) {
        this(param0, hb.field_j.field_j, param1);
        try {
            ((vi) this).field_q = hb.field_j.field_c;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "vi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((vi) this).field_y = !((vi) this).field_y ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private vi(String param0, dh param1, bb param2) {
        super(param0, param1, param2);
        try {
            ((vi) this).field_q = hb.field_j.field_c;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "vi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static rj[] a(int param0, d param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        rj[] var4 = null;
        int var5 = 0;
        rj var6 = null;
        int var7 = 0;
        cb var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        rj[] stackIn_3_0 = null;
        rj[] stackIn_9_0 = null;
        rj[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj[] stackOut_15_0 = null;
        rj[] stackOut_8_0 = null;
        rj[] stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            if (param1.b(-26098)) {
              var8 = param1.a(34);
              L1: while (true) {
                if (var8.field_a != 0) {
                  if (var8.field_a != 2) {
                    L2: {
                      var12 = (int[]) var8.field_b;
                      var11 = var12;
                      var10 = var11;
                      var9 = var10;
                      var3 = var9;
                      var4 = new rj[var12.length >> 2];
                      if (param0 > 61) {
                        break L2;
                      } else {
                        field_H = 120L;
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_15_0 = (rj[]) var4;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        var6 = new rj();
                        var4[var5] = var6;
                        var6.field_d = var3[var5 << 2];
                        var6.field_f = var3[1 + (var5 << 2)];
                        var6.field_h = var3[2 + (var5 << 2)];
                        var6.field_a = var3[(var5 << 2) + 3];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_8_0 = new rj[]{};
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  bc.a(0, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new rj[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("vi.F(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    vi(String param0, bb param1, boolean param2) {
        this(param0, param1);
        try {
            ((vi) this).field_y = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "vi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Play the game without logging in just yet";
        field_G = "Updates will sent to the email address you've given";
        field_E = 12;
    }
}
