/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static String field_a;
    static volatile int field_b;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          if (param1 < 113) {
            var5 = (byte[]) null;
            kk.a((wb[]) null, (byte[]) null, -29, 88, 105);
          }
          var3_int = 0;
          while (param2 > 0) {
            var3_int = var3_int << 1 | param0 & 1;
            param2--;
            param0 = param0 >>> 1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "kk.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ef a(wb[] param0, byte[] param1, int param2, int param3, int param4) {
        int var11_int = 0;
        byte[] array$0 = null;
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        ef stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        byte[][] var10 = null;
        ef var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        byte[] var22 = null;
        int var23 = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        byte[][] var38 = null;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        var28 = Main.field_T;
        try {
          if (param3 != param0.length) {
            throw new IllegalArgumentException();
          }
          var36 = new int[256];
          var31 = var36;
          var5 = var31;
          var37 = new int[256];
          var32 = var37;
          var6 = var32;
          var35 = new int[256];
          var30 = var35;
          var7 = var30;
          var34 = new int[256];
          var29 = var34;
          var8 = var29;
          var9 = new int[]{0, param4, param2};
          var38 = new byte[256][];
          var33 = var38;
          var10 = var33;
          for (var11_int = 0; var11_int < 256; var11_int++) {
            var5[var11_int] = -1 + param0[var11_int].field_h;
            var6[var11_int] = param0[var11_int].field_c - 1;
            var7[var11_int] = param0[var11_int].field_g + 2;
            var8[var11_int] = param0[var11_int].field_b + 2;
            array$0 = new byte[var34[var11_int] * var35[var11_int]];
            var10[var11_int] = array$0;
            var12 = array$0;
            var13 = param0[var11_int].field_i;
            var14 = param0[var11_int].field_g;
            var15 = param0[var11_int].field_b;
            var16 = var35[var11_int];
            var17 = -var14 + var16;
            var18 = 0;
            var19 = var35[var11_int] + 1;
            for (var20 = 0; var20 < var15; var20++) {
              for (var21 = 0; var14 > var21; var21++) {
                incrementValue$3 = var18;
                var18++;
                if (0 != var13[incrementValue$3]) {
                  var22 = var12;
                  var23 = -var16 + var19;
                  var24 = var12;
                  var25 = var19 - 1;
                  var26 = var12;
                  var12[var16 + var19] = (byte) 2;
                  var27 = 1 + var19;
                  var26[var27] = (byte) 2;
                  var24[var25] = (byte) 2;
                  var22[var23] = (byte) 2;
                }
                var19++;
              }
              var19 = var19 + var17;
            }
            var19Lifetime1 = 1 + var35[var11_int];
            var18Lifetime1 = 0;
            for (var20Lifetime1 = 0; var15 > var20Lifetime1; var20Lifetime1++) {
              for (var21Lifetime1 = 0; var21Lifetime1 < var14; var21Lifetime1++) {
                if (var13[var18Lifetime1++] == 0) {
                  var19Lifetime1++;
                } else {
                  incrementValue$2 = var19Lifetime1;
                  var19Lifetime1++;
                  var12[incrementValue$2] = (byte) 1;
                }
              }
              var19Lifetime1 = var19Lifetime1 + var17;
            }
          }
          var11 = new ef(param1, var36, var37, var35, var34, var9, var38);
          var11.field_s = var11.field_s - 1;
          var11.field_x = var11.field_x - 1;
          var11.field_q = var11.field_q - 1;
          stackIn_26_0 = var11;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_29_0 = var5_ref;
          stackIn_29_1 = new StringBuilder().append("kk.B(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, qk param1) {
        int var3 = 0;
        int var4 = 0;
        mg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        w var8 = null;
        int var9 = 0;
        w var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Main.field_T;
        try {
          var8 = new w(param1.a((byte) 7, "", "logo.fo3d"));
          var10 = var8;
          var3 = var10.f(param0 ^ -16903);
          var10.f(true);
          ga.field_b = hk.a(param0 + 17076, var10);
          il.field_a = new mg[var3];
          sk.field_b = new int[var3][];
          var4 = 0;
          if (param0 != -16998) {
            return;
          }
          while (var3 > var4) {
            il.field_a[var4] = nb.a((byte) 119, var8);
            var4++;
          }
          var10.g(8);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < var3) {
            var5 = il.field_a[var9];
            var5.a(6, 6, param0 + 10328, 1, 6);
            var5.a((byte) 124);
            var6 = new int[]{var5.field_f + var5.field_e >> 1, var5.field_u + var5.field_s >> 1, var5.field_i + var5.field_z >> 1};
            sk.field_b[var9] = var6;
            var5.a(false, -var6[0], -var6[1], -var6[2]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("kk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = 0;
    }
}
