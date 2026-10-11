/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private ii[] field_a;
    static boolean field_d;
    private int field_f;
    static volatile boolean field_c;
    static String field_e;
    private int[] field_b;

    public static void a(byte param0) {
        if (param0 != -28) {
          return;
        }
        field_e = null;
    }

    final static String a(String param0, boolean param1, String param2, String param3) {
        int var4 = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        if (!param1) {
          var4 = param3.indexOf(param0);
          while (-1 != var4) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(param0.length() + var4);
            var4 = param3.indexOf(param0, param2.length() + var4);
          }
          return param3;
        }
        return (String) null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        int[] var15;
        int[] var16;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        var13 = Transmogrify.field_A ? 1 : 0;
        var16 = this.field_a[0].field_j;
        var15 = var16;
        var14 = var15;
        var7 = var14;
        var8 = param0 & 16711935;
        var9 = param0 >> 8 & 255;
        for (var10 = 0; this.field_b.length > var10; var10++) {
          var11 = this.field_b[var10];
          if (~(var11 & 65535) != ~(var11 >> 8)) {
            if (this.field_f == var10) {
              var16[var10] = param5;
            }
          } else {
            var12 = var11 & 255;
            var14[var10] = cl.b(vg.c(var12 * var8 >> 8, 16711935), vg.c(var9 * var12, 65280));
          }
        }
        if (param2 == 3) {
          if (param3 < this.field_a[4].field_f + this.field_a[2].field_f + this.field_a[0].field_f) {
            throw new RuntimeException();
          }
          sb.a(ic.field_d);
          this.field_a[0].a(param4, param1);
          var10Lifetime1 = param4 + (-this.field_a[4].field_f - this.field_a[2].field_f + param3 + this.field_a[0].field_f >> 1);
          sb.g(param4 + this.field_a[0].field_f, 0, var10Lifetime1, 480);
          for (var11Lifetime1 = param4 + this.field_a[0].field_f; var11Lifetime1 < var10Lifetime1; var11Lifetime1 = var11Lifetime1 + this.field_a[1].field_f) {
            this.field_a[1].a(var11Lifetime1, param1);
          }
          sb.b(ic.field_d);
          this.field_a[2].b(var10Lifetime1, param1);
          var11Lifetime1 = -this.field_a[4].field_f + (param4 + param3);
          sb.g(var10Lifetime1 + this.field_a[2].field_f, 0, var11Lifetime1, 480);
          for (var12Lifetime1 = this.field_a[2].field_f + var10Lifetime1; var11Lifetime1 > var12Lifetime1; var12Lifetime1 = var12Lifetime1 + this.field_a[3].field_f) {
            this.field_a[3].a(var12Lifetime1, param1);
          }
        } else {
          this.field_f = -35;
          if (param3 < this.field_a[4].field_f + this.field_a[2].field_f + this.field_a[0].field_f) {
            throw new RuntimeException();
          }
          sb.a(ic.field_d);
          this.field_a[0].a(param4, param1);
          var10Lifetime1 = param4 + (-this.field_a[4].field_f - this.field_a[2].field_f + param3 + this.field_a[0].field_f >> 1);
          sb.g(param4 + this.field_a[0].field_f, 0, var10Lifetime1, 480);
          for (var11Lifetime1 = param4 + this.field_a[0].field_f; var11Lifetime1 < var10Lifetime1; var11Lifetime1 = var11Lifetime1 + this.field_a[1].field_f) {
            this.field_a[1].a(var11Lifetime1, param1);
          }
          sb.b(ic.field_d);
          this.field_a[2].b(var10Lifetime1, param1);
          var11Lifetime1 = -this.field_a[4].field_f + (param4 + param3);
          sb.g(var10Lifetime1 + this.field_a[2].field_f, 0, var11Lifetime1, 480);
          for (var12Lifetime1 = this.field_a[2].field_f + var10Lifetime1; var11Lifetime1 > var12Lifetime1; var12Lifetime1 = var12Lifetime1 + this.field_a[3].field_f) {
            this.field_a[3].a(var12Lifetime1, param1);
          }
        }
        sb.b(ic.field_d);
        this.field_a[4].a(var11Lifetime1, param1);
    }

    final static int a(int param0, boolean param1, int param2, boolean param3) {
        if (!param3) {
          mg.a(124, true, 121, true);
          return wf.a(-1);
        }
        return wf.a(-1);
    }

    final int a(boolean param0) {
        if (!param0) {
          return 117;
        }
        return this.field_a[0].field_g;
    }

    mg(ii[] param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_a = param0;
          this.field_b = new int[param0[0].field_j.length];
          ji.a(param0[0].field_j, 0, this.field_b, 0, this.field_b.length);
          var2_int = 0;
          while (this.field_b.length > var2_int) {
            var3 = this.field_b[var2_int];
            if ((16756717 & var3) >> 16 <= 128 ||
              (var3 & 65455) >> 8 <= 128 ||
              (255 & var3) >= 128) {
              var2_int++;
              continue;
            }
            break;
          }
          this.field_f = var2_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("mg.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_c = false;
        field_d = false;
    }
}
