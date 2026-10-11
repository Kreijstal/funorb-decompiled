/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static he[] field_g;
    static String field_b;
    static he[] field_f;
    static String field_a;
    int[] field_h;
    bf[] field_c;
    static he[] field_e;
    static String field_d;

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_d = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          ae.a(1, pf.field_f, cc.field_B, gg.field_b, true, 0, param1);
          var3 = 77 / ((param0 - 21) / 63);
          for (var2_int = 0; gg.field_b > var2_int; var2_int++) {
            bj.field_a[var2_int + param1] = var2_int;
          }
          ae.a(1, mh.field_b, ha.field_c, gg.field_b + param1, false, param1, param1 + param1);
          if (gg.field_b > param1) {
            gg.field_b = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "mk.A(" + param0 + ',' + param1 + ')');
        }
    }

    mk() {
        this.field_c = new bf[8000];
    }

    mk(byte[] param0, int param1) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        od var14 = null;
        od var15 = null;
        int var7Lifetime1;
        this.field_c = new bf[8000];
        try {
          var14 = new od(param0);
          var15 = var14;
          var4 = var15.l(31760);
          if (0 == var4) {
            var5 = var15.h(-123);
            var6 = var15.h(-91);
            this.field_h = new int[var5];
            var15.n(-75);
            for (var7 = 0; var7 < var5; var7++) {
              this.field_h[var7] = var14.j(-788751192);
            }
            for (var7Lifetime1 = 0; var6 > var7Lifetime1; var7Lifetime1++) {
              var8 = var15.n(89);
              var9 = var15.n(118);
              var11 = var15.h(102);
              if (param1 != 0 && (var8 == 5 ||
                11 == var8 ||
                var8 == 17 ||
                var8 == 18 ||
                42 == var8)) {
                var9 = param1;
              }
              var10 = 0;
              var12 = var15.j(-788751192);
              if (var8 >= 0) {
                this.field_c[var7Lifetime1] = new bf(var8, var9, var10, var11, var12, false);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("mk.<init>(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
        field_g = new he[8];
        field_a = "Cycle weapon";
        field_d = "Creating your account";
    }
}
