/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck implements td {
    private int field_a;
    private int field_i;
    static String[] field_h;
    static qg[] field_n;
    private int field_l;
    static kc field_g;
    static String field_k;
    static int field_f;
    static long field_e;
    private int field_b;
    private int field_o;
    static rf field_j;
    private int field_d;
    static hj[] field_c;
    private kc field_m;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ue var12 = null;
        pj stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        pj stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param2 instanceof ue)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (pj) ((Object) stackOut_3_0);
                break L1;
              } else {
                stackOut_2_0 = (pj) (param2);
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (ue) ((Object) stackIn_4_0);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ul.h(param2.field_s + param1, param2.field_n + param0, param2.field_m, param2.field_r, this.field_o);
              var7 = -(var12.field_I * 2) + param2.field_m;
              var8 = param2.field_s + param1 + var12.field_I;
              if (param3 == -4394) {
                break L3;
              } else {
                field_j = (rf) null;
                break L3;
              }
            }
            var9 = param2.field_n + (param0 - -var12.field_L);
            ul.b(var8, var9, var7 + var8, var9, this.field_d);
            var10 = -1 + var12.a((byte) -90);
            L4: while (true) {
              L5: {
                L6: {
                  if ((var10 ^ -1) > -1) {
                    break L6;
                  } else {
                    ul.f(var8 - -(var7 * var12.a(-1, var10) / var12.j(1)), var9, this.field_b, this.field_a);
                    var10--;
                    if (var11 != 0) {
                      break L5;
                    } else {
                      if (var11 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (null == this.field_m) {
                  break L5;
                } else {
                  this.field_m.c(var12.field_l, var7 / 2 + var8, var12.field_L + this.field_m.field_z + var9, this.field_l, this.field_i);
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var6);
            stackOut_15_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_j = null;
        field_n = null;
        if (param0 != 22499) {
          field_j = (rf) null;
          field_k = null;
          field_h = null;
          field_c = null;
          return;
        } else {
          field_k = null;
          field_h = null;
          field_c = null;
          return;
        }
    }

    ck(kc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_i = param2;
            this.field_o = param4;
            this.field_l = param1;
            this.field_d = param3;
            this.field_a = param6;
            this.field_m = param0;
            this.field_b = param5;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_f = 256;
        field_k = ",";
    }
}
