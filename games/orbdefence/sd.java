/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static im field_a;
    static hj[] field_f;
    static int field_h;
    static String field_d;
    static int field_g;
    static volatile int field_c;
    static l field_b;
    static int[] field_e;

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (!(!param1)) {
            var4 += 4;
        }
        if (param2) {
            var4 += 2;
        }
        if (param3 != 30775) {
            sd.a(false, false, false, -6);
        }
        if (!(!param0)) {
            var4++;
        }
        return s.field_E[var4];
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        field_b = null;
        if (param0 != -30) {
            field_c = 11;
        }
        field_f = null;
        field_d = null;
    }

    final static void a(int param0) {
        mb.field_a = gd.a(0);
        bm.field_d = new sk();
        int var1 = 113 / ((param0 - 25) / 55);
        wj.a(-118, true, true);
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param3 == 0) {
              var4_int = -1;
              var5 = param0;
              L1: while (true) {
                if (var5 >= param2) {
                  var4_int = var4_int ^ -1;
                  stackIn_8_0 = var4_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4_int = var4_int >>> -297926712 ^ vi.field_O[255 & (var4_int ^ param1[var5])];
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 4;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("sd.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static void a(boolean param0, int param1) {
        bd.field_u.a(param0, (byte) -89);
        if (param1 <= 15) {
            sd.a((byte) 74);
        }
    }

    static {
        field_a = new im();
        field_d = "Damage";
        field_g = 0;
        field_e = new int[8192];
        field_c = 0;
    }
}
