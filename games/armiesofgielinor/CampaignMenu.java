/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignMenu {
    static String field_v;
    private CampaignMenuEntry selectedCampaignEntry;
    private CampaignMenuButton field_p;
    private int viewMode;
    static String field_r;
    private CampaignMenuButton field_c;
    static String field_q;
    static Boolean field_s;
    static String field_n;
    private CampaignMenuEntry selectedMissionEntry;
    static String field_m;
    private NodeHashTable missionEntries;
    private CampaignMenuEntry hoveredEntry;
    private CampaignMenuButton field_f;
    static String field_k;
    private int campaignIndex;
    private CampaignMenuButton field_t;
    private CampaignMenuButton field_j;
    private CampaignMenuButton field_h;
    private CampaignMenuButton field_o;
    private PaletteRegionMap regionMap;
    private NodeHashTable campaignEntries;

    final void draw(byte obfuscationGuard) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard <= 13) {
            this.field_t = (CampaignMenuButton) null;
          }
          if (this.viewMode != 1) {
            if (this.viewMode != 0) {
              if (this.viewMode == 2) {
                this.e(-25752);
                this.a((byte) 88);
                if (var3 == 0) {
                  return;
                }
              }
              if (this.viewMode != 3) {
                return;
              }
              this.e(-25752);
              this.d(26);
              if (var3 == 0) {
                return;
              }
            }
            this.h(396);
            if (var3 == 0) {
              return;
            }
          }
          this.e(-25752);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "cv.N(" + obfuscationGuard + ')');
        }
    }

    private final void resumeQuicksave(int obfuscationGuard) {
        RuntimeException runtimeException = null;
        CampaignQuicksave var2 = null;
        CampaignMission var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = ku.getStoredQuicksave(124);
          var3 = QuickChatPhrase.getCampaignMission(var2.campaignIndex, var2.missionId, 0);
          ts.startCampaignMission(var3, -1, var2);
          var4 = var3.playerSlot;
          var5 = rd.gameplayController.battlefield.playerTurnCounts[var4];
          if (~var5 < obfuscationGuard) {
            DiskCacheWorker.reportCampaignTurn(false, 1, var5, var3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cv.FA(" + obfuscationGuard + ')');
        }
    }

    final void updateMissionScore(int missionId, byte obfuscationGuard, int score) {
        RuntimeException runtimeException = null;
        CampaignMenuEntry entry = null;
        RuntimeException decompiledCaughtException = null;
        try {
          entry = this.getMissionEntry(321, missionId);
          if (obfuscationGuard != 33) {
            this.missionEntries = (NodeHashTable) null;
          }
          if (null != entry) {
            if (entry.score > score &&
              1 != score) {
              return;
            }
            entry.statusText = AiInfluenceMap.a(10602, score);
            entry.score = score;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cv.E(" + missionId + ',' + obfuscationGuard + ',' + score + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            this.field_o = (CampaignMenuButton) null;
          }
          this.campaignEntries = new NodeHashTable(32);
          this.setViewMode(0, (byte) 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "cv.CA(" + param0 + ')');
        }
    }

    final void loadCampaignResources(byte obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ConsoleParseException.b(-1);
          if (rd.gameplayController != null) {
            rd.gameplayController.A(111);
          }
          if (null != SectorCacheStore.field_a) {
            SectorCacheStore.field_a.A(111);
          }
          rd.gameplayController = null;
          SectorCacheStore.field_a = null;
          System.gc();
          ChannelGainProfile.campaignBackgrounds[0] = new RgbSprite(MusicPatchUsage.backgroundArchive.getFileByName("campaign_1.jpg", -105, ""), (java.awt.Component) ((Object) VerticalScrollbar.p(0)));
          ChannelGainProfile.campaignBackgrounds[1] = new RgbSprite(MusicPatchUsage.backgroundArchive.getFileByName("campaign_2.jpg", 13, ""), (java.awt.Component) ((Object) VerticalScrollbar.p(0)));
          ChannelGainProfile.campaignBackgrounds[2] = new RgbSprite(MusicPatchUsage.backgroundArchive.getFileByName("campaign_3.jpg", -91, ""), (java.awt.Component) ((Object) VerticalScrollbar.p(0)));
          mu.field_g = new IndexedSprite[3][3];
          var2_int = 0;
          while (3 > var2_int) {
            var3 = "campaign_map" + (var2_int + 1);
            mu.field_g[var2_int][0] = pv.a("campaign", var3, iw.field_l, 24914);
            mu.field_g[var2_int][1] = pv.a("campaign", var3 + "_areas", iw.field_l, 24914);
            mu.field_g[var2_int][2] = pv.a("campaign", var3 + "_full", iw.field_l, 24914);
            var2_int++;
            if (var4 != 0) {
              return;
            }
          }
          if (obfuscationGuard > -62) {
            CampaignMenu.d((byte) -46);
          }
          DeployAction.field_D = new RgbSprite[3];
          DeployAction.field_D[0] = DiskCacheRequest.loadRgbSpriteByName("takenicon_zamorak", "campaign", iw.field_l, false);
          DeployAction.field_D[1] = DiskCacheRequest.loadRgbSpriteByName("takenicon_saradomin", "campaign", iw.field_l, false);
          DeployAction.field_D[2] = DiskCacheRequest.loadRgbSpriteByName("takenicon_guthix", "campaign", iw.field_l, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "cv.F(" + obfuscationGuard + ')');
        }
    }

    final void releaseCampaignResources(int obfuscationGuard) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = 0;
          while (var2_int < 3) {
            ChannelGainProfile.campaignBackgrounds[var2_int] = null;
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          if (obfuscationGuard < 119) {
            this.rebuildMissionEntries(4, 127);
          }
          mu.field_g = (IndexedSprite[][]) null;
          DeployAction.field_D = null;
          System.gc();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cv.EA(" + obfuscationGuard + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        CampaignQuicksave var2 = null;
        CampaignMission var3 = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
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
        RuntimeException decompiledCaughtException = null;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          var2 = ku.getStoredQuicksave(111);
          var3 = QuickChatPhrase.getCampaignMission(var2.campaignIndex, var2.missionId, 0);
          var4 = Battlefield.a(var3.participantIds.length, var2.snapshotBytes, false);
          var5 = fo.a(4800, wd.field_e, new String[]{var3.name, Integer.toString(var4)});
          var6 = fo.a(4800, BufferedSocket.field_h, new String[]{var5});
          if (this.field_h == null) {
            var7 = 164;
            var8 = nr.field_e.textWidth(qf.field_c) / 2 + 26;
            if (var7 < var8) {
              var7 = var8;
            }
            var9 = 26 + nr.field_e.textWidth(lb.field_c) / 2;
            if (var7 < var9) {
              var7 = var9;
            }
            if (ArmiesOfGielinor.obfuscationControl) {
              var7 = this.field_h.width;
            }
          } else {
            var7 = this.field_h.width;
          }
          var8Lifetime1 = 26 + var7;
          var9Lifetime1 = rs.field_n.getParagraphHeight(var6, var8Lifetime1, 0);
          var10 = 60 + (30 + (var9Lifetime1 + 14) + 40 + 10);
          var11 = -(var8Lifetime1 / 2) + 320;
          var12 = -(var10 / 2) + 240;
          var13 = 13 + var11;
          fe.b(db.a(true, var11), MatchConditionEntry.a(var12, (byte) 94), var8Lifetime1, var10, MusicPatch.field_m, TutorialController.field_e, 0, 192);
          var14 = -26 + var8Lifetime1;
          var15 = var13;
          var16 = var12 + 30;
          if (param0 < 9) {
            field_s = (Boolean) null;
          }
          fe.a(this.selectedMissionEntry.title, db.a(true, var8Lifetime1 / 2 + var11), MatchConditionEntry.a(var16, (byte) 94), var8Lifetime1 - 20, ConsoleValue.field_b, true, 40, 1);
          var16 += 14;
          rs.field_n.drawParagraph(var6, db.a(true, var15), MatchConditionEntry.a(var16, (byte) 94), var14, var10, 16777215, 1, 1, 0, 0);
          var16 = var16 + (var9Lifetime1 + 30);
          if (this.field_h == null) {
            this.field_h = new CampaignMenuButton(qf.field_c, var15, var16, var7);
          }
          this.field_h.draw(0);
          var16 += 40;
          if (null == this.field_f) {
            this.field_f = new CampaignMenuButton(lb.field_c, var15, var16, var7);
          }
          this.field_f.draw(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cv.A(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        String stackIn_8_0 = null;
        int stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        RgbSprite[] stackIn_11_4;
        int[] stackIn_12_5 = null;
        boolean stackIn_31_0 = false;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_30_0;
        Object var2 = null;
        String var3 = null;
        CampaignMenuEntry var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var4Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          fe.a(db.a(true, 32), MatchConditionEntry.a(71, (byte) 94), 305, 228, MusicPatch.field_m, jh.field_k, 0, 128, ai.field_V, true, ConsoleValue.field_b);
          fe.a(db.a(true, 32), MatchConditionEntry.a(321, (byte) 94), 305, 92, MusicPatch.field_m, jh.field_k, 0, 128, SummonAction.field_A, true, ConsoleValue.field_b);
          if (null != this.selectedCampaignEntry) {
            if (this.selectedCampaignEntry.entryId == -1) {
              stackIn_8_0 = SummonAction.field_A;
            } else {
              stackIn_8_0 = this.selectedCampaignEntry.title;
            }
            var2 = stackIn_8_0;
            fe.a(db.a(true, 346), MatchConditionEntry.a(70, (byte) 94), 262, 343, MusicPatch.field_m, jh.field_k, 0, 128, (String) (var2), true, ConsoleValue.field_b);
            stackIn_11_0 = db.a(true, 354);
            stackIn_11_1 = MatchConditionEntry.a(361, (byte) 94);
            stackIn_11_2 = 246;
            stackIn_11_3 = 41;
            stackIn_11_4 = DisplacedUnitMarker.field_s;
            if (!IterableDualNodeDeque.isPointerInBounds(-33, db.a(true, 354), db.a(true, 354) + 246, MatchConditionEntry.a(361, (byte) 94), MatchConditionEntry.a(361, (byte) 94) + 41)) {
              stackIn_12_5 = ConsoleValue.field_b;
            } else {
              stackIn_12_5 = TutorialController.field_e;
            }
            fe.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_12_5, 0, 0);
            var3 = MusicPatch.field_o;
            if (this.selectedCampaignEntry.entryId == -1) {
              var3 = ConsoleTokenCursor.field_b;
            }
            fe.c(var3, db.a(true, 477), MatchConditionEntry.a(396, (byte) 94), 0, true);
            var4 = db.a(true, 359);
            var5 = MatchConditionEntry.a(85, (byte) 94);
            CampaignUnitOverride.a(var4, var4 + 236, var5 + 200, var5, (byte) 83);
            boolean decompiledSharedTail0 = (this.selectedCampaignEntry == null ||
              this.selectedCampaignEntry.entryId != -1);
            if (!decompiledSharedTail0) {
              this.selectedCampaignEntry.previewSprite.f(-(this.selectedCampaignEntry.previewSprite.pixelWidth / 2) + (var4 + 118), var5);
              decompiledSharedTail0 = (var8 != 0);
            }
            if (decompiledSharedTail0) {
              ChannelGainProfile.campaignBackgrounds[this.selectedCampaignEntry.entryId].g(var4, var5);
              this.selectedCampaignEntry.previewSprite.f(var4, var5, Math.abs(ContextualRuntimeException.a(param0 ^ -397, uk.field_n << 5) * 100 >> 16) + 80);
            }
            QuickChatPhraseRepository.popRasterState(param0 ^ -18466);
            var6 = 5;
            var7 = 5 + rs.field_n.getParagraphHeight(this.selectedCampaignEntry.description, 232, 0);
            en.field_E.drawParagraph(this.selectedCampaignEntry.description, var4 + var6, 200 + var5, -(2 * var6) + 236, var7, 16777215, -1, 1, 0, 0);
          }
          if (param0 != 396) {
            return;
          }
          var2 = null;
          var3_ref = (CampaignMenuEntry) (this.campaignEntries.first(param0 ^ 397));
          scanLoop1: while (true) {
            if (null != var3_ref) {
              stackOut_30_0 = var3_ref.selectable;
              stackIn_53_0 = stackOut_30_0 ? 1 : 0;
              stackIn_31_0 = stackOut_30_0;
              if (var8 == 0) {
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_31_0 && (var3_ref.containsPoint(AiPlanningStrategy.pointerX, ko.pointerY, param0 - 275) ||
                  var3_ref == this.selectedCampaignEntry)) {
                  stackIn_43_0 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  stackIn_43_0 = 0;
                }
                var4Lifetime1 = stackIn_43_0;
                this.a((byte) 13, false, var3_ref, var4Lifetime1 != 0);
                if (var4Lifetime1 != 0) {
                  var2 = var3_ref;
                }
                var3_ref = (CampaignMenuEntry) (this.campaignEntries.next((byte) 101));
                continue;
              }
            } else {
              if (this.hoveredEntry == var2) {
                break scanLoop1;
              }
              if (null == var2) {
                break scanLoop1;
              }
              stackIn_53_0 = 55;
            }
            RadialSummonMenu.playDefaultSoundWithIntGuard(stackIn_53_0, ClientUiNode.field_v[1]);
            break;
          }
          this.hoveredEntry = (CampaignMenuEntry) (var2);
          fe.a(ConsoleExpression.field_u, db.a(true, 320), MatchConditionEntry.a(30, (byte) 94), ConsoleValue.field_b, 1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) (var2), "cv.M(" + param0 + ')');
        }
    }

    public static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_s = null;
          field_v = null;
          field_r = null;
          field_m = null;
          field_n = null;
          field_q = null;
          if (param0 != 44) {
            field_q = (String) null;
          }
          field_k = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "cv.U(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1, CampaignMenuEntry param2, boolean param3) {
        int stackIn_5_0 = 0;
        int stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        RgbSprite[] stackIn_17_4;
        int[] stackIn_18_5 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var9Lifetime1;
        try {
          var5_int = db.a(true, -15 + param2.left);
          var6 = MatchConditionEntry.a(19 + param2.top, (byte) 94);
          CampaignUnitOverride.a(db.a(true, param2.left), db.a(true, param2.width + param2.left), MatchConditionEntry.a(param2.top + param2.height, (byte) 94), MatchConditionEntry.a(param2.top, (byte) 94), (byte) 125);
          var7 = 54;
          var8 = 128;
          var9 = -1;
          if (!param2.selectable) {
            var8 = 48;
            stackIn_5_0 = (param2.entryId == 2) ? 2 : 0;
            var9Lifetime1 = stackIn_5_0 + 1;
            if (ArmiesOfGielinor.obfuscationControl) {
              if (param3) {
                var8 = (int)(Math.sin((double)uk.field_n / 3.141592653589793 / 6.0) * 20.0 + 235.0);
              }
              var9Lifetime1 = 1 + param2.godId;
            }
          } else {
            if (param3) {
              var8 = (int)(Math.sin((double)uk.field_n / 3.141592653589793 / 6.0) * 20.0 + 235.0);
            }
            var9Lifetime1 = 1 + param2.godId;
          }
          UnitModelPreview.field_d[var9Lifetime1].g(var5_int, var6, var8);
          gt.field_c[var9Lifetime1].g(-12 + var5_int, var6 - 18, var8);
          if (param0 != 13) {
            field_n = (String) null;
          }
          QuickChatPhraseRepository.popRasterState(param0 - 18875);
          stackIn_17_0 = db.a(true, param2.left);
          stackIn_17_1 = MatchConditionEntry.a(param2.top, (byte) 94);
          stackIn_17_2 = param2.width;
          stackIn_17_3 = param2.height;
          stackIn_17_4 = EffectPresentation.field_j;
          if (param3) {
            stackIn_18_5 = ConsoleValue.field_b;
          } else {
            stackIn_18_5 = jh.field_k;
          }
          fe.b(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_18_5, 0, 0);
          if (null != param2.title) {
            var10 = db.a(true, param2.left + var7);
            var11 = param2.height / 2 + param2.top + rs.field_n.baselineHeight;
            fe.a(param2.title, var10, MatchConditionEntry.a(8 + (param2.top + param2.height / 2), (byte) 94), true);
            fe.a(param2.title, var10, MatchConditionEntry.a(param2.height / 2 + param2.top + 8, (byte) 94), ConsoleValue.field_b, true);
            rs.field_n.drawText(param2.statusText, var10, MatchConditionEntry.a(var11, (byte) 94), 12303291, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("cv.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 12 % ((param2 + 16) / 40);
          if (0 == param1) {
            nu.loadCampaign(23948, param0, 0);
            if (!ArmiesOfGielinor.obfuscationControl) {
              return;
            }
          }
          nu.loadCampaign(23948, param0, 1);
          nu.loadCampaign(23948, param0, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("cv.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, boolean param2, CampaignMenuEntry param3, boolean param4) {
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        NodeDeque var6 = null;
        RuntimeException var6_ref = null;
        RegionAnchor var7 = null;
        int var7_int = 0;
        Object var8 = null;
        RgbSprite var9 = null;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        int var13 = 0;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6_int = 36 / ((param0 + 78) / 43);
          if (this.selectedMissionEntry == param3 ||
            param4) {
            param3.highlightProgress = param3.highlightProgress + 20;
            if (var13 != 0) {
              param3.highlightProgress = param3.highlightProgress - 14;
            }
          } else {
            param3.highlightProgress = param3.highlightProgress - 14;
          }
          if (param3.previewSprite == null) {
            param3.previewSprite = this.regionMap.extractRegionSprite(param3.entryId, 3355443, (byte) -73, 0);
            var6 = this.regionMap.getAnchors(param3.entryId, 1);
            if (null != var6) {
              var7 = (RegionAnchor) (var6.first((byte) 95));
              if (null != var7) {
                param3.left = var7.column;
                param3.top = var7.row;
              }
            }
          }
          if (param3.previewSprite != null) {
            if (null != param3.statusText) {
              regionExit1: {
                regionExit2: {
                  var6_int = 8421504;
                  var7_int = this.campaignIndex;
                  switch (var7_int) {
                    case 1:
                      break;
                    default:
                      break regionExit1;
                    case 2:
                      if (var13 == 0) {
                        break regionExit2;
                      }
                    case 0:
                      var6_int = 8388608;
                      if (var13 == 0) {
                        break regionExit1;
                      }
                      break;
                  }
                  var6_int = 10066380;
                  if (var13 == 0) {
                    break regionExit1;
                  }
                }
                var6_int = 8573219;
              }
              fe.c(param3.previewSprite, db.a(true, 0), MatchConditionEntry.a(3, (byte) 94), param3.previewSprite.pixelWidth, var6_int);
            }
            if (param4) {
              param3.previewSprite.f(db.a(true, 0), MatchConditionEntry.a(0, (byte) 94), 128);
            }
            if (param2) {
              if (null == param3.highlightSprite) {
                param3.highlightSprite = param3.previewSprite.g();
                param3.highlightSprite.c(228, 130, 4);
              }
              param3.highlightSprite.e(db.a(true, 0), MatchConditionEntry.a(0, (byte) 94), (SocketResourceClient.b(uk.field_n << 6, 100) >> 12) + 22);
            }
            if (!param2 ||
              var13 != 0) {
              param3.highlightSprite = null;
            }
            if (param3.selectable) {
              var6 = this.regionMap.getAnchors(param3.entryId, 1);
              if (var6 != null) {
                var7 = (RegionAnchor) (var6.first((byte) 120));
                if (null != var7) {
                  var8 = null;
                  var10 = param3.mission.difficulty;
                  if (param3.statusText != null) {
                    var10 = 0;
                    var9 = DeployAction.field_D[this.campaignIndex];
                  } else {
                    var8 = km.field_h[2];
                    var9 = param3.mission.createRewardPreview(-1).icon;
                  }
                  if (var8 == null &&
                    null == var9) {
                    return;
                  }
                  boolean decompiledFrameRemainder0 = true;
                  var11 = 0;
                  var12 = 1.0f;
                  if (null != param3.statusText) {
                    var12 = 0.8999999761581421f;
                    decompiledFrameRemainder0 = (var13 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (param3.highlightProgress < 256) {
                      if (!(0 < param3.highlightProgress)) {
                        param3.highlightProgress = 0;
                        if (var13 != 0) {
                          param3.highlightProgress = 256;
                        }
                      }
                    } else {
                      param3.highlightProgress = 256;
                    }
                    if (param3.highlightProgress < 164) {
                      if (param3.highlightProgress > 32) {
                        var12 = 0.5f + 0.5f * (float)(-32 + param3.highlightProgress) / 132.0f;
                        if (var13 != 0) {
                          var12 = 0.5f;
                          var12 = 1.0f;
                        }
                      } else {
                        var12 = 0.5f;
                        if (var13 != 0) {
                          var12 = 1.0f;
                        }
                      }
                    } else {
                      var12 = 1.0f;
                    }
                  }
                  this.a((RgbSprite) (var8), var11, var10, var7.row, var9, 1, var12, var7.column);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_90_0 = var6_ref;
          stackIn_90_1 = new StringBuilder().append("cv.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        CampaignQuicksave var2 = null;
        CampaignMission var3 = null;
        int var4 = 0;
        String var5 = null;
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
        RuntimeException decompiledCaughtException = null;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          var2 = ku.getStoredQuicksave(97);
          var3 = QuickChatPhrase.getCampaignMission(var2.campaignIndex, var2.missionId, param0 - 26);
          var4 = Battlefield.a(var3.participantIds.length, var2.snapshotBytes, false);
          var5 = fo.a(4800, sb.field_f, new String[]{Integer.toString(var4)});
          boolean decompiledSharedTail0 = (null == this.field_c);
          if (!decompiledSharedTail0) {
            var6 = this.field_c.width;
            decompiledSharedTail0 = (ArmiesOfGielinor.obfuscationControl);
          }
          if (decompiledSharedTail0) {
            var6 = 164;
            var7 = nr.field_e.textWidth(kd.field_Y) / 2 + 26;
            if (var6 < var7) {
              var6 = var7;
            }
            var8 = 26 + nr.field_e.textWidth(PacketBuffer.field_r) / 2;
            if (var6 < var8) {
              var6 = var8;
            }
            var9 = 26 + nr.field_e.textWidth(lb.field_c) / 2;
            if (var9 > var6) {
              var6 = var9;
            }
          }
          var7Lifetime1 = param0 + var6;
          var8Lifetime1 = rs.field_n.getParagraphHeight(var5, var7Lifetime1, 0);
          var9Lifetime1 = 154 + (var8Lifetime1 + 40);
          var10 = -(var7Lifetime1 / 2) + 320;
          var11 = 240 - var9Lifetime1 / 2;
          var12 = var10 + 13;
          fe.b(db.a(true, var10), MatchConditionEntry.a(var11, (byte) 94), var7Lifetime1, var9Lifetime1, MusicPatch.field_m, TutorialController.field_e, 0, 192);
          var13 = var7Lifetime1 - 26;
          var14 = var12;
          var15 = 30 + var11;
          fe.a(this.selectedMissionEntry.title, db.a(true, var10 + var7Lifetime1 / 2), MatchConditionEntry.a(var15, (byte) 94), var7Lifetime1 - 20, ConsoleValue.field_b, true, 40, 1);
          var15 += 14;
          rs.field_n.drawParagraph(var5, db.a(true, var14), MatchConditionEntry.a(var15, (byte) 94), var13, var9Lifetime1, 16777215, 1, 1, 0, 0);
          var15 = var15 + (30 + var8Lifetime1);
          if (null == this.field_c) {
            this.field_c = new CampaignMenuButton(kd.field_Y, var14, var15, var6);
          }
          this.field_c.draw(param0 - 26);
          var15 += 40;
          if (null == this.field_j) {
            this.field_j = new CampaignMenuButton(PacketBuffer.field_r, var14, var15, var6);
          }
          var15 += 40;
          this.field_j.draw(0);
          if (this.field_o == null) {
            this.field_o = new CampaignMenuButton(lb.field_c, var14, var15, var6);
          }
          this.field_o.draw(param0 ^ 26);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cv.R(" + param0 + ')');
        }
    }

    final void updateMusicProfile(int obfuscationGuard) {
        int baseGainToApply = 0;
        int[] targetGains = null;
        int targetChannel = 0;
        int targetGain = 0;
        RuntimeException caughtFailure = null;
        Object enabledChannelIds = null;
        int campaign = 0;
        ChannelGainProfile profile = null;
        int[] channelIds = null;
        int enabledChannelIndex = 0;
        int channel = 0;
        int baseGain = 0;
        int obfuscationControl = 0;
        int guardRemainder;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean useDefaultChannels = true;
          TrianglePulse.selectMusicTrackWithDefaultGain(-16147, 50, qf.interfaceMusicTrack, true);
          enabledChannelIds = null;
          if (0 != this.viewMode) {
            campaign = this.campaignIndex;
            if (campaign != 0) {
              if (campaign == 1 &&
                obfuscationControl == 0) {
                enabledChannelIds = new int[]{1, 2, 4, 11, 12, 13};
                useDefaultChannels = false;
              }
              if (((useDefaultChannels) &&
                (useDefaultChannels = (campaign == 2))) && (obfuscationControl == 0)) {
                enabledChannelIds = new int[]{1, 14, 15, 16};
                useDefaultChannels = false;
              }
            }
            if (useDefaultChannels) {
              enabledChannelIds = new int[]{1, 2, 3, 9, 10};
            }
          } else {
            enabledChannelIds = new int[]{1, 2, 3, 5, 6, 7, 8};
          }
          guardRemainder = 113 % ((-3 - obfuscationGuard) / 56);
          if (null != enabledChannelIds) {
            profile = new ChannelGainProfile();
            channelIds = (int[]) enabledChannelIds;
            enabledChannelIndex = 0;
            while (enabledChannelIndex < channelIds.length) {
              channel = channelIds[enabledChannelIndex];
              channel--;
              if (obfuscationControl != 0) {
                return;
              }
              if (2 == this.campaignIndex &&
                channel == 0) {
                baseGainToApply = 20 + gi.campaignBaseChannelGain;
              } else {
                baseGainToApply = gi.campaignBaseChannelGain;
              }
              baseGain = baseGainToApply;
              targetGains = profile.gains;
              targetChannel = channel;
              if (this.viewMode != 0 &&
                3 >= channel) {
                targetGain = baseGain;
              } else {
                targetGain = 256;
              }
              targetGains[targetChannel] = targetGain;
              enabledChannelIndex++;
            }
            ((AdaptiveMidiPcmStream) (lk.musicCrossfadeStream.selectedSequencer)).rampToProfile((byte) 48, wf.musicProfileTransitionMillis, profile);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          enabledChannelIds = caughtFailure;
          throw AnimationSkeleton.addExceptionContext((Throwable) (enabledChannelIds), "cv.AA(" + obfuscationGuard + ')');
        }
    }

    final static void a(byte param0, nr param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 123) {
            field_q = (String) null;
          }
          b.field_k = param3;
          sg.field_c = param1;
          ov.field_b = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("cv.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(int param0) {
        String[] array$0 = null;
        int stackIn_26_0 = 0;
        CampaignMenuEntry stackIn_31_0 = null;
        int stackIn_37_0;
        String stackIn_37_1;
        String[] stackIn_37_2;
        String[] stackIn_37_3;
        int stackIn_37_4;
        String stackIn_38_5 = null;
        int stackIn_70_0 = 0;
        int stackIn_98_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        MapLayout var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        CampaignMission var15 = null;
        int var16 = 0;
        IntrusiveNode var16_ref_tc = null;
        int var17 = 0;
        String var17_ref_String = null;
        int var18 = 0;
        int var19_int = 0;
        Object var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        CampaignRewardPreview var23_ref = null;
        int var24_int = 0;
        RgbSprite var24 = null;
        int var25_int = 0;
        CampaignQuicksave var25 = null;
        CampaignParticipant var26_ref_sd = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var15_intLifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19_intLifetime1;
        int var20Lifetime1;
        int var25_intLifetime1;
        int var25_intLifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        int var27Lifetime1;
        int var27Lifetime2;
        int var28Lifetime1;
        int var28Lifetime2;
        var29 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.selectedMissionEntry != null &&
            this.selectedMissionEntry.selectable) {
            boolean decompiledSharedTail0 = (null == this.field_t);
            if (!decompiledSharedTail0) {
              var2_int = this.field_t.width;
              decompiledSharedTail0 = (var29 != 0);
            }
            if (decompiledSharedTail0) {
              var2_int = 184;
              var3 = 26 + nr.field_e.textWidth(LineOfSightGrid.field_j) / 2;
              if (var3 > var2_int) {
                var2_int = var3;
              }
              var4 = nr.field_e.textWidth(pn.field_k) / 2 + 26;
              if (var2_int < var4) {
                var2_int = var4;
              }
            }
            var3Lifetime1 = var2_int + 26;
            var4Lifetime1 = -26 + var3Lifetime1;
            fe.b(db.a(true, 5), MatchConditionEntry.a(4, (byte) 94), var3Lifetime1, 472, MusicPatch.field_m, TutorialController.field_e, 0, 112);
            var5 = 18;
            var6 = 34;
            var6Lifetime1 = 34;
            fe.a(this.selectedMissionEntry.title, db.a(true, var3Lifetime1 / 2 + 5), MatchConditionEntry.a(var6Lifetime1, (byte) 94), -20 + var3Lifetime1, ConsoleValue.field_b, true, 40, 1);
            var6Lifetime1 += 14;
            var7 = this.selectedMissionEntry.mission.getMapLayout(-127);
            var8 = 0;
            var9 = 6;
            var10 = 5;
            var11 = var4Lifetime1;
            var12 = 2 * var11 / 3;
            var9Lifetime1 = var11 / var7.mapWidth;
            var8Lifetime1 = (-(var9Lifetime1 * var7.mapWidth) + var11) / 2;
            var10Lifetime1 = var12 / var7.mapHeight;
            var13 = var7.getTerrainGrid(28554);
            var14 = var13[0].length - 1;
            var15_int = 0;
            scanLoop1: while (true) {
              if (var15_int < var13.length) {
                stackIn_26_0 = 0;
                if (var29 != 0) {
                  break scanLoop1;
                }
                var16 = stackIn_26_0;
                while (var16 < var13[0].length) {
                  var17 = var13[var15_int][-var16 + var13[0].length - 1];
                  var18 = UnitLossCondition.battlefieldThemes[var7.mapTheme].terrainPreviewColours[var17];
                  var19_int = db.a(true, var8Lifetime1 + var9Lifetime1 * (var14 - var16) + var5);
                  var20 = MatchConditionEntry.a(var6Lifetime1 + var10Lifetime1 * var15_int, (byte) 94);
                  SoftwareRaster.f(var19_int, var20, var9Lifetime1, var10Lifetime1, var18);
                  SoftwareRaster.e(var19_int, var20, var19_int + var9Lifetime1, var20, 16777215, 16);
                  SoftwareRaster.e(var19_int, 1 + var20, var19_int, var20 + var10Lifetime1, 16777215, 16);
                  SoftwareRaster.d(1 + var19_int, var10Lifetime1 + (var20 - 1), var9Lifetime1 + var19_int, -1 + (var10Lifetime1 + var20), 0, 16);
                  SoftwareRaster.e(var9Lifetime1 + (var19_int - 1), var20 + 1, var19_int + var9Lifetime1 - 1, var20 + var10Lifetime1 - 1, 0, 16);
                  var16++;
                }
                var15_int++;
                continue scanLoop1;
              }
              fe.b(db.a(true, var5 + var8Lifetime1), MatchConditionEntry.a(var6Lifetime1, (byte) 94), var9Lifetime1 * var7.mapWidth, var7.mapHeight * var10Lifetime1, MusicPatch.field_m, TutorialController.field_e, 0, 0);
              var6Lifetime1 = var6Lifetime1 + (124 + ro.field_rb[0].canvasHeight);
              stackIn_26_0 = 18;
              break;
            }
            var15_intLifetime1 = stackIn_26_0;
            var16_ref_tc = this.selectedMissionEntry.previewUnitCategories.first(param0 ^ 21);
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var16_ref_tc == null))) {
              var17Lifetime1 = (int)var16_ref_tc.key;
              ro.field_rb[var17Lifetime1].draw(db.a(true, var15_intLifetime1), MatchConditionEntry.a(var6Lifetime1 - ro.field_rb[var17Lifetime1].canvasHeight, (byte) 94));
              var15_intLifetime1 = var15_intLifetime1 + ro.field_rb[var17Lifetime1].canvasWidth;
              stackIn_31_0 = this.selectedMissionEntry;
              if (var29 == 0) {
                var16_ref_tc = ((NodeHashTable) (Object) stackIn_31_0.previewUnitCategories).next((byte) 77);
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_31_0 = this.selectedMissionEntry;
            }
            var15 = stackIn_31_0.mission;
            rs.field_n.drawParagraph(AccountNameNormalizer.field_b + var15.difficulty, db.a(true, var5), MatchConditionEntry.a(var6Lifetime1, (byte) 94), var4Lifetime1, 472, 16776960, 1, 0, 0, 0);
            var6Lifetime1 = var6Lifetime1 + rs.field_n.baselineHeight;
            var16Lifetime1 = 1;
            if (this.selectedMissionEntry.statusText != null) {
              array$0 = new String[1];
              stackIn_37_0 = 4800;
              stackIn_37_1 = uh.field_c;
              stackIn_37_2 = array$0;
              stackIn_37_3 = array$0;
              stackIn_37_4 = 0;
              if (null == this.selectedMissionEntry.statusText) {
                stackIn_38_5 = ConsolePanel.field_g;
              } else {
                stackIn_38_5 = this.selectedMissionEntry.statusText;
              }
              stackIn_37_3[stackIn_37_4] = stackIn_38_5;
              var17_ref_String = fo.a(stackIn_37_0, stackIn_37_1, stackIn_37_2);
              var16Lifetime1 = rs.field_n.drawParagraph(var17_ref_String, db.a(true, var5), MatchConditionEntry.a(var6Lifetime1, (byte) 94), var4Lifetime1, 472, 16776960, 1, 0, 0, 0);
              var18Lifetime1 = rs.field_n.getWrappedWidth(var17_ref_String, var4Lifetime1);
              var19_intLifetime1 = this.selectedMissionEntry.score;
              if (1000 >= var19_intLifetime1) {
                if (var19_intLifetime1 > 500) {
                  MoveAttackRequest.field_C[1].g(db.a(true, 5 + var18Lifetime1 + var5), MatchConditionEntry.a(var6Lifetime1 + rs.field_n.maxAscent - rs.field_n.capitalHeight, (byte) 94));
                }
                if ((!(var19_intLifetime1 > 500) ||
                  var29 != 0) &&
                  (!(10 >= var19_intLifetime1))) {
                  MoveAttackRequest.field_C[2].g(db.a(true, var5 + var18Lifetime1 + 5), MatchConditionEntry.a(-rs.field_n.capitalHeight + rs.field_n.maxAscent + var6Lifetime1, (byte) 94));
                  if (var29 != 0) {
                    MoveAttackRequest.field_C[0].g(db.a(true, var5 - (-var18Lifetime1 - 5)), MatchConditionEntry.a(-rs.field_n.capitalHeight + rs.field_n.maxAscent + var6Lifetime1, (byte) 94));
                  }
                }} else {
                MoveAttackRequest.field_C[0].g(db.a(true, var5 - (-var18Lifetime1 - 5)), MatchConditionEntry.a(-rs.field_n.capitalHeight + rs.field_n.maxAscent + var6Lifetime1, (byte) 94));
              }
            }
            var6Lifetime1 = var6Lifetime1 + rs.field_n.baselineHeight * (-1 + var16Lifetime1);
            var17Lifetime2 = 276;
            var5Lifetime1 = 18;
            var18Lifetime2 = var5Lifetime1;
            var17Lifetime2 += 30;
            var17Lifetime2 += 17;
            var19 = null;
            var18Lifetime2 = var18Lifetime2 + param0;
            var20Lifetime1 = var15.participantIds.length - 1;
            var21 = 50;
            var22 = 15;
            if (var20Lifetime1 > 2) {
              var21 = 25;
              var22 = 0;
              var17Lifetime2 += 30;
            }
            var17Lifetime2 = var17Lifetime2 + (var20Lifetime1 * var21 / 2 - 50);
            var23 = var15.participantIds;
            var24_int = 0;
            while (true) {
              if (var24_int >= var23.length) {
                var5Lifetime1 = 18;
                var6Lifetime1 += 16;
                en.field_E.drawParagraph(var15.description, db.a(true, var5Lifetime1), MatchConditionEntry.a(var6Lifetime1, (byte) 94), var4Lifetime1, 472, 16777215, 1, 0, 0, 12);
                stackIn_70_0 = 391;
                break;
              }
              var25_int = var23[var24_int];
              stackIn_70_0 = 0;
              if (var29 == 0) {
                if (stackIn_70_0 <= var25_int) {
                  var26_ref_sd = var15.campaign.participants[var25_int];
                  if (var20Lifetime1 > 2) {
                    var26_ref_sd.coatOfArms.a(false, false, (byte) 68, false, false, false, MatchConditionEntry.a(var17Lifetime2, (byte) 94), var26_ref_sd.displayName, db.a(true, -5 + var18Lifetime2));
                  } else {
                    var26_ref_sd.coatOfArms.a(false, 0, MatchConditionEntry.a(var17Lifetime2, (byte) 94), false, db.a(true, var18Lifetime2 - 5), var26_ref_sd.displayName, false, false, false, param0 - 19764);
                  }
                  var27 = var18Lifetime2 + 60;
                  var28 = 5 + var4Lifetime1 - var27;
                  rs.field_n.drawParagraph(var26_ref_sd.displayName, db.a(true, var27), MatchConditionEntry.a(var17Lifetime2 + var22, (byte) 94), var28, 20, 16777215, 1, 0, 2, 0);
                  var17Lifetime2 = var17Lifetime2 - var21;
                }
                var24_int++;
                continue;
              }
              break;
            }
            var6Lifetime2 = stackIn_70_0;
            var23_ref = var15.createRewardPreview(-1);
            var24 = km.field_h[2];
            this.a(var24, 0, 0, 10 + var6Lifetime2, var23_ref.icon, param0 - 19, 1.0f, 18 + var23_ref.icon.canvasWidth / 2);
            if (var23_ref.description != null &&
              TabbedPanel.a(MatchConditionEntry.a(var6Lifetime2 + 10, (byte) 94), db.a(true, var23_ref.icon.canvasWidth / 2 + 18), 25, false)) {
              var25_intLifetime1 = var4Lifetime1 * 2;
              var26 = var3Lifetime1 + 5;
              if (so.field_b.field_a < var26 + var25_intLifetime1) {
                var25_intLifetime1 = so.field_b.field_a - var26;
              }
              var27Lifetime1 = rs.field_n.getParagraphHeight(var23_ref.description, var25_intLifetime1, 0);
              var28Lifetime1 = var6Lifetime2 - var27Lifetime1 / 2;
              SoftwareRaster.b(db.a(true, var26), MatchConditionEntry.a(var28Lifetime1, (byte) 94), var25_intLifetime1, var27Lifetime1 + 2, 0, 128);
              rs.field_n.drawParagraph(var23_ref.description, db.a(true, var26), MatchConditionEntry.a(var28Lifetime1, (byte) 94), var25_intLifetime1, 472, 16777215, 1, 1, 0, 0);
            }
            rs.field_n.drawParagraph(IntPair.field_l + var23_ref.title, db.a(true, var23_ref.icon.canvasWidth + 31), MatchConditionEntry.a(-10 + var6Lifetime2, (byte) 94), -13 + (-var23_ref.icon.canvasWidth + var4Lifetime1), var23_ref.icon.canvasHeight, 16776960, 0, 0, 1, 0);
            if (null != var19) {
              var25_intLifetime2 = 100;
              var26Lifetime1 = AiPlanningStrategy.pointerX;
              var27Lifetime2 = rs.field_n.getParagraphHeight(((CampaignParticipant) (var19)).displayName, var25_intLifetime2, 0);
              var28Lifetime2 = -(var27Lifetime2 / 2) + (25 + ko.pointerY);
              SoftwareRaster.b(db.a(true, var26Lifetime1), MatchConditionEntry.a(var28Lifetime2, (byte) 94), var25_intLifetime2, var27Lifetime2 + 2, 0, 255);
              rs.field_n.drawParagraph(((CampaignParticipant) (var19)).displayName, db.a(true, var26Lifetime1), MatchConditionEntry.a(var28Lifetime2, (byte) 94), var25_intLifetime2, 472, 16777215, 1, 1, 0, 0);
            }
            var6Lifetime3 = 436;
            if (this.field_t == null) {
              this.field_t = new CampaignMenuButton(LineOfSightGrid.field_j, var5Lifetime1, var6Lifetime3, var2_int);
            }
            if (null == this.field_p) {
              this.field_p = new CampaignMenuButton(pn.field_k, var5Lifetime1, var6Lifetime3, var2_int);
            }
            var25 = ku.getStoredQuicksave(121);
            if (null != var25 &&
              ~this.campaignIndex == ~var25.campaignIndex &&
              ~var25.missionId == ~this.selectedMissionEntry.entryId) {
              stackIn_98_0 = 1;
            } else {
              stackIn_98_0 = 0;
            }
            var26Lifetime2 = stackIn_98_0;
            if (this.viewMode == 1) {
              if (this.selectedMissionEntry.statusText != null &&
                var26Lifetime2 == 0) {
                this.field_p.draw(0);
                if (var29 == 0) {
                  return;
                }
              }
              this.field_t.draw(0);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "cv.K(" + param0 + ')');
        }
    }

    private final void a(RgbSprite param0, int param1, int param2, int param3, RgbSprite param4, int param5, float param6, int param7) {
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var9_int = param4.pixelWidth;
          param7 = db.a(true, param7);
          param3 = MatchConditionEntry.a(param3, (byte) 94);
          var10 = (13 * param3 + fe.field_b + param7 * 57) % 100;
          if (param6 == (float)param5) {
            if (param0 != null) {
              lw.field_ob.g(1 + (param7 - var9_int / 2), -(var9_int / 2) + (param3 + 1));
            }
            if (null != param4) {
              param4.g(-(var9_int / 2) + param7 + 1, 1 - var9_int / 2 + param3);
            }
            if (param0 != null) {
              param0.g(-22 + param7, param3 - 22);
            }
            if (param2 <= 0) {
              return;
            }
            fe.a(param7, param3, param1, param2, var10, 40, 96);
            if (var15 == 0) {
              return;
            }
          }
          if (0.5f != param6) {
            var11 = (int)((float)var9_int * param6);
            var12 = (int)(46.0f * param6);
            var13 = (int)(param6 * 40.0f);
            var14 = (int)(96.0f * param6);
            if (param0 != null) {
              lw.field_ob.c(param7 - var11 / 2, -(var11 / 2) + param3, var11, var11);
            }
            if (null != param4) {
              param4.c(-(var11 / 2) + param7, -(var11 / 2) + param3, var11, var11);
            }
            if (param0 != null) {
              param0.c(param7 - var12 / 2, param3 - var12 / 2, var12, var12);
            }
            if (param2 > 0) {
              fe.a(param7, param3, param1, param2, var10, var13, var14);
            }
            if (var15 == 0) {
              return;
            }
          }
          if (param0 != null) {
            lw.field_ob.h(-(var9_int / 4) + (param7 + 1), param3 - var9_int / 4 + 1);
          }
          if (null != param4) {
            param4.h(-(var9_int / 4) + param7 + 1, 1 + (-(var9_int / 4) + param3));
          }
          if (param0 != null) {
            param0.h(-11 + param7, -11 + param3);
          }
          if (param2 > 0) {
            fe.a(param7, param3, param1, param2, var10, 20, 48);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_58_0 = var9;
          stackIn_58_1 = new StringBuilder().append("cv.DA(");
          if (param0 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final RgbSprite renderMissionPreview(CampaignMission mission, CampaignQuicksave quicksave, int height, int obfuscationGuard, int width) {
        RuntimeException runtimeException = null;
        RgbSprite sprite = null;
        MapLayout layout = null;
        int tileHeight = 0;
        int tileWidth = 0;
        int leftOffset = 0;
        int topOffset = 0;
        int[][] terrain = null;
        String[] participantNames = null;
        int var14_int = 0;
        Battlefield previewBattlefield = null;
        int tileIndex = 0;
        int tileY = 0;
        int tileX = 0;
        MapTile tile = null;
        int terrainType = 0;
        int var23 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RgbSprite stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int tileColour = 0;
        Unit unit = null;
        int left = 0;
        int top = 0;
        var23 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          sprite = new RgbSprite(width, height);
          layout = mission.getMapLayout(-98);
          tileHeight = sprite.pixelHeight / layout.mapHeight;
          tileWidth = sprite.pixelWidth / layout.mapWidth;
          leftOffset = (sprite.pixelWidth - tileWidth * layout.mapWidth) / 2;
          topOffset = (-(tileWidth * layout.mapHeight) + sprite.pixelHeight) / 2;
          terrain = new int[][]{Widget.field_o};
          participantNames = new String[mission.participantIds.length];
          var14_int = 0;
          while (participantNames.length > var14_int) {
            participantNames[var14_int] = "-";
            var14_int++;
            if (var23 == 0) {
              continue;
            }
            break;
          }
          previewBattlefield = new Battlefield(0, participantNames, -1, terrain, 0, true, false, mission.mapSizeSetting, 1, layout.mapTheme, false, (int[][]) null, 4, 0, 0, mission);
          previewBattlefield.localPlayer = 0;
          try {
            TabbedPanel.a(mission, (byte) -26);
            previewBattlefield.readLegacySnapshot(obfuscationGuard ^ obfuscationGuard, new PacketBuffer(quicksave.snapshotBytes));
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            runtimeException = decompiledCaughtException;
            runtimeException.printStackTrace();
          }
          CombatSandbox.a(sprite, 3);
          SoftwareRaster.f(0, 0, sprite.pixelWidth, sprite.pixelHeight, 4473924);
          tileIndex = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(tileIndex < previewBattlefield.tiles.length)))) {
            tileY = tileIndex / previewBattlefield.mapWidth;
            tileX = tileIndex % previewBattlefield.mapWidth;
            tile = previewBattlefield.tiles[tileIndex];
            terrainType = tile.terrainType;
            stackIn_20_0 = -17;
            stackIn_20_1 = ~terrainType;
            if (var23 == 0) {
              if (stackIn_20_0 >= stackIn_20_1) {
                terrainType = 0;
              }
              tileColour = UnitLossCondition.battlefieldThemes[layout.mapTheme].terrainPreviewColours[terrainType];
              if (null != tile.occupant) {
                unit = tile.occupant;
                tileColour = op.field_c[0][unit.ownerPlayer];
              }
              left = tileWidth * tileX + leftOffset;
              top = topOffset + tileHeight * tileY;
              SoftwareRaster.f(left, top, tileWidth, tileHeight, tileColour);
              SoftwareRaster.e(left, top, left + tileWidth, top, 16777215, 16);
              SoftwareRaster.e(left, top + 1, left, tileHeight + top, 16777215, 16);
              SoftwareRaster.d(1 + left, -1 + (tileHeight + top), left + tileWidth, -1 + top + tileHeight, 0, 16);
              SoftwareRaster.e(left + tileWidth - 1, top + 1, left + (tileWidth - 1), tileHeight + (top - 1), 0, 16);
              tileIndex++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_20_0 = obfuscationGuard;
            stackIn_20_1 = -18863;
          }
          QuickChatPhraseRepository.popRasterState(stackIn_20_0 + stackIn_20_1);
          stackIn_21_0 = sprite;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = decompiledCaughtException;
          stackIn_25_0 = var6_ref;
          stackIn_25_1 = new StringBuilder().append("cv.V(");
          if (mission == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (quicksave == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(height).append(',').append(obfuscationGuard).append(',').append(width).append(')').toString());
        }
    }

    private final void addMissionEntry(int obfuscationGuard, CampaignMission mission) {
        RuntimeException runtimeException = null;
        CampaignMenuEntry entry = null;
        int score = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          entry = new CampaignMenuEntry(mission);
          score = mh.getProfileMissionScore(this.campaignIndex, obfuscationGuard - 119, entry.entryId);
          if (~score < obfuscationGuard) {
            entry.statusText = AiInfluenceMap.a(10602, score);
            entry.score = score;
          }
          this.missionEntries.put(entry, (long)entry.entryId, 122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("cv.L(").append(obfuscationGuard).append(',');
          if (mission == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final CampaignMenuEntry getMissionEntry(int obfuscationGuard, int missionId) {
        CampaignMenuEntry var3 = null;
        RuntimeException var3_ref = null;
        CampaignMenuEntry stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 321) {
            this.a((byte) -52, true, (CampaignMenuEntry) null, true);
          }
          var3 = (CampaignMenuEntry) (this.missionEntries.get(-128, (long)missionId));
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3_ref), "cv.W(" + obfuscationGuard + ',' + missionId + ')');
        }
    }

    private final void openSelectedCampaign(int obfuscationGuard) {
        CampaignQuicksave var2 = null;
        CampaignMission var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          this.selectedMissionEntry = null;
          if (this.selectedCampaignEntry.entryId == -1) {
            var2 = ku.getStoredQuicksave(obfuscationGuard + 86);
            if (!BoundedFile.a(var2.campaignIndex, obfuscationGuard + 11906) &&
              QuickChatPhraseRepository.a(27875)) {
              PaletteRegionMap.field_i = bn.field_g;
              CipherPacketBuffer.a(false, 11, obfuscationGuard ^ 1, jt.field_a);
              return;
            }
            this.rebuildMissionEntries(var2.campaignIndex, 53);
            var3 = QuickChatPhrase.getCampaignMission(var2.campaignIndex, var2.missionId, 0);
            l.activeCampaignMission = var3;
            CipherPacketBuffer.a(true, -11, obfuscationGuard + 1, 0);
            if (ArmiesOfGielinor.obfuscationControl) {
              this.openCampaign(this.selectedCampaignEntry.entryId, true);
            }
          } else {
            this.openCampaign(this.selectedCampaignEntry.entryId, true);
          }
          if (obfuscationGuard != 0) {
            this.field_p = (CampaignMenuButton) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "cv.D(" + obfuscationGuard + ')');
        }
    }

    final void handleInput(byte obfuscationGuard) {
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        int var3_int = 0;
        Object var3 = null;
        Object var4 = null;
        CampaignMenuEntry var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          fe.field_b = fe.field_b + 1;
          fe.field_b = fe.field_b % 100;
          if (obfuscationGuard < 114) {
            return;
          }
          if (2 <= BufferedSocket.field_j &&
            br.heldKeys[5] &&
            br.heldKeys[81]) {
            kw.campaignPacketWord0 = 2297;
            cg.campaignPacketWord2 = 72584621;
            wr.campaignPacketWord3 = 224;
            ii.campaignPacketWord1 = 4452;
            var2 = br.getCampaign(this.campaignIndex, (byte) -125).missions;
            var3_int = 0;
            while (true) {
              if (java.lang.reflect.Array.getLength(var2) > var3_int) {
                var4 = ((Object[]) (var2))[var3_int];
                ActionSpell.submitCampaignResult(4, -1, (CampaignMission) (var4), true, 1, -1);
                var3_int++;
                if (var7 == 0) {
                  continue;
                }
              } else {
                pg.playerProfile.campaignProgress = new CampaignProgress();
              }
              break;
            }
            this.openCampaign(this.campaignIndex, true);
          }
          if (1 == this.viewMode) {
            if (null != this.selectedMissionEntry) {
              this.selectedMissionEntry.selectionAge = this.selectedMissionEntry.selectionAge + 1;
            }
            boolean decompiledFrameCompleted0 = true;
            if (DeployEvent.pointerPressButton == 1 &&
              null != this.regionMap) {
              if (null != this.selectedMissionEntry &&
                this.selectedMissionEntry.selectable &&
                this.field_t != null &&
                this.field_t.containsPointer((byte) -27)) {
                this.selectMissionOrQuicksaveDialog((byte) 107);
                return;
              }
              var2_int = this.regionMap.getRegionAt(AiPlanningStrategy.pointerX - db.a(true, 0), (byte) -79, ko.pointerY - MatchConditionEntry.a(0, (byte) 94));
              if (-1 < var2_int) {
                var3 = null;
                var4_ref = (CampaignMenuEntry) (this.missionEntries.first(1));
                while (var4_ref != null) {
                  stackIn_189_0 = var4_ref.entryId;
                  stackIn_189_1 = var2_int;
                  if (var7 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_189_0 != stackIn_189_1) {
                    var4_ref = (CampaignMenuEntry) (this.missionEntries.next((byte) 60));
                    continue;
                  }
                  var3 = var4_ref;
                  break;
                }
                if ((decompiledFrameCompleted0) &&
                  (var3 != null &&
                  ((CampaignMenuEntry) (var3)).selectable)) {
                  var4_int = 0;
                  if (BufferedSocket.field_j >= 2) {
                    boolean decompiledSharedTail0 = !(br.heldKeys[81]);
                    if (!decompiledSharedTail0) {
                      cg.campaignPacketWord2 = 72584621;
                      ii.campaignPacketWord1 = 4452;
                      wr.campaignPacketWord3 = 224;
                      kw.campaignPacketWord0 = 2297;
                      hc.campaignMetricMutationCounter = hc.campaignMetricMutationCounter + 1;
                      hc.campaignMetricMutationCounter = hc.campaignMetricMutationCounter + (ko.pointerY ^ AiPlanningStrategy.pointerX);
                      hc.campaignMetricMutationCounter = Math.abs(hc.campaignMetricMutationCounter);
                      var5 = hc.campaignMetricMutationCounter % 4;
                      var6 = var5;
                      switch ((var7 == 0
                        || var6 == 0
                        || var6 == 3
                        ) ? var6 : -1) {
                        case 0:
                          ii.campaignPacketWord1 = ii.campaignPacketWord1 - 12;
                          kw.campaignPacketWord0 = kw.campaignPacketWord0 - 3;
                          if (var7 == 0) {
                            break;
                          }
                        case 1:
                          ii.campaignPacketWord1 = ii.campaignPacketWord1 + 3;
                          kw.campaignPacketWord0 = kw.campaignPacketWord0 + 12;
                          if (var7 == 0) {
                            break;
                          }
                        case 2:
                          kw.campaignPacketWord0 = kw.campaignPacketWord0 + 9;
                          if (var7 == 0) {
                            break;
                          }
                        case 3:
                          ii.campaignPacketWord1 = ii.campaignPacketWord1 - 9;
                          if (var7 == 0) {
                            break;
                          }
                        default:
                          throw new IllegalStateException("");
                      }
                      var5 = b.calculateMissionScore(2, 10, 12, (byte) 25, 3);
                      ActionSpell.submitCampaignResult(4, 12, ((CampaignMenuEntry) (var3)).mission, true, var5, 3);
                      this.openCampaign(((CampaignMenuEntry) (var3)).mission.campaign.campaignIndex, true);
                      System.out.println("m  id " + ((CampaignMenuEntry) (var3)).entryId + " " + ((CampaignMenuEntry) (var3)).title);
                      var4_int = 1;
                      decompiledSharedTail0 = (var7 != 0);
                    }
                    if ((decompiledSharedTail0) &&
                      (br.heldKeys[82])) {
                      var4_int = 1;
                      ActionSpell.submitCampaignResult(4, -1, ((CampaignMenuEntry) (var3)).mission, true, 1, -1);
                      this.openCampaign(((CampaignMenuEntry) (var3)).mission.campaign.campaignIndex, true);
                    }
                  }
                  if (var4_int == 0) {
                    if (this.selectedMissionEntry == var3) {
                      if (!(this.selectedMissionEntry.selectionAge >= 20)) {
                        this.selectMissionOrQuicksaveDialog((byte) 72);
                        if (var7 != 0) {
                          RadialSummonMenu.playDefaultSoundWithIntGuard(80, ClientUiNode.field_v[11]);
                        }
                      }
                    } else {
                      RadialSummonMenu.playDefaultSoundWithIntGuard(80, ClientUiNode.field_v[11]);
                    }
                    this.selectedMissionEntry = (CampaignMenuEntry) (var3);
                    this.selectedMissionEntry.selectionAge = 0;
                  }
                }
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_189_0 = -3;
              stackIn_189_1 = ~DeployEvent.pointerPressButton;
            }
            if (stackIn_189_0 == stackIn_189_1) {
              this.selectedMissionEntry = null;
            }
          } else {
            if (this.viewMode != 0) {
              if (this.viewMode == 3) {
                if (DeployEvent.pointerPressButton == 1 &&
                  this.field_c != null &&
                  this.field_c.containsPointer((byte) -49)) {
                  var2 = ku.getStoredQuicksave(86);
                  var3 = QuickChatPhrase.getCampaignMission(((CampaignQuicksave) (var2)).campaignIndex, ((CampaignQuicksave) (var2)).missionId, 0);
                  l.activeCampaignMission = (CampaignMission) (var3);
                  CipherPacketBuffer.a(true, -11, 1, 0);
                }
                if (DeployEvent.pointerPressButton == 1 &&
                  null != this.field_j &&
                  this.field_j.containsPointer((byte) 121)) {
                  this.resumeQuicksave(-2);
                  l.activeCampaignMission = this.selectedMissionEntry.mission;
                  CipherPacketBuffer.a(true, -10, 1, 0);
                }
                if (DeployEvent.pointerPressButton == 1 &&
                  this.field_o != null &&
                  this.field_o.containsPointer((byte) -52)) {
                  this.viewMode = 1;
                }
                return;
              }
              if (this.viewMode == 2) {
                if (DeployEvent.pointerPressButton == 1 &&
                  null != this.field_h &&
                  this.field_h.containsPointer((byte) 86)) {
                  this.resumeQuicksave(-2);
                  l.activeCampaignMission = this.selectedMissionEntry.mission;
                  CipherPacketBuffer.a(true, -10, 1, 0);
                }
                if (DeployEvent.pointerPressButton == 1 &&
                  this.field_f != null &&
                  this.field_f.containsPointer((byte) -69)) {
                  this.viewMode = 1;
                }
                return;
              }
            } else {
              if (this.selectedCampaignEntry != null) {
                this.selectedCampaignEntry.selectionAge = this.selectedCampaignEntry.selectionAge + 1;
              }
              if (null != this.selectedCampaignEntry &&
                DeployEvent.pointerPressButton == 1 &&
                IterableDualNodeDeque.isPointerInBounds(-33, db.a(true, 354), db.a(true, 600), MatchConditionEntry.a(361, (byte) 94), MatchConditionEntry.a(402, (byte) 94))) {
                this.openSelectedCampaign(0);
                return;
              }
            }
          }
          if (2 == DeployEvent.pointerPressButton) {
            this.selectedMissionEntry = null;
            this.selectedCampaignEntry = null;
          }
          if (DeployEvent.pointerPressButton == 1) {
            var2 = null;
            var3 = null;
            var4_int = this.viewMode;
            if (0 == var4_int) {
              var3 = this.campaignEntries;
            } else {
              if (1 == var4_int) {
                var3 = this.missionEntries;
              }
            }
            if (null != var3) {
              var4_ref = (CampaignMenuEntry) (((NodeHashTable) (var3)).first(1));
              while (null != var4_ref) {
                if (var7 != 0) {
                  return;
                }
                if (var4_ref.selectable &&
                  var4_ref.containsPoint(AiPlanningStrategy.pointerX, ko.pointerY, 122)) {
                  var2 = var4_ref;
                } else {
                  var4_ref = (CampaignMenuEntry) (((NodeHashTable) (var3)).next((byte) 80));
                  continue;
                }
                break;
              }
              if (null == var2) {
                return;
              }
              if (this.viewMode == 1) {
                if (BufferedSocket.field_j < 2) {
                  return;
                }
                if (!br.heldKeys[81]) {
                  return;
                }
                pg.playerProfile.campaignProgress.setResult(65535, ((CampaignMenuEntry) (var2)).entryId, uk.field_n % 10 + ((CampaignMenuEntry) (var2)).entryId * 10, this.campaignIndex, ((CampaignMenuEntry) (var2)).entryId * 200 + uk.field_n % 200);
                this.openCampaign(this.campaignIndex, true);
                if (var7 == 0) {
                  return;
                }
              }
              if (this.viewMode != 0) {
                return;
              }
              if (this.selectedCampaignEntry != var2) {
                RadialSummonMenu.playDefaultSoundWithIntGuard(98, ClientUiNode.field_v[11]);
              }
              this.selectedCampaignEntry = (CampaignMenuEntry) (var2);
              if (this.selectedCampaignEntry.selectionAge < 20) {
                this.openSelectedCampaign(0);
              }
              this.selectedCampaignEntry.selectionAge = 0;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) (var2), "cv.H(" + obfuscationGuard + ')');
        }
    }

    private final void selectMissionOrQuicksaveDialog(byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        CampaignQuicksave var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2 = ku.getStoredQuicksave(91);
          if (null == var2) {
            l.activeCampaignMission = this.selectedMissionEntry.mission;
            CipherPacketBuffer.a(true, -10, 1, 0);
            if (var4 != 0) {
              if (this.selectedMissionEntry.entryId == var2.missionId &&
                var2.campaignIndex == this.campaignIndex) {
                this.setViewMode(3, (byte) 42);
                this.setViewMode(2, (byte) 42);
              } else {
                this.setViewMode(2, (byte) 42);
              }
            }
          } else {
            if (this.selectedMissionEntry.entryId == var2.missionId &&
              var2.campaignIndex == this.campaignIndex) {
              this.setViewMode(3, (byte) 42);
              if (var4 != 0) {
                this.setViewMode(2, (byte) 42);
              }
            } else {
              this.setViewMode(2, (byte) 42);
            }
          }
          var3 = -127 % ((obfuscationGuard - 10) / 55);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cv.S(" + obfuscationGuard + ')');
        }
    }

    private final CampaignMenuEntry buildCampaignEntry(boolean obfuscationGuard, CampaignDefinition campaign) {
        CampaignMenuEntry stackIn_3_0 = null;
        CampaignMenuEntry stackIn_11_0 = null;
        boolean stackIn_14_1 = false;
        CampaignDefinition stackIn_18_0 = null;
        Object stackIn_34_0 = null;
        CampaignMenuEntry stackIn_39_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        CampaignDefinition stackOut_17_0;
        CampaignMenuEntry var3 = null;
        RuntimeException var3_ref = null;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
        int var6_int = 0;
        RgbSprite var6 = null;
        RgbSprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!obfuscationGuard) {
            stackIn_3_0 = (CampaignMenuEntry) null;
            return stackIn_3_0;
          }
          var3 = new CampaignMenuEntry(campaign.campaignIndex, campaign.name);
          var3.godId = campaign.localGodId;
          var3.description = campaign.description;
          stackIn_11_0 = var3;
          stackIn_14_1 = (campaign.c((byte) -45)) || !(0 >= df.field_M) || !(BufferedSocket.field_j < 2);
          boolean decompiledFrameCompleted0 = true;
          stackIn_11_0.selectable = stackIn_14_1;
          if (var3.selectable) {
            var4_int = 0;
            var5 = campaign.missions.length;
            var6_int = 0;
            while (var5 > var6_int) {
              stackOut_17_0 = (CampaignDefinition) (campaign);
              stackIn_34_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (mh.getProfileMissionScore(stackIn_18_0.campaignIndex, -120, var6_int) > 0) {
                var4_int++;
              }
              var6_int++;
            }
            if (decompiledFrameCompleted0) {
              var3.statusText = fo.a(4800, ConsoleExpression.field_l, new String[]{Integer.toString(var4_int), Integer.toString(var5)});
              var6 = ps.field_w[var3.entryId];
              var7 = new RgbSprite(var6.canvasWidth, var6.canvasHeight);
              CombatSandbox.a(var7, 3);
              var6.f(0, 0);
              var8 = 18;
              boolean decompiledSharedTail0 = (var3.entryId == 1);
              if (!decompiledSharedTail0) {
                SoftwareRaster.c(var8, var8, 0, 0, var6.canvasWidth, var6.canvasHeight);
                decompiledSharedTail0 = (var9 != 0);
              }
              if (decompiledSharedTail0) {
                SoftwareRaster.c(var8, var8, 0, var8, var6.canvasWidth, -var8 + var6.canvasHeight);
              }
              QuickChatPhraseRepository.popRasterState(-18862);
              var3.previewSprite = var7;
              if (var9 != 0) {
                var3.statusText = bn.field_g;
              }
            }
          } else {
            var3.statusText = bn.field_g;
          }
          if (decompiledFrameCompleted0) {
            stackIn_34_0 = this.campaignEntries.get(-64, (long)var3.entryId);
          }
          var4 = stackIn_34_0;
          if (null != var4) {
            ((IntrusiveNode) (var4)).unlink(-100);
          }
          this.campaignEntries.put(var3, (long)var3.entryId, 97);
          stackIn_39_0 = var3;
          return stackIn_39_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_43_0 = var3_ref;
          stackIn_43_1 = new StringBuilder().append("cv.I(").append(obfuscationGuard).append(',');
          if (campaign == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    private final void rebuildMissionEntries(int campaignIndex, int obfuscationGuard) {
        int stackIn_26_0 = 0;
        CampaignMenuEntry stackIn_42_0 = null;
        RuntimeException decompiledCaughtException = null;
        CampaignDefinition campaign = null;
        RuntimeException var3_ref = null;
        CampaignMission[] missions = null;
        int initialLeft = 0;
        int missionIndex = 0;
        CampaignMission mission = null;
        int left = 0;
        int top = 0;
        int lastColumnLeft = 0;
        int cardWidth = 0;
        int cardHeight = 0;
        int rowSpacing = 0;
        int columnSpacing = 0;
        CampaignMenuEntry entry = null;
        int requireAll = 0;
        int selectable = 0;
        int[] neighborIds = null;
        int neighborIndex = 0;
        int neighborId = 0;
        int neighborHasScore = 0;
        int var20 = 0;
        CampaignMenuEntry stackIn_42_0Lifetime1;
        int initialTop;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.regionMap = new PaletteRegionMap(mu.field_g[campaignIndex][1], 1, 16777215);
          this.missionEntries = new NodeHashTable(32);
          campaign = br.getCampaign(campaignIndex, (byte) -118);
          if (campaign != null) {
            missions = campaign.missions;
            missionIndex = 0;
            while (missions.length > missionIndex) {
              mission = missions[missionIndex];
              if (mission != null) {
                this.addMissionEntry(-1, mission);
              }
              missionIndex++;
              if (var20 == 0) {
                continue;
              }
              break;
            }
          }
          initialLeft = 90;
          initialTop = 80;
          left = initialLeft;
          top = initialTop;
          lastColumnLeft = 400;
          cardWidth = 150;
          cardHeight = 38;
          rowSpacing = cardHeight / 2;
          columnSpacing = 10;
          entry = (CampaignMenuEntry) (this.missionEntries.first(1));
          while (null != entry) {
            if (var20 != 0) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            if (null != entry.mission.neighborMissionIds &&
              null == entry.statusText) {
              requireAll = entry.mission.requiresAllNeighborScores((byte) 68) ? 1 : 0;
              selectable = requireAll;
              neighborIds = entry.mission.neighborMissionIds;
              neighborIndex = 0;
              while (neighborIds.length > neighborIndex) {
                neighborId = neighborIds[neighborIndex];
                stackIn_42_0 = this.getMissionEntry(321, neighborId);
                stackIn_26_0 = (stackIn_42_0.statusText == null) ? 0 : 1;
                neighborHasScore = stackIn_26_0;
                if (neighborHasScore != 0 &&
                  requireAll == 0) {
                  selectable = 1;
                } else {
                  if (neighborHasScore == 0 &&
                    requireAll != 0) {
                    selectable = 0;
                  } else {
                    neighborIndex++;
                    continue;
                  }
                }
                break;
              }
              stackIn_42_0Lifetime1 = entry;
              stackIn_42_0Lifetime1.selectable = selectable != 0;
              decompiledFrameRemainder0 = false;
            }
            else {
              entry.selectable = true;
            }
            entry.width = cardWidth;
            entry.height = cardHeight;
            entry.top = top;
            entry.left = left;
            left = left + (columnSpacing + entry.width);
            if (entry.left > lastColumnLeft) {
              left = initialLeft;
              top = top + (entry.height + rowSpacing);
            }
            entry = (CampaignMenuEntry) (this.missionEntries.next((byte) 64));
          }
          if (obfuscationGuard < 15) {
            this.addMissionEntry(45, (CampaignMission) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3_ref), "cv.C(" + campaignIndex + ',' + obfuscationGuard + ')');
        }
    }

    final void openCampaign(int campaignIndex, boolean obfuscationGuard) {
        RgbSprite discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!BoundedFile.a(campaignIndex, 11906) &&
            QuickChatPhraseRepository.a(27875)) {
            PaletteRegionMap.field_i = bn.field_g;
            CipherPacketBuffer.a(false, 11, 1, jt.field_a);
            return;
          }
          if (null == mu.field_g) {
            this.loadCampaignResources((byte) -122);
          }
          this.campaignIndex = campaignIndex;
          this.rebuildMissionEntries(campaignIndex, 98);
          if (!obfuscationGuard) {
            discarded$1 = this.renderMissionPreview((CampaignMission) null, (CampaignQuicksave) null, -116, 21, 100);
          }
          this.setViewMode(1, (byte) 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "cv.P(" + campaignIndex + ',' + obfuscationGuard + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 == 13) {
            if (this.viewMode != 1) {
              if (this.viewMode != 0) {
                if (this.viewMode == 2 ||
                  this.viewMode == 3) {
                  this.viewMode = 1;
                  if (var6 != 0) {
                    CipherPacketBuffer.a(false, 0, 1, jt.field_a);
                    this.setViewMode(0, (byte) 42);
                  }
                }
              } else {
                CipherPacketBuffer.a(false, 0, 1, jt.field_a);
                if (var6 != 0) {
                  this.setViewMode(0, (byte) 42);
                }
              }
            } else {
              this.setViewMode(0, (byte) 42);
            }
          }
          if (param2 <= BufferedSocket.field_j) {
            var4_int = -2;
            var5 = 256;
            if (param0 < 16 ||
              param0 > 25) {
              if (26 != param0) {
                if (param0 != 27) {
                  if (param0 == 85) {
                    var4_int = -1;
                    if (var6 != 0) {
                      var4_int = 11;
                      var4_int = 10;
                      var4_int = param0 - 16;
                    }
                  }
                } else {
                  var4_int = 11;
                  if (var6 != 0) {
                    var4_int = 10;
                    var4_int = param0 - 16;
                  }
                }
              } else {
                var4_int = 10;
                if (var6 != 0) {
                  var4_int = param0 - 16;
                }
              }
            } else {
              var4_int = param0 - 16;
            }
            stackIn_46_0 = (!br.heldKeys[81]) ? 256 : 0;
            var5Lifetime1 = stackIn_46_0;
            if (var4_int != -2) {
              lk.musicCrossfadeStream.firstSequencer.setChannelGain(var5Lifetime1, var4_int, (byte) -52);
              lk.musicCrossfadeStream.secondSequencer.setChannelGain(var5Lifetime1, var4_int, (byte) -116);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "cv.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        int stackIn_38_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_61_0 = 0;
        Object stackIn_68_0;
        int stackIn_68_1;
        boolean stackIn_68_2;
        int stackIn_68_3;
        CampaignMenuEntry stackIn_68_4;
        Object stackIn_70_0;
        boolean stackIn_71_5 = false;
        int stackIn_89_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        RuntimeException decompiledCaughtException = null;
        IndexedSprite var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        CampaignMenuEntry var4 = null;
        CampaignQuicksave var4_ref = null;
        CampaignMenuEntry var5_ref_cq = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_68_0Lifetime1;
        Object stackIn_70_0Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2 = mu.field_g[this.campaignIndex][0];
          var2.drawOpaque(db.a(true, 0), MatchConditionEntry.a(0, (byte) 94));
          if (null != this.regionMap) {
            try {
              var3 = new boolean[this.missionEntries.size((byte) 117)];
              var4 = (CampaignMenuEntry) (this.missionEntries.first(param0 ^ -25751));
              do {
                if (var4 == null) {
                  this.regionMap.drawSelectedRegions((byte) 93, db.a(true, 0), (boolean[]) (var3), MatchConditionEntry.a(0, (byte) 94), mu.field_g[this.campaignIndex][2]);
                  break;
                }
                ((byte[]) (var3))[var4.entryId] = (byte) (var4.selectable ? 1 : 0);
                var4 = (CampaignMenuEntry) (this.missionEntries.next((byte) 109));
              } while (var8 == 0);
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              ((RuntimeException) (var3)).printStackTrace();
              this.regionMap = null;
            }
          }
          if (param0 != -25752) {
            this.setViewMode(85, (byte) -25);
          }
          var3 = null;
          var4_ref = ku.getStoredQuicksave(85);
          var5_ref_cq = (CampaignMenuEntry) (this.missionEntries.first(1));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5_ref_cq == null))) {
            var6Lifetime1 = 0;
            stackIn_96_0 = this.viewMode;
            stackIn_96_1 = 1;
            if (var8 == 0) {
              if (stackIn_96_0 == stackIn_96_1) {
                if (var5_ref_cq.selectable &&
                  AiPlanningStrategy.pointerX >= db.a(true, var5_ref_cq.left) &&
                  AiPlanningStrategy.pointerX <= db.a(true, var5_ref_cq.left + var5_ref_cq.width) &&
                  ko.pointerY >= MatchConditionEntry.a(var5_ref_cq.top, (byte) 94) &&
                  ko.pointerY <= MatchConditionEntry.a(var5_ref_cq.height + var5_ref_cq.top, (byte) 94)) {
                  stackIn_38_0 = 1;
                } else {
                  stackIn_38_0 = 0;
                }
                var6Lifetime1 = stackIn_38_0;
                if (this.regionMap != null) {
                  if (var5_ref_cq.selectable &&
                    this.regionMap.getRegionAt(AiPlanningStrategy.pointerX - db.a(true, 0), (byte) -128, ko.pointerY - MatchConditionEntry.a(0, (byte) 94)) == var5_ref_cq.entryId) {
                    stackIn_48_0 = 1;
                  } else {
                    stackIn_48_0 = 0;
                  }
                  var6Lifetime1 = stackIn_48_0;
                }
              }
              if (var6Lifetime1 != 0) {
                var3 = var5_ref_cq;
              }
              if (var4_ref != null &&
                this.campaignIndex == var4_ref.campaignIndex &&
                var5_ref_cq.entryId == var4_ref.missionId) {
                stackIn_61_0 = 1;
              } else {
                stackIn_61_0 = 0;
              }
              regionExit1: {
                boolean decompiledFrameRemainder0 = true;
                var7Lifetime1 = stackIn_61_0;
                stackIn_68_0 = this;
                stackIn_68_1 = -125;
                stackIn_68_2 = false;
                stackIn_68_3 = var7Lifetime1;
                stackIn_68_4 = var5_ref_cq;
                if (var6Lifetime1 == 0) {
                  stackIn_70_0 = this;
                  if (null != this.selectedMissionEntry) {
                    stackIn_70_0Lifetime1 = this;
                    if (var5_ref_cq == this.selectedMissionEntry) {
                      stackIn_68_0Lifetime1 = this;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    stackIn_71_5 = false;
                    break regionExit1;
                  }
                }
                stackIn_71_5 = true;
              }
              this.a(stackIn_68_1, stackIn_68_2, stackIn_68_3 != 0, stackIn_68_4, stackIn_71_5);
              var5_ref_cq = (CampaignMenuEntry) (this.missionEntries.next((byte) 110));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            if (null != var3) {
              var5 = nr.field_e.textWidth(((CampaignMenuEntry) (var3)).title) >> 2;
              var6 = ((CampaignMenuEntry) (var3)).left;
              if (var5 + var6 > 630) {
                var6 = -var5 + 630;
              }
              if (-var5 + var6 < 225) {
                var6 = 225 + var5;
              }
              fe.b(((CampaignMenuEntry) (var3)).title, db.a(true, var6), MatchConditionEntry.a(((CampaignMenuEntry) (var3)).top - 12, (byte) 94), true);
              fe.c(((CampaignMenuEntry) (var3)).title, db.a(true, var6), MatchConditionEntry.a(((CampaignMenuEntry) (var3)).top - 12, (byte) 94), ConsoleValue.field_b, true);
              if (null != var4_ref &&
                ~this.campaignIndex == ~var4_ref.campaignIndex &&
                var4_ref.missionId == ((CampaignMenuEntry) (var3)).entryId) {
                stackIn_89_0 = 1;
              } else {
                stackIn_89_0 = 0;
              }
              var7 = stackIn_89_0;
              if (var7 != 0) {
                fe.b(qf.field_a, db.a(true, ((CampaignMenuEntry) (var3)).left), MatchConditionEntry.a(10 + ((CampaignMenuEntry) (var3)).top, (byte) 94), true);
                fe.c(qf.field_a, db.a(true, ((CampaignMenuEntry) (var3)).left), MatchConditionEntry.a(((CampaignMenuEntry) (var3)).top + 10, (byte) 94), ConsoleValue.field_b, true);
              }
              if (this.hoveredEntry != var3) {
                RadialSummonMenu.playDefaultSoundWithIntGuard(127, ClientUiNode.field_v[1]);
              }
            }
            this.hoveredEntry = (CampaignMenuEntry) (var3);
            stackIn_96_0 = -2;
            stackIn_96_1 = ~this.viewMode;
          }
          if (stackIn_96_0 == stackIn_96_1 &&
            this.selectedMissionEntry != null) {
            this.c(param0 + 25772);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "cv.O(" + param0 + ')');
        }
    }

    private final void setViewMode(int viewMode, byte obfuscationGuard) {
        CampaignMenuEntry discarded$0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CampaignQuicksave var10_ref_sl = null;
        RuntimeException var10_ref_RuntimeException = null;
        CampaignMenuEntry var11 = null;
        CampaignDefinition var11_ref = null;
        CampaignMission var12 = null;
        CampaignMenuEntry var12_ref = null;
        int var13_int = 0;
        IntrusiveNode var13 = null;
        String var14 = null;
        RgbSprite var15 = null;
        int var16 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.viewMode = viewMode;
          var10 = this.viewMode;
          if (0 == var10 &&
            var16 == 0 || var10 == 1) {
            if (0 == var10 &&
              var16 == 0 || var16 != 0) {
              var4 = 50;
              var3_int = 200;
              var6 = 150;
              var5 = -(var3_int / 2) + so.field_b.field_a / 2;
              var6Lifetime1 = 90;
              var4 = 56;
              var3_int = 278;
              var5Lifetime1 = 45;
              var7 = var5Lifetime1;
              if (this.campaignEntries == null) {
                this.a(false);
              }
              var8 = var6Lifetime1;
              var9 = 10;
              this.campaignEntries.clear((byte) -124);
              try {
                var10_ref_sl = ku.getStoredQuicksave(84);
                if (var10_ref_sl != null) {
                  var11 = new CampaignMenuEntry(-1, SummonAction.field_A);
                  var11.width = 278;
                  var11.top = 341;
                  var11.height = 57;
                  var11.left = 45;
                  var12 = QuickChatPhrase.getCampaignMission(var10_ref_sl.campaignIndex, var10_ref_sl.missionId, 0);
                  var13_int = Battlefield.a(var12.participantIds.length, var10_ref_sl.snapshotBytes, false);
                  var14 = fo.a(4800, wd.field_e, new String[]{var12.name, Integer.toString(var13_int)});
                  var11.title = var12.campaign.name;
                  var11.selectable = true;
                  var11.mission = var12;
                  var11.godId = var12.campaign.localGodId;
                  var11.statusText = var14;
                  var11.description = var12.description;
                  if (!var12.campaign.c((byte) -45) &&
                    QuickChatPhraseRepository.a(27875)) {
                    var11.selectable = false;
                    var11.statusText = bn.field_g + " (" + var11.statusText + ")";
                  }
                  var15 = this.renderMissionPreview(var12, var10_ref_sl, 200, 1, 200);
                  var11.previewSprite = var15;
                  this.campaignEntries.put(var11, (long)var11.entryId, 82);
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10_ref_RuntimeException = decompiledCaughtException;
                af.a((Throwable) ((Object) var10_ref_RuntimeException), 93, "Error reading quicksave map.");
                qh.requestDeleteQuicksave((byte) 27);
              }
              var10 = 0;
              scanLoop1: while (true) {
                if (var10 < 3) {
                  var11_ref = br.getCampaign(var10, (byte) -12);
                  if (var16 == 0) {
                    if (var11_ref != null) {
                      var12_ref = this.buildCampaignEntry(true, var11_ref);
                    } else {
                      var12_ref = new CampaignMenuEntry(var10, (String) null);
                      var12_ref.selectable = false;
                      var13 = this.campaignEntries.get(-89, (long)var12_ref.entryId);
                      if (null != var13) {
                        var13.unlink(obfuscationGuard + 14);
                      }
                      this.campaignEntries.put(var12_ref, (long)var12_ref.entryId, 105);
                    }
                    var12_ref.height = var4;
                    var12_ref.width = var3_int;
                    var12_ref.left = var7;
                    var12_ref.top = var8;
                    var8 = var8 + (var4 + var9);
                    var10++;
                    continue;
                  }
                } else {
                  if (this.selectedCampaignEntry == null) {
                    break scanLoop1;
                  }
                }
                this.selectedCampaignEntry = (CampaignMenuEntry) (this.campaignEntries.get(-19, (long)this.selectedCampaignEntry.entryId));
                break;
              }
              CipherPacketBuffer.a(true, 21, 1, 0);
              if (var16 != 0) {
                CipherPacketBuffer.a(true, 22, 1, 21);
              }
            } else {
              CipherPacketBuffer.a(true, 22, 1, 21);
            }
          }
          if (obfuscationGuard != 42) {
            discarded$0 = this.getMissionEntry(122, 13);
          }
          this.updateMusicProfile(78);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "cv.T(" + viewMode + ',' + obfuscationGuard + ')');
        }
    }

    static {
        field_v = "This password contains repeated characters, and would be easy to guess";
        field_m = "<%0>'s game";
        field_q = "Message game";
        field_n = "Report abuse";
        field_k = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_r = "Please enter a year between <%0> and <%1>";
    }
}
