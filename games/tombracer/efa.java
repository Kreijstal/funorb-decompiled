/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class efa extends b implements mia, tsa {
    private so field_z;
    static iu[][] field_w;
    static int field_y;
    laa field_x;
    private rj field_B;
    private rj field_A;

    private final boolean a(int param0, mk param1) {
        if (param0 > -25) {
            return false;
        }
        nua var3 = param1.a((byte) 127);
        if (!(var3 != null)) {
            return true;
        }
        it var4 = var3.b(-4666);
        return var4 == uh.field_k ? true : false;
    }

    public final void a(int param0) {
        ((tf) (Object) ((efa) this).field_z.a((byte) 93)).b((byte) -69);
        if (param0 != 10000536) {
            field_y = -98;
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        super.a(param0, param1 + 0, param2, param3);
        if (param1 != 2097152) {
          ((efa) this).field_x = null;
          ((efa) this).field_A.field_y = this.b(false);
          return;
        } else {
          ((efa) this).field_A.field_y = this.b(false);
          return;
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        Object var7 = null;
        if (((efa) this).field_B == param2) {
          pn.f(-804227775);
          if (param4 <= 44) {
            var7 = null;
            boolean discarded$6 = this.a(-113, (mk) null);
            return;
          } else {
            return;
          }
        } else {
          if (param2 == ((efa) this).field_A) {
            this.a((byte) 89);
            if (param4 > 44) {
              return;
            } else {
              var7 = null;
              boolean discarded$7 = this.a(-113, (mk) null);
              return;
            }
          } else {
            if (param4 > 44) {
              return;
            } else {
              var7 = null;
              boolean discarded$8 = this.a(-113, (mk) null);
              return;
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_w = null;
        if (!param0) {
            field_w = null;
        }
    }

    public efa() {
        super(0, 0, 496, 0, (isa) null);
        ((efa) this).field_z = new so("", (qc) null, 12);
        vpa var1 = new vpa(eka.field_o, 0, 0, 0, 0, 16777215, -1, 3, 0, mj.field_J.field_w, -1, 2147483647, true);
        ae var2 = new ae(cj.field_e, (isa) (Object) var1, (qc) null);
        ((efa) this).field_A = new rj(nf.field_j, (qc) null);
        ((efa) this).field_B = new rj(mq.field_d, (qc) null);
        ((efa) this).field_z.field_q = rma.field_a;
        ((efa) this).field_z.a(-13861, (nua) (Object) new tf((tra) (Object) ((efa) this).field_z));
        ((efa) this).field_A.field_y = false;
        ((efa) this).field_A.field_r = (isa) (Object) new td();
        ((efa) this).field_B.field_r = (isa) (Object) new kaa();
        ((efa) this).field_z.field_r = (isa) (Object) new hga(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a((byte) -31, 270, 50, 20, var3);
        ((efa) this).a(var2, -1);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, rea.field_r, za.field_f, (ae) (Object) ((efa) this).field_z, -2239, 170));
        ((efa) this).field_A.a((byte) -31, var5, 40, -var5 + 496 >> -2132918303, var3);
        ((efa) this).field_B.a((byte) -31, 60, 40, var4 + 3, var3 - -15);
        ((efa) this).field_B.field_h = (qc) this;
        ((efa) this).field_A.field_h = (qc) this;
        ((efa) this).a((ae) (Object) ((efa) this).field_A, -1);
        ((efa) this).a((ae) (Object) ((efa) this).field_B, -1);
        ((efa) this).field_x = new laa((mia) this);
        ((efa) this).field_x.a((byte) -31, ((efa) this).field_m + -((efa) this).field_z.field_i - (((efa) this).field_z.field_m - -60), 150, ((efa) this).field_z.field_i - (-((efa) this).field_z.field_m - 60), 20);
        ((efa) this).a((ae) (Object) ((efa) this).field_x, -1);
        ((efa) this).a((byte) -31, 496, var4 + 55 + var3, 0, 0);
    }

    public final void a(String param0, int param1) {
        so var3 = null;
        String var4 = null;
        var3 = ((efa) this).field_z;
        var4 = param0;
        if (param1 < 18) {
          efa.c(false);
          ((tra) (Object) var3).a(false, -16719, var4);
          return;
        } else {
          ((tra) (Object) var3).a(false, -16719, var4);
          return;
        }
    }

    private final int a(int param0, String param1, String param2, ae param3, int param4, int param5) {
        if (param4 != -2239) {
            return 76;
        }
        return this.a(param0, param3, param5, param1, param2, 35, 3);
    }

    private final void a(byte param0) {
        if (param0 >= 10) {
          if (!this.b(false)) {
            return;
          } else {
            rka.a(((efa) this).field_z.field_o, false);
            return;
          }
        } else {
          ((efa) this).a(74);
          if (!this.b(false)) {
            return;
          } else {
            rka.a(((efa) this).field_z.field_o, false);
            return;
          }
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        if (param3) {
          if (!super.a(param0, param1, param2, param3)) {
            if ((param2 ^ -1) != -99) {
              if ((param2 ^ -1) == -100) {
                return ((efa) this).a(param1, (byte) -9);
              } else {
                return false;
              }
            } else {
              return ((efa) this).b(param1, (byte) -118);
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    private final int a(int param0, ae param1, int param2, String param3, String param4, int param5, int param6) {
        jsa var10 = new jsa(20, param0, 120 - -param2, 25, param1, false, 120, param6, mj.field_J, 16777215, param3);
        ((efa) this).a((ae) (Object) var10, -1);
        sd var9 = new sd(((mk) (Object) param1).a((byte) 124), param4, 126, param0 + var10.field_p, param2 + 25, param5);
        var9.field_h = (qc) this;
        ((efa) this).a((ae) (Object) var9, -1);
        return var10.field_p + var9.field_p;
    }

    private final boolean b(boolean param0) {
        Object var3 = null;
        if (!this.a(-66, (mk) (Object) ((efa) this).field_z)) {
          return false;
        } else {
          if (param0) {
            var3 = null;
            boolean discarded$2 = ((efa) this).a('ﾛ', (ae) null, 39, false);
            return true;
          } else {
            return true;
          }
        }
    }

    static {
    }
}
