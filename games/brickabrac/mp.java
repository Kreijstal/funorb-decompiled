/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends mh {
    String field_Rb;
    mh field_Wb;
    int field_Sb;
    static String field_Pb;
    mh field_Xb;
    static NodeDeque field_Tb;
    String field_Ub;
    String field_Qb;
    static String[] field_bc;
    String field_ac;
    static RgbSprite[] field_Vb;
    static RgbSprite field_Zb;
    mh field_Yb;

    final static void a(int param0, int param1, int param2, int param3, fr param4, byte param5, int param6, int param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        dc stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dc var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        fr var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = BrickABrac.field_J ? 1 : 0;
        try {
          var44 = param4;
          if (param5 != -105) {
            return;
          }
          if (null != var44.field_p &&
            var44.field_A > 1) {
            var60 = var44.field_p;
            h.a(0, 0, (byte) 114, var60, AppletGameShell.field_m);
          } else {
            ArchiveNetworkClient.f((byte) 94);
          }
          var54 = new int[param4.field_o];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param4.field_o];
          var63 = wl.field_R;
          var62 = ff.field_f;
          var61 = nn.field_h;
          for (var13 = 0; param4.field_o > var13; var13++) {
            var14 = var61[var13] * param3 + param7 * var62[var13] + var63[var13] * param1 >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (0 <= var14) {
              if (var14 < 128) {
                stackIn_17_0 = 128 + var14;
              } else {
                stackIn_17_0 = 256;
              }
            } else {
              stackIn_17_0 = 128;
            }
            var14Lifetime2 = stackIn_17_0;
            var15 = var61[var13] * param0 + (var62[var13] * param6 + var63[var13] * param2) >> 8;
            stackIn_19_0 = ClientException.field_a;
            if (var15 >= 0) {
              stackIn_20_1 = var15;
            } else {
              stackIn_20_1 = -var15;
            }
            var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = var14Lifetime2 * (-var15Lifetime2 + 256) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < mc.field_c; var13Lifetime1++) {
            var14Lifetime1 = ek.field_jb[var13Lifetime1];
            var15Lifetime1 = param4.field_G[var14Lifetime1];
            var16 = param4.field_b[var14Lifetime1];
            var17 = param4.field_c[var14Lifetime1];
            if (wl.field_R.length <= param4.field_v[var14Lifetime1]) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = param4.field_v[var14Lifetime1];
            }
            var18 = stackIn_26_0;
            if (wl.field_R.length > param4.field_h[var14Lifetime1]) {
              stackIn_29_0 = param4.field_h[var14Lifetime1];
            } else {
              stackIn_29_0 = -1;
            }
            var19 = stackIn_29_0;
            if (wl.field_R.length <= param4.field_t[var14Lifetime1]) {
              stackIn_32_0 = -1;
            } else {
              stackIn_32_0 = param4.field_t[var14Lifetime1];
            }
            var20 = stackIn_32_0;
            if (null != um.field_o &&
              param4.field_L != null &&
              var14Lifetime1 < param4.field_L.length &&
              -1 != param4.field_L[var14Lifetime1] &&
              param4.field_L[var14Lifetime1] < um.field_o.length) {
              stackIn_39_0 = um.field_o[param4.field_L[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = ArchiveNetworkRequest.field_M[var15Lifetime1];
            var23 = ed.field_e[var15Lifetime1];
            var24 = ArchiveNetworkRequest.field_M[var16];
            var25 = ed.field_e[var16];
            var26 = ArchiveNetworkRequest.field_M[var17];
            var27 = ed.field_e[var17];
            if (var19 == var18 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_49_0 = var21.field_a;
              } else {
                stackIn_49_0 = 8355711;
              }
              var30 = stackIn_49_0;
              var31 = 16711935 & var30;
              var32 = 65280 & var30;
              var33 = (var28 * var31 & -16711791) >>> 8 | (var32 * var28 & 16711898) >>> 8;
              var33 = var33 + var29 * 65793;
              ki.a(var33 >> 1 & 8355711, var23, var26, var22, var25, var27, var24, 116);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_45_0 = var21.field_a;
              } else {
                stackIn_45_0 = 8355711;
              }
              var34 = stackIn_45_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = (var36 * var28 & 16711775) >>> 8 | var35 * var28 >>> 8 & -1895890689;
              var38 = (-16711863 & var29 * var35) >>> 8 | (var36 * var29 & 16711854) >>> 8;
              var39 = (var35 * var30 & -16711923) >>> 8 | (16711836 & var30 * var36) >>> 8;
              var38 = var38 + 65793 * var32;
              var37 = var37 + 65793 * var31;
              var39 = var39 + 65793 * var33;
              tq.a(var39 & 255, 255 & var37 >> 8, var26, (65445 & var38) >> 8, var24, var38 >> 16, var27, var39 >> 8 & 255, var23, (byte) -55, var38 & 255, var22, 255 & var37, var39 >> 16, var25, var37 >> 16);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("mp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_Tb = null;
        field_Pb = null;
        field_Zb = null;
        field_Vb = null;
        if (param0 >= -54) {
          return;
        }
        field_bc = null;
    }

    mp() {
        super(0L, (mh) null);
    }

    final static void a(int param0, ff param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          LevelPackCard.field_a[0] = ji.field_e.nextInt();
          LevelPackCard.field_a[1] = ji.field_e.nextInt();
          tq.field_f.position = 0;
          LevelPackCard.field_a[3] = (int)bj.field_ab;
          LevelPackCard.field_a[2] = (int)(bj.field_ab >> 32);
          tq.field_f.writeInt(LevelPackCard.field_a[0], (byte) -79);
          tq.field_f.writeInt(LevelPackCard.field_a[1], (byte) -79);
          tq.field_f.writeInt(LevelPackCard.field_a[2], (byte) -79);
          tq.field_f.writeInt(LevelPackCard.field_a[3], (byte) -79);
          he.a(tq.field_f, (byte) -95);
          tq.field_f.writeShort((byte) 113, param0);
          param1.a(0, tq.field_f);
          k.field_h.position = 0;
          if (!param2) {
            k.field_h.writeByte(94, 16);
          } else {
            k.field_h.writeByte(-4, 18);
          }
          k.field_h.position = k.field_h.position + 2;
          var5_int = k.field_h.position;
          k.field_h.writeInt(MainMenuScreen.field_x, (byte) -79);
          k.field_h.writeLong(-23054, LevelSelectScreen.field_E);
          var6 = 0;
          if (qb.field_u) {
            var6 = var6 | 1;
          }
          if (ec.field_O) {
            var6 = var6 | 4;
          }
          if (param3) {
            var6 = var6 | 8;
          }
          if (ai.field_t != null) {
            var6 = var6 | 16;
          }
          if (param4) {
            return;
          }
          k.field_h.writeByte(-105, var6);
          var7 = GameClock.a(true, uc.e((byte) -101));
          if (var7 == null) {
            var7 = "";
          }
          k.field_h.writeCp1252String(var7, -1);
          if (null != ai.field_t) {
            k.field_h.writePrefixedCp1252String(0, ai.field_t);
          }
          LevelDecoder.a(k.field_h, tq.field_f, Ball.field_F, (byte) -72, to.field_g);
          k.field_h.backfillShortLength(k.field_h.position - var5_int, 255);
          cr.a(-1, 10000);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("mp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_bc = new String[]{"Destroy <%0> bricks without losing a life.", "Destroy <%0> bricks without losing a life.", "Destroy <%0> bricks without losing a life.", "Complete <%0> levels in one play-through.", "Complete <%0> levels in one play-through.", "Reach level <%0> in either level set.", "Complete all levels in one set.", "Score <%0> points.", "Score <%0> points.", "Bounce any ball <%0> times without it touching the paddle.", "Bounce any ball <%0> times without it touching the paddle.", "Use the Build power-up <%0> times in Rated games.", "Gain Rating in <%0> Rated games in a row.", "Gain Rating in <%0> Rated games in a row.", "Place first <%0> Rated games in a row.", "Place first <%0> Rated games in a row.", "Complete any level after the first with the Halloween background.", "Defeat a FunOrb Moderator or someone who has this Achievement.", "Build up <%0> victories against FunOrb Moderators.", "Complete <%0> levels without losing a life.", "Complete <%0> levels without losing a life.", "Complete <%0> levels without losing a life.", "Destroy one brick for each colour of a rainbow, in order, without using the plasma ball.", "Get <%0> level ahead of the player chasing you, in a Rated game.", "Get <%0> levels ahead of the player chasing you, in a Rated game.", "Get <%0> levels ahead of the player chasing you, in a Rated game.", "Recover from 'Panic!' (flashing red) during a Rated game, then go on to win.", "Win a Rated game using the plasma ball once, and only once, per level.", "Win a Rated game without collecting any power-ups.", "Complete <%0> levels without collecting positive power-ups.", "Collect <%0> negative power-ups in a row.", "Collect <%0> negative power-ups in a row.", "Collect <%0> positive power-ups in a row.", "Collect <%0> positive power-ups in a row.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks without losing a life.", "Score <%0> points.", "Use the Weak power-up <%0> times in online multiplayer games, in one session during Hallowe'en."};
        field_Pb = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
