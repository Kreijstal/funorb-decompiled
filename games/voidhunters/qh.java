/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends iw implements oo {
    private htb field_M;
    static String field_L;
    static String field_N;
    private htb field_K;
    static int field_J;

    private final void m(byte param0) {
        if (!this.field_z) {
          return;
        }
        this.field_z = false;
        if (param0 != -10) {
          this.field_M = (htb) null;
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 98) {
            if (null != this.field_K) {
              this.field_K.a(0, (shb) (this));
              return true;
            }
            this.field_M.a(0, (shb) (this));
            return true;
          }
          if (param0 != -15834) {
            qh.l((byte) 46);
          }
          if (param1 != 99) {
            stackIn_11_0 = super.a(-15834, param1, param2, param3);
            return stackIn_11_0;
          }
          this.field_M.a(0, (shb) (this));
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("qh.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void l(byte param0) {
        int var1 = 99 / ((-24 - param0) / 62);
        field_N = null;
        field_L = null;
    }

    qh(ida param0) {
        super(param0, 200, 130);
        shb var2 = null;
        try {
          var2 = new shb(dib.field_j, (sba) null);
          var2.field_g = 0;
          var2.field_f = 80;
          var2.field_r = 50;
          var2.field_h = this.field_h;
          var2.field_q = (wwa) ((Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(-18756, var2);
          if (fda.e((byte) 90)) {
            this.field_K = this.a((sba) (this), kg.field_s, 125);
          }
          this.field_M = this.a((sba) (this), wm.field_b, 125);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final htb a(sba param0, String param1, int param2) {
        htb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        htb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new htb(param1, param0);
          var4.field_q = (wwa) ((Object) new vva());
          if (param2 <= 123) {
            field_L = (String) null;
          }
          var5 = -6 + this.field_f;
          this.field_f = this.field_f + 38;
          var4.a(15, -14 + (this.field_h - 16), 30, 1, var5);
          this.b(-18756, var4);
          this.a(false);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("qh.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != this.field_K) {
            if (this.field_M == param3) {
              this.m((byte) -10);
            }
          } else {
            gnb.a(0);
            this.m((byte) -10);
          }
          if (param0 == 11) {
            return;
          }
          this.m((byte) 55);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("qh.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_L = "Fire grapples";
        field_N = "Email address is unavailable";
        field_J = 1;
    }
}
