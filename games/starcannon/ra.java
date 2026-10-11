/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends ik {
    static sk field_t;
    rb field_u;
    byte field_w;
    int field_v;
    static String field_y;
    static String field_x;

    final static re a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        re var9 = null;
        RuntimeException var9_ref = null;
        int[] var10 = null;
        re stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 >= -67) {
            var10 = (int[]) null;
            ra.a(58, -25, 122, -39, (int[]) null, 47, 64, -83, 118);
          }
          var9 = new re(param0, param7, param1, param2, param6, param3, param4);
          s.field_e.b(68, var9);
          vh.a(param8, var9, 0);
          stackIn_3_0 = var9;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_6_0 = var9_ref;
          stackIn_6_1 = new StringBuilder().append("ra.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final byte[] f(int param0) {
        if (this.field_r) {
          throw new RuntimeException();
        }
        if (this.field_u.field_g < this.field_u.field_f.length - this.field_w) {
          throw new RuntimeException();
        }
        if (param0 == 0) {
          return this.field_u.field_f;
        }
        this.f(-20);
        return this.field_u.field_f;
    }

    final int e(int param0) {
        if (this.field_u == null) {
          return 0;
        }
        if (param0 == -29144) {
          return 100 * this.field_u.field_g / (-this.field_w + this.field_u.field_f.length);
        }
        return 74;
    }

    public static void d(byte param0) {
        field_x = null;
        field_y = null;
        field_t = null;
        int var1 = -116 / ((54 - param0) / 34);
    }

    ra() {
    }

    static {
        field_t = new sk();
        field_y = "SIDE GUNS - Provides extra fire platforms for the Nova Ray's main gun, which support the front of the ship.";
        field_x = "FULL ACCESS";
    }
}
