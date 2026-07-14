/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nqa {
    static boolean field_c;
    static boolean[][] field_b;
    static volatile boolean field_a;

    final static Object a(ij param0, int param1) {
        ksa var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (ls.field_q) {
          if (param1 == 12642) {
            if (param0 != null) {
              var2 = param0.d(0);
              L0: while (true) {
                if (var2 != null) {
                  if (!VoidHunters.a(true, (Object) (Object) var2)) {
                    var2 = param0.a((byte) 98);
                    continue L0;
                  } else {
                    return (Object) (Object) var2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        if (param0 != -30) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_a = true;
    }
}
