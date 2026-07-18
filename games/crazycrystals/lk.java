/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lk {
    static String field_b;
    static double field_a;

    abstract int a(int param0, int param1);

    abstract byte[] a(int param0, boolean param1);

    public static void a(byte param0) {
        field_b = null;
    }

    final static void a(db param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        jg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        md var8 = null;
        int var9 = 0;
        md var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var8 = new md(param0.a(7693, "", "logo.fo3d"));
            var10 = var8;
            var3 = var10.h(255);
            var10.f((byte) 50);
            ud.field_S = rd.a(var10, -95);
            je.field_d = new int[var3][];
            rn.field_o = new jg[var3];
            var4 = 0;
            L1: while (true) {
              if (var3 <= var4) {
                var10.k(-2321);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = rn.field_o[var9];
                    var5.a(-30866, 6, 6, 1, 6);
                    var5.b(32767);
                    var6 = new int[]{var5.field_j + var5.field_x >> 1, var5.field_C - -var5.field_E >> 1, var5.field_p - -var5.field_e >> 1};
                    je.field_d[var9] = var6;
                    var5.a(-var6[0], -var6[2], -var6[1], 0);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                rn.field_o[var4] = nh.a(-31741, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("lk.D(");
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 65 + ')');
        }
    }

    abstract qg a(int param0);

    final static boolean b(int param0) {
        return sg.field_b == l.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = Math.atan2(1.0, 0.0);
    }
}
