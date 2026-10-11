/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oda {
    static String field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var24 = 0;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        var35 = BachelorFridge.field_y;
        try {
          if (param4 <= 122) {
            field_a = (String) null;
          }
          if (param1 == param5 &&
            param7 == param3 &&
            param9 == param6 &&
            param2 == param0) {
            oe.a(param3, param8, -117, param9, param0, param5);
            return;
          }
          var10_int = param5;
          var11 = param3;
          var12 = param5 * 3;
          var13 = param3 * 3;
          var14 = param1 * 3;
          var15 = 3 * param7;
          var16 = param6 * 3;
          var17 = param2 * 3;
          var18 = -var16 + (param9 + var14 - param5);
          var19 = -var17 + param0 + (var15 - param3);
          var20 = -var14 + (-var14 + (var16 + var12));
          var21 = var13 + (-var15 + (var17 - var15));
          var22 = -var12 + var14;
          var23 = -var13 + var15;
          for (var24 = 128; 4096 >= var24; var24 += 128) {
            var25 = var24 * var24 >> 12;
            var26 = var24 * var25 >> 12;
            var27 = var26 * var18;
            var28 = var19 * var26;
            var29 = var20 * var25;
            var30 = var21 * var25;
            var31 = var22 * var24;
            var32 = var24 * var23;
            var33 = (var31 + (var27 + var29) >> 12) + param5;
            var34 = (var30 + (var28 + var32) >> 12) + param3;
            oe.a(var11, param8, -88, var33, var34, var10_int);
            var10_int = var33;
            var11 = var34;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var10), "oda.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static pp a(int param0, lu param1) {
        RuntimeException var2 = null;
        lu var3 = null;
        kq stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -30) {
            var3 = (lu) null;
            oda.a(-17, (lu) null);
          }
          stackIn_3_0 = new kq();
          return (pp) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("oda.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null != vv.field_e) {
          var1 = vv.field_e;
          synchronized (var1) {
            vv.field_e = null;
          }
        }
        if (param0 != -705481812) {
          field_a = (String) null;
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 14124) {
          lu var2 = (lu) null;
          oda.a(-77, (lu) null);
        }
    }

    static {
        field_a = "Average rating";
        field_b = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
