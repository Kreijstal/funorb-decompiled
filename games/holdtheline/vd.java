/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vd {
    static long field_a;
    static String field_e;
    static String field_d;
    static oa field_b;
    static int[] field_c;

    abstract void a(float param0, int[] param1, int param2, int[] param3, byte param4);

    final static int[] c(int param0) {
        if (param0 != 1023) {
            vd.b(-2);
            return new int[8];
        }
        return new int[8];
    }

    final static ch a(gn param0, int param1, int param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        if (param1 == 65535) {
          var4 = param0.b(15950, param2);
          var3 = var4;
          if (var4 == null) {
            return null;
          } else {
            return new ch(var4);
          }
        } else {
          return null;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        if (param1 >= -109) {
            return;
        }
        param0.setFocusTraversalKeysEnabled(false);
        param0.addKeyListener((java.awt.event.KeyListener) (Object) tf.field_n);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) tf.field_n);
    }

    final static String a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return rd.field_e.j(-1231);
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 >= -37) {
          String discarded$2 = vd.a(43);
          field_c = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<img=12>";
        field_d = "Please enter your age in years";
        field_c = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
