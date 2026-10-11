/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends qb {
    int field_i;
    int field_j;
    int field_m;
    int field_g;
    int[] field_h;
    static int field_l;
    int field_n;
    int field_k;

    final static boolean a(int param0) {
        if (param0 != 37) {
          field_l = 28;
          return ja.field_b.a(2);
        }
        return ja.field_b.a(2);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        if (param3 <= 102) {
          return;
        }
        try {
          this.field_h = param6;
          this.field_k = param7;
          this.field_m = param4;
          this.field_g = param2;
          this.field_i = param0;
          this.field_n = param1;
          this.field_j = param5;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "eh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Main.field_T;
        if (0L >= param1) {
          return null;
        }
        if (param1 >= 6582952005840035281L) {
          return null;
        }
        if (param1 % 37L != (long)param0) {
          var3 = 0;
          var4 = param1;
          while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
          }
          var6 = new StringBuilder(var3);
          while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = il.field_f[(int)(-(37L * param1) + var7)];
            if (var9 == 95) {
              var10 = var6.length() - 1;
              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
              var9 = 160;
            }
            discarded$0 = var6.append((char) var9);
          }
          var6.reverse();
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        return null;
    }

    final static boolean d(int param0) {
        if (param0 != 19314) {
          eh.d(-9);
          return gh.field_g;
        }
        return gh.field_g;
    }

    eh() {
    }

    static {
    }
}
