/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib implements nl {
    static int field_b;
    static int field_a;

    final static boolean b(int param0) {
        if (param0 != 23517) {
          ib.a(54);
          if (ki.field_h == null) {
            return false;
          }
          if (vo.field_l.a((byte) -90)) {
            return true;
          }
          return false;
        }
        if (ki.field_h == null) {
          return false;
        }
        if (vo.field_l.a((byte) -90)) {
          return true;
        }
        return false;
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ja var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param4.field_y + param3;
          var7 = param4.field_i + param1;
          ng.a(1, var6_int, param4.field_n, var7, param4.field_w);
          if (param2 != -15112) {
            return;
          }
          var8 = rj.field_I[1];
          if (param4 instanceof gn &&
            ((gn) (param4)).field_G) {
            var8.e(var6_int + 1 + (-var8.field_z + param4.field_n >> 1), (param4.field_w - var8.field_u >> 1) + var7 + 1, 256);
          }
          if (!param4.c(124)) {
            return;
          }
          hl.a(2 + var7, 2 + var6_int, (byte) 111, param4.field_n - 4, param4.field_w - 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("ib.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != param0) {
          return qb.field_a[param0];
        }
        if (!iq.a((byte) 98, param2)) {
          return qb.field_a[param0];
        }
        return 29;
    }

    final static void a(int param0) {
        if (a.field_b == 10) {
          ji.b(117);
          a.field_b = 11;
        } else {
          if (!re.b(-113)) {
            ji.b(117);
            a.field_b = 11;
          }
        }
        if (param0 > -37) {
          ib.a(74);
        }
        eb.field_p = true;
    }

    final static we a(byte param0, jd param1) {
        RuntimeException var2 = null;
        we stackIn_2_0 = null;
        we stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 112) {
            stackIn_4_0 = tf.a(uj.a(param1, 100, 96), (byte) -98);
            return stackIn_4_0;
          }
          stackIn_2_0 = (we) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ib.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
