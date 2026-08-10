/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends dk {
    static String field_J;
    static String field_I;
    static String field_E;
    static boolean field_G;
    static fa field_H;
    static int field_K;
    static String field_F;

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        pk var7 = null;
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            var7 = wi.field_e;
            if (var7 != null) {
                if (!this.b(param5, param2, param0 ^ 5, param3, param4)) {
                    return;
                }
                if (this.field_s instanceof vd) {
                    ((vd) ((Object) this.field_s)).a(var7, (qj) (this), (byte) -46);
                    wi.field_e = null;
                    return;
                }
                if (var7.field_s instanceof vd) {
                    ((vd) ((Object) var7.field_s)).a(var7, (qj) (this), (byte) -46);
                    wi.field_e = null;
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "qj.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = param4;
            L1: while (true) {
              if (ed.field_c.length <= var5_int) {
                break L0;
              } else {
                param0 = ed.field_c[var5_int];
                var6 = var5_int << -1266174492;
                L2: while (true) {
                  incrementValue$5 = param0;
                  param0--;
                  if (0 == incrementValue$5) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param1 = pk.field_J[incrementValue$6];
                    dupTemp$7 = param2[param1];
                    dupTemp$8 = param3[dupTemp$7];
                    param3[dupTemp$7] = dupTemp$8 + 1;
                    pk.field_J[dupTemp$8] = param1;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("qj.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param4 + ')');
        }
    }

    private qj(int param0, int param1, int param2, int param3, ch param4, kd param5, qa param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "qj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(int param0) {
        field_I = null;
        field_E = null;
        field_H = null;
        field_J = null;
        field_F = null;
        if (param0 >= -107) {
            field_G = true;
        }
    }

    static {
        field_E = "If you hold the mouse button down on a bridge, the currently selected tile will be placed there as soon as the bridge collapses, catching any fleas before they fall through. You can use this tactic with any tile that is going to disappear.";
        field_J = "Go Back";
        field_F = "<%0>Anti-Gravity:<%1> Reverses the direction of gravity when touched by a flea. Items such as balloons and springs now work upside down.";
    }
}
