/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialPacketHelpers {
    static int[] field_j;
    static String field_f;
    static int field_k;
    static RgbSprite field_e;
    static SceneWidget field_d;
    static int[] field_g;
    static String field_c;
    static String[][] field_b;
    static int field_h;
    static int field_a;
    static int field_i;

    final static void handleSocialListPacket(int param0) {
        LobbyPlayer stackIn_48_0 = null;
        boolean stackIn_49_1 = false;
        int stackIn_106_0 = 0;
        LobbyPlayer stackIn_112_0 = null;
        boolean stackIn_113_1 = false;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        LobbyPlayer var3_ref_cc = null;
        LobbyGame var4 = null;
        int var4_int = 0;
        int var5 = 0;
        LobbyGame var6 = null;
        LobbyPlayer var7 = null;
        LobbyPlayer var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LobbyGame var13 = null;
        LobbyGame var15 = null;
        LobbyPlayer var16 = null;
        Object var17 = null;
        Object var18 = null;
        LobbyGame var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        LobbyGame var20_ref = null;
        LobbyGame var21 = null;
        LobbyGame var22 = null;
        String var23 = null;
        String var24 = null;
        LobbyPlayer var25 = null;
        LobbyPlayer var26 = null;
        LobbyPlayer var27 = null;
        LobbyPlayer var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        LobbyPlayer var32 = null;
        LobbyGame var33 = null;
        LobbyPlayer var34 = null;
        LobbyPlayer var3_ref_ccLifetime1;
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
        var17 = null;
        var20 = null;
        var18 = null;
        var19 = null;
        var11 = SteelSentinels.obfuscationControl;
        try {
          var1 = LoginConnectionStage.field_d;
          if (param0 != 11247) {
            field_k = 50;
          }
          var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -109);
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            var2 != 3 &&
            var2 != 4) {
            if (5 == var2) {
              var3_long = ((PacketBuffer) ((Object) var1)).readLong((byte) -112);
              var30 = ((PacketBuffer) ((Object) var1)).readString(param0 - 11246);
              var29 = ((PacketBuffer) ((Object) var1)).readString(1);
              var31 = ((PacketBuffer) ((Object) var1)).readString(param0 - 11246);
              var32 = LoginStateQueries.findGamePlayer(var3_long, false);
              var8 = var32;
              stackIn_106_0 = (var29.equals("")) ? 0 : 1;
              var9 = stackIn_106_0;
              if (var32 != null) {
                if (var9 != 0) {
                  var32.setNames(15, var30, var31);
                }
              } else {
                var8 = new LobbyPlayer(var30, var31, var3_long);
                NameTable.field_c.put(var8, param0 - 11246, var3_long);
              }
              var8.field_fc = ClockAndCookieHelpers.monotonicMillis(param0 - 11210) - (long)((PacketBuffer) ((Object) var1)).readInt(param0 - 11247);
              var8.field_ac = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -60);
              var10 = ((PacketBuffer) ((Object) var1)).readVarInt(61);
              var8.field_dc = var10 >> 1;
              stackIn_112_0 = var8;
              stackIn_113_1 = (0 != (var10 & 1));
              stackIn_112_0.field_nc = stackIn_113_1;
              var8.field_jc = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -78);
              var8.field_qc = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -107);
              BenefitsScreenHelpers.insertLobbyPlayerSorted(124, var8);
              return;
            }
            if (var2 == 6) {
              var3_longLifetime1 = ((PacketBuffer) ((Object) var1)).readLong((byte) -71);
              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -78);
              var28 = LoginStateQueries.findGamePlayer(var3_longLifetime1, false);
              if (var28 != null) {
                if (var28.field_kc) {
                  var28.field_kc = false;
                  IconLookupHelpers.field_a = IconLookupHelpers.field_a - 1;
                }
                if (var5 != 0) {
                  var28.field_Ub = Js5ArchiveManager.field_l;
                  var28.field_Wb = var5;
                } else {
                  var28.unlink(4);
                }
                var28.unlinkDual(480);
              }
              return;
            }
            if (var2 == 7) {
              var34 = (LobbyPlayer) (IterableNodeHashTable.field_m.first(13058));
              while (var34 != null) {
                var34.unlink(4);
                var34.unlinkDual(480);
                var34 = (LobbyPlayer) (IterableNodeHashTable.field_m.next((byte) -16));
              }
              IconLookupHelpers.field_a = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -60);
              var4 = (LobbyGame) (QuickChatParameterType.field_a.get((long)var3, (byte) -57));
              if (var4 == null) {
                var4 = new LobbyGame(UrlAndReplyHelpers.field_a);
                QuickChatParameterType.field_a.put(var4, param0 - 11246, (long)var3);
              }
              LobbyGameDecoding.readGameEntry(var1, true, var4, (byte) -113);
              EmailAvailabilityValidator.insertLobbyEntrySorted(true, var4);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -60);
              var4_int = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -61);
              var13 = (LobbyGame) (QuickChatParameterType.field_a.get((long)var3Lifetime4, (byte) -39));
              var21 = var13;
              if (var13 == null) {
                return;
              }
              if (0 == var4_int) {
                var21.unlink(param0 - 11243);
              } else {
                var13.field_mc = Js5ArchiveManager.field_l;
                var13.field_Ac = var4_int;
              }
              var21.unlinkDual(param0 ^ 10767);
              return;
            }
            if (var2 == 10) {
              var33 = (LobbyGame) (ClientErrorSupport.field_e.first(param0 ^ 6381));
              while (var33 != null) {
                var33.unlink(4);
                var33.unlinkDual(480);
                var33 = (LobbyGame) (ClientErrorSupport.field_e.next((byte) -104));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (13 == var2) {
                var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -60);
                var4_intLifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -68);
                var18_ref = (LobbyGame) (QuickChatParameterType.field_a.get((long)var3Lifetime5, (byte) -50));
                if (var18_ref == null) {
                  return;
                }
                var15 = var18_ref;
                var6 = var15;
                var18_ref.field_bc = false;
                if (0 != var4_intLifetime1) {
                  var18_ref.field_Ac = var4_intLifetime1;
                  var18_ref.field_mc = Js5ArchiveManager.field_l;
                }
                var15.field_vc = false;
                EmailAvailabilityValidator.insertLobbyEntrySorted(true, var18_ref);
                return;
              }
              if (14 != var2 &&
                var2 != 16) {
                if (15 != var2 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -83);
                    var23 = ((PacketBuffer) ((Object) var1)).readString(1);
                    var24 = ((PacketBuffer) ((Object) var1)).readString(1);
                    var7 = ThreeSliceButtonPainter.findLobbyEntry(false, var3_longLifetime2);
                    if (var7 == null) {
                      var7 = new LobbyPlayer(var23, var24, var3_longLifetime2);
                      LoginCredentials.field_b.put(var7, 1, var3_longLifetime2);
                      LoginEncryptionHelpers.field_b.field_wc = LoginEncryptionHelpers.field_b.field_wc + 1;
                    }
                    var7.field_ac = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -60);
                    var8_int = ((PacketBuffer) ((Object) var1)).readVarInt(param0 ^ 11163);
                    stackIn_48_0 = var7;
                    stackIn_49_1 = (0 != (1 & var8_int));
                    stackIn_48_0.field_nc = stackIn_49_1;
                    var7.field_dc = var8_int >> 1;
                    var7.field_jc = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -98);
                    var7.field_qc = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -98);
                    SocialStateHelpers.field_d.addLast(3, var7);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -128);
                    var5Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -55);
                    var16 = ThreeSliceButtonPainter.findLobbyEntry(false, var3_longLifetime2);
                    var25 = var16;
                    if (var16 != null) {
                      if (var5Lifetime1 == 0) {
                        var25.unlink(4);
                      } else {
                        var16.field_Wb = var5Lifetime1;
                        var16.field_Ub = Js5ArchiveManager.field_l;
                      }
                      var25.unlinkDual(param0 ^ 10767);
                      LoginEncryptionHelpers.field_b.field_wc = LoginEncryptionHelpers.field_b.field_wc - 1;
                    }
                    return;
                  }
                  if (20 == var2) {
                    LobbyGameDecoding.readGameEntry(var1, false, LoginEncryptionHelpers.field_b, (byte) 98);
                    return;
                  }
                  if (var2 == 21) {
                    var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -60);
                    if (var3Lifetime5 == 0) {
                      ModalStack.field_R = 0L;
                      return;
                    }
                    ModalStack.field_R = (long)var3Lifetime5 + ClockAndCookieHelpers.monotonicMillis(-124);
                    return;
                  }
                  if (22 == var2) {
                    QuickChatInputHelpers.field_b = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -60);
                    RankingQuery.field_D = ((PacketBuffer) ((Object) var1)).readVarInt(param0 - 11173);
                    return;
                  }
                  if (var2 == 23) {
                    GameplayController.field_G = ((PacketBuffer) ((Object) var1)).readLong((byte) -124);
                    return;
                  }
                  MusicCrossfadeStream.reportClientError("L1: " + ClientErrorSupport.describePacketHistory((byte) 94), -106, (Throwable) null);
                  LoginForm.closeConnection(-82);
                  return;
                }
                var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -119);
                var5Lifetime1Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -66);
                var26 = LoginStateQueries.findGamePlayer(var3_longLifetime2, false);
                if (var26 == null) {
                  return;
                }
                if (15 == var2) {
                  var26.field_Zb = false;
                } else {
                  if (var26.field_kc) {
                    var26.field_kc = false;
                    IconLookupHelpers.field_a = IconLookupHelpers.field_a - 1;
                  }
                }
                if (var5Lifetime1Lifetime1 != 0) {
                  var26.field_Wb = var5Lifetime1Lifetime1;
                  var26.field_Ub = Js5ArchiveManager.field_l;
                }
                BenefitsScreenHelpers.insertLobbyPlayerSorted(param0 ^ 11154, var26);
                return;
              }
              var3_longLifetime2Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong((byte) -91);
              var27 = LoginStateQueries.findGamePlayer(var3_longLifetime2Lifetime1, false);
              if (var27 != null) {
                if (var2 != 14) {
                  if (!var27.field_kc) {
                    var27.field_kc = true;
                    IconLookupHelpers.field_a = IconLookupHelpers.field_a + 1;
                  }
                } else {
                  var27.field_Zb = true;
                }
                BenefitsScreenHelpers.insertLobbyPlayerSorted(124, var27);
              }
              return;
            }
            var3Lifetime6 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -60);
            var20_ref = (LobbyGame) (QuickChatParameterType.field_a.get((long)var3Lifetime6, (byte) -101));
            var22 = var20_ref;
            if (var22 == null) {
              return;
            }
            if (var2 == 11) {
              var22.field_vc = true;
            } else {
              var22.field_bc = true;
            }
            EmailAvailabilityValidator.insertLobbyEntrySorted(true, var22);
            return;
          }
          var3_ref_cc = (LobbyPlayer) (SocialStateHelpers.field_d.first(param0 ^ 6381));
          while (var3_ref_cc != null) {
            var3_ref_cc.unlink(param0 ^ 11243);
            var3_ref_cc.unlinkDual(480);
            var3_ref_cc = (LobbyPlayer) (SocialStateHelpers.field_d.next((byte) -25));
          }
          var3_ref_ccLifetime1 = (LobbyPlayer) (NameTable.field_c.first(120));
          while (var3_ref_ccLifetime1 != null) {
            if (var3_ref_ccLifetime1.field_Zb ||
              var3_ref_ccLifetime1.field_kc) {
              if (var3_ref_ccLifetime1.field_kc) {
                var3_ref_ccLifetime1.field_kc = false;
                IconLookupHelpers.field_a = IconLookupHelpers.field_a - 1;
              }
              var3_ref_ccLifetime1.field_Zb = false;
              BenefitsScreenHelpers.insertLobbyPlayerSorted(127, var3_ref_ccLifetime1);
            }
            var3_ref_ccLifetime1 = (LobbyPlayer) (NameTable.field_c.next((byte) -76));
          }
          if (var2 == 1 &&
            null != LoginEncryptionHelpers.field_b) {
            LobbyStateHelpers.field_g = LoginEncryptionHelpers.field_b.field_Xb;
          }
          if (4 == var2) {
            var3Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -60);
            LoginEncryptionHelpers.field_b = new LobbyGame(UrlAndReplyHelpers.field_a);
            LoginEncryptionHelpers.field_b.setDualKey((byte) 73, (long)var3Lifetime1);
            LobbyGameDecoding.readGameEntry(var1, false, LoginEncryptionHelpers.field_b, (byte) 114);
            ModalStack.field_R = 0L;
          } else {
            LoginEncryptionHelpers.field_b = null;
          }
          if (var2 != 2 &&
            var2 != 3) {
            ByteArrayPoolHelpers.field_a = null;
          } else {
            if (null == ByteArrayPoolHelpers.field_a) {
              ByteArrayPoolHelpers.field_a = new LobbyGame(UrlAndReplyHelpers.field_a);
            }
          }
          if (3 != var2) {
            LoadoutHelpers.field_f = false;
            return;
          }
          LoadoutHelpers.field_f = true;
          for (var3Lifetime2 = 0; var3Lifetime2 < AngleHelpers.field_i.length; var3Lifetime2++) {
            AngleHelpers.field_i[var3Lifetime2] = ((PacketBuffer) ((Object) var1)).readByte((byte) -2);
          }
          CachedArchiveProvider.field_l = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -93);
          GameplayController.field_L = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -59);
          for (var3Lifetime3 = 0; var3Lifetime3 < ImageProducerRasterBuffer.field_s.length; var3Lifetime3++) {
            ImageProducerRasterBuffer.field_s[var3Lifetime3] = ((PacketBuffer) ((Object) var1)).readByte((byte) -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var1_ref), "in.D(" + param0 + ')');
        }
    }

    final static PaletteBitmapFont loadPaletteFont(ResourceArchive param0, int param1, int param2, ResourceArchive param3, int param4) {
        RuntimeException var5 = null;
        PaletteBitmapFont stackIn_5_0 = null;
        PaletteBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!StatefulTextPainter.loadSpriteSheet((byte) 30, param2, param4, param3)) {
            return null;
          }
          if (param1 >= 97) {
            stackIn_7_0 = WeightedLruCache.createPaletteFont(param0.getFile(param4, (byte) 38, param2), 7045);
            return stackIn_7_0;
          }
          stackIn_5_0 = (PaletteBitmapFont) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("in.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void updateWorldMenuLabel(int param0) {
        int var2 = SteelSentinels.obfuscationControl;
        if ((BoundedUrlRequest.field_i.world.field_V & 1 << SessionSeedHelpers.field_j) != 0) {
          ImageProducerRasterBuffer.field_A[10] = GameplayController.field_m;
        } else {
          if (BoundedUrlRequest.field_i.world.field_V == 0) {
            ImageProducerRasterBuffer.field_A[10] = NotificationMessage.field_s;
          } else {
            ImageProducerRasterBuffer.field_A[10] = ChatPanelSetupHelpers.field_e;
          }
        }
        if (param0 != 2) {
          SocialPacketHelpers.unpackChatFilterSettings((byte) 41, 86);
        }
    }

    final static void unpackChatFilterSettings(byte param0, int param1) {
        BufferedSocket.field_c = (param1 & 63) >> 4;
        LoginForm.field_Z = 3 & param1 >> 2;
        if (BufferedSocket.field_c > 2) {
          BufferedSocket.field_c = 2;
        }
        CachedArchiveProvider.field_y = 3 & param1;
        if (!(LoginForm.field_Z <= 2)) {
          LoginForm.field_Z = 2;
        }
        if (!(CachedArchiveProvider.field_y <= 2)) {
          CachedArchiveProvider.field_y = 2;
        }
        if (param0 <= 16) {
          field_g = (int[]) null;
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_c = null;
        field_f = null;
        int var1 = -59 % ((28 - param0) / 63);
        field_d = null;
        field_b = (String[][]) null;
        field_j = null;
        field_g = null;
    }

    static {
        field_j = new int[]{107, 83, 24, 24, 35, -1, -1, -1, -1, -1, -1, -1};
        field_f = "Visit the Account Management section on the main site to view.";
        field_g = new int[]{50, 50};
        field_c = "This game option is only available to members.";
        field_h = 0;
        field_i = field_h;
    }
}
