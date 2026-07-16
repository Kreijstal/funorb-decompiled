/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends og implements vd {
    static String field_D;
    static int field_F;
    private pc field_z;
    private pc field_B;
    static String field_G;
    private pc field_E;
    static String field_C;

    public ae() {
        super(0, 0, 476, 225, (wo) null);
        ((ae) this).field_E = new pc(mj.field_d, (bi) null);
        ((ae) this).field_B = new pc(dp.field_i, (bi) null);
        ((ae) this).field_z = new pc(ip.field_b, (bi) null);
        ve var1 = new ve();
        ((ae) this).field_E.field_i = (wo) (Object) var1;
        ((ae) this).field_B.field_i = (wo) (Object) var1;
        ((ae) this).field_z.field_i = (wo) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -1796213727;
        ((ae) this).field_B.a(30, ((ae) this).field_g - var3 >> 226930817, -48 + ((ae) this).field_f + -var2, var4, (byte) -52);
        ((ae) this).field_z.a(30, var4 + ((-var3 + ((ae) this).field_g >> 693968737) + var2), ((ae) this).field_f + -48 + -var2, var4, (byte) -52);
        ((ae) this).field_E.a(30, ((ae) this).field_g - var3 >> -55402079, -(var2 * 2) + -78 + ((ae) this).field_f, var3, (byte) -52);
        ((ae) this).field_B.field_l = (bi) this;
        ((ae) this).field_E.field_l = (bi) this;
        ((ae) this).field_z.field_l = (bi) this;
        ((ae) this).field_E.field_t = pg.field_c;
        ((ae) this).field_z.field_t = md.field_o;
        ((ae) this).b((qm) (Object) ((ae) this).field_B, 1);
        ((ae) this).b((qm) (Object) ((ae) this).field_E, -5);
        ((ae) this).b((qm) (Object) ((ae) this).field_z, -115);
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if ((param0 ^ -1) == -99) {
            return ((ae) this).a((byte) -124, param2);
        }
        if (-100 != (param0 ^ -1)) {
            return false;
        }
        return ((ae) this).a(param2, -25911);
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != 20) {
            return;
        }
        field_D = null;
        field_C = null;
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        if (((ae) this).field_B != param4) {
          if (((ae) this).field_E != param4) {
            if (((ae) this).field_z != param4) {
              var6 = -40 % ((param0 - 83) / 36);
              return;
            } else {
              hf.a(4);
              var6 = -40 % ((param0 - 83) / 36);
              return;
            }
          } else {
            ih.a((byte) 63);
            var6 = -40 % ((param0 - 83) / 36);
            return;
          }
        } else {
          gl.b(53);
          var6 = -40 % ((param0 - 83) / 36);
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 >= -12) {
          return;
        } else {
          var5 = ((ae) this).field_r - -param2;
          var6 = ((ae) this).field_j + param0;
          int discarded$1 = ai.field_h.a(j.field_h, 20 + var5, 20 + var6, -40 + ((ae) this).field_g, ((ae) this).field_f + -50, 16777215, -1, 1, 0, ai.field_h.field_o);
          super.a(param0, (byte) -20, param2, param3);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Playing Wizard Run";
        field_G = "Name";
        field_C = "There is spider web here.<br>Are there any spiders<br>nearby?";
    }
}
