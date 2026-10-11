/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ef extends mc {
    private int field_C;
    static String field_A;
    private int field_D;
    static int field_z;
    private boolean field_B;
    private int field_x;
    static boolean field_E;
    static arb field_y;
    private int field_w;
    private boolean field_v;

    final StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
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
          if (this.a(param1, param2, (byte) 115, param3)) {
            this.a(124, param2, param1, param3);
            this.a(param2, 13, param3, param1);
            discarded$64 = param3.append(" revert=").append(this.field_B);
            if (this.field_w != 2147483647 &&
              2147483647 != this.field_C) {
              discarded$65 = param3.append(" to ").append(this.field_w).append(',').append(this.field_C);
            }
          }
          if (param0) {
            this.field_x = 60;
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ef.JA(").append(param0).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        try {
          super.a((byte) 124, param1, param2, param3, param4, param5);
          int var7_int = -8 / ((param0 - 52) / 52);
          this.field_n = 0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ef.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    ef(int param0, int param1, int param2, int param3, wwa param4, sba param5, shb param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_C = 2147483647;
        this.field_w = 2147483647;
        try {
          this.field_B = param7 ? true : false;
          this.field_v = param8 ? true : false;
          this.field_t = param6;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ef.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 >= -17) {
            this.field_B = false;
          }
          var8_int = super.a(param0, param1, param2, param3, param4, param5, (byte) -100) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_v) {
            return true;
          }
          if (!this.a(param2, param1, param0, param5, (byte) 22)) {
            stackIn_12_0 = var8_int;
            return stackIn_12_0 != 0;
          }
          this.field_n = param3;
          if (param3 != 1) {
            return true;
          }
          this.field_D = -this.field_g + (param0 - param1);
          this.field_x = -this.field_r + param2 - param5;
          lb.field_p = this;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("ef.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        int stackIn_15_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_t instanceof htb) ||
            ((htb) (this.field_t)).field_x) &&
            this.field_n == 1) {
            var5_int = -this.field_D + (kc.field_b - param1);
            var6 = -this.field_x + uia.field_b - param0;
            if (this.field_g != var5_int ||
              this.field_r != var6) {
              this.field_g = var5_int;
              this.field_r = var6;
              if (this.field_l instanceof l) {
                ((l) (this.field_l)).a(false, param1, param0, this);
              }
            }
          } else {
            if (this.field_B) {
              if (this.field_w != this.field_g) {
                var5_int = -this.field_g + this.field_w;
                stackIn_15_1 = this.field_g;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_18_2 = -1;
                  } else {
                    stackIn_18_2 = 1;
                  }
                } else {
                  stackIn_18_2 = var5_int >> 1;
                }
                this.field_g = stackIn_15_1 + stackIn_18_2;
              }
              if (this.field_C != this.field_r) {
                var5_int = -this.field_r + this.field_C;
                stackIn_25_1 = this.field_r;
                if (Math.abs(var5_int) > 2) {
                  stackIn_26_2 = var5_int >> 1;
                } else {
                  if (var5_int <= 0) {
                    stackIn_26_2 = -1;
                  } else {
                    stackIn_26_2 = 1;
                  }
                }
                this.field_r = stackIn_25_1 + stackIn_26_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("ef.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void a(int param0) {
        super.a(120);
        this.field_t.a(0, this.field_h, this.field_f, 1, 0);
        this.field_w = this.field_g;
        int var2 = -102 / ((param0 + 80) / 42);
        this.field_C = this.field_r;
    }

    public static void e(int param0) {
        field_y = null;
        field_A = null;
        int var1 = 124 % ((-23 - param0) / 44);
    }

    final static caa a(String param0, String param1, int param2, asb param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        asb var6 = null;
        caa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -47) {
            var6 = (asb) null;
            ef.a((String) null, (String) null, 4, (asb) null);
          }
          var4_int = param3.b(param1, -97);
          var5 = param3.a(true, var4_int, param0);
          stackIn_3_0 = rr.a(-32431, param3, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ef.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_E = false;
        field_A = "You do not have a suitable number of players for the current options.";
    }
}
