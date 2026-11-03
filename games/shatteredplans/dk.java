/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static String field_c;
    static String field_a;
    static int[] field_b;

    public static void clearStatics(byte param0) {
        if (param0 >= 117) {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = (String) null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          var2_int = TertiaryListSequence.field_k;
          var3 = bb.field_b;
          var4 = SpriteState.field_u.field_nb.lineCount(param1, 500);
          int var5 = 7 % ((-9 - param0) / 60);
          var6 = SpriteState.field_u.field_nb.maxLineWidth(param1, 500) + 6;
          var7 = 2 + var4 * cr.field_c;
          var8 = uh.a(-38, var2_int, var6, 12);
          var9 = uq.a(20, 0, var7, var3);
          SoftwareRasterizer.drawRect(var8, var9, var6, var7, 0);
          SoftwareRasterizer.fillRect(1 + var8, 1 + var9, -2 + var6, var7 - 2, 16777088);
          SpriteState.field_u.field_nb.a(param1, var8 + 3, GzipInflater.field_i + (1 + var9 - SpriteState.field_u.field_nb.field_J), 500, 1000, 0, -1, 0, 0, cr.field_c);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "dk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isDigit(byte param0, char param1) {
        int var2 = 56 % ((param0 + 3) / 56);
        if (param1 < 48) {
          return false;
        }
        if (param1 <= 57) {
          return true;
        }
        return false;
    }

    static {
        field_a = "Find opponent";
        field_b = new int[4];
        field_c = "Report abuse";
    }
}
