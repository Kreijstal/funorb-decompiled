/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int field_c;
    static int field_d;
    static int field_a;
    static rd field_b;

    final static void b(int param0) {
        if (param0 > -1) {
          cj.a(-25, -30, -99, -115);
        }
    }

    final static pb[] a(int param0, int param1, int param2, int param3) {
        if (param3 == -17768) {
          return a.a(param1, param0, 1, -128, param2);
        }
        field_a = 35;
        return a.a(param1, param0, 1, -128, param2);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          field_b = (rd) null;
        }
    }

    final static String a(long param0, byte param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = stellarshard.field_B;
        if (0L >= param0) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        if (param1 <= -54) {
          var3 = 0;
          var4 = param0;
          while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
          }
          var6 = new StringBuilder(var3);
          while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = wb.field_d[(int)(var7 - param0 * 37L)];
            if (var9 == 95) {
              var10 = -1 + var6.length();
              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
              var9 = 160;
            }
            discarded$0 = var6.append((char) var9);
          }
          var6.reverse();
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        return (String) null;
    }

    static {
        ef.a(50, (byte) 63);
        field_b = new rd();
    }
}
