/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BattleGraphicsAssets {
    static String decodedChatText;
    static String field_a;
    static int field_c;
    private ResourceArchive basicArchive;

    final static void b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        int var1;
        int var2;
        int var1Lifetime1;
        int var2Lifetime1;
        if (kd.field_X < 0) {
          uk.field_q = -1;
          return;
        }
        if (param0 == -61) {
          var1 = 352;
          stackIn_12_0 = SectorCacheStore.field_j[kd.field_X].length;
          stackIn_13_1 = (od.field_c[kd.field_X]) ? 1 : 0;
          var2 = stackIn_12_0 + stackIn_13_1;
          var2 = (var2 / 2 + var2 % 2) * 80;
          if (-80 + (var1 + 8) >= var2) {
            uk.field_q = -1;
          } else {
            uk.field_q = 8 + (var2 - var1 + 80);
          }
          return;
        }
        BattleGraphicsAssets.a(38);
        var1Lifetime1 = 352;
        stackIn_5_0 = SectorCacheStore.field_j[kd.field_X].length;
        stackIn_6_1 = (od.field_c[kd.field_X]) ? 1 : 0;
        var2Lifetime1 = stackIn_5_0 + stackIn_6_1;
        var2Lifetime1 = (var2Lifetime1 / 2 + var2Lifetime1 % 2) * 80;
        if (-80 + (var1Lifetime1 + 8) >= var2Lifetime1) {
          uk.field_q = -1;
        } else {
          uk.field_q = 8 + (var2Lifetime1 - var1Lifetime1 + 80);
        }
    }

    final static String a(int param0) {
        String var1 = "";
        if (param0 <= -69) {
          if (null != ContextActionMenu.field_Qb) {
            var1 = ContextActionMenu.field_Qb.m(-15056);
          }
          if (var1.length() == 0) {
            var1 = rn.b(true);
          }
          if (var1.length() == 0) {
            var1 = ko.field_a;
          }
          return var1;
        }
        field_a = (String) null;
        if (null != ContextActionMenu.field_Qb) {
          var1 = ContextActionMenu.field_Qb.m(-15056);
        }
        if (var1.length() == 0) {
          var1 = rn.b(true);
        }
        if (var1.length() == 0) {
          var1 = ko.field_a;
        }
        return var1;
    }

    public static void a(byte param0) {
        decodedChatText = null;
        field_a = null;
        if (param0 != -12) {
          field_a = (String) null;
        }
    }

    final void selectTheme(int themeId, int minimumThemeIdToRelease) {
        BattlefieldTheme previousTheme = null;
        BattlefieldTheme nextTheme = null;
        BattlefieldTheme previousAlias = null;
        BattlefieldTheme nextAlias;
        if (themeId != mk.currentThemeId) {
          if (!(minimumThemeIdToRelease > mk.currentThemeId)) {
            previousTheme = UnitLossCondition.battlefieldThemes[mk.currentThemeId];
            previousAlias = previousTheme;
            previousTheme.releaseSprites(0);
          }
          nextTheme = UnitLossCondition.battlefieldThemes[themeId];
          nextAlias = nextTheme;
          nextAlias.loadSpriteSheets((byte) -118);
          ac.activeTerrainSprites = nextAlias.terrainSprites;
          tn.activeFoliageShadows = nextAlias.foliageShadowSprites;
          nr.activeFoliageSprites = nextAlias.foliageSprites;
          mk.currentThemeId = themeId;
          l.activeStructureSprites = nextAlias.structureSprites;
          oq.activeStructureShadows = nextTheme.structureShadowSprites;
          dd.activeTerrainSample = ac.activeTerrainSprites[1].toRgbSprite();
          return;
        }
    }

    final void loadBasicSprites(int obfuscationGuard) {
        int spriteIndex = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        LobbyPlayer.cannotMoveSprites = MapLayout.loadIndexedSpritesByName("cantmove", -28106, "basic", this.basicArchive);
        bk.attackTargetSprites = MapLayout.loadIndexedSpritesByName("attacktargets", -28106, "basic", this.basicArchive);
        hq.surroundTileSprites = MapLayout.loadIndexedSpritesByName("surround_tiles", -28106, "basic", this.basicArchive);
        vf.smokeSprites = fk.loadRgbSpritesByName("smoke", (byte) -124, this.basicArchive, "basic");
        SetCoatConsoleCommand.kalphiteSprites = fk.loadRgbSpritesByName("kalphites", (byte) -124, this.basicArchive, "basic");
        for (spriteIndex = obfuscationGuard; SetCoatConsoleCommand.kalphiteSprites.length > spriteIndex; spriteIndex++) {
          SetCoatConsoleCommand.kalphiteSprites[spriteIndex].normalizeCanvas();
        }
        ConsoleTokenCursor.boneSprites = MapLayout.loadIndexedSpritesByName("bones", obfuscationGuard - 28106, "basic", this.basicArchive);
        wf.boneShadowSprites = fk.loadRgbSpritesByName("boneshadows", (byte) -124, this.basicArchive, "basic");
        TeamRoster.playerRingSprite = DiskCacheRequest.loadRgbSpriteByName("player_ring", "basic", this.basicArchive, false);
        ModalDialog.groundShadowSprite = fk.loadRgbSpritesByName("shadows", (byte) -128, this.basicArchive, "basic")[0];
    }

    BattleGraphicsAssets(ResourceArchive basicArchive) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.basicArchive = basicArchive;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("dg.<init>(");
          if (basicArchive == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_a = "Temple";
        field_c = 0;
    }
}
