/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd extends wc {
    boolean field_s;
    boolean field_m;
    static String[] field_v;
    boolean field_q;
    static dk field_p;
    float field_o;
    boolean field_t;
    static int field_n;
    static int[] field_l;
    static int field_r;
    static Boolean field_u;
    boolean field_w;
    boolean field_x;

    abstract qm c(float param0, int param1);

    abstract qm a(byte param0);

    abstract qm k(int param0);

    abstract qm a(float param0, boolean param1);

    final static hj b(String param0, byte param1) {
        Object var3 = null;
        if (param1 != -63) {
          var3 = null;
          hj discarded$2 = wd.b((String) null, (byte) -20);
          return dl.a(fb.field_i, param0, false, "");
        } else {
          return dl.a(fb.field_i, param0, false, "");
        }
    }

    abstract qm a(int param0, float param1);

    abstract qm o(int param0);

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int[][] stackIn_3_0 = null;
        int[][] stackOut_2_0 = null;
        int[][] stackOut_1_0 = null;
        L0: {
          var3 = HoldTheLine.field_D;
          if (!param0) {
            stackOut_2_0 = fk.field_b;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = dl.field_k;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        em.field_i = stackIn_3_0;
        if (param1 != 97) {
          return;
        } else {
          var2 = 0;
          L1: while (true) {
            if (l.field_a.length <= var2) {
              return;
            } else {
              if (-14 != (var2 ^ -1)) {
                ((ti) (Object) l.field_a[var2]).e(-127);
                var2++;
                var2++;
                continue L1;
              } else {
                ((ec) (Object) l.field_a[var2]).a(true, 6267);
                var2++;
                var2++;
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    abstract qm h(int param0);

    public static void i(int param0) {
        field_u = null;
        field_v = null;
        if (param0 != -3369) {
            return;
        }
        field_p = null;
        field_l = null;
    }

    final static String j(int param0) {
        if (param0 != -14) {
            return null;
        }
        return sg.field_Y;
    }

    abstract qm m(int param0);

    abstract qm a(float param0, int param1);

    abstract qm l(int param0);

    abstract qm c(boolean param0);

    abstract qm b(float param0, int param1);

    abstract qm n(int param0);

    wd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[255];
        field_l = new int[]{24576, 7560980, 8421504, 0};
    }
}
