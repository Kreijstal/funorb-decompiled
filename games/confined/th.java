/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends ah {
    static String[] field_eb;
    static String field_fb;
    private oi field_db;
    static bi field_bb;
    static volatile boolean field_cb;

    th(hn param0, dj param1) {
        super(param0, param1, 0.4, 0.02, 64.0, ke.field_cb);
        ((th) this).field_db = new oi((pm) this);
        try {
            kj.a(n.field_a, 96, (pm) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "th.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    th(hn param0, ee param1, double[] param2, double param3, double param4, double param5) {
        super(param0, param1, 0.4, 0.02, 8.0, param2, param3, param4, param5, ke.field_cb);
        ((th) this).field_db = new oi((pm) this);
        try {
            kj.a(n.field_a, 96, (pm) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "th.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void m(int param0) {
        if (param0 != 256) {
          th.m(97);
          field_eb = null;
          field_bb = null;
          field_fb = null;
          return;
        } else {
          field_eb = null;
          field_bb = null;
          field_fb = null;
          return;
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        RuntimeException var7 = null;
        double[] var7_array = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double[] var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        double[] var18 = null;
        double[] var19 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (((th) this).field_N) {
              return;
            } else {
              L1: {
                var19 = new double[12];
                var18 = var19;
                var17 = var18;
                var16 = var17;
                var15 = var16;
                var7_array = var15;
                ((th) this).field_ab.a((byte) 91, var19);
                var8 = var19[9];
                if (param2 < -5) {
                  break L1;
                } else {
                  field_bb = null;
                  break L1;
                }
              }
              L2: {
                var10 = var19[10];
                var12 = var19[11];
                if (param3.field_N * var12 + (var10 * param3.field_H + param3.field_P * var8) <= 0.0) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              L3: {
                var14 = stackIn_8_0;
                if (var14 != 0) {
                  ((th) this).a(e.field_a, ((th) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                  break L3;
                } else {
                  break L3;
                }
              }
              pa.a(-(((th) this).field_C * var8) + ((th) this).field_E, 0.2 * ((th) this).field_C, (byte) -11, 256, ((th) this).field_D - ((th) this).field_C * var12, -(((th) this).field_C * var10) + ((th) this).field_t, wb.field_a, param1, param3);
              if (var14 != 0) {
                break L0;
              } else {
                ((th) this).a(e.field_a, ((th) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var7;
            stackOut_14_1 = new StringBuilder().append("th.QA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final void a(mn param0, byte param1) {
        double[] var15 = null;
        double[] var14 = null;
        double[] var13 = null;
        double[] var12 = null;
        double[] var11 = null;
        double var4 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        try {
            var15 = new double[12];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var11 = var12;
            double[] var3 = var11;
            ((th) this).field_ab.a((byte) 42, var15);
            var4 = var15[9];
            int var6 = -29 / ((param1 - -2) / 62);
            var7 = var15[10];
            var9 = var15[11];
            ((th) this).field_db.field_t = ((th) this).field_E - var4 * ((th) this).field_C;
            ((th) this).field_db.field_o = ((th) this).field_t - ((th) this).field_C * var7;
            ((th) this).field_db.field_u = 15.0;
            ((th) this).field_db.field_m = -var4;
            ((th) this).field_db.field_x = -var7;
            ((th) this).field_db.field_w = true;
            ((th) this).field_db.field_v = -var9;
            ((th) this).field_db.field_p = ((th) this).field_D - ((th) this).field_C * var9;
            param0.a((rk) (Object) ((th) this).field_db, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "th.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        if (param0 != 26402) {
          field_fb = null;
          int discarded$4 = 4;
          fl.a(((th) this).a(param0 + -28786, bn.field_b, 1.5, 0.002, 0.5));
          return;
        } else {
          int discarded$5 = 4;
          fl.a(((th) this).a(param0 + -28786, bn.field_b, 1.5, 0.002, 0.5));
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_fb = "Name is available";
        field_cb = false;
    }
}
