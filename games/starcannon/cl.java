/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends od {
    static int field_j;
    static pf field_k;

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    cl(long param0, String param1) {
        super(param0, param1);
    }

    final s b(byte param0) {
        if (param0 != 1) {
          int[] var3 = (int[]) null;
          cl.a(-8, (hl) null, false, true, (int[]) null, -126);
        }
        return ef.field_e;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        wj.b(param0);
        ki.c(param2, param3, param4, param1);
    }

    final static hl a(int param0, hl param1, boolean param2, boolean param3, int[] param4, int param5) {
        int var13 = 0;
        int var17 = 0;
        int var18 = 0;
        hl stackIn_3_0 = null;
        hl stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var19 = 0;
        int var20 = 0;
        hl var21 = null;
        int[] var23 = null;
        int[] var25 = null;
        int[] var27 = null;
        int var11Lifetime1;
        int var12Lifetime1;
        var19 = StarCannon.field_A;
        try {
          if (param3) {
            stackIn_3_0 = (hl) null;
            return stackIn_3_0;
          }
          var21 = new hl(param0 + (param0 + param1.field_u), param0 + param1.field_v + param0);
          var21.field_x = param0 + (param1.field_x + param0);
          var21.field_q = param0 + (param0 + param1.field_q);
          var21.field_y = -param0 + param1.field_y;
          var21.field_w = param1.field_w - param0;
          var25 = var21.field_B;
          var23 = var25;
          var7 = var23;
          var27 = param1.field_B;
          var9 = param0 * param0;
          var10 = (param0 << 1) + (var9 + 1) << 1;
          for (var11 = -param0; param0 >= var11; var11++) {
            var10 = var10 + (var11 * 2 - 1);
            var12 = var10;
            for (var13 = -param0; param0 >= var13; var13++) {
              var12 = var12 + (var13 * 2 - 1);
              if (var12 <= var9) {
                var14 = (var9 - var12) * param5 / var9;
                if (param2 &&
                  0 == var13 &&
                  var11 == 0) {
                  var14 = 2147483647;
                }
                var15 = 0;
                var16 = (var11 + param0) * var21.field_u + (param0 + var13);
                for (var17 = 0; var17 < param1.field_v; var17++) {
                  for (var18 = 0; var18 < param1.field_u; var18++) {
                    if (0 != var27[var15] &&
                      var14 > var25[var16]) {
                      var25[var16] = var14;
                    }
                    var15++;
                    var16++;
                  }
                  var16 = var16 + (param0 << 1);
                }
              }
            }
          }
          var20 = 0;
          var11Lifetime1 = var20;
          while (var20 < var25.length) {
            var12Lifetime1 = var25[var20];
            if (var12Lifetime1 != 2147483647) {
              if (var12Lifetime1 != 0) {
                var7[var20] = param4[var12Lifetime1];
              }
            } else {
              var25[var20] = 0;
            }
            var20++;
          }
          stackIn_34_0 = var21;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_37_0 = var6;
          stackIn_37_1 = new StringBuilder().append("cl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 < 81) {
          field_k = (pf) null;
        }
        field_k = null;
    }

    static {
        field_k = new pf();
    }
}
