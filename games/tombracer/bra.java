/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bra extends ofa implements tsa {
    static String[] field_M;
    private rj field_N;
    private rj field_L;
    static iu field_O;

    private final void f(int param0) {
        if (param0 != -25050) {
          this.field_N = (rj) null;
          if (!this.field_B) {
            return;
          }
          this.field_B = false;
          return;
        }
        if (!this.field_B) {
          return;
        }
        this.field_B = false;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 98) {
            if (this.field_L == null) {
              this.field_N.a((ae) (this), false);
              return true;
            }
            this.field_L.a((ae) (this), false);
            return true;
          }
          if (param2 == 99) {
            this.field_N.a((ae) (this), false);
            return true;
          }
          if (!param3) {
            this.f(-100);
          }
          stackIn_13_0 = super.a(param0, param1, param2, true);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("bra.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_O = null;
        field_M = null;
        if (param0 != 86) {
          bra.i((byte) -117);
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 44) {
            field_M = (String[]) null;
          }
          if (param2 == this.field_L) {
            pg.b(false);
            this.f(-25050);
            return;
          }
          if (param2 != this.field_N) {
            return;
          }
          this.f(-25050);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("bra.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    bra(jta param0) {
        super(param0, 200, 130);
        ae var2 = null;
        try {
          var2 = new ae(jba.field_l, (qc) null);
          var2.field_m = this.field_m;
          var2.field_i = 0;
          var2.field_p = 80;
          var2.field_n = 50;
          var2.field_r = (isa) ((Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(var2, -1);
          if (vpa.a(94)) {
            this.field_L = this.a(ae.field_k, (byte) 91, (qc) (this));
          }
          this.field_N = this.a(kh.field_j, (byte) 54, (qc) (this));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bra.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final rj a(String param0, byte param1, qc param2) {
        rj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rj stackIn_2_0 = null;
        rj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new rj(param0, param2);
          var4.field_r = (isa) ((Object) new td());
          var5 = this.field_p - 6;
          this.field_p = this.field_p + 38;
          var4.a((byte) -31, -30 + this.field_m, 30, 15, var5);
          this.a(var4, -1);
          this.c((byte) -72);
          if (param1 > 25) {
            stackIn_4_0 = var4;
            return stackIn_4_0;
          }
          stackIn_2_0 = (rj) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("bra.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_M = new String[255];
    }
}
