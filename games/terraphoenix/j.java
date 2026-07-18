/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class j extends jc {
    private boolean field_M;
    static Random field_H;
    private int field_O;
    private pk field_A;
    private int field_S;
    private String field_L;
    static String field_K;
    static String field_I;
    static String field_P;
    private int field_Q;
    static int field_R;

    final String f(int param0) {
        int var2 = 0;
        String var3 = null;
        gl stackIn_1_0 = null;
        gl stackIn_2_0 = null;
        gl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        gl stackOut_0_0 = null;
        gl stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        gl stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = ((j) this).field_F.field_s ? 1 : 0;
          ((j) this).field_F.field_s = ((j) this).field_s;
          var3 = ((j) this).field_F.f(85);
          stackOut_0_0 = ((j) this).field_F;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var2 == 0) {
            stackOut_2_0 = (gl) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (gl) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_s = stackIn_3_1 != 0;
        if (param0 <= 70) {
          ((j) this).field_M = true;
          return var3;
        } else {
          return var3;
        }
    }

    final static int a(int param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = gj.a(param1, 0, 255, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("j.D(").append(0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void g(int param0) {
        field_K = null;
        field_H = null;
        field_P = null;
        field_I = null;
    }

    j(int param0, int param1, int param2, int param3, gl param4, boolean param5, int param6, int param7, pk param8, int param9, String param10) {
        super(param0, param1, param2, param3, (cj) null, (sc) null);
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
              ((j) this).field_A = param8;
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
              ((j) this).field_M = stackIn_4_1 != 0;
              ((j) this).field_L = param10;
              ((j) this).field_S = param9;
              ((j) this).field_F = param4;
              ((j) this).field_Q = param6;
              ((j) this).field_O = param7;
              var12_int = -((j) this).field_O + ((j) this).field_Q;
              var13 = ((j) this).field_A.a(param10, var12_int, ((j) this).field_A.field_s) - -(((j) this).field_O * 2);
              if (var13 > param3) {
                ((j) this).a(param1, (byte) 49, param2, param0, var13);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!((j) this).field_M) {
                stackOut_9_0 = 2 * ((j) this).field_O + ((j) this).field_Q;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((j) this).field_F.a(((j) this).field_O + (-param3 + var13 >> 1), (byte) 61, param2 - ((j) this).field_Q - ((j) this).field_O * 3, var14, -(((j) this).field_O * 2) + param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("j.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw qk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        pk stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        pk stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        pk stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        int stackIn_8_8 = 0;
        int stackIn_15_0 = 0;
        pk stackIn_16_0 = null;
        String stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_16_7 = 0;
        pk stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_17_7 = 0;
        pk stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        int stackIn_18_8 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        pk stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_15_7 = 0;
        pk stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        int stackOut_17_6 = 0;
        int stackOut_17_7 = 0;
        int stackOut_17_8 = 0;
        pk stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        int stackOut_16_7 = 0;
        int stackOut_16_8 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        pk stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        pk stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        pk stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        var5 = ((j) this).field_w - -param0;
        if (param1 < -106) {
          var6 = param3 + ((j) this).field_u;
          super.a(param0, -113, param2, param3);
          if (param2 != 0) {
            return;
          } else {
            L0: {
              if (!((j) this).field_M) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                stackOut_13_0 = -(((j) this).field_O * 2) + ((j) this).field_p + -((j) this).field_Q;
                stackIn_15_0 = stackOut_13_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_15_0;
              stackOut_15_0 = ((j) this).field_A;
              stackOut_15_1 = ((j) this).field_L;
              stackOut_15_2 = ((j) this).field_O + var7 + var5;
              stackOut_15_3 = var6 + ((j) this).field_O;
              stackOut_15_4 = -((j) this).field_O + ((j) this).field_Q;
              stackOut_15_5 = ((j) this).field_n - ((j) this).field_O * 2;
              stackOut_15_6 = ((j) this).field_S;
              stackOut_15_7 = -1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_17_3 = stackOut_15_3;
              stackIn_17_4 = stackOut_15_4;
              stackIn_17_5 = stackOut_15_5;
              stackIn_17_6 = stackOut_15_6;
              stackIn_17_7 = stackOut_15_7;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              stackIn_16_3 = stackOut_15_3;
              stackIn_16_4 = stackOut_15_4;
              stackIn_16_5 = stackOut_15_5;
              stackIn_16_6 = stackOut_15_6;
              stackIn_16_7 = stackOut_15_7;
              if (!((j) this).field_M) {
                stackOut_17_0 = (pk) (Object) stackIn_17_0;
                stackOut_17_1 = (String) (Object) stackIn_17_1;
                stackOut_17_2 = stackIn_17_2;
                stackOut_17_3 = stackIn_17_3;
                stackOut_17_4 = stackIn_17_4;
                stackOut_17_5 = stackIn_17_5;
                stackOut_17_6 = stackIn_17_6;
                stackOut_17_7 = stackIn_17_7;
                stackOut_17_8 = 2;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                stackIn_18_4 = stackOut_17_4;
                stackIn_18_5 = stackOut_17_5;
                stackIn_18_6 = stackOut_17_6;
                stackIn_18_7 = stackOut_17_7;
                stackIn_18_8 = stackOut_17_8;
                break L1;
              } else {
                stackOut_16_0 = (pk) (Object) stackIn_16_0;
                stackOut_16_1 = (String) (Object) stackIn_16_1;
                stackOut_16_2 = stackIn_16_2;
                stackOut_16_3 = stackIn_16_3;
                stackOut_16_4 = stackIn_16_4;
                stackOut_16_5 = stackIn_16_5;
                stackOut_16_6 = stackIn_16_6;
                stackOut_16_7 = stackIn_16_7;
                stackOut_16_8 = 0;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                stackIn_18_4 = stackOut_16_4;
                stackIn_18_5 = stackOut_16_5;
                stackIn_18_6 = stackOut_16_6;
                stackIn_18_7 = stackOut_16_7;
                stackIn_18_8 = stackOut_16_8;
                break L1;
              }
            }
            int discarded$2 = ((pk) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5, stackIn_18_6, stackIn_18_7, stackIn_18_8, 1, ((j) this).field_A.field_s);
            return;
          }
        } else {
          ((j) this).field_Q = 38;
          var6 = param3 + ((j) this).field_u;
          super.a(param0, -113, param2, param3);
          if (param2 != 0) {
            return;
          } else {
            L2: {
              if (!((j) this).field_M) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = -(((j) this).field_O * 2) + ((j) this).field_p + -((j) this).field_Q;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_5_0;
              stackOut_5_0 = ((j) this).field_A;
              stackOut_5_1 = ((j) this).field_L;
              stackOut_5_2 = ((j) this).field_O + var7 + var5;
              stackOut_5_3 = var6 + ((j) this).field_O;
              stackOut_5_4 = -((j) this).field_O + ((j) this).field_Q;
              stackOut_5_5 = ((j) this).field_n - ((j) this).field_O * 2;
              stackOut_5_6 = ((j) this).field_S;
              stackOut_5_7 = -1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_7_4 = stackOut_5_4;
              stackIn_7_5 = stackOut_5_5;
              stackIn_7_6 = stackOut_5_6;
              stackIn_7_7 = stackOut_5_7;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              stackIn_6_3 = stackOut_5_3;
              stackIn_6_4 = stackOut_5_4;
              stackIn_6_5 = stackOut_5_5;
              stackIn_6_6 = stackOut_5_6;
              stackIn_6_7 = stackOut_5_7;
              if (!((j) this).field_M) {
                stackOut_7_0 = (pk) (Object) stackIn_7_0;
                stackOut_7_1 = (String) (Object) stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = stackIn_7_4;
                stackOut_7_5 = stackIn_7_5;
                stackOut_7_6 = stackIn_7_6;
                stackOut_7_7 = stackIn_7_7;
                stackOut_7_8 = 2;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                stackIn_8_5 = stackOut_7_5;
                stackIn_8_6 = stackOut_7_6;
                stackIn_8_7 = stackOut_7_7;
                stackIn_8_8 = stackOut_7_8;
                break L3;
              } else {
                stackOut_6_0 = (pk) (Object) stackIn_6_0;
                stackOut_6_1 = (String) (Object) stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = stackIn_6_5;
                stackOut_6_6 = stackIn_6_6;
                stackOut_6_7 = stackIn_6_7;
                stackOut_6_8 = 0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                stackIn_8_5 = stackOut_6_5;
                stackIn_8_6 = stackOut_6_6;
                stackIn_8_7 = stackOut_6_7;
                stackIn_8_8 = stackOut_6_8;
                break L3;
              }
            }
            int discarded$3 = ((pk) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_8_5, stackIn_8_6, stackIn_8_7, stackIn_8_8, 1, ((j) this).field_A.field_s);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Land your troops";
        field_H = new Random();
        field_I = "Equip your soldiers";
        field_P = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
