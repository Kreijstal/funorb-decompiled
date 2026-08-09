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
            field_l = (String) null;
            return (ci) ((Object) new rc());
        }
        return (ci) ((Object) new rc());
    }

    final cg a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        cg stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        cg stackIn_8_0 = null;
        cg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 10) {
              L1: {
                if (null != i.a(108, param1)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              var3_int = stackIn_6_0;
              if (var3_int != 0) {
                stackIn_10_0 = lg.field_c;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = qj.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (cg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("qb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final String b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) 115, param1) != qj.field_c) {
              var3_int = -30 % ((20 - param0) / 40);
              stackIn_4_0 = oe.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = s.field_g;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("qb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void g(int param0) {
        field_l = null;
        if (param0 != 21403) {
            qb.e((byte) -110);
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
          qb.f(-36);
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
        field_k = 0;
        field_l = "Retry";
    }
}
