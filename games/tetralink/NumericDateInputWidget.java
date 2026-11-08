/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NumericDateInputWidget extends DateInputWidget {
    private EditableTextWidget field_R;
    private EditableTextWidget field_W;
    static int[] field_Y;
    private EditableTextWidget field_V;
    static BitmapFont field_S;
    static long field_T;
    static String[] field_Z;
    static int[] field_X;
    private boolean field_U;

    final int getDay(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 > 61) {
            stackIn_4_0 = Integer.parseInt(this.field_V.field_A);
            return stackIn_4_0;
          }
          stackIn_2_0 = 115;
          return stackIn_2_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    private NumericDateInputWidget(WidgetPainter param0, boolean param1) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_R = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (WidgetListener) null, 2));
          this.field_W = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (WidgetListener) null, 2));
          this.field_V = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (WidgetListener) null, 4));
          this.field_U = param1 ? true : false;
          this.field_V.field_H = param0;
          this.field_W.field_H = param0;
          this.field_R.field_H = param0;
          if (!this.field_U) {
            this.addChild(this.field_R, 10);
            this.addChild(this.field_W, 10);
          } else {
            this.addChild(this.field_W, 10);
            this.addChild(this.field_R, 10);
          }
          this.addChild(this.field_V, 10);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    NumericDateInputWidget(WidgetPainter param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.setBounds(param5, param3, 11, param2, param4);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void drawCenteredLabel(UiWidget param0, byte param1, int param2, int param3, String param4) {
        try {
          LruTextureCache.field_d.drawCentered(param4, param2 + (param0.field_t + (param0.field_F >> 1)), param3 + param0.field_w - 5, 16777215, -1);
          if (param1 != 33) {
            field_X = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "od.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final String getTooltip(int param0) {
        String var2 = this.field_W.getTooltip(param0 + param0);
        if (var2 != null) {
          return var2;
        }
        if (this.field_r) {
          return this.field_C == null ? this.field_A : this.field_C;
        }
        return null;
    }

    final static CoverageBitmapFont loadFontByName(Archive param0, String param1, Archive param2, String param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        CoverageBitmapFont stackIn_2_0 = null;
        CoverageBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param0.getGroupIdByName(param4 ^ -96, param3);
          var6 = param0.getFileIdByName(var5_int, false, param1);
          if (param4 == 95) {
            stackIn_4_0 = UrlFetchTask.loadSoundEffect(-29082, param2, var5_int, var6, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (CoverageBitmapFont) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("od.GA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, 23, param3, param4);
        int var7 = -20 / ((-61 - param2) / 51);
        int var6 = param4 - 130 >> 1;
        if (!this.field_U) {
          this.field_R.setBounds(param0, 0, 77, var6, 25);
          this.field_W.setBounds(param0, 0, -121, 45 + var6, 25);
        } else {
          this.field_W.setBounds(param0, 0, -125, var6, 25);
          this.field_R.setBounds(param0, 0, 43, var6 + 45, 25);
        }
        this.field_V.setBounds(param0, 0, -121, var6 + 90, 40);
    }

    final int getYear(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 12) {
          this.getYear((byte) -78);
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_R.field_A);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final void setBirthDateValidator(int param0, DateOfBirthValidator param1) {
        try {
          super.setBirthDateValidator(param0, param1);
          this.field_R.field_s = (WidgetListener) ((Object) param1);
          this.field_W.field_s = (WidgetListener) ((Object) param1);
          this.field_V.field_s = (WidgetListener) ((Object) param1);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "od.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getMonthIndex(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0) {
          return -14;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_W.field_A) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final boolean isDateIncomplete(int param0) {
        if (this.field_R.field_A == null) {
          return true;
        }
        if (0 == this.field_R.field_A.length()) {
          return true;
        }
        if (this.field_W.field_A != null &&
          0 != this.field_W.field_A.length()) {
          if (this.field_V.field_A != null &&
            0 != this.field_V.field_A.length()) {
            if (param0 != -30886) {
              field_X = (int[]) null;
            }
            return false;
          }
          return true;
        }
        return true;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0 ^ param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        param2 = param2 + this.field_w;
        param1 = param1 + this.field_t;
        this.drawCenteredLabel(this.field_R, (byte) 33, param1, param2, TextureCache.field_k);
        this.drawCenteredLabel(this.field_W, (byte) 33, param1, param2, StripedProgressBar.field_Z);
        this.drawCenteredLabel(this.field_V, (byte) 33, param1, param2, RasterStackHelpers.field_h);
    }

    final static int performAccountServerRequest(byte param0, String param1, ConditionalTextValue param2, int param3, int param4, boolean param5, ConditionalTextValue param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        PacketBuffer stackIn_19_0 = null;
        String stackIn_20_1 = null;
        PacketBuffer stackIn_22_0 = null;
        String stackIn_23_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var16 = null;
        var13 = TetraLink.field_J;
        try {
          if (param0 != 98) {
            var14 = (String) null;
            NumericDateInputWidget.loadFontByName((Archive) null, (String) null, (Archive) null, (String) null, (byte) -75);
          }
          var15 = param2.getText((byte) -54);
          var8 = param6.getText((byte) -66);
          if (TriangleSpanHelpers.field_e == null &&
            !ReportAbuseDialog.pollGameSocketConnection(false, (byte) -85)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (BitPacketBuffer.field_z == SparkParticle.field_p) {
            ModelMergeHelpers.field_b = null;
            QuickChatHelpDialog.field_Lb.position = 0;
            if (param1 == null) {
              AnimationSequence.field_j.position = 0;
              AnimationSequence.field_j.writeInt(SocketConnector.field_i.nextInt(), (byte) -124);
              AnimationSequence.field_j.writeInt(SocketConnector.field_i.nextInt(), (byte) -124);
              stackIn_19_0 = AnimationSequence.field_j;
              if (!param2.isSelected(0)) {
                stackIn_20_1 = "";
              } else {
                stackIn_20_1 = var15;
              }
              ((PacketBuffer) (Object) stackIn_19_0).writeZeroPrefixedString(stackIn_20_1, (byte) 103);
              stackIn_22_0 = AnimationSequence.field_j;
              if (!param6.isSelected(0)) {
                stackIn_23_1 = "";
              } else {
                stackIn_23_1 = var8;
              }
              ((PacketBuffer) (Object) stackIn_22_0).writeZeroPrefixedString(stackIn_23_1, (byte) 103);
              QuickChatHelpDialog.field_Lb.writeByte(16, false);
              QuickChatHelpDialog.field_Lb.position = QuickChatHelpDialog.field_Lb.position + 1;
              var9 = QuickChatHelpDialog.field_Lb.position;
              TextButton.writeRsaEncryptedPacket(AccountCreationResultHelpers.field_c, QuickChatHelpDialog.field_Lb, AnimationSequence.field_j, RsaKeyAndTextGlobals.field_c, 104);
              QuickChatHelpDialog.field_Lb.backpatchByteLength(-var9 + QuickChatHelpDialog.field_Lb.position, -2);
            } else {
              var9 = 0;
              if (param5) {
                var9 = var9 | 1;
              }
              AnimationSequence.field_j.position = 0;
              AnimationSequence.field_j.writeInt(SocketConnector.field_i.nextInt(), (byte) -124);
              AnimationSequence.field_j.writeInt(SocketConnector.field_i.nextInt(), (byte) -124);
              AnimationSequence.field_j.writeZeroPrefixedString(var15, (byte) 103);
              AnimationSequence.field_j.writeZeroPrefixedString(var8, (byte) 103);
              var17 = (CharSequence) ((Object) param1);
              AnimationSequence.field_j.writeZeroPrefixedString(ChatPanelHelpers.normalizeAsciiIdentifier(var17, (byte) 56), (byte) 103);
              AnimationSequence.field_j.writeShort(param3, false);
              AnimationSequence.field_j.writeByte(param4, false);
              AnimationSequence.field_j.writeByte(var9, false);
              QuickChatHelpDialog.field_Lb.writeByte(18, false);
              QuickChatHelpDialog.field_Lb.position = QuickChatHelpDialog.field_Lb.position + 2;
              var10 = QuickChatHelpDialog.field_Lb.position;
              var11_ref_String = SettingsCookieHelpers.readSettingsCookie(ProgressMessageDialog.getHostApplet(13), (byte) 99);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              QuickChatHelpDialog.field_Lb.writeString(var11_ref_String, 0);
              TextButton.writeRsaEncryptedPacket(AccountCreationResultHelpers.field_c, QuickChatHelpDialog.field_Lb, AnimationSequence.field_j, RsaKeyAndTextGlobals.field_c, 123);
              QuickChatHelpDialog.field_Lb.backpatchShortLength((byte) 59, -var10 + QuickChatHelpDialog.field_Lb.position);
            }
            PacketFlushHelpers.flushPackets((byte) -114, -1);
            SparkParticle.field_p = MouseInputHandler.field_a;
          }
          if (MouseInputHandler.field_a == SparkParticle.field_p &&
            SingleChildWidget.fillIncomingBuffer(99, 1)) {
            var9Lifetime1 = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
            BackgroundSparkle.field_q.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              CheckboxPainter.field_h = new String[-100 + var9Lifetime1];
              SparkParticle.field_p = HighscoreQuery.field_v;
            } else {
              if (248 == var9Lifetime1) {
                GameSession.setTuhstatbutCookie(ProgressMessageDialog.getHostApplet(13), 60);
                IntrusiveDequeCursor.field_d = ClockAndTextHelpers.field_d;
                SocialTabsPanel.closeGameSocket(false);
                ProxySocketConnector.field_j = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (99 != var9Lifetime1) {
                SparkParticle.field_p = HighscoreRowName.field_d;
                CommonUiHelpers.field_c = var9Lifetime1;
                KeyHandlerHelpers.field_d = -1;
              } else {
                SingleChildWidget.fillIncomingBuffer(96, MenuReturnHelpers.getReplyFlagLength(param0 + 31934));
                ModelMergeHelpers.field_b = new Boolean(GameApplet.readBooleanByte(BackgroundSparkle.field_q, (byte) 55));
                BackgroundSparkle.field_q.position = 0;
              }
            }
          }
          if (SparkParticle.field_p == HighscoreQuery.field_v) {
            var9Lifetime2 = 2;
            if (SingleChildWidget.fillIncomingBuffer(param0 ^ 23, var9Lifetime2)) {
              var10Lifetime1 = BackgroundSparkle.field_q.readUnsignedShort(127);
              BackgroundSparkle.field_q.position = 0;
              if (SingleChildWidget.fillIncomingBuffer(108, var10Lifetime1)) {
                var11 = CheckboxPainter.field_h.length;
                for (var12 = 0; var12 < var11; var12++) {
                  CheckboxPainter.field_h[var12] = BackgroundSparkle.field_q.readZeroPrefixedString(true);
                }
                SocialTabsPanel.closeGameSocket(false);
                ProxySocketConnector.field_j = false;
                stackIn_48_0 = 100 + var11;
                return stackIn_48_0;
              }
            }
          }
          if (HighscoreRowName.field_d == SparkParticle.field_p &&
            CommonUiHelpers.isPacketPayloadReady(72)) {
            if (255 == CommonUiHelpers.field_c) {
              var9_ref_String = BackgroundSparkle.field_q.readOptionalString(param0 - 208);
              if (var9_ref_String != null) {
                SparkParticle.writeSettingsCookie(var9_ref_String, -7011, ProgressMessageDialog.getHostApplet(13));
              }
            } else {
              IntrusiveDequeCursor.field_d = BackgroundSparkle.field_q.readString((byte) 81);
            }
            SocialTabsPanel.closeGameSocket(false);
            ProxySocketConnector.field_j = false;
            stackIn_57_0 = CommonUiHelpers.field_c;
            return stackIn_57_0;
          }
          if (TriangleSpanHelpers.field_e == null) {
            if (ProxySocketConnector.field_j) {
              if (ConnectionTimingHelpers.millisecondsSinceLastReceive((byte) 127) <= 30000L) {
                IntrusiveDequeCursor.field_d = TextureCache.field_d;
              } else {
                IntrusiveDequeCursor.field_d = StrongCacheEntry.field_G;
              }
              ProxySocketConnector.field_j = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = PointerTrailBubble.field_t;
            PointerTrailBubble.field_t = IndexedSpriteState.field_m;
            ProxySocketConnector.field_j = true;
            IndexedSpriteState.field_m = var9Lifetime3;
          }
          stackIn_68_0 = -1;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("od.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param2 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_X = null;
        field_S = null;
        if (param0) {
          field_Z = (String[]) null;
        }
        field_Z = null;
        field_Y = null;
    }

    static {
        field_Y = new int[]{2, 14, 15, 6, 5, 16, 17, 12};
        field_Z = new String[]{"Showing by rating", "Showing by win percentage"};
        field_X = new int[8192];
    }
}
