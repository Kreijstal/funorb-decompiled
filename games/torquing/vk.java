/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends am {
    private int field_D;
    static hk field_B;
    private int field_G;
    private int field_y;
    private int field_t;
    static String field_x;
    static int[] field_z;
    private int field_v;
    private int field_w;
    static no field_E;
    static t field_s;
    private int field_u;
    static int field_A;

    private final boolean a(int param0, int param1, byte param2) {
        int var4 = this.field_G * (param1 + param0) >> 12;
        int var5 = de.field_d[var4 * 255 >> 12 & 255];
        var5 = (var5 << 12) / this.field_G;
        var5 = (var5 << 12) / this.field_D;
        var5 = this.field_w * var5 >> 12;
        if (param2 <= 84) {
          this.field_D = -24;
          if (var5 <= param1 - param0) {
            return false;
          }
          if (param1 - param0 > -var5) {
            return true;
          }
          return false;
        }
        if (var5 <= param1 - param0) {
          return false;
        }
        if (param1 - param0 > -var5) {
          return true;
        }
        return false;
    }

    public static void b(int param0) {
        field_z = null;
        if (param0 == 95) {
          field_x = null;
          field_s = null;
          field_E = null;
          return;
        }
        String var2 = (String) null;
        vk.a((String) null, 60, (String) null);
        field_x = null;
        field_s = null;
        field_E = null;
    }

    final int[] a(byte param0, int param1) {
        int var5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_42_2 = 0;
        int[] var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        var11 = Torquing.field_u;
        var12 = this.field_l.a(param1, 25657);
        var3 = var12;
        if (!this.field_l.field_b) {
          if (param0 >= 86) {
            return var12;
          }
          this.a((byte) 37, 0);
          return var12;
        }
        var4 = -2048 + dp.field_a[param1];
        for (var5 = 0; ci.field_c > var5; var5++) {
          var6 = q.field_b[var5] - 2048;
          var7 = var6 + this.field_u;
          if (var7 < -2048) {
            stackIn_16_0 = var7 + 4096;
          } else {
            stackIn_16_0 = var7;
          }
          var7Lifetime1 = stackIn_16_0;
          if (var7Lifetime1 <= 2048) {
            stackIn_19_0 = var7Lifetime1;
          } else {
            stackIn_19_0 = var7Lifetime1 - 4096;
          }
          var7Lifetime2 = stackIn_19_0;
          var8 = var4 + this.field_y;
          if (var8 < -2048) {
            stackIn_22_0 = 4096 + var8;
          } else {
            stackIn_22_0 = var8;
          }
          var8Lifetime1 = stackIn_22_0;
          if (var8Lifetime1 <= 2048) {
            stackIn_25_0 = var8Lifetime1;
          } else {
            stackIn_25_0 = var8Lifetime1 - 4096;
          }
          var8Lifetime2 = stackIn_25_0;
          var9 = var6 + this.field_v;
          if (var9 >= -2048) {
            stackIn_28_0 = var9;
          } else {
            stackIn_28_0 = 4096 + var9;
          }
          var9Lifetime1 = stackIn_28_0;
          if (var9Lifetime1 <= 2048) {
            stackIn_31_0 = var9Lifetime1;
          } else {
            stackIn_31_0 = -4096 + var9Lifetime1;
          }
          var9Lifetime2 = stackIn_31_0;
          var10 = var4 + this.field_t;
          if (var10 < -2048) {
            stackIn_34_0 = 4096 + var10;
          } else {
            stackIn_34_0 = var10;
          }
          var10Lifetime1 = stackIn_34_0;
          if (var10Lifetime1 > 2048) {
            stackIn_37_0 = -4096 + var10Lifetime1;
          } else {
            stackIn_37_0 = var10Lifetime1;
          }
          var10Lifetime2 = stackIn_37_0;
          stackIn_40_0 = var12;
          stackIn_40_1 = var5;
          if (!this.d(var7Lifetime2, 2016089164, var8Lifetime2) &&
            !this.a(var9Lifetime2, var10Lifetime2, (byte) 107)) {
            stackIn_42_2 = 0;
          } else {
            stackIn_42_2 = 4096;
          }
          stackIn_40_0[stackIn_40_1] = stackIn_42_2;
        }
        if (param0 >= 86) {
          return var12;
        }
        this.a((byte) 37, 0);
        return var12;
    }

    public vk() {
        super(0, true);
        this.field_G = 12288;
        this.field_v = 0;
        this.field_y = 0;
        this.field_D = 8192;
        this.field_t = 2048;
        this.field_w = 4096;
        this.field_u = 2048;
    }

    private final boolean d(int param0, int param1, int param2) {
        int var4 = (-param0 + param2) * this.field_G >> 12;
        int var5 = de.field_d[255 & var4 * 255 >> 12];
        var5 = (var5 << 12) / this.field_G;
        var5 = (var5 << 12) / this.field_D;
        var5 = var5 * this.field_w >> 12;
        if (param1 != 2016089164) {
          field_x = (String) null;
          if (param0 + param2 >= var5) {
            return false;
          }
          if (-var5 < param2 + param0) {
            return true;
          }
          return false;
        }
        if (param0 + param2 >= var5) {
          return false;
        }
        if (-var5 < param2 + param0) {
          return true;
        }
        return false;
    }

    final void a(byte param0) {
        if (param0 < 123) {
          return;
        }
        ie.a(14837);
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Torquing.field_u;
        try {
          if (param1 != 35) {
            return;
          }
          var4_int = param2;
          if (var4_int == 0) {
            this.field_u = param0.i(7088);
            return;
          }
          if (1 == var4_int) {
            this.field_y = param0.i(7088);
            return;
          }
          if (var4_int == 2) {
            this.field_v = param0.i(7088);
            return;
          }
          if (var4_int == 3) {
            this.field_t = param0.i(7088);
            return;
          }
          if (4 == var4_int) {
            this.field_G = param0.i(7088);
            return;
          }
          if (var4_int == 5) {
            this.field_w = param0.i(7088);
            return;
          }
          if (var4_int != 6) {
            return;
          }
          this.field_D = param0.i(7088);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("vk.H(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = kf.a(param0, '_', "", 121);
          if (param1 != 4096) {
            vk.b(37);
          }
          var3 = db.a(param0, 31108);
          stackIn_7_0 = (param2.indexOf(param0) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vk.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_z = new int[8192];
        field_B = null;
        field_x = "Nursery Slopes";
    }
}
