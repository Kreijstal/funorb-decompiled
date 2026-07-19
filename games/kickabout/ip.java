/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip {
    static String[] field_d;
    static int field_a;
    static gm[] field_b;
    static hd field_c;

    public static void a(int param0) {
        if (param0 > -60) {
            return;
        }
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            t.c();
            mr.field_Y = new int[260];
            im.field_yb = 11;
            var1_int = 0;
            if (!param0) {
              L1: while (true) {
                if ((var1_int ^ -1) <= -257) {
                  var5 = 256;
                  var1_int = var5;
                  L2: while (true) {
                    if (mr.field_Y.length <= var5) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      mr.field_Y[var5] = 255;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  var2 = 15.0;
                  mr.field_Y[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
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
          throw nb.a((Throwable) ((Object) var1), "ip.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = new String[]{"pgup", "pgdn"};
    }
}
