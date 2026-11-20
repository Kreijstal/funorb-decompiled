/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PopupMenuWidget extends Widget {
    private Widget field_Fb;
    private int field_yb;
    private Sprite[] field_xb;
    private Widget field_Cb;
    private int field_wb;
    static gl field_Bb;
    private int selectionResult;
    private int field_zb;
    private int[] itemResults;
    private int field_Hb;
    private int field_vb;
    private int itemCount;
    private IconTextWidget[] items;
    static String field_Db;

    final boolean pollSelectionPending(byte param0) {
        if (this.selectionResult != -2) {
          return false;
        }
        if (SetBombletSprayProjectileDamage.field_o == 13) {
          this.selectionResult = -1;
        }
        int var2 = 108 % ((-69 - param0) / 48);
        return true;
    }

    final int updateAndGetSelection(int param0, boolean param1) {
        int var3 = 0;
        int var5 = VoidHunters.field_G;
        this.updateInput(param1, 1332);
        if (!param1) {
          return -2;
        }
        for (var3 = 0; var3 < this.itemCount; var3++) {
          if (this.items[var3].field_o != 0) {
            return this.itemResults[var3];
          }
        }
        int var4 = -115 / ((param0 + 87) / 37);
        if (0 != SetDebrisPartitioned.field_o) {
          return -1;
        }
        return this.selectionResult;
    }

    final void addItem(String param0, byte param1, int param2) {
        try {
          this.items[this.itemCount] = new IconTextWidget(0L, (Widget) null, (Widget) null, this.field_Cb, (Sprite) null, param0);
          this.items[this.itemCount].field_mb = this.field_xb;
          this.items[this.itemCount].field_S = true;
          this.items[this.itemCount].field_B = 1;
          this.addChild(-561, this.items[this.itemCount]);
          this.itemResults[this.itemCount] = param2;
          this.itemCount = this.itemCount + 1;
          if (param1 != -53) {
            String var5 = (String) null;
            this.addItem((String) null, (byte) -31, -41);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aw.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void layoutPopup(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = VoidHunters.field_G;
        if (0 == this.itemCount) {
          this.items[this.itemCount] = new IconTextWidget(0L, (Widget) null, (Widget) null, this.field_Fb, (Sprite) null, GetNumStars.field_o);
          this.items[this.itemCount].field_B = 1;
          this.addChild(-561, this.items[this.itemCount]);
          this.itemResults[this.itemCount] = -1;
          this.itemCount = this.itemCount + 1;
        }
        var6 = 0;
        for (var7 = 0; var7 < this.itemCount; var7++) {
          var8 = this.items[var7].measurePreferredWidth(this.field_Hb, this.field_vb, -66);
          if (var8 > var6) {
            var6 = var8;
          }
        }
        var6 = var6 + this.field_zb * 2;
        if (param1 != -29060) {
          return;
        }
        var7Lifetime1 = this.field_yb + (this.field_yb + this.field_wb * this.itemCount);
        var8Lifetime1 = QuickChatCategoryLoader.adjustPopupX((byte) -109, param0, param3, var6);
        var9 = PopupPositioning.adjustPopupY(param4, param2, var7Lifetime1, (byte) -16);
        this.setBounds(var8Lifetime1, 32, var6, var9, var7Lifetime1);
        for (var10 = 0; this.itemCount > var10; var10++) {
          this.items[var10].setBoundsAndLayout(this.field_yb + this.field_wb * var10, this.field_zb, -124, this.field_vb, this.field_Hb, -(2 * this.field_zb) + var6, this.field_wb);
        }
        return;
    }

    final static void applyGraphicsQualityPreset(boolean param0) {
        MachineGunWeaponDefinition.field_b = 0;
        GetMissilesExplosionPower.field_p = 1;
        GetSalvoDamageMultiplier.field_q = 1;
        GetUseSprites.field_o = 1;
        AwardVictoryToWinnerAction.field_b = 1;
        SetVariableActionFactory.field_c = 1;
        if (param0) {
          return;
        }
        SetSalvoDamageMultiplier.field_o = 1;
        if (GetMissileLauncherProjectileLife.graphicsQuality == 2) {
          GetUseSprites.field_o = 0;
          GetSalvoDamageMultiplier.field_q = 0;
          SetSalvoDamageMultiplier.field_o = 0;
          AwardVictoryToWinnerAction.field_b = 0;
          SetVariableActionFactory.field_c = 0;
          GetMissilesExplosionPower.field_p = 0;
        } else {
          if (1 == GetMissileLauncherProjectileLife.graphicsQuality) {
            GetMissilesExplosionPower.field_p = 0;
            GetUseSprites.field_o = 0;
            SetSalvoDamageMultiplier.field_o = 0;
            GetSalvoDamageMultiplier.field_q = 0;
          }
        }
    }

    final void addItem(int param0, int param1, Sprite param2, String param3) {
        if (param0 != -1) {
          return;
        }
        try {
          this.items[this.itemCount] = new IconTextWidget(0L, (Widget) null, (Widget) null, this.field_Cb, param2, param3);
          this.items[this.itemCount].field_mb = this.field_xb;
          this.items[this.itemCount].field_S = true;
          this.items[this.itemCount].field_B = 1;
          this.addChild(param0 ^ 560, this.items[this.itemCount]);
          this.itemResults[this.itemCount] = param1;
          this.itemCount = this.itemCount + 1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aw.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_Db = null;
        field_Bb = null;
        if (param0 != 0) {
          field_Bb = (gl) null;
        }
    }

    PopupMenuWidget(PopupMenuWidget param0) {
        this(param0, param0.field_xb, param0.field_Fb, param0.field_Cb, param0.field_zb, param0.field_vb, param0.field_Hb, param0.field_yb, param0.field_wb);
    }

    PopupMenuWidget(Widget param0, Sprite[] param1, Widget param2, Widget param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.itemResults = new int[256];
        this.selectionResult = -2;
        this.items = new IconTextWidget[256];
        try {
          this.field_wb = param8;
          this.field_Cb = param3;
          this.field_Fb = param2;
          this.field_xb = param1;
          this.field_zb = param4;
          this.field_vb = param5;
          this.field_Hb = param6;
          this.field_yb = param7;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_Bb = new gl(7);
        field_Db = "You must be a member to play with the current options.";
    }
}
