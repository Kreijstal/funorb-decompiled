/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends pi {
    byte[] field_s;
    long field_o;
    static ae field_r;
    int field_q;
    static long field_n;
    static String field_p;
    static String[][] field_t;

    final static void a(int param0) {
        pj.field_c = new th();
        if (null == aa.field_j) {
          return;
        }
        aa.field_j = new th();
        if (param0 != 0) {
          field_p = (String) null;
        }
        ck.a(-30833);
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        mj var3 = null;
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
        ld var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = MinerDisturbance.field_ab;
        try {
          var14 = kj.field_a;
          var2 = var14.d((byte) -54);
          if (param0 != -105) {
            return;
          }
          var3 = (mj) (nh.field_a.b(100));
          while (var3 != null) {
            if (var3.field_r != var2) {
              var3 = (mj) (nh.field_a.b((byte) 56));
              continue;
            }
            break;
          }
          if (var3 == null) {
            si.a(-68);
            return;
          }
          var4 = var14.d((byte) -54);
          if (0 != var4) {
            var5 = var3.field_q;
            fl.field_b[0] = ti.field_J;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              fl.field_b[var6_int] = var14.a(false);
            }
            pn.a(var4, 11760, var5);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              fg.a((byte) -86, (sb) (var14));
              if (var6_intLifetime1 != 0) {
                qm.a(fl.field_c, tk.field_h, var6_intLifetime1, true, ah.field_b, vb.field_b);
              } else {
                qm.a(fl.field_c, tk.field_h, var6_intLifetime1, true, ah.field_b, vb.field_b);
              }
            }
            si.a(var5, -14391);
            var6 = new String[2][var5];
            var18 = new int[2][4 * var5];
            var8 = fb.field_c;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = an.field_a[var9];
              var6[0][var10] = fl.field_b[var11];
              var18[0][var10 * 4] = pi.field_h[var11];
              var18[0][4 * var10 + 1] = jk.field_db[var11];
              var18[0][2 + 4 * var10] = qa.field_c[var11];
              var18[0][var10 * 4 + 3] = li.field_a[var11];
              if (ci.a(-27933, fl.field_b[var11]) &&
                li.field_a[var11] + (jk.field_db[var11] + qa.field_c[var11]) == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = an.field_a[var9Lifetime1 + var5];
              var6[1][var13] = fl.field_b[var11Lifetime1];
              var18[1][4 * var13] = pi.field_h[var11Lifetime1];
              var18[1][4 * var13 + 1] = jk.field_db[var11Lifetime1];
              var18[1][var13 * 4 + 2] = qa.field_c[var11Lifetime1];
              var18[1][3 + var13 * 4] = li.field_a[var11Lifetime1];
              if (ci.a(-27933, fl.field_b[var11Lifetime1]) &&
                li.field_a[var11Lifetime1] + qa.field_c[var11Lifetime1] + jk.field_db[var11Lifetime1] == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
            var3.b(34);
            return;
          }
          var3.b(34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "jn.C(" + param0 + ')');
        }
    }

    final static ea a(String param0, int param1, String param2, bj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bj var6 = null;
        ea stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -29553) {
            var6 = (bj) null;
            jn.a((String) null, -42, (String) null, (bj) null);
          }
          var4_int = param3.a(-118, param2);
          var5 = param3.a(param0, var4_int, param1 ^ 29451);
          stackIn_3_0 = el.a(var5, var4_int, param3, 2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jn.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_p = null;
        int var1 = 23 % ((28 - param0) / 56);
        field_r = null;
        field_t = (String[][]) null;
    }

    jn(long param0, int param1, byte[] param2) {
        try {
          this.field_s = param2;
          this.field_o = param0;
          this.field_q = param1;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "jn.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Look sharp in this greaseproof suit. This fetching non-stick two piece will let you swim through oil as if it were water.";
        field_r = new ae();
        field_t = new String[][]{null, new String[]{"Freezing water: Sparkling water is so cold, it will start to freeze you. Unless you've packed a jumper or picked one up, you should try not stay in it for too long."}};
    }
}
