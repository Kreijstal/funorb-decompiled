/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tda extends iw implements oo {
    static String field_O;
    private htb field_P;
    private shb field_J;
    static String field_M;
    private long field_L;
    private htb field_N;
    static volatile int field_K;

    final void a(int param0, int param1, int param2, shb param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        try {
          super.a(param0, param1, param2, param3);
          if (upb.field_c) {
            param3.f((byte) -34);
          }
          var5_long = -this.field_L + wt.a(false);
          var7 = (int)((-var5_long + 10999L) / 1000L);
          if (var7 > 0) {
            this.field_J.field_j = "" + var7;
          } else {
            spb.a((byte) -95);
            this.l((byte) -98);
            this.field_v.a(false, new mr(this.field_v, oca.field_a));
          }
          if (this.field_z &&
            psb.field_b == null) {
            this.l((byte) -98);
            this.field_v.a(false, new mr(this.field_v, bca.field_a));
          }
          if (psb.field_b != null) {
            if (!psb.field_b.field_a) {
              return;
            }
            this.l((byte) -98);
            this.field_v.a(false, new mr(this.field_v, bca.field_a));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("tda.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    tda(ida param0) {
        super(param0, 200, 200);
        shb var3 = null;
        try {
          this.field_L = wt.a(false);
          var3 = new shb(al.field_a, (sba) null);
          var3.field_g = 0;
          var3.field_h = this.field_h;
          var3.field_r = 50;
          var3.field_f = 100;
          var3.field_q = (wwa) ((Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(-18756, var3);
          this.field_J = new shb(al.field_a, (sba) null);
          this.field_J.field_r = 20 + var3.field_r + var3.field_f;
          this.field_J.field_g = 0;
          this.field_J.field_h = this.field_h;
          this.field_J.field_f = 80;
          this.field_J.field_q = (wwa) ((Object) new bob(vob.field_r, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(-18756, this.field_J);
          this.field_N = this.a((byte) -104, (sba) (this), amb.field_b);
          this.field_P = this.a((byte) -73, (sba) (this), fja.field_r);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tda.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            field_O = (String) null;
          }
          if (param3 == this.field_N) {
            this.l((byte) -98);
            return;
          }
          if (this.field_P != param3) {
            return;
          }
          spb.a((byte) -95);
          this.l((byte) -98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("tda.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    private final htb a(byte param0, sba param1, String param2) {
        htb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        htb stackIn_2_0 = null;
        htb stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -21) {
            stackIn_2_0 = (htb) null;
            return stackIn_2_0;
          }
          var4 = new htb(param2, param1);
          var4.field_q = (wwa) ((Object) new vva());
          var5 = this.field_f - 6;
          this.field_f = this.field_f + 38;
          var4.a(15, -16 + this.field_h - 14, 30, 1, var5);
          this.b(-18756, var4);
          this.a(false);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("tda.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        int var5_int = 0;
        int var6 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 != -15834) {
            this.field_J = (shb) null;
          }
          var5_int = param1;
          if (var5_int == 99) {
            this.field_P.a(param0 + 15834, (shb) (this));
            return true;
          }
          if (var5_int != 98) {
            stackIn_12_0 = super.a(param0 ^ 0, param1, param2, param3);
            return stackIn_12_0;
          }
          this.field_N.a(param0 ^ -15834, (shb) (this));
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("tda.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_M = null;
        if (param0 != 29914) {
          field_M = (String) null;
          field_O = null;
          return;
        }
        field_O = null;
    }

    private final void l(byte param0) {
        if (!this.field_z) {
          return;
        }
        if (param0 != -98) {
          return;
        }
        this.field_z = false;
    }

    static {
        field_O = "This game is full.";
        field_M = "Hide lobby chat";
        field_K = 0;
    }
}
