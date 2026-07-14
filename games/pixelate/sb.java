/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static int field_a;
    private tf[] field_b;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        dk.a(param3, param4, (byte) 75, param1, param0, ((sb) this).field_b);
        if (param2 != -1) {
            Object var7 = null;
            int discarded$0 = sb.a(107, (String) null, false);
        }
    }

    final static int a(int param0, String param1, boolean param2) {
        if (param0 == 3) {
          if (param2) {
            return ma.field_y.c(param1);
          } else {
            return bg.field_j.c(param1);
          }
        } else {
          field_a = 28;
          if (param2) {
            return ma.field_y.c(param1);
          } else {
            return bg.field_j.c(param1);
          }
        }
    }

    sb(tf[] param0) {
        ((sb) this).field_b = param0;
    }

    final static String a(int param0, int param1) {
        int var8 = Pixelate.field_H ? 1 : 0;
        String var2 = fg.field_e;
        String var3 = Integer.toString(param0);
        int var4 = var3.length();
        int var5 = var2.length();
        int var6 = var4 % 3;
        if (-1 == (var6 ^ -1)) {
            var6 = 3;
        }
        StringBuilder var7 = new StringBuilder((var4 + -var6) / param1 + var5);
        StringBuilder discarded$0 = var7.append(var2);
        StringBuilder discarded$1 = var7.append(var3.substring(0, var6));
        var3 = var3.substring(var6);
        while ((var3.length() ^ -1) < -1) {
            StringBuilder discarded$2 = var7.append(wl.field_f);
            StringBuilder discarded$3 = var7.append(var3.substring(0, 3));
            var3 = var3.substring(3);
        }
        return var7.toString();
    }

    static {
    }
}
