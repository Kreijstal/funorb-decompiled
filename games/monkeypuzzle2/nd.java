/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nd implements Iterator {
    private bf field_h;
    static le field_b;
    private ni field_c;
    private bf field_f;
    static boolean field_a;
    static String[] field_g;
    static int[] field_d;
    static int field_e;

    public final void remove() {
        if (!(((nd) this).field_h != null)) {
            throw new IllegalStateException();
        }
        ((nd) this).field_h.a(7847);
        ((nd) this).field_h = null;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 127) {
            field_b = null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    public final Object next() {
        bf var1 = ((nd) this).field_f;
        if (var1 == ((nd) this).field_c.field_b) {
            var1 = null;
            ((nd) this).field_f = null;
        } else {
            ((nd) this).field_f = var1.field_g;
        }
        ((nd) this).field_h = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((nd) this).field_c.field_b != ((nd) this).field_f;
    }

    final static String a(byte param0) {
        if (!ac.field_b) {
          if (cj.field_e <= ka.field_a) {
            if (id.field_a + cj.field_e <= ka.field_a) {
              if (param0 <= -125) {
                return null;
              } else {
                return null;
              }
            } else {
              return pf.field_b;
            }
          } else {
            if (param0 <= -125) {
              return null;
            } else {
              return null;
            }
          }
        } else {
          if (param0 <= -125) {
            return null;
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param5 != -23487) {
          field_b = null;
          L0: while (true) {
            param1--;
            if (-1 >= (param1 ^ -1)) {
              var19 = param3;
              var17 = var19;
              var10 = var17;
              var11 = param0;
              var12 = param9;
              var13 = param8;
              var14 = param6;
              var15 = var19[var11] >> -443497791 & 8355711;
              var10[var11] = ch.a(var14 >> -1821127087, 255) - -ch.a(var13 >> 854824393, 65280) - -ch.a(16711680, var12 >> 1641302977) + var15;
              param9 = param9 + param4;
              param0++;
              param6 = param6 + param2;
              param8 = param8 + param7;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param1--;
            if (-1 >= (param1 ^ -1)) {
              var18 = param3;
              var17 = var18;
              var10 = var17;
              var11 = param0;
              var12 = param9;
              var13 = param8;
              var14 = param6;
              var15 = var18[var11] >> -443497791 & 8355711;
              var10[var11] = ch.a(var14 >> -1821127087, 255) - -ch.a(var13 >> 854824393, 65280) - -ch.a(16711680, var12 >> 1641302977) + var15;
              param9 = param9 + param4;
              param0++;
              param6 = param6 + param2;
              param8 = param8 + param7;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    nd(ni param0) {
        ((nd) this).field_h = null;
        ((nd) this).field_c = param0;
        ((nd) this).field_h = null;
        ((nd) this).field_f = ((nd) this).field_c.field_b.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new le(36, 36);
        field_d = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
