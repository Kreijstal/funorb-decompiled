/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd {
    static sa field_d;
    static int[] field_e;
    static int[] field_b;
    static gk field_c;
    static he[] field_f;
    static he[] field_a;

    abstract int a(int param0, int param1);

    abstract kh a(byte param0);

    public static void a() {
        field_c = null;
        field_b = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_e = null;
    }

    abstract byte[] b(int param0, int param1);

    final static void b() {
        RuntimeException var1 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            wj.d(243, 197, 369, 143, 16777215);
            wj.f(244, 198, 367, 141, 0);
            if (null == gl.field_e) {
              L1: {
                if (sc.field_f == null) {
                  break L1;
                } else {
                  int discarded$1 = sc.field_f.a(ha.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
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
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "wd.L(" + 139 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new sa(10, 2, 2, 0);
        field_b = new int[8192];
        field_e = new int[12];
    }
}
