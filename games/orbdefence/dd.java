/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dd extends kj {
    static cb field_A;
    private int field_C;
    private boolean field_H;
    private int field_G;
    private boolean field_I;
    private int field_F;
    static java.security.SecureRandom field_D;
    static int[] field_B;
    private int field_E;

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        try {
          super.a(param0, param1, (byte) -117, param3, param4, param5);
          if (param2 >= -91) {
            pj var8 = (pj) null;
            this.a(-94, 81, (byte) 57, (pj) null, 57, -115);
          }
          this.field_v = 0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "dd.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_26_1 = 0;
        int stackIn_27_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_y instanceof s) ||
            ((s) (this.field_y)).field_F) &&
            this.field_v == 1) {
            var5_int = -this.field_C + (ua.field_a - param2);
            var6 = vl.field_d + (-this.field_F - param3);
            if (this.field_s != var5_int ||
              this.field_n != var6) {
              this.field_s = var5_int;
              this.field_n = var6;
              if (this.field_h instanceof gf) {
                ((gf) (this.field_h)).a(param2, true, param3, this);
              }
            }
          } else if (this.field_I) {
            if (this.field_E != this.field_s) {
              var5_int = this.field_E - this.field_s;
              stackIn_18_1 = this.field_s;
              if (Math.abs(var5_int) > 2) {
                stackIn_19_2 = var5_int >> 1;
              } else {
                if (var5_int > 0) {
                  stackIn_19_2 = 1;
                } else {
                  stackIn_19_2 = -1;
                }
              }
              this.field_s = stackIn_18_1 + stackIn_19_2;
            }
            if (this.field_n != this.field_G) {
              var5_int = this.field_G - this.field_n;
              stackIn_26_1 = this.field_n;
              if (2 < Math.abs(var5_int)) {
                stackIn_27_2 = var5_int >> 1;
              } else {
                if (var5_int > 0) {
                  stackIn_27_2 = 1;
                } else {
                  stackIn_27_2 = -1;
                }
              }
              this.field_n = stackIn_26_1 + stackIn_27_2;
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("dd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -23) {
            dd.c((byte) 95);
          }
          if (this.a(9882, param3, param2, param1)) {
            this.a(param2, (byte) -98, param1, param3);
            this.a(param3, param2, -19956, param1);
            discarded$64 = param3.append(" revert=").append(this.field_I);
            if (this.field_E != 2147483647 &&
              2147483647 != this.field_G) {
              discarded$65 = param3.append(" to ").append(this.field_E).append(',').append(this.field_G);
            }
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("dd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static ui a(Throwable param0, String param1) {
        ui var2 = null;
        if (param0 instanceof ui) {
          var2 = (ui) ((Object) param0);
          var2.field_d = var2.field_d + ' ' + param1;
        } else {
          var2 = new ui(param0, param1);
        }
        return var2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, boolean param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = OrbDefence.field_D ? 1 : 0;
        if (!param10) {
          if (param14 > param6) {
            if (param5 > param14) {
              ke.a(param9, param7, param14, param13, param11, param3, param15, param0, param8, ul.field_b, param1, param12, param5, param4, param6, param2, 1551567504);
              return;
            }
            if (param5 <= param6) {
              ke.a(param15, param9, param6, param4, param8, param11, param7, param13, param3, ul.field_b, param12, param2, param14, param0, param5, param1, 1551567504);
              return;
            }
            ke.a(param7, param9, param5, param4, param8, param3, param15, param0, param11, ul.field_b, param1, param2, param14, param13, param6, param12, 1551567504);
            return;
          }
          if (param6 < param5) {
            ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
            return;
          }
          if (param14 < param5) {
            ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
            return;
          }
          ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
          return;
        }
        field_D = (java.security.SecureRandom) null;
        if (param14 > param6) {
          if (param5 > param14) {
            ke.a(param9, param7, param14, param13, param11, param3, param15, param0, param8, ul.field_b, param1, param12, param5, param4, param6, param2, 1551567504);
            return;
          }
          if (param5 <= param6) {
            ke.a(param15, param9, param6, param4, param8, param11, param7, param13, param3, ul.field_b, param12, param2, param14, param0, param5, param1, 1551567504);
            return;
          }
          ke.a(param7, param9, param5, param4, param8, param3, param15, param0, param11, ul.field_b, param1, param2, param14, param13, param6, param12, 1551567504);
          return;
        }
        if (param6 < param5) {
          ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
          return;
        }
        if (param14 < param5) {
          ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
          return;
        }
        ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        pj var9 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -115) {
            var9 = (pj) null;
            this.a((byte) 38, (pj) null, 56, -20);
          }
          var8_int = super.a((byte) -124, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_H) {
            return true;
          }
          if (!this.a((byte) 3, param5, param4, param6, param3)) {
            stackIn_7_0 = var8_int;
            return stackIn_7_0 != 0;
          }
          this.field_v = param2;
          if (1 != param2) {
            return true;
          }
          this.field_C = -param3 + (-this.field_s + param5);
          this.field_F = -param6 + param4 - this.field_n;
          al.field_c = this;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("dd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private dd(int param0, int param1, int param2, int param3, td param4, ag param5, pj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_G = 2147483647;
        this.field_E = 2147483647;
        try {
          this.field_H = param8 ? true : false;
          this.field_I = param7 ? true : false;
          this.field_y = param6;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "dd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void b(byte param0) {
        super.b((byte) -116);
        this.field_y.a(0, 0, this.field_r, (byte) -90, this.field_m);
        this.field_E = this.field_s;
        this.field_G = this.field_n;
        int var2 = -53 % ((55 - param0) / 49);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 >>> 31;
        if (param0 == -1) {
          return (param1 + var3) / param2 - var3;
        }
        return -63;
    }

    public static void c(byte param0) {
        field_D = null;
        field_B = null;
        if (param0 >= -102) {
          return;
        }
        field_A = null;
    }

    static {
    }
}
