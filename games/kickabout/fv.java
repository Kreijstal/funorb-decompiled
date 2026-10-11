/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv implements hc {
    static ut field_b;
    static String field_a;
    static boolean field_d;
    static String field_c;

    public final boolean a(byte param0) {
        if (param0 < 63) {
          field_b = (ut) null;
          return false;
        }
        return false;
    }

    final static boolean a(byte param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          try {
            if (!bu.field_h.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (true) {
              if (param1.length() <= var3) {
                if (param0 >= -84) {
                  field_c = (String) null;
                }
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                return true;
              }
              if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var2_ref2;
          stackIn_23_1 = new StringBuilder().append("fv.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        var5 = Kickabout.field_G;
        try {
          if (ob.field_T[param0]) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          var2_int = 0;
          for (var3 = 0; vg.field_Db.length > var3; var3++) {
            if (vg.field_Db[var3].field_c == param0) {
              var2_int++;
            }
          }
          var3Lifetime1 = 0;
          var4 = 0;
          if (param1 != 19) {
            var6 = (String) null;
            fv.a((byte) 41, (String) null);
          }
          while (var4 < vg.field_Db.length) {
            if (param0 == vg.field_Db[var4].field_c) {
              if (!vg.field_Db[var4].field_d &&
                !vg.field_Db[var4].b(32)) {
                stackIn_19_0 = (int)(100.0 * (double)var3Lifetime1 / (double)var2_int);
                return stackIn_19_0;
              }
              var3Lifetime1++;
            }
            var4++;
          }
          ob.field_T[param0] = true;
          stackIn_23_0 = -1;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "fv.A(" + param0 + ',' + param1 + ')');
        }
    }

    public final void a(int param0) {
        int var12 = 0;
        String[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_21_2 = null;
        int var2;
        int var3;
        uo var4;
        int var5;
        String[] var6;
        int var6_int;
        int var7;
        int var8;
        int var9;
        int var10;
        int var13;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int var9Lifetime1;
        var13 = Kickabout.field_G;
        if (fp.field_e == -1) {
          return;
        }
        var2 = wt.field_x;
        var3 = us.field_j + 18;
        var5 = 44 / ((param0 - 50) / 45);
        var4 = q.field_d;
        if (fp.field_e == 2) {
          var6 = new String[3];
          var6[0] = vo.$cfr$intArgs$a$53ce4ab4c593(-18, oj.field_Z, new String[]{ad.a(si.field_k, 26300)});
          if (ag.field_h != 0) {
            stackIn_20_0 = var6;
            stackIn_20_1 = 1;
            if (0 >= ag.field_h) {
              stackIn_21_2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, lc.field_b, new String[]{ad.a(Math.abs(ag.field_h), 26300)});
            } else {
              stackIn_21_2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ni.field_h, new String[]{ad.a(Math.abs(ag.field_h), 26300)});
            }
            stackIn_20_0[stackIn_20_1] = stackIn_21_2;
          }
          if (ag.field_h != 0) {
            var6[2] = vo.$cfr$intArgs$a$53ce4ab4c593(-18, hg.field_F, new String[]{ad.a(ag.field_h + si.field_k, 26300)});
          }
          var7 = 0;
          var8 = 0;
          for (var9 = 0; var6.length > var9; var9++) {
            if (null != var6[var9]) {
              var8++;
              if (var7 < ((hu) ((Object) var4)).a(var6[var9])) {
                var7 = ((hu) ((Object) var4)).a(var6[var9]);
              }
            }
          }
          var9Lifetime1 = var7 + 10;
          var10 = 10 + 12 * var8;
          var27 = ra.a(var2, var10, var9Lifetime1, 0, var3);
          var3 = var27[1];
          var2 = var27[0];
          on.a(4 + var2, 3 + var3, var9Lifetime1, var10, 65793, 128);
          on.e(var2 - 1, var3 - 1, 2 + var9Lifetime1, var10 + 2, 65793);
          on.a(var2, var3, var9Lifetime1, var10, 16777185);
          for (var12 = 0; var6.length > var12; var12++) {
            if (null != var6[var12]) {
              ((hu) ((Object) var4)).a(var6[var12], var2 + 5, 5 + (12 * var12 + 12) + var3, 65793, -1);
            }
          }
        } else {
          if (fp.field_e == 3) {
            if (ai.field_G.c(-2)) {
              return;
            }
            var6_int = 6 + ai.field_G.b(0);
            var7 = ai.field_G.a(ok.field_c, iu.field_j, (byte) 77) + 7;
            var24 = ra.a(var2, var7, var6_int, 0, var3);
            var3 = var24[1];
            var2 = var24[0];
            on.a(var2 - 2, var3 - 2, 4 + var6_int, var7 + 4, 6, 65793, 200);
            ai.field_G.a((byte) 77, 3 + var2, ok.field_c, na.field_Ib, i.field_x, cr.field_c, var3 + 3, iu.field_j);
          } else {
            if (fp.field_e == 6) {
              var6_int = pc.field_a.b(0) + 6;
              var7 = pc.field_a.a(15) + 7;
              var26 = ra.a(var2, var7, var6_int, 0, var3);
              var2 = var26[0];
              var3 = var26[1];
              on.a(-2 + var2, var3 - 2, var6_int + 4, var7 + 4, 6, 65793, 200);
              pc.field_a.a((var7 >> 1) + var3, 23, var2 + (var6_int >> 1));
            } else {
              if (fp.field_e == 1) {
                var6_int = ((hu) ((Object) var4)).b(wp.field_h, 200);
                if (var6_int != 1) {
                  var7 = 10 + ((hu) ((Object) var4)).a(wp.field_h, 200);
                  var8 = 12 * var6_int + 10;
                } else {
                  var8 = 22;
                  var7 = ((hu) ((Object) var4)).a(wp.field_h) + 10;
                }
                var25 = ra.a(var2, var8, var7, 0, var3);
                var3 = var25[1];
                var2 = var25[0];
                on.a(3 + var2, var3 + 2, var7, var8, 65793, 128);
                on.e(var2 - 1, -1 + var3, 2 + var7, var8 + 2, 65793);
                on.a(var2, var3, var7, var8, 16777185);
                ((hu) ((Object) var4)).a(wp.field_h, 5 + var2, -2 + var3 + 5, var7 - 10, var8, 65793, -1, 0, 0, 12);
              }
            }
          }
        }
    }

    public final void a(int param0, boolean param1) {
        if (!et.field_b) {
          fp.field_e = -1;
        }
        et.field_b = false;
        if (param0 != -25) {
          field_b = (ut) null;
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 < 66) {
          return;
        }
        field_a = null;
    }

    public final boolean a(int param0, int param1, char param2) {
        if (param0 != 11516) {
          field_a = (String) null;
          return false;
        }
        return false;
    }

    static {
        field_a = "This game has started.";
        field_d = true;
        field_c = "Orb Coins: 100";
    }
}
