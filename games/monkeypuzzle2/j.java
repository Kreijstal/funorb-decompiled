/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static qi field_e;
    static le field_g;
    static boolean[] field_d;
    static int field_a;
    static le field_c;
    static le[] field_f;
    static String field_b;
    static String field_h;

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 == 5) {
          field_h = null;
          return;
        }
        j.a(-51);
        field_h = null;
    }

    final static int a(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (ba.a(-1)) {
            sj.field_f.e(0);
            if (sj.field_f.c((byte) -84)) {
              var1_int = 1;
            }
            if (oa.field_H != 13) {
              continue;
            }
            var2 = 1;
          }
          if (param0 != 5) {
            stackIn_10_0 = 127;
            return stackIn_10_0;
          }
          sj.field_f.a(q.a(p.field_a, (byte) -36, ei.field_a), q.a(ab.field_e, (byte) -36, qg.field_c), true);
          if (sj.field_f.c((byte) -99)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            sj.field_f.field_a >= 0) {
            var3 = bi.field_B[sj.field_f.field_a];
            if (var3 == 2) {
              tj.a((byte) -123);
            } else if (var3 == 5) {
              tj.a((byte) -123);
            }
          } else {
            if (var2 != 0 &&
              ud.field_b != 2) {
              tj.a((byte) -96);
            }
          }
          if (var3 == 0 &&
            ud.field_b == 2) {
            var4 = pf.a(0) - fb.field_n;
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (0 >= var6) {
              var3 = 2;
              jk.a(-125, true, 5);
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "j.B(" + param0 + ')');
        }
    }

    static {
        field_b = "Try again";
        field_h = "Loading...";
    }
}
