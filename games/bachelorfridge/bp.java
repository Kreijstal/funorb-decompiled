/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends ana {
    static int field_x;
    static ee[] field_y;
    static String field_w;
    static int field_z;
    private kk field_v;

    private final void g(int param0) {
        if (param0 > -41) {
          bp.d(112);
        }
    }

    bp(gj param0, kk param1) {
        super(param0, param1);
        try {
          this.field_v = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "bp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_m.a((byte) -106)) {
          return false;
        }
        if (this.field_l > 75) {
          if (this.field_l % 10 != 0) {
            fieldTemp$0 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if (fieldTemp$0 >= 0) {
              if (this.field_l == 75) {
                this.f(-2602);
                return false;
              }
              return false;
            }
            var2 = 89 / ((71 - param0) / 47);
            this.g(-114);
            return true;
          }
          wf.a(3, (byte) 126);
        }
        int fieldTemp$1 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$1 >= 0) {
          if (this.field_l == 75) {
            this.f(-2602);
          }
          return false;
        }
        var2Lifetime1 = 89 / ((71 - param0) / 47);
        this.g(-114);
        return true;
    }

    private final void f(int param0) {
        aga var7 = null;
        ad var8 = null;
        ad var10 = null;
        iv var3_ref = null;
        Object var3 = null;
        int var5 = BachelorFridge.field_y;
        iv var3_refLifetime1;
        if (param0 != -2602) {
          field_x = -4;
          var7 = this.field_v.field_l.a(63, this.field_q.field_h);
          if (!var7.i(-100)) {
            var3_ref = (iv) (this.field_v.field_o.b((byte) 90));
            al.a(106, this.field_v.field_k);
            while (var3_ref != null) {
              var3_ref.a(var7, this.field_q.field_h, 12);
              var8 = var3_ref.field_h.a(param0 ^ 24849, this.field_q);
              if (var8 != null) {
                this.a(27799, new taa(this.field_q, var8));
                this.a(27799, new iu(3));
                this.a(27799, new cb(var8, 7));
                this.a(27799, new wn(var8, kna.field_g[18], 24831));
              }
              var3_ref = (iv) (this.field_v.field_o.c(0));
            }
            return;
          }
          return;
        }
        aga var9 = this.field_v.field_l.a(63, this.field_q.field_h);
        if (!var9.i(-100)) {
          var3_refLifetime1 = (iv) (this.field_v.field_o.b((byte) 90));
          al.a(106, this.field_v.field_k);
          while (var3_refLifetime1 != null) {
            var3_refLifetime1.a(var9, this.field_q.field_h, 12);
            var10 = var3_refLifetime1.field_h.a(param0 ^ 24849, this.field_q);
            if (var10 != null) {
              this.a(27799, new taa(this.field_q, var10));
              this.a(27799, new iu(3));
              this.a(27799, new cb(var10, 7));
              this.a(27799, new wn(var10, kna.field_g[18], 24831));
            }
            var3_refLifetime1 = (iv) (this.field_v.field_o.c(0));
          }
          return;
        }
    }

    final static void d(int param0) {
        if (null != gja.field_m) {
          gja.field_m.g((byte) 127);
          if (param0 != 18) {
            return;
          }
          if (null != hp.field_d) {
            hp.field_d.d((byte) 47);
            va.a((byte) 75);
            return;
          }
          va.a((byte) 75);
          return;
        }
        if (param0 != 18) {
          return;
        }
        if (null == hp.field_d) {
          va.a((byte) 75);
          return;
        }
        hp.field_d.d((byte) 47);
        va.a((byte) 75);
    }

    public static void e(byte param0) {
        field_y = null;
        if (param0 < 90) {
          return;
        }
        field_w = null;
    }

    final static boolean e(int param0) {
        if (param0 != -29919) {
          return false;
        }
        return qo.field_c;
    }

    static {
        field_w = "Food. Have a look at your first food in the fridge.";
        field_z = 5;
    }
}
