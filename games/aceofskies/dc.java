/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends aa {
    static int field_f;
    static RenderSprite bulletSprite;
    el field_e;

    public static void c(int param0) {
        bulletSprite = null;
        if (param0 != -58) {
          dc.c(33);
        }
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_27_0 = false;
        if (param0 >= -67) {
          return false;
        }
        if (param1 < 48) {
          if (param1 < 65) {
            if (97 <= param1 &&
              122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_27_0 = (97 <= param1) && (122 >= param1);
          return stackIn_27_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (param1 >= 65 &&
          param1 <= 90) {
          return true;
        }
        if (97 > param1) {
          return false;
        }
        if (122 < param1) {
          return false;
        }
        return true;
    }

    private dc() throws Throwable {
        throw new Error();
    }

    static {
        field_f = 20;
    }
}
