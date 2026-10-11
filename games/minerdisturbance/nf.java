/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nf {
    static int field_c;
    static String[] field_a;
    static String field_g;
    mg[] field_f;
    static int field_e;
    static int[] field_d;
    static String field_b;
    static int field_h;

    final int a(int param0) {
        int var4 = 0;
        int var2;
        mg[] var3;
        mg var5;
        int var7;
        int var6;
        var7 = MinerDisturbance.field_ab;
        var2 = param0;
        if (null != this.field_f) {
          var3 = this.field_f;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.b(-23719);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_d = null;
        if (param0) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        mg var5 = null;
        int var6 = MinerDisturbance.field_ab;
        if (param1 > -116) {
          field_c = -37;
        }
        mg[] var7 = this.field_f;
        mg[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (!(param0 >= var5.field_d.length)) {
            return var5.field_d[param0];
          }
          param0 = param0 - (var5.field_d.length - 1);
        }
        return 0;
    }

    final int a(byte param0, int param1) {
        mg var4 = null;
        int var5 = MinerDisturbance.field_ab;
        int var3 = 0;
        if (param0 != 39) {
          return 0;
        }
        while (var3 < this.field_f.length) {
          var4 = this.field_f[var3];
          if (var4.field_d.length > param1) {
            return var3;
          }
          param1 = param1 - (-1 + var4.field_d.length);
          var3++;
        }
        return this.field_f.length;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = MinerDisturbance.field_ab;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param1.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param1.charAt(var8);
            if (60 == var9) {
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
          if (param0 < 48) {
            stackIn_19_0 = 125;
            return stackIn_19_0;
          }
          if (var5_int <= 0) {
            return 0;
          }
          stackIn_23_0 = (param3 - param2 << 8) / var5_int;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("nf.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0, int param1, int param2) {
        int var5 = 0;
        mg var6 = null;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        if (null == this.field_f ||
          this.field_f.length == 0 ||
          param2 < this.field_f[0].field_h) {
          return -1;
        }
        if (this.field_f[this.field_f.length - 1].field_i < param2) {
          return -1;
        }
        if (this.field_f.length == 1) {
          return this.field_f[0].a(param1, -24040);
        }
        if (!param0) {
          return 45;
        }
        int var4 = 0;
        for (var5 = 0; var5 < this.field_f.length; var5++) {
          var6 = this.field_f[var5];
          if (param2 >= var6.field_h &&
            !(param2 > var6.field_i)) {
            var7 = var6.a(param1, -24040);
            if (-1 == var7) {
              return -1;
            }
            return var4 + var7;
          }
          var4 = var4 + (-1 + var6.field_d.length);
        }
        return -1;
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        if (param0 <= 63) {
          nf.a(false);
        }
        if (this.field_f != null &&
          this.field_f.length > 0) {
          stackIn_7_0 = -this.field_f[0].field_h + this.field_f[-1 + this.field_f.length].field_i;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    static {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_d = new int[8192];
        field_b = "Finally! Science put to a practical use! Drop this into water to create ice cubes. Set it off near the ice cubes and perma freeze them! Don't go freezing yourself, though.";
    }
}
