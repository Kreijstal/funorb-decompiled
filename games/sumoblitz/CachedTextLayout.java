/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedTextLayout extends TextLayout {
    private int field_e;
    private boolean singleLine;
    static SpriteData[] field_h;
    private int field_j;
    private int field_k;
    private LegacyBitmapFont font;
    private int field_g;
    private int field_m;
    private String text;

    final void layoutWrapped(byte param0, int param1, LegacyBitmapFont param2, int param3, String param4, int param5, int param6, int param7) {
        TextLayoutLine stackIn_34_0;
        TextLayoutLine stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        TextLayoutLine stackIn_35_0 = null;
        TextLayoutLine stackIn_35_1 = null;
        int stackIn_35_4 = 0;
        int stackIn_39_0 = 0;
        TextLayoutLine stackIn_39_1 = null;
        int stackIn_40_2 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        TextLayoutLine var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        int var13Lifetime1;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (0 == param6) {
            param6 = param2.baselineOffset;
          }
          if (param4 == null) {
            this.lines = null;
            return;
          }
          if (param2 == this.font &&
            !this.singleLine &&
            this.field_e == param1 &&
            this.field_m == param5 &&
            param6 == this.field_j &&
            param3 == this.field_g &&
            this.field_k == param7 &&
            this.text != null &&
            this.text.equals(param4)) {
            return;
          }
          this.text = param4;
          this.field_j = param6;
          this.singleLine = false;
          this.field_g = param3;
          this.field_e = param1;
          this.field_k = param7;
          this.font = param2;
          this.field_m = param5;
          var17 = new String[param2.lineCount(param4, param7) + 1];
          var18 = var17;
          var10 = Math.max(1, param2.breakLines(param4, new int[]{param7}, var18));
          if (this.field_m == 3 &&
            var10 == 1) {
            this.field_m = 1;
          }
          var12 = -23 / ((13 - param0) / 59);
          if (this.field_m == 0) {
            var11 = param2.ascent;
          } else {
            if (1 != this.field_m) {
              if (this.field_m != 2) {
                var13 = (this.field_g - var10 * this.field_j) / (var10 + 1);
                if (0 > var13) {
                  var13 = 0;
                }
                this.field_j = this.field_j + var13;
                var11 = param2.ascent + var13;
              } else {
                var11 = -(var10 * this.field_j) + this.field_g - param2.descent;
              }
            } else {
              var11 = (this.field_g - var10 * this.field_j >> 1) + param2.ascent;
            }
          }
          this.lines = new TextLayoutLine[var10];
          for (var13Lifetime1 = 0; var10 > var13Lifetime1; var13Lifetime1++) {
            var14 = var17[var13Lifetime1];
            stackIn_34_0 = null;
            stackIn_34_1 = null;
            stackIn_34_2 = -param2.ascent + var11;
            stackIn_34_3 = param2.descent + var11;
            if (var14 != null) {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = var14.length();
            } else {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = 0;
            }
            var15 = new TextLayoutLine(stackIn_34_2, stackIn_34_3, stackIn_35_4);
            var15.caretX[0] = 0;
            if (var14 != null) {
              var15.caretX[var14.length()] = param2.stringWidth(var14);
              stackIn_39_0 = 90;
              stackIn_39_1 = var15;
              if (3 != param1) {
                stackIn_40_2 = 0;
              } else {
                stackIn_40_2 = this.justificationSpaceQ8(-292767736, param7, var14, param2.stringWidth(var14));
              }
              TextCaretLayout.computeCaretPositions(stackIn_39_0, stackIn_39_1, stackIn_40_2, param2, var14);
            }
            var11 = var11 + param6;
            this.lines[var13Lifetime1] = var15;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("jd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void layoutCenteredLine(int param0, LegacyBitmapFont param1, int param2, String param3, int param4) {
        TextLayoutLine var8 = null;
        int var7 = 0;
        if (param3 == null) {
          this.lines = null;
          return;
        }
        if (this.font == param1 && this.singleLine && this.field_e == 1 && null != this.text &&
          this.text.equals(param3)) {
          return;
        }
        try {
          if (param2 < 73) {
            this.field_k = -104;
          }
          this.singleLine = true;
          this.font = param1;
          this.field_e = 1;
          var8 = this.createSingleLine(param0, -106, param1, param3);
          var7 = param1.stringWidth(param3);
          var8.caretX[0] = -(var7 >> 1) + param4;
          var8.caretX[param3.length()] = param4 + (var7 >> 1);
          TextCaretLayout.computeCaretPositions(90, var8, 0, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jd.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = ValidationStatus.a('_', param2, false, "");
          var3 = TextureFilter.reverseString(param0, (byte) 117);
          if (param1 <= 29) {
            CachedTextLayout.e(58);
          }
          stackIn_7_0 = (param2.indexOf(param0) != -1) || (-1 != param2.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("jd.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
          String var2 = (String) null;
          CachedTextLayout.a((LoginFieldValue) null, -59, (LoginFieldValue) null, 54, false, 96, (String) null);
        }
        field_h = null;
    }

    final static String e(int param0) {
        if (param0 <= 71) {
          String var2 = (String) null;
          CachedTextLayout.a((LoginFieldValue) null, 38, (LoginFieldValue) null, -17, false, -119, (String) null);
        }
        if (IntroMeshProjection.field_d) {
          return null;
        }
        if (GameClientShell.field_s > PerlinGradient.field_a) {
          return null;
        }
        if (!(PerlinGradient.field_a >= GameClientShell.field_s + GameDefinitionLoader.field_c)) {
          return LegacyOpenGlCubeTexture.field_l;
        }
        return null;
    }

    final static void playMusic(MusicTrack param0, byte param1, boolean param2) {
        try {
          if (param1 < 54) {
            field_h = (SpriteData[]) null;
          }
          EnemyDroneFactory.setMusicTrack((byte) -124, 256, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jd.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final TextLayoutLine createSingleLine(int param0, int param1, LegacyBitmapFont param2, String param3) {
        TextLayoutLine var5 = null;
        RuntimeException var5_ref = null;
        TextLayoutLine var6 = null;
        TextLayoutLine stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new TextLayoutLine(-param2.ascent + param0, param2.descent + param0, param3.length());
          var5 = var6;
          this.lines = new TextLayoutLine[]{var6};
          if (param1 != -106) {
            this.font = (LegacyBitmapFont) null;
          }
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("jd.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(LoginFieldValue param0, int param1, LoginFieldValue param2, int param3, boolean param4, int param5, String param6) {
        int var12 = 0;
        int stackIn_8_0 = 0;
        PacketBuffer stackIn_13_0 = null;
        String stackIn_14_1 = null;
        PacketBuffer stackIn_16_0 = null;
        String stackIn_17_1 = null;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        MusicTrack var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var16 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param5 <= 20) {
            var14 = (MusicTrack) null;
            CachedTextLayout.playMusic((MusicTrack) null, (byte) 63, false);
          }
          var15 = param0.text(true);
          var8 = param2.text(true);
          if (null == DisplayModeConfirmationDialog.accountSocket &&
            !GridWidgetContainer.a((byte) -83, false)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (TextCaretLayout.accountPhase == ByteArrayCacheNode.READY_TO_CONNECT) {
            HardwareGraphicsToolkit.field_j = null;
            InwardSparkParticle.outgoingPacket.position = 0;
            if (param6 != null) {
              var9 = 0;
              if (param4) {
                var9 = var9 | 1;
              }
              SoftLruCache.field_e.position = 0;
              SoftLruCache.field_e.writeInt(48, NanoTickClock.field_d.nextInt());
              SoftLruCache.field_e.writeInt(48, NanoTickClock.field_d.nextInt());
              SoftLruCache.field_e.writeCircumfixedString(var15, (byte) -108);
              SoftLruCache.field_e.writeCircumfixedString(var8, (byte) -121);
              var17 = (CharSequence) ((Object) param6);
              SoftLruCache.field_e.writeCircumfixedString(LoginIdentifierSupport.normalizeLoginIdentifier(var17, 1457), (byte) -107);
              SoftLruCache.field_e.writeShort(-69, param3);
              SoftLruCache.field_e.writeByte((byte) 50, param1);
              SoftLruCache.field_e.writeByte((byte) 50, var9);
              InwardSparkParticle.outgoingPacket.writeByte((byte) 114, 18);
              InwardSparkParticle.outgoingPacket.position = InwardSparkParticle.outgoingPacket.position + 2;
              var10 = InwardSparkParticle.outgoingPacket.position;
              var11_ref_String = DropDownLabelRenderer.readAppletSettings(-94, LegacyOpenGlUnlitEffect.activeApplet(2));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              InwardSparkParticle.outgoingPacket.writeCp1252String(var11_ref_String, (byte) -115);
              HardwareTurbulentWaterNoise.a(AccountRsaModulus.modulus, OpenGlShaderProgram.field_c, false, InwardSparkParticle.outgoingPacket, SoftLruCache.field_e);
              InwardSparkParticle.outgoingPacket.patchShortLength(0, InwardSparkParticle.outgoingPacket.position - var10);
            } else {
              SoftLruCache.field_e.position = 0;
              SoftLruCache.field_e.writeInt(48, NanoTickClock.field_d.nextInt());
              SoftLruCache.field_e.writeInt(48, NanoTickClock.field_d.nextInt());
              stackIn_13_0 = SoftLruCache.field_e;
              if (!param0.includeInRsaBlock(110)) {
                stackIn_14_1 = "";
              } else {
                stackIn_14_1 = var15;
              }
              ((PacketBuffer) (Object) stackIn_13_0).writeCircumfixedString(stackIn_14_1, (byte) 120);
              stackIn_16_0 = SoftLruCache.field_e;
              if (!param2.includeInRsaBlock(91)) {
                stackIn_17_1 = "";
              } else {
                stackIn_17_1 = var8;
              }
              ((PacketBuffer) (Object) stackIn_16_0).writeCircumfixedString(stackIn_17_1, (byte) 101);
              InwardSparkParticle.outgoingPacket.writeByte((byte) 108, 16);
              InwardSparkParticle.outgoingPacket.position = InwardSparkParticle.outgoingPacket.position + 1;
              var9 = InwardSparkParticle.outgoingPacket.position;
              HardwareTurbulentWaterNoise.a(AccountRsaModulus.modulus, OpenGlShaderProgram.field_c, false, InwardSparkParticle.outgoingPacket, SoftLruCache.field_e);
              InwardSparkParticle.outgoingPacket.patchByteLength(InwardSparkParticle.outgoingPacket.position - var9, -13745);
            }
            MessageDialog.flushAccountWrites(0, -1);
            TextCaretLayout.accountPhase = DisplayModeFailure.WAIT_ACCOUNT_RESPONSE;
          }
          if (TextCaretLayout.accountPhase == DisplayModeFailure.WAIT_ACCOUNT_RESPONSE &&
            OpenGlIndexBuffer.b(-1, 1)) {
            var9Lifetime1 = NativeLibraryExtractor.incomingPacket.readUnsignedByte(-31302);
            NativeLibraryExtractor.incomingPacket.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              TextCaretLayout.accountPhase = HiscoreRequestQueue.WAIT_NAME_SUGGESTIONS;
              ArchiveLoadingStage.nameSuggestions = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                NextLevelChoiceOverlay.a(false, LegacyOpenGlUnlitEffect.activeApplet(2));
                MouseWheelInput.field_c = DisplayModeConfirmationDialog.unfortunatelyWeAreUnableText;
                LegacyOpenGlTextureCache.closeAccountSocket((byte) -116);
                LimitedRandomAccessFile.field_g = false;
                stackIn_37_0 = var9Lifetime1;
                return stackIn_37_0;
              }
              if (var9Lifetime1 != 99) {
                HardwareBufferSet.accountPacketLength = -1;
                TextureFormat.receivedAccountOpcode = var9Lifetime1;
                TextCaretLayout.accountPhase = DropDownArrowRenderer.WAIT_ACCOUNT_DETAILS;
              } else {
                OpenGlIndexBuffer.b(-1, ChatMessage.loginReplyHeaderLength(-105));
                HardwareGraphicsToolkit.field_j = new Boolean(HiscoreRequest.readBooleanFlag(NativeLibraryExtractor.incomingPacket, 115));
                NativeLibraryExtractor.incomingPacket.position = 0;
              }
            }
          }
          if (HiscoreRequestQueue.WAIT_NAME_SUGGESTIONS == TextCaretLayout.accountPhase) {
            var9Lifetime2 = 2;
            if (OpenGlIndexBuffer.b(-1, var9Lifetime2)) {
              var10Lifetime1 = NativeLibraryExtractor.incomingPacket.readUnsignedShort(255);
              NativeLibraryExtractor.incomingPacket.position = 0;
              if (OpenGlIndexBuffer.b(-1, var10Lifetime1)) {
                var11 = ArchiveLoadingStage.nameSuggestions.length;
                for (var12 = 0; var11 > var12; var12++) {
                  ArchiveLoadingStage.nameSuggestions[var12] = NativeLibraryExtractor.incomingPacket.readCircumfixedString(-105);
                }
                LegacyOpenGlTextureCache.closeAccountSocket((byte) -110);
                LimitedRandomAccessFile.field_g = false;
                stackIn_48_0 = var11 + 100;
                return stackIn_48_0;
              }
            }
          }
          if (DropDownArrowRenderer.WAIT_ACCOUNT_DETAILS == TextCaretLayout.accountPhase &&
            FourIntUpdateRequest.readAccountPacketBody((byte) 119)) {
            if (TextureFormat.receivedAccountOpcode != 255) {
              MouseWheelInput.field_c = NativeLibraryExtractor.incomingPacket.readCp1252String(-1);
            } else {
              var9_ref_String = NativeLibraryExtractor.incomingPacket.readNullableString((byte) 80);
              if (var9_ref_String != null) {
                UsernameCredentials.writeAppletSettings((byte) 97, var9_ref_String, LegacyOpenGlUnlitEffect.activeApplet(2));
              }
            }
            LegacyOpenGlTextureCache.closeAccountSocket((byte) -127);
            LimitedRandomAccessFile.field_g = false;
            stackIn_57_0 = TextureFormat.receivedAccountOpcode;
            return stackIn_57_0;
          }
          if (DisplayModeConfirmationDialog.accountSocket == null) {
            if (LimitedRandomAccessFile.field_g) {
              if (30000L < IntroductionOverlaySupport.millisSinceServerRead(26560)) {
                MouseWheelInput.field_c = HotspotTextWidget.connectionTimedOutPleaseText;
              } else {
                MouseWheelInput.field_c = GridWidgetContainer.errorConnectingToServerText;
              }
              LimitedRandomAccessFile.field_g = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = DroneVariantScoring.field_a;
            DroneVariantScoring.field_a = LoginCredentialType.field_b;
            LimitedRandomAccessFile.field_g = true;
            LoginCredentialType.field_b = var9Lifetime3;
          }
          stackIn_67_0 = -1;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("jd.A(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    public CachedTextLayout() {
    }

    final void a(LegacyBitmapFont param0, int param1, int param2, String param3, byte param4) {
        if (param3 == null) {
          this.lines = null;
          return;
        }
        if (this.font == param0 &&
          this.singleLine &&
          this.field_e == 2 &&
          this.text != null &&
          this.text.equals(param3)) {
          return;
        }
        this.field_e = 2;
        this.font = param0;
        this.singleLine = true;
        this.text = param3;
        TextLayoutLine var7 = this.createSingleLine(param1, param4 ^ -39, param0, param3);
        TextLayoutLine var8 = var7;
        if (param4 != 79) {
          return;
        }
        try {
          var8.caretX[0] = param2 - param0.stringWidth(param3);
          var7.caretX[param3.length()] = param2;
          TextCaretLayout.computeCaretPositions(90, var8, 0, param0, param3);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(LegacyBitmapFont param0, int param1, String param2, int param3, byte param4) {
        TextLayoutLine var7 = null;
        TextLayoutLine var8 = null;
        if (param2 == null) {
          this.lines = null;
          return;
        }
        if (param4 != -36) {
          this.text = (String) null;
        }
        if (param0 == this.font && this.singleLine && this.field_e == 0 && this.text != null &&
          this.text.equals(param2)) {
          return;
        }
        try {
          this.field_e = 0;
          this.font = param0;
          this.singleLine = true;
          this.text = param2;
          var7 = this.createSingleLine(param1, -106, param0, param2);
          var8 = var7;
          var7.caretX[0] = param3;
          var8.caretX[param2.length()] = param3 + param0.stringWidth(param2);
          TextCaretLayout.computeCaretPositions(90, var8, 0, param0, param2);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jd.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
