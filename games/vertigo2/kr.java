/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr {
    private ed field_d;
    private java.math.BigInteger field_i;
    private uk[] field_b;
    private t field_a;
    static jj field_g;
    private ia field_e;
    private tk field_f;
    static byte[] field_c;
    private java.math.BigInteger field_h;

    public static void c(int param0) {
        field_c = null;
        if (param0 != 5) {
          String var2 = (String) null;
          kr.a((String) null, (byte) 54);
        }
        field_g = null;
    }

    final void d(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (this.field_b == null) {
          return;
        }
        if (param0 <= 33) {
          return;
        }
        for (var2 = 0; this.field_b.length > var2; var2++) {
          if (this.field_b[var2] != null) {
            this.field_b[var2].c((byte) -94);
          }
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_b.length; var2Lifetime1++) {
          if (null != this.field_b[var2Lifetime1]) {
            this.field_b[var2Lifetime1].b(104);
          }
        }
    }

    final uk a(int param0, qh param1, boolean param2, int param3, qh param4) {
        uk stackIn_10_0 = null;
        uk stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        uk var9 = null;
        byte[] var13 = null;
        try {
          if (null == this.field_d) {
            throw new RuntimeException();
          }
          if (param3 >= 0 &&
            param3 < this.field_b.length) {
            if (null != this.field_b[param3]) {
              stackIn_10_0 = this.field_b[param3];
              return stackIn_10_0;
            }
            this.field_d.field_u = param3 * 72 + 6;
            var6_int = this.field_d.b(true);
            var7 = this.field_d.b(true);
            var13 = new byte[64];
            this.field_d.a(0, var13, 64, 67);
            var9 = new uk(param3, param4, param1, this.field_f, this.field_a, var6_int, var13, var7, param2);
            if (param0 != 18162) {
              kr.a((byte) -3);
            }
            this.field_b[param3] = var9;
            stackIn_14_0 = var9;
            return stackIn_14_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("kr.F(").append(param0).append(',');
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
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        an.a(1, param0);
        if (param1 > -3) {
          return;
        }
        try {
          fi.a(31820, false, gn.field_a);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "kr.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static u[] a(byte param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        u[] var1 = new u[eo.field_m];
        for (var2 = 0; eo.field_m > var2; var2++) {
          var1[var2] = new u(ql.field_M, vj.field_c, ca.field_a[var2], pc.field_a[var2], mh.field_c[var2], vi.field_w[var2], se.field_y[var2], in.field_c);
        }
        la.a((byte) 17);
        if (param0 >= -19) {
          kr.a((byte) 26);
        }
        return var1;
    }

    final static void a(int param0) {
        kd.field_x = va.field_s.a(1, sl.field_q[20]);
        int var1 = va.field_s.a(1, sl.field_q[21]);
        if (!(kd.field_x >= var1)) {
          kd.field_x = var1;
        }
        if (param0 != -3645) {
          kr.a(85);
        }
    }

    kr(tk param0, t param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private kr(tk param0, t param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_f = param0;
          this.field_i = param2;
          this.field_a = param1;
          this.field_h = param3;
          if (!this.field_f.a(20)) {
            this.field_e = this.field_f.a(255, 255, true, (byte) 0, false);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "kr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        int var8 = 0;
        int var3;
        byte[] var4;
        int var5;
        byte[] var6;
        java.math.BigInteger var8_ref_java_math_BigInteger;
        int var9;
        ed var11;
        byte[] var12;
        java.math.BigInteger var13;
        byte[] var14;
        byte[] var16;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (this.field_d != null) {
          return true;
        }
        if (null == this.field_e) {
          if (this.field_f.a(20)) {
            return false;
          }
          this.field_e = this.field_f.a(255, 255, true, (byte) 0, false);
        }
        if (this.field_e.field_z) {
          return false;
        }
        var11 = new ed(this.field_e.a((byte) -106));
        var11.field_u = 5;
        var3 = var11.h(-11);
        var11.field_u = var11.field_u + var3 * 72;
        var5 = 13 % ((-4 - param0) / 48);
        var14 = new byte[var11.field_p.length - var11.field_u];
        var12 = var14;
        var4 = var12;
        var11.a(0, var4, var14.length, 61);
        if (null != this.field_i &&
          null != this.field_h) {
          var13 = new java.math.BigInteger(var14);
          var8_ref_java_math_BigInteger = var13.modPow(this.field_i, this.field_h);
          var6 = var8_ref_java_math_BigInteger.toByteArray();
        } else {
          var6 = var4;
        }
        if (var6.length != 65) {
          throw new RuntimeException();
        }
        var16 = de.a(5, (byte) -110, var11.field_u - var14.length - 5, var11.field_p);
        for (var8 = 0; var8 < 64; var8++) {
          if (var6[var8 + 1] != var16[var8]) {
            throw new RuntimeException();
          }
        }
        this.field_d = var11;
        this.field_b = new uk[var3];
        return true;
    }

    static {
    }
}
