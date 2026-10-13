/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResizableModalDialog extends ModalDialog {
    private int resizeStartWidth;
    static int[] unitAnimationGroups;
    private int resizeTick;
    private int resizeTargetWidth;
    static String field_Q;
    private int resizeTargetHeight;
    private int resizeDuration;
    private int resizeStartHeight;

    void drawDialogBackground(int x, int obfuscationGuard, int y) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        PacketBuffer var17;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        SoftwareRaster.a(6 + x, 35 + y, this.width - 12, this.height - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = y;
        while (var4 > var7) {
          if (var8 >= SoftwareRaster.clipTop &&
            var8 < SoftwareRaster.clipBottom) {
            var9 = var5 + var7 * (var6 - var5) / var4;
            var10 = 0;
            var11 = this.width;
            if (var7 <= 20) {
              while (20 >= var10) {
                var12 = (-var10 + 20) * (-var10 + 20) + (-var7 + 20) * (-var7 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  SoftwareRaster.pixels[var8 * SoftwareRaster.width - (-x - var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (20 - var7);
                if (462 >= var14) {
                  if (var14 < 420) {
                    var12Lifetime1 = 1 + var11;
                  } else {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    SoftwareRaster.pixels[var11 + x + SoftwareRaster.width * var8] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            SoftwareRaster.e(x + var10, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = y + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          SoftwareRaster.e(x, var8Lifetime1, 6, var9Lifetime1);
          SoftwareRaster.e(x - (-this.width + 6), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        gt.field_e.g(this.width + (x - 90), 10 + y);
        EquipmentBattleTutorial.a(t.field_d, x + 5, y + 35, this.width - 10, 8941);
        EquipmentBattleTutorial.a(ip.field_c, x, -22 + y + this.height, this.width, obfuscationGuard ^ 1851672364);
        var4Lifetime2 = this.height - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        if (obfuscationGuard != 1851680193) {
          var17 = (PacketBuffer) null;
          ResizableModalDialog.writeCompressedChatText(-110, (String) null, (PacketBuffer) null);
        }
        var7Lifetime2 = 0;
        var8Lifetime2 = y + 57;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          SoftwareRaster.e(x, var8Lifetime2, 6, var9Lifetime2);
          SoftwareRaster.e(x + this.width - 6, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    boolean advanceDialogAnimation(byte obfuscationGuard) {
        int width = 0;
        int height = 0;
        int nextTick = 0;
        int interpolationNumerator = 0;
        int interpolationDenominator = 0;
        if (0 >= this.resizeDuration) {
        } else {
          width = this.resizeTargetWidth;
          height = this.resizeTargetHeight;
          nextTick = this.resizeTick + 1;
          this.resizeTick = this.resizeTick + 1;
          if (nextTick >= this.resizeDuration) {
            this.resizeDuration = 0;
            this.resizeCompleted(obfuscationGuard - 22);
          } else {
            interpolationNumerator = this.resizeTick * (-this.resizeTick + 2 * this.resizeDuration);
            interpolationDenominator = this.resizeDuration * this.resizeDuration;
            height = interpolationNumerator * (-this.resizeStartHeight + this.resizeTargetHeight) / interpolationDenominator + this.resizeStartHeight;
            width = this.resizeStartWidth + interpolationNumerator * (this.resizeTargetWidth - this.resizeStartWidth) / interpolationDenominator;
          }
          this.setCenteredSize(width, (byte) 127, height);
        }
        if (obfuscationGuard != -1) {
          return true;
        }
        return super.advanceDialogAnimation((byte) -1);
    }

    final static int writeCompressedChatText(int obfuscationGuard, String text, PacketBuffer packet) {
        int startPosition = 0;
        RuntimeException var3 = null;
        byte[] encodedText = null;
        PacketBuffer var5 = null;
        CharSequence textCharacters = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 15901) {
            var5 = (PacketBuffer) null;
            ResizableModalDialog.writeCompressedChatText(-112, (String) null, (PacketBuffer) null);
          }
          startPosition = packet.position;
          textCharacters = (CharSequence) ((Object) text);
          encodedText = nr.encodeSingleByteText(textCharacters, false);
          packet.writeUnsignedSmart(true, encodedText.length);
          packet.position = packet.position + ds.chatHuffmanCodec.compress(0, encodedText, encodedText.length, packet.payload, packet.position, (byte) 28);
          stackIn_3_0 = packet.position - startPosition;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sf.GB(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (packet == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void resizeDialog(int duration, boolean obfuscationGuard, int height, int width) {
        if (duration <= 0) {
          this.setCenteredSize(width, (byte) 115, height);
          return;
        }
        this.resizeTick = 0;
        this.resizeTargetHeight = height;
        this.resizeDuration = duration;
        this.resizeStartHeight = this.height;
        this.resizeTargetWidth = width;
        this.resizeStartWidth = this.width;
        if (obfuscationGuard) {
          this.resizeDialog(-36, true, -43, -81);
        }
    }

    boolean snapDialogAnimation(int obfuscationGuard) {
        int var2 = 125 / ((obfuscationGuard + 1) / 44);
        this.finishResize(-87);
        return super.snapDialogAnimation(66);
    }

    public static void h(byte param0) {
        unitAnimationGroups = null;
        field_Q = null;
        if (param0 <= 21) {
          ResizableModalDialog.h((byte) -93);
        }
    }

    final static void insertLobbyPlayerSorted(byte obfuscationGuard, LobbyPlayer player) {
        int var2_int = 0;
        LobbyPlayer var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          player.unlink(-123);
          var2_int = -20 % ((obfuscationGuard + 16) / 62);
          var3 = (LobbyPlayer) (SummonAction.lobbyPlayerOrder.first((byte) 125));
          while (var3 != null) {
            if (var3.sortsBefore(9687, player)) {
              var3 = (LobbyPlayer) (SummonAction.lobbyPlayerOrder.next((byte) 123));
              continue;
            }
            break;
          }
          if (var3 == null) {
            SummonAction.lobbyPlayerOrder.addLast((byte) -119, (IntrusiveNode) (player));
          } else {
            stackIn_7_0 = -123;
            fj.$cfr$intArgs$a$f94c566f195c(stackIn_7_0, player, var3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("sf.KB(").append(obfuscationGuard).append(',');
          if (player == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void resizeCompleted(int obfuscationGuard) {
        int var2 = -52 % ((69 - obfuscationGuard) / 50);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        RgbSprite stackIn_43_0;
        int stackIn_43_1;
        int stackIn_43_2;
        int[][] stackIn_43_3;
        int stackIn_44_4;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7_int = 0;
        EventPresenter var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != 0) {
            field_Q = (String) null;
          }
          var6_int = ConsoleExpression.field_p[param4] + param4;
          if (cu.field_a) {
            var7_int = CipherPacketBuffer.currentBattlefield.getTileEffects(31, param0, param1, -1);
            var8 = vs.field_e[param4].terrainType;
            if (4 != var8 &&
              6 != var8 &&
              var8 != 2 &&
              (1 & var7_int) != 0) {
              StateChangeEvent.a(var6_int, param2 ^ -12933, param5, param3);
            }
            if (vs.field_e[param4].hasCorpse(-121)) {
              fe.a(wf.boneShadowSprites[var6_int % 4], param3 - 10, -25 + param5);
            }
            var9 = EditableTextWidget.field_Q[vs.field_e[param4].terrainType];
            if (var9 > -1) {
              if (2 == var9) {
                fe.a(oq.activeStructureShadows[17], -10 + param3, param5 - 25);
              } else {
                if (vs.field_e[param4].terrainType == 3) {
                  MidiPcmStream.a((byte) -124, param3 + 30, param4 + ConsoleExpression.field_p[param4], 32 + param5);
                } else {
                  if (var9 == 1) {
                    fe.a(oq.activeStructureShadows[8 + var6_int % 3], -10 + param3, param5 - 55);
                  } else {
                    if (var9 == 9) {
                      fe.a(oq.activeStructureShadows[14 + var6_int % 2], -10 + param3, param5 - 30);
                    } else {
                      if (8 != var9) {
                        if (var9 == 0) {
                          fe.a(oq.activeStructureShadows[var6_int % 8 + 0], param3 - 10, param5 - 35);
                        } else {
                          if (4 == var9) {
                            ab.a(35 + param5, ConsoleExpression.field_p[param4] + param4, param3 + 30, false);
                          }
                        }
                      } else {
                        fe.a(oq.activeStructureShadows[var6_int % 2 + 11], -10 + param3, param5 - 55);
                      }
                    }
                  }
                }
              }
            }
            rs.a(26449, param3, param4, param5);
          }
          var7 = (EventPresenter) (NetworkResourceRequest.field_C.eventPresenters.first((byte) 106));
          while (var7 != null) {
            if (var7.tileIndex == param4) {
              if (var7.presentationActive) {
                var7 = (EventPresenter) (NetworkResourceRequest.field_C.eventPresenters.next((byte) 123));
                continue;
              }
              if (null != var7.event.unit &&
                var7.event.unit.modelPreview != null &&
                !var7.fullCombatScene) {
                var8Lifetime1 = var7.event.unit.modelPreview.screenPosition[0];
                var9Lifetime1 = var7.event.unit.modelPreview.screenPosition[1];
                var10 = var7.event.unit.ownerPlayer;
                stackIn_43_0 = TeamRoster.playerRingSprite;
                stackIn_43_1 = -30 + var8Lifetime1;
                stackIn_43_2 = var9Lifetime1 - 15;
                stackIn_43_3 = op.field_c;
                if (!CipherPacketBuffer.currentBattlefield.teamGame) {
                  stackIn_44_4 = 0;
                } else {
                  stackIn_44_4 = 1;
                }
                ((RgbSprite) (Object) stackIn_43_0).b(stackIn_43_1, stackIn_43_2, stackIn_43_3[stackIn_44_4][var10]);
                ModalDialog.groundShadowSprite.b(var8Lifetime1 - 40, -20 + var9Lifetime1);
              }
            }
            var7 = (EventPresenter) (NetworkResourceRequest.field_C.eventPresenters.next((byte) 123));
          }
          if (vs.field_e[param4].occupant != null) {
            if (vs.field_e[param4].occupant.presentationOwnsModel) {
              return;
            }
            ModalDialog.groundShadowSprite.b(param3, param5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var6), "sf.JB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void finishResize(int obfuscationGuard) {
        if (0 >= this.resizeDuration) {
          return;
        }
        this.setCenteredSize(this.resizeTargetWidth, (byte) 113, this.resizeTargetHeight);
        this.resizeDuration = 0;
        int var2 = 40 % ((-25 - obfuscationGuard) / 57);
        this.resizeCompleted(-120);
    }

    ResizableModalDialog(ModalDialogHost host, int width, int height) {
        super(host, width, height);
        this.resizeTick = 0;
        this.resizeDuration = 0;
    }

    static {
        field_Q = "Disruptive behaviour";
        unitAnimationGroups = new int[]{22, 1, 0, 39, 28, 46, 9, 22, 22, 2, 22, 22, 22, 47, 5, 29, 22, 22, 6, 48, 44, 22, 22, 22, 4, 22, 10, 42, 15, 40, 17, 10, 22, 11, 11, 32, 22, 12, 16, 23, 14, 2, 3, 22, 22, 20, 10, 22, 22, 22, 22, 43, 18, 19, 34, 24, 31, 21, 35, 8, 37, 36, 38, 25, 10, 33, 30, 22, 22, 22, 7, 41, 45, 22, 28, 13, 49, 22, 22, 22, 22, 28, 50, 51, 52, 53, 54, 55, 56, 53};
    }
}
