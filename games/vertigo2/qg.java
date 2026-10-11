/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qg extends oh {
    private boolean field_M;
    private boolean field_N;
    private int field_H;
    private int field_J;
    static int field_I;
    private int field_K;
    static int field_G;
    private int field_L;

    final void a(byte param0) {
        super.a((byte) 119);
        this.field_C.a(false, 0, 0, this.field_s, this.field_n);
        if (param0 > 93) {
          this.field_K = this.field_t;
          this.field_L = this.field_o;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        pf.a((byte) -88, on.field_b[param2][param3], param1);
        if (param0 != 1) {
          qg.a(105, 55, -99, true, (String) null, 34L);
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, (byte) -120, param6) ? 1 : 0;
          if (param5 > -107) {
            this.field_H = -3;
          }
          if (var8_int != 0 &&
            this.field_M) {
            return true;
          }
          if (!this.a(0, param2, param1, param0, param6)) {
            stackIn_8_0 = var8_int;
            return stackIn_8_0 != 0;
          }
          this.field_A = param4;
          if (param4 != 1) {
            return true;
          }
          um.field_E = this;
          this.field_J = -param2 - this.field_t + param6;
          this.field_H = -param1 + (param0 - this.field_o);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("qg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
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
          if (this.a(param3, -1, param1, param0)) {
            this.a(param0, param3, true, param1);
            this.a(1000, param0, param1, param3);
            discarded$64 = param3.append(" revert=").append(this.field_N);
            if (this.field_L != 2147483647 &&
              this.field_K != 2147483647) {
              discarded$65 = param3.append(" to ").append(this.field_L).append(',').append(this.field_K);
            }
          }
          if (param2 != -79) {
            this.field_J = -46;
          }
          stackIn_8_0 = (StringBuilder) (param3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("qg.FA(");
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
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        int stackIn_12_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if (param0 <= 6) {
            return;
          }
          if ((!(this.field_C instanceof d) ||
            ((d) (this.field_C)).field_F) &&
            this.field_A == 1) {
            var5_int = -this.field_H + (ed.field_n - param1);
            var6 = -this.field_J + (gb.field_d - param2);
            if (var5_int != this.field_o ||
              var6 != this.field_t) {
              this.field_o = var5_int;
              this.field_t = var6;
              if (this.field_v instanceof ai) {
                ((ai) (this.field_v)).a(-17589, param1, this, param2);
              }
            }
          } else if (this.field_N) {
            if (this.field_L != this.field_o) {
              var5_int = this.field_L - this.field_o;
              stackIn_12_1 = this.field_o;
              if (Math.abs(var5_int) <= 2) {
                if (0 >= var5_int) {
                  stackIn_15_2 = -1;
                } else {
                  stackIn_15_2 = 1;
                }
              } else {
                stackIn_15_2 = var5_int >> 1;
              }
              this.field_o = stackIn_12_1 + stackIn_15_2;
            }
            if (this.field_t != this.field_K) {
              var5_int = -this.field_t + this.field_K;
              stackIn_19_1 = this.field_t;
              if (Math.abs(var5_int) <= 2) {
                if (var5_int > 0) {
                  stackIn_22_2 = 1;
                } else {
                  stackIn_22_2 = -1;
                }
              } else {
                stackIn_22_2 = var5_int >> 1;
              }
              this.field_t = stackIn_19_1 + stackIn_22_2;
            }
          }
          super.a((byte) 64, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("qg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_A = 0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "qg.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static long b(boolean param0) {
        if (param0) {
          return 5L;
        }
        return gk.a(57) - gn.field_b;
    }

    final static void a(int param0, int param1, int param2, boolean param3, String param4, long param5) {
        int var7_int = 0;
        try {
          uh.field_Wb.j(param0, 127);
          uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
          var7_int = uh.field_Wb.field_u;
          if (param2 != 0) {
            qg.a(-61, -1, -60, -41);
          }
          uh.field_Wb.a((byte) -119, param5);
          uh.field_Wb.a((byte) 0, param4);
          uh.field_Wb.f(param1, -75);
          uh.field_Wb.f(param3 ? 1 : 0, 112);
          uh.field_Wb.b((byte) -125, uh.field_Wb.field_u - var7_int);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "qg.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    private qg(int param0, int param1, int param2, int param3, ur param4, uf param5, iq param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_K = 2147483647;
        this.field_L = 2147483647;
        try {
          this.field_N = param7 ? true : false;
          this.field_C = param6;
          this.field_M = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "qg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
