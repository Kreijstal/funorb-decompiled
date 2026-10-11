/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static String[] field_c;
    static java.awt.Canvas field_b;
    static int field_e;
    static String field_g;
    static String field_f;
    static ck field_d;
    static String field_a;
    static boolean field_h;

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_g = null;
        field_f = null;
        if (param0) {
          field_d = (ck) null;
        }
        field_c = null;
        field_d = null;
    }

    final static java.awt.Frame a(int param0, fd param1, int param2, int param3, boolean param4, int param5) {
        int var8 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        dc[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        dc[] var10 = null;
        mh var11 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          if (!param1.b(-86)) {
            return null;
          }
          if (param3 == 0) {
            var10 = ak.a((byte) -109, param1);
            var6 = var10;
            if (var6 == null) {
              stackIn_7_0 = null;
              return (java.awt.Frame) (stackIn_7_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (param2 == var10[var8].field_f &&
                param0 == var10[var8].field_j && ((param5 == 0 ||
                var10[var8].field_a == param5) &&
                (var7_int == 0 ||
                !(var10[var8].field_h <= param3)))) {
                var7_int = 1;
                param3 = var10[var8].field_h;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          if (param4) {
            field_h = true;
          }
          var11 = param1.a((byte) 107, param0, param3, param2, param5);
          while (0 == var11.field_c) {
            ua.a(10L, -128);
          }
          var7 = (java.awt.Frame) (var11.field_b);
          if (var7 == null) {
            return null;
          }
          if (var11.field_c != 2) {
            return var7;
          }
          wj.a(true, var7, param1);
          stackIn_39_0 = null;
          return (java.awt.Frame) (stackIn_39_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_42_0 = var6_ref;
          stackIn_42_1 = new StringBuilder().append("jh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(byte param0, mm param1, ji param2) {
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ac var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        mm var12 = null;
        int[] var16 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          var3_int = kd.field_p;
          ie.field_c = new w(0L, (w) null);
          if (param2 == null) {
            var10 = (Throwable) null;
            qb.a((Throwable) null, 16408, "QC1");
            return;
          }
          param2.field_b = false;
          param2.field_g = 0;
          oi.field_a = new em(var3_int, param2, param2);
          wj.field_Qb = new sm(var3_int, param2, param2, new ga());
          var4 = dn.b((byte) 124);
          if (var4 == null) {
            var11 = (Throwable) null;
            qb.a((Throwable) null, 16408, "QC2");
            return;
          }
          jc.a(var4, -1);
          var12 = (mm) null;
          fj.field_d = wa.a(2245737, 1513239, 0, 8947848, 5138823, 1127256, 65793, 65793, 4020342, 1513239, 65793, -24447, (mm) null);
          rd.field_e = wa.a(0, 0, 16764006, 0, 0, 0, 0, 0, 0, 0, 0, -24447, param1);
          ad.field_q = wa.a(0, 0, 16777215, 0, 0, 0, 0, 0, 0, 0, 0, -24447, param1);
          var5 = hk.field_j;
          var6 = hk.field_i;
          var16 = hk.field_l;
          qb.field_q = new ck(10, 14);
          qb.field_q.a();
          for (var8 = 2; var8 < 7; var8++) {
            hk.g(var8, var8 + 1, 14 - (var8 << 1), 16777215);
          }
          hk.a(var16, var5, var6);
          vk.field_a = ll.a(ad.field_q, rd.field_e, var4, fj.field_d, 0);
          if (param0 <= 61) {
            return;
          }
          ie.field_c.field_M = new vj();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("jh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static int a(int[] param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int[] var5 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          var2_int = 0;
          for (var3 = 0; param0.length > var3; var3++) {
            var2_int = var2_int + h.a(param0[var3], -127);
          }
          if (param1 < 94) {
            var5 = (int[]) null;
            jh.a((int[]) null, 120);
          }
          stackIn_7_0 = var2_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("jh.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = new String[]{"Form a Deko and a Bloko at precisely the same time", "Eliminate a wildcard as part of 2 shapes at the same time", "Eliminate a wildcard as part of 3 shapes at the same time", "Eliminate a wildcard as part of 7 shapes at the same time", "Double-eliminate a solid shape by completing 2 touching loose shapes at the same time", "Triple-eliminate a solid shape by completing 3 touching loose shapes at the same time", "Set off a chain of 5 explosions", "Set off a chain of 10 explosions", "Make a solid shape as tall as the bucket", "Bombard your victim with 100 shapes in one go in a multiplayer game", "Completely clear a quarter-full bucket in a Rated game", "Have over 30 shapes in your machine in a Rated game", "Unlock the Flowers theme in the Master Challenge (Theme 5)", "Unlock the City theme in the Master Challenge (Theme 7)", "Unlock the Eight-bit theme in the Master Challenge (Theme 8)", "Get at least 50,000 points in the Master Challenge", "Get at least 100,000 points in the Master Challenge", "Get at least 200,000 points in the Master Challenge", "Win a Rated game", "Win 3 Rated games in a row, in one session", "Win 5 Rated games in a row, in one session, starting with a Rating of at least 1500", "Win an 8-player Rated game", "Win an 8-player Rated game, defeating all opponents yourself", "Earn 50,000 points within the first two levels of the Master Challenge", "Win a Rated game without the glass breaking at all", "Defeat a FunOrb Moderator or someone who has this Achievement", "Send 500 shapes to other players in Rated games", "Send 1,000 shapes to other players in Rated games", "Send 2,500 shapes to other players in Rated games", "Send 5,000 shapes to other players in Rated games", "Send 10,000 shapes to other players in Rated games"};
        field_a = "Log in";
        field_g = "Accept <%0> into this game";
        field_f = "No";
        field_h = false;
        field_e = 0;
    }
}
