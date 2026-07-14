/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends lk {
    static int field_k;
    static String field_l;

    qb(ae param0) {
        super(param0);
    }

    final static ci f(int param0) {
        if (param0 != -17887) {
            field_l = null;
            return (ci) (Object) new rc();
        }
        return (ci) (Object) new rc();
    }

    final cg a(byte param0, String param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= 10) {
          L0: {
            if (null != i.a(108, param1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var3 = stackIn_5_0;
          if (var3 == 0) {
            return qj.field_c;
          } else {
            return lg.field_c;
          }
        } else {
          return null;
        }
    }

    final String b(byte param0, String param1) {
        if (((qb) this).a((byte) 115, param1) == qj.field_c) {
            return s.field_g;
        }
        int var3 = -30 % ((20 - param0) / 40);
        return oe.field_b;
    }

    public static void g(int param0) {
        field_l = null;
        if (param0 != 21403) {
            boolean discarded$0 = qb.e((byte) -110);
        }
    }

    final static boolean e(byte param0) {
        if (param0 == 58) {
          if (null != ob.field_b) {
            if (!sl.field_d.b(48)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ci discarded$5 = qb.f(-36);
          if (null != ob.field_b) {
            if (!sl.field_d.b(48)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
        field_l = "Retry";
    }
}
