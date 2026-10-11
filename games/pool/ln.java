/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends ma {
    static String field_l;
    static vh field_q;
    static String[] field_r;
    static tk field_n;
    static vh[] field_v;
    static int field_o;
    static dd[] field_s;
    static int field_t;
    static boolean field_p;
    static int[] field_m;
    static so[] field_u;

    private ln() throws Throwable {
        throw new Error();
    }

    final static dd[] a(int param0, byte param1, di param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        dd[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vj.a(param0, param2, param3, (byte) 121)) {
            return null;
          }
          var4_int = -39 / ((param1 + 12) / 57);
          stackIn_4_0 = sg.h(152);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ln.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, eg param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var7 = Pool.field_O;
        try {
          d.a(param2, -23109);
          var4 = (param2.field_D + param2.field_w) / 2;
          var5 = (param2.field_y + param2.field_S) / 2;
          var6 = (param2.field_x + param2.field_V) / 2;
          for (var3_int = 0; param2.field_g.length > var3_int; var3_int++) {
            param2.field_g[var3_int] = param2.field_g[var3_int] - var4;
          }
          for (var3_intLifetime1 = param1; var3_intLifetime1 < param2.field_Y.length; var3_intLifetime1++) {
            param2.field_Y[var3_intLifetime1] = param2.field_Y[var3_intLifetime1] - var5;
          }
          for (var3_intLifetime2 = 0; param2.field_q.length > var3_intLifetime2; var3_intLifetime2++) {
            param2.field_q[var3_intLifetime2] = param2.field_q[var3_intLifetime2] - var6;
          }
          param0[0] = var4;
          param0[2] = var6;
          param0[1] = var5;
          param2.a();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ln.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_q = null;
        field_r = null;
        field_u = null;
        field_v = null;
        field_s = null;
        field_n = null;
        field_l = null;
        if (param0 != 27817) {
          field_m = (int[]) null;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
          field_l = (String) null;
        }
        ph.a((byte) 118);
    }

    static {
        field_l = "Hide";
        field_m = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_t = 0;
    }
}
