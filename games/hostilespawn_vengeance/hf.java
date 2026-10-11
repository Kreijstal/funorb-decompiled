/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static jf field_g;
    static bd field_b;
    static int field_i;
    static wm field_c;
    static int field_a;
    static bd field_j;
    static String[] field_d;
    static bd field_e;
    static int field_h;
    static String field_f;

    final static pg a(byte param0, gb param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 29) {
            hf.a(true, -93);
          }
          if (rl.a(2884, param1, param2, param3)) {
            return rg.b(0);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("hf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_g = null;
        field_d = null;
        if (param0) {
          return;
        }
        field_c = null;
        field_j = null;
        field_e = null;
        field_b = null;
    }

    final synchronized static byte[] a(boolean param0, int param1) {
        byte[][] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var2 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (!param0) {
          return (byte[]) null;
        }
        if (param1 == 100 &&
          mb.field_i > 0) {
          fieldTemp$4 = rf.field_i;
          fieldTemp$5 = mb.field_i - 1;
          mb.field_i = mb.field_i - 1;
          var2_ref_byte__ = fieldTemp$4[fieldTemp$5];
          rf.field_i[mb.field_i] = null;
          return var2_ref_byte__;
        }
        if (param1 == 5000 &&
          gn.field_t > 0) {
          fieldTemp$6 = gn.field_t - 1;
          gn.field_t = gn.field_t - 1;
          var2_ref_byte__Lifetime1 = pl.field_i[fieldTemp$6];
          pl.field_i[gn.field_t] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param1 == 30000 &&
          gm.field_f > 0) {
          fieldTemp$7 = gm.field_f - 1;
          gm.field_f = gm.field_f - 1;
          var2_ref_byte__Lifetime2 = cn.field_m[fieldTemp$7];
          cn.field_m[gm.field_f] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (null != c.field_c) {
          for (var2 = 0; var2 < ni.field_a.length; var2++) {
            if (param1 == ni.field_a[var2] &&
              mg.field_e[var2] > 0) {
              dupTemp$8 = mg.field_e[var2] - 1;
              arrayValue$9 = c.field_c[var2];
              mg.field_e[var2] = dupTemp$8;
              var3 = arrayValue$9[dupTemp$8];
              c.field_c[var2][mg.field_e[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param1];
    }

    static {
        field_i = -1;
        field_g = new jf();
        field_f = "Retry";
    }
}
