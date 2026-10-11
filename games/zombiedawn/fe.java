/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends hp implements oa, hh {
    private hm field_I;
    private an field_K;
    static af field_M;
    static int field_O;
    static String field_J;
    static int[] field_G;
    static String field_L;
    static String field_F;
    private md field_N;
    static int field_H;

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(-119, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_6_0 = this.b((byte) 123, param2);
            return stackIn_6_0;
          }
          if (param1 == 99) {
            stackIn_9_0 = this.a(1, param2);
            return stackIn_9_0;
          }
          var5_int = -46 % ((-83 - param0) / 32);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("fe.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static v b(boolean param0) {
        v var1 = new v(gl.field_F, kd.field_pb, sl.field_d[0], bo.field_o[0], bn.field_c[0], uf.field_n[0], vj.field_m[0], j.field_a);
        no.f((byte) -36);
        if (param0) {
          return var1;
        }
        field_F = (String) null;
        return var1;
    }

    fe(md param0) {
        super(0, 0, 288, 0, (io) null);
        String var7 = null;
        int var3 = 0;
        vf var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_N = param0;
          this.field_K = new an(jb.field_c, (sk) null);
          this.field_K.field_h = (io) ((Object) new vm());
          var7 = s.a(1938762664, dn.field_J, new String[]{this.h(-107), this.e((byte) 125)});
          var3 = 20;
          var4 = new vf(ia.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, ia.field_e.field_I, -1, 2147483647, true);
          this.field_I = new hm(var7, var4);
          this.field_I.field_s = "";
          this.field_I.a(0, -21423, sm.field_b);
          this.field_I.a(1, -21423, sm.field_b);
          this.field_I.field_i = this.field_i - 40;
          this.field_I.field_v = (sk) (this);
          this.field_I.a(26, var3, true, this.field_i - 40);
          var3 = var3 + (15 + this.field_I.field_n);
          this.a(this.field_I, 10);
          var5 = 4;
          var6 = 200;
          this.field_K.a(33, var3, 300 - var6 >> 1, var6, 40);
          this.field_K.field_v = (sk) (this);
          this.a(this.field_K, 10);
          this.a(31, 0, 0, 300, var3 + (55 + var5));
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(hm param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        hm var7 = null;
        var6 = ZombieDawn.field_J;
        try {
          if (0 == param2) {
            nf.a(param1 - 108, "terms.ws");
          } else {
            if (param2 != 1) {
              if (2 == param2) {
                nf.a(12, "conduct.ws");
              }
            } else {
              nf.a(12, "privacy.ws");
            }
          }
          if (param1 == 120) {
            return;
          }
          var7 = (hm) null;
          this.a((hm) null, -81, 53, -37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fe.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        String discarded$1 = null;
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6) {
            discarded$1 = this.h(-70);
          }
          if (param2 != this.field_K) {
            return;
          }
          ed.a(param1 + 425);
          this.field_N.h((byte) -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("fe.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String e(byte param0) {
        if (param0 <= 78) {
          field_G = (int[]) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final String h(int param0) {
        int var2 = -124 % ((param0 - 81) / 34);
        return "<u=2164A2><col=2164A2>";
    }

    public static void a(int param0) {
        field_F = null;
        field_G = null;
        field_L = null;
        field_M = null;
        field_J = null;
        int var1 = 99 / ((29 - param0) / 38);
    }

    static {
        field_M = new af();
        field_L = "Please try again in a few minutes.";
        field_G = new int[]{39, 35};
        field_F = "Return to game";
        field_J = "MIASMA";
    }
}
