/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends o {
    static int field_o;
    int field_n;
    static String field_k;
    static bn[] field_l;
    long field_m;
    byte[] field_j;

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Chess.field_G;
        if (-1L > (param1 ^ -1L)) {
          if ((param1 ^ -1L) > -6582952005840035282L) {
            if (0L == param1 % (long)param0) {
              return null;
            } else {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if ((param1 ^ -1L) == -1L) {
                      StringBuilder discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = sa.field_a[(int)(var7 + -(param1 * 37L))];
                        if (95 != var9) {
                          break L2;
                        } else {
                          var10 = -1 + var6.length();
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          var9 = 160;
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append(var9);
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

    final static String a(int param0, CharSequence param1) {
        if (param0 >= -25) {
            km[] discarded$0 = tf.a(10, (byte) -9, -40);
            return cf.a(param1, -51, false);
        }
        return cf.a(param1, -51, false);
    }

    final static void a(int param0) {
        int var1 = (-640 + vi.field_d) / 2;
        int var2 = ug.field_b * ug.field_b;
        int var3 = -(an.field_e * an.field_e) + var2;
        ql.field_d.a(-(var3 * 199 / var2) + var1, 199, -2147483648, -4 + (-120 + (wb.field_c - param0)), 90);
        rb.field_c.a(var3 * 438 / var2 + (var1 - -202), 438, -2147483648, -120 + wb.field_c + -4, 0);
    }

    final static km[] a(int param0, byte param1, int param2) {
        if (param1 != -46) {
            field_k = null;
            return om.a(1, param0, param2, (byte) -87);
        }
        return om.a(1, param0, param2, (byte) -87);
    }

    public static void a(boolean param0) {
        field_k = null;
        if (param0) {
            return;
        }
        field_l = null;
    }

    tf(long param0, int param1, byte[] param2) {
        ((tf) this).field_j = param2;
        ((tf) this).field_m = param0;
        ((tf) this).field_n = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Unable to add friend - system busy";
    }
}
