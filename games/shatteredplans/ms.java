/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ms {
    static String field_g;
    static int[][] field_c;
    static bc field_d;
    static String field_f;
    static int field_a;
    static String field_b;
    static String field_h;
    static int[] field_e;

    abstract void a(ob param0, byte param1);

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param2 = fr.a(param2, 1, '_', "");
        var3 = dn.a(param0, true);
        if (param1 == -53) {
          if (-1 == param2.indexOf(param0)) {
            if ((param2.indexOf(var3) ^ -1) != 0) {
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
          var4 = null;
          boolean discarded$4 = ms.a((String) null, (byte) 116, (String) null);
          if (-1 != param2.indexOf(param0)) {
            return true;
          } else {
            L0: {
              if ((param2.indexOf(var3) ^ -1) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_d = null;
        field_g = null;
        field_f = null;
        field_b = null;
        if (param0 != -1) {
          ms.a(42);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static void b(int param0) {
        Object var2 = null;
        if (param0 != 20975) {
          L0: {
            var2 = null;
            boolean discarded$6 = ms.a((String) null, (byte) -111, (String) null);
            if (dp.field_t) {
              gf.h(gf.field_i, gf.field_a, -gf.field_i + gf.field_l, -gf.field_a + gf.field_f);
              ua.field_f.b(false, -104);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (dp.field_t) {
              gf.h(gf.field_i, gf.field_a, -gf.field_i + gf.field_l, -gf.field_a + gf.field_f);
              ua.field_f.b(false, -104);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    abstract ds a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Names cannot contain consecutive spaces";
        field_c = new int[][]{new int[4], new int[4], new int[4], new int[4]};
        field_a = 0;
        field_f = "Total projects used";
        field_b = "1 point, <%0> points per turn.";
        field_e = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_h = "Sol is owned by";
    }
}
