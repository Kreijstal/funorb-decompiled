/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends ct {
    private int field_J;
    static String[] field_G;
    private String field_A;
    private hu field_I;
    static ut field_K;
    private boolean field_B;
    static String[] field_E;
    static int field_D;
    private int field_C;
    static String field_L;
    private int field_M;

    final static void a(String param0, byte param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Kickabout.field_G;
        try {
          if (param1 > -83) {
            return;
          }
          k.field_i = k.field_i + 1;
          if (ji.field_Hb == -1 &&
            lj.field_h == -1) {
            ji.field_Hb = el.field_A;
            lj.field_h = n.field_m;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(mh.field_o));
          } else {
            decompiledFrameRemainder0 = (null == mh.field_o);
          }
          if (decompiledFrameRemainder0) {
            if (!nc.field_a) {
              if (us.field_e <= k.field_i) {
                stackIn_19_0 = (k.field_i < us.field_e + rd.field_i) ? 1 : 0;
              } else {
                stackIn_19_0 = 0;
              }
            } else {
              stackIn_19_0 = 0;
            }
            var2_int = stackIn_19_0;
            if (param0 == null) {
              k.field_i = 0;
            } else {
              if (nc.field_a) {
                k.field_i = us.field_e;
              } else {
                if (var2_int == 0) {
                  k.field_i = 0;
                } else {
                  k.field_i = us.field_e;
                }
              }
            }
            td.field_d = lj.field_h;
            ws.field_e = ji.field_Hb;
            if (param0 == null) {
              if (var2_int != 0) {
                nc.field_a = true;
              }
            } else {
              nc.field_a = false;
            }
          }
          if (!nc.field_a &&
            us.field_e > k.field_i &&
            el.field_C) {
            k.field_i = 0;
            td.field_d = lj.field_h;
            ws.field_e = ji.field_Hb;
          }
          mh.field_o = param0;
          if (nc.field_a &&
            k.field_i == nd.field_b) {
            k.field_i = 0;
            nc.field_a = false;
          }
          lj.field_h = -1;
          ji.field_Hb = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("cg.D(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_E = null;
        field_L = null;
        field_G = null;
        field_K = null;
        if (param0 < 89) {
          String var2 = (String) null;
          cg.a((String) null, (byte) 122);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_t + param2;
        int var6 = param3 + this.field_g;
        super.a(param0, (int) (char)param1, param2, param3);
        if (0 != param0) {
          return;
        }
        int var7 = !this.field_B ? 0 : -(2 * this.field_J) - this.field_M + this.field_n;
        this.field_I.a(this.field_A, var5 + (var7 + this.field_J), this.field_J + var6, -this.field_J + this.field_M, this.field_i - this.field_J * 2, this.field_C, -1, this.field_B ? 0 : 2, 1, this.field_I.field_G);
    }

    final String f(int param0) {
        int var2 = this.field_z.field_m ? 1 : 0;
        this.field_z.field_m = this.field_m;
        String var3 = this.field_z.f(param0);
        this.field_z.field_m = var2 != 0 ? true : false;
        return var3;
    }

    cg(int param0, int param1, int param2, int param3, fd param4, boolean param5, int param6, int param7, hu param8, int param9, String param10) {
        super(param0, param1, param2, param3, (gj) null, (jv) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_C = param9;
          this.field_z = param4;
          this.field_J = param7;
          stackIn_4_1 = (param5);
          this.field_B = stackIn_4_1;
          this.field_A = param10;
          this.field_M = param6;
          this.field_I = param8;
          var12_int = this.field_M - this.field_J;
          var13 = this.field_I.c(param10, var12_int, this.field_I.field_G) + 2 * this.field_J;
          if (param3 < var13) {
            this.a(var13, 1, param0, param2, param1);
          } else {
            var13 = param3;
          }
          if (!this.field_B) {
            stackIn_10_0 = this.field_M + 2 * this.field_J;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_z.a(-(this.field_J * 2) + param3, 1, var14, -this.field_M + (param2 - this.field_J * 3), this.field_J + (var13 - param3 >> 1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("cg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_D = 0;
        field_G = new String[]{"Right-click", "Mouse wheel"};
        field_L = "<%0> beats <%1>, <%2> to <%3>, sealing their place <%4>.";
    }
}
