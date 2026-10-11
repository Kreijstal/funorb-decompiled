/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends pi {
    static String field_s;
    static String field_n;
    static int field_w;
    private int field_o;
    private int field_u;
    private int field_r;
    private int field_q;
    private int field_v;
    static rc[] field_t;
    private int field_p;

    final boolean a(byte param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        this.field_p = this.field_p + this.field_r;
        this.field_u = this.field_u + 800;
        this.field_o = this.field_o + this.field_v;
        this.field_v = this.field_v + 4;
        if (param0 == -126) {
          var2 = -li.field_c + (this.field_p >> 4);
          var3 = (this.field_o >> 4) - db.field_d;
          if (0 > var2) {
            return true;
          }
          if (640 < var2) {
            return true;
          }
          if (var3 < 0) {
            return true;
          }
          if (var3 > 480) {
            return true;
          }
          if (this.field_v <= 0) {
            return false;
          }
          if (!je.field_I[(this.field_p >> 4) / 32][(this.field_o >> 4) / 32].field_a) {
            return false;
          }
          return true;
        }
        field_t = (rc[]) null;
        var2Lifetime1 = -li.field_c + (this.field_p >> 4);
        var3Lifetime1 = (this.field_o >> 4) - db.field_d;
        if (0 > var2Lifetime1) {
          return true;
        }
        if (640 < var2Lifetime1) {
          return true;
        }
        if (var3Lifetime1 < 0) {
          return true;
        }
        if (var3Lifetime1 > 480) {
          return true;
        }
        if (this.field_v <= 0) {
          return false;
        }
        if (!je.field_I[(this.field_p >> 4) / 32][(this.field_o >> 4) / 32].field_a) {
          return false;
        }
        return true;
    }

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_n = (String) null;
          }
          var2 = oh.a(ah.a(-97, param0), 95);
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("dn.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 < -44) {
          field_s = null;
          field_t = null;
          field_n = null;
          return;
        }
        field_n = (String) null;
        field_s = null;
        field_t = null;
        field_n = null;
    }

    final static void a(bj param0, byte param1) {
        ea var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new ea(param0.a("", 0, "final_frame.jpg"), (java.awt.Component) ((Object) ef.field_c));
          var3 = var2.field_y;
          var4 = var2.field_C;
          ti.a((byte) -4);
          bl.field_x = new ea(var3, var4 * 3 / 4);
          bl.field_x.g();
          var2.g(0, 0);
          eg.field_b = new ea(var3, -bl.field_x.field_C + var4);
          eg.field_b.g();
          var2.g(0, -bl.field_x.field_C);
          eg.field_b.field_u = bl.field_x.field_C;
          tk.b(true);
          if (param1 == 29) {
            return;
          }
          field_w = -122;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = var2_ref;
          stackIn_5_1 = new StringBuilder().append("dn.E(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2 = -li.field_c + (this.field_p >> 4);
        int var3 = 56 % ((param0 - 21) / 42);
        int var4 = -db.field_d + (this.field_o >> 4);
        je.field_B[this.field_q % je.field_B.length].b(-120, var2, 2048, 65535 & this.field_u, var4);
    }

    final static int a(String param0, boolean param1, int param2, String param3, String param4, int param5, int param6) {
        pf var7 = null;
        RuntimeException var7_ref = null;
        pf var8 = null;
        String var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != -14543) {
            var9 = (String) null;
            dn.a((String) null, true, -124, (String) null, (String) null, -122, 43);
          }
          var7 = new pf(param3);
          var8 = new pf(param0);
          stackIn_3_0 = j.a(param2, param6 ^ 14565, param1, param5, var8, param4, var7);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("dn.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    dn(int param0, int param1, int param2, int param3, int param4) {
        this.field_o = param2 << 4;
        this.field_v = param4 - param2 << 4;
        this.field_q = param0;
        this.field_r = -param1 + param3 << 4;
        this.field_p = param1 << 4;
        int var6 = ub.a(-1237818874, this.field_v * this.field_v + this.field_r * this.field_r >> 4);
        this.field_r = (this.field_r << 3) / var6;
        this.field_v = -32;
    }

    static {
        field_s = "FROM ONLY";
        field_w = 0;
        field_n = "Log In/Register";
        field_t = new rc[25];
    }
}
