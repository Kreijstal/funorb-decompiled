/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm implements cg {
    private int field_g;
    private int field_m;
    private int field_f;
    private int field_d;
    static String field_c;
    private rf field_k;
    private int field_h;
    static int[] field_e;
    static boolean field_l;
    static String field_i;
    static String field_b;
    static long field_j;
    private int field_a;

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        int var10 = 0;
        vg stackIn_6_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        tl var12 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param1 <= 94) {
            field_c = (String) null;
          }
          if (param2 instanceof tl) {
            stackIn_6_0 = (vg) (param2);
          } else {
            stackIn_6_0 = null;
          }
          var12 = (tl) (stackIn_6_0);
          if (var12 == null) {
          }
          wj.f(param2.field_o + param4, param2.field_m + param3, param2.field_w, param2.field_k, this.field_m);
          var7 = -(var12.field_L * 2) + param2.field_w;
          var8 = var12.field_L + (param4 + param2.field_o);
          var9 = var12.field_K + (param2.field_m + param3);
          wj.g(var8, var9, var7 + var8, var9, this.field_f);
          for (var10 = var12.h(-26) - 1; var10 >= 0; var10--) {
            wj.b(var7 * var12.a(var10, (byte) 4) / var12.i(-110) + var8, var9, this.field_h, this.field_d);
          }
          if (this.field_k != null) {
            this.field_k.b(var12.field_p, var8 + var7 / 2, var12.field_K + this.field_k.field_E + var9, this.field_a, this.field_g);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("fm.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        b var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        lh var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var5Lifetime1;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var14 = dh.field_N;
          var2 = var14.l(31760);
          var3 = (b) (u.field_f.h(-11151));
          while (var3 != null) {
            if (var2 != var3.field_j) {
              var3 = (b) (u.field_f.e(0));
              continue;
            }
            break;
          }
          if (var3 == null) {
            eg.a((byte) 126);
            return;
          }
          var4 = var14.l(31760);
          if (var4 != 0) {
            gd.field_d[0] = oa.field_d;
            var5 = var3.field_n;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              gd.field_d[var6_int] = var14.b((byte) -101);
            }
            mg.a(var4, 83, var5);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              qg.a(var14, (byte) 104);
              if (var6_intLifetime1 != 0) {
                ai.a(ah.field_K, (byte) -62, j.field_e, var6_intLifetime1, d.field_b, oh.field_d);
              } else {
                ai.a(ah.field_K, (byte) -128, j.field_e, var6_intLifetime1, d.field_b, oh.field_d);
              }
            }
            mk.a(-91, var5);
            var6 = new String[2][var5];
            var18 = new int[2][4 * var5];
            var8 = gg.field_b;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = bj.field_a[var9];
              var6[0][var10] = gd.field_d[var11];
              var18[0][4 * var10] = rc.field_i[var11];
              var18[0][var10 * 4 + 1] = fi.field_h[var11];
              var18[0][4 * var10 + 2] = kk.field_a[var11];
              var18[0][var10 * 4 + 3] = qj.field_d[var11];
              if (ta.a(6, gd.field_d[var11]) &&
                0 == qj.field_d[var11] + (kk.field_a[var11] + fi.field_h[var11])) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = bj.field_a[var9Lifetime1 + var5];
              var6[1][var13] = gd.field_d[var11Lifetime1];
              var18[1][4 * var13] = rc.field_i[var11Lifetime1];
              var18[1][1 + var13 * 4] = fi.field_h[var11Lifetime1];
              var18[1][var13 * 4 + 2] = kk.field_a[var11Lifetime1];
              var18[1][3 + var13 * 4] = qj.field_d[var11Lifetime1];
              if (ta.a(6, gd.field_d[var11Lifetime1]) &&
                0 == qj.field_d[var11Lifetime1] + kk.field_a[var11Lifetime1] + fi.field_h[var11Lifetime1]) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
          }
          var5Lifetime1 = -96 / ((param0 - 11) / 43);
          var3.a(-16175);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "fm.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = 36 % ((param0 + 27) / 49);
        field_i = null;
        field_e = null;
        field_b = null;
    }

    fm(rf param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_k = param0;
          this.field_m = param4;
          this.field_d = param6;
          this.field_f = param3;
          this.field_a = param1;
          this.field_h = param5;
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_c = "Move ship";
        field_i = "Your email address is used to identify this account";
        field_b = "Visit the Account Management section on the main site to view.";
        field_l = false;
    }
}
