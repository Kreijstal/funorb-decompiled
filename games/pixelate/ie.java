/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ie extends ng implements j {
    static jl field_G;
    static String field_F;
    ng field_H;

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_F = null;
        field_G = null;
    }

    private final boolean a(byte param0, ng param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -95) {
            this.j(110);
          }
          stackIn_7_0 = (this.field_H != null) && (!this.field_H.b(true)) && (this.field_H.a(param1, 27));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ie.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ng l(int param0) {
        if (param0 <= 48) {
          field_G = (jl) null;
        }
        ng var2 = this.field_H;
        if (var2 == null) {
          return null;
        }
        if (var2.b(true)) {
          return var2;
        }
        return null;
    }

    boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -58) {
            this.field_H = (ng) null;
          }
          stackIn_6_0 = (null != this.field_H) && (this.field_H.a((byte) -58, param1, param2, param3 + this.field_p, param4, param5 + this.field_z, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ie.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void j(int param0) {
        if (this.field_H != null) {
          this.field_H.c((byte) 99);
        }
        if (param0 != 0) {
          this.field_H = (ng) null;
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          this.h(43);
        }
        return this.l(118) != null ? true : false;
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        ng var9 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 61) {
            var9 = (ng) null;
            discarded$1 = this.a((byte) -50, (ng) null);
          }
          stackIn_7_0 = (null != this.field_H) && (this.field_H.b(true)) && (this.field_H.a(param0, (byte) 68, param2, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ie.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Pixelate.field_H ? 1 : 0;
        try {
          if (param4 >= param6) {
            return;
          }
          if (param0 <= param4 + 1) {
            return;
          }
          if (param5 < 8) {
            ie.a(-1, -100, false, 25, 54, 90, -71);
          }
          if (param0 > param4 + 5 &&
            param1 != param3) {
            var7_int = (param1 >> 1) - (-(param3 >> 1) - (1 & (param3 & param1)));
            var8 = param4;
            var9 = param3;
            var10 = param1;
            for (var11 = param4; var11 < param0; var11++) {
              var12 = gn.field_A[var11];
              if (!param2) {
                stackIn_24_0 = nb.field_c[var12];
              } else {
                stackIn_24_0 = ep.field_c[var12];
              }
              var13 = stackIn_24_0;
              if (var7_int >= var13) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                gn.field_A[var11] = gn.field_A[var8];
                incrementValue$0 = var8;
                var8++;
                gn.field_A[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              }
            }
            ie.a(var8, var9, param2, param3, param4, 87, param6);
            ie.a(param0, param1, param2, var10, var8, 54, param6);
            return;
          }
          for (var7_intLifetime1 = -1 + param0; var7_intLifetime1 > param4; var7_intLifetime1--) {
            for (var8Lifetime1 = param4; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = gn.field_A[var8Lifetime1];
              var10Lifetime1 = gn.field_A[1 + var8Lifetime1];
              if (tj.a(false, param2, var9Lifetime1, var10Lifetime1)) {
                gn.field_A[var8Lifetime1] = var10Lifetime1;
                gn.field_A[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var7), "ie.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    ie(int param0, int param1, int param2, int param3, eb param4, fn param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void h(int param0) {
        if (null != this.field_H) {
          this.field_H.h(param0 ^ 0);
        }
        if (param0 != 2) {
          ng var3 = (ng) null;
          this.a(86, -99, (ng) null, 'ﾻ');
        }
    }

    final static void k(int param0) {
        te.a(4, -2671);
        if (param0 != 8149) {
          field_F = (String) null;
        }
    }

    private final boolean a(int param0, ng param1) {
        RuntimeException var3 = null;
        ng var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11627) {
            var4 = (ng) null;
            this.a(-52, -66, (ng) null, -50, -35, 36);
          }
          stackIn_7_0 = (this.field_H != null) && (!this.field_H.b(true)) && (this.field_H.a(param1, param0 - 11600));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ie.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    String b(byte param0) {
        String var3 = null;
        String var2 = super.b((byte) 115);
        if (param0 <= 16) {
          field_F = (String) null;
        }
        if (this.field_H != null) {
          var3 = this.field_H.b((byte) 84);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 27) {
            return false;
          }
          stackIn_7_0 = (null != this.field_H) && (this.field_H.a(param0, param1 ^ 0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ie.HA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 19) {
          return;
        }
        super.a(param0, (byte) 113, param2, param3, param4);
        this.j(0);
    }

    final int e(int param0) {
        if (param0 < 31) {
          return -41;
        }
        return this.field_H != null ? this.field_H.e(122) : 0;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var4;
        int var3;
        int var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var4 = Pixelate.field_H ? 1 : 0;
        if (-1 != param2) {
          if (param2 == -2) {
            te.b(true, -116);
          } else {
            wo.b(107, param2).c(0);
            if (pm.field_u) {
              var3 = 81 % ((-12 - param1) / 42);
              decompiledFrameRemainder0 = false;
            }
            else {
              wo.b(-73, param2).a(11);
            }
          }
        } else {
          if (ro.field_e == null) {
            if (null != qo.field_r) {
              qo.field_r.a(param0, 0);
            }
          } else {
            ro.field_e.a(param0, 0);
          }
        }
        if (decompiledFrameRemainder0) {
          var3Lifetime1 = 81 % ((-12 - param1) / 42);
        }

    }

    void a(int param0, int param1, int param2, byte param3) {
        if (param1 == 0 &&
          this.field_y != null) {
          this.field_y.a((ng) (this), (byte) -124, param0, param2, true);
        }
        if (this.field_H != null) {
          this.field_H.a(param0 + this.field_p, param1, param2 + this.field_z, (byte) -36);
        }
        int var5 = -46 % ((param3 - 70) / 49);
    }

    StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            ie.k(-23);
          }
          if (this.a(-114, param2, param0, param3)) {
            this.a(param2, (byte) -2, param3, param0);
            this.a(param3, (byte) -80, param0, param2);
          }
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ie.AA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, ng param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 40) {
            this.field_H = (ng) null;
          }
          super.a(param0 ^ 0, param1, param2, param3);
          if (this.field_H != null) {
            this.field_H.a(40, this.field_p + param1, param2 + this.field_z, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ie.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param3 != 0) {
            return;
          }
          if (this.field_H != null) {
            this.field_H.a(param0, this.field_z + param1, param2, 0, param4 + this.field_p, param5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ie.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(Hashtable param0, byte param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          discarded$3 = param2.append('\n');
          var5_int = 0;
          if (param1 >= -79) {
            return;
          }
          while (var5_int <= param3) {
            discarded$5 = param2.append(' ');
            var5_int++;
          }
          if (this.field_H == null) {
            discarded$4 = param2.append("null");
          } else {
            this.field_H.a(param2, false, param3 + 1, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ie.W(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_H &&
            this.field_H.b(true) &&
            this.field_H.a(param0, param1 + 0, param2, param3)) {
            return true;
          }
          if (param1 != 3) {
            this.field_H = (ng) null;
          }
          var5_int = param0;
          if (var5_int != 80) {
            return false;
          }
          if (bc.field_m[81]) {
            stackIn_12_0 = this.a((byte) -127, param2);
          } else {
            stackIn_12_0 = this.a(11627, param2);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ie.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
