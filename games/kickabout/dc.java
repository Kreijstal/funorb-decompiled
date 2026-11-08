/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static UiLayoutNode field_a;
    static int field_d;
    static Sprite field_b;
    static int field_c;

    final static void moveToFront(int param0, byte param1) {
        PlayerPortraitCacheEntry var2 = null;
        int var3 = 0;
        int var4 = Kickabout.field_G;
        try {
          var2 = NamedValueEntry.field_f[param0];
          if (param1 < 25) {
            field_d = 122;
          }
          for (var3 = param0; var3 > 0; var3--) {
            NamedValueEntry.field_f[var3] = NamedValueEntry.field_f[var3 - 1];
          }
          NamedValueEntry.field_f[0] = var2;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "dc.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = 119 / ((param0 - 14) / 60);
        field_a = null;
        field_b = null;
    }

    static {
        field_b = new Sprite(104, 150);
        field_c = -1;
    }
}
