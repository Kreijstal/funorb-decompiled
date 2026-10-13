/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationDialog extends ProgressMessageDialog implements WidgetActivationListener {
    private boolean resultReceived;
    private AccountRegistrationForm registrationForm;
    static NodeDeque field_Bb;
    private boolean terminalFailure;
    static ClientUiComponent field_Cb;
    static String field_zb;

    final boolean advanceDialogAnimation(byte obfuscationGuard) {
        AccountRequestResult var2;
        AccountRequestResult var3;
        AccountRequestResult var2Lifetime1;
        if (obfuscationGuard == -1) {
          if (!this.open) {
            return super.advanceDialogAnimation((byte) -1);
          }
          if (this.resultReceived) {
            return super.advanceDialogAnimation((byte) -1);
          }
          var2 = ki.a(-61440);
          if (var2 == null) {
            return super.advanceDialogAnimation((byte) -1);
          }
          this.handleRegistrationResult(false, (byte) -53, var2);
          return super.advanceDialogAnimation((byte) -1);
        }
        var3 = (AccountRequestResult) null;
        this.handleRegistrationResult(true, (byte) 54, (AccountRequestResult) null);
        if (!this.open) {
          return super.advanceDialogAnimation((byte) -1);
        }
        if (this.resultReceived) {
          return super.advanceDialogAnimation((byte) -1);
        }
        var2Lifetime1 = ki.a(-61440);
        if (var2Lifetime1 != null) {
          this.handleRegistrationResult(false, (byte) -53, var2Lifetime1);
        }
        return super.advanceDialogAnimation((byte) -1);
    }

    public static void j(byte param0) {
        field_Cb = null;
        field_Bb = null;
        field_zb = null;
        int var1 = 18 / ((-35 - param0) / 35);
    }

    final void showUnavailable(byte obfuscationGuard) {
        this.handleRegistrationResult(true, (byte) -103, DisplacedUnitMarker.a(-1, 248, ResourceProtocolClient.field_m));
        if (obfuscationGuard >= -81) {
          this.resultReceived = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != -6) {
          return;
        }
        if (param6 >= param4) {
          if (param2 > param6) {
            ManaEvent.a(param6, param4, param7, param2, param1, param5, SoftwareRaster.pixels, param3, (byte) 20);
            return;
          }
          if (param4 >= param2) {
            ManaEvent.a(param4, param2, param1, param6, param3, param5, SoftwareRaster.pixels, param7, (byte) 20);
            return;
          }
          ManaEvent.a(param2, param4, param1, param6, param7, param5, SoftwareRaster.pixels, param3, (byte) 20);
          return;
        }
        if (param2 > param4) {
          ManaEvent.a(param4, param6, param7, param2, param3, param5, SoftwareRaster.pixels, param1, (byte) 20);
          return;
        }
        if (param6 >= param2) {
          ManaEvent.a(param6, param2, param3, param4, param1, param5, SoftwareRaster.pixels, param7, (byte) 20);
          return;
        }
        ManaEvent.a(param2, param6, param3, param4, param7, param5, SoftwareRaster.pixels, param1, (byte) 20);
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        if (this.terminalFailure) {
          LinkButtonPainter.a(false, true, 21);
          return;
        }
        try {
          bt.b(obfuscationGuard ^ obfuscationGuard);
          this.closeDialog(true);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oe.N(" + pointerX + ',' + obfuscationGuard + ',' + button + ',' + pointerY + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    private final void handleRegistrationResult(boolean obfuscationGuard, byte resultGuard, AccountRequestResult result) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String message = null;
        RuntimeException failure = null;
        DialogMessagePane messagePane = null;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.resultReceived = true;
          if (!result.accepted) {
            if (null == result.suggestedNames) {
              message = result.errorText;
              if (result.statusCode == 248) {
                if (!obfuscationGuard) {
                  NumericDateInputWidget.b(false);
                }
                message = ResourceProtocolClient.field_m;
                this.terminalFailure = true;
              }
            } else {
              message = AccountNamePrompt.field_Ob;
              if (null != this.registrationForm) {
                this.registrationForm.refreshNamesRequested((byte) -116);
              }
            }
          } else {
            message = eq.field_i;
          }
          if (resultGuard >= -2) {
            this.registrationForm = (AccountRegistrationForm) null;
          }
          messagePane = new DialogMessagePane((ProgressMessageDialog) (this), CipherPacketBuffer.field_t, message);
          if (result.accepted) {
            if (result.requiresAgreement) {
              this.replaceContent(new RegistrationAgreementPane(this), (byte) -81);
              return;
            }
            messagePane.addListenerButton(ProgressMessageDialog.field_kb, (WidgetListener) (this), (byte) -61);
          } else {
            if (!this.terminalFailure) {
              if (result.statusCode != 5) {
                messagePane.addActionButton(ViewportManager.field_a, -1, 1);
              } else {
                messagePane.addActionButton(QuickChatCommandDefinition.field_d, 11, 1);
                messagePane.addActionButton(dt.field_c, 17, 1);
              }
            } else {
              messagePane.addListenerButton(ProgressMessageDialog.field_kb, (WidgetListener) (this), (byte) 110);
            }
            if (result.statusCode == 3) {
              messagePane.addActionButton(SoundPlaybackHandle.field_m, 7, 1);
            } else {
              if (6 == result.statusCode) {
                messagePane.addActionButton(CombatEvent.field_O, 9, 1);
              }
            }
          }
          this.replaceContent(messagePane, (byte) -110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_33_0 = failure;
          stackIn_33_1 = new StringBuilder().append("oe.U(").append(obfuscationGuard).append(',').append(resultGuard).append(',');
          if (result == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    AccountRegistrationDialog(ModalDialogHost host, AccountRegistrationForm registrationForm) {
        super(host, CipherPacketBuffer.field_t, wm.field_d, false, false);
        try {
          this.registrationForm = registrationForm;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oe.<init>(" + (host != null ? "{...}" : "null") + ',' + (registrationForm != null ? "{...}" : "null") + ')');
        }
    }

    static int bitwiseOr(int left, int right) {
        return left | right;
    }

    final static void a(byte[] param0, int param1) {
        if (param1 > param0[0]) {
          return;
        }
        try {
          AnimationFrameSet.field_E = param0[1];
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oe.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_Bb = new NodeDeque();
        field_zb = "Withdraw invitation to <%0> to join this game";
    }
}
