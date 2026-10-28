/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterSnapshot extends IntrusiveNode {
    int[] pixels;
    int clipBottom;
    int height;
    static IntrusiveDeque field_l;
    int clipRight;
    int clipTop;
    static String field_j;
    int width;
    static int[] field_k;
    int clipLeft;
    static int field_g;
    static Sprite[] field_m;

    final void setRasterState(int clipBottom, byte guard, int clipTop, int clipRight, int clipLeft, int height, int[] pixels, int width) {
        if (guard != 29) {
          return;
        }
        try {
          this.width = width;
          this.clipTop = clipTop;
          this.clipBottom = clipBottom;
          this.clipRight = clipRight;
          this.height = height;
          this.pixels = pixels;
          this.clipLeft = clipLeft;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "mi.D(" + clipBottom + ',' + guard + ',' + clipTop + ',' + clipRight + ',' + clipLeft + ',' + height + ',' + (pixels != null ? "{...}" : "null") + ',' + width + ')');
        }
    }

    final static void requestLogin(int guard, String password, String identifier) {
        try {
          AchievementQuery.requestLogin(false, identifier, false, password);
          if (guard != 0) {
            field_k = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "mi.C(" + guard + ',' + (password != null ? "{...}" : "null") + ',' + (identifier != null ? "{...}" : "null") + ')');
        }
    }

    final static String decodeCp1252(byte[] bytes, int guard) {
        String stackIn_8_2 = null;
        try {
          if (guard > 109) {
            String stackIn_4_0 = AccountMessagePanel.decodeCp1252(bytes.length, 0, bytes, (byte) -109);
            return stackIn_4_0;
          }
          String stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var2;
          StringBuilder stackIn_7_1 = new StringBuilder().append("mi.B(");
          if (bytes == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_l = null;
        field_j = null;
        field_m = null;
        if (guard <= 65) {
          field_m = (Sprite[]) null;
          field_k = null;
          return;
        }
        field_k = null;
    }

    RasterSnapshot() {
    }

    static {
        field_j = "You have <%0> unread messages!";
        field_l = new IntrusiveDeque();
    }
}
