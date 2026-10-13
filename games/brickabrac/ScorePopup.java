/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScorePopup extends IntrusiveNode {
    static String field_j;
    String text;
    int y256;
    static RgbSprite[] field_r;
    int x256;
    static mf field_l;
    static hl field_m;
    static int field_p;
    static RgbSprite[] field_k;
    int remainingTicks;

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          mg.c();
          LevelPackCard.field_k = 11;
          ClientException.field_a = new int[260];
          var2 = -120 / ((param0 - 32) / 49);
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var3 = 15.0;
            ClientException.field_a[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var3) * 255.0);
          }
          var6 = 256;
          var1_intLifetime1 = var6;
          while (ClientException.field_a.length > var6) {
            ClientException.field_a[var6] = 255;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1), "ul.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_k = null;
        field_m = null;
        if (param0 >= -41) {
          return;
        }
        field_r = null;
        field_j = null;
    }

    final static RgbSprite[] a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 34) {
          ScorePopup.a(19);
        }
        return hj.a(1, (byte) -110, param1, param3, param0);
    }

    final static void a(int param0, vm param1, int param2, boolean param3, int param4) {
        try {
          dc.field_e.a(param2, !param3 ? true : false, param0, (byte) 22, 1000000, param1);
          int var5_int = 88 / ((-16 - param4) / 38);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ul.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != 255) {
          field_k = (RgbSprite[]) null;
        }
        return la.a(param1, 255, 255);
    }

    final boolean advance(boolean obfuscationGuard) {
        this.y256 = this.y256 - 256;
        if (obfuscationGuard) {
          return false;
        }
        int nextRemainingTicks = this.remainingTicks - 1;
        this.remainingTicks = this.remainingTicks - 1;
        return nextRemainingTicks != 0 ? true : false;
    }

    ScorePopup(int points, int x256, int y256) {
        this.y256 = y256;
        this.remainingTicks = 50;
        this.x256 = x256;
        this.text = Integer.toString(points);
    }

    static {
        field_j = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_p = 256;
    }
}
