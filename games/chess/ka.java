/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka implements jm {
    private int field_d;
    static String field_b;
    private int field_m;
    private int field_n;
    static hg field_j;
    private lh field_p;
    private int field_k;
    private int field_i;
    private int field_f;
    static int field_h;
    private int field_l;
    static String[] field_g;
    static int field_c;
    static vl field_a;
    static String field_e;
    static float field_o;

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        od var14 = null;
        mf stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        mf stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof od) {
                stackOut_2_0 = (mf) (param4);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (mf) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var14 = (od) ((Object) stackIn_3_0);
              wb.f(param1 + param4.field_u, param2 + param4.field_r, param4.field_y, param4.field_C, this.field_l);
              if (param0 >= 58) {
                break L2;
              } else {
                this.field_p = (lh) null;
                break L2;
              }
            }
            L3: {
              if (var14 != null) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = param1 + param4.field_u - -var14.field_Q;
              var8 = param4.field_r + (param2 - -var14.field_M);
              wb.c(var7, var8, var14.field_T, this.field_k);
              if (0 == (var14.field_S ^ -1)) {
                break L4;
              } else {
                var9 = 2.0 * (3.141592653589793 * (double)var14.field_S) / (double)var14.field_P;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_T);
                var12 = (int)(Math.cos(var9) * (double)var14.field_T);
                wb.c(var7 + var11, var8 + var12, 1, this.field_n);
                break L4;
              }
            }
            wb.c(var7, var8, 2, 1);
            var9 = 2.0 * ((double)var14.field_R * 3.141592653589793) / (double)var14.field_P;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_T);
            var12 = (int)(Math.cos(var9) * (double)var14.field_T);
            wb.b(var7, var8, var11 + var7, var12 + var8, 1);
            if (this.field_p != null) {
              var13 = this.field_f + (var14.field_T + var14.field_Q);
              discarded$1 = this.field_p.a(param4.field_v, param4.field_u + (param1 - -var13), this.field_m + param2 + param4.field_r, param4.field_y + (-this.field_f + -var13), -(this.field_f << -33529503) + param4.field_C, this.field_d, this.field_i, 1, 1, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("ka.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        fd var4 = null;
        ak var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          L0: {
            var5 = (ak) ((Object) nc.field_O.g(-18110));
            if (param0 <= -31) {
              L1: while (true) {
                if (var5 == null) {
                  var4 = (fd) ((Object) fb.field_L.g(-18110));
                  L2: while (true) {
                    if (var4 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      pk.a(param1, -90, var4);
                      var4 = (fd) ((Object) fb.field_L.a((byte) -121));
                      continue L2;
                    }
                  }
                } else {
                  sj.a(0, param1, var5);
                  var5 = (ak) ((Object) nc.field_O.a((byte) -112));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "ka.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -122) {
          field_j = (hg) null;
          field_g = null;
          field_j = null;
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_g = null;
          field_j = null;
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    ka(lh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_i = param4;
            this.field_d = param3;
            this.field_m = param2;
            this.field_p = param0;
            this.field_k = param5;
            this.field_f = param1;
            this.field_n = param6;
            this.field_l = param7;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_b = "Report abuse";
        field_h = 1;
        field_j = new hg(4, 1, 1, 1);
        field_c = 0;
        field_e = "Creating your account";
    }
}
