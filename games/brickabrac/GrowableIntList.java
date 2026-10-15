/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntList {
    static int field_g;
    static String field_c;
    private boolean multiplyGrowth;
    static IndexedSprite[] field_i;
    static NineSliceFrame fullscreenDialogSelectedFrame;
    private int lastIndex;
    private int[] values;
    static MusicTrack completionMusicTrack;
    static QuickChatParameterType field_m;
    private int growthStep;
    static int cyclesDue;
    static String field_d;
    static RgbSprite field_e;
    static String field_n;

    public static void a(boolean param0) {
        completionMusicTrack = null;
        field_d = null;
        field_m = null;
        field_n = null;
        field_i = null;
        fullscreenDialogSelectedFrame = null;
        field_e = null;
        field_c = null;
        if (!param0) {
          PacketBuffer var2 = (PacketBuffer) null;
          GrowableIntList.writeServiceHeader(6, -63, 125, -38, (PacketBuffer) null);
          return;
        }
    }

    final static void writeChatMessage(int messageId, String recipientName, byte obfuscationGuard, int channel, int opcode, String text) {
        BitPacketBuffer packet = null;
        int bodyStart = 0;
        try {
          packet = TextFieldValidator.outgoingPackets;
          BitPacketBuffer packetAlias = packet;
          int guardDivision = -44 / ((-59 - obfuscationGuard) / 38);
          packet.writeCipheredOpcode(-13413, opcode);
          packet.position = packet.position + 1;
          bodyStart = packet.position;
          packet.writeByte(86, channel);
          if (channel == 2) {
            packet.writeCp1252String(recipientName, -1);
          }
          if (text != null) {
            InstructionsScreen.writeCompressedString(26152, text, packet);
          } else {
            packet.writeShort((byte) 123, messageId);
          }
          packet.backfillByteLength((byte) 116, packet.position - bodyStart);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "c.I(" + messageId + ',' + (recipientName != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + channel + ',' + opcode + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    final void removeAt(byte obfuscationGuard, int index) {
        if (index < 0) {
          throw new ArrayIndexOutOfBoundsException(index);
        }
        if (this.lastIndex < index) {
          throw new ArrayIndexOutOfBoundsException(index);
        }
        if (index != this.lastIndex) {
          ArrayOperations.copy(this.values, 1 + index, this.values, index, -index + this.lastIndex);
          this.lastIndex = this.lastIndex - 1;
          if (obfuscationGuard != 46) {
            field_c = (String) null;
            return;
          }
          return;
        }
        this.lastIndex = this.lastIndex - 1;
        if (obfuscationGuard != 46) {
          field_c = (String) null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, boolean param4, byte param5, boolean param6, boolean param7, boolean param8, int param9) {
        int var11;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (param3) {
          if (param3) {
            ValidationStatus.field_f = LobbyPlayer.field_Pb;
            MusicPatch.a(-128, param3);
            if (TextLineLayout.field_b > 0) {
              DateFieldsWidget.a(param8, param3, -94, param2);
            }
            AppletGameShell.field_e.horizontalAlignment = 1;
            AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
            if (0 < IntArrayRequest.field_j) {
              ConnectionPhase.updateOpponentSearchControls(param2, param8, param3, (byte) -76);
            }
            if (TableDataRequest.field_m > 0) {
              LobbyUiHelpers.updateLobbyControls(true, param3, param8, param2, param7);
            }
            if (MeshLobbyUiHelpers.joinRequestsPanelOpen &&
              ClientResourceHelpers.currentLobbyGame.maxPlayers <= ClientResourceHelpers.currentLobbyGame.playerCount) {
              IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
              Ball.field_A.enabled = false;
              UiGeometryHelpers.resetListVerticalBounds(true, IsaacGenerator.field_b.content);
            } else {
              IsaacGenerator.field_b.viewport.text = null;
              Ball.field_A.enabled = true;
              MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
            }
          } else {
            ValidationStatus.field_f = (LevelResultWireHelpers.field_a - 640) / 2;
            MusicPatch.a(-128, param3);
            if (TextLineLayout.field_b > 0) {
              DateFieldsWidget.a(param8, param3, -94, param2);
              AppletGameShell.field_e.horizontalAlignment = 1;
              AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
              if (0 < IntArrayRequest.field_j) {
                ConnectionPhase.updateOpponentSearchControls(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                LobbyUiHelpers.updateLobbyControls(true, param3, param8, param2, param7);
              }
              if (MeshLobbyUiHelpers.joinRequestsPanelOpen &&
                ClientResourceHelpers.currentLobbyGame.maxPlayers <= ClientResourceHelpers.currentLobbyGame.playerCount) {
                IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                Ball.field_A.enabled = false;
                UiGeometryHelpers.resetListVerticalBounds(true, IsaacGenerator.field_b.content);
              } else {
                IsaacGenerator.field_b.viewport.text = null;
                Ball.field_A.enabled = true;
                MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              }
            } else {
              AppletGameShell.field_e.horizontalAlignment = 1;
              AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
              if (0 < IntArrayRequest.field_j) {
                ConnectionPhase.updateOpponentSearchControls(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                LobbyUiHelpers.updateLobbyControls(true, param3, param8, param2, param7);
              }
              if (!MeshLobbyUiHelpers.joinRequestsPanelOpen) {
                IsaacGenerator.field_b.viewport.text = null;
                Ball.field_A.enabled = true;
                MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              } else {
                if (ClientResourceHelpers.currentLobbyGame.maxPlayers > ClientResourceHelpers.currentLobbyGame.playerCount) {
                  IsaacGenerator.field_b.viewport.text = null;
                  Ball.field_A.enabled = true;
                  MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                } else {
                  IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                  Ball.field_A.enabled = false;
                  UiGeometryHelpers.resetListVerticalBounds(true, IsaacGenerator.field_b.content);
                }
              }
            }
          }
        } else {
          if (Rasterizer2D.width == LevelResultWireHelpers.field_a) {
            if (Rasterizer2D.height != IsaacGenerator.field_i &&
              Rasterizer2D.height == BallPulseEffect.framebuffer.height &&
              Rasterizer2D.width == BallPulseEffect.framebuffer.width) {
              if (ClientResourceHelpers.currentLobbyGame != null) {
                CacheIoRequest.a(true, false);
              } else {
                if (null != IncomingPacketHelpers.pendingLobbyGame) {
                  CacheIoRequest.a(true, true);
                } else {
                  NanoGameClock.b(31);
                }
              }
            }
            if (param3) {
              ValidationStatus.field_f = LobbyPlayer.field_Pb;
              MusicPatch.a(-128, param3);
              if (TextLineLayout.field_b > 0) {
                DateFieldsWidget.a(param8, param3, -94, param2);
              }
              AppletGameShell.field_e.horizontalAlignment = 1;
              AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
              if (0 < IntArrayRequest.field_j) {
                ConnectionPhase.updateOpponentSearchControls(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                LobbyUiHelpers.updateLobbyControls(true, param3, param8, param2, param7);
              }
              if (MeshLobbyUiHelpers.joinRequestsPanelOpen &&
                ClientResourceHelpers.currentLobbyGame.maxPlayers <= ClientResourceHelpers.currentLobbyGame.playerCount) {
                IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                Ball.field_A.enabled = false;
                UiGeometryHelpers.resetListVerticalBounds(true, IsaacGenerator.field_b.content);
              } else {
                IsaacGenerator.field_b.viewport.text = null;
                Ball.field_A.enabled = true;
                MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              }
            } else {
              ValidationStatus.field_f = (LevelResultWireHelpers.field_a - 640) / 2;
              MusicPatch.a(-128, param3);
              if (TextLineLayout.field_b > 0) {
                DateFieldsWidget.a(param8, param3, -94, param2);
              }
              AppletGameShell.field_e.horizontalAlignment = 1;
              AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
              if (0 < IntArrayRequest.field_j) {
                ConnectionPhase.updateOpponentSearchControls(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                LobbyUiHelpers.updateLobbyControls(true, param3, param8, param2, param7);
              }
              if (!MeshLobbyUiHelpers.joinRequestsPanelOpen) {
                IsaacGenerator.field_b.viewport.text = null;
                Ball.field_A.enabled = true;
                MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              } else {
                if (ClientResourceHelpers.currentLobbyGame.maxPlayers > ClientResourceHelpers.currentLobbyGame.playerCount) {
                  IsaacGenerator.field_b.viewport.text = null;
                  Ball.field_A.enabled = true;
                  MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                } else {
                  IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                  Ball.field_A.enabled = false;
                  UiGeometryHelpers.resetListVerticalBounds(true, IsaacGenerator.field_b.content);
                }
              }
            }
          } else {
            if (Rasterizer2D.height == BallPulseEffect.framebuffer.height &&
              Rasterizer2D.width == BallPulseEffect.framebuffer.width) {
              if (ClientResourceHelpers.currentLobbyGame != null) {
                CacheIoRequest.a(true, false);
              } else {
                if (null != IncomingPacketHelpers.pendingLobbyGame) {
                  CacheIoRequest.a(true, true);
                } else {
                  NanoGameClock.b(31);
                }
              }
            }
            if (param3) {
              ValidationStatus.field_f = LobbyPlayer.field_Pb;
              MusicPatch.a(-128, param3);
              if (TextLineLayout.field_b > 0) {
                DateFieldsWidget.a(param8, param3, -94, param2);
              }
              AppletGameShell.field_e.horizontalAlignment = 1;
              AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
              if (0 < IntArrayRequest.field_j) {
                ConnectionPhase.updateOpponentSearchControls(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                LobbyUiHelpers.updateLobbyControls(true, param3, param8, param2, param7);
              }
              if (MeshLobbyUiHelpers.joinRequestsPanelOpen &&
                ClientResourceHelpers.currentLobbyGame.maxPlayers <= ClientResourceHelpers.currentLobbyGame.playerCount) {
                IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                Ball.field_A.enabled = false;
                UiGeometryHelpers.resetListVerticalBounds(true, IsaacGenerator.field_b.content);
              } else {
                IsaacGenerator.field_b.viewport.text = null;
                Ball.field_A.enabled = true;
                MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              }
            } else {
              ValidationStatus.field_f = (LevelResultWireHelpers.field_a - 640) / 2;
              MusicPatch.a(-128, param3);
              if (TextLineLayout.field_b > 0) {
                DateFieldsWidget.a(param8, param3, -94, param2);
                AppletGameShell.field_e.horizontalAlignment = 1;
                AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
                if (0 < IntArrayRequest.field_j) {
                  ConnectionPhase.updateOpponentSearchControls(param2, param8, param3, (byte) -76);
                }
                if (TableDataRequest.field_m > 0) {
                  LobbyUiHelpers.updateLobbyControls(true, param3, param8, param2, param7);
                }
                if (MeshLobbyUiHelpers.joinRequestsPanelOpen &&
                  ClientResourceHelpers.currentLobbyGame.maxPlayers <= ClientResourceHelpers.currentLobbyGame.playerCount) {
                  IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                  Ball.field_A.enabled = false;
                  UiGeometryHelpers.resetListVerticalBounds(true, IsaacGenerator.field_b.content);
                } else {
                  IsaacGenerator.field_b.viewport.text = null;
                  Ball.field_A.enabled = true;
                  MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                }
              } else {
                AppletGameShell.field_e.horizontalAlignment = 1;
                AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
                if (0 < IntArrayRequest.field_j) {
                  ConnectionPhase.updateOpponentSearchControls(param2, param8, param3, (byte) -76);
                }
                if (TableDataRequest.field_m > 0) {
                  LobbyUiHelpers.updateLobbyControls(true, param3, param8, param2, param7);
                }
                if (!MeshLobbyUiHelpers.joinRequestsPanelOpen) {
                  IsaacGenerator.field_b.viewport.text = null;
                  Ball.field_A.enabled = true;
                  MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                } else {
                  if (ClientResourceHelpers.currentLobbyGame.maxPlayers > ClientResourceHelpers.currentLobbyGame.playerCount) {
                    IsaacGenerator.field_b.viewport.text = null;
                    Ball.field_A.enabled = true;
                    MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                  } else {
                    IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                    Ball.field_A.enabled = false;
                    UiGeometryHelpers.resetListVerticalBounds(true, IsaacGenerator.field_b.content);
                  }
                }
              }
            }
          }
        }
        TextWidgetRenderer.a(param6, param9, param4, param0, param2, param1, (byte) -114);
        MusicVoice.a(param4, TimedSplashScreen.field_u, param2, param0, 121);
        if (param5 <= 6) {
          field_g = -90;
        }
        BirthDateValidator.field_h = BirthDateValidator.field_h + 1;
    }

    final static void writeServiceHeader(int headerWordOne, int serviceCode, int headerWordTwo, int headerByte, PacketBuffer packet) {
        try {
          packet.writeByte(33, serviceCode);
          packet.writeShort((byte) 115, 17);
          packet.writeShort((byte) 120, headerWordOne);
          packet.writeShort((byte) 107, headerWordTwo);
          packet.writeByte(5, headerByte);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "c.H(" + headerWordOne + ',' + serviceCode + ',' + headerWordTwo + ',' + headerByte + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    private final int capacityForIndex(int obfuscationGuard, int index) {
        int var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var3 = this.values.length;
        if (obfuscationGuard != 1) {
          return -35;
        }
        while (index >= var3) {
          if (!this.multiplyGrowth) {
            var3 = var3 + this.growthStep;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.growthStep;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    private final void growForIndex(int index, int obfuscationGuard) {
        int[] var4 = new int[this.capacityForIndex(1, index)];
        int[] var3 = var4;
        ArrayOperations.copy(this.values, 0, var4, 0, this.values.length);
        this.values = var4;
        if (obfuscationGuard != -7877) {
          this.values = (int[]) null;
          return;
        }
    }

    private GrowableIntList() throws Throwable {
        throw new Error();
    }

    private final void setAt(int value, int obfuscationGuard, int index) {
        if (this.lastIndex < index) {
          this.lastIndex = index;
        }
        if (obfuscationGuard != 0) {
          field_g = 55;
          if (index >= this.values.length) {
            this.growForIndex(index, -7877);
            this.values[index] = value;
            return;
          }
          this.values[index] = value;
          return;
        }
        if (index < this.values.length) {
          this.values[index] = value;
          return;
        }
        this.growForIndex(index, -7877);
        this.values[index] = value;
    }

    final void append(boolean obfuscationGuard, int value) {
        if (!obfuscationGuard) {
          this.setAt(value, 0, 1 + this.lastIndex);
          return;
        }
        this.growForIndex(-78, -117);
        this.setAt(value, 0, 1 + this.lastIndex);
    }

    final int size(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          return -51;
        }
        return 1 + this.lastIndex;
    }

    final int get(int index, byte obfuscationGuard) {
        if (this.lastIndex < index) {
          throw new ArrayIndexOutOfBoundsException(index);
        }
        if (obfuscationGuard == 64) {
          return this.values[index];
        }
        field_c = (String) null;
        return this.values[index];
    }

    static {
        field_g = 250;
        field_d = "Create";
        field_c = "Accept";
        field_n = "Real-life threats";
        field_m = new QuickChatParameterType(7, 0, 1, 1);
    }
}
