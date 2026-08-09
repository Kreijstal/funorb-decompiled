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
        int var5 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            tm.field_X = h.field_N;
            if (param0) {
              L1: {
                if (-256 == (param3 ^ -1)) {
                  L2: {
                    if ((um.field_r ^ -1) <= -14) {
                      stackIn_12_0 = 0;
                      break L2;
                    } else {
                      stackIn_12_0 = 1;
                      break L2;
                    }
                  }
                  v.field_b = pk.a(stackIn_12_0 != 0, 5731);
                  break L1;
                } else {
                  L3: {
                    if ((param3 ^ -1) > -101) {
                      break L3;
                    } else {
                      if (-106 <= (param3 ^ -1)) {
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("rh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        int var1 = -5 % ((param0 - 16) / 63);
        te.b(false, 93);
    }

    public static void a(byte param0) {
        field_r = null;
        field_u = null;
        if (param0 != 64) {
            field_x = (long[]) null;
        }
        field_y = null;
        field_m = null;
        field_x = null;
        field_w = null;
    }

    rh(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            fieldTemp$0 = dm.field_Bb;
            dm.field_Bb = dm.field_Bb + 1;
            this.field_o = fieldTemp$0 & 65535;
            this.field_v = param3;
            this.field_n = param5;
            this.field_l = param4;
            this.field_t = param0;
            this.field_p = param1;
            this.field_k = param6;
            this.field_s = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "rh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
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
