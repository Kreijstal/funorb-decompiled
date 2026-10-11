/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    int field_n;
    int field_g;
    static gh field_d;
    int field_e;
    int field_q;
    int field_i;
    byte[] field_p;
    static String field_a;
    static int field_h;
    byte[] field_m;
    static String field_c;
    int field_o;
    static String field_f;
    static String[] field_l;
    static int[] field_b;
    int field_k;
    static int field_j;

    final static void a(int param0, java.applet.Applet param1) {
        String var3 = null;
        long var4 = 0L;
        sn.field_d = true;
        String var2 = "tuhstatbut";
        if (param0 >= -48) {
          return;
        }
        try {
          var3 = "rvnadlm";
          var4 = -1L;
          mm.a(var2, (byte) 97, var3, param1, var4);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "bj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_l = null;
        field_a = null;
        if (param0 == 7) {
          field_f = null;
          return;
        }
        bj.a(74);
        field_f = null;
    }

    final static boolean a(int[] param0, int param1, boolean param2, byte param3) {
        boolean stackIn_27_0 = false;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = SteelSentinels.field_G;
        try {
          if (param3 < 81) {
            var9 = (int[]) null;
            bj.a((int[]) null, 21, true, (byte) -121);
          }
          var4_int = ul.a((byte) 71, param1);
          if (var4_int < 0) {
            return false;
          }
          if (var4_int < 3) {
            return true;
          }
          if (var4_int >= 6 &&
            !param2) {
            return false;
          }
          var5 = 0;
          for (var6 = 0; var6 < 6; var6++) {
            if (t.a(param0, n.field_z[var6], -20370)) {
              var5++;
            }
          }
          if (6 > var4_int) {
            stackIn_27_0 = !(var4_int >= var5 + 2);
            return stackIn_27_0;
          }
          var6Lifetime1 = 0;
          for (var7 = 6; n.field_z.length > var7; var7++) {
            if (t.a(param0, n.field_z[var7], -20370)) {
              var6Lifetime1++;
            }
          }
          var7Lifetime1 = var6Lifetime1 + 7;
          if (var5 == 6) {
            var7Lifetime1++;
          }
          return !(var4_int >= var7Lifetime1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("bj.C(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_a = "You haven't enough solarite cubes to engineer the <%0> at this time.<br>Earn more solarite cubes by playing Rated games.";
        field_f = "Staff impersonation";
        field_l = new String[]{"Most kills<%0>", " (You got <%0>)", "Most damage dealt<%0>", " (You dealt <%0>)", "Longest killing streak<%0>", " (Yours: <%0>)", "First kill", null, "Fewest deaths<%0>", " (You died <%0>)", "Perfect", " (You died <%0>)", "Sole survivor", null, "Longest flight<%0>", " (Yours: <%0>)", "Highest score", null, "Most interceptions<%0>", " (You got <%0>)", "Best kill combo<%0>", " (Yours: <%0>)", "Most melee kills<%0>", " (You got <%0>)", "Most gun/flak kills<%0>", " (You got <%0>)", "Most cannon/mortar kills<%0>", " (You got <%0>)", "Most rail gun kills<%0>", " (You got <%0>)", "Most beam kills<%0>", " (You got <%0>)", "Most plasma kills<%0>", " (You got <%0>)", "Most rocket/missile kills<%0>", " (You got <%0>)", "Most kills with atomics<%0>", " (You got <%0>)", "Most ship energises<%0>", " (You got <%0>)", "First to energise ship", null, "Killed most energised enemies<%0>", " (You got <%0>)", "Finished with MGFN", null, "Most kills while holding MGFN<%0>", " (You got <%0>)", "Most time with MGFN<%0>", " (Yours: <%0>)", "Highest scoring team<%0>", " (Your team: <%0>)", "Boss killer", null, "Best sniper accuracy<%0>", " (Yours: <%0>)", "Most power-ups<%0>", " (You got <%0>)", "Most kills of MGFN sentinels<%0>", " (You got <%0>)", "Most time in the energy shield<%0>", " (Yours: <%0>)", "Most bat kills<%0>", " (You got <%0>)"};
        field_b = new int[]{17, 18, 3, 22, -1, 8};
    }
}
