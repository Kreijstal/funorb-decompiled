/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends hn implements ba, ng {
    private lg field_E;
    static gg[] field_F;
    static la field_C;
    private gp field_H;
    private lg field_B;
    static int field_G;
    vp field_I;

    private final int a(int param0, int param1, String param2, gm param3, int param4, boolean param5, String param6) {
        bj var9 = null;
        na var10 = null;
        var10 = new na(20, param0, param1 + 120, 25, param3, false, 120, 3, dg.field_e, 16777215, param2);
        ((th) this).a((gm) (Object) var10, -6938);
        var9 = new bj(((wg) (Object) param3).a(-10116), param6, 126, param0 - -var10.field_o, param1 - -25, param4);
        var9.field_t = (ca) this;
        if (!param5) {
          ((th) this).field_I = null;
          ((th) this).a((gm) (Object) var9, -6938);
          return var9.field_o + var10.field_o;
        } else {
          ((th) this).a((gm) (Object) var9, -6938);
          return var9.field_o + var10.field_o;
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param0 < -85) {
          if (((th) this).field_E != param1) {
            if (((th) this).field_B == param1) {
              this.g((byte) 120);
              return;
            } else {
              return;
            }
          } else {
            og.a(6);
            return;
          }
        } else {
          var7 = null;
          ((th) this).a(-56, (gm) null, 62, 24);
          if (((th) this).field_E != param1) {
            if (((th) this).field_B != param1) {
              return;
            } else {
              this.g((byte) 120);
              return;
            }
          } else {
            og.a(6);
            return;
          }
        }
    }

    public final void a(byte param0) {
        ((il) (Object) ((th) this).field_H.a(-10116)).e(-97);
        if (param0 < 89) {
            ((th) this).field_I = null;
        }
    }

    final static void a(int param0, gg param1) {
        tb.field_l.a(param1, param0, on.field_c * 96 / 160);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = Torquing.field_u;
        if (param7 >= param13) {
          if (param15 <= param7) {
            if (param15 > param13) {
              kj.a(param6, param2, param11, param12, param14, ph.field_e, param5, 388870384, param1, param0, param3, param15, param4, param9, param8, param13, param7);
              if (param10 != -25) {
                th.a(21, -20, -21, -16, -119, -99, 65, 87, -16, -122, -124, -67, -66, 29, 56, -5);
                return;
              } else {
                return;
              }
            } else {
              kj.a(param8, param12, param14, param2, param11, ph.field_e, param5, 388870384, param4, param0, param3, param13, param1, param9, param6, param15, param7);
              if (param10 != -25) {
                th.a(21, -20, -21, -16, -119, -99, 65, 87, -16, -122, -124, -67, -66, 29, 56, -5);
                return;
              } else {
                return;
              }
            }
          } else {
            kj.a(param3, param2, param11, param9, param0, ph.field_e, param1, param10 + 388870409, param5, param14, param6, param7, param4, param12, param8, param13, param15);
            if (param10 != -25) {
              th.a(21, -20, -21, -16, -119, -99, 65, 87, -16, -122, -124, -67, -66, 29, 56, -5);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param13 >= param15) {
            if (param15 <= param7) {
              kj.a(param3, param12, param14, param9, param0, ph.field_e, param4, param10 ^ -388870377, param5, param11, param8, param7, param1, param2, param6, param15, param13);
              if (param10 == -25) {
                return;
              } else {
                th.a(21, -20, -21, -16, -119, -99, 65, 87, -16, -122, -124, -67, -66, 29, 56, -5);
                return;
              }
            } else {
              kj.a(param6, param9, param0, param12, param14, ph.field_e, param4, param10 ^ -388870377, param1, param11, param8, param15, param5, param2, param3, param7, param13);
              if (param10 == -25) {
                return;
              } else {
                th.a(21, -20, -21, -16, -119, -99, 65, 87, -16, -122, -124, -67, -66, 29, 56, -5);
                return;
              }
            }
          } else {
            kj.a(param8, param9, param0, param2, param11, ph.field_e, param1, 388870384, param4, param14, param6, param13, param5, param12, param3, param7, param15);
            if (param10 != -25) {
              th.a(21, -20, -21, -16, -119, -99, 65, 87, -16, -122, -124, -67, -66, 29, 56, -5);
              return;
            } else {
              return;
            }
          }
        }
    }

    private final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        if (!this.a(-127, (wg) (Object) ((th) this).field_H)) {
            return false;
        }
        return true;
    }

    private final boolean a(int param0, wg param1) {
        int var4 = 119 / ((-49 - param0) / 63);
        sk var3 = param1.a(-10116);
        if (!(var3 != null)) {
            return true;
        }
        cd var5 = var3.a((byte) -77);
        return so.field_s == var5 ? true : false;
    }

    public static void h(int param0) {
        field_F = null;
        field_C = null;
        if (param0 != 2147483647) {
            field_F = null;
        }
    }

    public final void a(byte param0, String param1) {
        if (param0 != 21) {
            return;
        }
        gp var3 = ((th) this).field_H;
        String var4 = param1;
        ((tk) (Object) var3).a(false, var4, true);
    }

    public th() {
        super(0, 0, 496, 0, (el) null);
        ((th) this).field_H = new gp("", (ca) null, 12);
        pc var1 = new pc(sp.field_R, 0, 0, 0, 0, 16777215, -1, 3, 0, dg.field_e.field_x, -1, 2147483647, true);
        gm var2 = new gm(sa.field_a, (el) (Object) var1, (ca) null);
        ((th) this).field_B = new lg(dh.field_d, (ca) null);
        ((th) this).field_E = new lg(dg.field_j, (ca) null);
        ((th) this).field_H.field_n = ag.field_d;
        ((th) this).field_H.a((sk) (Object) new il((tk) (Object) ((th) this).field_H), 83);
        ((th) this).field_B.field_x = false;
        ((th) this).field_B.field_q = (el) (Object) new rf();
        ((th) this).field_E.field_q = (el) (Object) new je();
        ((th) this).field_H.field_q = (el) (Object) new ig(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a((byte) -70, 20, var3, 50, 270);
        ((th) this).a(var2, -6938);
        var3 += 50;
        var3 = var3 + (this.a(de.field_b, 170, (gm) (Object) ((th) this).field_H, ad.field_l, var3, 126) + 5);
        ((th) this).field_B.a((byte) 124, 496 + -var5 >> -560420351, var3, 40, var5);
        ((th) this).field_E.a((byte) 125, 3 + var4, 15 + var3, 40, 60);
        ((th) this).field_E.field_t = (ca) this;
        ((th) this).field_B.field_t = (ca) this;
        ((th) this).a((gm) (Object) ((th) this).field_B, -6938);
        ((th) this).a((gm) (Object) ((th) this).field_E, -6938);
        ((th) this).field_I = new vp((ba) this);
        ((th) this).field_I.a((byte) -94, ((th) this).field_H.field_w + (((th) this).field_H.field_p - -60), 20, 150, -((th) this).field_H.field_w + (((th) this).field_p + -((th) this).field_H.field_p + -60));
        ((th) this).a((gm) (Object) ((th) this).field_I, -6938);
        ((th) this).a((byte) 127, 0, 0, var3 + 55 - -var4, 496);
    }

    private final int a(String param0, int param1, gm param2, String param3, int param4, int param5) {
        if (param5 < 111) {
            return -54;
        }
        return this.a(param4, param1, param3, param2, 35, true, param0);
    }

    private final void g(byte param0) {
        if (param0 > 119) {
          if (!this.b(true)) {
            return;
          } else {
            cm.a((byte) -21, ((th) this).field_H.field_m);
            return;
          }
        } else {
          boolean discarded$2 = ((th) this).a(23, (gm) null, 'ﾚ', -1);
          if (!this.b(true)) {
            return;
          } else {
            cm.a((byte) -21, ((th) this).field_H.field_m);
            return;
          }
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        if (super.a(param0, param1, param2, 107)) {
            return true;
        }
        if ((param0 ^ -1) == -99) {
            return ((th) this).a((byte) -120, param1);
        }
        if (!((param0 ^ -1) != -100)) {
            return ((th) this).b(param1, -9928);
        }
        int var5 = 30 / ((param3 - -33) / 57);
        return false;
    }

    final void a(int param0, gm param1, int param2, int param3) {
        super.a(-113, param1, param2, param3);
        ((th) this).field_B.field_x = this.b(true);
        int var5 = 109 % ((param0 - -28) / 43);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new gg[29];
    }
}
