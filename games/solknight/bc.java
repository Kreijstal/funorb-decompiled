/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bc extends si {
    private boolean field_O;
    private int field_L;
    private int field_N;
    private boolean field_I;
    static nc field_J;
    private int field_M;
    private int field_H;
    static sf field_K;

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_O) {
            return true;
          }
          if (!this.a(param4, param3, param1, param5, -118)) {
            stackIn_11_0 = var8_int;
            return stackIn_11_0 != 0;
          }
          if (1 == param0) {
            jf.field_a = this;
            this.field_N = param3 - this.field_m - param1;
            this.field_L = param4 + (-this.field_j - param5);
          }
          this.field_u = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("bc.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_u = 0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "bc.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private bc(int param0, int param1, int param2, int param3, j param4, dg param5, rc param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_M = 2147483647;
        this.field_H = 2147483647;
        try {
          this.field_I = param7 ? true : false;
          this.field_O = param8 ? true : false;
          this.field_G = param6;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "bc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, int param2, rc param3) {
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var5_intLifetime1;
        int var5_intLifetime1Lifetime1;
        try {
          boolean decompiledFrameRemainder0 = true;
          if ((!(this.field_G instanceof pj) ||
            ((pj) (this.field_G)).field_B) &&
            this.field_u == 1) {
            var5_int = -this.field_N + (gb.field_j - param0);
            var6 = -this.field_L + (ad.field_m - param2);
            if ((var5_int != this.field_m ||
              var6 != this.field_j)) {
              this.field_m = var5_int;
              this.field_j = var6;
              if (!(!(this.field_n instanceof t))) {
                ((t) (this.field_n)).a(param0, (byte) 40, param2, this);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_I) {
              if (this.field_H != this.field_m) {
                var5_intLifetime1 = -this.field_m + this.field_H;
                stackIn_11_1 = this.field_m;
                if (Math.abs(var5_intLifetime1) > 2) {
                  stackIn_12_2 = var5_intLifetime1 >> 1;
                } else {
                  if (var5_intLifetime1 > 0) {
                    stackIn_12_2 = 1;
                  } else {
                    stackIn_12_2 = -1;
                  }
                }
                this.field_m = stackIn_11_1 + stackIn_12_2;
              }
              if (this.field_M != this.field_j) {
                var5_intLifetime1Lifetime1 = -this.field_j + this.field_M;
                stackIn_19_1 = this.field_j;
                if (Math.abs(var5_intLifetime1Lifetime1) > 2) {
                  stackIn_20_2 = var5_intLifetime1Lifetime1 >> 1;
                } else {
                  if (var5_intLifetime1Lifetime1 > 0) {
                    stackIn_20_2 = 1;
                  } else {
                    stackIn_20_2 = -1;
                  }
                }
                this.field_j = stackIn_19_1 + stackIn_20_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("bc.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        if (param0) {
          return;
        }
        field_K = null;
        field_J = null;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -41) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param2, -1, param1, param3)) {
            this.b(param2, -119, param1, param3);
            this.a(param1, param2, param3, -19156);
            discarded$62 = param2.append(" revert=").append(this.field_I);
            if (2147483647 != this.field_H &&
              this.field_M != 2147483647) {
              discarded$63 = param2.append(" to ").append(this.field_H).append(',').append(this.field_M);
            }
          }
          stackIn_10_0 = (StringBuilder) (param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("bc.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0) {
        super.a(-123);
        this.field_G.b(this.field_x, this.field_t, 0, 0, 0);
        this.field_H = this.field_m;
        if (param0 < -102) {
          this.field_M = this.field_j;
          return;
        }
    }

    static {
        field_J = new nc();
        field_K = new sf(1);
    }
}
