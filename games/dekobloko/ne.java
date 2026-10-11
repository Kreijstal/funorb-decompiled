/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    private le[] field_h;
    private wl field_a;
    static byte[] field_c;
    private im field_f;
    static String field_b;
    static String field_d;
    private pj field_j;
    private dd field_i;
    private java.math.BigInteger field_g;
    private java.math.BigInteger field_e;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
          field_c = (byte[]) null;
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param0 != 255) {
          return -17;
        }
        return qm.a((byte) 57);
    }

    final boolean a(boolean param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        wl var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = client.field_A ? 1 : 0;
        if (null != this.field_a) {
          return true;
        }
        if (null == this.field_j) {
          if (this.field_i.a(true)) {
            return false;
          }
          this.field_j = this.field_i.a(true, (byte) 0, param0, 255, 255);
        }
        if (this.field_j.field_z) {
          return false;
        }
        var10 = new wl(this.field_j.g((byte) 113));
        var10.field_n = 5;
        var3 = var10.d((byte) -69);
        var10.field_n = var10.field_n + var3 * 72;
        var13 = new byte[-var10.field_n + var10.field_r.length];
        var11 = var13;
        var4 = var11;
        var10.a(var4, 0, (byte) 125, var13.length);
        if (!param0) {
          return true;
        }
        if (this.field_e != null &&
          null != this.field_g) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_e, this.field_g);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = um.a(0, var10.field_r, 5, var10.field_n - (var13.length + 5));
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_h = new le[var3];
        this.field_a = var10;
        return true;
    }

    final le a(byte param0, int param1, kh param2, kh param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        le var10 = null;
        byte[] var14 = null;
        le stackIn_9_0 = null;
        le stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_a == null) {
            throw new RuntimeException();
          }
          if (0 <= param1 &&
            this.field_h.length > param1) {
            if (this.field_h[param1] != null) {
              stackIn_9_0 = this.field_h[param1];
              return stackIn_9_0;
            }
            this.field_a.field_n = param1 * 72 + 6;
            var7 = 10 / ((-41 - param0) / 42);
            var6_int = this.field_a.i(7553);
            var8 = this.field_a.i(7553);
            var14 = new byte[64];
            this.field_a.a(var14, 0, (byte) 127, 64);
            var10 = new le(param1, param2, param3, this.field_i, this.field_f, var6_int, var14, var8, param4);
            this.field_h[param1] = var10;
            stackIn_11_0 = var10;
            return stackIn_11_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("ne.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void e(int param0) {
        wj.q(114);
        if (param0 != -5) {
          field_c = (byte[]) null;
        }
        vb.field_Z = true;
        tj.field_Vb = true;
        ah.field_c.c(true);
        wi.a(false, param0 ^ 49, ak.field_g);
    }

    final static java.awt.Canvas d(int param0) {
        if (param0 > -25) {
          ne.a((byte) 18);
        }
        return null != cl.field_v ? (java.awt.Canvas) ((Object) cl.field_v) : jh.field_b;
    }

    ne(dd param0, im param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static boolean b(int param0) {
        if (param0 != -18163) {
          return true;
        }
        if (!jg.field_i) {
          return false;
        }
        if (0 != pk.field_r) {
          return false;
        }
        return true;
    }

    final static int b(byte param0) {
        if (param0 != -40) {
          ne.b(-2);
        }
        return pf.field_g;
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = client.field_A ? 1 : 0;
        if (this.field_h == null) {
          return;
        }
        for (var2 = 0; var2 < this.field_h.length; var2++) {
          if (this.field_h[var2] != null) {
            this.field_h[var2].b(16322);
          }
        }
        var2Lifetime1 = 0;
        if (param0 > -106) {
          return;
        }
        while (var2Lifetime1 < this.field_h.length) {
          if (null != this.field_h[var2Lifetime1]) {
            this.field_h[var2Lifetime1].c(true);
          }
          var2Lifetime1++;
        }
    }

    final static void c(int param0) {
        wc.field_n = false;
        wl.field_p = 0 == de.field_V.d((byte) -96) ? true : false;
        if (param0 != 27721) {
          ne.a((byte) 94);
        }
    }

    private ne(dd param0, im param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_f = param1;
          this.field_e = param2;
          this.field_g = param3;
          this.field_i = param0;
          if (!this.field_i.a(true)) {
            this.field_j = this.field_i.a(true, (byte) 0, true, 255, 255);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ne.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_d = "Waiting for fonts";
        field_b = "Achieved";
    }
}
