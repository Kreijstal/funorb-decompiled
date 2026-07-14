/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs extends ab implements ue, dn {
    static int field_t;
    static int[] field_B;
    private jq field_y;
    private vq field_A;
    static int field_v;
    static int[] field_w;
    static String field_x;
    static boolean field_C;
    private mi field_z;
    static pa[] field_u;

    public final void a(byte param0, int param1, vq param2, int param3) {
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        if (-1 != (param3 ^ -1)) {
          if (1 != param3) {
            if (param3 == 2) {
              qk.a("conduct.ws", false);
              if (param0 >= -59) {
                rs.d((byte) -100);
                return;
              } else {
                return;
              }
            } else {
              if (param0 >= -59) {
                rs.d((byte) -100);
                return;
              } else {
                return;
              }
            }
          } else {
            qk.a("privacy.ws", false);
            if (param0 < -59) {
              return;
            } else {
              rs.d((byte) -100);
              return;
            }
          }
        } else {
          qk.a("terms.ws", false);
          if (param0 < -59) {
            return;
          } else {
            rs.d((byte) -100);
            return;
          }
        }
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5 = 0;
        if (this.a(-117, param1, param2, param3)) {
          return true;
        } else {
          if (98 == param1) {
            return ((rs) this).b(param3, -87);
          } else {
            var5 = 11 / ((param0 - -53) / 33);
            if (-100 == (param1 ^ -1)) {
              return ((rs) this).a(80, param3);
            } else {
              return false;
            }
          }
        }
    }

    public static void d(byte param0) {
        field_B = null;
        field_w = null;
        field_x = null;
        field_u = null;
        if (param0 != 105) {
            rs.d((byte) -82);
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6 = 36 / ((-27 - param4) / 61);
        if (!(((rs) this).field_z != param1)) {
            fg.b(true);
            ((rs) this).field_y.h((byte) 119);
        }
    }

    rs(jq param0) {
        super(0, 0, 288, 0, (ir) null);
        ((rs) this).field_y = param0;
        ((rs) this).field_z = new mi(mq.field_i, (no) null);
        ((rs) this).field_z.field_e = (ir) (Object) new qb();
        String var7 = sn.a(cd.field_c, 122, new String[2]);
        int var3 = 20;
        qm var4 = new qm(qo.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, qo.field_b.field_I, -1, 2147483647, true);
        ((rs) this).field_A = new vq(var7, (ir) (Object) var4);
        ((rs) this).field_A.field_k = "";
        ((rs) this).field_A.a(-57, m.field_g, 0);
        ((rs) this).field_A.a(72, m.field_g, 1);
        ((rs) this).field_A.field_q = ((rs) this).field_q + -40;
        ((rs) this).field_A.field_o = (no) this;
        ((rs) this).field_A.a(26, var3, -40 + ((rs) this).field_q, (byte) 110);
        var3 = var3 + (15 + ((rs) this).field_A.field_n);
        ((rs) this).a((ea) (Object) ((rs) this).field_A, 1);
        int var5 = 4;
        int var6 = 200;
        ((rs) this).field_z.a(40, -var6 + 300 >> 914096545, var3, var6, (byte) 127);
        ((rs) this).field_z.field_o = (no) this;
        ((rs) this).a((ea) (Object) ((rs) this).field_z, 1);
        ((rs) this).a(var3 + (55 - -var5), 0, 0, 300, (byte) 125);
    }

    private final String e(byte param0) {
        if (param0 <= 87) {
            field_t = 19;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String a(byte param0) {
        if (param0 <= 113) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new int[1];
        field_t = -1;
        field_x = null;
        field_B = new int[8192];
        field_v = -1;
    }
}
