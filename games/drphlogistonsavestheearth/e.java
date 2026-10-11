/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends ei {
    private nf field_r;
    static volatile int field_q;
    private boolean field_s;
    private String field_p;

    final static void e(int param0) {
        if (null != ng.field_c) {
          ng.field_c.a((byte) -20);
          if (null == af.field_g) {
            if (param0 == -20480) {
              rb.a((byte) -102);
              return;
            }
            field_q = 79;
            rb.a((byte) -102);
            return;
          }
          af.field_g.h((byte) 23);
          if (param0 != -20480) {
            field_q = 79;
            rb.a((byte) -102);
            return;
          }
          rb.a((byte) -102);
          return;
        }
        if (null != af.field_g) {
          af.field_g.h((byte) 23);
          if (param0 == -20480) {
            rb.a((byte) -102);
            return;
          }
          field_q = 79;
          rb.a((byte) -102);
          return;
        }
        if (param0 == -20480) {
          rb.a((byte) -102);
          return;
        }
        field_q = 79;
        rb.a((byte) -102);
    }

    e(kl param0, kl param1) {
        super(param0);
        this.field_p = "";
        this.field_s = false;
        try {
          this.field_r = new nf(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        if (param0 >= 101) {
          return (-20480 + param1 * 64) / 320 + 128;
        }
        e.a(21, 94);
        return (-20480 + param1 * 64) / 320 + 128;
    }

    final vh a(int param0, String param1) {
        vc var3 = null;
        RuntimeException var3_ref = null;
        vh stackIn_3_0 = null;
        vh stackIn_8_0 = null;
        vh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_r.a(param0, param1) == u.field_b) {
            stackIn_3_0 = u.field_b;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_p)) {
            var3 = jc.a((byte) 45, param1);
            if (!var3.a(false)) {
              stackIn_8_0 = nd.field_P;
              return stackIn_8_0;
            }
            this.field_p = param1;
            this.field_s = var3.b(-15493);
          }
          if (!this.field_s) {
            stackIn_13_0 = u.field_b;
          } else {
            stackIn_13_0 = ce.field_e;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("e.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_r.a(8192, param1) == u.field_b) {
            stackIn_3_0 = this.field_r.a((byte) 94, param1);
            return stackIn_3_0;
          }
          if (param0 <= 47) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          if (this.a(8192, param1) != u.field_b) {
            return fl.field_e;
          }
          stackIn_10_0 = ce.field_c;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("e.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -1) {
          return;
        }
        ib.field_f.a(param1, -87);
    }

    static {
        field_q = -1;
    }
}
