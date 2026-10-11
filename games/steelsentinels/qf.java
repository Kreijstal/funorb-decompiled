/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static String[] field_a;
    static RgbSprite field_f;
    static ol field_e;
    static String field_j;
    static boolean field_b;
    static SceneWidget field_c;
    static String field_i;
    static String field_g;
    static e field_d;
    static int[] field_h;

    public static void a(boolean param0) {
        field_i = null;
        field_g = null;
        field_d = null;
        field_f = null;
        field_a = null;
        if (!param0) {
          field_h = null;
          field_e = null;
          field_c = null;
          field_j = null;
          return;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 == 100) {
          var1 = sh.c(115);
          var2 = ui.a(false);
          tk.field_p.a((ug.field_I << 1) + var1, -15203, ej.field_D - ug.field_I, var2 + (on.field_n << 1), ug.field_Q - on.field_n);
          dk.b(param0 - 6661);
          return;
        }
    }

    final static void a(boolean param0, byte param1) {
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        boolean stackIn_22_1 = false;
        boolean stackIn_28_0 = false;
        int stackIn_34_0 = 0;
        boolean stackIn_35_1 = false;
        int stackIn_50_0 = 0;
        boolean stackIn_51_1 = false;
        boolean stackIn_57_0 = false;
        int stackIn_63_0 = 0;
        boolean stackIn_64_1 = false;
        boolean stackIn_69_0 = false;
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        if (fk.field_i != null) {
          fk.field_i.c(param0, 21519);
        }
        if (si.field_A != null) {
          si.field_A.c(param0, 21519);
        }
        if (param1 >= -116) {
          return;
        }
        if (!pc.field_w) {
          return;
        }
        if (!Sprite.field_k) {
          return;
        }
        if (ob.field_y) {
          if (!jn.field_g) {
            var2 = 0;
            stackIn_50_0 = -94;
            stackIn_51_1 = (param0) && (li.c(8)) && (var2 == 0);
            lk.$cfr$intArgs$a$7ffe4b125357(stackIn_50_0, stackIn_51_1);
            if (var2 != 0) {
              stackIn_57_0 = (param0) && (li.c(8));
              de.a(stackIn_57_0, -126);
            }
            return;
          }
          var2Lifetime3 = 1;
          stackIn_63_0 = -94;
          stackIn_64_1 = (param0) && (li.c(8)) && (var2Lifetime3 == 0);
          lk.$cfr$intArgs$a$7ffe4b125357(stackIn_63_0, stackIn_64_1);
          if (var2Lifetime3 == 0) {
            return;
          }
          stackIn_69_0 = (param0) && (li.c(8));
          de.a(stackIn_69_0, -126);
          return;
        }
        if (!CombatWorld.field_G) {
          var2Lifetime1 = 0;
          stackIn_34_0 = -94;
          stackIn_35_1 = (param0) && (li.c(8)) && (var2Lifetime1 == 0);
          lk.$cfr$intArgs$a$7ffe4b125357(stackIn_34_0, stackIn_35_1);
          if (var2Lifetime1 == 0) {
            return;
          }
          if (!param0) {
            de.a(false, -126);
          } else {
            if (!li.c(8)) {
              de.a(false, -126);
            } else {
              de.a(true, -126);
            }
          }
          return;
        }
        stackIn_17_0 = (!jn.field_g) ? 0 : 1;
        var2Lifetime2 = stackIn_17_0;
        stackIn_21_0 = -94;
        stackIn_22_1 = (param0) && (li.c(8)) && (var2Lifetime2 == 0);
        lk.$cfr$intArgs$a$7ffe4b125357(stackIn_21_0, stackIn_22_1);
        if (var2Lifetime2 != 0) {
          stackIn_28_0 = (param0) && (li.c(8));
          de.a(stackIn_28_0, -126);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        int var6;
        int var7;
        int var6Lifetime1;
        int var7Lifetime1;
        pd.field_S[kc.field_z] = param1;
        un.field_j[kc.field_z] = kc.field_z;
        ok.field_d[kc.field_z] = param5;
        if (nj.field_S > param5) {
          ti.field_w = param5;
        }
        if (param5 > k.field_Lb) {
          mj.field_cc = param5;
        }
        jm.field_r[kc.field_z] = param2;
        ne.field_G[kc.field_z] = param0;
        Sentinel.field_T[kc.field_z] = param4;
        if (param3 > 36) {
          var6 = param4 + param0 + param2;
          if (var6 != 0) {
            stackIn_23_0 = param2 * 1000 / var6;
          } else {
            stackIn_23_0 = 0;
          }
          var7 = stackIn_23_0;
          eb.field_u[kc.field_z] = var7;
          if (var7 < ti.field_w) {
            ti.field_w = var7;
          }
          if (var7 > mj.field_cc) {
            mj.field_cc = var7;
          }
          kc.field_z = kc.field_z + 1;
          return;
        }
        field_e = (ol) null;
        var6Lifetime1 = param4 + param0 + param2;
        if (var6Lifetime1 != 0) {
          stackIn_10_0 = param2 * 1000 / var6Lifetime1;
        } else {
          stackIn_10_0 = 0;
        }
        var7Lifetime1 = stackIn_10_0;
        eb.field_u[kc.field_z] = var7Lifetime1;
        if (var7Lifetime1 < ti.field_w) {
          ti.field_w = var7Lifetime1;
        }
        if (var7Lifetime1 > mj.field_cc) {
          mj.field_cc = var7Lifetime1;
        }
        kc.field_z = kc.field_z + 1;
    }

    final static he a(int param0, int param1, java.awt.Component param2, byte param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          he var5 = null;
          ti var5_ref = null;
          he stackIn_3_0 = null;
          ti stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param3 > -90) {
              field_g = (String) null;
            }
            try {
              var4 = Class.forName("kn");
              var5 = (he) (var4.newInstance());
              var5.a(param1, (byte) -87, param2, param0);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ti();
              ((he) ((Object) var5_ref)).a(param1, (byte) -78, param2, param0);
              stackIn_5_0 = var5_ref;
              return (he) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("qf.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new String[]{"recruit", "cadet", "ensign", "commander", "captain", "major", "colonel", "brigadier", "general", "admiral", "field marshal", "your majesty"};
        field_b = false;
        field_j = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_i = "<%0> cannot join; the game is full.";
        field_h = new int[]{100, 250, 500, 750, 1000, 100, 250, 500, 750, 1000, 100, 250, 500, 750, 1000, 900, 100, 100, 300, 700, 1000, 100, 200, 900, 800, 500, 300, 500, 400, 400, 900, 600, 200, 200, 2000};
        field_g = "Cancel";
    }
}
