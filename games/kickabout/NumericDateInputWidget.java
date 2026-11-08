/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NumericDateInputWidget extends DateInputWidget {
    static int field_I;
    static int[] field_Q;
    static String field_N;
    static String field_C;
    static String field_O;
    static int field_T;
    private TextInputWidget field_K;
    private TextInputWidget field_L;
    static int[] field_M;
    private TextInputWidget field_P;
    static int field_R;
    static QuickChatKeysHelpPanel field_J;
    private boolean field_U;
    static String field_S;

    final static void drawQuickChatKeysHelp(int param0, boolean param1) {
        if (null != field_J) {
          SoftwareRasterizer.darkenRectangle(SoftwareRasterizer.field_b, SoftwareRasterizer.field_e, -SoftwareRasterizer.field_b + SoftwareRasterizer.field_c, SoftwareRasterizer.field_h - SoftwareRasterizer.field_e);
          field_J.draw(param0 ^ 30543, param1);
        }
        if (param0 != 30521) {
          NumericDateInputWidget.releaseStatics(81);
        }
    }

    final int getDay(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 <= 79) {
          return 33;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_L.field_q);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final boolean b(boolean param0) {
        boolean stackIn_14_0 = false;
        if (!param0) {
          field_Q = (int[]) null;
        }
        if (this.field_L.field_q != null &&
          0 != this.field_L.field_q.length()) {
          if (this.field_K.field_q == null) {
            return true;
          }
          if (this.field_K.field_q.length() == 0) {
            return true;
          }
          stackIn_14_0 = (null == this.field_P.field_q) || (this.field_P.field_q.length() == 0);
          return stackIn_14_0;
        }
        return true;
    }

    final String getTooltip(int param0) {
        String var2 = this.field_K.getTooltip(param0);
        if (var2 != null) {
          return var2;
        }
        if (!this.field_m) {
          return null;
        }
        return null != this.field_u ? this.field_u : this.field_q;
    }

    final int getMonthIndex(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 != 48) {
            this.drawLayer(-35, -39, 1, -65);
          }
          stackIn_3_0 = -1 + Integer.parseInt(this.field_K.field_q);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    private NumericDateInputWidget(WidgetPainter param0, boolean param1) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_L = (TextInputWidget) ((Object) new ValidatedTextWidget("", (UiListener) null, 2));
          this.field_K = (TextInputWidget) ((Object) new ValidatedTextWidget("", (UiListener) null, 2));
          this.field_P = (TextInputWidget) ((Object) new ValidatedTextWidget("", (UiListener) null, 4));
          this.field_P.field_r = param0;
          this.field_K.field_r = param0;
          this.field_L.field_r = param0;
          this.field_U = param1 ? true : false;
          if (this.field_U) {
            this.a(-126, this.field_K);
            this.a(-20, this.field_L);
          } else {
            this.a(-123, this.field_L);
            this.a(-46, this.field_K);
          }
          this.a(-57, this.field_P);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "fb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setValidator(DateInputValidator param0, int param1) {
        try {
          super.setValidator(param0, param1);
          this.field_L.field_k = (UiListener) ((Object) param0);
          this.field_K.field_k = (UiListener) ((Object) param0);
          this.field_P.field_k = (UiListener) ((Object) param0);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "fb.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int getYear(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            NumericDateInputWidget.drawQuickChatKeysHelp(-65, false);
          }
          stackIn_3_0 = Integer.parseInt(this.field_P.field_q);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    NumericDateInputWidget(WidgetPainter param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.setBounds(param5, 1, param2, param4, param3);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "fb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(UiWidget param0, String param1, int param2, byte param3, int param4) {
        try {
          if (param3 < 86) {
            field_R = 41;
          }
          EmailSyntaxValidator.field_k.d(param1, param4 + param0.field_t + (param0.field_n >> 1), -5 + param0.field_g + param2, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "fb.L(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static IndexedSprite[] i(byte param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        IndexedSprite[] var1 = new IndexedSprite[MenuButton.field_l];
        for (var2 = 0; var2 < MenuButton.field_l; var2++) {
          var1[var2] = new IndexedSprite(AvailabilityCheckRequest.field_i, AccountTermsPanel.field_J, IsaacRandom.field_f[var2], LoginResponseUiSupport.field_g[var2], MouseInputHandler.field_c[var2], PasswordValidator.field_j[var2], SquadPickerDialog.field_O[var2], PlayAreaMovementSupport.field_a);
        }
        if (param0 <= 78) {
          NumericDateInputWidget.releaseStatics(-91);
        }
        ScrollContainer.h((byte) -118);
        return var1;
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1 + 0, param2, param3, param4);
        int var6 = -130 + param3 >> 1;
        if (this.field_U) {
          this.field_K.setBounds(param0, 1, var6, 25, 0);
          this.field_L.setBounds(param0, param1 + 0, 45 + var6, 25, 0);
        } else {
          this.field_L.setBounds(param0, 1, var6, 25, 0);
          this.field_K.setBounds(param0, param1 + 0, var6 + 45, 25, 0);
        }
        this.field_P.setBounds(param0, param1, 90 + var6, 40, 0);
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, (int) (char)param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        param3 = param3 + this.field_g;
        param2 = param2 + this.field_t;
        this.a(this.field_L, LoginText.field_d, param3, (byte) 117, param2);
        this.a(this.field_K, MatchAgent.field_d, param3, (byte) 96, param2);
        this.a(this.field_P, TrinketTile.field_Ab, param3, (byte) 108, param2);
    }

    public static void releaseStatics(int param0) {
        field_Q = null;
        field_C = null;
        field_J = null;
        field_N = null;
        if (param0 != -23192) {
          return;
        }
        field_M = null;
        field_O = null;
        field_S = null;
    }

    static {
        field_Q = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_I = 0;
        field_N = "Offer draw";
        field_O = "Outbidded";
        field_M = new int[8192];
        field_C = "Tutorial";
        field_T = 0;
        field_S = "header";
    }
}
