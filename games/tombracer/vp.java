/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vp extends qr {
    private boolean field_z;
    private int field_A;
    private int field_D;
    static String field_B;
    private int field_E;
    private boolean field_C;
    private int field_y;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        ae var6 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) -127, param0, param1, param2)) {
            this.a(1, param2, param1, param0);
            this.a(param1, param0, param2, 0);
            discarded$62 = param2.append(" revert=").append(this.field_C);
            if (this.field_y != 2147483647 &&
              this.field_E != 2147483647) {
              discarded$63 = param2.append(" to ").append(this.field_y).append(',').append(this.field_E);
            }
          }
          if (param3 != 0) {
            var6 = (ae) null;
            this.a(-39, 47, (ae) null, -72);
          }
          stackIn_9_0 = (StringBuilder) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("vp.R(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 70) {
            this.field_y = -96;
          }
          var8_int = super.a(109, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_z) {
            return true;
          }
          if (!this.a(param6, param1, 18, param3, param2)) {
            stackIn_7_0 = var8_int;
            return stackIn_7_0 != 0;
          }
          if (param4 == 1) {
            this.field_D = param3 - this.field_n - param2;
            this.field_A = -this.field_i + (param6 - param1);
            ava.field_f = this;
          }
          this.field_s = param4;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_17_0 = var8;
          stackIn_17_1 = new StringBuilder().append("vp.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_s = 0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vp.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_x instanceof rj) ||
            ((rj) (this.field_x)).field_y) &&
            this.field_s == 1) {
            var5_int = -param0 + jba.field_j - this.field_A;
            var6 = -this.field_D + (sta.field_B - param3);
            if (this.field_i != var5_int ||
              var6 != this.field_n) {
              this.field_i = var5_int;
              this.field_n = var6;
              if (this.field_h instanceof jka) {
                ((jka) (this.field_h)).a(param0, this, (byte) -49, param3);
              }
            }
          } else {
            if (this.field_C) {
              if (this.field_y != this.field_i) {
                var5_int = -this.field_i + this.field_y;
                stackIn_11_1 = this.field_i;
                if (Math.abs(var5_int) > 2) {
                  stackIn_12_2 = var5_int >> 1;
                } else {
                  if (0 >= var5_int) {
                    stackIn_12_2 = -1;
                  } else {
                    stackIn_12_2 = 1;
                  }
                }
                this.field_i = stackIn_11_1 + stackIn_12_2;
              }
              if (this.field_E != this.field_n) {
                var5_int = this.field_E - this.field_n;
                stackIn_18_1 = this.field_n;
                if (Math.abs(var5_int) > 2) {
                  stackIn_19_2 = var5_int >> 1;
                } else {
                  if (var5_int > 0) {
                    stackIn_19_2 = 1;
                  } else {
                    stackIn_19_2 = -1;
                  }
                }
                this.field_n = stackIn_18_1 + stackIn_19_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("vp.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_B = null;
        if (param0 != 63) {
          field_B = (String) null;
        }
    }

    final static void a(int param0, br param1) {
        try {
          param1.field_l = new int[]{param0};
          param1.field_o = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vp.MA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    vp(int param0, int param1, int param2, int param3, isa param4, qc param5, ae param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_y = 2147483647;
        this.field_E = 2147483647;
        try {
          this.field_x = param6;
          this.field_z = param8 ? true : false;
          this.field_C = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vp.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void c(int param0) {
        super.c(95);
        if (param0 >= 91) {
          this.field_x.a((byte) -31, this.field_m, this.field_p, 0, 0);
          this.field_E = this.field_n;
          this.field_y = this.field_i;
          return;
        }
        ae var3 = (ae) null;
        this.a(-99, 92, -20, -84, 98, (ae) null, 112);
        this.field_x.a((byte) -31, this.field_m, this.field_p, 0, 0);
        this.field_E = this.field_n;
        this.field_y = this.field_i;
    }

    final static int a(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        stackIn_3_0 = ((1 & param0) == 0) ? 0 : 1;
        var2 = stackIn_3_0;
        stackIn_6_0 = ((param0 & 2) == 0) ? 0 : 1;
        var3 = stackIn_6_0;
        stackIn_9_0 = ((4 & param0) == 0) ? 0 : 1;
        var4 = stackIn_9_0;
        stackIn_12_0 = ((8 & param0) == 0) ? 0 : 1;
        var5 = stackIn_12_0;
        stackIn_15_0 = ((16 & param0) == 0) ? 0 : 1;
        var6 = stackIn_15_0;
        stackIn_18_0 = ((param0 & 32) == 0) ? 0 : 1;
        var7 = stackIn_18_0;
        stackIn_21_0 = (0 == (64 & param0)) ? 0 : 1;
        var8 = stackIn_21_0;
        if (var2 == 0) {
          var14 = var7;
          var10 = var5;
          var9 = var4;
          var12 = var3;
          var17 = var8;
          var13 = var6;
          var16 = 0;
          var15 = 0;
          var11 = var2;
          if (param1 != -6487) {
            return 12;
          }
          var18 = 0;
          if (var11 != 0) {
            var18 = var18 | 1;
          }
          if (var12 != 0) {
            var18 = var18 | 2;
          }
          if (var9 != 0) {
            var18 = var18 | 4;
          }
          if (var10 != 0) {
            var18 = var18 | 8;
          }
          if (var13 != 0) {
            var18 = var18 | 16;
          }
          if (var14 != 0) {
            var18 = var18 | 32;
          }
          if (var15 != 0) {
            var18 = var18 | 128;
          }
          if (var16 != 0) {
            var18 = var18 | 256;
          }
          if (var17 != 0) {
            var18 = var18 | 64;
          }
          return var18;
        }
        if (var3 == 0) {
          var14Lifetime1 = var7;
          var10Lifetime1 = var5;
          var9Lifetime1 = var4;
          var12Lifetime1 = var3;
          var17Lifetime1 = var8;
          var13Lifetime1 = var6;
          var16Lifetime1 = 0;
          var15Lifetime1 = 0;
          var11Lifetime1 = var2;
          if (param1 != -6487) {
            return 12;
          }
          var18Lifetime1 = 0;
          if (var11Lifetime1 != 0) {
            var18Lifetime1 = var18Lifetime1 | 1;
          }
          if (var12Lifetime1 != 0) {
            var18Lifetime1 = var18Lifetime1 | 2;
          }
          if (var9Lifetime1 != 0) {
            var18Lifetime1 = var18Lifetime1 | 4;
          }
          if (var10Lifetime1 != 0) {
            var18Lifetime1 = var18Lifetime1 | 8;
          }
          if (var13Lifetime1 != 0) {
            var18Lifetime1 = var18Lifetime1 | 16;
          }
          if (var14Lifetime1 != 0) {
            var18Lifetime1 = var18Lifetime1 | 32;
          }
          if (var15Lifetime1 != 0) {
            var18Lifetime1 = var18Lifetime1 | 128;
          }
          if (var16Lifetime1 != 0) {
            var18Lifetime1 = var18Lifetime1 | 256;
          }
          if (var17Lifetime1 != 0) {
            var18Lifetime1 = var18Lifetime1 | 64;
          }
          return var18Lifetime1;
        }
        if (var4 == 0) {
          var14Lifetime2 = var7;
          var10Lifetime2 = var5;
          var9Lifetime2 = var4;
          var12Lifetime2 = var3;
          var17Lifetime2 = var8;
          var13Lifetime2 = var6;
          var16Lifetime2 = 0;
          var15Lifetime2 = 0;
          var11Lifetime2 = var2;
          if (param1 != -6487) {
            return 12;
          }
          var18Lifetime2 = 0;
          if (var11Lifetime2 != 0) {
            var18Lifetime2 = var18Lifetime2 | 1;
          }
          if (var12Lifetime2 != 0) {
            var18Lifetime2 = var18Lifetime2 | 2;
          }
          if (var9Lifetime2 != 0) {
            var18Lifetime2 = var18Lifetime2 | 4;
          }
          if (var10Lifetime2 != 0) {
            var18Lifetime2 = var18Lifetime2 | 8;
          }
          if (var13Lifetime2 != 0) {
            var18Lifetime2 = var18Lifetime2 | 16;
          }
          if (var14Lifetime2 != 0) {
            var18Lifetime2 = var18Lifetime2 | 32;
          }
          if (var15Lifetime2 != 0) {
            var18Lifetime2 = var18Lifetime2 | 128;
          }
          if (var16Lifetime2 != 0) {
            var18Lifetime2 = var18Lifetime2 | 256;
          }
          if (var17Lifetime2 != 0) {
            var18Lifetime2 = var18Lifetime2 | 64;
          }
          return var18Lifetime2;
        }
        if (var5 == 0) {
          var14Lifetime3 = var7;
          var10Lifetime3 = var5;
          var9Lifetime3 = var4;
          var12Lifetime3 = var3;
          var17Lifetime3 = var8;
          var13Lifetime3 = var6;
          var16Lifetime3 = 0;
          var15Lifetime3 = 0;
          var11Lifetime3 = var2;
          if (param1 != -6487) {
            return 12;
          }
          var18Lifetime3 = 0;
          if (var11Lifetime3 != 0) {
            var18Lifetime3 = var18Lifetime3 | 1;
          }
          if (var12Lifetime3 != 0) {
            var18Lifetime3 = var18Lifetime3 | 2;
          }
          if (var9Lifetime3 != 0) {
            var18Lifetime3 = var18Lifetime3 | 4;
          }
          if (var10Lifetime3 != 0) {
            var18Lifetime3 = var18Lifetime3 | 8;
          }
          if (var13Lifetime3 != 0) {
            var18Lifetime3 = var18Lifetime3 | 16;
          }
          if (var14Lifetime3 != 0) {
            var18Lifetime3 = var18Lifetime3 | 32;
          }
          if (var15Lifetime3 != 0) {
            var18Lifetime3 = var18Lifetime3 | 128;
          }
          if (var16Lifetime3 != 0) {
            var18Lifetime3 = var18Lifetime3 | 256;
          }
          if (var17Lifetime3 != 0) {
            var18Lifetime3 = var18Lifetime3 | 64;
          }
          return var18Lifetime3;
        }
        var16Lifetime4 = var7;
        var11Lifetime4 = 0;
        var10Lifetime4 = 0;
        var15Lifetime4 = var6;
        var9Lifetime4 = 0;
        var14Lifetime4 = 0;
        var13Lifetime4 = 0;
        var17Lifetime4 = 0;
        var12Lifetime4 = 0;
        if (param1 != -6487) {
          return 12;
        }
        var18Lifetime4 = 0;
        if (var11Lifetime4 != 0) {
          var18Lifetime4 = var18Lifetime4 | 1;
        }
        if (var12Lifetime4 != 0) {
          var18Lifetime4 = var18Lifetime4 | 2;
        }
        if (var9Lifetime4 != 0) {
          var18Lifetime4 = var18Lifetime4 | 4;
        }
        if (var10Lifetime4 != 0) {
          var18Lifetime4 = var18Lifetime4 | 8;
        }
        if (var13Lifetime4 != 0) {
          var18Lifetime4 = var18Lifetime4 | 16;
        }
        if (var14Lifetime4 != 0) {
          var18Lifetime4 = var18Lifetime4 | 32;
        }
        if (var15Lifetime4 != 0) {
          var18Lifetime4 = var18Lifetime4 | 128;
        }
        if (var16Lifetime4 != 0) {
          var18Lifetime4 = var18Lifetime4 | 256;
        }
        if (var17Lifetime4 != 0) {
          var18Lifetime4 = var18Lifetime4 | 64;
        }
        return var18Lifetime4;
    }

    static {
        field_B = "Dartgun";
    }
}
