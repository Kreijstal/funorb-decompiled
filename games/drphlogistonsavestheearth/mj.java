/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mj extends l {
    static volatile int field_u;
    static he[] field_w;
    static nh field_v;
    static String field_t;

    mj(int param0) {
        this(uh.field_i, param0);
    }

    final static String a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -41 % ((param0 + 59) / 35);
          stackIn_1_0 = p.a(param1.length, (byte) 79, param1, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("mj.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    mj(rf param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_x, -1, 2147483647, false);
    }

    public static void c(int param0) {
        field_t = null;
        field_v = null;
        field_w = null;
        if (param0 != 2147483647) {
          byte[] var2 = (byte[]) null;
          mj.a((byte) 69, (byte[]) null);
        }
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            aj.a(param2.field_w, param4 + param2.field_o, param2.field_m + param3, param2.field_k, 60);
          }
          super.a(param0, 127, param2, param3, param4);
          if (param1 >= 94) {
            return;
          }
          mj.c(-42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("mj.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 114) {
          return true;
        }
        return !ib.field_f.a(false) ? true : false;
    }

    static {
        field_u = -1;
        field_t = "Easy";
    }
}
