/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dka extends vd implements lja {
    private hf field_F;
    private hf field_E;
    static String field_D;
    private hf field_C;
    static af field_G;

    final static void a(nv param0, byte param1) {
        if (param1 != 59) {
          field_G = null;
          fo.field_a.a(param1 ^ -60, (sna) (Object) param0);
          return;
        } else {
          fo.field_a.a(param1 ^ -60, (sna) (Object) param0);
          return;
        }
    }

    public dka() {
        super(0, 0, 476, 225, (qda) null);
        ((dka) this).field_E = new hf(sca.field_b, (pl) null);
        ((dka) this).field_C = new hf(nt.field_x, (pl) null);
        ((dka) this).field_F = new hf(tja.field_b, (pl) null);
        ff var1 = new ff();
        ((dka) this).field_E.field_f = (qda) (Object) var1;
        ((dka) this).field_C.field_f = (qda) (Object) var1;
        ((dka) this).field_F.field_f = (qda) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -439461215;
        ((dka) this).field_C.a(((dka) this).field_p - var3 >> 1868289409, 30, (byte) 59, var4, -var2 + (-48 + ((dka) this).field_q));
        ((dka) this).field_F.a((((dka) this).field_p - var3 >> -1014112543) + var4 - -var2, 30, (byte) 59, var4, -var2 + ((dka) this).field_q + -48);
        ((dka) this).field_E.a(((dka) this).field_p - var3 >> -1924230527, 30, (byte) 59, var3, -(2 * var2) + ((dka) this).field_q + -78);
        ((dka) this).field_C.field_k = (pl) this;
        ((dka) this).field_E.field_k = (pl) this;
        ((dka) this).field_F.field_k = (pl) this;
        ((dka) this).field_E.field_h = qha.field_h;
        ((dka) this).field_F.field_h = lna.field_h;
        ((dka) this).c((wj) (Object) ((dka) this).field_C, -121);
        ((dka) this).c((wj) (Object) ((dka) this).field_E, 122);
        ((dka) this).c((wj) (Object) ((dka) this).field_F, 33);
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        int var7 = 0;
        Object var8 = null;
        var7 = BachelorFridge.field_y;
        if (((dka) this).field_C != param1) {
          if (((dka) this).field_E == param1) {
            qfa.f(114);
            if (param3 < 50) {
              var8 = null;
              dka.a((nv) null, (byte) -59);
              return;
            } else {
              return;
            }
          } else {
            if (((dka) this).field_F == param1) {
              nt.e((byte) 123);
              if (param3 < 50) {
                var8 = null;
                dka.a((nv) null, (byte) -59);
                return;
              } else {
                return;
              }
            } else {
              if (param3 >= 50) {
                return;
              } else {
                var8 = null;
                dka.a((nv) null, (byte) -59);
                return;
              }
            }
          }
        } else {
          dd.d((byte) -88);
          if (param3 >= 50) {
            return;
          } else {
            var8 = null;
            dka.a((nv) null, (byte) -59);
            return;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param3 + ((dka) this).field_s;
        int var6 = param1 + ((dka) this).field_v;
        int discarded$0 = jca.field_a.a(wfa.field_q, var5 - -20, 20 + var6, ((dka) this).field_p - 40, ((dka) this).field_q + -50, 16777215, -1, 1, 0, jca.field_a.field_u);
        this.a((byte) 74, param1, param2, param3);
        int var7 = -39 / ((param0 - -20) / 54);
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        if (param0 == 10) {
          if (!this.a(param0 + 0, param1, param2, param3)) {
            if (-99 == (param1 ^ -1)) {
              return ((dka) this).a(-123, param3);
            } else {
              if (param1 == 99) {
                return ((dka) this).b(param3, 1);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          dka.a(28);
          if (!this.a(param0 + 0, param1, param2, param3)) {
            if (-99 == (param1 ^ -1)) {
              return ((dka) this).a(-123, param3);
            } else {
              if (param1 == 99) {
                return ((dka) this).b(param3, 1);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_D = null;
        if (param0 != 26727) {
            Object var2 = null;
            dka.a((nv) null, (byte) -57);
            field_G = null;
            return;
        }
        field_G = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Report abuse";
    }
}
