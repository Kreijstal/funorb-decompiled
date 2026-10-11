/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cc {
    static le[][] field_a;
    static long field_b;

    abstract void a(int param0, java.awt.Component param1);

    final static void b(boolean param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          ig.b();
          r.field_a = new int[260];
          uc.field_b = 11;
          for (var1_int = 0; 256 > var1_int; var1_int++) {
            var2 = 15.0;
            r.field_a[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          if (!param0) {
            field_a = (le[][]) null;
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < r.field_a.length) {
            r.field_a[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "cc.F(" + param0 + ')');
        }
    }

    abstract int a(boolean param0);

    final static void a(int param0, boolean param1, boolean param2) {
        if (param1) {
          ge.c(0, 0, ge.field_h, ge.field_g, 0, 192);
          vj.a(1, param1);
          if (param0 == 192) {
            return;
          }
          cc.a(-77);
          return;
        }
        ge.d();
        vj.a(1, param1);
        if (param0 == 192) {
          return;
        }
        cc.a(-77);
    }

    public static void a(int param0) {
        if (param0 != 256) {
          return;
        }
        field_a = (le[][]) null;
    }

    abstract void a(java.awt.Component param0, int param1);

    static {
        field_a = new le[3][];
    }
}
