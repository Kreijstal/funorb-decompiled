/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends si {
    static int[] field_qb;
    static int field_nb;
    static boolean field_mb;
    int field_ob;
    String field_rb;
    String field_pb;

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 >= 75) {
                break L1;
              } else {
                field_mb = false;
                break L1;
              }
            }
            var3_int = 1;
            L2: while (true) {
              if ((param1 ^ -1) >= -2) {
                if (1 != param1) {
                  stackIn_14_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_12_0 = var3_int * param2;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  if (-1 != (1 & param1 ^ -1)) {
                    var3_int = var3_int * param2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param1 = param1 >> 1;
                param2 = param2 * param2;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "fd.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_14_0;
        }
    }

    fd() {
        super(0L, (si) null);
    }

    public static void g(int param0) {
        field_qb = null;
        if (param0 != -30900) {
            field_qb = (int[]) null;
        }
    }

    final static boolean d(byte param0) {
        if (param0 != -21) {
            field_mb = false;
            return qh.field_g;
        }
        return qh.field_g;
    }

    static {
        field_qb = new int[25];
    }
}
