/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FireworkDisplay {
    static String field_b;
    static Sprite[] field_a;
    private FireworkBurst[] field_c;
    static String field_i;
    static boolean field_e;
    private int[] field_f;
    static Sprite field_d;
    static Sprite[] field_h;
    static String field_j;
    static LoginCredentials field_g;

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_h = null;
        field_d = null;
        field_g = null;
        field_b = null;
        if (param0 > 12) {
          field_j = null;
          field_i = null;
          return;
        }
        String var2 = (String) null;
        FireworkDisplay.setLoadingStatus(0.3477739989757538f, -63, (String) null);
        field_j = null;
        field_i = null;
    }

    final void draw(byte param0) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = -1 + this.field_c.length;
        if (param0 == -123) {
          while (0 <= var2) {
            if (this.field_c[var2] != null) {
              this.field_c[var2].draw(-904);
            }
            var2--;
          }
        } else {
          field_d = (Sprite) null;
          while (0 <= var2) {
            if (this.field_c[var2] != null) {
              this.field_c[var2].draw(-904);
            }
            var2--;
          }
        }
    }

    final static void setLoadingStatus(float param0, int param1, String param2) {
        try {
          ThreeSliceButtonPainter.field_r = param2;
          PicturePreview.field_o = param0;
          if (param1 != -1) {
            FireworkDisplay.releaseStatics((byte) -73);
          }
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "li.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    FireworkDisplay(int param0, int param1, int[] param2) {
        try {
          this.field_f = param2;
          this.field_c = new FireworkBurst[param0];
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "li.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void launchBurst(int param0, int param1, byte param2, int param3, int param4) {
        int var6;
        int var7;
        int var6Lifetime1;
        var7 = Pixelate.field_H ? 1 : 0;
        if (param2 == 116) {
          for (var6 = -1 + this.field_c.length; var6 >= 0; var6--) {
            if (this.field_c[var6] == null) {
              this.field_c[var6] = new FireworkBurst(param1, param4, param0, param3, this.field_f);
            } else {
              if (this.field_c[var6].advance(true)) {
                this.field_c[var6] = new FireworkBurst(param1, param4, param0, param3, this.field_f);
              }
            }
          }
          return;
        }
        field_e = true;
        for (var6Lifetime1 = -1 + this.field_c.length; var6Lifetime1 >= 0; var6Lifetime1--) {
          if (this.field_c[var6Lifetime1] == null) {
            this.field_c[var6Lifetime1] = new FireworkBurst(param1, param4, param0, param3, this.field_f);
          } else {
            if (this.field_c[var6Lifetime1].advance(true)) {
              this.field_c[var6Lifetime1] = new FireworkBurst(param1, param4, param0, param3, this.field_f);
            }
          }
        }
    }

    static {
        field_b = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_e = false;
        field_g = null;
        field_j = "<%0> has been removed.";
    }
}
