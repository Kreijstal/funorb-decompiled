/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static long field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(boolean param0) {
        return sd.field_h;
    }

    final static void a(int param0) {
        if (param0 <= 104) {
            return;
        }
        nj.c(-113);
        oi.a(4, 20665);
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var3 = tg.a(param2, -4097);
          if (param1 <= -17) {
            break L0;
          } else {
            of.a(111);
            break L0;
          }
        }
        var4 = u.a(-123, param2);
        var5 = tg.a(param0, -4097);
        var6 = u.a(-116, param0);
        var7 = (int)((long)var5 * (long)var3 >> 16);
        var8 = (int)((long)var3 * (long)var6 >> 16);
        var9 = (int)((long)var5 * (long)var4 >> 16);
        var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    static {
    }
}
