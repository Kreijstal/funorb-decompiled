/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport100 {
    static String stringState0398;
    static SceneWidget sceneWidgetState0095;
    static String stringState0399;
    static long longState0040;

    public static void performAction1380(int integerArgument1) {
        if (integerArgument1 >= 104) {
          sceneWidgetState0095 = null;
          stringState0399 = null;
          stringState0398 = null;
          return;
        }
        sceneWidgetState0095 = (SceneWidget) null;
        sceneWidgetState0095 = null;
        stringState0399 = null;
        stringState0398 = null;
    }

    final static void performAction1381(int integerArgument1, byte byteArgument2) {
        try {
          try {
            MixedSupport088.computeObject1241("resizing", byteArgument2 - 14511, UiComponentPart029.computeApplet1689(byteArgument2 ^ -25126), new Object[]{new Integer(integerArgument1)});
          } catch (Throwable throwable) {
          }
          if (byteArgument2 == -30) {
            return;
          }
          MixedSupport100.performAction1381(72, (byte) -105);
        } catch (RuntimeException | Error uncheckedExceptionLocal2) {
          throw uncheckedExceptionLocal2;
        } catch (Throwable checkedExceptionLocal3) {
          throw new RuntimeException(checkedExceptionLocal3);
        }
    }

    static {
        stringState0398 = "Create unrated game";
        stringState0399 = "Position";
    }
}
