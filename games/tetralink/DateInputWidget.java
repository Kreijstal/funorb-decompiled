/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DateInputWidget extends UiContainer implements ValidationSource {
    static ViewportController field_M;
    private DateOfBirthValidator field_L;
    static UiComponent field_P;
    static boolean field_K;
    static ScrollPane field_Q;
    static Sprite[] field_O;
    static String field_N;

    void setBirthDateValidator(int param0, DateOfBirthValidator param1) {
        try {
          this.field_L = param1;
          this.field_L.field_m = this;
          if (param0 != 45) {
            field_N = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "hn.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract int getYear(byte param0);

    abstract int getMonthIndex(boolean param0);

    abstract boolean isDateIncomplete(int param0);

    final static int reverseBits(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          if (param0 != -74) {
            field_K = true;
          }
          var3_int = 0;
          while (param1 > 0) {
            var3_int = var3_int << 1 | 1 & param2;
            param1--;
            param2 = param2 >>> 1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var3), "hn.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_P = null;
        field_O = null;
        field_M = null;
        int var1 = 18 % ((param0 + 29) / 58);
        field_Q = null;
        field_N = null;
    }

    final static int writeCompressedString(boolean param0, String param1, PacketBuffer param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var5 = (String) null;
            DateInputWidget.advanceLoginHandshake(false, (String) null, -28, true, -123, (String) null);
          }
          var3_int = param2.position;
          var6 = (CharSequence) ((Object) param1);
          var4 = LinkTextPainter.encodeSingleByteText(65, var6);
          param2.writeSmart(var4.length, (byte) -93);
          param2.position = param2.position + ValidationMessageWidget.field_Z.compress(0, param2.position, var4, var4.length, param2.payload, 28677);
          stackIn_3_0 = -var3_int + param2.position;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final TextValidator getValidationSource(int param0) {
        if (param0 > -100) {
          this.isDateIncomplete(-117);
        }
        return (TextValidator) ((Object) this.field_L);
    }

    DateInputWidget(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static int advanceLoginHandshake(boolean param0, String param1, int param2, boolean param3, int param4, String param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_28_0 = 0;
          boolean stackIn_40_0 = false;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          boolean stackIn_52_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_89_0 = 0;
          int stackIn_91_0 = 0;
          int stackIn_94_0 = 0;
          int stackIn_102_0 = 0;
          int stackIn_104_0 = 0;
          RuntimeException stackIn_107_0 = null;
          StringBuilder stackIn_107_1 = null;
          String stackIn_108_2 = null;
          StringBuilder stackIn_110_1 = null;
          String stackIn_111_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = TetraLink.field_J;
          try {
            if (null == TriangleSpanHelpers.field_e &&
              !ReportAbuseDialog.pollGameSocketConnection(param3, (byte) -70)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (SparkParticle.field_p == BitPacketBuffer.field_z) {
              if (param3) {
                var10 = (String) null;
                GraphicsSettings.field_a = LoadingProgressDialog.createLoginCredentials(CommonUiHelpers.field_g, (String) null, false, param1, -6336);
              } else {
                GraphicsSettings.field_a = SectorCacheStore.createLoginCredentials((byte) -79, param5, false, param1);
              }
              QuickChatHelpDialog.field_Lb.position = 0;
              QuickChatHelpDialog.field_Lb.writeByte(14, false);
              QuickChatHelpDialog.field_Lb.writeByte(GraphicsSettings.field_a.getCredentialType((byte) -95).field_d, false);
              PacketFlushHelpers.flushPackets((byte) -116, -1);
              SparkParticle.field_p = SparkParticle.field_u;
            }
            if (SparkParticle.field_p == SparkParticle.field_u &&
              SingleChildWidget.fillIncomingBuffer(109, 1)) {
              var6_int = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
              BackgroundSparkle.field_q.position = 0;
              if (var6_int == 0) {
                SparkParticle.field_p = QueuedStatSubmission.field_v;
              } else {
                KeyHandlerHelpers.field_d = -1;
                SparkParticle.field_p = SocialTabsPanel.field_a;
                CommonUiHelpers.field_c = var6_int;
              }
            }
            if (SparkParticle.field_p == QueuedStatSubmission.field_v &&
              SingleChildWidget.fillIncomingBuffer(110, 8)) {
              SocketConnector.field_g = BackgroundSparkle.field_q.readLong(255);
              BackgroundSparkle.field_q.position = 0;
              MusicPatch.writeLoginPacket((byte) -34, param4, param3, GraphicsSettings.field_a, param0);
              SparkParticle.field_p = ProxySocketConnector.field_l;
            }
            boolean decompiledFrameRemainder0 = true;
            if (SparkParticle.field_p == ProxySocketConnector.field_l &&
              SingleChildWidget.fillIncomingBuffer(param2 ^ -2513, 1)) {
              var6_intLifetime1 = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
              CommonUiHelpers.field_c = var6_intLifetime1;
              BackgroundSparkle.field_q.position = 0;
              MenuScreen.field_b = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  KeyHandlerHelpers.field_d = -1;
                  SparkParticle.field_p = SocialTabsPanel.field_a;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  SocialTabsPanel.closeGameSocket(false);
                  ProxySocketConnector.field_j = false;
                  stackIn_28_0 = var6_intLifetime1;
                  return stackIn_28_0;
                }
              }
              if (decompiledFrameRemainder0) {
                KeyHandlerHelpers.field_d = -1;
                SparkParticle.field_p = RandomAccessCacheFile.field_f;
              }
            }
            if (RandomAccessCacheFile.field_f == SparkParticle.field_p &&
              CommonUiHelpers.isPacketPayloadReady(46)) {
              CommonUiHelpers.field_g = BackgroundSparkle.field_q.readLong(255);
              DiskArchiveRequest.field_J = param1;
              SettingsCookieHelpers.field_c = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
              CacheEntry.field_z = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
              CacheEntry.field_C = BackgroundSparkle.field_q.readUnsignedShort(param2 + 2599);
              var6 = BackgroundSparkle.field_q.readOptionalString(-53);
              var7 = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
              if ((var7 & 1) != 0) {
                NineSliceFrameHelpers.saveRandomData((byte) 115);
              }
              if (!param3) {
                stackIn_40_0 = ((var7 & 4) != 0);
                LruTextureCache.field_o = stackIn_40_0;
                stackIn_43_0 = (0 != (var7 & 8));
                MenuLabelGlobals.field_a = stackIn_43_0;
                stackIn_46_0 = ((2 & var7) != 0);
                DisplayNameForm.field_K = stackIn_46_0;
                if (MenuLabelGlobals.field_a) {
                  DisplayNameForm.field_K = true;
                }
              }
              stackIn_52_0 = ((16 & var7) != 0);
              NanoTickClock.field_n = stackIn_52_0;
              if (IntrusiveNode.field_k) {
                BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
                BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
                BackgroundSparkle.field_q.readInt(-117);
                PlayingSound.field_n = BackgroundSparkle.field_q.readUnsignedShort(127);
                CommonUiHelpers.field_a = new byte[PlayingSound.field_n];
                for (var8 = 0; PlayingSound.field_n > var8; var8++) {
                  CommonUiHelpers.field_a[var8] = BackgroundSparkle.field_q.readSignedByte(IsaacCipher.bitXor(param2, 1772090971));
                }
              }
              NetworkGameClient.field_w = BackgroundSparkle.field_q.readString((byte) 81);
              var11 = (CharSequence) ((Object) NetworkGameClient.field_w);
              RegistrationResponseHelpers.field_f = DialWidgetPainter.normalizeDisplayName(var11, (byte) 119);
              AudioPumpThread.field_a = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
              SparkParticle.field_p = WhirlpoolHasher.field_a;
              if (GraphicsSettings.field_a.getCredentialType((byte) -106) == ArchiveIndex.field_h) {
                EmailSyntaxValidator.field_s.saveAsLastLoginMethod((byte) -86, ProgressMessageDialog.getHostApplet(13));
              } else {
                if (GraphicsSettings.field_a.getCredentialType((byte) -85) == ReflectionCheckHelpers.field_h) {
                  ChatPanelSlideHelpers.field_j.saveAsLastLoginMethod((byte) -90, ProgressMessageDialog.getHostApplet(13));
                }
              }
              ProxySocketConnector.field_j = false;
              if (var6 != null) {
                SparkParticle.writeSettingsCookie(var6, -7011, ProgressMessageDialog.getHostApplet(13));
              }
              if (0 >= CacheEntry.field_C &&
                !LruTextureCache.field_o) {
                try {
                  JavaScriptBridge.callJavaScript((byte) 81, "unzap", ProgressMessageDialog.getHostApplet(13));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callWithArguments(new Object[]{DirectByteStorage.decodeNameFromLong(CommonUiHelpers.field_g, true)}, 6760, "zap", ProgressMessageDialog.getHostApplet(param2 + 2485));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (CacheEntry.field_C > 0) {
                AudioPumpThread.field_m = true;
              }
              QuickChatHelpDialog.field_Lb.setCipherSeed(ArchiveFactoryHelpers.field_e, (byte) 33);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                ArchiveFactoryHelpers.field_e[var8Lifetime1] = ArchiveFactoryHelpers.field_e[var8Lifetime1] + 50;
              }
              BackgroundSparkle.field_q.setCipherSeed(ArchiveFactoryHelpers.field_e, (byte) 33);
              stackIn_79_0 = CommonUiHelpers.field_c;
              return stackIn_79_0;
            }
            if (SparkParticle.field_p == SocialTabsPanel.field_a &&
              CommonUiHelpers.isPacketPayloadReady(param2 + 2515)) {
              SocialTabsPanel.closeGameSocket(false);
              if (CommonUiHelpers.field_c == 7 &&
                !ProxySocketConnector.field_j) {
                ProxySocketConnector.field_j = true;
                stackIn_91_0 = -1;
                return stackIn_91_0;
              }
              if (7 == CommonUiHelpers.field_c) {
                CommonUiHelpers.field_c = 3;
              }
              IntrusiveDequeCursor.field_d = BackgroundSparkle.field_q.readString((byte) 81);
              ProxySocketConnector.field_j = false;
              stackIn_89_0 = CommonUiHelpers.field_c;
              return stackIn_89_0;
            }
            if (param2 != -2472) {
              stackIn_94_0 = 123;
              return stackIn_94_0;
            }
            if (null == TriangleSpanHelpers.field_e) {
              if (ProxySocketConnector.field_j) {
                if (ConnectionTimingHelpers.millisecondsSinceLastReceive((byte) 127) <= 30000L) {
                  IntrusiveDequeCursor.field_d = TextureCache.field_d;
                } else {
                  IntrusiveDequeCursor.field_d = StrongCacheEntry.field_G;
                }
                ProxySocketConnector.field_j = false;
                stackIn_102_0 = 3;
                return stackIn_102_0;
              }
              var6_intLifetime2 = PointerTrailBubble.field_t;
              PointerTrailBubble.field_t = IndexedSpriteState.field_m;
              ProxySocketConnector.field_j = true;
              IndexedSpriteState.field_m = var6_intLifetime2;
            }
            stackIn_104_0 = -1;
            return stackIn_104_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_107_0 = var6_ref;
            stackIn_107_1 = new StringBuilder().append("hn.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_108_2 = "null";
            } else {
              stackIn_108_2 = "{...}";
            }
            stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_111_2 = "null";
            } else {
              stackIn_111_2 = "{...}";
            }
            throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int getDay(byte param0);

    final static void openLoginPanel(boolean param0, String param1, int param2, boolean param3) {
        try {
          if (param2 < 21) {
            String var5 = (String) null;
            DateInputWidget.advanceLoginHandshake(false, (String) null, 8, true, 77, (String) null);
          }
          SettingsCookieHelpers.resetLoginState(-123);
          InsetTextPainter.field_s.hideAllLayers(0);
          ChatReceiveHelpers.field_c = new LoginPanel(SocialTabsPanel.field_d, (String) null, QuickChatCategory.field_v, param0, param3);
          PasswordValidator.field_u = new LoginDialog(InsetTextPainter.field_s, ChatReceiveHelpers.field_c);
          InsetTextPainter.field_s.pushLayer(PasswordValidator.field_u, false);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "hn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_M = null;
        field_N = "Type your age in years";
    }
}
