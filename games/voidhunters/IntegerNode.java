/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerNode extends IntrusiveNode {
    int value;

    IntegerNode(int param0) {
        this.value = param0;
    }

    final static void setAsteroidFieldForRevisionUpdates(AsteroidField param0, byte param1) {
        try {
          PlayerLeave.asteroidFieldForRevisionUpdates = param0;
          int var2_int = -25 % ((param1 + 15) / 51);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hua.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
