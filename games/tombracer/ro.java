/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends wda {
    private int field_v;
    static String field_q;
    private int field_w;
    private boolean field_s;
    private gea field_t;
    private boolean field_o;
    private boolean field_u;
    private int field_r;
    static int field_p;

    final int c(int param0) {
        if (param0 != 1) {
          return 10;
        }
        return 5;
    }

    final void a(boolean param0, int param1) {
        this.field_o = param0 ? true : false;
        if (param1 != -606738686) {
          this.b((byte) -25);
        }
    }

    ro(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        gea stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_17_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_s = false;
        try {
          this.field_t = new gea(param0.field_E, param1);
          if (7 < param0.field_E) {
            this.field_r = this.a(param1.b((byte) 44, 8), false);
          } else {
            this.field_r = param1.b((byte) 44, 4) << 16;
          }
          if (param0.field_E < 11) {
            stackIn_7_0 = this.field_t;
            stackIn_8_1 = (1 == param1.b((byte) 44, 1));
            ((gea) (Object) stackIn_7_0).a(stackIn_8_1, 1);
          }
          if (param0.field_E >= 12) {
            stackIn_13_1 = (param1.b((byte) 44, 1) == 1);
            this.field_o = stackIn_13_1;
            if (this.field_o) {
              stackIn_17_1 = (param1.b((byte) 44, 1) == 1);
              this.field_u = stackIn_17_1;
              this.field_v = param1.b((byte) 44, 12);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ro.<init>(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != 4) {
          return;
        }
        this.field_u = param1 ? true : false;
    }

    final void b(byte param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var13Lifetime5;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var14Lifetime5;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        int var12Lifetime5;
        int var12Lifetime6;
        int var12Lifetime7;
        int var13Lifetime6;
        int var13Lifetime7;
        int var13Lifetime8;
        int var13Lifetime9;
        int var14Lifetime6;
        int var14Lifetime7;
        int var14Lifetime8;
        int var14Lifetime9;
        if (this.field_t.a(-4075)) {
          return;
        }
        int[][] var17 = this.field_t.c(-2);
        int[][] var16 = var17;
        int[][] var15 = var16;
        int[][] var2 = var15;
        int var3 = 45 / ((-69 - param0) / 42);
        if (var17.length > this.field_w) {
          var4 = var15[this.field_w][0] + this.d((byte) -70);
          var5 = var15[this.field_w][1] + this.a(false);
          var6 = -this.field_n.s(25745) + var4;
          var7 = var5 - this.field_n.e(false);
          var8 = this.field_r >> 16;
          var8 = var8 * var8;
          var9 = (var6 >> 16) * (var6 >> 16) + (var7 >> 16) * (var7 >> 16);
          if (var9 <= var8) {
            this.field_n.a((byte) -112, var6, var7);
            this.field_s = true;
            this.field_w = this.field_w + 1;
            return;
          }
          var10 = qva.a((byte) -99, var7, var6);
          if (!this.field_o) {
            var11 = hua.a((byte) 126, var10 >> 2);
            var12 = bua.a(0, var10 >> 2);
            var13 = doa.a(2, this.field_r, var11);
            var14 = doa.a(2, this.field_r, var12);
            this.field_n.a((byte) -77, var13, var14);
            return;
          }
          if (!this.field_s) {
            var11Lifetime5 = hua.a((byte) 126, var10 >> 2);
            var12Lifetime5 = bua.a(0, var10 >> 2);
            var13Lifetime6 = doa.a(2, this.field_r, var11Lifetime5);
            var14Lifetime6 = doa.a(2, this.field_r, var12Lifetime5);
            this.field_n.a((byte) -77, var13Lifetime6, var14Lifetime6);
            return;
          }
          var11Lifetime6 = cf.a(8192, -16390, var10, this.field_n.g(-25787));
          var12Lifetime6 = ua.a(var11Lifetime6, 39);
          if (this.field_v == 0) {
            this.field_n.c(false, -var11Lifetime6);
            this.field_s = false;
            var11Lifetime6 = hua.a((byte) 126, var10 >> 2);
            var12Lifetime6 = bua.a(0, var10 >> 2);
            var13Lifetime7 = doa.a(2, this.field_r, var11Lifetime6);
            var14Lifetime7 = doa.a(2, this.field_r, var12Lifetime6);
            this.field_n.a((byte) -77, var13Lifetime7, var14Lifetime7);
            return;
          }
          if (var12Lifetime6 <= this.field_v) {
            this.field_n.c(false, -var11Lifetime6);
            this.field_s = false;
            var11Lifetime6 = hua.a((byte) 126, var10 >> 2);
            var12Lifetime6 = bua.a(0, var10 >> 2);
            var13Lifetime8 = doa.a(2, this.field_r, var11Lifetime6);
            var14Lifetime8 = doa.a(2, this.field_r, var12Lifetime6);
            this.field_n.a((byte) -77, var13Lifetime8, var14Lifetime8);
            return;
          }
          this.field_n.c(false, -lw.a(var11Lifetime6, (byte) -76) * this.field_v);
          if (this.field_u) {
            return;
          }
          var11Lifetime7 = hua.a((byte) 126, var10 >> 2);
          var12Lifetime7 = bua.a(0, var10 >> 2);
          var13Lifetime9 = doa.a(2, this.field_r, var11Lifetime7);
          var14Lifetime9 = doa.a(2, this.field_r, var12Lifetime7);
          this.field_n.a((byte) -77, var13Lifetime9, var14Lifetime9);
          return;
        }
        this.field_w = 0;
        if (this.field_t.a((byte) 21)) {
          this.field_j = true;
          return;
        }
        var4Lifetime1 = var15[this.field_w][0] + this.d((byte) -70);
        var5Lifetime1 = var15[this.field_w][1] + this.a(false);
        var6Lifetime1 = -this.field_n.s(25745) + var4Lifetime1;
        var7Lifetime1 = var5Lifetime1 - this.field_n.e(false);
        var8Lifetime1 = this.field_r >> 16;
        var8Lifetime1 = var8Lifetime1 * var8Lifetime1;
        var9Lifetime1 = (var6Lifetime1 >> 16) * (var6Lifetime1 >> 16) + (var7Lifetime1 >> 16) * (var7Lifetime1 >> 16);
        if (var9Lifetime1 <= var8Lifetime1) {
          this.field_n.a((byte) -112, var6Lifetime1, var7Lifetime1);
          this.field_s = true;
          this.field_w = this.field_w + 1;
          return;
        }
        var10Lifetime1 = qva.a((byte) -99, var7Lifetime1, var6Lifetime1);
        if (!this.field_o) {
          var11Lifetime1 = hua.a((byte) 126, var10Lifetime1 >> 2);
          var12Lifetime1 = bua.a(0, var10Lifetime1 >> 2);
          var13Lifetime1 = doa.a(2, this.field_r, var11Lifetime1);
          var14Lifetime1 = doa.a(2, this.field_r, var12Lifetime1);
          this.field_n.a((byte) -77, var13Lifetime1, var14Lifetime1);
          return;
        }
        if (!this.field_s) {
          var11Lifetime2 = hua.a((byte) 126, var10Lifetime1 >> 2);
          var12Lifetime2 = bua.a(0, var10Lifetime1 >> 2);
          var13Lifetime2 = doa.a(2, this.field_r, var11Lifetime2);
          var14Lifetime2 = doa.a(2, this.field_r, var12Lifetime2);
          this.field_n.a((byte) -77, var13Lifetime2, var14Lifetime2);
          return;
        }
        var11Lifetime3 = cf.a(8192, -16390, var10Lifetime1, this.field_n.g(-25787));
        var12Lifetime3 = ua.a(var11Lifetime3, 39);
        if (this.field_v == 0) {
          this.field_n.c(false, -var11Lifetime3);
          this.field_s = false;
          var11Lifetime3 = hua.a((byte) 126, var10Lifetime1 >> 2);
          var12Lifetime3 = bua.a(0, var10Lifetime1 >> 2);
          var13Lifetime3 = doa.a(2, this.field_r, var11Lifetime3);
          var14Lifetime3 = doa.a(2, this.field_r, var12Lifetime3);
          this.field_n.a((byte) -77, var13Lifetime3, var14Lifetime3);
          return;
        }
        if (var12Lifetime3 <= this.field_v) {
          this.field_n.c(false, -var11Lifetime3);
          this.field_s = false;
          var11Lifetime3 = hua.a((byte) 126, var10Lifetime1 >> 2);
          var12Lifetime3 = bua.a(0, var10Lifetime1 >> 2);
          var13Lifetime4 = doa.a(2, this.field_r, var11Lifetime3);
          var14Lifetime4 = doa.a(2, this.field_r, var12Lifetime3);
          this.field_n.a((byte) -77, var13Lifetime4, var14Lifetime4);
          return;
        }
        this.field_n.c(false, -lw.a(var11Lifetime3, (byte) -76) * this.field_v);
        if (this.field_u) {
          return;
        }
        var11Lifetime4 = hua.a((byte) 126, var10Lifetime1 >> 2);
        var12Lifetime4 = bua.a(0, var10Lifetime1 >> 2);
        var13Lifetime5 = doa.a(2, this.field_r, var11Lifetime4);
        var14Lifetime5 = doa.a(2, this.field_r, var12Lifetime4);
        this.field_n.a((byte) -77, var13Lifetime5, var14Lifetime5);
    }

    final void c(int param0, int param1) {
        this.field_v = param0;
        int var3 = 18 % ((37 - param1) / 55);
    }

    final void b(int param0) {
        if (param0 != 1) {
          this.e(91);
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 98, param1, this.field_r);
        param1 = fs.a((byte) 26, param1, this.field_w);
        if (param0 == 0) {
          return param1;
        }
        field_q = (String) null;
        return param1;
    }

    final void a(kh param0, byte param1) {
        try {
          super.a(param0, (byte) -91);
          if (param1 >= -78) {
            this.field_o = true;
          }
          this.field_t.a(param0, 0);
          param0.a((byte) 54, this.b(0, this.field_r), 8);
          param0.a((byte) -127, !this.field_o ? 0 : 1, 1);
          if (this.field_o) {
            param0.a((byte) -126, this.field_u ? 1 : 0, 1);
            param0.a((byte) -128, this.field_v, 12);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ro.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, gea param1) {
        try {
          this.field_t = param1;
          if (param0 < 6) {
            field_q = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ro.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ro(la param0, boolean param1) {
        super(param0, param1);
        this.field_s = false;
        try {
          this.field_t = new gea();
          this.field_r = 131072;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ro.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(byte param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -116) {
            stackIn_2_0 = 51;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = qt.field_a.b(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = bfa.field_c.b(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ro.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final int e(int param0) {
        if (param0 < 2) {
          field_q = (String) null;
          return this.field_r;
        }
        return this.field_r;
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 > -101) {
          String var2 = (String) null;
          ro.$cfr$intArgs$a$590e95718a07(-4, (String) null, false);
        }
    }

    final void c(byte param0) {
        if (param0 <= -116) {
          super.c((byte) -119);
          this.field_t.a(true);
          return;
        }
        this.field_w = -124;
        super.c((byte) -119);
        this.field_t.a(true);
    }

    final void a(byte param0, int param1) {
        this.field_r = param1;
        int var3 = 84 % ((-37 - param0) / 46);
    }

    final int d(boolean param0) {
        if (param0) {
          this.field_r = -121;
          return this.field_w;
        }
        return this.field_w;
    }

    static {
        field_q = "Enter name of friend to delete from list";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$590e95718a07(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -116) {
            stackIn_2_0 = 51;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = qt.field_a.b(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = bfa.field_c.b(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ro.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }
}
