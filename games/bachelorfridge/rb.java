/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends bca {
    nq field_q;
    static String field_r;

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        op var4 = null;
        mea stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (op) null;
            this.a((op) null, -23);
          }
          stackIn_3_0 = new mea(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    rb(int param0, nq param1, nq param2) {
        super(param0, param1);
        try {
          this.field_q = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, lu param1) {
        try {
          super.a((byte) -124, param1);
          if (param0 > -12) {
            rb.d((byte) -104);
          }
          er.a(this.field_q, 117, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_r = null;
        int var1 = 53 % ((25 - param0) / 44);
    }

    rb(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.field_k = param0.e((byte) 91);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              break;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
          this.field_q = qi.a(param0, (byte) 75);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(op param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          int var3_int = 68 % ((12 - param1) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_r = "Staff impersonation";
    }
}
