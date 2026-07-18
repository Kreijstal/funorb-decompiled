/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static boolean field_c;
    static String field_a;
    static byte[] field_b;

    public static void b(int param0) {
        field_a = null;
        if (param0 != 33423361) {
            field_a = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int[] var12 = null;
        int var12_int = 0;
        int[] var13 = null;
        int var13_int = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = Torquing.field_u;
        try {
          L0: {
            var5_int = 0;
            var7 = 0;
            var6 = param1;
            var8 = -param1;
            var9 = -1;
            di.a(-param1 + param0, (byte) 54, param3, qd.field_a[param4], param0 - -param1);
            L1: while (true) {
              if (var5_int >= var6) {
                break L0;
              } else {
                L2: {
                  var9 += 2;
                  var5_int++;
                  var8 = var8 + var9;
                  if (var8 < 0) {
                    break L2;
                  } else {
                    var6--;
                    var8 = var8 - (var6 << 1);
                    var10_ref_int__ = qd.field_a[param4 + var6];
                    var11_ref_int__ = qd.field_a[param4 + -var6];
                    var12_int = param0 + var5_int;
                    var13_int = param0 + -var5_int;
                    di.a(var13_int, (byte) 116, param3, var10_ref_int__, var12_int);
                    di.a(var13_int, (byte) 123, param3, var11_ref_int__, var12_int);
                    break L2;
                  }
                }
                var10 = var6 + param0;
                var11 = param0 - var6;
                var12 = qd.field_a[var5_int + param4];
                var13 = qd.field_a[param4 - var5_int];
                di.a(var11, (byte) 39, param3, var12, var10);
                di.a(var11, (byte) -95, param3, var13, var10);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var5, "r.B(" + param0 + ',' + param1 + ',' + -121 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        bg var1 = (bg) (Object) bf.field_a.b((byte) 42);
        if (param0 <= 120) {
            field_b = null;
            if (!(var1 != null)) {
                throw new IllegalStateException();
            }
            ph.a(var1.field_p, var1.field_l, var1.field_q);
            ph.g(var1.field_k, var1.field_m, var1.field_j, var1.field_o);
            var1.field_p = null;
            rf.field_t.a((byte) 54, (q) (Object) var1);
            return;
        }
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        ph.a(var1.field_p, var1.field_l, var1.field_q);
        ph.g(var1.field_k, var1.field_m, var1.field_j, var1.field_o);
        var1.field_p = null;
        rf.field_t.a((byte) 54, (q) (Object) var1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in / Create account";
        field_b = new byte[112];
    }
}
