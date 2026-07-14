/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir {
    static String field_b;
    static String field_c;
    int field_f;
    static int field_a;
    int field_d;
    static String field_e;

    public static void a(byte param0) {
        if (param0 <= 96) {
            return;
        }
        field_c = null;
        field_e = null;
        field_b = null;
    }

    public final String toString() {
        return "(" + ((ir) this).field_f + "," + ((ir) this).field_d + ")";
    }

    final static boolean a(int param0, int param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 >= -69) {
          L0: {
            ir.a((byte) 123);
            if ((33 & param0) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((33 & param0) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static byte[] a(Object param0, int param1, boolean param2) {
        byte[] var3 = null;
        qu var4 = null;
        if (param0 == null) {
            return null;
        }
        if (param1 != 13588) {
            field_c = null;
            if (param0 instanceof byte[]) {
                var3 = (byte[]) param0;
                if (!param2) {
                    return var3;
                }
                return lh.a(var3, 6711);
            }
            if (!(!(param0 instanceof qu))) {
                var4 = (qu) param0;
                return var4.a(false);
            }
            throw new IllegalArgumentException();
        }
        if (param0 instanceof byte[]) {
            var3 = (byte[]) param0;
            if (!param2) {
                return var3;
            }
            return lh.a(var3, 6711);
        }
        if (!(!(param0 instanceof qu))) {
            var4 = (qu) param0;
            return var4.a(false);
        }
        throw new IllegalArgumentException();
    }

    public ir() {
    }

    ir(int param0, int param1) {
        ((ir) this).field_f = param0;
        ((ir) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Wall Shadows: ";
        field_c = "I think the ceiling has a crush on you. Stay still too long, and you'll find yourself in a jam.";
        field_e = "All players have left <%0>'s game.";
    }
}
