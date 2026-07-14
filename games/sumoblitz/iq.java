/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iq {
    final static byte[] a(Object param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        nn var5 = null;
        if (param0 != null) {
          if (param0 instanceof byte[]) {
            var4 = (byte[]) param0;
            return ad.a(var4, param2, param3, (byte) 53);
          } else {
            if (!(param0 instanceof nn)) {
              if (param1 != 14381) {
                return null;
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              var5 = (nn) param0;
              return var5.a(param3, param2, 15747);
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
