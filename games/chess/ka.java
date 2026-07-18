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
                stackOut_2_0 = (mf) param4;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (mf) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (od) (Object) stackIn_3_0;
              wb.f(param1 + param4.field_u, param2 + param4.field_r, param4.field_y, param4.field_C, ((ka) this).field_l);
              if (param0 >= 58) {
                break L2;
              } else {
                ((ka) this).field_p = null;
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
              wb.c(var7, var8, var14.field_T, ((ka) this).field_k);
              if (var14.field_S == -1) {
                break L4;
              } else {
                var9 = 2.0 * (3.141592653589793 * (double)var14.field_S) / (double)var14.field_P;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_T);
                var12 = (int)(Math.cos(var9) * (double)var14.field_T);
                wb.c(var7 + var11, var8 + var12, 1, ((ka) this).field_n);
                break L4;
              }
            }
            wb.c(var7, var8, 2, 1);
            var9 = 2.0 * ((double)var14.field_R * 3.141592653589793) / (double)var14.field_P;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_T);
            var12 = (int)(Math.cos(var9) * (double)var14.field_T);
            wb.b(var7, var8, var11 + var7, var12 + var8, 1);
            if (((ka) this).field_p != null) {
              var13 = ((ka) this).field_f + (var14.field_T + var14.field_Q);
              int discarded$1 = ((ka) this).field_p.a(param4.field_v, param4.field_u + (param1 - -var13), ((ka) this).field_m + param2 + param4.field_r, param4.field_y + (-((ka) this).field_f + -var13), -(((ka) this).field_f << 1) + param4.field_C, ((ka) this).field_d, ((ka) this).field_i, 1, 1, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("ka.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        fd var4 = null;
        ak var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          L0: {
            var5 = (ak) (Object) nc.field_O.g(-18110);
            L1: while (true) {
              if (var5 == null) {
                var4 = (fd) (Object) fb.field_L.g(-18110);
                L2: while (true) {
                  if (var4 == null) {
                    break L0;
                  } else {
                    pk.a(3, -90, var4);
                    var4 = (fd) (Object) fb.field_L.a((byte) -121);
                    continue L2;
                  }
                }
              } else {
                sj.a(0, 3, var5);
                var5 = (ak) (Object) nc.field_O.a((byte) -112);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "ka.B(" + -76 + ',' + 3 + ')');
        }
    }

    public static void a() {
        field_g = null;
        field_j = null;
        field_b = null;
        field_a = null;
        field_e = null;
    }

    ka(lh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((ka) this).field_i = param4;
            ((ka) this).field_d = param3;
            ((ka) this).field_m = param2;
            ((ka) this).field_p = param0;
            ((ka) this).field_k = param5;
            ((ka) this).field_f = param1;
            ((ka) this).field_n = param6;
            ((ka) this).field_l = param7;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Report abuse";
        field_h = 1;
        field_j = new hg(4, 1, 1, 1);
        field_c = 0;
        field_e = "Creating your account";
    }
}
