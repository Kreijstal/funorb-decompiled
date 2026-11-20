/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationDialog extends AccountStatusDialog implements UiActionListener {
    static boolean field_Y;
    private boolean ineligible;
    private boolean resultShown;
    private AccountCreationForm creationForm;

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        if (this.ineligible) {
          WaterTextures.showLoginForm(false, true, false);
          return;
        }
        GetBoostersActiveTime.showCreatedAccountStatus((byte) -74);
        if (param0 != 11) {
          return;
        }
        try {
          this.closeDialog((byte) -106);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "sn.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void showAccountIneligible(boolean param0) {
        this.showAccountResult(true, param0, GetArmageddonLength.createAccountErrorResult(248, GetMissionTerrainAsteroidProbability.field_q, (byte) -124));
    }

    final static void drawWorldArrow(int param0, byte param1, int param2, int param3, int param4, int param5, Camera2D param6) {
        try {
          GetCountermeasureLauncherAimarc.drawWorldArrow(param2, param6, param0, 3, param4, param5, 255, param3);
          if (param1 <= 68) {
            field_Y = false;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "sn.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void showPlayerContextMenu(int param0, int param1, LobbyPlayerEntry param2, byte param3, int param4, ScrollPaneWidget param5, int param6) {
        PlayerContextMenu var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          PlayerContextMenus.prepareContextMenu(param2.field_zb, param2, -1, (int[]) null, param2.field_Hb, param5, param2.field_xb, 103, -1);
          GetLagStandardDeviationOut.field_o.addLobbyOwnerOptions(true, param3 - 35);
          GetLagStandardDeviationOut.field_o.addSocialOptions(-70, 0, (int[]) null);
          GetLagStandardDeviationOut.field_o.addReportOption(param3 - 9994);
          var13 = GetLagStandardDeviationOut.field_o;
          var8 = param4;
          var9 = param0;
          var10 = param6;
          if (param3 != 71) {
            Camera2D var12 = (Camera2D) null;
            AccountCreationDialog.drawWorldArrow(64, (byte) -32, -119, -6, 29, 12, (Camera2D) null);
          }
          var11 = param1;
          var13.menu.layoutPopup(var8, -29060, var9, var10, var11);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "sn.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    private final void showAccountResult(boolean param0, boolean param1, AccountRequestResult param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        DialogMessagePanel var5 = null;
        int var6 = 0;
        ScrollPaneWidget var7 = null;
        var6 = VoidHunters.field_G;
        try {
          this.resultShown = true;
          if (param2.success) {
            var4 = SpecialOrderDefinition.field_c;
          } else {
            if (null == param2.suggestedNames) {
              var4 = param2.message;
              if (param2.responseCode == 248) {
                if (!param0) {
                  MapClearanceAreaFactory.writeSessionMarkerCookie((byte) -75);
                }
                var4 = GetMissionTerrainAsteroidProbability.field_q;
                this.ineligible = true;
              }
            } else {
              var4 = GetLaserReload.field_p;
              if (null != this.creationForm) {
                this.creationForm.invalidateNameAvailability(1546);
              }
            }
          }
          var5 = new DialogMessagePanel((AccountStatusDialog) (this), GetBoostersCooldown.field_r, var4);
          if (param2.success) {
            if (param2.under13) {
              this.transitionToContent(new Under13AccountNoticePanel(this), -99);
              return;
            }
            var5.addButton((byte) 107, NativeModelIntValue.field_b, (UiListener) (this));
          } else {
            if (this.ineligible) {
              var5.addButton((byte) 98, NativeModelIntValue.field_b, (UiListener) (this));
            } else {
              if (param2.responseCode == 5) {
                var5.addButton(-128, PhasedEnergyBeamWeaponDefinition.field_c, 11);
                var5.addButton(-114, GetFighterBayAimspeed.field_q, 17);
              } else {
                var5.addButton(-115, ArbProgram.field_a, -1);
              }
            }
            if (param2.responseCode == 3) {
              var5.addButton(-115, AppletRasterBuffer.field_h, 7);
            } else {
              if (param2.responseCode == 6) {
                var5.addButton(-124, SoftwareTransform3D.field_c, 9);
              }
            }
          }
          if (param1) {
            var7 = (ScrollPaneWidget) null;
            AccountCreationDialog.showPlayerContextMenu(-93, 7, (LobbyPlayerEntry) null, (byte) 42, -22, (ScrollPaneWidget) null, 46);
          }
          this.transitionToContent(var5, 99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("sn.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    AccountCreationDialog(ModalStack param0, AccountCreationForm param1) {
        super(param0, GetBoostersCooldown.field_r, CommonGameState.field_c, false, false);
        try {
          this.creationForm = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean updateAndCheckClosed(int param0) {
        AccountRequestResult var2 = null;
        AccountRequestResult var2Lifetime1;
        if (param0 != 248) {
          this.ineligible = false;
          if (!this.active) {
            return super.updateAndCheckClosed(248);
          }
          if (this.resultShown) {
            return super.updateAndCheckClosed(248);
          }
          var2 = GetDebrisThrowable.pollAccountCreationResult(10589);
          if (var2 != null) {
            this.showAccountResult(false, false, var2);
            return super.updateAndCheckClosed(248);
          }
          return super.updateAndCheckClosed(248);
        }
        if (!this.active) {
          return super.updateAndCheckClosed(248);
        }
        if (this.resultShown) {
          return super.updateAndCheckClosed(248);
        }
        var2Lifetime1 = GetDebrisThrowable.pollAccountCreationResult(10589);
        if (var2Lifetime1 != null) {
          this.showAccountResult(false, false, var2Lifetime1);
          return super.updateAndCheckClosed(248);
        }
        return super.updateAndCheckClosed(248);
    }

    static {
        field_Y = true;
    }
}
