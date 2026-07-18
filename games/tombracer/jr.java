/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr implements isa {
    private il field_k;
    static String[] field_j;
    private int field_d;
    private int field_g;
    private int field_i;
    private int field_e;
    private int field_f;
    private int field_c;
    private int field_a;
    private int field_h;
    private int field_l;
    private int field_b;
    private int field_m;

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        jla var11 = null;
        ae stackIn_5_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        ae stackOut_3_0 = null;
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
              if (param2 == 16777215) {
                break L1;
              } else {
                ((jr) this).field_d = -62;
                break L1;
              }
            }
            L2: {
              if (!(param0 instanceof jla)) {
                stackOut_4_0 = null;
                stackIn_5_0 = (ae) (Object) stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (ae) param0;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var11 = (jla) (Object) stackIn_5_0;
              if (var11 != null) {
                param4 = param4 & var11.field_y;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = 5592405;
              bea.e(param0.field_i + param1, param0.field_n + param3, param0.field_m, param0.field_p, ((jr) this).field_b);
              if (param4) {
                var7 = 16777215;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = param1 + param0.field_i - -((jr) this).field_l;
              var9 = ((jr) this).field_d + (param0.field_n + param3);
              bea.d(var8, var9, ((jr) this).field_e, ((jr) this).field_c, 5592405);
              bea.e(var8, var9, ((jr) this).field_e, ((jr) this).field_c, var7);
              if (!var11.field_w) {
                break L5;
              } else {
                bea.a(var8, var9, var8 - -((jr) this).field_e, ((jr) this).field_c + var9, 1);
                bea.a(((jr) this).field_e + var8, var9, var8, ((jr) this).field_c + var9, 1);
                break L5;
              }
            }
            if (null != ((jr) this).field_k) {
              var10 = ((jr) this).field_l + ((jr) this).field_e + ((jr) this).field_m;
              int discarded$1 = ((jr) this).field_k.a(param0.field_o, param0.field_i + (param1 - -var10), param3 + (param0.field_n - -((jr) this).field_a), param0.field_m - (((jr) this).field_m + var10), param0.field_p - (((jr) this).field_m << 1), ((jr) this).field_f, ((jr) this).field_i, ((jr) this).field_g, ((jr) this).field_h, 0);
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
            stackOut_17_1 = new StringBuilder().append("jr.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 != -87) {
            jr.a((byte) -24);
        }
    }

    final static void b(byte param0) {
        kda.field_pd = false;
        fr.field_c = 0;
        mi.field_f = -1;
        if (param0 > -91) {
          jr.b((byte) 79);
          vf.field_f = -1;
          hn.field_F = null;
          return;
        } else {
          vf.field_f = -1;
          hn.field_F = null;
          return;
        }
    }

    jr(il param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((jr) this).field_g = 1;
        ((jr) this).field_h = 1;
        try {
            ((jr) this).field_c = param7;
            ((jr) this).field_l = param5;
            ((jr) this).field_a = param2;
            ((jr) this).field_e = param8;
            ((jr) this).field_f = param3;
            ((jr) this).field_k = param0;
            ((jr) this).field_m = param1;
            ((jr) this).field_d = param6;
            ((jr) this).field_i = param4;
            ((jr) this).field_b = param9;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"<%0> ate lead", "<%0> managed to commit suicide", "<%0> found a tannhauser gate", "<%0> suffered a mysterious gunshot wound"};
    }
}
