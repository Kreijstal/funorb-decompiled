/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends de {
    static String field_p;
    static boolean[] field_o;

    final void c(byte param0) {
        if (param0 > -13) {
          return;
        }
        la.a(!gq.d(127) ? 0 : 12, -1, false, -25528);
    }

    dp(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, boolean param1, boolean param2) {
        int var6_int = 0;
        ha var6 = null;
        int var4 = param0 * 2;
        int var5 = param0 >= 128 ? (param0 - 128) * 2 : 0;
        ha var6Lifetime1;
        if (param2) {
          var6_int = var4;
          var4 = var5;
          var5 = var6_int;
        }
        if (null == c.field_R) {
          c.field_R = vk.a(480, 2, (java.awt.Component) ((Object) new java.awt.Canvas()), 640);
        }
        if (param1) {
          var6 = qa.field_f;
          qa.field_f = c.field_R;
          qa.field_f.a(19692);
          this.c(0);
          qa.field_f = var6;
          qa.field_f.a(19692);
          fi.a(c.field_R.field_e, var4, var5);
          return;
        }
        field_p = (String) null;
        var6Lifetime1 = qa.field_f;
        qa.field_f = c.field_R;
        qa.field_f.a(19692);
        this.c(0);
        qa.field_f = var6Lifetime1;
        qa.field_f.a(19692);
        fi.a(c.field_R.field_e, var4, var5);
    }

    final void a(int param0) {
        int stackIn_14_0 = 0;
        int stackIn_25_0 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (this.field_l == 1) {
          gj.field_W[2].b(0, 45);
        }
        if (param0 == 11) {
          var2 = 0;
          if (this.field_l == 1) {
            var2 = 120;
          }
          if (2 == this.field_l) {
            var2 = 80;
          }
          if (this.field_l == 4) {
            var2 = 50;
          }
          if (this.field_g.field_h > 7) {
            stackIn_14_0 = -210 + 30 * this.field_g.field_h;
          } else {
            stackIn_14_0 = 0;
          }
          var3 = stackIn_14_0;
          this.a(var2, (byte) -128, var3);
          this.b((byte) -71);
          return;
        }
        field_p = (String) null;
        var2Lifetime1 = 0;
        if (this.field_l == 1) {
          var2Lifetime1 = 120;
        }
        if (2 == this.field_l) {
          var2Lifetime1 = 80;
        }
        if (this.field_l == 4) {
          var2Lifetime1 = 50;
        }
        if (this.field_g.field_h > 7) {
          stackIn_25_0 = -210 + 30 * this.field_g.field_h;
        } else {
          stackIn_25_0 = 0;
        }
        var3Lifetime1 = stackIn_25_0;
        this.a(var2Lifetime1, (byte) -128, var3Lifetime1);
        this.b((byte) -71);
        return;
    }

    final void a(int[] param0, byte param1) {
        int var3_int = 0;
        try {
          if (this.field_k != null) {
            var3_int = param0.length - this.field_k.length;
            this.field_d = this.field_d - this.field_i * var3_int / 2;
          }
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dp.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(int param0, int param1) {
        int var4 = 122 % ((-13 - param0) / 37);
        int var3 = 0;
        if (this.field_l == 2) {
          var3 = 40;
        }
        if (this.field_l == 4) {
          var3 = 70;
        }
        return super.b(118, param1) - var3;
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 != 2) {
          return;
        }
        field_o = null;
    }

    final static void a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = uf.field_d;
          var3 = bg.field_k;
          var4 = mg.field_h.field_Db.b(param0, 500);
          var5 = mg.field_h.field_Db.a(param0, 500) + 6;
          var6 = 2 + var4 * fq.field_q;
          var7 = ui.a(12, var2_int, var5, (byte) -1);
          var8 = pj.a(var6, var3, 20, (byte) 112);
          t.a(var7, var8, var5, var6, 0);
          t.d(1 + var7, 1 + var8, param1 + var5, var6 - 2, 16777088);
          mg.field_h.field_Db.a(param0, 3 + var7, nc.field_d + (1 + (var8 - mg.field_h.field_Db.field_w)), 500, 1000, 0, -1, 0, 0, fq.field_q);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void e(byte param0) {
        super.e((byte) -101);
        if (param0 > -64) {
          this.a(125);
        }
    }

    final void c(int param0) {
        Object var2;
        ii var2_ref;
        ii var3;
        ii var4;
        ii var5;
        var2 = null;
        if (this.field_l == 1) {
          var4 = ro.field_e;
          var2_ref = var4;
          if (var4 == null) {
            super.c(0);
          } else {
            var4.a(false, param0 + param0);
            if (this.field_l == 1) {
              t.a(0, 0, 640, 480);
              rh.b((byte) 121);
            }
          }
        } else {
          if (this.field_l == 2) {
            var3 = ro.field_e;
            if (var3 == null) {
              super.c(0);
            } else {
              var3.a(false, param0 + param0);
              if (this.field_l == 1) {
                t.a(0, 0, 640, 480);
                rh.b((byte) 121);
              }
            }
          } else {
            if (this.field_l != 4) {
              if (var2 == null) {
                super.c(0);
              } else {
                ((ii) (var2)).a(false, param0 + param0);
                if (this.field_l == 1) {
                  t.a(0, 0, 640, 480);
                  rh.b((byte) 121);
                }
              }
            } else {
              var5 = qo.field_r;
              if (var5 == null) {
                super.c(0);
              } else {
                var5.a(false, param0 + param0);
                if (this.field_l == 1) {
                  t.a(0, 0, 640, 480);
                  rh.b((byte) 121);
                }
              }
            }
          }
        }
    }

    static {
        field_p = "Enter name of player to add to list";
    }
}
