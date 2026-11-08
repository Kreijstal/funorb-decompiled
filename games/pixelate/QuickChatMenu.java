/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatMenu extends SceneWidget {
    private QuickChatMenu[] field_Gb;
    private int field_Fb;
    private char[] field_Hb;
    static String field_Eb;
    private int[] field_Tb;
    private int field_Ob;
    private IconTextComponent[] field_Sb;
    private int field_Kb;
    private QuickChatMenu field_Pb;
    static String field_Ib;
    private int field_Jb;
    static CredentialKind field_Nb;
    private int openItemIndex;
    private int field_Rb;
    private int field_Ub;
    private int field_Mb;
    static FallingPieceView field_Qb;

    final static void drawFloatingSquares(boolean param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        FloatingSquare[] var3 = null;
        FloatingSquare var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = -84 / ((29 - param1) / 52);
          var3 = Cloud.field_d;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var5.draw(100, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var2), "te.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void setPendingUiResult(int param0, int param1) {
        if (param1 != -2671) {
          field_Nb = (CredentialKind) null;
        }
        QuickChatPhraseCache.field_h = param0;
    }

    final void resetSelection(int param0) {
        int var3 = 0;
        IconTextComponent var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        IconTextComponent[] var6 = this.field_Sb;
        IconTextComponent[] var2 = var6;
        if (param0 != 17872) {
          this.field_Hb = (char[]) null;
        }
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.field_U = false;
          var4.field_P = 0;
        }
        if (null != this.field_Pb) {
          this.field_Pb.resetSelection(17872);
          this.field_Pb.unlink(2779);
        }
        this.field_Pb = null;
        this.openItemIndex = -1;
        this.setOpenAnimationStep(12, (byte) -85);
    }

    final static void removeMouseListeners(byte param0, java.awt.Component param1) {
        param1.removeMouseListener(MouseInputGlobals.field_c);
        param1.removeMouseMotionListener(MouseInputGlobals.field_c);
        if (param0 != -47) {
          return;
        }
        try {
          param1.removeFocusListener(MouseInputGlobals.field_c);
          Cloud.field_o = 0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "te.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void layoutMenu(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = Pixelate.field_H ? 1 : 0;
        this.field_Fb = 2 * param3 + this.field_Rb;
        this.setBounds(param0 - this.field_Ob, this.field_Ob, param1, 256, this.field_Fb);
        if (param5 != this.field_Ub) {
          this.field_Ub = param5;
          this.setOpenAnimationStep(this.field_Kb, (byte) -79);
        }
        if (param4 != -94) {
          this.field_Gb = (QuickChatMenu[]) null;
        }
        for (var7 = 0; var7 < this.field_Mb; var7++) {
          this.field_Sb[var7].setBoundsAndLayout(this.field_Jb, param3, param2, this.field_Sb[var7].field_S, 0, this.field_Fb, param4 - 2147483554);
        }
        if (this.openItemIndex != -1 &&
          this.field_Gb[this.openItemIndex] != null) {
          var7Lifetime1 = this.field_Gb[this.openItemIndex].field_Mb;
          for (var8 = this.field_Jb * (var7Lifetime1 + this.openItemIndex) + this.field_S; var8 > param0; var8 = var8 - this.field_Jb) {
          }
          this.field_Gb[this.openItemIndex].layoutMenu(var8, param1 + this.field_Fb, param2, param3, (byte) -94, this.field_Sb[this.openItemIndex].screenY);
        }
    }

    final boolean processShortcutKey(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        stackIn_3_0 = (KeyEventGlobals.field_a != 85) ? 0 : 1;
        var4 = stackIn_3_0;
        if (null != this.field_Pb) {
          if (var4 != 0 &&
            this.field_Pb.openItemIndex == -1) {
            this.resetSelection(17872);
            this.setOpenAnimationStep(0, (byte) -82);
            return true;
          }
          return this.field_Pb.processShortcutKey(param0, 0, param2);
        }
        if (null == this.field_Pb &&
          ScreenDisplayMode.field_h == this &&
          var4 != 0) {
          ScoreMarkerDemo.closeQuickChatMenu(false);
          return true;
        }
        var5 = DualLinkDeque.field_f;
        if (var5 > param1) {
          if (PieceTiming.field_d == var5) {
            var5 = 63;
          }
          var6 = 0;
          while (this.field_Hb.length > var6) {
            if (var5 != this.field_Hb[var6]) {
              var6++;
              continue;
            }
            this.activateItem(var6, param0, param1 ^ 88, param2);
            return true;
          }
        }
        return false;
    }

    final void processClicks(int param0, int param1, int param2) {
        int var4_int = 0;
        IconTextComponent var5;
        int var6;
        IconTextComponent stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        QuickChatMenu var4;
        QuickChatMenu var7;
        var6 = Pixelate.field_H ? 1 : 0;
        for (var4_int = 0; this.field_Sb.length > var4_int; var4_int++) {
          var5 = this.field_Sb[var4_int];
          if (1 == var5.field_P) {
            this.activateItem(var4_int, param2, 118, param0);
            stackIn_7_0 = var5;
            stackIn_8_1 = (this.openItemIndex == var4_int);
            stackIn_7_0.field_U = stackIn_8_1;
          }
        }
        if (this.openItemIndex != param1) {
          var7 = this.field_Gb[this.openItemIndex];
          var4 = var7;
          if (var4 != null) {
            var7.processClicks(param0, param1 + 0, param2);
          }
        }
        if (this.field_Kb > 0) {
          this.setOpenAnimationStep(-1 + this.field_Kb, (byte) -106);
        }
    }

    final static int getAudioSampleRate(int param0) {
        if (param0 != 0) {
          return 100;
        }
        return FireworkBurst.field_f;
    }

    final boolean hasPressedItem(int param0) {
        int var4 = 0;
        IconTextComponent var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var2 = 0;
        IconTextComponent[] var3 = this.field_Sb;
        if (param0 != 14685) {
          return false;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          var2 = var2 | (var5.field_P != 0 ? 1 : 0);
        }
        if (var2 == 0 && this.openItemIndex != -1 &&
          this.field_Gb[this.openItemIndex] != null) {
          var2 = this.field_Gb[this.openItemIndex].hasPressedItem(param0 + 0) ? 1 : 0;
        }
        return var2 != 0;
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
        this.openItemIndex = -1;
        try {
          this.field_Hb = param7;
          this.field_Tb = param5;
          this.field_Gb = param4;
          this.field_Mb = this.field_Tb.length;
          var17 = param3.font;
          var18 = var17;
          this.field_Jb = var18.maxAscent + (2 + var18.maxDescent);
          this.field_Rb = 0;
          this.field_Ob = this.field_Jb * this.field_Mb;
          this.field_Sb = new IconTextComponent[this.field_Mb];
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; var13 < this.field_Mb; var13++) {
            if (this.field_Hb[var13] > 0) {
              param6[var13] = var11 + AudioPumpHelpers.charToString(124, this.field_Hb[var13]).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (null != this.field_Gb[var13] ||
              -1 == this.field_Tb[var13]) {
              var14 = PendingFlagGlobals.field_b;
            }
            this.field_Sb[var13] = new IconTextComponent(0L, param2, (SceneWidget) null, param3, (Sprite) (var14), param6[var13]);
            this.addChild(this.field_Sb[var13], (byte) 26);
            var15 = var17.textWidth(param6[var13]);
            if (var15 > this.field_Rb) {
              this.field_Rb = var15;
            }
          }
          this.field_Rb = this.field_Rb + (10 + PendingFlagGlobals.field_b.field_A);
          this.setOpenAnimationStep(12, (byte) -85);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("te.<init>(").append(param0).append(',');
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
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final int getCascadeWidth(int param0) {
        if (param0 != -16200) {
          return 111;
        }
        return this.field_Fb + (this.field_Pb != null ? this.field_Pb.getCascadeWidth(-16200) : 0);
    }

    private final void setOpenAnimationStep(int param0, byte param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        this.field_Kb = param0;
        if (param1 > -73) {
          this.hasPressedItem(-111);
        }
        for (var5 = 0; var5 < this.field_Mb; var5++) {
          var3 = var5 * this.field_Jb;
          var4 = this.field_Kb * this.field_Kb;
          this.field_Sb[var5].field_S = ((-this.screenY + this.field_Ub) * var4 + (-var4 + 144) * var3) / 144;
        }
    }

    private final void activateItem(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        var7 = Pixelate.field_H ? 1 : 0;
        if (this.openItemIndex != param0) {
          if (this.field_Gb[param0] != null) {
            this.resetSelection(17872);
            this.setOpenAnimationStep(0, (byte) -96);
            this.openItemIndex = param0;
            this.field_Pb = this.field_Gb[this.openItemIndex];
            StripedProgressBar.attachQuickChatMenu(this.field_Pb, true);
            this.field_Pb.setOpenAnimationStep(12, (byte) -104);
          } else {
            if (-1 != this.field_Tb[param0]) {
              var5 = 32768 | this.field_Tb[param0];
              var6 = ChatChannelGlobals.field_d;
              if (var6 == 0 &&
                LoginMethod.field_c != null) {
                var6 = 1;
              }
              if (IterableNodeHashTable.getChatFilterMode(var6, 0) == 2) {
                Js5ArchiveManager.setChatFilterMode(1, -26931, var6, param1);
              }
              var8 = (String) null;
              QuickChatSendHelpers.sendQuickChatMessage(true, ChatChannelGlobals.field_d, var5, (String) null, CheckboxPainter.field_k, param3);
              NumberFormatHelpers.setLastQuickChatTarget(var5, NoticeKind.field_e, CheckboxPainter.field_k, (byte) 9, ChatChannelGlobals.field_d);
              ScoreMarkerDemo.closeQuickChatMenu(false);
              SocketJs5Transport.resetRetryTimer(-93);
            } else {
              ScrollPaneWithFooter.openQuickChatHelp(-127);
              ScoreMarkerDemo.closeQuickChatMenu(false);
            }
          }
        } else {
          this.resetSelection(17872);
          this.setOpenAnimationStep(0, (byte) -118);
        }
        if (param2 <= 54) {
          this.processShortcutKey(-128, -51, 10);
        }
    }

    public static void releaseStatics(int param0) {
        field_Qb = null;
        if (param0 != 1) {
          field_Eb = (String) null;
        }
        field_Eb = null;
        field_Nb = null;
        field_Ib = null;
    }

    static {
        field_Eb = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_Ib = "Please log in to access this feature.";
        field_Nb = new CredentialKind(2);
    }
}
