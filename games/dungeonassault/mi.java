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
        int var5 = 0;
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
        var16 = DungeonAssault.field_K;
        jh.c();
        var5 = param2.b(param1);
        var6 = param2.field_E + param2.field_H;
        var7 = new cn(var5, var6);
        var7.e();
        param2.b(param1, 0, param2.field_H, 16760960, -1);
        var8 = te.a(var5, var6, ag.field_c, 32, 32, 0.125);
        var9_int = 0;
        L0: while (true) {
          if (var8.field_B.length <= var9_int) {
            var9 = rb.a(16, var7, 16776960, (byte) -38);
            if (param3 != 13195) {
              field_c = null;
              var10 = -var7.field_y + param4.field_y >> 210041889;
              var11 = -var7.field_v + param4.field_v >> -857618527;
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
              return;
            } else {
              var10 = -var7.field_y + param4.field_y >> 210041889;
              var11 = -var7.field_v + param4.field_v >> -857618527;
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
              return;
            }
          } else {
            if (var7.field_B[var9_int] == 0) {
              var8.field_B[var9_int] = 0;
              var9_int++;
              var9_int++;
              continue L0;
            } else {
              var9_int++;
              var9_int++;
              continue L0;
            }
          }
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
        if (param0 >= -48) {
            field_b = null;
            g.field_Lb = dk.a(180, 1, "da_ingame_stealth");
            kj.field_o = dk.a(89, 1, "da_raid_win");
            tm.field_b = dk.a(131, 1, "da_raid_lose");
            gl.field_Ib = dk.a(200, 1, "da_stressing_music");
            dd.field_B = dk.a(100, 1, "da_defeat_monster");
            ek.field_b.field_A.f(-50);
            ha.field_k = null;
            return;
        }
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
        L0: {
          if ((ql.field_d ^ -1) > -225) {
            var1 = ql.field_d % 32;
            um.a(-var1 + (ql.field_d + 32), false);
            break L0;
          } else {
            um.a(256, false);
            break L0;
          }
        }
        if (param0 != 210041889) {
          mi.a(44, 123, 42, -24, 87);
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_a = null;
        if (param0 > -111) {
            return;
        }
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
