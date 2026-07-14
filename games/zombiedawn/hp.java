/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hp extends ga implements jf {
    vo field_x;
    static af field_z;
    static dk field_A;
    static mf field_B;
    static String field_y;
    static li field_E;
    static int field_D;
    static boolean field_C;

    private final void a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        int var7 = 0;
        int var8 = ZombieDawn.field_J;
        if (!param1) {
            return;
        }
        cj var5 = new cj(((hp) this).field_x);
        ga var6 = (ga) (Object) var5.c((byte) -128);
        while (var6 != null) {
            StringBuilder discarded$0 = param0.append(10);
            for (var7 = 0; param2 >= var7; var7++) {
                StringBuilder discarded$1 = param0.append(32);
            }
            StringBuilder discarded$2 = var6.a(param3, param0, param1, 1 + param2);
            var6 = (ga) (Object) var5.a((byte) 61);
        }
    }

    void c(byte param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != 57) {
            return;
        }
        cj var2 = new cj(((hp) this).field_x);
        ga var3 = (ga) (Object) var2.c((byte) -115);
        while (var3 != null) {
            var3.c((byte) 57);
            var3 = (ga) (Object) var2.a((byte) 61);
        }
    }

    final boolean b(byte param0, ga param1) {
        cj var6 = null;
        ga var7 = null;
        int var8 = ZombieDawn.field_J;
        if (((hp) this).field_x.a((byte) -123)) {
            return false;
        }
        int var4 = 2 / ((66 - param0) / 53);
        cj var3 = new cj(((hp) this).field_x);
        ga var5 = (ga) (Object) var3.b((byte) -21);
        while (var5 != null) {
            if (!(!var5.e(-17741))) {
                var6 = new cj(((hp) this).field_x);
                le discarded$0 = var6.a((le) (Object) var5, (byte) -128);
                var7 = (ga) (Object) var6.a(17);
                while (var7 != null) {
                    if (var7.a((byte) 90, param1)) {
                        return true;
                    }
                    var7 = (ga) (Object) var6.a(17);
                }
            }
            var5 = (ga) (Object) var3.a(17);
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        int var10 = ZombieDawn.field_J;
        cj var8 = new cj(((hp) this).field_x);
        ga var9 = (ga) (Object) var8.c((byte) -127);
        if (param1 != 1) {
            return true;
        }
        while (var9 != null) {
            // ifeq L101
            if (!(!var9.a(param0, 1, ((hp) this).field_j + param2, param3, ((hp) this).field_k + param4, param5, param6))) {
                return true;
            }
            var9 = (ga) (Object) var8.a((byte) 61);
        }
        return false;
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        int var8 = ZombieDawn.field_J;
        cj var9 = new cj(((hp) this).field_x);
        int var6 = 65 % ((param0 - -83) / 32);
        ga var7 = (ga) (Object) var9.c((byte) -118);
        while (var7 != null) {
            // ifeq L102
            if (var7.e(-17741)) {
                if (!(!var7.a(43, param1, param2, param3))) {
                    return true;
                }
            }
            var7 = (ga) (Object) var9.a((byte) 61);
        }
        var6 = param1;
        if ((var6 ^ -1) == -81) {
            return bo.field_p[81] ? ((hp) this).b((byte) 119, param2) : ((hp) this).a(1, param2);
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawn.field_J;
        if (-1 == (param1 ^ -1)) {
            if (((hp) this).field_h != null) {
                ((hp) this).field_h.a(param3 + 16777215, true, param0, (ga) this, param2);
            }
        }
        cj var9 = new cj(((hp) this).field_x);
        if (param3 != 0) {
            Object var8 = null;
            boolean discarded$0 = ((hp) this).a(108, 83, -6, 30, 111, -93, (ga) null);
        }
        ga var6 = (ga) (Object) var9.b((byte) -21);
        while (var6 != null) {
            var6.a(param0 + ((hp) this).field_j, param1, param2 + ((hp) this).field_k, param3 + 0);
            var6 = (ga) (Object) var9.a(17);
        }
    }

    String d(int param0) {
        String var4_ref = null;
        int var5 = ZombieDawn.field_J;
        cj var2 = new cj(((hp) this).field_x);
        ga var3 = (ga) (Object) var2.c((byte) -123);
        while (var3 != null) {
            var4_ref = var3.d(100);
            if (var4_ref != null) {
                return var4_ref;
            }
            var3 = (ga) (Object) var2.a((byte) 61);
        }
        int var4 = -5 / ((10 - param0) / 58);
        return null;
    }

    final boolean a(int param0, ga param1) {
        cj var5 = null;
        ga var6 = null;
        int var7 = ZombieDawn.field_J;
        if (((hp) this).field_x.a((byte) -121)) {
            return false;
        }
        cj var8 = new cj(((hp) this).field_x);
        ga var4 = (ga) (Object) var8.c((byte) -118);
        if (param0 != 1) {
            field_y = null;
        }
        while (var4 != null) {
            if (!(!var4.e(-17741))) {
                var5 = new cj(((hp) this).field_x);
                le discarded$0 = var5.a(-3549, (le) (Object) var4);
                var6 = (ga) (Object) var5.a((byte) 61);
                while (var6 != null) {
                    if (var6.a((byte) 96, param1)) {
                        return true;
                    }
                    var6 = (ga) (Object) var5.a((byte) 61);
                }
            }
            var4 = (ga) (Object) var8.a((byte) 61);
        }
        return false;
    }

    final boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var10 = ZombieDawn.field_J;
        cj var8 = new cj(((hp) this).field_x);
        ga var9 = (ga) (Object) var8.c((byte) -122);
        while (var9 != null) {
            // ifeq L95
            if (var9.e(-17741)) {
                if (!(!var9.a(param0, param1, param2, param3, param4, param5, param6))) {
                    return true;
                }
            }
            var9 = (ga) (Object) var8.a((byte) 61);
        }
        if (!param5) {
            return true;
        }
        return false;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        if (((hp) this).a(param0, param1, 11098, param3)) {
            ((hp) this).a(param0, param3, 69, param1);
            this.a(param1, param2, param3, param0);
        }
        if (!param2) {
            return null;
        }
        return param1;
    }

    void a(ga param0, byte param1, int param2, int param3) {
        int var8 = ZombieDawn.field_J;
        super.a(param0, (byte) -116, param2, param3);
        cj var5 = new cj(((hp) this).field_x);
        int var6 = -6 % ((param1 - 46) / 42);
        ga var7 = (ga) (Object) var5.c((byte) -128);
        while (var7 != null) {
            // ifeq L104
            var7.a(param0, (byte) -75, param2 + ((hp) this).field_j, param3 - -((hp) this).field_k);
            var7 = (ga) (Object) var5.a((byte) 61);
        }
    }

    ga d(byte param0) {
        cj var2 = null;
        ga var3 = null;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          var2 = new cj(((hp) this).field_x);
          if (param0 == 35) {
            break L0;
          } else {
            ((hp) this).field_x = null;
            break L0;
          }
        }
        var3 = (ga) (Object) var2.c((byte) -126);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.e(-17741)) {
              var3 = (ga) (Object) var2.a((byte) 61);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 38 / ((param0 - -23) / 48);
        super.a(85, param1, param2, param3, param4);
        this.g(-115);
    }

    public static void f(int param0) {
        field_B = null;
        if (param0 < 82) {
            hp.f(-94);
        }
        field_y = null;
        field_A = null;
        field_z = null;
        field_E = null;
    }

    boolean a(byte param0, ga param1) {
        int var5 = ZombieDawn.field_J;
        cj var3 = new cj(((hp) this).field_x);
        if (param0 < 67) {
            return false;
        }
        ga var4 = (ga) (Object) var3.c((byte) -126);
        while (var4 != null) {
            if (!(!var4.a((byte) 100, param1))) {
                return true;
            }
            var4 = (ga) (Object) var3.a((byte) 61);
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        int var9 = ZombieDawn.field_J;
        cj var7 = new cj(((hp) this).field_x);
        ga var8 = (ga) (Object) var7.c((byte) -121);
        while (var8 != null) {
            // ifeq L85
            var8.a(((hp) this).field_k + param0, 21, param2, param3, ((hp) this).field_j + param4, param5);
            var8 = (ga) (Object) var7.a((byte) 61);
        }
        if (param1 < 1) {
            ((hp) this).field_x = null;
        }
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        int var2 = param0;
        cj var3 = new cj(((hp) this).field_x);
        ga var4 = (ga) (Object) var3.c((byte) -119);
        while (var4 != null) {
            var5 = var4.c(param0 ^ 0);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (ga) (Object) var3.a((byte) 61);
        }
        return var2;
    }

    boolean e(int param0) {
        if (param0 != -17741) {
            return false;
        }
        return null != ((hp) this).d((byte) 35) ? true : false;
    }

    final void a(ga param0, int param1) {
        ((hp) this).field_x.a(0, (le) (Object) param0);
        if (param1 != 10) {
            int discarded$0 = ((hp) this).c(30);
        }
    }

    private final void g(int param0) {
        int var4 = ZombieDawn.field_J;
        cj var2 = new cj(((hp) this).field_x);
        ga var3 = (ga) (Object) var2.c((byte) -122);
        while (var3 != null) {
            var3.a(true);
            var3 = (ga) (Object) var2.a((byte) 61);
        }
        if (param0 > -78) {
            field_C = false;
        }
    }

    hp(int param0, int param1, int param2, int param3, io param4) {
        super(param0, param1, param2, param3, param4, (sk) null);
        ((hp) this).field_x = new vo();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new af();
        field_y = "Time remaining: ";
        field_C = false;
        field_D = 0;
    }
}
