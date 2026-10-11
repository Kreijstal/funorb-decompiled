/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends bca {
    static String field_s;
    static vr field_r;
    static String field_q;

    final void a(op param0, int param1) {
        aga var3 = null;
        try {
          var3 = this.field_l.a(63, param0);
          int var4 = 99 % ((param1 - 12) / 35);
          this.field_o.b((byte) 90);
          this.field_p = null == param0.a(var3, (byte) -92) ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "l.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    l(int param0, nq param1) {
        super(param0, param1);
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        lu var4 = null;
        tma stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (lu) null;
            this.a((byte) 112, (lu) null);
          }
          stackIn_3_0 = new tma(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("l.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        if (param0 >= -116) {
          l.d((byte) -64);
        }
    }

    l(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.field_k = param0.e((byte) 124);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              break;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
          this.field_p = 1 == param0.b(16711935) ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, lu param1) {
        pp var5 = null;
        int var4 = BachelorFridge.field_y;
        try {
          if (param0 > -12) {
            l.d((byte) -18);
          }
          param1.b(this.field_k, -125);
          param1.d(this.field_o.g(0), 0);
          var5 = (pp) (this.field_o.b((byte) 90));
          while (var5 != null) {
            var5.a(param1, (byte) -54);
            var5 = (pp) (this.field_o.c(0));
          }
          param1.d(this.field_p ? 1 : 0, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "l.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "This option cannot be combined with the current '<%0>' setting.";
        field_q = "Start Game";
    }
}
