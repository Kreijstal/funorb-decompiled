/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fj extends ok {
    private boolean field_L;
    private int field_K;
    private int field_E;
    private int field_Q;
    static java.math.BigInteger field_N;
    private int field_I;
    static ng[] field_M;
    static ja field_H;
    private boolean field_J;
    static nb field_P;
    static String field_O;
    static int field_S;
    static String field_R;
    static int field_U;
    static int field_T;

    private fj(int param0, int param1, int param2, int param3, t param4, tg param5, al param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_E = 2147483647;
        this.field_Q = 2147483647;
        try {
          this.field_B = param6;
          this.field_J = param8 ? true : false;
          this.field_L = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "fj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(byte param0) {
        super.a((byte) 107);
        int var2 = 95 / ((48 - param0) / 40);
        this.field_B.a(this.field_u, -3050, 0, this.field_x, 0);
        this.field_Q = this.field_p;
        this.field_E = this.field_m;
    }

    public static void e(byte param0) {
        if (param0 == 118) {
          field_O = null;
          field_N = null;
          field_R = null;
          field_P = null;
          field_M = null;
          field_H = null;
          return;
        }
        fj.e((byte) 71);
        field_O = null;
        field_N = null;
        field_R = null;
        field_P = null;
        field_M = null;
        field_H = null;
    }

    final void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_r = 0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "fj.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int b(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        if (param0 == -48) {
          if (param1 >= 48 &&
            57 >= param1) {
            return -48 + param1;
          }
          if (param1 >= 97 &&
            param1 <= 122) {
            return -87 + param1;
          }
          if (65 > param1) {
            stackIn_56_0 = (param1 != 43) ? 63 : 62;
            return stackIn_56_0;
          }
          if (param1 <= 90) {
            return 36 - (65 - param1);
          }
          stackIn_62_0 = (param1 != 43) ? 63 : 62;
          return stackIn_62_0;
        }
        fj.e((byte) -76);
        if (param1 >= 48) {
          if (57 >= param1) {
            return -48 + param1;
          }
          if (param1 >= 97 &&
            param1 <= 122) {
            return -87 + param1;
          }
          if (65 > param1) {
            stackIn_38_0 = (param1 != 43) ? 63 : 62;
            return stackIn_38_0;
          }
          if (param1 <= 90) {
            return 36 - (65 - param1);
          }
          stackIn_43_0 = (param1 != 43) ? 63 : 62;
          return stackIn_43_0;
        }
        if (param1 < 97) {
          if (65 > param1) {
            stackIn_7_0 = (param1 != 43) ? 63 : 62;
            return stackIn_7_0;
          }
          if (param1 <= 90) {
            return 36 - (65 - param1);
          }
          stackIn_13_0 = (param1 != 43) ? 63 : 62;
          return stackIn_13_0;
        }
        if (param1 <= 122) {
          return -87 + param1;
        }
        if (65 > param1) {
          stackIn_21_0 = (param1 != 43) ? 63 : 62;
          return stackIn_21_0;
        }
        if (param1 <= 90) {
          return 36 - (65 - param1);
        }
        stackIn_26_0 = (param1 != 43) ? 63 : 62;
        return stackIn_26_0;
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_J) {
            return true;
          }
          if (!this.a(param5, param6, param2, false, param1)) {
            stackIn_5_0 = var8_int;
            return stackIn_5_0 != 0;
          }
          if (param3 == 1) {
            rf.field_e = this;
            this.field_I = param1 + (-this.field_m - param6);
            this.field_K = -param5 - this.field_p + param2;
          }
          this.field_r = param3;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("fj.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 116, param3, param2, param1)) {
            this.a(34, param2, param3, param1);
            this.a(-51, param1, param2, param3);
            discarded$64 = param2.append(" revert=").append(this.field_L);
            if (this.field_Q != 2147483647 &&
              this.field_E != 2147483647) {
              discarded$65 = param2.append(" to ").append(this.field_Q).append(',').append(this.field_E);
            }
          }
          if (param0) {
            this.a((byte) -42);
          }
          stackIn_8_0 = (StringBuilder) (param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("fj.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, al param3) {
        int stackIn_10_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var5_intLifetime1;
        int var5_intLifetime1Lifetime1;
        try {
          boolean decompiledFrameRemainder0 = true;
          if ((!(this.field_B instanceof rh) ||
            ((rh) (this.field_B)).field_B) &&
            1 == this.field_r) {
            var5_int = -this.field_K + (kf.field_b - param1);
            var6 = -param0 + (-this.field_I + fg.field_a);
            if ((this.field_p != var5_int ||
              this.field_m != var6)) {
              this.field_m = var6;
              this.field_p = var5_int;
              if (!(!(this.field_l instanceof ek))) {
                ((ek) (this.field_l)).a(this, param0, param1, param2 - 21487);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_L) {
              if (this.field_Q != this.field_p) {
                var5_intLifetime1 = -this.field_p + this.field_Q;
                stackIn_10_1 = this.field_p;
                if (2 >= Math.abs(var5_intLifetime1)) {
                  if (var5_intLifetime1 <= 0) {
                    stackIn_13_2 = -1;
                  } else {
                    stackIn_13_2 = 1;
                  }
                } else {
                  stackIn_13_2 = var5_intLifetime1 >> 1;
                }
                this.field_p = stackIn_10_1 + stackIn_13_2;
              }
              if (this.field_E != this.field_m) {
                var5_intLifetime1Lifetime1 = -this.field_m + this.field_E;
                stackIn_20_1 = this.field_m;
                if (Math.abs(var5_intLifetime1Lifetime1) > 2) {
                  stackIn_21_2 = var5_intLifetime1Lifetime1 >> 1;
                } else {
                  if (var5_intLifetime1Lifetime1 > 0) {
                    stackIn_21_2 = 1;
                  } else {
                    stackIn_21_2 = -1;
                  }
                }
                this.field_m = stackIn_20_1 + stackIn_21_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("fj.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          if (param1 != 1) {
            stackIn_3_0 = -24;
            return stackIn_3_0;
          }
          var3_int = 0;
          while (param0 > 0) {
            var3_int = var3_int << 1 | param2 & 1;
            param2 = param2 >>> 1;
            param0--;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var3), "fj.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_N = new java.math.BigInteger("65537");
        field_H = new ja();
        field_O = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_R = "Resume Game";
        field_S = 2;
    }
}
