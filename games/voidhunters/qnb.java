/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qnb extends rqa {
    static asb field_o;

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var3 = cm.a((byte) -87, param2);
          if (param1 != param0.indexOf(param2)) {
            break L0;
          } else {
            if (-1 != param0.indexOf(var3)) {
              break L0;
            } else {
              L1: {
                L2: {
                  if (param0.startsWith(param2)) {
                    break L2;
                  } else {
                    if (param0.startsWith(var3)) {
                      break L2;
                    } else {
                      if (param0.endsWith(param2)) {
                        break L2;
                      } else {
                        if (!param0.endsWith(var3)) {
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
              return stackIn_11_0 != 0;
            }
          }
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_o = null;
    }

    qnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(byte param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (param0 > -3) {
            qnb.a(-64);
        }
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (!(!hoa.a(param1, false))) {
            return true;
        }
        char[] var6 = wjb.field_o;
        char[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (!(var4 != param1)) {
                return true;
            }
        }
        var2 = ufa.field_p;
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            if (param1 == var4) {
                return true;
            }
        }
        return false;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(179, 123));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        nma discarded$0 = new nma();
    }
}
