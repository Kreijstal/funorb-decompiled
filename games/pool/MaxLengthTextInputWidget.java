/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MaxLengthTextInputWidget extends TextInputWidget implements ValidationProviderSource {
    private ValidationProvider field_ab;
    private int field_bb;

    final void notifyTextInputChanged(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          super.notifyTextInputChanged(-74);
          var2_int = 101 % ((28 - param0) / 49);
          if (null != this.field_ab) {
            this.field_ab.resetValidationDelay(11755);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ga.N(" + param0 + ')');
        }
    }

    final void setValidationProvider(byte obfuscationGuard, ValidationProvider provider) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_ab = provider;
          if (obfuscationGuard != -111) {
            MaxLengthTextInputWidget.readSocialListUpdate(-52);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ga.OA(").append(obfuscationGuard).append(',');
          if (provider == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String getHoverText(int param0) {
        RuntimeException var2 = null;
        Object stackIn_5_0 = null;
        String stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.pointerInside &&
            null != this.hoverText) {
            if (param0 > -10) {
              this.getHoverText(39);
            }
            ByteArrayNode.a((byte) -39, DebouncedValidationProvider.field_f, ReflectionReplySupport.field_i - this.field_bb + this.widgetWidth);
            stackIn_10_0 = this.hoverText;
            return stackIn_10_0;
          }
          stackIn_5_0 = null;
          return (String) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ga.L(" + param0 + ')');
        }
    }

    final static void beginReconnect(boolean param0) {
        try {
          OptionsScreen.resetAccountFormState(-1);
          DualLinkDeque.field_c = true;
          ProjectedVertex.field_e = true;
          TabbedPane.field_Ub.hideAllDialogs(-22216);
          PacketAvailabilitySupport.a(param0, IntegerSyntaxSupport.connectionlostReconnecting, -127);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ga.LA(" + param0 + ')');
        }
    }

    final static void readSocialListUpdate(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        SocialListEntry var6 = null;
        String var7 = null;
        SocialListEntry var7_ref = null;
        String var8 = null;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        SocialListEntry var6Lifetime1;
        try {
          var1 = PlayerContextMenu.field_e;
          var2 = var1.readUnsignedByte(-125);
          if (var2 == 0) {
            if (LoginTextSupport.field_c == null) {
              LoginTextSupport.field_c = new DualLinkNodeHashTable(128);
              TextHotspotRegion.field_t = 0;
            }
            stackIn_10_0 = (1 != var1.readUnsignedByte(-91)) ? 0 : 1;
            var3_int = stackIn_10_0;
            var4_ref_String = var1.readNullTerminatedString(obfuscationGuard - 29836);
            if (var3_int != 0) {
              var5 = var1.readNullTerminatedString(-70);
            } else {
              var5 = var4_ref_String;
            }
            var6 = CheckboxPainter.findIgnoreEntryByName(var4_ref_String, 1);
            var7 = var1.readNullTerminatedString(-17);
            var8 = TutorialController.normalizeDisplayName(117, (CharSequence) ((Object) var4_ref_String));
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = CheckboxPainter.findIgnoreEntryByName(var7, 1);
              if (var6 != null) {
                LoginTextSupport.field_c.put(-6946, (long)var8.hashCode(), var6);
              }
            }
            if (null == var6) {
              var6 = new SocialListEntry();
              LoginTextSupport.field_c.put(obfuscationGuard ^ -28521, (long)var8.hashCode(), var6);
              fieldTemp$0 = TextHotspotRegion.field_t;
              TextHotspotRegion.field_t = TextHotspotRegion.field_t + 1;
              var6.insertionIndex = fieldTemp$0;
              QuickChatNavigationSupport.field_c.addFirst((byte) -31, var6);
            }
            var6.actionName = var5;
            var6.previousName = var7;
            var6.name = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (ChatInputSupport.field_a == 1) {
                ChatInputSupport.field_a = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (ChatInputSupport.field_a == 2) {
                ChatInputSupport.field_a = 1;
              }
              return;
            }
            if (obfuscationGuard != 29769) {
              MaxLengthTextInputWidget.projectPointInPlace((int[]) null, (int[]) null, true);
            }
            if (var2 != 4) {
              GrowableIntList.reportClientError((Throwable) null, "F1: " + PacketDiagnosticsSupport.formatPacketDump(93), obfuscationGuard ^ -21796);
              ShotEvent.closeClientSocket(99);
              return;
            }
            ChatInputSupport.field_a = 1;
            var3 = var1.readNullTerminatedString(-118);
            LocalGameSetupScreen.field_J = ((String) (var3)).intern();
            var4 = var1.readUnsignedByte(-84);
            DialRenderer.a((byte) 78, var4);
            return;
          }
          if (AimTarget.field_b == null) {
            AimTarget.field_b = new DualLinkNodeHashTable(128);
            AccountWelcomePanel.field_S = 0;
          }
          var3Lifetime1 = var1.readNullTerminatedString(-101);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readNullTerminatedString(-70);
          var5Lifetime1 = var1.readNullTerminatedString(-54);
          var6Lifetime1 = UsernameSuggestionSupport.findSocialEntryByName(obfuscationGuard - 29667, var4_ref_StringLifetime1);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = UsernameSuggestionSupport.findSocialEntryByName(92, var5Lifetime1);
            if (null != var6Lifetime1) {
              AimTarget.field_b.put(-6946, (long)TutorialController.normalizeDisplayName(123, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6Lifetime1);
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new SocialListEntry();
            AimTarget.field_b.put(-6946, (long)TutorialController.normalizeDisplayName(obfuscationGuard ^ 29715, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6Lifetime1);
            fieldTemp$1 = AccountWelcomePanel.field_S;
            AccountWelcomePanel.field_S = AccountWelcomePanel.field_S + 1;
            var6Lifetime1.insertionIndex = fieldTemp$1;
            SoundCache.field_k.addFirst((byte) -24, var6Lifetime1);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.serverName = (String) (var3Lifetime1);
          var6Lifetime1.name = var4_ref_StringLifetime1;
          var6Lifetime1.previousName = var5Lifetime1;
          var6Lifetime1.unlink((byte) -117);
          var7_ref = (SocialListEntry) (SoundCache.field_k.last((byte) -125));
          while (var7_ref != null) {
            if (MessageDialogContent.a(var6Lifetime1, var7_ref, 83)) {
              var7_ref = (SocialListEntry) (SoundCache.field_k.previous((byte) -5));
              continue;
            }
            break;
          }
          if (var7_ref == null) {
            SoundCache.field_k.addFirst((byte) 85, var6Lifetime1);
          } else {
            TextLineLayout.insertAfter(var6Lifetime1, (byte) -119, var7_ref);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "ga.RA(" + obfuscationGuard + ')');
        }
    }

    final static int nextRandomInt(int param0, boolean param1, Random param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param1) {
            stackIn_2_0 = -110;
            return stackIn_2_0;
          }
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (MouseHandler.hasSingleBitOrZero(param0, -90)) {
            stackIn_10_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param0 >> 32);
            return stackIn_10_0;
          }
          var3_int = -2147483648 - (int)(4294967296L % (long)param0);
          do {
            var4 = param2.nextInt();
          } while (var4 >= var3_int);
          stackIn_16_0 = NameEntryPopup.floorModPositiveDivisor(true, param0, var4);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ga.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public final ValidationProvider getValidationProvider(int param0) {
        ValidationProvider stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -80 / ((param0 - 33) / 34);
          stackIn_1_0 = this.field_ab;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ga.KA(" + param0 + ')');
        }
    }

    MaxLengthTextInputWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    final static void projectPointInPlace(int[] cameraTransform, int[] point, boolean obfuscationGuard) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          point[1] = point[1] - cameraTransform[1];
          point[0] = point[0] - cameraTransform[0];
          point[2] = point[2] - cameraTransform[2];
          var3_int = point[1] * cameraTransform[4] + cameraTransform[3] * point[0] + point[2] * cameraTransform[5] >> 7;
          var4 = cameraTransform[7] * point[1] + (point[0] * cameraTransform[6] + point[2] * cameraTransform[8]) >> 7;
          point[2] = cameraTransform[10] * point[1] + (cameraTransform[9] * point[0] + cameraTransform[11] * point[2]) >> 16;
          if (point[2] == 0) {
            point[2] = -1;
          }
          point[0] = TriangleRasterizer.projectionCenterX + var3_int / point[2];
          point[1] = var4 / point[2] + TriangleRasterizer.projectionCenterY;
          if (obfuscationGuard) {
            MaxLengthTextInputWidget.initializeBallPreview(-17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ga.NA(");
          if (cameraTransform == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (point == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.updatePointerState(param0, param1 + 0, param2, param3);
          if (param1 != 958) {
            return;
          }
          this.field_bb = ReflectionReplySupport.field_i - (this.widgetX + param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ga.S(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void initializeBallPreview(int obfuscationGuard) {
        AppletUrlSupport.field_e = new Quaternion(MaxLengthTextInputWidget.nextRandomInt(262144, true, RankingsRequest.field_r) - 131072, -131072 + MaxLengthTextInputWidget.nextRandomInt(262144, true, RankingsRequest.field_r), -131072 + MaxLengthTextInputWidget.nextRandomInt(262144, true, RankingsRequest.field_r), -131072 + MaxLengthTextInputWidget.nextRandomInt(262144, true, RankingsRequest.field_r));
        AppletUrlSupport.field_e.normalise(true);
        LoginPayloadKind.field_a = TransformRotationSupport.field_a;
        if (LoginPayloadKind.field_a == null) {
          LoginPayloadKind.field_a = PoolGameModel.field_B[0];
        }
        ReflectionRequestSupport.field_e = MaxLengthTextInputWidget.nextRandomInt(LoginPayloadKind.field_a.meshCount(obfuscationGuard + 23883), true, RankingsRequest.field_r);
        LookupRetrySupport.field_h[1] = 0;
        LookupRetrySupport.field_h[0] = -140;
        CushionSegment.field_i = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        if (obfuscationGuard != -23499) {
          return;
        }
        try {
          LookupRetrySupport.field_h[2] = 128;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ga.PA(" + obfuscationGuard + ')');
        }
    }

    static {
    }
}
