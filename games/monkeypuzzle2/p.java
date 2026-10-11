/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_b;
    static int field_a;
    static int[] field_d;
    static String field_c;

    final static void b(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        de var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        d var6_ref_d = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hb var28 = null;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var28 = MonkeyPuzzle2.field_D;
          var2 = var28.a((byte) 114);
          if (var2 == 0) {
            var3 = var28.j(17277);
            var4 = (de) (qa.field_d.a((byte) -117));
            while (var4 != null) {
              if (~var3 != ~var4.field_k) {
                var4 = (de) (qa.field_d.d((byte) 63));
                continue;
              }
              break;
            }
            if (var4 == null) {
              gk.a(-1);
              return;
            }
            var5 = var28.a((byte) 114);
            if (var5 != 0) {
              var6 = var4.field_h;
              var7 = var4.field_e;
              ah.field_a[0].field_d = cl.field_e;
              ah.field_a[0].field_c = null;
              ah.field_a[0].field_a = false;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                ah.field_a[var8_int].field_d = var28.f(-1);
                ah.field_a[var8_int].field_a = false;
                if (1 != var28.a((byte) 114)) {
                  ah.field_a[var8_int].field_c = null;
                } else {
                  ah.field_a[var8_int].field_c = var28.f(-1);
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_g = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_p = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_i = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.a((byte) 114);
              if (var18 > 0) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var28.a((byte) 114);
                  var21 = ah.field_a[var20].field_d;
                  var22 = var28.i(89);
                  var24 = var28.field_h;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = ah.field_a[var20].field_c;
                    var10[0][var12] = var22;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.e(-95);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    f.a(-15189, var21)) {
                    var8[1][var13] = cl.field_e;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var28.field_h = var24;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.e(126);
                    }
                  }
                  if (var14 < var6 &&
                    !ah.field_a[var20].field_a) {
                    ah.field_a[var20].field_a = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = ah.field_a[var20].field_c;
                    var10[2][var14] = var22;
                    var14++;
                    var28.field_h = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.e(127);
                    }
                  }
                }
              }
            }
            var4.field_l = true;
            var4.c(-19822);
          } else if (1 == var2) {
            var3 = var28.j(17277);
            var4_long = var28.i(58);
            var6_ref_d = (d) (wk.field_b.a((byte) -117));
            while (var6_ref_d != null) {
              if (~var6_ref_d.field_n != ~var3) {
                var6_ref_d = (d) (wk.field_b.d((byte) 63));
                continue;
              }
              break;
            }
            if (var6_ref_d == null) {
              gk.a(-1);
              return;
            }
            var6_ref_d.field_g = var4_long;
            var6_ref_d.c(-19822);
          } else {
            kk.a("HS1: " + bh.a((byte) -105), (byte) 115, (Throwable) null);
            gk.a(-1);
          }
          if (param0 >= -62) {
            field_b = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "p.D(" + param0 + ')');
        }
    }

    final static void a(String param0, byte param1, int param2, String[] param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        String[] var6 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 < 95) {
            return;
          }
          ed.field_c = f.field_i;
          if (255 == param2) {
            stackIn_11_0 = -89;
            stackIn_12_1 = !(dd.field_d >= 13);
            w.field_c = hj.$cfr$intArgs$a$ae8766b723be(stackIn_11_0, stackIn_12_1);
            var6 = (String[]) null;
            wh.a((String[]) null, true);
          } else {
            if (param2 >= 100 &&
              105 >= param2) {
              var4 = param3;
              wh.a(var4, true);
              w.field_c = jj.a(param3, true);
              return;
            }
            w.field_c = lh.a(true, param0, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("p.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static Object a(byte[] param0, byte param1, boolean param2) {
        ab var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ab stackIn_6_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (param0.length > 136) {
            var3 = new ab();
            ((ka) ((Object) var3)).a(76, param0);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param1 < 109) {
            p.a(39);
          }
          if (param2) {
            stackIn_13_0 = bk.a(0, param0);
            return stackIn_13_0;
          }
          stackIn_11_0 = (byte[]) (param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("p.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != -14) {
          return;
        }
        field_c = null;
    }

    static {
        field_b = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_a = 0;
        field_d = new int[8192];
        field_c = "Email: ";
    }
}
