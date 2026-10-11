/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ah extends qf {
    static ce field_b;
    static dq field_c;

    final static int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0 == 127) {
          param1 = param1 & 8191;
          if (param1 < 4096) {
            if (param1 < 2048) {
              stackIn_19_0 = bm.field_j[param1];
            } else {
              stackIn_19_0 = bm.field_j[4096 - param1];
            }
            return stackIn_19_0;
          }
          if (param1 >= 6144) {
            stackIn_15_0 = -bm.field_j[8192 - param1];
          } else {
            stackIn_15_0 = -bm.field_j[-4096 + param1];
          }
          return stackIn_15_0;
        }
        field_c = (dq) null;
        param1 = param1 & 8191;
        if (param1 < 4096) {
          if (param1 < 2048) {
            stackIn_9_0 = bm.field_j[param1];
          } else {
            stackIn_9_0 = bm.field_j[4096 - param1];
          }
          return stackIn_9_0;
        }
        if (param1 >= 6144) {
          stackIn_5_0 = -bm.field_j[8192 - param1];
        } else {
          stackIn_5_0 = -bm.field_j[-4096 + param1];
        }
        return stackIn_5_0;
    }

    final static boolean a(int param0) {
        if (oo.field_a == -1) {
          if (!no.a(1, 0)) {
            return false;
          }
          oo.field_a = kj.field_d.i((byte) -101);
          kj.field_d.field_n = 0;
        }
        if (oo.field_a == -2) {
          if (!no.a(2, 0)) {
            return false;
          }
          oo.field_a = kj.field_d.i(7088);
          kj.field_d.field_n = 0;
        }
        if (param0 == 2) {
          return no.a(oo.field_a, 0);
        }
        return true;
    }

    final static String c(int param0) {
        if (param0 != 2048) {
          ah.a((byte) -71, 109);
          return eb.field_c;
        }
        return eb.field_c;
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 1) {
          ah.a((byte) -16, 95);
        }
    }

    static {
        field_b = new ce();
    }
}
