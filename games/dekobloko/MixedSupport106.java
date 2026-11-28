/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport106 {
    static MixedSupport106 mixedSupport106State0008;
    static SceneWidget sceneWidgetState0102;
    static String stringState0456;
    int integerState0671;
    static RgbSprite rgbSpriteState0047;
    int integerState0672;
    static String stringState0457;

    final static void performAction1386(boolean booleanArgument1, int integerArgument2, boolean booleanArgument3, byte byteArgument4) {
        SceneWidget stackSceneWidgetLocal1 = null;
        boolean stackBooleanLocal2 = false;
        boolean stackBooleanLocal3 = false;
        SceneWidget stackSceneWidgetLocal4 = null;
        boolean stackBooleanLocal5 = false;
        boolean stackBooleanLocal6 = false;
        SceneWidget stackSceneWidgetLocal7 = null;
        boolean stackBooleanLocal8 = false;
        boolean stackBooleanLocal9 = false;
        SceneWidget stackSceneWidgetLocal10 = null;
        boolean stackBooleanLocal11 = false;
        boolean stackBooleanLocal12 = false;
        SceneWidget stackSceneWidgetLocal13 = null;
        boolean stackBooleanLocal14 = false;
        boolean stackBooleanLocal15 = false;
        SceneWidget stackSceneWidgetLocal16 = null;
        boolean stackBooleanLocal17 = false;
        boolean stackBooleanLocal18 = false;
        int integerLocal19;
        integerLocal19 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        AccountFieldStatusIndicator.performAction1206((byte) 104);
        if (LabeledWidgetContainer.integerState0137 < 0) {
          DirectByteStorage.sceneWidgetState0034.stringState0598 = null;
          stackSceneWidgetLocal10 = UiComponentPart011.sceneWidgetState0035;
          stackBooleanLocal11 = false;
          stackBooleanLocal12 = (booleanArgument1) && (!booleanArgument3) && (!LobbyRoomRow.booleanState0202) && (null == MixedSupport016.sceneWidgetPart013State0001) && (UiComponentPart011.sceneWidgetPart013State0002 == null);
          ((SceneWidget) (Object) stackSceneWidgetLocal10).performAction1772(stackBooleanLocal11, stackBooleanLocal12);
          stackSceneWidgetLocal13 = TextFieldValidator.sceneWidgetState0151;
          stackBooleanLocal14 = false;
          stackBooleanLocal15 = (booleanArgument1) && (!booleanArgument3) && (!LobbyRoomRow.booleanState0202) && (MixedSupport016.sceneWidgetPart013State0001 == null) && (null == UiComponentPart011.sceneWidgetPart013State0002);
          ((SceneWidget) (Object) stackSceneWidgetLocal13).performAction1772(stackBooleanLocal14, stackBooleanLocal15);
          stackSceneWidgetLocal16 = SceneWidgetPart011.sceneWidgetState0115;
          stackBooleanLocal17 = false;
          stackBooleanLocal18 = (booleanArgument1) && (!booleanArgument3) && (LobbyRoomRow.booleanState0202);
          ((SceneWidget) (Object) stackSceneWidgetLocal16).performAction1772(stackBooleanLocal17, stackBooleanLocal18);
          MixedSupport023.mixedSupport006State0001.sceneWidgetPart011State0001.performAction1574(false);
          if (IterableNodeCollection.sceneWidgetState0126.integerState0891 != 0) {
            BufferedFile.booleanState0120 = true;
          }
          if (byteArgument4 != -8) {
            return;
          }
          if (0 != MixedSupport088.sceneWidgetState0092.integerState0891) {
            if (MixedSupport127.booleanState0191) {
              RenderingSupport001.performAction0138(-20861, integerArgument2);
            } else {
              if (0 < Framebuffer.integerState0192) {
                RenderingSupport001.performAction0138(-20861, integerArgument2);
              } else {
                if (2 <= PasswordValidator.integerState0776 &&
                  MixedSupport011.booleanArrayState0002[12]) {
                  RenderingSupport001.performAction0138(-20861, integerArgument2);
                } else {
                  MixedSupport118.booleanState0181 = true;
                }
              }
            }
          }
        } else {
          DirectByteStorage.sceneWidgetState0034.stringState0598 = NodeHashTableIterator.substituteIndexedPlaceholders(94, RenderingSupport007.stringState0306, new String[]{Integer.toString(LabeledWidgetContainer.integerState0137)});
          stackSceneWidgetLocal1 = UiComponentPart011.sceneWidgetState0035;
          stackBooleanLocal2 = false;
          stackBooleanLocal3 = (booleanArgument1) && (!booleanArgument3) && (!LobbyRoomRow.booleanState0202) && (null == MixedSupport016.sceneWidgetPart013State0001) && (UiComponentPart011.sceneWidgetPart013State0002 == null);
          ((SceneWidget) (Object) stackSceneWidgetLocal1).performAction1772(stackBooleanLocal2, stackBooleanLocal3);
          stackSceneWidgetLocal4 = TextFieldValidator.sceneWidgetState0151;
          stackBooleanLocal5 = false;
          stackBooleanLocal6 = (booleanArgument1) && (!booleanArgument3) && (!LobbyRoomRow.booleanState0202) && (MixedSupport016.sceneWidgetPart013State0001 == null) && (null == UiComponentPart011.sceneWidgetPart013State0002);
          ((SceneWidget) (Object) stackSceneWidgetLocal4).performAction1772(stackBooleanLocal5, stackBooleanLocal6);
          stackSceneWidgetLocal7 = SceneWidgetPart011.sceneWidgetState0115;
          stackBooleanLocal8 = false;
          stackBooleanLocal9 = (booleanArgument1) && (!booleanArgument3) && (LobbyRoomRow.booleanState0202);
          ((SceneWidget) (Object) stackSceneWidgetLocal7).performAction1772(stackBooleanLocal8, stackBooleanLocal9);
          MixedSupport023.mixedSupport006State0001.sceneWidgetPart011State0001.performAction1574(false);
          if (IterableNodeCollection.sceneWidgetState0126.integerState0891 != 0) {
            BufferedFile.booleanState0120 = true;
          }
          if (byteArgument4 != -8) {
            return;
          }
          if (0 != MixedSupport088.sceneWidgetState0092.integerState0891) {
            if (MixedSupport127.booleanState0191) {
              RenderingSupport001.performAction0138(-20861, integerArgument2);
            } else {
              if (0 < Framebuffer.integerState0192) {
                RenderingSupport001.performAction0138(-20861, integerArgument2);
              } else {
                if (2 <= PasswordValidator.integerState0776) {
                  if (MixedSupport011.booleanArrayState0002[12]) {
                    RenderingSupport001.performAction0138(-20861, integerArgument2);
                  } else {
                    MixedSupport118.booleanState0181 = true;
                  }
                } else {
                  MixedSupport118.booleanState0181 = true;
                }
              }
            }
          }
        }
        if (0 != DraggableWidgetContainer.sceneWidgetState0109.integerState0891) {
          if (1 == UiComponentPart002.integerArrayState0014.length &&
            MixedSupport053.integerState0272 != UiComponentPart002.integerArrayState0014[0]) {
            MixedSupport053.integerState0272 = UiComponentPart002.integerArrayState0014[0];
          }
          ResourceSupport001.performAction0047(Js5ArchiveManager.byteArrayState0017, integerArgument2, true, MixedSupport053.integerState0272, 0, true);
        }
        if (UiComponent.sceneWidgetState0009.integerState0891 != 0) {
          LobbyRoomRow.booleanState0202 = false;
        }
    }

    public static void clearStaticReferences(int integerArgument1) {
        stringState0456 = null;
        if (integerArgument1 != 2) {
          return;
        }
        sceneWidgetState0102 = null;
        mixedSupport106State0008 = null;
        rgbSpriteState0047 = null;
        stringState0457 = null;
    }

    final static int computeInteger1383(byte byteArgument1) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        int stackIntegerLocal8 = 0;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          MixedSupport005.uiComponentPart016State0001.processPointerInput(ResourceSupport003.integerState0554, true, ComponentContainer.integerState0379, 29166);
          MixedSupport005.uiComponentPart016State0001.advanceDialogs(0);
          while (DualNodeDeque.computeBoolean0027(-128)) {
            MixedSupport005.uiComponentPart016State0001.processKeyInput(MixedSupport146.integerState0931, ArchiveRequestManager.characterState0002, (byte) 123);
          }
          if (UiComponentPart001.integerState0034 != -1) {
            integerLocal1 = UiComponentPart001.integerState0034;
            MouseWheelInput.performAction0670(-1, (byte) -120);
            stackIntegerLocal4 = integerLocal1;
            return stackIntegerLocal4;
          }
          if (SceneWidgetPart007.booleanState0113) {
            stackIntegerLocal5 = 3;
            return stackIntegerLocal5;
          }
          if (ModalDialogHost.mixedSupport004State0001 == AccountFieldStatusIndicator.mixedSupport004State0003) {
            stackIntegerLocal6 = 1;
            return stackIntegerLocal6;
          }
          if (!ThemeTips.mixedSupport119State0001.computeBoolean1561(102)) {
            stackIntegerLocal7 = 1;
            return stackIntegerLocal7;
          }
          if (byteArgument1 != 57) {
            MixedSupport106.computeInteger1383((byte) -99);
          }
          if (AccountFieldStatusIndicator.mixedSupport004State0003 != GameAssets.mixedSupport004State0004) {
            return -1;
          }
          stackIntegerLocal8 = 2;
          return stackIntegerLocal8;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal2), "qm.C(" + byteArgument1 + ')');
        }
    }

    static int computeInteger1387(int integerArgument1, int integerArgument2) {
        return integerArgument1 ^ integerArgument2;
    }

    final static RgbSprite[] computeRgbSpriteArray1384(int integerArgument1, int integerArgument2) {
        RgbSprite[] rgbSpriteArrayLocal1 = new RgbSprite[integerArgument1];
        RgbSprite[] rgbSpriteArrayLocal2 = rgbSpriteArrayLocal1;
        rgbSpriteArrayLocal1[4] = NetworkSupport012.computeRgbSprite1532((byte) -126, 64, integerArgument2);
        return rgbSpriteArrayLocal2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void performAction1385(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        MixedSupport053.integerState0271 = integerArgument3;
        int integerLocal1 = 22 % ((-8 - integerArgument2) / 37);
        FrameTimer.integerState0320 = integerArgument4;
        MixedSupport057.integerState0296 = integerArgument1;
    }

    MixedSupport106(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        this.integerState0671 = integerArgument1;
        this.integerState0672 = integerArgument4;
    }

    static {
        stringState0457 = "Public";
        mixedSupport106State0008 = new MixedSupport106(13, 0, 1, 0);
    }
}
