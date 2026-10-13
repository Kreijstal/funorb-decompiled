/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9) {
        int var11;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param9) {
          QuickChatCategory.field_u = ClippedWidgetContainer.field_L;
          ClientUiComponent.c(param9, -120);
          if (ModalDialogHost.field_J > 0) {
            bn.a(param0, param9, 117, param5);
          }
          pi.field_N.textHorizontalPadding = ke.field_e.textHorizontalPadding;
          pi.field_N.horizontalAlignment = 1;
          if (param7 > ~PreparedAction.field_r) {
            j.a(1, param9, param0, param5);
          }
          if (0 < InstructionsPanel.field_D) {
            uu.a(param0, param9, param5, param7 + 1, param8);
          }
          if (ChannelGainProfile.field_f &&
            ToggleWidget.currentRoom.playerCount >= ToggleWidget.currentRoom.playerCapacity) {
            MapTile.field_f.viewport.text = TelefragEvent.field_y;
            IconTextComponent.field_Kb.inputEnabled = false;
            ArchiveIndex.a(MapTile.field_f.content, param7 - 77);
          } else {
            IconTextComponent.field_Kb.inputEnabled = true;
            MapTile.field_f.viewport.text = null;
            VertexNormal.a(param1, 255, param3, param5, MapTile.field_f);
          }
        } else {
          if (SoftwareRaster.width == tq.field_c &&
            SoftwareRaster.height == CachedArchiveProvider.field_p) {
            if (!param9) {
              QuickChatCategory.field_u = (-640 + tq.field_c) / 2;
              ClientUiComponent.c(param9, -120);
              if (ModalDialogHost.field_J > 0) {
                bn.a(param0, param9, 117, param5);
              }
              pi.field_N.textHorizontalPadding = ke.field_e.textHorizontalPadding;
              pi.field_N.horizontalAlignment = 1;
              if (param7 > ~PreparedAction.field_r) {
                j.a(1, param9, param0, param5);
              }
              if (0 < InstructionsPanel.field_D) {
                uu.a(param0, param9, param5, param7 + 1, param8);
              }
              if (ChannelGainProfile.field_f &&
                ToggleWidget.currentRoom.playerCount >= ToggleWidget.currentRoom.playerCapacity) {
                MapTile.field_f.viewport.text = TelefragEvent.field_y;
                IconTextComponent.field_Kb.inputEnabled = false;
                ArchiveIndex.a(MapTile.field_f.content, param7 - 77);
              } else {
                IconTextComponent.field_Kb.inputEnabled = true;
                MapTile.field_f.viewport.text = null;
                VertexNormal.a(param1, 255, param3, param5, MapTile.field_f);
              }
            } else {
              QuickChatCategory.field_u = ClippedWidgetContainer.field_L;
              ClientUiComponent.c(param9, -120);
              if (ModalDialogHost.field_J > 0) {
                bn.a(param0, param9, 117, param5);
              }
              pi.field_N.textHorizontalPadding = ke.field_e.textHorizontalPadding;
              pi.field_N.horizontalAlignment = 1;
              if (param7 > ~PreparedAction.field_r) {
                j.a(1, param9, param0, param5);
              }
              if (0 < InstructionsPanel.field_D) {
                uu.a(param0, param9, param5, param7 + 1, param8);
              }
              if (ChannelGainProfile.field_f &&
                ToggleWidget.currentRoom.playerCount >= ToggleWidget.currentRoom.playerCapacity) {
                MapTile.field_f.viewport.text = TelefragEvent.field_y;
                IconTextComponent.field_Kb.inputEnabled = false;
                ArchiveIndex.a(MapTile.field_f.content, param7 - 77);
              } else {
                IconTextComponent.field_Kb.inputEnabled = true;
                MapTile.field_f.viewport.text = null;
                VertexNormal.a(param1, 255, param3, param5, MapTile.field_f);
              }
            }
            jg.a(0, param3, param6, param1, param2, param4, param5);
            VertexNormal.a(param1, param7 ^ -256, param3, param5, bu.field_a);
            KeyboardInputListener.field_b = KeyboardInputListener.field_b + 1;
            return;
          }
          if (so.field_b.field_g == SoftwareRaster.height &&
            SoftwareRaster.width == so.field_b.field_a) {
            if (null != ToggleWidget.currentRoom) {
              ClientUiComponent.a(45, false);
              if (param9) {
                QuickChatCategory.field_u = ClippedWidgetContainer.field_L;
              } else {
                QuickChatCategory.field_u = (-640 + tq.field_c) / 2;
              }
              ClientUiComponent.c(param9, -120);
              if (ModalDialogHost.field_J > 0) {
                bn.a(param0, param9, 117, param5);
              }
              pi.field_N.textHorizontalPadding = ke.field_e.textHorizontalPadding;
              pi.field_N.horizontalAlignment = 1;
              if (param7 > ~PreparedAction.field_r) {
                j.a(1, param9, param0, param5);
              }
              if (0 < InstructionsPanel.field_D) {
                uu.a(param0, param9, param5, param7 + 1, param8);
              }
              if (ChannelGainProfile.field_f &&
                ToggleWidget.currentRoom.playerCount >= ToggleWidget.currentRoom.playerCapacity) {
                MapTile.field_f.viewport.text = TelefragEvent.field_y;
                IconTextComponent.field_Kb.inputEnabled = false;
                ArchiveIndex.a(MapTile.field_f.content, param7 - 77);
              } else {
                IconTextComponent.field_Kb.inputEnabled = true;
                MapTile.field_f.viewport.text = null;
                VertexNormal.a(param1, 255, param3, param5, MapTile.field_f);
              }
              jg.a(0, param3, param6, param1, param2, param4, param5);
              VertexNormal.a(param1, param7 ^ -256, param3, param5, bu.field_a);
              KeyboardInputListener.field_b = KeyboardInputListener.field_b + 1;
              return;
            }
            if (NumericDateInputWidget.roomSetup != null) {
              ClientUiComponent.a(108, true);
            } else {
              BitmapTextLayout.b(false);
            }
          }
          if (!param9) {
            QuickChatCategory.field_u = (-640 + tq.field_c) / 2;
            ClientUiComponent.c(param9, -120);
            if (ModalDialogHost.field_J > 0) {
              bn.a(param0, param9, 117, param5);
            }
            pi.field_N.textHorizontalPadding = ke.field_e.textHorizontalPadding;
            pi.field_N.horizontalAlignment = 1;
            if (param7 > ~PreparedAction.field_r) {
              j.a(1, param9, param0, param5);
            }
            if (0 < InstructionsPanel.field_D) {
              uu.a(param0, param9, param5, param7 + 1, param8);
            }
            if (ChannelGainProfile.field_f &&
              ToggleWidget.currentRoom.playerCount >= ToggleWidget.currentRoom.playerCapacity) {
              MapTile.field_f.viewport.text = TelefragEvent.field_y;
              IconTextComponent.field_Kb.inputEnabled = false;
              ArchiveIndex.a(MapTile.field_f.content, param7 - 77);
            } else {
              IconTextComponent.field_Kb.inputEnabled = true;
              MapTile.field_f.viewport.text = null;
              VertexNormal.a(param1, 255, param3, param5, MapTile.field_f);
            }
          } else {
            QuickChatCategory.field_u = ClippedWidgetContainer.field_L;
            ClientUiComponent.c(param9, -120);
            if (ModalDialogHost.field_J > 0) {
              bn.a(param0, param9, 117, param5);
              pi.field_N.textHorizontalPadding = ke.field_e.textHorizontalPadding;
              pi.field_N.horizontalAlignment = 1;
              if (param7 > ~PreparedAction.field_r) {
                j.a(1, param9, param0, param5);
              }
              if (0 < InstructionsPanel.field_D) {
                uu.a(param0, param9, param5, param7 + 1, param8);
              }
              if (ChannelGainProfile.field_f &&
                ToggleWidget.currentRoom.playerCount >= ToggleWidget.currentRoom.playerCapacity) {
                MapTile.field_f.viewport.text = TelefragEvent.field_y;
                IconTextComponent.field_Kb.inputEnabled = false;
                ArchiveIndex.a(MapTile.field_f.content, param7 - 77);
              } else {
                IconTextComponent.field_Kb.inputEnabled = true;
                MapTile.field_f.viewport.text = null;
                VertexNormal.a(param1, 255, param3, param5, MapTile.field_f);
              }
            } else {
              pi.field_N.textHorizontalPadding = ke.field_e.textHorizontalPadding;
              pi.field_N.horizontalAlignment = 1;
              if (param7 > ~PreparedAction.field_r) {
                j.a(1, param9, param0, param5);
              }
              if (0 < InstructionsPanel.field_D) {
                uu.a(param0, param9, param5, param7 + 1, param8);
              }
              if (!ChannelGainProfile.field_f) {
                IconTextComponent.field_Kb.inputEnabled = true;
                MapTile.field_f.viewport.text = null;
                VertexNormal.a(param1, 255, param3, param5, MapTile.field_f);
              } else {
                if (ToggleWidget.currentRoom.playerCount >= ToggleWidget.currentRoom.playerCapacity) {
                  MapTile.field_f.viewport.text = TelefragEvent.field_y;
                  IconTextComponent.field_Kb.inputEnabled = false;
                  ArchiveIndex.a(MapTile.field_f.content, param7 - 77);
                } else {
                  IconTextComponent.field_Kb.inputEnabled = true;
                  MapTile.field_f.viewport.text = null;
                  VertexNormal.a(param1, 255, param3, param5, MapTile.field_f);
                }
              }
            }
          }
        }
        jg.a(0, param3, param6, param1, param2, param4, param5);
        VertexNormal.a(param1, param7 ^ -256, param3, param5, bu.field_a);
        KeyboardInputListener.field_b = KeyboardInputListener.field_b + 1;
    }

    final static void a(boolean param0, int param1) {
        if (param1 == 0) {
          if (null != Spell.quickChatHelpDialog) {
            SoftwareRaster.d(SoftwareRaster.clipLeft, SoftwareRaster.clipTop, -SoftwareRaster.clipLeft + SoftwareRaster.clipRight, -SoftwareRaster.clipTop + SoftwareRaster.clipBottom);
            Spell.quickChatHelpDialog.draw(param0, 20);
          }
          return;
        }
        qh.a((byte) -15);
        if (null != Spell.quickChatHelpDialog) {
          SoftwareRaster.d(SoftwareRaster.clipLeft, SoftwareRaster.clipTop, -SoftwareRaster.clipLeft + SoftwareRaster.clipRight, -SoftwareRaster.clipTop + SoftwareRaster.clipBottom);
          Spell.quickChatHelpDialog.draw(param0, 20);
        }
    }

    final static void requestDeleteQuicksave(byte obfuscationGuard) {
        if (obfuscationGuard != 27) {
          return;
        }
        if (!DamageEvent.g(81)) {
          EmailValidator.outgoingPacket.writeCipheredOpcode(32161, 81);
          bu.storedQuicksave = null;
        }
    }

    final static void a(byte param0) {
        lq.field_e = -1;
        RasterViewportResizeHandler.field_a = 0;
        BoundedFile.field_b = false;
        TextLineLayout.field_a = null;
        int var1 = 110 % ((66 - param0) / 44);
        cc.field_b = -1;
    }

    static {
    }
}
