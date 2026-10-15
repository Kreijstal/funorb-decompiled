/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerRemainderHelpers {
    static String field_e;
    static RgbSprite field_b;
    static RgbSprite field_d;
    static volatile long field_c;
    static String field_a;

    final static int nonnegativeRemainder(int obfuscationGuard, int divisor, int value) {
        int var3 = value >> 31 & -1 + divisor;
        if (obfuscationGuard == -1560508993) {
          return var3 + ((value >>> 31) + value) % divisor;
        }
        field_e = (String) null;
        return var3 + ((value >>> 31) + value) % divisor;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 == -121) {
          field_e = null;
          return;
        }
        IntegerRemainderHelpers.nonnegativeRemainder(-124, 122, -66);
        field_e = null;
    }

    static {
        field_e = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_c = 0L;
        field_a = "Accept draw";
    }
}
