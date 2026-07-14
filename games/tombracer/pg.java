/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends b implements tma, tsa {
    private lga field_z;
    static String field_A;
    static int field_y;
    static String field_x;
    private rj field_B;
    private rua field_w;
    static int[] field_C;

    final static void b(boolean param0) {
        if (qga.field_m) {
          sra.field_t = true;
          jda.a(true, 262144);
          gda.field_c = 0;
          if (param0) {
            field_A = null;
            return;
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private final String c(int param0) {
        int var2 = 93 % ((21 - param0) / 40);
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(lga param0, int param1, int param2, int param3) {
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param2 == 30846) {
          if (0 != param1) {
            if (1 != param1) {
              if ((param1 ^ -1) == -3) {
                gva.a("conduct.ws", (byte) -118);
                return;
              } else {
                return;
              }
            } else {
              gva.a("privacy.ws", (byte) -50);
              return;
            }
          } else {
            gva.a("terms.ws", (byte) -88);
            return;
          }
        } else {
          field_y = -37;
          if (0 != param1) {
            if (1 != param1) {
              if ((param1 ^ -1) != -3) {
                return;
              } else {
                gva.a("conduct.ws", (byte) -118);
                return;
              }
            } else {
              gva.a("privacy.ws", (byte) -50);
              return;
            }
          } else {
            gva.a("terms.ws", (byte) -88);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_C = null;
        field_A = null;
        if (param0 != 0) {
            field_y = 58;
            field_x = null;
            return;
        }
        field_x = null;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        if (param4 > 44) {
          if (((pg) this).field_B == param2) {
            qr.d(-7694);
            ((pg) this).field_w.i((byte) 111);
            return;
          } else {
            return;
          }
        } else {
          ((pg) this).field_z = null;
          if (((pg) this).field_B != param2) {
            return;
          } else {
            qr.d(-7694);
            ((pg) this).field_w.i((byte) 111);
            return;
          }
        }
    }

    pg(rua param0) {
        super(0, 0, 288, 0, (isa) null);
        ((pg) this).field_w = param0;
        ((pg) this).field_B = new rj(aua.field_d, (qc) null);
        ((pg) this).field_B.field_r = (isa) (Object) new td();
        String var7 = gl.a((byte) 108, sg.field_q, new String[2]);
        int var3 = 20;
        vpa var4 = new vpa(mj.field_J, 0, 0, 0, 0, 16777215, -1, 3, 0, mj.field_J.field_w, -1, 2147483647, true);
        ((pg) this).field_z = new lga(var7, (isa) (Object) var4);
        ((pg) this).field_z.field_q = "";
        ((pg) this).field_z.a(sw.field_Fb, 0, 0);
        ((pg) this).field_z.a(sw.field_Fb, 1, 0);
        ((pg) this).field_z.field_m = ((pg) this).field_m - 40;
        ((pg) this).field_z.field_h = (qc) this;
        ((pg) this).field_z.a(var3, (byte) -120, ((pg) this).field_m + -40, 26);
        var3 = var3 + (((pg) this).field_z.field_p + 15);
        ((pg) this).a((ae) (Object) ((pg) this).field_z, -1);
        int var5 = 4;
        int var6 = 200;
        ((pg) this).field_B.a((byte) -31, var6, 40, 300 + -var6 >> -1796665279, var3);
        ((pg) this).field_B.field_h = (qc) this;
        ((pg) this).a((ae) (Object) ((pg) this).field_B, -1);
        ((pg) this).a((byte) -31, 300, var5 + (55 + var3), 0, 0);
    }

    private final String d(int param0) {
        if (param0 >= -12) {
            String discarded$0 = this.d(-20);
            return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 != param2) {
            if (99 == param2) {
              return ((pg) this).a(param1, (byte) -9);
            } else {
              return false;
            }
          } else {
            return ((pg) this).b(param1, (byte) -125);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Hold Shift";
        field_x = "Not yet achieved";
    }
}
