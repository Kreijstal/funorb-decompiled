/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport118 {
    private int integerState0760;
    private int integerState0761;
    private int integerState0762;
    private boolean booleanState0180;
    RgbSprite[] rgbSpriteArrayState0027;
    static NodeDeque nodeDequeState0032;
    RgbSprite rgbSpriteState0057;
    private int integerState0763;
    static boolean booleanState0181;
    static DisplayNameSelectionPanel uiComponentPart005State0001;
    private int integerState0764;

    final MixedSupport118 computeMixedSupport1181552(int integerArgument1, int integerArgument2) {
        if (integerArgument1 != -1) {
          this.integerState0763 = 9;
        }
        this.integerState0760 = integerArgument2;
        return this;
    }

    final void performAction1546(MixedSupport118 mixedSupport118Argument1, int integerArgument2) {
        try {
          mixedSupport118Argument1.rgbSpriteState0057 = this.rgbSpriteState0057;
          if (integerArgument2 != 1) {
            MixedSupport118 mixedSupport118Local1 = (MixedSupport118) null;
            this.performAction1546((MixedSupport118) null, -53);
          }
          mixedSupport118Argument1.rgbSpriteArrayState0027 = this.rgbSpriteArrayState0027;
          mixedSupport118Argument1.integerState0760 = this.integerState0760;
          mixedSupport118Argument1.integerState0763 = this.integerState0763;
          mixedSupport118Argument1.integerState0761 = this.integerState0761;
          mixedSupport118Argument1.integerState0764 = this.integerState0764;
          mixedSupport118Argument1.integerState0762 = this.integerState0762;
          mixedSupport118Argument1.booleanState0180 = this.booleanState0180;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "sn.M(" + (mixedSupport118Argument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final void performAction1541(int integerArgument1, UiComponent uiComponentArgument2, int integerArgument3, MixedSupport009 mixedSupport009Argument4, int integerArgument5) {
        BitmapFont stackBitmapFontLocal1 = null;
        String stackStringLocal2 = null;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6;
        int stackIntegerLocal7;
        int stackIntegerLocal8;
        int stackIntegerLocal9;
        int stackIntegerLocal10;
        int stackIntegerLocal11;
        RuntimeException stackRuntimeExceptionLocal12 = null;
        StringBuilder stackStringBuilderLocal13 = null;
        String stackStringLocal14 = null;
        StringBuilder stackStringBuilderLocal15 = null;
        String stackStringLocal16 = null;
        RuntimeException caughtExceptionLocal17 = null;
        int integerLocal18 = 0;
        String stringLocal19 = null;
        RuntimeException runtimeExceptionLocal20 = null;
        int integerLocal21 = 0;
        RgbSprite[] rgbSpriteArrayLocal22 = null;
        try {
          GameplayControls.performAction1749(uiComponentArgument2.integerState0108, (byte) 50, this.rgbSpriteArrayState0027, uiComponentArgument2.integerState0107, integerArgument5 + uiComponentArgument2.integerState0104, integerArgument3 + uiComponentArgument2.integerState0110);
          if (integerArgument1 != -2) {
            rgbSpriteArrayLocal22 = (RgbSprite[]) null;
            this.computeMixedSupport1181543(-28, (RgbSprite[]) null);
          }
          if (null != this.rgbSpriteState0057) {
            integerLocal18 = this.integerState0760 + uiComponentArgument2.integerState0110 + integerArgument3;
            integerLocal21 = integerArgument5 + (uiComponentArgument2.integerState0104 + this.integerState0764);
            if (mixedSupport009Argument4.integerState0009 == 1) {
              integerLocal18 = integerLocal18 + (-this.rgbSpriteState0057.integerState0254 + uiComponentArgument2.integerState0107) / 2;
            }
            if (1 == mixedSupport009Argument4.integerState0004) {
              integerLocal21 = integerLocal21 + (-this.rgbSpriteState0057.integerState0260 + uiComponentArgument2.integerState0108) / 2;
            }
            if (mixedSupport009Argument4.integerState0009 == 2) {
              integerLocal18 = integerLocal18 + (uiComponentArgument2.integerState0107 - this.rgbSpriteState0057.integerState0254);
            }
            if (mixedSupport009Argument4.integerState0004 == 2) {
              integerLocal21 = integerLocal21 + (-this.rgbSpriteState0057.integerState0260 + uiComponentArgument2.integerState0108);
            }
            this.rgbSpriteState0057.performAction0278(integerLocal18, integerLocal21);
          }
          stringLocal19 = mixedSupport009Argument4.computeString0020(uiComponentArgument2, (byte) -116);
          if (stringLocal19 != null &&
            mixedSupport009Argument4.bitmapFontState0001 != null &&
            this.integerState0761 >= 0) {
            stackBitmapFontLocal1 = mixedSupport009Argument4.bitmapFontState0001;
            stackStringLocal2 = stringLocal19;
            if (this.integerState0760 == -2147483648) {
              stackIntegerLocal3 = 0;
            } else {
              stackIntegerLocal3 = this.integerState0760;
            }
            stackIntegerLocal4 = stackIntegerLocal3 + (uiComponentArgument2.integerState0110 + integerArgument3) + mixedSupport009Argument4.integerState0008;
            if (this.integerState0764 == -2147483648) {
              stackIntegerLocal5 = 0;
            } else {
              stackIntegerLocal5 = this.integerState0764;
            }
            stackIntegerLocal6 = stackIntegerLocal5 + (mixedSupport009Argument4.integerState0003 + (uiComponentArgument2.integerState0104 + integerArgument5));
            stackIntegerLocal7 = uiComponentArgument2.integerState0107 - mixedSupport009Argument4.integerState0008 - mixedSupport009Argument4.integerState0001;
            stackIntegerLocal8 = -mixedSupport009Argument4.integerState0003 + (uiComponentArgument2.integerState0108 - mixedSupport009Argument4.integerState0010);
            stackIntegerLocal9 = this.integerState0761;
            stackIntegerLocal10 = this.integerState0762;
            if (this.integerState0763 != -2147483648) {
              stackIntegerLocal11 = this.integerState0763;
            } else {
              stackIntegerLocal11 = 256;
            }
            ((BitmapFont) (Object) stackBitmapFontLocal1).computeInteger1072(stackStringLocal2, stackIntegerLocal4, stackIntegerLocal6, stackIntegerLocal7, stackIntegerLocal8, stackIntegerLocal9, stackIntegerLocal10, stackIntegerLocal11, mixedSupport009Argument4.integerState0009, mixedSupport009Argument4.integerState0004, mixedSupport009Argument4.integerState0006);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal23) {
          caughtExceptionLocal17 = caughtParameterLocal23;
          runtimeExceptionLocal20 = caughtExceptionLocal17;
          stackRuntimeExceptionLocal12 = runtimeExceptionLocal20;
          stackStringBuilderLocal13 = new StringBuilder().append("sn.L(").append(integerArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          stackStringBuilderLocal15 = ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(',').append(integerArgument3).append(',');
          if (mixedSupport009Argument4 == null) {
            stackStringLocal16 = "null";
          } else {
            stackStringLocal16 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal12), ((StringBuilder) (Object) stackStringBuilderLocal15).append(stackStringLocal16).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final MixedSupport118 computeMixedSupport1181540(int integerArgument1, int integerArgument2) {
        this.integerState0764 = integerArgument1;
        if (integerArgument2 != -2147483648) {
          nodeDequeState0032 = (NodeDeque) null;
        }
        return this;
    }

    final static void performAction1544(long longArgument1, int integerArgument2, String stringArgument3, int integerArgument4, boolean booleanArgument5, int integerArgument6) {
        int integerLocal1 = 0;
        try {
          SocketFactory.cipherPacketBufferState0002.performAction1641(integerArgument2, -4);
          SocketFactory.cipherPacketBufferState0002.position = SocketFactory.cipherPacketBufferState0002.position + 1;
          if (integerArgument4 <= 34) {
            nodeDequeState0032 = (NodeDeque) null;
          }
          integerLocal1 = SocketFactory.cipherPacketBufferState0002.position;
          SocketFactory.cipherPacketBufferState0002.writeLong(longArgument1, (byte) 0);
          SocketFactory.cipherPacketBufferState0002.writeNullTerminatedString(0, stringArgument3);
          SocketFactory.cipherPacketBufferState0002.writeByte(true, integerArgument6);
          SocketFactory.cipherPacketBufferState0002.writeByte(true, booleanArgument5 ? 1 : 0);
          SocketFactory.cipherPacketBufferState0002.writeLengthByte(-integerLocal1 + SocketFactory.cipherPacketBufferState0002.position, true);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "sn.K(" + longArgument1 + ',' + integerArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ',' + booleanArgument5 + ',' + integerArgument6 + ')');
        }
    }

    final static void performAction1551(byte byteArgument1) {
        MixedSupport119.networkSupport003State0003.integerState0132 = 0;
        MixedSupport119.networkSupport003State0003.integerState0131 = 0;
        int integerLocal1 = -59 % ((-49 - byteArgument1) / 38);
    }

    final MixedSupport118 computeMixedSupport1181550(int integerArgument1, int integerArgument2) {
        this.integerState0762 = integerArgument2;
        if (integerArgument1 >= -76) {
          return (MixedSupport118) null;
        }
        return this;
    }

    final void performAction1549(byte byteArgument1) {
        this.integerState0761 = 0;
        this.integerState0763 = 256;
        this.rgbSpriteState0057 = null;
        if (byteArgument1 <= 66) {
          return;
        }
        this.integerState0762 = -1;
        this.integerState0760 = 0;
        this.rgbSpriteArrayState0027 = null;
        this.integerState0764 = 0;
    }

    final static int computeInteger1545(String stringArgument1, boolean booleanArgument2, String stringArgument3, byte byteArgument4, int integerArgument5, boolean booleanArgument6) {
        try {
          int stackIntegerLocal1 = 0;
          int stackIntegerLocal2 = 0;
          int stackIntegerLocal3 = 0;
          boolean stackBooleanLocal4 = false;
          boolean stackBooleanLocal5 = false;
          boolean stackBooleanLocal6 = false;
          boolean stackBooleanLocal7 = false;
          int stackIntegerLocal8 = 0;
          int stackIntegerLocal9 = 0;
          int stackIntegerLocal10 = 0;
          int stackIntegerLocal11 = 0;
          int stackIntegerLocal12 = 0;
          RuntimeException stackRuntimeExceptionLocal13 = null;
          StringBuilder stackStringBuilderLocal14 = null;
          String stackStringLocal15 = null;
          StringBuilder stackStringBuilderLocal16 = null;
          String stackStringLocal17 = null;
          Throwable caughtExceptionLocal18 = null;
          int integerLocal19 = 0;
          String stringLocal20 = null;
          RuntimeException runtimeExceptionLocal21 = null;
          int integerLocal22 = 0;
          int integerLocal23 = 0;
          Throwable throwableLocal24 = null;
          int integerLocal25 = 0;
          String stringLocal26 = null;
          CharSequence charSequenceLocal27 = null;
          int integerLocal28;
          int integerLocal29;
          int integerLocal30;
          integerLocal25 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            if (GameSession.bufferedSocketState0002 == null &&
              !NetworkSupport006.computeBoolean1025(booleanArgument6, byteArgument4 - 129)) {
              stackIntegerLocal1 = -1;
              return stackIntegerLocal1;
            }
            if (DebouncedFieldValidator.mixedSupport132State0001 == UiComponentPart023.mixedSupport132State0009) {
              if (booleanArgument6) {
                stringLocal26 = (String) null;
                SceneWidgetPart014.mixedSupport043State0001 = MixedSupport113.computeMixedSupport0431472(GameAssets.longState0046, stringArgument3, false, (String) null, 0);
              } else {
                SceneWidgetPart014.mixedSupport043State0001 = MouseWheelInput.computeMixedSupport0430672(false, stringArgument3, stringArgument1, 9507);
              }
              SocketFactory.cipherPacketBufferState0002.position = 0;
              SocketFactory.cipherPacketBufferState0002.writeByte(true, 14);
              SocketFactory.cipherPacketBufferState0002.writeByte(true, SceneWidgetPart014.mixedSupport043State0001.computeMixedSupport0480543(byteArgument4 ^ 37).integerState0261);
              UiComponentPart033.performAction1818(4792, -1);
              UiComponentPart023.mixedSupport132State0009 = SoftwareFramebuffer.mixedSupport132State0011;
            }
            if (UiComponentPart023.mixedSupport132State0009 == SoftwareFramebuffer.mixedSupport132State0011 &&
              MixedSupport098.computeBoolean1219(25973, 1)) {
              integerLocal19 = UiComponentPart006.cipherPacketBufferState0001.readUnsignedByte((byte) -85);
              if (integerLocal19 != 0) {
                HashNode.integerState0070 = integerLocal19;
                UiComponentPart023.mixedSupport132State0009 = HashNode.mixedSupport132State0002;
                NetworkSupport012.integerState0759 = -1;
              } else {
                UiComponentPart023.mixedSupport132State0009 = MixedSupport070.mixedSupport132State0004;
              }
              UiComponentPart006.cipherPacketBufferState0001.position = 0;
            }
            if (byteArgument4 != 55) {
              stackIntegerLocal2 = -94;
              return stackIntegerLocal2;
            }
            if (MixedSupport070.mixedSupport132State0004 == UiComponentPart023.mixedSupport132State0009 &&
              MixedSupport098.computeBoolean1219(25973, 8)) {
              Sprite.longState0027 = UiComponentPart006.cipherPacketBufferState0001.readLong((byte) -108);
              UiComponentPart006.cipherPacketBufferState0001.position = 0;
              PlayerNameAvailabilityValidator.performAction0827(booleanArgument6, SceneWidgetPart014.mixedSupport043State0001, integerArgument5, (byte) 127, booleanArgument2);
              UiComponentPart023.mixedSupport132State0009 = MixedSupport087.mixedSupport132State0007;
            }
            boolean frameRemainderLocal31 = true;
            if (UiComponentPart023.mixedSupport132State0009 == MixedSupport087.mixedSupport132State0007 &&
              MixedSupport098.computeBoolean1219(25973, 1)) {
              integerLocal28 = UiComponentPart006.cipherPacketBufferState0001.readUnsignedByte((byte) -46);
              MixedSupport139.stringState0594 = null;
              HashNode.integerState0070 = integerLocal28;
              UiComponentPart006.cipherPacketBufferState0001.position = 0;
              if (integerLocal28 != 0 &&
                integerLocal28 != 1) {
                if (8 != integerLocal28) {
                  NetworkSupport012.integerState0759 = -1;
                  UiComponentPart023.mixedSupport132State0009 = HashNode.mixedSupport132State0002;
                  frameRemainderLocal31 = false;
                }
                else {
                  NodeHashTable.performAction1498(byteArgument4 + 22);
                  SceneWidgetPart006.booleanState0083 = false;
                  stackIntegerLocal3 = integerLocal28;
                  return stackIntegerLocal3;
                }
              }
              if (frameRemainderLocal31) {
                NetworkSupport012.integerState0759 = -1;
                UiComponentPart023.mixedSupport132State0009 = ResourceSupport003.mixedSupport132State0008;
              }
            }
            if (UiComponentPart023.mixedSupport132State0009 == ResourceSupport003.mixedSupport132State0008 &&
              MixedSupport039.computeBoolean0524((byte) -62)) {
              GameAssets.longState0046 = UiComponentPart006.cipherPacketBufferState0001.readLong((byte) -108);
              HuffmanCodec.stringState0288 = stringArgument3;
              PasswordValidator.integerState0776 = UiComponentPart006.cipherPacketBufferState0001.readUnsignedByte((byte) -76);
              MixedSupport021.integerState0123 = UiComponentPart006.cipherPacketBufferState0001.readUnsignedByte((byte) -113);
              Framebuffer.integerState0192 = UiComponentPart006.cipherPacketBufferState0001.readUnsignedShort(3);
              stringLocal20 = UiComponentPart006.cipherPacketBufferState0001.readNullableString(-16829);
              integerLocal22 = UiComponentPart006.cipherPacketBufferState0001.readUnsignedByte((byte) -93);
              if ((integerLocal22 & 1) != 0) {
                MixedSupport105.performAction1368((byte) 64);
              }
              if (!booleanArgument6) {
                stackBooleanLocal4 = (0 != (8 & integerLocal22));
                MixedSupport144.booleanState0221 = stackBooleanLocal4;
                stackBooleanLocal5 = ((4 & integerLocal22) != 0);
                MixedSupport094.booleanState0132 = stackBooleanLocal5;
                stackBooleanLocal6 = ((integerLocal22 & 2) != 0);
                PacketBuffer.booleanState0228 = stackBooleanLocal6;
                if (MixedSupport144.booleanState0221) {
                  PacketBuffer.booleanState0228 = true;
                }
              }
              stackBooleanLocal7 = (0 != (16 & integerLocal22));
              MixedSupport047.booleanState0057 = stackBooleanLocal7;
              if (MixedSupport018.booleanState0021) {
                UiComponentPart006.cipherPacketBufferState0001.readUnsignedByte((byte) -25);
                UiComponentPart006.cipherPacketBufferState0001.readUnsignedByte((byte) -71);
                UiComponentPart006.cipherPacketBufferState0001.readInt(byteArgument4 ^ 7606);
                MixedSupport130.integerState0810 = UiComponentPart006.cipherPacketBufferState0001.readUnsignedShort(3);
                UiComponentPart001.byteArrayState0002 = new byte[MixedSupport130.integerState0810];
                for (integerLocal23 = 0; integerLocal23 < MixedSupport130.integerState0810; integerLocal23++) {
                  UiComponentPart001.byteArrayState0002[integerLocal23] = UiComponentPart006.cipherPacketBufferState0001.readByte((byte) -99);
                }
              }
              MixedSupport089.stringState0372 = UiComponentPart006.cipherPacketBufferState0001.readNullTerminatedString((byte) -38);
              charSequenceLocal27 = (CharSequence) ((Object) MixedSupport089.stringState0372);
              MixedSupport051.stringState0212 = ComponentContainer.computeString0894(charSequenceLocal27, (byte) 2);
              GameDomainSupport001.integerState0052 = UiComponentPart006.cipherPacketBufferState0001.readUnsignedByte((byte) -49);
              UiComponentPart023.mixedSupport132State0009 = SoftwareFramebuffer.mixedSupport132State0012;
              if (SceneWidgetPart014.mixedSupport043State0001.computeMixedSupport0480543(18) != GameDomainSupport005.mixedSupport048State0002) {
                if (SceneWidgetPart014.mixedSupport043State0001.computeMixedSupport0480543(18) == MusicTrack.mixedSupport048State0003) {
                  RenderingSupport003.mixedSupport061State0002.performAction0729(-117, UiComponentPart029.computeApplet1485(25144));
                }
              } else {
                MixedSupport005.mixedSupport061State0001.performAction0729(-69, UiComponentPart029.computeApplet1485(byteArgument4 ^ 25103));
              }
              SceneWidgetPart006.booleanState0083 = false;
              if (stringLocal20 != null) {
                MixedSupport001.performAction0016(stringLocal20, false, UiComponentPart029.computeApplet1485(25144));
              }
              if (Framebuffer.integerState0192 <= 0 &&
                !MixedSupport094.booleanState0132) {
                try {
                  JavaScriptBridge.callWithoutArguments(true, "unzap", UiComponentPart029.computeApplet1485(25144));
                } catch (java.lang.Throwable caughtParameterLocal32) {
                  caughtExceptionLocal18 = caughtParameterLocal32;
                  throwableLocal24 = caughtExceptionLocal18;
                }
              } else {
                try {
                  JavaScriptBridge.callWithArguments("zap", -14541, UiComponentPart029.computeApplet1485(25144), new Object[]{TextLayout.computeString0234(0, GameAssets.longState0046)});
                } catch (java.lang.Throwable caughtParameterLocal33) {
                  caughtExceptionLocal18 = caughtParameterLocal33;
                  throwableLocal24 = caughtExceptionLocal18;
                }
              }
              if (Framebuffer.integerState0192 > 0) {
                UiComponent.booleanState0017 = true;
              }
              SocketFactory.cipherPacketBufferState0002.performAction1640(MixedSupport097.integerArrayState0179, (byte) 63);
              for (integerLocal30 = 0; integerLocal30 < 4; integerLocal30++) {
                MixedSupport097.integerArrayState0179[integerLocal30] = MixedSupport097.integerArrayState0179[integerLocal30] + 50;
              }
              UiComponentPart006.cipherPacketBufferState0001.performAction1640(MixedSupport097.integerArrayState0179, (byte) 123);
              stackIntegerLocal8 = HashNode.integerState0070;
              return stackIntegerLocal8;
            }
            if (UiComponentPart023.mixedSupport132State0009 == HashNode.mixedSupport132State0002 &&
              MixedSupport039.computeBoolean0524((byte) 122)) {
              NodeHashTable.performAction1498(119);
              if (HashNode.integerState0070 == 7 &&
                !SceneWidgetPart006.booleanState0083) {
                SceneWidgetPart006.booleanState0083 = true;
                stackIntegerLocal9 = -1;
                return stackIntegerLocal9;
              }
              if (HashNode.integerState0070 == 7) {
                HashNode.integerState0070 = 3;
              }
              EditableTextField.stringState0483 = UiComponentPart006.cipherPacketBufferState0001.readNullTerminatedString((byte) -38);
              SceneWidgetPart006.booleanState0083 = false;
              stackIntegerLocal10 = HashNode.integerState0070;
              return stackIntegerLocal10;
            }
            if (GameSession.bufferedSocketState0002 == null) {
              if (SceneWidgetPart006.booleanState0083) {
                if (MixedSupport117.computeLong1528(-1) <= 30000L) {
                  EditableTextField.stringState0483 = MatchingFieldValidator.stringState0470;
                } else {
                  EditableTextField.stringState0483 = MixedSupport069.stringState0311;
                }
                SceneWidgetPart006.booleanState0083 = false;
                stackIntegerLocal11 = 3;
                return stackIntegerLocal11;
              }
              integerLocal29 = MixedSupport052.integerState0270;
              MixedSupport052.integerState0270 = UiComponentPart010.integerState0189;
              SceneWidgetPart006.booleanState0083 = true;
              UiComponentPart010.integerState0189 = integerLocal29;
            }
            stackIntegerLocal12 = -1;
            return stackIntegerLocal12;
          } catch (java.lang.RuntimeException caughtParameterLocal34) {
            caughtExceptionLocal18 = caughtParameterLocal34;
            runtimeExceptionLocal21 = (RuntimeException) (Object) caughtExceptionLocal18;
            stackRuntimeExceptionLocal13 = runtimeExceptionLocal21;
            stackStringBuilderLocal14 = new StringBuilder().append("sn.G(");
            if (stringArgument1 == null) {
              stackStringLocal15 = "null";
            } else {
              stackStringLocal15 = "{...}";
            }
            stackStringBuilderLocal16 = ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',').append(booleanArgument2).append(',');
            if (stringArgument3 == null) {
              stackStringLocal17 = "null";
            } else {
              stackStringLocal17 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal13), ((StringBuilder) (Object) stackStringBuilderLocal16).append(stackStringLocal17).append(',').append(byteArgument4).append(',').append(integerArgument5).append(',').append(booleanArgument6).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal35) {
          throw uncheckedExceptionLocal35;
        } catch (Throwable checkedExceptionLocal36) {
          throw new RuntimeException(checkedExceptionLocal36);
        }
    }

    final MixedSupport118 computeMixedSupport1181539(int integerArgument1, byte byteArgument2) {
        this.integerState0761 = integerArgument1;
        if (byteArgument2 != 106) {
          return (MixedSupport118) null;
        }
        return this;
    }

    final void performAction1547(MixedSupport118 mixedSupport118Argument1, MixedSupport009 mixedSupport009Argument2, int integerArgument3, int integerArgument4, int integerArgument5, UiComponent uiComponentArgument6) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        UiComponent uiComponentLocal10 = null;
        try {
          if (this.booleanState0180) {
            mixedSupport118Argument1.performAction1541(-2, uiComponentArgument6, integerArgument5, mixedSupport009Argument2, integerArgument4);
            mixedSupport118Argument1.performAction1549((byte) 76);
          }
          if (-2147483648 != this.integerState0764) {
            mixedSupport118Argument1.integerState0764 = this.integerState0764;
          }
          if (this.integerState0760 != -2147483648) {
            mixedSupport118Argument1.integerState0760 = this.integerState0760;
          }
          if (integerArgument3 <= 121) {
            uiComponentLocal10 = (UiComponent) null;
            this.performAction1547((MixedSupport118) null, (MixedSupport009) null, 121, -77, -29, (UiComponent) null);
          }
          if (this.integerState0763 != -2147483648) {
            mixedSupport118Argument1.integerState0763 = this.integerState0763;
          }
          if (this.integerState0761 >= -1) {
            mixedSupport118Argument1.integerState0761 = this.integerState0761;
          }
          if (-1 <= this.integerState0762) {
            mixedSupport118Argument1.integerState0762 = this.integerState0762;
          }
          if (this.rgbSpriteState0057 != null) {
            mixedSupport118Argument1.rgbSpriteState0057 = this.rgbSpriteState0057;
          }
          if (null != this.rgbSpriteArrayState0027) {
            mixedSupport118Argument1.rgbSpriteArrayState0027 = this.rgbSpriteArrayState0027;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal8 = caughtParameterLocal11;
          runtimeExceptionLocal9 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal9;
          stackStringBuilderLocal2 = new StringBuilder().append("sn.J(");
          if (mixedSupport118Argument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (mixedSupport009Argument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',');
          if (uiComponentArgument6 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final MixedSupport118 computeMixedSupport1181543(int integerArgument1, RgbSprite[] rgbSpriteArrayArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          this.rgbSpriteArrayState0027 = rgbSpriteArrayArgument2;
          integerLocal1 = -21 % ((45 - integerArgument1) / 52);
          return this;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal2;
          stackStringBuilderLocal4 = new StringBuilder().append("sn.B(").append(integerArgument1).append(',');
          if (rgbSpriteArrayArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static void performAction1548(boolean booleanArgument1) {
        if (MixedSupport020.fullscreenCanvasState0001 == null) {
          return;
        }
        SceneWidgetPart012.performAction1609(booleanArgument1, MixedSupport020.fullscreenCanvasState0001);
        MixedSupport020.fullscreenCanvasState0001.exitFullscreen(GzipDecompressor.platformServiceState0003, 115);
        MixedSupport020.fullscreenCanvasState0001 = null;
        if (null != MixedSupport077.displayModeControllerState0001) {
          MixedSupport077.displayModeControllerState0001.restorePreviousSize((byte) -110);
        }
        GameDomainSupport004.canvasState0001.requestFocus();
    }

    MixedSupport118() {
        this.integerState0760 = -2147483648;
        this.integerState0762 = -2;
        this.rgbSpriteArrayState0027 = null;
        this.booleanState0180 = false;
        this.integerState0763 = -2147483648;
        this.rgbSpriteState0057 = null;
        this.integerState0761 = -2;
        this.integerState0764 = -2147483648;
    }

    final MixedSupport118 computeMixedSupport1181542(int integerArgument1, boolean booleanArgument2) {
        if (integerArgument1 != -16598) {
          this.booleanState0180 = true;
        }
        this.booleanState0180 = booleanArgument2 ? true : false;
        return this;
    }

    public static void clearStaticReferences(byte byteArgument1) {
        uiComponentPart005State0001 = null;
        int integerLocal1 = -72 % ((byteArgument1 - 30) / 37);
        nodeDequeState0032 = null;
    }

    static {
        nodeDequeState0032 = new NodeDeque();
    }
}
