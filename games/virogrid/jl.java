/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends fd implements ta {
    static int field_E;
    private tg field_I;
    static String field_D;
    static String field_F;
    private tg field_G;
    private tg field_H;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param1 + ((jl) this).field_l;
        int var6 = ((jl) this).field_u + param2;
        int discarded$0 = dj.field_h.a(ka.field_n, 20 + var5, 20 + var6, -40 + ((jl) this).field_g, ((jl) this).field_m - 50, 16777215, -1, 1, 0, dj.field_h.field_H);
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0, int param1, String param2, int param3, byte param4, String param5) {
        hg var6 = null;
        int var7 = 0;
        hg var8 = null;
        var8 = gk.field_g;
        var6 = var8;
        var8.g(param3, 8);
        var8.field_l = var8.field_l + 1;
        if (param4 == 39) {
          var7 = var8.field_l;
          var8.a(param1, -69);
          if (param1 != 2) {
            if (param5 != null) {
              int discarded$2 = en.a(true, param5, (jc) (Object) var8);
              var8.b(var8.field_l + -var7, -1);
              return;
            } else {
              var8.a((byte) -78, param0);
              var8.b(var8.field_l + -var7, -1);
              return;
            }
          } else {
            var8.a(param2, (byte) -102);
            if (param5 != null) {
              int discarded$3 = en.a(true, param5, (jc) (Object) var8);
              var8.b(var8.field_l + -var7, -1);
              return;
            } else {
              var8.a((byte) -78, param0);
              var8.b(var8.field_l + -var7, -1);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static byte[] a(String param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return ql.field_m.a("", 100, param0);
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        if (param0 == 12085) {
          if (((jl) this).field_H != param1) {
            if (((jl) this).field_G != param1) {
              if (((jl) this).field_I == param1) {
                jk.a(param0 ^ -18303);
                return;
              } else {
                return;
              }
            } else {
              va.a(false);
              return;
            }
          } else {
            pj.a(256);
            return;
          }
        } else {
          field_E = -62;
          if (((jl) this).field_H != param1) {
            if (((jl) this).field_G != param1) {
              if (((jl) this).field_I != param1) {
                return;
              } else {
                jk.a(param0 ^ -18303);
                return;
              }
            } else {
              va.a(false);
              return;
            }
          } else {
            pj.a(256);
            return;
          }
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5 = 0;
        if (super.a(param0, param1, param2, 13)) {
          return true;
        } else {
          if (-99 == param2) {
            return ((jl) this).b(2, param0);
          } else {
            if (-100 == param2) {
              return ((jl) this).a(-16234, param0);
            } else {
              var5 = -63 % ((-75 - param3) / 36);
              return false;
            }
          }
        }
    }

    public jl() {
        super(0, 0, 476, 225, (ol) null);
        ((jl) this).field_G = new tg(bj.field_g, (cd) null);
        ((jl) this).field_H = new tg(ql.field_o, (cd) null);
        ((jl) this).field_I = new tg(dd.field_e, (cd) null);
        hf var1 = new hf();
        ((jl) this).field_G.field_w = (ol) (Object) var1;
        ((jl) this).field_H.field_w = (ol) (Object) var1;
        ((jl) this).field_I.field_w = (ol) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> -1767185599;
        ((jl) this).field_H.a(30, true, ((jl) this).field_m + -48 - var2, -var3 + ((jl) this).field_g >> 1322522337, var4);
        ((jl) this).field_I.a(30, true, -var2 + ((jl) this).field_m + -48, var2 + var4 + (((jl) this).field_g - var3 >> -1947048287), var4);
        ((jl) this).field_G.a(30, true, ((jl) this).field_m + -78 + -(2 * var2), ((jl) this).field_g - var3 >> 1210021281, var3);
        ((jl) this).field_H.field_o = (cd) this;
        ((jl) this).field_G.field_o = (cd) this;
        ((jl) this).field_I.field_o = (cd) this;
        ((jl) this).field_G.field_h = mh.field_j;
        ((jl) this).field_I.field_h = fn.field_f;
        ((jl) this).a((fi) (Object) ((jl) this).field_H, (byte) -78);
        ((jl) this).a((fi) (Object) ((jl) this).field_G, (byte) -78);
        ((jl) this).a((fi) (Object) ((jl) this).field_I, (byte) -78);
    }

    final static boolean a(int param0) {
        if (param0 > -123) {
            field_F = null;
            return ab.field_J;
        }
        return ab.field_J;
    }

    public static void f(int param0) {
        field_D = null;
        field_F = null;
        if (param0 != 15354) {
            Object var2 = null;
            jl.a(41, -123, (String) null, -103, (byte) -32, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Unable to add friend - system busy";
        field_D = "Back";
    }
}
