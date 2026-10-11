/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fd extends fi implements ja {
    static String field_x;
    static km field_y;
    static String[] field_A;
    static int[] field_B;
    p field_z;
    static int field_C;

    fd(int param0, int param1, int param2, int param3, ol param4) {
        super(param0, param1, param2, param3, param4, (cd) null);
        this.field_z = new p();
    }

    final int b(byte param0) {
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        int var2 = 0;
        ma var3 = new ma(this.field_z);
        if (param0 != -39) {
          field_x = (String) null;
        }
        fi var4 = (fi) (var3.c(12677));
        while (var4 != null) {
          var5 = var4.b((byte) -39);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (fi) (var3.b(41));
        }
        return var2;
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        ma var5 = null;
        fi var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (param3 < 48) {
            field_C = 97;
          }
          var5 = new ma(this.field_z);
          var6 = (fi) (var5.c(12677));
          while (var6 != null) {
            discarded$3 = param1.append('\n');
            for (var7 = 0; var7 <= param2; var7++) {
              discarded$4 = param1.append(' ');
            }
            var6.a(param0, (byte) 121, 1 + param2, param1);
            var6 = (fi) (var5.b(41));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("fd.BB(");
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
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 118) {
            field_B = (int[]) null;
          }
          if (this.a(param0, param2, 34, param3)) {
            this.a(param2, param0, (byte) 127, param3);
            this.a(param0, param3, param2, 54);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fd.MA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 != 1) {
          field_B = (int[]) null;
        }
        field_x = null;
        field_B = null;
        field_y = null;
        field_A = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (param1 != 6752) {
          return;
        }
        int var7 = 3;
        df.c(param3, param5, param2, param6, (param6 >> 1) - 2, !param4 ? 1063506 : 1264494);
        int var8 = 2 * var7;
        df.c(param3 + var7, var7 + param5, -var8 + param2, param6 - var8, -var7 + ((param6 >> 1) - 2), 2);
    }

    final void a(fi param0, byte param1) {
        try {
          this.field_z.a(param0, (byte) -58);
          if (param1 != -78) {
            this.d(-16);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "fd.QB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, fi param1, int param2, int param3, int param4, int param5, int param6) {
        ma var8 = null;
        RuntimeException var8_ref = null;
        fi var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          var8 = new ma(this.field_z);
          if (param5 != 0) {
            this.f(false);
          }
          var9 = (fi) (var8.c(param5 ^ 12677));
          while (var9 != null) {
            if (var9.b(false)) {
              if (var9.f(true) &&
                var9.a(param0, param1, param2, param3, param4, 0, param6)) {
                return true;
              }
              var9 = (fi) (var8.b(41));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("fd.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ke.field_r[ka.field_m] = param4;
        lk.field_Tb[ka.field_m] = ka.field_m;
        wh.field_c[ka.field_m] = param1;
        if (rk.field_e > param1) {
          ka.field_k = param1;
        }
        if (!(param1 <= bl.field_F)) {
          dj.field_c = param1;
        }
        vc.field_jb[ka.field_m] = param3;
        tg.field_A[ka.field_m] = param0;
        kf.field_j[ka.field_m] = param5;
        int var6 = param5 + (param0 + param3);
        int var7 = param2 == var6 ? 0 : 1000 * param3 / var6;
        vl.field_i[ka.field_m] = var7;
        if (!(dj.field_c >= var7)) {
          dj.field_c = var7;
        }
        ka.field_m = ka.field_m + 1;
        if (!(ka.field_k <= var7)) {
          ka.field_k = var7;
        }
    }

    final boolean b(int param0, fi param1) {
        RuntimeException var3 = null;
        fi var4 = null;
        ma var5 = null;
        fi var6 = null;
        int var7 = 0;
        ma var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 2) {
            return true;
          }
          if (this.field_z.b((byte) 32)) {
            return false;
          }
          var8 = new ma(this.field_z);
          var4 = (fi) (var8.a((byte) 48));
          while (var4 != null) {
            if (var4.f(true)) {
              var5 = new ma(this.field_z);
              var5.b(1, var4);
              var6 = (fi) (var5.a(-1));
              while (var6 != null) {
                if (!var6.a(param1, param0 - 8517)) {
                  var6 = (fi) (var5.a(param0 - 3));
                  continue;
                }
                return true;
              }
            }
            var4 = (fi) (var8.a(param0 ^ -3));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("fd.MB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void d(byte param0) {
        int var4 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(this.field_z);
        fi var3 = (fi) (var2.c(12677));
        if (param0 >= -17) {
          field_A = (String[]) null;
        }
        while (var3 != null) {
          var3.d(false);
          var3 = (fi) (var2.b(41));
        }
    }

    boolean a(fi param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fi var9 = null;
        ma var10 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var10 = new ma(this.field_z);
          var9 = (fi) (var10.c(12677));
          while (var9 != null) {
            if (var9.b(false)) {
              if (var9.f(true) &&
                var9.a(param0, param1, param2, -122)) {
                return true;
              }
              var9 = (fi) (var10.b(41));
              continue;
            }
            break;
          }
          var6 = 48 % ((-75 - param3) / 36);
          var7 = param2;
          if (var7 != 80) {
            return false;
          }
          if (dc.field_Y[81]) {
            stackIn_14_0 = this.b(2, param0);
          } else {
            stackIn_14_0 = this.a(-16234, param0);
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("fd.AA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(fi param0, int param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        fi var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          var3 = new ma(this.field_z);
          var4 = (fi) (var3.c(12677));
          if (param1 != -8515) {
            this.f(false);
          }
          while (var4 != null) {
            if (var4.a(param0, -8515)) {
              return true;
            }
            var4 = (fi) (var3.b(41));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("fd.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        wb.a(true, (byte) 125, param0);
        if (param1 != -20248) {
          field_C = 51;
        }
    }

    void a(int param0, boolean param1, int param2, int param3, int param4) {
        if (!param1) {
          return;
        }
        super.a(param0, param1, param2, param3, param4);
        this.d((byte) -102);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = Virogrid.field_F ? 1 : 0;
        if (param0 != 37) {
          fi var8 = (fi) null;
          this.a(-9, (fi) null);
        }
        if (param3 == 0 &&
          this.field_w != null) {
          this.field_w.a(param1, (fi) (this), true, param2, -23294);
        }
        ma var5 = new ma(this.field_z);
        fi var6 = (fi) (var5.a((byte) 48));
        while (var6 != null) {
          var6.a((byte) 37, this.field_l + param1, this.field_u + param2, param3);
          var6 = (fi) (var5.a(-1));
        }
    }

    final boolean f(boolean param0) {
        if (!param0) {
          this.field_z = (p) null;
        }
        return this.c((byte) -3) != null ? true : false;
    }

    final boolean a(int param0, fi param1) {
        RuntimeException var3 = null;
        fi var4 = null;
        ma var5 = null;
        fi var6 = null;
        int var7 = 0;
        ma var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_z.b((byte) 95)) {
            return false;
          }
          if (param0 != -16234) {
            return false;
          }
          var8 = new ma(this.field_z);
          var4 = (fi) (var8.c(12677));
          while (var4 != null) {
            if (var4.f(true)) {
              var5 = new ma(this.field_z);
              var5.a(param0 + 16150, var4);
              var6 = (fi) (var5.b(41));
              while (var6 != null) {
                if (var6.a(param1, param0 + 7719)) {
                  return true;
                }
                var6 = (fi) (var5.b(41));
              }
            }
            var4 = (fi) (var8.b(41));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("fd.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        ma var8 = null;
        RuntimeException var8_ref = null;
        fi var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          var8 = new ma(this.field_z);
          if (param2) {
            this.d((byte) -71);
          }
          var9 = (fi) (var8.c(12677));
          while (var9 != null) {
            if (var9.b(false)) {
              if (var9.a(param0, param1, false, this.field_l + param3, param4, param5 + this.field_u, param6)) {
                return true;
              }
              var9 = (fi) (var8.b(41));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("fd.NA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void c(int param0) {
        int var4 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(this.field_z);
        if (param0 != -1) {
          return;
        }
        fi var3 = (fi) (var2.c(12677));
        while (var3 != null) {
          var3.c(-1);
          var3 = (fi) (var2.b(41));
        }
    }

    String d(int param0) {
        String var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(this.field_z);
        fi var3 = (fi) (var2.c(12677));
        while (var3 != null) {
          var4 = var3.d(70);
          if (var4 != null) {
            return var4;
          }
          var3 = (fi) (var2.b(41));
        }
        if (param0 > 35) {
          return null;
        }
        this.d((byte) -64);
        return null;
    }

    fi c(byte param0) {
        ma var2;
        fi var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        var2 = new ma(this.field_z);
        if (param0 != -3) {
          field_x = (String) null;
        }
        var3 = (fi) (var2.c(param0 + 12680));
        while (var3 != null) {
          if (var3.f(true)) {
            return var3;
          }
          var3 = (fi) (var2.b(41));
        }
        return null;
    }

    void a(int param0, int param1, fi param2, int param3) {
        RuntimeException runtimeException = null;
        ma var5 = null;
        fi var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          super.a(param0, 114, param2, param3);
          var5 = new ma(this.field_z);
          if (param1 < 113) {
            field_C = 3;
          }
          var6 = (fi) (var5.c(12677));
          while (var6 != null) {
            if (var6.b(false)) {
              var6.a(param0 + this.field_l, 124, param2, this.field_u + param3);
              var6 = (fi) (var5.b(41));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("fd.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        ma var7 = null;
        fi var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          var7 = new ma(this.field_z);
          var8 = (fi) (var7.c(12677));
          while (var8 != null) {
            if (var8.b(false)) {
              var8.a(param0, param1, param2 + this.field_l, param3, this.field_u + param4, 104);
              var8 = (fi) (var7.b(41));
              continue;
            }
            break;
          }
          if (param5 < 73) {
            field_A = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("fd.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_x = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
