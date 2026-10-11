/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ce {
    static u[] field_f;
    static int field_e;
    pm[] field_d;
    static int[] field_b;
    static String field_g;
    static bd field_a;
    static int field_c;

    final int b(int param0, int param1) {
        int var4 = 0;
        pm var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        pm[] var7 = this.field_d;
        pm[] var3 = var7;
        for (var4 = param1; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (var5.field_b.length > param0) {
            return var5.field_b[param0];
          }
          param0 = param0 - (var5.field_b.length - 1);
        }
        return 0;
    }

    final int a(boolean param0) {
        int stackIn_7_0 = 0;
        if (!param0) {
          return 24;
        }
        if (this.field_d != null &&
          0 < this.field_d.length) {
          stackIn_7_0 = this.field_d[this.field_d.length - 1].field_f - this.field_d[0].field_i;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        pm var4 = null;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        for (var3 = param1; this.field_d.length > var3; var3++) {
          var4 = this.field_d[var3];
          if (var4.field_b.length > param0) {
            return var3;
          }
          param0 = param0 - (var4.field_b.length - 1);
        }
        return this.field_d.length;
    }

    final static void a(ln param0, boolean param1) {
        int var2_int = 0;
        ln var3 = null;
        int var4 = 0;
        ln stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (null == param0.field_s) {
            return;
          }
          if (param0.field_i != 0 ||
            param0.field_e != 0) {
            for (var2_int = 0; var2_int < qb.field_i; var2_int++) {
              var3 = rj.field_J[var2_int];
              if (2 == var3.field_f &&
                param0.field_i == var3.field_i &&
                param0.field_e == var3.field_e) {
                return;
              }
            }
          }
          if (null == param0.field_o) {
          }
          stackIn_19_0 = (ln) (param0);
          stackIn_20_1 = !(param1);
          ed.a(stackIn_19_0, stackIn_20_1);
          if (!param1) {
            field_f = (u[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ce.F(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        pm var6;
        int var7;
        int var8;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (null != this.field_d &&
          this.field_d.length != 0 &&
          this.field_d[0].field_i <= param1) {
          if (param1 > this.field_d[-1 + this.field_d.length].field_f) {
            return -1;
          }
          if (this.field_d.length == 1) {
            return this.field_d[0].a(param2, (byte) -111);
          }
          var4 = 0;
          if (param0 <= 82) {
            return -76;
          }
          for (var5 = 0; this.field_d.length > var5; var5++) {
            var6 = this.field_d[var5];
            if (var6.field_i <= param1 &&
              var6.field_f >= param1) {
              var7 = var6.a(param2, (byte) -125);
              if (-1 != var7) {
                return var4 + var7;
              }
              return -1;
            }
            var4 = var4 + (var6.field_b.length - 1);
          }
          return -1;
        }
        return -1;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param2 < 1) {
            stackIn_3_0 = -59;
            return stackIn_3_0;
          }
          var5_int = 0;
          var6 = 0;
          var7 = param3.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param3.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (0 >= var5_int) {
            stackIn_24_0 = 0;
            return stackIn_24_0;
          }
          stackIn_22_0 = (param1 - param0 << 8) / var5_int;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("ce.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final int a(int param0) {
        int var4 = 0;
        int var2;
        pm[] var3;
        pm var5;
        int var7;
        int var6;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var2 = -1;
        if (param0 != 3915) {
          return -107;
        }
        if (null != this.field_d) {
          var3 = this.field_d;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a((byte) 127);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        if (param0 != 6937) {
          ce.b(85);
        }
        field_f = null;
    }

    static {
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = new int[]{100, 235, 340, 550};
    }
}
