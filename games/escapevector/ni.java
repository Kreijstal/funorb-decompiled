/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ni extends r {
    private int field_J;
    static hh field_M;
    private int field_L;
    static int[] field_D;
    static o field_N;
    private int field_I;
    private boolean field_P;
    static String field_K;
    static int field_O;
    private int field_H;
    static boolean field_F;
    static String field_G;
    private boolean field_E;

    final void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        try {
          super.a(param0, param1, param2, param3, param4, (byte) -96);
          this.field_t = 0;
          int var7_int = 58 % ((-39 - param5) / 45);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ni.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void l(int param0) {
        if (param0 < -90) {
          field_M = null;
          field_K = null;
          field_D = null;
          field_G = null;
          field_N = null;
          return;
        }
        field_F = false;
        field_M = null;
        field_K = null;
        field_D = null;
        field_G = null;
        field_N = null;
    }

    private ni(int param0, int param1, int param2, int param3, db param4, wn param5, hm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_H = 2147483647;
        this.field_I = 2147483647;
        try {
          this.field_P = param8 ? true : false;
          this.field_C = param6;
          this.field_E = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ni.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
          if (param0 != 0) {
            field_O = 81;
          }
          if (this.a(param3, param1, param2, false)) {
            this.a(param1, param2, param3, 1);
            this.a(param3, (byte) 95, param1, param2);
            discarded$62 = param2.append(" revert=").append(this.field_E);
            if (this.field_H != 2147483647 &&
              2147483647 != this.field_I) {
              discarded$63 = param2.append(" to ").append(this.field_H).append(',').append(this.field_I);
            }
          }
          stackIn_9_0 = (StringBuilder) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ni.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final void k(int param0) {
        if (param0 == -6844) {
          super.k(param0 + 0);
          this.field_C.a(this.field_g, 0, 0, true, this.field_x);
          this.field_I = this.field_j;
          this.field_H = this.field_k;
          return;
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
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
          if (!this.a(param1, param3, param4, (byte) 97, param0)) {
            stackIn_6_0 = var8_int;
            return stackIn_6_0 != 0;
          }
          this.field_t = param6;
          if (param6 != 1) {
            return true;
          }
          this.field_J = -this.field_k + (param1 - param4);
          this.field_L = -this.field_j + (param3 - param0);
          gf.field_b = this;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("ni.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, hm param3) {
        int stackIn_13_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_C instanceof hc) ||
            ((hc) (this.field_C)).field_y) &&
            this.field_t == 1) {
            var5_int = -this.field_J + dh.field_d - param2;
            var6 = -param1 - this.field_L + bj.field_y;
            if (var5_int != this.field_k ||
              this.field_j != var6) {
              this.field_j = var6;
              this.field_k = var5_int;
              if (this.field_q instanceof nd) {
                ((nd) (this.field_q)).a(this, param1, param2, 32468);
              }
            }
          } else {
            if (this.field_E) {
              if (this.field_k != this.field_H) {
                var5_int = -this.field_k + this.field_H;
                stackIn_13_1 = this.field_k;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_16_2 = -1;
                  } else {
                    stackIn_16_2 = 1;
                  }
                } else {
                  stackIn_16_2 = var5_int >> 1;
                }
                this.field_k = stackIn_13_1 + stackIn_16_2;
              }
              if (this.field_j != this.field_I) {
                var5_int = -this.field_j + this.field_I;
                stackIn_21_1 = this.field_j;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_24_2 = -1;
                  } else {
                    stackIn_24_2 = 1;
                  }
                } else {
                  stackIn_24_2 = var5_int >> 1;
                }
                this.field_j = stackIn_21_1 + stackIn_24_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("ni.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, boolean param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 > param1) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param2) {
            field_O = 75;
          }
          if (param3.length <= param1) {
            stackIn_9_0 = 0;
            return stackIn_9_0;
          }
          var4_int = param3[param1];
          stackIn_11_0 = ul.a(var4_int, param0, 112);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ni.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_K = "Connection restored.";
        field_O = -1;
        field_D = new int[8192];
        field_G = "Account created successfully!";
    }
}
