/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static int field_l;
    int field_d;
    int field_h;
    int field_j;
    static int[] field_e;
    int field_m;
    int field_a;
    byte[] field_b;
    int field_c;
    byte[] field_g;
    static String field_i;
    int field_f;
    static String field_k;

    public static void a() {
        field_i = null;
        field_e = null;
        field_k = null;
    }

    final static void a(byte param0) {
        if (!(kf.field_d != null)) {
            return;
        }
        int discarded$0 = 0;
        ci.a((java.awt.Canvas) (Object) kf.field_d);
        kf.field_d.a(false, qa.field_a);
        kf.field_d = null;
        if (!(ij.field_o == null)) {
            ij.field_o.b(-86);
        }
        ef.field_c.requestFocus();
        int var1 = 24 % ((-32 - param0) / 49);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              eh.e(param3, param4, 1 + param1, 10000536);
              eh.e(param3, param0 + param4, param1 - -1, 12105912);
              var5_int = 1;
              if (var5_int + param4 < eh.field_d) {
                var5_int = -param4 + eh.field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = param0;
              if (eh.field_e >= var6 + param4) {
                break L2;
              } else {
                var6 = -param4 + eh.field_e;
                break L2;
              }
            }
            var7 = 122 / ((80 - param2) / 46);
            var8 = var5_int;
            L3: while (true) {
              if (var6 <= var8) {
                break L0;
              } else {
                var9 = 152 + var8 * 48 / param0;
                var10 = var9 | (var9 << 8 | var9 << 16);
                eh.field_f[param3 + eh.field_g * (var8 + param4)] = var10;
                eh.field_f[param1 + param3 + (param4 - -var8) * eh.field_g] = var10;
                var8++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var5, "ng.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(long param0) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            {
              L0: {
                Thread.sleep(param0);
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -1;
        field_i = "Sound: ";
        field_k = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
