/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerStats implements PopupCard {
    static String field_d;
    static ResourceArchive field_m;
    int archetype;
    int initialIndex;
    int appearance;
    static char[] field_a;
    static double field_f;
    int speed;
    boolean field_c;
    static int field_p;
    int power;
    int surnameIndex;
    int[] trinketIds;
    int tackle;
    static ResourceArchive field_k;
    static long field_b;
    int field_i;
    int experience;

    final boolean usesRangerAbilities(boolean param0, int param1) {
        int[] var7 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param0) {
          var7 = this.trinketIds;
          int[] var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (GeneratedPanelPainter.field_g[var5].isRangerClone(-32076)) {
              return true;
            }
          }
        }
        if (param1 > -59) {
          return false;
        }
        return 3 == this.archetype ? true : false;
    }

    final boolean hasSlalom(boolean param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param1 != 100) {
          this.getTackleStunBonus(false, false);
        }
        if (!param0) {
          return false;
        }
        int[] var7 = this.trinketIds;
        int[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (GeneratedPanelPainter.field_g[var5].isSlalom(false)) {
            return true;
          }
        }
        return false;
    }

    final void copyFrom(byte param0, PlayerStats param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var4 = Kickabout.field_G;
        try {
          if (param1.isEmpty(-2)) {
            this.clear((byte) -7);
            return;
          }
          this.experience = param1.experience;
          this.archetype = param1.archetype;
          this.speed = param1.speed;
          this.tackle = param1.tackle;
          this.power = param1.power;
          this.surnameIndex = param1.surnameIndex;
          this.initialIndex = param1.initialIndex;
          if (param1.trinketIds.length == this.trinketIds.length) {
            for (var3_int = 0; this.trinketIds.length > var3_int; var3_int++) {
              this.trinketIds[var3_int] = param1.trinketIds[var3_int];
            }
          } else {
            this.trinketIds = new int[param1.trinketIds.length];
            var5 = 0;
            var3_int = var5;
            while (this.trinketIds.length > var5) {
              this.trinketIds[var5] = param1.trinketIds[var5];
              var5++;
            }
          }
          if (param0 >= -56) {
            field_p = -88;
          }
          this.appearance = param1.appearance;
          this.field_c = param1.field_c;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("up.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean areTrinketsDisabled(int param0) {
        if (this.field_i == 0) {
          return TextFieldValidator.areAccountTrinketsDisabled(-1);
        }
        if (param0 != 13467) {
          return true;
        }
        return this.field_i == 1 ? true : false;
    }

    final boolean isEmpty(int param0) {
        if (param0 != -2) {
          PacketBuffer var3 = (PacketBuffer) null;
          this.readFromPacket(-56, (PacketBuffer) null);
        }
        if (this.archetype != -1) {
          return false;
        }
        return true;
    }

    final int effectiveTackle(boolean param0, int param1) {
        int var3 = param1;
        var3 = var3 + this.tackle;
        var3 = var3 + this.trinketTackleBonus((byte) 64, param0);
        return var3;
    }

    final static void sendLobbyGamePreferences(int param0, int param1) {
        CipherPacketBuffer var2 = FootballerAiOverlaySupport.field_d;
        var2.writeIsaacByte(param0, (byte) 85);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        var2.writeByte(112, 2);
        var2.writeBytes(param1, TextHotspotRegion.field_h.length, param1 ^ 1991220144, TextHotspotRegion.field_h);
        var2.writeByte(param1 ^ 124, ConsoleExpression.field_l);
        var2.writeByte(124, MidiPcmStream.field_C);
        var2.writeBytes(0, SocialTabsPanel.field_d.length, param1 + 1991220144, SocialTabsPanel.field_d);
        var2.backpatchByteLength(62, -var3 + var2.field_n);
    }

    final void readFromPacket(int param0, PacketBuffer param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int var5Lifetime1;
        var6 = Kickabout.field_G;
        try {
          param1.readUnsignedByte((byte) -126);
          this.archetype = (7 & param1.readUnsignedByte((byte) -127)) - 1;
          this.appearance = param1.readUnsignedShort((byte) 81);
          this.initialIndex = param1.readUnsignedByte((byte) -112);
          this.surnameIndex = param1.readUnsignedByte((byte) -118);
          this.power = param1.readUnsignedByte((byte) -122);
          this.speed = param1.readUnsignedByte((byte) -119);
          this.tackle = param1.readUnsignedByte((byte) -126);
          if (param0 <= 13) {
            return;
          }
          this.experience = param1.readUnsignedByte((byte) -124);
          var10 = new int[3];
          var9 = var10;
          var7 = var9;
          var3 = var7;
          var4 = 0;
          for (var5 = 0; var5 < 3; var5++) {
            var7[var5] = -1 + param1.readUnsignedByte((byte) -122);
            if (var10[var5] != -1) {
              var4++;
            }
          }
          this.trinketIds = new int[var4];
          var8 = 0;
          var5Lifetime1 = var8;
          while (var4 > var8) {
            this.trinketIds[var8] = var10[var8];
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("up.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int trinketTackleBonus(byte param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        int var6Lifetime1;
        if (!param1) {
          return 0;
        }
        int var3 = 0;
        int[] var4 = this.trinketIds;
        for (var5 = 0; var5 < var4.length; var5++) {
          var6 = var4[var5];
          var3 = var3 + GeneratedPanelPainter.field_g[var6].tackleBonus(126);
        }
        var6Lifetime1 = 19 % ((10 - param0) / 50);
        return var3;
    }

    final boolean hasShinPads(boolean param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param1 >= -103) {
          return false;
        }
        if (!param0) {
          return false;
        }
        int[] var7 = this.trinketIds;
        int[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (GeneratedPanelPainter.field_g[var5].isShinPads(-21636)) {
            return true;
          }
        }
        return false;
    }

    final boolean hasCheatTrinket(boolean param0, int param1, boolean param2) {
        int var5 = 0;
        int[] var4;
        int var6;
        Trinket var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        var8 = Kickabout.field_G;
        if (!param2) {
          return false;
        }
        var11 = this.trinketIds;
        var10 = var11;
        var9 = var10;
        var4 = var9;
        if (!param0) {
          this.getDisplayName(114);
        }
        for (var5 = 0; var11.length > var5; var5++) {
          var6 = var11[var5];
          var7 = GeneratedPanelPainter.field_g[var6];
          if (param1 == 0 &&
            var7.isWhereAmI(true)) {
            return true;
          }
          if (1 == param1 &&
            var7.isMushroom(2688)) {
            return true;
          }
          if (2 == param1 &&
            var7.isMoonwalk(65)) {
            return true;
          }
          if (param1 == 3 &&
            var7.isAirplane((byte) 58)) {
            return true;
          }
          if (param1 == 4 &&
            var7.isAtomBall(70)) {
            return true;
          }
          if (param1 == 5 &&
            var7.isTramline((byte) 113)) {
            return true;
          }
          if (param1 == 6 &&
            var7.isTorquing(false)) {
            return true;
          }
          if (param1 == 7 &&
            var7.isMoonball(70)) {
            return true;
          }
          if (param1 == 8 &&
            var7.isAsteroid(true)) {
            return true;
          }
          if (param1 == 9 &&
            var7.isPumpkins(114)) {
            return true;
          }
        }
        return false;
    }

    public final int getHeight(int param0) {
        if (param0 != 15) {
          this.areTrinketsDisabled(71);
        }
        return this.getDetailsPanelHeight(false, false, (byte) 91);
    }

    final int getHighestBaseStat(byte param0) {
        int var2 = 0;
        if (var2 < this.power) {
          var2 = this.power;
        }
        if (param0 < 32) {
          field_p = 7;
        }
        if (var2 < this.speed) {
          var2 = this.speed;
        }
        if (this.tackle > var2) {
          var2 = this.tackle;
        }
        return var2;
    }

    final static void finishUiTransitions(int param0) {
        if (RankingsRequest.field_l != null) {
          RankingsRequest.field_l.finishModalAnimations(param0 ^ -5172);
        }
        if (param0 != -1456) {
          PlayerStats.releaseStatics(3);
        }
        if (null != AnimationClip.field_d) {
          AnimationClip.field_d.stopProgressAnimation(param0 ^ 1496);
        }
        FixedVelocitySupport.resetTooltipTracking((byte) 127);
    }

    final void writeToPacket(byte param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          param1.writeByte(param0 ^ 78, 1);
          if (param0 != 40) {
            this.drawDetailsPanel((byte) 59, -29, true, 95, 97, 106, -90, true);
          }
          param1.writeByte(param0 + 71, 1 + this.archetype);
          param1.writeShort(-1207444472, this.appearance);
          param1.writeByte(125, this.initialIndex);
          param1.writeByte(115, this.surnameIndex);
          param1.writeByte(104, this.power);
          param1.writeByte(114, this.speed);
          param1.writeByte(104, this.tackle);
          param1.writeByte(107, this.experience);
          for (var3_int = 0; var3_int < 3; var3_int++) {
            if (var3_int >= this.trinketIds.length) {
              param1.writeByte(param0 + 62, 0);
            } else {
              param1.writeByte(125, 1 + this.trinketIds[var3_int]);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("up.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int effectiveSpeed(boolean param0, byte param1) {
        int var3 = 0;
        if (param1 > -81) {
          this.tackle = 81;
        }
        var3 = var3 + this.speed;
        var3 = var3 + this.trinketSpeedBonus(5205, param0);
        return var3;
    }

    final static void setChatPanelY(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        ClientPacketFlushSupport.field_c = param0;
        if (TextPromptDialog.field_Bb != SharedPanelFactory.field_b) {
          var2 = TextPromptDialog.field_Bb * TextPromptDialog.field_Bb;
          var3 = -(SharedPanelFactory.field_b * SharedPanelFactory.field_b) + var2;
          param0 = param0 + var3 * (-param0 + VerticalScrollbar.field_Ab) / var2;
        }
        if (param1 >= -65) {
          PlayerStats.sendLobbyGamePreferences(-79, -94);
        }
        GrayscalePaletteSupport.field_a.setBounds(true, 640, AuctionsHelpScreen.field_H, param0, 120);
        RankingRowNode.layoutChatPanelOverlay(119, PitchAppearanceSupport.field_b, 640, 5, DiskCacheWorker.field_b, VerticalScrollbar.field_Ab - 24, 0);
    }

    final int trinketSpeedBonus(int param0, boolean param1) {
        int var6 = 0;
        int var7 = Kickabout.field_G;
        if (!param1) {
          return 0;
        }
        int var3 = 0;
        int[] var4 = this.trinketIds;
        int var5 = 0;
        if (param0 != 5205) {
          return 76;
        }
        while (var5 < var4.length) {
          var6 = var4[var5];
          var3 = var3 + GeneratedPanelPainter.field_g[var6].speedBonus(param0 - 5102);
          var5++;
        }
        return var3;
    }

    final boolean usesTankAbilities(byte param0, boolean param1) {
        int var4 = 0;
        int[] var3;
        int var5;
        int var6;
        int[] var7;
        boolean stackIn_14_0 = false;
        var6 = Kickabout.field_G;
        if (param0 != 44) {
          return true;
        }
        if (param1) {
          var7 = this.trinketIds;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (GeneratedPanelPainter.field_g[var5].isTankClone(59)) {
              return true;
            }
          }
        }
        stackIn_14_0 = (this.archetype == 0) || (this.archetype == 4);
        return stackIn_14_0;
    }

    final int getTackleStunBonus(boolean param0, boolean param1) {
        int var5 = 0;
        int var3;
        int[] var4;
        int var6;
        int var7;
        var7 = Kickabout.field_G;
        if (!param0) {
          return 0;
        }
        if (param1) {
          this.drawDetailsPanel((byte) -111, 93, false, 15, -32, 70, -71, false);
        }
        var3 = 0;
        var4 = this.trinketIds;
        for (var5 = 0; var4.length > var5; var5++) {
          var6 = var4[var5];
          if (GeneratedPanelPainter.field_g[var6].tackleStunBonus((byte) -124) > var3) {
            var3 = GeneratedPanelPainter.field_g[var6].tackleStunBonus((byte) -122);
          }
        }
        return var3;
    }

    final boolean hasTackleProtection(boolean param0, byte param1) {
        int var4 = 0;
        int[] var3;
        int var5;
        int var6;
        int[] var7;
        var6 = Kickabout.field_G;
        if (param1 > -101) {
          this.experience = -124;
        }
        if (!param0) {
          return false;
        }
        var7 = this.trinketIds;
        var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (GeneratedPanelPainter.field_g[var5].hasTackleProtection(115)) {
            return true;
          }
          if (GeneratedPanelPainter.field_g[var5].isShinPads(-21636)) {
            return true;
          }
        }
        return false;
    }

    final String getDisplayName(int param0) {
        if (this.isEmpty(param0 - 102)) {
          return "Empty";
        }
        if (param0 != 100) {
          this.field_c = false;
        }
        if (this.archetype < 0 ||
          BuyPlayerDialog.field_G.length <= this.archetype ||
          this.surnameIndex < 0 ||
          BuyPlayerDialog.field_G[this.archetype].length <= this.surnameIndex) {
          return "Error";
        }
        String var3 = "";
        String var2 = var3;
        String var6 = var3 + Character.toUpperCase(TrinketCatalog.field_a[this.initialIndex]);
        String var5 = var6 + ". ";
        String var7 = var5;
        var2 = var7 + BuyPlayerDialog.field_G[this.archetype][this.surnameIndex];
        return var2;
    }

    final boolean isSameAs(byte param0, PlayerStats param1) {
        int var3_int = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        try {
          if (this.isEmpty(-2) &&
            param1.isEmpty(-2)) {
            return true;
          }
          if (this.archetype != param1.archetype) {
            return false;
          }
          if (this.surnameIndex != param1.surnameIndex) {
            return false;
          }
          if (param1.initialIndex != this.initialIndex) {
            return false;
          }
          if (param1.power != this.power) {
            return false;
          }
          if (this.experience != param1.experience) {
            return false;
          }
          if (param1.tackle != this.tackle) {
            return false;
          }
          if (this.speed != param1.speed) {
            return false;
          }
          if (this.trinketIds.length != param1.trinketIds.length) {
            return false;
          }
          for (var3_int = 0; var3_int < this.trinketIds.length; var3_int++) {
            if (param1.trinketIds[var3_int] != this.trinketIds[var3_int]) {
              return false;
            }
          }
          if (param0 != -98) {
            return false;
          }
          if (this.appearance != param1.appearance) {
            return false;
          }
          if (param1.field_c == this.field_c) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_54_0 = var3;
          stackIn_54_1 = new StringBuilder().append("up.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    public final void drawCentered(int param0, int param1, int param2) {
        ClubState var7 = null;
        if (this.isEmpty(-2)) {
          return;
        }
        if (param1 != 23) {
          this.getHighestBaseStat((byte) -63);
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (!this.field_c) {
          var7 = GameLoopApplet.field_E;
          var4 = var7.field_w;
          var6 = var7.field_R;
          var5 = var7.field_k;
        }
        this.drawDetailsPanel((byte) 70, -(this.getWidth(0) >> 1) + param2, false, var6, var4, var5, -(this.getHeight(param1 ^ 24) >> 1) + param0, false);
    }

    final void clear(byte param0) {
        this.initialIndex = 0;
        this.archetype = -1;
        this.experience = 0;
        this.appearance = 0;
        this.trinketIds = new int[]{};
        this.surnameIndex = 0;
        this.speed = 0;
        this.power = 0;
        this.tackle = 0;
        if (param0 != -7) {
          this.initialIndex = -14;
        }
    }

    final boolean hasActiveHorrorCostume(byte param0, boolean param1) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (!param1) {
          return false;
        }
        int[] var3 = this.trinketIds;
        int var4 = 0;
        if (param0 != -107) {
          this.initialIndex = 84;
        }
        while (var3.length > var4) {
          var5 = var3[var4];
          if (GeneratedPanelPainter.field_g[var5].isActiveHorrorCostume(param0 - 9707)) {
            return true;
          }
          var4++;
        }
        return false;
    }

    final static boolean beginReconnectGracePeriod(byte param0) {
        DisplayModeSupport.field_e = true;
        if (param0 != -3) {
          return true;
        }
        GoalStateAgent.field_g = 15000L + MonotonicClock.monotonicMillis(param0 - 109);
        return RasterGlowSupport.field_c == 11 ? true : false;
    }

    final boolean usesHotshotAbilities(boolean param0, byte param1) {
        int[] var7 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param0) {
          var7 = this.trinketIds;
          int[] var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (GeneratedPanelPainter.field_g[var5].isHotshotClone(param1 + 161)) {
              return true;
            }
          }
        }
        if (param1 != -62) {
          return false;
        }
        return this.archetype == 1 ? true : false;
    }

    final boolean canTackleTeammates(boolean param0, boolean param1) {
        int var4 = 0;
        int[] var3;
        int var5;
        int var6;
        int[] var7;
        var6 = Kickabout.field_G;
        if (param0) {
          this.computeChecksum(13);
        }
        if (!param1) {
          return true;
        }
        var7 = this.trinketIds;
        var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (GeneratedPanelPainter.field_g[var5].isSafeTacklerOrShinPads(param0)) {
            return false;
          }
          if (GeneratedPanelPainter.field_g[var5].isShinPads(-21636)) {
            return false;
          }
        }
        return true;
    }

    final int computeChecksum(int param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var2 = param0;
        var2 = FaceNormal.rotateLeftFourBits(56082116, var2 ^ this.archetype);
        var2 = FaceNormal.rotateLeftFourBits(56082116, this.power ^ var2);
        var2 = FaceNormal.rotateLeftFourBits(56082116, var2 ^ this.tackle);
        var2 = FaceNormal.rotateLeftFourBits(56082116, this.speed ^ var2);
        var2 = FaceNormal.rotateLeftFourBits(56082116, var2 ^ this.experience);
        var2 = FaceNormal.rotateLeftFourBits(56082116, var2 ^ this.surnameIndex);
        var2 = FaceNormal.rotateLeftFourBits(56082116, var2 ^ this.initialIndex);
        for (var3 = 0; this.trinketIds.length > var3; var3++) {
          var2 = FaceNormal.rotateLeftFourBits(param0 + 56082116, var2 ^ this.trinketIds[var3]);
        }
        var2 = FaceNormal.rotateLeftFourBits(param0 ^ 56082116, this.appearance ^ var2);
        var2 = FaceNormal.rotateLeftFourBits(56082116, (!this.field_c ? 0 : 1) ^ var2);
        return var2;
    }

    final int getDetailsPanelHeight(boolean param0, boolean param1, byte param2) {
        if (this.power == 100 && 100 == this.tackle &&
          this.speed == 100) {
          param1 = false;
        }
        int var4 = 0;
        var4 += 50;
        var4 = var4 + (60 + (!param1 ? 0 : this.experience > 100 ? 23 : 15));
        var4 = var4 + ((this.trinketIds.length > 0 ? (!this.areTrinketsDisabled(13467) ? 0 : 12) + 6 : 0) + this.trinketIds.length * 18);
        var4 = var4 + (param0 ? 20 : 0);
        if (param2 < 75) {
          return -16;
        }
        return var4;
    }

    final int trinketPowerBonus(boolean param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        if (!param1) {
          return 0;
        }
        int var3 = 0;
        if (!param0) {
          this.usesRangerAbilities(true, -116);
        }
        int[] var4 = this.trinketIds;
        for (var5 = 0; var4.length > var5; var5++) {
          var6 = var4[var5];
          var3 = var3 + GeneratedPanelPainter.field_g[var6].powerBonus((byte) 62);
        }
        return var3;
    }

    public final String toString() {
        String var4 = null;
        String var1 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        int var2 = 0;
        int var3 = Kickabout.field_G;
        String var1Lifetime1;
        String var1Lifetime2;
        String var1Lifetime3;
        String var1Lifetime4;
        String var1Lifetime5;
        String var1Lifetime6;
        String var1Lifetime7;
        String var1Lifetime8;
        String var1Lifetime9;
        String var1Lifetime10;
        String var1Lifetime11;
        String var1Lifetime12;
        String var1Lifetime13;
        String var1Lifetime14;
        String var1Lifetime15;
        String var1Lifetime16;
        String var1Lifetime17;
        String var1Lifetime18;
        String var1Lifetime19;
        if (!this.isEmpty(-2)) {
          var4 = "Type: " + RegistrationUiSupport.field_e[this.archetype] + "\n";
          var1 = var4;
          var1Lifetime1 = var4;
          var5 = var4;
          var1Lifetime2 = var5;
          var1Lifetime3 = var5;
          if (this.archetype != -1) {
            var1Lifetime4 = var4 + "Name: " + TrinketCatalog.field_a[this.initialIndex] + ". " + BuyPlayerDialog.field_G[this.archetype][this.surnameIndex] + "\n";
          } else {
            var1Lifetime4 = var5 + "Name: N/A\n";
          }
          var6 = var1Lifetime4 + "Stats:\n";
          var1Lifetime5 = var6;
          var1Lifetime6 = var6;
          var7 = var6 + "POW: " + this.power + "\n";
          var1Lifetime7 = var7;
          var1Lifetime8 = var7;
          var8 = var7 + "TCK: " + this.tackle + "\n";
          var1Lifetime9 = var8;
          var1Lifetime10 = var8;
          var9 = var8 + "SPD: " + this.speed + "\n";
          var1Lifetime11 = var9;
          var1Lifetime12 = var9;
          var10 = var9 + "EXP: " + this.experience + "\n";
          var1Lifetime13 = var10;
          var1Lifetime14 = var10;
          var11 = var10 + "Num Trinkets: " + this.trinketIds.length + "\n";
          var1Lifetime15 = var11;
          var1Lifetime16 = var11;
          var12 = var11 + "Appearance: " + this.appearance + "\n";
          var1Lifetime17 = var12;
          var1Lifetime18 = var12;
          var1Lifetime19 = var12 + "Trinkets: ";
          for (var2 = 0; var2 < this.trinketIds.length; var2++) {
            var1Lifetime19 = var1Lifetime19 + "\t" + this.trinketIds[var2] + "\n";
          }
          var1Lifetime19 = var1Lifetime19 + "\n";
          return var1Lifetime19;
        }
        return "Empty PlayerStats";
    }

    final void drawDetailsPanel(byte param0, int param1, boolean param2, int param3, int param4, int param5, int param6, boolean param7) {
        int stackIn_7_0 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_16_2 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_31_0;
        int stackIn_31_1;
        Object stackIn_31_2;
        int stackIn_31_3;
        int stackIn_31_4;
        Object stackIn_31_5;
        int stackIn_31_6;
        boolean stackIn_32_7 = false;
        Object stackIn_35_2;
        boolean stackIn_36_5 = false;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_58_0 = 0;
        int[] var10;
        int var11;
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var16_int;
        ArgbSprite var16;
        int var17_int;
        String var17;
        int var18;
        int var19;
        Trinket var20;
        ArgbSprite var21;
        int var22;
        int var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int var18Lifetime1;
        int var19Lifetime1;
        Object stackIn_35_2Lifetime1;
        var22 = Kickabout.field_G;
        if (this.power == 100 &&
          this.tackle == 100 &&
          this.speed == 100) {
          param7 = false;
        }
        var25 = new int[]{6737151, 52479};
        var10 = new int[]{128, 60};
        stackIn_7_0 = (this.trinketIds.length <= 0) ? 0 : 1;
        var11 = stackIn_7_0;
        var26 = new int[4];
        var24 = var26;
        var12 = var24;
        var26[0] = 50;
        stackIn_9_0 = var12;
        stackIn_9_1 = 1;
        if (param7) {
          stackIn_12_2 = (this.experience <= 100) ? 15 : 23;
        } else {
          stackIn_12_2 = 0;
        }
        stackIn_9_0[stackIn_9_1] = stackIn_12_2 + 60;
        stackIn_17_0 = var12;
        stackIn_17_1 = 2;
        if (this.trinketIds.length <= 0) {
          stackIn_18_2 = 0;
        } else {
          stackIn_16_2 = (!this.areTrinketsDisabled(13467)) ? 0 : 12;
          stackIn_18_2 = stackIn_16_2 + 6;
        }
        stackIn_17_0[stackIn_17_1] = stackIn_18_2 + this.trinketIds.length * 18;
        stackIn_20_0 = var12;
        stackIn_20_1 = 3;
        stackIn_21_2 = (!param2) ? 0 : 20;
        stackIn_20_0[stackIn_20_1] = stackIn_21_2;
        var13 = this.getWidth(0);
        var14 = 0;
        var15 = param6;
        var16_int = 0;
        if (param0 < 36) {
          this.toString();
        }
        while (var16_int < 4) {
          if (var26[var16_int] != 0) {
            SoftwareRasterizer.fillRectangleAlpha(param1, var15, var13, var26[var16_int] + 1, var25[var14], var10[var14]);
            SoftwareRasterizer.drawRectangle(param1, var15, var13, var26[var16_int] + 1, 65793);
            var15 = var15 + var26[var16_int];
            var14 = var14 ^ 1;
          }
          var16_int++;
        }
        stackIn_31_0 = param4;
        stackIn_31_1 = 0;
        stackIn_31_2 = this;
        stackIn_31_3 = param3;
        stackIn_31_4 = param5;
        stackIn_31_5 = this;
        stackIn_31_6 = -107;
        stackIn_32_7 = !(this.areTrinketsDisabled(13467));
        boolean decompiledFrameRemainder0 = true;
        stackIn_35_2 = this;
        if (this.hasActiveHorrorCostume((byte) stackIn_31_6, stackIn_32_7)) {
          stackIn_35_2Lifetime1 = this;
          if (AccountRegistrationResponse.isHalloweenAppearanceEnabled((byte) -121)) {
            stackIn_36_5 = true;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_36_5 = false;
        }
        var16 = LoginKind.getPlayerPortrait(stackIn_31_0, stackIn_31_1, this, stackIn_31_3, stackIn_31_4, stackIn_36_5);
        if (var16 == null) {
          ReceivedAuctionItemRow.drawLoadingSpinner(param1 + 24, -103, -19 + (param6 + 50));
        } else {
          var16.draw(7 + param1, 50 + param6 - (var16.field_v + 1));
        }
        ConsoleTokenCursor.field_d.drawRightAligned(this.getDisplayName(100), -10 + var13 + param1, 22 + param6, 16777215, 65793);
        ConsoleTokenCursor.field_d.drawRightAligned(RegistrationUiSupport.field_e[this.archetype], -10 + param1 + var13, 36 + param6, 16777215, 65793);
        param6 = param6 + var26[0];
        var17_int = 0;
        while (true) {
          stackIn_43_0 = (param7) ? 4 : 3;
          if (stackIn_43_0 <= var17_int) {
            param6 = param6 + var26[1];
            if (var11 != 0) {
              var17_int = param1 + 13;
              var18 = param6 + 12;
              var23 = 0;
              var19 = var23;
              while (this.trinketIds.length > var23) {
                var20 = GeneratedPanelPainter.field_g[this.trinketIds[var23]];
                var21 = var20.getIconSprite(false);
                ((Sprite) ((Object) var21)).drawHalfSize(var17_int - (((Sprite) ((Object) var21)).field_o >> 2), -(((Sprite) ((Object) var21)).field_v >> 2) + var18);
                ConsoleTokenCursor.field_d.drawText(var20.getName((byte) -1), 15 + var17_int, var18 + 4, 16777215, 65793);
                var18 += 18;
                var23++;
              }
            }
            if (this.areTrinketsDisabled(13467)) {
              SoftwareDrawingSupport.darkenRectangle(1 + param1, 1 + param6, var13, var26[2] - 1);
              SoftwareRasterizer.drawVerticalLine(-1 + var13 + param1, param6, var26[2] + 1, 65793);
              ConsoleTokenCursor.field_d.drawCentered(PlatformTaskState.field_h, (var13 >> 1) + param1, -4 + var26[2] + param6, 16777215, 65793);
            }
            param6 = param6 + var26[2];
            if (param2) {
              var17 = LoginDialog.substitutePlaceholders(-18, NamedValueContainer.field_g, new String[]{LocalizedTextLoader.formatCurrencyAmount(ImageProducerRasterBuffer.calculatePlayerSaleValue(this, true), 26300)});
              ConsoleTokenCursor.field_d.drawText(var17, param1 + 10, param6 + 15, 16777215, 65793);
            }
            return;
          }
          if (var17_int != 0) {
            if (var17_int != 1) {
              if (2 == var17_int) {
                stackIn_51_0 = this.tackle;
              } else {
                stackIn_51_0 = this.experience;
              }
            } else {
              stackIn_51_0 = this.speed;
            }
          } else {
            stackIn_51_0 = this.power;
          }
          var18Lifetime1 = stackIn_51_0;
          if (0 == var17_int) {
            stackIn_58_0 = this.trinketPowerBonus(true, IntValueNode.canUseMemberTrinkets(-89));
          } else {
            if (var17_int == 1) {
              stackIn_58_0 = this.trinketSpeedBonus(5205, IntValueNode.canUseMemberTrinkets(-120));
            } else {
              if (var17_int == 2) {
                stackIn_58_0 = this.trinketTackleBonus((byte) -118, IntValueNode.canUseMemberTrinkets(-110));
              } else {
                stackIn_58_0 = 0;
              }
            }
          }
          var19Lifetime1 = stackIn_58_0;
          SoftwareDrawingSupport.drawStatBar(param1 + (-100 + var13 >> 1), 9 + (param6 + 16 * var17_int), var18Lifetime1, var17_int, true, var19Lifetime1);
          var17_int++;
        }
    }

    final int effectivePower(boolean param0, int param1) {
        int var3 = param1;
        var3 = var3 + this.power;
        var3 = var3 + this.trinketPowerBonus(true, param0);
        if (this.usesRangerAbilities(param0, param1 ^ -105) &&
          !this.usesHotshotAbilities(param0, (byte) -62)) {
          var3 = 8 * var3 / 10;
        }
        return var3;
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_a = null;
        int var1 = 8 % ((53 - param0) / 56);
        field_m = null;
        field_k = null;
    }

    public final int getWidth(int param0) {
        if (param0 != 0) {
          field_p = 95;
        }
        return 125;
    }

    public PlayerStats() {
        this.field_c = false;
        this.field_i = 0;
        this.clear((byte) -7);
    }

    static {
        field_d = "decrease buyout price by <%0>";
        field_a = new char[128];
        field_b = 0L;
    }
}
