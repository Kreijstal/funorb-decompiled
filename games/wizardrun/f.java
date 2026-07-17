/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static wg[] field_a;
    static String[] field_b;
    static o[] field_d;
    static boolean field_c;
    static String field_f;
    static boolean field_e;

    final static boolean a(char param0) {
        if (param0 < 65) {
          if (param0 >= 97) {
            if (param0 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (90 < param0) {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final static int[] a(int param0, int param1) {
        int var3 = qj.a(-2942, param0);
        int var4 = wizardrun.a((byte) -110, param0);
        int var5 = qj.a(-2942, param1);
        int var6 = wizardrun.a((byte) 119, param1);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (rk.field_k != null) {
                rk.field_k.field_J.a((byte) 87, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != ik.field_G) {
                ik.field_G.field_H.a((byte) 87, param1);
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 == -117) {
              break L0;
            } else {
              var3 = null;
              f.a((byte) -120, (String[]) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("f.B(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    public static void a() {
        int var1 = 0;
        field_a = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new wg[255];
        for (var0 = 0; field_a.length > var0; var0++) {
            field_a[var0] = new wg();
        }
        field_f = "The requirements and rewards for this achievement are hidden until collected";
    }
}
