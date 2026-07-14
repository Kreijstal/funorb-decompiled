/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static volatile int field_a;
    hj field_b;
    static int[] field_c;
    static String field_d;
    private String field_e;

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -29) {
            field_c = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 10) {
          L0: {
            boolean discarded$11 = ((uf) this).b((byte) -68);
            if (null == ((uf) this).field_b) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == ((uf) this).field_b) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final hj a(int param0) {
        if (((uf) this).field_b != null) {
          return ((uf) this).field_b;
        } else {
          if (param0 != 8192) {
            int discarded$2 = uf.a(-37, (String) null, (byte) 101, true, 47, (String) null, (String) null);
            ((uf) this).field_b = wd.b(((uf) this).field_e, (byte) -63);
            return wd.b(((uf) this).field_e, (byte) -63);
          } else {
            ((uf) this).field_b = wd.b(((uf) this).field_e, (byte) -63);
            return wd.b(((uf) this).field_e, (byte) -63);
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        qk.a(param1, param0, true, true, in.field_h, qf.field_j, r.field_c);
        for (var2 = 0; in.field_h > var2; var2++) {
            im.field_h[param1 + var2] = var2;
        }
        qk.a(param1 - -param1, param1, true, false, in.field_h - -param1, we.field_j, dn.field_t);
        if (!(param1 >= in.field_h)) {
            in.field_h = param1;
        }
    }

    uf(String param0) {
        ((uf) this).field_e = param0;
        ((uf) this).field_b = null;
    }

    final static int a(int param0, String param1, byte param2, boolean param3, int param4, String param5, String param6) {
        int var9 = -6 / ((0 - param2) / 52);
        io var7 = new io(param5);
        io var8 = new io(param1);
        return cc.a(65500, param0, param4, var7, param3, param6, var8);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = new int[8192];
        field_d = "Waiting for fonts";
    }
}
