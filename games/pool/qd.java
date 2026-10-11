/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    private rn field_j;
    static String[] field_h;
    private java.math.BigInteger field_c;
    private no field_i;
    static int field_k;
    private java.math.BigInteger field_l;
    private ge field_a;
    static int field_g;
    private sp field_d;
    static String field_e;
    private up[] field_f;
    static of field_b;

    final static boolean a(int param0, char param1) {
        boolean stackIn_9_0 = false;
        if (param0 != 0) {
          return false;
        }
        stackIn_9_0 = (param1 == 160) || (param1 == 32) || (param1 == 95) || (param1 == 45);
        return stackIn_9_0;
    }

    final up a(boolean param0, np param1, int param2, byte param3, np param4) {
        up stackIn_10_0 = null;
        up stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        up var9 = null;
        byte[] var13 = null;
        try {
          if (this.field_a == null) {
            throw new RuntimeException();
          }
          if (param2 >= 0 &&
            this.field_f.length > param2) {
            if (this.field_f[param2] != null) {
              stackIn_10_0 = this.field_f[param2];
              return stackIn_10_0;
            }
            this.field_a.field_v = 6 + param2 * 72;
            var6_int = this.field_a.b(true);
            var7 = this.field_a.b(true);
            var13 = new byte[64];
            this.field_a.a(0, (byte) -115, var13, 64);
            var9 = new up(param2, param1, param4, this.field_i, this.field_j, var6_int, var13, var7, param0);
            this.field_f[param2] = var9;
            if (param3 != 0) {
              this.field_j = (rn) null;
            }
            stackIn_14_0 = var9;
            return stackIn_14_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("qd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        up stackIn_18_0 = null;
        int var2Lifetime1;
        var3 = Pool.field_O;
        if (this.field_f == null) {
          return;
        }
        for (var2 = 0; this.field_f.length > var2; var2++) {
          if (this.field_f[var2] != null) {
            this.field_f[var2].c(param0 ^ -67);
          }
        }
        if (param0 != -46) {
          return;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_f.length; var2Lifetime1++) {
          if (null != this.field_f[var2Lifetime1]) {
            stackIn_18_0 = this.field_f[var2Lifetime1];
            ((up) (Object) stackIn_18_0).c((byte) 7);
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        int var1 = 127 % ((param0 - 15) / 58);
        field_e = null;
    }

    qd(no param0, rn param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        int var7 = 0;
        ge stackIn_13_0 = null;
        ge stackIn_13_1 = null;
        sp stackIn_13_2 = null;
        ge stackIn_14_0 = null;
        ge stackIn_14_1 = null;
        boolean stackIn_14_3 = false;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        ge var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Pool.field_O;
        if (!param0) {
          qd.a((byte) 17, -69);
        }
        if (null != this.field_a) {
          return true;
        }
        if (null == this.field_d) {
          if (this.field_i.b((byte) -125)) {
            return false;
          }
          this.field_d = this.field_i.a(255, 255, (byte) 0, true, -154018400);
        }
        if (this.field_d.field_F) {
          return false;
        }
        stackIn_13_0 = null;
        stackIn_13_1 = null;
        stackIn_13_2 = this.field_d;
        if (param0) {
          stackIn_14_0 = null;
          stackIn_14_1 = null;
          stackIn_14_3 = false;
        } else {
          stackIn_14_0 = null;
          stackIn_14_1 = null;
          stackIn_14_3 = true;
        }
        var10 = new ge(((sp) (Object) stackIn_13_2).b(stackIn_14_3));
        var10.field_v = 5;
        var3 = var10.g(-62);
        var10.field_v = var10.field_v + var3 * 72;
        var13 = new byte[-var10.field_v + var10.field_t.length];
        var11 = var13;
        var4 = var11;
        var10.a(0, (byte) -125, var4, var13.length);
        if (this.field_c != null &&
          null != this.field_l) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_c, this.field_l);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = jr.a(var10.field_v + (-var13.length - 5), (byte) -121, var10.field_t, 5);
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_f = new up[var3];
        this.field_a = var10;
        return true;
    }

    final static void a(byte param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        int var3 = -32 / ((param0 - 16) / 57);
        var2.field_v = var2.field_v + 1;
        int var4 = var2.field_v;
        var2.a(2, false);
        var2.a(md.field_c, (byte) 0, 0, md.field_c.length);
        var2.a(pm.field_l, false);
        var2.a(mc.field_l, false);
        var2.a(ka.field_s, (byte) 0, 0, ka.field_s.length);
        var2.b(var2.field_v - var4, true);
    }

    private qd(no param0, rn param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_c = param2;
          this.field_j = param1;
          this.field_i = param0;
          this.field_l = param3;
          if (!this.field_i.b((byte) -125)) {
            this.field_d = this.field_i.a(255, 255, (byte) 0, true, -154018400);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Quit";
        field_g = 0;
        field_k = -1;
        field_h = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
