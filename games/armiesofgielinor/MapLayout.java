/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MapLayout extends IntrusiveNode {
    private int formatVersion;
    private byte[] encodedMap;
    int mapTheme;
    private MapTile[] decodedTiles;
    int mapWidth;
    static QuickChatCommandDefinition field_q;
    int mapHeight;
    int playerCapacity;
    static MusicTrack currentDirectMusicTrack;
    static String field_m;
    static String field_o;

    final static void acceptReceivedChatMessage(ChatMessage message, int obfuscationGuard) {
        int historyIndex = 0;
        ChatMessage previousMessage = null;
        int obfuscationControl = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == message.text) {
            return;
          }
          if (~message.privateMessageIdHigh16 != obfuscationGuard ||
            0 != message.privateMessageIdLow24) {
            for (historyIndex = 0; BitmapTextWidgetPainter.chatHistorySize > historyIndex; historyIndex++) {
              previousMessage = DefeatPlayerConsoleCommand.chatHistory[historyIndex];
              if (2 == previousMessage.channelId &&
                message.privateMessageIdHigh16 == previousMessage.privateMessageIdHigh16 &&
                previousMessage.privateMessageIdLow24 == message.privateMessageIdLow24) {
                return;
              }
            }
          }
          if (null != message.responsePhraseIds) {
            ValidatedTextWidget.responseTargetAccountId = message.accountId;
            rv.responsePhraseIds = message.responsePhraseIds;
            WeightedScoreStrategy.responseTargetAccountName = message.accountName;
            NumericDateInputWidget.responseTargetChannel = message.channelId;
          }
          SectorCacheStore.appendChatHistory(3208, message);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("lo.D(");
          if (message == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void a(MapTile[] param0, PacketBuffer param1, int param2) {
        int var6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        Unit var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 < 86) {
            return;
          }
          if (param0 == null) {
            return;
          }
          var4_int = param1.readUnsignedByte(0);
          var5 = 0;
          for (var6 = 0; var4_int > var6; var6++) {
            var7 = param1.readUnsignedByte(0);
            var8 = param1.readUnsignedByte(0);
            if (var7 >= 0 &&
              this.mapWidth > var7 &&
              var8 >= 0 &&
              var8 < this.mapHeight) {
              var9 = new Unit(var7, var8, 0);
              var10 = var7 + var8 * this.mapWidth;
              if (0 <= var10 &&
                var10 <= param0.length) {
                param0[var10].occupant = var9;
                param0[var10].occupant.ownerPlayer = var5;
                var5++;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("lo.G(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final int[][] getTerrainGrid(int obfuscationGuard) {
        int var3 = 0;
        int var5 = 0;
        int[][] var2;
        PacketBuffer var3_ref_vh;
        int var4;
        int var6;
        int[][] var7;
        int[][] var8;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var8 = new int[this.mapHeight][this.mapWidth];
        var7 = var8;
        var2 = var7;
        if (this.decodedTiles != null) {
          for (var3 = 0; this.mapHeight > var3; var3++) {
            for (var4 = 0; var4 < this.mapWidth; var4++) {
              var8[var3][var4] = this.decodedTiles[var4 + this.mapWidth * var3].terrainType;
            }
          }
        } else {
          var3_ref_vh = this.readHeader((byte) 126);
          for (var4 = 0; this.mapHeight > var4; var4++) {
            for (var5 = 0; this.mapWidth > var5; var5++) {
              var8[var4][var5] = var3_ref_vh.readUnsignedByte(0);
            }
          }
        }
        if (obfuscationGuard == 28554) {
          return var2;
        }
        return (int[][]) null;
    }

    private final MapTile[] a(int[] param0, int param1, Battlefield param2) {
        int var7 = 0;
        int var8 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        MapTile[] var5 = null;
        int var6 = 0;
        int var9 = 0;
        MapTile[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = this.mapHeight * this.mapWidth;
          if (param1 != 22654) {
            this.getTerrainGrid(117);
          }
          var5 = new MapTile[var4_int];
          var6 = 0;
          for (var7 = 0; this.mapHeight > var7; var7++) {
            for (var8 = 0; var8 < this.mapWidth; var8++) {
              if (var5.length >= var6) {
                var5[var6] = new MapTile(param0[var6], param2);
                if (var5[var6].terrainType == 11) {
                  var5[var6].terrainType = 0;
                }
                var6++;
              }
            }
          }
          stackIn_15_0 = var5;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("lo.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final PacketBuffer readHeader(byte obfuscationGuard) {
        int var5 = 0;
        TaggedMapData var3_ref_sc;
        int var3;
        MapTile[] var4;
        MapTile var6;
        int var7;
        CipherPacketBuffer var8;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.encodedMap.length < 4) {
          return null;
        }
        var8 = new CipherPacketBuffer(this.encodedMap);
        this.formatVersion = bs.a(var8, 3);
        if (obfuscationGuard != 126) {
          this.mapWidth = 72;
        }
        if (this.formatVersion == 2) {
          var3_ref_sc = po.readLengthPrefixedMap(var8, obfuscationGuard - 24046);
          this.mapWidth = var3_ref_sc.mapWidth;
          this.mapTheme = var3_ref_sc.mapTheme;
          this.mapHeight = var3_ref_sc.mapHeight;
          this.decodedTiles = var3_ref_sc.tiles;
          this.playerCapacity = var3_ref_sc.playerCount;
          var4 = this.decodedTiles;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var6.captureStrength = var6.getDefaultCaptureStrength(10);
          }
          return null;
        }
        this.mapWidth = var8.readUnsignedByte(0);
        this.mapHeight = var8.readUnsignedByte(0);
        if (this.formatVersion < 1) {
          this.mapTheme = 0;
        } else {
          this.mapTheme = var8.readUnsignedByte(0);
        }
        if (this.formatVersion >= 0) {
          this.playerCapacity = var8.readUnsignedByte(0);
        } else {
          var3 = this.mapWidth * this.mapHeight;
          var8.position = var8.position + var3;
          this.playerCapacity = var8.readUnsignedByte(0);
          var8.position = var8.position - (var3 + 1);
        }
        return (PacketBuffer) ((Object) var8);
    }

    final static void addCustomQuickChatOption(QuickChatCategory category, int obfuscationGuard) {
        try {
          category.phraseIds = new int[]{-1};
          category.phraseShortcuts = new char[]{(char)63};
          if (obfuscationGuard != 19003) {
            QuickChatCategory var3 = (QuickChatCategory) null;
            MapLayout.addCustomQuickChatOption((QuickChatCategory) null, 21);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lo.A(" + (category != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
          ResourceArchive var2 = (ResourceArchive) null;
          MapLayout.loadIndexedSpritesByName((String) null, 125, (String) null, (ResourceArchive) null);
        }
        currentDirectMusicTrack = null;
        field_q = null;
        field_m = null;
    }

    final static IndexedSprite[] loadIndexedSpritesByName(String fileName, int obfuscationGuard, String groupName, ResourceArchive archive) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite[] stackIn_2_0 = null;
        IndexedSprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -28106) {
            stackIn_2_0 = (IndexedSprite[]) null;
            return stackIn_2_0;
          }
          var4_int = archive.getGroupId(groupName, 110);
          var5 = archive.getFileId((byte) -74, var4_int, fileName);
          stackIn_4_0 = BitmapTextLayout.a(var5, archive, 0, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("lo.H(");
          if (fileName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (archive == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final MapTile[] createTiles(int obfuscationGuard, Battlefield battlefield) {
        PacketBuffer discarded$0 = null;
        int var4_int = 0;
        int var7_int = 0;
        int var10 = 0;
        MapTile[] stackIn_12_0 = null;
        MapTile[] stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        MapTile[] var3 = null;
        RuntimeException var3_ref = null;
        PacketBuffer var4 = null;
        int var5 = 0;
        MapTile var5_ref_ne = null;
        int[] var6 = null;
        MapTile[] var7 = null;
        int var8 = 0;
        tf var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        MapTile var13 = null;
        Unit var14 = null;
        int var15 = 0;
        MapTile[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null != this.decodedTiles) {
            discarded$0 = this.readHeader((byte) 126);
            var16 = this.decodedTiles;
            var3 = var16;
            for (var4_int = 0; var4_int < var16.length; var4_int++) {
              var5_ref_ne = var16[var4_int];
              var5_ref_ne.a((byte) -68, battlefield);
              if (var5_ref_ne.hasModifierFlag4((byte) -122) &&
                var5_ref_ne.getTag((byte) -107) == 0) {
                var5_ref_ne.setTag(true, 1);
              }
            }
            stackIn_12_0 = this.decodedTiles;
            return stackIn_12_0;
          }
          var3_int = 116 % ((obfuscationGuard + 31) / 60);
          var4 = this.readHeader((byte) 126);
          var5 = this.mapHeight * this.mapWidth;
          var18 = new int[var5];
          var17 = var18;
          var6 = var17;
          if (2 + var5 > this.encodedMap.length) {
            throw new RuntimeException("Problem loading file");
          }
          for (var7_int = 0; var5 > var7_int; var7_int++) {
            var6[var7_int] = var4.readUnsignedByte(0);
          }
          var7 = this.a(var18, 22654, battlefield);
          if (0 <= this.formatVersion) {
            var8 = var4.readUnsignedByte(0);
            var9 = new tf(0, 0);
            for (var10 = 0; var8 > var10; var10++) {
              var11 = var4.readUnsignedByte(0);
              var12 = var11;
              if (var12 == 0) {
                var9.field_n = var4.readUnsignedByte(0);
                var9.field_o = var4.readUnsignedByte(0);
                var12 = var4.readUnsignedByte(0);
                var13_int = var4.readUnsignedByte(0);
                var14 = new Unit(var9.field_n, var9.field_o, var12);
                var14.ownerPlayer = var13_int;
                var7[var9.field_o * this.mapWidth + var9.field_n].occupant = var14;
              } else {
                if (1 != var12) {
                  throw new RuntimeException("Illegal saved item type: " + var11);
                }
                var9.field_n = var4.readUnsignedByte(0);
                var9.field_o = var4.readUnsignedByte(0);
                var12 = var4.readUnsignedByte(0);
                var13 = var7[var9.field_n + var9.field_o * this.mapWidth];
                if (var13.isStructure(false) ||
                  var13.hasModifierFlag4((byte) -125)) {
                  var13.ownerPlayer = var12;
                }
              }
            }
          } else {
            this.a(var7, var4, 105);
          }
          stackIn_34_0 = var7;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_37_0 = var3_ref;
          stackIn_37_1 = new StringBuilder().append("lo.E(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    MapLayout(int suppliedMapId, byte[] encodedMap) {
        PacketBuffer discarded$0 = null;
        try {
          this.encodedMap = encodedMap;
          this.decodedTiles = null;
          discarded$0 = this.readHeader((byte) 126);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lo.<init>(" + suppliedMapId + ',' + (encodedMap != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new QuickChatCommandDefinition(12, 0, 1, 0);
        field_m = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_o = "Logging in...";
    }
}
