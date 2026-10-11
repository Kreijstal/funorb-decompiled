/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends jc {
    static String field_y;
    private int field_x;
    private hj[] field_A;
    static boolean[] field_w;
    private int field_u;
    static String field_v;
    private int field_z;

    final static void a(int param0, boolean param1) {
        kb.field_m = 0;
        tk.field_n = 0;
        h.field_A = og.field_b;
        le.field_c = param0;
        wj.field_k = new ml(2);
        wj.field_k.a(-1, ka.a(24316, ua.field_a, vl.field_d), 0, param1);
    }

    public static void b(byte param0) {
        if (param0 > -52) {
          return;
        }
        field_v = null;
        field_w = null;
        field_y = null;
    }

    final static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        ab.field_h = new im();
    }

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param3 != -4394) {
            vk.b((byte) 66);
          }
          if (!param2.field_t) {
            stackIn_8_0 = (param2.d(-81)) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var6_int = stackIn_8_0;
          if (param2 instanceof s) {
            param4 = param4 & ((s) (param2)).field_F;
          }
          if (!param4) {
            stackIn_15_0 = this.field_z;
          } else {
            if (var6_int != 0) {
              stackIn_15_0 = this.field_u;
            } else {
              stackIn_15_0 = this.field_x;
            }
          }
          var7 = stackIn_15_0;
          rl.a(this.field_A, param2.field_m, 2, param0 + param2.field_n + (param2.field_r - this.field_A[0].field_t >> 1), var7, param1 + param2.field_s);
          stackIn_18_0 = (param4) ? 16777215 : 7105644;
          var8 = stackIn_18_0;
          this.field_g.a(param2.field_l, param2.field_s + param1, param2.field_n + param0 - 2, param2.field_m, param2.field_r, var8, -1, 1, 1, this.field_g.field_H);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("vk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(ca param0, byte param1, ca param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_c) {
            param0.b(57);
          }
          param0.field_c = param2.field_c;
          param0.field_e = param2;
          param0.field_c.field_e = param0;
          param0.field_e.field_c = param0;
          if (param1 == -65) {
            return;
          }
          field_y = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vk.AA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public vk() {
        this(2188450, 2591221, 9543);
    }

    private vk(int param0, int param1, int param2) {
        this.field_g = qc.field_b;
        this.field_A = ea.field_b;
        this.field_u = param1;
        this.field_x = param0;
        this.field_z = param2;
    }

    static {
        field_y = "To server list";
        field_w = new boolean[64];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$0b89e0d19fbb(ca param0, int param1, ca param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_c) {
            param0.b(57);
          }
          param0.field_c = param2.field_c;
          param0.field_e = param2;
          param0.field_c.field_e = param0;
          param0.field_e.field_c = param0;
          if (param1 == -65) {
            return;
          }
          field_y = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vk.AA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }
}
