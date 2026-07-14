/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static char[] field_a;
    static boolean field_d;
    static int field_b;
    static int[] field_c;
    static wl field_e;

    final static int a(byte param0, dk[] param1) {
        int var2 = 0;
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        if (param0 == 2) {
          var2 = -2147483648;
          var3 = param1;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              if (2147483647 == (var2 ^ -1)) {
                return 0;
              } else {
                return var2;
              }
            } else {
              var5 = var3[var4];
              var6 = var5.field_i + var5.field_l;
              if (var2 < var6) {
                var2 = var6;
                var4++;
                var4++;
                continue L0;
              } else {
                var4++;
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 20;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        if (param0) {
            field_c = null;
        }
    }

    final static void a(int param0) {
        ll.a(70, 8, param0 ^ 12, am.field_k);
        if (-96 < (am.field_k ^ -1)) {
          if (param0 != 4) {
            field_b = -65;
            return;
          } else {
            return;
          }
        } else {
          if ((am.field_k ^ -1) <= -111) {
            dg.field_t.e((640 + -dg.field_t.field_A) / 2, fg.field_b);
            if (param0 == 4) {
              return;
            } else {
              field_b = -65;
              return;
            }
          } else {
            mf.a(fg.field_b, (-dg.field_t.field_A + 640) / 2, -(am.field_k * 4) + 440, dg.field_t, -122);
            if (param0 == 4) {
              return;
            } else {
              field_b = -65;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_b = 0;
    }
}
