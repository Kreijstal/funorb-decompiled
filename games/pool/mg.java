/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static int field_d;
    static String field_b;
    static String field_a;
    static vh field_c;

    final static im a(int param0, long param1) {
        if (param0 != 0) {
            boolean discarded$0 = mg.a(-80);
            return (im) (Object) ln.field_n.a(param1, false);
        }
        return (im) (Object) ln.field_n.a(param1, false);
    }

    final static boolean a(int param0) {
        int var1 = 0;
        var1 = -30 / ((-4 - param0) / 49);
        if (jd.field_c != null) {
          if (ta.field_a != tl.field_J) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 >= -40) {
            boolean discarded$0 = mg.a(true);
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          L0: {
            if (hk.b(-18)) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if (0 < mp.field_V) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> is already on your ignore list.";
        field_a = "<%0> and <%1> are out of lives!";
    }
}
