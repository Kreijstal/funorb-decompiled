/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends bh {
    static int[] field_q;
    int field_o;
    static String field_n;
    int field_p;

    final static void a(vg param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        dh stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_47_0;
        int stackIn_47_1;
        int stackIn_47_2;
        int stackIn_47_3;
        int stackIn_47_4;
        int stackIn_47_5;
        int stackIn_47_6;
        int stackIn_47_7;
        int stackIn_47_8;
        int stackIn_47_9;
        int stackIn_47_10;
        int stackIn_47_11;
        boolean stackIn_48_12;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dh var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        vg var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = client.field_A ? 1 : 0;
        try {
          var44 = param0;
          if (param4) {
            field_q = (int[]) null;
          }
          if (var44.field_Q != null &&
            var44.field_B > 1) {
            var60 = var44.field_Q;
            sh.a(var60, -25724, 0, nm.field_Nb, 0);
          } else {
            kh.a(2);
          }
          var54 = new int[param0.field_D];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param0.field_D];
          var62 = id.field_M;
          var61 = bc.field_I;
          var63 = sf.field_C;
          for (var13 = 0; param0.field_D > var13; var13++) {
            var14 = var61[var13] * param1 + var62[var13] * param3 + var63[var13] * param6 >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (0 > var14) {
              stackIn_17_0 = 128;
            } else {
              if (var14 < 128) {
                stackIn_17_0 = var14 + 128;
              } else {
                stackIn_17_0 = 256;
              }
            }
            var14Lifetime2 = stackIn_17_0;
            var15 = param2 * var62[var13] + var61[var13] * param7 + var63[var13] * param5 >> 8;
            stackIn_19_0 = ch.field_b;
            if (var15 >= 0) {
              stackIn_20_1 = var15;
            } else {
              stackIn_20_1 = -var15;
            }
            var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = (256 - var15Lifetime2) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < ta.field_d; var13Lifetime1++) {
            var14Lifetime1 = hb.field_Vb[var13Lifetime1];
            var15Lifetime1 = param0.field_M[var14Lifetime1];
            var16 = param0.field_c[var14Lifetime1];
            var17 = param0.field_A[var14Lifetime1];
            if (id.field_M.length > param0.field_F[var14Lifetime1]) {
              stackIn_26_0 = param0.field_F[var14Lifetime1];
            } else {
              stackIn_26_0 = -1;
            }
            var18 = stackIn_26_0;
            if (id.field_M.length > param0.field_t[var14Lifetime1]) {
              stackIn_29_0 = param0.field_t[var14Lifetime1];
            } else {
              stackIn_29_0 = -1;
            }
            var19 = stackIn_29_0;
            if (id.field_M.length <= param0.field_r[var14Lifetime1]) {
              stackIn_32_0 = -1;
            } else {
              stackIn_32_0 = param0.field_r[var14Lifetime1];
            }
            var20 = stackIn_32_0;
            if (null != l.field_i &&
              null != param0.field_j &&
              param0.field_j.length > var14Lifetime1 &&
              param0.field_j[var14Lifetime1] != -1 &&
              l.field_i.length > param0.field_j[var14Lifetime1]) {
              stackIn_39_0 = l.field_i[param0.field_j[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = kl.field_n[var15Lifetime1];
            var23 = rn.field_b[var15Lifetime1];
            var24 = kl.field_n[var16];
            var25 = rn.field_b[var16];
            var26 = kl.field_n[var17];
            var27 = rn.field_b[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_52_0 = var21.field_a;
              } else {
                stackIn_52_0 = 8355711;
              }
              var30 = stackIn_52_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = 1476460288 & var32 * var28 >>> 8 | -268500737 & var31 * var28 >>> 8;
              var33 = var33 + 65793 * var29;
              tb.a(var23, var27, var22, var33 >> 1 & 8355711, var24, var25, 127, var26);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_45_0 = var21.field_a;
              } else {
                stackIn_45_0 = 8355711;
              }
              var34 = stackIn_45_0;
              var35 = var34 & 16711935;
              var36 = var34 & 65280;
              var37 = (16711810 & var36 * var28) >>> 8 | (var35 * var28 & -16711879) >>> 8;
              var38 = var35 * var29 >>> 8 & 285147391 | var36 * var29 >>> 8 & 1291910912;
              var39 = -755040001 & var35 * var30 >>> 8 | var36 * var30 >>> 8 & -2046755072;
              var37 = var37 + var31 * 65793;
              var38 = var38 + var32 * 65793;
              var39 = var39 + var33 * 65793;
              stackIn_47_0 = var37 & 255;
              stackIn_47_1 = var25;
              stackIn_47_2 = var22;
              stackIn_47_3 = var39 >> 16;
              stackIn_47_4 = var24;
              stackIn_47_5 = var37 >> 16;
              stackIn_47_6 = var39 & 255;
              stackIn_47_7 = 255 & var38;
              stackIn_47_8 = var27;
              stackIn_47_9 = var38 >> 16;
              stackIn_47_10 = var39 >> 8 & 255;
              stackIn_47_11 = var23;
              stackIn_48_12 = !(param4);
              wf.a(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_47_3, stackIn_47_4, stackIn_47_5, stackIn_47_6, stackIn_47_7, stackIn_47_8, stackIn_47_9, stackIn_47_10, stackIn_47_11, stackIn_48_12, var37 >> 8 & 255, var26, 255 & var38 >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_57_0 = var8_ref;
          stackIn_57_1 = new StringBuilder().append("ug.B(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          if (!cb.a(param1, param0, 4564)) {
            return false;
          }
          for (var3_int = 0; var3_int < param0.length(); var3_int++) {
            if (!ci.a(param0.charAt(var3_int), (byte) 82)) {
              return false;
            }
          }
          var4 = -86 % ((-31 - param2) / 56);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ug.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != -21771) {
          CharSequence var2 = (CharSequence) null;
          ug.a((CharSequence) null, false, -92);
        }
        field_n = null;
    }

    private ug() throws Throwable {
        throw new Error();
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_9_0 = false;
        if (param1 != 32) {
          return false;
        }
        stackIn_9_0 = (160 == param0) || (param0 == 32) || (param0 == 95) || (param0 == 45);
        return stackIn_9_0;
    }

    static {
        field_n = "The Controls";
    }
}
