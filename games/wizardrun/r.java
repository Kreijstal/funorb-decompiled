/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r implements dk {
    static qc field_b;
    private long field_f;
    static int field_e;
    static oi field_d;
    static String field_c;
    static int field_a;

    final static o[] a(int param0, kl param1, int param2, int param3) {
        RuntimeException var4 = null;
        o[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        o[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 13469) {
            stackIn_2_0 = (o[]) null;
            return stackIn_2_0;
          }
          if (h.a(param3, param0, param1, -120)) {
            stackIn_7_0 = dc.a(19999);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (o[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("r.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final ok a(boolean param0) {
        if (this.b(7245)) {
          return va.field_o;
        }
        if (!(d.a((byte) 25) >= this.field_f + 350L)) {
          return nf.field_c;
        }
        if (!param0) {
          field_b = (qc) null;
        }
        return this.b(true);
    }

    abstract String b(byte param0);

    abstract ok b(boolean param0);

    final static void c(int param0) {
        o var1 = null;
        o var2 = null;
        int var3 = 0;
        int var4 = wizardrun.field_H;
        try {
          var1 = new o(540, 140);
          ud.a(var1, false);
          cj.c();
          ed.d();
          jd.field_f = 0;
          gf.k(param0 ^ -301);
          var2 = var1.e();
          for (var3 = 0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            ed.c(4, 4, 0, 0, 540, 140);
          }
          ag.field_t.b();
          var1.a(0, 0);
          if (param0 != 350) {
            field_a = 72;
          }
          bb.b(4);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "r.N(" + param0 + ')');
        }
    }

    public final String a(int param0) {
        if (param0 != -2864) {
          this.a(false);
        }
        if (this.b(7245)) {
          return null;
        }
        if ((this.field_f + 350L) > d.a((byte) 29)) {
          return null;
        }
        return this.b((byte) -82);
    }

    public static void d(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        if (param0 < 105) {
          r.d(-68);
        }
    }

    public final void a(byte param0) {
        if (param0 >= -59) {
          return;
        }
        this.field_f = d.a((byte) 31);
    }

    static {
        field_d = new oi();
        field_c = "Use the arrow keys to move.";
    }
}
