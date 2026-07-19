/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static hd field_a;
    static int[] field_b;

    final static void b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            m.field_d = new int[16];
            if (!param0) {
              var1_int = 0;
              L1: while (true) {
                if (var1_int >= m.field_d.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  m.field_d[var1_int] = (var1_int << -923243614) * 65793;
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "g.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_a = (hd) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_b = new int[5];
        field_b[0] = 286720;
        field_b[3] = 163840;
        field_b[4] = 327680;
        field_b[2] = 163840;
        field_b[1] = 163840;
    }
}
