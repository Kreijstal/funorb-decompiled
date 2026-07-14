/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends kd {
    static int[] field_j;
    static int[] field_k;
    static int[] field_l;
    int field_h;
    static int[] field_m;
    static be[] field_i;

    public static void a(int param0) {
        field_j = null;
        field_i = null;
        field_m = null;
        field_l = null;
        int var1 = 59 % ((-67 - param0) / 55);
        field_k = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 3) {
            field_i = null;
            return bh.a(false, param0, -84);
        }
        return bh.a(false, param0, -84);
    }

    bd(int param0) {
        ((bd) this).field_h = param0;
    }

    final static void a(int param0, int param1) {
        kd var2 = null;
        int var3 = 0;
        tg var4 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        var4 = (tg) (Object) bg.field_c.a(true);
        L0: while (true) {
          if (var4 == null) {
            if (param1 != -4584) {
              return;
            } else {
              var2 = tl.field_h.a(true);
              L1: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  dd.a(53, param0);
                  var2 = tl.field_h.f(2);
                  continue L1;
                }
              }
            }
          } else {
            p.a(var4, param0, (byte) 24);
            var4 = (tg) (Object) bg.field_c.f(2);
            continue L0;
          }
        }
    }

    final static boolean c(boolean param0) {
        if (!param0) {
          if (jc.field_b != null) {
            if (gg.field_b != uf.field_m) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          bd.a(110, 10);
          if (jc.field_b != null) {
            if (gg.field_b != uf.field_m) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[128];
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_k = new int[8192];
    }
}
