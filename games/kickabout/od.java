/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends sr {
    static ut field_p;
    static boolean field_n;
    static String field_o;

    od() {
    }

    final int a(int param0, Object param1, Object param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            field_n = false;
          }
          var4_int = ((sp) (param1)).field_Gb;
          var5 = ((sp) (param2)).field_Gb;
          stackIn_3_0 = -var5 + var4_int ^ this.field_i << 31;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("od.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 > -69) {
          Object var3 = (Object) null;
          this.a(-91, (Object) null, (Object) null);
        }
        return 2;
    }

    public static void b(int param0) {
        field_p = null;
        if (param0 != 0) {
          return;
        }
        field_o = null;
    }

    final static void a(int[] param0, int param1, gt[] param2, int param3) {
        int dupTemp$0 = 0;
        int var12 = 0;
        it[] stackIn_6_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        int var17Lifetime1;
        var19 = Kickabout.field_G;
        try {
          var4 = un.field_d;
          var23 = new int[2];
          var20 = var23;
          var5 = var20;
          var24 = new int[2];
          var21 = var24;
          var6 = var21;
          var25 = new int[2];
          var22 = var25;
          var7 = var22;
          for (var8 = 0; var8 < vt.field_c.field_g.length; var8++) {
            dupTemp$0 = vt.field_c.field_g[var8].field_p;
            var5[dupTemp$0] = var5[dupTemp$0] + 1;
          }
          stackIn_6_0 = vt.field_c.field_g;
          if (vu.field_Cb != -2) {
            stackIn_7_1 = vu.field_Cb;
          } else {
            stackIn_7_1 = 0;
          }
          var8Lifetime1 = stackIn_6_0[stackIn_7_1].field_p;
          for (var9 = 0; 2 > var9; var9++) {
            var6[var9] = rn.field_c * var23[var9] + 4;
          }
          if (param3 != 14839) {
            field_p = (ut) null;
          }
          var7[var8Lifetime1] = 473 - var24[var8Lifetime1];
          var7[-var8Lifetime1 + 1] = -2 + var25[var8Lifetime1] - var6[-var8Lifetime1 + 1];
          for (var9Lifetime1 = 0; 2 > var9Lifetime1; var9Lifetime1++) {
            on.a(-et.field_c + 644, var25[var9Lifetime1], et.field_c, var24[var9Lifetime1], 2, 0, param1);
            on.a(643 - (et.field_c + rn.field_c + 2), var25[var9Lifetime1], rn.field_c + 1, var24[var9Lifetime1], 2, 0, param1);
            var10 = vt.field_c.field_X.field_j[var9Lifetime1];
            if (var10 > 99) {
              var10 = 99;
            }
            ((hu) ((Object) var4)).d(Integer.toString(var10), -2 + (-rn.field_c + 644 - et.field_c + (rn.field_c >> 1)) + 1, (var24[var9Lifetime1] + rn.field_c >> 1) + var25[var9Lifetime1] - 2, 16777215, -1);
            var11 = 0;
            for (var12 = 0; vt.field_c.field_I > var12; var12++) {
              if (~var9Lifetime1 == ~vt.field_c.field_g[var12].field_p) {
                var13 = 1 + (rb.field_yb + var11 * rn.field_c) + (var25[var9Lifetime1] + 2) + 3;
                var14 = param0[var12];
                var15 = ct.a(true, var14);
                if (u.field_c &&
                  644 - et.field_c < wt.field_x &&
                  wt.field_x < 640 &&
                  us.field_j > var13 - rn.field_c &&
                  us.field_j < var13) {
                  wa.a((byte) 52, vo.$cfr$intArgs$a$53ce4ab4c593(-18, "<%0>: <%1>ms", new String[]{kn.field_G[var12], var14 + ""}));
                }
                stackIn_29_0 = (vt.field_c.field_R[var12].d(3511)) ? 16777215 : 11184810;
                var16 = stackIn_29_0;
                ((hu) ((Object) var4)).a(kn.field_G[var12], -et.field_c + 644 + 10, var13, var16, -1);
                if (vt.field_c.field_R[var12].d(3511)) {
                  if (vt.field_c.field_R[var12].field_q) {
                    var17 = ((hu) ((Object) var4)).a(pj.field_A) + 12;
                    pt.a(-rn.field_c + (-et.field_c + 642) - 1, -22914, 0, 480, 0);
                    on.a(642 - (et.field_c + (rn.field_c + var17)), var13 - rn.field_c + 3, var17 + 4, rn.field_c - 2, 6, 65793, param1);
                    ((hu) ((Object) var4)).a(pj.field_A, 7 + (-et.field_c + 644 - rn.field_c - (2 + var17)), var13, 16777215, -1);
                    ta.e(119);
                  }
                } else {
                  var17 = 644 + (-et.field_c + 10);
                  var18 = ((hu) ((Object) var4)).a(kn.field_G[var12]);
                  on.b(var17, -2 + (var13 - rb.field_yb), var18 + var17, var13 - 1, 13382451);
                  on.b(var17, -1 + var13, var17 + var18, -2 - rb.field_yb + var13, 13382451);
                }
                var11++;
                if (u.field_c) {
                  on.a(629, var13 - 10, 6, 10, 0);
                  for (var17Lifetime1 = 0; var15 > var17Lifetime1; var17Lifetime1++) {
                    on.f(630, var13 - var17Lifetime1 - 2, 4, am.field_i[var17Lifetime1]);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_43_0 = var4_ref;
          stackIn_43_1 = new StringBuilder().append("od.A(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_o = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
