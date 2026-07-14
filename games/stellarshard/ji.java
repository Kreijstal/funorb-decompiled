/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param2 = ci.a(param2, (char)param1, "", param1 + 2524);
        var3 = la.a(param0, (byte) -36);
        if ((param2.indexOf(param0) ^ -1) == 0) {
          if (-1 != param2.indexOf(var3)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    static {
    }
}
