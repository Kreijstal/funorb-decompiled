/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static int[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0) {
        if (param0 >= -28) {
            return false;
        }
        return null != jf.field_a ? true : im.field_e;
    }

    final static ha a(java.awt.Canvas param0, byte param1, int param2, d param3) {
        if (param1 != 66) {
          field_a = (int[]) null;
          return (ha) (Object) new wl(param0, param3, param2);
        } else {
          return (ha) (Object) new wl(param0, param3, param2);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 2800) {
            field_a = (int[]) null;
        }
    }

    static {
    }
}
