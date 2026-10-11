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
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          var2_int = 0;
          if (param1 != -1) {
            var4 = (int[]) null;
            mh.a((int[]) null, -37);
          }
          while (true) {
            if (var2_int >= 8) {
              return false;
            }
            if (param0[var2_int] == 0) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("mh.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
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
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var2Lifetime1;
        var4 = MinerDisturbance.field_ab;
        try {
          var1 = di.field_O;
          synchronized (var1) {
            dn.field_w = ll.field_d;
            hb.field_b = hb.field_b + 1;
            if (cg.field_H < 0) {
              for (var2 = 0; var2 < 112; var2++) {
                qd.field_O[var2] = false;
              }
              cg.field_H = dm.field_b;
            } else {
              while (dm.field_b != cg.field_H) {
                var2 = ib.field_b[dm.field_b];
                dm.field_b = dm.field_b + 1 & 127;
                if (var2 < 0) {
                  qd.field_O[~var2] = false;
                  continue;
                }
                qd.field_O[var2] = true;
              }
            }
            var2Lifetime1 = -126 % ((param0 + 3) / 32);
            ll.field_d = qf.field_n;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "mh.C(" + param0 + ')');
        }
    }

    public final String a(byte param0) {
        int var2 = -104 / ((param0 + 33) / 62);
        return "Make Ore Silver";
    }

    public static void a(int param0) {
        field_b = null;
        field_e = (je[][]) null;
        field_d = null;
        int var1 = 103 % ((5 - param0) / 39);
    }

    static {
        field_b = new rc[5];
        field_a = Math.atan2(1.0, 0.0);
    }
}
