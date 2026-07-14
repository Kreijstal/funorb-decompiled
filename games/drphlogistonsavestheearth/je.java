/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends gi {
    int field_m;
    static int[] field_k;
    static vd field_i;
    int field_p;
    int field_l;
    int field_h;
    static int field_j;
    int field_n;
    int field_o;

    public static void a(byte param0) {
        field_k = null;
        if (param0 <= 9) {
            boolean discarded$0 = je.a('3', 12);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 > 79) {
          if (param0 != 160) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    je(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((je) this).field_p = param3;
        ((je) this).field_m = param0;
        ((je) this).field_o = param2;
        ((je) this).field_l = param1;
        ((je) this).field_n = param4;
        ((je) this).field_h = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[8192];
        field_i = new vd();
        field_j = 250;
    }
}
