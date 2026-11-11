/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CharacterSelectPhase extends MatchPhase {
    static ToolkitSprite field_r;
    private CharacterSelection selection;
    private IntrusiveDeque field_n;
    static String field_w;
    static String field_o;
    static int field_q;
    private int field_p;
    private boolean field_y;
    static UiComponent field_s;
    private CharacterPreview[] field_t;
    private int field_u;
    private int field_v;
    static int field_x;

    private final boolean updateHover(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 0) {
          return true;
        }
        CharacterChoiceTile var2 = (CharacterChoiceTile) (this.field_n.first(param0 ^ -80));
        while (var2 != null) {
          if (var2.isHovered((byte) -85) &&
            !var2.isEmpty(-64)) {
            this.field_v = var2.field_f;
            return true;
          }
          var2 = (CharacterChoiceTile) (this.field_n.next(111));
        }
        return false;
    }

    final boolean handleKey(char param0, int param1, int param2) {
        boolean discarded$1 = false;
        if (0 != this.field_p &&
          this.canChoose(param1 ^ -26)) {
          if (param1 != 25) {
            discarded$1 = this.updateHover(94);
          }
          if (84 != param2 &&
            param2 != 83) {
            return false;
          }
          this.chooseLocalCharacter(true, this.field_v);
          return true;
        }
        return false;
    }

    final void draw(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        CharacterChoiceTile var6_ref_ad;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var7Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        Room.field_j.draw(0, 0);
        var3 = LegacyOpenGlWaterTextures.getCanvasWidth(false) / 2;
        var4 = SwitchLinkList.getCanvasHeight(0) / 2;
        stackIn_3_0 = (this.canChoose(-1)) ? 0 : 1;
        var5 = stackIn_3_0;
        IntArrayRequest.field_h.draw(0, 0);
        SocketConnector.drawWrappedText(gta.field_a.toUpperCase(), 1, SingleChildWidget.field_v, 2431750, 0, 48, 1, -222 + var4, var3 - 360, -1, (byte) 60, 512);
        if (-1 == this.field_u &&
          var5 != 0) {
          SocketConnector.drawWrappedText(jsa.field_F, 1, eda.field_f, 2431750, 0, 48, 1, SwitchLinkList.getCanvasHeight(0) - 48, var3 - 256, -1, (byte) 60, 512);
        }
        var6_ref_ad = (CharacterChoiceTile) (this.field_n.first(-80));
        while (var6_ref_ad != null) {
          stackIn_12_0 = (var6_ref_ad.field_f == this.field_v) ? 1 : 0;
          var7 = stackIn_12_0;
          var6_ref_ad.draw((byte) -9, var7 != 0);
          var6_ref_ad = (CharacterChoiceTile) (this.field_n.next(119));
        }
        if (param0 >= -50) {
          this.update(33, true);
        }
        TextureTransformMode.a(-10985);
        var6 = this.field_t.length;
        var11 = 0;
        var7Lifetime1 = var11;
        while (var6 > var11) {
          var8 = 64 - var6 * 64 + var3 + (var11 * 128 - 10);
          var9 = var4 + 80;
          if (this.field_t[var11] != null) {
            this.field_t[var11].draw(var8, 1400, var9 + 55, (byte) 73);
          } else {
            bsa.field_i.draw(-(bsa.field_i.width() >> 1) + var8, -(bsa.field_i.height() >> 1) + var9, 0, 1627389951, 1);
          }
          SocketConnector.drawWrappedText(this.screen.getPlayerName(var11, false).toUpperCase(), 1, FloatPacketBuffer.field_j, wga.field_a[var11], 0, 32, 1, 55 + var9, var8 - 64, -1, (byte) 60, 128);
          var11++;
        }
        RemovedFromGameMenu.resetDepthRange((byte) -6);
        this.drawMenuButton(-27142);
    }

    final void update(int param0, boolean param1) {
        int var3 = 0;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (!this.field_y) {
          li.updateRoomMusic(this.screen.getViewedPlayerIndex(param0 + 41), (byte) 107);
          this.field_y = true;
        }
        for (var3 = 0; this.field_t.length > var3; var3++) {
          if (null != this.field_t[var3]) {
            this.field_t[var3].tick(-73);
          }
        }
        if (param1) {
          this.updateMenuButton(7);
        }
        if (this.field_u >= 0) {
          this.field_u = this.field_u - 1;
          if (this.field_u == 0) {
            if (this.screen.field_D) {
              return;
            }
            this.screen.startRound(111);
          }
          return;
        }
        this.selection.unmuteSounds(32221);
        if (param1 &&
          this.canChoose(param0 - 81)) {
          this.handleInput(-13);
        }
        if (this.selection.isComplete(false)) {
          this.field_u = 100;
        }
        if (param0 != 80) {
          this.handleKey('H', -116, 32);
        }
        this.field_p = this.field_p + 1;
    }

    private final void chooseLocalCharacter(boolean param0, int param1) {
        if (!this.canChoose(-1)) {
          return;
        }
        if (!param0) {
          return;
        }
        if (null != this.protocol) {
          this.protocol.sendCharacterChoice(param1, 73);
        } else {
          this.onCharacterChosen(this.screen.localPlayerIndex, 0, param1);
        }
    }

    CharacterSelectPhase(MatchScreen param0, MatchProtocol param1) {
        super(param0, param1);
        int stackIn_5_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        CharacterChoiceTile var8 = null;
        int var3_intLifetime1;
        this.field_p = 0;
        this.field_v = 0;
        this.field_u = -1;
        try {
          this.selection = new CharacterSelection(this.matchState);
          this.selection.field_b = new SoundEventPlayer();
          this.field_n = new IntrusiveDeque();
          for (var3_int = 0; var3_int < 13; var3_int++) {
            var4 = LegacyOpenGlWaterTextures.getCanvasWidth(false);
            var5 = SwitchLinkList.getCanvasHeight(0);
            var6 = var3_int % 7 * (0 + (-90 + var4) / 7) + 45;
            stackIn_5_0 = -90;
            if (var3_int >= 7) {
              stackIn_6_1 = (var5 >> 1) + 20;
            } else {
              stackIn_6_1 = (var5 >> 1) - 84;
            }
            var7 = stackIn_5_0 + stackIn_6_1;
            if (var3_int >= 7) {
              var6 += 32;
            }
            var8 = new CharacterChoiceTile(var6, var7);
            if (this.isCharacterAvailable(var3_int, (byte) -35)) {
              var8 = new CharacterChoiceTile(var3_int, var6, var7);
            }
            this.field_n.addLast((byte) -104, var8);
          }
          var3_intLifetime1 = param0.matchState.players.length;
          this.field_t = new CharacterPreview[var3_intLifetime1];
          this.field_y = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("uda.<init>(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void onCharacterChosen(int param0, int param1, int param2) {
        this.selection.chooseCharacter((byte) -69, param2, param0);
        this.field_t[param0] = new CharacterPreview(param2);
        ModelAnimator var4 = this.field_t[param0].field_j;
        var4.play(param2, false, param1, 5, true);
        int var5 = var4.getCurrentAnimationLength((byte) 114);
        var4.queueAnimation(param1 + 107, var5, param2, 0, 0);
        FloatingMessage var6 = RewardChoicePhase.createTextMessage(param1 ^ -41, LegacyOpenGlFlowingWaterEffect.formatText(82, SpriteSampleOperator.field_n, new String[]{this.matchState.getColouredPlayerName(param0, 23807), Room.field_m[param2]}));
        ToolkitInstance.field_c.addMessageNow(0, var6);
    }

    private final boolean canChoose(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1) {
          this.field_p = -18;
        }
        stackIn_6_0 = (!this.screen.isSpectating((byte) 111)) && (this.selection.getCharacter(0, this.screen.localPlayerIndex) == -1);
        return stackIn_6_0;
    }

    private final void handleInput(int param0) {
        int stackIn_26_1 = 0;
        int stackIn_28_2 = 0;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_p == 0) {
          return;
        }
        if (ProceduralTextureProvider.field_c &&
          this.updateHover(0) &&
          PlayerModel.field_b == 1) {
          this.chooseLocalCharacter(true, this.field_v);
        }
        if (this.screen.isActionJustPressed(0, 2)) {
          this.field_v = this.field_v - 7;
        }
        if (this.screen.isActionJustPressed(0, 3)) {
          this.field_v = this.field_v + 7;
        }
        if (this.screen.isActionJustPressed(param0 ^ param0, 0)) {
          this.field_v = this.field_v - 1;
        }
        if (this.screen.isActionJustPressed(0, 1)) {
          this.field_v = this.field_v + 1;
        }
        if (this.field_v >= 13) {
          this.field_v = this.field_v - 13;
        }
        if (0 > this.field_v) {
          this.field_v = this.field_v + 13;
        }
        while (!this.isCharacterAvailable(this.field_v, (byte) -74)) {
          stackIn_26_1 = this.field_v;
          if (!this.screen.isActionJustPressed(0, 0) &&
            !this.screen.isActionJustPressed(0, 2)) {
            stackIn_28_2 = 1;
          } else {
            stackIn_28_2 = -1;
          }
          this.field_v = stackIn_26_1 + stackIn_28_2;
          if (this.field_v >= 13) {
            this.field_v = this.field_v - 13;
          }
          if (this.field_v >= 0) {
            continue;
          }
          this.field_v = 13 + this.field_v;
        }
    }

    private final boolean isCharacterAvailable(int param0, byte param1) {
        boolean stackIn_16_0 = false;
        if (param1 >= -29) {
          field_s = (UiComponent) null;
        }
        if (!TextWidgetPainter.a(119) &&
          mq.field_e != null) {
          boolean decompiledFrameRemainder0 = true;
          if (!ToolkitSelector.field_g[param0] && (!ToolkitSelector.field_f[param0] &&
            ReportAbuseDialog.field_ub <= 0 ||
            !mq.field_e.isCharacterUnlocked((byte) 4, param0)) && !SimpleBlockBehaviour.c(0)) {
            stackIn_16_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_16_0 = true;
          }
          return stackIn_16_0;
        }
        return ToolkitSelector.field_g[param0];
    }

    final boolean allowsChat(int param0) {
        if (param0 != -9202) {
          return false;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        field_w = null;
        field_s = null;
        if (param0 < 9) {
          CharacterSelectPhase.releaseStatics(105);
        }
        field_r = null;
    }

    static {
        field_o = "(finished quicker)";
        field_w = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
