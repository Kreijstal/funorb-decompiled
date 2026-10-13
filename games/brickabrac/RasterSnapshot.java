/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterSnapshot extends IntrusiveNode {
    int clipTop;
    static String field_l;
    int height;
    static boolean field_j;
    static int field_q;
    static String[] field_r;
    int clipLeft;
    int clipBottom;
    int width;
    static String field_s;
    int clipRight;
    int[] pixels;

    final void capture(int[] pixels, int clipLeft, int width, int height, int obfuscationGuard, int clipRight, int clipTop, int clipBottom) {
        this.clipBottom = clipBottom;
        this.width = width;
        this.clipLeft = clipLeft;
        this.clipTop = clipTop;
        this.height = height;
        this.clipRight = clipRight;
        if (obfuscationGuard != -161) {
          return;
        }
        try {
          this.pixels = pixels;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ii.A(" + (pixels != null ? "{...}" : "null") + ',' + clipLeft + ',' + width + ',' + height + ',' + obfuscationGuard + ',' + clipRight + ',' + clipTop + ',' + clipBottom + ')');
        }
    }

    final static boolean a(boolean param0, char param1) {
        if (param1 >= 32) {
          if (126 >= param1) {
            return true;
          }
          if (!param0) {
            return true;
          }
          if (param1 >= 160 &&
            255 >= param1) {
            return true;
          }
        } else {
          if (!param0) {
            return true;
          }
          if (param1 < 160) {
            if (param1 == 8364) {
              return true;
            }
            if (param1 == 338) {
              return true;
            }
            if (param1 == 8212) {
              return true;
            }
            if (param1 == 339) {
              return true;
            }
            if (param1 == 376) {
              return true;
            }
            return false;
          }
          if (255 >= param1) {
            return true;
          }
        }
        if (param1 == 8364) {
          return true;
        }
        if (param1 == 338) {
          return true;
        }
        if (param1 == 8212) {
          return true;
        }
        if (param1 == 339) {
          return true;
        }
        if (param1 != 376) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 == 20888) {
          field_l = null;
          field_r = null;
          field_s = null;
          return;
        }
        field_l = (String) null;
        field_l = null;
        field_r = null;
        field_s = null;
    }

    RasterSnapshot() {
    }

    static {
        field_r = new String[16];
        field_l = "Only show lobby chat from my friends";
        field_q = 2;
        field_s = "<%0> installed";
    }
}
