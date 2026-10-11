/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends hf implements ai {
    static int field_T;
    private wp field_P;
    private long field_W;
    private wp field_Q;
    private pk field_S;
    static dt field_O;
    static String field_R;
    static int field_U;
    static ri[] field_V;

    final void a(int param0, int param1, pk param2, int param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          super.a(param0, 74, param2, param3);
          if (sl.field_d) {
            param2.c((byte) 116);
          }
          var7 = -26 / ((param1 + 25) / 45);
          var5_long = -this.field_W + wq.a(-118);
          var8 = (int)((10999L - var5_long) / 1000L);
          if (var8 > 0) {
            this.field_S.field_m = "" + var8;
          } else {
            ib.d(1);
            this.e(true);
            this.field_E.a((byte) 121, new u(this.field_E, ta.field_f));
          }
          if (this.field_D &&
            null == gk.field_o) {
            this.e(true);
            this.field_E.a((byte) 97, new u(this.field_E, am.field_e));
          }
          if (null != gk.field_o) {
            if (!gk.field_o.field_a) {
              return;
            }
            this.e(true);
            this.field_E.a((byte) 122, new u(this.field_E, am.field_e));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("qk.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3;
          if (var5_int == 99) {
            this.field_Q.a((pk) (this), (byte) 61);
            return true;
          }
          if (var5_int == 98) {
            this.field_P.a((pk) (this), (byte) 61);
            return true;
          }
          if (param2 <= 9) {
            this.field_W = 89L;
          }
          stackIn_10_0 = super.a(param0, param1, (byte) 13, param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("qk.KA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    qk(dg param0) {
        super(param0, 200, 200);
        pk var3 = null;
        try {
          this.field_W = wq.a(-97);
          var3 = new pk(ha.field_d, (qm) null);
          var3.field_p = 100;
          var3.field_v = 50;
          var3.field_q = this.field_q;
          var3.field_r = 0;
          var3.field_w = (mh) ((Object) new gm(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(var3, 89);
          this.field_S = new pk(ha.field_d, (qm) null);
          this.field_S.field_v = var3.field_p + (var3.field_v + 20);
          this.field_S.field_q = this.field_q;
          this.field_S.field_r = 0;
          this.field_S.field_p = 80;
          this.field_S.field_w = (mh) ((Object) new gm(tq.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(this.field_S, 117);
          this.field_P = this.a((qm) (this), 20556, km.field_m);
          this.field_Q = this.a((qm) (this), 20556, up.field_b);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final wp a(qm param0, int param1, String param2) {
        wp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wp stackIn_2_0 = null;
        wp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new wp(param2, param0);
          var4.field_w = (mh) ((Object) new ue());
          var5 = this.field_p - 6;
          this.field_p = this.field_p + 38;
          var4.a(114, 15, var5, 30, -16 + this.field_q - 14);
          this.a(var4, param1 - 20458);
          if (param1 != 20556) {
            stackIn_2_0 = (wp) null;
            return stackIn_2_0;
          }
          this.c(false);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("qk.E(");
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void e(boolean param0) {
        if (!param0) {
          this.field_W = -123L;
          if (this.field_D) {
            this.field_D = false;
            return;
          }
          return;
        }
        if (this.field_D) {
          this.field_D = false;
          return;
        }
    }

    public static void g(byte param0) {
        field_R = null;
        if (param0 != -43) {
          qk.g((byte) -2);
          field_V = null;
          field_O = null;
          return;
        }
        field_V = null;
        field_O = null;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_P == param2) {
            this.e(true);
          } else {
            if (param2 == this.field_Q) {
              ib.d(param1 ^ 711);
              this.e(true);
            }
          }
          if (param1 == 710) {
            return;
          }
          field_U = 24;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("qk.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_T = 0;
        field_R = "Unfortunately we are unable to create an account for you at this time.";
    }
}
