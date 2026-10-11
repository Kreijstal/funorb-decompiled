/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static byte[] field_a;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -12) {
          ob.a((byte) -1);
        }
        field_a = null;
    }

    final static pk a(int param0, int[] param1, byte[] param2, boolean param3, sm[] param4) {
        int var12_int = 0;
        byte[] array$0 = null;
        int var24_int = 0;
        int incrementValue$2 = 0;
        pk stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        byte[][] var11 = null;
        pk var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        byte[] var28 = null;
        int var29 = 0;
        int var30 = 0;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        byte[][] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        byte[][] var42 = null;
        int var10Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        var30 = Torquing.field_u;
        try {
          if (param4.length != 256) {
            throw new IllegalArgumentException();
          }
          var40 = new int[256];
          var34 = var40;
          var5 = var34;
          var41 = new int[256];
          var35 = var41;
          var6 = var35;
          var38 = new int[256];
          var32 = var38;
          var7 = var32;
          if (!param3) {
            field_a = (byte[]) null;
          }
          var39 = new int[256];
          var33 = var39;
          var8 = var33;
          var37 = new int[param1.length + 3];
          var31 = var37;
          var9 = var31;
          var37[2] = param0;
          var37[1] = 16777215;
          for (var10 = 0; var10 < param1.length; var10++) {
            var9[3 + var10] = param1[var10];
          }
          var10Lifetime1 = 1 + param1.length;
          if (2 > var10Lifetime1) {
            var10Lifetime1 = 2;
          }
          var42 = new byte[256][];
          var36 = var42;
          var11 = var36;
          for (var12_int = 0; var12_int < 256; var12_int++) {
            var5[var12_int] = -1 + param4[var12_int].field_a;
            var6[var12_int] = param4[var12_int].field_g - 1;
            var7[var12_int] = var10Lifetime1 + param4[var12_int].field_c;
            var8[var12_int] = param4[var12_int].field_d + var10Lifetime1;
            array$0 = new byte[var38[var12_int] * var39[var12_int]];
            var11[var12_int] = array$0;
            var13 = array$0;
            var14 = param4[var12_int].field_l;
            var15 = param4[var12_int].field_c;
            var16 = param4[var12_int].field_d;
            var17 = var38[var12_int];
            var18 = -var15 + var17;
            var19 = 0;
            var20 = var38[var12_int] + 1;
            for (var21 = 0; var21 < var16; var21++) {
              for (var22 = 0; var15 > var22; var22++) {
                if (var14[var19++] != 0) {
                  var23 = var17 + 1;
                  for (var24_int = 0; var24_int < param1.length; var24_int++) {
                    var13[var23 + var20] = (byte)(3 + var24_int);
                    var23 = var23 + (1 + var17);
                  }
                  if (param0 != -1) {
                    var24 = var13;
                    var25 = -var17 + var20;
                    var26 = var13;
                    var27 = -1 + var20;
                    var28 = var13;
                    var29 = 1 + var20;
                    var13[var17 + var20] = (byte) 2;
                    var28[var29] = (byte) 2;
                    var26[var27] = (byte) 2;
                    var24[var25] = (byte) 2;
                  }
                }
                var20++;
              }
              var20 = var20 + var18;
            }
            var20Lifetime1 = 1 + var38[var12_int];
            var19Lifetime1 = 0;
            for (var21Lifetime1 = 0; var16 > var21Lifetime1; var21Lifetime1++) {
              for (var22Lifetime1 = 0; var22Lifetime1 < var15; var22Lifetime1++) {
                if (var14[var19Lifetime1++] != 0) {
                  incrementValue$2 = var20Lifetime1;
                  var20Lifetime1++;
                  var13[incrementValue$2] = (byte) 1;
                } else {
                  var20Lifetime1++;
                }
              }
              var20Lifetime1 = var20Lifetime1 + var18;
            }
          }
          var12 = new pk(param2, var40, var41, var38, var39, var37, var42);
          var12.field_x = var12.field_x - 1;
          if (param1.length == 0) {
            var12.field_t = var12.field_t - 1;
          } else {
            var12.field_t = var12.field_t - param1.length;
          }
          var12.field_s = var12.field_s - 1;
          stackIn_42_0 = var12;
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_45_0 = var5_ref;
          stackIn_45_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    static {
        field_a = new byte[65536];
        dk.a(field_a, 0, 65536, (byte) -128);
    }
}
