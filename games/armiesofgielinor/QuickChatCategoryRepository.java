/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryRepository {
    static String field_a;
    private WeightedLruCache categories;
    static NodeDeque soundHandles;
    static boolean field_f;
    private ResourceArchive globalArchive;
    private ResourceArchive localArchive;
    static String field_g;
    static boolean field_b;

    final static void a(boolean param0, int param1) {
        tq.a(param0, true, param1 ^ -81);
        if (param1 != -5) {
          field_g = (String) null;
        }
    }

    final static String b(int param0) {
        if (param0 != 2) {
          field_f = false;
        }
        if (BoundedFile.field_b) {
          return null;
        }
        if (ev.field_a < NodeIterator.field_c) {
          return null;
        }
        if (!(ps.field_E + NodeIterator.field_c <= ev.field_a)) {
          return TextLineLayout.field_a;
        }
        return null;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        dj.a(param0, 0, "");
        if (!param1) {
          return;
        }
        try {
          t.a((byte) -118, param0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "bl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        int var1 = 69 / ((-73 - param0) / 51);
        field_a = null;
        soundHandles = null;
    }

    final static void processLobbyUpdate(byte obfuscationGuard) {
        int stackIn_10_0 = 0;
        LobbyPlayer stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        LobbyPlayer stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        LobbyPlayer var3_ref_of = null;
        int var4 = 0;
        LobbyRoom var4_ref_au = null;
        int var5 = 0;
        LobbyRoom var6 = null;
        LobbyPlayer var7 = null;
        int var8 = 0;
        LobbyPlayer var8_ref_of = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LobbyRoom var12 = null;
        LobbyPlayer var13 = null;
        LobbyPlayer var14 = null;
        LobbyRoom var15 = null;
        Object var16 = null;
        Object var17 = null;
        LobbyRoom var17_ref = null;
        Object var18 = null;
        String var19 = null;
        LobbyPlayer var20 = null;
        String var21 = null;
        String var22 = null;
        LobbyPlayer var23 = null;
        Object var24 = null;
        LobbyPlayer var25 = null;
        LobbyPlayer var26 = null;
        String var27 = null;
        String var28 = null;
        LobbyPlayer var29 = null;
        LobbyRoom var30 = null;
        LobbyPlayer var31 = null;
        LobbyRoom var32 = null;
        LobbyRoom var33 = null;
        var16 = null;
        var24 = null;
        var17 = null;
        var18 = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          regionExit1: {
            var1 = ByteStorage.incomingPacket;
            var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
            if (var2 != 0 &&
              var2 != 1 &&
              var2 != 2 &&
              var2 != 3 &&
              var2 != 4) {
              if (var2 == 5) {
                var3_long = ((PacketBuffer) ((Object) var1)).readLong((byte) -2);
                var22 = ((PacketBuffer) ((Object) var1)).readNullTerminatedString(1);
                var19 = ((PacketBuffer) ((Object) var1)).readNullTerminatedString(1);
                var21 = ((PacketBuffer) ((Object) var1)).readNullTerminatedString(1);
                var20 = DeployEvent.getLobbyPlayer((byte) 121, var3_long);
                var8_ref_of = var20;
                stackIn_10_0 = (var19.equals("")) ? 0 : 1;
                var9 = stackIn_10_0;
                if (var20 == null) {
                  var8_ref_of = new LobbyPlayer(var22, var21, var3_long);
                  oi.lobbyPlayersById.put(-1, var3_long, var8_ref_of);
                } else {
                  if (var9 != 0) {
                    var20.setNames((byte) 53, var21, var22);
                  }
                }
                var8_ref_of.lastActivityMillis = vi.monotonicMillis(82) - (long)((PacketBuffer) ((Object) var1)).readInt(1);
                var8_ref_of.rating = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                var10 = ((PacketBuffer) ((Object) var1)).readVarInt(-27);
                stackIn_16_0 = var8_ref_of;
                stackIn_17_1 = ((1 & var10) != 0);
                stackIn_16_0.packedFlag0 = stackIn_17_1;
                var8_ref_of.ratedGamesPlayed = var10 >> 1;
                var8_ref_of.chatIconId = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                var8_ref_of.optionUnlockMask = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                ResizableModalDialog.insertLobbyPlayerSorted((byte) -115, var8_ref_of);
                break regionExit1;
              }
              if (var2 == 6) {
                var3_long = ((PacketBuffer) ((Object) var1)).readLong((byte) -2);
                var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                var23 = DeployEvent.getLobbyPlayer((byte) 121, var3_long);
                if ((var23 != null)) {
                  if (var23.joinRequested) {
                    AnimationPlayer.pendingJoinRequestCount = AnimationPlayer.pendingJoinRequestCount - 1;
                    var23.joinRequested = false;
                  }
                  if (var5 == 0) {
                    var23.unlink(126);
                  } else {
                    var23.notificationTicks = RegistrationAgreementPane.lobbyNotificationDuration;
                    var23.notificationCode = var5;
                  }
                  var23.unlinkSecondary((byte) -76);
                }
              } else {
                if (var2 == 7) {
                  var31 = (LobbyPlayer) (SummonAction.lobbyPlayerOrder.first((byte) 106));
                  while (var31 != null) {
                    var31.unlink(122);
                    var31.unlinkSecondary((byte) -76);
                    var31 = (LobbyPlayer) (SummonAction.lobbyPlayerOrder.next((byte) 123));
                  }
                  AnimationPlayer.pendingJoinRequestCount = 0;
                } else {
                  if (8 == var2) {
                    var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                    var4_ref_au = (LobbyRoom) (ClippedWidgetContainer.lobbyRoomsById.get((byte) -27, (long)var3));
                    if (var4_ref_au == null) {
                      var4_ref_au = new LobbyRoom(tq.gameOptionCount);
                      ClippedWidgetContainer.lobbyRoomsById.put(-1, (long)var3, var4_ref_au);
                    }
                    TrianglePulse.decodeLobbyRoom(var4_ref_au, true, var1, 78);
                    QuickChatPhraseRepository.insertLobbyRoomSorted(-107, var4_ref_au);
                  } else {
                    if (var2 == 9) {
                      var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                      var4 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                      var32 = (LobbyRoom) (ClippedWidgetContainer.lobbyRoomsById.get((byte) -27, (long)var3));
                      if ((var32 != null)) {
                        if (var4 != 0) {
                          var32.notificationTicks = RegistrationAgreementPane.lobbyNotificationDuration;
                          var32.notificationCode = var4;
                        } else {
                          var32.unlink(118);
                        }
                        var32.unlinkSecondary((byte) -76);
                      }
                    } else {
                      if (var2 == 10) {
                        var33 = (LobbyRoom) (qc.lobbyRoomOrder.first((byte) 105));
                        while (var33 != null) {
                          var33.unlink(-112);
                          var33.unlinkSecondary((byte) -76);
                          var33 = (LobbyRoom) (qc.lobbyRoomOrder.next((byte) 123));
                        }
                      } else {
                        if (var2 != 11 &&
                          var2 != 12) {
                          if (var2 == 13) {
                            var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                            var4 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                            var17_ref = (LobbyRoom) (ClippedWidgetContainer.lobbyRoomsById.get((byte) -27, (long)var3));
                            if ((var17_ref != null)) {
                              var17_ref.joinRequestSent = false;
                              var12 = var17_ref;
                              var6 = var12;
                              var12.invitationReceived = false;
                              if (var4 != 0) {
                                var17_ref.notificationCode = var4;
                                var17_ref.notificationTicks = RegistrationAgreementPane.lobbyNotificationDuration;
                              }
                              QuickChatPhraseRepository.insertLobbyRoomSorted(-127, var17_ref);
                            }
                          } else {
                            if (14 != var2 &&
                              var2 != 16) {
                              if (var2 != 15 &&
                                var2 != 17) {
                                switch (var2) {
                                  case 18:
                                    var3_long = ((PacketBuffer) ((Object) var1)).readLong((byte) -2);
                                    var27 = ((PacketBuffer) ((Object) var1)).readNullTerminatedString(1);
                                    var28 = ((PacketBuffer) ((Object) var1)).readNullTerminatedString(1);
                                    var7 = UnitModelPreview.getCurrentRoomPlayer(var3_long, -79);
                                    if (var7 == null) {
                                      var7 = new LobbyPlayer(var27, var28, var3_long);
                                      UnitCycler.currentRoomPlayersById.put(-1, var3_long, var7);
                                      ToggleWidget.currentRoom.playerCount = ToggleWidget.currentRoom.playerCount + 1;
                                    }
                                    var7.rating = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                                    var8 = ((PacketBuffer) ((Object) var1)).readVarInt(120);
                                    var7.ratedGamesPlayed = var8 >> 1;
                                    stackIn_80_0 = var7;
                                    stackIn_81_1 = ((var8 & 1) != 0);
                                    stackIn_80_0.packedFlag0 = stackIn_81_1;
                                    var7.chatIconId = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                                    var7.optionUnlockMask = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                                    ModalDialog.currentRoomPlayers.addLast((byte) -119, (IntrusiveNode) (var7));
                                    break regionExit1;
                                  case 19:
                                    var3_long = ((PacketBuffer) ((Object) var1)).readLong((byte) -2);
                                    var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                                    var14 = UnitModelPreview.getCurrentRoomPlayer(var3_long, -111);
                                    var29 = var14;
                                    if (var14 == null) {
                                      break regionExit1;
                                    }
                                    if (0 == var5) {
                                      var29.unlink(68);
                                    } else {
                                      var14.notificationTicks = RegistrationAgreementPane.lobbyNotificationDuration;
                                      var14.notificationCode = var5;
                                    }
                                    var29.unlinkSecondary((byte) -76);
                                    ToggleWidget.currentRoom.playerCount = ToggleWidget.currentRoom.playerCount - 1;
                                    break regionExit1;
                                  case 20:
                                    TrianglePulse.decodeLobbyRoom(ToggleWidget.currentRoom, false, var1, 83);
                                    break regionExit1;
                                  case 21:
                                    var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                                    if (var3 == 0) {
                                      ph.field_d = 0L;
                                      break regionExit1;
                                    }
                                    ph.field_d = vi.monotonicMillis(-59) + (long)var3;
                                    break regionExit1;
                                  case 22:
                                    GlobalSpell.field_g = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                                    SummonAction.field_s = ((PacketBuffer) ((Object) var1)).readVarInt(95);
                                    break regionExit1;
                                  case 23:
                                    ChannelBaseVolumeConsoleCommand.localAccountId = ((PacketBuffer) ((Object) var1)).readLong((byte) -2);
                                    break regionExit1;
                                  default:
                                    af.a((Throwable) null, 118, "L1: " + CampaignProgress.b(false));
                                    dj.a((byte) -124);
                                    break regionExit1;
                                }
                              }
                              var3_long = ((PacketBuffer) ((Object) var1)).readLong((byte) -2);
                              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                              var13 = DeployEvent.getLobbyPlayer((byte) 121, var3_long);
                              var26 = var13;
                              if ((var13 != null)) {
                                if (var5 != 0) {
                                  var13.notificationTicks = RegistrationAgreementPane.lobbyNotificationDuration;
                                  var13.notificationCode = var5;
                                }
                                if (var2 != 15) {
                                  if (var26.joinRequested) {
                                    var26.joinRequested = false;
                                    AnimationPlayer.pendingJoinRequestCount = AnimationPlayer.pendingJoinRequestCount - 1;
                                  }
                                } else {
                                  var13.invitationSent = false;
                                }
                                ResizableModalDialog.insertLobbyPlayerSorted((byte) 107, var26);
                              }
                            } else {
                              var3_long = ((PacketBuffer) ((Object) var1)).readLong((byte) -2);
                              var25 = DeployEvent.getLobbyPlayer((byte) 121, var3_long);
                              if ((var25 != null)) {
                                if (var2 == 14) {
                                  var25.invitationSent = true;
                                } else {
                                  if (!var25.joinRequested) {
                                    var25.joinRequested = true;
                                    AnimationPlayer.pendingJoinRequestCount = AnimationPlayer.pendingJoinRequestCount + 1;
                                  }
                                }
                                ResizableModalDialog.insertLobbyPlayerSorted((byte) 66, var25);
                              }
                            }
                          }
                        } else {
                          var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                          var15 = (LobbyRoom) (ClippedWidgetContainer.lobbyRoomsById.get((byte) -27, (long)var3));
                          var30 = var15;
                          if ((var15 != null)) {
                            if (var2 != 11) {
                              var30.joinRequestSent = true;
                            } else {
                              var15.invitationReceived = true;
                            }
                            QuickChatPhraseRepository.insertLobbyRoomSorted(-121, var30);
                          }
                        }
                      }
                    }
                  }
                }
              }
              break regionExit1;
            }
            var3_ref_of = (LobbyPlayer) (ModalDialog.currentRoomPlayers.first((byte) 93));
            while (var3_ref_of != null) {
              var3_ref_of.unlink(99);
              var3_ref_of.unlinkSecondary((byte) -76);
              var3_ref_of = (LobbyPlayer) (ModalDialog.currentRoomPlayers.next((byte) 123));
            }
            var3_ref_of = (LobbyPlayer) (oi.lobbyPlayersById.first((byte) 66));
            while (var3_ref_of != null) {
              if (var3_ref_of.invitationSent ||
                var3_ref_of.joinRequested) {
                if (var3_ref_of.joinRequested) {
                  AnimationPlayer.pendingJoinRequestCount = AnimationPlayer.pendingJoinRequestCount - 1;
                  var3_ref_of.joinRequested = false;
                }
                var3_ref_of.invitationSent = false;
                ResizableModalDialog.insertLobbyPlayerSorted((byte) 122, var3_ref_of);
              }
              var3_ref_of = (LobbyPlayer) (oi.lobbyPlayersById.next(1));
            }
            if (1 == var2 &&
              ToggleWidget.currentRoom != null) {
              PopupPresentation.field_e = ToggleWidget.currentRoom.ownerName;
            }
            if (4 == var2) {
              var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
              ToggleWidget.currentRoom = new LobbyRoom(tq.gameOptionCount);
              ToggleWidget.currentRoom.setSecondaryKey(true, (long)var3);
              TrianglePulse.decodeLobbyRoom(ToggleWidget.currentRoom, false, var1, 97);
              ph.field_d = 0L;
            } else {
              ToggleWidget.currentRoom = null;
            }
            if (2 != var2 &&
              var2 != 3) {
              NumericDateInputWidget.roomSetup = null;
            } else {
              if (null == NumericDateInputWidget.roomSetup) {
                NumericDateInputWidget.roomSetup = new LobbyRoom(tq.gameOptionCount);
              }
            }
            if (3 != var2) {
              SpellCastAction.field_s = false;
            } else {
              SpellCastAction.field_s = true;
              for (var3 = 0; var3 < CoatOfArms.field_d.length; var3++) {
                CoatOfArms.field_d[var3] = ((PacketBuffer) ((Object) var1)).readByte((byte) -1);
              }
              DiskCacheRequest.field_E = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
              AiPlanningStrategy.field_b = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
              for (var3 = 0; ClientContextMenu.field_d.length > var3; var3++) {
                ClientContextMenu.field_d[var3] = ((PacketBuffer) ((Object) var1)).readByte((byte) -106);
              }
            }
          }
          if (obfuscationGuard >= -36) {
            QuickChatCategoryRepository.b(122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref), "bl.C(" + obfuscationGuard + ')');
        }
    }

    final QuickChatCategory getCategory(int categoryId, boolean obfuscationGuard) {
        byte[] encodedCategory = null;
        if (!obfuscationGuard) {
          field_g = (String) null;
        }
        QuickChatCategory category = (QuickChatCategory) (this.categories.get((long)categoryId, (byte) 122));
        if (category != null) {
          return category;
        }
        if (categoryId >= 32768) {
          encodedCategory = this.globalArchive.getFile((byte) 94, 32767 & categoryId, 0);
        } else {
          encodedCategory = this.localArchive.getFile((byte) 98, categoryId, 0);
        }
        category = new QuickChatCategory();
        if (encodedCategory != null) {
          category.decode((byte) -91, new PacketBuffer(encodedCategory));
        }
        if (categoryId >= 32768) {
          category.applyGlobalIds(30);
        }
        this.categories.put(category, 100, (long)categoryId);
        return category;
    }

    final static void a(int param0, ResourceArchive param1) {
        ModelMeshBase[] array$0 = null;
        MeshData stackIn_23_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        MeshData var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        MeshData var10 = null;
        String var11 = null;
        MeshData var12 = null;
        MeshData var5Lifetime1;
        int var6Lifetime1;
        int var3Lifetime1;
        int var6Lifetime2;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          SummonEvent.field_B = param1;
          var9 = "";
          DiskCacheRequest.unitProjectionVariants = new boolean[ActionRequest.field_m.length];
          for (var3 = param0; ActionRequest.field_m.length > var3; var3++) {
            array$0 = new ModelMeshBase[ActionRequest.field_m[var3].length];
            ActionRequest.unitModels[var3] = array$0;
            DiskCacheRequest.unitProjectionVariants[var3] = false;
            var8 = ActionRequest.field_m[var3][0];
            var10 = ArrayWidgetContainer.a(var8, 235, var9);
            var5 = var10;
            if (var10 != null) {
              if (76 == var3) {
                pd.field_d = var10;
              }
              if (th.a(var10, -17900)) {
                DiskCacheRequest.unitProjectionVariants[var3] = true;
              }
              if (null != var10.faceRenderTypes) {
                for (var6 = 0; var6 < var10.faceCount; var6++) {
                  if (var10.faceRenderTypes[var6] == 2) {
                    var10.faceVertexA[var6] = 0;
                    var10.faceVertexB[var6] = 0;
                    var10.faceVertexC[var6] = 0;
                  }
                }
              }
              ActionRequest.unitModels[var3][0] = var10.createModel(SummonAction.field_x, fm.field_a, MaskedTextEntryPainter.field_A, BattleCharacter.field_t, MeshObject.field_a);
              for (var6Lifetime2 = 1; var6Lifetime2 < ActionRequest.field_m[var3].length; var6Lifetime2++) {
                ActionRequest.unitModels[var3][var6Lifetime2] = null;
              }
            }
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < cs.field_W.length; var3Lifetime1++) {
            var11 = cs.field_W[var3Lifetime1];
            var12 = ArrayWidgetContainer.a(var11, 235, var9);
            var5Lifetime1 = var12;
            stackIn_23_0 = var12;
            if (stackIn_23_0.faceRenderTypes != null) {
              for (var6Lifetime1 = 0; var6Lifetime1 < var5Lifetime1.faceCount; var6Lifetime1++) {
                if (var5Lifetime1.faceRenderTypes[var6Lifetime1] == 2) {
                  var5Lifetime1.faceVertexA[var6Lifetime1] = 0;
                  var5Lifetime1.faceVertexB[var6Lifetime1] = 0;
                  var5Lifetime1.faceVertexC[var6Lifetime1] = 0;
                }
              }
            }
            cs.field_db[var3Lifetime1] = var5Lifetime1.createModel(SummonAction.field_x, fm.field_a, MaskedTextEntryPainter.field_A, BattleCharacter.field_t, MeshObject.field_a);
            if (((ModelMesh) (cs.field_db[var3Lifetime1])).vertexCount == 0) {
              cs.field_db[var3Lifetime1] = null;
            }
          }
          EditableTextWidget.a(false, 76, -32596);
          TriangleRasterizer.b(0.75f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("bl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    QuickChatCategoryRepository(int unusedParameter, ResourceArchive localArchive, ResourceArchive globalArchive) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.categories = new WeightedLruCache(64);
        try {
          this.globalArchive = globalArchive;
          this.localArchive = localArchive;
          if (this.localArchive != null) {
            this.localArchive.getFileCapacity(0, -2);
          }
          if (null != this.globalArchive) {
            this.globalArchive.getFileCapacity(0, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("bl.<init>(").append(unusedParameter).append(',');
          if (localArchive == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (globalArchive == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_a = "Talons and hooks with which to swipe from above, improving aerial attacks.";
        soundHandles = new NodeDeque();
        field_g = "Not yet achieved";
        field_b = true;
    }
}
