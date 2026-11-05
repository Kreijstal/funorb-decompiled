/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends ue {
    private m field_i;
    private boolean field_h;
    private int field_j;
    private boolean field_g;
    private boolean field_e;
    private re field_f;
    static String field_k;

    public static void b(boolean param0) {
        field_k = null;
        if (param0) {
          nc.b(false);
        }
    }

    final void b(int param0) {
        boolean stackIn_3_0 = false;
        boolean stackIn_6_1 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_1 = false;
        boolean stackIn_15_0 = false;
        int stackIn_17_1 = 0;
        boolean stackIn_17_2 = false;
        boolean stackIn_18_3 = false;
        String var3;
        String var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String var11;
        int var7Lifetime1;
        int var7Lifetime2;
        this.field_f.b(8);
        var11 = qg.field_o;
        stackIn_3_0 = (pc.field_y != 0);
        stackIn_6_1 = (null == this.field_i) ? false : true;
        var3 = gm.a(stackIn_3_0, stackIn_6_1, true, 12184);
        stackIn_9_0 = (pc.field_y != 0);
        stackIn_12_1 = (null == this.field_i) ? false : true;
        var4 = fp.a(stackIn_9_0, stackIn_12_1, true, (byte) -69);
        stackIn_15_0 = (pc.field_y != 0);
        stackIn_17_1 = 0;
        stackIn_17_2 = true;
        stackIn_18_3 = (this.field_i == null) ? false : true;
        var5 = hj.a(stackIn_15_0, stackIn_17_1, stackIn_17_2, stackIn_18_3);
        var6 = go.field_l.a(var11);
        var7 = go.field_l.a(var3);
        if (var7 > var6) {
          var6 = var7;
        }
        var7Lifetime1 = go.field_l.a(var4);
        if (var6 < var7Lifetime1) {
          var6 = var7Lifetime1;
        }
        var7Lifetime2 = go.field_l.a(var5);
        if (var6 < var7Lifetime2) {
          var6 = var7Lifetime2;
        }
        var8 = -(var6 / 2) + 290;
        var9 = 640 - var8;
        var10 = var8 + this.field_j * (-var8 + var9) * this.field_j / 400;
        wi.a(var8, jn.field_o, 110, 260, (byte) -71, -var8 + var10);
        kh.d(var8 + param0, 118, var10 - var8 - 16, 244, 0, 192);
        if (0 != this.field_f.field_f) {
          return;
        }
        if (this.field_j != 20) {
          return;
        }
        go.field_l.c(var11, 320, 150, 16760896, -1);
        go.field_l.c(var3, 320, 170, 16760896, -1);
        go.field_l.c(var4, 320, 275, 16760896, -1);
        go.field_l.c(var5, 320, 340, 16760896, -1);
        super.b(param0 ^ 0);
    }

    final boolean a(int param0) {
        if (0 == this.field_b.field_c &&
          this.field_b.a(true)) {
          this.field_e = true;
          return true;
        }
        if (1 == this.field_b.field_c &&
          this.field_b.a(true)) {
          this.field_g = true;
          return true;
        }
        if (param0 > 99) {
          return false;
        }
        this.a(77);
        return false;
    }

    final void a(boolean param0) {
        int var3;
        var3 = CrazyCrystals.field_B;
        if (this.field_g) {
          if (this.field_j > 0) {
            this.field_j = this.field_j - 1;
          }
          if (0 == this.field_j) {
            dg.a((byte) -85);
            a.field_b = (ue) ((Object) new rb(this.field_f, this.field_b.field_i));
          }
          return;
        }
        if (!this.field_e) {
          if (this.field_j < 20) {
            this.field_j = this.field_j + 1;
          }
          this.field_f.c(-1);
          super.a(param0);
          return;
        }
        if (this.field_j > 0) {
          this.field_j = this.field_j - 1;
        }
        this.field_f.c(2, 40, 180);
        if (this.field_f.field_f < 40) {
          return;
        }
        if (!this.field_h) {
          rk.a(0);
          this.field_b.a(-1, true, -1);
          this.field_h = true;
        } else {
          this.field_e = false;
          this.field_h = false;
          if (rc.a(-56)) {
            if (this.field_j < 20) {
              this.field_j = this.field_j + 1;
            }
            this.field_f.c(-1);
            super.a(param0);
          } else {
            bq.a((byte) -12);
            if (null != this.field_i) {
              this.field_i.d(136);
            }
            if (pc.field_y != 0) {
              a.field_b = (ue) ((Object) new vn(this.field_i, this.field_f, true));
            } else {
              if (null != this.field_i) {
                this.field_i.d(136);
                a.field_b = (ue) ((Object) this.field_i);
              } else {
                if (0 == mo.field_l) {
                  a.field_b = (ue) ((Object) new rb(this.field_f, true));
                } else {
                  a.field_b = (ue) ((Object) this.field_f);
                  this.field_f.a(this.field_b.field_i, -13880);
                }
              }
            }
          }
        }
    }

    nc(m param0, re param1) {
        super(2);
        try {
          this.field_i = param0;
          this.field_f = param1;
          this.field_d = new ik[2];
          this.field_b.field_c = -1;
          this.field_d[0] = (ik) ((Object) new mh(320, 190, si.field_a, 2));
          this.field_d[1] = (ik) ((Object) new mh(320, 295, fk.field_y, 2));
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Resume Game";
    }
}
