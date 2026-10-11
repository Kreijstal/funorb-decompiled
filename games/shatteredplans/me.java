/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me {
    static bi field_h;
    static boolean field_a;
    static String field_c;
    fs[] field_i;
    static qr field_d;
    fs[] field_g;
    static String field_f;
    static boolean field_j;
    static int field_e;
    private boolean[] field_b;

    abstract int b(boolean param0);

    abstract void a(ob param0, byte param1);

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 < 19) {
          field_e = 28;
        }
        stackIn_6_0 = (qh.f(29443)) && (0 == (8 & cl.field_n));
        return stackIn_6_0;
    }

    abstract fs[] b(int param0);

    public static void a(boolean param0) {
        field_d = null;
        field_f = null;
        if (!param0) {
          field_h = (bi) null;
        }
        field_h = null;
        field_c = null;
    }

    boolean a(dc param0, byte param1) {
        int var7 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        fs[] var5_ref_fs__ = null;
        int var5 = 0;
        int var6 = 0;
        fs var7_ref_fs = null;
        int var8 = 0;
        int var9 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var5Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = null;
          var5_ref_fs__ = this.field_i;
          if (param1 < 23) {
            return true;
          }
          for (var6 = 0; var5_ref_fs__.length > var6; var6++) {
            var7_ref_fs = var5_ref_fs__[var6];
            if (!var7_ref_fs.field_i.g(-96)) {
              var3_int++;
              var4 = var7_ref_fs;
            }
          }
          if (var3_int != 0) {
            if (var3_int == 1) {
              this.field_g = new fs[]{(fs) (var4)};
              return true;
            }
            var9 = 0;
            var5 = var9;
            while (this.field_i.length > var9) {
              if (!this.field_i[var9].field_i.g(88)) {
                this.field_b[var9] = true;
              } else {
                this.field_b[var9] = false;
              }
              var9++;
            }
            return false;
          }
          var5Lifetime1 = 0;
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_i.length; var6Lifetime1++) {
            if (this.field_b[var6Lifetime1] &&
              (param0.field_f & 1 << var6Lifetime1) == 0) {
              var5Lifetime1++;
            }
          }
          if (0 >= var5Lifetime1) {
            return true;
          }
          this.field_g = new fs[var5Lifetime1];
          var6Lifetime2 = 0;
          for (var7 = 0; var7 < this.field_i.length; var7++) {
            if (this.field_b[var7] &&
              (1 << var7 & param0.field_f) == 0) {
              this.field_g[var6Lifetime2] = this.field_i[var7];
              var6Lifetime2++;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("me.F(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(byte param0, fs param1) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        fs[] var4 = null;
        fs var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_g == null) {
            return false;
          }
          var3_int = 75 / ((9 - param0) / 56);
          var4 = this.field_g;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (param1 == var6) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("me.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    abstract void a(int param0, ob param1);

    final fs[] a(byte param0) {
        if (param0 != -23) {
          byte[] var3 = (byte[]) null;
          me.a(-73, (byte[]) null, -98);
        }
        return this.field_g;
    }

    abstract void a(byte param0, dc param1, kq param2);

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 50) {
            var4 = (byte[]) null;
            me.a(-118, (byte[]) null, -21);
          }
          stackIn_3_0 = bs.a(param2, param1, (byte) -53, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("me.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    me(fs[] param0) {
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_i = param0;
          this.field_b = new boolean[param0.length];
          for (var2_int = 0; this.field_b.length > var2_int; var2_int++) {
            this.field_b[var2_int] = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("me.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_a = false;
        field_c = "No Achievement";
        field_f = "Amount of wasted research data.";
    }
}
