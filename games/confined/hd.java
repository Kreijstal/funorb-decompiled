/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static String field_a;
    static int field_b;
    static da field_e;
    static boolean field_d;
    static int field_f;
    static String field_c;

    final static String a(long param0, byte param1) {
        StringBuilder var13 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = Confined.field_J ? 1 : 0;
        long var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (0L == param0 % 37L) {
          return null;
        }
        int var3 = 0;
        long var4 = param0;
        if (param1 <= 59) {
          hd.a(98);
          while (var4 != 0L) {
            var4 = var4 / 37L;
            var3++;
          }
          var13 = new StringBuilder(var3);
          while (0L != param0) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = ud.field_q[(int)(var7 - param0 * 37L)];
            if (var9 == 95) {
              var10 = -1 + var13.length();
              var9 = 160;
              var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
            }
            discarded$0 = var13.append((char) var9);
          }
          var13.reverse();
          var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
          return var13.toString();
        }
        while (var4 != 0L) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var12 = new StringBuilder(var3);
        while (0L != param0) {
          var7Lifetime1 = param0;
          param0 = param0 / 37L;
          var9Lifetime1 = ud.field_q[(int)(var7Lifetime1 - param0 * 37L)];
          if (var9Lifetime1 == 95) {
            var10Lifetime1 = -1 + var12.length();
            var9Lifetime1 = 160;
            var12.setCharAt(var10Lifetime1, Character.toUpperCase(var12.charAt(var10Lifetime1)));
          }
          discarded$1 = var12.append((char) var9Lifetime1);
        }
        var12.reverse();
        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
        return var12.toString();
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
          hd.a(10L, (byte) 3);
          field_e = null;
          return;
        }
        field_e = null;
    }

    final static int a(int param0) {
        if (param0 <= 38) {
          field_a = (String) null;
          return oj.field_A;
        }
        return oj.field_A;
    }

    static {
        field_a = "Login: ";
        field_e = new da();
        field_c = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_f = 128;
    }
}
