/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends nv {
    static nh field_r;
    private int field_p;
    private int field_n;
    private int field_v;
    private int field_t;
    private pc field_u;
    private int field_w;
    private pc field_o;
    private int field_s;
    private int field_q;

    final int a(boolean param0) {
        if (param0) {
            return -109;
        }
        return 29;
    }

    final void n(byte param0) {
        if (param0 <= 68) {
            return;
        }
        super.n((byte) 102);
        this.b(1659280738);
        this.j((byte) 1);
    }

    private final void b(int param0) {
        int var2 = 0;
        Object var3 = null;
        var2 = ((mc) this).field_g.g(-25787);
        if (param0 == 1659280738) {
          var2 = dfa.a(2048 + var2, 8192, -34);
          if (var2 != ((mc) this).field_v) {
            ((mc) this).field_t = hua.a((byte) 99, var2 >> -1142523166);
            ((mc) this).field_p = bua.a(0, var2 >> 281856386);
            ((mc) this).field_v = var2;
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          boolean discarded$1 = ((mc) this).a(65, 57, (pc) null, 85);
          var2 = dfa.a(2048 + var2, 8192, -34);
          if (var2 == ((mc) this).field_v) {
            return;
          } else {
            ((mc) this).field_t = hua.a((byte) 99, var2 >> -1142523166);
            ((mc) this).field_p = bua.a(0, var2 >> 281856386);
            ((mc) this).field_v = var2;
            return;
          }
        }
    }

    final int a(int param0, int param1) {
        param0 = fs.a((byte) 83, param0, ((mc) this).field_w);
        if (param1 > -48) {
            return -43;
        }
        return param0;
    }

    private final int a(boolean param0, pc param1) {
        if (!param0) {
          ((mc) this).field_s = 47;
          return ua.a(-param1.field_d + param1.field_e, -104) - -ua.a(param1.field_a + -param1.field_k, -109);
        } else {
          return ua.a(-param1.field_d + param1.field_e, -104) - -ua.a(param1.field_a + -param1.field_k, -109);
        }
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    mc(la param0, boolean param1) {
        super(param0, param1);
        ((mc) this).field_v = -1;
        ((mc) this).field_u = new pc();
    }

    mc(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((mc) this).field_v = -1;
        ((mc) this).field_u = new pc();
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 == 1) {
          var5 = al.a(param2, 12, 12, ((mc) this).field_u);
          if (-1 == var5) {
            ((mc) this).field_o = null;
            return false;
          } else {
            var6 = wm.a(4096, var5, -61);
            param2.a(var6, (byte) 47);
            ((mc) this).field_o = param2;
            ((mc) this).field_s = this.a(true, param2);
            ((mc) this).field_q = param0;
            ((mc) this).field_w = var6;
            return true;
          }
        } else {
          field_r = null;
          var5 = al.a(param2, 12, 12, ((mc) this).field_u);
          if (-1 == var5) {
            ((mc) this).field_o = null;
            return false;
          } else {
            var6 = wm.a(4096, var5, -61);
            param2.a(var6, (byte) 47);
            ((mc) this).field_o = param2;
            ((mc) this).field_s = this.a(true, param2);
            ((mc) this).field_q = param0;
            ((mc) this).field_w = var6;
            return true;
          }
        }
    }

    public static void g(byte param0) {
        field_r = null;
        int var1 = -15 / ((-36 - param0) / 62);
    }

    final int a(int param0, up param1, pc param2) {
        int var4 = 0;
        pc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        la var16 = null;
        if (param2 != ((mc) this).field_o) {
          return 0;
        } else {
          var4 = this.a(true, param2);
          if (((mc) this).field_s != var4) {
            return 0;
          } else {
            if (param2.field_b != 0) {
              var5 = new pc();
              if (param0 >= -85) {
                field_r = null;
                param2.field_h = var5;
                var6 = param2.field_e;
                var5.field_j = param2.field_j;
                var7 = param2.field_a;
                var5.field_i = param2.field_i;
                var8 = qva.a((byte) -99, -param2.field_k + var7, var6 + -param2.field_d);
                var9 = dfa.a(((mc) this).field_v - -2048, 8192, -71);
                var10 = cf.a(8192, -16390, var8, var9);
                var11 = dfa.a(2 * var10 + var8 + 4096, 8192, 126);
                var12 = hua.a((byte) 99, var11 >> 1495315202);
                var13 = bua.a(0, var11 >> 1659280738);
                var14 = param2.field_b + -gqa.a(param2.field_b, (byte) 24, ((mc) this).field_w);
                var15 = var14 >> 722855112;
                var5.a(var6, (var12 >> 514243848) * var15 + var6, var7, (var13 >> 901024040) * var15 + var7, 44);
                var5.field_b = var14;
                var16 = ((mc) this).b(true);
                boolean discarded$2 = var16.a(((mc) this).field_q, (gma) (Object) ((mc) this).field_g, -108, var5, (gma) (Object) ((mc) this).e(6), param1);
                return 0;
              } else {
                param2.field_h = var5;
                var6 = param2.field_e;
                var5.field_j = param2.field_j;
                var7 = param2.field_a;
                var5.field_i = param2.field_i;
                var8 = qva.a((byte) -99, -param2.field_k + var7, var6 + -param2.field_d);
                var9 = dfa.a(((mc) this).field_v - -2048, 8192, -71);
                var10 = cf.a(8192, -16390, var8, var9);
                var11 = dfa.a(2 * var10 + var8 + 4096, 8192, 126);
                var12 = hua.a((byte) 99, var11 >> 1495315202);
                var13 = bua.a(0, var11 >> 1659280738);
                var14 = param2.field_b + -gqa.a(param2.field_b, (byte) 24, ((mc) this).field_w);
                var15 = var14 >> 722855112;
                var5.a(var6, (var12 >> 514243848) * var15 + var6, var7, (var13 >> 901024040) * var15 + var7, 44);
                var5.field_b = var14;
                var16 = ((mc) this).b(true);
                boolean discarded$3 = var16.a(((mc) this).field_q, (gma) (Object) ((mc) this).field_g, -108, var5, (gma) (Object) ((mc) this).e(6), param1);
                return 0;
              }
            } else {
              return 0;
            }
          }
        }
    }

    final void a(boolean param0, fsa param1) {
        super.a(true, param1);
        param1.a(param0, 120);
        ((mc) this).field_n = et.b(param1.a((byte) 55), param1.c(-23), -23);
        this.b(1659280738);
        this.j((byte) 1);
    }

    private final void j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var2 = ((mc) this).field_g.d(param0 ^ 2);
        if (param0 != 1) {
          return;
        } else {
          var3 = ((mc) this).field_g.e(9648);
          var4 = ((mc) this).field_n >> -863593368;
          var5 = (((mc) this).field_t >> -21523160) * var4 / 2;
          var6 = var4 * (((mc) this).field_p >> 398248840) / 2;
          ((mc) this).field_u.a(var2 - var5, var5 + var2, -var6 + var3, var6 + var3, 44);
          return;
        }
    }

    final void k(int param0) {
        this.b(param0 ^ 1659275336);
        if (param0 != 5418) {
          ((mc) this).field_p = 81;
          this.j((byte) 1);
          return;
        } else {
          this.j((byte) 1);
          return;
        }
    }

    static {
    }
}
