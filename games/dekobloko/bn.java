/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static String field_a;
    static boolean[] field_f;
    static mm field_g;
    static String field_c;
    static String field_b;
    static String field_d;
    static ck field_e;

    public static void a(byte param0) {
        if (param0 == 92) {
          field_g = null;
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_c = null;
          return;
        }
        field_c = (String) null;
        field_g = null;
        field_b = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_c = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, ck param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = client.field_A ? 1 : 0;
        try {
          var6_int = (param1 - param2 << 8) / param4.field_K;
          param5 = param5 + param4.field_F;
          var7 = (param2 << 8) + var6_int * param4.field_F;
          if (param0 > -96) {
            field_d = (String) null;
          }
          param3 = param3 + param4.field_z;
          var8 = hk.field_j * param3 + param5;
          var9 = 0;
          var10 = param4.field_H;
          var11 = param4.field_I;
          var12 = hk.field_j - var11;
          var13 = 0;
          if (param3 < hk.field_h) {
            var14 = hk.field_h - param3;
            var8 = var8 + var14 * hk.field_j;
            var9 = var9 + var11 * var14;
            var10 = var10 - var14;
            param3 = hk.field_h;
          }
          if (hk.field_b < var10 + param3) {
            var10 = var10 - (-hk.field_b + param3 + var10);
          }
          if (hk.field_c > param5) {
            var14Lifetime1 = hk.field_c - param5;
            var12 = var12 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var7 = var7 + var14Lifetime1 * var6_int;
            param5 = hk.field_c;
            var8 = var8 + var14Lifetime1;
          }
          if (var11 + param5 > hk.field_g) {
            var14Lifetime2 = var11 + (param5 - hk.field_g);
            var13 = var13 + var14Lifetime2;
            var12 = var12 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
          }
          if (var11 > 0 &&
            0 < var10) {
            for (param3 = -var10; 0 > param3; param3++) {
              var14Lifetime3 = var7;
              for (param5 = -var11; 0 > param5; param5++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = -var15 + 256;
                if (var15 < 0) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param4.field_D[incrementValue$0];
                  if (var17 != 0) {
                    if (var15 <= 255) {
                      var18 = hk.field_l[var8];
                      var19 = var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> 8 & 16711935;
                      hk.field_l[var8] = lb.a(65280, lb.a(65280, var17) * var15 + var16 * lb.a(65280, var18) >> 8) + var19;
                    } else {
                      hk.field_l[var8] = var17;
                    }
                    var8++;
                  } else {
                    var8++;
                  }
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_37_0 = var6;
          stackIn_37_1 = new StringBuilder().append("bn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param5).append(')').toString());
        }
    }

    final static cd a(boolean param0, boolean param1) {
        cd var2 = null;
        cd var2Lifetime1;
        if (!param0) {
          var2 = new cd(true);
          var2.field_e = param1 ? true : false;
          return var2;
        }
        ck var3 = (ck) null;
        bn.a((byte) 42, -57, 101, -103, (ck) null, 71);
        var2Lifetime1 = new cd(true);
        var2Lifetime1.field_e = param1 ? true : false;
        return var2Lifetime1;
    }

    final static void a(long param0, int param1, byte param2) {
        uf var4 = null;
        int var5 = 0;
        uf var4Lifetime1;
        int var5Lifetime1;
        if (param2 == -84) {
          var4 = we.field_b;
          var4.f(param1, -4);
          var4.field_n = var4.field_n + 1;
          var5 = var4.field_n;
          var4.a(true, 6);
          var4.a(param0, (byte) 0);
          var4.b(var4.field_n - var5, true);
          return;
        }
        field_f = (boolean[]) null;
        var4Lifetime1 = we.field_b;
        var4Lifetime1.f(param1, -4);
        var4Lifetime1.field_n = var4Lifetime1.field_n + 1;
        var5Lifetime1 = var4Lifetime1.field_n;
        var4Lifetime1.a(true, 6);
        var4Lifetime1.a(param0, (byte) 0);
        var4Lifetime1.b(var4Lifetime1.field_n - var5Lifetime1, true);
    }

    static {
        field_c = "PANIC!";
        field_a = "Kick";
        field_d = "Loading graphics";
        field_b = "Enter name of player to delete from list";
    }
}
