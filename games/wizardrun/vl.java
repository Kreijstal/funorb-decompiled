/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl implements bf {
    private int field_o;
    private int field_i;
    private int field_l;
    private int field_b;
    static int field_d;
    static String field_n;
    private int field_p;
    private int field_k;
    private int field_r;
    static String field_a;
    private vd field_j;
    static int field_h;
    static String field_g;
    private int field_q;
    static String field_f;
    private int field_e;
    private int field_c;
    private int field_m;

    final static String a(int param0) {
        return nk.field_N.d(0);
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ef var11 = null;
        ub stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ub stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param2 instanceof ef) {
                stackOut_2_0 = (ub) param2;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (ub) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (ef) (Object) stackIn_3_0;
              if (var11 == null) {
                break L2;
              } else {
                param4 = param4 & var11.field_B;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (param4) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ed.c(param0 - -param2.field_o, param2.field_l + param1, param2.field_r, param2.field_n, ((vl) this).field_c);
              var8 = param0 - -param2.field_o - -((vl) this).field_m;
              var9 = param1 + param2.field_l - -((vl) this).field_b;
              ed.b(var8, var9, ((vl) this).field_l, ((vl) this).field_p, 5592405);
              ed.c(var8, var9, ((vl) this).field_l, ((vl) this).field_p, var7);
              if (param3) {
                break L4;
              } else {
                ((vl) this).field_p = 11;
                break L4;
              }
            }
            L5: {
              if (var11.field_z) {
                ed.e(var8, var9, var8 + ((vl) this).field_l, var9 + ((vl) this).field_p, 1);
                ed.e(var8 - -((vl) this).field_l, var9, var8, ((vl) this).field_p + var9, 1);
                break L5;
              } else {
                break L5;
              }
            }
            if (null != ((vl) this).field_j) {
              var10 = ((vl) this).field_i + ((vl) this).field_l + ((vl) this).field_m;
              int discarded$1 = ((vl) this).field_j.a(param2.field_k, param2.field_o + param0 - -var10, ((vl) this).field_o + param1 + param2.field_l, -((vl) this).field_i - (var10 - param2.field_r), param2.field_n - (((vl) this).field_i << 1), ((vl) this).field_r, ((vl) this).field_e, ((vl) this).field_k, ((vl) this).field_q, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("vl.B(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 < 42) {
          field_a = null;
          field_a = null;
          field_n = null;
          field_g = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_n = null;
          field_g = null;
          field_f = null;
          return;
        }
    }

    final static boolean a(char param0, int param1) {
        if (param0 < 48) {
            return false;
        }
        if (param0 > 57) {
            return false;
        }
        return true;
    }

    vl(vd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((vl) this).field_k = 1;
        ((vl) this).field_q = 1;
        try {
            ((vl) this).field_r = param3;
            ((vl) this).field_c = param9;
            ((vl) this).field_o = param2;
            ((vl) this).field_m = param5;
            ((vl) this).field_e = param4;
            ((vl) this).field_b = param6;
            ((vl) this).field_i = param1;
            ((vl) this).field_l = param8;
            ((vl) this).field_p = param7;
            ((vl) this).field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "vl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Create a free account to start using this feature";
        field_a = "Any crystals that remain on the level grow";
        field_g = "To server list";
    }
}
