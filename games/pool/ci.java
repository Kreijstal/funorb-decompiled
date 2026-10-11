/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private int field_q;
    private int field_j;
    static int field_f;
    private int field_e;
    static int field_k;
    static int field_i;
    static int[] field_s;
    private int field_l;
    static int[][] field_d;
    private int field_g;
    static String field_a;
    static of field_c;
    private int field_n;
    private int field_r;
    private int field_o;
    private int field_b;
    static String field_m;
    static dd field_h;
    static int[] field_p;

    final boolean c(byte param0) {
        if (wn.field_i < this.field_j) {
          if (param0 <= -79) {
            return false;
          }
          field_k = 111;
          return false;
        }
        if (wn.field_i > this.field_l) {
          if (param0 <= -79) {
            return false;
          }
          field_k = 111;
          return false;
        }
        if (gg.field_f >= this.field_e) {
          if (this.field_q >= gg.field_f) {
            this.a(-wp.field_d, false);
            return true;
          }
          if (param0 <= -79) {
            return false;
          }
          field_k = 111;
          return false;
        }
        if (param0 <= -79) {
          return false;
        }
        field_k = 111;
        return false;
    }

    final void c(int param0) {
        int var2 = 0;
        sa.field_h.a(this.b((byte) 36) + ": " + Integer.toString(this.a(-195801560), 16), this.field_r, this.field_g, 15658734, -1);
        if (param0 == 3) {
          qh.f(this.field_j, this.field_e, 16, 80, 3381555);
          var2 = this.field_q - (this.a(param0 ^ -195801557) - this.field_b) * 80 / (this.field_o - this.field_b);
          qh.d(this.field_j, var2, this.field_l, var2, 16764006);
          return;
        }
    }

    private final void a(boolean param0, int param1) {
        int stackIn_12_0 = 0;
        boolean stackIn_13_1 = false;
        int stackIn_43_0 = 0;
        boolean stackIn_44_1 = false;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Pool.field_O;
        if (param0) {
          var3 = this.field_n;
          if (var3 == 0) {
            tl.field_K = param1 >> 8;
            return;
          }
          if (var3 == 1) {
            ca.field_l = param1 >> 8;
            return;
          }
          if (var3 == 2) {
            dj.field_g = param1 >> 8;
            return;
          }
          if (var3 == 3) {
            kp.field_m = param1 >> 8;
            return;
          }
          if (var3 == 4) {
            dr.field_b = param1;
            stackIn_43_0 = 6429081;
            stackIn_44_1 = (param0) ? false : true;
            dr.field_f = aj.a(stackIn_43_0, stackIn_44_1, dr.field_b);
            return;
          }
          if (var3 == 5) {
            l.field_e = param1;
            l.field_g = aj.a(6429081, false, l.field_e);
            return;
          }
          if (var3 == 6) {
            bl.field_g = param1;
            return;
          }
          if (var3 == 7) {
            uh.field_q = param1;
            uh.field_w = uh.field_q * 128 / 5;
            return;
          }
          if (var3 == 8) {
            wn.field_l = param1;
            return;
          }
          if (var3 == 9) {
            kj.field_f = param1;
            return;
          }
          if (var3 != 10) {
            return;
          }
          pr.field_l = param1;
          return;
        }
        this.field_e = 58;
        var3Lifetime1 = this.field_n;
        if (var3Lifetime1 == 0) {
          tl.field_K = param1 >> 8;
          return;
        }
        if (var3Lifetime1 == 1) {
          ca.field_l = param1 >> 8;
          return;
        }
        if (var3Lifetime1 == 2) {
          dj.field_g = param1 >> 8;
          return;
        }
        if (var3Lifetime1 == 3) {
          kp.field_m = param1 >> 8;
          return;
        }
        if (var3Lifetime1 == 4) {
          dr.field_b = param1;
          stackIn_12_0 = 6429081;
          stackIn_13_1 = (param0) ? false : true;
          dr.field_f = aj.a(stackIn_12_0, stackIn_13_1, dr.field_b);
          return;
        }
        if (var3Lifetime1 == 5) {
          l.field_e = param1;
          l.field_g = aj.a(6429081, false, l.field_e);
          return;
        }
        if (var3Lifetime1 == 6) {
          bl.field_g = param1;
          return;
        }
        if (var3Lifetime1 == 7) {
          uh.field_q = param1;
          uh.field_w = uh.field_q * 128 / 5;
          return;
        }
        if (var3Lifetime1 == 8) {
          wn.field_l = param1;
          return;
        }
        if (var3Lifetime1 == 9) {
          kj.field_f = param1;
          return;
        }
        if (var3Lifetime1 != 10) {
          return;
        }
        pr.field_l = param1;
    }

    final static void d(byte param0) {
        wd.field_Ub.k(-22216);
        if (of.field_Nb == null) {
          of.field_Nb = new wa(wd.field_Ub, oa.field_d);
        }
        if (param0 <= -108) {
          wd.field_Ub.b(of.field_Nb, 30000);
          return;
        }
        String var2 = (String) null;
        ci.a((String) null, -115);
        wd.field_Ub.b(of.field_Nb, 30000);
    }

    final static void a(String param0, int param1) {
        th.field_g = param0;
        if (param1 >= -126) {
          return;
        }
        try {
          lf.a(12, (byte) 102);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ci.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean b(int param0) {
        String discarded$0 = null;
        if (param0 == 59) {
          if (cd.field_b == 0) {
            return false;
          }
          if (wn.field_i < this.field_j) {
            return false;
          }
          if (wn.field_i > this.field_l) {
            return false;
          }
          if (gg.field_f < this.field_e) {
            return false;
          }
          if (this.field_q < gg.field_f) {
            return false;
          }
          this.a(true, this.field_b + (-this.field_b + this.field_o) * (-gg.field_f + this.field_q) / 80);
          return true;
        }
        discarded$0 = this.b((byte) 118);
        if (cd.field_b == 0) {
          return false;
        }
        if (wn.field_i < this.field_j) {
          return false;
        }
        if (wn.field_i > this.field_l) {
          return false;
        }
        if (gg.field_f < this.field_e) {
          return false;
        }
        if (this.field_q < gg.field_f) {
          return false;
        }
        this.a(true, this.field_b + (-this.field_b + this.field_o) * (-gg.field_f + this.field_q) / 80);
        return true;
    }

    final static void a(int param0, int param1, nm param2, int param3, int param4, nm param5) {
        try {
          oc.field_B = param4;
          uk.field_d = param2;
          rm.field_e = param5;
          bj.field_m = param0;
          qi.field_g = param3;
          if (param1 != 26790) {
            String var7 = (String) null;
            ci.a((String) null, 118);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ci.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        this.field_o = param0;
        this.field_b = param1;
        this.field_n = param2;
        int var5 = sa.field_h.field_C + (18 + sa.field_h.field_w);
        if (param3 == -6) {
          this.field_g = 472;
          this.field_r = var5 * this.field_n + sa.field_h.field_C;
          this.field_j = sa.field_h.field_w + (this.field_r + 2);
          this.field_l = this.field_j + 16;
          this.field_e = 392;
          this.field_q = 80 + this.field_e;
          return;
        }
    }

    private final int a(int param0) {
        int var2;
        if (param0 != -195801560) {
          return 37;
        }
        var2 = this.field_n;
        if (0 == var2) {
          return tl.field_K << 8;
        }
        if (var2 == 1) {
          return ca.field_l << 8;
        }
        if (var2 == 2) {
          return dj.field_g << 8;
        }
        if (var2 == 3) {
          return kp.field_m << 8;
        }
        if (var2 == 4) {
          return dr.field_b;
        }
        if (5 == var2) {
          return l.field_e;
        }
        if (var2 == 6) {
          return bl.field_g;
        }
        if (7 == var2) {
          return uh.field_q;
        }
        if (var2 == 8) {
          return wn.field_l;
        }
        if (var2 == 9) {
          return kj.field_f;
        }
        if (var2 == 10) {
          return pr.field_l;
        }
        return -1;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 == 8) {
          field_s = null;
          field_p = null;
          field_h = null;
          field_m = null;
          field_c = null;
          field_d = (int[][]) null;
          return;
        }
        ci.d((byte) -32);
        field_s = null;
        field_p = null;
        field_h = null;
        field_m = null;
        field_c = null;
        field_d = (int[][]) null;
    }

    ci(float param0, float param1, int param2) {
        this.a(em.a(param1, -4), em.a(param0, -4), param2, -6);
    }

    private final void a(int param0, boolean param1) {
        boolean stackIn_4_1 = false;
        boolean stackIn_12_1 = false;
        boolean stackIn_20_1 = false;
        boolean stackIn_28_1 = false;
        int var3;
        nm var4;
        nm var4Lifetime1;
        var3 = this.field_n;
        if (var3 == 0) {
          stackIn_4_1 = !(param1);
          this.a(stackIn_4_1, param0 * 256 + this.a(-195801560));
        } else {
          if (var3 == 1) {
            stackIn_12_1 = !(param1);
            this.a(stackIn_12_1, param0 * 256 + this.a(-195801560));
          } else {
            if (var3 == 2) {
              stackIn_20_1 = !(param1);
              this.a(stackIn_20_1, param0 * 256 + this.a(-195801560));
            } else {
              if (3 != var3) {
                this.a(true, param0 + this.a(-195801560));
                if (!param1) {
                  return;
                }
                var4 = (nm) null;
                ci.a(-37, 7, (nm) null, 78, 67, (nm) null);
                return;
              }
              stackIn_28_1 = !(param1);
              this.a(stackIn_28_1, param0 * 256 + this.a(-195801560));
            }
          }
        }
        if (!param1) {
          return;
        }
        var4Lifetime1 = (nm) null;
        ci.a(-37, 7, (nm) null, 78, 67, (nm) null);
    }

    private final String b(byte param0) {
        int discarded$0 = 0;
        int var2;
        if (param0 != 36) {
          discarded$0 = this.a(11);
        }
        var2 = this.field_n;
        if (var2 == 0) {
          return "Ball-ball";
        }
        if (1 == var2) {
          return "Ball-ball ang";
        }
        if (2 == var2) {
          return "Ball-cush";
        }
        if (var2 == 3) {
          return "Ball-cush ang";
        }
        if (var2 == 4) {
          return "Slid Coef";
        }
        if (var2 == 5) {
          return "Roll coef";
        }
        if (var2 == 6) {
          return "Overspin";
        }
        if (var2 == 7) {
          return "Ball mass";
        }
        if (var2 == 8) {
          return "Z spin fric";
        }
        if (9 == var2) {
          return "Cue force";
        }
        if (var2 != 10) {
          return "Banana in disk drive error.";
        }
        return "Side spin";
    }

    static {
        field_s = new int[]{8, 8};
        field_f = 0;
        field_i = -1;
        field_a = "Your ignore list is full. Max of 100 hit.";
        field_m = "If you are not, please change your password to something more obscure!";
        field_h = new dd(270, 70);
    }
}
