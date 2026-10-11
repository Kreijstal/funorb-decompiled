/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static ri field_c;
    static aj field_b;
    static String field_d;
    static qb[] field_e;
    static boolean field_a;

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, byte param6, byte[] param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$9 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var10_int = -(param8 >> 2);
          param8 = -(3 & param8);
          if (param3 != 6725) {
            return;
          }
          for (var11 = -param9; var11 < 0; var11++) {
            for (var12 = var10_int; var12 < 0; var12++) {
              if (param1[param4++] != 0) {
                incrementValue$3 = param0;
                param0++;
                param7[incrementValue$3] = (byte)param6;
              } else {
                param0++;
              }
              incrementValue$4 = param4;
              param4++;
              if (0 != param1[incrementValue$4]) {
                incrementValue$5 = param0;
                param0++;
                param7[incrementValue$5] = (byte)param6;
              } else {
                param0++;
              }
              if (param1[param4++] == 0) {
                param0++;
              } else {
                incrementValue$7 = param0;
                param0++;
                param7[incrementValue$7] = (byte)param6;
              }
              if (param1[param4++] == 0) {
                param0++;
              } else {
                incrementValue$9 = param0;
                param0++;
                param7[incrementValue$9] = (byte)param6;
              }
            }
            for (var12Lifetime1 = param8; var12Lifetime1 < 0; var12Lifetime1++) {
              if (param1[param4++] == 0) {
                param0++;
              } else {
                incrementValue$1 = param0;
                param0++;
                param7[incrementValue$1] = (byte)param6;
              }
            }
            param0 = param0 + param2;
            param4 = param4 + param5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_30_0 = var10;
          stackIn_30_1 = new StringBuilder().append("fc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(byte param0, kc param1) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        kc var4 = (kc) (param1.field_G.b(12623));
        if (param0 >= -60) {
          return;
        }
        try {
          while (var4 != null) {
            var4.field_db = 0;
            var4.field_I = 0;
            var4.field_bb = 0;
            var4.field_B = 0;
            var4 = (kc) (param1.field_G.a(0));
          }
          param1.field_I = 0;
          param1.field_bb = 0;
          param1.field_db = 0;
          param1.field_B = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "fc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -71) {
          field_e = (qb[]) null;
        }
        field_c = null;
        field_e = null;
    }

    final static boolean a(int param0, eg param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = param1.b(param3, 26219, param2);
          var4 = var6;
          if (var6 == null) {
            return false;
          }
          var5 = -27 % ((param0 + 66) / 51);
          e.a(var6, true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("fc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = new ri();
        field_d = "Lost";
        field_b = new aj(12, 0, 1, 0);
        field_a = true;
    }
}
