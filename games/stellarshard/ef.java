/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends lk {
    private ea field_m;
    private String field_l;
    static li field_n;
    static String field_o;
    private boolean field_k;

    final static void a(int param0, long param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            if (param0 != 11) {
              ef.a(true);
            }
            Thread.sleep(param1);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final cg a(byte param0, String param1) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        cg stackIn_2_0 = null;
        cg stackIn_7_0 = null;
        cg stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.a((byte) 86, param1) == qj.field_c) {
            stackIn_2_0 = qj.field_c;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_l)) {
            var3 = hi.a(param1, true);
            if (!var3.a(true)) {
              stackIn_7_0 = vk.field_d;
              return stackIn_7_0;
            }
            this.field_l = param1;
            this.field_k = var3.b(17);
          }
          if (param0 < 10) {
            this.field_m = (ea) null;
          }
          if (this.field_k) {
            stackIn_14_0 = lg.field_c;
          } else {
            stackIn_14_0 = qj.field_c;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ef.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        cj.field_a = 400 * param0 / 150;
        cj.field_c = 100 * param0 / 150;
        cj.field_d = (param0 << 16) / 150;
        if (param1 != 63) {
          field_n = (li) null;
        }
    }

    ef(ae param0, ae param1) {
        super(param0);
        this.field_l = "";
        this.field_k = false;
        try {
          this.field_m = new ea(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ef.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.a((byte) 22, param1) == qj.field_c) {
            stackIn_3_0 = this.field_m.b((byte) -58, param1);
            return stackIn_3_0;
          }
          var3_int = -107 % ((20 - param0) / 40);
          if (this.a((byte) 99, param1) != qj.field_c) {
            return oe.field_b;
          }
          stackIn_7_0 = wa.field_b;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ef.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        if (param0) {
          return;
        }
        field_o = null;
    }

    static {
        field_o = " seconds";
        field_n = new li(11, 0, 1, 2);
    }
}
