/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class oi extends da {
    private boolean field_I;
    private boolean field_H;
    private int field_L;
    private int field_O;
    private int field_K;
    private int field_N;
    static ec field_J;
    static md field_F;
    static String field_G;
    static String field_M;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param0, 87, param2)) {
            this.a(param0, param2, param1, 1);
            this.a(true, param2, param0, param1);
            discarded$62 = param2.append(" revert=").append(this.field_I);
            if (this.field_L != 2147483647 &&
              this.field_N != 2147483647) {
              discarded$63 = param2.append(" to ").append(this.field_L).append(',').append(this.field_N);
            }
          }
          if (param3 <= -76) {
            stackIn_10_0 = (StringBuilder) (param2);
            return stackIn_10_0;
          }
          stackIn_8_0 = (StringBuilder) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("oi.CB(").append(param0).append(',');
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
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_17_1 = 0;
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
          if ((!(this.field_D instanceof ck) ||
            ((ck) (this.field_D)).field_B) &&
            this.field_y == 1) {
            var5_int = -param0 + (-this.field_K + hj.field_S);
            var6 = -param1 - this.field_O + eh.field_h;
            if ((this.field_q != var5_int ||
              var6 != this.field_v)) {
              this.field_q = var5_int;
              this.field_v = var6;
              if (!(!(this.field_n instanceof vi))) {
                ((vi) (this.field_n)).a((byte) -49, this, param1, param0);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_I) {
              if (this.field_L != this.field_q) {
                var5_intLifetime1 = this.field_L - this.field_q;
                stackIn_9_1 = this.field_q;
                if (Math.abs(var5_intLifetime1) <= 2) {
                  if (var5_intLifetime1 <= 0) {
                    stackIn_12_2 = -1;
                  } else {
                    stackIn_12_2 = 1;
                  }
                } else {
                  stackIn_12_2 = var5_intLifetime1 >> 1;
                }
                this.field_q = stackIn_9_1 + stackIn_12_2;
              }
              if (this.field_N != this.field_v) {
                var5_intLifetime1Lifetime1 = this.field_N - this.field_v;
                stackIn_17_1 = this.field_v;
                if (Math.abs(var5_intLifetime1Lifetime1) <= 2) {
                  if (0 < var5_intLifetime1Lifetime1) {
                    stackIn_20_2 = 1;
                  } else {
                    stackIn_20_2 = -1;
                  }
                } else {
                  stackIn_20_2 = var5_intLifetime1Lifetime1 >> 1;
                }
                this.field_v = stackIn_17_1 + stackIn_20_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("oi.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int b(int param0, int param1) {
        if (param0 != 0) {
          return 121;
        }
        return uj.a(ld.field_f, param0 ^ 37, param1);
    }

    private oi(int param0, int param1, int param2, int param3, ca param4, pg param5, lm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_L = 2147483647;
        this.field_N = 2147483647;
        try {
          this.field_D = param6;
          this.field_H = param8 ? true : false;
          this.field_I = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "oi.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, (byte) -2, param6) ? 1 : 0;
          var9 = -65 / ((-80 - param5) / 35);
          if (var8_int != 0 &&
            this.field_H) {
            return true;
          }
          if (!this.a(param4, param3, param6, -1, param2)) {
            stackIn_9_0 = var8_int;
            return stackIn_9_0 != 0;
          }
          if (1 == param1) {
            this.field_O = param2 + (-this.field_v - param6);
            ah.field_b = this;
            this.field_K = -param3 + param4 - this.field_q;
          }
          this.field_y = param1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("oi.U(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void e(byte param0) {
        super.e((byte) -42);
        this.field_D.b(0, this.field_x, 0, 0, this.field_s);
        if (param0 < -4) {
          this.field_L = this.field_q;
          this.field_N = this.field_v;
          return;
        }
    }

    final static cn[] a(int param0, int param1, int param2, nh param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_F = (md) null;
          }
          if (kk.a(param3, 1, param1, param2)) {
            return fo.a(0);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("oi.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void f(byte param0) {
        oh.field_s = 10;
        jn.field_c = false;
        ke.field_b = vd.field_a;
        if (param0 != 100) {
          return;
        }
        jm.a(param0 ^ -17601);
    }

    final static boolean a(int param0, int param1) {
        try {
          if (ra.field_c.field_o >= param1) {
            return true;
          }
          if (null == sp.field_c) {
            return false;
          }
          int var2_int = sp.field_c.a(0);
          if (0 < var2_int) {
            if (-ra.field_c.field_o + param1 < var2_int) {
              var2_int = -ra.field_c.field_o + param1;
            }
            sp.field_c.a(ra.field_c.field_m, false, var2_int, ra.field_c.field_o);
            qm.field_o = kd.c(param0 ^ 15127);
            ra.field_c.field_o = ra.field_c.field_o + var2_int;
            if (!(param1 <= ra.field_c.field_o)) {
              return false;
            }
            ra.field_c.field_o = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (param0 != -12929) {
              field_F = (md) null;
            }
            if (var2_int >= 0 &&
              b.a(124) <= 30000L) {
              return false;
            }
            tl.a(-77);
          } catch (IOException iOException) {
            tl.a(param0 + 13056);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        try {
          if (!param1) {
            this.field_K = 60;
          }
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_y = 0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "oi.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 >= 108) {
          field_M = null;
          field_F = null;
          field_J = null;
          field_G = null;
          return;
        }
        field_J = (ec) null;
        field_M = null;
        field_F = null;
        field_J = null;
        field_G = null;
    }

    static {
        field_J = new ec(1048576);
        field_G = "Connection lost. <%0>";
        field_F = null;
        field_M = "Save and exit";
    }
}
