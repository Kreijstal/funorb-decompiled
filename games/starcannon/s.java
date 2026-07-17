/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static rk field_e;
    int field_j;
    static String field_d;
    static pf field_f;
    static int[] field_b;
    static String field_l;
    static String field_h;
    static String field_g;
    static int[] field_k;
    static String field_a;
    static sg field_i;
    static boolean field_c;

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        field_e = null;
        field_i = null;
        field_k = null;
        field_g = null;
        field_b = null;
        field_d = null;
        int var1 = 0;
        field_l = null;
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(String param0, char param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var11 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param3 == -10) {
                break L1;
              } else {
                var12 = null;
                String discarded$5 = s.a((String) null, 'ﾛ', (String) null, (byte) -27);
                break L1;
              }
            }
            L2: {
              var4_int = param0.length();
              var5 = param2.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (var7 != 0) {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param0.indexOf((int) param1, var8_int);
                  if (var8_int >= 0) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param0.indexOf((int) param1, var9);
              if (var10 >= 0) {
                StringBuilder discarded$6 = var8.append(param0.substring(var9, var10));
                StringBuilder discarded$7 = var8.append(param2);
                var9 = 1 + var10;
                continue L4;
              } else {
                StringBuilder discarded$8 = var8.append(param0.substring(var9));
                stackOut_13_0 = var8.toString();
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("s.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 41);
        }
        return stackIn_14_0;
    }

    s(int param0) {
        ((s) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new rk();
        field_b = new int[]{1, 3, 3, 5, 5, 10, 2, 2, 3, 1, 2, 3, 1, 2, 3};
        field_d = "Play free version";
        field_f = new pf();
        field_g = "Waiting for fonts";
        field_a = "Use the arrow keys to move the Nova Ray.<br><br>Press SPACE or CTRL to fire the Nova Ray's lasers and shoot the Paragulan attack ships out the sky.";
        field_l = "Log in";
        field_h = "BOSS HEALTH";
        field_k = new int[256];
        field_c = false;
    }
}
