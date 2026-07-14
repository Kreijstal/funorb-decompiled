/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mca extends rqa {
    final static byte[] a(boolean param0, int param1, faa param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        var4 = param2.i(0, param1);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param3 = new byte[var4];
            break L0;
          }
          if (!param0) {
            L2: {
              var5 = param2.i(0, 3);
              var6 = (byte)param2.i(0, 8);
              if (0 < var5) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param3[var7] = (byte)(param2.i(0, var5) + var6);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var4 <= var7) {
                    break L2;
                  } else {
                    param3[var7] = (byte)var6;
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param3;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    mca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(37, 89));
    }

    static {
    }
}
