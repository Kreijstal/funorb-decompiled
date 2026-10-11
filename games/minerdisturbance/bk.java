/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk {
    static String field_b;
    private ij[] field_a;
    private nm field_e;
    private sb field_d;
    private java.math.BigInteger field_f;
    private ee field_h;
    private java.math.BigInteger field_g;
    private ch field_c;

    final ij a(int param0, uh param1, boolean param2, int param3, uh param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ij var9 = null;
        byte[] var13 = null;
        ij stackIn_8_0 = null;
        ij stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d == null) {
            throw new RuntimeException();
          }
          if (param0 >= 0 &&
            param0 < this.field_a.length) {
            if (this.field_a[param0] != null) {
              stackIn_8_0 = this.field_a[param0];
              return stackIn_8_0;
            }
            this.field_d.field_o = 6 + 72 * param0;
            var6_int = this.field_d.b((byte) 76);
            var7 = this.field_d.b((byte) 33);
            var13 = new byte[64];
            this.field_d.a(var13, (byte) -120, param3, 64);
            var9 = new ij(param0, param1, param4, this.field_c, this.field_e, var6_int, var13, var7, param2);
            this.field_a[param0] = var9;
            stackIn_10_0 = var9;
            return stackIn_10_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("bk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    bk(ch param0, nm param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(byte param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        sb var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = MinerDisturbance.field_ab;
        if (null != this.field_d) {
          return true;
        }
        if (null == this.field_h) {
          if (this.field_c.d((byte) -111)) {
            return false;
          }
          this.field_h = this.field_c.a((byte) 0, -21, true, 255, 255);
        }
        if (this.field_h.field_C) {
          return false;
        }
        var10 = new sb(this.field_h.c((byte) -115));
        var10.field_o = 5;
        var3 = var10.d((byte) -54);
        var10.field_o = var10.field_o + var3 * 72;
        var13 = new byte[var10.field_u.length - var10.field_o];
        var11 = var13;
        var4 = var11;
        var10.a(var4, (byte) -120, 0, var13.length);
        if (this.field_g != null &&
          this.field_f != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_f);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = wb.a(-5 - var13.length + var10.field_o, 5, var10.field_u, 18738);
        if (param0 != 16) {
          this.field_c = (ch) null;
        }
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_d = var10;
        this.field_a = new ij[var3];
        return true;
    }

    public static void b(byte param0) {
        int var1 = -111 / ((param0 + 51) / 58);
        field_b = null;
    }

    final void a(int param0) {
        int var2;
        int var3;
        ij stackIn_12_0 = null;
        int var2Lifetime1;
        var3 = MinerDisturbance.field_ab;
        if (null == this.field_a) {
          return;
        }
        for (var2 = param0; var2 < this.field_a.length; var2++) {
          if (this.field_a[var2] != null) {
            this.field_a[var2].b((byte) 40);
          }
        }
        for (var2Lifetime1 = 0; this.field_a.length > var2Lifetime1; var2Lifetime1++) {
          stackIn_12_0 = this.field_a[var2Lifetime1];
          if (stackIn_12_0 != null) {
            this.field_a[var2Lifetime1].c(param0 ^ 0);
          }
        }
    }

    final static void a(byte param0, int param1) {
        try {
          IOException iOException = null;
          int var2 = 0;
          Throwable decompiledCaughtException = null;
          if (null != ci.field_i && (0 > param1 ||
            pb.field_c == qd.field_Q)) {
            var2 = -19 % ((-8 - param0) / 45);
            if (sn.field_c.field_o == 0 &&
              10000L + ck.field_d < sf.a((byte) 116)) {
              sn.field_c.d((byte) -69, param1);
            }
            if (sn.field_c.field_o > 0) {
              try {
                ci.field_i.a((byte) 124, sn.field_c.field_u, sn.field_c.field_o, 0);
                ck.field_d = sf.a((byte) 115);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                si.a(-95);
              }
              sn.field_c.field_o = 0;
            }
            return;
          }
          sn.field_c.field_o = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private bk(ch param0, nm param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_g = param2;
          this.field_c = param0;
          this.field_e = param1;
          this.field_f = param3;
          if (!this.field_c.d((byte) -111)) {
            this.field_h = this.field_c.a((byte) 0, -21, true, 255, 255);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "bk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Passwords can only contain letters and numbers";
    }
}
