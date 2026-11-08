/*
 * Decompiled by CFR-JS 0.4.0.
 */
class LongAndTextCredentials extends LoginCredentials {
    static String[] field_g;
    static String field_i;
    private long field_j;
    static JoinStatusTextHelpers field_l;
    static String field_m;
    static double[] field_h;
    private String field_k;

    final void writeTo(int param0, PacketBuffer param1) {
        try {
          param1.writeLong(-1, this.field_j);
          param1.writeBase38Name((byte) -127, this.field_k);
          if (param0 != -22017) {
            LongAndTextCredentials.isAsciiAlphanumeric(-61, '￶');
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ka.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isAsciiAlphanumeric(int param0, char param1) {
        boolean stackIn_13_0 = false;
        if (param0 != 65) {
          LongAndTextCredentials.releaseStatics((byte) -100);
        }
        stackIn_13_0 = ((!(param1 < 48) &&
          !(57 < param1)) ||
          (!(65 > param1) &&
          !(param1 > 90)) ||
          (!(97 > param1) &&
          !(param1 > 122)));
        return stackIn_13_0;
    }

    final static void resetSessionState(int param0) {
        InputDetachHelpers.field_b = null;
        RasterStackHelpers.field_d = false;
        Archive.field_j = null;
        AccountCreationDialog.field_Ab = null;
        if (param0 < 76) {
          LongAndTextCredentials.getLocalPlayerNameOrEmpty((byte) 76);
        }
        FullscreenErrorDialog.field_db = null;
    }

    final static void processGameInput(int param0) {
        int stackIn_44_0 = 0;
        GameSession stackIn_63_0 = null;
        GameSession stackIn_67_0 = null;
        double stackIn_67_1 = 0.0;
        boolean stackIn_68_2 = false;
        double stackIn_70_3;
        boolean stackIn_71_4;
        int var1;
        double var2_double;
        GameSession var2;
        int var3;
        double var4;
        double var6;
        int var8;
        double var4Lifetime1;
        double var6Lifetime1;
        var8 = TetraLink.field_J;
        if (0 == PointerTrailBubble.field_s &&
          !SocialListEntry.scheduleReconnectCheck(false) &&
          !TopLevelContainerHelpers.isAccountCreationMode((byte) 90) &&
          !WidgetStyleLayer.isMessagePopupOpen(-70)) {
          if (NameAvailabilityValidator.field_t != 0 &&
            DraggableWidget.field_O == 10) {
            MenuReturnHelpers.returnToMenuScreen(param0 ^ 4, true);
          }
          if (NameAvailabilityValidator.field_t != 0) {
            SettingsCookieHelpers.field_a = DraggableWidget.findHoveredPanelRow((byte) 101, PasswordFieldPainter.field_B, WhirlpoolHasher.field_o);
            if (SettingsCookieHelpers.field_a == 0 &&
              WidgetTheme.field_u != 0) {
              if (2 > GameKeyHandler.field_g) {
                GameKeyHandler.field_g = IndexedSpriteState.field_c;
              } else {
                GameKeyHandler.field_g = 0;
              }
              DelegatingCanvas.createGameOptions(AccountWelcomePanel.isNonNegative(BackgroundSparkle.field_t, (byte) 114), param0 ^ -7865);
            } else {
              if (WidgetTheme.field_u == 2 &&
                5 == SettingsCookieHelpers.field_a) {
                RandomAccessCacheFile.resetCameraToTarget(-107, true);
              }
            }
          }
          if (param0 != 4) {
            return;
          }
          SettingsCookieHelpers.field_a = DraggableWidget.findHoveredPanelRow((byte) 101, ContextMenu.field_Nb, ClientProtocolStage.field_a);
          if (AccountCreationForm.field_X != 0 &&
            WidgetTheme.field_u == 2) {
            if (1 != SettingsCookieHelpers.field_a) {
              if (SettingsCookieHelpers.field_a != 2) {
                if (3 != SettingsCookieHelpers.field_a) {
                  if (SettingsCookieHelpers.field_a == 4) {
                    SocketConnector.orbitCamera(-8.0f, 0.0f, -2452);
                  }
                } else {
                  SocketConnector.orbitCamera(8.0f, 0.0f, param0 ^ -2456);
                }
              } else {
                SocketConnector.orbitCamera(0.0f, -0.029999999329447746f, -2452);
              }
            } else {
              SocketConnector.orbitCamera(0.0f, 0.029999999329447746f, -2452);
            }
          }
          if (DraggableWidget.field_O == BackgroundSparkle.field_t &&
            ~LoginCredentials.field_a == ~JoinStatusTextHelpers.field_h &&
            BackgroundSparkle.field_t != 10 &&
            -1 == SettingsCookieHelpers.field_a) {
            stackIn_44_0 = 0;
          } else {
            stackIn_44_0 = 1;
          }
          var1 = stackIn_44_0;
          if (WidgetTheme.field_i.field_c) {
            var2_double = (double)(-(SoftwareRasterizer.field_f >> 1) + ContextMenu.field_Nb) / 512.0;
            var4 = (double)(ClientProtocolStage.field_a - RegistrationResponseHelpers.field_a) / 512.0;
            var6 = -field_h[2] / (var2_double * field_h[5] + var4 * field_h[8] + field_h[11]);
            LoadingStepTracker.field_c = (var6 * (field_h[9] + (var4 * field_h[6] + field_h[3] * var2_double)) + field_h[0]) * 4.0;
            if (!(0.0 > field_h[11])) {
              LoadingStepTracker.field_c = 320.0 + LoadingStepTracker.field_c;
            } else {
              LoadingStepTracker.field_c = 320.0 - LoadingStepTracker.field_c;
            }
            CommonUiHelpers.field_i = (double)(440 - (SoftwareRasterizer.field_e >> 1)) + 4.0 * (field_h[1] + (field_h[10] + (field_h[7] * var4 + field_h[4] * var2_double)) * var6);
            if (IsaacCipher.field_a.field_z > ClientProtocolStage.field_a) {
              if ((2 == AccountCreationForm.field_X ||
                ErrorPrintHelpers.field_a[81]) &&
                (ValidationStatusIcon.field_T != -1 &&
                ContextMenu.field_Nb != -1)) {
                SocketConnector.orbitCamera(0.0f, 0.004999999888241291f * (float)(-ValidationStatusIcon.field_T + ContextMenu.field_Nb), -2452);
              }
              if (PacketDiagnosticsHelpers.field_p != 0) {
                SocketConnector.orbitCamera((float)(PacketDiagnosticsHelpers.field_p * 24), 0.0f, -2452);
              }
            }
          } else {
            CommonUiHelpers.field_i = (double)(200 + (-RegistrationResponseHelpers.field_a + ClientProtocolStage.field_a));
            LoadingStepTracker.field_c = (double)ContextMenu.field_Nb;
          }
          if (null == ContextMenu.field_bc) {
            stackIn_63_0 = SocialListEntry.field_Qb;
          } else {
            stackIn_63_0 = ContextMenu.field_bc;
          }
          var2 = stackIn_63_0;
          if (var2 != null) {
            stackIn_67_0 = var2;
            stackIn_67_1 = CommonUiHelpers.field_i;
            stackIn_68_2 = (!(0.0 > field_h[11])) ? false : true;
            stackIn_70_3 = LoadingStepTracker.field_c;
            stackIn_71_4 = (-1 != BackgroundSparkle.field_t) ? false : true;
            ((GameSession) (Object) stackIn_67_0).handlePointerInput(stackIn_67_1, stackIn_68_2, stackIn_70_3, stackIn_71_4, (byte) -115, var1 != 0, AccountCreationForm.field_X, NameAvailabilityValidator.field_t);
          }
          if (DiskArchiveRequest.isValidIndex(BackgroundSparkle.field_t, (byte) 99)) {
            MarkerSlider.field_X[BackgroundSparkle.field_t].handlePointer(var1 != 0, CommonUiHelpers.field_i, NameAvailabilityValidator.field_t, LoadingStepTracker.field_c, NameAvailabilityValidator.field_t, -128);
          }
          if (DialWidget.field_T &&
            WidgetTheme.field_i.field_d &&
            ValidationStatusIcon.field_T != -1 &&
            ContextMenu.field_Nb != -1) {
            if (ClientProtocolStage.field_a == -1) {
              ValidationStatusIcon.field_T = ContextMenu.field_Nb;
              LoadingStepTracker.field_i = ClientProtocolStage.field_a;
              return;
            }
            var3 = Math.abs(ContextMenu.field_Nb - ValidationStatusIcon.field_T) + Math.abs(ClientProtocolStage.field_a - LoadingStepTracker.field_i);
            var4Lifetime1 = LoadingStepTracker.field_c;
            var6Lifetime1 = CommonUiHelpers.field_i;
            if (var4Lifetime1 > 110.0 &&
              var4Lifetime1 < 530.0 &&
              0.0 < var6Lifetime1 &&
              400.0 > var6Lifetime1) {
              ArrayWidgetContainer.field_J.addLast(new PointerTrailBubble((int)(16.0 * var4Lifetime1), (int)(var6Lifetime1 * 16.0), Math.min(WidgetTheme.field_i.field_h, WidgetTheme.field_i.field_i + var3 * WidgetTheme.field_i.field_p)), false);
            }
          }
          ValidationStatusIcon.field_T = ContextMenu.field_Nb;
          LoadingStepTracker.field_i = ClientProtocolStage.field_a;
          return;
        }
    }

    public static void releaseStatics(byte param0) {
        field_l = null;
        field_g = null;
        field_i = null;
        if (param0 != 86) {
          LongAndTextCredentials.isAsciiAlphanumeric(-23, 'ﾵ');
        }
        field_m = null;
        field_h = null;
    }

    LoginCredentialType getCredentialType(byte param0) {
        if (param0 >= -77) {
          this.field_k = (String) null;
        }
        return ReflectionCheckHelpers.field_h;
    }

    final static String getLocalPlayerNameOrEmpty(byte param0) {
        if (AnimationPlayer.field_d == ArchiveRequest.field_C) {
          return NotificationToast.field_s;
        }
        int var1 = -115 % ((-27 - param0) / 33);
        return ArchiveRequest.field_w;
    }

    LongAndTextCredentials(long param0, String param1) {
        try {
          this.field_k = param1;
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ka.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Passwords must be between 5 and 20 characters long";
        field_g = new String[]{"By rating", "By win percentage"};
        field_l = new JoinStatusTextHelpers();
    }
}
