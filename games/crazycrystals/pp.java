/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends jb {
    int field_f;
    static String field_i;
    int[] field_g;
    boolean field_h;

    final static StringBuilder a(char param0, StringBuilder param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          var4_int = param1.length();
          param1.setLength(param2);
          for (var5 = var4_int; param2 > var5; var5++) {
            param1.setCharAt(var5, param0);
          }
          if (param3 != 5277) {
            var7 = (StringBuilder) null;
            pp.a('T', (StringBuilder) null, -114, -83);
          }
          stackIn_7_0 = (StringBuilder) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("pp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static uj a(int[] param0, byte param1, int param2, byte[] param3, wj[] param4) {
        int var12_int = 0;
        byte[] array$0 = null;
        int var24_int = 0;
        int incrementValue$2 = 0;
        uj stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        byte[][] var11 = null;
        uj var12 = null;
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
        var30 = CrazyCrystals.field_B;
        try {
          if (256 != param4.length) {
            throw new IllegalArgumentException();
          }
          var40 = new int[256];
          var34 = var40;
          var5 = var34;
          var41 = new int[256];
          var35 = var41;
          var6 = var35;
          var39 = new int[256];
          var33 = var39;
          var7 = var33;
          var38 = new int[256];
          var32 = var38;
          var8 = var32;
          var37 = new int[3 + param0.length];
          var31 = var37;
          var9 = var31;
          var37[2] = param2;
          var37[1] = 16777215;
          for (var10 = 0; param0.length > var10; var10++) {
            var9[3 + var10] = param0[var10];
          }
          var10Lifetime1 = param0.length + 1;
          if (var10Lifetime1 < 2) {
            var10Lifetime1 = 2;
          }
          var42 = new byte[256][];
          var36 = var42;
          var11 = var36;
          for (var12_int = 0; var12_int < 256; var12_int++) {
            var5[var12_int] = -1 + param4[var12_int].field_g;
            var6[var12_int] = param4[var12_int].field_d - 1;
            var7[var12_int] = param4[var12_int].field_f + var10Lifetime1;
            var8[var12_int] = param4[var12_int].field_e + var10Lifetime1;
            array$0 = new byte[var38[var12_int] * var39[var12_int]];
            var11[var12_int] = array$0;
            var13 = array$0;
            var14 = param4[var12_int].field_j;
            var15 = param4[var12_int].field_f;
            var16 = param4[var12_int].field_e;
            var17 = var39[var12_int];
            var18 = -var15 + var17;
            var19 = 0;
            var20 = var39[var12_int] + 1;
            for (var21 = 0; var16 > var21; var21++) {
              for (var22 = 0; var15 > var22; var22++) {
                if (var14[var19++] != 0) {
                  var23 = var17 + 1;
                  for (var24_int = 0; var24_int < param0.length; var24_int++) {
                    var13[var23 + var20] = (byte)(3 + var24_int);
                    var23 = var23 + (1 + var17);
                  }
                  if (-1 != param2) {
                    var24 = var13;
                    var25 = -var17 + var20;
                    var26 = var13;
                    var27 = var20 - 1;
                    var28 = var13;
                    var29 = 1 + var20;
                    var13[var20 + var17] = (byte) 2;
                    var28[var29] = (byte) 2;
                    var26[var27] = (byte) 2;
                    var24[var25] = (byte) 2;
                  }
                }
                var20++;
              }
              var20 = var20 + var18;
            }
            var20Lifetime1 = 1 + var39[var12_int];
            var19Lifetime1 = 0;
            for (var21Lifetime1 = 0; var16 > var21Lifetime1; var21Lifetime1++) {
              for (var22Lifetime1 = 0; var15 > var22Lifetime1; var22Lifetime1++) {
                if (var14[var19Lifetime1++] == 0) {
                  var20Lifetime1++;
                } else {
                  incrementValue$2 = var20Lifetime1;
                  var20Lifetime1++;
                  var13[incrementValue$2] = (byte) 1;
                }
              }
              var20Lifetime1 = var20Lifetime1 + var18;
            }
          }
          if (param1 <= 66) {
            pp.a((byte) -35);
          }
          var12 = new uj(param3, var40, var41, var39, var38, var37, var42);
          var12.field_o = var12.field_o - 1;
          if (param0.length != 0) {
            var12.field_u = var12.field_u - param0.length;
          } else {
            var12.field_u = var12.field_u - 1;
          }
          var12.field_A = var12.field_A - 1;
          stackIn_41_0 = var12;
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_44_0 = var5_ref;
          stackIn_44_1 = new StringBuilder().append("pp.A(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param4 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != 2) {
          field_i = (String) null;
        }
        field_i = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = CrazyCrystals.field_B;
        if (param3 != 0) {
          field_i = (String) null;
        }
        if (param2 < param1) {
          if (param0 <= param1) {
            if (param2 < param0) {
              qp.a((byte) 99, param4, param5, param1, kh.field_i, param2, param6, param7, param0);
            } else {
              qp.a((byte) 99, param7, param5, param1, kh.field_i, param0, param6, param4, param2);
            }
          } else {
            qp.a((byte) 99, param5, param4, param0, kh.field_i, param2, param6, param7, param1);
          }
        } else {
          if (param0 > param2) {
            qp.a((byte) 99, param7, param4, param0, kh.field_i, param1, param6, param5, param2);
          } else {
            if (param0 <= param1) {
              qp.a((byte) 99, param5, param7, param2, kh.field_i, param0, param6, param4, param1);
            } else {
              qp.a((byte) 99, param4, param7, param2, kh.field_i, param1, param6, param5, param0);
            }
          }
        }
    }

    pp() {
    }

    static {
        field_i = "\"There's a bug in the spider web!\" - Ben D";
    }
}
