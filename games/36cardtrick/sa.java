/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static int field_a;
    static int field_d;
    static int field_c;
    static int field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        jc.field_O.a(param7, param5, param0, param6, param3, param1, param2);
        if (param4 != 0) {
            field_c = 35;
        }
    }

    final static void a(int param0) {
        int var5 = Main.field_T;
        int var2 = -116 / ((39 - param0) / 61);
        int[] var6 = mb.field_c;
        int[] var1 = var6;
        int var3 = 0;
        int var4 = var6.length;
        while (var4 > var3) {
            int incrementValue$0 = var3;
            var3++;
            var6[incrementValue$0] = 0;
            int incrementValue$1 = var3;
            var3++;
            var6[incrementValue$1] = 0;
            int incrementValue$2 = var3;
            var3++;
            var6[incrementValue$2] = 0;
            int incrementValue$3 = var3;
            var3++;
            var6[incrementValue$3] = 0;
            int incrementValue$4 = var3;
            var3++;
            var6[incrementValue$4] = 0;
            int incrementValue$5 = var3;
            var3++;
            var6[incrementValue$5] = 0;
            int incrementValue$6 = var3;
            var3++;
            var6[incrementValue$6] = 0;
            int incrementValue$7 = var3;
            var3++;
            var6[incrementValue$7] = 0;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        var3 = 1;
        L0: while (true) {
          if (1 >= param2) {
            if (-2 == (param2 ^ -1)) {
              return var3 * param1;
            } else {
              if (param0 != 22316) {
                sa.a(-72);
                return var3;
              } else {
                return var3;
              }
            }
          } else {
            L1: {
              if ((1 & param2) != 0) {
                var3 = var3 * param1;
                break L1;
              } else {
                break L1;
              }
            }
            param2 = param2 >> 1;
            param1 = param1 * param1;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = 0;
    }
}
