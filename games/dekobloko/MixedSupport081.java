/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport081 {
    static SecondaryNodeHashTable secondaryNodeHashTableState0003;
    static int[] integerArrayState0153;
    static int integerState0501;
    static String stringState0340;
    static String stringState0341;
    static String stringState0342;

    final static void performAction1031(boolean booleanArgument1, MixedSupport038 mixedSupport038Argument2, int integerArgument3) {
        CipherPacketBuffer cipherPacketBufferLocal1 = null;
        int integerLocal2 = 0;
        try {
          cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal1.writeCipheredByte(integerArgument3, -4);
          cipherPacketBufferLocal1.position = cipherPacketBufferLocal1.position + 1;
          integerLocal2 = cipherPacketBufferLocal1.position;
          cipherPacketBufferLocal1.writeByte(true, 1);
          cipherPacketBufferLocal1.writeByte(booleanArgument1, mixedSupport038Argument2.integerState0230);
          cipherPacketBufferLocal1.writeSignedSmart(17, mixedSupport038Argument2.integerState0227);
          cipherPacketBufferLocal1.writeInt(mixedSupport038Argument2.integerState0228, false);
          cipherPacketBufferLocal1.writeInt(mixedSupport038Argument2.integerState0226, false);
          cipherPacketBufferLocal1.writeInt(mixedSupport038Argument2.integerState0229, false);
          cipherPacketBufferLocal1.writeInt(mixedSupport038Argument2.integerState0225, false);
          cipherPacketBufferLocal1.appendCrc32((byte) -15, integerLocal2);
          cipherPacketBufferLocal1.writeLengthByte(cipherPacketBufferLocal1.position - integerLocal2, true);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "mc.B(" + booleanArgument1 + ',' + (mixedSupport038Argument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ')');
        }
    }

    public static void clearStaticReferences(int integerArgument1) {
        integerArrayState0153 = null;
        stringState0340 = null;
        if (integerArgument1 != 0) {
          return;
        }
        stringState0341 = null;
        stringState0342 = null;
        secondaryNodeHashTableState0003 = null;
    }

    final static void performAction1030(LobbyRoomRow sceneWidgetPart013Argument1, boolean booleanArgument2, int integerArgument3, byte byteArgument4) {
        IconLabelWidget cachedSceneWidgetPart009Local1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        IconLabelWidget stackSceneWidgetPart009Local7 = null;
        boolean stackBooleanLocal8 = false;
        IconLabelWidget stackSceneWidgetPart009Local9 = null;
        boolean stackBooleanLocal10 = false;
        int stackIntegerLocal11 = 0;
        int stackIntegerLocal12 = 0;
        int stackIntegerLocal13 = 0;
        IconLabelWidget stackSceneWidgetPart009Local14 = null;
        boolean stackBooleanLocal15 = false;
        boolean stackBooleanLocal16 = false;
        IconLabelWidget stackSceneWidgetPart009Local17 = null;
        int stackIntegerLocal18 = 0;
        int stackIntegerLocal19 = 0;
        int stackIntegerLocal20 = 0;
        boolean stackBooleanLocal21 = false;
        IconLabelWidget stackSceneWidgetPart009Local22 = null;
        boolean stackBooleanLocal23 = false;
        IconLabelWidget stackSceneWidgetPart009Local24 = null;
        boolean stackBooleanLocal25 = false;
        int stackIntegerLocal26 = 0;
        IconLabelWidget stackSceneWidgetPart009Local27 = null;
        boolean stackBooleanLocal28 = false;
        IconLabelWidget stackSceneWidgetPart009Local29 = null;
        boolean stackBooleanLocal30 = false;
        IconLabelWidget stackSceneWidgetPart009Local31 = null;
        boolean stackBooleanLocal32 = false;
        IconLabelWidget stackSceneWidgetPart009Local33 = null;
        boolean stackBooleanLocal34 = false;
        String stackStringLocal35 = null;
        IconLabelWidget stackSceneWidgetPart009Local36 = null;
        boolean stackBooleanLocal37 = false;
        IconLabelWidget stackSceneWidgetPart009Local38 = null;
        boolean stackBooleanLocal39 = false;
        int stackIntegerLocal40 = 0;
        int stackIntegerLocal41 = 0;
        int stackIntegerLocal42 = 0;
        IconLabelWidget stackSceneWidgetPart009Local43 = null;
        boolean stackBooleanLocal44 = false;
        boolean stackBooleanLocal45 = false;
        IconLabelWidget stackSceneWidgetPart009Local46 = null;
        int stackIntegerLocal47 = 0;
        int stackIntegerLocal48 = 0;
        int stackIntegerLocal49 = 0;
        boolean stackBooleanLocal50 = false;
        IconLabelWidget stackSceneWidgetPart009Local51 = null;
        boolean stackBooleanLocal52 = false;
        IconLabelWidget stackSceneWidgetPart009Local53 = null;
        boolean stackBooleanLocal54 = false;
        RuntimeException stackRuntimeExceptionLocal55 = null;
        StringBuilder stackStringBuilderLocal56 = null;
        String stackStringLocal57 = null;
        RuntimeException caughtExceptionLocal58 = null;
        int integerLocal59 = 0;
        RuntimeException runtimeExceptionLocal60 = null;
        int integerLocal61 = 0;
        int integerLocal62 = 0;
        int integerLocal63 = 0;
        int integerLocal64 = 0;
        String stringLocal65 = null;
        IconLabelWidget[] sceneWidgetPart009ArrayLocal66 = null;
        int integerLocal67 = 0;
        int integerLocal68 = 0;
        int integerLocal69 = 0;
        int integerLocal70 = 0;
        int integerLocal71 = 0;
        int integerLocal72 = 0;
        int integerLocal73 = 0;
        int integerLocal74 = 0;
        IconLabelWidget sceneWidgetPart009Local75 = null;
        int integerLocal76 = 0;
        Object objectLocal77 = null;
        Object objectLocal78 = null;
        Object objectLocal79 = null;
        Object objectLocal80 = null;
        Object objectLocal81 = null;
        int integerLocal82 = 0;
        int integerLocal83 = 0;
        Object objectLocal84 = null;
        String stringLocal85 = null;
        int integerLocal86 = 0;
        LobbyRoomRow sceneWidgetPart013Local87 = null;
        int integerLocal88 = 0;
        IconLabelWidget sceneWidgetPart009Local89 = null;
        IconLabelWidget sceneWidgetPart009Local90 = null;
        IconLabelWidget[] sceneWidgetPart009ArrayLocal91 = null;
        String stringLocal92 = null;
        String stringLocal93 = null;
        Object objectLocal94;
        String stringLocal95;
        Object objectLocal96;
        int integerLocal97;
        int integerLocal98;
        int integerLocal99;
        int integerLocal100;
        int integerLocal101;
        int integerLocal102;
        int integerLocal103;
        integerLocal86 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (booleanArgument2) {
            stackIntegerLocal5 = (MixedSupport040.booleanState0047) ? 0 : 1;
            integerLocal59 = stackIntegerLocal5;
          } else {
            if (SceneWidgetPart005.computeBoolean0716(true)) {
              stackIntegerLocal4 = (!sceneWidgetPart013Argument1.booleanState0204) ? 1 : 0;
            } else {
              stackIntegerLocal4 = 0;
            }
            integerLocal59 = stackIntegerLocal4;
          }
          boolean frameRemainderLocal104 = true;
          boolean frameRemainderLocal105 = true;
          integerLocal61 = 0;
          if (booleanArgument2) {
            frameRemainderLocal104 = !(2 > UiComponentPart002.integerArrayState0014.length);
            if (frameRemainderLocal104) {
              if (booleanArgument2) {
                stackIntegerLocal6 = (EditableTextField.integerState0720 != -1) ? 1 : 0;
              } else {
                stackIntegerLocal6 = 0;
              }
              integerLocal62 = stackIntegerLocal6;
              frameRemainderLocal105 = (integerLocal62 != 0);
              if (frameRemainderLocal105) {
                integerLocal63 = EditableTextField.integerState0720;
                for (integerLocal64 = 0; MixedSupport070.byteArrayState0011.length > integerLocal64; integerLocal64++) {
                  MixedSupport070.byteArrayState0011[integerLocal64] = (byte) 0;
                }
              }
            }
          } else {
            for (integerLocal62 = 0; integerLocal62 < 5; integerLocal62++) {
              if (integerLocal59 != 0 &&
                MixedSupport103.sceneWidgetPart009ArrayArrayState0001[0][integerLocal62 + 1].integerState0891 != 0 &&
                integerLocal62 != sceneWidgetPart013Argument1.integerState0842) {
                sceneWidgetPart013Argument1.integerState0842 = integerLocal62;
                integerLocal61 = 1;
              }
              stackSceneWidgetPart009Local7 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[0][1 + integerLocal62];
              stackBooleanLocal8 = (integerLocal59 != 0);
              stackSceneWidgetPart009Local7.booleanState0212 = stackBooleanLocal8;
              if (!MixedSupport097.booleanState0133 &&
                3 == integerLocal62) {
                MixedSupport103.sceneWidgetPart009ArrayArrayState0001[0][integerLocal62 + 1].booleanState0212 = false;
              }
              stackSceneWidgetPart009Local9 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[0][1 + integerLocal62];
              stackBooleanLocal10 = (sceneWidgetPart013Argument1.integerState0842 == integerLocal62);
              stackSceneWidgetPart009Local9.booleanState0217 = stackBooleanLocal10;
            }
            if (MixedSupport103.sceneWidgetPart009ArrayArrayState0001[0][2].booleanState0211) {
              if (!SceneWidgetPart005.computeBoolean0716(true)) {
                MixedSupport117.stringState0515 = NodeHashTableIterator.substituteIndexedPlaceholders(82, HashNode.stringState0050, new String[]{MixedSupport016.sceneWidgetPart013State0001.stringState0585});
              } else {
                MixedSupport117.stringState0515 = ComponentContainer.stringState0309;
              }
            }
            frameRemainderLocal104 = !(2 > UiComponentPart002.integerArrayState0014.length);
            if (frameRemainderLocal104) {
              if (booleanArgument2) {
                stackIntegerLocal11 = (EditableTextField.integerState0720 != -1) ? 1 : 0;
              } else {
                stackIntegerLocal11 = 0;
              }
              integerLocal62 = stackIntegerLocal11;
              frameRemainderLocal105 = (integerLocal62 != 0);
              if (frameRemainderLocal105) {
                integerLocal63 = EditableTextField.integerState0720;
                for (integerLocal64 = 0; MixedSupport070.byteArrayState0011.length > integerLocal64; integerLocal64++) {
                  MixedSupport070.byteArrayState0011[integerLocal64] = (byte) 0;
                }
              }
            }
          }
          if ((frameRemainderLocal104) &&
            (frameRemainderLocal105)) {
            MixedSupport070.byteArrayState0011[integerLocal63 / 8] = (byte)LabeledWidgetContainer.bitwiseOr((int) MixedSupport070.byteArrayState0011[integerLocal63 / 8], 1 << integerLocal63 % 8);
          }
          if (frameRemainderLocal104) {
            stackIntegerLocal12 = (!booleanArgument2) ? 0 : -1;
            for (integerLocal63 = stackIntegerLocal12; integerLocal63 < UiComponentPart002.integerArrayState0014.length; integerLocal63++) {
              if (integerLocal62 != 0) {
                stackIntegerLocal13 = (EditableTextField.integerState0720 != integerLocal63) ? 1 : 0;
              } else {
                stackIntegerLocal13 = 0;
              }
              integerLocal100 = stackIntegerLocal13;
              if (integerLocal59 != 0 &&
                MixedSupport103.sceneWidgetPart009ArrayArrayState0001[1][integerLocal63 + 1].integerState0891 != 0) {
                if (booleanArgument2) {
                  if (integerLocal62 == 0) {
                    if (integerLocal63 == -1) {
                      for (integerLocal67 = 0; integerLocal67 < MixedSupport070.byteArrayState0011.length; integerLocal67++) {
                        MixedSupport070.byteArrayState0011[integerLocal67] = (byte) 0;
                      }
                    } else {
                      MixedSupport070.byteArrayState0011[integerLocal63 / 8] = (byte)MixedSupport106.bitwiseXor((int) MixedSupport070.byteArrayState0011[integerLocal63 / 8], 1 << PlayerBoardUpdateQueue.bitwiseAnd(integerLocal63, 7));
                    }
                  }
                } else {
                  integerLocal67 = UiComponentPart002.integerArrayState0014[integerLocal63];
                  if (sceneWidgetPart013Argument1.integerState0840 != integerLocal67) {
                    integerLocal61 = 1;
                    sceneWidgetPart013Argument1.integerState0840 = integerLocal67;
                  }
                }
              }
              if (!booleanArgument2) {
                integerLocal67 = UiComponentPart002.integerArrayState0014[integerLocal63];
                stackSceneWidgetPart009Local22 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[1][1 + integerLocal63];
                stackBooleanLocal23 = (sceneWidgetPart013Argument1.integerState0840 == integerLocal67);
                stackSceneWidgetPart009Local22.booleanState0217 = stackBooleanLocal23;
              } else {
                if (integerLocal63 == -1) {
                  MixedSupport103.sceneWidgetPart009ArrayArrayState0001[1][1 + integerLocal63].booleanState0217 = true;
                  for (integerLocal67 = 0; UiComponentPart002.integerArrayState0014.length > integerLocal67; integerLocal67++) {
                    cachedSceneWidgetPart009Local1 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[1][integerLocal63 + 1];
                    stackSceneWidgetPart009Local14 = cachedSceneWidgetPart009Local1;
                    stackBooleanLocal15 = cachedSceneWidgetPart009Local1.booleanState0217;
                    stackBooleanLocal16 = (0 == (MixedSupport070.byteArrayState0011[integerLocal67 / 8] & 1 << (7 & integerLocal67)));
                    stackSceneWidgetPart009Local14.booleanState0217 = stackBooleanLocal15 & stackBooleanLocal16;
                  }
                } else {
                  stackSceneWidgetPart009Local17 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[1][1 + integerLocal63];
                  stackIntegerLocal18 = -1;
                  stackIntegerLocal19 = MixedSupport070.byteArrayState0011[integerLocal63 / 8] & 1 << (integerLocal63 & 7);
                  stackIntegerLocal20 = -1;
                  stackBooleanLocal21 = (stackIntegerLocal18 != (stackIntegerLocal19 ^ stackIntegerLocal20));
                  stackSceneWidgetPart009Local17.booleanState0217 = stackBooleanLocal21;
                }
              }
              stackSceneWidgetPart009Local24 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[1][1 + integerLocal63];
              stackBooleanLocal25 = (integerLocal59 != 0) && (integerLocal100 == 0);
              stackSceneWidgetPart009Local24.booleanState0212 = stackBooleanLocal25;
            }
          }
          if (byteArgument4 >= -121) {
            sceneWidgetPart013Local87 = (LobbyRoomRow) null;
            MixedSupport081.performAction1030((LobbyRoomRow) null, false, -56, (byte) 50);
          }
          stackIntegerLocal26 = (!booleanArgument2) ? 1 : 0;
          for (integerLocal97 = stackIntegerLocal26; integerLocal97 < 3; integerLocal97++) {
            sceneWidgetPart009Local89 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[2][integerLocal97];
            if (integerLocal59 != 0 &&
              sceneWidgetPart009Local89.integerState0891 != 0) {
              if (!booleanArgument2) {
                if (integerLocal97 != sceneWidgetPart013Argument1.integerState0845) {
                  integerLocal61 = 1;
                  sceneWidgetPart013Argument1.integerState0845 = integerLocal97;
                }
              } else {
                if (integerLocal97 != 0) {
                  DiagnosticSupport002.integerState0340 = DiagnosticSupport002.integerState0340 ^ integerLocal97;
                } else {
                  DiagnosticSupport002.integerState0340 = 0;
                }
              }
            }
            if (!booleanArgument2) {
              stackSceneWidgetPart009Local31 = sceneWidgetPart009Local89;
              stackBooleanLocal32 = ((integerLocal97 & sceneWidgetPart013Argument1.integerState0845) != 0);
              stackSceneWidgetPart009Local31.booleanState0217 = stackBooleanLocal32;
            } else {
              if (integerLocal97 == 0) {
                stackSceneWidgetPart009Local29 = sceneWidgetPart009Local89;
                stackBooleanLocal30 = (DiagnosticSupport002.integerState0340 == 0);
                stackSceneWidgetPart009Local29.booleanState0217 = stackBooleanLocal30;
              } else {
                stackSceneWidgetPart009Local27 = sceneWidgetPart009Local89;
                stackBooleanLocal28 = (0 != (integerLocal97 & DiagnosticSupport002.integerState0340));
                stackSceneWidgetPart009Local27.booleanState0217 = stackBooleanLocal28;
              }
            }
            stackSceneWidgetPart009Local33 = sceneWidgetPart009Local89;
            stackBooleanLocal34 = (integerLocal59 != 0);
            stackSceneWidgetPart009Local33.booleanState0212 = stackBooleanLocal34;
          }
          if (booleanArgument2 &&
            1 < SceneWidgetPart007.integerState0506) {
            for (integerLocal98 = 0; integerLocal98 < SceneWidgetPart007.integerState0506 + 1; integerLocal98++) {
              sceneWidgetPart009Local90 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[3][integerLocal98];
              if (integerLocal59 != 0 &&
                sceneWidgetPart009Local90.integerState0891 != 0) {
                MixedSupport103.integerState0595 = integerLocal98;
              }
              if (sceneWidgetPart009Local90.booleanState0211 &&
                0 < integerLocal98) {
                if (null == ThemeTips.stringArrayState0018) {
                  stackStringLocal35 = null;
                } else {
                  stackStringLocal35 = ThemeTips.stringArrayState0018[-1 + integerLocal98];
                }
                stringLocal65 = stackStringLocal35;
                if (stringLocal65 != null) {
                  MixedSupport117.stringState0515 = stringLocal65;
                }
              }
              stackSceneWidgetPart009Local36 = sceneWidgetPart009Local90;
              stackBooleanLocal37 = (MixedSupport103.integerState0595 == integerLocal98);
              stackSceneWidgetPart009Local36.booleanState0217 = stackBooleanLocal37;
              stackSceneWidgetPart009Local38 = sceneWidgetPart009Local90;
              stackBooleanLocal39 = (integerLocal59 != 0);
              stackSceneWidgetPart009Local38.booleanState0212 = stackBooleanLocal39;
            }
          }
          integerLocal99 = 0;
          for (integerLocal63 = 0; MixedSupport063.integerState0336 > integerLocal63; integerLocal63++) {
            sceneWidgetPart009ArrayLocal91 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[4 + integerLocal63];
            sceneWidgetPart009ArrayLocal66 = sceneWidgetPart009ArrayLocal91;
            stackIntegerLocal40 = (!booleanArgument2) ? 0 : -1;
            for (integerLocal67 = stackIntegerLocal40; integerLocal67 < -1 + sceneWidgetPart009ArrayLocal91.length; integerLocal67++) {
              integerLocal68 = 0;
              integerLocal69 = 0;
              integerLocal70 = 0;
              integerLocal71 = 0;
              integerLocal72 = 0;
              integerLocal73 = 0;
              if (integerLocal59 != 0 &&
                0 <= integerLocal67) {
                if (MixedSupport004.integerArrayArrayState0003 != null &&
                  null != MixedSupport004.integerArrayArrayState0003[integerLocal63] &&
                  0 < (MixedSupport004.integerArrayArrayState0003[integerLocal63][integerLocal67] & ~MixedSupport127.integerState0793)) {
                  integerLocal73 = SceneWidgetPart014.computeInteger1784((byte) -93, ~MixedSupport127.integerState0793 & MixedSupport004.integerArrayArrayState0003[integerLocal63][integerLocal67]);
                  integerLocal72 = 1;
                }
                if (null != MixedSupport014.booleanArrayArrayState0001 &&
                  null != MixedSupport014.booleanArrayArrayState0001[integerLocal63] &&
                  0 >= Framebuffer.integerState0192 &&
                  MixedSupport014.booleanArrayArrayState0001[integerLocal63][integerLocal67]) {
                  integerLocal68 = 1;
                }
                if (SceneWidgetPart007.integerArrayArrayState0017 != null &&
                  SceneWidgetPart007.integerArrayArrayState0017[integerLocal63] != null) {
                  integerLocal74 = SceneWidgetPart007.integerArrayArrayState0017[integerLocal63][integerLocal67];
                  if (integerLocal74 > 0 &&
                    integerLocal74 > LabeledWidgetContainer.integerState0137) {
                    integerLocal70 = 1;
                  }
                  if (integerLocal74 != 0 &&
                    !MixedSupport127.booleanState0191 &&
                    Framebuffer.integerState0192 <= 0) {
                    integerLocal68 = 1;
                  }
                }
                if (null != MixedSupport062.integerArrayArrayState0012 &&
                  MixedSupport062.integerArrayArrayState0012[integerLocal63] != null) {
                  integerLocal103 = MixedSupport062.integerArrayArrayState0012[integerLocal63][integerLocal67];
                  if (0 != integerLocal103 &&
                    !MixedSupport127.booleanState0191 &&
                    0 >= Framebuffer.integerState0192) {
                    integerLocal68 = 1;
                  }
                  if (integerLocal103 > 0 &&
                    integerLocal103 > ReturnedShape.integerState0693) {
                    integerLocal69 = 1;
                  }
                }
                if (booleanArgument2) {
                  if (null != Framebuffer.booleanArrayArrayState0002) {
                    if (Framebuffer.booleanArrayArrayState0002[integerLocal63] != null) {
                      stackIntegerLocal41 = (Framebuffer.booleanArrayArrayState0002[integerLocal63][integerLocal67]) ? 1 : 0;
                    } else {
                      stackIntegerLocal41 = 0;
                    }
                  } else {
                    stackIntegerLocal41 = 0;
                  }
                } else {
                  stackIntegerLocal41 = 0;
                }
                integerLocal71 = stackIntegerLocal41;
              }
              if (PasswordValidator.integerState0776 >= 2 &&
                MixedSupport011.booleanArrayState0002[12]) {
                integerLocal71 = 0;
                integerLocal69 = 0;
                integerLocal70 = 0;
                integerLocal72 = 0;
                integerLocal68 = 0;
              }
              if (integerLocal68 == 0 &&
                integerLocal69 == 0 &&
                integerLocal70 == 0 &&
                integerLocal71 == 0 &&
                integerLocal72 == 0) {
                stackIntegerLocal42 = 0;
              } else {
                stackIntegerLocal42 = 1;
              }
              integerLocal101 = stackIntegerLocal42;
              LobbyRoomRow.booleanState0207 = true;
              if (integerLocal101 == 0 &&
                integerLocal67 >= 0 &&
                MixedSupport009.integerArrayArrayState0004 != null && (!booleanArgument2 ||
                !MixedSupport040.booleanState0047)) {
                if (null == SceneWidgetNode.byteArrayState0012) {
                  MixedSupport108.booleanArrayState0009 = new boolean[MixedSupport063.integerState0336];
                  SceneWidgetNode.byteArrayState0012 = new byte[MixedSupport063.integerState0336];
                }
                MixedSupport046.booleanState0052 = false;
                LobbyRoomRow.booleanState0207 = false;
                for (integerLocal2 = 0; integerLocal63 > integerLocal2; integerLocal2++) {
                  MixedSupport108.booleanArrayState0009[integerLocal2] = false;
                }
                MixedSupport127.performAction1629(-1, booleanArgument2, -1, 0, integerLocal67, integerLocal63, sceneWidgetPart013Argument1, false);
                if (2 <= PasswordValidator.integerState0776 &&
                  MixedSupport011.booleanArrayState0002[12]) {
                  LobbyRoomRow.booleanState0207 = true;
                }
                if (!LobbyRoomRow.booleanState0207) {
                  integerLocal101 = 1;
                }
              }
              sceneWidgetPart009Local75 = sceneWidgetPart009ArrayLocal66[1 + integerLocal67];
              if (integerLocal59 != 0 &&
                sceneWidgetPart009Local75.integerState0891 != 0) {
                if (!booleanArgument2) {
                  if (integerLocal101 == 0 &&
                    (byte)integerLocal67 != sceneWidgetPart013Argument1.byteArrayState0032[integerLocal63]) {
                    sceneWidgetPart013Argument1.byteArrayState0032[integerLocal63] = (byte)integerLocal67;
                    integerLocal61 = 1;
                  }
                } else {
                  if (integerLocal67 == -1) {
                    for (integerLocal76 = integerLocal99; integerLocal76 < sceneWidgetPart009ArrayLocal91.length + integerLocal99 - 1; integerLocal76++) {
                      MixedSupport134.byteArrayState0029[integerLocal76 / 8] = (byte)PlayerBoardUpdateQueue.bitwiseAnd((int) MixedSupport134.byteArrayState0029[integerLocal76 / 8], ~(1 << PlayerBoardUpdateQueue.bitwiseAnd(integerLocal76, 7)));
                    }
                  } else {
                    MixedSupport134.byteArrayState0029[(integerLocal99 + integerLocal67) / 8] = (byte)MixedSupport106.bitwiseXor((int) MixedSupport134.byteArrayState0029[(integerLocal99 + integerLocal67) / 8], 1 << PlayerBoardUpdateQueue.bitwiseAnd(integerLocal67 + integerLocal99, 7));
                  }
                }
              }
              if (booleanArgument2 &&
                integerLocal101 != 0) {
                MixedSupport134.byteArrayState0029[(integerLocal99 + integerLocal67) / 8] = (byte)PlayerBoardUpdateQueue.bitwiseAnd((int) MixedSupport134.byteArrayState0029[(integerLocal99 + integerLocal67) / 8], ~(1 << PlayerBoardUpdateQueue.bitwiseAnd(integerLocal67 + integerLocal99, 7)));
              }
              if (integerLocal67 >= 0 &&
                sceneWidgetPart009Local75.booleanState0211) {
                if (NetworkSupport004.stringArrayArrayState0002 != null) {
                  if (NetworkSupport004.stringArrayArrayState0002[integerLocal63] != null) {
                    objectLocal77 = NetworkSupport004.stringArrayArrayState0002[integerLocal63][integerLocal67];
                  } else {
                    objectLocal77 = null;
                  }
                } else {
                  objectLocal77 = null;
                }
                if (PlayerNamePrompt.stringArrayArrayState0003 == null) {
                  objectLocal78 = null;
                } else {
                  if (null == PlayerNamePrompt.stringArrayArrayState0003[integerLocal63]) {
                    objectLocal78 = null;
                  } else {
                    objectLocal78 = PlayerNamePrompt.stringArrayArrayState0003[integerLocal63][integerLocal67];
                  }
                }
                objectLocal79 = null;
                if (objectLocal78 != null &&
                  !((String) (objectLocal78)).equals(objectLocal77)) {
                  objectLocal79 = objectLocal78;
                }
                objectLocal80 = null;
                if (integerLocal71 != 0) {
                  objectLocal80 = MixedSupport046.stringState0198;
                  objectLocal81 = objectLocal80;
                  objectLocal84 = objectLocal81;
                  objectLocal81 = objectLocal84;
                  objectLocal80 = objectLocal81;
                  objectLocal84 = objectLocal80;
                  objectLocal81 = objectLocal84;
                  objectLocal84 = objectLocal81;
                  objectLocal81 = objectLocal84;
                  objectLocal80 = objectLocal81;
                  objectLocal81 = objectLocal84;
                } else {
                  if (integerLocal68 != 0) {
                    objectLocal80 = NetworkArchiveRequest.stringState0428;
                  } else {
                    if (integerLocal69 != 0) {
                      integerLocal82 = -ReturnedShape.integerState0693 + MixedSupport062.integerArrayArrayState0012[integerLocal63][integerLocal67];
                      if (integerLocal82 != 1) {
                        objectLocal80 = NodeHashTableIterator.substituteIndexedPlaceholders(81, MixedSupport028.stringState0138, new String[]{Integer.toString(integerLocal82)});
                      } else {
                        objectLocal80 = SoundCache.stringState0432;
                      }
                    }
                    if (integerLocal70 != 0) {
                      stringLocal92 = NodeHashTableIterator.substituteIndexedPlaceholders(110, PacketBuffer.stringState0632, new String[]{Integer.toString(LabeledWidgetContainer.integerState0137), Integer.toString(SceneWidgetPart007.integerArrayArrayState0017[integerLocal63][integerLocal67])});
                      objectLocal81 = stringLocal92;
                      objectLocal84 = objectLocal81;
                      objectLocal81 = objectLocal84;
                      objectLocal80 = objectLocal81;
                      stringLocal85 = stringLocal92;
                      objectLocal81 = stringLocal85;
                      if (objectLocal80 != null) {
                        objectLocal80 = (String) (objectLocal80) + "<br>" + stringLocal92;
                      } else {
                        objectLocal80 = stringLocal92;
                      }
                    }
                    if (integerLocal72 != 0) {
                      objectLocal81 = SceneWidgetPart005.stringState0253;
                      if (0 < integerLocal73 &&
                        Sprite.stringArrayArrayState0005 != null &&
                        integerLocal73 <= Sprite.stringArrayArrayState0005.length &&
                        Sprite.stringArrayArrayState0005[integerLocal73 - 1] != null) {
                        objectLocal81 = Sprite.stringArrayArrayState0005[integerLocal73 - 1][0];
                      }
                      if (objectLocal80 != null) {
                        objectLocal80 = (String) (objectLocal80) + "<br>" + (String) (objectLocal81);
                      } else {
                        objectLocal80 = objectLocal81;
                      }
                    }
                  }
                }
                if (integerLocal59 != 0 &&
                  !LobbyRoomRow.booleanState0207) {
                  objectLocal81 = null;
                  integerLocal83 = 0;
                  if (MixedSupport046.booleanState0052) {
                    objectLocal81 = "</col>" + PlayerNamePrompt.stringState0215 + "<col=A00000>";
                    objectLocal94 = objectLocal81;
                    objectLocal81 = objectLocal94;
                    objectLocal96 = objectLocal81;
                    objectLocal81 = objectLocal96;
                    objectLocal80 = objectLocal81;
                  }
                  for (integerLocal3 = 0; integerLocal63 > integerLocal3; integerLocal3++) {
                    if (MixedSupport108.booleanArrayState0009[integerLocal3]) {
                      stringLocal95 = "</col>" + AccountFieldStatusIndicator.stringArrayState0026[integerLocal3] + "<col=A00000>";
                      objectLocal81 = stringLocal95;
                      objectLocal80 = objectLocal81;
                      objectLocal81 = stringLocal95;
                      if (objectLocal81 != null) {
                        objectLocal81 = (String) (objectLocal81) + ", " + stringLocal95;
                        objectLocal80 = objectLocal81;
                        objectLocal80 = objectLocal81;
                        integerLocal83 = 1;
                      } else {
                        objectLocal81 = stringLocal95;
                      }
                    }
                  }
                  if (integerLocal83 == 0) {
                    objectLocal80 = NodeHashTableIterator.substituteIndexedPlaceholders(115, UiComponentPart001.stringState0022, new String[]{(String) (objectLocal81)});
                  } else {
                    objectLocal80 = ConfirmedEmailAvailabilityValidator.stringState0535 + (String) (objectLocal81);
                  }
                }
                if (objectLocal80 != null) {
                  objectLocal80 = "<col=A00000>" + (String) (objectLocal80);
                  stringLocal93 = MixedSupport063.computeString0755("<br>", (String) (objectLocal80), "<br><col=A00000>", 0);
                  if (objectLocal79 != null) {
                    objectLocal79 = (String) (objectLocal79) + "<br>" + stringLocal93;
                  } else {
                    objectLocal79 = stringLocal93;
                  }
                }
                if (objectLocal79 != null) {
                  MixedSupport117.stringState0515 = (String) (objectLocal79);
                }
              }
              if (!booleanArgument2) {
                stackSceneWidgetPart009Local51 = sceneWidgetPart009Local75;
                stackBooleanLocal52 = (LobbyRoomRow.booleanState0207) && ((byte)integerLocal67 == sceneWidgetPart013Argument1.byteArrayState0032[integerLocal63]);
                stackSceneWidgetPart009Local51.booleanState0217 = stackBooleanLocal52;
              } else {
                if (integerLocal67 == -1) {
                  sceneWidgetPart009Local75.booleanState0217 = true;
                  integerLocal88 = integerLocal99;
                  integerLocal102 = integerLocal88;
                  while (integerLocal88 < -1 + (sceneWidgetPart009ArrayLocal91.length + integerLocal99)) {
                    stackSceneWidgetPart009Local43 = sceneWidgetPart009Local75;
                    stackBooleanLocal44 = sceneWidgetPart009Local75.booleanState0217;
                    stackBooleanLocal45 = (0 == (MixedSupport134.byteArrayState0029[integerLocal88 / 8] & 1 << (integerLocal88 & 7)));
                    stackSceneWidgetPart009Local43.booleanState0217 = stackBooleanLocal44 & stackBooleanLocal45;
                    integerLocal88++;
                  }
                } else {
                  stackSceneWidgetPart009Local46 = sceneWidgetPart009Local75;
                  stackIntegerLocal47 = -1;
                  stackIntegerLocal48 = MixedSupport134.byteArrayState0029[(integerLocal67 + integerLocal99) / 8] & 1 << (integerLocal99 + integerLocal67 & 7);
                  stackIntegerLocal49 = -1;
                  stackBooleanLocal50 = (stackIntegerLocal47 != (stackIntegerLocal48 ^ stackIntegerLocal49));
                  stackSceneWidgetPart009Local46.booleanState0217 = stackBooleanLocal50;
                }
              }
              stackSceneWidgetPart009Local53 = sceneWidgetPart009Local75;
              stackBooleanLocal54 = (integerLocal59 != 0) && (integerLocal101 == 0);
              stackSceneWidgetPart009Local53.booleanState0212 = stackBooleanLocal54;
            }
            integerLocal99 = integerLocal99 + (255 & MixedSupport107.byteArrayState0026[integerLocal63]);
          }
          if (integerLocal61 != 0 &&
            !booleanArgument2) {
            MixedSupport103.performAction1283(integerArgument3, 1850462342);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal106) {
          caughtExceptionLocal58 = caughtParameterLocal106;
          runtimeExceptionLocal60 = caughtExceptionLocal58;
          stackRuntimeExceptionLocal55 = runtimeExceptionLocal60;
          stackStringBuilderLocal56 = new StringBuilder().append("mc.C(");
          if (sceneWidgetPart013Argument1 == null) {
            stackStringLocal57 = "null";
          } else {
            stackStringLocal57 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal55), ((StringBuilder) (Object) stackStringBuilderLocal56).append(stackStringLocal57).append(',').append(booleanArgument2).append(',').append(integerArgument3).append(',').append(byteArgument4).append(')').toString());
        }
    }

    final static boolean computeBoolean1029(String stringArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        LobbyRoomRow sceneWidgetPart013Local5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = stringArgument1.charAt(0);
          integerLocal3 = 1;
          if (byteArgument2 >= -99) {
            sceneWidgetPart013Local5 = (LobbyRoomRow) null;
            MixedSupport081.performAction1030((LobbyRoomRow) null, false, -98, (byte) -9);
          }
          while (true) {
            if (stringArgument1.length() <= integerLocal3) {
              return true;
            }
            if (stringArgument1.charAt(integerLocal3) == integerLocal1) {
              integerLocal3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("mc.A(");
          if (stringArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(byteArgument2).append(')').toString());
        }
    }

    static {
        integerArrayState0153 = new int[]{2053254, 7976409, 15906096, 11781092, 41672};
        integerState0501 = 5;
        stringState0341 = "Off";
        stringState0342 = "Start Game";
    }
}
