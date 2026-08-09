/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wba extends rqa {
    static int[] field_o;
    static ge field_p;

    final static aja a(byte param0, ha param1, phb param2) {
        jva var2 = null;
        aja var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        jva var6 = null;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        aja stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 instanceof jva) {
                break L1;
              } else {
                var6 = new jva(param2.field_q, param2.field_p);
                var6.field_l = param2.field_l;
                var6.field_n = param2.field_n;
                var6.field_m = param2.field_m;
                var6.field_k = param2.field_k;
                var4 = 0;
                L2: while (true) {
                  if (var6.field_r.length <= var4) {
                    var2 = var6;
                    break L1;
                  } else {
                    L3: {
                      stackIn_6_0 = var6.field_r;

                      stackIn_6_1 = var4;

                      if (0 != ((phb) ((Object) var2)).field_r[var4]) {
                        stackIn_7_0 = (int[]) ((Object) stackIn_6_0);
                        stackIn_7_1 = stackIn_6_1;
                        stackIn_7_2 = knb.a(-16777216, ((phb) ((Object) var2)).field_r[var4]);
                        break L3;
                      } else {
                        stackIn_7_0 = (int[]) ((Object) stackIn_6_0);
                        stackIn_7_1 = stackIn_6_1;
                        stackIn_7_2 = 0;
                        break L3;
                      }
                    }
                    stackIn_7_0[stackIn_7_1] = stackIn_7_2;
                    var4++;
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (param0 <= -61) {
                break L4;
              } else {
                field_o = (int[]) null;
                break L4;
              }
            }
            var3 = param1.a(((phb) ((Object) var2)).field_m, ((phb) ((Object) var2)).field_m, ((phb) ((Object) var2)).field_r, 0, (byte) 64, ((phb) ((Object) var2)).field_n);
            stackIn_12_0 = (aja) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("wba.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (var2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                wba.a(73);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(190, 116));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wba.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 > -70) {
            field_p = (ge) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    wba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
