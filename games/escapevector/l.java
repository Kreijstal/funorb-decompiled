/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends bj implements qb {
    private hc field_J;
    static int field_H;
    private hc field_G;
    private hc field_I;

    public l() {
        super(0, 0, 476, 225, (db) null);
        ((l) this).field_I = new hc(pc.field_g, (wn) null);
        ((l) this).field_G = new hc(c.field_p, (wn) null);
        ((l) this).field_J = new hc(cj.field_c, (wn) null);
        ck var1 = new ck();
        ((l) this).field_I.field_s = (db) (Object) var1;
        ((l) this).field_G.field_s = (db) (Object) var1;
        ((l) this).field_J.field_s = (db) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -977047807;
        ((l) this).field_G.a(var4, ((l) this).field_x - (48 - -var2), -var3 + ((l) this).field_g >> 1555371649, true, 30);
        ((l) this).field_J.a(var4, -48 + (((l) this).field_x - var2), (((l) this).field_g + -var3 >> -1699240159) + (var4 - -var2), true, 30);
        ((l) this).field_I.a(var3, -78 + (((l) this).field_x + -(2 * var2)), -var3 + ((l) this).field_g >> -2127206143, true, 30);
        ((l) this).field_G.field_q = (wn) this;
        ((l) this).field_I.field_q = (wn) this;
        ((l) this).field_J.field_q = (wn) this;
        ((l) this).field_I.field_i = mm.field_c;
        ((l) this).field_J.field_i = lf.field_G;
        ((l) this).b((hm) (Object) ((l) this).field_G, false);
        ((l) this).b((hm) (Object) ((l) this).field_I, false);
        ((l) this).b((hm) (Object) ((l) this).field_J, false);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 <= 85) {
          ((l) this).field_J = null;
          var5 = ((l) this).field_k - -param3;
          var6 = param0 + ((l) this).field_j;
          int discarded$2 = sb.field_a.a(q.field_F, var5 + 20, var6 + 20, ((l) this).field_g + -40, ((l) this).field_x + -50, 16777215, -1, 1, 0, sb.field_a.field_r);
          super.a(param0, (byte) 99, param2, param3);
          return;
        } else {
          var5 = ((l) this).field_k - -param3;
          var6 = param0 + ((l) this).field_j;
          int discarded$3 = sb.field_a.a(q.field_F, var5 + 20, var6 + 20, ((l) this).field_g + -40, ((l) this).field_x + -50, 16777215, -1, 1, 0, sb.field_a.field_r);
          super.a(param0, (byte) 99, param2, param3);
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 < -30) {
          if (!aj.b(-127)) {
            if (mg.field_b < 2) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_H = -87;
          if (!aj.b(-127)) {
            if (mg.field_b < 2) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        var7 = EscapeVector.field_A;
        if (((l) this).field_G != param0) {
          if (((l) this).field_I == param0) {
            fe.a((byte) -83);
            if (param3 != 1) {
              boolean discarded$8 = l.a((byte) -64);
              return;
            } else {
              return;
            }
          } else {
            if (((l) this).field_J == param0) {
              bm.a(4);
              if (param3 != 1) {
                boolean discarded$9 = l.a((byte) -64);
                return;
              } else {
                return;
              }
            } else {
              if (param3 == 1) {
                return;
              } else {
                boolean discarded$10 = l.a((byte) -64);
                return;
              }
            }
          }
        } else {
          eh.b(-74);
          if (param3 == 1) {
            return;
          } else {
            boolean discarded$11 = l.a((byte) -64);
            return;
          }
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        if (super.a(param0, param1, param2, 71)) {
          return true;
        } else {
          if (param2 != 98) {
            if (param3 >= 0) {
              if ((param2 ^ -1) != -100) {
                return false;
              } else {
                return ((l) this).a(param0, true);
              }
            } else {
              return true;
            }
          } else {
            return ((l) this).a((byte) 22, param0);
          }
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != -8462) {
            return -107;
        }
        if (!qd.a(param1, -99)) {
            return -1;
        }
        return param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = 4;
    }
}
