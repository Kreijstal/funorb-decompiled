/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ai {
    static mf field_p;
    int[] field_g;
    int field_m;
    int field_s;
    int field_q;
    static ud[] field_n;
    int field_r;
    int field_h;
    int field_j;
    static String field_l;
    int field_t;
    long field_o;
    static int[] field_k;
    static String field_i;

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 != 4) {
          field_p = (mf) null;
        }
        if (param2) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param1) {
          var4++;
        }
        return hc.field_e[var4];
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        Object var3 = null;
        qg var3_ref = null;
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
        ii var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var3 = null;
        var12 = Bounce.field_N;
        try {
          var14 = jc.field_g;
          var2 = var14.d((byte) -77);
          var3_ref = (qg) (cf.field_b.a((byte) -60));
          while (var3_ref != null) {
            if (~var3_ref.field_h != ~var2) {
              var3_ref = (qg) (cf.field_b.d((byte) -22));
              continue;
            }
            break;
          }
          if (var3_ref == null) {
            kc.a((byte) 18);
            return;
          }
          if (param0 != 1) {
            field_l = (String) null;
          }
          var4 = var14.d((byte) -127);
          if (var4 != 0) {
            var5 = var3_ref.field_i;
            wh.field_c[0] = ja.field_b;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              wh.field_c[var6_int] = var14.b(true);
            }
            ng.a(-15936, var5, var4);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              vd.a((byte) 72, var14);
              if (var6_intLifetime1 != 0) {
                ij.a(de.field_b, var6_intLifetime1, qe.field_i, 0, ed.field_b, kf.field_a);
              } else {
                ij.a(de.field_b, var6_intLifetime1, qe.field_i, param0 ^ 1, ed.field_b, kf.field_a);
              }
            }
            bj.a((byte) -125, var5);
            var6 = new String[2][var5];
            var18 = new int[2][4 * var5];
            var8 = q.field_M;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = w.field_f[var9];
              var6[0][var10] = wh.field_c[var11];
              var18[0][4 * var10] = sj.field_j[var11];
              var18[0][var10 * 4 + 1] = nh.field_S[var11];
              var18[0][var10 * 4 + 2] = gk.field_i[var11];
              var18[0][4 * var10 + 3] = th.field_c[var11];
              if (s.a(wh.field_c[var11], param0 - 3) &&
                gk.field_i[var11] + nh.field_S[var11] + th.field_c[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = w.field_f[var9Lifetime1 + var5];
              var6[1][var13] = wh.field_c[var11Lifetime1];
              var18[1][4 * var13] = sj.field_j[var11Lifetime1];
              var18[1][4 * var13 + 1] = nh.field_S[var11Lifetime1];
              var18[1][4 * var13 + 2] = gk.field_i[var11Lifetime1];
              var18[1][3 + 4 * var13] = th.field_c[var11Lifetime1];
              if (s.a(wh.field_c[var11Lifetime1], -97) &&
                nh.field_S[var11Lifetime1] - (-gk.field_i[var11Lifetime1] - th.field_c[var11Lifetime1]) == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9Lifetime1++;
            }
            var3_ref.c(2);
            return;
          }
          var3_ref.c(2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "he.A(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        field_i = null;
        if (param0 >= -16) {
          he.a(-107, true, true, false);
        }
        field_n = null;
        field_p = null;
        field_l = null;
        field_k = null;
    }

    he(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_q = param4;
          this.field_r = param1;
          fieldTemp$0 = el.field_k;
          el.field_k = el.field_k + 1;
          this.field_j = 65535 & fieldTemp$0;
          this.field_t = param5;
          this.field_h = param3;
          this.field_g = param6;
          this.field_s = param2;
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "he.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Checking";
        field_n = new ud[3];
        field_p = new mf();
        field_i = "Unpacking graphics";
    }
}
