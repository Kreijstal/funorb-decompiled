/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport020 extends HashNode {
    static SceneWidget sceneWidgetState0012;
    static RenderingSupport008 renderingSupport008State0003;
    int integerState0115;
    int integerState0116;
    int integerState0117;
    int[][] integerArrayArrayState0005;
    static SceneWidget sceneWidgetState0013;
    int integerState0118;
    String[][] stringArrayArrayState0001;
    boolean booleanState0022;
    static UiComponentPart012 uiComponentPart012State0001;
    static String stringState0094;
    static PlatformSupport006 platformSupport006State0001;
    int integerState0119;
    static ResourceArchive resourceArchiveState0003;
    int integerState0120;

    final static void performAction0318(int integerArgument1, int integerArgument2, int integerArgument3, SceneWidgetPart008 sceneWidgetPart008Argument4, boolean booleanArgument5) {
        int integerLocal1 = 0;
        SceneWidgetPart008 stackSceneWidgetPart008Local2;
        int stackIntegerLocal3;
        int stackIntegerLocal4;
        int stackIntegerLocal5;
        boolean stackBooleanLocal6 = false;
        int stackIntegerLocal7 = 0;
        int stackIntegerLocal8 = 0;
        SceneWidget stackSceneWidgetLocal9 = null;
        int stackIntegerLocal10 = 0;
        int stackIntegerLocal11 = 0;
        RuntimeException stackRuntimeExceptionLocal12 = null;
        StringBuilder stackStringBuilderLocal13 = null;
        String stackStringLocal14 = null;
        RuntimeException caughtExceptionLocal15 = null;
        int integerLocal16 = 0;
        RuntimeException runtimeExceptionLocal17 = null;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        NodeDeque nodeDequeLocal23 = null;
        int integerLocal24 = 0;
        Object objectLocal25 = null;
        SceneWidgetPart012 sceneWidgetPart012Local26 = null;
        int integerLocal27 = 0;
        SceneWidget sceneWidgetLocal28 = null;
        SceneWidget sceneWidgetLocal29 = null;
        SceneWidget sceneWidgetLocal30 = null;
        SceneWidget sceneWidgetLocal31 = null;
        SceneWidget sceneWidgetLocal32 = null;
        int integerLocal33 = 0;
        String stringLocal34 = null;
        int integerLocal35 = 0;
        int integerLocal36 = 0;
        int integerLocal37 = 0;
        String stringLocal38 = null;
        int integerLocal39 = 0;
        Object objectLocal40 = null;
        int integerLocal41 = 0;
        Object objectLocal42 = null;
        int integerLocal43 = 0;
        String stringLocal44 = null;
        int integerLocal45 = 0;
        int integerLocal46 = 0;
        String stringLocal47 = null;
        int integerLocal48 = 0;
        int integerLocal49 = 0;
        MixedSupport056 mixedSupport056Local50 = null;
        String stringLocal51 = null;
        String stringLocal52 = null;
        String stringLocal53 = null;
        Object objectLocal54;
        Object objectLocal55;
        String stringLocal56;
        String stringLocal57;
        int integerLocal58;
        int integerLocal59;
        int integerLocal60;
        int integerLocal61;
        int integerLocal62;
        int integerLocal63;
        integerLocal49 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal16 = 0;
          integerLocal18 = 0;
          if (integerArgument2 != -17339) {
            mixedSupport056Local50 = (MixedSupport056) null;
            MixedSupport020.performAction0319((MixedSupport056) null, true);
          }
          integerLocal19 = 0;
          integerLocal20 = 0;
          if (MixedSupport016.sceneWidgetPart013State0001 != null && (MixedSupport014.booleanArrayArrayState0001 != null ||
            SceneWidgetPart007.integerArrayArrayState0017 != null ||
            MixedSupport063.integerArrayArrayState0012 != null ||
            null != MixedSupport004.integerArrayArrayState0003)) {
            for (integerLocal21 = 0; MixedSupport064.integerState0336 > integerLocal21; integerLocal21++) {
              integerLocal22 = 255 & MixedSupport016.sceneWidgetPart013State0001.byteArrayState0032[integerLocal21];
              if (MixedSupport014.booleanArrayArrayState0001 != null &&
                MixedSupport014.booleanArrayArrayState0001[integerLocal21] != null &&
                MixedSupport014.booleanArrayArrayState0001[integerLocal21][integerLocal22]) {
                integerLocal16 = 1;
              }
              if (SceneWidgetPart007.integerArrayArrayState0017 != null &&
                null != SceneWidgetPart007.integerArrayArrayState0017[integerLocal21]) {
                integerLocal24 = SceneWidgetPart007.integerArrayArrayState0017[integerLocal21][integerLocal22];
                if (integerLocal24 != 0 &&
                  !MixedSupport134.booleanState0191) {
                  integerLocal16 = 1;
                }
                if (integerLocal24 > integerLocal18) {
                  integerLocal18 = integerLocal24;
                }
              }
              if (MixedSupport004.integerArrayArrayState0003 != null &&
                null != MixedSupport004.integerArrayArrayState0003[integerLocal21]) {
                integerLocal20 = integerLocal20 | MixedSupport004.integerArrayArrayState0003[integerLocal21][integerLocal22];
              }
              if (MixedSupport063.integerArrayArrayState0012 != null &&
                null != MixedSupport063.integerArrayArrayState0012[integerLocal21]) {
                integerLocal59 = MixedSupport063.integerArrayArrayState0012[integerLocal21][integerLocal22];
                if (integerLocal19 < integerLocal59) {
                  integerLocal19 = integerLocal59;
                }
                if (integerLocal59 != 0 &&
                  !MixedSupport134.booleanState0191) {
                  integerLocal16 = 1;
                }
              }
            }
          }
          stackSceneWidgetPart008Local2 = (SceneWidgetPart008) (sceneWidgetPart008Argument4);
          stackIntegerLocal3 = ComponentContainer.integerState0377 * 2 + 4;
          stackIntegerLocal4 = integerArgument1 * (8 + ComponentContainer.integerState0377 * 4);
          stackIntegerLocal5 = integerArgument2 + 2109;
          stackBooleanLocal6 = (sceneWidgetPart008Argument4 == NetworkSupport005.sceneWidgetPart008State0004);
          stackIntegerLocal7 = (!((SceneWidgetPart008) (Object) stackSceneWidgetPart008Local2).computeBoolean1291(stackIntegerLocal3, stackIntegerLocal4, stackIntegerLocal5, stackBooleanLocal6, 2, booleanArgument5)) ? 0 : 1;
          integerLocal58 = stackIntegerLocal7;
          nodeDequeLocal23 = sceneWidgetPart008Argument4.sceneWidgetState0090.nodeDequeState0034;
          objectLocal25 = null;
          sceneWidgetPart012Local26 = (SceneWidgetPart012) (nodeDequeLocal23.computeHashNode1970((byte) 25));
          while (sceneWidgetPart012Local26 != null) {
            integerLocal27 = 0;
            if (sceneWidgetPart012Local26.nodeDequeState0034 == null) {
              sceneWidgetPart012Local26.sceneWidgetState0122 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
              sceneWidgetPart012Local26.performAction1998(sceneWidgetPart012Local26.sceneWidgetState0122, -16834);
              sceneWidgetPart012Local26.sceneWidgetState0121 = new SceneWidget(0L, MixedSupport036.sceneWidgetState0027);
              if (MixedSupport102.booleanState0133) {
                sceneWidgetPart012Local26.performAction1998(sceneWidgetPart012Local26.sceneWidgetState0121, -16834);
              }
              sceneWidgetPart012Local26.sceneWidgetState0121.integerState0916 = 2;
              sceneWidgetPart012Local26.sceneWidgetState0123 = new SceneWidget(0L, MixedSupport132.sceneWidgetState0125);
              sceneWidgetPart012Local26.performAction1998(sceneWidgetPart012Local26.sceneWidgetState0123, -16834);
              sceneWidgetPart012Local26.performAction2004(-117);
              sceneWidgetPart012Local26.sceneWidgetState0124 = new SceneWidget(0L, MixedSupport082.sceneWidgetState0076);
              sceneWidgetPart012Local26.performAction1998(sceneWidgetPart012Local26.sceneWidgetState0124, integerArgument2 + 505);
              sceneWidgetPart012Local26.sceneWidgetState0120 = new SceneWidget(0L, UiComponentPart012.sceneWidgetState0042);
              sceneWidgetPart012Local26.performAction1998(sceneWidgetPart012Local26.sceneWidgetState0120, -16834);
              integerLocal27 = 1;
            }
            sceneWidgetPart012Local26.sceneWidgetState0122.stringState0598 = null;
            sceneWidgetLocal28 = sceneWidgetPart012Local26.sceneWidgetState0122;
            sceneWidgetPart012Local26.sceneWidgetState0122.integerState0915 = 0;
            sceneWidgetLocal28.integerState0896 = 0;
            sceneWidgetPart012Local26.sceneWidgetState0121.stringState0598 = null;
            sceneWidgetLocal29 = sceneWidgetPart012Local26.sceneWidgetState0121;
            sceneWidgetPart012Local26.sceneWidgetState0121.integerState0915 = 0;
            sceneWidgetLocal29.integerState0896 = 0;
            sceneWidgetPart012Local26.sceneWidgetState0124.stringState0598 = null;
            sceneWidgetPart012Local26.sceneWidgetState0124.integerState0915 = 0;
            sceneWidgetLocal30 = sceneWidgetPart012Local26.sceneWidgetState0124;
            sceneWidgetLocal30.integerState0896 = 0;
            sceneWidgetPart012Local26.sceneWidgetState0120.stringState0598 = null;
            sceneWidgetPart012Local26.sceneWidgetState0120.integerState0915 = 0;
            sceneWidgetLocal31 = sceneWidgetPart012Local26.sceneWidgetState0120;
            sceneWidgetPart012Local26.sceneWidgetState0123.stringState0598 = null;
            sceneWidgetLocal31.integerState0896 = 0;
            sceneWidgetLocal32 = sceneWidgetPart012Local26.sceneWidgetState0123;
            sceneWidgetPart012Local26.sceneWidgetState0123.integerState0915 = 0;
            sceneWidgetLocal32.integerState0896 = 0;
            sceneWidgetPart012Local26.integerState0896 = sceneWidgetPart008Argument4.sceneWidgetState0090.integerState0896;
            integerLocal33 = 0;
            stringLocal51 = sceneWidgetPart012Local26.stringState0534;
            integerLocal35 = 72;
            if (GameDomainSupport002.sceneWidgetPart008State0002 == sceneWidgetPart008Argument4) {
              integerLocal35 += 42;
            }
            stringLocal52 = BitmapFont.computeString1216(sceneWidgetPart012Local26.sceneWidgetState0122.bitmapFontState0020, stringLocal51, integerLocal35);
            stringLocal34 = stringLocal52;
            stackIntegerLocal8 = (stringLocal52.equals(sceneWidgetPart012Local26.stringState0534)) ? 0 : 1;
            integerLocal36 = stackIntegerLocal8;
            if (sceneWidgetPart012Local26.integerState0780 >= 4) {
              stringLocal34 = "<img=" + (InputAdapter004.integerState0530 - 4 + sceneWidgetPart012Local26.integerState0780) + ">" + stringLocal52;
            } else {
              if (sceneWidgetPart012Local26.integerState0780 > 0) {
                stringLocal34 = "<img=" + (sceneWidgetPart012Local26.integerState0780 - 1) + ">" + stringLocal52;
              }
            }
            sceneWidgetPart012Local26.sceneWidgetState0122.stringState0598 = stringLocal34;
            if (!sceneWidgetPart012Local26.computeBoolean1826((byte) 101)) {
              integerLocal37 = 16764006;
              integerLocal39 = 16777215;
              if (integerLocal16 != 0 &&
                !sceneWidgetPart012Local26.booleanState0186 ||
                (!(sceneWidgetPart012Local26.integerState0781 >= integerLocal18) ||
                !(sceneWidgetPart012Local26.integerState0784 >= integerLocal19) ||
                !((~sceneWidgetPart012Local26.integerState0782 & integerLocal20) <= 0))) {
                integerLocal39 = 8421504;
                integerLocal37 = 8414771;
              }
              sceneWidgetPart012Local26.sceneWidgetState0122.integerState0906 = integerLocal39;
              sceneWidgetPart012Local26.sceneWidgetState0122.integerState0899 = integerLocal39;
              sceneWidgetPart012Local26.sceneWidgetState0122.integerState0889 = integerLocal39;
              sceneWidgetPart012Local26.sceneWidgetState0124.integerState0910 = integerLocal37;
              sceneWidgetPart012Local26.sceneWidgetState0121.integerState0910 = integerLocal37;
              sceneWidgetPart012Local26.sceneWidgetState0122.integerState0910 = integerLocal37;
              sceneWidgetPart012Local26.sceneWidgetState0121.integerState0906 = integerLocal39;
              sceneWidgetPart012Local26.sceneWidgetState0121.integerState0899 = integerLocal39;
              sceneWidgetPart012Local26.sceneWidgetState0121.integerState0889 = integerLocal39;
              sceneWidgetPart012Local26.sceneWidgetState0124.integerState0906 = integerLocal39;
              sceneWidgetPart012Local26.sceneWidgetState0124.integerState0899 = integerLocal39;
              sceneWidgetPart012Local26.sceneWidgetState0124.integerState0889 = integerLocal39;
              if (sceneWidgetPart008Argument4 == RenderingSupport015.sceneWidgetPart008State0006) {
                if (!MixedSupport016.sceneWidgetPart013State0001.booleanState0204) {
                  sceneWidgetPart012Local26.sceneWidgetState0120.stringState0598 = MixedSupport013.stringState0061;
                }
              } else {
                if (sceneWidgetPart012Local26.booleanState0189) {
                  sceneWidgetPart012Local26.sceneWidgetState0122.stringState0598 = CollectionSupport001.computeString0336(116, MixedSupport079.stringState0325, new String[]{stringLocal34});
                  sceneWidgetPart012Local26.sceneWidgetState0120.stringState0598 = MixedSupport036.stringState0167;
                } else {
                  if (!sceneWidgetPart012Local26.booleanState0187) {
                    sceneWidgetPart012Local26.sceneWidgetState0124.stringState0598 = MixedSupport001.stringState0003;
                  } else {
                    sceneWidgetPart012Local26.sceneWidgetState0122.stringState0598 = CollectionSupport001.computeString0336(91, ResourceSupport001.stringState0010, new String[]{stringLocal34});
                    sceneWidgetPart012Local26.sceneWidgetState0124.stringState0598 = MixedSupport134.stringState0553;
                    sceneWidgetPart012Local26.sceneWidgetState0120.stringState0598 = PlatformSupport006.stringState0455;
                  }
                }
              }
              integerLocal41 = 0;
              if (MixedSupport016.sceneWidgetPart013State0001 != null &&
                SceneWidgetPart005.computeBoolean0803(true) &&
                ~sceneWidgetPart012Local26.longState0048 != ~MixedSupport134.longState0050) {
                if (null != sceneWidgetPart012Local26.sceneWidgetState0124.stringState0598) {
                  integerLocal43 = sceneWidgetPart012Local26.sceneWidgetState0124.computeInteger2000(true) + CollectionSupport003.integerState0540 * 2;
                  sceneWidgetPart012Local26.sceneWidgetState0124.performAction1994(integerLocal43, 0, integerLocal33, ComponentContainer.integerState0377, integerLocal41);
                  integerLocal41 = integerLocal41 + integerLocal43;
                }
                if (null != sceneWidgetPart012Local26.sceneWidgetState0120.stringState0598) {
                  if (sceneWidgetPart008Argument4 != RenderingSupport015.sceneWidgetPart008State0006) {
                    integerLocal63 = sceneWidgetPart012Local26.sceneWidgetState0120.computeInteger2000(true) + 2 * CollectionSupport003.integerState0540;
                  } else {
                    integerLocal63 = 40;
                  }
                  sceneWidgetPart012Local26.sceneWidgetState0120.performAction1994(integerLocal63, integerArgument2 + 17339, integerLocal33, ComponentContainer.integerState0377, integerLocal41);
                  integerLocal41 = integerLocal41 + integerLocal63;
                }
              }
              stackSceneWidgetLocal9 = sceneWidgetPart012Local26.sceneWidgetState0122;
              stackIntegerLocal10 = sceneWidgetPart012Local26.integerState0896;
              if (MixedSupport102.booleanState0133) {
                stackIntegerLocal11 = 42;
              } else {
                stackIntegerLocal11 = 0;
              }
              ((SceneWidget) (Object) stackSceneWidgetLocal9).performAction1994(stackIntegerLocal10 - stackIntegerLocal11 - integerLocal41, 0, integerLocal33, ComponentContainer.integerState0377, integerLocal41);
              sceneWidgetPart012Local26.sceneWidgetState0121.stringState0598 = Integer.toString(sceneWidgetPart012Local26.integerState0781);
              sceneWidgetPart012Local26.sceneWidgetState0121.performAction1994(40, integerArgument2 + 17339, integerLocal33, ComponentContainer.integerState0377, sceneWidgetPart012Local26.integerState0896 - 40);
              if (sceneWidgetPart012Local26.sceneWidgetState0122.booleanState0218 &&
                integerLocal36 != 0) {
                MixedSupport122.stringState0515 = sceneWidgetPart012Local26.stringState0534;
                if (null != NodeDeque.stringArrayState0055 &&
                  null != NodeDeque.stringArrayState0055[sceneWidgetPart012Local26.integerState0780]) {
                  MixedSupport122.stringState0515 = MixedSupport122.stringState0515 + " - " + NodeDeque.stringArrayState0055[sceneWidgetPart012Local26.integerState0780];
                }
              } else {
                if (sceneWidgetPart012Local26.sceneWidgetState0122.booleanState0218 &&
                  NodeDeque.stringArrayState0055 != null &&
                  null != NodeDeque.stringArrayState0055[sceneWidgetPart012Local26.integerState0780]) {
                  MixedSupport122.stringState0515 = NodeDeque.stringArrayState0055[sceneWidgetPart012Local26.integerState0780];
                }
              }
              integerLocal33 = integerLocal33 + ComponentContainer.integerState0377;
            }
            stringLocal38 = AudioSupport002.computeString0885(stringLocal34, sceneWidgetPart012Local26.integerState0786, (byte) -128);
            objectLocal40 = stringLocal38;
            objectLocal54 = stringLocal38;
            if (stringLocal38 != null) {
              integerLocal60 = sceneWidgetPart012Local26.sceneWidgetState0123.bitmapFontState0020.computeInteger1209(stringLocal38, -CollectionSupport003.integerState0540 + sceneWidgetPart012Local26.integerState0896 - CollectionSupport003.integerState0540);
              sceneWidgetPart012Local26.sceneWidgetState0123.integerState0917 = 256 * sceneWidgetPart012Local26.integerState0785 / MixedSupport094.integerState0547;
              sceneWidgetPart012Local26.sceneWidgetState0123.stringState0598 = stringLocal38;
              sceneWidgetPart012Local26.sceneWidgetState0123.performAction1994(sceneWidgetPart012Local26.integerState0896 - CollectionSupport003.integerState0540 * 2, 0, integerLocal33, ComponentContainer.integerState0377 * integerLocal60, CollectionSupport003.integerState0540);
              integerLocal33 = integerLocal33 + integerLocal60 * ComponentContainer.integerState0377;
            }
            if (integerLocal58 == 0) {
              sceneWidgetPart012Local26.integerState0895 = -sceneWidgetPart012Local26.integerState0915 + integerLocal33;
            }
            if (integerLocal27 != 0) {
              sceneWidgetPart008Argument4.sceneWidgetState0090.performAction1999((SceneWidget) (objectLocal25), sceneWidgetPart012Local26, 2, 0);
            }
            if (sceneWidgetPart012Local26.integerState0891 != 0 &&
              !sceneWidgetPart012Local26.computeBoolean1826((byte) 101)) {
              if (0 == sceneWidgetPart012Local26.sceneWidgetState0124.integerState0891) {
                if (0 != sceneWidgetPart012Local26.sceneWidgetState0120.integerState0891) {
                  MixedSupport087.performAction1232(true, sceneWidgetPart012Local26.longState0048, integerArgument3);
                } else {
                  MixedSupport042.performAction0596(0, sceneWidgetPart012Local26, sceneWidgetPart008Argument4, UiComponentPart013.integerState0276, 0, integerArgument2 ^ 17358, TextLineMetrics.integerState0535);
                }
              } else {
                MixedSupport013.performAction0187(sceneWidgetPart012Local26.longState0048, integerArgument3, (byte) -84);
              }
            }
            objectLocal25 = sceneWidgetPart012Local26;
            if (sceneWidgetPart012Local26.booleanState0211 &&
              !sceneWidgetPart012Local26.computeBoolean1826((byte) 111)) {
              objectLocal55 = null;
              if (~MixedSupport134.longState0050 == ~sceneWidgetPart012Local26.longState0048) {
                if (integerLocal16 != 0 &&
                  !sceneWidgetPart012Local26.booleanState0186) {
                  objectLocal55 = MixedSupport116.stringState0484;
                } else {
                  if (sceneWidgetPart012Local26.integerState0784 >= integerLocal19) {
                    if (sceneWidgetPart012Local26.integerState0781 >= integerLocal18) {
                      if ((integerLocal20 & ~sceneWidgetPart012Local26.integerState0782) != 0) {
                        integerLocal41 = SceneWidgetPart014.computeInteger2014((byte) -94, integerLocal20 & ~sceneWidgetPart012Local26.integerState0782);
                        objectLocal55 = MixedSupport130.stringState0540;
                        if (integerLocal41 > 0 &&
                          Sprite.stringArrayArrayState0005 != null &&
                          integerLocal41 <= Sprite.stringArrayArrayState0005.length &&
                          Sprite.stringArrayArrayState0005[-1 + integerLocal41] != null) {
                          objectLocal55 = Sprite.stringArrayArrayState0005[integerLocal41 - 1][1];
                        }
                      }
                    } else {
                      objectLocal55 = CollectionSupport001.computeString0336(90, MixedSupport046.stringState0195, new String[]{null, Integer.toString(integerLocal18)});
                    }
                  } else {
                    integerLocal41 = -sceneWidgetPart012Local26.integerState0784 + integerLocal19;
                    if (integerLocal41 == 1) {
                      objectLocal55 = MixedSupport094.stringState0374;
                    }
                    objectLocal55 = CollectionSupport001.computeString0336(118, MixedSupport079.stringState0323, new String[]{null, Integer.toString(integerLocal41)});
                  }
                }
              } else {
                if (integerLocal16 != 0 &&
                  !sceneWidgetPart012Local26.booleanState0186) {
                  objectLocal55 = CollectionSupport001.computeString0336(92, RenderingSupport006.stringState0268, new String[]{stringLocal34});
                } else {
                  if (sceneWidgetPart012Local26.integerState0784 >= integerLocal19) {
                    if (sceneWidgetPart012Local26.integerState0781 >= integerLocal18) {
                      if (0 != (~sceneWidgetPart012Local26.integerState0782 & integerLocal20)) {
                        integerLocal41 = SceneWidgetPart014.computeInteger2014((byte) -120, integerLocal20 & ~sceneWidgetPart012Local26.integerState0782);
                        objectLocal55 = CollectionSupport001.computeString0336(91, MixedSupport018.stringState0089, new String[]{stringLocal34});
                        if (integerLocal41 > 0 &&
                          Sprite.stringArrayArrayState0005 != null &&
                          Sprite.stringArrayArrayState0005.length >= integerLocal41 &&
                          Sprite.stringArrayArrayState0005[integerLocal41 - 1] != null) {
                          objectLocal55 = CollectionSupport001.computeString0336(93, Sprite.stringArrayArrayState0005[-1 + integerLocal41][2], new String[]{stringLocal34});
                        }
                      }
                    } else {
                      objectLocal55 = CollectionSupport001.computeString0336(98, MixedSupport155.stringState0636, new String[]{stringLocal34, Integer.toString(integerLocal18)});
                    }
                  } else {
                    integerLocal41 = -sceneWidgetPart012Local26.integerState0784 + integerLocal19;
                    if (integerLocal41 == 1) {
                      objectLocal55 = CollectionSupport001.computeString0336(93, InputAdapter005.stringState0448, new String[]{stringLocal34});
                    }
                    objectLocal55 = CollectionSupport001.computeString0336(99, MixedSupport076.stringState0320, new String[]{stringLocal34, Integer.toString(integerLocal41)});
                  }
                }
              }
              if (objectLocal55 != null) {
                stringLocal53 = "<col=A00000>" + (String) (objectLocal55);
                stringLocal47 = stringLocal53;
                objectLocal42 = stringLocal47;
                objectLocal55 = objectLocal42;
                stringLocal56 = stringLocal53;
                objectLocal42 = stringLocal56;
                objectLocal42 = null;
                integerLocal61 = 0;
                for (integerLocal1 = 0; integerLocal1 < MixedSupport064.integerState0336; integerLocal1++) {
                  integerLocal45 = MixedSupport016.sceneWidgetPart013State0001.byteArrayState0032[integerLocal1] & 255;
                  integerLocal46 = 0;
                  if (MixedSupport014.booleanArrayArrayState0001 != null &&
                    null != MixedSupport014.booleanArrayArrayState0001[integerLocal1] &&
                    MixedSupport014.booleanArrayArrayState0001[integerLocal1][integerLocal45] &&
                    !sceneWidgetPart012Local26.booleanState0186) {
                    integerLocal46 = 1;
                  }
                  if (null != SceneWidgetPart007.integerArrayArrayState0017 &&
                    SceneWidgetPart007.integerArrayArrayState0017[integerLocal1] != null) {
                    integerLocal48 = SceneWidgetPart007.integerArrayArrayState0017[integerLocal1][integerLocal45];
                    if (integerLocal48 != 0 &&
                      !MixedSupport134.booleanState0191 &&
                      !sceneWidgetPart012Local26.booleanState0186) {
                      integerLocal46 = 1;
                    }
                    if (integerLocal48 > sceneWidgetPart012Local26.integerState0781) {
                      integerLocal46 = 1;
                    }
                  }
                  if (MixedSupport063.integerArrayArrayState0012 != null &&
                    MixedSupport063.integerArrayArrayState0012[integerLocal1] != null) {
                    integerLocal62 = MixedSupport063.integerArrayArrayState0012[integerLocal1][integerLocal45];
                    if (0 != integerLocal62 &&
                      !MixedSupport134.booleanState0191 &&
                      !sceneWidgetPart012Local26.booleanState0186) {
                      integerLocal46 = 1;
                    }
                    if (integerLocal62 > sceneWidgetPart012Local26.integerState0784) {
                      integerLocal46 = 1;
                    }
                  }
                  if (null != MixedSupport004.integerArrayArrayState0003 &&
                    MixedSupport004.integerArrayArrayState0003[integerLocal1] != null &&
                    (~sceneWidgetPart012Local26.integerState0782 & MixedSupport004.integerArrayArrayState0003[integerLocal1][integerLocal45]) != 0) {
                    integerLocal46 = 1;
                  }
                  if (integerLocal46 != 0) {
                    stringLocal57 = "<col=A00000>" + UiComponentPart022.stringArrayState0026[integerLocal1] + "</col>";
                    objectLocal42 = stringLocal57;
                    objectLocal55 = objectLocal42;
                    objectLocal42 = stringLocal57;
                    if (objectLocal42 != null) {
                      integerLocal61 = 1;
                      objectLocal42 = (String) (objectLocal42) + ", " + stringLocal57;
                      objectLocal55 = objectLocal42;
                      objectLocal55 = objectLocal42;
                    } else {
                      objectLocal42 = stringLocal57;
                    }
                  }
                }
                if (sceneWidgetPart008Argument4 == RenderingSupport015.sceneWidgetPart008State0006 &&
                  SceneWidgetPart005.computeBoolean0803(true)) {
                  if (integerLocal61 != 0) {
                    objectLocal55 = stringLocal53 + "<br>" + GameDomainSupport005.stringState0405 + (String) (objectLocal42);
                  } else {
                    objectLocal55 = stringLocal53 + "<br>" + CollectionSupport001.computeString0336(111, MixedSupport018.stringState0091, new String[]{(String) (objectLocal42)});
                  }
                } else {
                  if (integerLocal61 != 0) {
                    objectLocal55 = stringLocal53 + "<br>" + MixedSupport007.stringState0036 + (String) (objectLocal42);
                  } else {
                    objectLocal55 = stringLocal53 + "<br>" + CollectionSupport001.computeString0336(101, MixedSupport040.stringState0177, new String[]{(String) (objectLocal42)});
                  }
                }
                if (RenderingSupport015.sceneWidgetPart008State0006 == sceneWidgetPart008Argument4 &&
                  !SceneWidgetPart005.computeBoolean0803(true)) {
                  stringLocal44 = MixedSupport016.sceneWidgetPart013State0001.stringState0585;
                  objectLocal55 = (String) (objectLocal55) + "<br>" + CollectionSupport001.computeString0336(116, MixedSupport067.stringState0279, new String[]{stringLocal44});
                }
                MixedSupport122.stringState0515 = (String) (objectLocal55);
              }
            }
            sceneWidgetPart012Local26 = (SceneWidgetPart012) (nodeDequeLocal23.computeHashNode1974(true));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal64) {
          caughtExceptionLocal15 = caughtParameterLocal64;
          runtimeExceptionLocal17 = caughtExceptionLocal15;
          stackRuntimeExceptionLocal12 = runtimeExceptionLocal17;
          stackStringBuilderLocal13 = new StringBuilder().append("cl.C(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (sceneWidgetPart008Argument4 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal12), ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(',').append(booleanArgument5).append(')').toString());
        }
    }

    final static void performAction0320(String stringArgument1, int integerArgument2, int integerArgument3, String stringArgument4, int integerArgument5) {
        UiComponentPart033.sceneWidgetState0150.integerState0910 = integerArgument3;
        UiComponentPart033.sceneWidgetState0150.stringState0599 = stringArgument1;
        UiComponentPart033.sceneWidgetState0150.integerState0896 = UiComponentPart033.sceneWidgetState0150.integerState0896 + DiagnosticSupport002.sceneWidgetState0057.integerState0896;
        UiComponentPart033.sceneWidgetState0150.stringState0598 = stringArgument4;
        DiagnosticSupport002.sceneWidgetState0057.integerState0890 = DiagnosticSupport002.sceneWidgetState0057.integerState0890 + DiagnosticSupport002.sceneWidgetState0057.integerState0896;
        if (integerArgument5 != -24503) {
          return;
        }
        try {
          DiagnosticSupport002.sceneWidgetState0057.integerState0896 = integerArgument2;
          UiComponentPart033.sceneWidgetState0150.integerState0896 = UiComponentPart033.sceneWidgetState0150.integerState0896 - DiagnosticSupport002.sceneWidgetState0057.integerState0896;
          DiagnosticSupport002.sceneWidgetState0057.integerState0890 = DiagnosticSupport002.sceneWidgetState0057.integerState0890 - DiagnosticSupport002.sceneWidgetState0057.integerState0896;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "cl.E(" + (stringArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + (stringArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ')');
        }
    }

    public static void performAction0322(byte byteArgument1) {
        resourceArchiveState0003 = null;
        platformSupport006State0001 = null;
        renderingSupport008State0003 = null;
        uiComponentPart012State0001 = null;
        if (byteArgument1 != -39) {
          return;
        }
        sceneWidgetState0013 = null;
        sceneWidgetState0012 = null;
        stringState0094 = null;
    }

    final static void performAction0321(boolean booleanArgument1) {
        int stackIntegerLocal1 = 0;
        String stackStringLocal2 = null;
        int stackIntegerLocal3 = 0;
        String stackStringLocal4 = null;
        boolean stackBooleanLocal5 = false;
        String stackStringLocal6 = null;
        boolean stackBooleanLocal7 = false;
        MixedSupport015 stackMixedSupport015Local8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        int integerLocal10 = 0;
        RuntimeException runtimeExceptionLocal11 = null;
        int integerLocal12 = 0;
        long longLocal13 = 0L;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        String stringLocal17 = null;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        MixedSupport015 mixedSupport015Local20 = null;
        int integerLocal21 = 0;
        int integerLocal22;
        int integerLocal23;
        integerLocal21 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal10 = MixedSupport036.integerState0221;
          integerLocal12 = 0;
          if (MixedSupport009.integerState0054 == 2) {
            longLocal13 = MixedSupport063.computeLong0827(4) - MixedSupport024.longState0007;
            integerLocal12 = (int)((10999L - longLocal13) / 1000L);
            if (integerLocal12 < 0) {
              integerLocal12 = 0;
            }
          }
          integerLocal14 = 0;
          if (!booleanArgument1) {
            renderingSupport008State0003 = (RenderingSupport008) null;
          }
          while (integerLocal14 < UiComponentPart028.stringArrayState0039.length) {
            integerLocal15 = MixedSupport070.integerArrayState0119[integerLocal14];
            if (0 > integerLocal15) {
              integerLocal16 = MixedSupport155.integerState0937;
            } else {
              if (integerLocal15 != MixedSupport070.mixedSupport121State0001.integerState0754) {
                integerLocal16 = MixedSupport150.integerState0918;
              } else {
                integerLocal16 = NetworkSupport004.integerState0266;
              }
            }
            stringLocal17 = UiComponentPart028.stringArrayState0039[integerLocal14];
            if (MixedSupport009.integerState0054 == 2 &&
              integerLocal12 == 1) {
              if (UiComponentPart032.stringArrayState0051.length <= MixedSupport127.stringArrayState0047.length) {
                stackIntegerLocal1 = MixedSupport127.stringArrayState0047.length;
              } else {
                stackIntegerLocal1 = UiComponentPart032.stringArrayState0051.length;
              }
              integerLocal18 = stackIntegerLocal1;
              if (integerLocal14 >= 6 &&
                integerLocal18 + 6 > integerLocal14) {
                if (-integerLocal18 + integerLocal14 - (6 - MixedSupport127.stringArrayState0047.length) < 0) {
                  stackStringLocal2 = "";
                } else {
                  stackStringLocal2 = MixedSupport127.stringArrayState0047[-6 + (integerLocal14 + MixedSupport127.stringArrayState0047.length - integerLocal18)];
                }
                stringLocal17 = stackStringLocal2;
              }
              if (SceneWidgetPart014.stringArrayState0057.length <= ClientException.stringArrayState0006.length) {
                stackIntegerLocal3 = ClientException.stringArrayState0006.length;
              } else {
                stackIntegerLocal3 = SceneWidgetPart014.stringArrayState0057.length;
              }
              integerLocal19 = stackIntegerLocal3;
              if (integerLocal18 + 7 <= integerLocal14 &&
                integerLocal19 + 7 + integerLocal18 > integerLocal14) {
                if (-7 + (integerLocal14 - integerLocal18) >= ClientException.stringArrayState0006.length) {
                  stackStringLocal4 = "";
                } else {
                  stackStringLocal4 = ClientException.stringArrayState0006[-7 + integerLocal14 - integerLocal18];
                }
                stringLocal17 = stackStringLocal4;
              }
            }
            if (integerLocal15 == -2) {
              stringLocal17 = Integer.toString(integerLocal12);
            }
            stackBooleanLocal5 = false;
            stackStringLocal6 = stringLocal17;
            stackBooleanLocal7 = !(integerLocal15 < 0);
            integerLocal22 = NodeHashTable.computeInteger1709(stackBooleanLocal5, stackStringLocal6, stackBooleanLocal7);
            integerLocal23 = -(integerLocal22 >> 1) + BufferedSocket.integerState0661;
            if (integerLocal15 >= 0) {
              integerLocal10 = integerLocal10 + BufferedSocket.integerState0665;
              if (MixedSupport070.mixedSupport121State0001.integerState0754 != integerLocal15) {
                stackMixedSupport015Local8 = MixedSupport022.mixedSupport015State0001;
              } else {
                stackMixedSupport015Local8 = TextLineMetrics.mixedSupport015State0003;
              }
              mixedSupport015Local20 = stackMixedSupport015Local8;
              if (mixedSupport015Local20 != null) {
                mixedSupport015Local20.performAction0220(integerLocal22 + (NetworkSupport006.integerState0499 << 1), 102, integerLocal23 - NetworkSupport006.integerState0499, integerLocal10, (UiComponentPart022.integerState0575 << 1) + MixedSupport015.integerState0100);
              }
              integerLocal10 = integerLocal10 + UiComponentPart022.integerState0575;
            }
            if (0 <= integerLocal15) {
              MixedSupport010.bitmapFontState0005.performAction1211(stringLocal17, integerLocal23, MixedSupport001.integerState0013 + integerLocal10, integerLocal16, -1);
              integerLocal10 = integerLocal10 + (UiComponentPart022.integerState0575 - (-BufferedSocket.integerState0665 - MixedSupport015.integerState0100));
            } else {
              UiComponentPart028.bitmapFontState0019.performAction1211(stringLocal17, integerLocal23, MixedSupport089.integerState0531 + integerLocal10, integerLocal16, -1);
              integerLocal10 = integerLocal10 + RenderingSupport008.integerState0362;
            }
            integerLocal14++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal24) {
          caughtExceptionLocal9 = caughtParameterLocal24;
          runtimeExceptionLocal11 = caughtExceptionLocal9;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal11), "cl.D(" + booleanArgument1 + ')');
        }
    }

    final static void performAction0319(MixedSupport056 mixedSupport056Argument1, boolean booleanArgument2) {
        int integerLocal1 = 0;
        MixedSupport056 mixedSupport056Local2 = null;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (mixedSupport056Argument1.stringState0241 == null) {
            return;
          }
          if (!booleanArgument2) {
            MixedSupport020.performAction0322((byte) -122);
          }
          if (mixedSupport056Argument1.integerState0291 != 0 ||
            mixedSupport056Argument1.integerState0286 != 0) {
            for (integerLocal1 = 0; integerLocal1 < MixedSupport058.integerState0317; integerLocal1++) {
              mixedSupport056Local2 = MixedSupport102.mixedSupport056ArrayState0001[integerLocal1];
              if (mixedSupport056Local2.integerState0290 == 2 &&
                mixedSupport056Local2.integerState0291 == mixedSupport056Argument1.integerState0291 &&
                mixedSupport056Local2.integerState0286 == mixedSupport056Argument1.integerState0286) {
                return;
              }
            }
          }
          if (mixedSupport056Argument1.integerArrayState0065 != null) {
            SoftwareFramebuffer.integerArrayState0259 = mixedSupport056Argument1.integerArrayState0065;
            UiComponentPart013.stringState0226 = mixedSupport056Argument1.stringState0238;
            IterableNodeCollection.integerState0802 = mixedSupport056Argument1.integerState0290;
            MixedSupport090.longState0032 = mixedSupport056Argument1.longState0021;
          }
          MixedSupport112.performAction1596(mixedSupport056Argument1, -3);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal7 = caughtParameterLocal9;
          runtimeExceptionLocal8 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal8;
          stackStringBuilderLocal5 = new StringBuilder().append("cl.B(");
          if (mixedSupport056Argument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    MixedSupport020() {
    }

    static {
        stringState0094 = "Rated game";
    }
}
