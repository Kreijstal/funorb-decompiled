/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gnb {
    static String field_f;
    private int field_d;
    private int field_g;
    private ksa field_b;
    private ksa field_e;
    static int field_a;
    private ksa[] field_c;

    final ksa b(int param0) {
        ksa var2 = null;
        int var3 = VoidHunters.field_G;
        if (param0 > -42) {
            ((gnb) this).field_b = null;
        }
        if (((gnb) this).field_g > 0) {
            if (((gnb) this).field_e != ((gnb) this).field_c[((gnb) this).field_g + -1]) {
                var2 = ((gnb) this).field_e;
                ((gnb) this).field_e = var2.field_c;
                return var2;
            }
        }
        do {
            if (((gnb) this).field_g >= ((gnb) this).field_d) {
                return null;
            }
            ((gnb) this).field_g = ((gnb) this).field_g + 1;
            var2 = ((gnb) this).field_c[((gnb) this).field_g].field_c;
        } while (((gnb) this).field_c[-1 + ((gnb) this).field_g] == var2);
        ((gnb) this).field_e = var2.field_c;
        return var2;
    }

    final void a(long param0, ksa param1, byte param2) {
        if (null != param1.field_a) {
            param1.b(-3846);
        }
        if (param2 >= -112) {
            return;
        }
        ksa var5 = ((gnb) this).field_c[(int)(param0 & (long)(-1 + ((gnb) this).field_d))];
        param1.field_c = var5;
        param1.field_a = var5.field_a;
        param1.field_a.field_c = param1;
        param1.field_c.field_a = param1;
        param1.field_b = param0;
    }

    final static int a(Random param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        var2 = hob.a(param0, oea.field_o, 120);
        var3 = 0;
        L0: while (true) {
          if (56 <= var3) {
            if (param1 > 52) {
              throw new IllegalStateException("No asteroid type found. number_of_asteroids=" + oea.field_o);
            } else {
              return 14;
            }
          } else {
            if (tr.a(108, var3)) {
              if (0 != var2) {
                var2--;
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final static ibb a(int param0, ue[] param1, jp param2) {
        int var3_int = 0;
        int var5 = 0;
        byte[] var11 = null;
        int var7 = 0;
        int var6 = VoidHunters.field_G;
        for (var3_int = 0; var3_int < param1.length; var3_int++) {
            if (param1[var3_int] == null) {
                return null;
            }
            if (0L >= param1[var3_int].field_d) {
                return null;
            }
        }
        long var3 = jaggl.OpenGL.glCreateProgramObjectARB();
        for (var5 = 0; var5 < param1.length; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3, param1[var5].field_d);
        }
        jaggl.OpenGL.glLinkProgramARB(var3);
        jaggl.OpenGL.glGetObjectParameterivARB(var3, 35714, hg.field_a, 0);
        if (!(0 != hg.field_a[param0])) {
            if (0 == hg.field_a[0]) {
                System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3, 35716, hg.field_a, 1);
            if (hg.field_a[1] > 1) {
                var11 = new byte[hg.field_a[1]];
                jaggl.OpenGL.glGetInfoLogARB(var3, hg.field_a[1], hg.field_a, 0, var11, 0);
                System.out.println(new String(var11));
            }
            if (!(0 != hg.field_a[0])) {
                var7 = 0;
                var5 = var7;
                while (var7 < param1.length) {
                    jaggl.OpenGL.glDetachObjectARB(var3, param1[var7].field_d);
                    var7++;
                }
                jaggl.OpenGL.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new ibb(param2, var3, param1);
    }

    final ksa a(long param0, int param1) {
        ksa var5 = null;
        int var6 = VoidHunters.field_G;
        if (param1 <= 96) {
            field_f = null;
        }
        ksa var4 = ((gnb) this).field_c[(int)(param0 & (long)(((gnb) this).field_d - 1))];
        ((gnb) this).field_b = var4.field_c;
        while (var4 != ((gnb) this).field_b) {
            if (((gnb) this).field_b.field_b == param0) {
                var5 = ((gnb) this).field_b;
                ((gnb) this).field_b = ((gnb) this).field_b.field_c;
                return var5;
            }
            ((gnb) this).field_b = ((gnb) this).field_b.field_c;
        }
        ((gnb) this).field_b = null;
        return null;
    }

    final void a(byte param0) {
        int var2 = 0;
        ksa var3 = null;
        ksa var4 = null;
        int var5 = VoidHunters.field_G;
        if (param0 != -103) {
            ((gnb) this).a((byte) -13);
        }
        for (var2 = 0; var2 < ((gnb) this).field_d; var2++) {
            var3 = ((gnb) this).field_c[var2];
            while (true) {
                var4 = var3.field_c;
                if (var3 == var4) {
                    break;
                }
                var4.b(-3846);
            }
        }
        ((gnb) this).field_b = null;
        ((gnb) this).field_e = null;
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 < 17) {
            field_a = -8;
        }
    }

    final static void a(int param0) {
        if (!(cgb.field_a)) {
            throw new IllegalStateException();
        }
        djb.field_r = true;
        aka.a(true, param0 ^ -125);
        qmb.field_q = param0;
    }

    gnb(int param0) {
        int var2 = 0;
        ksa var3 = null;
        ((gnb) this).field_g = 0;
        ((gnb) this).field_d = param0;
        ((gnb) this).field_c = new ksa[param0];
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new ksa();
            ((gnb) this).field_c[var2] = new ksa();
            var3.field_c = var3;
            var3.field_a = var3;
        }
    }

    final ksa c(byte param0) {
        ((gnb) this).field_g = 0;
        int var2 = -14 % ((85 - param0) / 35);
        return ((gnb) this).b(-58);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 92;
        field_f = "This password contains your email address, and would be easy to guess";
    }
}
