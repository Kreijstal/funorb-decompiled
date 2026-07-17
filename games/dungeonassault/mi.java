/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static String field_d;
    static String field_c;
    static String[] field_a;
    static int field_f;
    static String field_b;
    static nh field_e;

    final static void a(pp param0, String param1, se param2, int param3, cn param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        cn var7 = null;
        cn var8 = null;
        int var9_int = 0;
        cn var9 = null;
        int var10 = 0;
        int var11 = 0;
        cn var12 = null;
        cn var13 = null;
        cn var14 = null;
        cn var15 = null;
        int var16 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var16 = DungeonAssault.field_K;
        try {
          L0: {
            jh.c();
            var5_int = param2.b(param1);
            var6 = param2.field_E + param2.field_H;
            var7 = new cn(var5_int, var6);
            var7.e();
            param2.b(param1, 0, param2.field_H, 16760960, -1);
            var8 = te.a(var5_int, var6, ag.field_c, 32, 32, 0.125);
            var9_int = 0;
            L1: while (true) {
              if (var8.field_B.length <= var9_int) {
                L2: {
                  var9 = rb.a(16, var7, 16776960, (byte) -38);
                  if (param3 == 13195) {
                    break L2;
                  } else {
                    field_c = null;
                    break L2;
                  }
                }
                var10 = -var7.field_y + param4.field_y >> 1;
                var11 = -var7.field_v + param4.field_v >> 1;
                var12 = dd.a((byte) -112, 4, var8);
                var13 = param4.d();
                var13.e();
                bp.a(var11, var12, var10, (byte) 99);
                var8.h(var10, var11);
                var13.h();
                var14 = var13.d();
                var14.e();
                gf.b(0, 0, param4.field_y, param4.field_v, 0, 160);
                var15 = param4.d();
                var15.e();
                rb.a(8, var7, 12690143, (byte) -34).b(var10, var11, 32);
                var7.h(var10, var11);
                var9.field_w = var9.field_w + var10;
                var9.field_A = var9.field_A + var11;
                jh.b();
                param0.a(var13, var9, var15, var14, 31);
                break L0;
              } else {
                L3: {
                  if (var7.field_B[var9_int] == 0) {
                    var8.field_B[var9_int] = 0;
                    var9_int++;
                    break L3;
                  } else {
                    var9_int++;
                    break L3;
                  }
                }
                var9_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("mi.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param3).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 25570) {
          field_b = null;
          ag.field_a = param4;
          mj.field_g = param2;
          i.field_n = param0;
          li.field_g = param3;
          return;
        } else {
          ag.field_a = param4;
          mj.field_g = param2;
          i.field_n = param0;
          li.field_g = param3;
          return;
        }
    }

    final static void a(int param0) {
        lf.field_w = dk.a(120, 1, "da_title3");
        jd.field_o = dk.a(170, 1, "da_intro");
        wj.field_u = dk.a(150, 1, "da_highscores");
        gh.field_d = dk.a(110, 1, "da_ingame_battle");
        g.field_Lb = dk.a(180, 1, "da_ingame_stealth");
        kj.field_o = dk.a(89, 1, "da_raid_win");
        tm.field_b = dk.a(131, 1, "da_raid_lose");
        gl.field_Ib = dk.a(200, 1, "da_stressing_music");
        dd.field_B = dk.a(100, 1, "da_defeat_monster");
        ek.field_b.field_A.f(-50);
        ha.field_k = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (ql.field_d >= 224) {
            um.a(256, false);
        } else {
            var1 = ql.field_d % 32;
            um.a(-var1 + (ql.field_d + 32), false);
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "There is a bounty on this dungeon - you will be awarded <%0> Treasure if you reach the hoard room.";
        field_a = new String[]{"Ferocity", "Double <%attack> in first round of combat."};
        field_b = "Tripwire Bell";
    }
}
