/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends cj implements cm, ij {
    static s field_J;
    private pn field_L;
    private d field_P;
    private oe field_E;
    static int[] field_G;
    static String field_K;
    static String[] field_F;
    static int[] field_M;
    static String field_H;
    static int field_O;
    static er field_N;

    private final String a(byte param0) {
        if (param0 != -88) {
          ue.b((byte) 47, 58);
        }
        return "</col></u>";
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = -34 % ((-63 - param2) / 51);
          if (this.field_P == param1) {
            fj.g((byte) -123);
            this.field_E.h((byte) 114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_5_0 = var6;
          stackIn_5_1 = new StringBuilder().append("ue.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void b(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 77) {
          ue.b((byte) -108, -114);
        }
        tc.field_b = param1;
        if (ld.field_b != da.field_i) {
          var2 = ld.field_b * ld.field_b;
          var3 = var2 - da.field_i * da.field_i;
          param1 = param1 + (-param1 + ce.field_b) * var3 / var2;
        }
        td.field_c.a(91, 640, 120, param1, ml.field_w);
        rg.a(640, r.field_j, 0, -24 + ce.field_b, param0 - 4880, ia.field_G, 5);
    }

    ue(oe param0) {
        super(0, 0, 288, 0, (ur) null);
        String var7 = null;
        int var3 = 0;
        va var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_E = param0;
          this.field_P = new d(vi.field_x, (uf) null);
          this.field_P.field_B = (ur) ((Object) new vo());
          var7 = Vertigo2.a(new String[]{this.a(0), this.a((byte) -88)}, hi.field_n, -127);
          var3 = 20;
          var4 = new va(qc.field_x, 0, 0, 0, 0, 16777215, -1, 3, 0, qc.field_x.field_z, -1, 2147483647, true);
          this.field_L = new pn(var7, var4);
          this.field_L.field_q = "";
          this.field_L.a(0, 0, fm.field_c);
          this.field_L.a(1, 0, fm.field_c);
          this.field_L.field_v = (uf) (this);
          this.field_L.field_n = -40 + this.field_n;
          this.field_L.b(26, var3, (byte) 119, -40 + this.field_n);
          var3 = var3 + (15 + this.field_L.field_s);
          this.c((byte) 87, this.field_L);
          var5 = 4;
          var6 = 200;
          this.field_P.a(false, 300 - var6 >> 1, var3, 40, var6);
          this.field_P.field_v = (uf) (this);
          this.c((byte) 77, this.field_P);
          this.a(false, 0, 0, var5 + (55 + var3), 300);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String a(int param0) {
        if (param0 != 0) {
          d var3 = (d) null;
          this.a(-116, (d) null, (byte) -51, -31, 41);
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.a(32345, param3);
            return stackIn_7_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.b((byte) -95, param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ue.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void a(pn param0, int param1, int param2, byte param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param3 != 70) {
            return;
          }
          if (0 != param1) {
            if (param1 == 1) {
              se.a("privacy.ws", 12);
            } else {
              if (param1 == 2) {
                se.a("conduct.ws", 12);
              }
            }
          } else {
            se.a("terms.ws", 12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ue.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void i(int param0) {
        field_F = null;
        field_H = null;
        field_J = null;
        if (param0 != 1) {
          return;
        }
        field_M = null;
        field_K = null;
        field_G = null;
        field_N = null;
    }

    static {
        int var0 = 0;
        field_J = null;
        field_G = new int[4096];
        for (var0 = 0; var0 < 4096; var0++) {
          field_G[var0] = wg.b(0, var0);
        }
        field_F = new String[]{"<lt><lt> ", " <gt><gt>"};
        field_K = "The game can be played online in 2 distinct modes:";
        field_H = "You are offering an unrated rematch.";
    }
}
