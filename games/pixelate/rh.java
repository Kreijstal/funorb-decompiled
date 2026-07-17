/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends fa {
    int field_l;
    int field_s;
    static gi[] field_u;
    int field_n;
    long field_q;
    int[] field_k;
    int field_p;
    int field_t;
    int field_o;
    int field_v;
    static long[] field_x;
    static String field_m;
    static ak field_y;
    static String field_w;
    static String field_r;

    final static void a(boolean param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            tm.field_X = h.field_N;
            if (param0) {
              L1: {
                if (param3 == 255) {
                  L2: {
                    if (um.field_r >= 13) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L2;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                  v.field_b = pk.a(stackIn_12_0 != 0, 5731);
                  break L1;
                } else {
                  L3: {
                    if (param3 < 100) {
                      break L3;
                    } else {
                      if (param3 <= 105) {
                        v.field_b = fk.a((byte) 117, param2);
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  v.field_b = pa.a(param3, param1, (byte) -120);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("rh.B(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param3 + 41);
        }
    }

    final static void b(byte param0) {
        int var1 = -5 % ((param0 - 16) / 63);
        te.b(false, 93);
    }

    public static void a(byte param0) {
        field_r = null;
        field_u = null;
        field_y = null;
        field_m = null;
        field_x = null;
        field_w = null;
    }

    rh(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            int fieldTemp$0 = dm.field_Bb;
            dm.field_Bb = dm.field_Bb + 1;
            ((rh) this).field_o = fieldTemp$0 & 65535;
            ((rh) this).field_v = param3;
            ((rh) this).field_n = param5;
            ((rh) this).field_l = param4;
            ((rh) this).field_t = param0;
            ((rh) this).field_p = param1;
            ((rh) this).field_k = param6;
            ((rh) this).field_s = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "rh.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_u = new gi[255];
        field_x = new long[32];
        for (var0 = 0; var0 < field_u.length; var0++) {
            field_u[var0] = new gi();
        }
        field_m = "Rating";
        field_r = "Unpacking sound effects";
        field_w = "<%0> is not a member, and cannot play with the current options.";
    }
}
