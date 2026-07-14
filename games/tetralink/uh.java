/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uh {
    static String field_d;
    static hl field_f;
    static hl field_e;
    static long[] field_c;
    static java.awt.Canvas field_b;
    static String field_a;

    final static oh[] a(int param0, int param1, ah param2, int param3) {
        if (param1 == 0) {
          if (!ia.a(param0, param2, param3, -60)) {
            return null;
          } else {
            return gd.e((byte) 76);
          }
        } else {
          field_e = null;
          if (!ia.a(param0, param2, param3, -60)) {
            return null;
          } else {
            return gd.e((byte) 76);
          }
        }
    }

    final int a(byte param0, long param1) {
        long var4 = 0L;
        if (param0 != -70) {
          L0: {
            field_c = null;
            var4 = ((uh) this).b((byte) -58);
            if (0L < var4) {
              tb.a(false, var4);
              break L0;
            } else {
              break L0;
            }
          }
          return ((uh) this).a(param1, (byte) 52);
        } else {
          L1: {
            var4 = ((uh) this).b((byte) -58);
            if (0L < var4) {
              tb.a(false, var4);
              break L1;
            } else {
              break L1;
            }
          }
          return ((uh) this).a(param1, (byte) 52);
        }
    }

    abstract void a(int param0);

    abstract long b(byte param0);

    final static hl b(int param0) {
        if (param0 != 32) {
            field_e = null;
            return wa.a(57);
        }
        return wa.a(57);
    }

    abstract int a(long param0, byte param1);

    public static void a(byte param0) {
        if (param0 != 41) {
          hl discarded$2 = uh.b(-116);
          field_b = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new long[32];
        field_d = "Show lobby chat from my friends";
        field_a = "Quit to website";
    }
}
