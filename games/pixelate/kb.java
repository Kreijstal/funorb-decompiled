/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kb extends ch implements bp {
    static String field_M;
    static String field_J;
    static ob field_L;
    static int[] field_N;
    static String[] field_I;
    private oa field_K;

    final static void a(int param0, cb param1, vi param2, boolean param3, java.awt.Component param4, int param5) {
        Object var7 = null;
        if (param5 <= 102) {
          var7 = null;
          kb.a(-5, (cb) null, (vi) null, false, (java.awt.Component) null, -3);
          oh.a(1024, param0, param3, param0, (byte) -110, param4, param1, param2);
          return;
        } else {
          oh.a(1024, param0, param3, param0, (byte) -110, param4, param1, param2);
          return;
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        var4 = -101 % ((-56 - param2) / 62);
        var3 = bc.b(0, param1);
        if (-1 == param0.indexOf(param1)) {
          if (0 == (param0.indexOf(var3) ^ -1)) {
            if (!param0.startsWith(param1)) {
              if (!param0.startsWith(var3)) {
                if (!param0.endsWith(param1)) {
                  if (param0.endsWith(var3)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    void a(oa param0, int param1) {
        ((kb) this).field_K = param0;
        ((kb) this).field_K.field_g = (kb) this;
        if (param1 != 20672) {
            field_M = null;
        }
    }

    public static void a(byte param0) {
        field_I = null;
        field_N = null;
        field_J = null;
        field_L = null;
        field_M = null;
        if (param0 != 125) {
            field_L = null;
        }
    }

    abstract int l(int param0);

    abstract boolean m(int param0);

    public final ml a(int param0) {
        if (param0 != 1) {
            return null;
        }
        return (ml) (Object) ((kb) this).field_K;
    }

    abstract int e(byte param0);

    abstract int c(boolean param0);

    kb(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new int[1024];
        field_M = "Hide players in <%0>'s game";
        field_J = "Start Game";
        field_I = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
