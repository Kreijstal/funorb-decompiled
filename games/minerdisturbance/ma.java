/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ma extends jc {
    private int field_K;
    static ea field_O;
    private int field_N;
    private boolean field_M;
    private int field_P;
    private boolean field_L;
    private int field_J;

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, 0);
          this.field_w = param5;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ma.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1) {
        sa var2 = null;
        int var3 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        sa var2Lifetime1;
        var3 = MinerDisturbance.field_ab;
        try {
          oc.field_f = param1;
          if (param0 > -88) {
            return;
          }
          var2 = (sa) (hj.field_b.b(61));
          while (var2 != null) {
            if (var2.field_p.c(123)) {
              var2.field_n.f(oc.field_f * var2.field_q + 128 >> 8);
            } else {
              var2.b(34);
            }
            var2 = (sa) (hj.field_b.b((byte) 56));
          }
          if (m.field_c == null) {
            return;
          }
          var2Lifetime1 = (sa) (m.field_c.b(80));
          while (var2Lifetime1 != null) {
            stackIn_15_0 = var2Lifetime1.field_p.c(118);
            if (!stackIn_15_0) {
              var2Lifetime1.b(34);
            } else {
              var2Lifetime1.field_n.f(128 + oc.field_f * var2Lifetime1.field_q >> 8);
            }
            var2Lifetime1 = (sa) (m.field_c.b((byte) 56));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "ma.B(" + param0 + ',' + param1 + ')');
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
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
          if (this.a(param3, true, param2, param1)) {
            this.a(param1, param3, 34, param2);
            this.a(param1, param2, param3, -125);
            discarded$62 = param3.append(" revert=").append(this.field_L);
            if (this.field_J != 2147483647 &&
              this.field_P != 2147483647) {
              discarded$63 = param3.append(" to ").append(this.field_J).append(',').append(this.field_P);
            }
          }
          if (param0 != -70) {
            this.field_M = false;
          }
          stackIn_9_0 = (StringBuilder) (param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ma.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int o(int param0) {
        if (param0 != -14933) {
          return 50;
        }
        return -cg.field_o + si.field_d;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2 ^ param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_M) {
            return true;
          }
          if (!this.b(param3, param6, param1, param0, -92)) {
            stackIn_6_0 = var8_int;
            return stackIn_6_0 != 0;
          }
          if (param4 == 1) {
            j.field_d = this;
            this.field_N = -param6 + (-this.field_u + param0);
            this.field_K = -param1 + (param3 - this.field_t);
          }
          this.field_w = param4;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("ma.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        int stackIn_10_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_I instanceof hc) ||
            ((hc) (this.field_I)).field_E) &&
            this.field_w == 1) {
            var5_int = -param1 + nk.field_w - this.field_N;
            var6 = -param0 + (-this.field_K + gb.field_e);
            if (var5_int != this.field_u ||
              this.field_t != var6) {
              this.field_t = var6;
              this.field_u = var5_int;
              if (this.field_y instanceof uc) {
                ((uc) (this.field_y)).a(param1, 64, this, param0);
              }
            }
          } else {
            if (this.field_L) {
              if (this.field_u != this.field_J) {
                var5_int = -this.field_u + this.field_J;
                stackIn_10_1 = this.field_u;
                if (2 >= Math.abs(var5_int)) {
                  if (var5_int <= 0) {
                    stackIn_13_2 = -1;
                  } else {
                    stackIn_13_2 = 1;
                  }
                } else {
                  stackIn_13_2 = var5_int >> 1;
                }
                this.field_u = stackIn_10_1 + stackIn_13_2;
              }
              if (this.field_t != this.field_P) {
                var5_int = -this.field_t + this.field_P;
                stackIn_18_1 = this.field_t;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int > 0) {
                    stackIn_21_2 = 1;
                  } else {
                    stackIn_21_2 = -1;
                  }
                } else {
                  stackIn_21_2 = var5_int >> 1;
                }
                this.field_t = stackIn_18_1 + stackIn_21_2;
              }
            }
          }
          super.a(param0, param1, (byte) 61, param3);
          if (param2 >= 49) {
            return;
          }
          this.field_P = -75;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("ma.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        super.a(param0);
        this.field_I.a(this.field_q, param0 - 111, 0, this.field_v, 0);
        this.field_P = this.field_t;
        this.field_J = this.field_u;
    }

    public static void n(int param0) {
        if (param0 != 27934) {
          return;
        }
        field_O = null;
    }

    private ma(int param0, int param1, int param2, int param3, ad param4, rm param5, fe param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_P = 2147483647;
        this.field_J = 2147483647;
        try {
          this.field_L = param7 ? true : false;
          this.field_M = param8 ? true : false;
          this.field_I = param6;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ma.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
