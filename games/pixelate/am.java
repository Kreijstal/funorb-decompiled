/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    private we field_d;
    static int[] field_i;
    private gm field_a;
    private java.math.BigInteger field_f;
    private gg[] field_h;
    static boolean field_e;
    static int[] field_b;
    private java.math.BigInteger field_k;
    private rf field_j;
    private rj field_g;
    static int field_c;

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        if (param0 >= -120) {
          field_c = -67;
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          if (param0 != -7749) {
            field_b = (int[]) null;
          }
          param1.removeKeyListener(mc.field_r);
          param1.removeFocusListener(mc.field_r);
          ol.field_q = -1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "am.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(fm param0, boolean param1, fm param2) {
        pb.field_n = param0;
        if (!param1) {
          return;
        }
        try {
          kf.field_p = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "am.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        int var2;
        ak stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        ak stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        ak stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        ak stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        hp.a(t.field_j - 640 >> 1, t.field_d, 640 + t.field_j >> 1, (byte) -91, 0);
        if (oo.field_b > 0) {
          if (jo.field_j != null) {
            jo.field_j.f(ql.field_n.field_D, 0);
          }
          stackIn_8_0 = ql.field_n;
          stackIn_9_1 = (param1) && (!uj.field_Wb);
          ((ak) (Object) stackIn_8_0).a(stackIn_9_1, 0);
          stackIn_12_0 = ti.field_E;
          stackIn_13_1 = (param1) && (!uj.field_Wb);
          ((ak) (Object) stackIn_12_0).a(stackIn_13_1, 0);
        }
        if (!(vn.field_g <= 0) ||
          !(h.field_W <= 0)) {
          if (jo.field_j != null) {
            jo.field_j.f(ff.field_h.field_D, 0);
          }
          stackIn_23_0 = ff.field_h;
          stackIn_24_1 = (param1) && (!bm.field_o);
          ((ak) (Object) stackIn_23_0).a(stackIn_24_1, 0);
          stackIn_27_0 = ai.field_A;
          stackIn_28_1 = (param1) && (!bm.field_o);
          ((ak) (Object) stackIn_27_0).a(stackIn_28_1, 0);
        }
        var2 = 127 / ((param0 + 31) / 55);
        ia.a((byte) 92);
    }

    final static void b(int param0) {
        if (param0 < 10) {
          field_e = true;
        }
    }

    final gg a(boolean param0, int param1, int param2, rn param3, rn param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        gg var9 = null;
        byte[] var13 = null;
        gg stackIn_10_0 = null;
        gg stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d == null) {
            throw new RuntimeException();
          }
          if (param2 >= 0 &&
            param2 < this.field_h.length) {
            if (null != this.field_h[param2]) {
              stackIn_10_0 = this.field_h[param2];
              return stackIn_10_0;
            }
            this.field_d.field_m = param1 + 72 * param2;
            var6_int = this.field_d.k(0);
            var7 = this.field_d.k(param1 - 6);
            var13 = new byte[64];
            this.field_d.a(var13, 0, -86, 64);
            var9 = new gg(param2, param4, param3, this.field_j, this.field_a, var6_int, var13, var7, param0);
            this.field_h[param2] = var9;
            stackIn_12_0 = var9;
            return stackIn_12_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("am.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (rj.field_F == tm.field_X) {
          return pm.field_s;
        }
        if (param0 != -13565) {
          field_i = (int[]) null;
        }
        return kd.field_a;
    }

    am(rf param0, gm param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = Pixelate.field_H ? 1 : 0;
        if (null == this.field_h) {
          return;
        }
        if (param0 != -2) {
          return;
        }
        for (var2 = 0; var2 < this.field_h.length; var2++) {
          if (null != this.field_h[var2]) {
            this.field_h[var2].f((byte) 29);
          }
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (var4 < this.field_h.length) {
          if (this.field_h[var4] != null) {
            this.field_h[var4].b(0);
          }
          var4++;
        }
        return;
    }

    private am(rf param0, gm param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
          this.field_k = param3;
          this.field_j = param0;
          this.field_a = param1;
          this.field_f = param2;
          if (!this.field_j.a(20)) {
            this.field_g = this.field_j.a((byte) -31, 255, true, 255, (byte) 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("am.<init>(");
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        we var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Pixelate.field_H ? 1 : 0;
        if (this.field_d != null) {
          return true;
        }
        if (this.field_g == null) {
          if (this.field_j.a(param0 ^ 32047)) {
            return false;
          }
          this.field_g = this.field_j.a((byte) -31, 255, true, 255, (byte) 0);
        }
        if (this.field_g.field_v) {
          return false;
        }
        var10 = new we(this.field_g.h(0));
        var10.field_m = 5;
        var3 = var10.f(255);
        var10.field_m = var10.field_m + 72 * var3;
        var13 = new byte[var10.field_k.length - var10.field_m];
        var11 = var13;
        var4 = var11;
        var10.a(var4, 0, -79, var13.length);
        if (null != this.field_f &&
          this.field_k != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_f, this.field_k);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = db.a(var10.field_k, 5, 1761872464, -var13.length + var10.field_m - 5);
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        if (param0 != 32059) {
          return true;
        }
        this.field_d = var10;
        this.field_h = new gg[var3];
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param2 == 0 &&
          param0 != io.field_e) {
          io.field_e = param0;
          si.field_P = true;
          ro.a(param3, true);
        }
        if (param2 == 1 &&
          gh.field_v != param0) {
          si.field_P = true;
          gh.field_v = param0;
          ro.a(param3, true);
        }
        if (2 == param2 &&
          param0 != ib.field_e) {
          si.field_P = true;
          ib.field_e = param0;
          ro.a(param3, true);
        }
        if (param1 != -26931) {
          am.a((byte) -107);
        }
    }

    static {
        ol.e(2071);
        field_c = 50;
    }
}
