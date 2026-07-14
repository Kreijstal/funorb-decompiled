/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static tf field_c;
    static int[] field_b;
    static int field_a;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            return;
        }
        field_c = null;
    }

    final static String a(boolean param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        String var7 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        var7 = Integer.toString(param1);
        var3 = var7.length();
        if (var3 <= 3) {
          return var7;
        } else {
          L0: {
            var4 = var3 % 3;
            if (-1 == (var4 ^ -1)) {
              var4 = 3;
              break L0;
            } else {
              break L0;
            }
          }
          var5 = new StringBuilder((var3 - var4) / 3);
          if (!param0) {
            StringBuilder discarded$6 = var5.append(var7.substring(0, var4));
            var2 = var7.substring(var4);
            L1: while (true) {
              if ((var2.length() ^ -1) >= -1) {
                return var5.toString();
              } else {
                StringBuilder discarded$7 = var5.append(wl.field_f);
                StringBuilder discarded$8 = var5.append(var2.substring(0, 3));
                var2 = var2.substring(3);
                continue L1;
              }
            }
          } else {
            field_a = 72;
            StringBuilder discarded$9 = var5.append(var7.substring(0, var4));
            var2 = var7.substring(var4);
            L2: while (true) {
              if ((var2.length() ^ -1) >= -1) {
                return var5.toString();
              } else {
                StringBuilder discarded$10 = var5.append(wl.field_f);
                StringBuilder discarded$11 = var5.append(var2.substring(0, 3));
                var2 = var2.substring(3);
                continue L2;
              }
            }
          }
        }
    }

    final static void a(int param0, long param1, String param2, byte param3, int param4) {
        ih.field_f = param0;
        ej.field_a = param1;
        ck.field_g = param2;
        if (param3 != 9) {
          field_c = null;
          jo.field_r = true;
          kk.field_a = param4;
          return;
        } else {
          jo.field_r = true;
          kk.field_a = param4;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
