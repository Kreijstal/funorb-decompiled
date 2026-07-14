/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends ne {
    int field_q;
    static int field_l;
    static cn field_j;
    static String field_o;
    static String field_n;
    il[] field_k;
    static cn field_i;
    static int[] field_m;
    int field_p;

    final static boolean a(int param0, nh param1) {
        int var2 = -37 / ((70 - param0) / 37);
        return param1.a((byte) 59);
    }

    final static void a(boolean param0, byte param1) {
        mj.a(false, param0, true);
        if (param1 >= 117) {
            return;
        }
        fl.a((byte) -71, -27);
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        fn var4 = null;
        Object var5 = null;
        al var10 = null;
        var5 = null;
        var3 = DungeonAssault.field_K;
        var4 = (fn) (Object) cb.field_a.e(-24172);
        if (param0 >= -74) {
          field_i = null;
          L0: while (true) {
            if (var4 == null) {
              var10 = (al) (Object) hg.field_n.e(-24172);
              L1: while (true) {
                if (var10 != null) {
                  hl.a(param1, -124, var10);
                  var10 = (al) (Object) hg.field_n.a(4);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              ch.a((byte) -16, var4, param1);
              var4 = (fn) (Object) cb.field_a.a(4);
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if (var4 == null) {
              var10 = (al) (Object) hg.field_n.e(-24172);
              L3: while (true) {
                if (var10 != null) {
                  hl.a(param1, -124, var10);
                  var10 = (al) (Object) hg.field_n.a(4);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              ch.a((byte) -16, var4, param1);
              var4 = (fn) (Object) cb.field_a.a(4);
              continue L2;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_m = null;
        field_n = null;
        field_j = null;
        field_i = null;
        if (param0 == 63) {
            return;
        }
        field_l = 29;
    }

    final static q a(int param0, nh param1, int param2, int param3) {
        if (kk.a(param1, param0 + 2, param3, param2)) {
          if (param0 != -1) {
            field_j = null;
            return ec.g(0);
          } else {
            return ec.g(0);
          }
        } else {
          return null;
        }
    }

    fl(int param0, int param1, int param2) {
        ((fl) this).field_k = new il[param2];
        ((fl) this).field_p = param1;
        ((fl) this).field_q = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -1;
        field_o = "Age:";
        field_n = "Your dungeon will be destroyed on:<br><%0>";
        field_m = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
