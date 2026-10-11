/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jma implements noa {
    private int field_l;
    private int field_i;
    static ka[] field_a;
    private boolean field_m;
    private int field_c;
    private int field_e;
    static String field_o;
    private boolean field_p;
    static cn field_j;
    private int field_f;
    private int field_n;
    private boolean field_g;
    private koa field_d;
    private int field_k;
    static String field_h;
    private int field_b;

    final void a(ew param0, byte param1, kh param2) {
        try {
          this.field_d.a(30489, param0, param2);
          param2.a((byte) -127, this.field_e, 8);
          param2.a((byte) -45, this.field_k, 8);
          param2.a((byte) -125, this.field_i, 8);
          if (param1 <= 65) {
            kh var5 = (kh) null;
            this.a((ew) null, (byte) 97, (kh) null);
          }
          param2.a((byte) -126, this.field_l, 8);
          param2.a((byte) -45, this.field_f, 8);
          param2.a((byte) 77, this.field_m ? 1 : 0, 1);
          param2.a((byte) -127, this.field_p ? 1 : 0, 1);
          param2.a((byte) -126, this.field_c, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jma.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(byte param0) {
        if (param0 >= -63) {
          return;
        }
        this.field_n = 3;
    }

    final void b(int param0, int param1) {
        if (param1 < 50) {
          return;
        }
        this.field_c = param0;
    }

    private final void e(byte param0) {
        if (param0 != -102) {
          this.a(-19, 46, -116, 50, -114, 44);
          if (this.field_l > 0) {
            this.field_n = 4;
            this.field_b = this.field_l;
            return;
          }
          this.a(8);
          return;
        }
        if (this.field_l > 0) {
          this.field_n = 4;
          this.field_b = this.field_l;
          return;
        }
        this.a(8);
    }

    public static void e(int param0) {
        field_a = null;
        field_h = null;
        if (param0 <= 39) {
          return;
        }
        field_o = null;
        field_j = null;
    }

    final boolean b(int param0) {
        if (param0 != 4) {
          field_j = (cn) null;
          if (this.field_n == 1) {
            return true;
          }
          if (this.field_n != 2) {
            return this.field_n == 3 ? true : false;
          }
          return true;
        }
        if (this.field_n == 1) {
          return true;
        }
        if (this.field_n == 2) {
          return true;
        }
        if (this.field_n != 3) {
          return false;
        }
        return true;
    }

    jma(int param0) {
        this(param0, new lj[]{});
    }

    private final void a(int param0) {
        if (param0 != 8) {
          this.e((byte) 60);
          if (this.field_k <= 0) {
            this.a((byte) 63);
            return;
          }
          this.field_b = this.field_k;
          this.field_n = 5;
          return;
        }
        if (this.field_k <= 0) {
          this.a((byte) 63);
          return;
        }
        this.field_b = this.field_k;
        this.field_n = 5;
    }

    private final void g(int param0) {
        this.field_n = 3;
        if (this.field_m) {
          this.d((byte) -70);
        }
        if (param0 <= 49) {
          this.f(95);
          return;
        }
    }

    private final void a(byte param0) {
        this.field_n = 0;
        this.field_b = this.field_f;
        int var2 = 101 % ((param0 + 2) / 52);
        if (this.field_p) {
          this.d((byte) -70);
        }
    }

    final void a(byte param0, ew param1) {
        try {
          if (param0 != 48) {
            field_j = (cn) null;
          }
          this.field_d.a(param1, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jma.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final koa h(int param0) {
        if (param0 != 1) {
          this.e((byte) -23);
          return this.field_d;
        }
        return this.field_d;
    }

    private final boolean b(boolean param0) {
        if (this.field_b <= 0) {
          return true;
        }
        this.field_b = this.field_b - 1;
        if (param0) {
          return false;
        }
        this.field_b = 15;
        return false;
    }

    final boolean b(byte param0) {
        if (param0 < 70) {
          field_h = (String) null;
          if (this.field_n == 3) {
            return true;
          }
          if (this.field_n != 4) {
            return 5 == this.field_n ? true : false;
          }
          return true;
        }
        if (this.field_n == 3) {
          return true;
        }
        if (this.field_n == 4) {
          return true;
        }
        if (5 != this.field_n) {
          return false;
        }
        return true;
    }

    final void a(byte param0, boolean param1) {
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_g) {
          return;
        }
        if (param0 != -14) {
          return;
        }
        var3 = this.field_n;
        if (var3 == 0) {
          if (!this.b(true)) {
            return;
          }
          if (!param1) {
            return;
          }
          this.f(param0 - 86);
          return;
        }
        if (1 == var3) {
          if (!param1) {
            this.c(param0 ^ 8182);
            return;
          }
          if (!this.b(true)) {
            return;
          }
          this.d(-121);
          return;
        }
        if (var3 == 2) {
          if (!this.b(true)) {
            return;
          }
          this.g(103);
          return;
        }
        if (var3 == 3) {
          if (param1) {
            return;
          }
          this.e((byte) -102);
          return;
        }
        if (4 != var3) {
          if (5 != var3) {
            return;
          }
          if (!this.b(true)) {
            return;
          }
          this.a((byte) 122);
          return;
        }
        if (param1) {
          this.c((byte) -69);
          return;
        }
        if (!this.b(true)) {
          return;
        }
        this.a(8);
        return;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          this.field_g = true;
          return this.field_p;
        }
        return this.field_p;
    }

    final boolean f(byte param0) {
        if (param0 != -56) {
          return true;
        }
        return false;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_i > 0) {
          this.field_n = 1;
          this.field_b = this.field_i;
          var2 = 109 % ((param0 + 20) / 61);
          return;
        }
        this.d(-125);
        var2Lifetime1 = 109 % ((param0 + 20) / 61);
    }

    private final void d(byte param0) {
        lj[] var3;
        int var4;
        int var6;
        lj[] var7;
        lj[] var10;
        lj var11;
        lj[] var12;
        lj var13;
        lj[] var14;
        lj var15;
        lj[] var16;
        lj var17;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        lj[] var3Lifetime1;
        lj[] var7Lifetime1;
        lj[] var7Lifetime2;
        lj[] var7Lifetime3;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.field_c > 0) {
          this.field_c = this.field_c - 1;
          if (this.field_c != 0) {
            if (param0 == -70) {
              if (null == this.field_d) {
                return;
              }
              var7 = this.field_d.c(1);
              var10 = var7;
              var3 = var7;
              for (var4 = 0; var10.length > var4; var4++) {
                var11 = var10[var4];
                if (var11 != null) {
                  var11.m(119);
                }
              }
              return;
            }
            field_o = (String) null;
            if (null == this.field_d) {
              return;
            }
            var7Lifetime3 = this.field_d.c(1);
            var12 = var7Lifetime3;
            var3Lifetime1 = var7Lifetime3;
            for (var4Lifetime3 = 0; var12.length > var4Lifetime3; var4Lifetime3++) {
              var13 = var12[var4Lifetime3];
              if (var13 != null) {
                var13.m(119);
              }
            }
            return;
          }
          this.field_g = true;
        }
        if (param0 == -70) {
          if (null == this.field_d) {
            return;
          }
          var7Lifetime1 = this.field_d.c(1);
          var16 = var7Lifetime1;
          for (var4Lifetime1 = 0; var16.length > var4Lifetime1; var4Lifetime1++) {
            var17 = var16[var4Lifetime1];
            if (var17 != null) {
              var17.m(119);
            }
          }
          return;
        }
        field_o = (String) null;
        if (null == this.field_d) {
          return;
        }
        var7Lifetime2 = this.field_d.c(1);
        var14 = var7Lifetime2;
        for (var4Lifetime2 = 0; var14.length > var4Lifetime2; var4Lifetime2++) {
          var15 = var14[var4Lifetime2];
          if (var15 != null) {
            var15.m(119);
          }
        }
        return;
    }

    private final void c(int param0) {
        if (param0 != -8188) {
          return;
        }
        this.field_n = 0;
    }

    private final void d(int param0) {
        if (param0 > -119) {
          this.field_b = -37;
          if (this.field_e <= 0) {
            this.g(69);
            return;
          }
          this.field_b = this.field_e;
          this.field_n = 2;
          return;
        }
        if (this.field_e <= 0) {
          this.g(69);
          return;
        }
        this.field_b = this.field_e;
        this.field_n = 2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_l = param1;
        if (param4 == 5) {
          this.field_f = param2;
          this.field_k = param3;
          this.field_i = param0;
          this.field_e = param5;
          return;
        }
        this.d((byte) -52);
        this.field_f = param2;
        this.field_k = param3;
        this.field_i = param0;
        this.field_e = param5;
    }

    private jma(int param0, lj[] param1) {
        this.field_p = false;
        this.field_m = true;
        try {
          this.field_d = new koa(param0, 0);
          this.field_d.a(9, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jma.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 85, param1, this.field_n);
        if (param0 > 59) {
          param1 = fs.a((byte) 93, param1, this.field_b);
          return param1;
        }
        this.field_c = 32;
        param1 = fs.a((byte) 93, param1, this.field_b);
        return param1;
    }

    jma(int param0, la param1, kh param2) {
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_p = false;
        this.field_m = true;
        try {
          this.field_d = new koa(param0, 0, param1.field_E, param2);
          if (param1.field_E > 9) {
            this.field_e = param2.b((byte) 44, 8);
            this.field_k = param2.b((byte) 44, 8);
            this.field_i = param2.b((byte) 44, 8);
            this.field_l = param2.b((byte) 44, 8);
            this.field_f = param2.b((byte) 44, 8);
          } else {
            this.field_e = param2.b((byte) 44, 8);
            this.field_k = param2.b((byte) 44, 8);
          }
          stackIn_7_1 = (1 == param2.b((byte) 44, 1));
          this.field_m = stackIn_7_1;
          stackIn_10_1 = (param2.b((byte) 44, 1) == 1);
          this.field_p = stackIn_10_1;
          this.field_c = param2.b((byte) 44, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("jma.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 == -2) {
          this.field_p = param1 ? true : false;
          return;
        }
        boolean discarded$3 = this.b(true);
        this.field_p = param1 ? true : false;
    }

    static {
        field_o = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_h = "Create unrated game";
    }
}
