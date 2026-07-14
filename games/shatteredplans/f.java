/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class f extends vg implements ni {
    static String field_z;
    static boolean field_C;
    static int[] field_y;
    static String field_B;
    pf field_A;

    final boolean a(int param0, int param1, int param2, vg param3, int param4, int param5, int param6) {
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 0) {
            Object var11 = null;
            boolean discarded$0 = ((f) this).a(118, -43, -76, (vg) null, 87, 88, 5);
        }
        on var12 = new on(((f) this).field_A);
        vg var9 = (vg) (Object) var12.a(2);
        while (var9 != null) {
            // ifeq L122
            if (var9.f(1)) {
                if (var9.a(0, param1, param2, param3, param4, param5, param6)) {
                    return true;
                }
            }
            var9 = (vg) (Object) var12.a((byte) 58);
        }
        return false;
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        on var12 = new on(((f) this).field_A);
        if (param2 < 95) {
            Object var11 = null;
            boolean discarded$0 = ((f) this).a((vg) null, -47);
        }
        vg var9 = (vg) (Object) var12.a(2);
        while (var9 != null) {
            // ifeq L115
            if (var9.a(param0, param1, (byte) 109, param3, param4 + ((f) this).field_m, param5 + ((f) this).field_q, param6)) {
                return true;
            }
            var9 = (vg) (Object) var12.a((byte) 87);
        }
        return false;
    }

    boolean a(int param0, char param1, int param2, vg param3) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        on var8 = new on(((f) this).field_A);
        vg var6_ref_vg = (vg) (Object) var8.a(param2 ^ 15);
        while (var6_ref_vg != null) {
            // ifeq L93
            if (var6_ref_vg.f(1)) {
                if (!(!var6_ref_vg.a(param0, param1, 13, param3))) {
                    return true;
                }
            }
            var6_ref_vg = (vg) (Object) var8.a((byte) 84);
        }
        if (param2 != 13) {
            return true;
        }
        int var6 = param0;
        if (var6 != 80) {
            return false;
        }
        return !di.field_p[81] ? ((f) this).a(param3, param2 + 105) : ((f) this).a(param3, true);
    }

    vg i(int param0) {
        on var2 = null;
        vg var3 = null;
        int var4 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = new on(((f) this).field_A);
          if (param0 == 1) {
            break L0;
          } else {
            field_C = true;
            break L0;
          }
        }
        var3 = (vg) (Object) var2.a(param0 ^ 3);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.f(1)) {
              var3 = (vg) (Object) var2.a((byte) 121);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 103, param3, param4);
        if (param2 < 99) {
            vg discarded$0 = ((f) this).i(-8);
        }
        this.h(-87);
    }

    private final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        on var5 = new on(((f) this).field_A);
        if (param2 >= -21) {
            field_B = null;
        }
        vg var6 = (vg) (Object) var5.a(2);
        while (var6 != null) {
            StringBuilder discarded$0 = param0.append(10);
            for (var7 = 0; var7 <= param3; var7++) {
                StringBuilder discarded$1 = param0.append(32);
            }
            StringBuilder discarded$2 = var6.a((byte) 125, param1, param3 - -1, param0);
            var6 = (vg) (Object) var5.a((byte) 89);
        }
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        on var3 = new on(((f) this).field_A);
        vg var4 = (vg) (Object) var3.a(2);
        while (var4 != null) {
            var5 = var4.e(param0 ^ 0);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (vg) (Object) var3.a((byte) 51);
        }
        if (param0 != -600269855) {
            field_B = null;
        }
        return var2;
    }

    final boolean a(byte param0, vg param1) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        on var3 = new on(((f) this).field_A);
        vg var6 = (vg) (Object) var3.a(2);
        while (var6 != null) {
            if (var6.a((byte) 125, param1)) {
                return true;
            }
            var6 = (vg) (Object) var3.a((byte) 100);
        }
        int var4 = -111 / ((param0 - 61) / 59);
        return false;
    }

    final boolean a(vg param0, boolean param1) {
        on var5 = null;
        vg var6 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(!((f) this).field_A.g(-86))) {
            return false;
        }
        on var3 = new on(((f) this).field_A);
        if (!param1) {
            field_B = null;
        }
        vg var4 = (vg) (Object) var3.c(-30);
        while (var4 != null) {
            if (var4.f(1)) {
                var5 = new on(((f) this).field_A);
                oh discarded$0 = var5.a((byte) 109, (oh) (Object) var4);
                var6 = (vg) (Object) var5.b((byte) -124);
                while (var6 != null) {
                    if (var6.a((byte) 124, param0)) {
                        return true;
                    }
                    var6 = (vg) (Object) var5.b((byte) -124);
                }
            }
            var4 = (vg) (Object) var3.b((byte) -124);
        }
        return false;
    }

    final boolean a(vg param0, int param1) {
        on var6 = null;
        vg var7 = null;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(!((f) this).field_A.g(102))) {
            return false;
        }
        int var4 = 70 % ((5 - param1) / 50);
        on var9 = new on(((f) this).field_A);
        vg var5 = (vg) (Object) var9.a(2);
        while (var5 != null) {
            if (!(!var5.f(1))) {
                var6 = new on(((f) this).field_A);
                oh discarded$0 = var6.a(false, (oh) (Object) var5);
                var7 = (vg) (Object) var6.a((byte) 54);
                while (var7 != null) {
                    if (!(!var7.a((byte) 123, param0))) {
                        return true;
                    }
                    var7 = (vg) (Object) var6.a((byte) 68);
                }
            }
            var5 = (vg) (Object) var9.a((byte) 111);
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == 0) {
            if (null != ((f) this).field_p) {
                ((f) this).field_p.a((vg) this, param3, true, param2, (byte) 12);
            }
        }
        on var5 = new on(((f) this).field_A);
        if (param1 != -11857) {
            return;
        }
        vg var6 = (vg) (Object) var5.c(param1 ^ -11803);
        while (var6 != null) {
            var6.a(param0, -11857, ((f) this).field_q + param2, ((f) this).field_m + param3);
            var6 = (vg) (Object) var5.b((byte) -124);
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5 = 31 % ((64 - param0) / 61);
        if (!(!((f) this).a(false, param2, param3, param1))) {
            ((f) this).a(param1, param2, false, param3);
            this.a(param3, param1, (byte) -114, param2);
        }
        return param3;
    }

    final static void a(byte param0, mj param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        param1.b((byte) -127);
        mj var2 = (mj) (Object) gr.field_p.d(param0 + 60);
        while (var2 != null) {
            // ifeq L55
            var2 = (mj) (Object) gr.field_p.a((byte) -71);
        }
        if (param0 != -60) {
            return;
        }
        if (var2 == null) {
            gr.field_p.a((byte) -113, (oh) (Object) param1);
        } else {
            wp.a((byte) -127, (oh) (Object) param1, (oh) (Object) var2);
        }
    }

    public static void j(int param0) {
        field_z = null;
        if (param0 < 88) {
            field_C = true;
        }
        field_y = null;
        field_B = null;
    }

    private final void h(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 >= -58) {
            Object var5 = null;
            boolean discarded$0 = ((f) this).a((byte) -71, (vg) null);
        }
        on var2 = new on(((f) this).field_A);
        vg var3 = (vg) (Object) var2.a(2);
        while (var3 != null) {
            var3.d((byte) 90);
            var3 = (vg) (Object) var2.a((byte) 63);
        }
    }

    final void b(byte param0, vg param1) {
        if (param0 >= -41) {
            field_z = null;
        }
        ((f) this).field_A.a((byte) -113, (oh) (Object) param1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        int var9 = ShatteredPlansClient.field_F ? 1 : 0;
        on var7 = new on(((f) this).field_A);
        vg var8 = (vg) (Object) var7.a(param4 + 600269857);
        if (param4 != -600269855) {
            return;
        }
        while (var8 != null) {
            // ifeq L97
            var8.a(param0, ((f) this).field_q + param1, param2 - -((f) this).field_m, param3, -600269855, param5);
            var8 = (vg) (Object) var7.a((byte) 60);
        }
    }

    final void e(byte param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = -104 / ((param0 - -84) / 33);
        on var3 = new on(((f) this).field_A);
        vg var4 = (vg) (Object) var3.a(2);
        while (var4 != null) {
            var4.e((byte) -121);
            var4 = (vg) (Object) var3.a((byte) 88);
        }
    }

    String c(boolean param0) {
        on var2 = null;
        vg var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = new on(((f) this).field_A);
        if (param0) {
          var3 = (vg) (Object) var2.a(2);
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.c(true);
              if (var4 == null) {
                var3 = (vg) (Object) var2.a((byte) 104);
                continue L0;
              } else {
                return var4;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    f(int param0, int param1, int param2, int param3, iq param4) {
        super(param0, param1, param2, param3, param4, (ko) null);
        ((f) this).field_A = new pf();
    }

    void a(int param0, int param1, vg param2, byte param3) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        on var5 = new on(((f) this).field_A);
        vg var6 = (vg) (Object) var5.a(2);
        while (var6 != null) {
            // ifeq L89
            var6.a(((f) this).field_m + param0, ((f) this).field_q + param1, param2, (byte) 91);
            var6 = (vg) (Object) var5.a((byte) 94);
        }
    }

    final boolean f(int param0) {
        if (param0 != 1) {
            field_z = null;
        }
        return ((f) this).i(1) != null ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "You are offering a rematch.";
        field_z = "Options";
        field_C = false;
    }
}
