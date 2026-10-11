/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MixedSupport072 extends HashNode {
    int integerState0357;
    String[][] stringArrayArrayState0004;
    int integerState0358;
    int integerState0359;
    int[][] integerArrayArrayState0014;
    boolean booleanState0091;
    long[][] longArrayArrayState0001;
    static String stringState0302;
    static String stringState0303;

    final static void performAction0957(int integerArgument1, int integerArgument2) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = 0;
        integerLocal2 = MixedSupport046.integerState0250;
        if (integerLocal2 < 5) {
          integerLocal1 = 8192 * (integerLocal2 * integerLocal2) / 1100;
          if (integerArgument1 != 8192) {
            return;
          }
          integerLocal3 = 1;
          integerLocal4 = 0;
          if (integerArgument2 == 1) {
            integerLocal4 = 1;
          }
          if (integerArgument2 == 3) {
            integerLocal3 = -1;
          }
          if (integerArgument2 == 4) {
            integerLocal3 = 1;
            integerLocal4 = 1;
          }
          if (integerArgument2 == 5) {
            integerLocal3 = -1;
            integerLocal4 = 1;
          }
          if (integerArgument2 == 6) {
            integerLocal3 = 1;
            integerLocal4 = -1;
          }
          if (integerArgument2 == 7) {
            integerLocal3 = -1;
            integerLocal4 = -1;
          } else {
            if (8 == integerArgument2) {
              integerLocal3 = -1;
              integerLocal4 = -1;
            }
          }
          if (11 == integerArgument2) {
            integerLocal3 = -1;
          }
          if (integerArgument2 == 12) {
            integerLocal3 = -1;
            integerLocal4 = -1;
          }
          if (13 == integerArgument2) {
            integerLocal4 = -1;
            integerLocal3 = 1;
          }
          if (14 == integerArgument2) {
            integerLocal4 = 1;
            integerLocal3 = -1;
          }
          if (15 == integerArgument2) {
            integerLocal3 = 1;
            integerLocal4 = 1;
          }
          MixedSupport093.integerArrayState0171 = MixedSupport032.computeIntegerArray0523(integerLocal4 * integerLocal1, integerLocal1 * integerLocal3, (byte) 90);
          return;
        }
        if (integerLocal2 < 105) {
          integerLocal1 = (-40960 + 16384 * integerLocal2) / 220;
          if (integerArgument1 != 8192) {
            return;
          }
          integerLocal6 = 1;
          integerLocal8 = 0;
          if (integerArgument2 == 1) {
            integerLocal8 = 1;
          }
          if (integerArgument2 == 3) {
            integerLocal6 = -1;
          }
          if (integerArgument2 == 4) {
            integerLocal6 = 1;
            integerLocal8 = 1;
          }
          if (integerArgument2 == 5) {
            integerLocal6 = -1;
            integerLocal8 = 1;
          }
          if (integerArgument2 == 6) {
            integerLocal6 = 1;
            integerLocal8 = -1;
          }
          if (integerArgument2 == 7 ||
            8 == integerArgument2) {
            integerLocal6 = -1;
            integerLocal8 = -1;
          }
          if (11 == integerArgument2) {
            integerLocal6 = -1;
          }
          if (integerArgument2 == 12) {
            integerLocal6 = -1;
            integerLocal8 = -1;
          }
          if (13 == integerArgument2) {
            integerLocal8 = -1;
            integerLocal6 = 1;
          }
          if (14 == integerArgument2) {
            integerLocal8 = 1;
            integerLocal6 = -1;
          }
          if (15 == integerArgument2) {
            integerLocal6 = 1;
            integerLocal8 = 1;
          }
          MixedSupport093.integerArrayState0171 = MixedSupport032.computeIntegerArray0523(integerLocal8 * integerLocal1, integerLocal1 * integerLocal6, (byte) 90);
          return;
        }
        if (120 > integerLocal2) {
          integerLocal2 = -integerLocal2 + 120;
          integerLocal1 = -(integerLocal2 * integerLocal2 * 8192 / 3300) + 8192;
        }
        if (integerArgument1 != 8192) {
          return;
        }
        integerLocal7 = 1;
        integerLocal9 = 0;
        if (integerArgument2 == 1) {
          integerLocal9 = 1;
        }
        if (integerArgument2 == 3) {
          integerLocal7 = -1;
        }
        if (integerArgument2 == 4) {
          integerLocal7 = 1;
          integerLocal9 = 1;
        }
        if (integerArgument2 == 5) {
          integerLocal7 = -1;
          integerLocal9 = 1;
        }
        if (integerArgument2 == 6) {
          integerLocal7 = 1;
          integerLocal9 = -1;
        }
        if (integerArgument2 == 7 ||
          8 == integerArgument2) {
          integerLocal7 = -1;
          integerLocal9 = -1;
        }
        if (11 == integerArgument2) {
          integerLocal7 = -1;
        }
        if (integerArgument2 == 12) {
          integerLocal7 = -1;
          integerLocal9 = -1;
        }
        if (13 == integerArgument2) {
          integerLocal9 = -1;
          integerLocal7 = 1;
        }
        if (14 == integerArgument2) {
          integerLocal9 = 1;
          integerLocal7 = -1;
        }
        if (15 == integerArgument2) {
          integerLocal7 = 1;
          integerLocal9 = 1;
        }
        MixedSupport093.integerArrayState0171 = MixedSupport032.computeIntegerArray0523(integerLocal9 * integerLocal1, integerLocal1 * integerLocal7, (byte) 90);
        return;
    }

    final static ResourceArchive computeResourceArchive0956(boolean booleanArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4, boolean booleanArgument5, boolean booleanArgument6) {
        try {
          Object objectLocal1 = null;
          Object objectLocal2 = null;
          MixedSupport080 mixedSupport080Local3 = null;
          ResourceArchive stackResourceArchiveLocal4 = null;
          ResourceArchive stackResourceArchiveLocal5 = null;
          Throwable caughtExceptionLocal6 = null;
          try {
            if (booleanArgument5) {
              stackResourceArchiveLocal4 = (ResourceArchive) null;
              return stackResourceArchiveLocal4;
            }
            objectLocal1 = null;
            objectLocal2 = null;
            if (UiComponentPart003.platformServiceState0001.platformSupport004State0001 != null) {
              MixedSupport086.mixedSupport091State0004 = new MixedSupport091(UiComponentPart003.platformServiceState0001.platformSupport004State0001, 5200, 0);
              UiComponentPart003.platformServiceState0001.platformSupport004State0001 = null;
              objectLocal1 = new MixedSupport073(255, MixedSupport086.mixedSupport091State0004, new MixedSupport091(UiComponentPart003.platformServiceState0001.platformSupport004State0003, 12000, 0), 2097152);
            }
            if (MixedSupport086.mixedSupport091State0004 != null) {
              if (SceneWidgetPart005.mixedSupport091ArrayState0001 == null) {
                SceneWidgetPart005.mixedSupport091ArrayState0001 = new MixedSupport091[UiComponentPart003.platformServiceState0001.platformSupport004ArrayState0001.length];
              }
              if (SceneWidgetPart005.mixedSupport091ArrayState0001[integerArgument3] == null) {
                SceneWidgetPart005.mixedSupport091ArrayState0001[integerArgument3] = new MixedSupport091(UiComponentPart003.platformServiceState0001.platformSupport004ArrayState0001[integerArgument3], 12000, 0);
                UiComponentPart003.platformServiceState0001.platformSupport004ArrayState0001[integerArgument3] = null;
              }
              objectLocal2 = new MixedSupport073(integerArgument3, MixedSupport086.mixedSupport091State0004, SceneWidgetPart005.mixedSupport091ArrayState0001[integerArgument3], 2097152);
            }
            mixedSupport080Local3 = ProxySocketFactory.codecSupport002State0001.computeMixedSupport0801245((byte) -86, integerArgument3, (MixedSupport073) (objectLocal2), (MixedSupport073) (objectLocal1), booleanArgument4);
            if (booleanArgument6) {
              mixedSupport080Local3.performAction1071((byte) 0);
            }
            stackResourceArchiveLocal5 = new ResourceArchive(mixedSupport080Local3, booleanArgument1, integerArgument2);
            return stackResourceArchiveLocal5;
          } catch (java.io.IOException caughtParameterLocal7) {
            caughtExceptionLocal6 = caughtParameterLocal7;
            objectLocal1 = (IOException) (Object) caughtExceptionLocal6;
            throw new RuntimeException(((IOException) (objectLocal1)).toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal8) {
          throw uncheckedExceptionLocal8;
        } catch (Throwable checkedExceptionLocal9) {
          throw new RuntimeException(checkedExceptionLocal9);
        }
    }

    MixedSupport072() {
    }

    public static void performAction0955(int integerArgument1) {
        stringState0303 = null;
        stringState0302 = null;
        if (integerArgument1 < 40) {
          stringState0302 = (String) null;
        }
    }

    static {
        stringState0303 = "In Multiplayer";
        stringState0302 = "The Basics";
    }
}
