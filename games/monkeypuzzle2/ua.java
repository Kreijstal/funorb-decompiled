/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ua extends we implements ga {
    static int[] field_w;
    static String field_y;
    pj field_u;
    static pj field_v;
    static sj[] field_x;

    final void e(int param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(((ua) this).field_u);
        we var3 = (we) (Object) var2.a((byte) -37);
        if (param0 != 13104) {
            ((ua) this).e(53);
        }
        while (var3 != null) {
            var3.e(13104);
            var3 = (we) (Object) var2.a(true);
        }
    }

    final int f(int param0) {
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = param0;
        ck var3 = new ck(((ua) this).field_u);
        we var4 = (we) (Object) var3.a((byte) -37);
        while (var4 != null) {
            var5 = var4.f(0);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (we) (Object) var3.a(true);
        }
        return var2;
    }

    final boolean a(we param0, boolean param1) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var3 = new ck(((ua) this).field_u);
        if (param1) {
            return false;
        }
        we var4 = (we) (Object) var3.a((byte) -37);
        while (var4 != null) {
            if (!(!var4.a(param0, false))) {
                return true;
            }
            var4 = (we) (Object) var3.a(!param1 ? true : false);
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.c((byte) 96);
    }

    final void b(byte param0, we param1) {
        if (param0 >= -17) {
            return;
        }
        ((ua) this).field_u.a(-8212, (ug) (Object) param1);
    }

    void a(we param0, int param1, int param2, byte param3) {
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        super.a(param0, param1, param2, (byte) -103);
        ck var5 = new ck(((ua) this).field_u);
        we var6 = (we) (Object) var5.a((byte) -37);
        if (param3 >= -13) {
            field_v = null;
        }
        while (var6 != null) {
            // ifeq L106
            var6.a(param0, param1 + ((ua) this).field_e, param2 + ((ua) this).field_r, (byte) -64);
            var6 = (we) (Object) var5.a(true);
        }
    }

    final static void i(int param0) {
        if (param0 < 81) {
            field_w = null;
        }
        if (hl.field_d != null) {
            if (!hl.field_d.h()) {
                return;
            }
        }
        hl.field_d = li.a(ke.field_h[6], 100, 96);
        na.a((byte) 35, hl.field_d);
    }

    private final void b(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var7 = 0;
        int var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var5 = new ck(((ua) this).field_u);
        we var6 = (we) (Object) var5.a((byte) -37);
        while (var6 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var7 = 0; var7 <= param1; var7++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var6.a(false, param2, param0, 1 + param1);
            var6 = (we) (Object) var5.a(true);
        }
        if (param3 != 13467) {
            field_w = null;
        }
    }

    boolean a(we param0, char param1, int param2, int param3) {
        int var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var5 = new ck(((ua) this).field_u);
        int var6 = -77 % ((param3 - 37) / 50);
        we var7 = (we) (Object) var5.a((byte) -37);
        while (var7 != null) {
            // ifeq L101
            if (var7.b((byte) 103)) {
                if (!(!var7.a(param0, param1, param2, 124))) {
                    return true;
                }
            }
            var7 = (we) (Object) var5.a(true);
        }
        var6 = param2;
        if (80 == var6) {
            return dl.field_c[81] ? ((ua) this).a((byte) 119, param0) : ((ua) this).b(param0, false);
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == 0) {
            if (((ua) this).field_h != null) {
                ((ua) this).field_h.a(true, (we) this, param2, param3, 69);
            }
        }
        ck var5 = new ck(((ua) this).field_u);
        we var6 = (we) (Object) var5.b((byte) -102);
        while (var6 != null) {
            var6.a(param0 ^ 0, param1, ((ua) this).field_e + param2, param3 + ((ua) this).field_r);
            var6 = (we) (Object) var5.a(param0 + -3733);
        }
        if (param0 != 30) {
            boolean discarded$0 = ((ua) this).b((byte) 23);
        }
    }

    public static void j(int param0) {
        field_w = null;
        field_v = null;
        field_y = null;
        if (param0 != 0) {
            return;
        }
        field_x = null;
    }

    final String a(byte param0) {
        String var4 = null;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(((ua) this).field_u);
        we var3 = (we) (Object) var2.a((byte) -37);
        while (var3 != null) {
            var4 = var3.a((byte) 54);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (we) (Object) var2.a(true);
        }
        if (param0 == 54) {
            return null;
        }
        ((ua) this).a(89, -46, 124, -95);
        return null;
    }

    private final void c(byte param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(((ua) this).field_u);
        if (param0 < 80) {
            boolean discarded$0 = ((ua) this).b((byte) -67);
        }
        we var3 = (we) (Object) var2.a((byte) -37);
        while (var3 != null) {
            var3.g(-1);
            var3 = (we) (Object) var2.a(true);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        int var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var8 = new ck(((ua) this).field_u);
        if (param3 != -1625) {
            ua.j(-119);
        }
        we var9 = (we) (Object) var8.a((byte) -37);
        while (var9 != null) {
            // ifeq L109
            if (var9.a(param0 - -((ua) this).field_e, param1, param2, -1625, param4, param5, param6 + ((ua) this).field_r)) {
                return true;
            }
            var9 = (we) (Object) var8.a(true);
        }
        return false;
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        int var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var7 = new ck(((ua) this).field_u);
        we var8 = (we) (Object) var7.a((byte) -37);
        while (var8 != null) {
            // ifeq L83
            var8.a(((ua) this).field_e + param0, param1, param2, param3, 0, param5 + ((ua) this).field_r);
            var8 = (we) (Object) var7.a(true);
        }
        if (param4 != 0) {
            Object var10 = null;
            ((ua) this).a(122, 7, (we) null, -60, 25, -69);
        }
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
            String discarded$0 = ((ua) this).a((byte) 92);
        }
        return null != ((ua) this).a(true) ? true : false;
    }

    we a(boolean param0) {
        ck var2 = null;
        we var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = new ck(((ua) this).field_u);
          if (param0) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = ((ua) this).a((byte) -39, (we) null);
            break L0;
          }
        }
        var3 = (we) (Object) var2.a((byte) -37);
        L1: while (true) {
          if (var3 != null) {
            if (var3.b((byte) 40)) {
              return var3;
            } else {
              var3 = (we) (Object) var2.a(param0);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param6 >= -109) {
            return false;
        }
        ck var8 = new ck(((ua) this).field_u);
        we var9 = (we) (Object) var8.a((byte) -37);
        while (var9 != null) {
            // ifeq L103
            if (var9.b((byte) 87)) {
                if (!(!var9.a(param0, param1, param2, param3, param4, param5, -119))) {
                    return true;
                }
            }
            var9 = (we) (Object) var8.a(true);
        }
        return false;
    }

    final boolean b(we param0, boolean param1) {
        ck var5 = null;
        we var6 = null;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1) {
            return true;
        }
        if (!(!((ua) this).field_u.e(11253))) {
            return false;
        }
        ck var3 = new ck(((ua) this).field_u);
        we var4 = (we) (Object) var3.a((byte) -37);
        while (var4 != null) {
            if (var4.b((byte) 122)) {
                var5 = new ck(((ua) this).field_u);
                ug discarded$0 = var5.a((byte) -127, (ug) (Object) var4);
                var6 = (we) (Object) var5.a(true);
                while (var6 != null) {
                    if (!(!var6.a(param0, false))) {
                        return true;
                    }
                    var6 = (we) (Object) var5.a(true);
                }
            }
            var4 = (we) (Object) var3.a(true);
        }
        return false;
    }

    final StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        if (!(!((ua) this).a(param2, (byte) -127, param3, param1))) {
            ((ua) this).a(param2, param3, param1, -113);
            this.b(param2, param3, param1, 13467);
        }
        if (param0) {
            ((ua) this).a(118, 103, -77, 34, 51);
        }
        return param1;
    }

    ua(int param0, int param1, int param2, int param3, ml param4) {
        super(param0, param1, param2, param3, param4, (of) null);
        ((ua) this).field_u = new pj();
    }

    final boolean a(byte param0, we param1) {
        ck var5 = null;
        we var6 = null;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!(!((ua) this).field_u.e(11253))) {
            return false;
        }
        ck var3 = new ck(((ua) this).field_u);
        if (param0 <= 54) {
            return false;
        }
        we var4 = (we) (Object) var3.b((byte) -96);
        while (var4 != null) {
            if (var4.b((byte) 116)) {
                var5 = new ck(((ua) this).field_u);
                ug discarded$0 = var5.a(-11121, (ug) (Object) var4);
                var6 = (we) (Object) var5.a(-3703);
                while (var6 != null) {
                    if (var6.a(param1, false)) {
                        return true;
                    }
                    var6 = (we) (Object) var5.a(-3703);
                }
            }
            var4 = (we) (Object) var3.a(-3703);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_y = "to keep fullscreen or";
        field_w = new int[5];
        var0 = 0;
        L0: while (true) {
          if (field_w.length <= var0) {
            field_v = new pj();
          } else {
            L1: {
              if (0 == var0) {
                field_w[var0] = var0 * 20 + 20 << 36086632;
                break L1;
              } else {
                field_w[var0] = 51 * var0 - -51 << -284439704;
                break L1;
              }
            }
            if (-3 > (var0 ^ -1)) {
              field_w[var0] = bd.a(field_w[var0], 22 * (-2 + var0) << 1830170768);
              var0++;
              continue L0;
            } else {
              var0++;
              continue L0;
            }
          }
        }
    }
}
