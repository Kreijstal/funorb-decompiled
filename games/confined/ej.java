/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static String field_c;
    static boolean field_b;
    static double[] field_a;
    static String field_d;

    final static l a(String param0, mi param1, mi param2, String param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param1.a(param4 ^ -37, param3);
        var6 = param1.a(var5, param0, -75);
        if (param4 != 0) {
          field_b = true;
          return te.a(param2, 10, var6, param1, var5);
        } else {
          return te.a(param2, 10, var6, param1, var5);
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        if (!param0) {
          var2 = null;
          l discarded$2 = ej.a((String) null, (mi) null, (mi) null, (String) null, -110);
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final boolean a(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= -125) {
          if ((Object) (Object) rh.field_ab != this) {
            if (this != (Object) (Object) fm.field_a) {
              if ((Object) (Object) wd.field_f == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var3 = null;
          l discarded$5 = ej.a((String) null, (mi) null, (mi) null, (String) null, 120);
          if ((Object) (Object) rh.field_ab != this) {
            if (this == (Object) (Object) fm.field_a) {
              return true;
            } else {
              L0: {
                if ((Object) (Object) wd.field_f != this) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, String param1) {
        if (param0 != 0) {
          field_d = null;
          System.out.println("Error: " + pi.a("%0a", "\n", 22232, param1));
          return;
        } else {
          System.out.println("Error: " + pi.a("%0a", "\n", 22232, param1));
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_c = "Create a free Account";
        field_a = new double[]{0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.3, 0.3, 0.1, 0.3, 0.1, 0.0, 0.0, 0.5, 0.2, 0.5, 0.2, 0.1, 0.2};
    }
}
