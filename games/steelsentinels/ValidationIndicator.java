/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ValidationIndicator extends TextButton {
    static int field_W;
    static String field_X;
    private int field_ab;
    static String field_V;
    private ValidationSource field_db;
    static int field_eb;
    static String field_bb;
    static String field_Y;
    static PcmStreamMixer field_cb;
    static String field_Z;

    final static void configureConnection(SystemTaskService param0, String param1, boolean param2, int param3, int param4, boolean param5, int param6, int param7, int param8, long param9, byte param10, int param11, int param12, int param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            LoginConnectionStage.field_d = new CipherPacketBuffer(param8);
            ClockAndCookieHelpers.field_g = new CipherPacketBuffer(param11);
            StripedProgressBar.field_Z = param4;
            ScrollContainer.field_Wb = param3;
            UiTheme.field_l = param13;
            QuickChatPopupHelpers.field_b = param9;
            QuickChatPacketHelpers.field_a = param2;
            LoadingProgressDialog.field_ib = param5;
            if (param10 < 112) {
              ValidationIndicator.openChatInput(-71);
            }
            ArchiveRequest.field_F = param6;
            AccountRequestResult.field_b = param1;
            AccountRegistrationPanel.field_T = param7;
            ArticulatedPart.field_A = param0;
            TextAndMenuHelpers.field_d = param12;
            if (null != ArticulatedPart.field_A.field_m) {
              try {
                LoginDialogHelpers.field_h = new BufferedRandomAccessFile(ArticulatedPart.field_A.field_m, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("lk.A(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean isPasswordAcceptable(String param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (PasswordValidator.hasNonAlphanumeric(param0, 75)) {
            return false;
          }
          if (AgeValidator.isRepeatedCharacter(param0, 29974)) {
            return false;
          }
          if (QuickChatCategory.isLengthOutOfRange(-30157, param0)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (AccountTermsPanel.containsTextOrReverse(param0, 300, param2)) {
            return false;
          }
          if (PasswordRuleHelpers.passwordContainsName(param2, -7036, param0)) {
            return false;
          }
          if (Projectile.containsForwardOrReversed(param0, true, param2)) {
            return false;
          }
          var3_int = -38 % ((param1 + 50) / 37);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("lk.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_Z = null;
        if (param0 != -30289) {
          return;
        }
        field_Y = null;
        field_V = null;
        field_X = null;
        field_cb = null;
        field_bb = null;
    }

    final static void drawFrontEndFrame(byte param0, boolean param1) {
        SentinelDesigner.drawOverlayDialogs(param1, (byte) 44);
        if (param0 > -58) {
          return;
        }
        ClientErrorSupport.updateOverlays(param1, (byte) 122);
    }

    final static void openChatInput(int param0) {
        MusicTrackHelpers.field_g = true;
        ChatPanelHelpers.field_b = param0;
    }

    ValidationIndicator(ValidationSource param0) {
        try {
          this.field_db = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void initializeSpecularTable(boolean param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = SteelSentinels.obfuscationControl;
        try {
          MeshRasterState.useRasterClip();
          HighscoreTable.field_t = new int[260];
          ArchiveLoadSequence.field_j = 11;
          for (var1_int = 0; 256 > var1_int; var1_int++) {
            var2 = 15.0;
            HighscoreTable.field_t[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < HighscoreTable.field_t.length) {
            HighscoreTable.field_t[var5] = 255;
            var5++;
          }
          if (!param0) {
            field_V = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var1), "lk.Q(" + param0 + ')');
        }
    }

    final void updateHover(int param0, int param1, UiComponent param2, int param3) {
        try {
          this.field_ab = this.field_ab + 1;
          if (param1 <= 56) {
            this.drawLayer(71, (byte) 105, -24, 10);
          }
          super.updateHover(param0, 123, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "lk.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void drawLayer(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        TransitionTimerHelpers var8;
        int var9;
        int var10;
        int var11;
        RgbSprite var12;
        RgbSprite var13;
        RgbSprite var14;
        var11 = SteelSentinels.obfuscationControl;
        if (param1 > -99) {
          this.field_ab = 58;
        }
        super.drawLayer(param0, (byte) -124, param2, param3);
        if (param3 != 0) {
          return;
        }
        var5 = param2 - (-this.field_o - (this.field_x >> 1));
        var6 = param0 + (this.field_z + (this.field_E >> 1));
        var8 = this.field_db.validationState((byte) 21);
        if (Bzip2State.field_J != var8 &&
          TextHotspotWidget.field_Y != var8) {
          if (var8 == ArchiveProvider.field_d) {
            var14 = NameTable.field_i[2];
            var14.drawAdditive(var5 - (var14.field_A >> 1), -(var14.field_F >> 1) + var6, 256);
          } else if (RequestResendHelpers.field_b == var8) {
            var13 = NameTable.field_i[1];
            var13.drawAdditive(var5 - (var13.field_A >> 1), var6 - (var13.field_F >> 1), 256);
          }
        } else {
          var12 = NameTable.field_i[0];
          var9 = var12.field_z << 1;
          var10 = var12.field_B << 1;
          if (null != RankingAndRasterHelpers.field_f &&
            var9 <= RankingAndRasterHelpers.field_f.field_A &&
            var10 <= RankingAndRasterHelpers.field_f.field_F) {
            IterableNodeHashTable.bindSpriteRaster(RankingAndRasterHelpers.field_f, (byte) -71);
            SoftwareRaster.clear();
          } else {
            RankingAndRasterHelpers.field_f = new RgbSprite(var9, var10);
            IterableNodeHashTable.bindSpriteRaster(RankingAndRasterHelpers.field_f, (byte) -108);
          }
          var12.drawRotatedAboutPivot(112, 144, var12.field_z << 4, var12.field_B << 4, -this.field_ab << 10, 4096);
          MatchingTextValidator.popRasterStateWithIntGuard(106);
          RankingAndRasterHelpers.field_f.drawAdditive(-var12.field_z + var5, -var12.field_B + var6, 256);
        }
    }

    final String getTooltip(int param0) {
        if (this.field_C) {
          return this.field_db.validationMessage(true);
        }
        if (param0 == 0) {
          return null;
        }
        field_eb = 95;
        return null;
    }

    final boolean focusNext(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            return false;
          }
          field_V = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_V = "Hide lobby chat";
        field_Y = "Names should contain a maximum of 12 characters";
        field_X = "D";
        field_Z = "Account created successfully!";
        field_eb = 0;
        field_bb = "Please log in as a subscribing member to access this feature.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void drawFrontEndFrameWithIntGuard(int param0, boolean param1) {
        SentinelDesigner.drawOverlayDialogs(param1, (byte) 44);
        if (param0 > -58) {
          return;
        }
        ClientErrorSupport.updateOverlays(param1, (byte) 122);
    }
}
