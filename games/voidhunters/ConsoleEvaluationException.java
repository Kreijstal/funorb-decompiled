/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleEvaluationException extends Exception {
    String message;
    static GameStateFactory field_a;

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
    }

    final static void rebuildInitializedCanvasMenu(byte param0) {
        if (!MouseInputUtilities.hasMenuInitializationStarted((byte) 44)) {
          return;
        }
        int var1 = -35 / ((-45 - param0) / 50);
        AsteroidFactory.buildCanvasMenu(2, false, 4);
    }

    ConsoleEvaluationException(String param0) {
        try {
          this.message = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gva.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
