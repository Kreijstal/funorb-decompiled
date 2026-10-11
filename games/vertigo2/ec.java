/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ji {
    static String field_D;
    private int field_y;
    private int field_A;
    static String field_z;
    private int field_B;
    static String field_E;
    static int field_C;

    final int[] c(int param0, int param1) {
        int var6 = 0;
        int[] var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        ed var12;
        int[] var13;
        int[] var14;
        int[] var15;
        ed var12Lifetime1;
        int[] var15Lifetime1;
        int[] var15Lifetime1Lifetime1;
        var11 = Vertigo2.field_L ? 1 : 0;
        var15 = this.field_x.a(param0, (byte) 100);
        var14 = var15;
        var13 = var14;
        var3 = var13;
        if (!this.field_x.field_i) {
          if (param1 > 91) {
            return var13;
          }
          var12 = (ed) null;
          this.a((byte) 122, -56, (ed) null);
          return var13;
        }
        var4 = lf.field_y[param0];
        var5 = -2048 + var4 >> 1;
        for (var6 = 0; we.field_M > var6; var6++) {
          var8 = rh.field_O[var6];
          var9 = -2048 + var8 >> 1;
          if (this.field_y != 0) {
            var10 = var5 * var5 + var9 * var9 >> 12;
            var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0f)) * 4096.0);
            var7 = (int)((double)(this.field_B * var7) * 3.141592653589793);
          } else {
            var7 = (var8 - var4) * this.field_B;
          }
          var7 = var7 - (var7 & -4096);
          if (this.field_A != 0) {
            if (2 == this.field_A) {
              var15Lifetime1 = var14;
              var7 -= 2048;
              if (var7 < 0) {
                var7 = -var7;
              }
              var15Lifetime1 = var14;
              var7 = -var7 + 2048 << 1;
            }
          } else {
            var7 = 4096 + eh.field_b[255 & var7 >> 4] >> 1;
          }
          var15Lifetime1Lifetime1 = var14;
          var15Lifetime1Lifetime1[var6] = var7;
        }
        if (param1 > 91) {
          return var13;
        }
        var12Lifetime1 = (ed) null;
        this.a((byte) 122, -56, (ed) null);
        return var13;
    }

    final static void a(int param0, byte param1, be param2) {
        mi var3 = uh.field_Wb;
        var3.j(param0, 118);
        if (param1 < 116) {
          return;
        }
        try {
          var3.f(2, 126);
          var3.f(0, 79);
          var3.f(param2.field_r, 89);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ec.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 38 % ((27 - param4) / 37);
        ap.field_e = param1;
        cj.field_D = param0;
        ua.field_e = param3;
        ib.field_a = param2;
    }

    public ec() {
        super(0, true);
        this.field_y = 0;
        this.field_A = 0;
        this.field_B = 1;
    }

    final void a(int param0) {
        if (param0 >= -98) {
          ec.b((byte) 102);
          uk.d((byte) 106);
          return;
        }
        uk.d((byte) 106);
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        ed var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            var6 = (ed) null;
            this.a((byte) 103, -106, (ed) null);
          }
          var4_int = param1;
          if (0 == var4_int) {
            this.field_y = param2.h(-11);
            return;
          }
          if (var4_int == 1) {
            this.field_A = param2.h(-11);
            return;
          }
          if (var4_int != 3) {
            return;
          }
          this.field_B = param2.h(param0 ^ -101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ec.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_E = null;
        field_z = null;
        field_D = null;
        if (param0 != 60) {
          field_z = (String) null;
        }
    }

    static {
        field_D = "Loading models";
        field_z = "RuneScape clan";
        field_C = 0;
        field_E = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
