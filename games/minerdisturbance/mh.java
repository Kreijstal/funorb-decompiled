/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh implements uj {
    static double field_a;
    static rc[] field_b;
    static boolean field_f;
    static ea field_d;
    static int field_c;
    static je[][] field_e;

    final static boolean a(int[] param0, int param1) {
        int var3 = MinerDisturbance.field_ab;
        int var2 = 0;
        if (param1 != -1) {
            Object var4 = null;
            boolean discarded$0 = mh.a((int[]) null, -37);
        }
        while (var2 < 8) {
            if (-1 != (param0[var2] ^ -1)) {
                return true;
            }
            var2++;
        }
        return false;
    }

    public final void a(boolean param0) {
        tb.field_a = 1;
        gd.field_x = 1;
        if (param0) {
            field_c = -35;
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        var1 = (Object) (Object) di.field_O;
        synchronized (var1) {
          L0: {
            L1: {
              dn.field_w = ll.field_d;
              hb.field_b = hb.field_b + 1;
              if (cg.field_H >= 0) {
                L2: while (true) {
                  if (dm.field_b == cg.field_H) {
                    break L1;
                  } else {
                    var2 = ib.field_b[dm.field_b];
                    dm.field_b = dm.field_b - -1 & 127;
                    if (var2 < 0) {
                      qd.field_O[var2 ^ -1] = false;
                      continue L2;
                    } else {
                      qd.field_O[var2] = true;
                      continue L2;
                    }
                  }
                }
              } else {
                var2 = 0;
                L3: while (true) {
                  if ((var2 ^ -1) <= -113) {
                    cg.field_H = dm.field_b;
                    break L1;
                  } else {
                    qd.field_O[var2] = false;
                    var2++;
                    continue L3;
                  }
                }
              }
            }
            var2 = -126 % ((param0 - -3) / 32);
            ll.field_d = qf.field_n;
            break L0;
          }
        }
    }

    public final String a(byte param0) {
        int var2 = -104 / ((param0 - -33) / 62);
        return "Make Ore Silver";
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = 103 % ((5 - param0) / 39);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new rc[5];
        field_a = Math.atan2(1.0, 0.0);
    }
}
