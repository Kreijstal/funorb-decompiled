/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends gg {
    static fj field_n;
    static ej field_p;
    long field_m;
    byte[] field_l;
    static pb[] field_k;
    int field_o;

    final static boolean a(int param0) {
        int discarded$0 = 0;
        if (param0 > -10) {
            discarded$0 = fa.d(-118);
            return true;
        }
        return true;
    }

    public static void a(boolean param0) {
        int discarded$0 = 0;
        field_p = null;
        if (param0) {
            discarded$0 = fa.d(64);
            field_k = null;
            field_n = null;
            return;
        }
        field_k = null;
        field_n = null;
    }

    final static int d(int param0) {
        mc.field_c.a((byte) -123);
        if (param0 != 0) {
            field_p = (ej) null;
            if (!od.field_v.f(26348)) {
                return vc.a((byte) 35);
            }
            return 0;
        }
        if (!(od.field_v.f(26348))) {
            return vc.a((byte) 35);
        }
        return 0;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        u var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = stellarshard.field_B;
        try {
          L0: {
            var4 = (u) ((Object) i.field_c.b(-79));
            if (param1 <= -49) {
              L1: while (true) {
                if (var4 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  ii.a(var4, param0, (byte) 107);
                  var4 = (u) ((Object) i.field_c.b((byte) 95));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "fa.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    fa(long param0, int param1, byte[] param2) {
        try {
            this.field_m = param0;
            this.field_l = param2;
            this.field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "fa.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
