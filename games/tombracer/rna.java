/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rna extends ela {
    final static short[] a(short[] param0, boolean param1, int param2) {
        short[] var3 = null;
        short[] var4 = null;
        if (!param1) {
          return null;
        } else {
          var4 = new short[param2];
          var3 = var4;
          lua.a(param0, 0, var4, 0, param2);
          return var4;
        }
    }

    final bfa a(bfa[] param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return new bfa((Object) (Object) jd.a(false));
    }

    rna(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
