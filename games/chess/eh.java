/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class eh extends ma {
    private fm field_Q;
    static int[] field_L;
    static dm field_K;
    boolean field_P;
    static jc field_R;
    private int field_N;
    static ci field_M;
    static java.util.zip.CRC32 field_O;

    abstract void b(int param0, int param1, int param2);

    boolean g(byte param0) {
        boolean stackIn_8_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_39_0 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_59_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 > -4) {
          field_M = (ci) null;
          var2 = this.h(0);
          var3 = var2 - this.field_N;
          if (var3 <= 0) {
            if (var3 < 0) {
              this.field_N = this.field_N + (-15 + var3) / 16;
              if (0 != this.field_N) {
                return false;
              }
              if (0 != var2) {
                return false;
              }
              stackIn_15_0 = !(this.field_P);
              return stackIn_15_0;
            }
            stackIn_8_0 = (0 == this.field_N) && (0 == var2) && (!this.field_P);
            return stackIn_8_0;
          }
          this.field_N = this.field_N + (-1 + (8 + var3)) / 8;
          if (var3 >= 0) {
            stackIn_30_0 = (0 == this.field_N) && (0 == var2) && (!this.field_P);
            return stackIn_30_0;
          }
          this.field_N = this.field_N + (-15 + var3) / 16;
          stackIn_24_0 = (0 == this.field_N) && (0 == var2) && (!this.field_P);
          return stackIn_24_0;
        }
        var2Lifetime1 = this.h(0);
        var3Lifetime1 = var2Lifetime1 - this.field_N;
        if (var3Lifetime1 <= 0) {
          if (var3Lifetime1 >= 0) {
            stackIn_53_0 = (0 == this.field_N) && (0 == var2Lifetime1) && (!this.field_P);
            return stackIn_53_0;
          }
          this.field_N = this.field_N + (-15 + var3Lifetime1) / 16;
          stackIn_59_0 = (0 == this.field_N) && (0 == var2Lifetime1) && (!this.field_P);
          return stackIn_59_0;
        }
        this.field_N = this.field_N + (-1 + (8 + var3Lifetime1)) / 8;
        if (var3Lifetime1 >= 0) {
          stackIn_39_0 = (0 == this.field_N) && (0 == var2Lifetime1) && (!this.field_P);
          return stackIn_39_0;
        }
        this.field_N = this.field_N + (-15 + var3Lifetime1) / 16;
        stackIn_45_0 = (0 == this.field_N) && (0 == var2Lifetime1) && (!this.field_P);
        return stackIn_45_0;
    }

    boolean a(int param0) {
        this.field_N = this.h(0);
        if (param0 <= 46) {
          eh.i(-44);
          if (0 != this.field_N) {
            return false;
          }
          if (!this.field_P) {
            return true;
          }
          return false;
        }
        if (0 != this.field_N) {
          return false;
        }
        if (!this.field_P) {
          return true;
        }
        return false;
    }

    final void a(int param0, byte param1, int param2) {
        this.a(e.field_O - param2 >> 1, 34, param2, param0, hk.field_I - param0 >> 1);
        if (param1 < 70) {
          this.field_P = false;
        }
    }

    public static void i(int param0) {
        field_K = null;
        field_M = null;
        field_O = null;
        field_R = null;
        field_L = null;
        if (param0 != 888706465) {
          field_M = (ci) null;
        }
    }

    eh(fm param0, int param1, int param2) {
        super(-param1 + hk.field_I >> 1, e.field_O - param2 >> 1, param1, param2, (jm) null);
        try {
          this.field_N = 0;
          this.field_P = false;
          this.field_Q = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "eh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$7 = 0;
        int discarded$6 = 0;
        if (this.field_N == 0) {
          return;
        }
        if (this.field_N >= 256) {
          if (param1 != 0) {
            return;
          }
          this.b(-14239, this.field_r + param0, this.field_u + param3);
          super.a(param0, param1, -122, param3);
          return;
        }
        if (null == ud.field_c) {
          ud.field_c = new km(this.field_y, this.field_C);
          tl.a((byte) -67, ud.field_c);
          wb.b();
          this.b(-14239, 0, 0);
          if (param2 < -80) {
            super.a(-param0 - this.field_r, param1, -105, -this.field_u - param3);
            fd.a(28773);
            ud.field_c.b(param3 + this.field_u, this.field_r + param0, this.field_N);
            return;
          }
          discarded$4 = this.h(125);
          super.a(-param0 - this.field_r, param1, -105, -this.field_u - param3);
          fd.a(28773);
          ud.field_c.b(param3 + this.field_u, this.field_r + param0, this.field_N);
          return;
        }
        if (this.field_y > ud.field_c.field_w) {
          ud.field_c = new km(this.field_y, this.field_C);
          tl.a((byte) -67, ud.field_c);
          wb.b();
          this.b(-14239, 0, 0);
          if (param2 < -80) {
            super.a(-param0 - this.field_r, param1, -105, -this.field_u - param3);
            fd.a(28773);
            ud.field_c.b(param3 + this.field_u, this.field_r + param0, this.field_N);
            return;
          }
          discarded$5 = this.h(125);
          super.a(-param0 - this.field_r, param1, -105, -this.field_u - param3);
          fd.a(28773);
          ud.field_c.b(param3 + this.field_u, this.field_r + param0, this.field_N);
          return;
        }
        if (this.field_C <= ud.field_c.field_t) {
          tl.a((byte) -67, ud.field_c);
          wb.b();
          this.b(-14239, 0, 0);
          if (param2 < -80) {
            super.a(-param0 - this.field_r, param1, -105, -this.field_u - param3);
            fd.a(28773);
            ud.field_c.b(param3 + this.field_u, this.field_r + param0, this.field_N);
            return;
          }
          discarded$7 = this.h(125);
          super.a(-param0 - this.field_r, param1, -105, -this.field_u - param3);
          fd.a(28773);
          ud.field_c.b(param3 + this.field_u, this.field_r + param0, this.field_N);
          return;
        }
        ud.field_c = new km(this.field_y, this.field_C);
        tl.a((byte) -67, ud.field_c);
        wb.b();
        this.b(-14239, 0, 0);
        if (param2 < -80) {
          super.a(-param0 - this.field_r, param1, -105, -this.field_u - param3);
          fd.a(28773);
          ud.field_c.b(param3 + this.field_u, this.field_r + param0, this.field_N);
          return;
        }
        discarded$6 = this.h(125);
        super.a(-param0 - this.field_r, param1, -105, -this.field_u - param3);
        fd.a(28773);
        ud.field_c.b(param3 + this.field_u, this.field_r + param0, this.field_N);
        return;
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 >= param2) {
            throw new IllegalArgumentException();
          }
          if (ua.a(param2, 14)) {
            stackIn_5_0 = (int)((long)param2 * ((long)param1.nextInt() & 4294967295L) >> 32);
            return stackIn_5_0;
          }
          if (param0 != 28207) {
            field_R = (jc) null;
          }
          var3_int = -(int)(4294967296L % (long)param2) + -2147483648;
          do {
            var4 = param1.nextInt();
          } while (var3_int <= var4);
          stackIn_12_0 = am.a(var4, param2, (byte) -40);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("eh.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final mf e(byte param0) {
        mf var2 = super.e(param0);
        if (var2 != null) {
          return var2;
        }
        return (mf) (this);
    }

    private final int h(int param0) {
        if (param0 == 0) {
          return !this.field_P ? 0 : this == this.field_Q.k(-127) ? 256 : 0;
        }
        field_M = (ci) null;
        return !this.field_P ? 0 : this == this.field_Q.k(-127) ? 256 : 0;
    }

    static {
        field_K = null;
        field_R = new jc();
        field_O = new java.util.zip.CRC32();
    }
}
