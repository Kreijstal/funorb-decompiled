/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends ua implements ql {
    static int field_G;
    private t[] field_B;
    private int[] field_z;
    private String field_E;
    private ha field_H;
    private int field_C;
    private ta field_A;
    static int[] field_D;
    static String field_F;

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param3 != 7) {
            ((sk) this).a(-78, -17, -121, 56);
        }
        for (var6 = 0; var6 < ((sk) this).field_C; var6++) {
            if (((sk) this).field_B[var6] == param4) {
                var7 = ((sk) this).field_z[var6];
                if (0 != (var7 ^ -1)) {
                    qh.a(((sk) this).field_z[var6], true);
                    break;
                }
                ((sk) this).field_H.g((byte) -75);
                break;
            }
        }
    }

    final void a(byte param0, int param1, String param2) {
        int var4 = ((sk) this).field_C;
        this.a(var4 - -1, -101);
        int var5 = -96 / ((param0 - 55) / 36);
        ((sk) this).field_B[var4] = ((sk) this).a(0, (of) this, param2);
        ((sk) this).field_z[var4] = param1;
    }

    public static void c(boolean param0) {
        field_D = null;
        if (param0) {
            return;
        }
        field_F = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((sk) this).field_A.a(((sk) this).field_E, 14 + param3 - -((sk) this).field_r, 10 + param2 + ((sk) this).field_e, ((sk) this).field_l - 28, ((sk) this).field_p, 16777215, -1, 0, 0, ((sk) this).field_A.field_C);
    }

    final static kc a(String param0, long param1, boolean param2, boolean param3, String param4) {
        L0: {
          if (param3) {
            break L0;
          } else {
            sk.b(true);
            break L0;
          }
        }
        L1: {
          if ((param1 ^ -1L) != -1L) {
            break L1;
          } else {
            if (param4 != null) {
              return (kc) (Object) new rc(param4, param0);
            } else {
              break L1;
            }
          }
        }
        if (param2) {
          return (kc) (Object) new od(param1, param0);
        } else {
          return (kc) (Object) new f(param1, param0);
        }
    }

    final static void b(boolean param0) {
        if (param0) {
            field_D = null;
        }
        if (!ha.field_db) {
            throw new IllegalStateException();
        }
        cf.field_c = true;
        hl.a((byte) -60, true);
        k.field_g = 0;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((sk) this).field_C >= param0) {
            return;
        }
        t[] var8 = new t[param0];
        t[] var3 = var8;
        if (param1 > -67) {
            Object var7 = null;
            ((sk) this).a(-89, -86, -14, 112, (t) null);
        }
        int[] var4 = new int[param0];
        for (var5 = 0; ((sk) this).field_C > var5; var5++) {
            var8[var5] = ((sk) this).field_B[var5];
            var4[var5] = ((sk) this).field_z[var5];
        }
        ((sk) this).field_C = param0;
        ((sk) this).field_z = var4;
        ((sk) this).field_B = var3;
    }

    sk(ha param0, ta param1, String param2) {
        super(0, 0, 288, 0, (ml) null);
        ((sk) this).field_C = 0;
        ((sk) this).field_H = param0;
        ((sk) this).field_E = param2;
        ((sk) this).field_A = param1;
        int var4 = null != ((sk) this).field_E ? ((sk) this).field_A.a(((sk) this).field_E, 260, ((sk) this).field_A.field_C) : 0;
        ((sk) this).a(22 + var4, 13361, 0, 288, 0);
    }

    final t a(int param0, of param1, String param2) {
        t var4 = new t(param2, param1);
        var4.field_h = (ml) (Object) new hd();
        int var5 = -2 + ((sk) this).field_p;
        ((sk) this).a(((sk) this).field_p + 34, 13361, 0, ((sk) this).field_l, param0);
        var4.a(30, 13361, 7, ((sk) this).field_l - 14, var5);
        ((sk) this).b((byte) -78, (we) (Object) var4);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_G = 0;
        field_D = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = 3 * var0;
            if (-256 > (var1 ^ -1)) {
                var1 = 255;
            }
            field_D[var0] = bd.a(bd.a(ch.a(var1, 251723775) << -1005629080, ch.a(var1 << 731578096, 16738534)), ch.a(var1, 16777215));
        }
        field_F = "to return to the normal view.";
    }
}
