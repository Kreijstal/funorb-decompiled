/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends ug {
    static int field_V;
    static nk[] field_bb;
    private String field_U;
    private boolean field_db;
    private int field_Y;
    static String field_cb;
    static volatile int field_G;
    private mi field_Z;
    private int field_ab;
    static int[] field_W;
    static int[] field_X;
    private int field_T;
    static String field_S;
    static int[] field_eb;
    static int[] field_R;

    final String e(int param0) {
        int var2 = ((hc) this).field_J.field_C ? 1 : 0;
        ((hc) this).field_J.field_C = ((hc) this).field_C;
        String var3 = ((hc) this).field_J.e(param0);
        ((hc) this).field_J.field_C = var2 != 0 ? true : false;
        return var3;
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
            hc.f((byte) -69);
        }
        ma.field_V = param0;
    }

    final static nn a(int param0, pn param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        nn var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        nn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            int discarded$4 = 0;
            var8 = mn.a(22230, param3, param1, param5, 0);
            var6 = var8;
            if (var8 != null) {
              var7 = new nn();
              var7.field_d = var8;
              java.awt.Component discarded$5 = var7.field_d.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, param5, param3);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_3_0 = (nn) var7;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nn) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("hc.DA(").append(0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 0 + ',' + param3 + ',' + 0 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = ((hc) this).field_o - -param2;
        int var6 = param0 + ((hc) this).field_z;
        super.a(param0, (byte) -123, param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        if (param1 > -99) {
            hc.a(104, -35);
        }
        int var7 = ((hc) this).field_db ? -(((hc) this).field_ab * 2) + -((hc) this).field_T + ((hc) this).field_x : 0;
        int discarded$0 = ((hc) this).field_Z.a(((hc) this).field_U, var7 + (var5 + ((hc) this).field_ab), var6 - -((hc) this).field_ab, -((hc) this).field_ab + ((hc) this).field_T, -(((hc) this).field_ab * 2) + ((hc) this).field_E, ((hc) this).field_Y, -1, !((hc) this).field_db ? 2 : 0, 1, ((hc) this).field_Z.field_G);
    }

    hc(int param0, int param1, int param2, int param3, lh param4, boolean param5, int param6, int param7, mi param8, int param9, String param10) {
        super(param0, param1, param2, param3, (qk) null, (tn) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((hc) this).field_Z = param8;
              ((hc) this).field_T = param6;
              ((hc) this).field_J = param4;
              ((hc) this).field_ab = param7;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((hc) this).field_db = stackIn_4_1 != 0;
              ((hc) this).field_Y = param9;
              ((hc) this).field_U = param10;
              var12_int = ((hc) this).field_T + -((hc) this).field_ab;
              var13 = ((hc) this).field_Z.a(param10, var12_int, ((hc) this).field_Z.field_G) + ((hc) this).field_ab * 2;
              if (param3 < var13) {
                ((hc) this).a(param0, (byte) -110, param1, param2, var13);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (((hc) this).field_db) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 2 * ((hc) this).field_ab + ((hc) this).field_T;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((hc) this).field_J.a(var14, (byte) -84, ((hc) this).field_ab - -(var13 + -param3 >> 1), -(3 * ((hc) this).field_ab) + (-((hc) this).field_T + param2), param3 + -(2 * ((hc) this).field_ab));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("hc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    public static void f(byte param0) {
        field_eb = null;
        if (param0 < 1) {
            field_V = 37;
        }
        field_cb = null;
        field_S = null;
        field_R = null;
        field_X = null;
        field_bb = null;
        field_W = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_cb = "Configuration";
        field_V = 0;
        field_G = -1;
        field_S = "Try changing the following settings:  ";
        field_X = new int[250];
        field_eb = new int[32];
        field_W = new int[32];
        field_R = new int[32];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 32) {
            var0 = 0;
            L1: while (true) {
              if (var0 >= 16) {
                var0 = 0;
                L2: while (true) {
                  if (var0 >= 32) {
                    return;
                  } else {
                    field_X[var0] = 257 * var0;
                    field_X[-var0 + 63] = var0 * 257;
                    field_X[-(2 * var0) + 249] = 8224 + (-(var0 * 257) - -(65536 * (32 + -var0)));
                    field_X[249 + (-(2 * var0) + -1)] = (-var0 + 32) * 65536 + (8224 - var0 * 257);
                    var0++;
                    continue L2;
                  }
                }
              } else {
                field_W[16 + var0] = vn.a(field_W[16 + var0], var0 * 393216);
                field_eb[16 + var0] = vn.a(field_eb[16 + var0], 6 * var0);
                var0++;
                continue L1;
              }
            }
          } else {
            field_W[var0] = var0 * 771;
            field_eb[var0] = var0 * 197376;
            var0++;
            continue L0;
          }
        }
    }
}
