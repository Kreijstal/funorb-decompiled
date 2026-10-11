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
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          var3 = new byte[var2_int];
          gl.a(param1, 0, var3, param0, var2_int);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("bk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static a a(boolean param0) {
        byte[] var2 = null;
        byte[] var2Lifetime1;
        if (jk.field_x == null) {
          jk.field_x = new a(pf.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, pf.field_c.field_C, -1, 2147483647, true);
          if (!param0) {
            var2 = (byte[]) null;
            bk.a(121, (byte[]) null);
            return jk.field_x;
          }
          return jk.field_x;
        }
        if (param0) {
          return jk.field_x;
        }
        var2Lifetime1 = (byte[]) null;
        bk.a(121, (byte[]) null);
        return jk.field_x;
    }

    private bk() throws Throwable {
        throw new Error();
    }

    static {
        field_f = -1;
    }
}
