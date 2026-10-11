/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aj extends jh {
    private boolean field_H;
    private int field_K;
    private int field_G;
    private int field_I;
    private boolean field_F;
    static float field_E;
    static int field_J;
    private int field_D;

    final static void a(int param0) {
        if (param0 != 2) {
          return;
        }
        od.b(128, 17);
    }

    final void a(int param0, gm param1, int param2, int param3) {
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var5_intLifetime1;
        try {
          if ((!(this.field_C instanceof lg) ||
            ((lg) (this.field_C)).field_x) &&
            this.field_l == 1) {
            var5_int = n.field_t - this.field_K - param3;
            var6 = k.field_e + (-this.field_G - param2);
            if (this.field_w != var5_int ||
              this.field_k != var6) {
              this.field_k = var6;
              this.field_w = var5_int;
              if (this.field_t instanceof sj) {
                ((sj) (this.field_t)).a(param2, this, (byte) -83, param3);
              }
            }
          } else {
            if (this.field_H) {
              if (this.field_w != this.field_D) {
                var5_int = this.field_D - this.field_w;
                stackIn_9_1 = this.field_w;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int > 0) {
                    stackIn_12_2 = 1;
                  } else {
                    stackIn_12_2 = -1;
                  }
                } else {
                  stackIn_12_2 = var5_int >> 1;
                }
                this.field_w = stackIn_9_1 + stackIn_12_2;
              }
              if (this.field_k != this.field_I) {
                var5_int = -this.field_k + this.field_I;
                stackIn_18_1 = this.field_k;
                if (Math.abs(var5_int) > 2) {
                  stackIn_19_2 = var5_int >> 1;
                } else {
                  if (var5_int > 0) {
                    stackIn_19_2 = 1;
                  } else {
                    stackIn_19_2 = -1;
                  }
                }
                this.field_k = stackIn_18_1 + stackIn_19_2;
              }
            }
          }
          var5_intLifetime1 = -58 / ((param0 + 28) / 43);
          super.a(-71, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("aj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        super.a(param0, param1, param2, (byte) 124, param4, param5);
        if (param3 < 109) {
          return;
        }
        try {
          this.field_l = 0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "aj.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        StringBuilder discarded$70 = null;
        StringBuilder discarded$71 = null;
        RuntimeException var5 = null;
        gm var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 117) {
            var6 = (gm) null;
            this.a(68, -37, 53, -107, -120, (gm) null, (byte) 32);
          }
          if (this.a(param1 ^ -31757, param0, param2, param3)) {
            this.a(param0, param3, true, param2);
            this.a(param3, param2, param0, param1 ^ -16410);
            discarded$70 = param0.append(" revert=").append(this.field_H);
            if (2147483647 != this.field_D &&
              this.field_I != 2147483647) {
              discarded$71 = param0.append(" to ").append(this.field_D).append(',').append(this.field_I);
            }
          }
          stackIn_8_0 = (StringBuilder) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("aj.O(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(byte param0) {
        super.f((byte) 121);
        this.field_C.a((byte) 125, 0, 0, this.field_o, this.field_p);
        if (param0 >= 103) {
          this.field_I = this.field_k;
          this.field_D = this.field_w;
          return;
        }
    }

    private aj(int param0, int param1, int param2, int param3, el param4, ca param5, gm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_I = 2147483647;
        this.field_D = 2147483647;
        try {
          this.field_F = param8 ? true : false;
          this.field_C = param6;
          this.field_H = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "aj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(byte param0, boolean param1, double[] param2, double param3) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var7 = Torquing.field_u;
        try {
          if (qd.field_d == 2 &&
            1000.0 < ap.a(param2, 3, param2, 3)) {
            if (param1) {
              var5_int = 11;
            } else {
              var5_int = (param3 != 0.0) ? 1 : 0;
            }
            var6 = (int)Math.sqrt(-1000.0 + ap.a(param2, 3, param2, 3)) * 96 >> 7;
            if (255 < var6) {
              var6 = 255;
            }
            np.a(var5_int, -32596, var6);
          } else {
            np.a(-1, param0 - 32540, 0);
          }
          if (param0 == -56) {
            return;
          }
          field_E = 1.1098183393478394f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("aj.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 < 5) {
            this.field_K = -35;
          }
          var8_int = super.a(param0, param1, param2, param3, param4, param5, (byte) 105) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_F) {
            return true;
          }
          if (!this.a(param3, param4, param1, param2, 87)) {
            stackIn_13_0 = var8_int;
            return stackIn_13_0 != 0;
          }
          if (param0 == 1) {
            this.field_K = -param1 + param4 - this.field_w;
            this.field_G = -param2 + param3 - this.field_k;
            lp.field_d = this;
          }
          this.field_l = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("aj.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
    }
}
