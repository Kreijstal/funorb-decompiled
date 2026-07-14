/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lqa extends ei {
    boolean field_j;
    boolean field_h;
    boolean field_f;
    boolean field_e;
    boolean field_k;
    boolean field_i;
    static String field_g;
    boolean field_d;

    public final String toString() {
        String[] var2 = new String[]{"Pure Java", "OpenGL", "SSE", "DirectX", "Pure Java (Z-Buffered)", "OpenGL+"};
        String[] var1 = var2;
        return var2[((lqa) this).field_b];
    }

    final boolean a(ei param0, int param1) {
        lqa var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        if (param1 == 55) {
          var3 = (lqa) (Object) param0;
          if (super.a(param0, 55)) {
            L0: {
              if (var3.field_j) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            if (stackIn_7_0 != (((lqa) this).field_j ? 1 : 0)) {
              if (((lqa) this).field_a == var3.field_a) {
                L1: {
                  if (var3.field_k) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L1;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L1;
                  }
                }
                if (stackIn_14_0 == (var3.field_k ? 1 : 0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    lqa(int param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8, boolean param9, boolean param10) {
        super(param0, param1);
        ((lqa) this).field_j = param2 ? true : false;
        ((lqa) this).field_i = param5 ? true : false;
        ((lqa) this).field_f = param10 ? true : false;
        ((lqa) this).field_k = param4 ? true : false;
        ((lqa) this).field_e = param7 ? true : false;
        ((lqa) this).field_d = param8 ? true : false;
        ((lqa) this).field_h = param9 ? true : false;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != 102) {
            field_g = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
