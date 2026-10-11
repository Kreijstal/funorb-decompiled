/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq extends de {
    static int field_r;
    private int field_J;
    private String field_y;
    private String field_A;
    private String field_v;
    private String field_o;
    private String field_K;
    private String field_s;
    static vg field_q;
    private String field_w;
    private int field_H;
    private boolean field_B;
    private int field_x;
    private int field_I;
    private int field_z;
    private String[] field_M;
    private int field_G;
    private String field_u;
    static String field_D;
    private int field_E;
    private String[] field_p;
    static String field_t;

    final void a(int param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, int param6, int param7, int param8, int param9) {
        int var12;
        String stackIn_8_1 = null;
        String stackIn_12_1 = null;
        var12 = Pixelate.field_H ? 1 : 0;
        this.field_G = 0;
        if (param7 != 2) {
          hq.f((byte) -64);
        }
        this.field_v = this.e(10, param0);
        this.field_E = param1;
        this.field_H = param8;
        this.field_J = param6;
        this.field_K = di.a(false, param9);
        if (!param4) {
          if (!param5) {
            if (param2) {
              this.field_A = ah.field_u;
              this.field_I = 5;
            } else {
              this.field_A = gq.field_m;
              this.field_I = 0;
            }
          } else {
            this.field_A = pg.field_d;
            this.field_I = 9;
          }
        } else {
          if (!param5 &&
            !param2) {
            if (param3) {
              stackIn_8_1 = gf.field_c;
            } else {
              stackIn_8_1 = gq.field_m;
            }
            this.field_A = stackIn_8_1;
            this.field_I = 0;
          } else {
            if (param3) {
              stackIn_12_1 = gf.field_c;
            } else {
              stackIn_12_1 = vi.field_J;
            }
            this.field_A = stackIn_12_1;
            this.field_I = 10;
          }
        }
        this.field_x = -1;
    }

    final void a(int param0) {
        int var5_int = 0;
        int var2;
        int var3;
        int var4;
        ob var5;
        int var6;
        int var7;
        int var8;
        pm var9;
        var8 = Pixelate.field_H ? 1 : 0;
        if (this.field_G != 1) {
          gj.field_W[7].b(0, 45);
        } else {
          gj.field_W[4].b(0, 45);
        }
        this.d((byte) -81);
        this.b((byte) -71);
        var2 = 20;
        var3 = 70;
        var4 = 167;
        if (param0 != 11) {
          var9 = (pm) null;
          this.a((String) null, 91, (pm) null);
        }
        for (var5_int = 0; 5 > var5_int; var5_int++) {
          rg.field_e.field_a[0].f(var3, var4);
          var4 = var4 + var2;
          rg.field_e.field_a[1].f(var3 + (var2 >> 2), var4);
          var4 = var4 + var2;
        }
        var5 = rk.field_e;
        var6 = 190;
        var7 = var5.field_w + var5.field_z + 3;
        if (this.field_G == 0) {
          var5.a(tg.field_b, 120, var6, 0, -1);
          var5.c(this.field_v, 540, var6, 1, -1);
          var6 = var6 + var7;
          var5.a(ep.field_d, 120, var6, 0, -1);
          var5.c(Integer.toString(this.field_E), 540, var6, 1, -1);
          var6 = var6 + var7;
          var5.a(vi.field_E, 120, var6, 0, -1);
          var5.c(Integer.toString(this.field_H), 540, var6, 1, -1);
          var6 = var6 + var7;
          var5.a(lo.field_Lb, 120, var6, 0, -1);
          var5.c(Integer.toString(this.field_J), 540, var6, 1, -1);
          var6 = var6 + var7;
          t.d(118, var6 - 5, 424, 9, 0);
          t.d(120, var6 - 2, 420, 3, 16777215);
          var6 = var6 + var7;
          var5.a(he.field_c, 120, var6, 0, -1);
          var5.c(this.field_K, 540, var6, 1, -1);
        } else {
          if (this.field_G != 1) {
            if (this.field_G == 2) {
              if (this.field_o != null) {
                var5.b(this.field_o, 330, var6, 0, -1);
              }
              var6 = var6 + var7;
              var5.a("Final Scores:", 120, var6, 0, -1);
              var6 = var6 + var7;
              var5.a(this.field_M[this.field_z], 120, var6, 0, -1);
              var5.c(this.field_p[this.field_z], 540, var6, 1, -1);
              var6 = var6 + var7;
              var5.a(this.field_M[1 - this.field_z], 120, var6, 0, -1);
              var5.c(this.field_p[1 - this.field_z], 540, var6, 1, -1);
              var6 = var6 + var7;
              var5.b(this.field_w, 330, var6, 0, -1);
            }
          } else {
            var6 = var6 + var7;
            var5.a(tg.field_b, 120, var6, 0, -1);
            var5.c(this.field_v, 540, var6, 1, -1);
            var6 = var6 + var7;
            var5.a(ep.field_d, 120, var6, 0, -1);
            var5.c(this.field_y, 540, var6, 1, -1);
            var6 = var6 + var7;
            t.d(118, var6 - 5, 424, 9, 0);
            t.d(120, var6 - 2, 420, 3, 16777215);
            var6 = var6 + var7;
            var5.b(this.field_u, 330, var6, 0, -1);
          }
        }
    }

    hq(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final String e(int param0, int param1) {
        if (param0 != 10) {
          this.field_H = -21;
        }
        int var3 = param1 / 3000;
        int var4 = param1 % 3000 / 50;
        return var3 + ":" + (var4 < 10 ? "0" : "") + var4;
    }

    private final int d(int param0, int param1) {
        int var3 = rk.field_e.c(param1 == 0 ? this.field_A : this.field_s);
        if (param1 == 0) {
          var3 += 40;
        }
        int var4 = -32 / ((param0 + 16) / 47);
        return var3;
    }

    final void f(int param0) {
        this.field_B = false;
        if (param0 >= -119) {
          this.field_u = (String) null;
        }
    }

    final boolean c(int param0, int param1) {
        boolean stackIn_11_0 = false;
        if (param0 >= -112) {
          this.f(-55);
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1 != 0 && ((1 != this.field_G ||
          this.field_x == -1) &&
          (2 != this.field_G ||
          !this.field_B))) {
          stackIn_11_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_11_0 = true;
        }
        return stackIn_11_0;
    }

    final int b(int param0, int param1) {
        int var3 = 120 / ((-13 - param0) / 37);
        return this.field_d;
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, !this.c(-113, 1) ? 0 : 1, param2);
    }

    final void a(boolean param0, boolean param1, int param2, int param3, byte param4, int param5, int param6) {
        this.field_u = !param1 ? qj.field_c : wb.field_a;
        this.field_G = 1;
        this.field_x = param5;
        this.field_y = sd.a(lj.field_b, param4 + 21, new String[]{Integer.toString(param2), Integer.toString(param6)});
        if (param4 != 34) {
          return;
        }
        this.field_v = this.e(param4 - 24, param3);
        if (this.field_x != -1) {
          this.field_s = !param1 ? vm.field_f : kn.field_P;
        }
        if (!param0) {
          this.field_I = 17;
          this.field_A = tn.field_f;
        } else {
          this.field_I = 9;
          this.field_A = pg.field_d;
        }
    }

    final void c(byte param0) {
        this.b((byte) 12, false);
        if (param0 > -13) {
          hq.f((byte) 29);
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = -((-10 + param1) / 2) + 25;
        int var3 = 19 % ((param0 - 54) / 38);
        if (var2 < 5) {
          var2 = 5;
        }
        return var2;
    }

    final int a(int param0, boolean param1) {
        if (param1) {
          field_r = -93;
        }
        return this.a(param0, (byte) 90) + this.d(-112, param0);
    }

    final void c(int param0) {
        if (param0 != 0) {
          this.field_K = (String) null;
        }
        if (null == ro.field_e) {
          super.c(0);
        } else {
          ro.field_e.a(false, param0 ^ 0);
          t.a(0, 0, 640, 480);
          rh.b((byte) -75);
        }
    }

    final void a(boolean param0, int param1) {
        int discarded$0 = 0;
        int var3 = 0;
        if (param1 >= -106) {
          discarded$0 = this.d(-3, 100);
        }
        if (oa.field_j == 1) {
          kj.a(this.field_x, (byte) 126);
          fc.field_e = 14;
          var3 = param0 ? 1 : 0;
          la.a(!gq.d(121) ? 0 : 12, -3, var3 != 0, -25528);
        } else {
          if (oa.field_j == 2) {
            ro.field_e.g(46);
          }
        }
    }

    final void a(String param0, int param1, pm param2) {
        int var4_int = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          this.field_G = 2;
          if (param0 != null) {
            this.field_w = sd.a(qm.field_G, param1 ^ -47, new String[]{param0});
          } else {
            this.field_w = td.field_c;
          }
          this.field_M = new String[2];
          this.field_p = new String[2];
          for (var4_int = 0; var4_int < 2; var4_int++) {
            this.field_M[var4_int] = param2.field_i[var4_int];
            this.field_p[var4_int] = di.a(false, param2.field_v[var4_int]);
          }
          if (param2.field_v[0] >= param2.field_v[1]) {
            stackIn_10_1 = 0;
          } else {
            stackIn_10_1 = 1;
          }
          this.field_z = stackIn_10_1;
          this.field_I = -5;
          this.field_A = ko.field_jb;
          if (param1 != -10) {
            this.field_G = -27;
          }
          if (this.field_B) {
            this.e(1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("hq.U(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        if (this.c(-122, 1)) {
          var3 = 60;
          if (0 == param0) {
            return var3;
          }
          return -var3 + (640 - this.d(98, param0));
        }
        if (param1 != 90) {
          field_t = (String) null;
        }
        return 320 - (this.d(87, param0) >> 1);
    }

    final void a(int param0, boolean param1, boolean param2) {
        int var6_int = 0;
        int var4 = param0 * 2;
        if (!param1) {
          hq.f((byte) -107);
        }
        int var5 = 128 <= param0 ? param0 * 2 - 256 : 0;
        if (param2) {
          var6_int = var4;
          var4 = var5;
          var5 = var6_int;
        }
        if (c.field_R == null) {
          c.field_R = vk.a(480, 123, (java.awt.Component) ((Object) new java.awt.Canvas()), 640);
        }
        ha var6 = qa.field_f;
        qa.field_f = c.field_R;
        qa.field_f.a(19692);
        this.c(0);
        qa.field_f = var6;
        qa.field_f.a(19692);
        fi.a(c.field_R.field_e, var4, var5);
    }

    final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        this.field_B = true;
        var2 = ro.field_e.field_z;
        var3 = ro.field_e.field_a.field_p;
        var4 = ro.field_e.field_o;
        if ((var3 & param0 << var2) != 0) {
          this.field_s = fg.field_c;
        } else {
          if (var3 == 0) {
            if (3 == (1 << ro.field_e.field_z | var4)) {
              this.field_s = bm.field_t;
            } else {
              this.field_s = dq.field_c;
            }
          } else {
            this.field_s = sc.field_c;
          }
        }
    }

    final void a(String param0, byte param1) {
        try {
          this.field_o = param0;
          if (param1 != -4) {
            this.e(79);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "hq.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        if (param2 == 0) {
          this.a(param1, this.field_A, oc.field_N, -6, this.a(0, (byte) 90) + this.a(0, false) >> 1);
        } else {
          super.a(this.field_s, param1, param2, oc.field_N, (byte) 99);
        }
        if (param0 > -116) {
          this.field_E = 4;
        }
    }

    final void b(byte param0, boolean param1) {
        int var3;
        int var4;
        int stackIn_8_0 = 0;
        if (oa.field_j != 2) {
          var3 = this.field_I;
          var4 = param1 ? 1 : 0;
          stackIn_8_0 = (!gq.d(104)) ? 0 : 12;
          la.a(stackIn_8_0, var3, var4 != 0, -25528);
        } else {
          if (md.field_Y) {
            var3 = param1 ? 1 : 0;
            la.a(ti.field_t, -5, var3 != 0, -25528);
          }
          if (oa.field_i) {
            qj.a(false, 0, 11);
          }
        }
        if (param0 != 12) {
          this.field_A = (String) null;
        }
    }

    public static void f(byte param0) {
        field_D = null;
        field_q = null;
        if (param0 >= -37) {
          field_t = (String) null;
        }
        field_t = null;
    }

    final void b(int param0) {
        int var2;
        int var3;
        pf stackIn_16_0 = null;
        boolean stackIn_16_1 = false;
        int stackIn_17_2 = 0;
        boolean decompiledFrameRemainder0 = true;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = ke.field_a;
        if (!this.field_g.c((byte) 35)) {
          if (this.field_g.field_j == -1 && (var2 == 98 ||
            var2 == 99)) {
            stackIn_16_0 = this.field_g;
            stackIn_16_1 = false;
            if (!this.c(-118, 1)) {
              stackIn_17_2 = 0;
            } else {
              stackIn_17_2 = 1;
            }
            ((pf) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_17_2);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_g.field_j == 0 &&
              var2 == 97) {
              if (!(!this.c(-119, 1))) {
                this.field_g.a(false, 1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (1 == this.field_g.field_j &&
                var2 == 96) {
                this.field_g.a(false, 0);
              }
            }
          }
        }
        if (param0 >= -35) {
          hq.f((byte) -122);
        }
        this.field_g.b((byte) -71);
    }

    static {
        field_D = "Connection restored.";
    }
}
