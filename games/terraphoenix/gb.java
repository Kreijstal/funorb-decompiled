/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gb extends gl implements sf {
    jj field_C;
    static o field_B;
    static String field_A;
    static vb field_z;
    static vg field_E;
    static String field_D;

    final boolean d(int param0) {
        if (param0 > -103) {
          return true;
        }
        return null != this.e((byte) -116) ? true : false;
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        gl var6 = null;
        int var8 = 0;
        gl var9 = null;
        k var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = Terraphoenix.field_V;
        try {
          var10 = new k(this.field_C);
          var6 = (gl) (var10.a((byte) -13));
          if (param1 != 81) {
            var9 = (gl) null;
            this.a((byte) 44, (gl) null);
          }
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; param3 >= var7; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.a(34, param2, param3 + 1, param0);
            var6 = (gl) (var10.c(30));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("gb.BA(");
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
          throw qk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(byte param0, gl param1) {
        k var3 = null;
        RuntimeException var3_ref = null;
        gl var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          var3 = new k(this.field_C);
          var4 = (gl) (var3.a((byte) -13));
          while (true) {
            if (var4 == null) {
              if (param0 >= 2) {
                return false;
              }
              field_A = (String) null;
              return false;
            }
            if (!var4.a((byte) 90, param1)) {
              var4 = (gl) (var3.c(81));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("gb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void b(byte param0, gl param1) {
        try {
          this.field_C.a(param1, -16611);
          if (param0 != 95) {
            gb.a((byte) -55, 'ﾬ');
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "gb.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, nd param1, int param2) {
        uc var3 = null;
        try {
          var3 = di.field_l;
          var3.k(-17410, param2);
          var3.i(5, 3);
          if (param0 != 15) {
            field_A = (String) null;
          }
          var3.i(0, param0 + 70);
          var3.h(param0 ^ -1564407353, param1.field_s);
          var3.i(param1.field_n, -103);
          var3.i(param1.field_j, -102);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "gb.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void g(int param0) {
        if (param0 != -17464) {
          field_z = (vb) null;
        }
        if (null != ig.field_e) {
          ig.field_e.a((byte) -126);
          ig.field_e = null;
        }
    }

    final int d(byte param0) {
        int var2;
        k var3;
        gl var4;
        int var5;
        int var6;
        var6 = Terraphoenix.field_V;
        var2 = 0;
        var3 = new k(this.field_C);
        var4 = (gl) (var3.a((byte) -13));
        while (var4 != null) {
          var5 = var4.d((byte) 107);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (gl) (var3.c(76));
        }
        if (param0 < 23) {
          this.field_C = (jj) null;
        }
        return var2;
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        RuntimeException var8 = null;
        gl var9 = null;
        int var10 = 0;
        k var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Terraphoenix.field_V;
        try {
          var11 = new k(this.field_C);
          var9 = (gl) (var11.a((byte) -13));
          while (var9 != null) {
            if (var9.a((byte) -109)) {
              if (var9.a(false, param1, param2 + this.field_u, param3 + this.field_w, param4, param5, param6)) {
                return true;
              }
              var9 = (gl) (var11.c(102));
              continue;
            }
            break;
          }
          if (!param0) {
            return false;
          }
          field_D = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("gb.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        RuntimeException runtimeException = null;
        k var7 = null;
        gl var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Terraphoenix.field_V;
        try {
          var7 = new k(this.field_C);
          if (param0 < 36) {
            this.e((byte) -50);
          }
          var8 = (gl) (var7.a((byte) -13));
          while (var8 != null) {
            if (var8.a((byte) -111)) {
              var8.a(97, param1, this.field_u + param2, this.field_w + param3, param4, param5);
              var8 = (gl) (var7.c(45));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("gb.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void a(gl param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        k var5 = null;
        gl var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Terraphoenix.field_V;
        try {
          if (param3 <= 25) {
            field_z = (vb) null;
          }
          super.a(param0, param1, param2, 101);
          var5 = new k(this.field_C);
          var6 = (gl) (var5.a((byte) -13));
          while (var6 != null) {
            if (var6.a((byte) -117)) {
              var6.a(param0, this.field_u + param1, this.field_w + param2, 73);
              var6 = (gl) (var5.c(66));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("gb.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        gl var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param3, param0 ^ -20, param2)) {
            this.a(param3, param2, (byte) 27, param1);
            this.a(param3, param0 + 47, param1, param2);
          }
          if (param0 != 34) {
            var6 = (gl) null;
            this.a('J', (gl) null, -124, 44);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gb.KA(").append(param0).append(',');
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
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param3 != 76) {
          field_A = (String) null;
        }
        stackIn_8_0 = (param2 >= param0) && (param2 < param0 + param5) && (param1 <= param4) && (param4 < param6 + param1);
        return stackIn_8_0;
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_6_0 = false;
        if (param0 != 41) {
          gb.a(92, 99, -125);
        }
        stackIn_6_0 = (param1 >= 48) && (57 >= param1);
        return stackIn_6_0;
    }

    private final void c(boolean param0) {
        int var4 = Terraphoenix.field_V;
        if (param0) {
          field_D = (String) null;
        }
        k var2 = new k(this.field_C);
        gl var3 = (gl) (var2.a((byte) -13));
        while (var3 != null) {
          var3.c(0);
          var3 = (gl) (var2.c(85));
        }
    }

    final static void a(int param0, int param1, int param2) {
        ja.field_i = 15;
        wj.field_a = param2;
        nb.field_g = param0;
        if (param1 != -25786) {
          gb.a((byte) -77, 'ￎ');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 45) {
          this.c(false);
        }
        super.a(param0, (byte) 122, param2, param3, param4);
        this.c(false);
    }

    public static void b(boolean param0) {
        field_B = null;
        field_z = null;
        field_E = null;
        field_A = null;
        if (param0) {
          return;
        }
        field_D = null;
    }

    final void e(int param0) {
        int var4 = Terraphoenix.field_V;
        k var2 = new k(this.field_C);
        gl var3 = (gl) (var2.a((byte) -13));
        while (var3 != null) {
          var3.e(-59);
          var3 = (gl) (var2.c(101));
        }
        if (param0 >= 0) {
          this.d((byte) 24);
        }
    }

    final boolean a(gl param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        k var8 = null;
        RuntimeException var8_ref = null;
        gl var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Terraphoenix.field_V;
        try {
          if (param6 < 6) {
            field_D = (String) null;
          }
          var8 = new k(this.field_C);
          var9 = (gl) (var8.a((byte) -13));
          while (var9 != null) {
            if (var9.a((byte) -59)) {
              if (var9.d(-105) &&
                var9.a(param0, param1, param2, param3, param4, param5, (byte) 9)) {
                return true;
              }
              var9 = (gl) (var8.c(92));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("gb.DB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(gl param0, byte param1) {
        RuntimeException var3 = null;
        gl var4 = null;
        k var5 = null;
        gl var6 = null;
        int var7 = 0;
        nd var8 = null;
        k var9 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Terraphoenix.field_V;
        try {
          if (this.field_C.a((byte) -51)) {
            return false;
          }
          var9 = new k(this.field_C);
          var4 = (gl) (var9.a((byte) -13));
          while (var4 != null) {
            if (var4.d(-126)) {
              var5 = new k(this.field_C);
              var5.a((byte) -113, (uf) (var4));
              var6 = (gl) (var5.c(23));
              while (var6 != null) {
                if (!var6.a((byte) 52, param0)) {
                  var6 = (gl) (var5.c(15));
                  continue;
                }
                return true;
              }
            }
            var4 = (gl) (var9.c(112));
          }
          if (param1 < 77) {
            var8 = (nd) null;
            gb.a((byte) 71, (nd) null, 117);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("gb.V(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = Terraphoenix.field_V;
        if (param2 == 0 &&
          this.field_l != null) {
          this.field_l.a(param3, (gl) (this), param0, -24381, true);
        }
        k var5 = new k(this.field_C);
        if (param1 >= -106) {
          return;
        }
        gl var6 = (gl) (var5.b(59));
        while (var6 != null) {
          var6.a(param0 + this.field_w, -128, param2, param3 + this.field_u);
          var6 = (gl) (var5.d(-119));
        }
    }

    gb(int param0, int param1, int param2, int param3, cj param4) {
        super(param0, param1, param2, param3, param4, (sc) null);
        this.field_C = new jj();
    }

    final boolean a(int param0, gl param1) {
        RuntimeException var3 = null;
        gl var4 = null;
        k var5 = null;
        gl var6 = null;
        int var7 = 0;
        k var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Terraphoenix.field_V;
        try {
          if (param0 != 48) {
            this.d(115);
          }
          if (this.field_C.a((byte) -75)) {
            return false;
          }
          var8 = new k(this.field_C);
          var4 = (gl) (var8.b(81));
          while (var4 != null) {
            if (var4.d(-109)) {
              var5 = new k(this.field_C);
              var5.a(98, var4);
              var6 = (gl) (var5.d(-81));
              while (var6 != null) {
                if (!var6.a((byte) 35, param1)) {
                  var6 = (gl) (var5.d(-114));
                  continue;
                }
                return true;
              }
            }
            var4 = (gl) (var8.d(-111));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("gb.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        gl var6_ref_gl = null;
        int var6 = 0;
        int var7 = 0;
        k var8 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Terraphoenix.field_V;
        try {
          var8 = new k(this.field_C);
          var6_ref_gl = (gl) (var8.a((byte) -13));
          if (param2 != 30) {
            return false;
          }
          while (var6_ref_gl != null) {
            if (var6_ref_gl.a((byte) -61)) {
              if (var6_ref_gl.d(-120) &&
                var6_ref_gl.a(param0, param1, param2 ^ 0, param3)) {
                return true;
              }
              var6_ref_gl = (gl) (var8.c(108));
              continue;
            }
            break;
          }
          var6 = param3;
          if (var6 != 80) {
            return false;
          }
          if (bh.field_e[81]) {
            stackIn_16_0 = this.a(48, param1);
          } else {
            stackIn_16_0 = this.a(param1, (byte) 88);
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("gb.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final String f(int param0) {
        k var2;
        gl var3;
        String var4;
        int var5;
        var5 = Terraphoenix.field_V;
        var2 = new k(this.field_C);
        if (param0 < 70) {
          this.d(-26);
        }
        var3 = (gl) (var2.a((byte) -13));
        while (var3 != null) {
          var4 = var3.f(71);
          if (var4 != null) {
            return var4;
          }
          var3 = (gl) (var2.c(32));
        }
        return null;
    }

    gl e(byte param0) {
        int var4 = Terraphoenix.field_V;
        k var2 = new k(this.field_C);
        gl var3 = (gl) (var2.a((byte) -13));
        while (var3 != null) {
          if (var3.d(-108)) {
            return var3;
          }
          var3 = (gl) (var2.c(param0 ^ -10));
        }
        if (param0 == -116) {
          return null;
        }
        gb.a((byte) -118, 'ﾻ');
        return null;
    }

    static {
        field_A = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_D = "Login: ";
        field_B = new o();
    }
}
