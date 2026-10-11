/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int field_j;
    static int field_i;
    static int field_f;
    static String field_e;
    static String field_h;
    static int field_b;
    static String field_d;
    static SceneWidget field_a;
    static String[] field_g;
    static int[] field_c;

    final static String a(long param0, byte param1) {
        int var3 = 0;
        long var5 = 0L;
        StringBuilder var7 = null;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        StringBuilder discarded$0 = null;
        int var12 = SteelSentinels.obfuscationControl;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (0L != param0 % 37L) {
          int var4 = 84 % ((-56 - param1) / 53);
          var3 = 0;
          var5 = param0;
          while (var5 != 0L) {
            var3++;
            var5 = var5 / 37L;
          }
          var7 = new StringBuilder(var3);
          while (param0 != 0L) {
            var8 = param0;
            param0 = param0 / 37L;
            var10 = ec.field_a[(int)(-(37L * param0) + var8)];
            if (95 == var10) {
              var11 = -1 + var7.length();
              var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
              var10 = 160;
            }
            discarded$0 = var7.append((char) var10);
          }
          var7.reverse();
          var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
          return var7.toString();
        }
        return null;
    }

    final static int a(int param0, boolean param1, byte param2, int param3) {
        if (param2 != -66) {
          hh.a(false);
          return SceneWidget.i(104);
        }
        return SceneWidget.i(104);
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_c = null;
    }

    final static void a(String param0, String param1, int param2) {
        try {
          if (param2 != 50) {
            hh.a(28, true, (byte) -92, -82);
          }
          ma.a(false, (byte) -65, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "hh.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        k.a((byte) 24, 50);
        field_b = 0;
        field_h = "This entry doesn't match";
        field_e = "Encouraging rule breaking";
        field_d = "To <%0>: ";
    }
}
