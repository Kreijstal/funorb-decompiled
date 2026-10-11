/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends jb {
    int field_f;
    int[] field_k;
    int field_m;
    int field_l;
    static oi field_p;
    int field_g;
    int field_j;
    int field_o;
    static String field_n;
    static ko field_h;
    static int field_i;

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_o = param4;
          this.field_f = param6;
          this.field_g = param0;
          this.field_l = param7;
          this.field_j = param5;
          this.field_k = param1;
          this.field_m = param2;
          if (param3 != -26690) {
            pe.d(-95);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pe.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        hb var3 = null;
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
        md var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = CrazyCrystals.field_B;
        try {
          var14 = kd.field_n;
          var2 = var14.h(255);
          var3 = (hb) (vm.field_g.g(32073));
          while (var3 != null) {
            if (var3.field_f != var2) {
              var3 = (hb) (vm.field_g.a(false));
              continue;
            }
            break;
          }
          if (var3 == null) {
            jj.a(4);
            return;
          }
          var4 = var14.h(255);
          if (param0 != -1) {
            return;
          }
          if (var4 != 0) {
            th.field_A[0] = je.field_g;
            var5 = var3.field_j;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              th.field_A[var6_int] = var14.i(param0 + 128);
            }
            ei.a(var4, var5, false);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              tb.a(-31416, var14);
              if (var6_intLifetime1 != 0) {
                ca.a(mc.field_q, jn.field_q, jd.field_I, var6_intLifetime1, true, of.field_D);
              } else {
                ca.a(mc.field_q, jn.field_q, jd.field_I, var6_intLifetime1, true, of.field_D);
              }
            }
            go.a(var5, 240);
            var6 = new String[2][var5];
            var18 = new int[2][var5 * 4];
            var8 = be.field_c;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = wp.field_d[var9];
              var6[0][var10] = th.field_A[var11];
              var18[0][var10 * 4] = mh.field_l[var11];
              var18[0][1 + var10 * 4] = dk.field_l[var11];
              var18[0][2 + var10 * 4] = j.field_i[var11];
              var18[0][3 + var10 * 4] = cd.field_u[var11];
              if (ai.a((byte) 82, th.field_A[var11]) &&
                0 == j.field_i[var11] + dk.field_l[var11] + cd.field_u[var11]) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = wp.field_d[var9Lifetime1 + var5];
              var6[1][var13] = th.field_A[var11Lifetime1];
              var18[1][4 * var13] = mh.field_l[var11Lifetime1];
              var18[1][var13 * 4 + 1] = dk.field_l[var11Lifetime1];
              var18[1][var13 * 4 + 2] = j.field_i[var11Lifetime1];
              var18[1][4 * var13 + 3] = cd.field_u[var11Lifetime1];
              if (ai.a((byte) 82, th.field_A[var11Lifetime1]) &&
                j.field_i[var11Lifetime1] + (dk.field_l[var11Lifetime1] + cd.field_u[var11Lifetime1]) == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9Lifetime1++;
            }
            var3.a(false);
            return;
          }
          var3.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "pe.A(" + param0 + ')');
        }
    }

    pe() {
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != 1) {
          field_h = (ko) null;
        }
        field_h = null;
        field_p = null;
    }

    static {
        field_n = " (taster)";
        field_i = -1;
        field_p = new oi();
    }
}
