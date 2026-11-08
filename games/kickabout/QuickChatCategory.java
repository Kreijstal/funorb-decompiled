/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategory extends DualLinkNode {
    int[] phraseIds;
    boolean tagFourEnabled;
    String description;
    int[] subcategoryIds;
    char[] phraseShortcuts;
    static boolean field_s;
    char[] subcategoryShortcuts;

    private final void decodeOpcode(int param0, boolean param1, PacketBuffer param2) {
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          if (param0 == 1) {
            this.description = param2.readString(-118);
          } else {
            if (param0 == 2) {
              var4_int = param2.readUnsignedByte((byte) -105);
              this.subcategoryIds = new int[var4_int];
              this.subcategoryShortcuts = new char[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.subcategoryIds[var5] = param2.readUnsignedShort((byte) 81);
                var6 = param2.readByte((byte) -65);
                stackIn_16_0 = this.subcategoryShortcuts;
                stackIn_16_1 = var5;
                if (var6 != 0) {
                  stackIn_17_2 = FootballerAgent.decodeCp1252Byte(false, (byte) var6);
                } else {
                  stackIn_17_2 = 0;
                }
                stackIn_16_0[stackIn_16_1] = (char) stackIn_17_2;
              }
            } else {
              if (3 == param0) {
                var4_int = param2.readUnsignedByte((byte) -109);
                this.phraseIds = new int[var4_int];
                this.phraseShortcuts = new char[var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  this.phraseIds[var5] = param2.readUnsignedShort((byte) 81);
                  var6 = param2.readByte((byte) -81);
                  stackIn_10_0 = this.phraseShortcuts;
                  stackIn_10_1 = var5;
                  if (0 != var6) {
                    stackIn_11_2 = FootballerAgent.decodeCp1252Byte(false, (byte) var6);
                  } else {
                    stackIn_11_2 = 0;
                  }
                  stackIn_10_0[stackIn_10_1] = (char) stackIn_11_2;
                }
              } else {
                if (param0 == 4) {
                  this.tagFourEnabled = true;
                }
              }
            }
          }
          if (param1) {
            QuickChatCategory.a(true, 105, -26, -11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("tc.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int stackIn_19_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_1 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime1Lifetime1;
        var3 = Kickabout.field_G;
        if (param1 != 5464) {
          field_s = false;
          if (GoalStateAgent.field_l != param0) {
            if (param0 > GoalStateAgent.field_l) {
              var2 = (param0 - GoalStateAgent.field_l) / 10;
              stackIn_23_0 = GoalStateAgent.field_l;
              if (1 < var2) {
                stackIn_24_1 = var2;
              } else {
                stackIn_24_1 = 1;
              }
              GoalStateAgent.field_l = stackIn_23_0 + stackIn_24_1;
            } else {
              var2 = (param0 - GoalStateAgent.field_l) / 10;
              stackIn_19_0 = GoalStateAgent.field_l;
              if (var2 >= -1) {
                stackIn_20_1 = -1;
              } else {
                stackIn_20_1 = var2;
              }
              GoalStateAgent.field_l = stackIn_19_0 + stackIn_20_1;
            }
          }
          if (RankingRowNode.field_Db + PortraitCacheOrder.field_d != param0) {
            PortraitCacheOrder.field_d = -RankingRowNode.field_Db + param0;
          }
          if (PortraitCacheOrder.field_d == 0) {
            if (CachedArchiveSource.field_s > 1) {
              CachedArchiveSource.field_s = CachedArchiveSource.field_s - 1;
            }
          } else {
            if (CachedArchiveSource.field_s < 18) {
              CachedArchiveSource.field_s = CachedArchiveSource.field_s + 1;
            }
          }
          if (ArrayWidgetContainer.field_x > TextLayoutLine.field_e &&
            LoginDialog.field_cb.field_q + TextLayoutLine.field_e > ArrayWidgetContainer.field_x &&
            ArchiveNetworkClient.field_i < TutorialCaptionSupport.field_j &&
            AccountChoicePanel.field_C.field_w * CachedArchiveSource.field_s + (ArchiveNetworkClient.field_i + LoginDialog.field_cb.field_w + MarkerSliderPainter.field_i.field_w) > TutorialCaptionSupport.field_j) {
            GameQuickChatResolver.showCurrencyTooltip(PortraitCacheOrder.field_d, RankingRowNode.field_Db, (byte) -113);
          }
          return;
        }
        if (GoalStateAgent.field_l != param0) {
          if (param0 <= GoalStateAgent.field_l) {
            var2Lifetime1 = (param0 - GoalStateAgent.field_l) / 10;
            stackIn_54_0 = GoalStateAgent.field_l;
            if (var2Lifetime1 >= -1) {
              stackIn_55_1 = -1;
            } else {
              stackIn_55_1 = var2Lifetime1;
            }
            GoalStateAgent.field_l = stackIn_54_0 + stackIn_55_1;
            if (RankingRowNode.field_Db + PortraitCacheOrder.field_d != param0) {
              PortraitCacheOrder.field_d = -RankingRowNode.field_Db + param0;
            }
            if (PortraitCacheOrder.field_d == 0) {
              if (CachedArchiveSource.field_s > 1) {
                CachedArchiveSource.field_s = CachedArchiveSource.field_s - 1;
              }
            } else {
              if (CachedArchiveSource.field_s < 18) {
                CachedArchiveSource.field_s = CachedArchiveSource.field_s + 1;
              }
            }
            if (ArrayWidgetContainer.field_x > TextLayoutLine.field_e &&
              LoginDialog.field_cb.field_q + TextLayoutLine.field_e > ArrayWidgetContainer.field_x &&
              ArchiveNetworkClient.field_i < TutorialCaptionSupport.field_j &&
              AccountChoicePanel.field_C.field_w * CachedArchiveSource.field_s + (ArchiveNetworkClient.field_i + LoginDialog.field_cb.field_w + MarkerSliderPainter.field_i.field_w) > TutorialCaptionSupport.field_j) {
              GameQuickChatResolver.showCurrencyTooltip(PortraitCacheOrder.field_d, RankingRowNode.field_Db, (byte) -113);
            }
            return;
          }
          var2Lifetime1Lifetime1 = (param0 - GoalStateAgent.field_l) / 10;
          stackIn_71_0 = GoalStateAgent.field_l;
          if (1 < var2Lifetime1Lifetime1) {
            stackIn_72_1 = var2Lifetime1Lifetime1;
          } else {
            stackIn_72_1 = 1;
          }
          GoalStateAgent.field_l = stackIn_71_0 + stackIn_72_1;
        }
        if (RankingRowNode.field_Db + PortraitCacheOrder.field_d == param0) {
          if (PortraitCacheOrder.field_d == 0) {
            if (CachedArchiveSource.field_s > 1) {
              CachedArchiveSource.field_s = CachedArchiveSource.field_s - 1;
            }
          } else {
            if (CachedArchiveSource.field_s < 18) {
              CachedArchiveSource.field_s = CachedArchiveSource.field_s + 1;
            }
          }
          if (ArrayWidgetContainer.field_x > TextLayoutLine.field_e &&
            LoginDialog.field_cb.field_q + TextLayoutLine.field_e > ArrayWidgetContainer.field_x &&
            ArchiveNetworkClient.field_i < TutorialCaptionSupport.field_j &&
            AccountChoicePanel.field_C.field_w * CachedArchiveSource.field_s + (ArchiveNetworkClient.field_i + LoginDialog.field_cb.field_w + MarkerSliderPainter.field_i.field_w) > TutorialCaptionSupport.field_j) {
            GameQuickChatResolver.showCurrencyTooltip(PortraitCacheOrder.field_d, RankingRowNode.field_Db, (byte) -113);
            return;
          }
          return;
        }
        PortraitCacheOrder.field_d = -RankingRowNode.field_Db + param0;
        if (PortraitCacheOrder.field_d == 0) {
          if (CachedArchiveSource.field_s > 1) {
            CachedArchiveSource.field_s = CachedArchiveSource.field_s - 1;
            if (ArrayWidgetContainer.field_x > TextLayoutLine.field_e &&
              LoginDialog.field_cb.field_q + TextLayoutLine.field_e > ArrayWidgetContainer.field_x &&
              ArchiveNetworkClient.field_i < TutorialCaptionSupport.field_j &&
              AccountChoicePanel.field_C.field_w * CachedArchiveSource.field_s + (ArchiveNetworkClient.field_i + LoginDialog.field_cb.field_w + MarkerSliderPainter.field_i.field_w) > TutorialCaptionSupport.field_j) {
              GameQuickChatResolver.showCurrencyTooltip(PortraitCacheOrder.field_d, RankingRowNode.field_Db, (byte) -113);
            }
            return;
          }
        } else {
          if (CachedArchiveSource.field_s < 18) {
            CachedArchiveSource.field_s = CachedArchiveSource.field_s + 1;
            if (ArrayWidgetContainer.field_x > TextLayoutLine.field_e &&
              LoginDialog.field_cb.field_q + TextLayoutLine.field_e > ArrayWidgetContainer.field_x &&
              ArchiveNetworkClient.field_i < TutorialCaptionSupport.field_j &&
              AccountChoicePanel.field_C.field_w * CachedArchiveSource.field_s + (ArchiveNetworkClient.field_i + LoginDialog.field_cb.field_w + MarkerSliderPainter.field_i.field_w) > TutorialCaptionSupport.field_j) {
              GameQuickChatResolver.showCurrencyTooltip(PortraitCacheOrder.field_d, RankingRowNode.field_Db, (byte) -113);
            }
            return;
          }
        }
        if (ArrayWidgetContainer.field_x <= TextLayoutLine.field_e) {
          return;
        }
        if (LoginDialog.field_cb.field_q + TextLayoutLine.field_e <= ArrayWidgetContainer.field_x) {
          return;
        }
        if (ArchiveNetworkClient.field_i < TutorialCaptionSupport.field_j &&
          AccountChoicePanel.field_C.field_w * CachedArchiveSource.field_s + (ArchiveNetworkClient.field_i + LoginDialog.field_cb.field_w + MarkerSliderPainter.field_i.field_w) > TutorialCaptionSupport.field_j) {
          GameQuickChatResolver.showCurrencyTooltip(PortraitCacheOrder.field_d, RankingRowNode.field_Db, (byte) -113);
          return;
        }
    }

    final static boolean advanceToPoint(int param0, byte param1, int param2, FootballerAgent param3, int param4) {
        FootballerAgent stackIn_23_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_32_1 = 0;
        int stackIn_33_2 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if ((param3.directionMask & 8) != 0 &&
            param2 < param3.positionX) {
            param3.positionX = param2;
          }
          if ((4 & param3.directionMask) != 0 &&
            param3.positionY < param4) {
            param3.positionY = param4;
          }
          if ((2 & param3.directionMask) != 0 &&
            param2 > param3.positionX) {
            param3.positionX = param2;
          }
          if ((param3.directionMask & 1) != 0 &&
            param3.positionY > param4) {
            param3.positionY = param4;
          }
          if (param1 <= 80) {
            return true;
          }
          if (param2 == param3.positionX &&
            param3.positionY == param4) {
            param3.directionMask = 0;
            param3.setDirectionFromMask(param0, 26214);
            return true;
          }
          stackIn_23_0 = (FootballerAgent) (param3);
          if (param4 > param3.positionY) {
            stackIn_24_1 = 1;
          } else {
            stackIn_24_1 = 0;
          }
          if (param3.positionX >= param2) {
            stackIn_27_2 = 0;
          } else {
            stackIn_27_2 = 8;
          }
          if (param3.positionX <= param2) {
            stackIn_30_3 = 0;
          } else {
            stackIn_30_3 = 2;
          }
          stackIn_32_1 = stackIn_24_1 | (stackIn_27_2 | stackIn_30_3);
          if (param3.positionY > param4) {
            stackIn_33_2 = 4;
          } else {
            stackIn_33_2 = 0;
          }
          stackIn_23_0.directionMask = stackIn_32_1 | stackIn_33_2;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_37_0 = var5;
          stackIn_37_1 = new StringBuilder().append("tc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
          param3 = 0;
        }
        ThreeCommand.a(ValidationState.field_c[param2][param3][2], -88, ValidationState.field_c[param2][param3][5], ValidationState.field_c[param2][param3][4], ValidationState.field_c[param2][param3][1], ValidationState.field_c[param2][param3][0], ValidationState.field_c[param2][param3][3]);
        RegistrationRequestState.configureGameReverb(ValidationState.field_c[param2][param3][4], ValidationState.field_c[param2][param3][5], ValidationState.field_c[param2][param3][3], ValidationState.field_c[param2][param3][0], ValidationState.field_c[param2][param3][2], (byte) -113, ValidationState.field_c[param2][param3][1]);
        if (param1 != 8710) {
          FootballerAgent var5 = (FootballerAgent) null;
          QuickChatCategory.advanceToPoint(117, (byte) -18, -15, (FootballerAgent) null, 51);
          return;
        }
    }

    final void markGlobalIds(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var2Lifetime2;
        int var4Lifetime1;
        var3 = Kickabout.field_G;
        if (null == this.phraseIds) {
          if (param0 >= -81) {
            return;
          }
          if (null == this.subcategoryIds) {
            return;
          }
          var4 = 0;
          var2 = var4;
          while (var4 < this.subcategoryIds.length) {
            this.subcategoryIds[var4] = PainterStyle.bitwiseOr(this.subcategoryIds[var4], 32768);
            var4++;
          }
          return;
        }
        for (var2Lifetime1 = 0; this.phraseIds.length > var2Lifetime1; var2Lifetime1++) {
          this.phraseIds[var2Lifetime1] = PainterStyle.bitwiseOr(this.phraseIds[var2Lifetime1], 32768);
        }
        if (param0 >= -81) {
          return;
        }
        if (null == this.subcategoryIds) {
          return;
        }
        var4Lifetime1 = 0;
        var2Lifetime2 = var4Lifetime1;
        while (var4Lifetime1 < this.subcategoryIds.length) {
          this.subcategoryIds[var4Lifetime1] = PainterStyle.bitwiseOr(this.subcategoryIds[var4Lifetime1], 32768);
          var4Lifetime1++;
        }
        return;
    }

    final void decode(PacketBuffer param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          while (true) {
            var3_int = param0.readUnsignedByte((byte) -125);
            if (var3_int != 0) {
              this.decodeOpcode(var3_int, false, param0);
              continue;
            }
            break;
          }
          if (param1 != 0) {
            this.description = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tc.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    QuickChatCategory() {
        this.tagFourEnabled = false;
    }

    static {
        field_s = false;
    }
}
