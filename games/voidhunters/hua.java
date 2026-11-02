/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hua extends IntrusiveNode {
    int field_d;

    hua(int param0) {
        this.field_d = param0;
    }

    final static void a(AsteroidField param0, byte param1) {
        try {
          hg.field_b = param0;
          int var2_int = -25 % ((param1 + 15) / 51);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hua.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
