/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dta {
    static String field_e;
    private ModelAnimator field_c;
    static boolean[] field_g;
    private int[] field_a;
    static String[] skipRoomMessages;
    private int[] field_f;
    static String[] field_b;
    private String[] field_h;

    public static void releaseStatics(int param0) {
        field_e = null;
        skipRoomMessages = null;
        field_b = null;
        field_g = null;
        if (param0 != 0) {
          skipRoomMessages = (String[]) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, MatchScreen param4, int param5, int param6) {
        int var36_int = 0;
        int stackIn_12_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        MatchState var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        Player var12 = null;
        PlayerSimulation var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        int var21 = 0;
        Weapon var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        double var28_double = 0.0;
        GameFont var28 = null;
        int var28_int = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        float var33_float = 0.0f;
        Room var34 = null;
        int var34_int = 0;
        Trap[] var35 = null;
        int var35_int = 0;
        GameFont var36 = null;
        int var37 = 0;
        Object var38_ref = null;
        int var38 = 0;
        Behaviour var38_ref_nv = null;
        int var39 = 0;
        int var40 = 0;
        String var41 = null;
        String var42 = null;
        String var43 = null;
        String var27Lifetime1;
        String var27Lifetime2;
        String var27Lifetime3;
        String var27Lifetime4;
        GameFont var28Lifetime1;
        int var10Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var26Lifetime1;
        int var27_intLifetime1;
        int var29Lifetime1;
        int var29Lifetime2;
        int var30Lifetime1;
        int var30Lifetime2;
        int var30Lifetime3;
        int var31Lifetime1;
        int var31Lifetime2;
        int var31Lifetime3;
        int var31Lifetime4;
        int var32Lifetime1;
        int var32Lifetime2;
        int var37Lifetime1;
        int var39Lifetime1;
        int var39Lifetime2;
        var38_ref = null;
        var40 = TombRacer.field_G ? 1 : 0;
        try {
          var8_int = 10;
          if (param4.f(-12963, param2) &&
            !param4.isSendWindowFull(-95)) {
            var10 = -94 / ((51 - param3) / 40);
            var9 = param4.matchState;
            var11 = param4.getViewedPlayerIndex(107);
            var12 = var9.players[param2];
            var13 = var9.simulations[param2];
            var14 = var13.tick;
            var15 = var9.standings.positions[param2];
            stackIn_12_0 = (var11 != param2) ? 0 : 1;
            var16 = stackIn_12_0;
            if (var9.playersRemaining > 1) {
              if (var9.hasFinishedCourse((byte) 90, param2)) {
                tga.field_a.setClip(param0, param5, param1, param6);
                Room.field_j.a(0, 0);
                SocketConnector.a(ad.field_i.toUpperCase(), 1, SingleChildWidget.field_v, 10981495, 20, -param5 + param6, 1, param5, param0, 1, (byte) 60, -param0 + param1);
                SocketConnector.a(dea.a(var9.getSimulationTick((byte) 115, param2), (byte) -8), 1, eda.field_f, 10981495, 20, param6 - param5, 1, param5 + 30, param0, 1, (byte) 60, param1 - param0);
                tga.field_a.la();
                return;
              }
              if (var15 < 0) {
                RoomEffectTraps.a(0, -34, param6 - 26, ik.field_j, param0 + var8_int, eda.field_f, 16777215);
              } else {
                RoomEffectTraps.a(0, -50, param6 - 13, Integer.toString(1 + var15), param0 + var8_int, SingleChildWidget.field_v, wga.field_a[param2]);
                RoomEffectTraps.a(0, -70, param6 - 12, param4.getPlayerName(param2, false).toUpperCase(), 25 + (param0 + var8_int), eda.field_f, wga.field_a[param2]);
              }
            }
            if (param4.isSpectating((byte) 118)) {
              return;
            }
            if (var16 != 0) {
              var17 = 8;
              ColourFillOperator.field_m.a(var17, 0);
              var18 = 0;
              var19 = dea.a(var14, (byte) -8);
              RoomEffectTraps.a(0, -106, var18 + (param5 + 34), var19.substring(0, -3 + var19.length()), 12 + param0 + var17, SingleChildWidget.field_v, 11903361);
              RoomEffectTraps.a(0, -102, var18 + (param5 + 35), var19.substring(var19.length() - 2, var19.length()), 98 + (var17 + param0), eda.field_f, 11903361);
              var20 = 1 + var12.getCourseIndex(-104);
              var21 = var12.getSimulation(-1).getRoomArrayLength(122);
              if (var12.getSimulation(-1).d(28091)) {
                var21 = (var21 >> 1) + 1;
                var20 = 1 + (var20 >> 1);
              }
              MembersUpsellMenu.a(LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(102, TimingPattern.field_k, new String[]{Integer.toString(var20), Integer.toString(var21)}).toUpperCase(), 11903361, eda.field_f, -1, param5 + var18 + 58, var17 + (param0 + 64), 0);
              var18Lifetime1 = -75 + param6 - var8_int;
              var17Lifetime1 = -10;
              var22 = var12.getWeapon(-163585215);
              var23 = var12.s(0) ? 1 : 0;
              if (var22 != null) {
                LegacyOpenGlEffectManager.field_a.a(var17Lifetime1 + 20, var18Lifetime1 + 5);
              } else {
                if (var23 != 0) {
                  ura.a(-10985);
                  hp.a(1024, 512, 0, this.field_c.getModel((byte) 74), -1918106173, 70 + var18Lifetime1, var17Lifetime1 + 55);
                  RemovedFromGameMenu.f((byte) -6);
                }
              }
              var17Lifetime2 = param1 - bd.field_i.width();
              var18Lifetime2 = -20 + SwitchLinkList.b(0);
              var24 = 0;
              var25 = 16;
              if (!param4.field_D &&
                !param4.c(false)) {
                var26 = doa.b(var12.getRoom((byte) 125).getId((byte) -82), 0, param4.m(-1)).field_h;
                if (0 == var26) {
                  var26 = 750;
                }
                var26 = var26 * 2;
                var27_int = var12.getRoom((byte) 125).getTick((byte) 118);
                var28_double = 80.0 * (double)var27_int / (double)var26;
                if (var27_int > -50 + var26) {
                  var25 = -((var27_int - var26) / 4) + 16;
                  if (8 > var25) {
                    var25 = 8;
                  }
                  if (16 < var25) {
                    var25 = 16;
                  }
                }
                if (80.0 < var28_double) {
                  var24 = -50 + (var27_int - var26);
                  if (var24 < 0) {
                    var24 = 0;
                  }
                  if (var24 > 50) {
                    var24 = 50;
                  }
                  var28_double = 80.0;
                }
                qf.field_j.a((aa) null, 12, 0, 0, var18Lifetime2 - (CachedTextLayout.field_l.height() - 32), -16777216, (int[]) null, 1, -5599403, bd.field_j.toUpperCase(), (byte) -66, 300, 0, (ToolkitSprite[]) null, -14 + (param1 + var24), 0);
                var30 = 30 + (-CachedTextLayout.field_l.height() + var18Lifetime2) + 80;
                vua.field_A.a(param1 - (CachedTextLayout.field_l.width() - var24), var18Lifetime2 - CachedTextLayout.field_l.height() + (-vua.field_A.height() + var25));
                var31 = (int)(-var28_double + (double)var30);
                lh.field_b.a(-lh.field_b.width() + (param1 - 1) + var24, var18Lifetime2 - lh.field_b.height() - CachedTextLayout.field_l.height());
                tga.field_a.setClip(param1 - 28 + var24, 0, var24 - 20 + param1, 10 + var31);
                if (var28_double < 80.0) {
                  dn.field_d[(var14 >> 2) % 4 + 3].a(-48 + (param1 - CachedTextLayout.field_l.width()), 36 + (var18Lifetime2 - (CachedTextLayout.field_l.height() + vua.field_A.height())));
                }
                tga.field_a.la();
                tga.field_a.setClip(param1 - (30 - var24), var31, -20 + param1 + var24, var30);
                MirrorBehaviour.field_r.a(var24 + (-30 + param1), var31);
                tga.field_a.la();
                CachedTextLayout.field_l.a(-1 + param1 - CachedTextLayout.field_l.width() + var24, -CachedTextLayout.field_l.height() + var18Lifetime2);
              }
              if (var24 > 30) {
                var24 = 35;
              }
              var18Lifetime3 = 0;
              var17Lifetime3 = var24 + (param1 - 60);
              var26Lifetime1 = var17Lifetime3;
              tv.field_wb.a(26 + (var17Lifetime3 + (-var24 - (tv.field_wb.width() >> 1))), -42 + param6);
              for (var27_intLifetime1 = 0; var27_intLifetime1 < 3; var27_intLifetime1++) {
                var28_int = -68 + param6;
                var29 = var12.getRoomTreasure(393216, var27_intLifetime1);
                for (var30Lifetime1 = 0; var29 > var30Lifetime1; var30Lifetime1++) {
                  PlayerProfile.field_r[var27_intLifetime1].a(var26Lifetime1, var28_int);
                  var28_int -= 5;
                }
                var26Lifetime1 -= 20;
              }
              var27 = "";
              var28 = eda.field_f;
              var41 = Integer.toString(var12.getRoomTreasureScore(-7991));
              var27Lifetime1 = var41;
              var27Lifetime2 = var41;
              S2CNextRoundPacket.a(4, var28, var41.toUpperCase(), 34 + (var17Lifetime3 + (10 - var24)), 0, -16 + param6, 11903361);
              var18Lifetime4 = 0;
              var17Lifetime4 = param1 - var8_int - 140;
              bd.field_i.a(var17Lifetime4, var18Lifetime4);
              var27Lifetime3 = "";
              var28Lifetime1 = eda.field_f;
              if (!param4.field_D &&
                !param4.c(false)) {
                var27Lifetime4 = Integer.toString(var12.getScore(77));
              } else {
                var29Lifetime1 = 0;
                var29Lifetime1 = var29Lifetime1 + var12.getTreasure(196608, 0) * gp.field_i[0];
                var29Lifetime1 = var29Lifetime1 + var12.getTreasure(196608, 1) * gp.field_i[1];
                var29Lifetime1 = var29Lifetime1 + var12.getTreasure(196608, 2) * gp.field_i[2];
                var27Lifetime4 = Integer.toString(var29Lifetime1);
              }
              S2CNextRoundPacket.a(4, var28Lifetime1, var27Lifetime4.toUpperCase(), var17Lifetime4 + 130, 0, 26 + var18Lifetime4, 11903361);
              var18Lifetime5 = param5 + 25;
              var17Lifetime5 = param1 - 36;
              var29Lifetime2 = var18Lifetime5;
              for (var30Lifetime2 = 0; var30Lifetime2 < 3; var30Lifetime2++) {
                if (1 != var30Lifetime2) {
                  stackIn_72_0 = (var30Lifetime2 == 2) ? 2 : 0;
                } else {
                  stackIn_72_0 = 3;
                }
                var31Lifetime1 = -stackIn_72_0 + var29Lifetime2 + 26;
                var32 = var12.getTreasure(196608, var30Lifetime2);
                PlayerProfile.field_r[var30Lifetime2].a(var17Lifetime5, var29Lifetime2);
                MembersUpsellMenu.a(Integer.toString(var32), 11903361, qf.field_j, -1, var31Lifetime1, var17Lifetime5 - 19, 1);
                if (var32 != this.field_a[var30Lifetime2]) {
                  this.field_h[var30Lifetime2] = Integer.toString(-this.field_a[var30Lifetime2] + var32) + "+";
                  this.field_a[var30Lifetime2] = var32;
                  this.field_f[var30Lifetime2] = 50;
                }
                if (this.field_f[var30Lifetime2] > 0) {
                  this.field_f[var30Lifetime2] = this.field_f[var30Lifetime2] - 1;
                  var33_float = 1.0f + (0.10000000149011612f + 0.20000000298023224f * (float)Math.sin(0.7 * (double)this.field_f[var30Lifetime2]));
                  var34_int = (int)((float)PlayerProfile.field_r[var30Lifetime2].width() * var33_float);
                  var35_int = (int)((float)PlayerProfile.field_r[var30Lifetime2].height() * var33_float);
                  PlayerProfile.field_r[var30Lifetime2].a(var17Lifetime5 + (-var34_int + PlayerProfile.field_r[var30Lifetime2].width()) / 2, (PlayerProfile.field_r[var30Lifetime2].height() - var35_int) / 2 + var29Lifetime2, var34_int, var35_int, 1, -1, 1);
                  MembersUpsellMenu.a(this.field_h[var30Lifetime2], 14142651, qf.field_j, -1, var31Lifetime1, -49 + var17Lifetime5, 1);
                }
                var31Lifetime1 += 23;
                var29Lifetime2 += 24;
              }
              if (!var12.isDying(119) &&
                null != var12.getRoom((byte) 94).collisionGrid) {
                var30Lifetime3 = 0;
                var31Lifetime2 = 0;
                var32Lifetime1 = 0;
                var33 = 0;
                var34 = var12.getRoom((byte) 101);
                var35 = var34.getAllTraps(16);
                for (var36_int = 0; var36_int < var35.length; var36_int++) {
                  if (var30Lifetime3 == 0 ||
                    var31Lifetime2 == 0) {
                    var37 = 0;
                    var38_ref_nv = (Behaviour) (var35[var36_int].behaviours.first(-80));
                    while (var38_ref_nv != null) {
                      if (var38_ref_nv instanceof SnakePitBehaviour) {
                        var30Lifetime3 = 1;
                      } else {
                        if (!(var38_ref_nv instanceof SimpleBlockBehaviour)) {
                          var38_ref_nv = (Behaviour) (var35[var36_int].behaviours.next(121));
                          continue;
                        }
                        var37 = 1;
                      }
                      break;
                    }
                    if (var35[var36_int].isPushable((byte) -55, false) &&
                      var37 != 0 &&
                      0 != var35[var36_int].getDestroyStatType(17825792)) {
                      var31Lifetime2 = 1;
                    }
                  }
                }
                if (var12.isHoldingItem(100)) {
                  var32Lifetime1 = 1;
                }
                if (var12.getWeapon(-163585215) != null) {
                  var33 = 1;
                }
                var36 = eda.field_f;
                var37Lifetime1 = 16;
                var38 = 1;
                if (1 >= var9.playerCount) {
                  param6 -= 20;
                } else {
                  param1 -= 10;
                  param0 = 10;
                  param6 -= 55;
                  if (var33 != 0) {
                    param0 += 66;
                  }
                  var38 = 0;
                }
                if (var30Lifetime3 != 0) {
                  var39 = var36.a((aa) null, param1, var37Lifetime1, 0, param6 - 28, SoundEvent.a(false, 0), SpriteState.field_l, var38, SoundEvent.a(false, 11903361), aca.field_g, (byte) 124, 48, 0, id.field_h, param0, 2);
                  param6 = param6 - var37Lifetime1 * var39;
                }
                if (var32Lifetime1 != 0) {
                  var39Lifetime1 = var36.a((aa) null, param1, var37Lifetime1, 0, param6 - 28, SoundEvent.a(false, 0), SpriteState.field_l, var38, SoundEvent.a(false, 11903361), hda.field_h, (byte) 72, 48, 0, id.field_h, param0, 2);
                  param6 = param6 - var37Lifetime1 * var39Lifetime1;
                } else {
                  if (var31Lifetime2 != 0) {
                    var39Lifetime1 = var36.a((aa) null, param1, var37Lifetime1, 0, param6 - 28, SoundEvent.a(false, 0), SpriteState.field_l, var38, SoundEvent.a(false, 11903361), qja.field_k, (byte) -106, 48, 0, id.field_h, param0, 2);
                    param6 = param6 - var39Lifetime1 * var37Lifetime1;
                  }
                }
                if (var33 != 0) {
                  var39Lifetime2 = var36.a((aa) null, param1, var37Lifetime1, 0, param6 - 28, SoundEvent.a(false, 0), SpriteState.field_l, var38, SoundEvent.a(false, 11903361), bb.field_l, (byte) 107, 48, 0, id.field_h, param0, 2);
                  param6 = param6 - var37Lifetime1 * var39Lifetime2;
                }
              }
              if (0 >= param4.roundDeadlineTick) {
                return;
              }
              var42 = TextureMetadata.field_j;
              var31Lifetime3 = (int)(128.0 - Math.sin((double)bva.currentTimeMillis((byte) -107) / 512.0) * 128.0);
              NotLoggedInMenu.a(var31Lifetime3, (byte) -73, var31Lifetime3, 1, SingleChildWidget.field_v, var42.toUpperCase(), 40 + (SwitchLinkList.b(0) >> 1) + (SwitchLinkList.b(0) >> 2), 11903361, param1 + param0 >> 1);
              var32Lifetime2 = param4.roundDeadlineTick - param4.matchState.getSimulationTick((byte) 115, param2);
              if (var32Lifetime2 >= 250) {
                return;
              }
              var43 = Integer.toString(var32Lifetime2 / 50 + 1);
              var31Lifetime4 = 255 - (var32Lifetime2 % 50 << 2) % 255;
              NotLoggedInMenu.a(var31Lifetime4, (byte) -80, var31Lifetime4, 1, SingleChildWidget.field_v, var43.toUpperCase(), SwitchLinkList.b(0) >> 1, 11903361, param1 + param0 >> 1);
              return;
            }
            return;
          }
          if (!param4.isSendWindowFull(99)) {
            tga.field_a.setClip(param0, param5, param1, param6);
            Room.field_j.a(0, 0);
            tga.field_a.la();
          }
          var9_int = (-param0 + param1 >> 1) + param0;
          var10Lifetime1 = param5 + (param6 - param5 >> 1);
          PlayerViewport.drawTiledFrame(50, 200, (byte) 94, var9_int - 100, aq.field_a, -34 + var10Lifetime1);
          MembersUpsellMenu.a(hu.field_d, 11903361, eda.field_f, -1, var10Lifetime1, var9_int, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_133_0 = var8;
          stackIn_133_1 = new StringBuilder().append("dta.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_134_2 = "null";
          } else {
            stackIn_134_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_133_0), ((StringBuilder) (Object) stackIn_133_1).append(stackIn_134_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(byte param0) {
        this.field_c.tick(0);
        if (param0 != -21) {
          field_g = (boolean[]) null;
        }
    }

    dta() {
        this.field_a = new int[3];
        this.field_f = new int[3];
        this.field_h = new String[3];
        this.field_c = new ModelAnimator(3, 4);
    }

    static {
        field_g = new boolean[]{true, true, false, true, false, false, true, false, false};
        skipRoomMessages = new String[]{"<%0> wimped out", "<%0> skipped the room", "<%0> gave up on that one", "<%0> scorned the ancient gods of room design", "<%0> hopes the next room is easier"};
        field_e = "Type your age in years";
    }
}
