/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends WidgetContainer implements TextInputListener, ButtonActionListener {
    private boolean field_T;
    private EditableTextWidget field_E;
    private EditableTextWidget field_K;
    private boolean field_I;
    private TextButton field_J;
    private TextButton field_P;
    static RasterBuffer field_M;
    private String field_S;
    private boolean field_H;
    private TextButton field_F;
    static String field_O;
    static int field_D;
    static UiTheme field_Q;
    static int field_G;
    static String field_R;
    static String field_L;

    final void setAccountAndClearPassword(int param0, String param1) {
        EditableTextWidget var3 = null;
        String var4 = null;
        if (param0 > -101) {
          return;
        }
        try {
          var3 = this.field_E;
          var4 = param1;
          var3.setText(var4, 81, false);
          this.field_K.clearText(0);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ca.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void submitLoginIfAllowed(byte param0) {
        int var2;
        var2 = 63 / ((param0 + 91) / 35);
        if (ChatFilterHelpers.isReconnectLogin(-11532) ||
          !(this.field_E.field_n.length() <= 0) &&
          !(0 >= this.field_K.field_n.length())) {
          NetworkArchiveRequest.submitLogin((byte) 102, this.field_E.field_n, this.field_K.field_n);
        }
    }

    public final void onTextChanged(EditableTextWidget param0, int param1) {
        try {
          if (param1 != 13) {
            field_R = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ca.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_L = null;
        field_Q = null;
        field_R = null;
        field_M = null;
        field_O = null;
        if (param0 != 15) {
          LoginPanel.reverseBits(-80, -39, -127);
        }
    }

    final static int pollMenuSelection(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          if (param0 != 2) {
            field_M = (RasterBuffer) null;
          }
          while (GrowableIntList.pollKeyEvent((byte) -103)) {
            LoginMethod.field_k.handleVerticalNavigation(-126);
            if (LoginMethod.field_k.isActivated(false)) {
              var1_int = 1;
            }
            if (ScrollPane.field_Gb != 13) {
              continue;
            }
            var2 = 1;
          }
          LoginMethod.field_k.updatePointer(SocketJs5Transport.findPopupMenuRowAt(IconTextComponent.field_Jb, StatefulWidgetPainter.field_u, (byte) 97), false, SocketJs5Transport.findPopupMenuRowAt(PasswordFieldPainter.field_y, HuffmanCodec.field_b, (byte) 10));
          if (LoginMethod.field_k.isActivated(false)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            LoginMethod.field_k.field_d >= 0) {
            var3 = WidgetFactoryHelpers.field_a[LoginMethod.field_k.field_d];
            if (2 == var3 ||
              5 == var3) {
              PopupMenuHelpers.closePopupMenu(param0 ^ 3);
            }
          } else {
            if (var2 != 0 &&
              IntrusiveDeque.field_d != 2) {
              PopupMenuHelpers.closePopupMenu(1);
            }
          }
          if (0 == var3 &&
            2 == IntrusiveDeque.field_d) {
            var4 = ClockAndTextHelpers.monotonicMillis(-9986) - AccountCreationSupport.field_e;
            var6 = (int)((10999L - var4) / 1000L);
            if (var6 <= 0) {
              PopupMenuHelpers.buildPopupMenu(true, 5, (byte) 71);
              var3 = 2;
            }
          }
          stackIn_25_0 = var3;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "ca.P(" + param0 + ')');
        }
    }

    final void clearInputs(byte param0) {
        this.field_E.clearText(0);
        this.field_K.clearText(0);
        if (param0 > -77) {
          this.field_P = (TextButton) null;
        }
    }

    LoginPanel(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetListener) null);
        LabeledChildWidget dupTemp$0 = null;
        LabeledChildWidget dupTemp$1 = null;
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
        ThreeSliceButtonPainter var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        LoginMethod var9 = null;
        LabeledChildWidget var12 = null;
        LabeledChildWidget var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_T = stackIn_4_1;
          this.field_S = param1;
          stackIn_7_1 = (param3);
          this.field_I = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_H = stackIn_10_1;
          if (this.field_H && (this.field_I ||
            this.field_T)) {
            throw new IllegalStateException();
          }
          this.field_E = (EditableTextWidget) ((Object) new ValidatedTextWidget(param0, (UiListener) (this), 100));
          this.field_K = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (UiListener) (this), 20));
          if (!this.field_H) {
            this.field_F = new TextButton(TextWidgetPainter.field_q, (UiListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_T) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = DecodedSpriteHelpers.field_e;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = AccountChoicePanel.field_D;
            }
            this.field_P = new TextButton(stackIn_19_3, (UiListener) null);
            if (this.field_I) {
              this.field_J = new TextButton(DelayedPacket.field_g, (UiListener) (this));
            }
          } else {
            this.field_F = new TextButton(MenuInputState.field_e, (UiListener) null);
            this.field_P = new TextButton(BoundedUrlRequest.field_k, (UiListener) null);
            this.field_E.field_C = false;
          }
          this.field_E.listener = (WidgetListener) ((Object) new TextFieldPainter(10000536));
          this.field_K.listener = (WidgetListener) ((Object) new PasswordFieldPainter(10000536));
          var6 = new ThreeSliceButtonPainter();
          this.field_F.listener = (WidgetListener) ((Object) var6);
          if (this.field_P != null) {
            this.field_P.listener = (WidgetListener) ((Object) var6);
          }
          this.field_E.field_h = PasswordValidator.field_n;
          if (this.field_J != null) {
            this.field_J.listener = (WidgetListener) ((Object) var6);
          }
          if (null != this.field_J) {
            this.field_J.field_h = LongAndTextCredentials.field_j;
          }
          if (!this.field_H) {
            if (!this.field_T) {
              this.field_P.listener = (WidgetListener) ((Object) new LinkTextPainter());
            } else {
              this.field_P.field_h = LobbySessionHelpers.field_f;
              this.field_P.listener = (WidgetListener) ((Object) new LinkTextPainter());
            }
          } else {
            this.field_P.field_h = RenderTargetHelpers.field_b;
          }
          this.field_u = 15;
          var7 = PlayerContextMenu.arezzo14Font;
          if (this.field_S != null) {
            this.field_u = this.field_u + (var7.paragraphHeight(this.field_S, -40 + this.field_g, var7.field_H) + 5);
          }
          var8 = ConditionalTextValue.field_g;
          var9 = LoginMethodHelpers.readLastLoginMethod(-78, ContentTransitionDialog.getApplet((byte) 39));
          if (QuickChatHelpHelpers.field_b != var9) {
            if (var9 == Virogrid.field_O) {
              var8 = TextJoinHelpers.field_c;
            }
          } else {
            var8 = ArrayWidgetContainer.field_y;
          }
          dupTemp$0 = new LabeledChildWidget(10, this.field_u, this.field_g - 20, 25, this.field_E, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild((UiWidget) (dupTemp$0), (byte) -78);
          this.field_u = this.field_u + (5 + ((UiWidget) ((Object) var12)).field_m);
          dupTemp$1 = new LabeledChildWidget(10, this.field_u, this.field_g - 20, 25, this.field_K, false, 80, 3, var7, 16777215, GameClock.field_b);
          var13 = dupTemp$1;
          this.addChild((UiWidget) (dupTemp$1), (byte) -78);
          this.field_u = this.field_u + (5 + ((UiWidget) ((Object) var13)).field_m);
          this.field_F.field_o = (UiListener) (this);
          if (this.field_J != null) {
            this.field_J.field_o = (UiListener) (this);
          }
          if (this.field_P != null) {
            this.field_P.field_o = (UiListener) (this);
          }
          if (this.field_J != null) {
            this.field_F.setBounds(30, true, this.field_u, 85, this.field_g - 95);
            this.field_u = this.field_u + 60;
          } else {
            this.field_F.setBounds(30, true, this.field_u, 8, this.field_g - 16);
            this.field_u = this.field_u + 35;
          }
          if (this.field_J != null) {
            this.field_J.setBounds(30, true, this.field_u, 8, this.field_g - 6 - 10);
            this.field_u = this.field_u + 35;
          }
          if (null != this.field_P) {
            if (!this.field_H &&
              !this.field_T) {
              this.field_P.setBounds(20, true, this.field_u, 8, 40);
              this.field_u = this.field_u + 25;
            } else {
              this.field_P.setBounds(30, true, this.field_u, 8, -10 + (-6 + this.field_g));
              this.field_u = this.field_u + 35;
            }
          }
          this.setBounds(this.field_u + 3, true, 0, 0, this.field_g);
          this.addChild((UiWidget) (this.field_F), (byte) -78);
          if (null != this.field_J) {
            this.addChild((UiWidget) (this.field_J), (byte) -78);
          }
          if (null != this.field_P) {
            this.addChild((UiWidget) (this.field_P), (byte) -78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ca.<init>(");
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
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void startLoginAs(String param0, byte param1) {
        try {
          if (param1 >= -23) {
            field_D = 103;
          }
          LobbyGameListHelpers.setLoginOptionalText(param0, 0);
          IterableNodeHashTable.showOverlayMessage(false, NameCharacterHelpers.field_a, false);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ca.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean handleKeyInput(UiWidget param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, 60)) {
            return true;
          }
          if (98 == param2) {
            stackIn_6_0 = this.focusPreviousChild(2, param0);
            return stackIn_6_0;
          }
          var5_int = -8 % ((-75 - param3) / 36);
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(-16234, param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ca.AA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onTextSubmitted(boolean param0, EditableTextWidget param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_E == param1) {
            this.field_K.focusNext((UiWidget) (this), -8515);
          }
          if (param0) {
            field_G = 96;
          }
          if (this.field_K == param1) {
            this.submitLoginIfAllowed((byte) -46);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ca.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void advanceLobbyTransitions(boolean param0, int param1) {
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param0 ||
          AudioSetupHelpers.field_d == null) {
          QuickChatPhraseRegistry.field_h = false;
        }
        if (param1 > -105) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0) {
          if (ClientServiceHelpers.field_d > 0) {
            ClientServiceHelpers.field_d = ClientServiceHelpers.field_d - 1;
          } else {
            if (PendingHighscoreRequest.field_h > 0) {
              PendingHighscoreRequest.field_h = PendingHighscoreRequest.field_h - 1;
            } else {
              if (QuickChatPhraseDefinition.field_z > 0) {
                QuickChatPhraseDefinition.field_z = QuickChatPhraseDefinition.field_z - 1;
              }
            }
          }
        } else {
          if (AudioSetupHelpers.field_d != null) {
            if (ClientServiceHelpers.field_d > 0) {
              ClientServiceHelpers.field_d = ClientServiceHelpers.field_d - 1;
            } else {
              if (PendingHighscoreRequest.field_h > 0) {
                PendingHighscoreRequest.field_h = PendingHighscoreRequest.field_h - 1;
              } else {
                if (!(QuickChatPhraseDefinition.field_z >= EmailValidator.field_t)) {
                  if (QuickChatPhraseDefinition.field_z == 0) {
                    AccountCreationForm.createSharedPanels((byte) -68, false);
                  }
                  QuickChatPhraseDefinition.field_z = QuickChatPhraseDefinition.field_z + 1;
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (QueuedRequest.field_h == null) {
              QuickChatPhraseRegistry.field_h = false;
              if (PendingHighscoreRequest.field_h > 0) {
                PendingHighscoreRequest.field_h = PendingHighscoreRequest.field_h - 1;
              } else {
                if (QuickChatPhraseDefinition.field_z > 0) {
                  QuickChatPhraseDefinition.field_z = QuickChatPhraseDefinition.field_z - 1;
                } else {
                  if (!(ClientServiceHelpers.field_d >= EmailValidator.field_t)) {
                    if (ClientServiceHelpers.field_d == 0) {
                      GameKeyHandler.buildLobbyRoots(0);
                    }
                    ClientServiceHelpers.field_d = ClientServiceHelpers.field_d + 1;
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (ClientServiceHelpers.field_d > 0) {
                ClientServiceHelpers.field_d = ClientServiceHelpers.field_d - 1;
              } else {
                if (0 < QuickChatPhraseDefinition.field_z) {
                  QuickChatPhraseDefinition.field_z = QuickChatPhraseDefinition.field_z - 1;
                } else {
                  if (PendingHighscoreRequest.field_h < EmailValidator.field_t) {
                    if (PendingHighscoreRequest.field_h == 0) {
                      AccountCreationForm.createSharedPanels((byte) -68, true);
                    }
                    PendingHighscoreRequest.field_h = PendingHighscoreRequest.field_h + 1;
                  }
                }
              }
            }
          }
        }

    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        if (this.field_S != null) {
          PlayerContextMenu.arezzo14Font.drawParagraph(this.field_S, this.field_l + param1 + 20, param2 - (-this.field_u - 15), -40 + this.field_g, this.field_m, 16777215, -1, 1, 0, PlayerContextMenu.arezzo14Font.field_H);
        }
        if (this.field_J != null) {
          Rasterizer.drawHorizontalLine(param1 + 10, param2 + 134, -20 + this.field_g, 4210752);
        }
        super.drawLayer(param0, param1, param2, param3);
    }

    final String getUsername(int param0) {
        if (null == this.field_E.field_n) {
          return "";
        }
        if (param0 != -3) {
          return (String) null;
        }
        return this.field_E.field_n;
    }

    final static int reverseBits(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 != 13760) {
            field_L = (String) null;
          }
          var3_int = 0;
          while (param0 > 0) {
            var3_int = 1 & param1 | var3_int << 1;
            param0--;
            param1 = param1 >>> 1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "ca.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void onAction(int param0, TextButton param1, int param2, int param3, int param4) {
        int var7 = 0;
        UiWidget var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 12085) {
            var8 = (UiWidget) null;
            this.handleKeyInput((UiWidget) null, '\026', 57, -15);
          }
          if (this.field_F == param1) {
            this.submitLoginIfAllowed((byte) -127);
          } else {
            if (this.field_J != param1) {
              if (param1 == this.field_P) {
                if (!this.field_H) {
                  if (this.field_T) {
                    GuestPlayHelpers.showGuestPlayConfirmation((byte) 49);
                  } else {
                    ChatAndIgnoreHelpers.selectLoginBack((byte) -33);
                  }
                } else {
                  StatusAndUrlHelpers.setPendingMenuResult(17);
                }
              }
            } else {
              ArchiveFactoryHelpers.openAccountCreation(false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ca.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_R = "Similar rating";
        field_L = "This game option is only available to members.";
    }
}
