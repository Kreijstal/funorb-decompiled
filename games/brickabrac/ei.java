/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei implements ub {
    private int field_l;
    static String field_g;
    private int field_h;
    private int field_j;
    private int field_m;
    private int field_k;
    private int field_f;
    static String field_a;
    private int field_b;
    private int field_d;
    private int field_i;
    private int field_c;
    private dh field_n;
    private int field_e;

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bf var11 = null;
        oc stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        oc stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof bf) {
                stackOut_2_0 = (oc) param3;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (oc) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (bf) (Object) stackIn_3_0;
              if (var11 != null) {
                param0 = param0 & var11.field_J;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (!param0) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              lb.g(param3.field_o + param2, param4 - -param3.field_w, param3.field_t, param3.field_s, ((ei) this).field_b);
              var8 = ((ei) this).field_m + param2 - -param3.field_o;
              var9 = ((ei) this).field_h + param4 - -param3.field_w;
              lb.a(var8, var9, ((ei) this).field_l, ((ei) this).field_d, 5592405);
              if (param1 == -20618) {
                break L4;
              } else {
                ((ei) this).field_h = 116;
                break L4;
              }
            }
            L5: {
              lb.g(var8, var9, ((ei) this).field_l, ((ei) this).field_d, var7);
              if (!var11.field_F) {
                break L5;
              } else {
                lb.d(var8, var9, ((ei) this).field_l + var8, var9 - -((ei) this).field_d, 1);
                lb.d(var8 + ((ei) this).field_l, var9, var8, var9 - -((ei) this).field_d, 1);
                break L5;
              }
            }
            if (null != ((ei) this).field_n) {
              var10 = ((ei) this).field_l - -((ei) this).field_m - -((ei) this).field_f;
              int discarded$1 = ((ei) this).field_n.a(param3.field_A, param2 + (param3.field_o + var10), ((ei) this).field_c + (param3.field_w + param4), param3.field_t - (((ei) this).field_f + var10), param3.field_s - (((ei) this).field_f << 1), ((ei) this).field_e, ((ei) this).field_j, ((ei) this).field_i, ((ei) this).field_k, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("ei.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param4 + ')');
        }
    }

    final static void b() {
        int var1 = 0;
        int var2 = 0;
        var2 = BrickABrac.field_J ? 1 : 0;
        ke.field_b = null;
        t.field_g = false;
        if (!cg.field_l) {
          var1 = fp.field_x;
          if (var1 > 0) {
            if (var1 != 1) {
              ke.field_b = rd.a(ed.field_c, new String[1], (byte) 103);
              int discarded$2 = 1;
              ke.field_b = nm.a(new CharSequence[3]);
              ej.field_I.m(17);
              qa.e((byte) -117);
              return;
            } else {
              ke.field_b = ib.field_C;
              int discarded$3 = 1;
              ke.field_b = nm.a(new CharSequence[3]);
              ej.field_I.m(17);
              qa.e((byte) -117);
              return;
            }
          } else {
            ej.field_I.m(17);
            qa.e((byte) -117);
            return;
          }
        } else {
          ej.field_I.i((byte) -104);
          return;
        }
    }

    public static void a() {
        field_g = null;
        field_a = null;
    }

    ei(dh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((ei) this).field_i = 1;
        ((ei) this).field_k = 1;
        try {
            ((ei) this).field_n = param0;
            ((ei) this).field_l = param8;
            ((ei) this).field_f = param1;
            ((ei) this).field_d = param7;
            ((ei) this).field_m = param5;
            ((ei) this).field_h = param6;
            ((ei) this).field_b = param9;
            ((ei) this).field_e = param3;
            ((ei) this).field_j = param4;
            ((ei) this).field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "(1 player wants to join)";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
