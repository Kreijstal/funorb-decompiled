/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq {
    private int field_d;
    static int field_g;
    private int field_b;
    private int field_f;
    static pl field_c;
    private boolean field_a;
    static l field_e;

    final int c(int param0) {
        if (param0 == 1) {
          return !this.field_a ? this.field_f : this.field_b;
        }
        this.c(-33);
        return !this.field_a ? this.field_f : this.field_b;
    }

    public static void b(int param0) {
        if (param0 != 0) {
          return;
        }
        field_c = null;
        field_e = null;
    }

    final static hea a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hea var3 = null;
        hea stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = -71 / ((5 - param1) / 35);
          var3 = new hea(param0, ak.field_p, pg.field_C, mq.field_b, iga.field_m, ck.field_c);
          loa.a((byte) 123);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("fq.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        CharSequence var4 = null;
        fna.field_k = vc.field_q.e((byte) -76);
        if (param0 == -68) {
          var4 = (CharSequence) ((Object) fna.field_k);
          tia.field_b = jd.a(1, var4);
          return;
        }
        byte[] var2 = (byte[]) null;
        fq.a((byte[]) null, (byte) 68);
        CharSequence var3 = (CharSequence) ((Object) fna.field_k);
        tia.field_b = jd.a(1, var3);
    }

    final void a(kh param0, int param1) {
        try {
          if (param1 != 23) {
            this.a(-16);
          }
          param0.a((byte) 118, !this.field_a ? 0 : 1, 1);
          param0.a((byte) -125, this.field_d, 2);
          param0.a((byte) -128, this.field_b, 8);
          param0.a((byte) 64, this.field_f, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fq.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(byte param0) {
        if (param0 > -44) {
          return 74;
        }
        return this.field_b;
    }

    final boolean a(int param0) {
        if (param0 != -25584) {
          return true;
        }
        return this.field_a;
    }

    fq() {
        this.field_f = 0;
        this.field_b = 10;
    }

    fq(int param0, kh param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_f = 0;
        this.field_b = 10;
        try {
          if (param0 >= 11) {
            stackIn_5_1 = (param1.b((byte) 44, 1) == 1);
            this.field_a = stackIn_5_1;
          }
          if (param0 < 13) {
            this.field_b = 10;
            this.field_d = 0;
          } else {
            this.field_d = param1.b((byte) 44, 2);
            this.field_b = param1.b((byte) 44, 8);
          }
          if (param0 >= 23 &&
            param0 < 26) {
            param1.b((byte) 44, 8);
          }
          if (param0 < 24) {
            this.field_f = 100;
            return;
          }
          this.field_f = param1.b((byte) 44, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("fq.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_c = new pl(0);
    }
}
