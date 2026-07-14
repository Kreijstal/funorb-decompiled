/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ug extends ib implements je {
    static int field_I;
    static String field_J;
    private an field_H;
    static String field_K;

    public final ia a(int param0) {
        if (param0 != -11011) {
            int discarded$0 = ((ug) this).i(111);
            return (ia) (Object) ((ug) this).field_H;
        }
        return (ia) (Object) ((ug) this).field_H;
    }

    ug(int param0, int param1, int param2, int param3, ub param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static mh a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, dh param8, int param9, int param10, int param11, int param12) {
        mh var13 = null;
        Object var14 = null;
        var13 = new mh(0L, (mh) null);
        var13.field_Jb = se.a(param0, (byte) -18, param3);
        var13.field_Gb = se.a(param12, (byte) -18, param7);
        var13.field_D = se.a(param11, (byte) -18, param1);
        var13.field_pb = se.a(param5, (byte) -18, param4);
        if (param2 < 96) {
          var14 = null;
          mh discarded$1 = ug.a(-26, -58, (byte) 79, 5, 18, -27, 69, 4, (dh) null, 4, -79, 47, -32);
          var13.field_Ab = se.a(param6, (byte) -18, param10);
          var13.field_X = param9;
          var13.field_O = param8;
          return var13;
        } else {
          var13.field_Ab = se.a(param6, (byte) -18, param10);
          var13.field_X = param9;
          var13.field_O = param8;
          return var13;
        }
    }

    abstract int i(int param0);

    public static void h(int param0) {
        field_J = null;
        field_K = null;
        if (param0 != 0) {
            Object var2 = null;
            mh discarded$0 = ug.a(102, -93, (byte) 33, 30, -107, 27, -54, 36, (dh) null, 50, -58, -25, 44);
        }
    }

    void a(an param0, byte param1) {
        ((ug) this).field_H = param0;
        ((ug) this).field_H.field_l = (ug) this;
        if (param1 != -12) {
            ((ug) this).field_H = null;
        }
    }

    abstract int i(byte param0);

    abstract int a(byte param0);

    abstract boolean h(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "You must be a member to play with the current options.";
        field_K = "<%0> has entered another game.";
    }
}
