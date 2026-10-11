/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gj extends qa implements wg {
    static dd[] field_E;
    vc field_C;
    static rk field_A;
    static String field_D;
    static String[] field_B;

    gj(int param0, int param1, int param2, int param3, ch param4) {
        super(param0, param1, param2, param3, param4, (kd) null);
        this.field_C = new vc();
    }

    final boolean a(qa param0, int param1) {
        we var3 = null;
        RuntimeException var3_ref = null;
        qa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          var3 = new we(this.field_C);
          var4 = (qa) (var3.b(87));
          while (var4 != null) {
            if (var4.a(param0, -118)) {
              return true;
            }
            var4 = (qa) (var3.c(-6144));
          }
          if (param1 >= -26) {
            this.d((byte) -117);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("gj.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, -62, param0, param2)) {
            this.a(param2, -37, param0, param1);
            this.b(param0, param1, 0, param2);
          }
          if (param3 < -47) {
            stackIn_7_0 = (StringBuilder) (param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("gj.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(int param0) {
        int var4 = fleas.field_A ? 1 : 0;
        we var2 = new we(this.field_C);
        if (param0 != -1) {
          return;
        }
        qa var3 = (qa) (var2.b(-74));
        while (var3 != null) {
          var3.f(-1);
          var3 = (qa) (var2.c(-6144));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.d((byte) 84);
    }

    private final void d(byte param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 != 84) {
          field_B = (String[]) null;
        }
        we var2 = new we(this.field_C);
        qa var3 = (qa) (var2.b(73));
        while (var3 != null) {
          var3.b(false);
          var3 = (qa) (var2.c(-6144));
        }
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        we var7 = null;
        qa var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          var7 = new we(this.field_C);
          var8 = (qa) (var7.b(-128));
          while (var8 != null) {
            if (var8.b((byte) -54)) {
              var8.a((byte) 5, param1, param2 + this.field_y, param3, param4, this.field_z + param5);
              var8 = (qa) (var7.c(-6144));
              continue;
            }
            break;
          }
          if (param0 != 5) {
            field_B = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("gj.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = aj.a(param1, 0, (byte) -108, param1.length);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("gj.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        we var8 = null;
        RuntimeException var8_ref = null;
        qa var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          if (!param1) {
            return false;
          }
          var8 = new we(this.field_C);
          var9 = (qa) (var8.b(-75));
          while (var9 != null) {
            if (var9.b((byte) -54)) {
              if (!var9.a(param0 + this.field_z, true, param2, param3, param4, param5, param6 + this.field_y)) {
                var9 = (qa) (var8.c(-6144));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("gj.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, qa param1) {
        RuntimeException var3 = null;
        qa var4 = null;
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        we var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          if (this.field_C.a(-1092895903)) {
            return false;
          }
          if (param0 != 32) {
            field_A = (rk) null;
          }
          var8 = new we(this.field_C);
          var4 = (qa) (var8.b(106));
          while (var4 != null) {
            if (var4.e(param0 - 31)) {
              var5 = new we(this.field_C);
              var5.a((byte) -99, var4);
              var6 = (qa) (var5.c(-6144));
              while (var6 != null) {
                if (var6.a(param1, -108)) {
                  return true;
                }
                var6 = (qa) (var5.c(param0 ^ -6112));
              }
            }
            var4 = (qa) (var8.c(param0 ^ -6112));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("gj.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final boolean a(int param0, qa param1, int param2, int param3, int param4, int param5, int param6) {
        we var8 = null;
        RuntimeException var8_ref = null;
        qa var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          var8 = new we(this.field_C);
          var9 = (qa) (var8.b(-62));
          while (var9 != null) {
            if (var9.b((byte) -54)) {
              if (var9.e(1) &&
                var9.a(param0, param1, param2, -31628, param4, param5, param6)) {
                return true;
              }
              var9 = (qa) (var8.c(-6144));
              continue;
            }
            break;
          }
          if (param3 == -31628) {
            return false;
          }
          field_A = (rk) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("gj.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_A = null;
        field_B = null;
        if (param0 >= -93) {
          return;
        }
        field_D = null;
        field_E = null;
    }

    final void a(qa param0, byte param1) {
        try {
          this.field_C.a(false, param0);
          if (param1 >= -27) {
            this.g(121);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "gj.TA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void b(int param0, int param1, boolean param2, int param3) {
        int var7 = fleas.field_A ? 1 : 0;
        if (0 == param3 &&
          null != this.field_p) {
          this.field_p.a(-127, param1, true, (qa) (this), param0);
        }
        we var5 = new we(this.field_C);
        if (!param2) {
          return;
        }
        qa var6 = (qa) (var5.a((byte) 106));
        while (var6 != null) {
          var6.b(param0 + this.field_z, param1 + this.field_y, true, param3);
          var6 = (qa) (var5.a(true));
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        qa var8 = null;
        we var9 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          var9 = new we(this.field_C);
          var8 = (qa) (var9.b(102));
          while (var8 != null) {
            if (var8.b((byte) -54)) {
              if (var8.e(1) &&
                var8.a(-2, param1, param2, param3)) {
                return true;
              }
              var8 = (qa) (var9.c(param0 - 6142));
              continue;
            }
            break;
          }
          if (param0 != -2) {
            return false;
          }
          var6 = param1;
          if (80 != var6) {
            return false;
          }
          if (!ei.field_H[81]) {
            stackIn_16_0 = this.a(32, param2);
          } else {
            stackIn_16_0 = this.b(param2, param0 ^ 28533);
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("gj.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    qa i(int param0) {
        we var2;
        qa var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        var2 = new we(this.field_C);
        if (param0 != -257) {
          return (qa) null;
        }
        var3 = (qa) (var2.b(-119));
        while (var3 != null) {
          if (var3.e(1)) {
            return var3;
          }
          var3 = (qa) (var2.c(param0 - 5887));
        }
        return null;
    }

    final boolean b(qa param0, int param1) {
        RuntimeException var3 = null;
        qa var4 = null;
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        we var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          if (this.field_C.a(param1 ^ 1092889578)) {
            return false;
          }
          var8 = new we(this.field_C);
          if (param1 != -28533) {
            this.d((byte) -72);
          }
          var4 = (qa) (var8.a((byte) 106));
          while (var4 != null) {
            if (var4.e(1)) {
              var5 = new we(this.field_C);
              var5.b((byte) -119, var4);
              var6 = (qa) (var5.a(true));
              while (var6 != null) {
                if (var6.a(param0, -59)) {
                  return true;
                }
                var6 = (qa) (var5.a(true));
              }
            }
            var4 = (qa) (var8.a(true));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("gj.WA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        we var5 = null;
        qa var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          if (param2 != 0) {
            this.b(26, -83, true, -8);
          }
          var5 = new we(this.field_C);
          var6 = (qa) (var5.b(param2 - 78));
          while (var6 != null) {
            discarded$3 = param0.append('\n');
            for (var7 = 0; var7 <= param3; var7++) {
              discarded$4 = param0.append(' ');
            }
            var6.a(param0, param1, param3 + 1, param2 ^ -82);
            var6 = (qa) (var5.c(-6144));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("gj.AB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final String g(int param0) {
        String var4 = null;
        int var5 = fleas.field_A ? 1 : 0;
        we var2 = new we(this.field_C);
        qa var3 = (qa) (var2.b(param0 ^ -127));
        while (var3 != null) {
          var4 = var3.g(4);
          if (var4 != null) {
            return var4;
          }
          var3 = (qa) (var2.c(-6144));
        }
        if (param0 == 4) {
          return null;
        }
        this.g(49);
        return null;
    }

    final boolean e(int param0) {
        if (param0 != 1) {
          field_D = (String) null;
        }
        return this.i(param0 ^ -258) != null ? true : false;
    }

    final int c(byte param0) {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        int var2 = 0;
        we var3 = new we(this.field_C);
        qa var4 = (qa) (var3.b(107));
        while (var4 != null) {
          var5 = var4.c((byte) 8);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (qa) (var3.c(-6144));
        }
        if (param0 != 8) {
          this.g(-53);
        }
        return var2;
    }

    void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException runtimeException = null;
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          super.a(param0, param1, param2, (byte) -88);
          var5 = new we(this.field_C);
          if (param3 > -85) {
            field_D = (String) null;
          }
          var6 = (qa) (var5.b(-67));
          while (var6 != null) {
            if (var6.b((byte) -54)) {
              var6.a(this.field_z + param0, param1 + this.field_y, param2, (byte) -123);
              var6 = (qa) (var5.c(-6144));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("gj.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_D = "There are several different tiles in Flea Circus, each with a different effect. The effect is normally triggered when a flea touches the tile. Some tiles only work if a flea approaches from the side or top.";
        field_B = new String[]{"By rating", "By win percentage"};
    }
}
