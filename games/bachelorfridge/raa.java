/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class raa extends hfa {
    static int field_F;
    private int field_C;
    static lda field_I;
    private int field_D;
    private boolean field_G;
    static int field_J;
    private int field_L;
    private boolean field_H;
    private int field_K;

    private raa(int param0, int param1, int param2, int param3, qda param4, pl param5, wj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_D = 2147483647;
        this.field_K = 2147483647;
        try {
          this.field_H = param7 ? true : false;
          this.field_A = param6;
          this.field_G = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "raa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -7375) {
            return true;
          }
          var8_int = super.b(param0, param1 ^ 0, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_G) {
            return true;
          }
          if (!this.a(param6, param0, 0, param2, param4)) {
            stackIn_14_0 = var8_int;
            return stackIn_14_0 != 0;
          }
          if (param3 == 1) {
            this.field_L = -param4 + (-this.field_v + param6);
            cea.field_b = this;
            this.field_C = param0 - this.field_s - param2;
          }
          this.field_u = param3;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_17_0 = var8;
          stackIn_17_1 = new StringBuilder().append("raa.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_u = 0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "raa.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void e(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 != 31) {
          raa.e((byte) 61);
          var1 = qaa.field_e[rba.field_b];
          if (var1 != -1) {
            jga.field_v = jm.field_k[var1] + "...";
            cr.field_a = f.b((byte) 73);
            return;
          }
          jga.field_v = jm.field_k[0] + "... " + id.field_g;
          cr.field_a = f.b((byte) 73);
          return;
        }
        var1Lifetime1 = qaa.field_e[rba.field_b];
        if (var1Lifetime1 != -1) {
          jga.field_v = jm.field_k[var1Lifetime1] + "...";
          cr.field_a = f.b((byte) 73);
          return;
        }
        jga.field_v = jm.field_k[0] + "... " + id.field_g;
        cr.field_a = f.b((byte) 73);
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 20) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param0, param1, param3, (byte) 98)) {
            this.a(9, param0, param3, param1);
            this.b(param1, param0, param3, 121);
            discarded$64 = param3.append(" revert=").append(this.field_H);
            if (this.field_K != 2147483647 &&
              2147483647 != this.field_D) {
              discarded$65 = param3.append(" to ").append(this.field_K).append(',').append(this.field_D);
            }
          }
          stackIn_8_0 = (StringBuilder) (param3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("raa.V(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0) {
        super.a(param0 ^ 0);
        this.field_A.a(0, this.field_q, (byte) 59, this.field_p, 0);
        this.field_D = this.field_v;
        this.field_K = this.field_s;
        if (param0 != -81) {
          this.field_D = 118;
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_23_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_A instanceof hf) ||
            ((hf) (this.field_A)).field_z) &&
            this.field_u == 1) {
            var5_int = mk.field_p - (this.field_C + param0);
            var6 = -param1 + (gd.field_m - this.field_L);
            if (var5_int != this.field_s ||
              this.field_v != var6) {
              this.field_v = var6;
              this.field_s = var5_int;
              if (this.field_k instanceof tm) {
                ((tm) (this.field_k)).a(param1, (byte) 118, param0, this);
              }
            }
          } else {
            if (this.field_H) {
              if (this.field_K != this.field_s) {
                var5_int = this.field_K - this.field_s;
                stackIn_17_1 = this.field_s;
                if (Math.abs(var5_int) > 2) {
                  stackIn_18_2 = var5_int >> 1;
                } else {
                  if (0 >= var5_int) {
                    stackIn_18_2 = -1;
                  } else {
                    stackIn_18_2 = 1;
                  }
                }
                this.field_s = stackIn_17_1 + stackIn_18_2;
              }
              if (this.field_D != this.field_v) {
                var5_int = -this.field_v + this.field_D;
                stackIn_23_1 = this.field_v;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_26_2 = -1;
                  } else {
                    stackIn_26_2 = 1;
                  }
                } else {
                  stackIn_26_2 = var5_int >> 1;
                }
                this.field_v = stackIn_23_1 + stackIn_26_2;
              }
            }
          }
          if (param3 != 20) {
            return;
          }
          super.a(param0, param1, param2, param3 + 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("raa.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 != 2) {
          return;
        }
        field_I = null;
    }

    static {
    }
}
