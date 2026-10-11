/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oga extends bca {
    static String field_r;
    static volatile int field_q;
    nq field_s;
    static sna field_t;

    final void a(byte param0, lu param1) {
        try {
          super.a((byte) -67, param1);
          if (param0 > -12) {
            field_q = -39;
          }
          er.a(this.field_s, 112, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "oga.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        ema var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          rv.field_n = null;
          pw.field_w = null;
          ce.field_y = false;
          if (null != aa.field_l) {
            aa.field_l.d(116);
            aa.field_l = null;
          }
          iga.field_c = null;
          if (null != uma.field_M) {
            uma.field_M.d(112);
            uma.field_M = null;
          }
          ola.field_g = null;
          if (null != bia.field_g) {
            bia.field_g.d(79);
            bia.field_g = null;
          }
          wi.field_i = null;
          if (null != iga.field_c) {
            var3 = (ema) (iga.field_c.b((byte) -73));
            while (var3 != null) {
              var3.b(0);
              var3 = (ema) (iga.field_c.a(-25177));
            }
            iga.field_c = null;
          }
          if (param0 >= 7) {
            return;
          }
          field_t = (sna) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "oga.B(" + param0 + ')');
        }
    }

    final void a(op param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          int var3_int = -73 % ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "oga.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    oga(int param0, nq param1, nq param2) {
        super(param0, param1);
        try {
          this.field_s = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "oga.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 >= -96) {
          oga.e(-82);
          field_r = null;
          field_t = null;
          return;
        }
        field_r = null;
        field_t = null;
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        er stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new er(param1, this);
            return (at) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (at) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oga.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    oga(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.field_k = param0.e((byte) 122);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              break;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
          this.field_s = qi.a(param0, (byte) 78);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "oga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = 0;
        field_r = "Names cannot start or end with space or underscore";
    }
}
