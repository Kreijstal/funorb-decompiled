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
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        ch stackIn_2_0 = null;
        ch stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 65535) {
              var4 = param0.b(15950, param2);
              var3 = var4;
              if (var4 != null) {
                stackIn_7_0 = new ch(var4);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (ch) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("vd.F(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        if (param1 >= -109) {
            return;
        }
        try {
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener(tf.field_n);
            param0.addFocusListener(tf.field_n);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "vd.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(int param0) {
        if (param0 != -1) {
            return (String) null;
        }
        return rd.field_e.j(-1231);
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 >= -37) {
          vd.a(43);
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
        field_e = "<img=12>";
        field_d = "Please enter your age in years";
        field_c = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
