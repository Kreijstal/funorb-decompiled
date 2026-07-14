/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends vk implements dc, ga {
    private ab field_H;
    static String field_C;
    static volatile boolean field_E;
    private ok field_z;
    private dk field_y;
    static int field_D;
    static hl field_A;
    static int field_F;

    private final String j(int param0) {
        if (param0 != -99) {
            field_A = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    final static lk a(int param0, ue param1, int param2, byte param3, ue param4) {
        if (param3 <= -92) {
          if (!qb.a((byte) 94, param0, param2, param1)) {
            return null;
          } else {
            return qd.a(param4.a(param0, true, param2), (byte) -71);
          }
        } else {
          jj.a(32);
          if (!qb.a((byte) 94, param0, param2, param1)) {
            return null;
          } else {
            return qd.a(param4.a(param0, true, param2), (byte) -71);
          }
        }
    }

    final static void i(int param0) {
        int var1 = -33 % ((58 - param0) / 42);
        g.a(21975);
    }

    public final void a(int param0, byte param1, int param2, ab param3) {
        int var6 = 0;
        var6 = StarCannon.field_A;
        if (-1 == (param0 ^ -1)) {
          qa.a((byte) -108, "terms.ws");
          if (param1 != -123) {
            String discarded$8 = this.a(true);
            return;
          } else {
            return;
          }
        } else {
          if ((param0 ^ -1) != -2) {
            if (param0 != 2) {
              if (param1 != -123) {
                String discarded$9 = this.a(true);
                return;
              } else {
                return;
              }
            } else {
              qa.a((byte) -119, "conduct.ws");
              if (param1 == -123) {
                return;
              } else {
                String discarded$10 = this.a(true);
                return;
              }
            }
          } else {
            qa.a((byte) -113, "privacy.ws");
            if (param1 == -123) {
              return;
            } else {
              String discarded$11 = this.a(true);
              return;
            }
          }
        }
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        if (param0 != ((jj) this).field_y) {
          if (param2) {
            field_F = 57;
            return;
          } else {
            return;
          }
        } else {
          ej.f((byte) -80);
          ((jj) this).field_z.n(-94);
          if (!param2) {
            return;
          } else {
            field_F = 57;
            return;
          }
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (-99 == (param3 ^ -1)) {
            return ((jj) this).b(param2 ^ 36, param0);
          } else {
            if ((param3 ^ -1) == -100) {
              return ((jj) this).a((byte) -103, param0);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != 200) {
            return true;
        }
        return pf.a(param1, false, false);
    }

    private final String a(boolean param0) {
        if (param0) {
            ((jj) this).field_H = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void a(int param0) {
        field_C = null;
        if (param0 != 0) {
            return;
        }
        field_A = null;
    }

    jj(ok param0) {
        super(0, 0, 288, 0, (de) null);
        ((jj) this).field_z = param0;
        ((jj) this).field_y = new dk(ui.field_s, (qg) null);
        ((jj) this).field_y.field_o = (de) (Object) new gb();
        String var7 = fb.a(field_C, -98, new String[2]);
        int var3 = 20;
        hd var4 = new hd(nb.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, nb.field_c.field_p, -1, 2147483647, true);
        ((jj) this).field_H = new ab(var7, (de) (Object) var4);
        ((jj) this).field_H.field_p = "";
        ((jj) this).field_H.a(pc.field_b, -5, 0);
        ((jj) this).field_H.a(pc.field_b, -103, 1);
        ((jj) this).field_H.field_g = (qg) this;
        ((jj) this).field_H.field_i = -40 + ((jj) this).field_i;
        ((jj) this).field_H.b(26, 95, var3, ((jj) this).field_i - 40);
        var3 = var3 + (((jj) this).field_H.field_f + 15);
        ((jj) this).a(true, (uj) (Object) ((jj) this).field_H);
        int var5 = 4;
        int var6 = 200;
        ((jj) this).field_y.a(300 - var6 >> 152539777, var6, (byte) 120, 40, var3);
        ((jj) this).field_y.field_g = (qg) this;
        ((jj) this).a(true, (uj) (Object) ((jj) this).field_y);
        ((jj) this).a(0, 300, (byte) 118, var5 + (var3 - -55), 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_E = false;
        field_A = new hl(160, 120);
    }
}
