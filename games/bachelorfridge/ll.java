/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends pu {
    static String field_l;

    final static void a(int param0, int param1, int param2, int param3, int param4, kv[] param5, int param6, int param7, po param8, int param9, int param10, kv[] param11, int param12, kv[] param13, po param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        po var22 = null;
        try {
          tha.a(new lda(param5), param14, param7, new lda(param13), param9, param16, param6, param15, true, param2, param1, param8, new lda(param11), param18, param12, param10, param20, param3, param4, param19, param0);
          if (param17 != 256) {
            var22 = (po) null;
            ll.a(-16, -38, -63, 72, 88, (kv[]) null, -28, -64, (po) null, 105, -128, (kv[]) null, 110, (kv[]) null, (po) null, -76, 31, -87, 88, -62, 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("ll.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param14 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final static fea a(byte[] param0, int param1, ee[] param2) {
        int var8_int = 0;
        byte[] array$0 = null;
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        fea stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        fea var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        byte[] var19 = null;
        int var20 = 0;
        byte[] var21 = null;
        int var22 = 0;
        byte[] var23 = null;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        byte[][] var35 = null;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        var25 = BachelorFridge.field_y;
        try {
          if (param2.length != 256) {
            throw new IllegalArgumentException();
          }
          var33 = new int[256];
          var28 = var33;
          var3 = var28;
          var34 = new int[256];
          var29 = var34;
          var4 = var29;
          if (param1 != -8659) {
            ll.d((byte) 123);
          }
          var32 = new int[256];
          var27 = var32;
          var5 = var27;
          var31 = new int[256];
          var26 = var31;
          var6 = var26;
          var35 = new byte[256][];
          var30 = var35;
          var7 = var30;
          for (var8_int = 0; var8_int < 256; var8_int++) {
            var3[var8_int] = param2[var8_int].field_f - 1;
            var4[var8_int] = param2[var8_int].field_c - 1;
            var5[var8_int] = 2 + param2[var8_int].field_d;
            var6[var8_int] = param2[var8_int].field_e + 2;
            array$0 = new byte[var31[var8_int] * var32[var8_int]];
            var7[var8_int] = array$0;
            var9 = array$0;
            var10 = param2[var8_int].field_g;
            var11 = param2[var8_int].field_d;
            var12 = param2[var8_int].field_e;
            var13 = var32[var8_int];
            var14 = var13 - var11;
            var15 = 0;
            var16 = var32[var8_int] + 1;
            for (var17 = 0; var17 < var12; var17++) {
              for (var18 = 0; var11 > var18; var18++) {
                incrementValue$3 = var15;
                var15++;
                if (0 != var10[incrementValue$3]) {
                  var19 = var9;
                  var20 = -var13 + var16;
                  var21 = var9;
                  var22 = -1 + var16;
                  var23 = var9;
                  var24 = 1 + var16;
                  var9[var13 + var16] = (byte) 1;
                  var23[var24] = (byte) 1;
                  var21[var22] = (byte) 1;
                  var19[var20] = (byte) 1;
                }
                var16++;
              }
              var16 = var16 + var14;
            }
            var16Lifetime1 = var32[var8_int] + 1;
            var15Lifetime1 = 0;
            for (var17Lifetime1 = 0; var17Lifetime1 < var12; var17Lifetime1++) {
              for (var18Lifetime1 = 0; var11 > var18Lifetime1; var18Lifetime1++) {
                if (var10[var15Lifetime1++] != 0) {
                  incrementValue$2 = var16Lifetime1;
                  var16Lifetime1++;
                  var9[incrementValue$2] = (byte) 0;
                } else {
                  var16Lifetime1++;
                }
              }
              var16Lifetime1 = var16Lifetime1 + var14;
            }
          }
          var8 = new fea(param0, var33, var34, var32, var31, var35);
          var8.field_v = var8.field_v - 1;
          var8.field_B = var8.field_B - 1;
          var8.field_u = var8.field_u - 1;
          stackIn_28_0 = var8;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_31_0 = var3_ref;
          stackIn_31_1 = new StringBuilder().append("ll.C(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_l = null;
        if (param0 != 63) {
          po var2 = (po) null;
          ll.a(52, 15, 22, -43, 103, (kv[]) null, -109, 112, (po) null, 123, 80, (kv[]) null, 125, (kv[]) null, (po) null, 89, -55, 32, -96, 61, 68);
        }
    }

    static {
        field_l = "Instructions";
    }
}
