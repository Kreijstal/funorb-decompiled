/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static boolean field_b;
    static nb field_d;
    static int field_a;
    static km field_c;

    final synchronized static long a(int param0) {
        long var1 = 0L;
        Object var3 = null;
        var1 = System.currentTimeMillis();
        if (v.field_a <= var1) {
          v.field_a = var1;
          if (param0 != 2) {
            var3 = null;
            tm[] discarded$4 = ud.a(-100, (jk) null);
            return var1 + cl.field_b;
          } else {
            return var1 + cl.field_b;
          }
        } else {
          cl.field_b = cl.field_b + (-var1 + v.field_a);
          v.field_a = var1;
          if (param0 == 2) {
            return var1 + cl.field_b;
          } else {
            var3 = null;
            tm[] discarded$5 = ud.a(-100, (jk) null);
            return var1 + cl.field_b;
          }
        }
    }

    public static void a() {
        field_c = null;
        field_d = null;
    }

    final static tm[] a(int param0, jk param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        tm[] var4 = null;
        int var5 = 0;
        tm var6 = null;
        int var7 = 0;
        Object var8 = null;
        nl var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        tm[] stackIn_4_0 = null;
        tm[] stackIn_10_0 = null;
        tm[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        tm[] stackOut_3_0 = null;
        tm[] stackOut_16_0 = null;
        tm[] stackOut_9_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            if (!param1.a(true)) {
              stackOut_3_0 = new tm[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var9 = param1.a(param0 + -624985114);
              L1: while (true) {
                if (var9.field_f != 0) {
                  if (var9.field_f != 2) {
                    L2: {
                      if (param0 == 624968802) {
                        break L2;
                      } else {
                        var8 = null;
                        tm[] discarded$1 = ud.a(42, (jk) null);
                        break L2;
                      }
                    }
                    var13 = (int[]) var9.field_b;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var3 = var10;
                    var4 = new tm[var13.length >> 2];
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackOut_16_0 = (tm[]) var4;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        var6 = new tm();
                        var4[var5] = var6;
                        var6.field_g = var3[var5 << 2];
                        var6.field_e = var3[1 + (var5 << 2)];
                        var6.field_i = var3[2 + (var5 << 2)];
                        var6.field_f = var3[3 + (var5 << 2)];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_9_0 = new tm[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                } else {
                  bc.a(10L, (byte) 95);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("ud.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    static {
    }
}
