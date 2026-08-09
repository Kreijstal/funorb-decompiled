/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends ug {
    int[] field_g;
    static int field_f;
    int field_e;

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            gl.a(param1, 0, var3, param0, var2_int);
            stackIn_1_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("bk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static a a(boolean param0) {
        byte[] var2;
        if (jk.field_x != null) {
          if (!param0) {
            var2 = (byte[]) null;
            bk.a(121, (byte[]) null);
            return jk.field_x;
          } else {
            return jk.field_x;
          }
        } else {
          jk.field_x = new a(pf.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, pf.field_c.field_C, -1, 2147483647, true);
          if (param0) {
            return jk.field_x;
          } else {
            var2 = (byte[]) null;
            bk.a(121, (byte[]) null);
            return jk.field_x;
          }
        }
    }

    private bk() throws Throwable {
        throw new Error();
    }

    static {
        field_f = -1;
    }
}
