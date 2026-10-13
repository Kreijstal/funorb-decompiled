/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignMenuEntry extends IntrusiveNode {
    int entryId;
    static byte[][] decodedSpriteAlphas;
    NodeHashTable previewUnitCategories;
    int width;
    static int[] field_u;
    int godId;
    String statusText;
    int score;
    RgbSprite previewSprite;
    int highlightProgress;
    boolean selectable;
    int top;
    static int field_F;
    int selectionAge;
    CampaignMission mission;
    static String field_C;
    String title;
    String description;
    int height;
    static String field_E;
    int left;
    RgbSprite highlightSprite;

    public static void a(int param0) {
        decodedSpriteAlphas = (byte[][]) null;
        if (param0 != -101) {
          CampaignMenuEntry.a(-99, -40, -126, (byte) 12, -104);
        }
        field_E = null;
        field_u = null;
        field_C = null;
    }

    final static Class getBoxedPrimitiveType(Object value, byte obfuscationGuard) {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (Integer.class.isInstance(value)) {
            stackIn_2_0 = Integer.TYPE;
            return stackIn_2_0;
          }
          if (obfuscationGuard != -75) {
            stackIn_5_0 = (Class) null;
            return stackIn_5_0;
          }
          if (Byte.class.isInstance(value)) {
            stackIn_8_0 = Byte.TYPE;
            return stackIn_8_0;
          }
          if (Short.class.isInstance(value)) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (Long.class.isInstance(value)) {
            stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (Boolean.class.isInstance(value)) {
            stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (Float.class.isInstance(value)) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (Double.class.isInstance(value)) {
            stackIn_25_0 = Double.TYPE;
            return stackIn_25_0;
          }
          if (!Character.class.isInstance(value)) {
            return null;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("cq.F(");
          if (value == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        int var5 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ChannelBaseVolumeConsoleCommand.field_L = lm.nameCheckComplete;
          if (param1 != -14) {
            CampaignMenuEntry.a(7);
          }
          if (255 == param3) {
            stackIn_11_0 = !(MusicCrossfadeStream.field_z >= 13);
            SoundCache.field_a = dc.a(stackIn_11_0, false);
          } else {
            if (param3 >= 100 &&
              param3 <= 105) {
              SoundCache.field_a = BoundedFile.a(2, param2);
              return;
            }
            SoundCache.field_a = DisplacedUnitMarker.a(-1, param3, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("cq.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 0;
        var3 = PasswordValidator.field_j;
        if (var3 >= 5) {
          if (var3 < 105) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = 8192 - var3 * var3 * 8192 / 3300;
            }
          }
        } else {
          var2 = 8192 * (var3 * var3) / 1100;
        }
        var4 = 1;
        var5 = 0;
        if (1 == param1) {
          var5 = 1;
        }
        if (param1 == 3) {
          var4 = -1;
        }
        if (param1 == 4) {
          var5 = 1;
          var4 = 1;
        }
        if (param0 != -116) {
          CampaignMenuEntry.a((byte) 74, 85);
        }
        if (param1 == 5) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 6) {
          var4 = 1;
          var5 = -1;
        }
        if (param1 == 7 ||
          param1 == 8) {
          var5 = -1;
          var4 = -1;
        }
        if (11 == param1) {
          var4 = -1;
        }
        if (param1 == 12) {
          var5 = -1;
          var4 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (param1 == 14) {
          var4 = -1;
          var5 = 1;
        }
        if (15 == param1) {
          var4 = 1;
          var5 = 1;
        }
        pd.field_a = ek.a(-125, var4 * var2, var2 * var5);
    }

    final static RgbSprite[] a(int param0, int param1, int param2, byte param3, int param4) {
        RgbSprite[] var6 = new RgbSprite[9];
        RgbSprite[] var5 = var6;
        RgbSprite dupTemp$0 = SocialListEntry.a(false, param2, param1);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        RgbSprite dupTemp$1 = SocialListEntry.a(false, param4, param1);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 <= 33) {
          CampaignMenuEntry.a(111);
        }
        if (param0 != 0) {
          var6[4] = SocialListEntry.a(false, param0, 64);
        }
        return var5;
    }

    final boolean containsPoint(int screenX, int screenY, int obfuscationGuard) {
        boolean stackIn_8_0 = false;
        if (obfuscationGuard < 114) {
          this.containsPoint(106, -67, 2);
        }
        stackIn_8_0 = (db.a(true, this.left) <= screenX) && (db.a(true, this.width + this.left) >= screenX) && (screenY >= MatchConditionEntry.a(this.top, (byte) 94)) && (MatchConditionEntry.a(this.height + this.top, (byte) 94) >= screenY);
        return stackIn_8_0;
    }

    CampaignMenuEntry(CampaignMission mission) {
        int playerSlotIndex = 0;
        int availableUnitIndex = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        MapTile[] tiles = null;
        MapTile[] mapTiles = null;
        int tileIndex = 0;
        int unitCategory = 0;
        int unitType = 0;
        int availableCategory = 0;
        MapLayout layout = null;
        MapTile tile = null;
        CampaignParticipant participant = null;
        int[] availableUnits = null;
        int participantId;
        try {
          this.mission = mission;
          this.title = mission.name;
          this.selectionAge = 1073741823;
          this.selectable = false;
          this.entryId = mission.missionId;
          this.previewUnitCategories = new NodeHashTable(16);
          layout = mission.getMapLayout(-114);
          tiles = layout.createTiles(115, (Battlefield) null);
          mapTiles = tiles;
          for (tileIndex = 0; tileIndex < mapTiles.length; tileIndex++) {
            tile = mapTiles[tileIndex];
            if (null != tile.occupant &&
              tile.occupant.ownerPlayer != mission.playerSlot) {
              unitCategory = tile.occupant.getUnitCategory(0);
              if (this.previewUnitCategories.get(-57, (long)unitCategory) == null) {
                this.previewUnitCategories.put(new IntrusiveNode(), (long)unitCategory, 108);
              }
            }
          }
          for (playerSlotIndex = 0; playerSlotIndex < mission.participantIds.length; playerSlotIndex++) {
            participantId = mission.participantIds[playerSlotIndex];
            if (participantId != -1) {
              participant = mission.campaign.participants[participantId];
              if (null != participant.availableUnitTypes) {
                availableUnits = participant.availableUnitTypes;
                for (availableUnitIndex = 0; availableUnits.length > availableUnitIndex; availableUnitIndex++) {
                  unitType = availableUnits[availableUnitIndex];
                  availableCategory = WhirlpoolHasher.unitDefinitions[unitType][0];
                  if (this.previewUnitCategories.get(-96, (long)availableCategory) == null) {
                    this.previewUnitCategories.put(new IntrusiveNode(), (long)availableCategory, 126);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("cq.<init>(");
          if (mission == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    CampaignMenuEntry(int entryId, String title) {
        try {
          this.title = title;
          this.selectionAge = 1073741823;
          this.entryId = entryId;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cq.<init>(" + entryId + ',' + (title != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = 22;
        field_C = "Create unrated game";
        field_E = "Quick Chat game";
    }
}
