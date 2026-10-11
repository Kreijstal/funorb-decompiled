/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends rj {
    static dd field_E;
    static String field_z;
    static int[] field_A;
    static int[] field_C;
    int field_G;
    int field_F;
    private int field_D;
    static wh field_B;

    final void a(boolean param0, int param1, int param2) {
        if (param1 < 67) {
          param1 = 67;
        }
        super.a(param0, param1, param2);
        this.field_D = -20 + param1;
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
          dd.a(44, true);
        }
        if (param0 < 65536) {
          if (param0 < 256) {
            if (0 <= param0) {
              return i.field_u[param0] >> 8;
            }
            return -1;
          }
          if (param0 < 4096) {
            if (1024 <= param0) {
              return i.field_u[param0 >> 4] >> 10;
            }
            return i.field_u[param0 >> 2] >> 9;
          }
          if (16384 <= param0) {
            return i.field_u[param0 >> 8] >> 12;
          }
          return i.field_u[param0 >> 6] >> 11;
        }
        if (16777216 > param0) {
          if (param0 < 1048576) {
            if (param0 < 262144) {
              return i.field_u[param0 >> 10] >> 13;
            }
            return i.field_u[param0 >> 12] >> 14;
          }
          if (param0 < 4194304) {
            return i.field_u[param0 >> 14] >> 15;
          }
          return i.field_u[param0 >> 16] >> 16;
        }
        if (param0 >= 268435456) {
          if (param0 >= 1073741824) {
            return i.field_u[param0 >> 24] >> 20;
          }
          return i.field_u[param0 >> 22] >> 19;
        }
        if (67108864 <= param0) {
          return i.field_u[param0 >> 20] >> 18;
        }
        return i.field_u[param0 >> 18] >> 17;
    }

    public static void c(byte param0) {
        field_A = null;
        field_C = null;
        if (param0 != -40) {
          field_E = (dd) null;
        }
        field_E = null;
        field_z = null;
        field_B = null;
    }

    final void d(int param0, int param1, int param2) {
        if (this.field_D == 0) {
          return;
        }
        int var4 = (-33 + param0) * this.field_G / (-46 + this.field_D);
        if (var4 > this.field_G) {
          var4 = this.field_G;
        }
        if (param1 != 128) {
          this.a(41, -14);
        }
        if (0 > var4) {
          var4 = 0;
        }
        this.field_F = var4;
    }

    final void b(int param0, int param1, int param2) {
        int stackIn_12_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var7 = DungeonAssault.field_K;
        var4 = param0 + this.field_t;
        var5 = this.field_i + param2;
        bp.a(var5, bl.field_o, var4, (byte) 99);
        bp.a(this.field_D + var5 + 10, go.field_S, var4, (byte) 99);
        for (var6 = 0; var6 < 7; var6++) {
          te.a(var4 + 11, var6 + var5 + 6, -2 + this.field_D, kc.field_M);
        }
        for (var6Lifetime1 = 0; var6Lifetime1 < 3; var6Lifetime1++) {
          qe.a(11 + var4, var5 + 5 - var6Lifetime1, -2 + this.field_D, 0, 64 * (-var6Lifetime1 + 3));
          qe.a(11 + var4, var5 + 13 + var6Lifetime1, -2 + this.field_D, 0, (3 - var6Lifetime1) * 64);
        }
        for (var6Lifetime2 = 1; this.field_D - 1 > var6Lifetime2; var6Lifetime2++) {
          qe.b(var6Lifetime2 + (10 + var4), var5 + 7, 5, 0, -(var6Lifetime2 * 80 / this.field_D) + 144);
        }
        if (this.field_G != 0) {
          stackIn_12_0 = (this.field_D - 46) * this.field_F / this.field_G;
        } else {
          stackIn_12_0 = 0;
        }
        var6Lifetime3 = stackIn_12_0;
        bp.a(4 + var5, im.field_m, var6Lifetime3 + (var4 + 10), (byte) 99);
        tn.field_W.h(var4, var5);
        if (param1 != 8187) {
          field_C = (int[]) null;
        }
        dc.field_x.h(this.field_D + var4 + 10, var5);
        ml.field_a.h(var4 + (10 + var6Lifetime3), 4 + var5);
    }

    final void a(int param0, int param1) {
        this.field_F = this.field_F + (param1 * this.field_G >> 5);
        if (this.field_F > this.field_G) {
          this.field_F = this.field_G;
        }
        if (param0 != 1) {
          field_z = (String) null;
        }
        if (this.field_F < 0) {
          this.field_F = 0;
        }
    }

    final static cn a(byte param0, int param1, cn param2) {
        int var4 = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        cn var6 = null;
        cn stackIn_6_0 = null;
        cn stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          var6 = new cn(param1 * 2 + param2.field_y, 2 * param1 + param2.field_v);
          jh.a(var6);
          gf.b(0, 0, var6.field_y, var6.field_v, 16777215);
          for (var4 = 0; param1 > var4; var4++) {
            param2.e(param1 - param2.field_w, param1 - param2.field_A, 0);
            gf.d(1, 1, 0, 0, var6.field_y, var6.field_v);
          }
          var6.h();
          param2.e(param1 - param2.field_w, param1 - param2.field_A, 0);
          jh.b();
          if (param0 != -112) {
            stackIn_6_0 = (cn) null;
            return stackIn_6_0;
          }
          var6.field_w = param2.field_w - param1;
          var6.field_A = param2.field_A - param1;
          stackIn_8_0 = var6;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (this.field_D == 0) {
          return;
        }
        int var4 = this.field_G * (param2 - 33) / (-46 + this.field_D);
        if (this.field_F < var4) {
          this.field_F = this.field_F + (this.field_G >> 4);
        }
        if (var4 < this.field_F) {
          this.field_F = this.field_F - (this.field_G >> 4);
        }
        if (this.field_G < this.field_F) {
          this.field_F = this.field_G;
        }
        if (this.field_F < 0) {
          this.field_F = 0;
        }
        if (param1 > -59) {
          field_C = (int[]) null;
        }
    }

    dd(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param3, 19, param2);
        this.field_F = param5;
        this.field_G = param4;
        this.field_D = param3 - 20;
    }

    static {
        field_z = "Bottomless Pit";
        field_C = new int[]{45, 187, 495, 660, 885, 1039, 1230, 1410, 1674};
    }
}
