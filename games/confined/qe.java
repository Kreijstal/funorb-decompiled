/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qe extends am {
    private boolean field_L;
    private boolean field_P;
    private int field_K;
    static nf[] field_O;
    private int field_R;
    private int field_M;
    static nf field_J;
    static int field_Q;
    private int field_N;

    final void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        try {
          if (param0 > -18) {
            field_O = (nf[]) null;
          }
          super.a(-26, param1, param2, param3, param4, param5);
          this.field_o = 0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qe.K(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            this.field_K = 39;
          }
          if (this.a((byte) -13, param1, param2, param0)) {
            this.a(param0, param2, (byte) -63, param1);
            this.a(param2, 3803, param0, param1);
            discarded$62 = param0.append(" revert=").append(this.field_L);
            if (this.field_M != 2147483647 &&
              this.field_K != 2147483647) {
              discarded$63 = param0.append(" to ").append(this.field_M).append(',').append(this.field_K);
            }
          }
          stackIn_9_0 = (StringBuilder) (param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("qe.O(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_P) {
            return true;
          }
          if (!this.a(param1, (byte) 125, param0, param5, param3)) {
            stackIn_6_0 = var8_int;
            return stackIn_6_0 != 0;
          }
          this.field_o = param6;
          if (param6 != 1) {
            return true;
          }
          this.field_N = param1 - this.field_q - param0;
          this.field_R = -param3 + (-this.field_m + param5);
          rk.field_k = this;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("qe.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 != 44) {
          return;
        }
        field_J = null;
        field_O = null;
    }

    private qe(int param0, int param1, int param2, int param3, fe param4, uk param5, fj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_M = 2147483647;
        this.field_K = 2147483647;
        try {
          this.field_H = param6;
          this.field_P = param8 ? true : false;
          this.field_L = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qe.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(fj param0, int param1, int param2, int param3) {
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_17_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_H instanceof rg) ||
            ((rg) (this.field_H)).field_L) &&
            1 == this.field_o) {
            var5_int = ld.field_l + (-this.field_N - param2);
            var6 = -param3 - this.field_R + jh.field_R;
            if (this.field_q != var5_int ||
              var6 != this.field_m) {
              this.field_q = var5_int;
              this.field_m = var6;
              if (this.field_t instanceof wk) {
                ((wk) (this.field_t)).a(this, param3, -5428, param2);
              }
            }
          } else {
            if (this.field_L) {
              if (this.field_M != this.field_q) {
                var5_int = -this.field_q + this.field_M;
                stackIn_12_1 = this.field_q;
                if (2 < Math.abs(var5_int)) {
                  stackIn_13_2 = var5_int >> 1;
                } else {
                  if (var5_int <= 0) {
                    stackIn_13_2 = -1;
                  } else {
                    stackIn_13_2 = 1;
                  }
                }
                this.field_q = stackIn_12_1 + stackIn_13_2;
              }
              if (this.field_K != this.field_m) {
                var5_int = -this.field_m + this.field_K;
                stackIn_17_1 = this.field_m;
                if (Math.abs(var5_int) <= 2) {
                  if (0 < var5_int) {
                    stackIn_20_2 = 1;
                  } else {
                    stackIn_20_2 = -1;
                  }
                } else {
                  stackIn_20_2 = var5_int >> 1;
                }
                this.field_m = stackIn_17_1 + stackIn_20_2;
              }
            }
          }
          super.a(param0, param1 + 0, param2, param3);
          if (param1 == 11579568) {
            return;
          }
          field_J = (nf) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("qe.V(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(int param0) {
        super.f(-79);
        this.field_H.a(-110, this.field_F, 0, this.field_z, 0);
        if (param0 < -49) {
          this.field_M = this.field_q;
          this.field_K = this.field_m;
          return;
        }
        Hashtable var3 = (Hashtable) null;
        this.a((StringBuilder) null, 56, (Hashtable) null, true);
        this.field_M = this.field_q;
        this.field_K = this.field_m;
    }

    final static boolean a(byte param0, kg param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.c(param0 + 105);
          if (param0 != -73) {
            return false;
          }
          stackIn_6_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_6_0;
          stackIn_7_0 = var3;
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("qe.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }
}
