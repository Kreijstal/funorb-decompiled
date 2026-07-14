/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends ta implements ai {
    private s field_B;
    static int field_C;
    private s field_E;
    private s field_D;

    public hm() {
        super(0, 0, 476, 225, (td) null);
        ((hm) this).field_D = new s(ki.field_h, (ag) null);
        ((hm) this).field_B = new s(bi.field_b, (ag) null);
        ((hm) this).field_E = new s(gl.field_k, (ag) null);
        vk var1 = new vk();
        ((hm) this).field_D.field_j = (td) (Object) var1;
        ((hm) this).field_B.field_j = (td) (Object) var1;
        ((hm) this).field_E.field_j = (td) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 229140609;
        ((hm) this).field_B.a(-var3 + ((hm) this).field_m >> 925249953, ((hm) this).field_r + -48 - var2, 30, (byte) -90, var4);
        ((hm) this).field_E.a(var2 + (var4 + (-var3 + ((hm) this).field_m >> -254843839)), -var2 + -48 + ((hm) this).field_r, 30, (byte) -90, var4);
        ((hm) this).field_D.a(((hm) this).field_m - var3 >> -271686975, -(2 * var2) + -78 + ((hm) this).field_r, 30, (byte) -90, var3);
        ((hm) this).field_B.field_h = (ag) this;
        ((hm) this).field_D.field_h = (ag) this;
        ((hm) this).field_D.field_i = ec.field_J;
        ((hm) this).field_E.field_h = (ag) this;
        ((hm) this).field_E.field_i = og.field_j;
        ((hm) this).a((pj) (Object) ((hm) this).field_B, (byte) 74);
        ((hm) this).a((pj) (Object) ((hm) this).field_D, (byte) 74);
        ((hm) this).a((pj) (Object) ((hm) this).field_E, (byte) 74);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((hm) this).field_s + param3;
        int var6 = ((hm) this).field_n - -param0;
        int discarded$0 = lm.field_f.a(bm.field_b, var5 - -20, 20 + var6, ((hm) this).field_m - 40, ((hm) this).field_r - 50, 16777215, -1, 1, 0, lm.field_f.field_H);
        super.a(param0, param1, param2, param3);
    }

    final static ki a(int param0, boolean param1, boolean param2, int param3, int param4) {
        Object var6 = null;
        if (param0 != 48) {
          var6 = null;
          hm.a((String) null, (byte) 56, false, true);
          return al.a(param1, 5200, param3, param4, param2, false);
        } else {
          return al.a(param1, 5200, param3, param4, param2, false);
        }
    }

    final static void a(String param0, byte param1, boolean param2, boolean param3) {
        bg.a(false);
        bm.field_d.n(7920);
        ig.field_ib = new pk(vh.field_k, (String) null, vh.field_j, param3, param2);
        kg.field_j = new pc(bm.field_d, (pj) (Object) ig.field_ib);
        if (param1 != 33) {
          ki discarded$2 = hm.a(-114, false, true, 50, -56);
          bm.field_d.b((byte) 74, (pj) (Object) kg.field_j);
          return;
        } else {
          bm.field_d.b((byte) 74, (pj) (Object) kg.field_j);
          return;
        }
    }

    final static boolean a(int param0, char param1) {
        Object var3 = null;
        if (param0 == -20625) {
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          hm.a((String) null, (byte) -28, true, true);
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        if (!super.a(param0, param1, param2, param3 ^ param3)) {
          if ((param1 ^ -1) == -99) {
            return ((hm) this).a(param2, false);
          } else {
            if ((param1 ^ -1) == -100) {
              return ((hm) this).b(param2, false);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3) {
        pc.a((byte) 53, 0, 160, 0, param2, 120, ul.field_b, 0, 0, param3, 1920, param0);
        jl.a(0, 160, param1, 0, -1, 120, 0, 0, ul.field_b, 0);
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (param3 != ((hm) this).field_B) {
          if (((hm) this).field_D != param3) {
            if (((hm) this).field_E == param3) {
              kj.j(4);
              var6 = -128 % ((param0 - -3) / 62);
              return;
            } else {
              var6 = -128 % ((param0 - -3) / 62);
              return;
            }
          } else {
            d.c((byte) -126);
            var6 = -128 % ((param0 - -3) / 62);
            return;
          }
        } else {
          sg.k(-16);
          var6 = -128 % ((param0 - -3) / 62);
          return;
        }
    }

    static {
    }
}
