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
        return null != ((gb) this).e((byte) -116) ? true : false;
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var7 = 0;
        int var8 = Terraphoenix.field_V;
        k var10 = new k(((gb) this).field_C);
        gl var6 = (gl) (Object) var10.a((byte) -13);
        if (param1 != 81) {
            Object var9 = null;
            boolean discarded$0 = ((gb) this).a((byte) 44, (gl) null);
        }
        while (var6 != null) {
            StringBuilder discarded$1 = param2.append(10);
            for (var7 = 0; param3 >= var7; var7++) {
                StringBuilder discarded$2 = param2.append(32);
            }
            StringBuilder discarded$3 = var6.a(34, param2, param3 - -1, param0);
            var6 = (gl) (Object) var10.c(30);
        }
    }

    final boolean a(byte param0, gl param1) {
        int var5 = Terraphoenix.field_V;
        k var3 = new k(((gb) this).field_C);
        gl var4 = (gl) (Object) var3.a((byte) -13);
        while (var4 != null) {
            if (var4.a((byte) 90, param1)) {
                return true;
            }
            var4 = (gl) (Object) var3.c(81);
        }
        if (param0 < 2) {
            field_A = null;
            return false;
        }
        return false;
    }

    final void b(byte param0, gl param1) {
        ((gb) this).field_C.a((uf) (Object) param1, -16611);
        if (param0 != 95) {
            boolean discarded$0 = gb.a((byte) -55, 'ﾬ');
        }
    }

    final static void a(byte param0, nd param1, int param2) {
        uc var3 = di.field_l;
        var3.k(-17410, param2);
        var3.i(5, 3);
        if (param0 != 15) {
            field_A = null;
        }
        var3.i(0, param0 + 70);
        var3.h(param0 ^ -1564407353, param1.field_s);
        var3.i(param1.field_n, -103);
        var3.i(param1.field_j, -102);
    }

    final static void g(int param0) {
        if (param0 != -17464) {
            field_z = null;
        }
        if (!(null == ig.field_e)) {
            ig.field_e.a((byte) -126);
            ig.field_e = null;
        }
    }

    final int d(byte param0) {
        int var5 = 0;
        int var6 = Terraphoenix.field_V;
        int var2 = 0;
        k var3 = new k(((gb) this).field_C);
        gl var4 = (gl) (Object) var3.a((byte) -13);
        while (var4 != null) {
            var5 = var4.d((byte) 107);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (gl) (Object) var3.c(76);
        }
        if (param0 < 23) {
            ((gb) this).field_C = null;
        }
        return var2;
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        int var10 = Terraphoenix.field_V;
        k var8 = new k(((gb) this).field_C);
        gl var9 = (gl) (Object) var8.a((byte) -13);
        while (var9 != null) {
            // ifeq L96
            if (!(!var9.a(false, param1, param2 - -((gb) this).field_u, param3 - -((gb) this).field_w, param4, param5, param6))) {
                return true;
            }
            var9 = (gl) (Object) var8.c(102);
        }
        if (param0) {
            field_D = null;
            return false;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        int var9 = Terraphoenix.field_V;
        k var7 = new k(((gb) this).field_C);
        if (param0 < 36) {
            gl discarded$0 = ((gb) this).e((byte) -50);
        }
        gl var8 = (gl) (Object) var7.a((byte) -13);
        while (var8 != null) {
            // ifeq L101
            var8.a(97, param1, ((gb) this).field_u + param2, ((gb) this).field_w + param3, param4, param5);
            var8 = (gl) (Object) var7.c(45);
        }
    }

    void a(gl param0, int param1, int param2, int param3) {
        int var7 = Terraphoenix.field_V;
        if (param3 <= 25) {
            field_z = null;
        }
        super.a(param0, param1, param2, 101);
        k var5 = new k(((gb) this).field_C);
        gl var6 = (gl) (Object) var5.a((byte) -13);
        while (var6 != null) {
            // ifeq L106
            var6.a(param0, ((gb) this).field_u + param1, ((gb) this).field_w + param2, 73);
            var6 = (gl) (Object) var5.c(66);
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        if (!(!((gb) this).a(param1, param3, param0 ^ -20, param2))) {
            ((gb) this).a(param3, param2, (byte) 27, param1);
            this.a(param3, param0 + 47, param1, param2);
        }
        if (param0 != 34) {
            Object var6 = null;
            boolean discarded$0 = ((gb) this).a('J', (gl) null, -124, 44);
        }
        return param1;
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param3 == 76) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2 < param0) {
              break L2;
            } else {
              if (param2 >= param0 - -param5) {
                break L2;
              } else {
                if (param1 > param4) {
                  break L2;
                } else {
                  if (param4 >= param6 + param1) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 41) {
            break L0;
          } else {
            gb.a(92, 99, -125);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 < 48) {
              break L2;
            } else {
              if (57 < param1) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void c(boolean param0) {
        int var4 = Terraphoenix.field_V;
        if (param0) {
            field_D = null;
        }
        k var2 = new k(((gb) this).field_C);
        gl var3 = (gl) (Object) var2.a((byte) -13);
        while (var3 != null) {
            var3.c(0);
            var3 = (gl) (Object) var2.c(85);
        }
    }

    final static void a(int param0, int param1, int param2) {
        ja.field_i = 15;
        wj.field_a = param2;
        nb.field_g = param0;
        if (param1 != -25786) {
            boolean discarded$0 = gb.a((byte) -77, 'ￎ');
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
        k var2 = new k(((gb) this).field_C);
        gl var3 = (gl) (Object) var2.a((byte) -13);
        while (var3 != null) {
            var3.e(-59);
            var3 = (gl) (Object) var2.c(101);
        }
        if (param0 >= 0) {
            int discarded$0 = ((gb) this).d((byte) 24);
        }
    }

    final boolean a(gl param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        int var10 = Terraphoenix.field_V;
        if (param6 < 6) {
            field_D = null;
        }
        k var8 = new k(((gb) this).field_C);
        gl var9 = (gl) (Object) var8.a((byte) -13);
        while (var9 != null) {
            // ifeq L111
            if (var9.d(-105)) {
                if (!(!var9.a(param0, param1, param2, param3, param4, param5, (byte) 9))) {
                    return true;
                }
            }
            var9 = (gl) (Object) var8.c(92);
        }
        return false;
    }

    final boolean a(gl param0, byte param1) {
        k var5 = null;
        gl var6 = null;
        int var7 = Terraphoenix.field_V;
        if (((gb) this).field_C.a((byte) -51)) {
            return false;
        }
        k var3 = new k(((gb) this).field_C);
        gl var4 = (gl) (Object) var3.a((byte) -13);
        while (var4 != null) {
            if (var4.d(-126)) {
                var5 = new k(((gb) this).field_C);
                uf discarded$0 = var5.a((byte) -113, (uf) (Object) var4);
                var6 = (gl) (Object) var5.c(23);
                while (var6 != null) {
                    if (var6.a((byte) 52, param0)) {
                        return true;
                    }
                    var6 = (gl) (Object) var5.c(15);
                }
            }
            var4 = (gl) (Object) var3.c(112);
        }
        if (param1 < 77) {
            Object var8 = null;
            gb.a((byte) 71, (nd) null, 117);
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = Terraphoenix.field_V;
        if (param2 == 0) {
            if (((gb) this).field_l != null) {
                ((gb) this).field_l.a(param3, (gl) this, param0, -24381, true);
            }
        }
        k var5 = new k(((gb) this).field_C);
        if (param1 >= -106) {
            return;
        }
        gl var6 = (gl) (Object) var5.b(59);
        while (var6 != null) {
            var6.a(param0 + ((gb) this).field_w, -128, param2, param3 + ((gb) this).field_u);
            var6 = (gl) (Object) var5.d(-119);
        }
    }

    gb(int param0, int param1, int param2, int param3, cj param4) {
        super(param0, param1, param2, param3, param4, (sc) null);
        ((gb) this).field_C = new jj();
    }

    final boolean a(int param0, gl param1) {
        k var5 = null;
        gl var6 = null;
        int var7 = Terraphoenix.field_V;
        if (param0 != 48) {
            boolean discarded$0 = ((gb) this).d(115);
        }
        if (((gb) this).field_C.a((byte) -75)) {
            return false;
        }
        k var3 = new k(((gb) this).field_C);
        gl var4 = (gl) (Object) var3.b(81);
        while (var4 != null) {
            if (!(!var4.d(-109))) {
                var5 = new k(((gb) this).field_C);
                uf discarded$1 = var5.a(98, (uf) (Object) var4);
                var6 = (gl) (Object) var5.d(-81);
                while (var6 != null) {
                    if (var6.a((byte) 35, param1)) {
                        return true;
                    }
                    var6 = (gl) (Object) var5.d(-114);
                }
            }
            var4 = (gl) (Object) var3.d(-111);
        }
        return false;
    }

    boolean a(char param0, gl param1, int param2, int param3) {
        int var7 = Terraphoenix.field_V;
        k var5 = new k(((gb) this).field_C);
        gl var6_ref_gl = (gl) (Object) var5.a((byte) -13);
        if (param2 != 30) {
            return false;
        }
        while (var6_ref_gl != null) {
            // ifeq L95
            if (var6_ref_gl.d(-120)) {
                if (var6_ref_gl.a(param0, param1, param2 ^ 0, param3)) {
                    return true;
                }
            }
            var6_ref_gl = (gl) (Object) var5.c(108);
        }
        int var6 = param3;
        if (var6 != 80) {
            return false;
        }
        return !bh.field_e[81] ? ((gb) this).a(param1, (byte) 88) : ((gb) this).a(48, param1);
    }

    final String f(int param0) {
        k var2 = null;
        gl var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = Terraphoenix.field_V;
          var2 = new k(((gb) this).field_C);
          if (param0 >= 70) {
            break L0;
          } else {
            boolean discarded$2 = ((gb) this).d(-26);
            break L0;
          }
        }
        var3 = (gl) (Object) var2.a((byte) -13);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.f(71);
            if (var4 == null) {
              var3 = (gl) (Object) var2.c(32);
              continue L1;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    gl e(byte param0) {
        int var4 = Terraphoenix.field_V;
        k var2 = new k(((gb) this).field_C);
        gl var3 = (gl) (Object) var2.a((byte) -13);
        while (var3 != null) {
            if (!(!var3.d(-108))) {
                return var3;
            }
            var3 = (gl) (Object) var2.c(param0 ^ -10);
        }
        if (param0 == -116) {
            return null;
        }
        boolean discarded$0 = gb.a((byte) -118, 'ﾻ');
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_D = "Login: ";
        field_B = new o();
    }
}
