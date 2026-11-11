/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qt {
    static BitmapFont field_a;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != -25809) {
          AccountRegistrationPanel var2 = (AccountRegistrationPanel) null;
          qt.startAccountCreation((String) null, true, 14, (String) null, (String) null, (AccountRegistrationPanel) null, true);
        }
    }

    final static void appendRankingRecord(int param0, int param1, int param2, int param3, int param4, byte param5) {
        ItemBehaviour.field_p[ContextMenu.field_Eb] = param3;
        BlockModel.field_n[ContextMenu.field_Eb] = ContextMenu.field_Eb;
        jk.field_h[ContextMenu.field_Eb] = param4;
        if (C2SChooseCharacterPacket.field_d < param4) {
          LegacyOpenGlReflectionEffect.field_g = param4;
        }
        if (!(ota.field_c <= param4)) {
          kc.field_a = param4;
        }
        DamageableBehaviour.field_o[ContextMenu.field_Eb] = param0;
        bq.field_h[ContextMenu.field_Eb] = param1;
        PortalBehaviour.field_o[ContextMenu.field_Eb] = param2;
        int var6 = param2 + (param1 + param0);
        int var7 = var6 == 0 ? 0 : 1000 * param0 / var6;
        StatReportingObserverFactory.field_c[ContextMenu.field_Eb] = var7;
        ContextMenu.field_Eb = ContextMenu.field_Eb + 1;
        if (LegacyOpenGlReflectionEffect.field_g < var7) {
          LegacyOpenGlReflectionEffect.field_g = var7;
        }
        if (var7 < kc.field_a) {
          kc.field_a = var7;
        }
        if (param5 > -9) {
          qt.a(-106);
        }
    }

    final static void a(int param0) {
        int stackIn_12_0 = 0;
        LobbyPlayerEntry stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        LobbyPlayerEntry stackIn_61_0 = null;
        boolean stackIn_62_1 = false;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        LobbyPlayerEntry var3_ref_pha = null;
        LobbyGameWidget var4 = null;
        int var4_int = 0;
        int var5 = 0;
        LobbyGameWidget var6 = null;
        LobbyPlayerEntry var7 = null;
        int var8 = 0;
        LobbyPlayerEntry var8_ref_pha = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LobbyGameWidget var14 = null;
        LobbyPlayerEntry var15 = null;
        Object var16 = null;
        Object var17 = null;
        LobbyGameWidget var17_ref = null;
        Object var18 = null;
        Object var19 = null;
        LobbyGameWidget var19_ref = null;
        String var20 = null;
        LobbyPlayerEntry var21 = null;
        String var22 = null;
        String var23 = null;
        Object var24 = null;
        LobbyGameWidget var25 = null;
        String var26 = null;
        String var27 = null;
        LobbyPlayerEntry var28 = null;
        LobbyPlayerEntry var29 = null;
        LobbyPlayerEntry var30 = null;
        LobbyPlayerEntry var31 = null;
        LobbyPlayerEntry var32 = null;
        LobbyGameWidget var33 = null;
        LobbyGameWidget var34 = null;
        LobbyPlayerEntry var3_ref_phaLifetime1;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var16 = null;
        var24 = null;
        var19 = null;
        var17 = null;
        var18 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 > -10) {
            return;
          }
          var1 = WeaveOperator.field_q;
          var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
          if (var2 != 0 &&
            var2 != 1 &&
            2 != var2 &&
            3 != var2 &&
            var2 != 4) {
            if (5 == var2) {
              var3_long = ((PacketBuffer) ((Object) var1)).readLong(290646880);
              var23 = ((PacketBuffer) ((Object) var1)).readString((byte) -76);
              var20 = ((PacketBuffer) ((Object) var1)).readString((byte) -76);
              var22 = ((PacketBuffer) ((Object) var1)).readString((byte) -76);
              var21 = LoginMethod.findLobbyPlayer(true, var3_long);
              var8_ref_pha = var21;
              stackIn_12_0 = (var20.equals("")) ? 0 : 1;
              var9 = stackIn_12_0;
              if (var21 == null) {
                var8_ref_pha = new LobbyPlayerEntry(var23, var22, var3_long);
                fua.field_a.put(-1, var8_ref_pha, var3_long);
              } else {
                if (var9 != 0) {
                  var21.updateNames(var22, 75, var23);
                }
              }
              var8_ref_pha.field_Mb = bva.currentTimeMillis((byte) -107) - (long)((PacketBuffer) ((Object) var1)).readInt(-87);
              var8_ref_pha.field_Jb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(121);
              var10 = ((PacketBuffer) ((Object) var1)).readVarInt((byte) 100);
              stackIn_19_0 = var8_ref_pha;
              stackIn_20_1 = ((1 & var10) != 0);
              stackIn_19_0.field_tb = stackIn_20_1;
              var8_ref_pha.field_zb = var10 >> 1;
              var8_ref_pha.field_Ab = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
              var8_ref_pha.field_Eb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
              ql.insertLobbyPlayerSorted(110, var8_ref_pha);
              return;
            }
            if (var2 == 6) {
              var3_longLifetime1 = ((PacketBuffer) ((Object) var1)).readLong(290646880);
              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
              var31 = LoginMethod.findLobbyPlayer(true, var3_longLifetime1);
              if (var31 == null) {
                return;
              }
              if (var31.field_Fb) {
                ValidatedTextInputWidget.field_K = ValidatedTextInputWidget.field_K - 1;
                var31.field_Fb = false;
              }
              if (0 == var5) {
                var31.unlink(63);
              } else {
                var31.field_xb = qsa.field_a;
                var31.field_Lb = var5;
              }
              var31.unlinkSecondary(-7975);
              return;
            }
            if (var2 == 7) {
              var32 = (LobbyPlayerEntry) (uma.field_b.first(-80));
              while (var32 != null) {
                var32.unlink(70);
                var32.unlinkSecondary(-7975);
                var32 = (LobbyPlayerEntry) (uma.field_b.next(118));
              }
              ValidatedTextInputWidget.field_K = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(125);
              var4 = (LobbyGameWidget) (WhiteLightSensorComponent.field_K.get(-126, (long)var3));
              if (var4 == null) {
                var4 = new LobbyGameWidget(ColourRowCache.field_b);
                WhiteLightSensorComponent.field_K.put(-1, var4, (long)var3);
              }
              ConsoleExpressionParser.decodeLobbyGame(32, var4, true, var1);
              cua.insertSorted(var4, (byte) 80);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(121);
              var4_int = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
              var33 = (LobbyGameWidget) (WhiteLightSensorComponent.field_K.get(-107, (long)var3Lifetime4));
              if (var33 != null) {
                if (0 != var4_int) {
                  var33.field_zb = qsa.field_a;
                  var33.field_Ib = var4_int;
                } else {
                  var33.unlink(52);
                }
                var33.unlinkSecondary(-7975);
              }
              return;
            }
            if (var2 == 10) {
              var34 = (LobbyGameWidget) (AffineTransform3D.field_j.first(-80));
              while (var34 != null) {
                var34.unlink(122);
                var34.unlinkSecondary(-7975);
                var34 = (LobbyGameWidget) (AffineTransform3D.field_j.next(127));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (13 == var2) {
                var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(127);
                var4_intLifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                var17_ref = (LobbyGameWidget) (WhiteLightSensorComponent.field_K.get(-112, (long)var3Lifetime5));
                if (var17_ref != null) {
                  var14 = var17_ref;
                  var6 = var14;
                  var17_ref.field_Sb = false;
                  if (0 != var4_intLifetime1) {
                    var17_ref.field_zb = qsa.field_a;
                    var17_ref.field_Ib = var4_intLifetime1;
                  }
                  var14.field_gc = false;
                  cua.insertSorted(var17_ref, (byte) 48);
                }
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(290646880);
                    var26 = ((PacketBuffer) ((Object) var1)).readString((byte) -76);
                    var27 = ((PacketBuffer) ((Object) var1)).readString((byte) -76);
                    var7 = AchievementsScreen.findLobbyPlayer((byte) -40, var3_longLifetime2);
                    if (var7 == null) {
                      var7 = new LobbyPlayerEntry(var26, var27, var3_longLifetime2);
                      tc.field_d.put(-1, var7, var3_longLifetime2);
                      C2SChooseRewardPacket.field_a.field_Mb = C2SChooseRewardPacket.field_a.field_Mb + 1;
                    }
                    var7.field_Jb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(122);
                    var8 = ((PacketBuffer) ((Object) var1)).readVarInt((byte) -123);
                    stackIn_61_0 = var7;
                    stackIn_62_1 = ((1 & var8) != 0);
                    stackIn_61_0.field_tb = stackIn_62_1;
                    var7.field_zb = var8 >> 1;
                    var7.field_Ab = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                    var7.field_Eb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                    DemoCourseGenerator.field_g.addLast((byte) -54, var7);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(290646880);
                    var5Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                    var15 = AchievementsScreen.findLobbyPlayer((byte) -40, var3_longLifetime2);
                    var28 = var15;
                    if (var15 == null) {
                      return;
                    }
                    if (var5Lifetime1 == 0) {
                      var28.unlink(85);
                    } else {
                      var15.field_xb = qsa.field_a;
                      var15.field_Lb = var5Lifetime1;
                    }
                    var28.unlinkSecondary(-7975);
                    C2SChooseRewardPacket.field_a.field_Mb = C2SChooseRewardPacket.field_a.field_Mb - 1;
                    return;
                  }
                  if (var2 == 20) {
                    ConsoleExpressionParser.decodeLobbyGame(32, C2SChooseRewardPacket.field_a, false, var1);
                    return;
                  }
                  if (21 == var2) {
                    var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(124);
                    if (var3Lifetime5 == 0) {
                      TileRenderable.field_d = 0L;
                      return;
                    }
                    TileRenderable.field_d = bva.currentTimeMillis((byte) -107) + (long)var3Lifetime5;
                    return;
                  }
                  if (var2 == 22) {
                    ProxySocketConnector.field_f = ((PacketBuffer) ((Object) var1)).readUnsignedShort(123);
                    FleeLocomotor.field_z = ((PacketBuffer) ((Object) var1)).readVarInt((byte) 114);
                    return;
                  }
                  if (var2 == 23) {
                    SimpleConditionBehaviour.field_r = ((PacketBuffer) ((Object) var1)).readLong(290646880);
                    return;
                  }
                  ClipStack.reportClientError("L1: " + kk.formatPacketDump(32), (byte) 118, (Throwable) null);
                  DropAnimation.closeGameSocket(60);
                  return;
                }
                var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(290646880);
                var5Lifetime1Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                var29 = LoginMethod.findLobbyPlayer(true, var3_longLifetime2);
                if (var29 == null) {
                  return;
                }
                if (var5Lifetime1Lifetime1 != 0) {
                  var29.field_xb = qsa.field_a;
                  var29.field_Lb = var5Lifetime1Lifetime1;
                }
                if (15 == var2) {
                  var29.field_Hb = false;
                } else {
                  if (var29.field_Fb) {
                    ValidatedTextInputWidget.field_K = ValidatedTextInputWidget.field_K - 1;
                    var29.field_Fb = false;
                  }
                }
                ql.insertLobbyPlayerSorted(-42, var29);
                return;
              }
              var3_longLifetime2Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong(290646880);
              var30 = LoginMethod.findLobbyPlayer(true, var3_longLifetime2Lifetime1);
              if (var30 == null) {
                return;
              }
              if (var2 == 14) {
                var30.field_Hb = true;
              } else {
                if (!var30.field_Fb) {
                  ValidatedTextInputWidget.field_K = ValidatedTextInputWidget.field_K + 1;
                  var30.field_Fb = true;
                }
              }
              ql.insertLobbyPlayerSorted(112, var30);
              return;
            }
            var3Lifetime6 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(123);
            var19_ref = (LobbyGameWidget) (WhiteLightSensorComponent.field_K.get(-111, (long)var3Lifetime6));
            var25 = var19_ref;
            if (var25 == null) {
              return;
            }
            if (var2 == 11) {
              var25.field_gc = true;
            } else {
              var25.field_Sb = true;
            }
            cua.insertSorted(var25, (byte) -97);
            return;
          }
          var3_ref_pha = (LobbyPlayerEntry) (DemoCourseGenerator.field_g.first(-80));
          while (var3_ref_pha != null) {
            var3_ref_pha.unlink(63);
            var3_ref_pha.unlinkSecondary(-7975);
            var3_ref_pha = (LobbyPlayerEntry) (DemoCourseGenerator.field_g.next(117));
          }
          var3_ref_phaLifetime1 = (LobbyPlayerEntry) (fua.field_a.startTraversal(-119));
          while (var3_ref_phaLifetime1 != null) {
            if (var3_ref_phaLifetime1.field_Hb ||
              var3_ref_phaLifetime1.field_Fb) {
              var3_ref_phaLifetime1.field_Hb = false;
              if (var3_ref_phaLifetime1.field_Fb) {
                ValidatedTextInputWidget.field_K = ValidatedTextInputWidget.field_K - 1;
                var3_ref_phaLifetime1.field_Fb = false;
              }
              ql.insertLobbyPlayerSorted(114, var3_ref_phaLifetime1);
            }
            var3_ref_phaLifetime1 = (LobbyPlayerEntry) (fua.field_a.nextInTraversal((byte) -112));
          }
          if (var2 == 1 &&
            C2SChooseRewardPacket.field_a != null) {
            wra.field_b = C2SChooseRewardPacket.field_a.field_tb;
          }
          if (var2 != 4) {
            C2SChooseRewardPacket.field_a = null;
          } else {
            var3Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(125);
            C2SChooseRewardPacket.field_a = new LobbyGameWidget(ColourRowCache.field_b);
            C2SChooseRewardPacket.field_a.setSecondaryKey(false, (long)var3Lifetime1);
            ConsoleExpressionParser.decodeLobbyGame(32, C2SChooseRewardPacket.field_a, false, var1);
            TileRenderable.field_d = 0L;
          }
          if (var2 != 2 &&
            var2 != 3) {
            WaveformOperator.field_n = null;
          } else {
            if (WaveformOperator.field_n == null) {
              WaveformOperator.field_n = new LobbyGameWidget(ColourRowCache.field_b);
            }
          }
          if (var2 != 3) {
            PlayerViewport.field_o = false;
            return;
          }
          PlayerViewport.field_o = true;
          for (var3Lifetime2 = 0; CourseLayoutFactory.field_b.length > var3Lifetime2; var3Lifetime2++) {
            CourseLayoutFactory.field_b[var3Lifetime2] = ((PacketBuffer) ((Object) var1)).readByte((byte) 48);
          }
          CoinBagItemComponent.field_H = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
          mua.field_b = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
          for (var3Lifetime3 = 0; var3Lifetime3 < TileGrid.field_e.length; var3Lifetime3++) {
            TileGrid.field_e[var3Lifetime3] = ((PacketBuffer) ((Object) var1)).readByte((byte) 108);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var1_ref), "qt.D(" + param0 + ')');
        }
    }

    final static boolean startAccountCreation(String param0, boolean param1, int param2, String param3, String param4, AccountRegistrationPanel param5, boolean param6) {
        RuntimeException var7 = null;
        rua var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fta.field_c != LegacyOpenGlTexture.field_a) {
            return false;
          }
          if (!param1) {
            field_a = (BitmapFont) null;
          }
          var8 = new rua(ej.field_a, param5);
          ej.field_a.pushDialog(var8, 88);
          if (rg.hasTuhstatbutCookie(7)) {
            var8.h(param1);
            return true;
          }
          LegacyOpenGlTexture.field_a = gsa.field_y;
          ObjectList.field_i = param0;
          IntNode.field_j = param6;
          QuickChatPhraseDefinition.field_n = param2;
          ConstraintLocomotor.field_p = param4;
          PlantModel.field_n = null;
          BridgeTile.field_g = param3;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("qt.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
        }
    }

    private qt() throws Throwable {
        throw new Error();
    }

    static {
    }
}
