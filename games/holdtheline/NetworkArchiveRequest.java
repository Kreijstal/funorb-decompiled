/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkArchiveRequest extends ArchiveRequest {
    static String[] field_C;
    static String field_v;
    static ResourceArchive field_y;
    PacketBuffer field_z;
    byte field_B;
    int field_x;
    static FullscreenFocusCanvas field_w;
    static String field_A;

    final static int processAccountRequest(int param0, int param1, int param2, AccountFormText param3, boolean param4, String param5, AccountFormText param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        PacketBuffer stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String stackIn_19_2 = null;
        PacketBuffer stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_22_2 = null;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = HoldTheLine.field_D;
        try {
          var14 = param3.getText((byte) -41);
          var8 = param6.getText((byte) -41);
          if (param0 != 65500) {
            NetworkArchiveRequest.recordBestCourseTime(-108, 25, 4, -53, -46);
          }
          if (null == IterableSecondaryNodeDeque.field_h &&
            !ShadedRoadStripRenderer.pollAccountConnection(false, (byte) 105)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (AccountCreationForm.field_S == AccountProtocolContext.field_f) {
            RoadSegment.field_u = null;
            IsaacPacketBuffer.field_p.position = 0;
            if (param5 == null) {
              SecondaryNodeDequeIterator.field_a.position = 0;
              SecondaryNodeDequeIterator.field_a.writeInt((byte) -58, BoundaryIntersection.field_n.nextInt());
              SecondaryNodeDequeIterator.field_a.writeInt((byte) -58, BoundaryIntersection.field_n.nextInt());
              stackIn_18_0 = SecondaryNodeDequeIterator.field_a;
              stackIn_18_1 = 29336;
              if (!param3.shouldSubmitText((byte) -80)) {
                stackIn_19_2 = "";
              } else {
                stackIn_19_2 = var14;
              }
              ((PacketBuffer) (Object) stackIn_18_0).writePrefixedCp1252String(stackIn_18_1, stackIn_19_2);
              stackIn_21_0 = SecondaryNodeDequeIterator.field_a;
              stackIn_21_1 = 29336;
              if (!param6.shouldSubmitText((byte) -82)) {
                stackIn_22_2 = "";
              } else {
                stackIn_22_2 = var8;
              }
              ((PacketBuffer) (Object) stackIn_21_0).writePrefixedCp1252String(stackIn_21_1, stackIn_22_2);
              IsaacPacketBuffer.field_p.writeByte(111, 16);
              IsaacPacketBuffer.field_p.position = IsaacPacketBuffer.field_p.position + 1;
              var9 = IsaacPacketBuffer.field_p.position;
              ClientMenuBootstrap.writeEncryptedPacket(false, ArchiveProvider.field_a, SecondaryNodeDequeIterator.field_a, IsaacPacketBuffer.field_p, EmailAddressValidator.field_k);
              IsaacPacketBuffer.field_p.backpatchByteLength(-268435456, IsaacPacketBuffer.field_p.position - var9);
            } else {
              var9 = 0;
              if (param4) {
                var9 = var9 | 1;
              }
              SecondaryNodeDequeIterator.field_a.position = 0;
              SecondaryNodeDequeIterator.field_a.writeInt((byte) -58, BoundaryIntersection.field_n.nextInt());
              SecondaryNodeDequeIterator.field_a.writeInt((byte) -58, BoundaryIntersection.field_n.nextInt());
              SecondaryNodeDequeIterator.field_a.writePrefixedCp1252String(29336, var14);
              SecondaryNodeDequeIterator.field_a.writePrefixedCp1252String(param0 - 36164, var8);
              var15 = (CharSequence) ((Object) param5);
              SecondaryNodeDequeIterator.field_a.writePrefixedCp1252String(29336, AccountProtocolContext.normalizePassword(90, var15));
              SecondaryNodeDequeIterator.field_a.writeShort(-652561784, param2);
              SecondaryNodeDequeIterator.field_a.writeByte(111, param1);
              SecondaryNodeDequeIterator.field_a.writeByte(111, var9);
              IsaacPacketBuffer.field_p.writeByte(111, 18);
              IsaacPacketBuffer.field_p.position = IsaacPacketBuffer.field_p.position + 2;
              var10 = IsaacPacketBuffer.field_p.position;
              var11_ref_String = ArchiveCompression.readSettingsCookie((byte) -88, GameKeyHandler.getApplet(114));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              IsaacPacketBuffer.field_p.writeCp1252String(-124, var11_ref_String);
              ClientMenuBootstrap.writeEncryptedPacket(false, ArchiveProvider.field_a, SecondaryNodeDequeIterator.field_a, IsaacPacketBuffer.field_p, EmailAddressValidator.field_k);
              IsaacPacketBuffer.field_p.backpatchShortLength(-29190, -var10 + IsaacPacketBuffer.field_p.position);
            }
            PlayerStatsRequest.flushServerPackets(-1, 0);
            AccountProtocolContext.field_f = TrackObject.field_U;
          }
          if (TrackObject.field_U == AccountProtocolContext.field_f &&
            InheritedWidgetStyle.readServerBytes(1, (byte) 40)) {
            var9Lifetime1 = RoadStripRenderer.field_e.readUnsignedByte((byte) -56);
            RoadStripRenderer.field_e.position = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              IsaacRandom.field_h = new String[var9Lifetime1 - 100];
              AccountProtocolContext.field_f = TutorialAction.field_f;
            } else {
              if (248 == var9Lifetime1) {
                RaceVehicle.writeLegacySessionCookie(-1848651292, GameKeyHandler.getApplet(106));
                Cp1252CharacterRules.field_b = LabeledField.field_N;
                ServerConnectionState.closeServerConnection(-28036);
                ProxyAuthenticationException.field_e = false;
                stackIn_35_0 = var9Lifetime1;
                return stackIn_35_0;
              }
              if (var9Lifetime1 == 99) {
                InheritedWidgetStyle.readServerBytes(GrowableStringList.getAccountResponseHeaderSize((byte) 115), (byte) 40);
                RoadSegment.field_u = new Boolean(WidgetContainer.readBoolean(RoadStripRenderer.field_e, (byte) 87));
                RoadStripRenderer.field_e.position = 0;
              } else {
                NineSlicePanel.field_c = var9Lifetime1;
                ReflectionCheckSupport.field_c = -1;
                AccountProtocolContext.field_f = GameMenu.field_x;
              }
            }
          }
          if (TutorialAction.field_f == AccountProtocolContext.field_f) {
            var9Lifetime2 = 2;
            if (InheritedWidgetStyle.readServerBytes(var9Lifetime2, (byte) 40)) {
              var10Lifetime1 = RoadStripRenderer.field_e.readUnsignedShort(115);
              RoadStripRenderer.field_e.position = 0;
              if (InheritedWidgetStyle.readServerBytes(var10Lifetime1, (byte) 40)) {
                var11 = IsaacRandom.field_h.length;
                for (var12 = 0; var11 > var12; var12++) {
                  IsaacRandom.field_h[var12] = RoadStripRenderer.field_e.readPrefixedCp1252String(true);
                }
                ServerConnectionState.closeServerConnection(-28036);
                ProxyAuthenticationException.field_e = false;
                stackIn_45_0 = 100 + var11;
                return stackIn_45_0;
              }
            }
          }
          if (AccountProtocolContext.field_f == GameMenu.field_x &&
            TutorialTransition.readPacketPayload((byte) 55)) {
            if (255 != NineSlicePanel.field_c) {
              Cp1252CharacterRules.field_b = RoadStripRenderer.field_e.readCp1252String(param0 ^ -64275);
            } else {
              var9_ref_String = RoadStripRenderer.field_e.readNullableCp1252String(-1);
              if (var9_ref_String != null) {
                IntrusiveDequeCursor.writeSettingsCookie(param0 - 97812, var9_ref_String, GameKeyHandler.getApplet(116));
              }
            }
            ServerConnectionState.closeServerConnection(param0 ^ -37472);
            ProxyAuthenticationException.field_e = false;
            stackIn_54_0 = NineSlicePanel.field_c;
            return stackIn_54_0;
          }
          if (IterableSecondaryNodeDeque.field_h == null) {
            if (ProxyAuthenticationException.field_e) {
              if (ImageProducerRasterBuffer.millisSinceServerActivity(123) > 30000L) {
                Cp1252CharacterRules.field_b = SpriteButtonRenderer.field_y;
              } else {
                Cp1252CharacterRules.field_b = ContentTransitionDialog.field_hb;
              }
              ProxyAuthenticationException.field_e = false;
              stackIn_61_0 = 249;
              return stackIn_61_0;
            }
            var9Lifetime3 = SpriteDecodeGlobals.field_e;
            SpriteDecodeGlobals.field_e = ArchiveCatalog.field_b;
            ArchiveCatalog.field_b = var9Lifetime3;
            ProxyAuthenticationException.field_e = true;
          }
          stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("cc.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param6 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final byte[] getData(int param0) {
        if (this.field_u) {
          throw new RuntimeException();
        }
        if (this.field_z.position >= -this.field_B + this.field_z.payload.length) {
          if (param0 != -20324) {
            this.field_B = (byte) -63;
          }
          return this.field_z.payload;
        }
        throw new RuntimeException();
    }

    final static void submitChampionshipScores(int[] param0, byte param1, int param2) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var11 = null;
        int[] var14 = null;
        int var4Lifetime1;
        var7 = HoldTheLine.field_D;
        try {
          if (null != PathWaypoint.field_o) {
            return;
          }
          var11 = new int[param0.length + 1];
          var9 = var11;
          var8 = var9;
          var14 = var8;
          var11[0] = 0;
          if (param1 != -89) {
            return;
          }
          for (var4 = 0; param0.length > var4; var4++) {
            if (param0[var4] <= 0) {
              return;
            }
            var8[1 + var4] = param0[var4];
            var8[0] = var8[0] - param0[var4];
          }
          var6 = param2;
          if (0 != var6) {
            if (var6 != 1) {
              if (var6 == 2) {
                var4Lifetime1 = 33;
                var5 = 65502;
              } else {
                if (3 != var6) {
                  throw new RuntimeException();
                }
                var5 = 65500;
                var4Lifetime1 = 35;
              }
            } else {
              var5 = 65501;
              var4Lifetime1 = 34;
            }
          } else {
            var4Lifetime1 = 32;
            var5 = 65503;
          }
          PathWaypoint.field_o = new ScoreSubmission(var4Lifetime1, var5, LayeredWidgetStyle.field_d, InterfaceLoadingStatus.field_b, MenuHitTesting.field_a, GrowableStringList.field_c, var14);
          if (!CollisionGeometry.field_b &&
            !RoadShadowRenderer.isGuestMode((byte) 109)) {
            LinkWidgetRenderer.queueScoreSubmission(3, (byte) -37, PathWaypoint.field_o);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("cc.G(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void ensurePlayerStatsCapacity(int param0, boolean param1, int param2) {
        if (ClientTextResources.field_a == null ||
          !(ClientTextResources.field_a.length >= param0)) {
          ClientTextResources.field_a = new int[param0 * 2];
        }
        if (SpriteSheetAsset.field_j == null ||
          !(param0 <= SpriteSheetAsset.field_j.length)) {
          SpriteSheetAsset.field_j = new int[param0 * 2];
        }
        if (IsaacPacketBuffer.field_u == null ||
          !(IsaacPacketBuffer.field_u.length >= param0)) {
          IsaacPacketBuffer.field_u = new int[2 * param0];
        }
        if (null == QuadraticPathSlicer.field_c ||
          !(QuadraticPathSlicer.field_c.length >= param0)) {
          QuadraticPathSlicer.field_c = new int[2 * param0];
        }
        if (WidgetStyleNode.field_q == null ||
          !(WidgetStyleNode.field_q.length >= param0)) {
          WidgetStyleNode.field_q = new int[2 * param0];
        }
        if (NetworkGameClient.field_s == null ||
          !(param0 <= NetworkGameClient.field_s.length)) {
          NetworkGameClient.field_s = new int[param0 * 2];
        }
        if (null == IterableNodeHashTable.field_h ||
          !(param2 + param0 <= IterableNodeHashTable.field_h.length)) {
          IterableNodeHashTable.field_h = new int[2 * (param2 + param0)];
        }
        if (null == GrowableStringList.field_d ||
          !(param0 <= GrowableStringList.field_d.length)) {
          GrowableStringList.field_d = new boolean[2 * param0];
        }
        ServerConnectionState.field_c = -2147483648;
        VehicleDefinition.field_t = -2147483648;
        MatchingTextValidator.field_j = 2147483647;
        if (param1) {
          return;
        }
        SavedRasterState.field_j = 2147483647;
        Vector2f.field_h = 0;
    }

    public static void clearSharedReferences(int param0) {
        field_C = null;
        field_A = null;
        field_y = null;
        field_w = null;
        field_v = null;
        int var1 = 108 % ((-30 - param0) / 35);
    }

    final static void recordBestCourseTime(int param0, int param1, int param2, int param3, int param4) {
        if (RoadControlPathBuilder.field_c[param1][param2] == -1 ||
          RoadControlPathBuilder.field_c[param1][param2] > param3) {
          RoadControlPathBuilder.field_c[param1][param2] = param3;
          BoundaryIntersection.field_j[param1][param2] = param0;
          GrowableStringList.savePlayerProgress(0);
        }
        if (param4 >= -107) {
          field_w = (FullscreenFocusCanvas) null;
        }
    }

    NetworkArchiveRequest() {
    }

    final int getProgress(int param0) {
        if (param0 != 0) {
          return 123;
        }
        if (this.field_z != null) {
          return 100 * this.field_z.position / (this.field_z.payload.length - this.field_B);
        }
        return 0;
    }

    static {
        field_v = "FULL ACCESS";
        field_C = new String[]{"<col=1>Race</col><br><br>To win the race, complete <col=1>8</col> laps before your opponents", "<col=1>Practice</col><br><br>Practise as much as you like without time or lap restrictions", "<col=1>Demolition</col><br><br>Demolish opponents' vehicles to win the game", null, null, null, null, "<col=1>Championship</col><br><br>Play a series of races and compare your best times with your friends"};
        field_A = "<img=6>";
    }
}
