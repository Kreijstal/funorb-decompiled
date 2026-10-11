/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma implements t {
    static long field_b;
    static int field_c;
    static String field_a;

    final static de a(int param0, byte param1, int param2, ng[] param3, byte[] param4, int param5) {
        int var16_int = 0;
        byte[] array$0 = null;
        int var26 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        de stackIn_6_0 = null;
        de stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        byte[][] var11 = null;
        int var13 = 0;
        int var14 = 0;
        de var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var27 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var44 = null;
        int[] var45 = null;
        int var23Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        var27 = TrackController.field_F ? 1 : 0;
        try {
          if (param3.length != 256) {
            throw new IllegalArgumentException();
          }
          var38 = new int[256];
          var31 = var38;
          var6 = var31;
          var39 = new int[256];
          var32 = var39;
          var7 = var32;
          var36 = new int[256];
          var29 = var36;
          var8 = var29;
          var37 = new int[256];
          var30 = var37;
          var9 = var30;
          var10 = new int[]{0, param5, param0};
          var40 = new byte[256][];
          var33 = var40;
          var11 = var33;
          var45 = ll.field_i;
          var13 = ll.field_d;
          var14 = ll.field_k;
          if (param1 >= -120) {
            stackIn_6_0 = (de) null;
            return stackIn_6_0;
          }
          var44 = new int[4];
          ll.a(var44);
          for (var16_int = 0; 256 > var16_int; var16_int++) {
            var6[var16_int] = param3[var16_int].field_b - param2;
            var7[var16_int] = -param2 + param3[var16_int].field_a;
            var8[var16_int] = (param2 << 1) + param3[var16_int].field_c;
            var9[var16_int] = (param2 << 1) + param3[var16_int].field_j;
            array$0 = new byte[var36[var16_int] * var37[var16_int]];
            var11[var16_int] = array$0;
            var17 = array$0;
            var18 = param3[var16_int].field_m;
            var19 = param3[var16_int].field_c;
            var20 = param3[var16_int].field_j;
            var21 = var36[var16_int];
            var22 = -var19 + var21;
            ll.a(new int[var37[var16_int] * var36[var16_int]], var36[var16_int], var37[var16_int]);
            var23 = 0;
            for (var24 = 0; var24 < var20; var24++) {
              for (var25 = 0; var19 > var25; var25++) {
                if (var18[var23++] != 0) {
                  ll.f(var25 + param2, var24 + param2, param2, 2);
                }
              }
            }
            for (var24Lifetime1 = 0; var17.length > var24Lifetime1; var24Lifetime1++) {
              var17[var24Lifetime1] = (byte)ll.field_i[var24Lifetime1];
            }
            var23Lifetime1 = 0;
            var24Lifetime2 = param2 * (var36[var16_int] + 1);
            for (var25Lifetime1 = 0; var20 > var25Lifetime1; var25Lifetime1++) {
              for (var26 = 0; var19 > var26; var26++) {
                incrementValue$1 = var23Lifetime1;
                var23Lifetime1++;
                if (0 != var18[incrementValue$1]) {
                  incrementValue$2 = var24Lifetime2;
                  var24Lifetime2++;
                  var17[incrementValue$2] = (byte) 1;
                } else {
                  var24Lifetime2++;
                }
              }
              var24Lifetime2 = var24Lifetime2 + var22;
            }
          }
          var16 = new de(param4, var38, var39, var36, var37, var10, var40);
          var16.field_u = var16.field_u - param2;
          var16.field_H = var16.field_H - param2;
          var16.field_G = var16.field_G - param2;
          ll.a(var45, var13, var14);
          ll.b(var44);
          stackIn_32_0 = var16;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_35_0 = var6_ref;
          stackIn_35_1 = new StringBuilder().append("ma.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param4 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -50) {
          field_b = 126L;
        }
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        qj var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = param1.field_p + param4;
          var7 = param1.field_m + param2;
          fc.a(param1.field_x, var7, param1.field_u, (byte) -77, var6_int);
          if (param0 != -24969) {
            return;
          }
          var8 = TrackController.field_D[1];
          if (param1 instanceof rh &&
            ((rh) (param1)).field_G) {
            var8.a((param1.field_x - var8.field_s >> 1) + (1 + var6_int), var7 + 1 + (param1.field_u - var8.field_v >> 1), 256);
          }
          if (param1.h(-111)) {
            bc.a(param1.field_u - 4, -28846, param1.field_x - 4, var7 + 2, var6_int + 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ma.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(of.a(param1, var2, false), "_top");
              if (param0 != -9969) {
                field_a = (String) null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("ma.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        field_a = "Members";
    }
}
