/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rfb extends rqa {
    final static boolean a(byte param0, int param1, int param2) {
        if (param0 >= -42) {
            return true;
        }
        return 0 != (param1 & 2048) ? true : false;
    }

    final nc a(nc[] param0, int param1) {
        si.a(12, 62, param0[0].a(109));
        if (param1 >= -119) {
          boolean discarded$2 = rfb.a((byte) 67, -35, -21);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    rfb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
