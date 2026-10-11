/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hv {
    static boolean[] field_a;
    static String field_b;
    static String field_d;
    static String[][] field_c;

    final static String a(boolean param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = bg.a((byte) 116, jc.a(param1, param0));
          if (param0) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (var2 == null) {
            var2 = "";
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("hv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(boolean param0, nu param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        nl var18 = null;
        nl var19 = null;
        var17 = Kickabout.field_G;
        try {
          var18 = param1.field_P[param2][0];
          var19 = var18;
          stackIn_4_0 = (param2 != 1) ? 0 : 1;
          var4 = stackIn_4_0;
          stackIn_7_0 = (var4 != 0) ? 0 : 1344;
          var5 = stackIn_7_0;
          var6 = var19.f(-95);
          var7 = var19.a(param0);
          var8 = param1.field_V.a(true);
          var9 = param1.field_V.c(879306160);
          var10 = param1.field_V.e(-107);
          var11 = 448 - var8;
          var12 = -var9 + var5;
          stackIn_10_0 = (62500 <= var11 * var11 + var12 * var12) ? 0 : 1;
          var13 = stackIn_10_0;
          if (var19.field_u != 14) {
            stackIn_16_0 = (var19.field_u == 0) ? 1 : 0;
          } else {
            stackIn_16_0 = 1;
          }
          var14 = stackIn_16_0;
          if (3 == var19.field_u) {
            var19.field_G = uv.a(true, var9 - var7, -var6 + var8);
            if (-1 == param1.field_V.field_m) {
              var19.a((byte) -31, 0);
              return;
            }
            if (param1.field_V.field_m == param2 &&
              param1.field_V.field_s == 0) {
              var19.a((byte) -31, 10);
              return;
            }
            var15 = -448 + var6;
            var16 = -var5 + var7;
            if (62500 < var15 * var15 + var16 * var16) {
              var19.field_L = 0;
              return;
            }
          } else {
            if (var14 == 0) {
              return;
            }
            if (param1.field_V.field_m == param2 &&
              param1.field_V.field_s == 0) {
              lk.a(param2, param1, -96, var19);
              return;
            }
            if (var13 != 0 &&
              -1 == param1.field_V.field_m &&
              var10 < 400000) {
              var19.field_u = 0;
              ue.a(4, var8, var19, var9);
              return;
            }
            if (wt.a(param1.field_V, var19, (byte) -75, param2)) {
              return;
            }
            gg.a(param2, 0, param1.field_V);
            ue.a(4, pu.field_zb[0], var18, pu.field_zb[1]);
            if (var19.field_u == 0 &&
              0 == var19.field_G) {
              var19.a((byte) -31, 14);
            }
            if (var13 != 0) {
              es.a(-120, var19, param2, param1.b((byte) -96), param1.field_V);
            }
            if (var19.field_u == 14) {
              var19.a(uv.a(param0, -var19.a(true) + var9, var8 - var19.f(-98)), 26214);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_49_0 = var3;
          stackIn_49_1 = new StringBuilder().append("hv.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 23) {
          field_b = (String) null;
        }
        field_c = (String[][]) null;
    }

    final static void a(hu param0, int param1) {
        if (param1 != -448) {
          return;
        }
        try {
          cq.field_e = param0;
          ae.field_D = h.a(17475);
          js.field_d = new tf();
          bk.field_c = new gv[6];
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "hv.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        int var0 = 0;
        field_a = new boolean[73];
        field_b = "Player's Stats at Max";
        for (var0 = 0; var0 < field_a.length; var0++) {
          field_a[var0] = false;
        }
        field_a[23] = true;
        field_a[66] = true;
        field_a[28] = true;
        field_a[54] = true;
        field_d = "leave";
        field_c = new String[][]{new String[]{"<img=0>Each character has at least one slot for game-enhancing trinkets.", "<img=0>The trinket must match the shape of the slot. Higher level players have more interesting slot shapes.", "<img=0>The diamond slot gives access to the most powerful trinkets in the game. Only Elites have these slots."}, new String[]{"<img=0>Once attached to a character, trinkets can be replaced but not removed.", "<img=0>Circle trinkets offer basic enhancements; square and triangle trinkets have more interesting and powerful effects.", "<img=0>Diamond trinkets allow characters to use class-specific abilities, such as sprinting with the ball and turning while tackling."}};
    }
}
