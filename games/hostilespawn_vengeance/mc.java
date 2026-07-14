/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends vd implements qk {
    private String[] field_H;
    private ph[] field_M;
    private kn field_K;
    static be field_F;
    static String field_J;
    static int field_I;
    static String field_L;
    static int[] field_E;

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 126, param3);
        if (!(param3 == 0)) {
            return;
        }
        if (param2 <= 42) {
            Object var6 = null;
            ((mc) this).a((String[]) null, (byte) -47);
        }
        vm var5 = jd.field_s;
        if (null != ((mc) this).field_H) {
            int discarded$0 = var5.a(fk.field_b, param1 - -((mc) this).field_v, ((mc) this).field_m + param0, ((mc) this).field_s, 20, 16777215, -1, 0, 0, var5.field_F + var5.field_y);
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!(-99 != (param2 ^ -1))) {
            return ((mc) this).a(param1, (byte) -120);
        }
        if (param2 == 99) {
            return ((mc) this).b((byte) -26, param1);
        }
        return false;
    }

    final void a(String[] param0, byte param1) {
        int var4_int = 0;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        ((mc) this).field_z.d(5719);
        if (param0 != null) {
            // if_icmpeq L30
        } else {
            ((mc) this).field_H = null;
            return;
        }
        int var3 = param0.length;
        ((mc) this).field_H = new String[var3];
        int var5 = -72 % ((61 - param1) / 62);
        for (var4_int = 0; var4_int < var3; var4_int++) {
            ((mc) this).field_H[var4_int] = uj.a((CharSequence) (Object) param0[var4_int], 18719).replace(' ', ' ');
        }
        ti var4 = new ti(jd.field_s, 0, 1);
        ((mc) this).field_M = new ph[1 + var3];
        int var7 = 0;
        var5 = var7;
        while (var7 < var3) {
            ((mc) this).field_M[var7] = new ph(((mc) this).field_H[var7], (mh) this);
            ((mc) this).field_M[var7].field_h = (nn) (Object) var4;
            ((mc) this).field_M[var7].field_i = uk.field_b;
            ((mc) this).field_M[var7].a(80, 20 - -(16 * var7), 0, 0, 15);
            ((mc) this).a(51448, (ag) (Object) ((mc) this).field_M[var7]);
            var7++;
        }
        ((mc) this).field_M[var3] = new ph(oa.field_h, (mh) this);
        ((mc) this).field_M[var3].field_h = (nn) (Object) var4;
        ((mc) this).field_M[var3].a(100, 20 + 16 * var3 + 16, 0, 0, 15);
        ((mc) this).a(51448, (ag) (Object) ((mc) this).field_M[var3]);
    }

    public static void j(int param0) {
        field_E = null;
        if (param0 > -123) {
            return;
        }
        field_J = null;
        field_F = null;
        field_L = null;
    }

    mc(kn param0) {
        super(0, 0, 0, 0, (nn) null);
        ((mc) this).field_K = param0;
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (((mc) this).field_H.length <= var6) {
            L1: {
              if (((mc) this).field_M[((mc) this).field_H.length] != param3) {
                break L1;
              } else {
                ((mc) this).field_K.a(false);
                break L1;
              }
            }
            var6 = 83 / ((param4 - -63) / 52);
            return;
          } else {
            if (((mc) this).field_M[var6] == param3) {
              ((mc) this).field_K.a(true, ((mc) this).field_H[var6]);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new be(1);
        field_J = "MISSION ";
        field_L = "Get to the lift before the explosives detonate.";
        field_I = 0;
    }
}
