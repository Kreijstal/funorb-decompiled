/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static String field_b;
    static String field_c;
    static String field_a;

    final static wb a(int param0, int param1, int param2, byte param3, int param4, int[] param5, int param6, int param7, int param8) {
        wb var9 = null;
        if (param3 != -66) {
          field_c = null;
          var9 = new wb(param6, param1, param4, param7, param2, param0, param5);
          hj.field_k.a((byte) 91, (pi) (Object) var9);
          ab.a(param3 + -20614, param8, var9);
          return var9;
        } else {
          var9 = new wb(param6, param1, param4, param7, param2, param0, param5);
          hj.field_k.a((byte) 91, (pi) (Object) var9);
          ab.a(param3 + -20614, param8, var9);
          return var9;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "New obstacles to overcome: freezing water";
        field_c = "Superior aqualung: Extends time that can be spent underwater further.";
        field_a = "Ice bomb: Turns water into loose ice blocks and freezes ice blocks back onto the Super Volcano.";
    }
}
