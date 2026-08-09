/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends rf {
    private int field_h;
    private int field_j;
    private int field_k;
    private int field_l;
    private int field_i;
    private int field_f;
    static String field_g;

    final static void a(int param0, int param1, hb param2) {
        ia var6 = null;
        int var4 = 0;
        try {
            var6 = d.field_b;
            var6.d((byte) 52, param1);
            var6.field_g = var6.field_g + 1;
            var4 = var6.field_g;
            var6.a(1, -84);
            var6.a(param2.field_f, -60);
            var6.a(param2.field_l, -114);
            var6.c((byte) -114, param2.field_i);
            int var5 = 122 % ((40 - param0) / 43);
            var6.c((byte) -107, param2.field_h);
            var6.c((byte) -93, param2.field_k);
            var6.c((byte) -118, param2.field_j);
            var6.b((byte) -101, var4);
            var6.b(var6.field_g - var4, 31700);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "hb.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static hl[] a(int param0, String param1, ue param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hl[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -990) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            var4_int = param2.a(param1, false);
            var5 = param2.a(param3, true, var4_int);
            stackIn_3_0 = ge.a(9, var4_int, param2, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("hb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    hb(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_i = param2;
        this.field_h = param3;
        this.field_j = param5;
        this.field_k = param4;
        this.field_l = param1;
        this.field_f = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = StarCannon.field_A;
        try {
            while (true) {
                param6--;
                if (param6 < 0) {
                    break;
                }
                var17 = param7;
                var10 = var17;
                var11 = param1;
                var12 = param8;
                var13 = param4;
                var14 = param3;
                var15 = 8355711 & var17[var11] >> -463938783;
                var10[var11] = var15 + w.a(var12 >> -470949535, 16711680) + ((w.a(var13, 33423790) >> -667642711) + (w.a(var14, 33500947) >> -1761525007));
                param3 = param3 + param0;
                param1++;
                param8 = param8 + param2;
                param4 = param4 + param9;
            }
            int var10_int = -101 % ((param5 - 31) / 36);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "hb.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 9681) {
            hb var2 = (hb) null;
            hb.a(6, 30, (hb) null);
        }
    }

    static {
        field_g = "ENGINES - Power up these to increase the Nova Ray's dodging ability.";
    }
}
