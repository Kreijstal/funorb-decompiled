/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    final static int a(int param0, int param1) {
        if (param0 != 2047) {
          return -81;
        }
        return fb.field_j[2047 & param1];
    }

    final static so a(eg param0, int[] param1, byte param2) {
        int incrementValue$0 = 0;
        so stackIn_3_0 = null;
        so stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int[] var4 = null;
        eg[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        so var9 = null;
        so var10 = null;
        int var7Lifetime1;
        int var6Lifetime1;
        var8 = Pool.field_O;
        try {
          var9 = new so();
          var10 = var9;
          var9.field_d = param1;
          if (param2 != 101) {
            stackIn_3_0 = (so) null;
            return stackIn_3_0;
          }
          var4 = new int[]{1, 1, 1};
          ie.a(-2656, var4, param0);
          if (var4[0] == 1 &&
            var4[1] == 1 &&
            1 == var4[2]) {
            var9.field_i = param0;
          } else {
            d.a(param0, param2 - 23210);
            var5 = cm.a(param0, var4, true);
            var6 = var5.length;
            for (var7 = 0; var5.length > var7; var7++) {
              if (var5[var7].field_K == 0) {
                var6--;
              }
            }
            var10.field_b = new so[var6];
            var6Lifetime1 = 0;
            for (var7Lifetime1 = 0; var5.length > var7Lifetime1; var7Lifetime1++) {
              nd.a(var5[var7Lifetime1], (byte) -37);
              if (var5[var7Lifetime1].field_K > 0) {
                incrementValue$0 = var6Lifetime1;
                var6Lifetime1++;
                var10.field_b[incrementValue$0] = nd.a(109, var5[var7Lifetime1], hp.a(var10.field_d, (byte) 32));
              }
            }
          }
          stackIn_23_0 = var10;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("hc.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
