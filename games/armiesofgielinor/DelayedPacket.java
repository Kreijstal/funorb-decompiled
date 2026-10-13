/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPacket extends IntrusiveNode {
    static String field_r;
    static String field_n;
    static IndexedSprite[] field_k;
    static int soundHandleCleanupCountdown;
    byte[] payload;
    int opcode;
    static boolean field_q;
    long releaseAtMillis;
    static String[] field_s;

    final static void e(int param0) {
        if (BattleTutorial.quickChatMenuVisible) {
          e.closeQuickChatMenu((byte) -93);
          if (param0 == -3) {
            return;
          }
          field_q = false;
          return;
        }
        if (param0 != -3) {
          field_q = false;
          return;
        }
    }

    final static String defeatPlayerForConsole(int playerId, byte obfuscationGuard) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        GameplayController controller = FullscreenFocusCanvas.gameplayController;
        GameplayController controllerAlias = controller;
        if (controllerAlias == null) {
          return "No game in progress.";
        }
        if (playerId < 0) {
          return "Please choose a player, 0-based.";
        }
        if (controllerAlias.battlefield.playerCount < playerId) {
          return "Please choose a player, 0-based.";
        }
        controllerAlias.battlefield.eliminatePlayer(10001, playerId, false);
        kw.campaignPacketWord0 = 2297;
        cg.campaignPacketWord2 = 72584621;
        BirthDateChatEnableForm.campaignPacketWord3 = 224;
        ii.campaignPacketWord1 = 4452;
        int turnsTaken = controller.battlefield.playerTurnCounts[controller.controlledPlayerId];
        int damageTaken = controller.battlefield.damageTakenByPlayer[controller.controlledPlayerId];
        UnitModelViewer.campaignMetricMutationCounter = UnitModelViewer.campaignMetricMutationCounter + 1;
        UnitModelViewer.campaignMetricMutationCounter = UnitModelViewer.campaignMetricMutationCounter + (ko.pointerY ^ AiPlanningStrategy.pointerX);
        if (obfuscationGuard <= 31) {
          DelayedPacket.defeatPlayerForConsole(-2, (byte) 45);
        }
        UnitModelViewer.campaignMetricMutationCounter = Math.abs(UnitModelViewer.campaignMetricMutationCounter);
        int turnDelta = turnsTaken + 0;
        int damageDelta = damageTaken - 0;
        int mutationSelector = UnitModelViewer.campaignMetricMutationCounter % 4;
        int mutationVariant = mutationSelector;
        if (0 == mutationVariant) {
          kw.campaignPacketWord0 = kw.campaignPacketWord0 - damageDelta;
          ii.campaignPacketWord1 = ii.campaignPacketWord1 - turnDelta;
          return "Done.";
        }
        if (mutationVariant != 1) {
          if (mutationVariant == 2) {
            kw.campaignPacketWord0 = kw.campaignPacketWord0 + (turnDelta - damageDelta);
            return "Done.";
          }
          if (mutationVariant != 3) {
            throw new IllegalStateException("");
          }
          ii.campaignPacketWord1 = ii.campaignPacketWord1 - (-damageDelta + turnDelta);
          return "Done.";
        }
        ii.campaignPacketWord1 = ii.campaignPacketWord1 + damageDelta;
        kw.campaignPacketWord0 = kw.campaignPacketWord0 + turnDelta;
        return "Done.";
    }

    final static void a(int param0, int param1, int param2) {
        if (DropdownOptionList.field_R == null) {
          DropdownOptionList.field_R = new int[param2 * 2];
          if (NumericDateInputWidget.field_U == null ||
            !(param2 <= NumericDateInputWidget.field_U.length)) {
            NumericDateInputWidget.field_U = new int[param2 * 2];
          }
          if (AnimationFrameSet.field_w == null ||
            !(param2 <= AnimationFrameSet.field_w.length)) {
            AnimationFrameSet.field_w = new int[param2 * 2];
          }
          if (TutorialController.field_c == null ||
            !(param2 <= TutorialController.field_c.length)) {
            TutorialController.field_c = new int[param2 * 2];
          }
          if (null == VineGrowthAction.field_s ||
            !(param2 <= VineGrowthAction.field_s.length)) {
            VineGrowthAction.field_s = new int[param2 * 2];
          }
          if (EffectPresentation.field_h == null) {
            EffectPresentation.field_h = new int[2 * param2];
            if (SpriteControlNode.field_m == null ||
              !(param2 + param1 <= SpriteControlNode.field_m.length)) {
              SpriteControlNode.field_m = new int[(param2 + param1) * 2];
            }
            if (AiUnitPlanner.field_q == null ||
              !(AiUnitPlanner.field_q.length >= param2)) {
              AiUnitPlanner.field_q = new boolean[2 * param2];
            }
          } else {
            if (EffectPresentation.field_h.length < param2) {
              EffectPresentation.field_h = new int[2 * param2];
              if (SpriteControlNode.field_m == null ||
                !(param2 + param1 <= SpriteControlNode.field_m.length)) {
                SpriteControlNode.field_m = new int[(param2 + param1) * 2];
              }
              if (AiUnitPlanner.field_q == null ||
                !(AiUnitPlanner.field_q.length >= param2)) {
                AiUnitPlanner.field_q = new boolean[2 * param2];
              }
            } else {
              if (SpriteControlNode.field_m == null) {
                SpriteControlNode.field_m = new int[(param2 + param1) * 2];
                if (AiUnitPlanner.field_q == null ||
                  !(AiUnitPlanner.field_q.length >= param2)) {
                  AiUnitPlanner.field_q = new boolean[2 * param2];
                }
              } else {
                if (param2 + param1 > SpriteControlNode.field_m.length) {
                  SpriteControlNode.field_m = new int[(param2 + param1) * 2];
                  if (AiUnitPlanner.field_q == null ||
                    !(AiUnitPlanner.field_q.length >= param2)) {
                    AiUnitPlanner.field_q = new boolean[2 * param2];
                  }
                } else {
                  if (AiUnitPlanner.field_q == null) {
                    AiUnitPlanner.field_q = new boolean[2 * param2];
                  } else {
                    if (AiUnitPlanner.field_q.length < param2) {
                      AiUnitPlanner.field_q = new boolean[2 * param2];
                    }
                  }
                }
              }
            }
          }
        } else {
          if (DropdownOptionList.field_R.length >= param2) {
            if (NumericDateInputWidget.field_U == null ||
              !(param2 <= NumericDateInputWidget.field_U.length)) {
              NumericDateInputWidget.field_U = new int[param2 * 2];
            }
            if (AnimationFrameSet.field_w == null ||
              !(param2 <= AnimationFrameSet.field_w.length)) {
              AnimationFrameSet.field_w = new int[param2 * 2];
            }
            if (TutorialController.field_c == null ||
              !(param2 <= TutorialController.field_c.length)) {
              TutorialController.field_c = new int[param2 * 2];
            }
            if (null == VineGrowthAction.field_s ||
              !(param2 <= VineGrowthAction.field_s.length)) {
              VineGrowthAction.field_s = new int[param2 * 2];
            }
            if (EffectPresentation.field_h == null) {
              EffectPresentation.field_h = new int[2 * param2];
              if (SpriteControlNode.field_m == null ||
                !(param2 + param1 <= SpriteControlNode.field_m.length)) {
                SpriteControlNode.field_m = new int[(param2 + param1) * 2];
              }
              if (AiUnitPlanner.field_q == null ||
                !(AiUnitPlanner.field_q.length >= param2)) {
                AiUnitPlanner.field_q = new boolean[2 * param2];
              }
            } else {
              if (EffectPresentation.field_h.length < param2) {
                EffectPresentation.field_h = new int[2 * param2];
                if (SpriteControlNode.field_m == null ||
                  !(param2 + param1 <= SpriteControlNode.field_m.length)) {
                  SpriteControlNode.field_m = new int[(param2 + param1) * 2];
                }
                if (AiUnitPlanner.field_q == null ||
                  !(AiUnitPlanner.field_q.length >= param2)) {
                  AiUnitPlanner.field_q = new boolean[2 * param2];
                }
              } else {
                if (SpriteControlNode.field_m == null) {
                  SpriteControlNode.field_m = new int[(param2 + param1) * 2];
                  if (AiUnitPlanner.field_q == null ||
                    !(AiUnitPlanner.field_q.length >= param2)) {
                    AiUnitPlanner.field_q = new boolean[2 * param2];
                  }
                } else {
                  if (param2 + param1 > SpriteControlNode.field_m.length) {
                    SpriteControlNode.field_m = new int[(param2 + param1) * 2];
                    if (AiUnitPlanner.field_q == null ||
                      !(AiUnitPlanner.field_q.length >= param2)) {
                      AiUnitPlanner.field_q = new boolean[2 * param2];
                    }
                  } else {
                    if (AiUnitPlanner.field_q == null) {
                      AiUnitPlanner.field_q = new boolean[2 * param2];
                    } else {
                      if (AiUnitPlanner.field_q.length < param2) {
                        AiUnitPlanner.field_q = new boolean[2 * param2];
                      }
                    }
                  }
                }
              }
            }
          } else {
            DropdownOptionList.field_R = new int[param2 * 2];
            if (NumericDateInputWidget.field_U == null ||
              !(param2 <= NumericDateInputWidget.field_U.length)) {
              NumericDateInputWidget.field_U = new int[param2 * 2];
            }
            if (AnimationFrameSet.field_w == null ||
              !(param2 <= AnimationFrameSet.field_w.length)) {
              AnimationFrameSet.field_w = new int[param2 * 2];
            }
            if (TutorialController.field_c == null ||
              !(param2 <= TutorialController.field_c.length)) {
              TutorialController.field_c = new int[param2 * 2];
            }
            if (null == VineGrowthAction.field_s ||
              !(param2 <= VineGrowthAction.field_s.length)) {
              VineGrowthAction.field_s = new int[param2 * 2];
            }
            if (EffectPresentation.field_h == null) {
              EffectPresentation.field_h = new int[2 * param2];
              if (SpriteControlNode.field_m == null ||
                !(param2 + param1 <= SpriteControlNode.field_m.length)) {
                SpriteControlNode.field_m = new int[(param2 + param1) * 2];
              }
              if (AiUnitPlanner.field_q == null) {
                AiUnitPlanner.field_q = new boolean[2 * param2];
              } else {
                if (AiUnitPlanner.field_q.length < param2) {
                  AiUnitPlanner.field_q = new boolean[2 * param2];
                }
              }
            } else {
              if (EffectPresentation.field_h.length < param2) {
                EffectPresentation.field_h = new int[2 * param2];
                if (SpriteControlNode.field_m == null ||
                  !(param2 + param1 <= SpriteControlNode.field_m.length)) {
                  SpriteControlNode.field_m = new int[(param2 + param1) * 2];
                }
                if (AiUnitPlanner.field_q == null ||
                  !(AiUnitPlanner.field_q.length >= param2)) {
                  AiUnitPlanner.field_q = new boolean[2 * param2];
                }
              } else {
                if (SpriteControlNode.field_m == null) {
                  SpriteControlNode.field_m = new int[(param2 + param1) * 2];
                } else {
                  if (param2 + param1 > SpriteControlNode.field_m.length) {
                    SpriteControlNode.field_m = new int[(param2 + param1) * 2];
                  }
                }
                if (AiUnitPlanner.field_q == null) {
                  AiUnitPlanner.field_q = new boolean[2 * param2];
                } else {
                  if (AiUnitPlanner.field_q.length < param2) {
                    AiUnitPlanner.field_q = new boolean[2 * param2];
                  }
                }
              }
            }
          }
        }
        EmailConfirmationValidator.field_p = 0;
        if (param0 != 2) {
          return;
        }
        pd.field_e = 2147483647;
        sq.field_k = 2147483647;
        LoginForm.field_T = -2147483648;
        se.field_e = -2147483648;
    }

    public static void a(int param0) {
        field_n = null;
        field_s = null;
        field_k = null;
        field_r = null;
        int var1 = 97 % ((32 - param0) / 56);
    }

    DelayedPacket(long releaseAtMillis, int opcode, byte[] payload) {
        try {
          this.opcode = opcode;
          this.releaseAtMillis = releaseAtMillis;
          this.payload = payload;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "qu.<init>(" + releaseAtMillis + ',' + opcode + ',' + (payload != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Armour will help protect your units from damage, but each unit can only wear one type of armour at a time. Equipping a unit with new armour will cause whatever armour that unit is currently wearing to be discarded.";
        field_r = "Most victimised";
        field_s = new String[]{"By rating", "By win percentage"};
        soundHandleCleanupCountdown = 200;
    }
}
