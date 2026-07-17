/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.awt.Canvas;

public final class Chess extends gb {
    private int[] field_H;
    static String field_D;
    static int field_E;
    static um field_B;
    static String field_C;
    private int field_F;
    public static int field_G;

    final static void a(String[] args, String[] param1, byte[] param2, rk[] param3, um param4, int param5, int[] param6, byte[] param7, km[][] param8, boolean param9, String[][] param10, um param11, int param12, um param13, int[] param14, km[][] param15, String[][] param16, int param17, int param18) {
        RuntimeException var19 = null;
        Object var20 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            var20 = null;
            bl.a(args, param12, (byte) 31, param5, param6, param13, param2, param15, param14, param9, param3, param18, param16, param8, param10, (String[]) null, param4, param1, param11, param7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var19 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var19;
            stackOut_2_1 = new StringBuilder().append("Chess.P(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (args == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param5).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param6 == null) {
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
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param7 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param8 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44).append(param9).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param10 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param11 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param12).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param13 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param14 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          L13: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param15 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L13;
            }
          }
          L14: {
            stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param16 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L14;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L14;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param17 + 44 + param18 + 41);
        }
    }

    private final void p() {
        b.field_e = new bn(4, 2, 1);
        int discarded$0 = b.field_e.a(-66, 0, -66);
        int discarded$1 = b.field_e.a(66, 0, -66);
        int discarded$2 = b.field_e.a(-66, 0, 66);
        int discarded$3 = b.field_e.a(66, 0, 66);
        int discarded$4 = b.field_e.a(0, 1, 2, (byte) 1, (byte) -1, (short) 127, (short) -1);
        int discarded$5 = b.field_e.a(3, 2, 1, (byte) 1, (byte) -1, (short) 127, (short) -1);
        rm.field_H = (dd) (Object) b.field_e.a(100, 131072, 0, -10, 0);
        bd.field_b = (dd) (Object) b.field_e.a(8, 131072, 0, -10, 0);
        ea.field_cb = new bn(4, 2, 1);
        int discarded$6 = ea.field_cb.a(-344, 0, -344);
        int discarded$7 = ea.field_cb.a(344, 0, -344);
        int discarded$8 = ea.field_cb.a(-344, 0, 344);
        int discarded$9 = ea.field_cb.a(344, 0, 344);
        int discarded$10 = ea.field_cb.a(0, 1, 2, (byte) 1, (byte) -1, ik.field_g[qm.field_g], (short) -1);
        int discarded$11 = ea.field_cb.a(3, 2, 1, (byte) 1, (byte) -1, ik.field_g[qm.field_g], (short) -1);
        ea.field_cb.field_j[0] = ik.field_g[qm.field_g];
        ea.field_cb.field_j[1] = ik.field_g[qm.field_g];
        ei.field_q = (dd) (Object) ea.field_cb.a(100, 131072, 0, -10, 0);
        lj.field_i = new bn(4, 2, 1);
        int discarded$12 = lj.field_i.a(-66, 0, -66);
        int discarded$13 = lj.field_i.a(66, 0, -66);
        int discarded$14 = lj.field_i.a(-66, 0, 66);
        int discarded$15 = lj.field_i.a(66, 0, 66);
        int discarded$16 = lj.field_i.a(0, 1, 2, (byte) 1, (byte) -1, (short) 960, (short) -1);
        int discarded$17 = lj.field_i.a(3, 2, 1, (byte) 1, (byte) -1, (short) 960, (short) -1);
        lj.field_i.field_j[0] = (short) 960;
        lj.field_i.field_j[1] = (short) 960;
        mm.field_a = (dd) (Object) lj.field_i.a(100, 131072, 0, -10, 0);
        tk.field_i = new bn(4, 2, 1);
        int discarded$18 = tk.field_i.a(-66, 0, -66);
        int discarded$19 = tk.field_i.a(66, 0, -66);
        int discarded$20 = tk.field_i.a(-66, 0, 66);
        int discarded$21 = tk.field_i.a(66, 0, 66);
        int discarded$22 = tk.field_i.a(0, 1, 2, (byte) 1, (byte) -1, (short) 960, (short) -1);
        int discarded$23 = tk.field_i.a(3, 2, 1, (byte) 1, (byte) -1, (short) 960, (short) -1);
        tk.field_i.field_j[1] = (short) 960;
        tk.field_i.field_j[0] = (short) 960;
        mh.field_f = (dd) (Object) tk.field_i.a(16, 131072, 0, -10, 0);
    }

    final static int t(int param0) {
        if (param0 != 0) {
            field_D = null;
        }
        return cn.field_f;
    }

    final void b(byte param0) {
        int var2 = 0;
        Object var2_ref = null;
        int var3 = 0;
        String[] var4_ref_String__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        un var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ac var12 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_100_0 = 0;
        int stackIn_109_0 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        L0: {
          var11 = field_G;
          if (param0 > 50) {
            break L0;
          } else {
            this.q(61);
            break L0;
          }
        }
        L1: {
          int discarded$30 = -16;
          int discarded$31 = ea.h();
          fl.field_n = ib.a(true);
          int discarded$32 = -49;
          la.b();
          if (fk.field_q.d((byte) -125)) {
            break L1;
          } else {
            ug.a(123);
            break L1;
          }
        }
        L2: {
          if (ka.field_a.d((byte) -126)) {
            break L2;
          } else {
            if (~bc.field_b != ~ib.field_a) {
              L3: {
                if (~ib.field_a >= ~bc.field_b) {
                  break L3;
                } else {
                  int fieldTemp$33 = bc.field_b + 2;
                  bc.field_b = bc.field_b + 2;
                  rf.b(80, fieldTemp$33);
                  break L3;
                }
              }
              if (bc.field_b > ib.field_a) {
                int fieldTemp$34 = bc.field_b - 2;
                bc.field_b = bc.field_b - 2;
                rf.b(80, fieldTemp$34);
                break L2;
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L4: {
          if (rm.field_R == null) {
            break L4;
          } else {
            if (rm.field_R.field_b) {
              b.a(true);
              int discarded$35 = 119;
              om.a();
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (null == rm.field_R) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L5;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L5;
          }
        }
        L6: {
          ((Chess) this).b(stackIn_19_1 != 0, (byte) 31);
          if (ic.field_b) {
            int discarded$36 = 111;
            this.o();
            ic.field_b = false;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          r.field_Eb = r.field_Eb + 1;
          int discarded$37 = 31553;
          tl.k();
          if (qh.field_b == null) {
            break L7;
          } else {
            if (qh.field_b.field_J == null) {
              df.a(qh.field_b, 0);
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          nh.a();
          int discarded$38 = -63;
          nh.c(370, ec.c() + 240);
          int discarded$39 = 30065;
          if (je.h()) {
            ((Chess) this).m(-122);
            int discarded$40 = 30065;
            if (je.h()) {
              L9: {
                if (vd.p(-77)) {
                  boolean discarded$41 = this.b(19763, false);
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            } else {
              break L8;
            }
          } else {
            break L8;
          }
        }
        L10: {
          if (qi.field_l) {
            if (bh.e((byte) 55)) {
              if (!ga.a(true)) {
                if (!d.a(true)) {
                  if (!ug.a(true)) {
                    this.a(false, 83);
                    break L10;
                  } else {
                    if (n.field_e == n.field_f) {
                      L11: {
                        int discarded$42 = 1;
                        var2 = kg.b();
                        if (var2 == 1) {
                          ia.field_l = true;
                          int discarded$43 = 0;
                          hj.a(0, -2);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      this.a(true, 12);
                      break L10;
                    } else {
                      this.a(false, 22);
                      break L10;
                    }
                  }
                } else {
                  L12: {
                    stackOut_52_0 = this;
                    stackOut_52_1 = 68;
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_54_1 = stackOut_52_1;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    if (null == rm.field_R) {
                      stackOut_54_0 = this;
                      stackOut_54_1 = stackIn_54_1;
                      stackOut_54_2 = 0;
                      stackIn_55_0 = stackOut_54_0;
                      stackIn_55_1 = stackOut_54_1;
                      stackIn_55_2 = stackOut_54_2;
                      break L12;
                    } else {
                      stackOut_53_0 = this;
                      stackOut_53_1 = stackIn_53_1;
                      stackOut_53_2 = 1;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_55_1 = stackOut_53_1;
                      stackIn_55_2 = stackOut_53_2;
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      var2 = ((Chess) this).b((byte) stackIn_55_1, stackIn_55_2 != 0);
                      if (var2 == 1) {
                        break L14;
                      } else {
                        if (var2 != 2) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (rm.field_R == null) {
                        break L15;
                      } else {
                        b.a(true);
                        break L15;
                      }
                    }
                    if (var2 != 2) {
                      break L13;
                    } else {
                      int discarded$44 = 1;
                      dh.a(bh.i(81));
                      break L13;
                    }
                  }
                  this.a(true, -114);
                  break L10;
                }
              } else {
                L16: {
                  if (0 == n.field_e) {
                    int discarded$45 = 1;
                    var2 = wf.c();
                    if (var2 == 2) {
                      b.a(true);
                      break L16;
                    } else {
                      if (var2 != 3) {
                        if (var2 == 4) {
                          a.field_d = true;
                          int discarded$46 = 0;
                          hj.a(0, -6);
                          break L16;
                        } else {
                          break L16;
                        }
                      } else {
                        int discarded$47 = 15;
                        fk.a(true);
                        break L16;
                      }
                    }
                  } else {
                    this.a(true, 101);
                    break L16;
                  }
                }
                if (ga.a(true)) {
                  break L10;
                } else {
                  ae.field_e[jc.field_f].a((byte) 114, true, -1);
                  break L10;
                }
              }
            } else {
              qm.a(87);
              break L10;
            }
          } else {
            cf.a(fl.field_p, (byte) -120);
            if (!this.b(19763, true)) {
              break L10;
            } else {
              qi.field_l = true;
              break L10;
            }
          }
        }
        L17: {
          if (vi.a(-3)) {
            break L17;
          } else {
            L18: while (true) {
              var12 = (ac) (Object) tg.field_e.f(1184188328);
              if (var12 != null) {
                int discarded$48 = 117;
                int discarded$49 = 4;
                tl.a(var12);
                continue L18;
              } else {
                break L17;
              }
            }
          }
        }
        L19: while (true) {
          if (!tj.a((byte) 103, sk.field_r)) {
            L20: {
              vh.a(0, (byte) 93);
              if (wn.field_f) {
                s.field_O = 0;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (!nc.j(124)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    var2 = ((Chess) this).l(0);
                    if (var2 == 0) {
                      break L23;
                    } else {
                      if (var2 == 1) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  int discarded$50 = 2;
                  int discarded$51 = -116;
                  sc.a();
                  ka.a((byte) -76, 3);
                  q.a(4, 97);
                  m.a(5, 0);
                  int discarded$52 = 0;
                  int discarded$53 = 7;
                  h.a();
                  int discarded$54 = 1;
                  dj.a();
                  if (var2 != 1) {
                    L24: {
                      if (pk.field_j) {
                        L25: {
                          lc.field_q = true;
                          ma.field_D = false;
                          ji.field_P = true;
                          if (hj.field_i) {
                            ad.field_d = id.field_b;
                            uk.a(qk.field_h, false, 28333, 8);
                            break L25;
                          } else {
                            uk.a(qk.field_h, false, 28333, 0);
                            break L25;
                          }
                        }
                        de.a(-31645);
                        ae.field_e[jc.field_f].a((byte) 122, false, 0);
                        pk.field_j = false;
                        hl.field_h = false;
                        hj.field_i = false;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    fi.field_a = false;
                    r.field_bc = false;
                    break L22;
                  } else {
                    r.field_bc = true;
                    fi.field_a = true;
                    break L22;
                  }
                }
                L26: {
                  var3 = 0;
                  if (2 == var2) {
                    var3 = 1;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  L28: {
                    if (pk.field_j) {
                      break L28;
                    } else {
                      if (r.field_bc) {
                        break L28;
                      } else {
                        if (fi.field_a) {
                          break L28;
                        } else {
                          break L27;
                        }
                      }
                    }
                  }
                  var3 = 1;
                  break L27;
                }
                if (var3 != 0) {
                  dh.c(12);
                  break L21;
                } else {
                  break L21;
                }
              }
            }
            return;
          } else {
            if (9 != wg.field_B) {
              if (wg.field_B == 14) {
                de.a(-31645);
                int discarded$55 = 11520;
                hg.a(rl.field_a.length, 1024, aj.a(false), ak.a(8, 1045), o.b((byte) 19), ak.a(2000, 1045), true, 150, cn.a(), ai.field_h);
                int discarded$56 = 63910;
                int discarded$57 = 15;
                il.a(hj.b(), sj.a((byte) -57));
                wn.field_f = true;
                qk.field_h = -2;
                s.field_O = 0;
                ma.field_D = false;
                pk.field_j = true;
                r.field_bc = false;
                continue L19;
              } else {
                if (wg.field_B == 15) {
                  L29: {
                    if (pk.field_j) {
                      de.a(-31645);
                      fj.a(0);
                      em.b(false);
                      pk.field_j = false;
                      ma.field_D = false;
                      lc.field_q = true;
                      ji.field_P = true;
                      hl.field_h = false;
                      hj.field_i = false;
                      qk.field_h = 0;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  fi.field_a = false;
                  r.field_bc = false;
                  continue L19;
                } else {
                  L30: {
                    if (wg.field_B != 10) {
                      break L30;
                    } else {
                      if (pk.field_j) {
                        kh.c(17);
                        continue L19;
                      } else {
                        break L30;
                      }
                    }
                  }
                  if (wg.field_B == 67) {
                    var2 = tk.field_h.i(-105);
                    var3 = 1 << var2;
                    wc.field_w = wc.field_w | var3;
                    vk.field_b = vk.field_b | var3;
                    hd.field_l.a((o) (Object) new ef(var2), (byte) -108);
                    continue L19;
                  } else {
                    L31: {
                      if (wg.field_B == 57) {
                        break L31;
                      } else {
                        if (wg.field_B == 58) {
                          break L31;
                        } else {
                          if (59 == wg.field_B) {
                            L32: {
                              L33: {
                                if (hj.field_i) {
                                  break L33;
                                } else {
                                  if (!hl.field_h) {
                                    break L32;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                              L34: {
                                de.a(-31645);
                                if (hj.field_i) {
                                  oc.field_p.a(71, false);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              ma.field_D = false;
                              lc.field_q = true;
                              s.field_O = 0;
                              qk.field_h = -2;
                              hl.field_h = false;
                              wn.field_f = true;
                              hj.field_i = false;
                              break L32;
                            }
                            fi.field_a = false;
                            continue L19;
                          } else {
                            L35: {
                              var2_ref = null;
                              if (hj.field_i) {
                                var2_ref = (Object) (Object) oc.field_p;
                                break L35;
                              } else {
                                if (!hl.field_h) {
                                  break L35;
                                } else {
                                  var2_ref = (Object) (Object) pd.field_Lb;
                                  break L35;
                                }
                              }
                            }
                            L36: {
                              if (var2_ref == null) {
                                break L36;
                              } else {
                                if (wg.field_B != 60) {
                                  if (wg.field_B != 61) {
                                    if (wg.field_B == 62) {
                                      L37: {
                                        var3 = tk.field_h.g(0);
                                        ((un) var2_ref).field_B.a((byte) 93, var3);
                                        if (null != oc.field_p) {
                                          oc.field_p.field_B.field_f = var3;
                                          break L37;
                                        } else {
                                          break L37;
                                        }
                                      }
                                      ((un) var2_ref).i(-100);
                                      continue L19;
                                    } else {
                                      if (wg.field_B == 63) {
                                        ((un) var2_ref).field_B.field_m = tk.field_h.i(-118);
                                        if (oc.field_p == null) {
                                          continue L19;
                                        } else {
                                          rf.b(-116);
                                          continue L19;
                                        }
                                      } else {
                                        if (wg.field_B != 64) {
                                          if (wg.field_B != 65) {
                                            if (66 == wg.field_B) {
                                              ((un) var2_ref).field_A = tk.field_h.i(-88);
                                              continue L19;
                                            } else {
                                              break L36;
                                            }
                                          } else {
                                            ((un) var2_ref).field_B.field_c = tk.field_h.i(-100);
                                            if (null == oc.field_p) {
                                              continue L19;
                                            } else {
                                              db.i(-37);
                                              continue L19;
                                            }
                                          }
                                        } else {
                                          ((un) var2_ref).field_B.field_e = tk.field_h.i(-82);
                                          continue L19;
                                        }
                                      }
                                    }
                                  } else {
                                    var3 = tk.field_h.c(true);
                                    var4 = tk.field_h.c(true);
                                    var5 = tk.field_h.g(0);
                                    ((un) var2_ref).field_B.a(var3, var5, (uk) (Object) ((un) var2_ref).field_t, -65, var4);
                                    int discarded$58 = 3;
                                    eb.a(var5, ((un) var2_ref).field_t.field_f[var4] & -16773121, ((un) var2_ref).field_t.field_f[var3] & -16773121);
                                    ((un) var2_ref).b((byte) 26);
                                    continue L19;
                                  }
                                } else {
                                  L38: {
                                    var3 = tk.field_h.f(674914976);
                                    var4 = tk.field_h.i(-101);
                                    var5 = tk.field_h.e((byte) -120);
                                    ((un) var2_ref).field_B.a(var4, 255, var3);
                                    if (((un) var2_ref).field_B.field_k == var3) {
                                      ((un) var2_ref).field_e = var5;
                                      break L38;
                                    } else {
                                      ((un) var2_ref).field_v = var5;
                                      break L38;
                                    }
                                  }
                                  L39: {
                                    if (((un) var2_ref).field_e == -1000) {
                                      ((un) var2_ref).field_e = var5;
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  L40: {
                                    if (((un) var2_ref).field_v != -1000) {
                                      break L40;
                                    } else {
                                      ((un) var2_ref).field_v = var5;
                                      break L40;
                                    }
                                  }
                                  L41: {
                                    if (((un) var2_ref).field_c) {
                                      break L41;
                                    } else {
                                      ((un) var2_ref).field_e = ((un) var2_ref).field_e - 400;
                                      ((un) var2_ref).field_c = true;
                                      break L41;
                                    }
                                  }
                                  if (!((un) var2_ref).field_k) {
                                    ((un) var2_ref).field_v = ((un) var2_ref).field_v - 400;
                                    ((un) var2_ref).field_k = true;
                                    continue L19;
                                  } else {
                                    continue L19;
                                  }
                                }
                              }
                            }
                            ((Chess) this).b(true);
                            continue L19;
                          }
                        }
                      }
                    }
                    L42: {
                      de.a(-31645);
                      var2 = tk.field_h.i(-81);
                      if (tk.field_h.i(-111) != 1) {
                        stackOut_99_0 = 0;
                        stackIn_100_0 = stackOut_99_0;
                        break L42;
                      } else {
                        stackOut_98_0 = 1;
                        stackIn_100_0 = stackOut_98_0;
                        break L42;
                      }
                    }
                    L43: {
                      var3 = stackIn_100_0;
                      var4_ref_String__ = new String[tk.field_h.i(-106)];
                      var5 = tk.field_h.g(0);
                      if (var5 >= 0) {
                        break L43;
                      } else {
                        var5 = -2;
                        break L43;
                      }
                    }
                    var6 = 0;
                    L44: while (true) {
                      if (var6 >= var4_ref_String__.length) {
                        L45: {
                          var6 = tk.field_h.i(-123);
                          var7 = -1;
                          if (var5 < 0) {
                            break L45;
                          } else {
                            L46: {
                              if (var5 != var6) {
                                stackOut_108_0 = 4096;
                                stackIn_109_0 = stackOut_108_0;
                                break L46;
                              } else {
                                stackOut_107_0 = 0;
                                stackIn_109_0 = stackOut_107_0;
                                break L46;
                              }
                            }
                            var7 = stackIn_109_0;
                            break L45;
                          }
                        }
                        L47: {
                          cb.field_e = null;
                          var8 = new un(true, var2, var4_ref_String__, var5, var7, var3 != 0);
                          var8.field_B.field_k = var6;
                          var9 = tk.field_h.i(-109);
                          if (1 != var9) {
                            break L47;
                          } else {
                            var8.field_B.a(0, (p) (Object) tk.field_h, (uk) (Object) var8.field_t, var8);
                            break L47;
                          }
                        }
                        L48: {
                          if (wg.field_B == 57) {
                            oc.field_p = var8;
                            hj.field_i = true;
                            pd.field_Lb = null;
                            rf.b(-111);
                            db.i(-39);
                            ph.a(-7125);
                            qk.field_h = -1;
                            ma.field_D = true;
                            break L48;
                          } else {
                            pd.field_Lb = var8;
                            oc.field_p = null;
                            hl.field_h = true;
                            nh.a();
                            int discarded$59 = -63;
                            nh.c(370, 240 - -ec.c());
                            var10 = eg.a(var8.field_B.field_f, 0, var8.field_B.field_k);
                            if (var10 != -2) {
                              qk.field_h = 3;
                              var8.field_d = 75;
                              break L48;
                            } else {
                              qk.field_h = -1;
                              break L48;
                            }
                          }
                        }
                        fi.field_a = false;
                        ma.field_D = true;
                        continue L19;
                      } else {
                        var4_ref_String__[var6] = tk.field_h.d(false);
                        var6++;
                        continue L44;
                      }
                    }
                  }
                }
              }
            } else {
              de.a(-31645);
              r.field_bc = false;
              qk.field_h = 8;
              ad.field_d = tk.field_h.d(0);
              continue L19;
            }
          }
        }
    }

    final void e(byte param0) {
        int discarded$0 = -2919;
        tk.a();
        int var2 = -63 / ((-31 - param0) / 42);
        if (!(rm.field_R == null)) {
            b.a(true);
        }
        int discarded$1 = -25220;
        ao.b();
    }

    private final void j() {
        nj.a(-20, mm.field_e, 92.0f);
        ((Chess) this).a(true);
        cm.field_s = jn.a("logo", 8221, "", mm.field_d);
        o.field_g = jn.a("achievements", 8221, "", mm.field_d);
        ml.field_g = jn.a("instructions", 8221, "", mm.field_d);
        g.field_g = jn.a("rankings", 8221, "", mm.field_d);
        cm.field_s.field_a = -(cm.field_s.field_k / 2) + 320;
        cm.field_s.field_m = cm.field_s.field_h / 4;
        o.field_g.field_m = cm.field_s.field_m;
        ml.field_g.field_m = cm.field_s.field_m;
        g.field_g.field_m = cm.field_s.field_m;
        o.field_g.field_a = 320 + -(o.field_g.field_k / 2);
        ml.field_g.field_a = -(ml.field_g.field_k / 2) + 320;
        g.field_g.field_a = 320 + -(g.field_g.field_k / 2);
        dc.field_n = new rk[12];
        dc.field_n[7] = null;
        dc.field_n[8] = cm.field_s;
        dc.field_n[4] = g.field_g;
        dc.field_n[5] = ml.field_g;
        dc.field_n[1] = cm.field_s;
        dc.field_n[9] = null;
        dc.field_n[2] = cm.field_s;
        dc.field_n[3] = null;
        dc.field_n[6] = o.field_g;
        dc.field_n[11] = cm.field_s;
        dc.field_n[10] = null;
        dc.field_n[0] = cm.field_s;
        int discarded$0 = 117;
        this.k();
        jd.field_c = qm.a(1, "", "help", mm.field_d);
        ph.field_l = jn.a("clock", 8221, "", mm.field_d);
        ja.field_g = jn.a("clock_button", 8221, "", mm.field_d);
        pg.field_v = qm.a(1, "", "clock_numbers", mm.field_d);
        da.field_y = jn.a("clock_display_separator", 8221, "", mm.field_d);
    }

    final void a(boolean param0) {
        Object var2 = null;
        int var3_int = 0;
        Runtime var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        Object stackIn_3_0 = null;
        int stackIn_26_0 = 0;
        java.awt.Canvas stackOut_2_0 = null;
        a stackOut_1_0 = null;
        int stackOut_25_0 = 0;
        boolean stackOut_24_0 = false;
        L0: {
          var5 = field_G;
          if (rm.field_R == null) {
            stackOut_2_0 = ja.field_h;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = rm.field_R;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        var2 = var6;
        int discarded$2 = 30065;
        if (!je.h()) {
          if (!qi.field_l) {
            cg.a(-12, (java.awt.Canvas) var6);
            return;
          } else {
            if (bh.e((byte) 55)) {
              L1: {
                if (qk.field_h == jc.field_f) {
                  l.a(wn.field_e, jc.field_f, (byte) -86, true);
                  break L1;
                } else {
                  qd.field_w.a(-0.1, (double)r.field_Eb / 300.0, true);
                  if (nc.field_T < 16) {
                    l.a(wn.field_e, jc.field_f, (byte) -86, false);
                    break L1;
                  } else {
                    l.a(ma.field_D, qk.field_h, (byte) -86, false);
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (!wn.field_e) {
                    break L3;
                  } else {
                    if (ma.field_D) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                jb.a(-7093, ak.a(true));
                break L2;
              }
              L4: {
                if (!ga.a(param0)) {
                  break L4;
                } else {
                  wb.g(0, 0, wb.field_h, wb.field_c);
                  nj.a(em.field_r, (byte) -17, em.field_r[0].field_t, em.field_r[0].field_w);
                  break L4;
                }
              }
              L5: {
                L6: {
                  if (!d.a(param0)) {
                    break L6;
                  } else {
                    if (ga.a(param0)) {
                      break L6;
                    } else {
                      L7: {
                        if (rm.field_R != null) {
                          stackOut_25_0 = 1;
                          stackIn_26_0 = stackOut_25_0;
                          break L7;
                        } else {
                          stackOut_24_0 = wc.field_x;
                          stackIn_26_0 = stackOut_24_0 ? 1 : 0;
                          break L7;
                        }
                      }
                      of.a(stackIn_26_0 != 0, -122);
                      break L5;
                    }
                  }
                }
                if (!ug.a(param0)) {
                  break L5;
                } else {
                  if (!ga.a(true)) {
                    wb.g(0, 0, wb.field_h, wb.field_c);
                    qm.a(em.field_r, -105, em.field_r[0].field_t, em.field_r[0].field_w);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L8: {
                if (n.field_f != n.field_e) {
                  var3_int = ji.field_S * 256 / 16;
                  if (var3_int <= 0) {
                    break L8;
                  } else {
                    wb.b(0, 0, wb.field_h, wb.field_c, 0, var3_int);
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if (sk.field_t < 2) {
                  break L9;
                } else {
                  var3 = Runtime.getRuntime();
                  var4 = (int)(var3.totalMemory() + -var3.freeMemory()) >> 20;
                  v.field_j.a(ie.field_a + " fps; " + var4 + "MiB", 30, 70, 267386880, -1);
                  break L9;
                }
              }
              sf.b(16777215);
              kf.a(0, (byte) 98, (java.awt.Canvas) var6, 0);
              return;
            } else {
              nj.a(-20, wn.field_g, 100.0f);
              cg.a(-12, (java.awt.Canvas) var6);
              return;
            }
          }
        } else {
          ph.a((java.awt.Canvas) var6, param0, tj.h(103));
          return;
        }
    }

    private final void u() {
        int var2 = 0;
        int var3 = 0;
        short[] var4_ref_short__ = null;
        int var4 = 0;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        short[] var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        short[] var9 = null;
        short[] var10 = null;
        int var11 = 0;
        short[] var12 = null;
        short[] var13 = null;
        short[] var14 = null;
        short[] var15 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var8 = field_G;
          m.field_a = bn.a(lg.field_b, "", "chess_board2");
          sl.field_g = (dd) (Object) m.field_a.a(96, 1365, 5, -10, 5);
          j.field_v = bn.a(lg.field_b, "", "coin");
          jb.field_e = (dd) (Object) j.field_v.a(96, 1365, 5, -10, 5);
          var2 = qm.field_g;
          if (var2 != 1) {
            if (var2 != 0) {
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (1 != qm.field_g) {
            stackOut_6_0 = 14;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            stackOut_5_0 = 28;
            stackIn_7_0 = stackOut_5_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_7_0;
          am.field_c = new dd[var2];
          da.field_w = new bn[var2];
          tf.field_l = new bn[var2];
          qe.field_u = new dd[var2];
          var3 = qm.field_g;
          if (var3 == 1) {
            var3 = 1;
            L3: while (true) {
              if (var3 >= var2) {
                break L2;
              } else {
                L4: {
                  if (null == uh.field_u[var3]) {
                    break L4;
                  } else {
                    this.a(2, "halloween_backgrounds", uh.field_u[var3], true, var3, uh.field_w[var3]);
                    break L4;
                  }
                }
                L5: {
                  if (null == tf.field_l[var3]) {
                    break L5;
                  } else {
                    qe.field_u[var3] = (dd) (Object) tf.field_l[var3].a(96, 1365, 5, -10, 5);
                    am.field_c[var3] = (dd) (Object) da.field_w[var3].a(96, 1365, 5, -10, 5);
                    break L5;
                  }
                }
                var3++;
                continue L3;
              }
            }
          } else {
            L6: {
              if (0 == var3) {
                break L6;
              } else {
                break L6;
              }
            }
            var3 = 1;
            L7: while (true) {
              if (~var3 <= ~var2) {
                break L2;
              } else {
                L8: {
                  if (var3 == 13) {
                    tf.field_l[var3] = new bn(new bn[1], 1);
                    tf.field_l[var3].c();
                    da.field_w[var3] = new bn(new bn[1], 1);
                    da.field_w[var3].c();
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (fc.field_e[var3] == null) {
                    break L9;
                  } else {
                    this.a(2, "", fc.field_e[var3], true, var3, fc.field_d[var3]);
                    break L9;
                  }
                }
                L10: {
                  if (tf.field_l[var3] != null) {
                    L11: {
                      L12: {
                        if (3 == var3) {
                          break L12;
                        } else {
                          if (var3 == 4) {
                            break L12;
                          } else {
                            if (var3 == 5) {
                              break L12;
                            } else {
                              if (6 != var3) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      var15 = tf.field_l[var3].field_j;
                      var14 = var15;
                      var13 = var14;
                      var12 = var13;
                      var9 = var12;
                      var4_ref_short__ = var9;
                      var5 = var15.length + -1;
                      L13: while (true) {
                        if (var5 < 0) {
                          break L11;
                        } else {
                          var4_ref_short__[var5] = (short)(16296 + -eh.a(28207, sk.field_n, 16));
                          var5--;
                          continue L13;
                        }
                      }
                    }
                    qe.field_u[var3] = (dd) (Object) tf.field_l[var3].a(96, 1365, 5, -10, 5);
                    am.field_c[var3] = (dd) (Object) da.field_w[var3].a(96, 1365, 5, -10, 5);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var3++;
                continue L7;
              }
            }
          }
        }
        L14: {
          int discarded$3 = 0;
          this.p();
          kl.field_k[0] = null;
          var3 = qm.field_g;
          if (1 == var3) {
            kl.field_k[1] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_pawn_halloween");
            kl.field_k[4] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_rook_halloween");
            kl.field_k[2] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_knight_halloween");
            kl.field_k[3] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_bishop_halloween");
            kl.field_k[5] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_queen_halloween");
            kl.field_k[6] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_king_halloween");
            break L14;
          } else {
            L15: {
              if (var3 != 0) {
                break L15;
              } else {
                break L15;
              }
            }
            kl.field_k[1] = bn.a(lg.field_b, "", "white_pawn");
            kl.field_k[4] = bn.a(lg.field_b, "", "white_rook");
            kl.field_k[2] = bn.a(lg.field_b, "", "white_knight");
            kl.field_k[3] = bn.a(lg.field_b, "", "white_bishop");
            kl.field_k[5] = bn.a(lg.field_b, "", "white_queen");
            kl.field_k[6] = bn.a(lg.field_b, "", "white_king_gold_crown");
            break L14;
          }
        }
        se.field_N[0] = null;
        var3 = 1;
        L16: while (true) {
          if (var3 > 6) {
            L17: {
              var3 = qm.field_g;
              if (var3 != 1) {
                L18: {
                  if (var3 == 0) {
                    break L18;
                  } else {
                    break L18;
                  }
                }
                kl.field_k[1] = bn.a(lg.field_b, "", "black_pawn2_lighter");
                kl.field_k[4] = bn.a(lg.field_b, "", "black_rook2_lighter");
                kl.field_k[2] = bn.a(lg.field_b, "", "black_knight2_lighter");
                kl.field_k[3] = bn.a(lg.field_b, "", "black_bishop2_lighter");
                kl.field_k[5] = bn.a(lg.field_b, "", "black_queen_lighter");
                kl.field_k[6] = bn.a(lg.field_b, "", "black_king_red_crown2_lighter");
                break L17;
              } else {
                kl.field_k[1] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_pawn_halloween");
                kl.field_k[4] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_rook_halloween");
                kl.field_k[2] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_knight_halloween");
                kl.field_k[3] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_bishop_halloween");
                kl.field_k[5] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_queen_halloween");
                kl.field_k[6] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_king_halloween");
                break L17;
              }
            }
            var3 = 0;
            ad.field_f[0] = null;
            var3 = t.field_P[qm.field_g];
            var4 = vn.field_sb[qm.field_g];
            var5 = 1;
            L19: while (true) {
              if (var5 > 6) {
                var5 = -1 + kl.field_k.length;
                L20: while (true) {
                  if (0 > var5) {
                    var5 = n.field_b.length + -1;
                    L21: while (true) {
                      if (var5 < 0) {
                        jj.field_c[0] = null;
                        ig.field_f[0] = null;
                        nh.a(0.6000000238418579f);
                        nh.a();
                        int discarded$4 = -63;
                        nh.c(370, ec.c() + 240);
                        int discarded$5 = 1;
                        this.d();
                        return;
                      } else {
                        n.field_b[var5] = null;
                        var5--;
                        continue L21;
                      }
                    }
                  } else {
                    kl.field_k[var5] = null;
                    var5--;
                    continue L20;
                  }
                }
              } else {
                ad.field_f[var5] = (dd) (Object) kl.field_k[var5].a(var3, var4, 5, -10, 5);
                n.field_b[var5] = new bn(new bn[1], 1);
                var6 = n.field_b[var5].field_j;
                var7_int = n.field_b[var5].field_j.length + -1;
                L22: while (true) {
                  if (var7_int < 0) {
                    n.field_b[var5].a(((Chess) this).field_H);
                    ig.field_f[var5] = (dd) (Object) n.field_b[var5].a(var3, var4, 5, -10, 5);
                    dl.field_c[var5] = new bn(new bn[1], 1);
                    var11 = -1 + dl.field_c[var5].field_h;
                    var7_int = var11;
                    L23: while (true) {
                      if (var11 < 0) {
                        var7 = dl.field_c[var5].field_O;
                        dl.field_c[var5].field_O = dl.field_c[var5].field_P;
                        dl.field_c[var5].field_P = var7;
                        pj.field_c[var5] = (dd) (Object) dl.field_c[var5].a(var3 * 4, var4 / 4, 5, 10, 5);
                        var5++;
                        continue L19;
                      } else {
                        dl.field_c[var5].field_C[var11] = -dl.field_c[var5].field_C[var11];
                        var11--;
                        continue L23;
                      }
                    }
                  } else {
                    var6[var7_int] = (short) 0;
                    var7_int--;
                    continue L22;
                  }
                }
              }
            }
          } else {
            se.field_N[var3] = (dd) (Object) kl.field_k[var3].a(t.field_P[qm.field_g], vn.field_sb[qm.field_g], 5, -10, 5);
            n.field_b[var3] = new bn(new bn[1], 1);
            var10 = n.field_b[var3].field_j;
            var4_ref_short__ = n.field_b[var3].field_j;
            var5 = n.field_b[var3].field_j.length + -1;
            L24: while (true) {
              if (0 > var5) {
                n.field_b[var3].a(((Chess) this).field_H);
                jj.field_c[var3] = (dd) (Object) n.field_b[var3].a(t.field_P[qm.field_g], vn.field_sb[qm.field_g], 5, -10, 5);
                dl.field_c[var3] = new bn(new bn[1], 1);
                var5 = dl.field_c[var3].field_h - 1;
                L25: while (true) {
                  if (var5 < 0) {
                    var5_ref_int__ = dl.field_c[var3].field_O;
                    dl.field_c[var3].field_O = dl.field_c[var3].field_P;
                    dl.field_c[var3].field_P = var5_ref_int__;
                    q.field_b[var3] = (dd) (Object) dl.field_c[var3].a(t.field_P[qm.field_g], vn.field_sb[qm.field_g], 5, 10, 5);
                    var3++;
                    continue L16;
                  } else {
                    dl.field_c[var3].field_C[var5] = -dl.field_c[var3].field_C[var5];
                    var5--;
                    continue L25;
                  }
                }
              } else {
                var10[var5] = (short) 0;
                var5--;
                continue L24;
              }
            }
          }
        }
    }

    public static void v(int param0) {
        field_C = null;
        if (param0 != 2137) {
            field_C = null;
        }
        field_D = null;
        field_B = null;
    }

    private final void a(boolean param0, km param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var5 = field_G;
        try {
          L0: {
            var6 = param1.field_x;
            var3 = var6;
            var4 = -1 + var6.length;
            L1: while (true) {
              if (var4 < 0) {
                break L0;
              } else {
                var6[var4] = s.a(var6[var4], 1);
                var4--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("Chess.T(").append(0).append(44);
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    private final void q(int param0) {
        nj.a(-20, mm.field_e, 88.0f);
        ((Chess) this).a(true);
        km var6 = new km(25, 25);
        km var3 = new km(25, 25);
        int[] var4 = new int[]{12, 3, 19, 10, 15, 10, 15, 18, 10, 18, 10, 10, 6, 10, 12, 4};
        var6.e();
        wb.h(0, 0, wb.field_h, wb.field_c, 4, 1647364);
        wa.a(var4, 16777215);
        var3.e();
        wb.h(0, 0, wb.field_h, wb.field_c, 4, 1647364);
        wa.a(var4, 255);
        be.field_d = var6.c();
        df.field_e = var3.c();
        var6.a();
        var3.a();
        tb.field_c = var6.c();
        vn.field_rb = var3.c();
        ng.field_b = var6.b();
        me.field_d = var3.b();
        var6.a();
        var3.a();
        kn.field_G = var6.c();
        int var5 = -41 / ((19 - param0) / 56);
        vn.field_xb = var3.c();
        bg.field_Z = new km(77, 20);
        bg.field_Z.e();
        wb.h(0, 0, wb.field_h, wb.field_c, -1 + wb.field_c / 2, 1449732);
        ph.field_j.b(48);
        ek.field_c = qm.a(1, "", "history_replay_controls", mm.field_d);
        ke.field_g = ao.a(mm.field_d, "turntime_icons", 2993, "");
    }

    private final void o() {
        if (td.field_o != null) {
            q.a(5, td.field_o);
            td.field_o = null;
            int discarded$0 = 0;
            ob.f();
        }
        mm.field_d = ri.a(1, (byte) 127);
        lc.field_m = ri.a(2, (byte) 127);
        tk.field_g = ri.a(3, (byte) 127);
        pg.field_o = ri.a(4, (byte) 127);
        li.field_g = ri.a(5, (byte) 127);
        wg.field_q = ri.a(6, (byte) 127);
        lg.field_b = ri.a(7, (byte) 127);
        bo.field_d = ri.a(9, (byte) 127);
        ca.field_b = ri.a(13, (byte) 127);
    }

    private final void s() {
        int var2 = 0;
        int var3 = field_G;
        nj.a(-20, mm.field_e, 85.0f);
        ((Chess) this).a(true);
        v.field_j = dm.a(0, mm.field_d, "font", bo.field_d, "");
        jj.field_b = dm.a(0, hm.field_e, "", f.field_b, "kartika13");
        jj.field_d = dm.a(0, hm.field_e, "", f.field_b, "roman12");
        c discarded$0 = dm.a(0, mm.field_d, "font_prose_bold", bo.field_d, "");
        lj.field_n = jn.a("unachieved", 8221, "basic", hm.field_e);
        lj.field_n.a();
        ao.field_e = jn.a("orbcoin", 8221, "basic", hm.field_e);
        ao.field_e.a();
        me.field_c = qm.a(1, "", "achievements_large", mm.field_d);
        for (var2 = me.field_c.length - 1; 0 <= var2; var2--) {
            me.field_c[var2].a();
        }
        em.field_r = ai.a(27176, "frame", "", mm.field_d);
        gh.field_b = ai.a(27176, "button_frame", "", mm.field_d);
    }

    private final void d() {
        int[] var2 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8_int = 0;
        km var8 = null;
        dd[] var9_ref_dd__ = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        dd[] stackIn_5_0 = null;
        dd[] stackOut_4_0 = null;
        dd[] stackOut_3_0 = null;
        var14 = field_G;
        var15 = new int[]{0, -95, -600, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        var2 = var15;
        var3 = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        var4 = new int[]{0, 0, 0, 0, 0, -65536, 0, 65536, 0, 65536, 0, 0};
        var5 = (int)(Math.sin(0.39269908169872414) * 65536.0);
        var6 = (int)(Math.cos(0.39269908169872414) * 65536.0);
        var7 = new int[]{0, 0, 0, var6, 0, var5, 0, 65536, 0, -var5, 0, var6};
        rl.field_d[0][0] = new km(0, 0);
        rl.field_d[1][0] = new km(0, 0);
        hb.field_b[0][0] = new km(0, 0);
        hb.field_b[1][0] = new km(0, 0);
        ub.field_d[0][0] = new km(0, 0);
        ub.field_d[1][0] = new km(0, 0);
        qc.field_d[0][0] = new km(0, 0);
        qc.field_d[1][0] = new km(0, 0);
        var8_int = 0;
        L0: while (true) {
          if (var8_int > 1) {
            dj.field_t = ub.field_d[1][1].c();
            ph.field_j.b(48);
            nh.a();
            int discarded$1 = -63;
            nh.c(370, ec.c() + 240);
            var8_int = 0;
            L1: while (true) {
              if (2 <= var8_int) {
                var8_int = 0;
                L2: while (true) {
                  if (var8_int > 1) {
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= 2) {
                        dj.field_t.d();
                        dj.field_t.field_r = 0;
                        dj.field_t.field_s = 0;
                        ph.field_j.b(48);
                        tg.field_r = null;
                        return;
                      } else {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 2) {
                            var10++;
                            continue L3;
                          } else {
                            L5: {
                              L6: {
                                if (0 != var10) {
                                  break L6;
                                } else {
                                  if (var11 != 0) {
                                    break L6;
                                  } else {
                                    var9 = 3100495;
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                if (var10 != 0) {
                                  break L7;
                                } else {
                                  if (var11 == 1) {
                                    var9 = 16444375;
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (var10 != 1) {
                                  break L8;
                                } else {
                                  if (var11 == 0) {
                                    var9 = 4525064;
                                    break L5;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var9 = 14101529;
                              break L5;
                            }
                            var12 = 0;
                            L9: while (true) {
                              if (var12 >= 2) {
                                var11++;
                                continue L4;
                              } else {
                                var13 = 0;
                                L10: while (true) {
                                  if (7 <= var13) {
                                    var12++;
                                    continue L9;
                                  } else {
                                    var8 = new km(45, 45);
                                    var8.e();
                                    wb.f(0, 0, 45, 45, var9);
                                    rl.field_d[var12][var13].a(0, 0);
                                    cl.field_c[var10][var11][var12][var13] = var8;
                                    var13++;
                                    continue L10;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L11: {
                      if (var8_int != 0) {
                        var9 = 1;
                        break L11;
                      } else {
                        var9 = 16777215;
                        break L11;
                      }
                    }
                    var10 = 1;
                    L12: while (true) {
                      if (var10 >= 7) {
                        var8_int++;
                        continue L2;
                      } else {
                        var11 = 0;
                        L13: while (true) {
                          if (var11 >= 2) {
                            hb.field_b[var8_int][var10] = new km(45, 45);
                            hb.field_b[var8_int][var10].e();
                            rl.field_d[var8_int][var10].a(23, 1024, 23, 0, (byte) 94);
                            hb.field_b[var8_int][var10].f(var9);
                            var11 = 0;
                            L14: while (true) {
                              if (var11 >= 2) {
                                qc.field_d[var8_int][var10] = new km(45, 45);
                                qc.field_d[var8_int][var10].e();
                                ub.field_d[var8_int][var10].a(23, 1024, 23, 0, (byte) 101);
                                qc.field_d[var8_int][var10].f(var9);
                                var10++;
                                continue L12;
                              } else {
                                ub.field_d[var8_int][var10].f(var9);
                                var11++;
                                continue L14;
                              }
                            }
                          } else {
                            rl.field_d[var8_int][var10].f(var9);
                            var11++;
                            continue L13;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                dj.field_t.f(1);
                var8_int++;
                continue L1;
              }
            }
          } else {
            L15: {
              if (var8_int != 0) {
                stackOut_4_0 = se.field_N;
                stackIn_5_0 = stackOut_4_0;
                break L15;
              } else {
                stackOut_3_0 = ad.field_f;
                stackIn_5_0 = stackOut_3_0;
                break L15;
              }
            }
            var9_ref_dd__ = stackIn_5_0;
            var10 = 1;
            L16: while (true) {
              if (7 <= var10) {
                var8_int++;
                continue L0;
              } else {
                L17: {
                  ub.field_d[var8_int][var10] = new km(180, 180);
                  ub.field_d[var8_int][var10].e();
                  nh.a();
                  if (var10 == 2) {
                    var11_ref_int__ = var4;
                    break L17;
                  } else {
                    if (var10 != 4) {
                      var11_ref_int__ = var3;
                      break L17;
                    } else {
                      var11_ref_int__ = var7;
                      break L17;
                    }
                  }
                }
                var9_ref_dd__[var10].a(var15, var11_ref_int__);
                rl.field_d[var8_int][var10] = tg.field_r[-var10 + 6 + 6 * var8_int];
                var10++;
                continue L16;
              }
            }
          }
        }
    }

    private final void l() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        int stackIn_14_9 = 0;
        int stackIn_14_10 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_15_6 = 0;
        int stackIn_15_7 = 0;
        int stackIn_15_8 = 0;
        int stackIn_15_9 = 0;
        int stackIn_15_10 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_16_7 = 0;
        int stackIn_16_8 = 0;
        int stackIn_16_9 = 0;
        int stackIn_16_10 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_17_7 = 0;
        int stackIn_17_8 = 0;
        int stackIn_17_9 = 0;
        int stackIn_17_10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        int stackIn_18_8 = 0;
        int stackIn_18_9 = 0;
        int stackIn_18_10 = 0;
        int stackIn_18_11 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        int stackOut_11_8 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_13_6 = 0;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        int stackOut_13_9 = 0;
        int stackOut_13_10 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        int stackOut_14_7 = 0;
        int stackOut_14_8 = 0;
        int stackOut_14_9 = 0;
        int stackOut_14_10 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        int stackOut_17_6 = 0;
        int stackOut_17_7 = 0;
        int stackOut_17_8 = 0;
        int stackOut_17_9 = 0;
        int stackOut_17_10 = 0;
        int stackOut_17_11 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_15_7 = 0;
        int stackOut_15_8 = 0;
        int stackOut_15_9 = 0;
        int stackOut_15_10 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        int stackOut_16_7 = 0;
        int stackOut_16_8 = 0;
        int stackOut_16_9 = 0;
        int stackOut_16_10 = 0;
        int stackOut_16_11 = 0;
        L0: {
          var4 = field_G;
          if (jc.field_f == 2) {
            break L0;
          } else {
            if (11 == jc.field_f) {
              break L0;
            } else {
              L1: {
                var2 = 1;
                if (null != pd.field_Rb) {
                  if (g.a(-1, pd.field_Rb.field_Xb)) {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_8_0 = stackOut_5_0;
                    break L1;
                  }
                } else {
                  stackOut_3_0 = 0;
                  stackIn_8_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var3 = stackIn_8_0;
                if (lk.a((byte) 104)) {
                  L3: {
                    stackOut_10_0 = -105;
                    stackOut_10_1 = 15;
                    stackOut_10_2 = 14;
                    stackOut_10_3 = 11;
                    stackOut_10_4 = var2;
                    stackOut_10_5 = fl.field_p;
                    stackOut_10_6 = 13;
                    stackOut_10_7 = 0;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    stackIn_12_5 = stackOut_10_5;
                    stackIn_12_6 = stackOut_10_6;
                    stackIn_12_7 = stackOut_10_7;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    stackIn_11_3 = stackOut_10_3;
                    stackIn_11_4 = stackOut_10_4;
                    stackIn_11_5 = stackOut_10_5;
                    stackIn_11_6 = stackOut_10_6;
                    stackIn_11_7 = stackOut_10_7;
                    if (fl.field_n <= 50) {
                      stackOut_12_0 = stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = stackIn_12_2;
                      stackOut_12_3 = stackIn_12_3;
                      stackOut_12_4 = stackIn_12_4;
                      stackOut_12_5 = stackIn_12_5;
                      stackOut_12_6 = stackIn_12_6;
                      stackOut_12_7 = stackIn_12_7;
                      stackOut_12_8 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      stackIn_13_5 = stackOut_12_5;
                      stackIn_13_6 = stackOut_12_6;
                      stackIn_13_7 = stackOut_12_7;
                      stackIn_13_8 = stackOut_12_8;
                      break L3;
                    } else {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = stackIn_11_2;
                      stackOut_11_3 = stackIn_11_3;
                      stackOut_11_4 = stackIn_11_4;
                      stackOut_11_5 = stackIn_11_5;
                      stackOut_11_6 = stackIn_11_6;
                      stackOut_11_7 = stackIn_11_7;
                      stackOut_11_8 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_13_3 = stackOut_11_3;
                      stackIn_13_4 = stackOut_11_4;
                      stackIn_13_5 = stackOut_11_5;
                      stackIn_13_6 = stackOut_11_6;
                      stackIn_13_7 = stackOut_11_7;
                      stackIn_13_8 = stackOut_11_8;
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = stackIn_13_2;
                      stackOut_13_3 = stackIn_13_3;
                      stackOut_13_4 = stackIn_13_4;
                      stackOut_13_5 = stackIn_13_5;
                      stackOut_13_6 = stackIn_13_6;
                      stackOut_13_7 = stackIn_13_7;
                      stackOut_13_8 = stackIn_13_8;
                      stackOut_13_9 = var3;
                      stackOut_13_10 = 1;
                      stackIn_16_0 = stackOut_13_0;
                      stackIn_16_1 = stackOut_13_1;
                      stackIn_16_2 = stackOut_13_2;
                      stackIn_16_3 = stackOut_13_3;
                      stackIn_16_4 = stackOut_13_4;
                      stackIn_16_5 = stackOut_13_5;
                      stackIn_16_6 = stackOut_13_6;
                      stackIn_16_7 = stackOut_13_7;
                      stackIn_16_8 = stackOut_13_8;
                      stackIn_16_9 = stackOut_13_9;
                      stackIn_16_10 = stackOut_13_10;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      stackIn_14_5 = stackOut_13_5;
                      stackIn_14_6 = stackOut_13_6;
                      stackIn_14_7 = stackOut_13_7;
                      stackIn_14_8 = stackOut_13_8;
                      stackIn_14_9 = stackOut_13_9;
                      stackIn_14_10 = stackOut_13_10;
                      if (hj.field_i) {
                        break L5;
                      } else {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = stackIn_14_2;
                        stackOut_14_3 = stackIn_14_3;
                        stackOut_14_4 = stackIn_14_4;
                        stackOut_14_5 = stackIn_14_5;
                        stackOut_14_6 = stackIn_14_6;
                        stackOut_14_7 = stackIn_14_7;
                        stackOut_14_8 = stackIn_14_8;
                        stackOut_14_9 = stackIn_14_9;
                        stackOut_14_10 = stackIn_14_10;
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        stackIn_17_3 = stackOut_14_3;
                        stackIn_17_4 = stackOut_14_4;
                        stackIn_17_5 = stackOut_14_5;
                        stackIn_17_6 = stackOut_14_6;
                        stackIn_17_7 = stackOut_14_7;
                        stackIn_17_8 = stackOut_14_8;
                        stackIn_17_9 = stackOut_14_9;
                        stackIn_17_10 = stackOut_14_10;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        stackIn_15_3 = stackOut_14_3;
                        stackIn_15_4 = stackOut_14_4;
                        stackIn_15_5 = stackOut_14_5;
                        stackIn_15_6 = stackOut_14_6;
                        stackIn_15_7 = stackOut_14_7;
                        stackIn_15_8 = stackOut_14_8;
                        stackIn_15_9 = stackOut_14_9;
                        stackIn_15_10 = stackOut_14_10;
                        if (!hl.field_h) {
                          stackOut_17_0 = stackIn_17_0;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = stackIn_17_2;
                          stackOut_17_3 = stackIn_17_3;
                          stackOut_17_4 = stackIn_17_4;
                          stackOut_17_5 = stackIn_17_5;
                          stackOut_17_6 = stackIn_17_6;
                          stackOut_17_7 = stackIn_17_7;
                          stackOut_17_8 = stackIn_17_8;
                          stackOut_17_9 = stackIn_17_9;
                          stackOut_17_10 = stackIn_17_10;
                          stackOut_17_11 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          stackIn_18_2 = stackOut_17_2;
                          stackIn_18_3 = stackOut_17_3;
                          stackIn_18_4 = stackOut_17_4;
                          stackIn_18_5 = stackOut_17_5;
                          stackIn_18_6 = stackOut_17_6;
                          stackIn_18_7 = stackOut_17_7;
                          stackIn_18_8 = stackOut_17_8;
                          stackIn_18_9 = stackOut_17_9;
                          stackIn_18_10 = stackOut_17_10;
                          stackIn_18_11 = stackOut_17_11;
                          break L4;
                        } else {
                          stackOut_15_0 = stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = stackIn_15_2;
                          stackOut_15_3 = stackIn_15_3;
                          stackOut_15_4 = stackIn_15_4;
                          stackOut_15_5 = stackIn_15_5;
                          stackOut_15_6 = stackIn_15_6;
                          stackOut_15_7 = stackIn_15_7;
                          stackOut_15_8 = stackIn_15_8;
                          stackOut_15_9 = stackIn_15_9;
                          stackOut_15_10 = stackIn_15_10;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          stackIn_16_4 = stackOut_15_4;
                          stackIn_16_5 = stackOut_15_5;
                          stackIn_16_6 = stackOut_15_6;
                          stackIn_16_7 = stackOut_15_7;
                          stackIn_16_8 = stackOut_15_8;
                          stackIn_16_9 = stackOut_15_9;
                          stackIn_16_10 = stackOut_15_10;
                          break L5;
                        }
                      }
                    }
                    stackOut_16_0 = stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = stackIn_16_2;
                    stackOut_16_3 = stackIn_16_3;
                    stackOut_16_4 = stackIn_16_4;
                    stackOut_16_5 = stackIn_16_5;
                    stackOut_16_6 = stackIn_16_6;
                    stackOut_16_7 = stackIn_16_7;
                    stackOut_16_8 = stackIn_16_8;
                    stackOut_16_9 = stackIn_16_9;
                    stackOut_16_10 = stackIn_16_10;
                    stackOut_16_11 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    stackIn_18_4 = stackOut_16_4;
                    stackIn_18_5 = stackOut_16_5;
                    stackIn_18_6 = stackOut_16_6;
                    stackIn_18_7 = stackOut_16_7;
                    stackIn_18_8 = stackOut_16_8;
                    stackIn_18_9 = stackOut_16_9;
                    stackIn_18_10 = stackOut_16_10;
                    stackIn_18_11 = stackOut_16_11;
                    break L4;
                  }
                  bh.a(stackIn_18_0, stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4 != 0, stackIn_18_5, stackIn_18_6, stackIn_18_7, stackIn_18_8 != 0, stackIn_18_9 != 0, stackIn_18_10 != 0, stackIn_18_11 != 0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L6: while (true) {
                int discarded$2 = 18954;
                if (!kf.d()) {
                  break L0;
                } else {
                  L7: {
                    if (!wn.field_f) {
                      break L7;
                    } else {
                      boolean discarded$3 = tl.a(12, 13, 123, 15);
                      break L7;
                    }
                  }
                  L8: {
                    if (!hl.field_h) {
                      break L8;
                    } else {
                      if (pd.field_Lb.f(89)) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (!hj.field_i) {
                      break L9;
                    } else {
                      if (!oc.field_p.f(-110)) {
                        break L9;
                      } else {
                        continue L6;
                      }
                    }
                  }
                  ae.field_e[jc.field_f].b((byte) 113);
                  continue L6;
                }
              }
            }
          }
        }
        ae.field_e[jc.field_f].a((byte) -115);
    }

    private final void a(int param0, String param1, String param2, boolean param3, int param4, int param5) {
        RuntimeException var7 = null;
        short[] var7_array = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        short[] var11 = null;
        short[] var12 = null;
        short[] var13 = null;
        short[] var14 = null;
        short[] var15 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = field_G;
        try {
          L0: {
            tf.field_l[param4] = bn.a(lg.field_b, param1, param2);
            tf.field_l[param4].a(param5, param5, param5, 2);
            da.field_w[param4] = new bn(new bn[1], 1);
            var15 = da.field_w[param4].field_j;
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var7_array = var11;
            var8 = new byte[var15.length];
            var9 = da.field_w[param4].field_j.length - 1;
            L1: while (true) {
              if (var9 < 0) {
                da.field_w[param4].field_D = var8;
                da.field_w[param4].a(((Chess) this).field_H);
                break L0;
              } else {
                var11[var9] = (short) 0;
                var8[var9] = (byte) -36;
                var9--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("Chess.U(").append(2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 1 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void b(int param0) {
        ((Chess) this).a(14, 12, 0, 11, 14, false, -4, 10);
        aa.field_f = ug.field_b;
        nh.field_m = false;
        vl var4 = new vl();
        var4.b(128, 16383, 9);
        vl var3 = new vl();
        var3.b(128, 16383, 9);
        d.a(var3, 22050, var4, oc.field_l, (java.awt.Component) (Object) ja.field_h, true, (byte) -71);
        kj.field_h = 255;
        ni.field_d = 1;
        le.field_f = 16777215;
        cm.field_w = 255;
        kg.field_V = 1;
        qb.field_b = 16777215;
        if (param0 != 2) {
            field_E = -100;
        }
        ((Chess) this).a(true, param0 + 10229, false, true, false, false, true);
        sk.field_r[62] = 1;
        sk.field_r[64] = 1;
        sk.field_r[61] = 5;
        sk.field_r[10] = -1;
        sk.field_r[66] = 1;
        sk.field_r[67] = 1;
        sk.field_r[65] = 1;
        sk.field_r[57] = -2;
        sk.field_r[63] = 1;
        sk.field_r[9] = -1;
        sk.field_r[60] = 7;
        sk.field_r[58] = -2;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        L0: {
          var8 = field_G;
          if (n.field_e != n.field_f) {
            if (n.field_e != ka.field_h) {
              if (n.field_e == on.field_d) {
                L1: {
                  if (vi.a(-3)) {
                    jc.field_f = cc.field_z;
                    break L1;
                  } else {
                    L2: {
                      gf.field_d = vc.a(-127, 4);
                      if (cb.field_e == null) {
                        break L2;
                      } else {
                        int discarded$14 = 3;
                        ba.a(cb.field_e, -102);
                        break L2;
                      }
                    }
                    L3: {
                      int discarded$15 = 5;
                      um.a();
                      qk.field_h = ge.field_bb;
                      if (a.field_d) {
                        int discarded$16 = 15;
                        fk.a(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (!da.a(qk.field_h, true)) {
                      break L1;
                    } else {
                      de.a(-31645);
                      break L1;
                    }
                  }
                }
                var3 = jc.field_f;
                uk.a(qk.field_h, false, 28333, var3);
                n.field_e = pj.field_d;
                nc.field_T = 31;
                break L0;
              } else {
                ji.field_S = ji.field_S - 1;
                if (ji.field_S != 0) {
                  break L0;
                } else {
                  n.field_e = n.field_f;
                  break L0;
                }
              }
            } else {
              ji.field_S = ji.field_S + 1;
              if (ji.field_S == 16) {
                L4: {
                  if (ga.a(true)) {
                    int discarded$17 = -3750;
                    uh.j();
                    break L4;
                  } else {
                    int discarded$18 = 12082;
                    db.h();
                    break L4;
                  }
                }
                n.field_e = on.field_d;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            L5: {
              var3 = 0;
              var4 = 0;
              if (param0) {
                break L5;
              } else {
                if (jc.field_f != qk.field_h) {
                  nc.field_T = nc.field_T + 1;
                  if (nc.field_T == 32) {
                    de.a(-31645);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  L6: {
                    if (jc.field_f == -1) {
                      L7: {
                        if (pk.field_j) {
                          var4 = 1;
                          var3 = 1;
                          break L7;
                        } else {
                          oc.field_p.a((byte) -39, true);
                          L8: while (true) {
                            int discarded$19 = 18954;
                            if (!kf.d()) {
                              break L7;
                            } else {
                              if (oc.field_p.f(-111)) {
                                continue L8;
                              } else {
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                      if (-1 == jc.field_f) {
                        break L6;
                      } else {
                        if (da.a(jc.field_f, true)) {
                          ae.field_e[jc.field_f].a((byte) -110);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      if (jc.field_f != -2) {
                        if (!da.a(jc.field_f, true)) {
                          break L6;
                        } else {
                          if (!pk.field_j) {
                            ae.field_e[jc.field_f].a((byte) -125);
                            break L6;
                          } else {
                            int discarded$20 = 106;
                            this.l();
                            break L6;
                          }
                        }
                      } else {
                        var3 = 1;
                        break L6;
                      }
                    }
                  }
                  if (jc.field_f != 3) {
                    break L5;
                  } else {
                    var3 = 1;
                    var4 = 1;
                    break L5;
                  }
                }
              }
            }
            L9: {
              if (!pk.field_j) {
                break L9;
              } else {
                if (r.field_bc) {
                  break L9;
                } else {
                  if (!fi.field_a) {
                    L10: {
                      mi.a((byte) -78, var3 != 0);
                      if (!hl.field_h) {
                        break L10;
                      } else {
                        pd.field_Lb.a((byte) -37, var4 != 0);
                        break L10;
                      }
                    }
                    L11: {
                      if (!hj.field_i) {
                        break L11;
                      } else {
                        oc.field_p.a((byte) -65, var4 != 0);
                        break L11;
                      }
                    }
                    L12: while (true) {
                      int discarded$21 = 18954;
                      if (!kf.d()) {
                        break L9;
                      } else {
                        L13: {
                          if (wn.field_f) {
                            boolean discarded$22 = tl.a(12, 13, 94, 15);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (!hl.field_h) {
                            break L14;
                          } else {
                            boolean discarded$23 = pd.field_Lb.f(26);
                            break L14;
                          }
                        }
                        if (hj.field_i) {
                          boolean discarded$24 = oc.field_p.f(57);
                          continue L12;
                        } else {
                          continue L12;
                        }
                      }
                    }
                  } else {
                    break L9;
                  }
                }
              }
            }
            L15: {
              if (pk.field_j) {
                break L15;
              } else {
                id.a((byte) 29);
                break L15;
              }
            }
            if (wn.field_f) {
              if (aa.field_f >= ug.field_b) {
                var5 = ug.field_b * ug.field_b;
                var6 = var5 - aa.field_f * aa.field_f;
                var7 = var6 * 120 / var5 + sb.field_tb;
                ih.a(var7, 65);
                break L0;
              } else {
                aa.field_f = aa.field_f + 1;
                int discarded$25 = -63;
                nh.c(370, 240 + ec.c());
                vk.field_e = true;
                t.field_Q = true;
                var5 = ug.field_b * ug.field_b;
                var6 = var5 - aa.field_f * aa.field_f;
                var7 = var6 * 120 / var5 + sb.field_tb;
                ih.a(var7, 65);
                break L0;
              }
            } else {
              if (aa.field_f > 0) {
                aa.field_f = aa.field_f - 1;
                int discarded$26 = -63;
                nh.c(370, ec.c() + 240);
                t.field_Q = true;
                vk.field_e = true;
                var5 = ug.field_b * ug.field_b;
                var6 = var5 - aa.field_f * aa.field_f;
                var7 = var6 * 120 / var5 + sb.field_tb;
                ih.a(var7, 65);
                break L0;
              } else {
                var5 = ug.field_b * ug.field_b;
                var6 = var5 - aa.field_f * aa.field_f;
                var7 = var6 * 120 / var5 + sb.field_tb;
                ih.a(var7, 65);
                break L0;
              }
            }
          }
        }
        L16: {
          if (-3 != qk.field_h) {
            break L16;
          } else {
            cb.field_e = null;
            var9 = new String[]{vg.field_b, mm.field_c};
            oc.field_p = new un(false, 0, var9, 0, 0, false);
            qk.field_h = -1;
            ma.field_D = true;
            break L16;
          }
        }
        L17: {
          if (-4 == qk.field_h) {
            qn.field_U.f(9, -87);
            r.field_bc = true;
            qk.field_h = jc.field_f;
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          var3 = 107 / ((param1 - -51) / 45);
          if (qk.field_h == -5) {
            L19: {
              if (null == pd.field_Rb) {
                break L19;
              } else {
                int discarded$27 = 28113;
                db.a(11, pd.field_Rb.g((byte) -121));
                break L19;
              }
            }
            fi.field_a = true;
            qk.field_h = jc.field_f;
            break L18;
          } else {
            break L18;
          }
        }
    }

    public final void init() {
        ((Chess) this).a(16742, 15, "Chess");
    }

    private final void r() {
        km var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = field_G;
          nj.a(-20, mm.field_e, 95.0f);
          ((Chess) this).a(true);
          vn.field_Bb = this.a(2, wk.a(mm.field_d, 1, "win_black", ""));
          jh.field_b = this.a(2, wk.a(mm.field_d, 1, "win_white", ""));
          fa.field_e = this.a(2, wk.a(mm.field_d, 1, "win_none", ""));
          this.a(false, vn.field_Bb);
          this.a(false, jh.field_b);
          this.a(false, fa.field_e);
          var3 = qm.field_g;
          if (var3 != 1) {
            var2 = wk.a(mm.field_d, 1, "background_3d", "");
            break L0;
          } else {
            var2 = wk.a(mm.field_d, 1, "background_3d_halloween", "");
            break L0;
          }
        }
        ph.field_f = new km(var2.field_w * 2, var2.field_t * 2);
        ph.field_f.e();
        var2.a(0, 0, wb.field_h, wb.field_c);
        wb.e(2, 2, 0, 0, wb.field_h, wb.field_c);
        ph.field_j.b(48);
        var3 = qm.field_g;
        if (var3 != 1) {
          ob.field_B = jn.a("scenery_2d_grass", 8221, "", mm.field_d);
          return;
        } else {
          ob.field_B = jn.a("scenery_2d_mud", 8221, "halloween_chess_background", mm.field_d);
          return;
        }
    }

    final void f(byte param0) {
        int var3 = field_G;
        Chess.v(2137);
        int discarded$0 = 27706;
        ef.a();
        jc.d(-31);
        int discarded$1 = 0;
        ic.a();
        int discarded$2 = 82;
        dn.a();
        int discarded$3 = 18854;
        me.a();
        dd.b();
        nh.c();
        int discarded$4 = 0;
        vc.a();
        int discarded$5 = 124;
        fi.b();
        int discarded$6 = 5;
        q.a();
        int discarded$7 = 0;
        i.a();
        int discarded$8 = -1699;
        jl.a();
        int discarded$9 = -113;
        gb.f();
        ae.a(122);
        fa.a((byte) -53);
        int discarded$10 = 1;
        qk.a();
        int discarded$11 = 1;
        rl.b();
        int discarded$12 = 30;
        ek.b();
        wb.d();
        int discarded$13 = 73;
        um.d();
        lh.a();
        int discarded$14 = -8;
        jf.a();
        p.f((byte) -128);
        int discarded$15 = -109;
        ud.a();
        int discarded$16 = 1;
        gi.a();
        int discarded$17 = 91;
        il.a();
        int discarded$18 = -16987;
        bb.b();
        int discarded$19 = -2;
        rn.a();
        int discarded$20 = 3411;
        ti.a();
        int discarded$21 = -85;
        ng.a();
        li.a(-69);
        int discarded$22 = -46;
        wh.a();
        ld.a(0);
        int discarded$23 = -14;
        vk.a();
        int discarded$24 = -26815;
        wk.a();
        int discarded$25 = -102;
        ca.a();
        int discarded$26 = 6;
        gm.a();
        int discarded$27 = -97;
        vj.a();
        int discarded$28 = 104;
        rh.a();
        a.a(-9);
        int discarded$29 = 0;
        gg.c();
        fe.a((byte) 106);
        int discarded$30 = 0;
        aa.d();
        un.a((byte) 123);
        int discarded$31 = -16534;
        oh.b();
        eb.a(-29115);
        wm.b((byte) -108);
        int discarded$32 = 64655;
        hj.c();
        int discarded$33 = -9;
        lc.b();
        int discarded$34 = 0;
        hn.a();
        o.a((byte) -91);
        int discarded$35 = -2;
        tn.a();
        md.d();
        int discarded$36 = -1;
        vl.f();
        mc.a((byte) 47);
        int discarded$37 = -107;
        pi.b();
        int discarded$38 = -113;
        qb.a();
        int discarded$39 = 6;
        ue.a();
        int discarded$40 = 0;
        he.a();
        int discarded$41 = 0;
        pd.n();
        ei.d((byte) -55);
        int discarded$42 = -128;
        ci.i();
        cf.k(5);
        int discarded$43 = 3;
        ok.f();
        int discarded$44 = -75;
        dh.d();
        nb.f((byte) -33);
        int discarded$45 = 0;
        pc.k();
        int discarded$46 = 92;
        r.m();
        int discarded$47 = -66;
        kl.a();
        int discarded$48 = 27265;
        qd.a();
        al.d();
        mi.c((byte) 124);
        int discarded$49 = -119;
        sh.c();
        int discarded$50 = 0;
        of.c();
        le.a(-485);
        int discarded$51 = -39;
        bo.a();
        int discarded$52 = -99;
        tb.b();
        int discarded$53 = 23;
        in.b();
        int discarded$54 = -109;
        an.a();
        int discarded$55 = 0;
        ln.k();
        dk.b(12000);
        int discarded$56 = 1;
        ce.a();
        int discarded$57 = 87;
        lj.a();
        int discarded$58 = -6145;
        pj.a();
        int discarded$59 = 1007;
        ua.a();
        int discarded$60 = 32286;
        rd.a();
        int discarded$61 = -1962602524;
        ie.a();
        int discarded$62 = -9;
        fm.l();
        vd.l((byte) -106);
        int discarded$63 = 30;
        ch.m();
        vn.j((byte) 5);
        int discarded$64 = 106;
        ol.h();
        int discarded$65 = 82;
        ii.a();
        wf.a(35);
        int discarded$66 = -93;
        s.g();
        int discarded$67 = 125;
        vg.b();
        int discarded$68 = 93;
        tg.a();
        n.a(-123);
        int discarded$69 = 1;
        rc.a();
        int discarded$70 = -1;
        gh.a();
        int discarded$71 = -105;
        tl.f();
        int discarded$72 = 23111;
        id.a();
        int discarded$73 = 120;
        mm.a();
        hb.a(false);
        int discarded$74 = -65;
        sn.a();
        int discarded$75 = 69;
        wg.b();
        cd.a(1570);
        qe.k(2);
        int discarded$76 = 8;
        nk.l();
        sc.a(-26862);
        hd.a((byte) -2);
        fk.d((byte) 1);
        l.c((byte) -26);
        wa.b();
        int discarded$77 = -17436;
        b.a();
        gf.a(540);
        cb.a(-1);
        int discarded$78 = -124;
        ga.a();
        int discarded$79 = -123;
        af.a();
        pk.b((byte) -100);
        int discarded$80 = 85;
        lg.a();
        int discarded$81 = 7;
        jj.a();
        uc.a(-112);
        int discarded$82 = 122;
        be.a();
        int discarded$83 = 123;
        dm.a();
        int discarded$84 = -105;
        ke.a();
        int discarded$85 = 67;
        gl.a();
        int discarded$86 = -30;
        ej.a();
        jg.l(10000536);
        uk.c(-1);
        int discarded$87 = 10;
        bc.a();
        int discarded$88 = 60;
        bi.a();
        int discarded$89 = 76;
        hm.a();
        int var2 = 98 % ((-27 - param0) / 55);
        w.k(-13077);
        int discarded$90 = 1;
        fl.b();
        int discarded$91 = -1;
        eg.b();
        fg.a(true);
        int discarded$92 = 121;
        va.a();
        int discarded$93 = 71;
        pe.a();
        int discarded$94 = -49;
        ig.a();
        int discarded$95 = 0;
        ob.b();
        int discarded$96 = -82;
        ad.a();
        int discarded$97 = 109;
        cc.e();
        int discarded$98 = 84;
        gd.a();
        tc.i(-7588);
        da.e(16);
        int discarded$99 = -93;
        jh.a();
        int discarded$100 = -115;
        ab.g();
        sl.a((byte) 59);
        ge.k(0);
        hl.a(true);
        hi.c();
        int discarded$101 = 119;
        am.c();
        int discarded$102 = -86;
        fn.a();
        int discarded$103 = 3;
        em.b();
        int discarded$104 = -18067;
        rb.b();
        int discarded$105 = 0;
        lk.a();
        int discarded$106 = 124;
        sg.a();
        la.a(69);
        g.a(-20905);
        int discarded$107 = -6;
        qm.a();
        int discarded$108 = -99;
        qh.a();
        int discarded$109 = -24420;
        f.a();
        en.a();
        ia.a(256);
        int discarded$110 = 109;
        ql.a();
        int discarded$111 = 102;
        vh.a();
        int discarded$112 = 84;
        nd.a();
        int discarded$113 = -10406;
        nj.c();
        int discarded$114 = -122;
        ka.a();
        int discarded$115 = 1;
        sj.a();
        ub.b((byte) 80);
        mf.f(0);
        fb.h(-1);
        int discarded$116 = 127;
        kn.e();
        int discarded$117 = -24;
        k.h();
        eh.i(888706465);
        int discarded$118 = -96;
        ma.f();
        qj.a(124);
        m.a(false);
        dg.a();
        int discarded$119 = -12374;
        ib.a();
        qf.a((byte) -46);
        int discarded$120 = 0;
        th.a();
        rf.a(9);
        int discarded$121 = -54;
        di.g();
        int discarded$122 = 115;
        kj.a();
        int discarded$123 = 7;
        qc.a();
        j.d((byte) -84);
        int discarded$124 = -114;
        dj.d();
        int discarded$125 = -117;
        v.a();
        int discarded$126 = 0;
        wn.b();
        int discarded$127 = 17;
        oa.a();
        int discarded$128 = 64;
        kh.b();
        si.c(23);
        int discarded$129 = -120;
        de.a();
        int discarded$130 = 76;
        tm.a();
        og.a();
        int discarded$131 = 5239;
        td.a();
        cl.a(12);
        df.b(-6);
        int discarded$132 = 116;
        vi.a();
        int discarded$133 = -101;
        kf.c();
        int discarded$134 = 7;
        dl.b();
        int discarded$135 = -110;
        d.k();
        int discarded$136 = -4403;
        kd.l();
        int discarded$137 = -1;
        qa.a();
        int discarded$138 = 0;
        kg.c();
        int discarded$139 = 2491;
        bg.n();
        int discarded$140 = -14;
        qn.m();
        int discarded$141 = 45;
        bj.k();
        int discarded$142 = 850101921;
        rm.a();
        int discarded$143 = 8;
        t.a();
        se.e((byte) 67);
        int discarded$144 = -61;
        jn.e();
        int discarded$145 = -44;
        ea.g();
        ki.b(true);
        vm.c(true);
        int discarded$146 = 0;
        ni.a();
        int discarded$147 = 0;
        ba.c();
        int discarded$148 = 0;
        od.b();
        nc.e((byte) -116);
        int discarded$149 = 1;
        cg.a();
        int discarded$150 = -29306;
        fc.a();
        int discarded$151 = 1;
        ri.h();
        int discarded$152 = 48;
        ih.i();
        int discarded$153 = 0;
        bh.j();
        bf.d(false);
        int discarded$154 = 83;
        ah.d();
        ja.a((byte) -115);
        int discarded$155 = -122;
        ml.a();
        int discarded$156 = -15237;
        kb.i();
        int discarded$157 = 5849;
        ji.i();
        bl.a(0);
        int discarded$158 = 7043;
        cn.b();
        int discarded$159 = 0;
        cm.a();
        int discarded$160 = -76;
        hg.a();
        el.e((byte) 125);
        int discarded$161 = 32768;
        mn.a();
        gn.a();
        int discarded$162 = -40;
        bd.a();
        int discarded$163 = -120;
        ik.a();
        int discarded$164 = 0;
        hc.a();
        int discarded$165 = 101;
        fd.c();
        int discarded$166 = 21296;
        ak.a();
        ao.a(1);
        int discarded$167 = 11;
        pg.c();
        int discarded$168 = 109;
        hh.c();
        sf.c(103);
        int discarded$169 = -3;
        wj.a();
        wc.b(true);
        int discarded$170 = -42;
        hk.c();
        int discarded$171 = 0;
        vf.b();
        int discarded$172 = 1839839976;
        lf.j();
        int discarded$173 = 103;
        ve.l();
        bk.a(true);
        int discarded$174 = -119;
        ac.c();
        mh.a(3);
        int discarded$175 = 77;
        tk.b();
        tf.a(false);
        int discarded$176 = -31;
        ed.a();
        aj.a(0);
        int discarded$177 = 99;
        e.a();
        h.a(1187598372);
        jd.a(false);
        int discarded$178 = 0;
        ph.b();
        int discarded$179 = 10;
        sk.c();
        int discarded$180 = 98;
        ec.d();
        int discarded$181 = 52;
        oj.a();
        int discarded$182 = -117;
        pa.c();
        int discarded$183 = 5;
        dc.d();
        int discarded$184 = 255;
        ij.b();
        int discarded$185 = -118;
        uj.c();
        om.c((byte) -126);
        int discarded$186 = -125;
        ai.a();
        int discarded$187 = 126;
        fj.a();
        int discarded$188 = 16;
        uh.k();
        int discarded$189 = -19374;
        tj.i();
        db.d(true);
        qi.b((byte) 79);
        int discarded$190 = 0;
        oc.h();
        ag.a(9604);
        re.a(-7101);
        int discarded$191 = -95;
        mk.a();
        int discarded$192 = 350;
        jb.c();
        int discarded$193 = -20127;
        sa.a();
        ((Chess) this).field_H = null;
        ((Chess) this).field_w = null;
    }

    private final boolean b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = field_G;
        int discarded$18 = 4;
        ab.h();
        if (null == lc.field_m) {
          if (null != tk.field_g) {
            nj.a(-20, ae.field_a, 70.0f);
            ((Chess) this).a(true);
            int discarded$19 = 33;
            this.n();
            tk.field_g = null;
            int discarded$20 = 0;
            ob.f();
            return false;
          } else {
            if (null == li.field_g) {
              if (null == mm.field_d) {
                if (wg.field_q != null) {
                  kd.a((byte) -90, new sn(wg.field_q.a("", 30045, "huffman")));
                  wg.field_q = null;
                  int discarded$21 = 0;
                  ob.f();
                  return false;
                } else {
                  if (null == lg.field_b) {
                    int discarded$22 = 640;
                    um.b();
                    var3 = 0;
                    L0: while (true) {
                      if (var3 >= 12) {
                        qk.field_h = 0;
                        jc.field_f = 0;
                        int discarded$23 = 50;
                        int discarded$24 = 1;
                        bf.a();
                        if (vi.a(-3)) {
                          return true;
                        } else {
                          gf.field_d = vc.a(-78, 4);
                          return true;
                        }
                      } else {
                        ae.field_e[var3] = new aa(var3);
                        var3++;
                        continue L0;
                      }
                    }
                  } else {
                    nj.a(-20, q.field_c, 97.0f);
                    ((Chess) this).a(true);
                    int discarded$25 = -21;
                    this.u();
                    lg.field_b = null;
                    int discarded$26 = 0;
                    ob.f();
                    return false;
                  }
                }
              } else {
                if (((Chess) this).field_F != 0) {
                  if (((Chess) this).field_F != 1) {
                    if (((Chess) this).field_F != 2) {
                      if (((Chess) this).field_F != 3) {
                        L1: {
                          if (((Chess) this).field_F == 4) {
                            mm.field_d = null;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        var5 = null;
                        eg.a(rl.field_a, ek.field_f, -109, true, f.field_b, new km[1][], wh.field_g, hm.field_e, ai.field_h, 2, ca.field_b, wh.field_g, ih.field_S, 1, (km[][]) null);
                        ig.field_h = wf.field_Q;
                        tk.b(200, 93);
                        hm.field_e = null;
                        int discarded$27 = 0;
                        ob.f();
                        return false;
                      } else {
                        int discarded$28 = -128;
                        this.r();
                        ((Chess) this).field_F = 4;
                        return false;
                      }
                    } else {
                      int discarded$29 = 16;
                      this.j();
                      ((Chess) this).field_F = 3;
                      return false;
                    }
                  } else {
                    this.q(-55);
                    ((Chess) this).field_F = 2;
                    return false;
                  }
                } else {
                  int discarded$30 = 16231;
                  this.s();
                  ((Chess) this).field_F = 1;
                  return false;
                }
              }
            } else {
              nj.a(-20, qe.field_O, 75.0f);
              ((Chess) this).a(true);
              var3 = 0;
              L2: while (true) {
                if (7 <= var3) {
                  L3: {
                    gl.field_b = pf.a(li.field_g, "", "fanfare");
                    if (null != gl.field_b) {
                      boolean discarded$31 = ka.field_a.a(pg.field_o, -124, 0, gl.field_b, s.field_S);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  fk.field_q.c((byte) -61);
                  ka.field_a.c((byte) -61);
                  ug.a(86);
                  s.field_S = null;
                  li.field_g = null;
                  pg.field_o = null;
                  int discarded$32 = 0;
                  ob.f();
                  return false;
                } else {
                  L4: {
                    el.field_y[var3] = pf.a(li.field_g, "", "chess" + (1 + var3));
                    if (null != el.field_y[var3]) {
                      boolean discarded$33 = fk.field_q.a(pg.field_o, -99, 0, el.field_y[var3], s.field_S);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } else {
          L5: {
            if (!lc.field_m.c((byte) 118)) {
              break L5;
            } else {
              if (!lc.field_m.b((byte) -40)) {
                break L5;
              } else {
                L6: {
                  if (!tk.field_g.c((byte) 127)) {
                    break L6;
                  } else {
                    if (!tk.field_g.b((byte) -40)) {
                      break L6;
                    } else {
                      L7: {
                        if (!pg.field_o.c((byte) 126)) {
                          break L7;
                        } else {
                          if (!pg.field_o.b((byte) -40)) {
                            break L7;
                          } else {
                            L8: {
                              if (!li.field_g.c((byte) 121)) {
                                break L8;
                              } else {
                                if (!li.field_g.b((byte) -40)) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (!mm.field_d.c((byte) 121)) {
                                      break L9;
                                    } else {
                                      if (!mm.field_d.b((byte) -40)) {
                                        break L9;
                                      } else {
                                        L10: {
                                          if (!wg.field_q.c((byte) 121)) {
                                            break L10;
                                          } else {
                                            if (!wg.field_q.b((byte) -40)) {
                                              break L10;
                                            } else {
                                              L11: {
                                                L12: {
                                                  if (!lg.field_b.c((byte) 122)) {
                                                    break L12;
                                                  } else {
                                                    if (lg.field_b.b((byte) -40)) {
                                                      break L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                                nj.a(-20, ji.a(ve.field_Qb, "", hh.field_j, lg.field_b, (byte) 36), 56.0f);
                                                break L11;
                                              }
                                              L13: {
                                                if (!bo.field_d.c((byte) 127)) {
                                                  break L13;
                                                } else {
                                                  if (!bo.field_d.b((byte) -40)) {
                                                    break L13;
                                                  } else {
                                                    L14: {
                                                      if (!hm.field_e.c((byte) 118)) {
                                                        break L14;
                                                      } else {
                                                        if (hm.field_e.b("basic", 100)) {
                                                          L15: {
                                                            if (!hm.field_e.c((byte) 122)) {
                                                              break L15;
                                                            } else {
                                                              if (!hm.field_e.b("roman12", 100)) {
                                                                break L15;
                                                              } else {
                                                                L16: {
                                                                  if (!f.field_b.c((byte) 123)) {
                                                                    break L16;
                                                                  } else {
                                                                    if (!f.field_b.b("roman12", 100)) {
                                                                      break L16;
                                                                    } else {
                                                                      L17: {
                                                                        if (!hm.field_e.c((byte) 123)) {
                                                                          break L17;
                                                                        } else {
                                                                          if (!hm.field_e.b("kartika13", 100)) {
                                                                            break L17;
                                                                          } else {
                                                                            L18: {
                                                                              if (!f.field_b.c((byte) 127)) {
                                                                                break L18;
                                                                              } else {
                                                                                if (!f.field_b.b("kartika13", 100)) {
                                                                                  break L18;
                                                                                } else {
                                                                                  L19: {
                                                                                    if (!hm.field_e.c((byte) 118)) {
                                                                                      break L19;
                                                                                    } else {
                                                                                      if (!hm.field_e.b("lobby", 100)) {
                                                                                        break L19;
                                                                                      } else {
                                                                                        L20: {
                                                                                          if (!f.field_b.c((byte) 118)) {
                                                                                            break L20;
                                                                                          } else {
                                                                                            if (!f.field_b.b("lobby", 100)) {
                                                                                              break L20;
                                                                                            } else {
                                                                                              L21: {
                                                                                                if (!ca.field_b.c((byte) 123)) {
                                                                                                  break L21;
                                                                                                } else {
                                                                                                  if (!ca.field_b.b((byte) -40)) {
                                                                                                    break L21;
                                                                                                  } else {
                                                                                                    if (!param1) {
                                                                                                      return false;
                                                                                                    } else {
                                                                                                      dn.a(true);
                                                                                                      nj.a(-20, ae.field_a, 70.0f);
                                                                                                      ((Chess) this).a(true);
                                                                                                      s.field_S = new fe(lc.field_m, tk.field_g);
                                                                                                      lc.field_m = null;
                                                                                                      int discarded$34 = 0;
                                                                                                      ob.f();
                                                                                                      return false;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              nj.a(-20, da.a(ld.field_a, wn.field_g, ca.field_b, -62), 80.0f);
                                                                                              return false;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        nj.a(-20, ji.a(sn.field_d, "lobby", nc.field_P, f.field_b, (byte) 126), 17.0f);
                                                                                        return false;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  nj.a(-20, ji.a(gb.field_o, "lobby", k.field_V, hm.field_e, (byte) 30), 13.0f);
                                                                                  return false;
                                                                                }
                                                                              }
                                                                            }
                                                                            nj.a(-20, ji.a(sn.field_d, "kartika13", nc.field_P, f.field_b, (byte) 95), 17.0f);
                                                                            return false;
                                                                          }
                                                                        }
                                                                      }
                                                                      nj.a(-20, ji.a(gb.field_o, "kartika13", k.field_V, hm.field_e, (byte) 78), 11.0f);
                                                                      return false;
                                                                    }
                                                                  }
                                                                }
                                                                nj.a(-20, ji.a(sn.field_d, "roman12", nc.field_P, f.field_b, (byte) 86), 17.0f);
                                                                return false;
                                                              }
                                                            }
                                                          }
                                                          nj.a(-20, ji.a(gb.field_o, "roman12", k.field_V, hm.field_e, (byte) 118), 11.0f);
                                                          return false;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    nj.a(-20, ji.a(gb.field_o, "basic", k.field_V, hm.field_e, (byte) 120), 65.0f);
                                                    return false;
                                                  }
                                                }
                                              }
                                              nj.a(-20, ji.a(sn.field_d, "", nc.field_P, bo.field_d, (byte) 49), 63.0f);
                                              return false;
                                            }
                                          }
                                        }
                                        nj.a(-20, ji.a(ld.field_a, "", wn.field_g, wg.field_q, (byte) 31), 55.0f);
                                        return false;
                                      }
                                    }
                                  }
                                  nj.a(-20, ji.a(gb.field_o, "", k.field_V, mm.field_d, (byte) 113), 35.0f);
                                  return false;
                                }
                              }
                            }
                            nj.a(-20, ji.a(vk.field_c, "", hh.field_k, li.field_g, (byte) 68), 30.0f);
                            return false;
                          }
                        }
                      }
                      int discarded$35 = -47;
                      nj.a(-20, sc.a(ej.field_d, pg.field_o, 0, sk.field_u), 20.0f);
                      return false;
                    }
                  }
                }
                nj.a(-20, ji.a(sc.field_g, "", ol.field_X, tk.field_g, (byte) 90), 10.0f);
                return false;
              }
            }
          }
          nj.a(-20, ji.a(sc.field_g, "", ol.field_X, lc.field_m, (byte) 116), 5.0f);
          return false;
        }
    }

    private final km a(int param0, km param1) {
        km var3 = null;
        RuntimeException var3_ref = null;
        km stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        km stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new km(2 * param1.field_w, param1.field_t * 2);
            var3.e();
            param1.a(0, 0, wb.field_h, wb.field_c);
            wb.e(2, 2, 0, 0, wb.field_h, wb.field_c);
            ph.field_j.b(48);
            stackOut_0_0 = (km) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("Chess.IA(").append(2).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    private final void k() {
        tb.field_a = new km(270, 325);
        tb.field_a.field_r = 145;
        tb.field_a.e();
        wb.c(0, 0, 270, 325, 13875857, 15987691);
        wb.d(0, 0, 270, 325, 1);
        wb.f(0, 0, 4, wb.field_c, 0);
        wb.f(4, 0, wb.field_c, 1);
        ph.field_j.b(48);
        tb.field_a.d();
    }

    private final void n() {
        int var2 = 0;
        int var3 = 0;
        var3 = field_G;
        int discarded$4 = 33;
        int discarded$5 = -34;
        um.field_l[0] = g.a();
        var2 = 1;
        L0: while (true) {
          if (var2 >= 13) {
            return;
          } else {
            if (ic.field_a[var2]) {
              um.field_l[var2] = s.field_S.a(va.field_c[var2], "", -12983);
              var2++;
              continue L0;
            } else {
              um.field_l[var2] = s.field_S.a(va.field_c[var2], false, "");
              var2++;
              continue L0;
            }
          }
        }
    }

    public Chess() {
        ((Chess) this).field_H = new int[]{0, 0, 0, 65536, 0, 0, 32768, 0, 16384, 0, 0, 65536};
        ((Chess) this).field_F = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_E = 480;
        field_C = "NA";
    }
}
