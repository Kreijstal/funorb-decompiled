/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends si {
    private int field_I;
    private rf field_Q;
    private boolean field_P;
    private int field_O;
    private int field_K;
    static vi field_H;
    static he[] field_S;
    static String field_J;
    private String field_L;
    static he[] field_R;
    static lh field_N;
    static int field_M;

    dh(int param0, int param1, int param2, int param3, vg param4, boolean param5, int param6, int param7, rf param8, int param9, String param10) {
        super(param0, param1, param2, param3, (cg) null, (fd) null);
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
          stackIn_4_1 = (param5);
          this.field_P = stackIn_4_1;
          this.field_K = param6;
          this.field_L = param10;
          this.field_Q = param8;
          this.field_O = param9;
          this.field_I = param7;
          this.field_z = param4;
          var12_int = -this.field_I + this.field_K;
          var13 = this.field_Q.a(param10, var12_int, this.field_Q.field_x) + 2 * this.field_I;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.a(param1, var13, param0, 16535, param2);
          }
          if (this.field_P) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_K + 2 * this.field_I;
          }
          var14 = stackIn_10_0;
          this.field_z.a((var13 - param3 >> 1) + this.field_I, param3 - this.field_I * 2, var14, 16535, -(3 * this.field_I) + (-this.field_K + param2));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("dh.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_H = null;
        field_S = null;
        if (param0 != 3) {
          field_M = 63;
        }
        field_N = null;
        field_R = null;
        field_J = null;
    }

    final static void k(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        lh var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        je var11 = null;
        lh var12 = null;
        f var13 = null;
        int[] var14 = null;
        f var15 = null;
        int[] var16 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0 != -3) {
            field_J = (String) null;
          }
          var12 = field_N;
          var2 = var12.l(param0 ^ -31763);
          if (var2 == 0) {
            var10 = lk.c((byte) 8);
            var16 = var10;
            var14 = var16;
            var3 = var14;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((od) ((Object) var5)).l(31760);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((od) ((Object) var5)).h(qk.a(param0, -2));
            }
            var15 = (f) (ql.field_i.h(param0 - 11148));
            if (var15 == null) {
              eg.a((byte) 126);
              return;
            }
            var15.field_l = true;
            var15.field_j = var16[0];
            var15.field_k = var3;
            var15.a(-16175);
            return;
          }
          if (1 == var2) {
            var11 = (je) (aa.field_e.h(-11151));
            if (var11 == null) {
              eg.a((byte) 126);
              return;
            }
            var11.a(-16175);
          } else {
            if (var2 == 2) {
              var13 = (f) (ql.field_i.h(-11151));
              if (var13 == null) {
                eg.a((byte) 126);
                return;
              }
              var13.field_k = lk.c((byte) 8);
              var13.field_l = true;
              var13.field_j = var13.field_k[0];
              var13.a(-16175);
            } else {
              gb.a((Throwable) null, "A1: " + al.a(-99), 10);
              eg.a((byte) 126);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "dh.E(" + param0 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 <= 0) {
          return;
        }
        kf.a(param1, true, (byte) -122);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param0 + this.field_o;
        int var6 = this.field_m + param3;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        int var7 = !this.field_P ? 0 : -this.field_K + this.field_w - 2 * this.field_I;
        this.field_Q.a(this.field_L, this.field_I + var5 + var7, this.field_I + var6, this.field_K - this.field_I, this.field_k - this.field_I * 2, this.field_O, -1, !this.field_P ? 2 : 0, 1, this.field_Q.field_x);
    }

    final String e(int param0) {
        int var2 = this.field_z.field_n ? 1 : 0;
        this.field_z.field_n = this.field_n;
        String var3 = this.field_z.e(-76);
        if (param0 >= -39) {
          field_N = (lh) null;
        }
        this.field_z.field_n = var2 != 0 ? true : false;
        return var3;
    }

    final static void a(int param0, int param1) {
        cl.field_o = 3 & param0 >> 4;
        q.field_c = (12 & param0) >> 2;
        if (cl.field_o > 2) {
          cl.field_o = 2;
        }
        int var2 = -12 % ((-62 - param1) / 40);
        pa.field_f = 3 & param0;
        if (!(q.field_c <= 2)) {
          q.field_c = 2;
        }
        if (!(pa.field_f <= 2)) {
          pa.field_f = 2;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
          if (param0 < 8) {
            field_N = (lh) null;
          }
          if (af.field_b == 11) {
            wa.a((byte) -43);
          }
          gm.a((byte) 32, oe.field_d, rh.field_d, kl.field_S);
          DrPhlogistonSavesTheEarth.a(0, -118, param1, 0);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "dh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = new vi();
        field_R = new he[4];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$7ffe4b125357(int param0, boolean param1) {
        if (param0 <= 0) {
          return;
        }
        kf.a(param1, true, (byte) -122);
    }
}
