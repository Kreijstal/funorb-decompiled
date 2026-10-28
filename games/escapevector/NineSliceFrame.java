/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NineSliceFrame {
    private Sprite[] sprites;
    static String[] field_f;
    static String field_d;
    static String field_a;
    static String field_b;
    static String field_e;

    final void draw(int x, int y, int guard, int width, int height) {
        ld.drawNineSlice(height, this.sprites, 4, y, x, width);
        if (guard != -96) {
          this.draw(45, 104, 124, -52, 19);
        }
    }

    public static void releaseStatics(byte guard) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = null;
        if (guard != 86) {
          NineSliceFrame.isNameSeparator(true, 'ﾩ');
        }
    }

    NineSliceFrame(Sprite[] sprites) {
        try {
          this.sprites = sprites;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "fd.<init>(" + (sprites != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isNameSeparator(boolean guard, char character) {
        if (!guard) {
          NineSliceFrame.releaseStatics((byte) 47);
          if (160 == character) {
            return true;
          }
          if (character == 32) {
            return true;
          }
          if (character == 95) {
            return true;
          }
          if (character != 45) {
            return false;
          }
          return true;
        }
        if (160 == character) {
          return true;
        }
        if (character == 32) {
          return true;
        }
        if (character == 95) {
          return true;
        }
        if (character != 45) {
          return false;
        }
        return true;
    }

    static {
        field_d = "Become a member to get this expansion and...";
        field_f = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_b = "Name is available";
        field_a = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_e = "Tether will not reach - please land closer";
    }
}
