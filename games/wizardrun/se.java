/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static int field_a;
    static volatile boolean field_b;

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = wizardrun.field_H;
        L0: while (true) {
          param3--;
          if (param3 < 0) {
            if (param1 <= 74) {
              int discarded$2 = se.a(-78, -67, 96);
              return;
            } else {
              return;
            }
          } else {
            var9 = param4;
            var5 = var9;
            var6 = param0;
            var7 = param2;
            var9[var6] = var7 - -(kl.b(var9[var6], 16711422) >> 2001809345);
            param0++;
            continue L0;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (param2 == 0) {
          if (param0 <= param1) {
            L0: while (true) {
              if (param0 == 0) {
                return param1;
              } else {
                var3 = param1 % param0;
                param1 = param0;
                param0 = var3;
                continue L0;
              }
            }
          } else {
            var3 = param1;
            param1 = param0;
            param0 = var3;
            L1: while (true) {
              if (param0 == 0) {
                return param1;
              } else {
                var3 = param1 % param0;
                param1 = param0;
                param0 = var3;
                continue L1;
              }
            }
          }
        } else {
          field_a = -111;
          if (param0 <= param1) {
            L2: while (true) {
              if (param0 == 0) {
                return param1;
              } else {
                var3 = param1 % param0;
                param1 = param0;
                param0 = var3;
                continue L2;
              }
            }
          } else {
            var3 = param1;
            param1 = param0;
            param0 = var3;
            L3: while (true) {
              if (param0 == 0) {
                return param1;
              } else {
                var3 = param1 % param0;
                param1 = param0;
                param0 = var3;
                continue L3;
              }
            }
          }
        }
    }

    final static o a(int param0, kl param1, int param2, int param3) {
        if (param3 <= 46) {
            return null;
        }
        if (!h.a(param0, param2, param1, -124)) {
            return null;
        }
        return sl.g(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
    }
}
