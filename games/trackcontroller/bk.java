/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends td implements a, m {
    static int field_D;
    static String[] field_J;
    private rh field_H;
    private lf field_K;
    static String field_G;
    static oh field_E;
    nd field_I;
    private rh field_F;

    final void a(int param0, int param1, byte param2, al param3) {
        super.a(param0, param1, param2, param3);
        ((bk) this).field_F.field_B = this.l(19);
    }

    private final int a(int param0, int param1, int param2, al param3, int param4, String param5, String param6) {
        mi var9 = null;
        sa var10 = null;
        var10 = new sa(20, param2, param1 + 120, 25, param3, false, 120, 3, gk.field_c, 16777215, param6);
        ((bk) this).a(false, (al) (Object) var10);
        if (param4 != 19753) {
          bk.j(-14);
          var9 = new mi(((wk) (Object) param3).a((byte) -100), param5, 126, param2 - -var10.field_u, param1 - -25, param0);
          var9.field_l = (tg) this;
          ((bk) this).a(false, (al) (Object) var9);
          return var9.field_u + var10.field_u;
        } else {
          var9 = new mi(((wk) (Object) param3).a((byte) -100), param5, 126, param2 - -var10.field_u, param1 - -25, param0);
          var9.field_l = (tg) this;
          ((bk) this).a(false, (al) (Object) var9);
          return var9.field_u + var10.field_u;
        }
    }

    public final void a(boolean param0, String param1) {
        lf var3 = null;
        String var4 = null;
        Object var5 = null;
        if (!param0) {
          var5 = null;
          boolean discarded$2 = this.a((wk) null, (byte) -89);
          var3 = ((bk) this).field_K;
          var4 = param1;
          ((lb) (Object) var3).a(false, var4, -124);
          return;
        } else {
          var3 = ((bk) this).field_K;
          var4 = param1;
          ((lb) (Object) var3).a(false, var4, -124);
          return;
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        if (((bk) this).field_H != param0) {
          if (param0 != ((bk) this).field_F) {
            if (param4 != -27322) {
              ((bk) this).field_K = null;
              return;
            } else {
              return;
            }
          } else {
            this.m(-62);
            if (param4 == -27322) {
              return;
            } else {
              ((bk) this).field_K = null;
              return;
            }
          }
        } else {
          vl.m(param4 ^ -27321);
          if (param4 == -27322) {
            return;
          } else {
            ((bk) this).field_K = null;
            return;
          }
        }
    }

    private final boolean l(int param0) {
        int var2 = -4 / ((param0 - -34) / 51);
        if (!this.a((wk) (Object) ((bk) this).field_K, (byte) -93)) {
            return false;
        }
        return true;
    }

    public bk() {
        super(0, 0, 496, 0, (t) null);
        ((bk) this).field_K = new lf("", (tg) null, 12);
        ic var1 = new ic(fk.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, gk.field_c.field_G, -1, 2147483647, true);
        al var2 = new al(qd.field_a, (t) (Object) var1, (tg) null);
        ((bk) this).field_F = new rh(hb.field_a, (tg) null);
        ((bk) this).field_H = new rh(ta.field_a, (tg) null);
        ((bk) this).field_K.field_n = ak.field_c;
        ((bk) this).field_K.a(1, (eh) (Object) new af((lb) (Object) ((bk) this).field_K));
        ((bk) this).field_F.field_B = false;
        ((bk) this).field_F.field_y = (t) (Object) new dc();
        ((bk) this).field_H.field_y = (t) (Object) new ne();
        ((bk) this).field_K.field_y = (t) (Object) new dd(10000536);
        int var3 = 20;
        int var4 = 4;
        var2.a(50, -3050, var3, 270, 20);
        int var5 = 200;
        var3 += 50;
        ((bk) this).a(false, var2);
        var3 = var3 + (5 + this.a((al) (Object) ((bk) this).field_K, rg.field_a, 170, (byte) -13, var3, pb.field_b));
        ((bk) this).field_F.a(40, -3050, var3, var5, -var5 + 496 >> -668064799);
        ((bk) this).field_H.a(40, -3050, var3 + 15, 60, var4 - -3);
        ((bk) this).field_H.field_l = (tg) this;
        ((bk) this).field_F.field_l = (tg) this;
        ((bk) this).a(false, (al) (Object) ((bk) this).field_F);
        ((bk) this).a(false, (al) (Object) ((bk) this).field_H);
        ((bk) this).field_I = new nd((a) this);
        ((bk) this).field_I.a(150, -3050, 20, -60 + -((bk) this).field_K.field_p + ((bk) this).field_x - ((bk) this).field_K.field_x, 60 + (((bk) this).field_K.field_p + ((bk) this).field_K.field_x));
        ((bk) this).a(false, (al) (Object) ((bk) this).field_I);
        ((bk) this).a(55 + var3 + var4, -3050, 0, 496, 0);
    }

    private final int a(al param0, String param1, int param2, byte param3, int param4, String param5) {
        Object var8 = null;
        if (param3 != -13) {
          var8 = null;
          int discarded$2 = this.a(-122, 46, 116, (al) null, 107, (String) null, (String) null);
          return this.a(35, param2, param4, param0, 19753, param1, param5);
        } else {
          return this.a(35, param2, param4, param0, 19753, param1, param5);
        }
    }

    private final void m(int param0) {
        if (!this.l(47)) {
          return;
        } else {
          if (param0 >= -12) {
            field_G = null;
            qi.a(((bk) this).field_K.field_s, 0);
            return;
          } else {
            qi.a(((bk) this).field_K.field_s, 0);
            return;
          }
        }
    }

    private final boolean a(wk param0, byte param1) {
        eh var3 = null;
        ud var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var3 = param0.a((byte) -121);
        if (var3 == null) {
          return true;
        } else {
          if (param1 > -84) {
            L0: {
              field_J = null;
              var4 = var3.a((byte) -8);
              if (var4 != TrackController.field_G) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              var4 = var3.a((byte) -8);
              if (var4 != TrackController.field_G) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    public final void a(byte param0) {
        ((af) (Object) ((bk) this).field_K.a((byte) -97)).a(false);
        if (param0 <= 117) {
            Object var3 = null;
            boolean discarded$0 = ((bk) this).a((byte) -3, 'o', (al) null, 53);
        }
    }

    final static void j(int param0) {
        ue.field_a = ne.field_a.g(param0 + param0);
        CharSequence var2 = (CharSequence) (Object) ue.field_a;
        dd.field_p = r.a(var2, param0 + -11133);
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5 = 0;
        if (!super.a((byte) -106, param1, param2, param3)) {
          var5 = 101 / ((param0 - 17) / 51);
          if (param3 == 98) {
            return ((bk) this).a(param2, -46);
          } else {
            if (param3 == 99) {
              return ((bk) this).a(param2, true);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public static void k(int param0) {
        field_E = null;
        if (param0 >= -71) {
            return;
        }
        field_G = null;
        field_J = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
