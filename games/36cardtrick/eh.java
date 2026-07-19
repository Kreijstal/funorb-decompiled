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
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Main.field_T;
        if (0L < param1) {
          if ((param1 ^ -1L) > -6582952005840035282L) {
            if (param1 % 37L == (long)param0) {
              return null;
            } else {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (-1L == (param1 ^ -1L)) {
                      discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = il.field_f[(int)(-(37L * param1) + var7)];
                        if (var9 == 95) {
                          var10 = var6.length() - 1;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          var9 = 160;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      discarded$3 = var6.append((char) var9);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean d(int param0) {
        boolean discarded$0 = false;
        if (param0 != 19314) {
            discarded$0 = eh.d(-9);
            return gh.field_g;
        }
        return gh.field_g;
    }

    eh() {
    }

    static {
    }
}
