/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends ka {
    static int field_w;
    static String field_v;
    static int field_t;
    static String field_x;
    private int field_s;
    private na field_u;

    public static void i(int param0) {
        field_x = null;
        int var1 = 85 % ((param0 - 44) / 60);
        field_v = null;
    }

    final int h(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 == -9) {
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          return 255 & this.field_r[fieldTemp$0] - this.field_u.a(-609392408);
        }
        field_x = (String) null;
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        return 255 & this.field_r[fieldTemp$1] - this.field_u.a(-609392408);
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        try {
          if (!param1) {
            this.field_u = (na) null;
          }
          for (var5_int = 0; param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            param0[param2 + var5_int] = (byte)(this.field_r[fieldTemp$0] - this.field_u.a(-609392408));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ha.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$0] = (byte)(this.field_u.a(param1 - 609393358) + param0);
        if (param1 != 950) {
          this.f(-75, 25);
        }
    }

    final void a(int[] param0, int param1) {
        try {
          if (param1 != -1001) {
            field_w = -27;
          }
          this.field_u = new na(param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ha.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.math.BigInteger param0, ka param1, ka param2, int param3, java.math.BigInteger param4) {
        try {
          if (param3 >= -94) {
            ha.k(109);
          }
          rl.a(-13791, param1, param0, param4, param2.field_r, param2.field_k, 0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ha.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static int k(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = stellarshard.field_B;
        try {
          if (param0 != -1001) {
            ha.k(28);
          }
          for (var1_int = 0; var1_int < 1000; var1_int++) {
            if (null == hf.field_e[var1_int]) {
              stackIn_8_0 = var1_int;
              return stackIn_8_0;
            }
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "ha.F(" + param0 + ')');
        }
    }

    final int e(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = stellarshard.field_B;
        int var3 = this.field_s >> 3;
        int var4 = -(this.field_s & 7) + param1;
        this.field_s = this.field_s + param0;
        int var5 = 0;
        while (param0 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((hd.field_d[var4] & this.field_r[incrementValue$0]) << -var4 + param0);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (param0 == var4) {
          var5 = var5 + (hd.field_d[var4] & this.field_r[var3]);
        } else {
          var5 = var5 + (this.field_r[var3] >> var4 - param0 & hd.field_d[param0]);
        }
        return var5;
    }

    ha(byte[] param0) {
        super(param0);
    }

    final void g(byte param0) {
        int var2 = 47 % ((-50 - param0) / 57);
        this.field_k = (this.field_s + 7) / 8;
    }

    ha(int param0) {
        super(param0);
    }

    final void j(int param0) {
        this.field_s = param0 * this.field_k;
    }

    static {
        field_x = "Phase shield";
        field_v = "Try again";
    }
}
