/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends hd {
    static int field_Bb;
    na field_Fb;
    static tf field_Jb;
    static String field_Eb;
    hd field_Ab;
    static String field_yb;
    static hd field_Cb;
    hd field_zb;
    static String field_Db;
    static hd field_Hb;
    static String field_Ib;
    static String field_Gb;

    private final void a(boolean param0, int param1, int param2, int param3, boolean param4) {
        if (this.field_Fb.j(-819561055)) {
          this.field_Ab.field_v = this.field_Ab.field_v + param2;
        }
        if (this.field_Fb.h((byte) -40)) {
          this.field_Ab.field_v = this.field_Ab.field_v - param2;
        }
        if (this.field_Fb.b(23028)) {
          this.field_Ab.field_v = this.field_Ab.field_v + param3;
        }
        if (this.field_Fb.m(-1)) {
          this.field_Ab.field_v = this.field_Ab.field_v - param3;
          if (this.field_gb) {
            this.field_Ab.field_v = this.field_Ab.field_v - param1;
          }
          if (!param4) {
            if (-this.field_zb.field_mb + (this.field_Ab.field_mb + this.field_Ab.field_L) < -(this.field_Ab.field_v + this.field_Ab.field_J)) {
              this.field_Ab.field_v = -this.field_Ab.field_J - (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L);
            }
            if (-(this.field_Ab.field_v + this.field_Ab.field_J) < 0) {
              this.field_Ab.field_v = -this.field_Ab.field_J;
            }
          } else {
            if (-(this.field_Ab.field_J + this.field_Ab.field_v) < 0) {
              this.field_Ab.field_v = -this.field_Ab.field_J;
            }
            if (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L < -(this.field_Ab.field_v + this.field_Ab.field_J)) {
              this.field_Ab.field_v = -(-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L) - this.field_Ab.field_J;
            }
          }
        } else {
          if (this.field_gb) {
            this.field_Ab.field_v = this.field_Ab.field_v - param1;
            if (!param4) {
              if (-this.field_zb.field_mb + (this.field_Ab.field_mb + this.field_Ab.field_L) < -(this.field_Ab.field_v + this.field_Ab.field_J)) {
                this.field_Ab.field_v = -this.field_Ab.field_J - (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L);
              }
              if (-(this.field_Ab.field_v + this.field_Ab.field_J) >= 0) {
                if (this.field_Fb.l(-103)) {
                  this.field_Ab.field_J = -this.field_Fb.a(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
                  this.field_Ab.field_v = 0;
                }
                this.field_Fb.a(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
                if (param0) {
                  np.a(-14);
                }
                return;
              }
              this.field_Ab.field_v = -this.field_Ab.field_J;
            } else {
              if (-(this.field_Ab.field_J + this.field_Ab.field_v) < 0) {
                this.field_Ab.field_v = -this.field_Ab.field_J;
              }
              if (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L >= -(this.field_Ab.field_v + this.field_Ab.field_J)) {
                if (this.field_Fb.l(-103)) {
                  this.field_Ab.field_J = -this.field_Fb.a(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
                  this.field_Ab.field_v = 0;
                }
                this.field_Fb.a(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
                if (param0) {
                  np.a(-14);
                }
                return;
              }
              this.field_Ab.field_v = -(-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L) - this.field_Ab.field_J;
            }
            if (this.field_Fb.l(-103)) {
              this.field_Ab.field_J = -this.field_Fb.a(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
              this.field_Ab.field_v = 0;
            }
            this.field_Fb.a(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
            if (!param0) {
              return;
            }
            np.a(-14);
            return;
          }
          if (!param4) {
            if (-this.field_zb.field_mb + (this.field_Ab.field_mb + this.field_Ab.field_L) < -(this.field_Ab.field_v + this.field_Ab.field_J)) {
              this.field_Ab.field_v = -this.field_Ab.field_J - (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L);
            }
            if (-(this.field_Ab.field_v + this.field_Ab.field_J) < 0) {
              this.field_Ab.field_v = -this.field_Ab.field_J;
            }
            if (this.field_Fb.l(-103)) {
              this.field_Ab.field_J = -this.field_Fb.a(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
              this.field_Ab.field_v = 0;
            }
            this.field_Fb.a(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
            if (!param0) {
              return;
            }
            np.a(-14);
            return;
          }
          if (-(this.field_Ab.field_J + this.field_Ab.field_v) >= 0) {
            if (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L < -(this.field_Ab.field_v + this.field_Ab.field_J)) {
              this.field_Ab.field_v = -(-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L) - this.field_Ab.field_J;
            }
            if (this.field_Fb.l(-103)) {
              this.field_Ab.field_J = -this.field_Fb.a(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
              this.field_Ab.field_v = 0;
            }
            this.field_Fb.a(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
            if (!param0) {
              return;
            }
            np.a(-14);
            return;
          }
          this.field_Ab.field_v = -this.field_Ab.field_J;
          if (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L >= -(this.field_Ab.field_v + this.field_Ab.field_J)) {
            if (this.field_Fb.l(-103)) {
              this.field_Ab.field_J = -this.field_Fb.a(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
              this.field_Ab.field_v = 0;
            }
            this.field_Fb.a(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
            if (!param0) {
              return;
            }
            np.a(-14);
            return;
          }
          this.field_Ab.field_v = -(-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L) - this.field_Ab.field_J;
        }
        if (this.field_Fb.l(-103)) {
          this.field_Ab.field_J = -this.field_Fb.a(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
          this.field_Ab.field_v = 0;
        }
        this.field_Fb.a(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
        if (param0) {
          np.a(-14);
        }
    }

    final static boolean h(byte param0) {
        int var1 = -35 % ((-48 - param0) / 50);
        return mc.a(wq.field_d, true);
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 20 % ((78 - param1) / 45);
        this.field_zb.field_q = -param2 - param0 + this.field_q;
        this.field_Ab.field_s = 0;
        this.field_zb.field_mb = this.field_mb;
        this.field_Ab.field_q = -param2 - param0 + this.field_q;
        this.field_Fb.a(-param0 + this.field_q, true, this.field_mb, param0, this.field_Ab.field_mb, this.field_zb.field_mb, 0, -this.field_Ab.field_J);
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.a(false, param1, param0, this.field_zb.field_mb, param2);
        if (param3 != 0) {
          field_Cb = (hd) null;
        }
    }

    final static boolean a(int param0) {
        if (param0 < 11) {
          return true;
        }
        return dd.field_c == uv.field_i.field_Nb ? true : false;
    }

    final static void b(int param0) {
        gt.field_t.field_o = 0;
        if (param0 != 23877) {
          np.a(85, 43, -33);
          gt.field_t.field_l = 0;
          return;
        }
        gt.field_t.field_l = 0;
    }

    public static void i(byte param0) {
        if (param0 <= -19) {
          field_Eb = null;
          field_Hb = null;
          field_Jb = null;
          field_Db = null;
          field_yb = null;
          field_Gb = null;
          field_Cb = null;
          field_Ib = null;
          return;
        }
        field_yb = (String) null;
        field_Eb = null;
        field_Hb = null;
        field_Jb = null;
        field_Db = null;
        field_yb = null;
        field_Gb = null;
        field_Cb = null;
        field_Ib = null;
    }

    np(long param0, hd param1, hd param2, na param3) {
        super(param0, (hd) null);
        try {
          this.field_zb = new hd(0L, param2);
          this.field_Fb = new na(0L, param3);
          this.a((byte) -109, this.field_zb);
          this.a((byte) -113, (hd) (this.field_Fb));
          this.field_Ab = param1;
          this.field_zb.a((byte) -125, param1);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "np.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3, boolean param4, int param5) {
        if (param4) {
          return false;
        }
        return this.a(param2, (byte) 38, param3, param5, this.field_zb.field_mb, param0, param1);
    }

    private final boolean a(boolean param0, byte param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (param1 != 38) {
          np.b(-63);
        }
        if (param6) {
          var8 = 1;
          this.field_Ab.a(19, param2, this.field_zb.field_mb, var8 != 0);
          this.a(false, param5, param3, param4, false);
          return var8 != 0;
        }
        if (!this.field_gb) {
          var8Lifetime1 = 0;
          this.field_Ab.a(19, param2, this.field_zb.field_mb, var8Lifetime1 != 0);
          this.a(false, param5, param3, param4, false);
          return var8Lifetime1 != 0;
        }
        if (!param0) {
          var8Lifetime2 = 1;
          this.field_Ab.a(19, param2, this.field_zb.field_mb, var8Lifetime2 != 0);
          this.a(false, param5, param3, param4, false);
          return var8Lifetime2 != 0;
        }
        var8Lifetime3 = 0;
        this.field_Ab.a(19, param2, this.field_zb.field_mb, var8Lifetime3 != 0);
        this.a(false, param5, param3, param4, false);
        return var8Lifetime3 != 0;
    }

    final static void h(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var2;
        var2 = Kickabout.field_G;
        if (param0 != -1) {
          return;
        }
        if (we.field_c == eq.field_a) {
          fieldTemp$1 = vo.field_bb;
          vo.field_bb = vo.field_bb + 1;
          if (fieldTemp$1 < 16) {
            return;
          }
          if (!sq.field_G) {
            pq.g((byte) 66);
          } else {
            kw.b(0);
          }
          eq.field_a = vu.field_Hb;
          return;
        }
        if (eq.field_a != vu.field_Hb) {
          if (bn.field_A != eq.field_a) {
            return;
          }
          fieldTemp$2 = vo.field_bb;
          vo.field_bb = vo.field_bb - 1;
          if (fieldTemp$2 > 0) {
            return;
          }
          eq.field_a = eq.field_j;
          return;
        }
        if (!la.a(100)) {
          if (vs.field_g != null) {
            pd.a((byte) 70, 3, vs.field_g);
          }
          dh.c((byte) -77);
          if (dq.field_e) {
            dq.field_e = false;
            dw.a(false, 0);
          }
        }
        eq.field_a = bn.field_A;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_q = param5;
        this.field_J = param3;
        this.field_mb = param2;
        this.field_s = param4;
        this.a(param6, (byte) 124, param0);
        if (param1 < 36) {
          np.h((byte) 12);
        }
    }

    final static void a(int param0, int param1, int param2) {
        lo.a(0, param2, param0, true, (byte) -55);
        int var3 = -114 / ((param1 - 16) / 57);
    }

    static {
        field_Bb = 360;
        field_yb = "<%0> wins the tournament for making more passes than <%1>";
        field_Db = "No";
        field_Eb = "Players: ";
        field_Ib = "decrease starting price by <%0>";
        field_Jb = new tf();
        field_Gb = "gamemodes";
    }
}
