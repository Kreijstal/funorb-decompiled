/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends pa {
    static int field_E;
    static int field_I;
    private boolean field_D;
    static String field_J;
    private int field_O;
    private boolean field_K;
    private int field_G;
    private int field_N;
    private int field_Q;
    static int field_P;
    static String[] field_M;
    static u[] field_L;

    ij(int param0, int param1, int param2, int param3, io param4, sk param5, ga param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_Q = 2147483647;
        this.field_G = 2147483647;
        try {
          this.field_D = param8 ? true : false;
          this.field_K = param7 ? true : false;
          this.field_z = param6;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ij.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_M = (String[]) null;
          }
          if (this.a(param0, param1, 11098, param3)) {
            this.a(param0, param3, 113, param1);
            this.a(param0, param3, param1, -10643);
            discarded$62 = param1.append(" revert=").append(this.field_K);
            if (this.field_Q != 2147483647 &&
              2147483647 != this.field_G) {
              discarded$63 = param1.append(" to ").append(this.field_Q).append(',').append(this.field_G);
            }
          }
          stackIn_8_0 = (StringBuilder) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ij.NA(");
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
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(boolean param0) {
        super.b(param0);
        this.field_z.a(29, 0, 0, this.field_i, this.field_n);
        this.field_G = this.field_j;
        this.field_Q = this.field_k;
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          if (!param1) {
            stackIn_3_0 = 57;
            return stackIn_3_0;
          }
          var3_int = 0;
          while (0 < param2) {
            var3_int = var3_int << 1 | param0 & 1;
            param0 = param0 >>> 1;
            param2--;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "ij.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        try {
          if (param1 <= 1) {
            field_I = -68;
          }
          super.a(param0, 29, param2, param3, param4, param5);
          this.field_m = 0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ij.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static eo h(int param0) {
        if (param0 >= -26) {
          field_E = -41;
          if (ic.field_S == fk.field_F) {
            throw new IllegalStateException();
          }
          if (hm.field_H == fk.field_F) {
            fk.field_F = ic.field_S;
            return mp.field_f;
          }
          return null;
        }
        if (ic.field_S == fk.field_F) {
          throw new IllegalStateException();
        }
        if (hm.field_H == fk.field_F) {
          fk.field_F = ic.field_S;
          return mp.field_f;
        }
        return null;
    }

    public static void g(int param0) {
        field_M = null;
        field_J = null;
        field_L = null;
        if (param0 != -1) {
          field_P = -19;
        }
    }

    final static int a(int param0, byte[] param1, byte param2, int param3) {
        int var6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          var4_int = -1;
          var5 = 21 % ((55 - param2) / 52);
          for (var6 = param3; param0 > var6; var6++) {
            var4_int = var4_int >>> 8 ^ ci.field_b[(var4_int ^ param1[var6]) & 255];
          }
          var4_int = ~var4_int;
          stackIn_5_0 = var4_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ij.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        int stackIn_14_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var5_intLifetime1;
        try {
          if ((!(this.field_z instanceof an) ||
            ((an) (this.field_z)).field_C) &&
            this.field_m == 1) {
            var5_int = ha.field_b - this.field_O - param3;
            var6 = -param2 + (-this.field_N + ei.field_K);
            if (var5_int != this.field_k ||
              this.field_j != var6) {
              this.field_j = var6;
              this.field_k = var5_int;
              if (this.field_v instanceof tn) {
                ((tn) (this.field_v)).a(param2, -20962, this, param3);
              }
            }
          } else {
            if (this.field_K) {
              if (this.field_Q != this.field_k) {
                var5_int = this.field_Q - this.field_k;
                stackIn_14_1 = this.field_k;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_17_2 = -1;
                  } else {
                    stackIn_17_2 = 1;
                  }
                } else {
                  stackIn_17_2 = var5_int >> 1;
                }
                this.field_k = stackIn_14_1 + stackIn_17_2;
              }
              if (this.field_G != this.field_j) {
                var5_int = -this.field_j + this.field_G;
                stackIn_22_1 = this.field_j;
                if (2 >= Math.abs(var5_int)) {
                  if (var5_int <= 0) {
                    stackIn_25_2 = -1;
                  } else {
                    stackIn_25_2 = 1;
                  }
                } else {
                  stackIn_25_2 = var5_int >> 1;
                }
                this.field_j = stackIn_22_1 + stackIn_25_2;
              }
            }
          }
          super.a(param0, (byte) 100, param2, param3);
          var5_intLifetime1 = -91 % ((param1 - 46) / 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ij.D(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            this.field_N = 84;
          }
          var8_int = super.a(param0, param1 + 0, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_D) {
            return true;
          }
          if (!this.b(param3, 21224, param2, param4, param0)) {
            stackIn_11_0 = var8_int;
            return stackIn_11_0 != 0;
          }
          this.field_m = param5;
          if (param5 != 1) {
            return true;
          }
          this.field_O = -this.field_k + (param0 - param4);
          np.field_H = this;
          this.field_N = -this.field_j + (param3 - param2);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("ij.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_J = "TOUGH";
        to.a(50, (byte) -102);
        field_M = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
