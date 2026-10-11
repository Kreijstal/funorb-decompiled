/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends hi {
    static sk field_n;
    private boolean field_r;
    private String field_s;
    static String field_q;
    private ug field_o;
    static String field_p;

    final static sc a(String param0, String param1, int param2, ki param3, ki param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        sc stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param4.a(param1, 0);
          var7 = -47 / ((param2 + 46) / 46);
          var6 = param4.a(param0, 5187, var5_int);
          stackIn_1_0 = vi.a(-13449, param3, param4, var6, var5_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("b.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_q = null;
        if (param0 == -1) {
          field_p = null;
          field_n = null;
          return;
        }
        b.a((byte) 50, -105);
        field_p = null;
        field_n = null;
    }

    b(vi param0, vi param1) {
        super(param0);
        this.field_r = false;
        this.field_s = "";
        try {
          this.field_o = new ug(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o.a(param1, (byte) -99) == vh.field_h) {
            stackIn_2_0 = this.field_o.a(-11300, param1);
            return stackIn_2_0;
          }
          if (this.a(param1, (byte) -99) == vh.field_h) {
            stackIn_6_0 = pk.field_G;
            return stackIn_6_0;
          }
          if (param0 != -11300) {
            var4 = (String) null;
            this.a((String) null, (byte) 83);
          }
          stackIn_10_0 = wb.field_c;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("b.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 > 71) {
          return param1 >= 0 ? true : false;
        }
        ki var3 = (ki) null;
        b.a((String) null, (String) null, -123, (ki) null, (ki) null);
        return param1 >= 0 ? true : false;
    }

    final qd a(String param0, byte param1) {
        mi var3 = null;
        RuntimeException var3_ref = null;
        qd stackIn_2_0 = null;
        qd stackIn_7_0 = null;
        qd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o.a(param0, param1) == vh.field_h) {
            stackIn_2_0 = vh.field_h;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_s)) {
            var3 = cj.a((byte) -114, param0);
            if (!var3.a(false)) {
              stackIn_7_0 = uj.field_b;
              return stackIn_7_0;
            }
            this.field_s = param0;
            this.field_r = var3.b((byte) 67);
          }
          if (this.field_r) {
            stackIn_12_0 = nc.field_bb;
          } else {
            stackIn_12_0 = vh.field_h;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("b.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "Open in popup window";
        field_q = "ICE BEAM";
    }
}
