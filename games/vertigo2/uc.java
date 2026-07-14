/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static cr field_a;
    static char[] field_b;
    static String field_c;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 91) {
            uc.a(12);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0, boolean param1) {
        ie.b(20983, param1);
        if (param0 >= 97) {
            return;
        }
        field_a = null;
    }

    final static int a(String param0, boolean param1, boolean param2) {
        if (param2) {
            field_a = null;
            if (param1) {
                return gb.field_b.c(param0);
            }
            return mf.field_c.c(param0);
        }
        if (param1) {
            return gb.field_b.c(param0);
        }
        return mf.field_c.c(param0);
    }

    final static void a(byte param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          oo.c();
          bl.field_r = new int[260];
          hi.field_j = 11;
          if (param0 == 73) {
            break L0;
          } else {
            uc.a((byte) 69, true);
            break L0;
          }
        }
        var1 = 0;
        L1: while (true) {
          if (-257 >= (var1 ^ -1)) {
            var5 = 256;
            var1 = var5;
            L2: while (true) {
              if (var5 < bl.field_r.length) {
                bl.field_r[var5] = 255;
                var5++;
                continue L2;
              } else {
                return;
              }
            }
          } else {
            var2 = 15.0;
            bl.field_r[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
            var1++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new char[]{(char)91, (char)93, (char)35};
        field_c = "Password: ";
    }
}
