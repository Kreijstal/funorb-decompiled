/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static String field_c;
    static int[] field_d;
    static volatile boolean field_e;
    private int[] field_b;
    static bd field_a;

    final static boolean a(byte param0) {
        int var1 = -58 % ((param0 - 55) / 62);
        return uk.a(bm.field_b, 0);
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_9_0 = false;
        if (param0 != -109) {
          field_e = true;
        }
        stackIn_9_0 = (param1 == 160) || (param1 == 32) || (param1 == 95) || (param1 == 45);
        return stackIn_9_0;
    }

    final static pg b(int param0) {
        pg var1 = new pg(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], ja.field_e[param0], bf.field_d);
        uj.d(param0 ^ -43);
        return var1;
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 1) {
          field_a = (bd) null;
        }
        field_a = null;
    }

    final static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        qj var3 = null;
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
        en var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0 != 1) {
            rg.a((byte) -86);
          }
          var14 = sc.field_g;
          var2 = var14.l(32270);
          var3 = (qj) (rj.field_G.g(-83));
          while (var3 != null) {
            if (var3.field_i != var2) {
              var3 = (qj) (rj.field_G.a(param0 + 12683));
              continue;
            }
            break;
          }
          if (var3 == null) {
            le.c((byte) 41);
            return;
          }
          var4 = var14.l(32270);
          if (0 != var4) {
            var5 = var3.field_j;
            al.field_M[0] = qg.field_r;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              al.field_M[var6_int] = var14.o(32);
            }
            qh.a(var4, var5, param0 + 95);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              qj.a(var14, (byte) -12);
              if (var6_intLifetime1 != 0) {
                pm.a(var6_intLifetime1, s.field_e, 75, sm.field_g, jn.field_J, hf.field_a);
              } else {
                pm.a(var6_intLifetime1, s.field_e, 80, sm.field_g, jn.field_J, hf.field_a);
              }
            }
            ve.a((byte) -125, var5);
            var6 = new String[2][var5];
            var18 = new int[2][var5 * 4];
            var8 = fc.field_z;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = db.field_s[var9];
              var6[0][var10] = al.field_M[var11];
              var18[0][4 * var10] = qa.field_d[var11];
              var18[0][4 * var10 + 1] = ta.field_mb[var11];
              var18[0][4 * var10 + 2] = og.field_b[var11];
              var18[0][3 + 4 * var10] = db.field_t[var11];
              if (pc.a(14088, al.field_M[var11]) &&
                0 == db.field_t[var11] + (og.field_b[var11] + ta.field_mb[var11])) {
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
              var11Lifetime1 = db.field_s[var5 + var9Lifetime1];
              var6[1][var13] = al.field_M[var11Lifetime1];
              var18[1][var13 * 4] = qa.field_d[var11Lifetime1];
              var18[1][var13 * 4 + 1] = ta.field_mb[var11Lifetime1];
              var18[1][2 + var13 * 4] = og.field_b[var11Lifetime1];
              var18[1][var13 * 4 + 3] = db.field_t[var11Lifetime1];
              if (pc.a(14088, al.field_M[var11Lifetime1]) &&
                ta.field_mb[var11Lifetime1] + og.field_b[var11Lifetime1] + db.field_t[var11Lifetime1] == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
          }
          var3.b(param0 ^ 109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "rg.E(" + param0 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = -1 + (this.field_b.length >> 1);
        if (!param0) {
          return -37;
        }
        var4 = var3 & param1;
        while (true) {
          var5 = this.field_b[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_b[var4 + var4] == param1) {
            return var5;
          }
          var4 = var3 & 1 + var4;
        }
    }

    rg(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (param0.length + (param0.length >> 1) >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_b = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_b[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & var2_int - 1;
            while (this.field_b[var4 + (var4 + 1)] != -1) {
              var4 = -1 + var2_int & 1 + var4;
            }
            this.field_b[var4 + var4] = param0[var3Lifetime1];
            this.field_b[var4 + var4 + 1] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("rg.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_c = "Destroy all the spawn eggs in this area, then exit via the lift.";
        field_e = false;
    }
}
