/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateInputWidget extends DateInputWidget {
    static SpriteWidget field_J;
    private EditableTextWidget field_F;
    private EditableTextWidget field_G;
    private boolean field_E;
    static Sprite[] gamePrivacyIcons;
    private EditableTextWidget field_H;

    final boolean isDateIncomplete(int param0) {
        if (null == this.field_G.field_n) {
          return true;
        }
        if (this.field_G.field_n.length() == 0) {
          return true;
        }
        if (null == this.field_H.field_n) {
          return true;
        }
        if (this.field_H.field_n.length() == 0) {
          return true;
        }
        if (null == this.field_F.field_n) {
          return true;
        }
        if (this.field_F.field_n.length() == 0) {
          return true;
        }
        if (param0 > 44) {
          return false;
        }
        this.drawLayer((byte) 30, -120, 125, 19);
        return false;
    }

    final static void openChatMessageContextMenu(int param0, ChatMessage param1) {
        int stackIn_2_0;
        Object stackIn_2_1;
        Object stackIn_2_2;
        String stackIn_2_3;
        long stackIn_2_4;
        String stackIn_2_5;
        int stackIn_3_6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        PlayerContextMenu var6 = null;
        String var7 = null;
        PlayerContextMenu var8 = null;
        String var9 = null;
        PlayerContextMenu var10 = null;
        String var11 = null;
        PlayerContextMenu var12 = null;
        String var13 = null;
        PlayerContextMenu var14 = null;
        try {
          stackIn_2_0 = param1.field_n;
          stackIn_2_1 = null;
          stackIn_2_2 = null;
          stackIn_2_3 = param1.field_r;
          stackIn_2_4 = param1.field_p;
          stackIn_2_5 = param1.field_i;
          if (param1.field_n != 1) {
            stackIn_3_6 = 0;
          } else {
            stackIn_3_6 = param1.field_k;
          }
          ContextMenuHelpers.openContextMenu(stackIn_2_0, (ScrollPane) (stackIn_2_1), (int[]) (stackIn_2_2), stackIn_2_3, stackIn_2_4, stackIn_2_5, stackIn_3_6, param1.field_t, 97);
          if (0 == param1.field_n &&
            !DateOfBirthValidator.isPublicChatInputOpen(45) &&
            null == AudioSetupHelpers.field_d &&
            QueuedRequest.field_h == null) {
            if (!RankingsRequest.field_n) {
              var6 = IntKeyLookup.field_e;
              var7 = BufferedFile.field_n;
              var6.field_a.addItem(1, var7, 14);
            }
            var8 = IntKeyLookup.field_e;
            var9 = ConnectionStage.field_d;
            var8.field_a.addItem(1, var9, 20);
          }
          var2_int = -93 % ((31 - param0) / 54);
          if (param1.field_n == 1 &&
            !DateOfBirthValidator.isPublicChatInputOpen(91) &&
            AudioSetupHelpers.field_d != null &&
            param1.field_k == AudioSetupHelpers.field_d.getGameId((byte) -124)) {
            if (!RankingsRequest.field_n) {
              var10 = IntKeyLookup.field_e;
              var11 = RasterEffectHelpers.field_a;
              var10.field_a.addItem(1, var11, 14);
            }
            var12 = IntKeyLookup.field_e;
            var13 = ChatFilterHelpers.field_g;
            var12.field_a.addItem(1, var13, 20);
          }
          IntKeyLookup.field_e.addRoomAdmissionActions((byte) -89);
          IntKeyLookup.field_e.addGameMemberActions(false, (byte) -122);
          IntKeyLookup.field_e.addSocialActions(4, param1.field_g, param1.field_n);
          IntKeyLookup.field_e.addReportAbuseAction((byte) -65);
          IntKeyLookup.field_e.addChatFilterActions(param1, false);
          var14 = IntKeyLookup.field_e;
          var4 = HuffmanCodec.field_b;
          var5 = PasswordFieldPainter.field_y;
          var14.field_a.openAt(0, 0, 0, var4, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("jb.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private BirthDateInputWidget(WidgetListener param0, boolean param1) {
        super(0, 0, 0, 0, (WidgetListener) null);
        try {
          this.field_G = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (UiListener) null, 2));
          this.field_H = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (UiListener) null, 2));
          this.field_F = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (UiListener) null, 4));
          this.field_F.listener = param0;
          this.field_H.listener = param0;
          this.field_G.listener = param0;
          this.field_E = param1 ? true : false;
          if (!this.field_E) {
            this.addChild((UiWidget) (this.field_G), (byte) -78);
            this.addChild((UiWidget) (this.field_H), (byte) -78);
          } else {
            this.addChild((UiWidget) (this.field_H), (byte) -78);
            this.addChild((UiWidget) (this.field_G), (byte) -78);
          }
          this.addChild((UiWidget) (this.field_F), (byte) -78);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    BirthDateInputWidget(WidgetListener param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.setBounds(param5, true, param3, param2, param4);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void drawFieldCaption(UiWidget param0, String param1, int param2, int param3, int param4) {
        try {
          Js5Transport.arezzo12Font.drawCentered(param1, param0.field_l + param3 + (param0.field_g >> 1), -5 + param2 + param0.field_u, 16777215, -1);
          if (param4 < 6) {
            BirthDateInputWidget.updateLoginUi(75, -12);
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jb.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void updateLoginUi(int param0, int param1) {
        PasswordValidator.pollAccountUiResult(3938);
        if (param1 != 45) {
          BirthDateInputWidget.updateLoginUi(26, -128);
        }
    }

    final String getTooltip(int param0) {
        String var2 = this.field_H.getTooltip(63);
        if (var2 != null) {
          return var2;
        }
        if (this.field_p) {
          return null == this.field_h ? this.field_n : this.field_h;
        }
        if (param0 <= 35) {
          this.field_H = (EditableTextWidget) null;
          return null;
        }
        return null;
    }

    final int getDay(int param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 == -2) {
            stackIn_4_0 = Integer.parseInt(this.field_G.field_n);
            return stackIn_4_0;
          }
          stackIn_2_0 = 104;
          return stackIn_2_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    public static void releaseStatics(byte param0) {
        field_J = null;
        if (param0 != -99) {
          return;
        }
        gamePrivacyIcons = null;
    }

    final int getMonthIndex(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 > -23) {
          this.getMonthIndex(-108);
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_H.field_n) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final void setBirthDateValidator(int param0, DateOfBirthValidator param1) {
        try {
          super.setBirthDateValidator(param0, param1);
          this.field_G.field_o = (UiListener) ((Object) param1);
          this.field_H.field_o = (UiListener) ((Object) param1);
          this.field_F.field_o = (UiListener) ((Object) param1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jb.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, param2, param3);
        if (param3 == 0) {
          param1 = param1 + this.field_l;
          param2 = param2 + this.field_u;
          this.drawFieldCaption(this.field_G, MusicCrossfadeStream.field_t, param2, param1, 91);
          this.drawFieldCaption(this.field_H, Js5Transport.field_a, param2, param1, 15);
          this.drawFieldCaption(this.field_F, ChecksumHelpers.field_e, param2, param1, 108);
          return;
        }
    }

    final static String prefixWithCrown(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = BackgroundParticle.getPlayerCrownIcon(BoundedUrlRequest.field_s, ReflectionCheckHelpers.field_d, 1);
          if (param0 <= 120) {
            BirthDateInputWidget.updateLoginUi(84, -9);
          }
          if (1 == var2_int) {
            param1 = "<img=0>" + param1;
          }
          if (2 == var2_int) {
            param1 = "<img=1>" + param1;
          }
          stackIn_9_0 = (String) (param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("jb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int getYear(boolean param0) {
        NumberFormatException var2 = null;
        DateOfBirthValidator var3 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          var3 = (DateOfBirthValidator) null;
          this.setBirthDateValidator(-44, (DateOfBirthValidator) null);
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_F.field_n);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final void setBounds(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var6Lifetime1;
        super.setBounds(param0, param1, param2, param3, param4);
        if (!param1) {
          String var7 = (String) null;
          BirthDateInputWidget.prefixWithCrown(36, (String) null);
          var6 = param4 - 130 >> 1;
          if (this.field_E) {
            this.field_H.setBounds(param0, true, 0, var6, 25);
            this.field_G.setBounds(param0, true, 0, var6 + 45, 25);
            this.field_F.setBounds(param0, param1, 0, var6 + 90, 40);
            return;
          }
          this.field_G.setBounds(param0, true, 0, var6, 25);
          this.field_H.setBounds(param0, param1, 0, 45 + var6, 25);
          this.field_F.setBounds(param0, param1, 0, var6 + 90, 40);
          return;
        }
        var6Lifetime1 = param4 - 130 >> 1;
        if (this.field_E) {
          this.field_H.setBounds(param0, true, 0, var6Lifetime1, 25);
          this.field_G.setBounds(param0, true, 0, var6Lifetime1 + 45, 25);
          this.field_F.setBounds(param0, param1, 0, var6Lifetime1 + 90, 40);
          return;
        }
        this.field_G.setBounds(param0, true, 0, var6Lifetime1, 25);
        this.field_H.setBounds(param0, param1, 0, 45 + var6Lifetime1, 25);
        this.field_F.setBounds(param0, param1, 0, var6Lifetime1 + 90, 40);
    }

    static {
    }
}
