/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends nv {
    private boolean field_s;
    static String field_q;
    static int[] field_o;
    private int field_t;
    private jma field_n;
    static jea[] field_p;
    static long field_r;

    final static tn a(cn param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        tn stackIn_2_0 = null;
        tn stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 15) {
            stackIn_2_0 = (tn) null;
            return stackIn_2_0;
          }
          var4 = param0.f(param1, 105);
          var3 = var4;
          if (var4 == null) {
            return null;
          }
          stackIn_7_0 = new tn(var4);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rb.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void k(int param0) {
        this.j((byte) 79);
        this.field_n.a((byte) -14, this.field_s);
        if (param0 != 5418) {
          this.c(false);
        }
    }

    rb(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_t = param1.b((byte) 44, 4);
          this.field_n = new jma(15, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void g(byte param0) {
        if (param0 <= -116) {
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        }
        rb.g((byte) 32);
        field_q = null;
        field_o = null;
        field_p = null;
    }

    final void a(boolean param0, kh param1) {
        if (param0) {
          return;
        }
        try {
          super.a(param0, param1);
          param1.a((byte) -127, this.field_t, 4);
          this.field_n.a(this.h((byte) 119), (byte) 88, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j(byte param0) {
        boolean stackIn_8_1 = false;
        int var2;
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_t;
        if (var3 == 0) {
          this.field_s = this.a((byte) 87);
          if (param0 == 79) {
            return;
          }
          this.g(91);
          return;
        }
        if (var3 == 1) {
          this.field_s = this.field_g.d(50, false);
          if (param0 == 79) {
            return;
          }
          this.g(91);
          return;
        }
        if (var3 != 2) {
          if (var3 == 3) {
            this.field_s = this.i(12340).f(8, 10915);
          }
          if (param0 == 79) {
            return;
          }
          this.g(91);
          return;
        }
        var2 = this.b(true).a(this.field_g.e(9648), this.field_g.c(-96), param0 ^ 79, 2, this.field_g.a((byte) 55), this.field_g.d(param0 - 76), this.e(6));
        stackIn_8_1 = !(var2 < (this.field_g.c(param0 ^ -51) >> 16) * (this.field_g.a((byte) 55) >> 16));
        this.field_s = stackIn_8_1;
        if (param0 == 79) {
          return;
        }
        this.g(91);
        return;
    }

    final void c(boolean param0) {
        super.c(param0);
        if (this.field_t == 0) {
          this.field_n.a((byte) -14, true);
        }
    }

    final int a(int param0, int param1) {
        if (param1 <= -48) {
          param0 = upa.a(this.field_s, param0, (byte) -53);
          return param0;
        }
        kh var4 = (kh) null;
        this.a(false, (kh) null);
        param0 = upa.a(this.field_s, param0, (byte) -53);
        return param0;
    }

    final void g(int param0) {
        super.g(param0);
        this.field_n.a((byte) 48, this.h((byte) 116));
    }

    final int a(boolean param0) {
        if (param0) {
          this.field_n = (jma) null;
          return 13;
        }
        return 13;
    }

    static {
        field_q = "Played";
        field_o = fqa.e(true);
    }
}
