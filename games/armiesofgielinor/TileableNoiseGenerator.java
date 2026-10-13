/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class TileableNoiseGenerator {
    private short[] octaveFrequencies;
    static String field_h;
    static RgbSprite[] smokeSprites;
    private int repeatY;
    static String field_e;
    private int repeatX;
    private short[] permutation;
    int octaveCount;
    static String field_c;
    static String field_l;
    static int field_f;
    private int seed;

    abstract void accumulateOctave(int octave, int sample12, int obfuscationGuard);

    final static void a(int param0, int param1) {
        ClientContextMenu.field_a = param1;
        if (param0 != 0) {
          field_f = -108;
        }
        pg.field_f = DirectByteStorage.field_h;
    }

    private final void buildOctaveFrequencies(int obfuscationGuard) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.octaveFrequencies = new short[this.octaveCount];
        int octave = 0;
        int guardQuotient = -49 / ((-69 - obfuscationGuard) / 56);
        while (octave < this.octaveCount) {
          this.octaveFrequencies[octave] = (short)(int)Math.pow(2.0, (double)octave);
          octave++;
        }
    }

    final static void updateRoomOptionControls(int obfuscationGuard, boolean filterMode, int optionsPacketOpcode, LobbyRoom room) {
        IconTextComponent dupTemp$0 = null;
        int var17_int = 0;
        int restrictedOptionIndex = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        IconTextComponent stackIn_35_0 = null;
        boolean stackIn_36_1 = false;
        IconTextComponent stackIn_41_0 = null;
        boolean stackIn_42_1 = false;
        int stackIn_55_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_72_0 = 0;
        IconTextComponent stackIn_90_0 = null;
        boolean stackIn_91_1 = false;
        IconTextComponent stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        boolean stackIn_97_2 = false;
        IconTextComponent stackIn_100_0 = null;
        boolean stackIn_101_1 = false;
        IconTextComponent stackIn_105_0 = null;
        boolean stackIn_106_1 = false;
        int stackIn_110_0 = 0;
        IconTextComponent stackIn_123_0 = null;
        boolean stackIn_124_1 = false;
        IconTextComponent stackIn_128_0 = null;
        boolean stackIn_129_1 = false;
        IconTextComponent stackIn_132_0 = null;
        boolean stackIn_133_1 = false;
        IconTextComponent stackIn_136_0 = null;
        boolean stackIn_137_1 = false;
        String stackIn_153_0 = null;
        IconTextComponent stackIn_158_0 = null;
        boolean stackIn_159_1 = false;
        IconTextComponent stackIn_161_0 = null;
        boolean stackIn_162_1 = false;
        int stackIn_170_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_230_0 = 0;
        IconTextComponent stackIn_327_0 = null;
        boolean stackIn_328_1 = false;
        IconTextComponent stackIn_334_0 = null;
        boolean stackIn_334_1 = false;
        boolean stackIn_335_2 = false;
        IconTextComponent stackIn_337_0 = null;
        int stackIn_337_1 = 0;
        int stackIn_337_2 = 0;
        int stackIn_337_3 = 0;
        boolean stackIn_340_1 = false;
        IconTextComponent stackIn_344_0 = null;
        boolean stackIn_345_1 = false;
        RuntimeException stackIn_354_0 = null;
        StringBuilder stackIn_354_1 = null;
        String stackIn_355_2 = null;
        RuntimeException decompiledCaughtException = null;
        int controlsEditable = 0;
        RuntimeException var4 = null;
        int roomOptionsChanged = 0;
        int choiceState = 0;
        int optionIndex = 0;
        int capacityMaskByteIndex = 0;
        String extraFilterTooltip = null;
        IconTextComponent[] optionChoices = null;
        int choiceValue = 0;
        int membersRequired = 0;
        int thresholdTwoFailed = 0;
        int thresholdOneFailed = 0;
        int filterChoiceBlocked = 0;
        int featureRequirementFailed = 0;
        int featureRequirementValue = 0;
        int thresholdOne = 0;
        IconTextComponent optionButton = null;
        int var18 = 0;
        Object choiceDescription = null;
        Object choiceHint = null;
        Object tooltip = null;
        Object restrictionMessage = null;
        Object restrictionMessageReference = null;
        int var22_int = 0;
        int multipleRestrictionNames = 0;
        Object var25 = null;
        String restrictionName = null;
        int obfuscationControl = 0;
        int filterBitIndex = 0;
        IconTextComponent spectatorChoiceButton = null;
        IconTextComponent extraFilterButton = null;
        IconTextComponent[] groupChoices = null;
        String featureMessage = null;
        String formattedRestrictionMessage = null;
        Object var25Lifetime1;
        String taggedRestrictionName;
        Object var25Lifetime1Lifetime1;
        int spectatorChoice;
        int extraFilterChoice;
        int optionFilterBitOffset;
        int capacityChoiceLocked;
        int choiceBlocked;
        int filterBitStart;
        int thresholdTwo;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (filterMode) {
            stackIn_12_0 = (SpellCastAction.field_s) ? 0 : 1;
            controlsEditable = stackIn_12_0;
          } else {
            if (ToggleWidget.isCurrentRoomOwner(false)) {
              stackIn_8_0 = (!room.playing) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            controlsEditable = stackIn_8_0;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          roomOptionsChanged = 0;
          if (filterMode) {
            decompiledFrameRemainder1 = !(lm.field_e.length < 2);
            if (decompiledFrameRemainder1) {
              if (filterMode) {
                stackIn_22_0 = (-1 != ResourceProtocolClient.field_c) ? 1 : 0;
              } else {
                stackIn_22_0 = 0;
              }
              choiceState = stackIn_22_0;
              decompiledFrameRemainder0 = (choiceState != 0);
              if (decompiledFrameRemainder0) {
                optionIndex = ResourceProtocolClient.field_c;
                for (capacityMaskByteIndex = 0; capacityMaskByteIndex < CoatOfArms.field_d.length; capacityMaskByteIndex++) {
                  CoatOfArms.field_d[capacityMaskByteIndex] = (byte) 0;
                }
              }
            }
          } else {
            for (choiceState = 0; choiceState < 5; choiceState++) {
              if (controlsEditable != 0 &&
                pu.field_k[0][choiceState + 1].pressedButton != 0 &&
                choiceState != room.gameType) {
                roomOptionsChanged = 1;
                room.gameType = choiceState;
              }
              stackIn_35_0 = pu.field_k[0][1 + choiceState];
              stackIn_36_1 = (controlsEditable != 0);
              stackIn_35_0.inputEnabled = stackIn_36_1;
              if (!fh.field_c &&
                choiceState == 3) {
                pu.field_k[0][choiceState + 1].inputEnabled = false;
              }
              stackIn_41_0 = pu.field_k[0][1 + choiceState];
              stackIn_42_1 = (choiceState == room.gameType);
              stackIn_41_0.selected = stackIn_42_1;
            }
            if (pu.field_k[0][2].hovered) {
              if (!ToggleWidget.isCurrentRoomOwner(false)) {
                DialogMessagePane.field_I = EmailCheckResult.a(4800, op.field_a, new String[]{ToggleWidget.currentRoom.ownerName});
              } else {
                DialogMessagePane.field_I = ActionSpell.field_f;
              }
            }
            decompiledFrameRemainder1 = !(lm.field_e.length < 2);
            if (decompiledFrameRemainder1) {
              if (filterMode) {
                stackIn_55_0 = (-1 != ResourceProtocolClient.field_c) ? 1 : 0;
              } else {
                stackIn_55_0 = 0;
              }
              choiceState = stackIn_55_0;
              decompiledFrameRemainder0 = (choiceState != 0);
              if (decompiledFrameRemainder0) {
                optionIndex = ResourceProtocolClient.field_c;
                for (capacityMaskByteIndex = 0; capacityMaskByteIndex < CoatOfArms.field_d.length; capacityMaskByteIndex++) {
                  CoatOfArms.field_d[capacityMaskByteIndex] = (byte) 0;
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            CoatOfArms.field_d[optionIndex / 8] = (byte)AccountRegistrationDialog.bitwiseOr((int) CoatOfArms.field_d[optionIndex / 8], 1 << optionIndex % 8);
          }
          if (decompiledFrameRemainder1) {
            stackIn_64_0 = (filterMode) ? -1 : 0;
            for (optionIndex = stackIn_64_0; optionIndex < lm.field_e.length; optionIndex++) {
              if (choiceState != 0) {
                stackIn_72_0 = (ResourceProtocolClient.field_c != optionIndex) ? 1 : 0;
              } else {
                stackIn_72_0 = 0;
              }
              capacityChoiceLocked = stackIn_72_0;
              if (controlsEditable != 0 &&
                0 != pu.field_k[1][optionIndex + 1].pressedButton) {
                if (!filterMode) {
                  choiceValue = lm.field_e[optionIndex];
                  if (choiceValue != room.playerCapacity) {
                    room.playerCapacity = choiceValue;
                    roomOptionsChanged = 1;
                  }
                } else {
                  if (choiceState == 0) {
                    if (optionIndex == -1) {
                      for (choiceValue = 0; choiceValue < CoatOfArms.field_d.length; choiceValue++) {
                        CoatOfArms.field_d[choiceValue] = (byte) 0;
                      }
                    } else {
                      CoatOfArms.field_d[optionIndex / 8] = (byte)GrowthEvent.bitwiseXor((int) CoatOfArms.field_d[optionIndex / 8], 1 << rn.bitwiseAnd(optionIndex, 7));
                    }
                  }
                }
              }
              if (!filterMode) {
                choiceValue = lm.field_e[optionIndex];
                stackIn_100_0 = pu.field_k[1][optionIndex + 1];
                stackIn_101_1 = (choiceValue == room.playerCapacity);
                stackIn_100_0.selected = stackIn_101_1;
              } else {
                if (optionIndex == -1) {
                  pu.field_k[1][1 + optionIndex].selected = true;
                  for (choiceValue = 0; choiceValue < lm.field_e.length; choiceValue++) {
                    dupTemp$0 = pu.field_k[1][optionIndex + 1];
                    stackIn_96_0 = dupTemp$0;
                    stackIn_96_1 = dupTemp$0.selected;
                    stackIn_97_2 = (0 == (CoatOfArms.field_d[choiceValue / 8] & 1 << (7 & choiceValue)));
                    stackIn_96_0.selected = stackIn_96_1 & stackIn_97_2;
                  }
                } else {
                  stackIn_90_0 = pu.field_k[1][optionIndex + 1];
                  stackIn_91_1 = ((CoatOfArms.field_d[optionIndex / 8] & 1 << (optionIndex & 7)) != 0);
                  stackIn_90_0.selected = stackIn_91_1;
                }
              }
              stackIn_105_0 = pu.field_k[1][optionIndex + 1];
              stackIn_106_1 = (controlsEditable != 0) && (capacityChoiceLocked == 0);
              stackIn_105_0.inputEnabled = stackIn_106_1;
            }
          }
          stackIn_110_0 = (!filterMode) ? 1 : 0;
          for (spectatorChoice = stackIn_110_0; spectatorChoice < 3; spectatorChoice++) {
            spectatorChoiceButton = pu.field_k[2][spectatorChoice];
            if (controlsEditable != 0 &&
              spectatorChoiceButton.pressedButton != 0) {
              if (filterMode) {
                if (spectatorChoice == 0) {
                  AiPlanningStrategy.field_b = 0;
                } else {
                  AiPlanningStrategy.field_b = AiPlanningStrategy.field_b ^ spectatorChoice;
                }
              } else {
                if (spectatorChoice != room.spectatorMode) {
                  room.spectatorMode = spectatorChoice;
                  roomOptionsChanged = 1;
                }
              }
            }
            stackIn_123_0 = spectatorChoiceButton;
            stackIn_124_1 = (controlsEditable != 0);
            stackIn_123_0.inputEnabled = stackIn_124_1;
            if (!filterMode) {
              stackIn_136_0 = spectatorChoiceButton;
              stackIn_137_1 = ((spectatorChoice & room.spectatorMode) != 0);
              stackIn_136_0.selected = stackIn_137_1;
            } else {
              if (spectatorChoice != 0) {
                stackIn_132_0 = spectatorChoiceButton;
                stackIn_133_1 = ((spectatorChoice & AiPlanningStrategy.field_b) != 0);
                stackIn_132_0.selected = stackIn_133_1;
              } else {
                stackIn_128_0 = spectatorChoiceButton;
                stackIn_129_1 = (AiPlanningStrategy.field_b == 0);
                stackIn_128_0.selected = stackIn_129_1;
              }
            }
          }
          if (filterMode &&
            BoundedFile.field_h > 1) {
            for (extraFilterChoice = 0; 1 + BoundedFile.field_h > extraFilterChoice; extraFilterChoice++) {
              extraFilterButton = pu.field_k[3][extraFilterChoice];
              if (controlsEditable != 0 &&
                extraFilterButton.pressedButton != 0) {
                DiskCacheRequest.field_E = extraFilterChoice;
              }
              if (extraFilterButton.hovered &&
                0 < extraFilterChoice) {
                if (DirectByteStorage.field_j != null) {
                  stackIn_153_0 = DirectByteStorage.field_j[extraFilterChoice - 1];
                } else {
                  stackIn_153_0 = null;
                }
                extraFilterTooltip = stackIn_153_0;
                if (extraFilterTooltip != null) {
                  DialogMessagePane.field_I = extraFilterTooltip;
                }
              }
              stackIn_158_0 = extraFilterButton;
              stackIn_159_1 = (extraFilterChoice == DiskCacheRequest.field_E);
              stackIn_158_0.selected = stackIn_159_1;
              stackIn_161_0 = extraFilterButton;
              stackIn_162_1 = (controlsEditable != 0);
              stackIn_161_0.inputEnabled = stackIn_162_1;
            }
          }
          optionFilterBitOffset = 0;
          if (obfuscationGuard != 1) {
            field_e = (String) null;
          }
          for (optionIndex = 0; tq.gameOptionCount > optionIndex; optionIndex++) {
            groupChoices = pu.field_k[optionIndex + 4];
            optionChoices = groupChoices;
            stackIn_170_0 = (filterMode) ? -1 : 0;
            for (choiceValue = stackIn_170_0; choiceValue < -1 + groupChoices.length; choiceValue++) {
              membersRequired = 0;
              thresholdTwoFailed = 0;
              thresholdOneFailed = 0;
              filterChoiceBlocked = 0;
              featureRequirementFailed = 0;
              featureRequirementValue = 0;
              if (controlsEditable != 0 &&
                choiceValue >= 0) {
                if (CombatPresentation.field_j != null &&
                  CombatPresentation.field_j[optionIndex] != null &&
                  (~BoundedFile.field_a & CombatPresentation.field_j[optionIndex][choiceValue]) > 0) {
                  featureRequirementFailed = 1;
                  featureRequirementValue = fd.a(true, CombatPresentation.field_j[optionIndex][choiceValue] & ~BoundedFile.field_a);
                }
                if (ep.field_p != null &&
                  null != ep.field_p[optionIndex] &&
                  LoginForm.memberEntitlementValue <= 0 &&
                  ep.field_p[optionIndex][choiceValue]) {
                  membersRequired = 1;
                }
                if (null != GameAppletShell.field_e &&
                  null != GameAppletShell.field_e[optionIndex]) {
                  thresholdOne = GameAppletShell.field_e[optionIndex][choiceValue];
                  if (0 != thresholdOne &&
                    !bj.field_k &&
                    LoginForm.memberEntitlementValue <= 0) {
                    membersRequired = 1;
                  }
                  if (0 < thresholdOne &&
                    GlobalSpell.field_g < thresholdOne) {
                    thresholdOneFailed = 1;
                  }
                }
                if (null != jv.field_d &&
                  jv.field_d[optionIndex] != null) {
                  thresholdTwo = jv.field_d[optionIndex][choiceValue];
                  if (0 < thresholdTwo &&
                    thresholdTwo > SummonAction.field_s) {
                    thresholdTwoFailed = 1;
                  }
                  if (thresholdTwo != 0 &&
                    !bj.field_k &&
                    LoginForm.memberEntitlementValue <= 0) {
                    membersRequired = 1;
                  }
                }
                if (filterMode) {
                  if (ke.field_b != null) {
                    if (null != ke.field_b[optionIndex]) {
                      stackIn_217_0 = (ke.field_b[optionIndex][choiceValue]) ? 1 : 0;
                    } else {
                      stackIn_217_0 = 0;
                    }
                  } else {
                    stackIn_217_0 = 0;
                  }
                } else {
                  stackIn_217_0 = 0;
                }
                filterChoiceBlocked = stackIn_217_0;
              }
              if (BufferedSocket.field_j >= 2 &&
                br.heldKeys[12]) {
                thresholdTwoFailed = 0;
                thresholdOneFailed = 0;
                membersRequired = 0;
                filterChoiceBlocked = 0;
                featureRequirementFailed = 0;
              }
              fc.field_a = true;
              if (membersRequired == 0 &&
                thresholdTwoFailed == 0 &&
                thresholdOneFailed == 0 &&
                filterChoiceBlocked == 0 &&
                featureRequirementFailed == 0) {
                stackIn_230_0 = 0;
              } else {
                stackIn_230_0 = 1;
              }
              choiceBlocked = stackIn_230_0;
              if (choiceBlocked == 0 &&
                0 <= choiceValue &&
                null != fs.field_d && (!filterMode ||
                !SpellCastAction.field_s)) {
                jp.field_a = false;
                fc.field_a = false;
                if (null == TeleportAction.field_B) {
                  TeleportAction.field_B = new byte[tq.gameOptionCount];
                  dt.field_d = new boolean[tq.gameOptionCount];
                }
                for (var17_int = 0; var17_int < optionIndex; var17_int++) {
                  dt.field_d[var17_int] = false;
                }
                ConsoleTokenCursor.a(0, optionIndex, room, -1, filterMode, choiceValue, (byte) 103, -1);
                if (BufferedSocket.field_j >= 2 &&
                  br.heldKeys[12]) {
                  fc.field_a = true;
                }
                if (!fc.field_a) {
                  choiceBlocked = 1;
                }
              }
              optionButton = optionChoices[choiceValue + 1];
              if (controlsEditable != 0 &&
                optionButton.pressedButton != 0) {
                if (!filterMode) {
                  if (choiceBlocked == 0 &&
                    room.gameOptions[optionIndex] != (byte)choiceValue) {
                    roomOptionsChanged = 1;
                    room.gameOptions[optionIndex] = (byte)choiceValue;
                  }
                } else {
                  if (choiceValue == -1) {
                    for (var18 = optionFilterBitOffset; var18 < groupChoices.length + optionFilterBitOffset - 1; var18++) {
                      ClientContextMenu.field_d[var18 / 8] = (byte)rn.bitwiseAnd((int) ClientContextMenu.field_d[var18 / 8], ~(1 << rn.bitwiseAnd(7, var18)));
                    }
                  } else {
                    ClientContextMenu.field_d[(optionFilterBitOffset + choiceValue) / 8] = (byte)GrowthEvent.bitwiseXor((int) ClientContextMenu.field_d[(optionFilterBitOffset + choiceValue) / 8], 1 << rn.bitwiseAnd(choiceValue + optionFilterBitOffset, 7));
                  }
                }
              }
              if (filterMode &&
                choiceBlocked != 0) {
                ClientContextMenu.field_d[(optionFilterBitOffset + choiceValue) / 8] = (byte)rn.bitwiseAnd((int) ClientContextMenu.field_d[(optionFilterBitOffset + choiceValue) / 8], ~(1 << rn.bitwiseAnd(choiceValue + optionFilterBitOffset, 7)));
              }
              if (choiceValue >= 0 &&
                optionButton.hovered) {
                if (VerticalScrollbar.field_Mb == null) {
                  choiceDescription = null;
                } else {
                  if (VerticalScrollbar.field_Mb[optionIndex] == null) {
                    choiceDescription = null;
                  } else {
                    choiceDescription = VerticalScrollbar.field_Mb[optionIndex][choiceValue];
                  }
                }
                if (wb.field_a == null) {
                  choiceHint = null;
                } else {
                  if (null == wb.field_a[optionIndex]) {
                    choiceHint = null;
                  } else {
                    choiceHint = wb.field_a[optionIndex][choiceValue];
                  }
                }
                tooltip = null;
                if (choiceHint != null &&
                  !((String) (choiceHint)).equals(choiceDescription)) {
                  tooltip = choiceHint;
                }
                restrictionMessage = null;
                if (filterChoiceBlocked != 0) {
                  restrictionMessage = TaggedMapData.field_h;
                  restrictionMessageReference = restrictionMessage;
                  var25 = restrictionMessageReference;
                  restrictionMessageReference = var25;
                  restrictionMessage = restrictionMessageReference;
                  var25 = restrictionMessage;
                  restrictionMessageReference = var25;
                  var25 = restrictionMessageReference;
                  restrictionMessageReference = var25;
                  restrictionMessage = restrictionMessageReference;
                  restrictionMessageReference = var25;
                } else {
                  if (membersRequired != 0) {
                    restrictionMessage = gt.field_a;
                  } else {
                    if (thresholdTwoFailed != 0) {
                      var22_int = jv.field_d[optionIndex][choiceValue] - SummonAction.field_s;
                      if (var22_int != 1) {
                        restrictionMessage = EmailCheckResult.a(4800, ByteStorage.field_a, new String[]{Integer.toString(var22_int)});
                      } else {
                        restrictionMessage = bt.field_a;
                      }
                    }
                    if (thresholdOneFailed != 0) {
                      featureMessage = EmailCheckResult.a(4800, AnimationSequence.field_k, new String[]{Integer.toString(GlobalSpell.field_g), Integer.toString(GameAppletShell.field_e[optionIndex][choiceValue])});
                      restrictionMessageReference = featureMessage;
                      var25 = restrictionMessageReference;
                      restrictionMessageReference = var25;
                      restrictionMessage = restrictionMessageReference;
                      restrictionName = featureMessage;
                      restrictionMessageReference = restrictionName;
                      if (restrictionMessage == null) {
                        restrictionMessage = featureMessage;
                      } else {
                        restrictionMessage = (String) (restrictionMessage) + "<br>" + featureMessage;
                      }
                    }
                    if (featureRequirementFailed != 0) {
                      restrictionMessageReference = ParasiteEvent.field_F;
                      if (featureRequirementValue > 0 &&
                        jl.field_c != null &&
                        featureRequirementValue <= jl.field_c.length &&
                        null != jl.field_c[featureRequirementValue - 1]) {
                        restrictionMessageReference = jl.field_c[featureRequirementValue - 1][0];
                      }
                      if (restrictionMessage != null) {
                        restrictionMessage = (String) (restrictionMessage) + "<br>" + (String) (restrictionMessageReference);
                      } else {
                        restrictionMessage = restrictionMessageReference;
                      }
                    }
                  }
                }
                if (controlsEditable != 0 &&
                  !fc.field_a) {
                  restrictionMessageReference = null;
                  if (jp.field_a) {
                    restrictionMessageReference = "</col>" + ep.field_h + "<col=A00000>";
                    var25Lifetime1 = restrictionMessageReference;
                    restrictionMessageReference = var25Lifetime1;
                    var25Lifetime1Lifetime1 = restrictionMessageReference;
                    restrictionMessageReference = var25Lifetime1Lifetime1;
                    restrictionMessage = restrictionMessageReference;
                  }
                  multipleRestrictionNames = 0;
                  for (restrictedOptionIndex = 0; restrictedOptionIndex < optionIndex; restrictedOptionIndex++) {
                    if (dt.field_d[restrictedOptionIndex]) {
                      taggedRestrictionName = "</col>" + GridWidgetContainer.field_M[restrictedOptionIndex] + "<col=A00000>";
                      restrictionMessageReference = taggedRestrictionName;
                      restrictionMessage = restrictionMessageReference;
                      restrictionMessageReference = taggedRestrictionName;
                      if (restrictionMessageReference != null) {
                        restrictionMessageReference = (String) (restrictionMessageReference) + ", " + taggedRestrictionName;
                        restrictionMessage = restrictionMessageReference;
                        restrictionMessage = restrictionMessageReference;
                        multipleRestrictionNames = 1;
                      } else {
                        restrictionMessageReference = taggedRestrictionName;
                      }
                    }
                  }
                  if (multipleRestrictionNames == 0) {
                    restrictionMessage = EmailCheckResult.a(4800, ab.field_e, new String[]{(String) (restrictionMessageReference)});
                  } else {
                    restrictionMessage = mj.field_a + (String) (restrictionMessageReference);
                  }
                }
                if (restrictionMessage != null) {
                  restrictionMessage = "<col=A00000>" + (String) (restrictionMessage);
                  formattedRestrictionMessage = dj.a(6609, (String) (restrictionMessage), "<br>", "<br><col=A00000>");
                  if (tooltip != null) {
                    tooltip = (String) (tooltip) + "<br>" + formattedRestrictionMessage;
                  } else {
                    tooltip = formattedRestrictionMessage;
                  }
                }
                if (tooltip != null) {
                  DialogMessagePane.field_I = (String) (tooltip);
                }
              }
              if (filterMode) {
                if (choiceValue == -1) {
                  optionButton.selected = true;
                  filterBitIndex = optionFilterBitOffset;
                  filterBitStart = filterBitIndex;
                  while (groupChoices.length + optionFilterBitOffset - 1 > filterBitIndex) {
                    stackIn_334_0 = optionButton;
                    stackIn_334_1 = optionButton.selected;
                    stackIn_335_2 = ((ClientContextMenu.field_d[filterBitIndex / 8] & 1 << (filterBitIndex & 7)) == 0);
                    stackIn_334_0.selected = stackIn_334_1 & stackIn_335_2;
                    filterBitIndex++;
                  }
                } else {
                  stackIn_337_0 = optionButton;
                  stackIn_337_1 = -1;
                  stackIn_337_2 = ClientContextMenu.field_d[(choiceValue + optionFilterBitOffset) / 8] & 1 << (choiceValue + optionFilterBitOffset & 7);
                  stackIn_337_3 = -1;
                  stackIn_340_1 = (stackIn_337_1 != (stackIn_337_2 ^ stackIn_337_3));
                  stackIn_337_0.selected = stackIn_340_1;
                }
              } else {
                stackIn_327_0 = optionButton;
                stackIn_328_1 = (fc.field_a) && ((byte)choiceValue == room.gameOptions[optionIndex]);
                stackIn_327_0.selected = stackIn_328_1;
              }
              stackIn_344_0 = optionButton;
              stackIn_345_1 = (controlsEditable != 0) && (choiceBlocked == 0);
              stackIn_344_0.inputEnabled = stackIn_345_1;
            }
            optionFilterBitOffset = optionFilterBitOffset + (255 & t.field_b[optionIndex]);
          }
          if (roomOptionsChanged != 0) {
            if (filterMode) {
              return;
            }
            AiUnitPlanner.b(5, optionsPacketOpcode);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_354_0 = var4;
          stackIn_354_1 = new StringBuilder().append("vf.N(").append(obfuscationGuard).append(',').append(filterMode).append(',').append(optionsPacketOpcode).append(',');
          if (room == null) {
            stackIn_355_2 = "null";
          } else {
            stackIn_355_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_354_0), ((StringBuilder) (Object) stackIn_354_1).append(stackIn_355_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_e = null;
        smokeSprites = null;
        field_l = null;
        if (param0 >= -70) {
          return;
        }
        field_h = null;
        field_c = null;
    }

    final void generateSamples(int height, int obfuscationGuard, int width) {
        int row = 0;
        int column = 0;
        int octave = 0;
        int sampleX12;
        int sampleY12;
        int periodX;
        int periodY;
        int latticeX0;
        int latticeX1;
        int latticeY0;
        int latticeY1;
        int fadeX12;
        int fadeY12;
        int nextOffsetX12;
        int nextOffsetY12;
        int permutationY0;
        int permutationY1;
        int topLeftGradient;
        int topRightGradient;
        int topInterpolation;
        int bottomInterpolation;
        int[] normalizedXCoordinates;
        int[] normalizedYCoordinates;
        int xCoordinateIndex;
        int obfuscationControl;
        int[] xCoordinatesReference;
        int[] yCoordinatesReference;
        int[] xCoordinates12;
        int[] yCoordinates12;
        int yCoordinateIndex;
        int frequency12;
        int bottomLeftGradient;
        int bottomRightGradient;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 1) {
          field_l = (String) null;
        }
        xCoordinates12 = new int[width];
        xCoordinatesReference = xCoordinates12;
        normalizedXCoordinates = xCoordinatesReference;
        for (xCoordinateIndex = 0; xCoordinateIndex < width; xCoordinateIndex++) {
          normalizedXCoordinates[xCoordinateIndex] = (xCoordinateIndex << 12) / width;
        }
        yCoordinates12 = new int[height];
        yCoordinatesReference = yCoordinates12;
        normalizedYCoordinates = yCoordinatesReference;
        for (yCoordinateIndex = 0; yCoordinateIndex < height; yCoordinateIndex++) {
          normalizedYCoordinates[yCoordinateIndex] = (yCoordinateIndex << 12) / height;
        }
        this.beginMap(obfuscationGuard ^ -30419);
        for (row = 0; row < height; row++) {
          for (column = 0; column < width; column++) {
            for (octave = 0; this.octaveCount > octave; octave++) {
              frequency12 = this.octaveFrequencies[octave] << 12;
              periodX = this.repeatX * frequency12 >> 12;
              sampleX12 = xCoordinates12[column] * frequency12 >> 12;
              periodY = frequency12 * this.repeatY >> 12;
              sampleY12 = yCoordinates12[row] * frequency12 >> 12;
              sampleY12 = sampleY12 * this.repeatY;
              sampleX12 = sampleX12 * this.repeatX;
              latticeX0 = sampleX12 >> 12;
              latticeX1 = latticeX0 + 1;
              latticeY0 = sampleY12 >> 12;
              latticeX0 = latticeX0 & 255;
              latticeY1 = latticeY0 + 1;
              sampleY12 = sampleY12 & 4095;
              if (latticeX1 < periodX) {
                latticeX1 = latticeX1 & 255;
              } else {
                latticeX1 = 0;
              }
              latticeY0 = latticeY0 & 255;
              sampleX12 = sampleX12 & 4095;
              if (periodY <= latticeY1) {
                latticeY1 = 0;
              } else {
                latticeY1 = latticeY1 & 255;
              }
              nextOffsetX12 = sampleX12 - 4096;
              fadeY12 = ListMissionsConsoleCommand.noiseFade12[sampleY12];
              permutationY1 = this.permutation[latticeY1];
              nextOffsetY12 = sampleY12 - 4096;
              permutationY0 = this.permutation[latticeY0];
              fadeX12 = ListMissionsConsoleCommand.noiseFade12[sampleX12];
              topLeftGradient = ValidatedTextWidget.diagonalNoiseGradient12(sampleX12, 3, (int) this.permutation[permutationY0 + latticeX0], sampleY12);
              topRightGradient = ValidatedTextWidget.diagonalNoiseGradient12(nextOffsetX12, 3, (int) this.permutation[latticeX1 + permutationY0], sampleY12);
              topInterpolation = (fadeX12 * (topRightGradient - topLeftGradient) >> 12) + topLeftGradient;
              bottomLeftGradient = ValidatedTextWidget.diagonalNoiseGradient12(sampleX12, 3, (int) this.permutation[permutationY1 + latticeX0], nextOffsetY12);
              bottomRightGradient = ValidatedTextWidget.diagonalNoiseGradient12(nextOffsetX12, 3, (int) this.permutation[permutationY1 + latticeX1], nextOffsetY12);
              bottomInterpolation = bottomLeftGradient + (fadeX12 * (-bottomLeftGradient + bottomRightGradient) >> 12);
              this.accumulateOctave(octave, (fadeY12 * (-topInterpolation + bottomInterpolation) >> 12) + topInterpolation, 19699);
            }
            this.emitPixel((byte) -127);
          }
        }
    }

    final static IndexedSprite shareSpriteWithPalette(int[] palette, int obfuscationGuard, IndexedSprite source) {
        IndexedSprite sharedSprite = null;
        RuntimeException var3_ref = null;
        IndexedSprite returnedSprite = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -13546) {
            field_l = (String) null;
          }
          sharedSprite = new IndexedSprite(0, 0, 0);
          sharedSprite.palette = palette;
          sharedSprite.offsetY = source.offsetY;
          sharedSprite.pixelWidth = source.pixelWidth;
          sharedSprite.pixelIndices = source.pixelIndices;
          sharedSprite.offsetX = source.offsetX;
          sharedSprite.canvasHeight = source.canvasHeight;
          sharedSprite.pixelHeight = source.pixelHeight;
          sharedSprite.canvasWidth = source.canvasWidth;
          returnedSprite = sharedSprite;
          return returnedSprite;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("vf.K(");
          if (palette == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(',');
          if (source == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    abstract void beginMap(int obfuscationGuard);

    abstract void emitPixel(byte obfuscationGuard);

    TileableNoiseGenerator(int seed, int octaveCount, int repeatX, int repeatY, int unusedArgument) {
        this.permutation = new short[512];
        this.repeatY = 4;
        this.repeatX = 4;
        this.octaveCount = 4;
        this.seed = 0;
        this.repeatX = repeatX;
        this.seed = seed;
        this.octaveCount = octaveCount;
        this.repeatY = repeatY;
        this.buildOctaveFrequencies(-125);
        this.buildPermutation(-256);
    }

    final static int hitTestPairedSprites(int pointerX, int obfuscationGuard, int pointerY) {
        if (obfuscationGuard != -1) {
          return -123;
        }
        if (rs.field_o == null) {
          return -1;
        }
        if (pointerX >= VertexNormal.field_c && VertexNormal.field_c + rs.field_o.pixelWidth > pointerX && pointerY >= ProgressMessageDialog.field_pb &&
          !(pointerY >= ProgressMessageDialog.field_pb + rs.field_o.pixelHeight)) {
          return 0;
        }
        if (pointerX >= BattlefieldTheme.field_h && BattlefieldTheme.field_h + rs.field_o.pixelWidth > pointerX && ug.field_a <= pointerY &&
          !(rs.field_o.pixelHeight + ug.field_a <= pointerY)) {
          return 1;
        }
        return -1;
    }

    private final void buildPermutation(int obfuscationGuard) {
        Random random;
        int initialIndex;
        int remaining;
        int selected;
        int selectedValue;
        int obfuscationControl;
        int shuffleIndex;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -256) {
          field_f = 9;
        }
        random = new Random((long)this.seed);
        for (initialIndex = 0; initialIndex < 255; initialIndex++) {
          this.permutation[initialIndex] = (short)initialIndex;
        }
        for (shuffleIndex = 0; shuffleIndex < 255; shuffleIndex++) {
          remaining = 255 - shuffleIndex;
          selected = AttackEvent.nextBoundedInt(false, remaining, random);
          selectedValue = this.permutation[selected];
          this.permutation[selected] = this.permutation[remaining];
          this.permutation[256 + remaining] = (short) selectedValue;
          this.permutation[remaining] = (short) selectedValue;
        }
    }

    static {
        field_h = "Toxins";
        field_e = "You have entered another game.";
        field_f = -1;
        field_c = "(1 player wants to join)";
        field_l = "Add <%0> to friend list";
    }
}
