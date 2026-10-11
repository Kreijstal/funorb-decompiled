/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kn extends fe implements rk {
    static String[][] field_D;
    static int field_E;
    static ln[] field_F;
    static ql[][] field_H;
    ta field_G;

    boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        fe var8 = null;
        hh var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = MinerDisturbance.field_ab;
        try {
          var9 = new hh(this.field_G);
          var8 = (fe) (var9.d(param2 - 19785));
          while (var8 != null) {
            if (var8.c(123)) {
              if (var8.k(param2 - 5) &&
                var8.a(param0, param1, (byte) -79, param3)) {
                return true;
              }
              var8 = (fe) (var9.a(12537));
              continue;
            }
            break;
          }
          if (param2 != -79) {
            this.field_G = (ta) null;
          }
          var6 = param3;
          if (var6 != 80) {
            return false;
          }
          if (qd.field_O[81]) {
            stackIn_15_0 = this.b(param1, param2 ^ -79);
          } else {
            stackIn_15_0 = this.a(param1, (byte) 12);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("kn.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
          field_F = (ln[]) null;
        }
        return pm.field_b;
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = MinerDisturbance.field_ab;
        if (param3 == 0 &&
          null != this.field_A) {
          this.field_A.a(param0 + 12084, param1, (fe) (this), param2, true);
        }
        hh var9 = new hh(this.field_G);
        if (param0 != 4) {
          fe var8 = (fe) null;
          this.a(53, -89, 49, -8, (byte) -101, (fe) null, 25);
        }
        fe var6 = (fe) (var9.a(true));
        while (var6 != null) {
          var6.a((byte) 4, this.field_u + param1, this.field_t + param2, param3);
          var6 = (fe) (var9.c(-119));
        }
    }

    final String h(int param0) {
        hh var2;
        fe var3;
        String var4;
        int var5;
        var5 = MinerDisturbance.field_ab;
        var2 = new hh(this.field_G);
        if (param0 != -27867) {
          return (String) null;
        }
        var3 = (fe) (var2.d(-19864));
        while (var3 != null) {
          var4 = var3.h(-27867);
          if (var4 != null) {
            return var4;
          }
          var3 = (fe) (var2.a(12537));
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        hh var7 = null;
        fe var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = MinerDisturbance.field_ab;
        try {
          var7 = new hh(this.field_G);
          var8 = (fe) (var7.d(-19864));
          while (var8 != null) {
            if (var8.c(param5 + 127)) {
              var8.a(param0 + this.field_u, param1, param2, param3 + this.field_t, param4, param5 + 0);
              var8 = (fe) (var7.a(12537));
              continue;
            }
            break;
          }
          if (param5 != 0) {
            field_D = (String[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("kn.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(fe param0, byte param1) {
        RuntimeException var3 = null;
        fe var4 = null;
        hh var5 = null;
        fe var6 = null;
        int var7 = 0;
        hh var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = MinerDisturbance.field_ab;
        try {
          if (this.field_G.e((byte) 108)) {
            return false;
          }
          var8 = new hh(this.field_G);
          if (param1 != 12) {
            field_F = (ln[]) null;
          }
          var4 = (fe) (var8.d(-19864));
          while (var4 != null) {
            if (var4.k(45)) {
              var5 = new hh(this.field_G);
              var5.a(var4, (byte) 92);
              var6 = (fe) (var5.a(12537));
              while (var6 != null) {
                if (var6.a(param0, 121)) {
                  return true;
                }
                var6 = (fe) (var5.a(param1 + 12525));
              }
            }
            var4 = (fe) (var8.a(12537));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("kn.VB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(fe param0, int param1) {
        hh var3 = null;
        RuntimeException var3_ref = null;
        fe var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          var3 = new hh(this.field_G);
          if (param1 < 119) {
            return false;
          }
          var4 = (fe) (var3.d(-19864));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(param0, 126)) {
              var4 = (fe) (var3.a(12537));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("kn.UA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, fe param3) {
        RuntimeException runtimeException = null;
        hh var5 = null;
        fe var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = MinerDisturbance.field_ab;
        try {
          super.a(param0, param1, (byte) 110, param3);
          if (param2 <= 49) {
            return;
          }
          var5 = new hh(this.field_G);
          var6 = (fe) (var5.d(-19864));
          while (var6 != null) {
            if (var6.c(123)) {
              var6.a(this.field_t + param0, this.field_u + param1, (byte) 90, param3);
              var6 = (fe) (var5.a(12537));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("kn.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void b(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        fe var6 = null;
        int var8 = 0;
        java.applet.Applet var9 = null;
        hh var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          var10 = new hh(this.field_G);
          if (param0 != -84) {
            var9 = (java.applet.Applet) null;
            kn.a((String) null, (byte) -102, (java.applet.Applet) null);
          }
          var6 = (fe) (var10.d(-19864));
          while (var6 != null) {
            discarded$3 = param3.append('\n');
            for (var7 = 0; var7 <= param2; var7++) {
              discarded$4 = param3.append(' ');
            }
            var6.a((byte) -70, param1, 1 + param2, param3);
            var6 = (fe) (var10.a(12537));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("kn.PB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(id param0, byte param1) {
        int var2_int = 0;
        id var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var4 = MinerDisturbance.field_ab;
        try {
          if (null == param0.field_e) {
            return;
          }
          if (param0.field_f != 0 ||
            param0.field_d != 0) {
            for (var2_int = 0; var2_int < sb.field_p; var2_int++) {
              var3 = im.field_a[var2_int];
              if (var3.field_g == 2 &&
                param0.field_f == var3.field_f &&
                param0.field_d == var3.field_d) {
                return;
              }
            }
          }
          if (null != param0.field_a) {
          }
          kh.a(param0, 14288);
          var2_intLifetime1 = 69 % ((param1 - 11) / 53);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("kn.WB(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(byte param0) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        int var2 = 0;
        hh var3 = new hh(this.field_G);
        if (param0 > -88) {
          field_E = -9;
        }
        fe var4 = (fe) (var3.d(-19864));
        while (var4 != null) {
          var5 = var4.b((byte) -120);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (fe) (var3.a(12537));
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, fe param5, int param6) {
        hh var8 = null;
        RuntimeException var8_ref = null;
        fe var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = MinerDisturbance.field_ab;
        try {
          var8 = new hh(this.field_G);
          var9 = (fe) (var8.d(-19864));
          while (var9 != null) {
            if (var9.c(126)) {
              if (var9.k(35) &&
                var9.a(param0, param1, param2, param3, (byte) -100, param5, param6)) {
                return true;
              }
              var9 = (fe) (var8.a(12537));
              continue;
            }
            break;
          }
          if (param4 <= -53) {
            return false;
          }
          this.field_G = (ta) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("kn.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    final void g(int param0) {
        int var4 = MinerDisturbance.field_ab;
        hh var2 = new hh(this.field_G);
        if (param0 != 4966) {
          StringBuilder var5 = (StringBuilder) null;
          this.a((byte) 55, (Hashtable) null, -74, (StringBuilder) null);
        }
        fe var3 = (fe) (var2.d(-19864));
        while (var3 != null) {
          var3.g(4966);
          var3 = (fe) (var2.a(12537));
        }
    }

    kn(int param0, int param1, int param2, int param3, ad param4) {
        super(param0, param1, param2, param3, param4, (rm) null);
        this.field_G = new ta();
    }

    final static void a(int param0, java.applet.Applet param1) {
        if (param0 != 13569) {
          return;
        }
        try {
          tk.a("", param1, (byte) -3);
          ne.a(param1, 30433);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "kn.SB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        RuntimeException var8 = null;
        fe var9 = null;
        int var10 = 0;
        hh var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = MinerDisturbance.field_ab;
        try {
          var11 = new hh(this.field_G);
          var9 = (fe) (var11.d(-19864));
          while (var9 != null) {
            if (var9.c(param2 + 124)) {
              if (!var9.a(param0, param1 + this.field_t, 0, param3, param4, param5, this.field_u + param6)) {
                var9 = (fe) (var11.a(12537));
                continue;
              }
              return true;
            }
            break;
          }
          if (param2 == 0) {
            return false;
          }
          field_D = (String[][]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("kn.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(')').toString());
        }
    }

    final static String a(String param0, byte param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_9_0 = null;
          Object stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = MinerDisturbance.field_ab;
          try {
            try {
              var3 = (String) (lk.a((byte) 18, "getcookies", param2));
              var4 = h.a(';', true, var3);
              if (param1 != 114) {
                field_D = (String[][]) null;
              }
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(param0)) {
                  stackIn_9_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("kn.NB(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 >= -33) {
          fe var7 = (fe) null;
          this.a(62, -126, -100, 75, (byte) -107, (fe) null, 81);
        }
        super.a(param0, -49, param2, param3, param4);
        this.c((byte) -48);
    }

    final boolean b(fe param0, int param1) {
        RuntimeException var3 = null;
        fe var4 = null;
        hh var5 = null;
        fe var6 = null;
        int var7 = 0;
        fe var8 = null;
        hh var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = MinerDisturbance.field_ab;
        try {
          if (this.field_G.e((byte) 125)) {
            return false;
          }
          var9 = new hh(this.field_G);
          var4 = (fe) (var9.a(true));
          while (var4 != null) {
            if (var4.k(-118)) {
              var5 = new hh(this.field_G);
              var5.a(false, var4);
              var6 = (fe) (var5.c(-126));
              while (var6 != null) {
                if (var6.a(param0, 122)) {
                  return true;
                }
                var6 = (fe) (var5.c(-120));
              }
            }
            var4 = (fe) (var9.c(param1 ^ -122));
          }
          if (param1 == 0) {
            return false;
          }
          var8 = (fe) null;
          this.a((fe) null, -17);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("kn.OB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 != -15) {
          return;
        }
        field_H = (ql[][]) null;
        field_F = null;
        field_D = (String[][]) null;
    }

    fe m(int param0) {
        hh var2;
        fe var3;
        int var4;
        StringBuilder var5;
        var4 = MinerDisturbance.field_ab;
        var2 = new hh(this.field_G);
        if (param0 <= 107) {
          var5 = (StringBuilder) null;
          this.a((byte) 113, (Hashtable) null, 33, (StringBuilder) null);
        }
        var3 = (fe) (var2.d(-19864));
        while (var3 != null) {
          if (var3.k(-98)) {
            return var3;
          }
          var3 = (fe) (var2.a(12537));
        }
        return null;
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, true, param2, param1)) {
            this.a(param1, param3, 34, param2);
            this.b((byte) -84, param1, param2, param3);
          }
          if (param0 != -70) {
            this.a(28, -25, -97, -63, -17);
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kn.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean k(int param0) {
        int var2 = 65 % ((-33 - param0) / 45);
        return null != this.m(127) ? true : false;
    }

    private final void c(byte param0) {
        int var5 = MinerDisturbance.field_ab;
        hh var2 = new hh(this.field_G);
        fe var3 = (fe) (var2.d(-19864));
        int var4 = 72 / ((param0 - 8) / 56);
        while (var3 != null) {
          var3.i(-5257);
          var3 = (fe) (var2.a(12537));
        }
    }

    final void a(int param0, fe param1) {
        if (param0 != -1) {
          return;
        }
        try {
          this.field_G.a((byte) -126, param1);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "kn.TB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = new ql[2][];
        field_D = new String[][]{new String[]{"For basic mining, hold the <img=18> to get set, then press the arrow keys in the direction you want to mine. Check the instructions page for more complex control methods."}};
    }
}
