/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static dl field_a;
    static int field_c;
    static int field_b;

    final static boolean a(String param0, boolean param1) {
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (!param1) {
          if (param0 != null) {
            if (param0.length() < gl.field_j) {
              return true;
            } else {
              L0: {
                if (param0.length() > mi.field_v) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          field_a = null;
          if (param0 != null) {
            if (param0.length() >= gl.field_j) {
              if (param0.length() <= mi.field_v) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static dl[] a(int param0, String param1, String param2, db param3) {
        int var4 = param3.a(param2, param0);
        int var5 = param3.a(param0 ^ 2861, param1, var4);
        return wl.a(var5, var4, param3, 100);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -125) {
            Object var2 = null;
            boolean discarded$0 = bf.a((String) null, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
