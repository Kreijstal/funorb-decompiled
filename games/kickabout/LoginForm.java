/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class LoginForm extends WidgetContainer implements TextInputListener, ButtonListener {
    private TextInputWidget field_J;
    private TextInputWidget field_N;
    private TextButton field_K;
    private boolean field_C;
    private TextButton field_F;
    private boolean field_H;
    static Random field_E;
    private TextButton field_L;
    private String field_D;
    private boolean field_I;
    static BufferedCacheFile field_G;
    static int[] field_B;
    static String[] field_M;

    final void focusFields(byte param0) {
        this.field_N.clearInputText((byte) -55);
        this.field_J.clearInputText((byte) -70);
        if (param0 >= -65) {
          this.field_C = false;
        }
    }

    private final void submitLogin(int param0) {
        if (GuestLoginSupport.isGuestLoginEnabled(3) ||
          !(this.field_N.field_q.length() <= 0) &&
          !(this.field_J.field_q.length() <= 0)) {
          UiKeyRoutingSupport.setAccountStatusText(this.field_J.field_q, (byte) -118, this.field_N.field_q);
        }
        if (param0 != 60) {
          field_E = (Random) null;
        }
    }

    final static void tintSpriteForSurface(Sprite param0, int param1) {
        double[] var3 = null;
        if (KitPatternMaskSupport.field_c == 0) {
          return;
        }
        try {
          if (param1 != 20684) {
            field_B = (int[]) null;
          }
          var3 = WorldSpriteDecoration.field_a[KitPatternMaskSupport.field_c];
          double[] var2 = var3;
          SpritePixelSupport.adjustSpriteHsv(param0, var3[0], var3[1], var3[2]);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void submitHighScore(byte param0, int param1, HighScoreSubmission param2) {
        try {
          if (param0 != 70) {
            LoginForm.drawAnimatedPitchEdges((byte) -2);
          }
          FaceNormal.field_d.addLast(param2, param0 - 67);
          BlobSubmission.writeHighScoreSubmission(125, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pd.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onEnterPressed(int param0, TextInputWidget param1) {
        try {
          if (this.field_N == param1) {
            this.field_J.requestKeyboardFocus((UiWidget) (this), 0);
          }
          if (this.field_J == param1) {
            this.submitLogin(60);
          }
          int var3_int = 35 / ((param0 - 8) / 47);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pd.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (this.field_D != null) {
          ModelMaterial.field_a.drawParagraph(this.field_D, 20 + param2 + this.field_t, 15 + param3 + this.field_g, -40 + this.field_n, this.field_i, 16777215, -1, 1, 0, ModelMaterial.field_a.field_G);
        }
        if (null != this.field_L) {
          SoftwareRasterizer.drawHorizontalLine(param2 + 10, param3 + 134, -20 + this.field_n, 4210752);
        }
        super.drawLayer(param0, (int) (char)param1, param2, param3);
    }

    public final void onAction(int param0, TextButton param1, int param2, byte param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Kickabout.field_G;
        try {
          if (param1 != this.field_K) {
            if (this.field_L != param1) {
              if (this.field_F == param1) {
                if (!this.field_H) {
                  if (this.field_C) {
                    MusicPatch.showAccountChoice((byte) -124);
                  } else {
                    PacketBuffer.setAccountMenuMode(4);
                  }
                } else {
                  PlayerContextMenu.requestLoginMenuMode(false);
                }
              }
            } else {
              NameSuggestionsPanel.showAccountRegistrationPanel((byte) -76);
            }
          } else {
            this.submitLogin(60);
          }
          if (param3 < 64) {
            field_B = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("pd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKeyInput(char param0, byte param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -60) {
            this.field_H = true;
          }
          if (super.handleKeyInput(param0, (byte) -62, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_9_0 = this.focusPreviousChild(param2, (byte) -100);
            return stackIn_9_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_12_0 = this.focusNextChild(param2, (byte) 126);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("pd.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final void setUsername(String param0, byte param1) {
        TextInputWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_N;
          var4 = param0;
          int var5 = 25 % ((33 - param1) / 48);
          var3.setInputText(var4, (byte) -17, false);
          this.field_J.clearInputText((byte) -41);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pd.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -11203) {
          field_E = (Random) null;
        }
        field_B = null;
        field_E = null;
        field_G = null;
        field_M = null;
    }

    public final void onTextChanged(byte param0, TextInputWidget param1) {
        try {
          if (param0 < 65) {
            this.focusFields((byte) -105);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    LoginForm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        CaptionedContainer dupTemp$0 = null;
        CaptionedContainer dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        TextButton stackIn_18_1 = null;
        TextButton stackIn_18_2 = null;
        TextButton stackIn_19_1 = null;
        TextButton stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        SpriteButtonPainter var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        LoginMethod var9 = null;
        CaptionedContainer var12 = null;
        CaptionedContainer var13 = null;
        try {
          this.field_D = param1;
          stackIn_4_1 = (param4);
          this.field_C = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_I = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_H = stackIn_10_1;
          if (this.field_H && (this.field_I ||
            this.field_C)) {
            throw new IllegalStateException();
          }
          this.field_N = (TextInputWidget) ((Object) new ValidatedTextWidget(param0, (UiListener) (this), 100));
          this.field_J = (TextInputWidget) ((Object) new ValidatedTextWidget("", (UiListener) (this), 20));
          if (!this.field_H) {
            this.field_K = new TextButton(ValidationHelpWidget.field_P, (UiListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_C) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = TextLineLayoutSupport.field_f;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = TrinketCountSortCriterion.field_o;
            }
            this.field_F = new TextButton(stackIn_19_3, (UiListener) null);
            if (this.field_I) {
              this.field_L = new TextButton(ConsoleEvaluationException.field_f, (UiListener) (this));
            }
          } else {
            this.field_K = new TextButton(QuickChatCategoryCache.field_d, (UiListener) null);
            this.field_F = new TextButton(AccountNameAvailabilityValidator.field_o, (UiListener) null);
            this.field_N.field_y = false;
          }
          this.field_N.field_r = (WidgetPainter) ((Object) new BeveledTextPainter(10000536));
          this.field_J.field_r = (WidgetPainter) ((Object) new PasswordFieldPainter(10000536));
          var6 = new SpriteButtonPainter();
          this.field_K.field_r = (WidgetPainter) ((Object) var6);
          if (this.field_F != null) {
            this.field_F.field_r = (WidgetPainter) ((Object) var6);
          }
          this.field_N.field_u = SquadGridWidget.field_yb;
          if (null != this.field_L) {
            this.field_L.field_r = (WidgetPainter) ((Object) var6);
          }
          if (null != this.field_L) {
            this.field_L.field_u = AppletContextSupport.field_c;
          }
          if (!this.field_H) {
            if (!this.field_C) {
              this.field_F.field_r = (WidgetPainter) ((Object) new LinkTextPainter());
            } else {
              this.field_F.field_u = HelpTipDialog.field_G;
              this.field_F.field_r = (WidgetPainter) ((Object) new LinkTextPainter());
            }
          } else {
            this.field_F.field_u = DebugConsole.field_x;
          }
          this.field_g = 15;
          var7 = ModelMaterial.field_a;
          if (this.field_D != null) {
            this.field_g = this.field_g + (5 + var7.paragraphHeight(this.field_D, -40 + this.field_n, var7.field_G));
          }
          var8 = GameplayHelpScreen.field_J;
          var9 = TournamentLobbyScreen.readLastLoginMethod(AppletContextSupport.getActiveApplet(104), -7465);
          if (IsSixCommand.field_F == var9) {
            var8 = SetLagCommand.field_A;
          } else {
            if (var9 == AccountRegistrationPanel.field_I) {
              var8 = ConsoleTokenCursor.field_c;
            }
          }
          dupTemp$0 = new CaptionedContainer(10, this.field_g, -20 + this.field_n, 25, this.field_N, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(-120, dupTemp$0);
          this.field_g = this.field_g + (((UiWidget) ((Object) var12)).field_i + 5);
          dupTemp$1 = new CaptionedContainer(10, this.field_g, -20 + this.field_n, 25, this.field_J, false, 80, 3, var7, 16777215, TrinketTile.field_Ib);
          var13 = dupTemp$1;
          this.addChild(-55, dupTemp$1);
          this.field_K.field_k = (UiListener) (this);
          this.field_g = this.field_g + (((UiWidget) ((Object) var13)).field_i + 5);
          if (this.field_L != null) {
            this.field_L.field_k = (UiListener) (this);
          }
          if (null != this.field_F) {
            this.field_F.field_k = (UiListener) (this);
          }
          if (this.field_L == null) {
            this.field_K.setBounds(30, 1, 8, -10 + (-6 + this.field_n), this.field_g);
            this.field_g = this.field_g + 35;
          } else {
            this.field_K.setBounds(30, 1, 85, -95 + this.field_n, this.field_g);
            this.field_g = this.field_g + 60;
          }
          if (null != this.field_L) {
            this.field_L.setBounds(30, 1, 8, -16 + this.field_n, this.field_g);
            this.field_g = this.field_g + 35;
          }
          if (this.field_F != null) {
            if (!this.field_H &&
              !this.field_C) {
              this.field_F.setBounds(20, 1, 8, 40, this.field_g);
              this.field_g = this.field_g + 25;
            } else {
              this.field_F.setBounds(30, 1, 8, -10 + (this.field_n - 6), this.field_g);
              this.field_g = this.field_g + 35;
            }
          }
          this.setBounds(this.field_g + 3, 1, 0, this.field_n, 0);
          this.addChild(-63, this.field_K);
          if (null != this.field_L) {
            this.addChild(-42, this.field_L);
          }
          if (this.field_F != null) {
            this.addChild(-82, this.field_F);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("pd.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final String getUsername(int param0) {
        if (param0 <= 84) {
          UiWidget var3 = (UiWidget) null;
          this.handleKeyInput('f', (byte) 111, (UiWidget) null, -119);
        }
        if (null == this.field_N.field_q) {
          return "";
        }
        return this.field_N.field_q;
    }

    final static void drawAnimatedPitchEdges(byte param0) {
        int var7 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        IndexedSprite[] var8 = null;
        IndexedSprite[] var9 = null;
        int var10 = 0;
        HighScoreSubmission var11 = null;
        Sprite var12 = null;
        IndexedSprite[] stackIn_8_0 = null;
        IndexedSprite[] stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var10 = Kickabout.field_G;
        try {
          var12 = FootballerPreview.getSelectedPitchSprite(param0 ^ 5332);
          var2 = MySquadScreen.worldToScreenX(param0 ^ 62, -var12.field_o - 15 + 120);
          var3 = MySquadScreen.worldToScreenX(-54, 10 + var12.field_o * 3 - 15);
          var4 = var12.field_v;
          var5 = 6 * AuctionItem.field_f >> 8;
          var6 = -15;
          if (param0 != -79) {
            var11 = (HighScoreSubmission) null;
            LoginForm.submitHighScore((byte) -91, 14, (HighScoreSubmission) null);
          }
          for (var7 = 0; var7 < 4; var7++) {
            if ((var7 & 1) == 0) {
              stackIn_8_0 = DateInputValidator.field_e;
            } else {
              stackIn_8_0 = DualLinkNode.field_h;
            }
            var8 = stackIn_8_0;
            if ((var7 & 1) != 0) {
              stackIn_11_0 = ModalPanel.field_G;
            } else {
              stackIn_11_0 = ClientInteractionSupport.field_e;
            }
            var9 = stackIn_11_0;
            AuctionsScreen.drawIndexedPitchSprite(-840618968, var2, var8[var5], PitchProjectionSupport.worldToScreenY(var6, (byte) -56));
            AuctionsScreen.drawIndexedPitchSprite(-840618968, var3, var9[var5], PitchProjectionSupport.worldToScreenY(var6, (byte) -56));
            var6 = var6 + var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "pd.F(" + param0 + ')');
        }
    }

    static {
        field_E = new Random();
        field_B = new int[4];
        field_B[1] = 3385873;
        field_B[0] = 30651;
        field_B[3] = 16776960;
        field_B[2] = 13369344;
    }
}
