/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eta implements dja {
    static java.awt.Dimension field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 > 109) {
            return;
        }
        field_a = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = null;
            return (tv[]) (Object) new ara[param1];
        }
        return (tv[]) (Object) new ara[param1];
    }

    final static void a(byte param0, mm param1) {
        mm var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        param1.b(-3846);
        var2 = (mm) (Object) kja.field_E.d(0);
        if (param0 >= 99) {
          L0: while (true) {
            if (var2 != null) {
              if (var2.a(param1, -128)) {
                var2 = (mm) (Object) kja.field_E.a((byte) 28);
                continue L0;
              } else {
                if (var2 == null) {
                  kja.field_E.b(-10258, (ksa) (Object) param1);
                  return;
                } else {
                  al.a((ksa) (Object) param1, (ksa) (Object) var2, 2);
                  return;
                }
              }
            } else {
              if (var2 == null) {
                kja.field_E.b(-10258, (ksa) (Object) param1);
                return;
              } else {
                al.a((ksa) (Object) param1, (ksa) (Object) var2, 2);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != -1104) {
            return false;
        }
        return (param2 & 2048 ^ -1) != -1 ? true : false;
    }

    public final tv a(byte param0) {
        int var2 = 31 % ((param0 - -64) / 50);
        return (tv) (Object) new ara();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.awt.Dimension(640, 480);
        field_b = 4;
    }
}
