/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTable implements Iterable {
    static NodeDeque nodeDequeState0031;
    int integerState0748;
    static RgbSprite[] rgbSpriteArrayState0026;
    static String stringState0505;
    private HashNode hashNodeState0008;
    HashNode[] hashNodeArrayState0002;
    static String[] stringArrayState0045;
    static String stringState0506;
    static RgbSprite rgbSpriteState0055;
    static String stringState0507;
    static String stringState0508;
    static SceneWidget[] sceneWidgetArrayState0004;
    static String stringState0509;
    static String stringState0510;

    final HashNode computeHashNode1707(long longArgument1, byte byteArgument2) {
        HashNode hashNodeLocal1 = null;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        HashNode hashNodeLocal3 = this.hashNodeArrayState0002[(int)(longArgument1 & (long)(this.integerState0748 - 1))];
        this.hashNodeState0008 = hashNodeLocal3.previous;
        while (hashNodeLocal3 != this.hashNodeState0008) {
          if (~longArgument1 == ~this.hashNodeState0008.key) {
            hashNodeLocal1 = this.hashNodeState0008;
            this.hashNodeState0008 = this.hashNodeState0008.previous;
            return hashNodeLocal1;
          }
          this.hashNodeState0008 = this.hashNodeState0008.previous;
        }
        this.hashNodeState0008 = null;
        if (byteArgument2 != -37) {
          this.integerState0748 = 79;
          return null;
        }
        return null;
    }

    final void performAction1708(long longArgument1, boolean booleanArgument2, HashNode hashNodeArgument3) {
        HashNode hashNodeLocal1 = null;
        try {
          if (null != hashNodeArgument3.next) {
            hashNodeArgument3.performAction0161((byte) 107);
          }
          hashNodeLocal1 = this.hashNodeArrayState0002[(int)(longArgument1 & (long)(this.integerState0748 - 1))];
          hashNodeArgument3.next = hashNodeLocal1.next;
          if (booleanArgument2) {
            rgbSpriteArrayState0026 = (RgbSprite[]) null;
          }
          hashNodeArgument3.previous = hashNodeLocal1;
          hashNodeArgument3.next.previous = hashNodeArgument3;
          hashNodeArgument3.previous.next = hashNodeArgument3;
          hashNodeArgument3.key = longArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "si.D(" + longArgument1 + ',' + booleanArgument2 + ',' + (hashNodeArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int computeInteger1709(boolean booleanArgument1, String stringArgument2, boolean booleanArgument3) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (booleanArgument1) {
            NodeHashTable.performAction1705(115, true, -31, -28, 79, (byte) 85, -127);
          }
          if (booleanArgument3) {
            stackIntegerLocal3 = MixedSupport010.bitmapFontState0005.computeInteger1208(stringArgument2);
            return stackIntegerLocal3;
          }
          stackIntegerLocal2 = UiComponentPart028.bitmapFontState0019.computeInteger1208(stringArgument2);
          return stackIntegerLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("si.K(").append(booleanArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    final static void performAction1712(int integerArgument1) {
        String stringLocal1 = null;
        String stringLocal2;
        if (MixedSupport020.uiComponentPart012State0001 != null) {
          MixedSupport020.uiComponentPart012State0001.performAction0655(22);
          MixedSupport123.uiComponentPart005State0001 = new UiComponentPart005();
          if (integerArgument1 != -31842) {
            stringLocal1 = (String) null;
            NodeHashTable.computeInteger1709(true, (String) null, true);
            UiComponentPart006.uiComponentPart023State0001.performAction0201(MixedSupport123.uiComponentPart005State0001, (byte) 87);
            return;
          }
          UiComponentPart006.uiComponentPart023State0001.performAction0201(MixedSupport123.uiComponentPart005State0001, (byte) 87);
          return;
        }
        MixedSupport123.uiComponentPart005State0001 = new UiComponentPart005();
        if (integerArgument1 == -31842) {
          UiComponentPart006.uiComponentPart023State0001.performAction0201(MixedSupport123.uiComponentPart005State0001, (byte) 87);
          return;
        }
        stringLocal2 = (String) null;
        NodeHashTable.computeInteger1709(true, (String) null, true);
        UiComponentPart006.uiComponentPart023State0001.performAction0201(MixedSupport123.uiComponentPart005State0001, (byte) 87);
    }

    final static void performAction1703(int integerArgument1) {
        if (null != GameSession.bufferedSocketState0002) {
          GameSession.bufferedSocketState0002.performAction1555(0);
          GameSession.bufferedSocketState0002 = null;
        }
        if (integerArgument1 > 57) {
          return;
        }
        String stringLocal1 = (String) null;
        NodeHashTable.computeInteger1709(true, (String) null, true);
    }

    final static RgbSprite[] computeRgbSpriteArray1704(int integerArgument1, int integerArgument2, ResourceArchive resourceArchiveArgument3, byte byteArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        RgbSprite[] rgbSpriteArrayLocal2 = null;
        RgbSprite[] stackRgbSpriteArrayLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (!SceneWidgetPart002.computeBoolean0618(integerArgument2, resourceArchiveArgument3, integerArgument1, 106)) {
            return null;
          }
          if (byteArgument4 != -46) {
            rgbSpriteArrayLocal2 = (RgbSprite[]) null;
            NodeHashTable.computeRgbSpriteArray1706(55, false, (RgbSprite[]) null, true);
          }
          stackRgbSpriteArrayLocal3 = UiComponentPart004.computeRgbSpriteArray0205(0);
          return stackRgbSpriteArrayLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("si.B(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (resourceArchiveArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument4).append(')').toString());
        }
    }

    final static RgbSprite[] computeRgbSpriteArray1706(int integerArgument1, boolean booleanArgument2, RgbSprite[] rgbSpriteArrayArgument3, boolean booleanArgument4) {
        int integerLocal1 = 0;
        RgbSprite[] rgbSpriteArrayLocal2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        RgbSprite[] rgbSpriteArrayLocal5 = null;
        RgbSprite[] stackRgbSpriteArrayLocal6 = null;
        RgbSprite[] stackRgbSpriteArrayLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 != 25972) {
            stackRgbSpriteArrayLocal6 = (RgbSprite[]) null;
            return stackRgbSpriteArrayLocal6;
          }
          rgbSpriteArrayLocal5 = new RgbSprite[rgbSpriteArrayArgument3.length];
          rgbSpriteArrayLocal2 = rgbSpriteArrayLocal5;
          for (integerLocal1 = 0; rgbSpriteArrayArgument3.length > integerLocal1; integerLocal1++) {
            rgbSpriteArrayLocal5[integerLocal1] = NetworkSupport007.computeRgbSprite1169(rgbSpriteArrayArgument3[integerLocal1], booleanArgument4, (byte) -87, booleanArgument2);
          }
          stackRgbSpriteArrayLocal7 = rgbSpriteArrayLocal2;
          return stackRgbSpriteArrayLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal3 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal3;
          stackStringBuilderLocal9 = new StringBuilder().append("si.J(").append(integerArgument1).append(',').append(booleanArgument2).append(',');
          if (rgbSpriteArrayArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(booleanArgument4).append(')').toString());
        }
    }

    final static boolean computeBoolean1711(int integerArgument1) {
        if (integerArgument1 != -12851) {
          stringState0506 = (String) null;
          if (null == GameSession.bufferedSocketState0002) {
            return false;
          }
          if (UiComponentPart023.mixedSupport139State0009 == SoftwareFramebuffer.mixedSupport139State0012) {
            return true;
          }
          return false;
        }
        if (null == GameSession.bufferedSocketState0002) {
          return false;
        }
        if (UiComponentPart023.mixedSupport139State0009 == SoftwareFramebuffer.mixedSupport139State0012) {
          return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new CollectionSupport001(this));
    }

    final static void performAction1710(int integerArgument1) {
        try {
          Throwable caughtExceptionLocal1 = null;
          java.lang.reflect.Method methodLocal2 = null;
          Exception exceptionLocal3 = null;
          Runtime runtimeLocal4 = null;
          Throwable throwableLocal5 = null;
          Long longLocal6 = null;
          Object[] objectArrayLocal7 = null;
          try {
            methodLocal2 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (integerArgument1 != 1) {
              stringState0509 = (String) null;
            }
            if (methodLocal2 == null) {
              return;
            }
            try {
              runtimeLocal4 = Runtime.getRuntime();
              objectArrayLocal7 = (Object[]) null;
              longLocal6 = (Long) (methodLocal2.invoke((Object) (runtimeLocal4), (Object[]) null));
              DualNodeDeque.integerState0015 = 1 + (int)(longLocal6.longValue() / 1048576L);
              return;
            } catch (java.lang.Throwable caughtParameterLocal8) {
              caughtExceptionLocal1 = caughtParameterLocal8;
              throwableLocal5 = caughtExceptionLocal1;
              return;
            }
          } catch (java.lang.Exception caughtParameterLocal9) {
            caughtExceptionLocal1 = caughtParameterLocal9;
            exceptionLocal3 = (Exception) (Object) caughtExceptionLocal1;
            return;
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal10) {
          throw uncheckedExceptionLocal10;
        } catch (Throwable checkedExceptionLocal11) {
          throw new RuntimeException(checkedExceptionLocal11);
        }
    }

    final static void performAction1705(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, int integerArgument5, byte byteArgument6, int integerArgument7) {
        String stringLocal1 = null;
        if (byteArgument6 == -41) {
          if (NetworkSupport010.integerState0585 == 2) {
            stringLocal1 = GameDomainSupport006.stringState0625;
          } else {
            stringLocal1 = MixedSupport095.stringState0376;
          }
          UiComponentPart024.performAction1450(integerArgument4, integerArgument3, booleanArgument2, integerArgument5, stringLocal1, byteArgument6 + 168, integerArgument1, integerArgument7);
          return;
        }
    }

    public static void performAction1713(int integerArgument1) {
        sceneWidgetArrayState0004 = null;
        stringState0508 = null;
        stringArrayState0045 = null;
        stringState0510 = null;
        rgbSpriteArrayState0026 = null;
        nodeDequeState0031 = null;
        stringState0506 = null;
        stringState0505 = null;
        rgbSpriteState0055 = null;
        stringState0509 = null;
        stringState0507 = null;
        if (integerArgument1 != 0) {
          rgbSpriteState0055 = (RgbSprite) null;
        }
    }

    NodeHashTable(int integerArgument1) {
        int integerLocal1 = 0;
        HashNode cachedHashNodeLocal2 = null;
        HashNode hashNodeLocal3 = null;
        this.integerState0748 = integerArgument1;
        this.hashNodeArrayState0002 = new HashNode[integerArgument1];
        for (integerLocal1 = 0; integerArgument1 > integerLocal1; integerLocal1++) {
          cachedHashNodeLocal2 = new HashNode();
          hashNodeLocal3 = cachedHashNodeLocal2;
          this.hashNodeArrayState0002[integerLocal1] = cachedHashNodeLocal2;
          hashNodeLocal3.next = hashNodeLocal3;
          hashNodeLocal3.previous = hashNodeLocal3;
        }
    }

    static {
        stringState0505 = "Mute this player for 48 hours";
        nodeDequeState0031 = new NodeDeque();
        stringState0508 = "Unrated game";
        stringArrayState0045 = new String[]{"Bucket size", "Speed", "Colours", "Special items", "Shape feedback"};
        stringState0506 = "You cannot add yourself!";
        stringState0507 = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        stringState0509 = "You are not currently logged in to the<nbsp>game.";
        stringState0510 = "Connecting to<br>friend server...";
    }
}
