/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rr extends o {
    static int field_t;

    final static a a(pf param0, int param1, int param2, int param3) {
        a dupTemp$1 = null;
        a var5 = null;
        int var6 = 0;
        a var7 = null;
        a stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var7 = (a) ((Object) param0.d(param3 ^ param3));
              L1: while (true) {
                if (var7 != null) {
                  dupTemp$1 = var7.b(-125, param2, param1);
                  var5 = dupTemp$1;
                  if (null != dupTemp$1) {
                    stackIn_10_0 = (a) (var5);
                    break L0;
                  } else {
                    var7 = (a) ((Object) param0.a((byte) -71));
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("rr.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    rr(nq param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_J, -1, 2147483647, false);
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        try {
            if (!(!param2)) {
                rg.a((byte) 93, param0.field_q + param3, param0.field_n, param1 - -param0.field_m, param0.field_x);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "rr.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(vd param0, pf param1, byte param2) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        vd var4 = null;
        int var5 = 0;
        pf var6 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = param1.d(0);
            L1: while (true) {
              if (var3 == null) {
                if (param2 == 64) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = (pf) null;
                  rr.a((pf) null, 76, -63, 75);
                  return false;
                }
              } else {
                var4 = (vd) ((Object) var3);
                if (var4.a((byte) -118, param0)) {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3 = param1.a((byte) -71);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("rr.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    rr(int param0) {
        this(gn.field_u, param0);
    }

    static {
    }
}
