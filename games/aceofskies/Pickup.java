/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Pickup extends FlightBody {
    static RenderSprite[] field_i;
    static int menuRepeatDelay;
    int pickupCode;
    private static long[] field_l;
    int remainingTicks;
    static int field_j;

    public static void b(int param0) {
        field_i = null;
        if (param0 != 256) {
          field_l = (long[]) null;
        }
        field_l = null;
    }

    public Pickup() {
        super(new Vector2(0.0, 0.0));
        this.remainingTicks = 0;
        this.pickupCode = 0;
    }

    final void spawn(int pickupCode, int obfuscationGuard, Vector2 position) {
        try {
          this.position.setFrom(position, true);
          this.remainingTicks = 400;
          if (obfuscationGuard > -97) {
            Pickup.b(-119);
          }
          this.pickupCode = pickupCode;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wm.I(" + pickupCode + ',' + obfuscationGuard + ',' + (position != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        menuRepeatDelay = 4;
        field_l = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) == 1L) {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_l[var2] = var0;
        }
        field_j = 10;
    }
}
