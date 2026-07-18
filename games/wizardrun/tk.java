/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk implements bf {
    static String field_e;
    private int field_c;
    static String field_f;
    private int field_b;
    private vd field_d;
    static int field_a;

    final static void a(int param0, o param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            r.field_a = param7;
            ta.field_a = param2;
            ka.field_i = 0;
            cb.field_a = 0;
            uk.field_b = param1;
            sl.field_r = 0;
            jg.field_m = 0;
            kk.field_xb = 2500;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "tk.C(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + 0 + ',' + 2500 + ',' + 0 + ',' + 2 + ',' + param7 + ',' + 0 + ')');
        }
    }

    public static void a() {
        int var1 = -18;
        field_f = null;
        field_e = null;
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                if (param2.field_v) {
                  break L2;
                } else {
                  if (param2.d((byte) 53)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 2188450;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_5_0;
              if (param3) {
                break L3;
              } else {
                ((tk) this).field_b = 65;
                break L3;
              }
            }
            int discarded$1 = ((tk) this).field_d.a("<u=" + Integer.toString(var6_int, 16) + ">" + param2.field_k + "</u>", param2.field_o + param0, param1 + param2.field_l, param2.field_r, param2.field_n, var6_int, -1, ((tk) this).field_c, ((tk) this).field_b, ((tk) this).field_d.field_M + ((tk) this).field_d.field_B);
            if (param2.d((byte) 53)) {
              L4: {
                var7 = ((tk) this).field_d.b(param2.field_k);
                var8 = ((tk) this).field_d.field_M - -((tk) this).field_d.field_B;
                var9 = param2.field_o + param0;
                var10 = param2.field_l + param1;
                if (2 == ((tk) this).field_c) {
                  var9 = var9 + (-var7 + param2.field_r);
                  break L4;
                } else {
                  if (((tk) this).field_c != 1) {
                    break L4;
                  } else {
                    var9 = var9 + (param2.field_r + -var7 >> 1);
                    break L4;
                  }
                }
              }
              L5: {
                if (((tk) this).field_b != 2) {
                  if (1 == ((tk) this).field_b) {
                    var10 = var10 + (param2.field_n + -var8 >> 1);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  var10 = var10 + (param2.field_n - var8);
                  break L5;
                }
              }
              nh.a((byte) 69, 4 + var7, var10 - -2, var8, var9 + -2);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("tk.B(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public tk() {
        ((tk) this).field_d = gh.field_b;
        ((tk) this).field_b = 1;
        ((tk) this).field_c = 1;
    }

    tk(vd param0, int param1, int param2) {
        try {
            ((tk) this).field_b = param2;
            ((tk) this).field_d = param0;
            ((tk) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading graphics";
        field_f = "Unfortunately you are not eligible to create an account.";
        field_a = -1;
    }
}
