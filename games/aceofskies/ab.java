/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ab extends ea implements vm {
    kp field_s;
    static String field_r;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        int var10 = AceOfSkies.field_G ? 1 : 0;
        an var8 = new an(((ab) this).field_s);
        if (param0 != 34) {
            field_r = (String) null;
        }
        ea var9 = (ea) var8.c(-1372);
        while (var9 != null) {
            // ifeq L109
            if (var9.a(34, param1 + ((ab) this).field_p, param2, param3, ((ab) this).field_h + param4, param5, param6)) {
                return true;
            }
            var9 = (ea) var8.a(126);
        }
        return false;
    }

    final String c(byte param0) {
        String var4 = null;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        an var2 = new an(((ab) this).field_s);
        ea var3 = (ea) var2.c(-1372);
        while (var3 != null) {
            var4 = var3.c((byte) -112);
            if (var4 != null) {
                return var4;
            }
            var3 = (ea) var2.a(-12);
        }
        if (param0 < -41) {
            return null;
        }
        StringBuilder var6 = (StringBuilder) null;
        this.a((byte) -28, 3, (Hashtable) null, (StringBuilder) null);
        return null;
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param1 == 0) {
            if (!(((ab) this).field_e == null)) {
                ((ab) this).field_e.a(true, -7592, param3, (ea) this, param2);
            }
        }
        an var5 = new an(((ab) this).field_s);
        if (param0 < 64) {
            return;
        }
        ea var6 = (ea) var5.b(true);
        while (var6 != null) {
            var6.a((byte) 100, param1, param2 + ((ab) this).field_h, param3 + ((ab) this).field_p);
            var6 = (ea) var5.a((byte) 120);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, boolean param6) {
        int var10 = AceOfSkies.field_G ? 1 : 0;
        an var12 = new an(((ab) this).field_s);
        ea var9 = (ea) var12.c(-1372);
        while (var9 != null) {
            // ifeq L92
            if (var9.e(28660)) {
                if (var9.a(param0, param1, param2, param3, param4, param5, false)) {
                    return true;
                }
            }
            var9 = (ea) var12.a(-121);
        }
        if (param6) {
            Hashtable var11 = (Hashtable) null;
            StringBuilder discarded$0 = ((ab) this).a((StringBuilder) null, -90, 100, (Hashtable) null);
            return false;
        }
        return false;
    }

    final void a(ea param0, int param1) {
        if (param1 != 1) {
            field_r = (String) null;
        }
        ((ab) this).field_s.a(87, (wf) (Object) param0);
    }

    final boolean a(int param0, ea param1) {
        an var5 = null;
        ea var6 = null;
        int var7 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 80) {
            field_r = (String) null;
        }
        if (((ab) this).field_s.a(true)) {
            return false;
        }
        an var3 = new an(((ab) this).field_s);
        ea var4 = (ea) var3.c(-1372);
        while (var4 != null) {
            if (!(!var4.e(28660))) {
                var5 = new an(((ab) this).field_s);
                wf discarded$0 = var5.a(46, (wf) (Object) var4);
                var6 = (ea) var5.a(23);
                while (var6 != null) {
                    if (!(!var6.a(param1, (byte) -42))) {
                        return true;
                    }
                    var6 = (ea) var5.a(-126);
                }
            }
            var4 = (ea) var3.a(-123);
        }
        return false;
    }

    final int f(int param0) {
        int var5 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        int var2 = param0;
        an var3 = new an(((ab) this).field_s);
        ea var4 = (ea) var3.c(param0 ^ -1372);
        while (var4 != null) {
            var5 = var4.f(param0 + 0);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (ea) var3.a(-119);
        }
        return var2;
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        int var7 = 0;
        an var5 = new an(((ab) this).field_s);
        ea var6 = (ea) var5.c(-1372);
        while (var6 != null) {
            StringBuilder discarded$0 = param3.append(10);
            for (var7 = 0; var7 <= param1; var7++) {
                StringBuilder discarded$1 = param3.append(32);
            }
            StringBuilder discarded$2 = var6.a(param3, 32462, 1 + param1, param2);
            var6 = (ea) var5.a(param0 + -232);
        }
        if (param0 != 115) {
            ((ab) this).field_s = (kp) null;
        }
    }

    ab(int param0, int param1, int param2, int param3, ir param4) {
        super(param0, param1, param2, param3, param4, (no) null);
        ((ab) this).field_s = new kp();
    }

    final StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        if (((ab) this).a(param0, param2, false, param3)) {
            ((ab) this).a(param0, param1 ^ 32462, param3, param2);
            this.a((byte) 115, param2, param3, param0);
        }
        if (param1 != 32462) {
            ((ab) this).a((byte) 77, -41, -88, 96);
        }
        return param0;
    }

    final void d(int param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        an var2 = new an(((ab) this).field_s);
        if (param0 != 7398) {
            return;
        }
        ea var3 = (ea) var2.c(-1372);
        while (var3 != null) {
            var3.d(7398);
            var3 = (ea) var2.a(param0 + -7523);
        }
    }

    public static void c(boolean param0) {
        field_r = null;
        if (!param0) {
            int[] var2 = (int[]) null;
            el discarded$0 = ab.a((wl) null, -29, true, (int[]) null, 99, -122, -8, -126);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        this.a(param0, param1, param2, param3, (byte) 126);
        if (param4 <= 122) {
            ea var7 = (ea) null;
            ((ab) this).a((byte) -120, (ea) null, 59, 121);
        }
        this.b(false);
    }

    void a(byte param0, ea param1, int param2, int param3) {
        this.a((byte) 94, param1, param2, param3);
        an var5 = new an(((ab) this).field_s);
        ea var6 = (ea) var5.c(-1372);
        while (var6 != null) {
            // ifeq L88
            var6.a((byte) 108, param1, param2 - -((ab) this).field_h, ((ab) this).field_p + param3);
            var6 = (ea) var5.a(-125);
        }
        if (param0 <= 13) {
            Hashtable var7 = (Hashtable) null;
            StringBuilder discarded$0 = ((ab) this).a((StringBuilder) null, -85, 34, (Hashtable) null);
        }
    }

    boolean a(int param0, int param1, char param2, ea param3) {
        int var8 = AceOfSkies.field_G ? 1 : 0;
        an var10 = new an(((ab) this).field_s);
        int var6 = -95 / ((param0 - -53) / 33);
        ea var9 = (ea) var10.c(-1372);
        while (var9 != null) {
            // ifeq L103
            if (var9.e(28660)) {
                if (!(!var9.a(-94, param1, param2, param3))) {
                    return true;
                }
            }
            var9 = (ea) var10.a(69);
        }
        int var7 = param1;
        if (80 != var7) {
            return false;
        }
        return !lp.field_a[81] ? ((ab) this).a(80, param3) : ((ab) this).b(param3, -107);
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        int var9 = AceOfSkies.field_G ? 1 : 0;
        an var7 = new an(((ab) this).field_s);
        if (param5 != 91) {
            return;
        }
        ea var8 = (ea) var7.c(-1372);
        while (var8 != null) {
            // ifeq L92
            var8.a(param0 + ((ab) this).field_p, param1 + ((ab) this).field_h, param2, param3, param4, (byte) 91);
            var8 = (ea) var7.a(3);
        }
    }

    final boolean e(int param0) {
        if (param0 != 28660) {
            field_r = (String) null;
        }
        return ((ab) this).a(0) != null ? true : false;
    }

    ea a(int param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        an var2 = new an(((ab) this).field_s);
        ea var3 = (ea) var2.c(-1372);
        while (var3 != null) {
            if (var3.e(28660)) {
                return var3;
            }
            var3 = (ea) var2.a(-119);
        }
        if (param0 == 0) {
            return null;
        }
        ((ab) this).field_s = (kp) null;
        return null;
    }

    final boolean b(ea param0, int param1) {
        an var5 = null;
        ea var6 = null;
        int var7 = AceOfSkies.field_G ? 1 : 0;
        if (!(!((ab) this).field_s.a(true))) {
            return false;
        }
        an var9 = new an(((ab) this).field_s);
        if (param1 >= -20) {
            ea var8 = (ea) null;
            ((ab) this).a((ea) null, -61);
        }
        ea var4 = (ea) var9.b(true);
        while (var4 != null) {
            if (var4.e(28660)) {
                var5 = new an(((ab) this).field_s);
                wf discarded$0 = var5.a((wf) (Object) var4, 0);
                var6 = (ea) var5.a((byte) 120);
                while (var6 != null) {
                    if (!(!var6.a(param0, (byte) -42))) {
                        return true;
                    }
                    var6 = (ea) var5.a((byte) 120);
                }
            }
            var4 = (ea) var9.a((byte) 120);
        }
        return false;
    }

    final boolean a(ea param0, byte param1) {
        an var3 = new an(((ab) this).field_s);
        if (param1 != -42) {
            ((ab) this).a((byte) 13, -25, 110, -87);
        }
        ea var4 = (ea) var3.c(-1372);
        while (var4 != null) {
            if (var4.a(param0, (byte) -42)) {
                return true;
            }
            var4 = (ea) var3.a(param1 ^ -31);
        }
        return false;
    }

    private final void b(boolean param0) {
        an var2 = new an(((ab) this).field_s);
        ea var3 = (ea) var2.c(-1372);
        if (param0) {
            return;
        }
        while (var3 != null) {
            var3.a(false);
            var3 = (ea) var2.a(-124);
        }
    }

    final static el a(wl param0, int param1, boolean param2, int[] param3, int param4, int param5, int param6, int param7) {
        if (param1 <= -119) {
          L0: {
            if (((wl) param0).field_Cc) {
              break L0;
            } else {
              L1: {
                if (!mg.a(param6, (byte) -72)) {
                  break L1;
                } else {
                  if (!mg.a(param7, (byte) -39)) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              if (((wl) param0).field_u) {
                return new el(param0, 34037, param6, param7, param2, param3, param5, param4);
              } else {
                return new el(param0, param6, param7, fk.a(param6, 61), fk.a(param7, 115), param3);
              }
            }
          }
          return new el(param0, 3553, param6, param7, param2, param3, param5, param4);
        } else {
          return (el) null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Arcade Mode Unlocked!";
    }
}
