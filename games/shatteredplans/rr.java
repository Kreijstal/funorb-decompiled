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
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            return null;
          }
          var7 = (a) (param0.d(param3 ^ param3));
          while (var7 != null) {
            dupTemp$1 = var7.b(-125, param2, param1);
            var5 = dupTemp$1;
            if (null != dupTemp$1) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
            var7 = (a) (param0.a((byte) -71));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("rr.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    rr(nq param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_J, -1, 2147483647, false);
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        try {
          if (param2) {
            rg.a((byte) 93, param0.field_q + param3, param0.field_n, param1 + param0.field_m, param0.field_x);
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = param1.d(0);
          while (var3 != null) {
            var4 = (vd) (var3);
            if (var4.a((byte) -118, param0)) {
              return true;
            }
            var3 = param1.a((byte) -71);
          }
          if (param2 == 64) {
            return false;
          }
          var6 = (pf) null;
          rr.a((pf) null, 76, -63, 75);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("rr.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    rr(int param0) {
        this(gn.field_u, param0);
    }

    static {
    }
}
