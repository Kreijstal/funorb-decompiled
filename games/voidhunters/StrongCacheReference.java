/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StrongCacheReference extends CacheReference {
    static String[] field_n;
    static int[] field_m;
    static long field_p;
    private Object value;
    static NineSliceSprite field_o;

    final Object getValue(int param0) {
        if (param0 < 85) {
          this.getValue(-70);
          return this.value;
        }
        return this.value;
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        field_m = null;
        if (param0 != 5697) {
          return;
        }
        field_n = null;
    }

    StrongCacheReference(Object param0, int param1) {
        super(param1);
        try {
          this.value = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ska.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isSoft(byte param0) {
        if (param0 < 29) {
          this.getValue(-56);
          return false;
        }
        return false;
    }

    static {
        field_n = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_m = SetSniperCannonEnergyUsed.f((byte) 95);
    }
}
