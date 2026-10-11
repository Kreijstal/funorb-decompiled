/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends ej implements ai {
    static int field_Q;
    private s field_P;
    static int[] field_O;
    static int field_N;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, kc param7, kc param8, int param9, int param10, int param11, pf param12, int param13, int param14, pf param15, int param16, pf param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          ta.a(0, param8, param7, param13);
          nc.a(-101, param3, param10, param9, param1);
          jk.b(param11, param18, 249);
          if (param16 >= -78) {
            return;
          }
          fe.a(param2, param5, param12, param15, param20, -81);
          e.a(false, param4, param6, param17);
          l.a(0, param14, param19, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("gg.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param8 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
          param1.addMouseListener(nk.field_q);
          param1.addMouseMotionListener(nk.field_q);
          param1.addFocusListener(nk.field_q);
          if (param0 != -56) {
            field_Q = 118;
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "gg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    gg(sk param0, i param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        pj var4 = null;
        try {
          var3 = null;
          if (jm.field_a == param1) {
            var3 = dg.field_C;
          } else {
            if (hh.field_d == param1) {
              this.field_r = this.field_r + 10;
              var3 = fi.field_a;
              if (rc.b(-38)) {
                var3 = va.field_a;
                this.field_r = this.field_r + 20;
              }
            } else {
              if (param1 == pa.field_c) {
                var3 = lh.field_a;
                this.field_r = this.field_r + 30;
              }
            }
          }
          var4 = new pj((String) (var3), (ag) null);
          var4.field_n = 50;
          var4.field_m = this.field_m;
          var4.field_r = 80;
          var4.field_s = 0;
          var4.field_j = (td) ((Object) new jc(pc.field_bb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(var4, (byte) 74);
          this.field_P = this.a(th.field_d, 6, (ag) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gg.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void f(boolean param0) {
        if (!param0) {
          field_N = 83;
          field_O = null;
          return;
        }
        field_O = null;
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -74 % ((param0 + 3) / 62);
          if (param3 != this.field_P) {
            return;
          }
          this.p(126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("gg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void p(int param0) {
        if (!this.field_A) {
          return;
        }
        int var2 = -69 / ((param0 - 52) / 48);
        this.field_A = false;
    }

    private final s a(String param0, int param1, ag param2) {
        s var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        s stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new s(param0, param2);
          var4.field_j = (td) ((Object) new vk());
          var5 = this.field_r - param1;
          this.field_r = this.field_r + 38;
          var4.a(15, var5, 30, (byte) -90, -14 + this.field_m - 16);
          this.a(var4, (byte) 74);
          this.c(-26385);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("gg.N(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_Q = 0;
    }
}
