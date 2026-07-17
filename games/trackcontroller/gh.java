/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh implements t {
    static boolean field_k;
    static String field_c;
    private int field_g;
    private int field_j;
    private int field_f;
    static String field_e;
    private int field_b;
    private oh field_d;
    private int field_a;
    private int field_i;
    private int field_h;

    public static void b() {
        field_e = null;
        field_c = null;
    }

    final static boolean a() {
        if (null == r.field_i) {
            return false;
        }
        if (ka.field_b != jc.field_a) {
            return false;
        }
        return true;
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fe var14 = null;
        al stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        al stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof fe) {
                stackOut_2_0 = (al) param1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (al) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (fe) (Object) stackIn_3_0;
              ll.c(param4 + param1.field_p, param1.field_m + param2, param1.field_x, param1.field_u, ((gh) this).field_h);
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var14.field_S + param1.field_p + param4;
            if (param0 == -24969) {
              L3: {
                var8 = param2 + param1.field_m - -var14.field_R;
                ll.f(var7, var8, var14.field_I, ((gh) this).field_a);
                if (var14.field_K == -1) {
                  break L3;
                } else {
                  var9 = (double)var14.field_K * 3.141592653589793 * 2.0 / (double)var14.field_M;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                  ll.f(var7 - -var11, var8 - -var12, 1, ((gh) this).field_i);
                  break L3;
                }
              }
              L4: {
                ll.f(var7, var8, 2, 1);
                var9 = (double)var14.field_O * 3.141592653589793 * 2.0 / (double)var14.field_M;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                ll.e(var7, var8, var11 + var7, var8 + var12, 1);
                if (null == ((gh) this).field_d) {
                  break L4;
                } else {
                  var13 = var14.field_I + (var14.field_S - -((gh) this).field_b);
                  int discarded$1 = ((gh) this).field_d.a(param1.field_s, var13 + (param4 - -param1.field_p), ((gh) this).field_f + (param1.field_m + param2), -((gh) this).field_b + -var13 + param1.field_x, -(((gh) this).field_b << 1) + param1.field_u, ((gh) this).field_j, ((gh) this).field_g, 1, 1, 0);
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("gh.L(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    gh(oh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((gh) this).field_b = param1;
            ((gh) this).field_h = param7;
            ((gh) this).field_f = param2;
            ((gh) this).field_g = param4;
            ((gh) this).field_a = param5;
            ((gh) this).field_j = param3;
            ((gh) this).field_d = param0;
            ((gh) this).field_i = param6;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "gh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_c = "Unfortunately we are unable to create an account for you at this time.";
        field_e = "Move around the exhibition rooms using the arrow keys or mouse. Note that mouse clicks should be in the same row or column as your character.";
    }
}
