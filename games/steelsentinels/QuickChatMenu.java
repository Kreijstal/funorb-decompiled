/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatMenu extends SceneWidget {
    private int field_Sb;
    static String field_ec;
    private int field_jc;
    static String field_Zb;
    private int field_pc;
    private QuickChatMenu field_mc;
    private IconTextComponent[] field_Yb;
    private int[] field_bc;
    static boolean field_ac;
    private QuickChatMenu[] field_Vb;
    static String field_gc;
    private int field_Xb;
    static String field_ic;
    private int field_dc;
    private int field_fc;
    private int field_Wb;
    static int particleReuseCursor;
    private int field_oc;
    static String field_Tb;
    static String field_lc;
    static String field_nc;
    static SceneWidget field_Ub;
    static int field_kc;
    private char[] field_cc;

    private final void setCollapseTicks(int param0, int param1) {
        int var4 = 0;
        int var3 = 0;
        int var7 = SteelSentinels.obfuscationControl;
        this.field_fc = param1;
        int var5 = 0;
        int var6 = -114 / ((param0 + 35) / 45);
        while (this.field_dc > var5) {
          var4 = this.field_fc * this.field_fc;
          var3 = this.field_jc * var5;
          this.field_Yb[var5].field_eb = ((-this.field_cb + this.field_Xb) * var4 + var3 * (-var4 + 144)) / 144;
          var5++;
        }
    }

    private final void activateItem(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        var7 = SteelSentinels.obfuscationControl;
        if (param3 <= 79) {
          return;
        }
        if (param0 == this.field_Sb) {
          this.resetSelection(-124);
          this.setCollapseTicks(87, 0);
        } else {
          if (this.field_Vb[param0] != null) {
            this.resetSelection(77);
            this.setCollapseTicks(-89, 0);
            this.field_Sb = param0;
            this.field_mc = this.field_Vb[this.field_Sb];
            MouseInputHandler.showQuickChatMenu(this.field_mc, -116);
            this.field_mc.setCollapseTicks(43, 12);
          } else {
            if (this.field_bc[param0] == -1) {
              AccountNoticeDialog.openQuickChatHelp(-6);
              WidgetStyleLayer.closeQuickChatMenu(2);
            } else {
              var5 = this.field_bc[param0] | 32768;
              var6 = ChatPanelHelpers.field_b;
              if (var6 == 0 &&
                null != LoginEncryptionHelpers.field_b) {
                var6 = 1;
              }
              if (NameAvailabilityValidator.getChatFilterMode(var6, 1) == 2) {
                TextLayoutLine.setChatFilterMode(1, var6, param1, -18853);
              }
              var8 = (String) null;
              QuickChatPhraseCache.sendReport(param2, LoadingScreenHelpers.field_e, -6988, ChatPanelHelpers.field_b, var5, (String) null);
              SentinelAnimationEditor.storeInviteRequest(ImageProducerRasterBuffer.field_p, LoadingScreenHelpers.field_e, ChatPanelHelpers.field_b, -29368, var5);
              WidgetStyleLayer.closeQuickChatMenu(2);
              SpriteState.resetRetryBackoff((byte) -119);
            }
          }
        }
    }

    public static void releaseStatics(int param0) {
        field_lc = null;
        field_gc = null;
        field_Zb = null;
        if (param0 != -31097) {
          return;
        }
        field_Tb = null;
        field_ec = null;
        field_ic = null;
        field_Ub = null;
        field_nc = null;
    }

    final static void initDesignerSlot(int[] param0, int param1, int param2) {
        try {
          if (param1 != 7411) {
            field_Tb = (String) null;
          }
          DesignerPageTables.field_e[param2] = param0;
          GameKeyHandler.field_e[param2] = new SentinelDesigner(param2);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "mg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    QuickChatMenu(long param0, SceneWidget param1, SceneWidget param2, SceneWidget param3, QuickChatMenu[] param4, int[] param5, String[] param6, char[] param7) {
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
        this.field_Sb = -1;
        try {
          this.field_Vb = param4;
          this.field_cc = param7;
          this.field_bc = param5;
          this.field_dc = this.field_bc.length;
          var17 = param3.field_L;
          var18 = var17;
          this.field_jc = var18.field_F + 2 + var18.field_G;
          this.field_Wb = 0;
          this.field_pc = this.field_jc * this.field_dc;
          this.field_Yb = new IconTextComponent[this.field_dc];
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; var13 < this.field_dc; var13++) {
            if (0 < this.field_cc[var13]) {
              param6[var13] = var11 + ArchiveProvider.charToString(this.field_cc[var13], 29448).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (null != this.field_Vb[var13] ||
              this.field_bc[var13] == -1) {
              var14 = ConditionalTextValue.field_g;
            }
            this.field_Yb[var13] = new IconTextComponent(0L, param2, (SceneWidget) null, param3, (RgbSprite) (var14), param6[var13]);
            this.addChild(this.field_Yb[var13], 121);
            var15 = var17.textWidth(param6[var13]);
            if (this.field_Wb < var15) {
              this.field_Wb = var15;
            }
          }
          this.field_Wb = this.field_Wb + (10 + ConditionalTextValue.field_g.field_z);
          this.setCollapseTicks(117, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("mg.<init>(").append(param0).append(',');
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
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void layoutMenu(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = SteelSentinels.obfuscationControl;
        if (param3 != 27) {
          field_lc = (String) null;
        }
        this.field_oc = this.field_Wb + 2 * param2;
        this.setBounds(0, -this.field_pc + param5, this.field_pc, param4, this.field_oc);
        if (this.field_Xb != param1) {
          this.field_Xb = param1;
          this.setCollapseTicks(-97, this.field_fc);
        }
        for (var7 = 0; this.field_dc > var7; var7++) {
          this.field_Yb[var7].setLayout(this.field_jc, this.field_oc, param2, 0, param0, this.field_Yb[var7].field_eb, (byte) 121);
        }
        if (-1 != this.field_Sb &&
          this.field_Vb[this.field_Sb] != null) {
          var7Lifetime1 = this.field_Vb[this.field_Sb].field_dc;
          for (var8 = this.field_eb + (this.field_Sb + var7Lifetime1) * this.field_jc; var8 > param5; var8 = var8 - this.field_jc) {
          }
          this.field_Vb[this.field_Sb].layoutMenu(param0, this.field_Yb[this.field_Sb].field_cb, param2, (byte) 27, param4 + this.field_oc, var8);
        }
    }

    final boolean hasPressedItem(int param0) {
        int var4 = 0;
        IconTextComponent var5_ref_qh = null;
        int var6 = SteelSentinels.obfuscationControl;
        int var2 = 0;
        IconTextComponent[] var3 = this.field_Yb;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5_ref_qh = var3[var4];
          var2 = var2 | (var5_ref_qh.field_Eb != 0 ? 1 : 0);
        }
        int var5 = -60 % ((param0 + 18) / 63);
        if (var2 == 0 &&
          this.field_Sb != -1 &&
          this.field_Vb[this.field_Sb] != null) {
          var2 = this.field_Vb[this.field_Sb].hasPressedItem(75) ? 1 : 0;
        }
        return var2 != 0;
    }

    final void processClicks(byte param0, int param1, int param2) {
        int var4_int = 0;
        IconTextComponent var5;
        int var6;
        IconTextComponent stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        QuickChatMenu var4;
        QuickChatMenu var7;
        var6 = SteelSentinels.obfuscationControl;
        for (var4_int = 0; var4_int < this.field_Yb.length; var4_int++) {
          var5 = this.field_Yb[var4_int];
          if (1 == var5.field_Eb) {
            this.activateItem(var4_int, param2, param1, 119);
            stackIn_7_0 = var5;
            stackIn_8_1 = (var4_int == this.field_Sb);
            stackIn_7_0.field_G = stackIn_8_1;
          }
        }
        if (-1 != this.field_Sb) {
          var7 = this.field_Vb[this.field_Sb];
          var4 = var7;
          if (var4 != null) {
            var7.processClicks((byte) 111, param1, param2);
          }
        }
        if (0 < this.field_fc) {
          this.setCollapseTicks(127, -1 + this.field_fc);
        }
        if (param0 < 28) {
          QuickChatMenu.releaseStatics(119);
        }
    }

    final static boolean isLegacyMenuOpen(boolean param0) {
        if (!param0) {
          QuickChatMenu.isLegacyMenuOpen(false);
        }
        return TextHotspotRegion.field_r;
    }

    final boolean processShortcutKey(int param0, int param1, int param2) {
        int var6 = 0;
        int var4;
        int var5;
        int var7;
        int stackIn_3_0 = 0;
        var7 = SteelSentinels.obfuscationControl;
        stackIn_3_0 = (85 != NameAvailabilityValidator.field_q) ? 0 : 1;
        var4 = stackIn_3_0;
        if (this.field_mc != null) {
          if (var4 != 0 &&
            this.field_mc.field_Sb == -1) {
            this.resetSelection(18);
            this.setCollapseTicks(param0 ^ -25528, 0);
            return true;
          }
          return this.field_mc.processShortcutKey(25542, param1, param2);
        }
        if (this.field_mc == null &&
          this == IntKeyLookup.field_i &&
          var4 != 0) {
          WidgetStyleLayer.closeQuickChatMenu(2);
          return true;
        }
        var5 = LoginMethod.field_c;
        if (param0 != 25542) {
          return false;
        }
        if (var5 <= 0) {
          return false;
        }
        if (DebouncedValidator.field_g == var5) {
          var5 = 63;
        }
        for (var6 = 0; this.field_cc.length > var6; var6++) {
          if (this.field_cc[var6] == var5) {
            this.activateItem(var6, param2, param1, 119);
            return true;
          }
        }
        return false;
    }

    final void resetSelection(int param0) {
        IconTextComponent var4 = null;
        int var3 = 0;
        int var5 = SteelSentinels.obfuscationControl;
        IconTextComponent[] var6 = this.field_Yb;
        IconTextComponent[] var2 = var6;
        int var3Lifetime1;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.field_G = false;
          var4.field_Eb = 0;
        }
        var3Lifetime1 = -17 / ((-59 - param0) / 58);
        if (this.field_mc != null) {
          this.field_mc.resetSelection(45);
          this.field_mc.unlink(4);
        }
        this.field_mc = null;
        this.field_Sb = -1;
        this.setCollapseTicks(37, 12);
    }

    final int getCascadeWidth(int param0) {
        if (param0 != 0) {
          this.setCollapseTicks(38, 77);
        }
        return this.field_oc + (null != this.field_mc ? this.field_mc.getCascadeWidth(param0 + 0) : 0);
    }

    static {
        field_ec = "Achievements";
        field_gc = "Show all private chat";
        field_ac = true;
        field_ic = "Please remove <%0> from your friend list first.";
        particleReuseCursor = 0;
        field_Zb = "PROGRESS BEYOND THIS POINT REQUIRES YOU TO LOG IN OR CREATE A FREE ACCOUNT.";
        field_nc = "START MISSION";
        field_lc = "Email is valid";
        field_Tb = "Advanced Training";
    }
}
