/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    private int[] field_a;
    static String field_b;

    final static kl a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        kl var8 = new kl(param5, param6, param3, param4, param0, param1);
        if (param2 == 15) {
          nl.field_e.b(-127, var8);
          ca.a(param7, var8, (byte) -70);
          return var8;
        }
        field_b = (String) null;
        nl.field_e.b(-127, var8);
        ca.a(param7, var8, (byte) -70);
        return var8;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var5 = 38 / ((-75 - param1) / 47);
        var3 = -1 + (this.field_a.length >> 1);
        var4 = var3 & param0;
        while (true) {
          var6 = this.field_a[1 + var4 + var4];
          if (var6 == -1) {
            return -1;
          }
          if (this.field_a[var4 + var4] == param0) {
            return var6;
          }
          var4 = var3 & var4 + 1;
        }
    }

    vj(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (var2_int <= (param0.length >> 1) + param0.length) {
            var2_int = var2_int << 1;
          }
          this.field_a = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_a[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & var2_int - 1;
            while (this.field_a[1 + var4 + var4] != -1) {
              var4 = 1 + var4 & -1 + var2_int;
            }
            this.field_a[var4 + var4] = param0[var3Lifetime1];
            this.field_a[var4 + var4 + 1] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("vj.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 == 18596) {
          return !al.field_f.a(true) ? true : false;
        }
        field_b = (String) null;
        return !al.field_f.a(true) ? true : false;
    }

    public static void a(byte param0) {
        if (param0 >= 31) {
          field_b = null;
          return;
        }
        vj.a(8, 68, (byte) 48, -30, 100, 35, 21, 10);
        field_b = null;
    }

    final static boolean a(int param0) {
        if (param0 != 25424) {
          vj.a(-81, 22, (byte) -98, 70, -85, -21, -31, 59);
          if (10 > eg.field_d) {
            return false;
          }
          if (rk.field_f >= 13) {
            return true;
          }
          return false;
        }
        if (10 > eg.field_d) {
          return false;
        }
        if (rk.field_f >= 13) {
          return true;
        }
        return false;
    }

    final static void b(byte param0) {
        int var3 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = stellarshard.field_B;
        try {
          var1_int = -73 / ((param0 - 83) / 35);
          var2 = gg.field_h[0];
          for (var3 = 1; gg.field_h.length > var3; var3++) {
            var4 = gg.field_h[var3];
            ri.a(ki.field_z, var3 << 4, ki.field_z, var2, var4);
            var2 = var2 + var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "vj.C(" + param0 + ')');
        }
    }

    static {
        field_b = "Creating your account";
    }
}
