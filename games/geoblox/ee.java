/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ee extends el implements ql {
    static String field_y;
    static dm field_A;
    tf field_z;
    static String[] field_x;
    static int[] field_B;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var10 = Geoblox.field_C;
        gb var8 = new gb(((ee) this).field_z);
        el var9_ref_el = (el) (Object) var8.c((byte) 88);
        while (var9_ref_el != null) {
            // ifeq L95
            if (!(!var9_ref_el.a(param0 + ((ee) this).field_m, 60, ((ee) this).field_v + param2, param3, param4, param5, param6))) {
                return true;
            }
            var9_ref_el = (el) (Object) var8.a((byte) 109);
        }
        int var9 = -13 / ((-3 - param1) / 38);
        return false;
    }

    final StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        if (param0 != 0) {
            return null;
        }
        if (!(!((ee) this).a(param1, param3, 10095, param2))) {
            ((ee) this).a(param3, param2, 34, param1);
            this.a(param2, param1, -3188, param3);
        }
        return param1;
    }

    final int d(byte param0) {
        int var5 = 0;
        int var6 = Geoblox.field_C;
        int var2 = 0;
        gb var3 = new gb(((ee) this).field_z);
        el var4 = (el) (Object) var3.c((byte) 88);
        if (param0 < 82) {
            field_y = null;
        }
        while (var4 != null) {
            var5 = var4.d((byte) 91);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (el) (Object) var3.a((byte) 110);
        }
        return var2;
    }

    final boolean e(byte param0) {
        if (param0 != 54) {
            Object var3 = null;
            this.a((Hashtable) null, (StringBuilder) null, -120, -15);
        }
        return null != ((ee) this).f((byte) -99) ? true : false;
    }

    final boolean a(int param0, el param1) {
        gb var5 = null;
        el var6 = null;
        int var7 = Geoblox.field_C;
        if (((ee) this).field_z.c(13519)) {
            return false;
        }
        gb var8 = new gb(((ee) this).field_z);
        el var4 = (el) (Object) var8.d(1);
        if (param0 != 7305) {
            field_B = null;
        }
        while (var4 != null) {
            if (!(!var4.e((byte) 54))) {
                var5 = new gb(((ee) this).field_z);
                hf discarded$0 = var5.a((hf) (Object) var4, (byte) 123);
                var6 = (el) (Object) var5.c(26);
                while (var6 != null) {
                    if (var6.a((byte) -39, param1)) {
                        return true;
                    }
                    var6 = (el) (Object) var5.c(26);
                }
            }
            var4 = (el) (Object) var8.c(26);
        }
        return false;
    }

    void a(boolean param0, int param1, el param2, int param3) {
        int var7 = Geoblox.field_C;
        super.a(param0, param1, param2, param3);
        gb var5 = new gb(((ee) this).field_z);
        el var6 = (el) (Object) var5.c((byte) 88);
        while (var6 != null) {
            // ifeq L89
            var6.a(false, ((ee) this).field_m + param1, param2, ((ee) this).field_v + param3);
            var6 = (el) (Object) var5.a((byte) 123);
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var8 = Geoblox.field_C;
        if (param3 == 0) {
            if (!(((ee) this).field_q == null)) {
                ((ee) this).field_q.a(param0, -9, param1, true, (el) this);
            }
        }
        int var6 = -58 % ((param2 - 1) / 43);
        gb var5 = new gb(((ee) this).field_z);
        el var7 = (el) (Object) var5.d(1);
        while (var7 != null) {
            var7.a(((ee) this).field_v + param0, param1 - -((ee) this).field_m, (byte) 93, param3);
            var7 = (el) (Object) var5.c(26);
        }
    }

    public static void e(int param0) {
        if (param0 != 14078) {
            return;
        }
        field_x = null;
        field_y = null;
        field_B = null;
        field_A = null;
    }

    final String c(byte param0) {
        gb var2 = null;
        el var3 = null;
        String var4 = null;
        L0: {
          var2 = new gb(((ee) this).field_z);
          if (param0 == 69) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        var3 = (el) (Object) var2.c((byte) 88);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 69);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (el) (Object) var2.a((byte) 111);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    private final void g(byte param0) {
        gb var2 = new gb(((ee) this).field_z);
        el var3 = (el) (Object) var2.c((byte) 88);
        while (var3 != null) {
            var3.c(116);
            var3 = (el) (Object) var2.a((byte) 108);
        }
        int var4 = 71 / ((param0 - 57) / 51);
    }

    final boolean a(el param0, int param1) {
        gb var5 = null;
        el var6 = null;
        int var7 = Geoblox.field_C;
        if (((ee) this).field_z.c(13519)) {
            return false;
        }
        gb var3 = new gb(((ee) this).field_z);
        if (param1 > -75) {
            return true;
        }
        el var4 = (el) (Object) var3.c((byte) 88);
        while (var4 != null) {
            if (!(!var4.e((byte) 54))) {
                var5 = new gb(((ee) this).field_z);
                hf discarded$0 = var5.a((byte) 56, (hf) (Object) var4);
                var6 = (el) (Object) var5.a((byte) 114);
                while (var6 != null) {
                    if (var6.a((byte) -56, param0)) {
                        return true;
                    }
                    var6 = (el) (Object) var5.a((byte) 114);
                }
            }
            var4 = (el) (Object) var3.a((byte) 109);
        }
        return false;
    }

    final void d(int param0) {
        int var4 = Geoblox.field_C;
        gb var2 = new gb(((ee) this).field_z);
        if (param0 > -122) {
            field_B = null;
        }
        el var3 = (el) (Object) var2.c((byte) 88);
        while (var3 != null) {
            var3.d(-126);
            var3 = (el) (Object) var2.a((byte) 121);
        }
    }

    ee(int param0, int param1, int param2, int param3, dh param4) {
        super(param0, param1, param2, param3, param4, (bb) null);
        ((ee) this).field_z = new tf();
    }

    final boolean a(byte param0, el param1) {
        int var5 = Geoblox.field_C;
        gb var3 = new gb(((ee) this).field_z);
        if (param0 >= -30) {
            return false;
        }
        el var4 = (el) (Object) var3.c((byte) 88);
        while (var4 != null) {
            if (var4.a((byte) -123, param1)) {
                return true;
            }
            var4 = (el) (Object) var3.a((byte) 125);
        }
        return false;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) -21, param3, param4);
        if (param2 >= -6) {
            String discarded$0 = ((ee) this).c((byte) 85);
        }
        this.g((byte) 123);
    }

    final void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        int var9 = Geoblox.field_C;
        gb var7 = new gb(((ee) this).field_z);
        el var8 = (el) (Object) var7.c((byte) 88);
        while (var8 != null) {
            // ifeq L85
            var8.a(param0 - -((ee) this).field_v, param1, true, param3, ((ee) this).field_m + param4, param5);
            var8 = (el) (Object) var7.a((byte) 109);
        }
        if (!param2) {
            String discarded$0 = ((ee) this).c((byte) -6);
        }
    }

    boolean a(int param0, int param1, char param2, el param3) {
        int var7 = Geoblox.field_C;
        gb var9 = new gb(((ee) this).field_z);
        if (param1 != 13) {
            ((ee) this).d(-77);
        }
        el var8 = (el) (Object) var9.c((byte) 88);
        while (var8 != null) {
            // ifeq L104
            if (var8.e((byte) 54)) {
                if (!(!var8.a(param0, 13, param2, param3))) {
                    return true;
                }
            }
            var8 = (el) (Object) var9.a((byte) 110);
        }
        int var6 = param0;
        if (-81 != (var6 ^ -1)) {
            return false;
        }
        return kj.field_o[81] ? ((ee) this).a(7305, param3) : ((ee) this).a(param3, -96);
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        int var7 = 0;
        int var8 = Geoblox.field_C;
        gb var10 = new gb(((ee) this).field_z);
        el var6 = (el) (Object) var10.c((byte) 88);
        if (param2 != -3188) {
            Object var9 = null;
            ((ee) this).a(true, 26, (el) null, 23);
        }
        while (var6 != null) {
            StringBuilder discarded$0 = param1.append(10);
            for (var7 = 0; param3 >= var7; var7++) {
                StringBuilder discarded$1 = param1.append(32);
            }
            StringBuilder discarded$2 = var6.a(0, param1, param0, param3 + 1);
            var6 = (el) (Object) var10.a((byte) 125);
        }
    }

    el f(byte param0) {
        gb var2 = null;
        el var3 = null;
        int var4 = 0;
        L0: {
          var4 = Geoblox.field_C;
          if (param0 < -60) {
            break L0;
          } else {
            field_y = null;
            break L0;
          }
        }
        var2 = new gb(((ee) this).field_z);
        var3 = (el) (Object) var2.c((byte) 88);
        L1: while (true) {
          if (var3 != null) {
            if (var3.e((byte) 54)) {
              return var3;
            } else {
              var3 = (el) (Object) var2.a((byte) 121);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void b(byte param0, el param1) {
        ((ee) this).field_z.a(-113, (hf) (Object) param1);
        if (param0 >= -60) {
            field_A = null;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, el param5, int param6) {
        int var10 = Geoblox.field_C;
        gb var11 = new gb(((ee) this).field_z);
        if (param3 != -1) {
            ((ee) this).a(-119, -117, (byte) 87, 105, 63);
        }
        el var9 = (el) (Object) var11.c((byte) 88);
        while (var9 != null) {
            // ifeq L116
            if (var9.e((byte) 54)) {
                if (var9.a(param0, param1, param2, param3 + 0, param4, param5, param6)) {
                    return true;
                }
            }
            var9 = (el) (Object) var11.a((byte) 124);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "To server list";
        field_x = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_B = new int[]{1, 2, 0, 3, 6, 5, 4};
    }
}
