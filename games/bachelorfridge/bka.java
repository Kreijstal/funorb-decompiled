/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bka implements qda {
    private po field_a;
    private int field_b;
    private int field_c;
    static boolean field_h;
    private int field_g;
    private int field_d;
    private int field_e;
    private int field_f;

    final static void b(int param0, int param1) {
        pf var2 = sja.field_fb;
        var2.c(11, (byte) 113);
        var2.field_g = var2.field_g + 1;
        int var3 = var2.field_g;
        var2.d(5, 0);
        var2.d(pw.field_w.field_Pb, 0);
        int var4 = (pw.field_w.field_Lb << 6) + pw.field_w.field_Kb;
        var2.d(var4, 0);
        var2.a(0, -77, pw.field_w.field_Eb.length, pw.field_w.field_Eb);
        var2.b((byte) -32, -var3 + var2.field_g);
    }

    final static void a(int param0, int param1) {
        cm.a(param1, (byte) -111);
    }

    final static void a(vr param0, boolean param1) {
        try {
            to.field_b = new kv(param0.a((byte) 123, "dirty-floor.jpg", ""), (java.awt.Component) (Object) dca.field_y);
            r.field_n = new kv(param0.a((byte) 123, "instr_fridge_view.jpg", ""), (java.awt.Component) (Object) dca.field_y);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bka.D(" + (param0 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bb var12 = null;
        wj stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        wj stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 instanceof bb) {
                stackOut_3_0 = (wj) param1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (wj) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (bb) (Object) stackIn_4_0;
              if (var12 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            dg.c(param0 + param1.field_s, param1.field_v + param3, param1.field_p, param1.field_q, ((bka) this).field_g);
            var7 = -(2 * var12.field_A) + param1.field_p;
            var8 = var12.field_A + param0 - -param1.field_s;
            var9 = param3 - (-param1.field_v - var12.field_D);
            dg.d(var8, var9, var8 - -var7, var9, ((bka) this).field_f);
            if (param2 == 32679) {
              var10 = -1 + var12.a(param2 ^ 32677);
              L3: while (true) {
                if (var10 < 0) {
                  if (((bka) this).field_a == null) {
                    break L0;
                  } else {
                    ((bka) this).field_a.a(var12.field_w, var8 + var7 / 2, var12.field_D + (var9 + ((bka) this).field_a.field_F), ((bka) this).field_d, ((bka) this).field_b);
                    return;
                  }
                } else {
                  dg.b(var8 - -(var12.a(var10, -1) * var7 / var12.g(param2 + -32679)), var9, ((bka) this).field_e, ((bka) this).field_c);
                  var10--;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("bka.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    bka(po param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((bka) this).field_g = param4;
            ((bka) this).field_d = param1;
            ((bka) this).field_c = param6;
            ((bka) this).field_b = param2;
            ((bka) this).field_f = param3;
            ((bka) this).field_e = param5;
            ((bka) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
