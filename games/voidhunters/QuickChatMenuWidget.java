/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatMenuWidget extends Widget {
    private int contentWidth;
    static String field_Cb;
    static int field_wb;
    private int menuHeight;
    private int rowHeight;
    private int parentItemY;
    private int menuWidth;
    private int itemCount;
    private int selectedItem;
    private char[] shortcutKeys;
    private QuickChatMenuWidget[] submenus;
    private int animationStep;
    private QuickChatMenuWidget openSubmenu;
    private IconTextWidget[] items;
    private int[] phraseIds;

    final boolean handleKeyboard(int param0, int param1, int param2) {
        int var6 = 0;
        int var4;
        int var5;
        int var7;
        int stackIn_5_0 = 0;
        var7 = VoidHunters.field_G;
        if (param1 > -60) {
          this.menuWidth = 67;
        }
        stackIn_5_0 = (SetBombletSprayProjectileDamage.field_o != 85) ? 0 : 1;
        var4 = stackIn_5_0;
        if (this.openSubmenu != null) {
          if (var4 != 0 &&
            this.openSubmenu.selectedItem == -1) {
            this.closeSubmenu(16384);
            this.setAnimationStep((byte) 112, 0);
            return true;
          }
          return this.openSubmenu.handleKeyboard(param0, -126, param2);
        }
        if (null == this.openSubmenu &&
          this == MidiNote.field_m &&
          var4 != 0) {
          GetUseExtraBackground.closeQuickChatMenu(-1);
          return true;
        }
        var5 = SetClientSideDragging.field_r;
        if (var5 > 0) {
          if (StripedProgressBar.field_B == var5) {
            var5 = 63;
          }
          for (var6 = 0; var6 < this.shortcutKeys.length; var6++) {
            if (var5 == this.shortcutKeys[var6]) {
              this.activateItem(var6, true, param0, param2);
              return true;
            }
          }
        }
        return false;
    }

    private final void activateItem(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        long stackIn_15_2 = 0L;
        boolean stackIn_16_3;
        var7 = VoidHunters.field_G;
        if (!param1) {
          return;
        }
        if (this.selectedItem != param0) {
          if (this.submenus[param0] != null) {
            this.closeSubmenu(16384);
            this.setAnimationStep((byte) 116, 0);
            this.selectedItem = param0;
            this.openSubmenu = this.submenus[this.selectedItem];
            SetVariableActionFactory.attachQuickChatMenu(this.openSubmenu, 6);
            this.openSubmenu.setAnimationStep((byte) 121, 12);
          } else {
            if (this.phraseIds[param0] != -1) {
              var5 = 32768 | this.phraseIds[param0];
              var6 = NetworkMessageState.chatChannel;
              if (var6 == 0 &&
                null != SetSpinningBladeSpindamageMultiplier.field_o) {
                var6 = 1;
              }
              if (SetReverbDry.getChatFilter(var6, (byte) 19) == 2) {
                OpenGlPostEffect.setChatFilter(1, (byte) -119, param2, var6);
              }
              var8 = (String) null;
              SetBurstFireReload.a((String) null, -25719, var5, param3, NetworkMessageState.chatChannel, ChoosePlayerNameForm.privateChatTargetDisplayName);
              stackIn_15_0 = NetworkMessageState.chatChannel;
              stackIn_15_1 = var5;
              stackIn_15_2 = PendingRequest.privateChatRecipientKey;
              stackIn_16_3 = (param1) ? false : true;
              ArchiveRequest.a(stackIn_15_0, stackIn_15_1, stackIn_15_2, stackIn_16_3, ChoosePlayerNameForm.privateChatTargetDisplayName);
              GetUseExtraBackground.closeQuickChatMenu(-1);
              SetSalvoRepairTimeMultiplier.resetQuickChatRateLimit(4907);
            } else {
              AsteroidFactory.createQuickChatHelpWindow(29012);
              GetUseExtraBackground.closeQuickChatMenu(-1);
            }
          }
        } else {
          this.closeSubmenu(16384);
          this.setAnimationStep((byte) 121, 0);
        }
    }

    QuickChatMenuWidget(long param0, Widget param1, Widget param2, Widget param3, QuickChatMenuWidget[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        int var13 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        Object var14 = null;
        int var15 = 0;
        BitmapFont var17 = null;
        BitmapFont var18 = null;
        this.selectedItem = -1;
        try {
          this.shortcutKeys = param7;
          this.phraseIds = param5;
          this.submenus = param4;
          this.itemCount = this.phraseIds.length;
          var17 = param3.font;
          var18 = var17;
          this.rowHeight = var18.maxDescent + (var18.maxAscent + 2);
          this.contentWidth = 0;
          this.items = new IconTextWidget[this.itemCount];
          this.menuHeight = this.rowHeight * this.itemCount;
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; this.itemCount > var13; var13++) {
            if (this.shortcutKeys[var13] > 0) {
              param6[var13] = var11 + MissionActionFactory.characterToString(this.shortcutKeys[var13], 6).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (this.submenus[var13] != null ||
              this.phraseIds[var13] == -1) {
              var14 = GetTeamSelectionSpeedup.field_o;
            }
            this.items[var13] = new IconTextWidget(0L, param2, (Widget) null, param3, (Sprite) (var14), param6[var13]);
            this.addChild(-561, this.items[var13]);
            var15 = var17.getStringWidth(param6[var13]);
            if (this.contentWidth < var15) {
              this.contentWidth = var15;
            }
          }
          this.contentWidth = this.contentWidth + (10 + GetTeamSelectionSpeedup.field_o.paddedWidth);
          this.setAnimationStep((byte) 120, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("tjb.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final void setAnimationStep(byte param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = VoidHunters.field_G;
        this.animationStep = param1;
        if (param0 < 109) {
          this.menuWidth = -122;
        }
        for (var5 = 0; var5 < this.itemCount; var5++) {
          var4 = this.animationStep * this.animationStep;
          var3 = var5 * this.rowHeight;
          this.items[var5].y = ((this.parentItemY - this.screenY) * var4 + (-var4 + 144) * var3) / 144;
        }
    }

    final int getOpenMenuWidth(int param0) {
        if (param0 != -4109) {
          this.handleKeyboard(-122, 20, 102);
        }
        return this.menuWidth + (null != this.openSubmenu ? this.openSubmenu.getOpenMenuWidth(-4109) : 0);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 85) {
          return;
        }
        field_Cb = null;
    }

    final void closeSubmenu(int param0) {
        int var3 = 0;
        IconTextWidget var4 = null;
        int var5 = VoidHunters.field_G;
        IconTextWidget[] var6 = this.items;
        IconTextWidget[] var2 = var6;
        if (param0 != 16384) {
          this.menuHeight = -32;
        }
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.field_o = 0;
          var4.field_J = false;
        }
        if (this.openSubmenu != null) {
          this.openSubmenu.closeSubmenu(16384);
          this.openSubmenu.unlink(param0 - 20230);
        }
        this.openSubmenu = null;
        this.selectedItem = -1;
        this.setAnimationStep((byte) 113, 12);
    }

    final static boolean l(int param0) {
        if (param0 != 0) {
          return false;
        }
        SetAudioRangeCutoff.field_q = true;
        StrongCacheReference.field_p = MonotonicMillisClock.currentTimeMillis(false) + 15000L;
        return GetSpinningBladeAimspeed.field_q == 11 ? true : false;
    }

    final void updateSelection(int param0, int param1, byte param2) {
        int var5 = 0;
        int var4_int;
        IconTextWidget var6;
        int var7;
        IconTextWidget stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        QuickChatMenuWidget var4;
        QuickChatMenuWidget var8;
        var7 = VoidHunters.field_G;
        var4_int = -84 / ((-12 - param2) / 44);
        for (var5 = 0; this.items.length > var5; var5++) {
          var6 = this.items[var5];
          if (var6.field_o == 1) {
            this.activateItem(var5, true, param0, param1);
            stackIn_7_0 = var6;
            stackIn_8_1 = (var5 == this.selectedItem);
            stackIn_7_0.field_J = stackIn_8_1;
          }
        }
        if (this.selectedItem != -1) {
          var8 = this.submenus[this.selectedItem];
          var4 = var8;
          if (var4 != null) {
            var8.updateSelection(param0, param1, (byte) 78);
          }
        }
        if (0 < this.animationStep) {
          this.setAnimationStep((byte) 123, this.animationStep - 1);
        }
    }

    final boolean hasClickedItem(int param0) {
        int var2;
        IconTextWidget[] var3;
        int var4;
        IconTextWidget var5;
        int var6;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_8_1 = 0;
        int stackIn_18_0 = 0;
        var6 = VoidHunters.field_G;
        var2 = 0;
        var3 = this.items;
        var4 = 0;
        while (var4 < var3.length) {
          var5 = var3[var4];
          stackIn_5_0 = var2;
          stackIn_5_1 = var5.field_o;
          if (stackIn_5_1 == 0) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          var2 = stackIn_5_0 | stackIn_8_1;
          var4++;
        }
        if (param0 != -25675) {
          QuickChatMenuWidget.l(52);
        }
        if (var2 == 0 &&
          -1 != this.selectedItem &&
          this.submenus[this.selectedItem] != null) {
          stackIn_18_0 = (!this.submenus[this.selectedItem].hasClickedItem(-25675)) ? 0 : 1;
          var2 = stackIn_18_0;
        }
        return var2 != 0;
    }

    final void layoutMenu(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = VoidHunters.field_G;
        this.menuWidth = this.contentWidth + 2 * param3;
        if (param0 != 12) {
          return;
        }
        this.setBounds(param2, param0 - 41, this.menuWidth, param1 - this.menuHeight, this.menuHeight);
        if (param4 != this.parentItemY) {
          this.parentItemY = param4;
          this.setAnimationStep((byte) 116, this.animationStep);
        }
        for (var7 = 0; var7 < this.itemCount; var7++) {
          this.items[var7].setBoundsAndLayout(this.items[var7].y, 0, -127, param3, param5, this.menuWidth, this.rowHeight);
        }
        if (this.selectedItem != -1 &&
          this.submenus[this.selectedItem] != null) {
          var7Lifetime1 = this.submenus[this.selectedItem].itemCount;
          for (var8 = this.y + (this.selectedItem + var7Lifetime1) * this.rowHeight; param1 < var8; var8 = var8 - this.rowHeight) {
          }
          this.submenus[this.selectedItem].layoutMenu(12, var8, this.menuWidth + param2, param3, this.items[this.selectedItem].screenY, param5);
          return;
        }
        return;
    }

    final static Object findDuplicateReference(Object[] param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = VoidHunters.field_G;
        try {
          if (!GetMissionTerrainNebulaProbability.referenceTrackingEnabled) {
            stackIn_3_0 = null;
            return stackIn_3_0;
          }
          if (param1 != 0) {
            ((byte[]) (param0[2]))[0] = ((byte[]) (param0[12]))[2];
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length <= 0) {
            stackIn_19_0 = null;
            return stackIn_19_0;
          }
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            if (VoidHunters.checkDuplicateReference(true, param0[var2_int])) {
              stackIn_16_0 = param0[var2_int];
              return stackIn_16_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("tjb.K(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_Cb = "Invalid name";
        field_wb = 2;
    }
}
