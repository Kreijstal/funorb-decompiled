/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends pe {
    static String field_q;
    private Object field_s;
    static hb[] field_p;
    static int[] field_r;

    final static void a(byte param0, String param1) {
        try {
          ei.a(param1, param0 ^ -35);
          nf.a(false, ab.field_p, -104);
          if (param0 != -15) {
            tk.c(false);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "tk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(byte param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        rk var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param0 > -39) {
            tk.i(92);
          }
          if (!(param2 instanceof byte[])) {
            if (!(param2 instanceof rk)) {
              throw new IllegalArgumentException();
            }
            var4 = (rk) (param2);
            stackIn_14_0 = var4.a(31);
            return stackIn_14_0;
          }
          var3 = (byte[]) (param2);
          if (param1) {
            stackIn_11_0 = na.a(-12, var3);
            return stackIn_11_0;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("tk.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static boolean c(boolean param0) {
        if (param0) {
          return false;
        }
        return d.field_b.a((byte) -127);
    }

    tk(Object param0, int param1) {
        super(param1);
        try {
          this.field_s = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static qc a(int param0, int param1, int[] param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        qc var9 = null;
        RuntimeException var9_ref = null;
        qc stackIn_2_0 = null;
        qc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new qc(param1, param3, param0, param7, param5, param8, param2);
          sb.field_c.a(var9, -7044);
          ah.a(false, param4, var9);
          if (param6 <= -89) {
            stackIn_4_0 = var9;
            return stackIn_4_0;
          }
          stackIn_2_0 = (qc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_7_0 = var9_ref;
          stackIn_7_1 = new StringBuilder().append("tk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public static void i(int param0) {
        field_p = null;
        field_r = null;
        if (param0 <= 107) {
          tk.c(true);
          field_q = null;
          return;
        }
        field_q = null;
    }

    final boolean g(int param0) {
        if (param0 < 110) {
          this.h(-105);
          return false;
        }
        return false;
    }

    final Object h(int param0) {
        if (param0 != 31476) {
          this.field_s = (Object) null;
          return this.field_s;
        }
        return this.field_s;
    }

    static {
        field_r = new int[8192];
        field_q = "From only <%0>/month";
    }
}
