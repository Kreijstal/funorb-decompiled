/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyUpdateHandler {
    static String field_b;
    static String field_c;
    static int field_a;

    final static void registerTallObjectSprite(int param0, int param1) {
        int[] var5 = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != -23838) {
            field_c = (String) null;
          }
          var5 = new int[HudSpriteStore.field_c.length + 1];
          var2 = var5;
          for (var3 = 0; HudSpriteStore.field_c.length > var3; var3++) {
            var5[var3] = HudSpriteStore.field_c[var3];
          }
          var2[var2.length - 1] = param0;
          HudSpriteStore.field_c = var2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ck.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void readLobbyUpdate(int param0) {
        int stackIn_12_0 = 0;
        LobbyPlayer stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        LobbyPlayer stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        LobbyPlayer var3_ref_dm = null;
        int var3 = 0;
        LobbyGame var3_ref_jh = null;
        long var3_long = 0L;
        LobbyGame var4 = null;
        int var4_int = 0;
        int var5 = 0;
        LobbyPlayer var7 = null;
        int var8 = 0;
        LobbyPlayer var8_ref_dm = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LobbyPlayer var14 = null;
        LobbyPlayer var15 = null;
        LobbyGame var16 = null;
        Object var17 = null;
        LobbyGame var17_ref = null;
        Object var18 = null;
        LobbyGame var18_ref = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        LobbyPlayer var22 = null;
        LobbyPlayer var23 = null;
        LobbyGame var24 = null;
        LobbyPlayer var25 = null;
        LobbyPlayer var26 = null;
        String var27 = null;
        String var28 = null;
        LobbyPlayer var29 = null;
        Object var30 = null;
        LobbyGame var30_ref = null;
        LobbyGame var31 = null;
        LobbyPlayer var3_ref_dmLifetime1;
        LobbyPlayer var3_ref_dmLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var18 = null;
        var30 = null;
        var17 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1 = StatusAndMeshHelpers.field_e;
          var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(31365);
          if (param0 != -2061) {
            field_c = (String) null;
          }
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            3 != var2 &&
            4 != var2) {
            if (var2 == 5) {
              var3_long = ((PacketBuffer) ((Object) var1)).readLong((byte) -30);
              var20 = ((PacketBuffer) ((Object) var1)).readString((byte) -76);
              var19 = ((PacketBuffer) ((Object) var1)).readString((byte) -50);
              var21 = ((PacketBuffer) ((Object) var1)).readString((byte) -61);
              var22 = ChatPanelSetupHelpers.findLobbyPlayer((byte) 50, var3_long);
              var8_ref_dm = var22;
              stackIn_12_0 = (var19.equals("")) ? 0 : 1;
              var9 = stackIn_12_0;
              if (var22 != null) {
                if (var9 != 0) {
                  var22.setNames(var20, var21, 43);
                }
              } else {
                var8_ref_dm = new LobbyPlayer(var20, var21, var3_long);
                TextWidgetPainter.field_c.put(param0 + 2060, var8_ref_dm, var3_long);
              }
              var8_ref_dm.field_Kb = ClockAndScreenHelpers.monotonicMillis((byte) 98) - (long)((PacketBuffer) ((Object) var1)).readInt(-1478490344);
              var8_ref_dm.field_Mb = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 69);
              var10 = ((PacketBuffer) ((Object) var1)).readVarInt(param0 ^ -2061);
              stackIn_18_0 = var8_ref_dm;
              stackIn_19_1 = ((1 & var10) != 0);
              stackIn_18_0.field_Nb = stackIn_19_1;
              var8_ref_dm.field_Sb = var10 >> 1;
              var8_ref_dm.field_Yb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(31365);
              var8_ref_dm.field_Vb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(param0 + 33426);
              TransitionPhase.insertLobbyPlayerSorted(var8_ref_dm, true);
              return;
            }
            if (6 == var2) {
              var3_longLifetime1 = ((PacketBuffer) ((Object) var1)).readLong((byte) -30);
              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(31365);
              var23 = ChatPanelSetupHelpers.findLobbyPlayer((byte) 50, var3_longLifetime1);
              if (var23 == null) {
                return;
              }
              if (var23.field_Ob) {
                PowerupProgressCard.field_i = PowerupProgressCard.field_i - 1;
                var23.field_Ob = false;
              }
              if (0 != var5) {
                var23.field_bc = UnitStateEvent.field_r;
                var23.field_Fb = var5;
              } else {
                var23.unlink(true);
              }
              var23.unlinkSecondary(-4564);
              return;
            }
            if (7 == var2) {
              var3_ref_dm = (LobbyPlayer) (MeltdownPuddleView.field_i.last(66));
              while (var3_ref_dm != null) {
                var3_ref_dm.unlink(true);
                var3_ref_dm.unlinkSecondary(-4564);
                var3_ref_dm = (LobbyPlayer) (MeltdownPuddleView.field_i.previous(param0 + 2067));
              }
              PowerupProgressCard.field_i = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 69);
              var4 = (LobbyGame) (MeshMaterial.field_h.findByKey((long)var3, -22877));
              if (var4 == null) {
                var4 = new LobbyGame(FriendListHelpers.field_h);
                MeshMaterial.field_h.put(-1, var4, (long)var3);
              }
              SocketConnector.readLobbyGameEntry(var4, true, var1, false);
              StateIconLabel.insertLobbyGameSorted(var4, param0 ^ 2144);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 69);
              var4_int = ((PacketBuffer) ((Object) var1)).readUnsignedByte(31365);
              var17_ref = (LobbyGame) (MeshMaterial.field_h.findByKey((long)var3Lifetime4, -22877));
              var31 = var17_ref;
              if (var17_ref == null) {
                return;
              }
              if (var4_int == 0) {
                var31.unlink(true);
              } else {
                var17_ref.field_Jb = UnitStateEvent.field_r;
                var17_ref.field_Vb = var4_int;
              }
              var31.unlinkSecondary(-4564);
              return;
            }
            if (var2 == 10) {
              var3_ref_jh = (LobbyGame) (NetworkArchiveRequest.field_C.last(param0 + 2175));
              while (var3_ref_jh != null) {
                var3_ref_jh.unlink(true);
                var3_ref_jh.unlinkSecondary(param0 ^ 6623);
                var3_ref_jh = (LobbyGame) (NetworkArchiveRequest.field_C.previous(param0 + 2067));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (var2 == 13) {
                var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 69);
                var4_intLifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(param0 + 33426);
                var30_ref = (LobbyGame) (MeshMaterial.field_h.findByKey((long)var3Lifetime5, -22877));
                if (var30_ref != null) {
                  var16 = var30_ref;
                  var30_ref.field_rc = false;
                  if (var4_intLifetime1 != 0) {
                    var30_ref.field_Jb = UnitStateEvent.field_r;
                    var30_ref.field_Vb = var4_intLifetime1;
                  }
                  var16.field_lc = false;
                  StateIconLabel.insertLobbyGameSorted(var30_ref, -57);
                }
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -30);
                    var27 = ((PacketBuffer) ((Object) var1)).readString((byte) -27);
                    var28 = ((PacketBuffer) ((Object) var1)).readString((byte) -125);
                    var7 = FullscreenErrorDialog.findLobbyPlayer(var3_longLifetime2, (byte) -99);
                    if (var7 == null) {
                      var7 = new LobbyPlayer(var27, var28, var3_longLifetime2);
                      MessageMenuScreen.field_o.put(-1, var7, var3_longLifetime2);
                      JaggrabDownloader.field_c.field_cc = JaggrabDownloader.field_c.field_cc + 1;
                    }
                    var7.field_Mb = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 69);
                    var8 = ((PacketBuffer) ((Object) var1)).readVarInt(0);
                    var7.field_Sb = var8 >> 1;
                    stackIn_83_0 = var7;
                    stackIn_84_1 = ((1 & var8) != 0);
                    stackIn_83_0.field_Nb = stackIn_84_1;
                    var7.field_Yb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(31365);
                    var7.field_Vb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(31365);
                    PendingRankingRequest.field_g.addFirst(var7, false);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -30);
                    var5Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(31365);
                    var15 = FullscreenErrorDialog.findLobbyPlayer(var3_longLifetime2, (byte) -54);
                    var26 = var15;
                    if (var15 != null) {
                      if (var5Lifetime1 == 0) {
                        var26.unlink(true);
                      } else {
                        var15.field_Fb = var5Lifetime1;
                        var15.field_bc = UnitStateEvent.field_r;
                      }
                      var26.unlinkSecondary(param0 ^ 6623);
                      JaggrabDownloader.field_c.field_cc = JaggrabDownloader.field_c.field_cc - 1;
                    }
                    return;
                  }
                  if (var2 == 20) {
                    SocketConnector.readLobbyGameEntry(JaggrabDownloader.field_c, false, var1, false);
                    return;
                  }
                  if (var2 == 21) {
                    var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 69);
                    if (var3Lifetime5 != 0) {
                      LoginPacketHelpers.field_c = ClockAndScreenHelpers.monotonicMillis((byte) 97) + (long)var3Lifetime5;
                      return;
                    }
                    LoginPacketHelpers.field_c = 0L;
                    return;
                  }
                  if (22 == var2) {
                    GlintButtonHelpers.field_e = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 69);
                    LobbyPlayer.field_Zb = ((PacketBuffer) ((Object) var1)).readVarInt(param0 + 2061);
                    return;
                  }
                  if (var2 == 23) {
                    ContentTransitionDialog.field_sb = ((PacketBuffer) ((Object) var1)).readLong((byte) -30);
                    return;
                  }
                  MouseInputHandler.reportClientError("L1: " + LevelFileList.describeCurrentPacket(0), (Throwable) null, false);
                  ClientShellHelpers.closeGameSocket((byte) -125);
                  return;
                }
                var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -30);
                var5Lifetime1Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(param0 + 33426);
                var14 = ChatPanelSetupHelpers.findLobbyPlayer((byte) 50, var3_longLifetime2);
                var25 = var14;
                if (var14 == null) {
                  return;
                }
                if (var2 != 15) {
                  if (var25.field_Ob) {
                    var25.field_Ob = false;
                    PowerupProgressCard.field_i = PowerupProgressCard.field_i - 1;
                  }
                } else {
                  var14.field_Pb = false;
                }
                if (var5Lifetime1Lifetime1 != 0) {
                  var25.field_bc = UnitStateEvent.field_r;
                  var25.field_Fb = var5Lifetime1Lifetime1;
                }
                TransitionPhase.insertLobbyPlayerSorted(var25, true);
                return;
              }
              var3_longLifetime2Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong((byte) -30);
              var29 = ChatPanelSetupHelpers.findLobbyPlayer((byte) 50, var3_longLifetime2Lifetime1);
              if (var29 == null) {
                return;
              }
              if (14 == var2) {
                var29.field_Pb = true;
              } else {
                if (!var29.field_Ob) {
                  PowerupProgressCard.field_i = PowerupProgressCard.field_i + 1;
                  var29.field_Ob = true;
                }
              }
              TransitionPhase.insertLobbyPlayerSorted(var29, true);
              return;
            }
            var3Lifetime6 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 69);
            var18_ref = (LobbyGame) (MeshMaterial.field_h.findByKey((long)var3Lifetime6, -22877));
            var24 = var18_ref;
            if (var24 == null) {
              return;
            }
            if (var2 == 11) {
              var24.field_lc = true;
            } else {
              var24.field_rc = true;
            }
            StateIconLabel.insertLobbyGameSorted(var24, -126);
            return;
          }
          var3_ref_dmLifetime1 = (LobbyPlayer) (PendingRankingRequest.field_g.last(113));
          while (var3_ref_dmLifetime1 != null) {
            var3_ref_dmLifetime1.unlink(true);
            var3_ref_dmLifetime1.unlinkSecondary(-4564);
            var3_ref_dmLifetime1 = (LobbyPlayer) (PendingRankingRequest.field_g.previous(6));
          }
          var3_ref_dmLifetime2 = (LobbyPlayer) (TextWidgetPainter.field_c.firstInTraversal((byte) 7));
          while (var3_ref_dmLifetime2 != null) {
            if (var3_ref_dmLifetime2.field_Pb ||
              var3_ref_dmLifetime2.field_Ob) {
              if (var3_ref_dmLifetime2.field_Ob) {
                PowerupProgressCard.field_i = PowerupProgressCard.field_i - 1;
                var3_ref_dmLifetime2.field_Ob = false;
              }
              var3_ref_dmLifetime2.field_Pb = false;
              TransitionPhase.insertLobbyPlayerSorted(var3_ref_dmLifetime2, true);
            }
            var3_ref_dmLifetime2 = (LobbyPlayer) (TextWidgetPainter.field_c.nextInTraversal((byte) 123));
          }
          if (var2 == 1 &&
            null != JaggrabDownloader.field_c) {
            IndexedSpriteState.field_k = JaggrabDownloader.field_c.field_Nb;
          }
          if (var2 == 4) {
            var3Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 69);
            JaggrabDownloader.field_c = new LobbyGame(FriendListHelpers.field_h);
            JaggrabDownloader.field_c.setSecondaryKey((byte) -85, (long)var3Lifetime1);
            SocketConnector.readLobbyGameEntry(JaggrabDownloader.field_c, false, var1, false);
            LoginPacketHelpers.field_c = 0L;
          } else {
            JaggrabDownloader.field_c = null;
          }
          if (var2 != 2 &&
            var2 != 3) {
            BufferedSocket.field_n = null;
          } else {
            if (null == BufferedSocket.field_n) {
              BufferedSocket.field_n = new LobbyGame(FriendListHelpers.field_h);
            }
          }
          if (var2 != 3) {
            GrowableIntList.field_k = false;
            return;
          }
          GrowableIntList.field_k = true;
          for (var3Lifetime2 = 0; ScoreUpdateEvent.field_k.length > var3Lifetime2; var3Lifetime2++) {
            ScoreUpdateEvent.field_k[var3Lifetime2] = ((PacketBuffer) ((Object) var1)).readByte(param0 - 249697519);
          }
          EffectAudioHelpers.field_h = ((PacketBuffer) ((Object) var1)).readUnsignedByte(31365);
          DualLinkNodeHashTable.field_f = ((PacketBuffer) ((Object) var1)).readUnsignedByte(31365);
          for (var3Lifetime3 = 0; var3Lifetime3 < AudioPumpThread.field_a.length; var3Lifetime3++) {
            AudioPumpThread.field_a[var3Lifetime3] = ((PacketBuffer) ((Object) var1)).readByte(-249699580);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "ck.C(" + param0 + ')');
        }
    }

    final static boolean canAppendNameCharacter(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            field_b = (String) null;
          }
          if (!BitPackedArrayHelpers.isAccountNameCharacter(8192, param0)) {
            return false;
          }
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int >= 12) {
            return false;
          }
          if (!PopupMenuBuilder.isNameSeparator((byte) 64, param0)) {
            return true;
          }
          return (var3_int != 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        int var1 = -20 % ((param0 - 40) / 63);
        field_b = null;
    }

    static {
        field_c = "OVER <%0>";
        field_b = "Players";
        field_a = 0;
    }
}
