/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pk extends dk {
    private boolean field_E;
    static int[] field_J;
    private int field_L;
    static String field_G;
    private int field_I;
    private int field_F;
    private int field_H;
    private boolean field_K;

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        qa var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -47) {
            var6 = (qa) null;
            this.a((byte) 36, (qa) null, 37, -90, -110, -10);
          }
          if (this.a(param1, -103, param0, param2)) {
            this.a(param2, -70, param0, param1);
            this.a(param0, param1, (byte) 103, param2);
            discarded$62 = param0.append(" revert=").append(this.field_K);
            if (this.field_I != 2147483647 &&
              this.field_H != 2147483647) {
              discarded$63 = param0.append(" to ").append(this.field_I).append(',').append(this.field_H);
            }
          }
          stackIn_8_0 = (StringBuilder) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("pk.S(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_v = 0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "pk.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private pk(int param0, int param1, int param2, int param3, ch param4, kd param5, qa param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_I = 2147483647;
        this.field_H = 2147483647;
        try {
          this.field_E = param8 ? true : false;
          this.field_K = param7 ? true : false;
          this.field_A = param6;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "pk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void c(boolean param0) {
        super.c(param0);
        this.field_A.a(0, this.field_u, 0, this.field_j, 80);
        this.field_H = this.field_z;
        this.field_I = this.field_y;
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        int stackIn_13_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        qa var7 = null;
        int var5_intLifetime1;
        int var5_intLifetime1Lifetime1;
        try {
          if (param3 >= -85) {
            var7 = (qa) null;
            this.a((byte) -72, (qa) null, 106, 108, -8, 125);
          }
          boolean decompiledFrameRemainder0 = true;
          if ((!(this.field_A instanceof bb) ||
            ((bb) (this.field_A)).field_D) &&
            this.field_v == 1) {
            var5_int = -param1 + (ag.field_f - this.field_F);
            var6 = -param0 - this.field_L + kc.field_b;
            if ((this.field_y != var5_int ||
              this.field_z != var6)) {
              this.field_z = var6;
              this.field_y = var5_int;
              if (!(!(this.field_s instanceof qd))) {
                ((qd) (this.field_s)).a(-30781, param1, this, param0);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_K) {
              if (this.field_y != this.field_I) {
                var5_intLifetime1 = -this.field_y + this.field_I;
                stackIn_13_1 = this.field_y;
                if (Math.abs(var5_intLifetime1) <= 2) {
                  if (var5_intLifetime1 > 0) {
                    stackIn_16_2 = 1;
                  } else {
                    stackIn_16_2 = -1;
                  }
                } else {
                  stackIn_16_2 = var5_intLifetime1 >> 1;
                }
                this.field_y = stackIn_13_1 + stackIn_16_2;
              }
              if (this.field_H != this.field_z) {
                var5_intLifetime1Lifetime1 = this.field_H - this.field_z;
                stackIn_21_1 = this.field_z;
                if (Math.abs(var5_intLifetime1Lifetime1) <= 2) {
                  if (0 >= var5_intLifetime1Lifetime1) {
                    stackIn_24_2 = -1;
                  } else {
                    stackIn_24_2 = 1;
                  }
                } else {
                  stackIn_24_2 = var5_intLifetime1Lifetime1 >> 1;
                }
                this.field_z = stackIn_21_1 + stackIn_24_2;
              }
            }
          }
          super.a(param0, param1, param2, (byte) -91);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_34_0 = var5;
          stackIn_34_1 = new StringBuilder().append("pk.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param3).append(')').toString());
        }
    }

    final static ve a(byte param0, String param1) {
        RuntimeException var2 = null;
        ve stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 68) {
            field_G = (String) null;
          }
          stackIn_3_0 = new ve(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pk.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_G = null;
        if (param0 < 50) {
          pk.d((byte) 21);
          field_J = null;
          return;
        }
        field_J = null;
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_E) {
            return true;
          }
          if (!this.b(param0, param6, 0, param4, param2)) {
            stackIn_9_0 = var8_int;
            return stackIn_9_0 != 0;
          }
          this.field_v = param5;
          if (1 != param5) {
            return true;
          }
          this.field_F = -param6 - this.field_y + param4;
          this.field_L = -param0 + (-this.field_z + param2);
          wi.field_e = this;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("pk.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_J = new int[16384];
        field_G = "Level: <%0>";
    }
}
