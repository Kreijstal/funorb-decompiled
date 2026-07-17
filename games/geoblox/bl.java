/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static String field_a;

    final static void c(int param0) {
    }

    final static boolean b(int param0) {
        if (mi.field_C >= 20) {
          if (fj.f(-31456)) {
            if (ik.field_a > 0) {
              if (ck.b(0)) {
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
        } else {
          return true;
        }
    }

    final static int a(int param0, byte param1) {
        param0 = (-715827883 & param0 >>> 1) + (1431655765 & param0);
        if (param1 != 70) {
          field_a = null;
          param0 = (param0 & 858993459) - -(param0 >>> 2 & 858993459);
          param0 = param0 + (param0 >>> 4) & 252645135;
          param0 = param0 + (param0 >>> 8);
          param0 = param0 + (param0 >>> 16);
          return param0 & 255;
        } else {
          param0 = (param0 & 858993459) - -(param0 >>> 2 & 858993459);
          param0 = param0 + (param0 >>> 4) & 252645135;
          param0 = param0 + (param0 >>> 8);
          param0 = param0 + (param0 >>> 16);
          return param0 & 255;
        }
    }

    public static void a(int param0) {
        if (param0 != -9751) {
            int discarded$0 = bl.a(31, (byte) -123);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Achievements";
    }
}
