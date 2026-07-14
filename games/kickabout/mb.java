/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends wj implements ur, vh {
    fr field_G;
    private wi field_E;
    static hd field_F;
    private wi field_B;
    private mr field_C;

    public final void a(String param0, int param1) {
        mr var3 = null;
        String var4 = null;
        if (param1 != 15) {
          ((mb) this).a(-18);
          var3 = ((mb) this).field_C;
          var4 = param0;
          ((ga) (Object) var3).a(var4, (byte) -17, false);
          return;
        } else {
          var3 = ((mb) this).field_C;
          var4 = param0;
          ((ga) (Object) var3).a(var4, (byte) -17, false);
          return;
        }
    }

    public final void a(int param0) {
        if (param0 != -1) {
            return;
        }
        ((bv) (Object) ((mb) this).field_C.a((byte) -116)).c((byte) 101);
    }

    private final int a(String param0, int param1, int param2, fd param3, int param4, int param5, String param6) {
        cg var11 = new cg(20, param5, param1 + 120, 25, param3, false, 120, 3, gf.field_a, 16777215, param0);
        ((mb) this).a(-55, (fd) (Object) var11);
        ju var9 = new ju(((cw) (Object) param3).a((byte) -120), param6, 126, var11.field_i + param5, param1 - -25, param2);
        var9.field_k = (jv) this;
        int var10 = -123 % ((param4 - 24) / 41);
        ((mb) this).a(-58, (fd) (Object) var9);
        return var9.field_i + var11.field_i;
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        Object var7 = null;
        if (param3 > 64) {
          if (((mb) this).field_E != param1) {
            if (param1 != ((mb) this).field_B) {
              return;
            } else {
              this.k(-81);
              return;
            }
          } else {
            nn.a(-25085);
            return;
          }
        } else {
          var7 = null;
          ((mb) this).a((String) null, -65);
          if (((mb) this).field_E != param1) {
            if (param1 != ((mb) this).field_B) {
              return;
            } else {
              this.k(-81);
              return;
            }
          } else {
            nn.a(-25085);
            return;
          }
        }
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        if (!(!super.a(param0, (byte) -108, param2, param3))) {
            return true;
        }
        if (param1 > -60) {
            ((mb) this).field_B = null;
            if (!(98 != param3)) {
                return ((mb) this).a(param2, (byte) -100);
            }
            if (-100 == (param3 ^ -1)) {
                return ((mb) this).b(param2, (byte) 123);
            }
            return false;
        }
        if (!(98 != param3)) {
            return ((mb) this).a(param2, (byte) -100);
        }
        if (!(-100 != (param3 ^ -1))) {
            return ((mb) this).b(param2, (byte) 123);
        }
        return false;
    }

    public mb() {
        super(0, 0, 496, 0, (gj) null);
        ((mb) this).field_C = new mr("", (jv) null, 12);
        qv var1 = new qv(qo.field_k, 0, 0, 0, 0, 16777215, -1, 3, 0, gf.field_a.field_G, -1, 2147483647, true);
        fd var2 = new fd(vt.field_b, (gj) (Object) var1, (jv) null);
        ((mb) this).field_B = new wi(ap.field_x, (jv) null);
        ((mb) this).field_E = new wi(vt.field_a, (jv) null);
        ((mb) this).field_C.field_u = sr.field_b;
        ((mb) this).field_C.a(6, (l) (Object) new bv((ga) (Object) ((mb) this).field_C));
        ((mb) this).field_B.field_y = false;
        ((mb) this).field_B.field_r = (gj) (Object) new op();
        ((mb) this).field_E.field_r = (gj) (Object) new cr();
        ((mb) this).field_C.field_r = (gj) (Object) new ri(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 1, 20, 270, var3);
        ((mb) this).a(-86, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, jk.field_i, ua.field_f, (fd) (Object) ((mb) this).field_C, (byte) 29, 170));
        ((mb) this).field_B.a(40, 1, -var5 + 496 >> -1832413855, var5, var3);
        ((mb) this).field_E.a(40, 1, var4 + 3, 60, 15 + var3);
        ((mb) this).field_E.field_k = (jv) this;
        ((mb) this).field_B.field_k = (jv) this;
        ((mb) this).a(-50, (fd) (Object) ((mb) this).field_B);
        ((mb) this).a(-84, (fd) (Object) ((mb) this).field_E);
        ((mb) this).field_G = new fr((ur) this);
        ((mb) this).field_G.a(150, 1, ((mb) this).field_C.field_t + (((mb) this).field_C.field_n + 60), -((mb) this).field_C.field_n + ((mb) this).field_n - ((mb) this).field_C.field_t + -60, 20);
        ((mb) this).a(-16, (fd) (Object) ((mb) this).field_G);
        ((mb) this).a(var4 + (var3 - -55), 1, 0, 496, 0);
    }

    private final boolean l(int param0) {
        Object var3 = null;
        if (!this.a(param0 ^ 484, (cw) (Object) ((mb) this).field_C)) {
          return false;
        } else {
          if (param0 != 20) {
            var3 = null;
            boolean discarded$2 = ((mb) this).a('L', (byte) 88, (fd) null, -112);
            return true;
          } else {
            return true;
          }
        }
    }

    private final int a(int param0, String param1, String param2, fd param3, byte param4, int param5) {
        if (param4 != 29) {
          ((mb) this).field_G = null;
          return this.a(param2, param5, 35, param3, -93, param0, param1);
        } else {
          return this.a(param2, param5, 35, param3, -93, param0, param1);
        }
    }

    public static void a(byte param0) {
        if (param0 >= -35) {
            mb.a((byte) 102);
            field_F = null;
            return;
        }
        field_F = null;
    }

    private final boolean a(int param0, cw param1) {
        l var3 = null;
        rv var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = param1.a((byte) -116);
        if (var3 != null) {
          var4 = var3.c(-24407);
          if (param0 != 496) {
            return true;
          } else {
            L0: {
              if (var4 != he.field_yb) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((mb) this).field_B.field_y = this.l(20);
    }

    private final void k(int param0) {
        Object var3 = null;
        if (this.l(20)) {
          if (param0 >= -58) {
            var3 = null;
            ((mb) this).a((String) null, -109);
            fn.a((byte) 19, ((mb) this).field_C.field_q);
            return;
          } else {
            fn.a((byte) 19, ((mb) this).field_C.field_q);
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
